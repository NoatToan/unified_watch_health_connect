package com.xiaomi.fitness.common.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/common/utils/AppVersionUtil;", "", "<init>", "()V", "TAG", "", "REGEX_FIRMWARE_VERSION_2", "sAppVersionName", "sAppVersionCode", "", "appVersionName", "getAppVersionName", "()Ljava/lang/String;", "appVersionCode", "getAppVersionCode", "()J", "getAppName", "context", "Landroid/content/Context;", "loadAppVersionInfo", "", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppVersionUtil {

    @NotNull
    private static final String REGEX_FIRMWARE_VERSION_2 = "^(\\d+).(\\d+).(\\d+)$";

    @NotNull
    private static final String TAG = "AppVersionUtils";
    private static long sAppVersionCode;

    @NotNull
    public static final AppVersionUtil INSTANCE = new AppVersionUtil();

    @Nullable
    private static String sAppVersionName = "";

    private AppVersionUtil() {
    }

    private final void loadAppVersionInfo() {
        try {
            Application app = AppUtil.getApp();
            PackageInfo packageInfo = app.getPackageManager().getPackageInfo(app.getPackageName(), 0);
            String str = packageInfo.versionName;
            if (str == null) {
                str = "";
            }
            sAppVersionName = str;
            sAppVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @NotNull
    public final String getAppName(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            return packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public final long getAppVersionCode() {
        if (TextUtils.isEmpty(sAppVersionName)) {
            loadAppVersionInfo();
        }
        return sAppVersionCode;
    }

    @NotNull
    public final String getAppVersionName() {
        if (TextUtils.isEmpty(sAppVersionName)) {
            loadAppVersionInfo();
        }
        String str = sAppVersionName;
        return str == null ? "" : str;
    }
}
