package org.apache.commons.text.lookup;

/* JADX INFO: loaded from: classes3.dex */
final class IllegalArgumentExceptions {
    private IllegalArgumentExceptions() {
    }

    public static IllegalArgumentException format(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr));
    }

    public static IllegalArgumentException format(Throwable th3, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr), th3);
    }
}
