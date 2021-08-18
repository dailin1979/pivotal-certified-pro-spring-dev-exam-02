package com.apress.cems.scopes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MySalary implements MyIncoming{

    private Logger logger = LoggerFactory.getLogger(MySalary.class);

    private Integer amount;

    public MySalary() {
        logger.info(" -> Creating new my Salary bean");
        Random rand = new Random();
        this.amount = rand.nextInt(10_00) +  50_000;
    }

    @Override
    public Integer getMyIncoming() {
        return amount;
    }
}
