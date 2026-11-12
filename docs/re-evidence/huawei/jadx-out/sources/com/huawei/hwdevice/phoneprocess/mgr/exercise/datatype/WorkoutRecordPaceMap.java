package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import defpackage.lst;

/* JADX INFO: loaded from: classes11.dex */
public class WorkoutRecordPaceMap {

    @SerializedName("distance")
    private int mDistance;

    @SerializedName("pace")
    private int mPace;

    @SerializedName(HwExerciseConstants.JSON_NAME_UNIT_TYPE)
    private int mUnitType;

    @SerializedName(HwExerciseConstants.JSON_NAME_POINT_INDEX)
    private int mPointIndex = 0;

    @SerializedName(HwExerciseConstants.JSON_NAME_IS_LAST_DISTANCE)
    private boolean mIsLastLessDistance = false;

    @SerializedName(HwExerciseConstants.JSON_NAME_LAST_DISTANCE)
    private int mLastLessDistance = 0;

    public void setDistance(int i) {
        this.mDistance = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDistance() {
        return ((Integer) lst.d(Integer.valueOf(this.mDistance))).intValue();
    }

    public void setUnitType(int i) {
        this.mUnitType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getUnitType() {
        return ((Integer) lst.d(Integer.valueOf(this.mUnitType))).intValue();
    }

    public void setPace(int i) {
        this.mPace = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getPace() {
        return ((Integer) lst.d(Integer.valueOf(this.mPace))).intValue();
    }

    public void setPointIndex(int i) {
        this.mPointIndex = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getPointIndex() {
        return ((Integer) lst.d(Integer.valueOf(this.mPointIndex))).intValue();
    }

    public void setLastLessDistance(int i) {
        this.mLastLessDistance = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getLastLessDistance() {
        return ((Integer) lst.d(Integer.valueOf(this.mLastLessDistance))).intValue();
    }

    public void setIsLastLessDistance(boolean z) {
        this.mIsLastLessDistance = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isLastLessDistance() {
        return ((Boolean) lst.d(Boolean.valueOf(this.mIsLastLessDistance))).booleanValue();
    }
}
