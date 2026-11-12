package com.xiaomi.fitness.common.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.onetrack.c.q;
import defpackage.rzi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0007J\u0006\u0010\u001e\u001a\u00020\u000fJ\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/common/utils/MarketUtil;", "", "<init>", "()V", "XIAOMI_MARKET_PACKAGE", "", "WEAROS_PAKAGENAME", "getWEAROS_PAKAGENAME", "()Ljava/lang/String;", "setWEAROS_PAKAGENAME", "(Ljava/lang/String;)V", "WEAROS_START_ACTION", "getWEAROS_START_ACTION", "setWEAROS_START_ACTION", "launchAppDetail", "", "context", "Landroid/content/Context;", "appPkg", "launchAppDetailForWearOs", "", "goToSamsungMarket", "packageName", "goToSonyMarket", q.f13858b, "getWearOsPackageInfo", "Landroid/content/pm/PackageInfo;", "getPackageInfo", Constants.KEY_PACKAGE_NAME, "checkAppInstalled", "startWearOsApp", "openAppInMarket", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MarketUtil {

    @NotNull
    public static final MarketUtil INSTANCE = new MarketUtil();

    @NotNull
    private static String WEAROS_PAKAGENAME = "com.google.android.wearable.app.cn";

    @NotNull
    private static String WEAROS_START_ACTION = "com.android.setupwizard.PARTNER_SETUP";

    @NotNull
    public static final String XIAOMI_MARKET_PACKAGE = "com.xiaomi.market";

    private MarketUtil() {
    }

    @JvmStatic
    public static final boolean checkAppInstalled(@NotNull Context context, @Nullable String pkgName) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        if (pkgName == null || pkgName.length() == 0) {
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(pkgName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    private final boolean goToSamsungMarket(Context context, String packageName) {
        Uri uri = Uri.parse("http://www.samsungapps.com/appquery/appDetail.as?appId=" + packageName);
        Intent intent = new Intent();
        intent.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.Main");
        intent.setData(uri);
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    private final boolean goToSonyMarket(Context context, String appId) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://m.sonyselect.cn/" + appId));
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @JvmStatic
    public static final boolean launchAppDetail(@NotNull Context context, @NotNull String appPkg) {
        boolean zGoToSonyMarket;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appPkg, "appPkg");
        if (TextUtils.isEmpty(appPkg)) {
            return true;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + appPkg));
            if (checkAppInstalled(context, "com.xiaomi.market")) {
                intent.setPackage("com.xiaomi.market");
            }
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            if (RomUtils.isSamSung()) {
                zGoToSonyMarket = INSTANCE.goToSamsungMarket(context, appPkg);
            } else {
                zGoToSonyMarket = RomUtils.isSony() ? INSTANCE.goToSonyMarket(context, appPkg) : false;
            }
            return zGoToSonyMarket;
        }
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @Nullable String pkgName) {
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        try {
            Intrinsics.checkNotNull(pkgName);
            return packageManager.getPackageInfo(pkgName, 1);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @NotNull
    public final String getWEAROS_PAKAGENAME() {
        return WEAROS_PAKAGENAME;
    }

    @NotNull
    public final String getWEAROS_START_ACTION() {
        return WEAROS_START_ACTION;
    }

    @Nullable
    public final PackageInfo getWearOsPackageInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return context.getPackageManager().getPackageInfo(WEAROS_PAKAGENAME, 1);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void launchAppDetailForWearOs(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (launchAppDetail(context, WEAROS_PAKAGENAME)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + WEAROS_PAKAGENAME));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public final void openAppInMarket(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
            intent2.addFlags(268435456);
            try {
                context.startActivity(intent2);
            } catch (Exception unused2) {
                ToastUtil.INSTANCE.showToast(rzi.common_hint_unkonwn_error);
            }
        }
    }

    public final void setWEAROS_PAKAGENAME(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        WEAROS_PAKAGENAME = str;
    }

    public final void setWEAROS_START_ACTION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        WEAROS_START_ACTION = str;
    }

    public final boolean startWearOsApp() {
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setPackage(WEAROS_PAKAGENAME);
            intent.setAction(WEAROS_START_ACTION);
            AppUtil.getApp().startActivity(intent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
