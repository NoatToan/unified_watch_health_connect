package com.xiaomi.fitness.devicesettings.utils;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.wzi;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\b\u0010\u0016\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/Constants;", "", "<init>", "()V", "FEATURE_MIUI_CLOCK_ALERT", "", "MODEL_L67", "goKeepAliveBrowserActivity", "", "needDeviceConnect", "", "goUserGuideBrowserActivity", "goOfflineMapActivity", "getUserGuide2Url", "locale", "model", "getOfflineMapUrl", "getKeepAliveHelpUrl", "getXiaoAiHelpUrl", "device", "getWatchAgreementUrl", "getWatchUserLicenceUrl", "getOperationHost", "HOST_OPERATION", "HOST_XIAOAI", "Sex", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Constants {

    @NotNull
    public static final String FEATURE_MIUI_CLOCK_ALERT = "miui_clock_alert";

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String HOST_XIAOAI = "https://land.xiaomi.net/mcfe/xiaoai-watch";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String MODEL_L67 = "hqbd3.watch.l67";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/Constants$Sex;", "", "<init>", "()V", "male", "", "femal", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sex {

        @NotNull
        public static final Sex INSTANCE = new Sex();

        @NotNull
        public static final String femal = "female";

        @NotNull
        public static final String male = "male";

        private Sex() {
        }
    }

    private Constants() {
    }

    private final String getKeepAliveHelpUrl(String locale, String model) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/permission_settings_run_in_background/index.html?locale=%s&model=%s", Arrays.copyOf(new Object[]{getOperationHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final String getOfflineMapUrl(String locale, String model) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/n62/index.html?type=offline_map&locale=%s", Arrays.copyOf(new Object[]{getOperationHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final String getOperationHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Logger.i("Constants", "getOperationHost: region = " + lowerCase);
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{""}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{lowerCase + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    private final String getUserGuide2Url(String locale, String model) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/user-guide/index.html?locale=%s&model=%s&user-guide-version=user-guide-v3", Arrays.copyOf(new Object[]{getOperationHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static /* synthetic */ void goKeepAliveBrowserActivity$default(Constants constants, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        constants.goKeepAliveBrowserActivity(z);
    }

    @NotNull
    public final String getWatchAgreementUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String operationHost = getOperationHost();
        String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = String.format("%s/html/privacy/index.html?locale=%s&type=watch_privacy_policy&model=%s&region=%s", Arrays.copyOf(new Object[]{operationHost, currentLocale$default, model, lowerCase}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getWatchUserLicenceUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/privacy/index.html?locale=%s&type=watch_user_license&model=%s", Arrays.copyOf(new Object[]{getOperationHost(), LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getXiaoAiHelpUrl(@NotNull String device) {
        Intrinsics.checkNotNullParameter(device, "device");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("https://land.xiaomi.net/mcfe/xiaoai-watch/#/skill?device=%s", Arrays.copyOf(new Object[]{device}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final void goKeepAliveBrowserActivity(boolean needDeviceConnect) {
        WearableDeviceInfo deviceInfo;
        WearableDeviceInfo deviceInfo2;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        String model = (wearableDeviceModel == null || (deviceInfo2 = wearableDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo2.getModel();
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        Boolean boolValueOf = (wearableDeviceModel2 == null || (deviceInfo = wearableDeviceModel2.getDeviceInfo()) == null) ? null : Boolean.valueOf(deviceInfo.isWatch());
        int i = wzi.s;
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            i = wzi.t;
        }
        WearableDeviceModel wearableDeviceModel3 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        Logger.i("Constants", "goKeepAliveBrowserActivity deviceInfo = " + (wearableDeviceModel3 != null ? wearableDeviceModel3.getDeviceInfo() : null) + " title = " + i);
        if (!needDeviceConnect) {
            WebViewUtilKt.startWebView$default(getKeepAliveHelpUrl(LocaleUtil.getCurrentLocale(), "app"), ResourceExtKt.getString(i), false, false, null, false, null, false, 252, null);
            return;
        }
        if (model != null) {
            WebViewUtilKt.startWebView$default(INSTANCE.getKeepAliveHelpUrl(LocaleUtil.getCurrentLocale(), model), ResourceExtKt.getString(i), false, false, null, false, null, false, 252, null);
        } else {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), wzi.u);
        }
    }

    public final void goOfflineMapActivity() {
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String model = (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getModel();
        if (model != null) {
            WebViewUtilKt.startWebView$default(INSTANCE.getOfflineMapUrl(LocaleUtil.getCurrentLocale(), model), ResourceExtKt.getString(wzi.X5), false, false, null, false, null, false, 252, null);
        } else {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), wzi.u);
        }
    }

    public final void goUserGuideBrowserActivity() {
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        String model = (wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getModel();
        if (model != null) {
            WebViewUtilKt.startWebView$default(INSTANCE.getUserGuide2Url(LocaleUtil.getCurrentLocale(), model), ResourceExtKt.getString(wzi.V8), false, false, null, false, null, false, 252, null);
        } else {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), wzi.u);
        }
    }
}
