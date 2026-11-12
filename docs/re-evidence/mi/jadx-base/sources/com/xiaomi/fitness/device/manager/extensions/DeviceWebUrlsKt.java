package com.xiaomi.fitness.device.manager.extensions;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sport_manager_export.ServiceHelper;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0016\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0006\u0010\f\u001a\u00020\u0001\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u0013\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u0014\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u0015\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0006\u0010\u0016\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"HOST_OPERATION", "", "TAG", "HOST_ECO_OPERATION", "getEcoOperationHost", "getHost", "getEcoUserAgreementByType", "type", "model", "getEcoPrivacyPolicyUrlByType", "getWatchAgreementUrl", "getUserGuideUrl", "getScanHelpUrl", "getBikeScanHelpUrl", "getConnectHelpUrl", "getPairingFailHelpUrl", "getBindFailHelpUrl", "getReconnectHelpUrl", "getPrivacyUserInfoUrl", "getPrivacyLocationUrl", "getDevicePrivacyUrl", "getDeviceLicenseUrl", "getBindBloodSugarHelpUrl", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceWebUrlsKt {

    @NotNull
    private static final String HOST_ECO_OPERATION = "https://res.eco.mi.com";

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String TAG = "DeviceWebUrls";

    @NotNull
    public static final String getBikeScanHelpUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getHost() + "/html/user-guide/index.html?locale=" + LocaleUtil.getCurrentLocale() + "&model=" + model + "#/scan_failed.md";
    }

    @NotNull
    public static final String getBindBloodSugarHelpUrl() {
        return "https://watch.iot.mi.com/html/user-guide/index.html?model=synaps.watch.m8&user-guide-version=user-guide-v3#/";
    }

    @NotNull
    public static final String getBindFailHelpUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getHost() + "/html/match_successful_but_failed_to_bind_account/index.html?locale=" + LocaleUtil.getCurrentLocale() + "&model=" + model;
    }

    @NotNull
    public static final String getConnectHelpUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getHost() + "/html/device_found_but_connection_failed/index.html?locale=" + LocaleUtil.getCurrentLocale() + "&model=" + model;
    }

    @NotNull
    public static final String getDeviceLicenseUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String host = getHost();
        String currentLocale = LocaleUtil.getCurrentLocale();
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return host + "/html/privacy/index.html?locale=" + currentLocale + "&type=watch_user_license_v3&model=" + model + "&region=" + lowerCase;
    }

    @NotNull
    public static final String getDevicePrivacyUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String host = getHost();
        String currentLocale = LocaleUtil.getCurrentLocale();
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return host + "/html/privacy/index.html?locale=" + currentLocale + "&type=watch_privacy_policy&model=" + model + "&region=" + lowerCase;
    }

    private static final String getEcoOperationHost() {
        ServiceHelper serviceHelper = ServiceHelper.INSTANCE;
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strConvertWearToEcoRegion = serviceHelper.convertWearToEcoRegion(lowerCase);
        Logger.i(TAG, "getEcoOperationHost: region = " + strConvertWearToEcoRegion);
        if (Intrinsics.areEqual(strConvertWearToEcoRegion, "cn")) {
            return "https://res.eco.mi.com";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(ServiceHelper.HOST_ECO_OPERATION_PLAY, Arrays.copyOf(new Object[]{strConvertWearToEcoRegion + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public static final String getEcoPrivacyPolicyUrlByType(@NotNull String type, @NotNull String model) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(model, "model");
        String ecoOperationHost = getEcoOperationHost();
        String currentLocale = LocaleUtil.getCurrentLocale();
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return ecoOperationHost + "/html/privacy/index.html?type=" + type + "&model=" + model + "&locale=" + currentLocale + "&region=" + lowerCase;
    }

    @NotNull
    public static final String getEcoUserAgreementByType(@NotNull String type, @NotNull String model) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(model, "model");
        String ecoOperationHost = getEcoOperationHost();
        String currentLocale = LocaleUtil.getCurrentLocale();
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return ecoOperationHost + "/html/privacy/index.html?type=" + type + "&model=" + model + "&locale=" + currentLocale + "&region=" + lowerCase;
    }

    private static final String getHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Logger.i(TAG, "getHost: region = " + lowerCase);
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

    @NotNull
    public static final String getPairingFailHelpUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getHost() + "/html/connection_successful_but_pairing_failed/index.html?locale=" + LocaleUtil.getCurrentLocale() + "&model=" + model;
    }

    @NotNull
    public static final String getPrivacyLocationUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getHost() + "/html/privacy/index.html?locale=" + LocaleUtil.getCurrentLocale() + "&type=gps_privacy&model=" + model;
    }

    @NotNull
    public static final String getPrivacyUserInfoUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getHost() + "/html/privacy/index.html?locale=" + LocaleUtil.getCurrentLocale() + "&type=user_info_privacy&model=" + model;
    }

    @NotNull
    public static final String getReconnectHelpUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getHost() + "/html/device_could_not_be_reconnected_to_phone/index.html?locale=" + LocaleUtil.getCurrentLocale() + "&model=" + model;
    }

    @NotNull
    public static final String getScanHelpUrl() {
        return getHost() + "/html/connect_fail/index.html?locale=" + LocaleUtil.getCurrentLocale();
    }

    @NotNull
    public static final String getUserGuideUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getHost() + "/html/guidance/index.html?model=" + model + "&locale=" + LocaleUtil.getCurrentLocale();
    }

    @NotNull
    public static final String getWatchAgreementUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String host = getHost();
        String currentLocale = LocaleUtil.getCurrentLocale();
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return host + "/html/privacy/index.html?locale=" + currentLocale + "&type=watch_privacy_policy&model=" + model + "&region=" + lowerCase;
    }
}
