package com.huami.algo.healthcare;

/* JADX INFO: loaded from: classes5.dex */
public class EcgBeats {
    private int cnt;
    private int resultCode = 0;
    private float[] beatsBuffer = new float[0];

    public float[] getBeatsBuffer() {
        return this.beatsBuffer;
    }

    public int getCnt() {
        return this.cnt;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public void setBeatsBuffer(float[] fArr) {
        this.beatsBuffer = fArr;
    }

    public void setCnt(int i) {
        this.cnt = i;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }
}
