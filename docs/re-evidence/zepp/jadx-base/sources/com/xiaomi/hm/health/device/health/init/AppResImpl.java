package com.xiaomi.hm.health.device.health.init;

import android.app.Application;
import android.content.Context;
import androidx.annotation.StringRes;
import com.huami.device.feature.health.res.IAppRes;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bS\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bj\u0010kJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0006H\u0016J\b\u0010/\u001a\u00020\u0006H\u0016J\b\u00100\u001a\u00020\u0006H\u0016J\b\u00101\u001a\u00020\u0006H\u0016J\b\u00102\u001a\u00020\u0006H\u0016J\b\u00103\u001a\u00020\u0006H\u0016J\b\u00104\u001a\u00020\u0006H\u0016J\b\u00105\u001a\u00020\u0006H\u0016J\b\u00106\u001a\u00020\u0006H\u0016J\b\u00107\u001a\u00020\u0006H\u0016J\b\u00108\u001a\u00020\u0006H\u0016J\b\u00109\u001a\u00020\u0006H\u0016J\b\u0010:\u001a\u00020\u0006H\u0016J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0004H\u0016J\b\u0010=\u001a\u00020\u0006H\u0016J\b\u0010>\u001a\u00020\u0006H\u0016J\b\u0010?\u001a\u00020\u0006H\u0016J\b\u0010@\u001a\u00020\u0006H\u0016J\b\u0010A\u001a\u00020\u0006H\u0016J\b\u0010B\u001a\u00020\u0006H\u0016J\b\u0010C\u001a\u00020\u0006H\u0016J\b\u0010D\u001a\u00020\u0006H\u0016J\b\u0010E\u001a\u00020\u0006H\u0016J\b\u0010F\u001a\u00020\u0006H\u0016J\b\u0010G\u001a\u00020\u0006H\u0016J\b\u0010H\u001a\u00020\u0006H\u0016J\u0010\u0010J\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u0004H\u0016J\b\u0010K\u001a\u00020\u0006H\u0016J\b\u0010L\u001a\u00020\u0006H\u0016J\b\u0010M\u001a\u00020\u0006H\u0016J\b\u0010N\u001a\u00020\u0006H\u0016J\b\u0010O\u001a\u00020\u0006H\u0016J\b\u0010P\u001a\u00020\u0006H\u0016J\b\u0010Q\u001a\u00020\u0006H\u0016J\b\u0010R\u001a\u00020\u0006H\u0016J\b\u0010S\u001a\u00020\u0006H\u0016J\b\u0010T\u001a\u00020\u0006H\u0016J\b\u0010U\u001a\u00020\u0006H\u0016J\b\u0010V\u001a\u00020\u0006H\u0016J\b\u0010W\u001a\u00020\u0006H\u0016J\b\u0010X\u001a\u00020\u0006H\u0016J\b\u0010Y\u001a\u00020\u0006H\u0016J\u0014\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060ZH\u0016J\b\u0010\\\u001a\u00020\u0006H\u0016J\b\u0010]\u001a\u00020\u0006H\u0016J\b\u0010^\u001a\u00020\u0006H\u0016J\b\u0010_\u001a\u00020\u0006H\u0016J\b\u0010`\u001a\u00020\u0006H\u0016J\b\u0010a\u001a\u00020\u0006H\u0016J\b\u0010b\u001a\u00020\u0006H\u0016J\u0010\u0010d\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0004H\u0016R\u001d\u0010i\u001a\u00020e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bf\u0010h¨\u0006l"}, d2 = {"Lcom/xiaomi/hm/health/device/health/init/AppResImpl;", "Lcom/huami/device/feature/health/res/IAppRes;", "", "c", "", "strId", "", "b", "getActivityHrSummary", "getActivityHrTitleRes", "getAlldayHr", "getAlldayHrFreq", "getAlldayHrFreqTooLow", "getAlldayHrSettingSummaryRes", "getAlldayHrSettingTitleRes", "getAtrialAlertSleepNotDisturbSummary", "getAtrialAlertSleepNotDisturbTitle", "getAtrialFib", "getAtrialFibMedical", "getAtrialFibSummaryMedical", "getAtrialFibWarning", "getBtnCancel", "getBtnYes", "getClose", "getDeviceBatteryWarningTitle", "getEnableRemWarningStr", "getHealthDetectRes", "getHeartRateRes", "getHighHrAlertFreqNotSupportWarning", "getHighHrWaringSettingEnableSummary", "getHighHrWarnSettingTitle", "getHighLowHrAlertFreqNotSupportWarning", "hrInterval", "getHrAlertFreqNotSupportWarning", "getHrAtrialFib", "getHrAtrialFibSummary", "getHrBatteryTips", "getHrDetectAtrial", "getHrDetectClose", "getHrDetectMode", "getHrFreq", "getHrFreqIncreaseWarningSummary", "getHrFreqSummary", "getHrModeAtrialSummary", "getHrModeAtrialWarning", "getHrModeAuto", "getHrModeAutoOrSleepWarning", "getHrModeAutoSleep", "getHrModeAutoSleepSummary", "getHrModeAutoSleepWarning", "getHrModeAutoSummary", "getHrModeSleep", "getHrModeSleepSummary", "getHrModeSummary", "getHrModeSummaryWatch", "getHrNotAlertRes", "getHrWarnSettingFreqSummary", "getHrWarnSettingSummary", "getHrWarnSettingTitle", "times", "getHrWarnTimesFormat", "getHrWarnTips", "getHrWarnTipsWatch", "getHrWarnValueSettingTitle", "getHuamiOsHrWarningSettingDisableAtrialSummary", "getHuamiOsHrWarningSettingDisableSummary", "getKnowMoreRes", "getLowHrAlertFreqNotSupportWarning", "getLowHrWaringSettingEnableSummary", "getLowHrWarningSettingTitle", "getLowSpo2AlertDisableSummary", "getLowSpo2AlertEnableSummary", "getLowSpo2AlertTitle", "percent", "getLowSpo2AlertValueFormat", "getPressure", "getPressureAlertDisableSummary", "getPressureAlertEnableSummary", "getPressureAlertTitle", "getPressureDetect", "getPressureSummary", "getPressureWarning", "getSetFail", "getSettingHeartrateDetectSelectTitle", "getSleepAssistantTitle", "getSleepRes", "getSleepSettingSummary", "getSleepSpo2NoOsa", "getSleepSpo2SummaryNoOsa", "getSleepSpo2WarningNoOsa", "", "getSleepingBloodPressureMonitorStr", "getSmartSpo2SetWarning", "getSmartSpo2Summary", "getSmartSpo2Title", "getSpo2", "getSportHr", "getSportHrTips", "getSportHrTipsWatch", "minute", "getTimeFormatMinute", "Landroid/content/Context;", "a", "Lkotlin/Lazy;", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppResImpl implements IAppRes {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy context = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/app/Application;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Application> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Application getA() {
            return DeviceXFunctionsKt.getContext();
        }
    }

    private final Context a() {
        return (Context) this.context.getValue();
    }

    private final String b(@StringRes int strId) {
        return a().getString(strId);
    }

    private final boolean c() {
        HMMiLiProDevice miliProDevice = HMDeviceManager.getInstance().getMiliProDevice();
        if (miliProDevice == null) {
            return false;
        }
        return ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, miliProDevice.getMDeviceSource());
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getActivityHrSummary() {
        return c() ? a().getString(R.string.health_detect_zeppos_activity_hr_summary) : a().getString(R.string.health_detect_activity_hr_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getActivityHrTitleRes() {
        return a().getString(R.string.health_detect_activity_hr_title);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAlldayHr() {
        return a().getString(R.string.whole_day_hr);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAlldayHrFreq() {
        return a().getString(R.string.health_detect_allday_hr_freq);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAlldayHrFreqTooLow() {
        return a().getString(R.string.health_detect_hr_warn_too_low);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAlldayHrSettingSummaryRes() {
        return c() ? a().getString(R.string.health_detect_zeppos_allday_hr_summary) : a().getString(R.string.health_detect_allday_hr_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAlldayHrSettingTitleRes() {
        return c() ? a().getString(R.string.setting_heartrate_detect_auto) : a().getString(R.string.health_detect_allday_hr_title);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAtrialAlertSleepNotDisturbSummary() {
        return a().getString(R.string.health_detect_atrial_alert_sleep_not_disturb_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAtrialAlertSleepNotDisturbTitle() {
        return a().getString(R.string.health_detect_atrial_alert_sleep_not_disturb_title);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAtrialFib() {
        return a().getString(R.string.abnormal_heart_beat);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAtrialFibMedical() {
        return a().getString(R.string.abnormal_heart_beat_medical);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAtrialFibSummaryMedical() {
        return a().getString(R.string.health_detect_atrial_fib_summary_medical);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getAtrialFibWarning() {
        return c() ? a().getString(R.string.health_detect_zeppos_atrial_fib_message) : a().getString(R.string.health_detect_atrial_fib_message_new);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getBtnCancel() {
        return a().getString(R.string.btn_cancel);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getBtnYes() {
        return a().getString(R.string.btn_confirm);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getClose() {
        return a().getString(R.string.close);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getDeviceBatteryWarningTitle() {
        return a().getString(R.string.setting_heartrate_detect_auto);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getEnableRemWarningStr() {
        return b(R.string.enable_rem_warning);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHealthDetectRes() {
        return a().getString(R.string.health_detect);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHeartRateRes() {
        return a().getString(R.string.heart_rate);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHighHrAlertFreqNotSupportWarning() {
        return a().getString(R.string.health_detect_high_hr_alert_freq_not_support_warning);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHighHrWaringSettingEnableSummary() {
        return a().getString(R.string.health_detect_high_hr_warning_enable_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHighHrWarnSettingTitle() {
        return a().getString(R.string.health_detect_high_hr_warning_setting_title);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHighLowHrAlertFreqNotSupportWarning() {
        return a().getString(R.string.health_detect_high_low_hr_alert_freq_not_support_warning);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrAlertFreqNotSupportWarning(@NotNull String hrInterval) {
        return a().getString(R.string.health_detect_allday_hr_msg, a().getString(R.string.healtj_detect_hr_warn_too_low_msg), hrInterval);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrAtrialFib() {
        return a().getString(R.string.setting_heartrate_detect_atrial_fib);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrAtrialFibSummary() {
        return c() ? a().getString(R.string.health_detect_zeppos_atrial_fib_summary) : a().getString(R.string.health_detect_atrial_fib_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrBatteryTips() {
        return a().getString(R.string.setting_heartrate_detect_battery_tips);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrDetectAtrial() {
        return a().getString(R.string.health_detect_allday_hr_atrial);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrDetectClose() {
        return c() ? a().getString(R.string.close) : a().getString(R.string.health_detect_allday_hr_close);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrDetectMode() {
        return a().getString(R.string.setting_heartrate_detect_mode);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrFreq() {
        return a().getString(R.string.setting_heartrate_detect_freq);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrFreqIncreaseWarningSummary() {
        return a().getString(R.string.health_detect_hr_freq_increase_warning_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrFreqSummary() {
        return a().getString(R.string.open_auto_hr_detect_tips);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeAtrialSummary() {
        return a().getString(R.string.setting_heartrate_detect_atrial_fib_desc);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeAtrialWarning() {
        return a().getString(R.string.setting_heartrate_detect_atrial_fib_warning);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeAuto() {
        return a().getString(R.string.setting_heartrate_detect_auto);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeAutoOrSleepWarning() {
        return a().getString(R.string.setting_heartrate_detect_warning_1);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeAutoSleep() {
        return a().getString(R.string.setting_heartrate_detect_auto_sleep);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeAutoSleepSummary() {
        return a().getString(R.string.setting_heartrate_detect_auto_sleep_desc_new);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeAutoSleepWarning() {
        return a().getString(R.string.setting_heartrate_detect_warning_2);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeAutoSummary() {
        return a().getString(R.string.setting_heartrate_detect_auto_desc_new);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeSleep() {
        return a().getString(R.string.setting_heartrate_detect_sleep);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeSleepSummary() {
        return a().getString(R.string.setting_heartrate_detect_sleep_desc_new);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeSummary() {
        return a().getString(R.string.setting_heartrate_alert_wuhan_india_tips_msg);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrModeSummaryWatch() {
        return a().getString(R.string.setting_heartrate_alert_wuhan_india_tips_msg_watch);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrNotAlertRes() {
        return a().getString(R.string.health_detect_hr_warn_close);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrWarnSettingFreqSummary() {
        return a().getString(R.string.health_detect_hr_warn_summary_set_freq);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrWarnSettingSummary() {
        return a().getString(R.string.health_detect_hr_warn_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrWarnSettingTitle() {
        return a().getString(R.string.setting_heartrate_alert_title);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrWarnTimesFormat(int times) {
        return a().getResources().getQuantityString(R.plurals.health_detect_hr_warn_times, times, Integer.valueOf(times));
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrWarnTips() {
        return a().getString(R.string.hr_detect_alert_tips);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrWarnTipsWatch() {
        return a().getString(R.string.hr_detect_alert_tips_watch);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHrWarnValueSettingTitle() {
        return a().getString(R.string.setting_heartrate_alert_value_title);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHuamiOsHrWarningSettingDisableAtrialSummary() {
        return a().getString(R.string.health_detect_huamios_hr_warning_setting_disable_atrial_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getHuamiOsHrWarningSettingDisableSummary() {
        return a().getString(R.string.health_detect_huamios_hr_warning_setting_disable_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getKnowMoreRes() {
        return a().getString(R.string.ai_analysis_know_more);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getLowHrAlertFreqNotSupportWarning() {
        return a().getString(R.string.health_detect_low_hr_alert_freq_not_support_warning);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getLowHrWaringSettingEnableSummary() {
        return a().getString(R.string.health_detect_low_hr_alert_enable_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getLowHrWarningSettingTitle() {
        return a().getString(R.string.health_detect_low_hr_warning_setting_title);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getLowSpo2AlertDisableSummary() {
        return a().getString(R.string.health_detect_low_spo2_alert_disable_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getLowSpo2AlertEnableSummary() {
        return a().getString(R.string.health_detect_low_spo2_alert_enable_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getLowSpo2AlertTitle() {
        return a().getString(R.string.health_detect_low_spo2_alert_title);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getLowSpo2AlertValueFormat(int percent) {
        return a().getString(R.string.health_detect_low_spo2_alert_percent, Integer.valueOf(percent));
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getPressure() {
        return a().getString(R.string.app_sort_pressure);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getPressureAlertDisableSummary() {
        return a().getString(R.string.health_detect_perssure_alert_disable_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getPressureAlertEnableSummary() {
        return a().getString(R.string.health_detect_perssure_alert_enable_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getPressureAlertTitle() {
        return a().getString(R.string.health_detect_pressure_alert_title);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getPressureDetect() {
        return c() ? a().getString(R.string.all_day_pressure_detect_zeppos) : a().getString(R.string.all_day_pressure_detect);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getPressureSummary() {
        return c() ? a().getString(R.string.all_day_pressure_zeppos_summary) : a().getString(R.string.all_day_pressure_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getPressureWarning() {
        return a().getString(R.string.all_day_presssure_warning);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSetFail() {
        return a().getString(R.string.long_sit_set_failed);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSettingHeartrateDetectSelectTitle() {
        return a().getString(R.string.setting_heartrate_detect_select);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSleepAssistantTitle() {
        return a().getString(R.string.health_detect_sleep_assist_title);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSleepRes() {
        return a().getString(R.string.app_sort_sleep);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSleepSettingSummary() {
        return c() ? a().getString(R.string.health_detect_zeppos_sleep_assist_summary) : a().getString(R.string.health_detect_sleep_assist_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSleepSpo2NoOsa() {
        return a().getString(R.string.sleep_spo2_detect_no_osa);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSleepSpo2SummaryNoOsa() {
        return c() ? a().getString(R.string.sleep_spo2_zeppos_detect_summary_no_osa) : a().getString(R.string.sleep_spo2_detect_summary_no_osa);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSleepSpo2WarningNoOsa() {
        return c() ? a().getString(R.string.sleep_spo2_detect_zeppos_waring) : a().getString(R.string.sleep_spo2_detect_waring_no_osa);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public Map<String, String> getSleepingBloodPressureMonitorStr() {
        return r.mapOf(TuplesKt.to("title", b(R.string.sleeping_blood_monitor)), TuplesKt.to("subTitle", b(R.string.sleeping_blood_monitor_desc)), TuplesKt.to("subTitleDisable", b(R.string.sleeping_blood_monitor_desc_disable)), TuplesKt.to("dialogTitle", b(R.string.sleeping_blood_monitor_dialog_title)), TuplesKt.to("dialogContent", b(R.string.sleeping_blood_monitor_dialog_content)), TuplesKt.to("dialogOk", b(R.string.confirm)), TuplesKt.to("dialogCancel", b(R.string.cancel)));
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSmartSpo2SetWarning() {
        return a().getString(R.string.health_detect_smart_spo2_setting_warning);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSmartSpo2Summary() {
        return a().getString(R.string.health_detect_smart_spo2_summary);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSmartSpo2Title() {
        return a().getString(R.string.health_detect_smart_spo2);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSpo2() {
        return a().getString(R.string.health_detect_spo2);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSportHr() {
        return a().getString(R.string.setting_heartrate_detect_sport_detect);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSportHrTips() {
        return a().getString(R.string.sport_hr_detect_tips);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getSportHrTipsWatch() {
        return a().getString(R.string.sport_hr_detect_tips_watch);
    }

    @Override // com.huami.device.feature.health.res.IAppRes
    @NotNull
    public String getTimeFormatMinute(int minute) {
        return a().getResources().getQuantityString(R.plurals.time_format_minute, minute, Integer.valueOf(minute));
    }
}
