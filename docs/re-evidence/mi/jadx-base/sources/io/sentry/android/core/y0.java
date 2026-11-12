package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import defpackage.yq5;
import io.sentry.IConnectionStatusProvider;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.Device;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class y0 {

    @SuppressLint({"StaticFieldLeak"})
    public static volatile y0 h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f21614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SentryAndroidOptions f21615b;

    @NotNull
    public final r0 c;

    @Nullable
    public final Boolean d;

    @Nullable
    public final u0.a e;

    @NotNull
    public final io.sentry.protocol.j f;

    @Nullable
    public final Long g;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21616a;

        static {
            int[] iArr = new int[IConnectionStatusProvider.ConnectionStatus.values().length];
            f21616a = iArr;
            try {
                iArr[IConnectionStatusProvider.ConnectionStatus.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21616a[IConnectionStatusProvider.ConnectionStatus.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public y0(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f21614a = context;
        this.f21615b = sentryAndroidOptions;
        r0 r0Var = new r0(sentryAndroidOptions.getLogger());
        this.c = r0Var;
        io.sentry.android.core.internal.util.f.a().c();
        this.f = t();
        this.d = r0Var.f();
        this.e = u0.q(context, sentryAndroidOptions.getLogger(), r0Var);
        ActivityManager.MemoryInfo memoryInfoI = u0.i(context, sentryAndroidOptions.getLogger());
        if (memoryInfoI != null) {
            this.g = Long.valueOf(memoryInfoI.totalMem);
        } else {
            this.g = null;
        }
    }

    @Nullable
    public static Float c(@NotNull Intent intent, @NotNull SentryOptions sentryOptions) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            sentryOptions.getLogger().a(SentryLevel.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    @NotNull
    public static y0 i(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        if (h == null) {
            synchronized (y0.class) {
                try {
                    if (h == null) {
                        h = new y0(u0.a(context), sentryAndroidOptions);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    @Nullable
    public static Boolean r(@NotNull Intent intent, @NotNull SentryOptions sentryOptions) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            sentryOptions.getLogger().a(SentryLevel.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    @NotNull
    public Device a(boolean z, boolean z2) {
        Device device = new Device();
        if (this.f21615b.isSendDefaultPii()) {
            device.g0(u0.e(this.f21614a));
        }
        device.c0(Build.MANUFACTURER);
        device.Q(Build.BRAND);
        device.V(u0.g(this.f21615b.getLogger()));
        device.e0(Build.MODEL);
        device.f0(Build.ID);
        device.M(u0.d(this.c));
        device.i0(k());
        Boolean bool = this.d;
        if (bool != null) {
            device.p0(bool);
        }
        DisplayMetrics displayMetricsF = u0.f(this.f21614a, this.f21615b.getLogger());
        if (displayMetricsF != null) {
            device.o0(Integer.valueOf(displayMetricsF.widthPixels));
            device.n0(Integer.valueOf(displayMetricsF.heightPixels));
            device.l0(Float.valueOf(displayMetricsF.density));
            device.m0(Integer.valueOf(displayMetricsF.densityDpi));
        }
        device.P(e());
        device.r0(m());
        if (device.J() == null) {
            device.Y(f());
        }
        Locale locale = Locale.getDefault();
        if (device.K() == null) {
            device.Z(locale.getLanguage());
        }
        if (device.L() == null) {
            device.a0(locale.toString());
        }
        List<Integer> listC = io.sentry.android.core.internal.util.f.a().c();
        if (!listC.isEmpty()) {
            device.k0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            device.j0(Integer.valueOf(listC.size()));
        }
        device.d0(this.g);
        if (z && this.f21615b.isCollectAdditionalContext()) {
            u(device, z2);
        }
        return device;
    }

    @Nullable
    public final Intent b() {
        return u0.p(this.f21614a, this.c, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    @Nullable
    public final Float d(@NotNull Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th) {
            this.f21615b.getLogger().a(SentryLevel.ERROR, "Error getting battery temperature.", th);
            return null;
        }
    }

    @Nullable
    public final Date e() {
        try {
            return yq5.d(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e) {
            this.f21615b.getLogger().b(SentryLevel.ERROR, e, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    @Nullable
    public final String f() {
        try {
            return d1.a(this.f21614a);
        } catch (Throwable th) {
            this.f21615b.getLogger().a(SentryLevel.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    @Nullable
    public final File g(@Nullable File file) {
        File[] externalFilesDirs = this.f21614a.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.f21615b.getLogger().c(SentryLevel.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    @Nullable
    public final StatFs h(@Nullable File file) {
        if (s()) {
            this.f21615b.getLogger().c(SentryLevel.INFO, "External storage is not mounted or emulated.", new Object[0]);
            return null;
        }
        File fileG = g(file);
        if (fileG != null) {
            return new StatFs(fileG.getPath());
        }
        this.f21615b.getLogger().c(SentryLevel.INFO, "Not possible to read external files directory", new Object[0]);
        return null;
    }

    @NotNull
    public io.sentry.protocol.j j() {
        return this.f;
    }

    @Nullable
    public final Device.DeviceOrientation k() {
        Device.DeviceOrientation deviceOrientationA;
        Throwable th;
        try {
            deviceOrientationA = io.sentry.android.core.internal.util.h.a(this.f21614a.getResources().getConfiguration().orientation);
            if (deviceOrientationA == null) {
                try {
                    this.f21615b.getLogger().c(SentryLevel.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    this.f21615b.getLogger().a(SentryLevel.ERROR, "Error getting device orientation.", th);
                    return deviceOrientationA;
                }
            }
        } catch (Throwable th3) {
            deviceOrientationA = null;
            th = th3;
        }
        return deviceOrientationA;
    }

    @Nullable
    public u0.a l() {
        return this.e;
    }

    @NotNull
    public final TimeZone m() {
        if (this.c.d() >= 24) {
            LocaleList locales = this.f21614a.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    @Nullable
    public final Long n(@NotNull StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f21615b.getLogger().a(SentryLevel.ERROR, "Error getting total external storage amount.", th);
            return null;
        }
    }

    @Nullable
    public final Long o(@NotNull StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f21615b.getLogger().a(SentryLevel.ERROR, "Error getting total internal storage amount.", th);
            return null;
        }
    }

    @Nullable
    public final Long p(@NotNull StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f21615b.getLogger().a(SentryLevel.ERROR, "Error getting unused external storage amount.", th);
            return null;
        }
    }

    @Nullable
    public final Long q(@NotNull StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.f21615b.getLogger().a(SentryLevel.ERROR, "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    public final boolean s() {
        String externalStorageState = Environment.getExternalStorageState();
        return ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated();
    }

    @NotNull
    public io.sentry.protocol.j t() {
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        jVar.j(YRNConstants.PLATFORM);
        jVar.m(Build.VERSION.RELEASE);
        jVar.h(Build.DISPLAY);
        String strH = u0.h(this.f21615b.getLogger());
        if (strH != null) {
            jVar.i(strH);
        }
        if (this.f21615b.isEnableRootCheck()) {
            jVar.k(Boolean.valueOf(new io.sentry.android.core.internal.util.m(this.f21614a, this.c, this.f21615b.getLogger()).e()));
        }
        return jVar;
    }

    public final void u(@NotNull Device device, boolean z) {
        Boolean bool;
        Intent intentB = b();
        if (intentB != null) {
            device.N(c(intentB, this.f21615b));
            device.R(r(intentB, this.f21615b));
            device.O(d(intentB));
        }
        int i = a.f21616a[this.f21615b.getConnectionStatusProvider().b().ordinal()];
        if (i != 1) {
            bool = i != 2 ? null : Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        device.h0(bool);
        ActivityManager.MemoryInfo memoryInfoI = u0.i(this.f21614a, this.f21615b.getLogger());
        if (memoryInfoI != null && z) {
            device.W(Long.valueOf(memoryInfoI.availMem));
            device.b0(Boolean.valueOf(memoryInfoI.lowMemory));
        }
        File externalFilesDir = this.f21614a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            device.q0(o(statFs));
            device.X(q(statFs));
        }
        StatFs statFsH = h(externalFilesDir);
        if (statFsH != null) {
            device.U(n(statFsH));
            device.T(p(statFsH));
        }
        if (device.I() == null) {
            device.S(this.f21615b.getConnectionStatusProvider().a());
        }
    }
}
