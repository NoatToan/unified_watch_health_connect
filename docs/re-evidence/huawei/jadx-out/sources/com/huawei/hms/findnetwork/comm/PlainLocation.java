package com.huawei.hms.findnetwork.comm;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.findnetwork.comm.request.bean.poiinfo.PoiInfo;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class PlainLocation {

    @SerializedName("accuracy")
    float accuracy;

    @SerializedName("bearing")
    private float bearing;

    @SerializedName(JsbMapKeyNames.H5_LOC_LAT)
    double latitude;

    @SerializedName(JsbMapKeyNames.H5_LOC_LON)
    double longitude;

    @SerializedName("speed")
    private double speed;

    @SerializedName("status")
    int status;

    @SerializedName("buildingId")
    private String buildingId = "";

    @SerializedName("floor")
    private int floor = -100;

    @SerializedName("floorAcc")
    private int floorAcc = 0;

    @SerializedName("indoor")
    private int indoor = 0;

    @SerializedName("floorInfo")
    private String floorInfo = "";

    @SerializedName("sessionId")
    private String sessionId = "";

    @SerializedName("poiInfoList")
    private List<PoiInfo> poiInfoList = new ArrayList();

    public void setStatus(int i) {
        this.status = i;
    }

    public void setSpeed(double d) {
        this.speed = d;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setPoiInfoList(List<PoiInfo> list) {
        this.poiInfoList = list;
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

    public void setBearing(float f) {
        this.bearing = f;
    }

    public void setAccuracy(float f) {
        this.accuracy = f;
    }

    public int getStatus() {
        return this.status;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public List<PoiInfo> getPoiInfoList() {
        return this.poiInfoList;
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

    public float getBearing() {
        return this.bearing;
    }

    public float getAccuracy() {
        return this.accuracy;
    }
}
