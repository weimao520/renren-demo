package com.demo2.demo.model;

/**
 * @author 贺威
 * @create 2019-04-12 11:41
 */
public class Permission {

    private Integer pid;

    private String name;

    private String url;


    public Permission() {
    }

    public Permission(Integer pid, String name, String url) {
        this.pid = pid;
        this.name = name;
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
