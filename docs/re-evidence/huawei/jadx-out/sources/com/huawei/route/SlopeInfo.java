package com.huawei.route;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public class SlopeInfo implements Serializable {
    private static final long serialVersionUID = -7707465834927246579L;

    @SerializedName("ascent")
    private float ascent;

    @SerializedName("climbTime")
    private long climbTime;

    @SerializedName("distance")
    private float distance;

    @SerializedName("endAltIndex")
    private int endAltIndex;

    @SerializedName("endTrackIndex")
    private int endTrackIndex;

    @SerializedName("gradient")
    private float gradient;

    @SerializedName("level")
    private int level;

    @SerializedName("number")
    private int number;

    @SerializedName("startAltIndex")
    private int startAltIndex;

    @SerializedName("startDistance")
    private float startDistance;

    @SerializedName("startTrackIndex")
    private int startTrackIndex;

    public float getAscent() {
        return this.ascent;
    }

    public void setAscent(float f) {
        this.ascent = f;
    }

    public long getClimbTime() {
        return this.climbTime;
    }

    public void setClimbTime(long j) {
        this.climbTime = j;
    }

    public float getDistance() {
        return this.distance;
    }

    public void setDistance(float f) {
        this.distance = f;
    }

    public int getEndAltIndex() {
        return this.endAltIndex;
    }

    public void setEndAltIndex(int i) {
        this.endAltIndex = i;
    }

    public int getEndTrackIndex() {
        return this.endTrackIndex;
    }

    public void setEndTrackIndex(int i) {
        this.endTrackIndex = i;
    }

    public float getGradient() {
        return this.gradient;
    }

    public void setGradient(float f) {
        this.gradient = f;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int i) {
        this.number = i;
    }

    public int getStartAltIndex() {
        return this.startAltIndex;
    }

    public void setStartAltIndex(int i) {
        this.startAltIndex = i;
    }

    public float getStartDistance() {
        return this.startDistance;
    }

    public void setStartDistance(float f) {
        this.startDistance = f;
    }

    public int getStartTrackIndex() {
        return this.startTrackIndex;
    }

    public void setStartTrackIndex(int i) {
        this.startTrackIndex = i;
    }
}
