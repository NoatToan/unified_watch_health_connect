package io.sentry.android.core;

import android.os.Build;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ILogger f21584a;

    public r0(@NotNull ILogger iLogger) {
        this.f21584a = (ILogger) io.sentry.util.p.c(iLogger, "The ILogger object is required.");
    }

    @Nullable
    public String a() {
        return Build.TAGS;
    }

    @Nullable
    public String b() {
        return Build.MANUFACTURER;
    }

    @Nullable
    public String c() {
        return Build.MODEL;
    }

    public int d() {
        return Build.VERSION.SDK_INT;
    }

    @Nullable
    public String e() {
        return Build.VERSION.RELEASE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    @Nullable
    public Boolean f() {
        boolean z;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            this.f21584a.a(SentryLevel.ERROR, "Error checking whether application is running in an emulator.", th);
            return null;
        }
    }
}
