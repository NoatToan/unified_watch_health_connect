package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class AntiStalkingRecord {
    private float accuracy;
    private String buildingId;
    private int floor;
    private int floorAcc;
    private String floorInfo;
    private int indoor;
    private double latitude;
    private double longitude;
    private String mStandbyDevice;
    private String macAddress;
    private int rssi;
    private long timeStamp;

    public AntiStalkingRecord() {
        this.floor = -100;
        this.buildingId = "";
        this.floorInfo = "";
        this.indoor = 0;
        this.floorAcc = 0;
    }

    public AntiStalkingRecord(String str, int i, long j, double d, double d2, float f, String str2, int i2, String str3, String str4, int i3, int i4) {
        this.macAddress = str;
        this.rssi = i;
        this.timeStamp = j;
        this.latitude = d;
        this.longitude = d2;
        this.accuracy = f;
        this.mStandbyDevice = str2;
        this.floor = i2;
        this.buildingId = str3;
        this.floorInfo = str4;
        this.indoor = i3;
        this.floorAcc = i4;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public void setStandbyDevice(String str) {
        this.mStandbyDevice = str;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setLongitude(double d) {
        this.longitude = d;
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

    public void setBuildingId(String str) {
        this.buildingId = str;
    }

    public void setAccuracy(float f) {
        this.accuracy = f;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public String getStandbyDevice() {
        return this.mStandbyDevice;
    }

    public int getRssi() {
        return this.rssi;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public double getLongitude() {
        return this.longitude;
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

    public String getBuildingId() {
        return this.buildingId;
    }

    public float getAccuracy() {
        return this.accuracy;
    }
}
