package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f21703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ClassLoader f21704b;

    @NotNull
    public final ILogger c;

    public b(@NotNull String str, @Nullable ClassLoader classLoader, @NotNull ILogger iLogger) {
        this.f21703a = str;
        this.f21704b = io.sentry.util.a.a(classLoader);
        this.c = iLogger;
    }

    @Nullable
    public Properties a() {
        try {
            InputStream resourceAsStream = this.f21704b.getResourceAsStream(this.f21703a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e) {
            this.c.b(SentryLevel.ERROR, e, "Failed to load Sentry configuration from classpath resource: %s", this.f21703a);
            return null;
        }
    }

    public b(@NotNull ILogger iLogger) {
        this("sentry.properties", b.class.getClassLoader(), iLogger);
    }
}
