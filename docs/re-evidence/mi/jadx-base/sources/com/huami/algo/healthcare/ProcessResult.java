package com.huami.algo.healthcare;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class ProcessResult {
    private int code = 1;
    private float[] model = new float[0];

    public int getCode() {
        return this.code;
    }

    public float[] getModel() {
        return this.model;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setModel(float[] fArr) {
        this.model = fArr;
    }

    public String toString() {
        return "ProcessResult{code=" + this.code + ", model=" + Arrays.toString(this.model) + AbstractJsonLexerKt.END_OBJ;
    }
}
