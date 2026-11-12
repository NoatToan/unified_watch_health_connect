package com.xiaomi.hm.health.training.api.util;

import androidx.annotation.Nullable;
import com.xiaomi.hm.health.training.api.function.Supplier;

/* JADX INFO: loaded from: classes21.dex */
@FunctionalInterface
public interface Logger {
    void d(@Nullable String str, @Nullable Supplier<Object> supplier);

    void e(@Nullable String str, @Nullable Supplier<Object> supplier);

    void e(@Nullable String str, @Nullable Throwable th);

    void e(@Nullable String str, @Nullable Throwable th, @Nullable Supplier<Object> supplier);

    void i(@Nullable String str, @Nullable Supplier<Object> supplier);

    void log(int i, @Nullable String str, @Nullable Throwable th, @Nullable Supplier<Object> supplier);

    void v(@Nullable String str, @Nullable Supplier<Object> supplier);

    void w(@Nullable String str, @Nullable Supplier<Object> supplier);

    void w(@Nullable String str, @Nullable Throwable th);

    void w(@Nullable String str, @Nullable Throwable th, @Nullable Supplier<Object> supplier);

    void wtf(@Nullable String str, @Nullable Supplier<Object> supplier);

    void wtf(@Nullable String str, @Nullable Throwable th);

    void wtf(@Nullable String str, @Nullable Throwable th, @Nullable Supplier<Object> supplier);
}
