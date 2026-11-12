package com.xiaomi.fitness.sport_eco.utils;

import com.xiaomi.fitness.common.log.Logger;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/utils/Constants;", "", "<init>", "()V", "HOST_OPERATION", "", "HOST_ECO_OPERATION", "getOperationHost", "getEcoOperationHost", "inStaging", "", "getKeepAliveHelpUrl", "locale", "model", "getUserGuide2Url", "getSmartSceneUrl", "getInsuranceUrl", "deviceId", "sku", "getBeltAdjustUrl", "getWatchAgreementUrl", "getUserGuideUrl", "getECoUserGuideUrl", "getEcoUserAgreementByType", "type", "getEcoPrivacyPolicyUrlByType", "getEcoUserAgreementType", "getEcoPrivacyPolicyType", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Constants {

    @NotNull
    private static final String HOST_ECO_OPERATION = "https://res.eco.mi.com";

    @NotNull
    private static final String HOST_OPERATION = "https://watch.iot.mi.com";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    private Constants() {
    }

    private final String getEcoOperationHost() {
        ServiceHelper serviceHelper = ServiceHelper.INSTANCE;
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strConvertWearToEcoRegion = serviceHelper.convertWearToEcoRegion(lowerCase);
        Logger.i("Constants", "getEcoOperationHost: region = " + strConvertWearToEcoRegion);
        if (Intrinsics.areEqual(strConvertWearToEcoRegion, "cn")) {
            return "https://res.eco.mi.com";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(ServiceHelper.HOST_ECO_OPERATION_PLAY, Arrays.copyOf(new Object[]{strConvertWearToEcoRegion + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final String getOperationHost() {
        return "https://watch.iot.mi.com";
    }

    private final boolean inStaging() {
        return false;
    }

    @Nullable
    public final String getBeltAdjustUrl(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/treadmill-guide/index.html?model=%s&type=adjustment&locale=%s", Arrays.copyOf(new Object[]{getEcoOperationHost(), model, locale}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getECoUserGuideUrl(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/user-guide/index.html?locale=%s&model=%s", Arrays.copyOf(new Object[]{getEcoOperationHost(), locale, model}, 3));
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
    public final String getEcoPrivacyPolicyType() {
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
    public final String getEcoPrivacyPolicyUrlByType(@NotNull String type, @NotNull String model) {
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
    public final String getEcoUserAgreementByType(@NotNull String type, @NotNull String model) {
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
    public final String getEcoUserAgreementType() {
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

    @Nullable
    public final String getInsuranceUrl(@NotNull String deviceId, @NotNull String sku) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(sku, "sku");
        String sHA1Digest = StringUtils.INSTANCE.getSHA1Digest("deviceId=" + deviceId + "&key=Eru45nONAuUIHMLBZZyelgmAWRMnAxv41nxmiWCR1SpMqnqODhrLLKfj8CcZsqoD&partnerName=MiWear&sku=" + sku);
        String str = inStaging() ? "http://api.staging.miinsurtech.com" : "https://api.miinsurtech.com";
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%s/v1/insurance/device?from=local&partnerName=%s&sku=%s&deviceId=%s&sign=%s", Arrays.copyOf(new Object[]{str, "MiWear", sku, deviceId, sHA1Digest}, 5));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @NotNull
    public final String getKeepAliveHelpUrl(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/permission_settings_run_in_background/index.html?locale=%s&model=%s", Arrays.copyOf(new Object[]{getEcoOperationHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getSmartSceneUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/treadmill-guide/index.html?type=scene&locale=%s", Arrays.copyOf(new Object[]{getOperationHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getUserGuide2Url(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/user-guide/index.html?locale=%s&model=%s", Arrays.copyOf(new Object[]{getEcoOperationHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getUserGuideUrl(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/guidance/index.html?model=%s&locale=%s", Arrays.copyOf(new Object[]{getEcoOperationHost(), model, locale}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getWatchAgreementUrl(@NotNull String locale, @NotNull String model) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(model, "model");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/privacy/index.html?locale=%s&type=watch_privacy_policy&model=%s", Arrays.copyOf(new Object[]{getOperationHost(), locale, model}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
