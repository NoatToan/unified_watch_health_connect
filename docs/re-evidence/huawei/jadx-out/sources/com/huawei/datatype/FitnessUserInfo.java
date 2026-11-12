package com.huawei.datatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes4.dex */
public class FitnessUserInfo {
    private static final int DEFAULT_HEIGHT = 170;
    private static final int DEFAULT_WEIGHT = 60;
    private int mHeight = 170;
    private int mWeight = 60;
    private long mTime = 0;

    public int getHeight() {
        return ((Integer) lst.d(Integer.valueOf(this.mHeight))).intValue();
    }

    public void setHeight(int i) {
        this.mHeight = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getWeight() {
        return ((Integer) lst.d(Integer.valueOf(this.mWeight))).intValue();
    }

    public void setWeight(int i) {
        this.mWeight = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long getTime() {
        return ((Long) lst.d(Long.valueOf(this.mTime))).longValue();
    }

    public void setTime(long j) {
        this.mTime = ((Long) lst.d(Long.valueOf(j))).longValue();
    }
}
