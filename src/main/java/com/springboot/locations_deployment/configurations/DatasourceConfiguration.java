package com.springboot.locations_deployment.configurations;

public class DatasourceConfiguration {

    private String url = "jdbc:hsqldb:hsql://localhost/test";
    private String username = "sa";
    private String password = "";
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "DatasourceConfiguration [password=" + password + ", url=" + url + ", username=" + username + "]";
    }
    
}
