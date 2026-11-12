package com.nimbusds.jose;

/* JADX INFO: loaded from: classes6.dex */
public class KeyLengthException extends KeyException {
    private final Algorithm alg;
    private final int expectedLength;

    public KeyLengthException(String str) {
        super(str);
        this.expectedLength = 0;
        this.alg = null;
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

    public KeyLengthException(int i, Algorithm algorithm) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            str = "The expected key length is " + i + " bits";
        } else {
            str = "Unexpected key length";
        }
        sb.append(str);
        if (algorithm != null) {
            str2 = " (for " + algorithm + " algorithm)";
        } else {
            str2 = "";
        }
        sb.append(str2);
        super(sb.toString());
        this.expectedLength = i;
        this.alg = algorithm;
    }
}
