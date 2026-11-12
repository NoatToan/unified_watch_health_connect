package com.huawei.hms.findnetwork.comm.request.bean;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.findnetwork.comm.OfflineLocateInfo;
import com.huawei.hms.findnetwork.comm.PlainLocation;

/* JADX INFO: loaded from: classes33.dex */
public class OfflineLocateResult {

    @SerializedName("battery")
    private String battery;

    @SerializedName("broadcastTime")
    private long broadcastTime;

    @SerializedName("confidence")
    private float confidence;

    @SerializedName("country")
    private String country;

    @SerializedName("createTime")
    private long createTime;

    @SerializedName("extendData")
    private String extendData;

    @SerializedName("location")
    private PlainLocation location;

    @SerializedName("locationSourceType")
    private int locationSourceType;

    @SerializedName("perDeviceType")
    private String perDeviceType;

    @SerializedName("traceId")
    private String traceId;

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public void setPerDeviceType(String str) {
        this.perDeviceType = str;
    }

    public void setLocationSourceType(int i) {
        this.locationSourceType = i;
    }

    public void setLocation(PlainLocation plainLocation) {
        this.location = plainLocation;
    }

    public void setExtendData(String str) {
        this.extendData = str;
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

    public void setBroadcastTime(long j) {
        this.broadcastTime = j;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String getPerDeviceType() {
        return this.perDeviceType;
    }

    public int getLocationSourceType() {
        return this.locationSourceType;
    }

    public PlainLocation getLocation() {
        return this.location;
    }

    public String getExtendData() {
        return this.extendData;
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

    public long getBroadcastTime() {
        return this.broadcastTime;
    }

    public String getBattery() {
        return this.battery;
    }

    public OfflineLocateResult(OfflineLocateInfo offlineLocateInfo, PlainLocation plainLocation) {
        setPerDeviceType(offlineLocateInfo.getPerDeviceType());
        setCreateTime(offlineLocateInfo.getCreateTime());
        setBroadcastTime(offlineLocateInfo.getBroadcastTime());
        setConfidence(offlineLocateInfo.getConfidence());
        setTraceId(offlineLocateInfo.getTraceId());
        setCountry(offlineLocateInfo.getCountry());
        setExtendData(offlineLocateInfo.getExtendData());
        this.battery = offlineLocateInfo.getBattery();
        setLocation(plainLocation);
        setLocationSourceType(offlineLocateInfo.getLocationSourceType());
    }
}
