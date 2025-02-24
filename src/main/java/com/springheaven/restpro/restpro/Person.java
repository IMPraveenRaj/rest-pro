package com.springheaven.restpro.restpro;

import java.util.Arrays;

public class Person {

    private String name;
    private String address;
    BatchInfo batchInfo;

    public long[] getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long[] mobileNo) {
        this.mobileNo = mobileNo;
    }

    long[] mobileNo;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", batchInfo=" + batchInfo +
                ", mobileNo=" + Arrays.toString(mobileNo) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BatchInfo getBatchInfo() {
        return batchInfo;
    }

    public void setBatchInfo(BatchInfo batchInfo) {
        this.batchInfo = batchInfo;
    }

}
