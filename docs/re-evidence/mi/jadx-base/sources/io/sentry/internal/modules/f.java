package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class f extends d {

    @NotNull
    public final ClassLoader d;

    public f(@NotNull ILogger iLogger) {
        this(iLogger, f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.d
    public Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.d.getResourceAsStream("sentry-external-modules.txt");
            try {
                if (resourceAsStream != null) {
                    Map<String, String> mapC = c(resourceAsStream);
                    resourceAsStream.close();
                    return mapC;
                }
                this.f21725a.c(SentryLevel.INFO, "%s file was not found.", "sentry-external-modules.txt");
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return treeMap;
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            this.f21725a.a(SentryLevel.INFO, "Access to resources failed.", e);
            return treeMap;
        } catch (SecurityException e2) {
            this.f21725a.a(SentryLevel.INFO, "Access to resources denied.", e2);
            return treeMap;
        }
    }

    public f(@NotNull ILogger iLogger, @Nullable ClassLoader classLoader) {
        super(iLogger);
        this.d = io.sentry.util.a.a(classLoader);
    }
}
