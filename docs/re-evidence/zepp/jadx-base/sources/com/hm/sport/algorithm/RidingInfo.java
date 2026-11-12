package com.hm.sport.algorithm;

/* JADX INFO: loaded from: classes4.dex */
public class RidingInfo {
    private float mDistance3DAscend;
    private float mDistance3DDescend;
    private float mDistance3DFlat;
    private float mSpeed3D;
    private int mTimeAscend;
    private int mTimeDescend;
    private int mTimeFlat;

    public RidingInfo(int i, int i2, int i3, float f, float f2, float f3, float f4) {
        this.mTimeAscend = -1;
        this.mTimeDescend = -1;
        this.mTimeFlat = -1;
        this.mDistance3DAscend = -1.0f;
        this.mDistance3DDescend = -1.0f;
        this.mDistance3DFlat = -1.0f;
        this.mSpeed3D = -1.0f;
        this.mTimeAscend = i;
        this.mTimeDescend = i2;
        this.mTimeFlat = i3;
        this.mDistance3DAscend = f;
        this.mDistance3DDescend = f2;
        this.mDistance3DFlat = f3;
        this.mSpeed3D = f4;
    }

    public float getDistance3DAscend() {
        return this.mDistance3DAscend;
    }

    public float getDistance3DDescend() {
        return this.mDistance3DDescend;
    }

    public float getDistance3DFlat() {
        return this.mDistance3DFlat;
    }

    public float getSpeed3D() {
        return this.mSpeed3D;
    }

    public int getTimeAscend() {
        return this.mTimeAscend;
    }

    public int getTimeDescend() {
        return this.mTimeDescend;
    }

    public int getTimeFlat() {
        return this.mTimeFlat;
    }

    public String toString() {
        return "mTimeAscend:" + this.mTimeAscend + ",mTimeDescend:" + this.mTimeDescend + ",mTimeFlat:" + this.mTimeFlat + ",mDistance3DAscend:" + this.mDistance3DAscend + ",mDistance3DDescend:" + this.mDistance3DDescend + ",mDistance3DFlat:" + this.mDistance3DFlat + ",mSpeed3D:" + this.mSpeed3D;
    }
}
