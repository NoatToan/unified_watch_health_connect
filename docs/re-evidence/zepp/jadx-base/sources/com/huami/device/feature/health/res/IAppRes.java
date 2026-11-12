package com.huami.device.feature.health.res;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bW\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0002H&J\b\u0010\r\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u0002H&J\b\u0010\u000f\u001a\u00020\u0002H&J\b\u0010\u0010\u001a\u00020\u0002H&J\b\u0010\u0011\u001a\u00020\u0002H&J\b\u0010\u0012\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\u0002H&J\b\u0010\u0014\u001a\u00020\u0002H&J\b\u0010\u0015\u001a\u00020\u0002H&J\b\u0010\u0016\u001a\u00020\u0002H&J\b\u0010\u0017\u001a\u00020\u0002H&J\b\u0010\u0018\u001a\u00020\u0002H&J\b\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001a\u001a\u00020\u0002H&J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H&J\b\u0010\u001d\u001a\u00020\u0002H&J\b\u0010\u001e\u001a\u00020\u0002H&J\b\u0010\u001f\u001a\u00020\u0002H&J\b\u0010 \u001a\u00020\u0002H&J\b\u0010!\u001a\u00020\u0002H&J\b\u0010\"\u001a\u00020\u0002H&J\b\u0010#\u001a\u00020\u0002H&J\b\u0010$\u001a\u00020\u0002H&J\b\u0010%\u001a\u00020\u0002H&J\b\u0010&\u001a\u00020\u0002H&J\b\u0010'\u001a\u00020\u0002H&J\b\u0010(\u001a\u00020\u0002H&J\b\u0010)\u001a\u00020\u0002H&J\b\u0010*\u001a\u00020\u0002H&J\b\u0010+\u001a\u00020\u0002H&J\b\u0010,\u001a\u00020\u0002H&J\b\u0010-\u001a\u00020\u0002H&J\b\u0010.\u001a\u00020\u0002H&J\b\u0010/\u001a\u00020\u0002H&J\b\u00100\u001a\u00020\u0002H&J\b\u00101\u001a\u00020\u0002H&J\b\u00102\u001a\u00020\u0002H&J\b\u00103\u001a\u00020\u0002H&J\b\u00104\u001a\u00020\u0002H&J\b\u00105\u001a\u00020\u0002H&J\b\u00106\u001a\u00020\u0002H&J\b\u00107\u001a\u00020\u0002H&J\b\u00108\u001a\u00020\u0002H&J\b\u00109\u001a\u00020\u0002H&J\b\u0010:\u001a\u00020\u0002H&J\b\u0010;\u001a\u00020\u0002H&J\b\u0010<\u001a\u00020\u0002H&J\b\u0010=\u001a\u00020\u0002H&J\b\u0010>\u001a\u00020\u0002H&J\b\u0010?\u001a\u00020\u0002H&J\b\u0010@\u001a\u00020\u0002H&J\b\u0010A\u001a\u00020\u0002H&J\b\u0010B\u001a\u00020\u0002H&J\b\u0010C\u001a\u00020\u0002H&J\b\u0010D\u001a\u00020\u0002H&J\b\u0010E\u001a\u00020\u0002H&J\b\u0010F\u001a\u00020\u0002H&J\b\u0010G\u001a\u00020\u0002H&J\b\u0010H\u001a\u00020\u0002H&J\b\u0010I\u001a\u00020\u0002H&J\b\u0010J\u001a\u00020\u0002H&J\b\u0010K\u001a\u00020\u0002H&J\b\u0010L\u001a\u00020\u0002H&J\b\u0010M\u001a\u00020\u0002H&J\b\u0010N\u001a\u00020\u0002H&J\b\u0010O\u001a\u00020\u0002H&J\b\u0010P\u001a\u00020\u0002H&J\b\u0010Q\u001a\u00020\u0002H&J\b\u0010R\u001a\u00020\u0002H&J\b\u0010S\u001a\u00020\u0002H&J\b\u0010T\u001a\u00020\u0002H&J\b\u0010U\u001a\u00020\u0002H&J\b\u0010V\u001a\u00020\u0002H&J\b\u0010W\u001a\u00020\u0002H&J\b\u0010X\u001a\u00020\u0002H&J\b\u0010Y\u001a\u00020\u0002H&J\b\u0010Z\u001a\u00020\u0002H&J\u0010\u0010\\\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\u0006H&J\b\u0010]\u001a\u00020\u0002H&J\u0014\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020^H&J\b\u0010`\u001a\u00020\u0002H&¨\u0006a"}, d2 = {"Lcom/huami/device/feature/health/res/IAppRes;", "", "", "getHealthDetectRes", "getKnowMoreRes", "getHrDetectAtrial", "", "minute", "getTimeFormatMinute", "times", "getHrWarnTimesFormat", "getHrDetectClose", "getHrNotAlertRes", "getHeartRateRes", "getAlldayHrSettingSummaryRes", "getAlldayHrSettingTitleRes", "getDeviceBatteryWarningTitle", "getHrFreqIncreaseWarningSummary", "getHrWarnSettingSummary", "getHrWarnSettingFreqSummary", "getHrWarnSettingTitle", "getHighHrWarnSettingTitle", "getLowHrWarningSettingTitle", "getHighHrWaringSettingEnableSummary", "getLowHrWaringSettingEnableSummary", "getHuamiOsHrWarningSettingDisableSummary", "getHuamiOsHrWarningSettingDisableAtrialSummary", "hrInterval", "getHrAlertFreqNotSupportWarning", "getHighLowHrAlertFreqNotSupportWarning", "getHighHrAlertFreqNotSupportWarning", "getLowHrAlertFreqNotSupportWarning", "getActivityHrSummary", "getActivityHrTitleRes", "getSleepRes", "getSleepSettingSummary", "getSleepAssistantTitle", "getSleepSpo2SummaryNoOsa", "getSleepSpo2NoOsa", "getPressureSummary", "getSleepSpo2WarningNoOsa", "getAtrialFibWarning", "getAtrialAlertSleepNotDisturbTitle", "getAtrialAlertSleepNotDisturbSummary", "getPressureDetect", "getPressureWarning", "getPressureAlertTitle", "getPressureAlertEnableSummary", "getPressureAlertDisableSummary", "getAlldayHrFreq", "getAlldayHrFreqTooLow", "getHrWarnValueSettingTitle", "getAtrialFib", "getHrAtrialFib", "getHrAtrialFibSummary", "getPressure", "getHrDetectMode", "getSportHr", "getHrBatteryTips", "getHrModeAuto", "getHrModeSleep", "getHrModeAutoSleep", "getHrModeAutoSummary", "getHrModeSleepSummary", "getHrModeAutoSleepSummary", "getHrModeAtrialSummary", "getHrModeAutoOrSleepWarning", "getHrModeAutoSleepWarning", "getClose", "getAlldayHr", "getAtrialFibMedical", "getAtrialFibSummaryMedical", "getSetFail", "getHrModeSummary", "getHrModeSummaryWatch", "getHrFreqSummary", "getHrFreq", "getSportHrTips", "getSportHrTipsWatch", "getHrWarnTips", "getHrWarnTipsWatch", "getHrModeAtrialWarning", "getBtnYes", "getBtnCancel", "getSpo2", "getSmartSpo2Title", "getSmartSpo2Summary", "getLowSpo2AlertTitle", "getLowSpo2AlertEnableSummary", "getLowSpo2AlertDisableSummary", "getSmartSpo2SetWarning", "percent", "getLowSpo2AlertValueFormat", "getSettingHeartrateDetectSelectTitle", "", "getSleepingBloodPressureMonitorStr", "getEnableRemWarningStr", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public interface IAppRes {
    @NotNull
    String getActivityHrSummary();

    @NotNull
    String getActivityHrTitleRes();

    @NotNull
    String getAlldayHr();

    @NotNull
    String getAlldayHrFreq();

    @NotNull
    String getAlldayHrFreqTooLow();

    @NotNull
    String getAlldayHrSettingSummaryRes();

    @NotNull
    String getAlldayHrSettingTitleRes();

    @NotNull
    String getAtrialAlertSleepNotDisturbSummary();

    @NotNull
    String getAtrialAlertSleepNotDisturbTitle();

    @NotNull
    String getAtrialFib();

    @NotNull
    String getAtrialFibMedical();

    @NotNull
    String getAtrialFibSummaryMedical();

    @NotNull
    String getAtrialFibWarning();

    @NotNull
    String getBtnCancel();

    @NotNull
    String getBtnYes();

    @NotNull
    String getClose();

    @NotNull
    String getDeviceBatteryWarningTitle();

    @NotNull
    String getEnableRemWarningStr();

    @NotNull
    String getHealthDetectRes();

    @NotNull
    String getHeartRateRes();

    @NotNull
    String getHighHrAlertFreqNotSupportWarning();

    @NotNull
    String getHighHrWaringSettingEnableSummary();

    @NotNull
    String getHighHrWarnSettingTitle();

    @NotNull
    String getHighLowHrAlertFreqNotSupportWarning();

    @NotNull
    String getHrAlertFreqNotSupportWarning(@NotNull String hrInterval);

    @NotNull
    String getHrAtrialFib();

    @NotNull
    String getHrAtrialFibSummary();

    @NotNull
    String getHrBatteryTips();

    @NotNull
    String getHrDetectAtrial();

    @NotNull
    String getHrDetectClose();

    @NotNull
    String getHrDetectMode();

    @NotNull
    String getHrFreq();

    @NotNull
    String getHrFreqIncreaseWarningSummary();

    @NotNull
    String getHrFreqSummary();

    @NotNull
    String getHrModeAtrialSummary();

    @NotNull
    String getHrModeAtrialWarning();

    @NotNull
    String getHrModeAuto();

    @NotNull
    String getHrModeAutoOrSleepWarning();

    @NotNull
    String getHrModeAutoSleep();

    @NotNull
    String getHrModeAutoSleepSummary();

    @NotNull
    String getHrModeAutoSleepWarning();

    @NotNull
    String getHrModeAutoSummary();

    @NotNull
    String getHrModeSleep();

    @NotNull
    String getHrModeSleepSummary();

    @NotNull
    String getHrModeSummary();

    @NotNull
    String getHrModeSummaryWatch();

    @NotNull
    String getHrNotAlertRes();

    @NotNull
    String getHrWarnSettingFreqSummary();

    @NotNull
    String getHrWarnSettingSummary();

    @NotNull
    String getHrWarnSettingTitle();

    @NotNull
    String getHrWarnTimesFormat(int times);

    @NotNull
    String getHrWarnTips();

    @NotNull
    String getHrWarnTipsWatch();

    @NotNull
    String getHrWarnValueSettingTitle();

    @NotNull
    String getHuamiOsHrWarningSettingDisableAtrialSummary();

    @NotNull
    String getHuamiOsHrWarningSettingDisableSummary();

    @NotNull
    String getKnowMoreRes();

    @NotNull
    String getLowHrAlertFreqNotSupportWarning();

    @NotNull
    String getLowHrWaringSettingEnableSummary();

    @NotNull
    String getLowHrWarningSettingTitle();

    @NotNull
    String getLowSpo2AlertDisableSummary();

    @NotNull
    String getLowSpo2AlertEnableSummary();

    @NotNull
    String getLowSpo2AlertTitle();

    @NotNull
    String getLowSpo2AlertValueFormat(int percent);

    @NotNull
    String getPressure();

    @NotNull
    String getPressureAlertDisableSummary();

    @NotNull
    String getPressureAlertEnableSummary();

    @NotNull
    String getPressureAlertTitle();

    @NotNull
    String getPressureDetect();

    @NotNull
    String getPressureSummary();

    @NotNull
    String getPressureWarning();

    @NotNull
    String getSetFail();

    @NotNull
    String getSettingHeartrateDetectSelectTitle();

    @NotNull
    String getSleepAssistantTitle();

    @NotNull
    String getSleepRes();

    @NotNull
    String getSleepSettingSummary();

    @NotNull
    String getSleepSpo2NoOsa();

    @NotNull
    String getSleepSpo2SummaryNoOsa();

    @NotNull
    String getSleepSpo2WarningNoOsa();

    @NotNull
    Map<String, String> getSleepingBloodPressureMonitorStr();

    @NotNull
    String getSmartSpo2SetWarning();

    @NotNull
    String getSmartSpo2Summary();

    @NotNull
    String getSmartSpo2Title();

    @NotNull
    String getSpo2();

    @NotNull
    String getSportHr();

    @NotNull
    String getSportHrTips();

    @NotNull
    String getSportHrTipsWatch();

    @NotNull
    String getTimeFormatMinute(int minute);
}
