package com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes11.dex */
public class WorkoutDisplayInfo {
    private boolean isFreeMotion = false;
    private int sportDataSource = 0;
    private int chiefSportDataType = 0;
    private boolean isTrackPoint = true;
    private int workoutType = 258;

    public void setFreeMotion(boolean z) {
        this.isFreeMotion = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean getFreeMotion() {
        return ((Boolean) lst.d(Boolean.valueOf(this.isFreeMotion))).booleanValue();
    }

    public void setSportDataSource(int i) {
        this.sportDataSource = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getSportDataSource() {
        return ((Integer) lst.d(Integer.valueOf(this.sportDataSource))).intValue();
    }

    public void setChiefSportDataType(int i) {
        this.chiefSportDataType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getChiefSportDataType() {
        return ((Integer) lst.d(Integer.valueOf(this.chiefSportDataType))).intValue();
    }

    public void setHasTrackPoint(boolean z) {
        this.isTrackPoint = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isHasTrackPoint() {
        return ((Boolean) lst.d(Boolean.valueOf(this.isTrackPoint))).booleanValue();
    }

    public void setWorkoutType(int i) {
        this.workoutType = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getWorkoutType() {
        return ((Integer) lst.d(Integer.valueOf(this.workoutType))).intValue();
    }
}
