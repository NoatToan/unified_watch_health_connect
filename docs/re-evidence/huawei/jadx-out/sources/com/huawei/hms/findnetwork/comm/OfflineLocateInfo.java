package com.huawei.hms.findnetwork.comm;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.findnetwork.comm.request.bean.TagBatteryEnum;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes33.dex */
public class OfflineLocateInfo {

    @SerializedName("battery")
    private String battery;

    @SerializedName("broadcastTime")
    private long broadcastTime;

    @SerializedName("cmacSign")
    private String cmacSign;

    @SerializedName("confidence")
    private float confidence;

    @SerializedName("country")
    private String country;

    @SerializedName("createTime")
    private long createTime;

    @SerializedName("encLocation")
    private String encLocation;

    @SerializedName("extendData")
    private String extendData;

    @SerializedName("locationSourceType")
    private int locationSourceType;

    @SerializedName("offlinePublicKey")
    private String offlinePublicKey;

    @SerializedName("perDeviceType")
    private String perDeviceType;

    @SerializedName(RemoteMessageConst.Notification.TAG)
    private String tag;

    @SerializedName("tmpPublickey")
    private String tmpPublicKey;

    @SerializedName("traceId")
    private String traceId;

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public void setTmpPublicKey(String str) {
        this.tmpPublicKey = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setPerDeviceType(String str) {
        this.perDeviceType = str;
    }

    public void setOfflinePublicKey(String str) {
        this.offlinePublicKey = str;
    }

    public void setLocationSourceType(int i) {
        this.locationSourceType = i;
    }

    public void setExtendData(String str) {
        this.extendData = str;
    }

    public void setEncLocation(String str) {
        this.encLocation = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setConfidence(float f) {
        this.confidence = f;
    }

    public void setCmacSign(String str) {
        this.cmacSign = str;
    }

    public void setBroadcastTime(long j) {
        this.broadcastTime = j;
    }

    public void setBattery(int i) {
        if (i < 0 || i >= TagBatteryEnum.getTagBatteryMaxLevel()) {
            return;
        }
        this.battery = TagBatteryEnum.getTagBatteryEnum(i).getBatteryDescription();
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String getTmpPublicKey() {
        return this.tmpPublicKey;
    }

    public String getTag() {
        return this.tag;
    }

    public String getPerDeviceType() {
        return this.perDeviceType;
    }

    public String getOfflinePublicKey() {
        return this.offlinePublicKey;
    }

    public int getLocationSourceType() {
        return this.locationSourceType;
    }

    public String getExtendData() {
        return this.extendData;
    }

    public String getEncLocation() {
        return this.encLocation;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getCountry() {
        return this.country;
    }

    public float getConfidence() {
        return this.confidence;
    }

    public String getCmacSign() {
        return this.cmacSign;
    }

    public long getBroadcastTime() {
        return this.broadcastTime;
    }

    public String getBattery() {
        return this.battery;
    }
}
