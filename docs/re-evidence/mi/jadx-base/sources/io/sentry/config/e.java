package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f21706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ILogger f21707b;

    public e(@NotNull String str, @NotNull ILogger iLogger) {
        this.f21706a = str;
        this.f21707b = iLogger;
    }

    @Nullable
    public Properties a() {
        try {
            File file = new File(this.f21706a);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            this.f21707b.b(SentryLevel.ERROR, e, "Failed to load Sentry configuration from file: %s", this.f21706a);
            return null;
        }
    }
}
