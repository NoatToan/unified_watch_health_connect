package com.huawei.datatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes4.dex */
public class DataDeviceIntelligentInfo {
    private String deviceHiv;
    private String deviceaManu;
    private String productId;

    public String getDeviceManu() {
        return (String) lst.d(this.deviceaManu);
    }

    public void setDeviceManu(String str) {
        this.deviceaManu = (String) lst.d(str);
    }

    public String getDeviceProductId() {
        return (String) lst.d(this.productId);
    }

    public void setDeviceProductId(String str) {
        this.productId = (String) lst.d(str);
    }

    public String getDeviceHiv() {
        return (String) lst.d(this.deviceHiv);
    }

    public void setDeviceHiv(String str) {
        this.deviceHiv = (String) lst.d(str);
    }

    public String toString() {
        return "DataDeviceIntelligentInfo{deviceaManu=" + this.deviceaManu + ", productId=" + this.productId + ", deviceHiv=" + this.deviceHiv + '}';
    }
}
