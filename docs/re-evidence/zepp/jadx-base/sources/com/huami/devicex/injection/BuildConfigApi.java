package com.huami.devicex.injection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0002H&J\b\u0010\r\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u0002H&J\b\u0010\u000f\u001a\u00020\u0002H&J\b\u0010\u0010\u001a\u00020\u0002H&J\b\u0010\u0011\u001a\u00020\u0002H&J\b\u0010\u0012\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\u0002H&J\b\u0010\u0014\u001a\u00020\u0002H&J\b\u0010\u0015\u001a\u00020\u0002H&J\b\u0010\u0016\u001a\u00020\u0002H&J\b\u0010\u0018\u001a\u00020\u0017H&J\b\u0010\u0019\u001a\u00020\u0017H&J\b\u0010\u001a\u001a\u00020\u0017H&J\b\u0010\u001b\u001a\u00020\u0002H&J\b\u0010\u001c\u001a\u00020\u0002H&J\b\u0010\u001d\u001a\u00020\u0002H&J\b\u0010\u001e\u001a\u00020\u0002H&J\b\u0010\u001f\u001a\u00020\u0002H&J\b\u0010 \u001a\u00020\u0002H&J\b\u0010!\u001a\u00020\u0002H&J\b\u0010\"\u001a\u00020\u0002H&J\b\u0010#\u001a\u00020\u0002H&J\b\u0010$\u001a\u00020\u0002H&J\b\u0010%\u001a\u00020\u0002H&J\b\u0010&\u001a\u00020\u0002H&J\b\u0010'\u001a\u00020\u0002H&¨\u0006("}, d2 = {"Lcom/huami/devicex/injection/BuildConfigApi;", "", "", "supportNewBindApi", "isDebug", "isSupportCloudFwUpgrade", "isSupportNewAuth", "isSupportDebug", "isForceMedicalDevice", "isForceMedicalCollectDevice", "isMiAIProductionEnv", "isSpeechVoiceSave", "isSupportAlexaMultiLanguage", "isSupportBindFitBit", "isSupportChopinBehaviorTag", "isSupportChopinSetTestTime", "isSupportEcgExportRawData", "isSupportHrAlertTestRange", "isSupportMiliSleepHr", "isSupportNoBlockDpui", "isSupportOsaDisplay", "isSupportShowBuilderNumber", "isSupportWristTemperature", "", "getFlavorProduction", "getFlavorChannel", "getApplicationId", "isSupportVienna", "isSupportAndes", "isSupportTeide", "isSupportCrater", "isSupportBled", "isSupportCannes", "isSupportBloodPressure", "isSupportSofia", "isSupportLNL", "isSupportProvence", "isSupportBari", "isSupportBindLullaby", "isSupportLeiden", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface BuildConfigApi {
    @NotNull
    String getApplicationId();

    @NotNull
    String getFlavorChannel();

    @NotNull
    String getFlavorProduction();

    boolean isDebug();

    boolean isForceMedicalCollectDevice();

    boolean isForceMedicalDevice();

    boolean isMiAIProductionEnv();

    boolean isSpeechVoiceSave();

    boolean isSupportAlexaMultiLanguage();

    boolean isSupportAndes();

    boolean isSupportBari();

    boolean isSupportBindFitBit();

    boolean isSupportBindLullaby();

    boolean isSupportBled();

    boolean isSupportBloodPressure();

    boolean isSupportCannes();

    boolean isSupportChopinBehaviorTag();

    boolean isSupportChopinSetTestTime();

    boolean isSupportCloudFwUpgrade();

    boolean isSupportCrater();

    boolean isSupportDebug();

    boolean isSupportEcgExportRawData();

    boolean isSupportHrAlertTestRange();

    boolean isSupportLNL();

    boolean isSupportLeiden();

    boolean isSupportMiliSleepHr();

    boolean isSupportNewAuth();

    boolean isSupportNoBlockDpui();

    boolean isSupportOsaDisplay();

    boolean isSupportProvence();

    boolean isSupportShowBuilderNumber();

    boolean isSupportSofia();

    boolean isSupportTeide();

    boolean isSupportVienna();

    boolean isSupportWristTemperature();

    boolean supportNewBindApi();
}
