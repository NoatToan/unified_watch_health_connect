package com.xiaomi.smarthome.library.common.util;

/* JADX INFO: loaded from: classes2.dex */
public final class CloseUtils {
    private CloseUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void closeIO(AutoCloseable... autoCloseableArr) {
        if (autoCloseableArr == null) {
            return;
        }
        for (AutoCloseable autoCloseable : autoCloseableArr) {
            if (autoCloseable != null) {
                try {
                    autoCloseable.close();
                } catch (Exception unused) {
                }
            }
        }
    }
}
