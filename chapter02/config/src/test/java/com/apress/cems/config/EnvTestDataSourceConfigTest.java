package com.apress.cems.config;

import com.apress.cems.repos.JdbcDetectiveRepo;
import com.apress.cems.repos.JdbcEvidenceRepo;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

public class EnvTestDataSourceConfigTest {
    private Logger logger = LoggerFactory.getLogger(EnvTestDataSourceConfig.class);

    @Test
    void testEnv() {
        var ctx =
                new AnnotationConfigApplicationContext(EnvTestDataSourceConfig.class);

        for (String beanName : ctx.getBeanDefinitionNames()) {
            logger.info("Bean " + beanName + " of type "
                    + ctx.getBean(beanName).getClass().getSimpleName());
        }
        DriverManagerDataSource driverManagerDataSource = (DriverManagerDataSource) ctx.getBean(DataSource.class);
        assertNotNull(driverManagerDataSource.getUrl());



    }
}
