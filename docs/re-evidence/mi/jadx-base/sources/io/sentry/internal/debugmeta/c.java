package io.sentry.internal.debugmeta;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ILogger f21719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ClassLoader f21720b;

    public c(@NotNull ILogger iLogger) {
        this(iLogger, c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.a
    @Nullable
    public List<Properties> a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f21720b.getResources(io.sentry.util.c.f21887a);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = urlNextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        this.f21719a.c(SentryLevel.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RuntimeException e) {
                    this.f21719a.b(SentryLevel.ERROR, e, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e2) {
            this.f21719a.b(SentryLevel.ERROR, e2, "Failed to load %s", io.sentry.util.c.f21887a);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.f21719a.c(SentryLevel.INFO, "No %s file was found.", io.sentry.util.c.f21887a);
        return null;
    }

    public c(@NotNull ILogger iLogger, @Nullable ClassLoader classLoader) {
        this.f21719a = iLogger;
        this.f21720b = io.sentry.util.a.a(classLoader);
    }
}
