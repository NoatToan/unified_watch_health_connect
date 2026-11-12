package io.sentry.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    @NotNull
    public static ClassLoader a(@Nullable ClassLoader classLoader) {
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }
}
