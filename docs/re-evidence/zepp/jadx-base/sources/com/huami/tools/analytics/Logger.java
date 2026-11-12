package com.huami.tools.analytics;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@FunctionalInterface
public interface Logger {
    void d(String str, Object obj);

    void e(String str, Object obj);

    void e(String str, Throwable th);

    void e(String str, Throwable th, Object obj);

    void i(String str, Object obj);

    void log(int i, @Nullable String str, @Nullable Throwable th, @Nullable Object obj);

    void v(String str, Object obj);

    void w(String str, Object obj);

    void w(String str, Throwable th);

    void w(String str, Throwable th, Object obj);

    void wtf(String str, Object obj);

    void wtf(String str, Throwable th);

    void wtf(String str, Throwable th, Object obj);
}
