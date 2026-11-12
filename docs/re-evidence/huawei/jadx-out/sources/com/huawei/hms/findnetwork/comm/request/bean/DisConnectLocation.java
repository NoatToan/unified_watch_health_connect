package com.huawei.hms.findnetwork.comm.request.bean;

import com.huawei.hms.findnetwork.comm.util.MaskUtil;

/* JADX INFO: loaded from: classes33.dex */
public class DisConnectLocation {
    private float accuracy;
    private String buildingId;
    private long disConnectTime;
    private int floor;
    private int floorAcc;
    private String floorInfo;
    private int indoor;
    private double latitude;
    private long locationTime;
    private double longitude;
    private String sn;
    private String standbyInfo;
    private int status;

    public String toString() {
        return "DisConnectLocation{, disConnectTime=" + this.disConnectTime + ", locationTime=" + this.locationTime + ", status=" + this.status + ", accuracy=" + this.accuracy + ", standbyInfo=" + MaskUtil.maskCommon(this.standbyInfo) + ", indoor=" + this.indoor + '}';
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStandbyInfo(String str) {
        this.standbyInfo = str;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setLocationTime(long j) {
        this.locationTime = j;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setIndoor(int i) {
        this.indoor = i;
    }

    public void setFloorInfo(String str) {
        this.floorInfo = str;
    }

    public void setFloorAcc(int i) {
        this.floorAcc = i;
    }

    public void setFloor(int i) {
        this.floor = i;
    }

    public void setDisConnectTime(long j) {
        this.disConnectTime = j;
    }

    public void setBuildingId(String str) {
        this.buildingId = str;
    }

    public void setAccuracy(float f) {
        this.accuracy = f;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStandbyInfo() {
        return this.standbyInfo;
    }

    public String getSn() {
        return this.sn;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public long getLocationTime() {
        return this.locationTime;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public int getIndoor() {
        return this.indoor;
    }

    public String getFloorInfo() {
        return this.floorInfo;
    }

    public int getFloorAcc() {
        return this.floorAcc;
    }

    public int getFloor() {
        return this.floor;
    }

    public long getDisConnectTime() {
        return this.disConnectTime;
    }

    public String getBuildingId() {
        return this.buildingId;
    }

    public float getAccuracy() {
        return this.accuracy;
    }

    public DisConnectLocation(String str, long j, long j2, double d, double d2, int i, float f, int i2, String str2, String str3, int i3, int i4) {
        this.sn = str;
        this.disConnectTime = j;
        this.locationTime = j2;
        this.longitude = d;
        this.latitude = d2;
        this.status = i;
        this.accuracy = f;
        this.floor = i2;
        this.buildingId = str2;
        this.floorInfo = str3;
        this.indoor = i3;
        this.floorAcc = i4;
    }
}
