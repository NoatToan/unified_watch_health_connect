package com.xiaomi.fitness.devicesettings.huami.handler;

import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HRDetectExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u001f\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\f*\u0002H\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/handler/HealthSettingChangeHandler;", "", "<init>", "()V", "TAG", "", "handleSettingChanged", "", "did", Constant.DeviceCategory.HEALTH, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "withLog", "T", "msg", "(Ljava/lang/Object;Ljava/lang/String;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthSettingChangeHandler {

    @NotNull
    public static final HealthSettingChangeHandler INSTANCE = new HealthSettingChangeHandler();

    @NotNull
    public static final String TAG = "HealthSettingChangeHandler";

    private HealthSettingChangeHandler() {
    }

    private final <T> void withLog(T t, String str) {
        Logger.i(TAG, str);
    }

    public final synchronized void handleSettingChanged(@NotNull String did, @NotNull Health health) {
        try {
            Intrinsics.checkNotNullParameter(did, "did");
            Intrinsics.checkNotNullParameter(health, "health");
            Logger.i(TAG, "handleHealthSettingChanged " + did);
            if (health.getStandUpRemindSwitch() != null || health.getStandUpRemindStartTime() != null || health.getStandUpRemindStopTime() != null || health.getMiddyRestDndSwitch() != null || health.getMiddyRestStartTime() != null || health.getMiddyRestStopTime() != null) {
                AlertStandHealthSettingChangeHandler.INSTANCE.handleSettingChanged(did, health);
            }
            DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
            Object objValueToObject = companion.getInstance().readSettingItem(did, DeviceSettingConfigKey.KE_HRDETECT).valueToObject(HRDetect.class);
            HRDetect hRDetect = objValueToObject instanceof HRDetect ? (HRDetect) objValueToObject : null;
            if (hRDetect == null) {
                return;
            }
            EnumData hrAllayDetectionFrequency = health.getHrAllayDetectionFrequency();
            if (hrAllayDetectionFrequency != null) {
                HealthSettingChangeHandler healthSettingChangeHandler = INSTANCE;
                HRDetectExtKt.setHrDetectionFreq(hRDetect, hrAllayDetectionFrequency.getValue());
                healthSettingChangeHandler.withLog(Unit.INSTANCE, "HrDetectionFreq changed:" + hrAllayDetectionFrequency.getValue());
            }
            EnumData hrTooHighRemindValue = health.getHrTooHighRemindValue();
            if (hrTooHighRemindValue != null) {
                HealthSettingChangeHandler healthSettingChangeHandler2 = INSTANCE;
                HRDetectExtKt.setHighHrWarningThreshold(hRDetect, hrTooHighRemindValue.getValue());
                healthSettingChangeHandler2.withLog(Unit.INSTANCE, "HighHrWarning changed:" + hrTooHighRemindValue.getValue());
            }
            EnumData hrTooLowRemindValue = health.getHrTooLowRemindValue();
            if (hrTooLowRemindValue != null) {
                HealthSettingChangeHandler healthSettingChangeHandler3 = INSTANCE;
                HRDetectExtKt.setLowHrWarningThreshold(hRDetect, hrTooLowRemindValue.getValue());
                healthSettingChangeHandler3.withLog(Unit.INSTANCE, "LowHrWarning changed:" + hrTooLowRemindValue.getValue());
            }
            Boolean hrActivityMonitorSwitch = health.getHrActivityMonitorSwitch();
            if (hrActivityMonitorSwitch != null) {
                boolean zBooleanValue = hrActivityMonitorSwitch.booleanValue();
                HealthSettingChangeHandler healthSettingChangeHandler4 = INSTANCE;
                hRDetect.setActiveEnable(zBooleanValue);
                healthSettingChangeHandler4.withLog(Unit.INSTANCE, "ActiveEnable changed:" + zBooleanValue);
            }
            Boolean heartHealthyMonitorSwitch = health.getHeartHealthyMonitorSwitch();
            if (heartHealthyMonitorSwitch != null) {
                boolean zBooleanValue2 = heartHealthyMonitorSwitch.booleanValue();
                HealthSettingChangeHandler healthSettingChangeHandler5 = INSTANCE;
                hRDetect.setAbnormalHeartbeatEnable(zBooleanValue2);
                healthSettingChangeHandler5.withLog(Unit.INSTANCE, "AbnormalHeartbeatEnable changed:" + zBooleanValue2);
            }
            Boolean scientificSleepSwitch = health.getScientificSleepSwitch();
            if (scientificSleepSwitch != null) {
                boolean zBooleanValue3 = scientificSleepSwitch.booleanValue();
                HealthSettingChangeHandler healthSettingChangeHandler6 = INSTANCE;
                HRDetectExtKt.setSleepDetectionSwitch(hRDetect, zBooleanValue3);
                healthSettingChangeHandler6.withLog(Unit.INSTANCE, "SleepAssistEnable changed:" + zBooleanValue3);
            }
            Boolean osaSwitch = health.getOsaSwitch();
            if (osaSwitch != null) {
                boolean zBooleanValue4 = osaSwitch.booleanValue();
                HealthSettingChangeHandler healthSettingChangeHandler7 = INSTANCE;
                hRDetect.setSleepBreathQualityEnable(zBooleanValue4);
                healthSettingChangeHandler7.withLog(Unit.INSTANCE, "SleepBreathQualityEnable changed:" + zBooleanValue4);
            }
            Boolean smartSpo2MonitorSwitch = health.getSmartSpo2MonitorSwitch();
            if (smartSpo2MonitorSwitch != null) {
                boolean zBooleanValue5 = smartSpo2MonitorSwitch.booleanValue();
                HealthSettingChangeHandler healthSettingChangeHandler8 = INSTANCE;
                hRDetect.setSpo2Enable(zBooleanValue5);
                healthSettingChangeHandler8.withLog(Unit.INSTANCE, "Spo2Enable changed:" + zBooleanValue5);
            }
            EnumData spo2LowLevelRemindValue = health.getSpo2LowLevelRemindValue();
            if (spo2LowLevelRemindValue != null) {
                HealthSettingChangeHandler healthSettingChangeHandler9 = INSTANCE;
                HRDetectExtKt.setLowSpo2WarningThreshold(hRDetect, spo2LowLevelRemindValue.getValue());
                healthSettingChangeHandler9.withLog(Unit.INSTANCE, "Spo2LowWarning changed:" + spo2LowLevelRemindValue.getValue());
            }
            Boolean allDayPressureSwitch = health.getAllDayPressureSwitch();
            if (allDayPressureSwitch != null) {
                boolean zBooleanValue6 = allDayPressureSwitch.booleanValue();
                HealthSettingChangeHandler healthSettingChangeHandler10 = INSTANCE;
                hRDetect.setPressureEnable(zBooleanValue6);
                healthSettingChangeHandler10.withLog(Unit.INSTANCE, "pressureEnable changed:" + zBooleanValue6);
            }
            Boolean relievePressureRemindSwitch = health.getRelievePressureRemindSwitch();
            if (relievePressureRemindSwitch != null) {
                boolean zBooleanValue7 = relievePressureRemindSwitch.booleanValue();
                HealthSettingChangeHandler healthSettingChangeHandler11 = INSTANCE;
                hRDetect.setRelaxReminder(zBooleanValue7);
                healthSettingChangeHandler11.withLog(Unit.INSTANCE, "relaxReminder changed:" + zBooleanValue7);
            }
            companion.getInstance().sendSettingItem(did, DeviceSettingConfigKey.KE_HRDETECT, hRDetect);
        } catch (Throwable th) {
            throw th;
        }
    }
}
