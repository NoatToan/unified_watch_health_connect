package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class u0 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f21596b;

        public a(boolean z, @Nullable String str) {
            this.f21595a = z;
            this.f21596b = str;
        }

        @NotNull
        public Map<String, String> a() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.f21595a));
            String str = this.f21596b;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }
    }

    @NotNull
    public static Context a(@NotNull Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public static ApplicationInfo b(@NotNull Context context, long j, @NotNull r0 r0Var) throws PackageManager.NameNotFoundException {
        return r0Var.d() >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(j)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
    }

    @Nullable
    public static String c(@NotNull Context context, @NotNull ILogger iLogger) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i != 0) {
                return context.getString(i);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th) {
            iLogger.a(SentryLevel.ERROR, "Error getting application name.", th);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public static String[] d(@NotNull r0 r0Var) {
        return r0Var.d() >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    @Nullable
    public static String e(@NotNull Context context) {
        return Settings.Global.getString(context.getContentResolver(), "device_name");
    }

    @Nullable
    public static DisplayMetrics f(@NotNull Context context, @NotNull ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            iLogger.a(SentryLevel.ERROR, "Error getting DisplayMetrics.", th);
            return null;
        }
    }

    @Nullable
    public static String g(@NotNull ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            iLogger.a(SentryLevel.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    @Nullable
    public static String h(@NotNull ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            iLogger.a(SentryLevel.ERROR, "Exception while attempting to read kernel information", e);
            return property;
        }
    }

    @Nullable
    public static ActivityManager.MemoryInfo i(@NotNull Context context, @NotNull ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.c(SentryLevel.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.a(SentryLevel.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public static PackageInfo j(@NotNull Context context, int i, @NotNull ILogger iLogger, @NotNull r0 r0Var) {
        try {
            return r0Var.d() >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (Throwable th) {
            iLogger.a(SentryLevel.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    @Nullable
    public static PackageInfo k(@NotNull Context context, @NotNull ILogger iLogger, @NotNull r0 r0Var) {
        return j(context, 0, iLogger, r0Var);
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public static String l(@NotNull PackageInfo packageInfo, @NotNull r0 r0Var) {
        return r0Var.d() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : m(packageInfo);
    }

    @NotNull
    public static String m(@NotNull PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    @ApiStatus.Internal
    public static boolean n() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Nullable
    public static Intent o(@NotNull Context context, @NotNull SentryOptions sentryOptions, @Nullable BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter) {
        return p(context, new r0(sentryOptions.getLogger()), broadcastReceiver, intentFilter);
    }

    @SuppressLint({"NewApi", "UnspecifiedRegisterReceiverFlag"})
    @Nullable
    public static Intent p(@NotNull Context context, @NotNull r0 r0Var, @Nullable BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter) {
        return r0Var.d() >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    @Nullable
    public static a q(@NotNull Context context, @NotNull ILogger iLogger, @NotNull r0 r0Var) {
        String str;
        try {
            PackageInfo packageInfoK = k(context, iLogger, r0Var);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoK != null && packageManager != null) {
                str = packageInfoK.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new a(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.c(SentryLevel.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    public static void r(@NotNull PackageInfo packageInfo, @NotNull r0 r0Var, @NotNull io.sentry.protocol.a aVar) {
        aVar.m(packageInfo.packageName);
        aVar.p(packageInfo.versionName);
        aVar.l(l(packageInfo, r0Var));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        aVar.r(map);
    }
}
