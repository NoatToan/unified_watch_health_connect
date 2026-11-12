package io.sentry.util;

import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static String f21887a = "sentry-debug-meta.properties";

    public static void a(@NotNull SentryOptions sentryOptions, @NotNull List<Properties> list) {
        if (sentryOptions.getBundleIds().isEmpty()) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String property = it.next().getProperty("io.sentry.bundle-ids");
                sentryOptions.getLogger().c(SentryLevel.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (String str : property.split(",", -1)) {
                        sentryOptions.addBundleId(str);
                    }
                }
            }
        }
    }

    public static void b(@NotNull SentryOptions sentryOptions, @NotNull List<Properties> list) {
        if (sentryOptions.getProguardUuid() == null) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String strD = d(it.next());
                if (strD != null) {
                    sentryOptions.getLogger().c(SentryLevel.DEBUG, "Proguard UUID found: %s", strD);
                    sentryOptions.setProguardUuid(strD);
                    return;
                }
            }
        }
    }

    public static void c(@NotNull SentryOptions sentryOptions, @Nullable List<Properties> list) {
        if (list != null) {
            a(sentryOptions, list);
            b(sentryOptions, list);
        }
    }

    @Nullable
    public static String d(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
