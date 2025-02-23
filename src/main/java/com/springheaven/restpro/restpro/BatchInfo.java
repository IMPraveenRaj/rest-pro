package com.springheaven.restpro.restpro;



public class BatchInfo {
    @Override
    public String toString() {
        return "BatchInfo{" +
                "name='" + name + '\'' +
                ", timing='" + timing + '\'' +
                '}';
    }

    String name;
    String timing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
}
