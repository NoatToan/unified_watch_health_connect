package defpackage;

import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00017B\u000f\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J0\u0010%\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\n\u0010)\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\n\u0010+\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0011\u0010-\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b-\u0010\u0004J\u0011\u0010.\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b.\u0010\u0004J\u0010\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002H\u0016J\u0010\u00101\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002H\u0016J\u0011\u00102\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b2\u0010\u0004¨\u00068"}, d2 = {"Lch;", "Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "", "getAtrialFibEnable", "()Ljava/lang/Boolean;", "isEnable", "setAtrialFibEnable", "getAtrialAlertSleepNotDisturbEnable", "enableAtrialAlertSleepNotDisturb", "", "interval", "setHeartRate", "setSleepAssistantEnable", "getSleepAssistantEnable", "enableFull", "setHrInterval", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "enableOsa", "getOsaEnable", "enableSmartSpo2", "getSmartSpo2Enable", "value", "setLowSpo2AlertValue", "getLowSpo2AlertValue", "()Ljava/lang/Integer;", "setHrMaxValue", "getHrMaxValue", "enablePressure", "getPressureEnable", "enablePressureAlert", "getPressureAlertEnable", "hrEnable", "hrInterval", "hrSleepEnable", "atrialFibEnable", "isSupportAtrial", "recoverHrSetting", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setHrReminder", "getHrReminder", "setLowHrReminder", "getLowHrReminder", "setSportHeartRateEnable", "getSportHeartRateEnable", "getSleepingBloodPressureMonitorEnable", "enable", "setSleepingBloodPressureMonitorEnable", "setBodyEnergyEnable", "getBodyEnergyEnable", "Lzr;", "healthSetting", "<init>", "(Lzr;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ch implements HeartHealthApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f5323b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final zr f5324a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lch$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ch(@NotNull zr healthSetting) {
        Intrinsics.checkNotNullParameter(healthSetting, "healthSetting");
        this.f5324a = healthSetting;
    }

    public static final Void a() {
        t5t.d("HuamiOsHeartHealthImpl", "get hr max value is null");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableAtrialAlertSleepNotDisturb(boolean isEnable) {
        boolean zEnableAtrialAlertSleepNotDisturb = this.f5324a.enableAtrialAlertSleepNotDisturb(isEnable);
        t5t.d("HuamiOsHeartHealthImpl", "enable atrial alert sleep not disturb:" + isEnable + ", result:" + zEnableAtrialAlertSleepNotDisturb);
        return zEnableAtrialAlertSleepNotDisturb;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableFull(boolean isEnable, int interval) {
        boolean zA = this.f5324a.a(isEnable, interval);
        t5t.d("HuamiOsHeartHealthImpl", "set heart rate isEnable:" + isEnable + ", interval:" + interval + " result:" + zA);
        return zA;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableOsa(boolean isEnable) {
        boolean zEnableOsa = this.f5324a.enableOsa(isEnable);
        t5t.d("HuamiOsHeartHealthImpl", "set osa enable:" + isEnable + " result:" + zEnableOsa);
        return zEnableOsa;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enablePressure(boolean isEnable) {
        boolean zEnablePressure = this.f5324a.enablePressure(isEnable);
        t5t.d("HuamiOsHeartHealthImpl", "set pressure enable:" + isEnable + " result:" + zEnablePressure);
        return zEnablePressure;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enablePressureAlert(boolean isEnable) {
        boolean zEnablePressureAlert = this.f5324a.enablePressureAlert(isEnable);
        t5t.d("HuamiOsHeartHealthImpl", "set pressure alert:" + isEnable + ", result:" + zEnablePressureAlert);
        return zEnablePressureAlert;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableSmartSpo2(boolean isEnable) {
        boolean zA = this.f5324a.a(isEnable);
        t5t.d("HuamiOsHeartHealthImpl", "set smart osa enable:" + isEnable + ", result:" + zA);
        return zA;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getAtrialAlertSleepNotDisturbEnable() {
        Boolean atrialAlertSleepNotDisturbEnable = this.f5324a.getAtrialAlertSleepNotDisturbEnable();
        t5t.d("HuamiOsHeartHealthImpl", "get atrial alert sleep not disturb enable result:" + atrialAlertSleepNotDisturbEnable);
        return atrialAlertSleepNotDisturbEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getAtrialFibEnable() {
        Boolean atrialFibEnable = this.f5324a.getAtrialFibEnable();
        t5t.d("HuamiOsHeartHealthImpl", "read atrial fib enable result:" + atrialFibEnable);
        return atrialFibEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getBodyEnergyEnable() {
        Boolean boolD = this.f5324a.d();
        t5t.d("HuamiOsHeartHealthImpl", "get body energy enable result: " + boolD);
        return boolD;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HeartRateConfig getHeartRateConfig() {
        Integer numB = this.f5324a.b();
        t5t.d("HuamiOsHeartHealthImpl", "get heart rate interval, result:" + numB);
        if (numB != null) {
            return new HeartRateConfig(false, numB.intValue());
        }
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Integer getHrMaxValue() {
        Integer hrMaxValue = this.f5324a.getHrMaxValue();
        if (hrMaxValue == null) {
            return (Integer) a();
        }
        t5t.d("HuamiOsHeartHealthImpl", "get hr max value:" + hrMaxValue.intValue());
        return Integer.valueOf(hrMaxValue.intValue());
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HMHrReminder getHrReminder() {
        HMHrReminder hMHrReminderG = this.f5324a.g();
        t5t.d("HuamiOsHeartHealthImpl", "get high hr reminder, result:" + hMHrReminderG);
        return hMHrReminderG;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HMHrReminder getLowHrReminder() {
        HMHrReminder lowHrReminder = this.f5324a.getLowHrReminder();
        t5t.d("HuamiOsHeartHealthImpl", "get low hr reminder result:" + lowHrReminder);
        return lowHrReminder;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Integer getLowSpo2AlertValue() {
        Integer numC = this.f5324a.c();
        t5t.d("HuamiOsHeartHealthImpl", "get low osa alert value:" + numC);
        return numC;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getOsaEnable() {
        Boolean osaEnable = this.f5324a.getOsaEnable();
        t5t.d("HuamiOsHeartHealthImpl", "get osa enable result:" + osaEnable);
        return osaEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getPressureAlertEnable() {
        Boolean pressureAlertEnable = this.f5324a.getPressureAlertEnable();
        t5t.d("HuamiOsHeartHealthImpl", "get pressure alert enable:" + pressureAlertEnable);
        return pressureAlertEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getPressureEnable() {
        Boolean pressureEnable = this.f5324a.getPressureEnable();
        t5t.d("HuamiOsHeartHealthImpl", "get pressure enable result:" + pressureEnable);
        return pressureEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSleepAssistantEnable() {
        Boolean boolJ = this.f5324a.j();
        t5t.d("HuamiOsHeartHealthImpl", "get hr sleep result:" + boolJ);
        return boolJ;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSleepingBloodPressureMonitorEnable() {
        Boolean boolH = this.f5324a.h();
        t5t.d("HuamiOsHeartHealthImpl", "getSleepingBloodPressureMonitorEnable  result: " + boolH);
        return boolH;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSmartSpo2Enable() {
        Boolean boolI = this.f5324a.i();
        t5t.d("HuamiOsHeartHealthImpl", "get smart osa enable result:" + boolI);
        return boolI;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSportHeartRateEnable() {
        Boolean boolF = this.f5324a.f();
        t5t.d("HuamiOsHeartHealthImpl", "get sport heart rate enable, result:" + boolF);
        return boolF;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean recoverHrSetting(boolean hrEnable, int hrInterval, boolean hrSleepEnable, boolean atrialFibEnable, boolean isSupportAtrial) {
        boolean z = enableFull(hrEnable, hrInterval) && setSleepAssistantEnable(hrSleepEnable) && setAtrialFibEnable(atrialFibEnable);
        t5t.d("HuamiOsHeartHealthImpl", "recoverHrSetting result: " + z);
        return z;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setAtrialFibEnable(boolean isEnable) {
        boolean zJ = this.f5324a.j(isEnable);
        t5t.d("HuamiOsHeartHealthImpl", "set atrial fib enable, result:" + zJ);
        return zJ;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setBodyEnergyEnable(boolean enable) {
        boolean zH = this.f5324a.h(enable);
        t5t.d("HuamiOsHeartHealthImpl", "set body energy enable: " + enable + ", result: " + zH);
        return zH;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHeartRate(boolean isEnable, int interval) {
        boolean z = enableFull(isEnable, interval) && setSleepAssistantEnable(isEnable);
        t5t.d("HuamiOsHeartHealthImpl", "set heart rate result: " + z);
        return z;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrInterval(int interval) {
        boolean zA = this.f5324a.a(interval > 0, interval);
        t5t.d("HuamiOsHeartHealthImpl", "set heart rate interval:" + interval + " result:" + zA);
        return zA;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrMaxValue(int value) {
        boolean hrMaxValue = this.f5324a.setHrMaxValue(value);
        t5t.d("HuamiOsHeartHealthImpl", "set hr max value:" + value + ", result:" + hrMaxValue);
        return hrMaxValue;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrReminder(@NotNull HMHrReminder hrReminder) {
        Intrinsics.checkNotNullParameter(hrReminder, "hrReminder");
        boolean zA = this.f5324a.a(hrReminder);
        t5t.d("HuamiOsHeartHealthImpl", "set high hr reminder:" + hrReminder + " result:" + zA);
        return zA;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setLowHrReminder(@NotNull HMHrReminder hrReminder) {
        Intrinsics.checkNotNullParameter(hrReminder, "hrReminder");
        boolean lowHrReminder = this.f5324a.setLowHrReminder(hrReminder);
        t5t.d("HuamiOsHeartHealthImpl", "set low hr reminder:" + hrReminder + ", result:" + lowHrReminder);
        return lowHrReminder;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setLowSpo2AlertValue(int value) {
        boolean zB = this.f5324a.b(value);
        t5t.d("HuamiOsHeartHealthImpl", "set low osa alert:" + value + ", result:" + zB);
        return zB;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSleepAssistantEnable(boolean isEnable) {
        boolean zE = this.f5324a.e(isEnable);
        t5t.d("HuamiOsHeartHealthImpl", "set hr sleep enable:" + isEnable + " result:" + zE);
        return zE;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSleepingBloodPressureMonitorEnable(boolean enable) {
        boolean zL = this.f5324a.l(enable);
        t5t.d("HuamiOsHeartHealthImpl", "setSleepingBloodPressureMonitorEnable " + enable + " and result: " + zL);
        return zL;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSportHeartRateEnable(boolean isEnable) {
        boolean zC = this.f5324a.c(isEnable);
        t5t.d("HuamiOsHeartHealthImpl", "set sport heart rate enable:" + isEnable + "  result:" + zC);
        return zC;
    }
}
