package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SportAccumInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public long mActiveTime;
    public float mAvgCadence;
    public float mAvgPace;
    public float mAvgSpeed;
    public float mAvgStride;
    public float mDistance;
    public float mDistanceHasStep;
    public float mMaxCadence;
    public int mMaxLatitude;
    public int mMaxLongitude;
    public float mMaxPace;
    public float mMaxSpeed;
    public float mMaxStride;
    public float mMinCadence;
    public int mMinLatitude;
    public int mMinLongitude;
    public float mMinPace;
    public float mMinSpeed;
    public float mMinStride;
    public long mSecCountHasStep;
    public float mSportCalories;
    public long mStep;
    public long mStepHasDistance;
    public float mTotalStride;
    public long restTimeBetweenGroups;
    public float climbDistance = -1.0f;
    public float mAscendMeter = -1.0f;
    public float mDescendMeter = -1.0f;
    public float mMinAltitude = -20000.0f;
    public float mMaxAltitude = -20000.0f;
    public long pauseTime = -1;
    public float mAvgAltitude = -20000.0f;

    public long getActiveTime() {
        return this.mActiveTime;
    }

    public float getAscendMeter() {
        return this.mAscendMeter;
    }

    public float getAvgAltitude() {
        return this.mAvgAltitude;
    }

    public float getAvgCadence() {
        return this.mAvgCadence;
    }

    public float getAvgPace() {
        return this.mAvgPace;
    }

    public float getAvgSpeed() {
        return this.mAvgSpeed;
    }

    public float getAvgStride() {
        return this.mAvgStride;
    }

    public float getClimbDistance() {
        return this.climbDistance;
    }

    public float getDescendMeter() {
        return this.mDescendMeter;
    }

    public float getDistance() {
        return this.mDistance;
    }

    public float getDistanceHasStep() {
        return this.mDistanceHasStep;
    }

    public float getMaxAltitude() {
        return this.mMaxAltitude;
    }

    public float getMaxCadence() {
        return this.mMaxCadence;
    }

    public int getMaxLatitude() {
        return this.mMaxLatitude;
    }

    public int getMaxLongitude() {
        return this.mMaxLongitude;
    }

    public float getMaxPace() {
        return this.mMaxPace;
    }

    public float getMaxSpeed() {
        return this.mMaxSpeed;
    }

    public float getMaxStride() {
        return this.mMaxStride;
    }

    public float getMinAltitude() {
        return this.mMinAltitude;
    }

    public float getMinCadence() {
        return this.mMinCadence;
    }

    public int getMinLatitude() {
        return this.mMinLatitude;
    }

    public int getMinLongitude() {
        return this.mMinLongitude;
    }

    public float getMinPace() {
        return this.mMinPace;
    }

    public float getMinSpeed() {
        return this.mMinSpeed;
    }

    public float getMinStride() {
        return this.mMinStride;
    }

    public long getPauseTime() {
        return this.pauseTime;
    }

    public long getRestTimeBetweenGroups() {
        return this.restTimeBetweenGroups;
    }

    public long getSecCountHasStep() {
        return this.mSecCountHasStep;
    }

    public float getSportCalories() {
        return this.mSportCalories;
    }

    public long getStep() {
        return this.mStep;
    }

    public long getStepHasDistance() {
        return this.mStepHasDistance;
    }

    public float getTotalStride() {
        return this.mTotalStride;
    }

    public void setActiveTime(long j) {
        this.mActiveTime = j;
    }

    public void setAscendMeter(float f) {
        this.mAscendMeter = f;
    }

    public void setAvgAltitude(float f) {
        this.mAvgAltitude = f;
    }

    public void setAvgCadence(float f) {
        this.mAvgCadence = f;
    }

    public void setAvgPace(float f) {
        this.mAvgPace = f;
    }

    public void setAvgSpeed(float f) {
        this.mAvgSpeed = f;
    }

    public void setAvgStride(float f) {
        this.mAvgStride = f;
    }

    public void setClimbDistance(float f) {
        this.climbDistance = f;
    }

    public void setDescendMeter(float f) {
        this.mDescendMeter = f;
    }

    public void setDistance(float f) {
        this.mDistance = f;
    }

    public void setDistanceHasStep(float f) {
        this.mDistanceHasStep = f;
    }

    public void setMaxAltitude(float f) {
        this.mMaxAltitude = f;
    }

    public void setMaxCadence(float f) {
        this.mMaxCadence = f;
    }

    public void setMaxLatitude(int i) {
        this.mMaxLatitude = i;
    }

    public void setMaxLongitude(int i) {
        this.mMaxLongitude = i;
    }

    public void setMaxPace(float f) {
        this.mMaxPace = f;
    }

    public void setMaxSpeed(float f) {
        this.mMaxSpeed = f;
    }

    public void setMaxStride(float f) {
        this.mMaxStride = f;
    }

    public void setMinAltitude(float f) {
        this.mMinAltitude = f;
    }

    public void setMinCadence(float f) {
        this.mMinCadence = f;
    }

    public void setMinLatitude(int i) {
        this.mMinLatitude = i;
    }

    public void setMinLongitude(int i) {
        this.mMinLongitude = i;
    }

    public void setMinPace(float f) {
        this.mMinPace = f;
    }

    public void setMinSpeed(float f) {
        this.mMinSpeed = f;
    }

    public void setMinStride(float f) {
        this.mMinStride = f;
    }

    public void setPauseTime(long j) {
        this.pauseTime = j;
    }

    public void setRestTimeBetweenGroups(long j) {
        this.restTimeBetweenGroups = j;
    }

    public void setSecCountHasStep(long j) {
        this.mSecCountHasStep = j;
    }

    public void setSportCalories(float f) {
        this.mSportCalories = f;
    }

    public void setStep(long j) {
        this.mStep = j;
    }

    public void setStepHasDistance(long j) {
        this.mStepHasDistance = j;
    }

    public void setTotalStride(float f) {
        this.mTotalStride = f;
    }

    public String toString() {
        return "SportAccumInfo{mDistance=" + this.mDistance + ", mAscendMeter=" + this.mAscendMeter + ", mDescendMeter=" + this.mDescendMeter + ", mMinAltitude=" + this.mMinAltitude + ", mMaxAltitude=" + this.mMaxAltitude + ", mMinLatitude=" + this.mMinLatitude + ", mMaxLatitude=" + this.mMaxLatitude + ", mMinLongitude=" + this.mMinLongitude + ", mMaxLongitude=" + this.mMaxLongitude + ", mStep=" + this.mStep + ", mActiveTime=" + this.mActiveTime + ", mSportCalories=" + this.mSportCalories + ", mMaxSpeed=" + this.mMaxSpeed + ", mMinPace=" + this.mMinPace + ", mMaxPace=" + this.mMaxPace + ", mTotalStride=" + this.mTotalStride + ", mSecCountHasStep=" + this.mSecCountHasStep + ", mAvgAltitude=" + this.mAvgAltitude + ", mMinSpeed=" + this.mMinSpeed + ", mAvgSpeed=" + this.mAvgSpeed + ", mAvgPace=" + this.mAvgPace + ", mMaxCadence=" + this.mMaxCadence + ", mMinCadence=" + this.mMinCadence + ", mAvgCadence=" + this.mAvgCadence + ", mMaxStride=" + this.mMaxStride + ", mMinStride=" + this.mMinStride + ", mAvgStride=" + this.mAvgStride + ", mDistanceHasStep=" + this.mDistanceHasStep + ", mStepHasDistance=" + this.mStepHasDistance + AbstractJsonLexerKt.END_OBJ;
    }
}
