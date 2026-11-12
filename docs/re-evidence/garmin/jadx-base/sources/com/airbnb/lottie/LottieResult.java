package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class LottieResult<V> {
    private final Throwable exception;
    private final V value;

    public LottieResult(V v14) {
        this.value = v14;
        this.exception = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        if (getValue() != null && getValue().equals(lottieResult.getValue())) {
            return true;
        }
        if (getException() == null || lottieResult.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    public Throwable getException() {
        return this.exception;
    }

    public V getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }

    public LottieResult(Throwable th3) {
        this.exception = th3;
        this.value = null;
    }
}
