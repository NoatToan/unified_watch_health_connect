package com.huami.bluetooth.profile.channel.module.health.impl;

import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.huami.bluetooth.profile.ecf.EcfController;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import com.xiaomi.hm.health.bt.profile.hr.HmNewHeartRateController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B#\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207¢\u0006\u0004\b;\u0010<J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J0\u0010#\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0016J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016J\n\u0010'\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016J\n\u0010)\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010+\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b+\u0010\u0004J\u0011\u0010,\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b,\u0010\u0004J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/health/impl/HeartHealthImpl;", "Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "", "getAtrialFibEnable", "()Ljava/lang/Boolean;", "isEnable", "setAtrialFibEnable", "getAtrialAlertSleepNotDisturbEnable", "enableAtrialAlertSleepNotDisturb", "", "interval", "setHeartRate", "setSleepAssistantEnable", "getSleepAssistantEnable", "enableFull", "setHrInterval", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "enableOsa", "getOsaEnable", "enableSmartSpo2", "getSmartSpo2Enable", "value", "setLowSpo2AlertValue", "getLowSpo2AlertValue", "()Ljava/lang/Integer;", "enablePressure", "getPressureEnable", "enablePressureAlert", "getPressureAlertEnable", "hrEnable", "hrInterval", "hrSleepEnable", "atrialFibEnable", "isSupportAtrial", "recoverHrSetting", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setHrReminder", "getHrReminder", "setLowHrReminder", "getLowHrReminder", "setSportHeartRateEnable", "getSportHeartRateEnable", "getSleepingBloodPressureMonitorEnable", "enable", "setSleepingBloodPressureMonitorEnable", "Lcom/huami/bluetooth/profile/ecf/EcfController;", "a", "Lcom/huami/bluetooth/profile/ecf/EcfController;", "ecfController", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController;", "b", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController;", "heartRateController", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "c", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "deviceFeature", "<init>", "(Lcom/huami/bluetooth/profile/ecf/EcfController;Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HeartHealthImpl implements HeartHealthApi {

    @NotNull
    private static final String d = "HeartHealthImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final EcfController ecfController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMHeartRateController heartRateController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Feature deviceFeature;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            Debug.fi(HeartHealthImpl.d, "set osa enable fail by device not support");
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            Debug.fi(HeartHealthImpl.d, "set pressure enable:" + this.a + " fail by null");
            return false;
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
            Debug.fi(HeartHealthImpl.d, "read atrial fib enable fail by null");
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
            Debug.fi(HeartHealthImpl.d, "get osa enable fail by null");
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
            Debug.fi(HeartHealthImpl.d, "get pressure enable fail by null");
            return null;
        }
    }

    public HeartHealthImpl(@Nullable EcfController ecfController, @NotNull HMHeartRateController hMHeartRateController, @NotNull Feature feature) {
        this.ecfController = ecfController;
        this.heartRateController = hMHeartRateController;
        this.deviceFeature = feature;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableAtrialAlertSleepNotDisturb(boolean isEnable) {
        Debug.fi(d, "not support enableAtrialAlertSleepNotDisturb");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableFull(boolean isEnable, int interval) {
        boolean zEnableFull = this.heartRateController.enableFull(isEnable, interval);
        Debug.fi(d, "set heart rate isEnable:" + isEnable + ", interval:" + interval + " result:" + zEnableFull);
        return zEnableFull;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableOsa(boolean isEnable) {
        EcfController ecfController = this.ecfController;
        Boolean boolValueOf = ecfController == null ? null : Boolean.valueOf(ecfController.setOsaEnable(isEnable, this.deviceFeature.hasSw(34)));
        Debug.fi(d, "set osa enable:" + isEnable + " result:" + boolValueOf);
        return boolValueOf == null ? ((Boolean) a.a.invoke()).booleanValue() : boolValueOf.booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enablePressure(boolean isEnable) {
        Boolean pressEnable;
        EcfController ecfController = this.ecfController;
        Boolean bool = null;
        if (ecfController != null && (pressEnable = ecfController.setPressEnable(isEnable)) != null) {
            Debug.fi(d, "set pressure enable:" + isEnable + " result:" + pressEnable.booleanValue());
            bool = pressEnable;
        }
        return bool == null ? ((Boolean) new b(isEnable).invoke()).booleanValue() : bool.booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enablePressureAlert(boolean isEnable) {
        Debug.fi(d, "not support getAtrialAlertSleepNotDisturbEnable");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableSmartSpo2(boolean isEnable) {
        Debug.fi(d, "not support getAtrialAlertSleepNotDisturbEnable");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getAtrialAlertSleepNotDisturbEnable() {
        Debug.fi(d, "not support getAtrialAlertSleepNotDisturbEnable");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getAtrialFibEnable() {
        Boolean atrialFibEnable;
        EcfController ecfController = this.ecfController;
        Boolean bool = null;
        if (ecfController != null) {
            if (!(this.heartRateController instanceof HmNewHeartRateController)) {
                ecfController = null;
            }
            if (ecfController != null && (atrialFibEnable = ecfController.readAtrialFibEnable()) != null) {
                Debug.fi(d, Intrinsics.stringPlus("read atrial fib enable result:", Boolean.valueOf(atrialFibEnable.booleanValue())));
                bool = atrialFibEnable;
            }
        }
        return bool == null ? (Boolean) c.a.invoke() : bool;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HeartRateConfig getHeartRateConfig() {
        return this.heartRateController.getHeartRateConfig();
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HMHrReminder getHrReminder() {
        Debug.fi(d, "get high hr reminder config not support");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HMHrReminder getLowHrReminder() {
        Debug.fi(d, "get low hr reminder config not support");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Integer getLowSpo2AlertValue() {
        Debug.fi(d, "not support getAtrialAlertSleepNotDisturbEnable");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getOsaEnable() {
        Boolean bool = null;
        if ((this.deviceFeature.hasSw(34) ? this : null) != null) {
            EcfController ecfController = this.ecfController;
            Boolean osaEnable = ecfController == null ? null : ecfController.getOsaEnable();
            if (osaEnable != null) {
                Debug.fi(d, Intrinsics.stringPlus("get osa enable result:", Boolean.valueOf(osaEnable.booleanValue())));
                bool = osaEnable;
            }
        }
        return bool == null ? (Boolean) d.a.invoke() : bool;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getPressureAlertEnable() {
        Debug.fi(d, "not support getAtrialAlertSleepNotDisturbEnable");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getPressureEnable() {
        Boolean pressEnable;
        EcfController ecfController = this.ecfController;
        Boolean bool = null;
        if (ecfController != null && (pressEnable = ecfController.getPressEnable()) != null) {
            Debug.fi(d, Intrinsics.stringPlus("get pressure enable result:", Boolean.valueOf(pressEnable.booleanValue())));
            bool = pressEnable;
        }
        return bool == null ? (Boolean) e.a.invoke() : bool;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSleepAssistantEnable() {
        if (!this.deviceFeature.hasSw(34) || this.deviceFeature.hasSw(7)) {
            HeartRateConfig heartRateConfig = getHeartRateConfig();
            if (heartRateConfig == null) {
                return null;
            }
            return Boolean.valueOf(heartRateConfig.isSleepAuxiliary());
        }
        EcfController ecfController = this.ecfController;
        if (ecfController == null) {
            return null;
        }
        return ecfController.getRemEnable();
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSleepingBloodPressureMonitorEnable() {
        Debug.fi(d, "getSleepingBloodPressureMonitorEnable config not support");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSmartSpo2Enable() {
        Debug.fi(d, "not support getAtrialAlertSleepNotDisturbEnable");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSportHeartRateEnable() {
        Debug.fi(d, "get sport heart rate enable not support");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean recoverHrSetting(boolean hrEnable, int hrInterval, boolean hrSleepEnable, boolean atrialFibEnable, boolean isSupportAtrial) {
        boolean z;
        if (!this.deviceFeature.hasSw(34)) {
            boolean zHasSw = this.deviceFeature.hasSw(7);
            boolean atrialFibEnable2 = (!isSupportAtrial || atrialFibEnable) ? true : setAtrialFibEnable(false);
            if (!hrEnable && !hrSleepEnable) {
                if (zHasSw) {
                    atrialFibEnable2 = atrialFibEnable2 && setSleepAssistantEnable(false);
                }
                if (atrialFibEnable2 && setHeartRate(false, hrInterval)) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (hrEnable && !hrSleepEnable) {
                if (zHasSw) {
                    atrialFibEnable2 = atrialFibEnable2 && setSleepAssistantEnable(false);
                }
                if (atrialFibEnable2 && enableFull(true, hrInterval)) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (!hrEnable && hrSleepEnable) {
                if (zHasSw) {
                    atrialFibEnable2 = atrialFibEnable2 && enableFull(false, hrInterval);
                }
                if (atrialFibEnable2 && setSleepAssistantEnable(true)) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (zHasSw) {
                if ((atrialFibEnable2 && setSleepAssistantEnable(true)) && enableFull(true, hrInterval)) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (atrialFibEnable2 && setHeartRate(true, hrInterval)) {
                z = true;
            } else {
                z = false;
            }
            if (!isSupportAtrial || !atrialFibEnable) {
                return z;
            }
            if (!z || !setAtrialFibEnable(true)) {
                return false;
            }
        } else if (!enableFull(hrEnable, hrInterval) || !setSleepAssistantEnable(hrSleepEnable) || !setAtrialFibEnable(atrialFibEnable)) {
            return false;
        }
        return true;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setAtrialFibEnable(boolean isEnable) {
        boolean zEnableAtrialFib = this.heartRateController.enableAtrialFib(isEnable);
        Debug.fi(d, Intrinsics.stringPlus("set atrial fib enable, result:", Boolean.valueOf(zEnableAtrialFib)));
        return zEnableAtrialFib;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHeartRate(boolean isEnable, int interval) {
        return this.heartRateController.enableHeartRate(isEnable, interval);
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrInterval(int interval) {
        boolean hrInterval = this.heartRateController.setHrInterval(interval);
        Debug.fi(d, "set heart rate interval:" + interval + " result:" + hrInterval);
        return hrInterval;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrReminder(@NotNull HMHrReminder hrReminder) {
        EcfController ecfController = this.ecfController;
        boolean z = false;
        if (ecfController != null && ecfController.setMiliHrReminder(hrReminder)) {
            z = true;
        }
        Debug.fi(d, "set high hr reminder:" + hrReminder + " result:" + z);
        return z;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setLowHrReminder(@NotNull HMHrReminder hrReminder) {
        Debug.fi(d, "set low hr reminder config not support");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setLowSpo2AlertValue(int value) {
        Debug.fi(d, "not support getAtrialAlertSleepNotDisturbEnable");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSleepAssistantEnable(boolean isEnable) {
        boolean zEnableSleepAssist = false;
        if (this.deviceFeature.hasSw(34) || !this.deviceFeature.hasSw(7)) {
            zEnableSleepAssist = this.heartRateController.enableSleepAssist(isEnable);
        } else {
            EcfController ecfController = this.ecfController;
            if (ecfController != null && ecfController.setHrSleepEnable(isEnable)) {
                zEnableSleepAssist = true;
            }
        }
        Debug.fi(d, "set sleep assistant enable:" + isEnable + " result:" + zEnableSleepAssist);
        return zEnableSleepAssist;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSleepingBloodPressureMonitorEnable(boolean enable) {
        Debug.fi(d, "setSleepingBloodPressureMonitorEnable config not support");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSportHeartRateEnable(boolean isEnable) {
        EcfController ecfController = this.ecfController;
        boolean z = false;
        if (ecfController != null && ecfController.setSportHrEnable(isEnable)) {
            z = true;
        }
        Debug.fi(d, "set sport heart rate enable:" + isEnable + "  result:" + z);
        return z;
    }

    public /* synthetic */ HeartHealthImpl(EcfController ecfController, HMHeartRateController hMHeartRateController, Feature feature, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ecfController, hMHeartRateController, feature);
    }
}
