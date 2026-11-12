package com.huawei.hms.findnetwork.comm.request.bean.poiinfo;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes33.dex */
public class PoiInfoResponse {

    @SerializedName("confidence")
    private double confidence;

    @SerializedName("floor")
    private int floor;

    @SerializedName("location")
    private PoiLocation location;

    @SerializedName("id")
    private String id = "";

    @SerializedName("name")
    private String name = "";

    public void setName(String str) {
        this.name = str;
    }

    public void setLocation(PoiLocation poiLocation) {
        this.location = poiLocation;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setFloor(int i) {
        this.floor = i;
    }

    public void setConfidence(double d) {
        this.confidence = d;
    }

    public String getName() {
        return this.name;
    }

    public PoiLocation getLocation() {
        return this.location;
    }

    public String getId() {
        return this.id;
    }

    public int getFloor() {
        return this.floor;
    }

    public double getConfidence() {
        return this.confidence;
    }
}
