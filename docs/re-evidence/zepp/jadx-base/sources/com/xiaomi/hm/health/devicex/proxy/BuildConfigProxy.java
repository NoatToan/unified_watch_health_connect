package com.xiaomi.hm.health.devicex.proxy;

import com.facebook.appevents.UserDataStore;
import com.huami.ai.speech.simplify.alexa.language.AlexaLanguageUtilsKt;
import com.huami.devicex.injection.BuildConfigApi;
import com.xiaomi.hm.health.BuildConfig;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b)\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\n\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\bJ\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\bH\u0016J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\bH\u0016J\b\u0010%\u001a\u00020\bH\u0016J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010'\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020\bH\u0016J\b\u0010)\u001a\u00020\bH\u0016J\b\u0010*\u001a\u00020\bH\u0016J\b\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020\bH\u0016J\b\u0010-\u001a\u00020\bH\u0016J\b\u0010.\u001a\u00020\bH\u0016¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/BuildConfigProxy;", "Lcom/huami/devicex/injection/BuildConfigApi;", "", "key", "b", "", "a", "Lkotlin/Function0;", "", UserDataStore.FIRST_NAME, "c", "isDebug", "isSupportCloudFwUpgrade", "isSupportNewAuth", "isSupportDebug", "isForceMedicalDevice", "isForceMedicalCollectDevice", "isMiAIProductionEnv", "isSpeechVoiceSave", "isSupportAlexaMultiLanguage", "isSupportBindFitBit", "isSupportChopinBehaviorTag", "isSupportChopinSetTestTime", "isSupportEcgExportRawData", "isSupportHrAlertTestRange", "isSupportMiliSleepHr", "isSupportNoBlockDpui", "isSupportOsaDisplay", "isSupportShowBuilderNumber", "isSupportWristTemperature", "supportNewBindApi", "getFlavorProduction", "getFlavorChannel", "getApplicationId", "isSupportVienna", "isSupportAndes", "isSupportTeide", "isSupportCrater", "isSupportBled", "isSupportBloodPressure", "isSupportCannes", "isSupportSofia", "isSupportLNL", "isSupportLeiden", "isSupportBindLullaby", "isSupportProvence", "isSupportBari", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BuildConfigProxy implements BuildConfigApi {
    private final int a(String key) {
        if (Intrinsics.areEqual(key, "VERSION_CODE")) {
            return BuildConfig.VERSION_CODE;
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0085 A[ORIG_RETURN, RETURN] */
    private final String b(String key) {
        switch (key) {
            case "VERSION_NAME":
                return BuildConfig.VERSION_NAME;
            case "appExpiredDate":
                return BuildConfig.appExpiredDate;
            case "BUILD_BRANCH":
                return BuildConfig.BUILD_BRANCH;
            case "BUILD_DATE":
                return BuildConfig.BUILD_DATE;
            case "BUILD_TYPE":
                return "release";
            case "BUILD_LAST_COMMIT":
                return BuildConfig.BUILD_LAST_COMMIT;
            case "RELIVE_THIRD_NAME":
                return BuildConfig.RELIVE_THIRD_NAME;
            case "RELIVE_CLIENT_ID":
                return BuildConfig.RELIVE_CLIENT_ID;
            case "BUILDER_NUMBER":
                return BuildConfig.BUILDER_NUMBER;
            case "FLAVOR":
                return BuildConfig.FLAVOR;
            default:
                return "";
        }
    }

    private final boolean c(Function0<Boolean> fn) {
        return fn.invoke().booleanValue();
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    @NotNull
    public String getApplicationId() {
        return "com.huami.watch.hmwatchmanager";
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    @NotNull
    public String getFlavorChannel() {
        return "play";
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    @NotNull
    public String getFlavorProduction() {
        return "midong";
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isDebug() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isForceMedicalCollectDevice() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isForceMedicalDevice() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isMiAIProductionEnv() {
        return true;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSpeechVoiceSave() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportAlexaMultiLanguage() {
        return AlexaLanguageUtilsKt.supportAlexaMultilingual();
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportAndes() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportBari() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportBindFitBit() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportBindLullaby() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportBled() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportBloodPressure() {
        return true;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportCannes() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportChopinBehaviorTag() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportChopinSetTestTime() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportCloudFwUpgrade() {
        return HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportCrater() {
        return true;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportDebug() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportEcgExportRawData() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportHrAlertTestRange() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportLNL() {
        return true;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportLeiden() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportMiliSleepHr() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportNewAuth() {
        return true;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportNoBlockDpui() {
        return true;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportOsaDisplay() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportProvence() {
        return true;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportShowBuilderNumber() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportSofia() {
        return true;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportTeide() {
        return true;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportVienna() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean isSupportWristTemperature() {
        return false;
    }

    @Override // com.huami.devicex.injection.BuildConfigApi
    public boolean supportNewBindApi() {
        return true;
    }
}
