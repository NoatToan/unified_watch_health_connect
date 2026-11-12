package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes4.dex */
public final class AztecCode {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private BitMatrix e;

    public int getCodeWords() {
        return this.d;
    }

    public int getLayers() {
        return this.c;
    }

    public BitMatrix getMatrix() {
        return this.e;
    }

    public int getSize() {
        return this.b;
    }

    public boolean isCompact() {
        return this.a;
    }

    public void setCodeWords(int i) {
        this.d = i;
    }

    public void setCompact(boolean z) {
        this.a = z;
    }

    public void setLayers(int i) {
        this.c = i;
    }

    public void setMatrix(BitMatrix bitMatrix) {
        this.e = bitMatrix;
    }

    public void setSize(int i) {
        this.b = i;
    }
}
