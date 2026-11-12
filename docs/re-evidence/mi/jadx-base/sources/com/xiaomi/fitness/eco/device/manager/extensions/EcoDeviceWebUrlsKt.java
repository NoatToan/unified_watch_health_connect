package com.xiaomi.fitness.eco.device.manager.extensions;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sport_eco_manager_export.EcoLocaleUtil;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.sport_manager_export.ServiceHelper;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\b\u0010\t\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0006\u0010\f\u001a\u00020\u0001\u001a\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\u0013\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0016\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0016\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0006\u0010\u0018\u001a\u00020\u0001\u001a\u000e\u0010\u0019\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"HOST_OPERATION", "", "MIWEAR_HOST_OPERATION", "TAG", "HOST_ECO_OPERATION", "getHost", "getMiWearHost", "getMiWearAddDeviceFailedUrl", "model", "getEcoOperationHost", "getWatchAgreementUrl", "getUserGuideUrl", "getScanHelpUrl", "getConnectHelpUrl", "getPairingFailHelpUrl", "getBindFailHelpUrl", "getBindFailCommonHelpUrl", "getReconnectHelpUrl", "getPrivacyUserInfoUrl", "getPrivacyLocationUrl", "getEcoUserAgreementByType", "type", "getEcoPrivacyPolicyUrlByType", "getEcoUserAgreementType", "getEcoPrivacyPolicyType", "getEcoAgreementUrl", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceWebUrlsKt {

    @NotNull
    private static final String HOST_ECO_OPERATION = "https://res.eco.mi.com";

    @NotNull
    private static final String HOST_OPERATION = "https://res.eco.mi.com";

    @NotNull
    private static final String MIWEAR_HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String TAG = "EcoDeviceWebUrls";

    @NotNull
    public static final String getBindFailCommonHelpUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getMiWearAddDeviceFailedUrl(model);
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
    public static final String getEcoAgreementUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String ecoOperationHost = getEcoOperationHost();
        String currentLocale = LocaleUtil.getCurrentLocale();
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return ecoOperationHost + "/html/privacy/index.html?locale=" + currentLocale + "&type=sport_healthy_user_agreement&model=" + model + "&region=" + lowerCase;
    }

    private static final String getEcoOperationHost() {
        ServiceHelper serviceHelper = ServiceHelper.INSTANCE;
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strConvertWearToEcoRegion = serviceHelper.convertWearToEcoRegion(lowerCase);
        Logger.i(TAG, "getEcoOperationHost: region = " + strConvertWearToEcoRegion);
        if (Intrinsics.areEqual(strConvertWearToEcoRegion, "cn")) {
            return ServiceHelper.HOST_ECO_OPERATION;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(ServiceHelper.HOST_ECO_OPERATION_PLAY, Arrays.copyOf(new Object[]{strConvertWearToEcoRegion + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 int, still in use, count: 2, list:
      (r1v0 int) from 0x000d: IF  (r1v0 int) == (-1798122615 int)  -> B:20:0x003c A[HIDDEN]
      (r1v0 int) from 0x0012: IF  (r1v0 int) == (-1454035281 int)  -> B:17:0x0033 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    @NotNull
    public static final String getEcoPrivacyPolicyType() {
        String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        if (iHashCode == -1798122615) {
            if (key_gym_local_sport_type.equals("yesoul.exbike.jsc01y")) {
                return "sport_healthy_privacy_policy";
            }
            return "";
        }
        if (iHashCode == -1454035281) {
            if (key_gym_local_sport_type.equals("runmi.exbike.jscrm1")) {
                return "sport_healthy_privacy_policy";
            }
            return "";
        }
        switch (key_gym_local_sport_type) {
            case "yunmai.jmprope.sr803":
            case "yunmai.jmprope.sr804":
            case "yunmai.jmprope.sr805":
                return "sport_healthy_privacy_policy";
            default:
                return "";
        }
    }

    @NotNull
    public static final String getEcoPrivacyPolicyUrlByType(@NotNull String type, @NotNull String model) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(model, "model");
        String ecoOperationHost = getEcoOperationHost();
        String currentLocale = EcoLocaleUtil.getCurrentLocale();
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
        String currentLocale = EcoLocaleUtil.getCurrentLocale();
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return ecoOperationHost + "/html/privacy/index.html?type=" + type + "&model=" + model + "&locale=" + currentLocale + "&region=" + lowerCase;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 int, still in use, count: 2, list:
      (r1v0 int) from 0x000d: IF  (r1v0 int) == (-1798122615 int)  -> B:20:0x003c A[HIDDEN]
      (r1v0 int) from 0x0012: IF  (r1v0 int) == (-1454035281 int)  -> B:17:0x0033 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    @NotNull
    public static final String getEcoUserAgreementType() {
        String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        if (iHashCode == -1798122615) {
            if (key_gym_local_sport_type.equals("yesoul.exbike.jsc01y")) {
                return "sport_healthy_user_agreement";
            }
            return "";
        }
        if (iHashCode == -1454035281) {
            if (key_gym_local_sport_type.equals("runmi.exbike.jscrm1")) {
                return "sport_healthy_user_agreement";
            }
            return "";
        }
        switch (key_gym_local_sport_type) {
            case "yunmai.jmprope.sr803":
            case "yunmai.jmprope.sr804":
            case "yunmai.jmprope.sr805":
                return "sport_healthy_user_agreement";
            default:
                return "";
        }
    }

    private static final String getHost() {
        return ServiceHelper.HOST_ECO_OPERATION;
    }

    @NotNull
    public static final String getMiWearAddDeviceFailedUrl(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getMiWearHost() + "/html/add_device_failed/index.html?model=" + model + "&locale=" + LocaleUtil.getCurrentLocale();
    }

    private static final String getMiWearHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Logger.i(TAG, "getHost: region = " + lowerCase);
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(MIWEAR_HOST_OPERATION, Arrays.copyOf(new Object[]{""}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(MIWEAR_HOST_OPERATION, Arrays.copyOf(new Object[]{lowerCase + "."}, 1));
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
