package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class LocationRecordBean {
    private float accuracy;
    private double latitude;
    private long locationLastTimestamp;
    private int locationSourceType;
    private long locationTimestamp;
    private int locationType;
    private double longitude;

    public double getLongitude() {
        return this.longitude;
    }

    public int getLocationType() {
        return this.locationType;
    }

    public long getLocationTimestamp() {
        return this.locationTimestamp;
    }

    public int getLocationSourceType() {
        return this.locationSourceType;
    }

    public long getLocationLastTimestamp() {
        return this.locationLastTimestamp;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public float getAccuracy() {
        return this.accuracy;
    }

    public LocationRecordBean(long j, double d, double d2, float f, int i, int i2) {
        this.locationTimestamp = j;
        this.longitude = d;
        this.latitude = d2;
        this.accuracy = f;
        this.locationType = i;
        this.locationLastTimestamp = j;
        this.locationSourceType = i2;
    }
}
