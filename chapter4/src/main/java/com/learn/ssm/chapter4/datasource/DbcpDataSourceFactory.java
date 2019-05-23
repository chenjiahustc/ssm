package com.learn.ssm.chapter4.datasource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

public class DbcpDataSourceFactory implements DataSourceFactory {
    private Properties props = null;

    @Override
    public void setProperties(Properties props){
        this.props = props;
    }

    @Override
    public DataSource getDataSource(){
        DataSource dataSource = null;
        try{
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e){
            e.printStackTrace();
        }

        return dataSource;
    }
}
