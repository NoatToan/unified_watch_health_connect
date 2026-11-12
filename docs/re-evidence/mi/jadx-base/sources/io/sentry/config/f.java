package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface f {
    @Nullable
    default Double a(@NotNull String str) {
        String property = getProperty(str);
        if (property != null) {
            try {
                return Double.valueOf(property);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @NotNull
    default List<String> b(@NotNull String str) {
        String property = getProperty(str);
        return property != null ? Arrays.asList(property.split(",")) : Collections.emptyList();
    }

    @Nullable
    default Boolean c(@NotNull String str) {
        String property = getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    @Nullable
    default Long d(@NotNull String str) {
        String property = getProperty(str);
        if (property != null) {
            try {
                return Long.valueOf(property);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @NotNull
    default String e(@NotNull String str, @NotNull String str2) {
        String property = getProperty(str);
        return property != null ? property : str2;
    }

    @NotNull
    Map<String, String> getMap(@NotNull String str);

    @Nullable
    String getProperty(@NotNull String str);
}
