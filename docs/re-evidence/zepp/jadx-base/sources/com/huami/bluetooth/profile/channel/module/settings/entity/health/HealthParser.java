package com.huami.bluetooth.profile.channel.module.settings.entity.health;

import com.huami.bluetooth.profile.channel.module.settings.SettingsParserKt;
import com.huami.bluetooth.profile.channel.module.settings.entity.IParser;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Int32Data;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/HealthParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HealthParser implements IParser<Health> {

    @NotNull
    private static final String a = "Health";

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return IParser.DefaultImpls.parseUnSupport(this, byteBuffer, z, i);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.entity.IParser
    @Nullable
    public Health parse(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Health healthNewInstance$default = Health.Companion.newInstance$default(Health.INSTANCE, null, null, 3, null);
        if (healthNewInstance$default == null) {
            return null;
        }
        healthNewInstance$default.setGroupVersion(groupVersion);
        boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
        byte b = byteBuffer.get();
        int i = 0;
        if (b > 0) {
            do {
                i++;
                byte b2 = byteBuffer.get();
                Health.Companion companion = Health.INSTANCE;
                if (b2 == companion.getKEY_HR_ALL_DAY_DETECTION_FREQUENCY()) {
                    EnumData enumDataCheckAndGetEnum = SettingsParserKt.checkAndGetEnum(byteBuffer, "hrAllayDetectionFrequency", z);
                    if (enumDataCheckAndGetEnum == null) {
                        return null;
                    }
                    healthNewInstance$default.setHrAllayDetectionFrequency(enumDataCheckAndGetEnum);
                    Unit unit = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_HR_TOO_HIGH_REMIND_VALUE()) {
                    EnumData enumDataCheckAndGetEnum2 = SettingsParserKt.checkAndGetEnum(byteBuffer, "hrTooHighRemindValue", z);
                    if (enumDataCheckAndGetEnum2 == null) {
                        return null;
                    }
                    healthNewInstance$default.setHrTooHighRemindValue(enumDataCheckAndGetEnum2);
                    Unit unit2 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_HR_TOO_LOW_REMIND_VALUE()) {
                    EnumData enumDataCheckAndGetEnum3 = SettingsParserKt.checkAndGetEnum(byteBuffer, "allDayPressureSwitch", z);
                    if (enumDataCheckAndGetEnum3 == null) {
                        return null;
                    }
                    healthNewInstance$default.setHrTooLowRemindValue(enumDataCheckAndGetEnum3);
                    Unit unit3 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_HR_ACTIVITY_MONITOR_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean = SettingsParserKt.checkAndGetBoolean(byteBuffer, "hrActivityMonitorSwitch");
                    if (booleanDataCheckAndGetBoolean == null) {
                        return null;
                    }
                    healthNewInstance$default.setHrActivityMonitorSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean.getValue()));
                    Unit unit4 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_HR_ADVERTISEMENT_IN_ACTIVE_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean2 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "hrAdvertisementInActiveSwitch");
                    if (booleanDataCheckAndGetBoolean2 == null) {
                        return null;
                    }
                    healthNewInstance$default.setHrAdvertisementInActiveSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean2.getValue()));
                    Unit unit5 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_SCIENTIFIC_SLEEP_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean3 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "scientificSleepSwitch");
                    if (booleanDataCheckAndGetBoolean3 == null) {
                        return null;
                    }
                    healthNewInstance$default.setScientificSleepSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean3.getValue()));
                    Unit unit6 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_OSA_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean4 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "osaSwitch");
                    if (booleanDataCheckAndGetBoolean4 == null) {
                        return null;
                    }
                    healthNewInstance$default.setOsaSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean4.getValue()));
                    Unit unit7 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_ALL_DAY_PRESSURE_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean5 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "allDayPressureSwitch");
                    if (booleanDataCheckAndGetBoolean5 == null) {
                        return null;
                    }
                    healthNewInstance$default.setAllDayPressureSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean5.getValue()));
                    Unit unit8 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_RELIEVE_PRESSURE_REMIND_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean6 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "relievePressureRemindSwitch");
                    if (booleanDataCheckAndGetBoolean6 == null) {
                        return null;
                    }
                    healthNewInstance$default.setRelievePressureRemindSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean6.getValue()));
                    Unit unit9 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_HEART_HEALTHY_MONITOR_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean7 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "heartHealthyMonitorSwitch");
                    if (booleanDataCheckAndGetBoolean7 == null) {
                        return null;
                    }
                    healthNewInstance$default.setHeartHealthyMonitorSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean7.getValue()));
                    Unit unit10 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_HEART_HEALTHY_REMIND_DND_IN_SLEEP_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean8 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "heartHealthyRemindDndInSleepSwitch");
                    if (booleanDataCheckAndGetBoolean8 == null) {
                        return null;
                    }
                    healthNewInstance$default.setHeartHealthyRemindDndInSleepSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean8.getValue()));
                    Unit unit11 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_SMART_SPO2_MONITOR_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean9 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "smartSpo2MonitorSwitch");
                    if (booleanDataCheckAndGetBoolean9 == null) {
                        return null;
                    }
                    healthNewInstance$default.setSmartSpo2MonitorSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean9.getValue()));
                    Unit unit12 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_SPO2_LOW_LEVEL_REMIND_VALUE()) {
                    EnumData enumDataCheckAndGetEnum4 = SettingsParserKt.checkAndGetEnum(byteBuffer, "spo2LowLevelRemindValue", z);
                    if (enumDataCheckAndGetEnum4 == null) {
                        return null;
                    }
                    healthNewInstance$default.setSpo2LowLevelRemindValue(enumDataCheckAndGetEnum4);
                    Unit unit13 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_STAND_UP_REMIND_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean10 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "standUpRemindSwitch");
                    if (booleanDataCheckAndGetBoolean10 == null) {
                        return null;
                    }
                    healthNewInstance$default.setStandUpRemindSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean10.getValue()));
                    Unit unit14 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_STAND_UP_REMIND_START_TIME()) {
                    Time timeCheckAndGetTime = SettingsParserKt.checkAndGetTime(byteBuffer, "standUpRemindStartTime");
                    if (timeCheckAndGetTime == null) {
                        return null;
                    }
                    healthNewInstance$default.setStandUpRemindStartTime(timeCheckAndGetTime);
                    Unit unit15 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_STAND_UP_REMIND_STOP_TIME()) {
                    Time timeCheckAndGetTime2 = SettingsParserKt.checkAndGetTime(byteBuffer, "standUpRemindStopTime");
                    if (timeCheckAndGetTime2 == null) {
                        return null;
                    }
                    healthNewInstance$default.setStandUpRemindStopTime(timeCheckAndGetTime2);
                    Unit unit16 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_MIDDY_REST_DND_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean11 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "middyRestDndSwitch");
                    if (booleanDataCheckAndGetBoolean11 == null) {
                        return null;
                    }
                    healthNewInstance$default.setMiddyRestDndSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean11.getValue()));
                    Unit unit17 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_MIDDY_REST_START_TIME()) {
                    Time timeCheckAndGetTime3 = SettingsParserKt.checkAndGetTime(byteBuffer, "middyRestStartTime");
                    if (timeCheckAndGetTime3 == null) {
                        return null;
                    }
                    healthNewInstance$default.setMiddyRestStartTime(timeCheckAndGetTime3);
                    Unit unit18 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_MIDDY_REST_STOP_TIME()) {
                    Time timeCheckAndGetTime4 = SettingsParserKt.checkAndGetTime(byteBuffer, "middyRestStopTime");
                    if (timeCheckAndGetTime4 == null) {
                        return null;
                    }
                    healthNewInstance$default.setMiddyRestStopTime(timeCheckAndGetTime4);
                    Unit unit19 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_TARGET_ACHIEVE_REMIND_SWITCH()) {
                    BooleanData booleanDataCheckAndGetBoolean12 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "targetAchieveRemindSwitch");
                    if (booleanDataCheckAndGetBoolean12 == null) {
                        return null;
                    }
                    healthNewInstance$default.setTargetAchieveRemindSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean12.getValue()));
                    Unit unit20 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_STEP_TARGET()) {
                    if (groupVersion >= 2) {
                        Int32Data int32DataCheckAndGetInt32Data = SettingsParserKt.checkAndGetInt32Data(byteBuffer, "stepTarget", z);
                        if (int32DataCheckAndGetInt32Data == null) {
                            return null;
                        }
                        healthNewInstance$default.setStepTarget(int32DataCheckAndGetInt32Data);
                        Unit unit21 = Unit.INSTANCE;
                    } else {
                        IntData intDataCheckAndGetIntData = SettingsParserKt.checkAndGetIntData(byteBuffer, "stepTarget", z);
                        if (intDataCheckAndGetIntData == null) {
                            return null;
                        }
                        healthNewInstance$default.setStepTarget(intDataCheckAndGetIntData);
                        Unit unit22 = Unit.INSTANCE;
                    }
                } else if (b2 == companion.getKEY_CALORIE_TARGET()) {
                    IntData intDataCheckAndGetIntData2 = SettingsParserKt.checkAndGetIntData(byteBuffer, "calorieTarget", z);
                    if (intDataCheckAndGetIntData2 == null) {
                        return null;
                    }
                    healthNewInstance$default.setCalorieTarget(intDataCheckAndGetIntData2);
                    Unit unit23 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_WEIGHT_TARGET()) {
                    IntData intDataCheckAndGetIntData3 = SettingsParserKt.checkAndGetIntData(byteBuffer, "weightTarget", z);
                    if (intDataCheckAndGetIntData3 == null) {
                        return null;
                    }
                    healthNewInstance$default.setWeightTarget(intDataCheckAndGetIntData3);
                    Unit unit24 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_SLEEP_TARGET()) {
                    IntData intDataCheckAndGetIntData4 = SettingsParserKt.checkAndGetIntData(byteBuffer, "sleepTarget", z);
                    if (intDataCheckAndGetIntData4 == null) {
                        return null;
                    }
                    healthNewInstance$default.setSleepTarget(intDataCheckAndGetIntData4);
                    Unit unit25 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_STAND_TARGET()) {
                    IntData intDataCheckAndGetIntData5 = SettingsParserKt.checkAndGetIntData(byteBuffer, "standTarget", z);
                    if (intDataCheckAndGetIntData5 == null) {
                        return null;
                    }
                    healthNewInstance$default.setStandTarget(intDataCheckAndGetIntData5);
                    Unit unit26 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_ACTIVITY_TARGET()) {
                    IntData intDataCheckAndGetIntData6 = SettingsParserKt.checkAndGetIntData(byteBuffer, "activityTarget", z);
                    if (intDataCheckAndGetIntData6 == null) {
                        return null;
                    }
                    healthNewInstance$default.setActivityTarget(intDataCheckAndGetIntData6);
                    Unit unit27 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_SLEEP_BLOOD_PRESSURE_MONITOR()) {
                    BooleanData booleanDataCheckAndGetBoolean13 = SettingsParserKt.checkAndGetBoolean(byteBuffer, "sleepingBloodPressureMonitor");
                    if (booleanDataCheckAndGetBoolean13 == null) {
                        return null;
                    }
                    healthNewInstance$default.setBloodPressureMonitorSwitch(Boolean.valueOf(booleanDataCheckAndGetBoolean13.getValue()));
                    Unit unit28 = Unit.INSTANCE;
                } else if (b2 == companion.getKEY_ACTIVITY_MODE()) {
                    EnumData enumDataCheckAndGetEnum5 = SettingsParserKt.checkAndGetEnum(byteBuffer, "activityMode", z);
                    if (enumDataCheckAndGetEnum5 == null) {
                        return null;
                    }
                    healthNewInstance$default.setActivityMode(enumDataCheckAndGetEnum5);
                    Unit unit29 = Unit.INSTANCE;
                } else {
                    IPrimaryData unSupport = parseUnSupport(byteBuffer, z, b2);
                    Debug.fi(a, "[WARNING] parseHealth unknown key: " + ((int) b2) + ", position: " + byteBuffer.position() + ", parsed: " + unSupport);
                    if (unSupport == null) {
                        return null;
                    }
                }
            } while (i < b);
        }
        return healthNewInstance$default;
    }
}
