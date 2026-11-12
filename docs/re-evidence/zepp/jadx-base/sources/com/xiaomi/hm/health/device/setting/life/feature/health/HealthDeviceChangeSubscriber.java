package com.xiaomi.hm.health.device.setting.life.feature.health;

import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.settings.AtrialSetting;
import com.huami.device.feature.health.settings.AtrialSleepNotDisturbSetting;
import com.huami.device.feature.health.settings.HighHrAlertSetting;
import com.huami.device.feature.health.settings.HrIntervalSetting;
import com.huami.device.feature.health.settings.LowHrAlertSetting;
import com.huami.device.feature.health.settings.LowSpo2AlertSetting;
import com.huami.device.feature.health.settings.OsaSetting;
import com.huami.device.feature.health.settings.PressureAlertSetting;
import com.huami.device.feature.health.settings.PressureSetting;
import com.huami.device.feature.health.settings.RemSetting;
import com.huami.device.feature.health.settings.SleepingBloodPressureMonitorSetting;
import com.huami.device.feature.health.settings.SmartSpo2Setting;
import com.huami.device.feature.health.settings.SportHrSetting;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/health/HealthDeviceChangeSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "device", "", "a", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", "mSettingsChangeListener", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDeviceChangeSubscriber implements BleEventSubscriber {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ChangeListener mSettingsChangeListener;

    private final void a(HMMiLiDevice device) {
        if (device.isHuamiOs()) {
            ChangeListener changeListener = new ChangeListener() { // from class: com.xiaomi.hm.health.device.setting.life.feature.health.HealthDeviceChangeSubscriber$initSettingsListener$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ EnumData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(EnumData enumData) {
                        super(0);
                        this.a = enumData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备心率测量频率改变:" + this.a.getValue();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备房颤提醒睡眠勿扰开关改变:" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备智能血氧开关改变:" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class d extends Lambda implements Function0<String> {
                    public final /* synthetic */ EnumData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public d(EnumData enumData) {
                        super(0);
                        this.a = enumData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备低血氧提醒值改变:" + this.a.getValue();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class e extends Lambda implements Function0<String> {
                    public final /* synthetic */ IntPrimaryData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(IntPrimaryData intPrimaryData) {
                        super(0);
                        this.a = intPrimaryData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备目标步数值改变:" + this.a.getValue();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class f extends Lambda implements Function0<String> {
                    public final /* synthetic */ IntData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(IntData intData) {
                        super(0);
                        this.a = intData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备目标卡路里值改变:" + this.a.getValue();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class g extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public g(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "站立提醒开关改变:" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class h extends Lambda implements Function0<String> {
                    public final /* synthetic */ Time a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public h(Time time) {
                        super(0);
                        this.a = time;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "站立提醒开始时间改变, hour:" + this.a.getHour() + " minute:" + this.a.getMinute();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class i extends Lambda implements Function0<String> {
                    public final /* synthetic */ Time a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(Time time) {
                        super(0);
                        this.a = time;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "站立提醒结束时间改变, hour:" + this.a.getHour() + " minute:" + this.a.getMinute();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class j extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public j(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "站立提醒午休免打扰开关改变:" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class k extends Lambda implements Function0<String> {
                    public final /* synthetic */ Time a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public k(Time time) {
                        super(0);
                        this.a = time;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "站立提醒午休免打扰开始时间改变, hour:" + this.a.getHour() + " minute:" + this.a.getMinute();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class l extends Lambda implements Function0<String> {
                    public final /* synthetic */ EnumData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public l(EnumData enumData) {
                        super(0);
                        this.a = enumData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备高心率提醒改变:" + this.a.getValue();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class m extends Lambda implements Function0<String> {
                    public final /* synthetic */ Time a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public m(Time time) {
                        super(0);
                        this.a = time;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "站立提醒午休免打扰结束时间改变, hour:" + this.a.getHour() + " minute:" + this.a.getMinute();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class n extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public n(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "达标提醒开关改变:" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class o extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public o(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "夜间血压开关改变：" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class p extends Lambda implements Function0<String> {
                    public final /* synthetic */ EnumData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public p(EnumData enumData) {
                        super(0);
                        this.a = enumData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备低心率提醒改变:" + this.a.getValue();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class q extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public q(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备活动心率监测改变:" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class r extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public r(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备科学睡眠开关改变:" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class s extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public s(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备OSA开关改变:" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class t extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public t(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备全天压力开关改变:" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class u extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public u(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备舒压提醒开关改变:" + this.a;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class v extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public v(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "设备心脏健康开关改变:" + this.a;
                    }
                }

                @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
                public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
                    Boolean bloodPressureMonitorSwitch;
                    Boolean targetAchieveRemindSwitch;
                    Time middyRestStopTime;
                    Time middyRestStartTime;
                    Boolean middyRestDndSwitch;
                    Time standUpRemindStopTime;
                    Time standUpRemindStartTime;
                    Boolean standUpRemindSwitch;
                    IntData calorieTarget;
                    IntPrimaryData stepTarget;
                    EnumData spo2LowLevelRemindValue;
                    Boolean smartSpo2MonitorSwitch;
                    Boolean heartHealthyRemindDndInSleepSwitch;
                    Boolean heartHealthyMonitorSwitch;
                    Boolean relievePressureRemindSwitch;
                    Boolean allDayPressureSwitch;
                    Boolean osaSwitch;
                    Boolean scientificSleepSwitch;
                    Boolean hrActivityMonitorSwitch;
                    EnumData hrTooLowRemindValue;
                    EnumData hrTooHighRemindValue;
                    EnumData hrAllayDetectionFrequency;
                    Settings settings2 = settings.get(SettingsGroupType.HEALTH);
                    Health health = settings2 instanceof Health ? (Health) settings2 : null;
                    if (health != null && (hrAllayDetectionFrequency = health.getHrAllayDetectionFrequency()) != null) {
                        HMLog.info(this.a.getName(), new a(hrAllayDetectionFrequency));
                        HrIntervalSetting service = HealthFunc.HR_INTERVAL.INSTANCE.getService();
                        if (service != null) {
                            service.setData(hrAllayDetectionFrequency.getValue());
                        }
                    }
                    if (health != null && (hrTooHighRemindValue = health.getHrTooHighRemindValue()) != null) {
                        HMLog.info(this.a.getName(), new l(hrTooHighRemindValue));
                        HighHrAlertSetting service2 = HealthFunc.HIGH_HR_ALERT.INSTANCE.getService();
                        if (service2 != null) {
                            service2.setData(hrTooHighRemindValue.getValue());
                        }
                    }
                    if (health != null && (hrTooLowRemindValue = health.getHrTooLowRemindValue()) != null) {
                        HMLog.info(this.a.getName(), new p(hrTooLowRemindValue));
                        LowHrAlertSetting service3 = HealthFunc.LOW_HR_ALERT.INSTANCE.getService();
                        if (service3 != null) {
                            service3.setData(hrTooLowRemindValue.getValue());
                        }
                    }
                    if (health != null && (hrActivityMonitorSwitch = health.getHrActivityMonitorSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber = this.a;
                        boolean zBooleanValue = hrActivityMonitorSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber.getName(), new q(zBooleanValue));
                        SportHrSetting service4 = HealthFunc.SPORT_HR.INSTANCE.getService();
                        if (service4 != null) {
                            service4.setData(zBooleanValue);
                        }
                    }
                    if (health != null && (scientificSleepSwitch = health.getScientificSleepSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber2 = this.a;
                        boolean zBooleanValue2 = scientificSleepSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber2.getName(), new r(zBooleanValue2));
                        RemSetting service5 = HealthFunc.REM.INSTANCE.getService();
                        if (service5 != null) {
                            service5.setData(zBooleanValue2);
                        }
                    }
                    if (health != null && (osaSwitch = health.getOsaSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber3 = this.a;
                        boolean zBooleanValue3 = osaSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber3.getName(), new s(zBooleanValue3));
                        OsaSetting service6 = HealthFunc.OSA.INSTANCE.getService();
                        if (service6 != null) {
                            service6.setData(zBooleanValue3);
                        }
                    }
                    if (health != null && (allDayPressureSwitch = health.getAllDayPressureSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber4 = this.a;
                        boolean zBooleanValue4 = allDayPressureSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber4.getName(), new t(zBooleanValue4));
                        PressureSetting service7 = HealthFunc.PRESSURE.INSTANCE.getService();
                        if (service7 != null) {
                            service7.setData(zBooleanValue4);
                        }
                    }
                    if (health != null && (relievePressureRemindSwitch = health.getRelievePressureRemindSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber5 = this.a;
                        boolean zBooleanValue5 = relievePressureRemindSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber5.getName(), new u(zBooleanValue5));
                        PressureAlertSetting service8 = HealthFunc.PRESSURE_ALERT.INSTANCE.getService();
                        if (service8 != null) {
                            service8.setData(zBooleanValue5);
                        }
                    }
                    if (health != null && (heartHealthyMonitorSwitch = health.getHeartHealthyMonitorSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber6 = this.a;
                        boolean zBooleanValue6 = heartHealthyMonitorSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber6.getName(), new v(zBooleanValue6));
                        AtrialSetting service9 = HealthFunc.ATRIAL.INSTANCE.getService();
                        if (service9 != null) {
                            service9.setData(zBooleanValue6);
                        }
                    }
                    if (health != null && (heartHealthyRemindDndInSleepSwitch = health.getHeartHealthyRemindDndInSleepSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber7 = this.a;
                        boolean zBooleanValue7 = heartHealthyRemindDndInSleepSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber7.getName(), new b(zBooleanValue7));
                        AtrialSleepNotDisturbSetting service10 = HealthFunc.ATRIAL_ALERT_SLEEP_NOT_DISTURB.INSTANCE.getService();
                        if (service10 != null) {
                            service10.setData(zBooleanValue7);
                        }
                    }
                    if (health != null && (smartSpo2MonitorSwitch = health.getSmartSpo2MonitorSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber8 = this.a;
                        boolean zBooleanValue8 = smartSpo2MonitorSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber8.getName(), new c(zBooleanValue8));
                        SmartSpo2Setting service11 = HealthFunc.SMART_SPO2.INSTANCE.getService();
                        if (service11 != null) {
                            service11.setData(zBooleanValue8);
                        }
                    }
                    if (health != null && (spo2LowLevelRemindValue = health.getSpo2LowLevelRemindValue()) != null) {
                        HMLog.info(this.a.getName(), new d(spo2LowLevelRemindValue));
                        LowSpo2AlertSetting service12 = HealthFunc.LOW_SPO2_ALERT.INSTANCE.getService();
                        if (service12 != null) {
                            service12.setData(spo2LowLevelRemindValue.getValue());
                        }
                    }
                    if (health != null && (stepTarget = health.getStepTarget()) != null) {
                        HMLog.info(this.a.getName(), new e(stepTarget));
                        DeviceXFunctionsKt.getGoalFunctionsApi().postStepGoal(stepTarget.getValue());
                    }
                    if (health != null && (calorieTarget = health.getCalorieTarget()) != null) {
                        HMLog.info(this.a.getName(), new f(calorieTarget));
                        DeviceXFunctionsKt.getGoalFunctionsApi().postCalorieGoal(calorieTarget.getValue(), true);
                    }
                    if (health != null && (standUpRemindSwitch = health.getStandUpRemindSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber9 = this.a;
                        boolean zBooleanValue9 = standUpRemindSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber9.getName(), new g(zBooleanValue9));
                        StandAlertConfigManager.INSTANCE.getSInstance().setEnable(zBooleanValue9);
                    }
                    if (health != null && (standUpRemindStartTime = health.getStandUpRemindStartTime()) != null) {
                        HMLog.info(this.a.getName(), new h(standUpRemindStartTime));
                        StandAlertConfigManager.INSTANCE.getSInstance().setStart(standUpRemindStartTime);
                    }
                    if (health != null && (standUpRemindStopTime = health.getStandUpRemindStopTime()) != null) {
                        HMLog.info(this.a.getName(), new i(standUpRemindStopTime));
                        StandAlertConfigManager.INSTANCE.getSInstance().setEnd(standUpRemindStopTime);
                    }
                    if (health != null && (middyRestDndSwitch = health.getMiddyRestDndSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber10 = this.a;
                        boolean zBooleanValue10 = middyRestDndSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber10.getName(), new j(zBooleanValue10));
                        StandAlertConfigManager.INSTANCE.getSInstance().setDndEnable(zBooleanValue10);
                    }
                    if (health != null && (middyRestStartTime = health.getMiddyRestStartTime()) != null) {
                        HMLog.info(this.a.getName(), new k(middyRestStartTime));
                        StandAlertConfigManager.INSTANCE.getSInstance().setDndStart(middyRestStartTime);
                    }
                    if (health != null && (middyRestStopTime = health.getMiddyRestStopTime()) != null) {
                        HMLog.info(this.a.getName(), new m(middyRestStopTime));
                        StandAlertConfigManager.INSTANCE.getSInstance().setDndEnd(middyRestStopTime);
                    }
                    if (health != null && (targetAchieveRemindSwitch = health.getTargetAchieveRemindSwitch()) != null) {
                        HealthDeviceChangeSubscriber healthDeviceChangeSubscriber11 = this.a;
                        boolean zBooleanValue11 = targetAchieveRemindSwitch.booleanValue();
                        HMLog.info(healthDeviceChangeSubscriber11.getName(), new n(zBooleanValue11));
                        StandAlertConfigManager.INSTANCE.getSInstance().setTargetAchieveAlertEnable(zBooleanValue11);
                    }
                    if (health == null || (bloodPressureMonitorSwitch = health.getBloodPressureMonitorSwitch()) == null) {
                        return;
                    }
                    HealthDeviceChangeSubscriber healthDeviceChangeSubscriber12 = this.a;
                    boolean zBooleanValue12 = bloodPressureMonitorSwitch.booleanValue();
                    HMLog.info(healthDeviceChangeSubscriber12.getName(), new o(zBooleanValue12));
                    HealthFunc.SLEEPING_BLOOD_PRESSURE_MONITOR sleeping_blood_pressure_monitor = HealthFunc.SLEEPING_BLOOD_PRESSURE_MONITOR.INSTANCE;
                    SleepingBloodPressureMonitorSetting service13 = sleeping_blood_pressure_monitor != null ? sleeping_blood_pressure_monitor.getService() : null;
                    if (service13 == null) {
                        return;
                    }
                    service13.setData(zBooleanValue12);
                }
            };
            this.mSettingsChangeListener = changeListener;
            SettingsModule settingsModule = (SettingsModule) device.getChannelModule(SettingsModule.class);
            if (settingsModule == null) {
                return;
            }
            settingsModule.addListener(changeListener);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return "HealthDetect-DeviceChange";
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        if (device instanceof HMMiLiDevice) {
            a((HMMiLiDevice) device);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
        SettingsModule settingsModule;
        ChangeListener changeListener = this.mSettingsChangeListener;
        if (changeListener == null || (settingsModule = (SettingsModule) device.getChannelModule(SettingsModule.class)) == null) {
            return;
        }
        settingsModule.removeListener(changeListener);
    }
}
