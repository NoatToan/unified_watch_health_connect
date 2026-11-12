package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.u0;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class a extends d {

    @NotNull
    public final Context d;

    public a(@NotNull Context context, @NotNull ILogger iLogger) {
        super(iLogger);
        this.d = u0.a(context);
    }

    @Override // io.sentry.internal.modules.d
    public Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.d.getAssets().open("sentry-external-modules.txt");
            try {
                Map<String, String> mapC = c(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                return mapC;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            this.f21725a.c(SentryLevel.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e) {
            this.f21725a.a(SentryLevel.ERROR, "Error extracting modules.", e);
            return treeMap;
        }
    }
}
