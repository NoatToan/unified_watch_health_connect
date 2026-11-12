package com.huawei.hms.findnetwork.comm.request;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes33.dex */
public class OfflineLocationCipher {

    @SerializedName("broadcastTime")
    private long broadcastTime;

    @SerializedName("cipherText")
    private String cipherText;

    @SerializedName("confidence")
    private float confidence;

    @SerializedName("extendData")
    private String extendData;

    @SerializedName("pubKeyHash")
    private String pubKeyHash;

    @SerializedName("sn")
    private String sn;

    public void setSn(String str) {
        this.sn = str;
    }

    public void setPubKeyHash(String str) {
        this.pubKeyHash = str;
    }

    public void setExtendData(String str) {
        this.extendData = str;
    }

    public void setConfidence(float f) {
        this.confidence = f;
    }

    public void setCipherText(String str) {
        this.cipherText = str;
    }

    public void setBroadcastTime(long j) {
        this.broadcastTime = j;
    }

    public String getSn() {
        return this.sn;
    }

    public String getPubKeyHash() {
        return this.pubKeyHash;
    }

    public String getExtendData() {
        return this.extendData;
    }

    public float getConfidence() {
        return this.confidence;
    }

    public String getCipherText() {
        return this.cipherText;
    }

    public long getBroadcastTime() {
        return this.broadcastTime;
    }
}
