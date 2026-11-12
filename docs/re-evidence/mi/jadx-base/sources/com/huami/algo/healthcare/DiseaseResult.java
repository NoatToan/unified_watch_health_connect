package com.huami.algo.healthcare;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class DiseaseResult {
    private int diseaseResult = -1;
    private int resultCode = 0;
    private float[] data = new float[0];

    public float[] getData() {
        return this.data;
    }

    public int getDiseaseResult() {
        return this.diseaseResult;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public void setData(float[] fArr) {
        this.data = fArr;
    }

    public void setDiseaseResult(int i) {
        this.diseaseResult = i;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public String toString() {
        return "DiseaseResult{resultCode=" + this.resultCode + ", data size=" + this.data.length + ", diseaseResult=" + this.diseaseResult + AbstractJsonLexerKt.END_OBJ;
    }
}
