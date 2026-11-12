package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SwimInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private float avgPace;
    private float avgStrokeSpeed;
    private int avgSwolf;
    private float distancePerStroke;
    private int mMaxSwolf;
    private float mMinStrokeSpeed;
    private int mMinSwolf;
    private float mRealtimeDPS;
    private float mRealtimeStrokeSpeed;
    private int mRealtimeSwolf;
    private float maxStrokeSpeed;
    private int stkStyle;
    private int strokes;
    private int trips;

    public float getAvgPace() {
        return this.avgPace;
    }

    public float getAvgStrokeSpeed() {
        return this.avgStrokeSpeed;
    }

    public int getAvgSwolf() {
        return this.avgSwolf;
    }

    public float getDistancePerStroke() {
        return this.distancePerStroke;
    }

    public float getMaxStrokeSpeed() {
        return this.maxStrokeSpeed;
    }

    public int getMaxSwolf() {
        return this.mMaxSwolf;
    }

    public float getMinStrokeSpeed() {
        return this.mMinStrokeSpeed;
    }

    public int getMinSwolf() {
        return this.mMinSwolf;
    }

    public float getRealtimeDPS() {
        return this.mRealtimeDPS;
    }

    public float getRealtimeStrokeSpeed() {
        return this.mRealtimeStrokeSpeed;
    }

    public int getRealtimeSwolf() {
        return this.mRealtimeSwolf;
    }

    public int getStkStyle() {
        return this.stkStyle;
    }

    public int getStrokes() {
        return this.strokes;
    }

    public int getTrips() {
        return this.trips;
    }

    public void setAvgPace(float f) {
        this.avgPace = f;
    }

    public void setAvgStrokeSpeed(float f) {
        this.avgStrokeSpeed = f;
    }

    public void setAvgSwolf(int i) {
        this.avgSwolf = i;
    }

    public void setDistancePerStroke(float f) {
        this.distancePerStroke = f;
    }

    public void setMaxStrokeSpeed(float f) {
        this.maxStrokeSpeed = f;
    }

    public void setMaxSwolf(int i) {
        this.mMaxSwolf = i;
    }

    public void setMinStrokeSpeed(float f) {
        this.mMinStrokeSpeed = f;
    }

    public void setMinSwolf(int i) {
        this.mMinSwolf = i;
    }

    public void setRealtimeDPS(float f) {
        this.mRealtimeDPS = f;
    }

    public void setRealtimeStrokeSpeed(float f) {
        this.mRealtimeStrokeSpeed = f;
    }

    public void setRealtimeSwolf(int i) {
        this.mRealtimeSwolf = i;
    }

    public void setStkStyle(int i) {
        this.stkStyle = i;
    }

    public void setStrokes(int i) {
        this.strokes = i;
    }

    public void setTrips(int i) {
        this.trips = i;
    }

    public String toString() {
        return "SwimInfo{distancePerStroke=" + this.distancePerStroke + ", avgStrokeSpeed=" + this.avgStrokeSpeed + ", maxStrokeSpeed=" + this.maxStrokeSpeed + ", avgPace=" + this.avgPace + ", strokes=" + this.strokes + ", avgSwolf=" + this.avgSwolf + ", stkStyle=" + this.stkStyle + ", trips=" + this.trips + ", mRealtimeStrokeSpeed=" + this.mRealtimeStrokeSpeed + ", mMinStrokeSpeed=" + this.mMinStrokeSpeed + ", mRealtimeSwolf=" + this.mRealtimeSwolf + ", mMaxSwolf=" + this.mMaxSwolf + ", mMinSwolf=" + this.mMinSwolf + ", mRealtimeDPS=" + this.mRealtimeDPS + AbstractJsonLexerKt.END_OBJ;
    }
}
