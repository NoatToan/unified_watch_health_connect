package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class PairingResultBean {
    private long customTimestamp;
    private String displayName;
    private String mac;
    private String productId;
    private int rssi;
    private String sn;
    private String tagManufacturer;
    private String tagName;
    private String tagType;

    public PairingResultBean() {
        this.sn = "";
        this.mac = null;
        this.tagName = null;
        this.productId = "";
        this.rssi = 999;
        this.customTimestamp = 0L;
        this.tagType = "";
        this.tagManufacturer = "";
        this.displayName = "";
    }

    public PairingResultBean(String str, String str2, int i, long j) {
        this.tagName = null;
        this.productId = "";
        this.tagType = "";
        this.tagManufacturer = "";
        this.displayName = "";
        this.sn = str;
        this.mac = str2;
        this.rssi = i;
        this.customTimestamp = j;
    }

    public PairingResultBean(String str, String str2, int i, long j, String str3, String str4) {
        this.productId = "";
        this.tagType = "";
        this.tagManufacturer = "";
        this.sn = str;
        this.mac = str2;
        this.rssi = i;
        this.customTimestamp = j;
        this.tagName = str3;
        this.displayName = str4;
    }

    public void setTagType(String str) {
        this.tagType = str;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }

    public void setTagManufacturer(String str) {
        this.tagManufacturer = str;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setCustomTimestamp(long j) {
        this.customTimestamp = j;
    }

    public String getTagType() {
        return this.tagType;
    }

    public String getTagName() {
        return this.tagName;
    }

    public String getTagManufacturer() {
        return this.tagManufacturer;
    }

    public String getSn() {
        return this.sn;
    }

    public int getRssi() {
        return this.rssi;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getMac() {
        return this.mac;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public long getCustomTimestamp() {
        return this.customTimestamp;
    }
}
