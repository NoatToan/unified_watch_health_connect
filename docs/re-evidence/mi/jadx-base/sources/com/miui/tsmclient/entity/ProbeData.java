package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class ProbeData {

    @SerializedName("deviation")
    int mDeviation;

    @SerializedName("median")
    int mMedian;

    @SerializedName("nt")
    long mNt;

    @SerializedName("ntE")
    long mNtE;

    @SerializedName("parity")
    byte[] mParity;

    public int getDeviation() {
        return this.mDeviation;
    }

    public int getMedian() {
        return this.mMedian;
    }

    public long getNt() {
        return this.mNt;
    }

    public long getNtE() {
        return this.mNtE;
    }

    public byte[] getParity() {
        return this.mParity;
    }

    public void setDeviation(int i) {
        this.mDeviation = i;
    }

    public void setMedian(int i) {
        this.mMedian = i;
    }

    public void setNt(long j) {
        this.mNt = j;
    }

    public void setNtE(long j) {
        this.mNtE = j;
    }

    public void setParity(byte[] bArr) {
        this.mParity = bArr;
    }
}
