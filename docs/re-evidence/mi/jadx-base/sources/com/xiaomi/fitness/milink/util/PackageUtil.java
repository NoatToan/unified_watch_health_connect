package com.xiaomi.fitness.milink.util;

import android.content.pm.PackageInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/milink/util/PackageUtil;", "", "<init>", "()V", "PACKAGE_NAME_MILINK", "", "SUPPORT_VERSION_MILINK", "", "PACKAGE_NAME_MIUIPLUS", "SUPPORT_VERSION_MIUIPLUS", "PACKAGE_NAME_IDM", "SUPPORT_VERSION_IDM", "checkIfMilinkAppSupport", "", "checkIfMIUIPlusSupport", "checkIfIDMSupport", "TAG", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PackageUtil {

    @NotNull
    public static final PackageUtil INSTANCE = new PackageUtil();

    @NotNull
    private static final String PACKAGE_NAME_IDM = "com.xiaomi.mi_connect_service";

    @NotNull
    private static final String PACKAGE_NAME_MILINK = "com.milink.service";

    @NotNull
    private static final String PACKAGE_NAME_MIUIPLUS = "com.xiaomi.mirror";
    private static final int SUPPORT_VERSION_IDM = 40;
    private static final int SUPPORT_VERSION_MILINK = 13200000;
    private static final int SUPPORT_VERSION_MIUIPLUS = 30600;

    @NotNull
    private static final String TAG = "MilinkHelper_PackageUtil";

    private PackageUtil() {
    }

    public final boolean checkIfIDMSupport() {
        try {
            PackageInfo packageInfo = ApplicationExtKt.getApplication().getPackageManager().getPackageInfo("com.xiaomi.mi_connect_service", 0);
            Logger.i(TAG, "get idm version code: " + (packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : null));
            return packageInfo != null && packageInfo.versionCode >= 40;
        } catch (Exception unused) {
            Logger.e(TAG, "get idm version code fail");
            return false;
        }
    }

    public final boolean checkIfMIUIPlusSupport() {
        try {
            PackageInfo packageInfo = ApplicationExtKt.getApplication().getPackageManager().getPackageInfo(PACKAGE_NAME_MIUIPLUS, 0);
            Logger.i(TAG, "get miui plus version code: " + (packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : null));
            return packageInfo != null && packageInfo.versionCode >= SUPPORT_VERSION_MIUIPLUS;
        } catch (Exception unused) {
            Logger.e(TAG, "get miui plus version code fail");
            return false;
        }
    }

    public final boolean checkIfMilinkAppSupport() {
        try {
            PackageInfo packageInfo = ApplicationExtKt.getApplication().getPackageManager().getPackageInfo("com.milink.service", 0);
            Logger.i(TAG, "get milink version code: " + (packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : null));
            return packageInfo != null && packageInfo.versionCode >= SUPPORT_VERSION_MILINK;
        } catch (Exception unused) {
            Logger.e(TAG, "get milink version code fail");
            return false;
        }
    }
}
