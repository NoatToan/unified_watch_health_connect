package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class PubKeyHash {
    private String createTime;
    private String firstSixByte;
    private int keyType;
    private int pij;
    private String pubKeyHash;

    public void setPubKeyHash(String str) {
        this.pubKeyHash = str;
    }

    public void setPij(int i) {
        this.pij = i;
    }

    public void setKeyType(int i) {
        this.keyType = i;
    }

    public void setFirstSixByte(String str) {
        this.firstSixByte = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public String getPubKeyHash() {
        return this.pubKeyHash;
    }

    public int getPij() {
        return this.pij;
    }

    public int getKeyType() {
        return this.keyType;
    }

    public String getFirstSixByte() {
        return this.firstSixByte;
    }

    public String getCreateTime() {
        return this.createTime;
    }
}
