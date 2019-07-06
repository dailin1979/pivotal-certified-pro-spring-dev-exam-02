/**
 * @author Iuliana Cosmina
 * @since 1.0
 */
module com.apress.cems.tx.practice {
    requires com.apress.cems.dao;
    requires com.apress.cems.repos;
    requires com.apress.cems.aop;
    requires org.apache.commons.lang3;
    requires java.sql;
    requires org.slf4j;
    requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.jdbc;
    requires spring.tx;
    requires ojdbc7;
    requires java.naming;
    requires jsr250.api;
}