package com.huami.bluetooth.profile.channel.module.health.impl;

import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.huami.bluetooth.profile.channel.module.settings.SettingsApi;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\b3\u00104J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J0\u0010#\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0016J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016J\n\u0010'\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016J\n\u0010)\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010+\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b+\u0010\u0004J\u0011\u0010,\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b,\u0010\u0004J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00066"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/health/impl/HuamiOsHeartHealthImpl;", "Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "", "getAtrialFibEnable", "()Ljava/lang/Boolean;", "isEnable", "setAtrialFibEnable", "getAtrialAlertSleepNotDisturbEnable", "enableAtrialAlertSleepNotDisturb", "", "interval", "setHeartRate", "setSleepAssistantEnable", "getSleepAssistantEnable", "enableFull", "setHrInterval", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "enableOsa", "getOsaEnable", "enableSmartSpo2", "getSmartSpo2Enable", "value", "setLowSpo2AlertValue", "getLowSpo2AlertValue", "()Ljava/lang/Integer;", "enablePressure", "getPressureEnable", "enablePressureAlert", "getPressureAlertEnable", "hrEnable", "hrInterval", "hrSleepEnable", "atrialFibEnable", "isSupportAtrial", "recoverHrSetting", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setHrReminder", "getHrReminder", "setLowHrReminder", "getLowHrReminder", "setSportHeartRateEnable", "getSportHeartRateEnable", "getSleepingBloodPressureMonitorEnable", "enable", "setSleepingBloodPressureMonitorEnable", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsApi;", "a", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsApi;", "healthSetting", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HuamiOsHeartHealthImpl implements HeartHealthApi {

    @NotNull
    private static final String b = "HuamiOsHeartHealthImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SettingsApi healthSetting;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get atrial alert sleep not disturb enable fail by null");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "read atrial fib enable fail by null");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get heart rate interval fail");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get high hr reminder result fail by null");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0 {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get low hr reminder fail by null");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0 {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get low osa alert fail by null");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0 {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get osa enable fail by null");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0 {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get pressure alert enable fail by null");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0 {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get pressure enable fail by null");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0 {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get hr sleep fail");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0 {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get smart osa enable fail by null");
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0 {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HuamiOsHeartHealthImpl.b, "get sport heart rate enable fail by null");
            return null;
        }
    }

    public HuamiOsHeartHealthImpl(@NotNull SettingsApi settingsApi) {
        this.healthSetting = settingsApi;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableAtrialAlertSleepNotDisturb(boolean isEnable) {
        boolean zEnableAtrialAlertSleepNotDisturb = this.healthSetting.enableAtrialAlertSleepNotDisturb(isEnable);
        Debug.fi(b, "enable atrial alert sleep not disturb:" + isEnable + ", result:" + zEnableAtrialAlertSleepNotDisturb);
        return zEnableAtrialAlertSleepNotDisturb;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableFull(boolean isEnable, int interval) {
        boolean alldayHeartRate = this.healthSetting.setAlldayHeartRate(isEnable, interval);
        Debug.fi(b, "set heart rate isEnable:" + isEnable + ", interval:" + interval + " result:" + alldayHeartRate);
        return alldayHeartRate;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableOsa(boolean isEnable) {
        boolean zEnableOsa = this.healthSetting.enableOsa(isEnable);
        Debug.fi(b, "set osa enable:" + isEnable + " result:" + zEnableOsa);
        return zEnableOsa;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enablePressure(boolean isEnable) {
        boolean zEnablePressure = this.healthSetting.enablePressure(isEnable);
        Debug.fi(b, "set pressure enable:" + isEnable + " result:" + zEnablePressure);
        return zEnablePressure;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enablePressureAlert(boolean isEnable) {
        boolean zEnablePressureAlert = this.healthSetting.enablePressureAlert(isEnable);
        Debug.fi(b, "set pressure alert:" + isEnable + ", result:" + zEnablePressureAlert);
        return zEnablePressureAlert;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableSmartSpo2(boolean isEnable) {
        boolean smartSpo2 = this.healthSetting.setSmartSpo2(isEnable);
        Debug.fi(b, "set smart osa enable:" + isEnable + ", result:" + smartSpo2);
        return smartSpo2;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getAtrialAlertSleepNotDisturbEnable() {
        Boolean atrialAlertSleepNotDisturbEnable = this.healthSetting.getAtrialAlertSleepNotDisturbEnable();
        if (atrialAlertSleepNotDisturbEnable == null) {
            atrialAlertSleepNotDisturbEnable = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("get atrial alert sleep not disturb enable result:", Boolean.valueOf(atrialAlertSleepNotDisturbEnable.booleanValue())));
        }
        return atrialAlertSleepNotDisturbEnable == null ? (Boolean) a.a.invoke() : atrialAlertSleepNotDisturbEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getAtrialFibEnable() {
        Boolean atrialFibEnable = this.healthSetting.getAtrialFibEnable();
        if (atrialFibEnable == null) {
            atrialFibEnable = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("read atrial fib enable result:", Boolean.valueOf(atrialFibEnable.booleanValue())));
        }
        return atrialFibEnable == null ? (Boolean) b.a.invoke() : atrialFibEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HeartRateConfig getHeartRateConfig() {
        HeartRateConfig heartRateConfig;
        Integer heartRateInterval = this.healthSetting.getHeartRateInterval();
        if (heartRateInterval == null) {
            heartRateConfig = null;
        } else {
            int iIntValue = heartRateInterval.intValue();
            Debug.fi(b, Intrinsics.stringPlus("get heart rate interval, result:", Integer.valueOf(iIntValue)));
            heartRateConfig = new HeartRateConfig(false, iIntValue);
        }
        return heartRateConfig == null ? (HeartRateConfig) c.a.invoke() : heartRateConfig;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HMHrReminder getHrReminder() {
        HMHrReminder highHrReminder = this.healthSetting.getHighHrReminder();
        if (highHrReminder == null) {
            highHrReminder = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("get high hr reminder, result:", highHrReminder));
        }
        return highHrReminder == null ? (HMHrReminder) d.a.invoke() : highHrReminder;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HMHrReminder getLowHrReminder() {
        HMHrReminder lowHrReminder = this.healthSetting.getLowHrReminder();
        if (lowHrReminder == null) {
            lowHrReminder = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("get low hr reminder result:", lowHrReminder));
        }
        return lowHrReminder == null ? (HMHrReminder) e.a.invoke() : lowHrReminder;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Integer getLowSpo2AlertValue() {
        Integer lowSpo2Alert = this.healthSetting.getLowSpo2Alert();
        if (lowSpo2Alert == null) {
            lowSpo2Alert = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("get low osa alert value:", Integer.valueOf(lowSpo2Alert.intValue())));
        }
        return lowSpo2Alert == null ? (Integer) f.a.invoke() : lowSpo2Alert;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getOsaEnable() {
        Boolean osaEnable = this.healthSetting.getOsaEnable();
        if (osaEnable == null) {
            osaEnable = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("get osa enable result:", Boolean.valueOf(osaEnable.booleanValue())));
        }
        return osaEnable == null ? (Boolean) g.a.invoke() : osaEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getPressureAlertEnable() {
        Boolean pressureAlertEnable = this.healthSetting.getPressureAlertEnable();
        if (pressureAlertEnable == null) {
            pressureAlertEnable = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("get pressure alert enable:$", Boolean.valueOf(pressureAlertEnable.booleanValue())));
        }
        return pressureAlertEnable == null ? (Boolean) h.a.invoke() : pressureAlertEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getPressureEnable() {
        Boolean pressureEnable = this.healthSetting.getPressureEnable();
        if (pressureEnable == null) {
            pressureEnable = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("get pressure enable result:", Boolean.valueOf(pressureEnable.booleanValue())));
        }
        return pressureEnable == null ? (Boolean) i.a.invoke() : pressureEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSleepAssistantEnable() {
        Boolean hrSleepEnable = this.healthSetting.getHrSleepEnable();
        if (hrSleepEnable == null) {
            hrSleepEnable = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("get hr sleep result:", Boolean.valueOf(hrSleepEnable.booleanValue())));
        }
        return hrSleepEnable == null ? (Boolean) j.a.invoke() : hrSleepEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSleepingBloodPressureMonitorEnable() {
        Boolean sleepingBloodPressureMonitor = this.healthSetting.getSleepingBloodPressureMonitor();
        Debug.fi(b, Intrinsics.stringPlus("getSleepingBloodPressureMonitorEnable  result: ", sleepingBloodPressureMonitor));
        return sleepingBloodPressureMonitor;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSmartSpo2Enable() {
        Boolean smartSpo2 = this.healthSetting.getSmartSpo2();
        if (smartSpo2 == null) {
            smartSpo2 = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("get smart osa enable result:", Boolean.valueOf(smartSpo2.booleanValue())));
        }
        return smartSpo2 == null ? (Boolean) k.a.invoke() : smartSpo2;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSportHeartRateEnable() {
        Boolean sportHeartRate = this.healthSetting.getSportHeartRate();
        if (sportHeartRate == null) {
            sportHeartRate = null;
        } else {
            Debug.fi(b, Intrinsics.stringPlus("get sport heart rate enable, result:", Boolean.valueOf(sportHeartRate.booleanValue())));
        }
        return sportHeartRate == null ? (Boolean) l.a.invoke() : sportHeartRate;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean recoverHrSetting(boolean hrEnable, int hrInterval, boolean hrSleepEnable, boolean atrialFibEnable, boolean isSupportAtrial) {
        return enableFull(hrEnable, hrInterval) && setSleepAssistantEnable(hrSleepEnable) && setAtrialFibEnable(atrialFibEnable);
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setAtrialFibEnable(boolean isEnable) {
        boolean zEnableAtrialFib = this.healthSetting.enableAtrialFib(isEnable);
        Debug.fi(b, Intrinsics.stringPlus("set atrial fib enable, result:", Boolean.valueOf(zEnableAtrialFib)));
        return zEnableAtrialFib;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHeartRate(boolean isEnable, int interval) {
        return enableFull(isEnable, interval) && setSleepAssistantEnable(isEnable);
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrInterval(int interval) {
        boolean alldayHeartRate = this.healthSetting.setAlldayHeartRate(interval > 0, interval);
        Debug.fi(b, "set heart rate interval:" + interval + " result:" + alldayHeartRate);
        return alldayHeartRate;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrReminder(@NotNull HMHrReminder hrReminder) {
        boolean highHrReminder = this.healthSetting.setHighHrReminder(hrReminder);
        Debug.fi(b, "set high hr reminder:" + hrReminder + " result:" + highHrReminder);
        return highHrReminder;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setLowHrReminder(@NotNull HMHrReminder hrReminder) {
        boolean lowHrReminder = this.healthSetting.setLowHrReminder(hrReminder);
        Debug.fi(b, "set low hr reminder:" + hrReminder + ", result:" + lowHrReminder);
        return lowHrReminder;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setLowSpo2AlertValue(int value) {
        boolean lowSpo2Alert = this.healthSetting.setLowSpo2Alert(value);
        Debug.fi(b, "set low osa alert:" + value + ", result:" + lowSpo2Alert);
        return lowSpo2Alert;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSleepAssistantEnable(boolean isEnable) {
        boolean zEnableHrSleep = this.healthSetting.enableHrSleep(isEnable);
        Debug.fi(b, "set hr sleep enable:" + isEnable + " result:" + zEnableHrSleep);
        return zEnableHrSleep;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSleepingBloodPressureMonitorEnable(boolean enable) {
        boolean sleepingBloodPressureMonitor = this.healthSetting.setSleepingBloodPressureMonitor(enable);
        Debug.fi(b, "setSleepingBloodPressureMonitorEnable " + enable + " and result: " + sleepingBloodPressureMonitor);
        return sleepingBloodPressureMonitor;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSportHeartRateEnable(boolean isEnable) {
        boolean zEnableSportHeartRate = this.healthSetting.enableSportHeartRate(isEnable);
        Debug.fi(b, "set sport heart rate enable:" + isEnable + "  result:" + zEnableSportHeartRate);
        return zEnableSportHeartRate;
    }
}
