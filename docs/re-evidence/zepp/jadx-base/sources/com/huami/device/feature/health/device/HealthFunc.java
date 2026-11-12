package com.huami.device.feature.health.device;

import androidx.exifinterface.media.ExifInterface;
import com.huami.device.feature.health.settings.AtrialSetting;
import com.huami.device.feature.health.settings.AtrialSleepNotDisturbSetting;
import com.huami.device.feature.health.settings.BaseSetting;
import com.huami.device.feature.health.settings.BloodPressureSetting;
import com.huami.device.feature.health.settings.HighHrAlertSetting;
import com.huami.device.feature.health.settings.HrIntervalSetting;
import com.huami.device.feature.health.settings.HrModeSetting;
import com.huami.device.feature.health.settings.LowHrAlertSetting;
import com.huami.device.feature.health.settings.LowSpo2AlertSetting;
import com.huami.device.feature.health.settings.OsaSetting;
import com.huami.device.feature.health.settings.PressureAlertSetting;
import com.huami.device.feature.health.settings.PressureSetting;
import com.huami.device.feature.health.settings.RemSetting;
import com.huami.device.feature.health.settings.SleepingBloodPressureMonitorSetting;
import com.huami.device.feature.health.settings.SmartSpo2Setting;
import com.huami.device.feature.health.settings.SportHrSetting;
import com.huami.ecg.core.model.constant.MeasureContentType;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u000f\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B'\b\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0005\u001a\u00020\u0004J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0001\u000f'()*+,-./012345¨\u00066"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/BaseSetting;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "isSupport", "getService", "()Lcom/huami/device/feature/health/settings/BaseSetting;", "getServiceForce", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "b", "getDesc", "desc", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "settingClass", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", "ATRIAL", "ATRIAL_ALERT_SLEEP_NOT_DISTURB", MeasureContentType.BLOOD_PRESSURE, "HIGH_HR_ALERT", "HR_INTERVAL", "HR_MODE", "LOW_HR_ALERT", "LOW_SPO2_ALERT", "OSA", "PRESSURE", "PRESSURE_ALERT", "REM", "SLEEPING_BLOOD_PRESSURE_MONITOR", "SMART_SPO2", "SPORT_HR", "Lcom/huami/device/feature/health/device/HealthFunc$HR_MODE;", "Lcom/huami/device/feature/health/device/HealthFunc$ATRIAL;", "Lcom/huami/device/feature/health/device/HealthFunc$ATRIAL_ALERT_SLEEP_NOT_DISTURB;", "Lcom/huami/device/feature/health/device/HealthFunc$HIGH_HR_ALERT;", "Lcom/huami/device/feature/health/device/HealthFunc$HR_INTERVAL;", "Lcom/huami/device/feature/health/device/HealthFunc$LOW_HR_ALERT;", "Lcom/huami/device/feature/health/device/HealthFunc$LOW_SPO2_ALERT;", "Lcom/huami/device/feature/health/device/HealthFunc$OSA;", "Lcom/huami/device/feature/health/device/HealthFunc$PRESSURE_ALERT;", "Lcom/huami/device/feature/health/device/HealthFunc$PRESSURE;", "Lcom/huami/device/feature/health/device/HealthFunc$REM;", "Lcom/huami/device/feature/health/device/HealthFunc$SMART_SPO2;", "Lcom/huami/device/feature/health/device/HealthFunc$SPORT_HR;", "Lcom/huami/device/feature/health/device/HealthFunc$BLOOD_PRESSURE;", "Lcom/huami/device/feature/health/device/HealthFunc$SLEEPING_BLOOD_PRESSURE_MONITOR;", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class HealthFunc<T extends BaseSetting<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String desc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Class<T> settingClass;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$ATRIAL;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/AtrialSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class ATRIAL extends HealthFunc<AtrialSetting> {

        @NotNull
        public static final ATRIAL INSTANCE = new ATRIAL();

        private ATRIAL() {
            super("ATRIAL", "房颤开关", AtrialSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$ATRIAL_ALERT_SLEEP_NOT_DISTURB;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/AtrialSleepNotDisturbSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class ATRIAL_ALERT_SLEEP_NOT_DISTURB extends HealthFunc<AtrialSleepNotDisturbSetting> {

        @NotNull
        public static final ATRIAL_ALERT_SLEEP_NOT_DISTURB INSTANCE = new ATRIAL_ALERT_SLEEP_NOT_DISTURB();

        private ATRIAL_ALERT_SLEEP_NOT_DISTURB() {
            super("ATRIAL_ALERT_SLEEP_NOT_DISTURB", "房颤提醒睡眠勿扰", AtrialSleepNotDisturbSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$BLOOD_PRESSURE;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/BloodPressureSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class BLOOD_PRESSURE extends HealthFunc<BloodPressureSetting> {

        @NotNull
        public static final BLOOD_PRESSURE INSTANCE = new BLOOD_PRESSURE();

        private BLOOD_PRESSURE() {
            super(MeasureContentType.BLOOD_PRESSURE, "血压", BloodPressureSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$HIGH_HR_ALERT;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/HighHrAlertSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class HIGH_HR_ALERT extends HealthFunc<HighHrAlertSetting> {

        @NotNull
        public static final HIGH_HR_ALERT INSTANCE = new HIGH_HR_ALERT();

        private HIGH_HR_ALERT() {
            super("HIGH_HR_ALERT", "高心率预警", HighHrAlertSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$HR_INTERVAL;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/HrIntervalSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class HR_INTERVAL extends HealthFunc<HrIntervalSetting> {

        @NotNull
        public static final HR_INTERVAL INSTANCE = new HR_INTERVAL();

        private HR_INTERVAL() {
            super("HR_INTERVAL", "心率监测频率", HrIntervalSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$HR_MODE;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/HrModeSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class HR_MODE extends HealthFunc<HrModeSetting> {

        @NotNull
        public static final HR_MODE INSTANCE = new HR_MODE();

        private HR_MODE() {
            super("HR_MODE", "心率模式设置", HrModeSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$LOW_HR_ALERT;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/LowHrAlertSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class LOW_HR_ALERT extends HealthFunc<LowHrAlertSetting> {

        @NotNull
        public static final LOW_HR_ALERT INSTANCE = new LOW_HR_ALERT();

        private LOW_HR_ALERT() {
            super("LOW_HR_ALERT", "低心率预警", LowHrAlertSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$LOW_SPO2_ALERT;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/LowSpo2AlertSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class LOW_SPO2_ALERT extends HealthFunc<LowSpo2AlertSetting> {

        @NotNull
        public static final LOW_SPO2_ALERT INSTANCE = new LOW_SPO2_ALERT();

        private LOW_SPO2_ALERT() {
            super("LOW_SPO2_ALERT", "低血氧饱和度预警", LowSpo2AlertSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$OSA;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/OsaSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class OSA extends HealthFunc<OsaSetting> {

        @NotNull
        public static final OSA INSTANCE = new OSA();

        private OSA() {
            super("OSA", "睡眠呼吸质量", OsaSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$PRESSURE;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/PressureSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class PRESSURE extends HealthFunc<PressureSetting> {

        @NotNull
        public static final PRESSURE INSTANCE = new PRESSURE();

        private PRESSURE() {
            super("PRESSURE", "全天压力监测", PressureSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$PRESSURE_ALERT;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/PressureAlertSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class PRESSURE_ALERT extends HealthFunc<PressureAlertSetting> {

        @NotNull
        public static final PRESSURE_ALERT INSTANCE = new PRESSURE_ALERT();

        private PRESSURE_ALERT() {
            super("PRESSURE_ALERT", "舒压提醒", PressureAlertSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$REM;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/RemSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class REM extends HealthFunc<RemSetting> {

        @NotNull
        public static final REM INSTANCE = new REM();

        private REM() {
            super("REM", "科学睡眠监测", RemSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$SLEEPING_BLOOD_PRESSURE_MONITOR;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/SleepingBloodPressureMonitorSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class SLEEPING_BLOOD_PRESSURE_MONITOR extends HealthFunc<SleepingBloodPressureMonitorSetting> {

        @NotNull
        public static final SLEEPING_BLOOD_PRESSURE_MONITOR INSTANCE = new SLEEPING_BLOOD_PRESSURE_MONITOR();

        private SLEEPING_BLOOD_PRESSURE_MONITOR() {
            super("SLEEPING_BLOOD_PRESSURE_MONITOR", "夜间血压监测", SleepingBloodPressureMonitorSetting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$SMART_SPO2;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/SmartSpo2Setting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class SMART_SPO2 extends HealthFunc<SmartSpo2Setting> {

        @NotNull
        public static final SMART_SPO2 INSTANCE = new SMART_SPO2();

        private SMART_SPO2() {
            super("SMART_SPO2", "智能血氧监测", SmartSpo2Setting.class, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/device/feature/health/device/HealthFunc$SPORT_HR;", "Lcom/huami/device/feature/health/device/HealthFunc;", "Lcom/huami/device/feature/health/settings/SportHrSetting;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class SPORT_HR extends HealthFunc<SportHrSetting> {

        @NotNull
        public static final SPORT_HR INSTANCE = new SPORT_HR();

        private SPORT_HR() {
            super("SPORT_HR", "活动心率监测", SportHrSetting.class, null);
        }
    }

    private HealthFunc(String str, String str2, Class<T> cls) {
        this.key = str;
        this.desc = str2;
        this.settingClass = cls;
    }

    public /* synthetic */ HealthFunc(String str, String str2, Class cls, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, cls);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final T getService() {
        try {
            T t = (T) GlobalContext.INSTANCE.get().get(JvmClassMappingKt.getKotlinClass(this.settingClass), null, null);
            if (t.isSupport()) {
                return t;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    @Nullable
    public final T getServiceForce() {
        try {
            return (T) GlobalContext.INSTANCE.get().get(JvmClassMappingKt.getKotlinClass(this.settingClass), null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean isSupport() {
        return getService() != null;
    }
}
