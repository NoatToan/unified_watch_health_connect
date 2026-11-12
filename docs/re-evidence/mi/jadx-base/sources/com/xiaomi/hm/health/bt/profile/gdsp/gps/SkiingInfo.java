package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SkiingInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private float mAvgSlope;
    private float mAvgSpeed;
    private float mMaxSlope;
    private float mMaxSpeed;
    private float mMinSlope;
    private float mMinSpeed;
    private float mTotalTripsAcmDescendMeter;
    private float mTotalTripsAcmDistance;
    private float mTripAcmDescendMeter;
    private float mTripAvgSpeed;
    private float mTripDistance;
    private float mTripMaxSpeed;
    private float mTripMinSpeed;
    private float mTripSlope;
    private int mTrips;

    public float getAvgSlope() {
        return this.mAvgSlope;
    }

    public float getAvgSpeed() {
        return this.mAvgSpeed;
    }

    public float getMaxSlope() {
        return this.mMaxSlope;
    }

    public float getMaxSpeed() {
        return this.mMaxSpeed;
    }

    public float getMinSlope() {
        return this.mMinSlope;
    }

    public float getMinSpeed() {
        return this.mMinSpeed;
    }

    public float getTotalTripsAcmDescendMeter() {
        return this.mTotalTripsAcmDescendMeter;
    }

    public float getTotalTripsAcmDistance() {
        return this.mTotalTripsAcmDistance;
    }

    public float getTripAcmDescendMeter() {
        return this.mTripAcmDescendMeter;
    }

    public float getTripAvgSpeed() {
        return this.mTripAvgSpeed;
    }

    public float getTripDistance() {
        return this.mTripDistance;
    }

    public float getTripMaxSpeed() {
        return this.mTripMaxSpeed;
    }

    public float getTripMinSpeed() {
        return this.mTripMinSpeed;
    }

    public float getTripSlope() {
        return this.mTripSlope;
    }

    public int getTrips() {
        return this.mTrips;
    }

    public void setAvgSlope(float f) {
        this.mAvgSlope = f;
    }

    public void setAvgSpeed(float f) {
        this.mAvgSpeed = f;
    }

    public void setMaxSlope(float f) {
        this.mMaxSlope = f;
    }

    public void setMaxSpeed(float f) {
        this.mMaxSpeed = f;
    }

    public void setMinSlope(float f) {
        this.mMinSlope = f;
    }

    public void setMinSpeed(float f) {
        this.mMinSpeed = f;
    }

    public void setTotalTripsAcmDescendMeter(float f) {
        this.mTotalTripsAcmDescendMeter = f;
    }

    public void setTotalTripsAcmDistance(float f) {
        this.mTotalTripsAcmDistance = f;
    }

    public void setTripAcmDescendMeter(float f) {
        this.mTripAcmDescendMeter = f;
    }

    public void setTripAvgSpeed(float f) {
        this.mTripAvgSpeed = f;
    }

    public void setTripDistance(float f) {
        this.mTripDistance = f;
    }

    public void setTripMaxSpeed(float f) {
        this.mTripMaxSpeed = f;
    }

    public void setTripMinSpeed(float f) {
        this.mTripMinSpeed = f;
    }

    public void setTripSlope(float f) {
        this.mTripSlope = f;
    }

    public void setTrips(int i) {
        this.mTrips = i;
    }

    public String toString() {
        return "SkiingInfo{mTripDistance=" + this.mTripDistance + ", mTripAvgSpeed=" + this.mTripAvgSpeed + ", mTripMaxSpeed=" + this.mTripMaxSpeed + ", mTripAcmDescendMeter=" + this.mTripAcmDescendMeter + ", mTotalTripsAcmDescendMeter=" + this.mTotalTripsAcmDescendMeter + ", mMaxSlope=" + this.mMaxSlope + ", mAvgSlope=" + this.mAvgSlope + ", mTripSlope=" + this.mTripSlope + ", mTrips=" + this.mTrips + ", mTotalTripsAcmDistance=" + this.mTotalTripsAcmDistance + ", mTripMinSpeed=" + this.mTripMinSpeed + ", mAvgSpeed=" + this.mAvgSpeed + ", mMaxSpeed=" + this.mMaxSpeed + ", mMinSpeed=" + this.mMinSpeed + ", mMinSlope=" + this.mMinSlope + AbstractJsonLexerKt.END_OBJ;
    }
}
