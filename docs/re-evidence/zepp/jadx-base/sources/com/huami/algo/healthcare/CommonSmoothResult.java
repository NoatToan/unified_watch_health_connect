package com.huami.algo.healthcare;

/* JADX INFO: loaded from: classes3.dex */
public class CommonSmoothResult {
    private int resultCode = 0;
    private float[] data = new float[0];

    public float[] getData() {
        return this.data;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public void setData(float[] fArr) {
        this.data = fArr;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public String toString() {
        return "CommonSmoothResult{resultCode=" + this.resultCode + ", data size=" + this.data.length + '}';
    }
}
