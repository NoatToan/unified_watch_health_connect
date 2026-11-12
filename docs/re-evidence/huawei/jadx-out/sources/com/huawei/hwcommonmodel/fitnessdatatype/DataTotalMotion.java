package com.huawei.hwcommonmodel.fitnessdatatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes10.dex */
public class DataTotalMotion {
    private int calorie;
    private int distance;
    private int height;
    private int motion_type;
    private int pushes;
    private int sleep_time;
    private int step;

    public int getMotion_type() {
        return ((Integer) lst.d(Integer.valueOf(this.motion_type))).intValue();
    }

    public void setMotion_type(int i) {
        this.motion_type = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getStep() {
        return ((Integer) lst.d(Integer.valueOf(this.step))).intValue();
    }

    public void setStep(int i) {
        this.step = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getCalorie() {
        return ((Integer) lst.d(Integer.valueOf(this.calorie))).intValue();
    }

    public void setCalorie(int i) {
        this.calorie = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDistance() {
        return ((Integer) lst.d(Integer.valueOf(this.distance))).intValue();
    }

    public void setDistance(int i) {
        this.distance = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getHeight() {
        return ((Integer) lst.d(Integer.valueOf(this.height))).intValue();
    }

    public void setHeight(int i) {
        this.height = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void setSleep_time(int i) {
        this.sleep_time = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getPushes() {
        return ((Integer) lst.d(Integer.valueOf(this.pushes))).intValue();
    }

    public void setPushes(int i) {
        this.pushes = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
