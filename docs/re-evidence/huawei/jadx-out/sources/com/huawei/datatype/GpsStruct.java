package com.huawei.datatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes4.dex */
public class GpsStruct {
    private int mGpsSpeed = -1;
    private long mGpsDistance = -1;
    private int mGpsAltitude = -1;
    private long mGpsTotalDistance = -1;
    private double mGpsMarsLongitude = -1.0d;
    private double mGpsMarsLatitude = -1.0d;
    private double mGpsLongitude = -1.0d;
    private double mGpsLatitude = -1.0d;
    private double mGpsDirection = -1.0d;
    private double mGpsPrecision = -1.0d;
    private int mGpsQuality = -1;
    private long mGpsStartTime = -1;
    private long mGpsEndTime = -1;

    public int getGpsSpeed() {
        return ((Integer) lst.d(Integer.valueOf(this.mGpsSpeed))).intValue();
    }

    public void setGpsSpeed(int i) {
        this.mGpsSpeed = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getGpsDistance() {
        return ((Long) lst.d(Long.valueOf(this.mGpsDistance))).longValue();
    }

    public void setGpsDistance(long j) {
        this.mGpsDistance = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getGpsAltitude() {
        return ((Integer) lst.d(Integer.valueOf(this.mGpsAltitude))).intValue();
    }

    public void setGpsAltitude(int i) {
        this.mGpsAltitude = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getGpsTotalDistance() {
        return ((Long) lst.d(Long.valueOf(this.mGpsTotalDistance))).longValue();
    }

    public void setGpsTotalDistance(long j) {
        this.mGpsTotalDistance = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public void setGpsStartTime(long j) {
        this.mGpsStartTime = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public long getGpsStartTime() {
        return ((Long) lst.d(Long.valueOf(this.mGpsStartTime))).longValue();
    }

    public void setGpsEndTime(long j) {
        this.mGpsEndTime = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public long getGpsEndTime() {
        return ((Long) lst.d(Long.valueOf(this.mGpsEndTime))).longValue();
    }

    public double getGpsMarsLongitude() {
        return ((Double) lst.d(Double.valueOf(this.mGpsMarsLongitude))).doubleValue();
    }

    public void setGpsMarsLongitude(double d) {
        this.mGpsMarsLongitude = ((Double) lst.d(Double.valueOf(d))).doubleValue();
    }

    public double getGpsMarsLatitude() {
        return ((Double) lst.d(Double.valueOf(this.mGpsMarsLatitude))).doubleValue();
    }

    public void setGpsMarsLatitude(double d) {
        this.mGpsMarsLatitude = ((Double) lst.d(Double.valueOf(d))).doubleValue();
    }

    public double getGpsLongitude() {
        return ((Double) lst.d(Double.valueOf(this.mGpsLongitude))).doubleValue();
    }

    public void setGpsLongitude(double d) {
        this.mGpsLongitude = ((Double) lst.d(Double.valueOf(d))).doubleValue();
    }

    public double getGpsLatitude() {
        return ((Double) lst.d(Double.valueOf(this.mGpsLatitude))).doubleValue();
    }

    public void setGpsLatitude(double d) {
        this.mGpsLatitude = ((Double) lst.d(Double.valueOf(d))).doubleValue();
    }

    public double getGpsDirection() {
        return ((Double) lst.d(Double.valueOf(this.mGpsDirection))).doubleValue();
    }

    public void setGpsDirection(double d) {
        this.mGpsDirection = ((Double) lst.d(Double.valueOf(d))).doubleValue();
    }

    public double getGpsPrecision() {
        return ((Double) lst.d(Double.valueOf(this.mGpsPrecision))).doubleValue();
    }

    public void setGpsPrecision(double d) {
        this.mGpsPrecision = ((Double) lst.d(Double.valueOf(d))).doubleValue();
    }

    public int getGpsQuality() {
        return ((Integer) lst.d(Integer.valueOf(this.mGpsQuality))).intValue();
    }

    public void setGpsQuality(int i) {
        this.mGpsQuality = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
