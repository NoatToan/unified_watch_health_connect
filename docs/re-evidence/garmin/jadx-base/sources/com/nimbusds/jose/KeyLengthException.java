package com.nimbusds.jose;

import v.e0;

/* JADX INFO: loaded from: classes3.dex */
public class KeyLengthException extends KeyException {
    private final Algorithm alg;
    private final int expectedLength;

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyLengthException(int i14, Algorithm algorithm) {
        String str;
        String strF = i14 > 0 ? e0.f(i14, "The expected key length is ", " bits") : "Unexpected key length";
        if (algorithm != null) {
            str = " (for " + algorithm + " algorithm)";
        } else {
            str = "";
        }
        super(strF.concat(str));
        this.expectedLength = i14;
        this.alg = algorithm;
    }

    public Algorithm getAlgorithm() {
        return this.alg;
    }

    public int getExpectedKeyLength() {
        return this.expectedLength;
    }

    public KeyLengthException(Algorithm algorithm) {
        this(0, algorithm);
    }

    public KeyLengthException(String str) {
        super(str);
        this.expectedLength = 0;
        this.alg = null;
    }
}
