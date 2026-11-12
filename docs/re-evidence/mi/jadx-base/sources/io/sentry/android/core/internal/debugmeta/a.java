package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.u0;
import io.sentry.util.c;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class a implements io.sentry.internal.debugmeta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ILogger f21477b;

    public a(@NotNull Context context, @NotNull ILogger iLogger) {
        this.f21476a = u0.a(context);
        this.f21477b = iLogger;
    }

    @Override // io.sentry.internal.debugmeta.a
    @Nullable
    public List<Properties> a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f21476a.getAssets().open(c.f21887a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List<Properties> listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            this.f21477b.b(SentryLevel.INFO, e, "%s file was not found.", c.f21887a);
            return null;
        } catch (IOException e2) {
            this.f21477b.a(SentryLevel.ERROR, "Error getting Proguard UUIDs.", e2);
            return null;
        } catch (RuntimeException e3) {
            this.f21477b.b(SentryLevel.ERROR, e3, "%s file is malformed.", c.f21887a);
            return null;
        }
    }
}
