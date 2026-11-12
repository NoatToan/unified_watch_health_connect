package com.huawei.hms.findnetwork.comm.request.bean.poiinfo;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;

/* JADX INFO: loaded from: classes33.dex */
public class PoiInfo {

    @SerializedName("confidence")
    private double confidence;

    @SerializedName("floor")
    private double floor;

    @SerializedName(JsbMapKeyNames.H5_LOC_LAT)
    private double latitude;

    @SerializedName(JsbMapKeyNames.H5_LOC_LON)
    private double longitude;

    @SerializedName("id")
    private String id = "";

    @SerializedName("name")
    private String name = "";

    public void setName(String str) {
        this.name = str;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setFloor(double d) {
        this.floor = d;
    }

    public void setConfidence(double d) {
        this.confidence = d;
    }

    public String getName() {
        return this.name;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public String getId() {
        return this.id;
    }

    public double getFloor() {
        return this.floor;
    }

    public double getConfidence() {
        return this.confidence;
    }

    public PoiInfo copy() {
        PoiInfo poiInfo = new PoiInfo();
        poiInfo.setId(this.id);
        poiInfo.setName(this.name);
        poiInfo.setLongitude(this.longitude);
        poiInfo.setLatitude(this.latitude);
        poiInfo.setConfidence(this.confidence);
        poiInfo.setFloor(this.floor);
        return poiInfo;
    }
}
