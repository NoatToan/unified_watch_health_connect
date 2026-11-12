package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import android.os.Bundle;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import defpackage.lst;

/* JADX INFO: loaded from: classes11.dex */
public class SectionInfo {
    private static final int DEFAULT_VALUE = -1;

    @SerializedName("distance")
    private int mDistance;

    @SerializedName("pace")
    private long mPace;

    @SerializedName(HwExerciseConstants.JSON_NAME_POINT_INDEX)
    private int mPointIndex;

    @SerializedName(HwExerciseConstants.JSON_NAME_SECTION_NUM)
    private int mSectionNum;

    @SerializedName(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF)
    private int mSwimAvgSwolf;

    @SerializedName(HwExerciseConstants.JSON_NAME_SWIM_PULL_TIMES)
    private int mSwimPullTimes;

    @SerializedName(HwExerciseConstants.JSON_NAME_SWIM_TIME)
    private long mSwimTime;

    @SerializedName(HwExerciseConstants.JSON_NAME_SWIM_TYPE)
    private int mSwimType;

    @SerializedName("swolf_base")
    private int mSwolfBase;

    @SerializedName("unit")
    private int mUnit;

    public int getDistance() {
        return ((Integer) lst.d(Integer.valueOf(this.mDistance))).intValue();
    }

    public void setDistance(int i) {
        this.mDistance = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getUnit() {
        return ((Integer) lst.d(Integer.valueOf(this.mUnit))).intValue();
    }

    public void setUnit(int i) {
        this.mUnit = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getPace() {
        return ((Long) lst.d(Long.valueOf(this.mPace))).longValue();
    }

    public void setPace(long j) {
        this.mPace = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int getPointIndex() {
        return ((Integer) lst.d(Integer.valueOf(this.mPointIndex))).intValue();
    }

    public void setPointIndex(int i) {
        this.mPointIndex = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSectionNum() {
        return ((Integer) lst.d(Integer.valueOf(this.mSectionNum))).intValue();
    }

    public void setSectionNum(int i) {
        this.mSectionNum = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSwimType() {
        return ((Integer) lst.d(Integer.valueOf(this.mSwimType))).intValue();
    }

    public void setSwimType(int i) {
        this.mSwimType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSwimPullTimes() {
        return ((Integer) lst.d(Integer.valueOf(this.mSwimPullTimes))).intValue();
    }

    public void setSwimPullTimes(int i) {
        this.mSwimPullTimes = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSwimAvgSwolf() {
        return ((Integer) lst.d(Integer.valueOf(this.mSwimAvgSwolf))).intValue();
    }

    public void setSwimAvgSwolf(int i) {
        this.mSwimAvgSwolf = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSwolfBase() {
        return ((Integer) lst.d(Integer.valueOf(this.mSwolfBase))).intValue();
    }

    public void setSwolfBase(int i) {
        this.mSwolfBase = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getSwimTime() {
        return ((Long) lst.d(Long.valueOf(this.mSwimTime))).longValue();
    }

    public void setSwimTime(long j) {
        this.mSwimTime = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public void setBundle(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.mDistance = ((Integer) lst.d(Integer.valueOf(bundle.getInt("distance", -1)))).intValue();
        this.mUnit = ((Integer) lst.d(Integer.valueOf(bundle.getInt("unit", -1)))).intValue();
        this.mPace = ((Long) lst.d(Long.valueOf(bundle.getLong("pace", -1L)))).longValue();
        this.mPointIndex = ((Integer) lst.d(Integer.valueOf(bundle.getInt(HwExerciseConstants.JSON_NAME_POINT_INDEX, -1)))).intValue();
        this.mSectionNum = ((Integer) lst.d(Integer.valueOf(bundle.getInt(HwExerciseConstants.JSON_NAME_SECTION_NUM, -1)))).intValue();
        this.mSwimType = ((Integer) lst.d(Integer.valueOf(bundle.getInt(HwExerciseConstants.JSON_NAME_SWIM_TYPE, -1)))).intValue();
        this.mSwimPullTimes = ((Integer) lst.d(Integer.valueOf(bundle.getInt(HwExerciseConstants.JSON_NAME_SWIM_PULL_TIMES, -1)))).intValue();
        this.mSwimAvgSwolf = ((Integer) lst.d(Integer.valueOf(bundle.getInt(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF, -1)))).intValue();
        this.mSwimTime = ((Long) lst.d(Long.valueOf(bundle.getLong(HwExerciseConstants.JSON_NAME_SWIM_TIME, -1L)))).longValue();
        this.mSwolfBase = ((Integer) lst.d(Integer.valueOf(bundle.getInt("swolf_base", -1)))).intValue();
    }
}
