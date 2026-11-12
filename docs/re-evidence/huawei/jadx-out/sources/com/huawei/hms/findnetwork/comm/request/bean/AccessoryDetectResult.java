package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class AccessoryDetectResult {
    private int mBroadcastType;
    private String mFid;
    private boolean mIsOwner;
    private String mMac;
    private int mPij;
    private String mProductId;
    private String mPublicKey;
    private int mRssi;

    public AccessoryDetectResult() {
    }

    public AccessoryDetectResult(String str, String str2, int i, String str3, int i2, int i3, boolean z) {
        this.mFid = str;
        this.mMac = str2;
        this.mBroadcastType = i;
        this.mPublicKey = str3;
        this.mPij = i2;
        this.mRssi = i3;
        this.mIsOwner = z;
    }

    public void setRssi(int i) {
        this.mRssi = i;
    }

    public void setPublicKey(String str) {
        this.mPublicKey = str;
    }

    public void setProductId(String str) {
        this.mProductId = str;
    }

    public void setPij(int i) {
        this.mPij = i;
    }

    public void setOwner(boolean z) {
        this.mIsOwner = z;
    }

    public void setMac(String str) {
        this.mMac = str;
    }

    public void setFid(String str) {
        this.mFid = str;
    }

    public void setBroadcastType(int i) {
        this.mBroadcastType = i;
    }

    public boolean isOwner() {
        return this.mIsOwner;
    }

    public int getRssi() {
        return this.mRssi;
    }

    public String getPublicKey() {
        return this.mPublicKey;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public int getPij() {
        return this.mPij;
    }

    public String getMac() {
        return this.mMac;
    }

    public String getFid() {
        return this.mFid;
    }

    public int getBroadcastType() {
        return this.mBroadcastType;
    }
}
