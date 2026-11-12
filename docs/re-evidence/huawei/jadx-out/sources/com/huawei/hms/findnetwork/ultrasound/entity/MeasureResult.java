package com.huawei.hms.findnetwork.ultrasound.entity;

import java.util.Arrays;

/* JADX INFO: loaded from: classes33.dex */
public class MeasureResult {
    private int mFlag;
    private float[] mValue;

    public String toString() {
        return "MeasureResult{mFlag=" + this.mFlag + ", mValue=" + Arrays.toString(this.mValue) + '}';
    }

    public void setValue(float[] fArr) {
        if (fArr != null) {
            this.mValue = (float[]) fArr.clone();
        }
    }

    public void setFlag(int i) {
        this.mFlag = i;
    }

    public float[] getValue() {
        float[] fArr = this.mValue;
        return fArr == null ? new float[0] : (float[]) fArr.clone();
    }

    public int getFlag() {
        return this.mFlag;
    }

    public MeasureResult(int i, float[] fArr) {
        this.mFlag = i;
        if (fArr != null) {
            this.mValue = (float[]) fArr.clone();
        }
    }
}
