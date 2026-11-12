package com.xiaomi.fitness.sport.route.detail.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001\u001a\u0006\u0010\t\u001a\u00020\u0005\u001a\u0006\u0010\n\u001a\u00020\u0005\u001a\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u001e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u001e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"BAIDU_MAP_PACKAGE_NAME", "", "GAODE_MAP_PACKAGE_NAME", "TENCENT_MAP_PACKAGE_NAME", "isAppInstalled", "", "context", "Landroid/content/Context;", "packageName", "isAMapInstalled", "isTencentMapInstalled", "isBaiduMapInstalled", "goToAMapApp", "", "destLat", "", "destLng", "goToBaiduMapApp", "goToTencentMapApp", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MapAppLaunchExtKt {

    @NotNull
    public static final String BAIDU_MAP_PACKAGE_NAME = "com.baidu.BaiduMap";

    @NotNull
    public static final String GAODE_MAP_PACKAGE_NAME = "com.autonavi.minimap";

    @NotNull
    public static final String TENCENT_MAP_PACKAGE_NAME = "com.tencent.map";

    public static final void goToAMapApp(@NotNull Context context, double d, double d2) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("amapuri://route/plan/?sourceApplication=MiFitness&dlat=" + d + "&dlon=" + d2 + "&dev=0&t=0")));
    }

    public static final void goToBaiduMapApp(@NotNull Context context, double d, double d2) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("baidumap://map/geocoder?location=" + d + "," + d2)));
    }

    public static final void goToTencentMapApp(@NotNull Context context, double d, double d2) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("qqmap://map/routeplan?type=drive&from=&fromcoord=&to=目的地&tocoord=" + d + "," + d2 + "&policy=0&referer=appName")));
    }

    public static final boolean isAMapInstalled() {
        return isAppInstalled(ApplicationExtKt.getApplication(), GAODE_MAP_PACKAGE_NAME);
    }

    public static final boolean isAppInstalled(@NotNull Context context, @NotNull String packageName) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static final boolean isBaiduMapInstalled() {
        return isAppInstalled(ApplicationExtKt.getApplication(), BAIDU_MAP_PACKAGE_NAME);
    }

    public static final boolean isTencentMapInstalled() {
        return isAppInstalled(ApplicationExtKt.getApplication(), TENCENT_MAP_PACKAGE_NAME);
    }
}
