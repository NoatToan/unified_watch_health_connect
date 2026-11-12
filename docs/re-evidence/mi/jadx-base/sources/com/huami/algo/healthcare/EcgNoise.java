package com.huami.algo.healthcare;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class EcgNoise {
    private int left;
    private int right;

    public int getLeft() {
        return this.left;
    }

    public int getRight() {
        return this.right;
    }

    public void setLeft(int i) {
        this.left = i;
    }

    public void setRight(int i) {
        this.right = i;
    }

    public String toString() {
        return "EcgNoise{left=" + this.left + ", right=" + this.right + AbstractJsonLexerKt.END_OBJ;
    }
}
