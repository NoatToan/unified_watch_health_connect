package defpackage;

import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001BB#\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0007J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0007J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u0007J\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0007J\u0011\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b!\u0010\u0004J7\u0010'\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0011\u0010-\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b/\u0010,J\u0011\u00100\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b0\u0010.J\u0017\u00101\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u0010\u0007J\u0011\u00102\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b2\u0010\u0004J\u0011\u00103\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b3\u0010\u0004J\u0017\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u0010\u0007J\u0017\u00106\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u0010\u0012J\u0011\u00107\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b7\u0010\u001dJ\u0017\u00108\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u0002H\u0016¢\u0006\u0004\b8\u0010\u0007J\u000f\u00109\u001a\u00020\u0002H\u0016¢\u0006\u0004\b9\u0010\u0004¨\u0006C"}, d2 = {"Lhg;", "Lcom/huami/bluetooth/profile/channel/module/health/HeartHealthApi;", "", "getAtrialFibEnable", "()Ljava/lang/Boolean;", "isEnable", "setAtrialFibEnable", "(Z)Z", "getAtrialAlertSleepNotDisturbEnable", "enableAtrialAlertSleepNotDisturb", "", "interval", "setHeartRate", "(ZI)Z", "setSleepAssistantEnable", "getSleepAssistantEnable", "enableFull", "setHrInterval", "(I)Z", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "()Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "enableOsa", "getOsaEnable", "enableSmartSpo2", "getSmartSpo2Enable", "value", "setLowSpo2AlertValue", "getLowSpo2AlertValue", "()Ljava/lang/Integer;", "enablePressure", "getPressureEnable", "enablePressureAlert", "getPressureAlertEnable", "hrEnable", "hrInterval", "hrSleepEnable", "atrialFibEnable", "isSupportAtrial", "recoverHrSetting", "(ZIZZZ)Z", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setHrReminder", "(Lcom/xiaomi/hm/health/bt/model/HMHrReminder;)Z", "getHrReminder", "()Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "setLowHrReminder", "getLowHrReminder", "setSportHeartRateEnable", "getSportHeartRateEnable", "getSleepingBloodPressureMonitorEnable", "enable", "setSleepingBloodPressureMonitorEnable", "setHrMaxValue", "getHrMaxValue", "setBodyEnergyEnable", "getBodyEnergyEnable", "Lb9;", "ecfController", "Lkvs;", "heartRateController", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "deviceFeature", "<init>", "(Lb9;Lkvs;Lcom/xiaomi/hm/health/bt/profile/feature/Feature;)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class hg implements HeartHealthApi {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final b9 f20030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kvs f20031b;

    @NotNull
    public final Feature c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lhg$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public hg(@Nullable b9 b9Var, @NotNull kvs heartRateController, @NotNull Feature deviceFeature) {
        Intrinsics.checkNotNullParameter(heartRateController, "heartRateController");
        Intrinsics.checkNotNullParameter(deviceFeature, "deviceFeature");
        this.f20030a = b9Var;
        this.f20031b = heartRateController;
        this.c = deviceFeature;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableAtrialAlertSleepNotDisturb(boolean isEnable) {
        t5t.d("HeartHealthImpl", "not support enableAtrialAlertSleepNotDisturb");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableFull(boolean isEnable, int interval) {
        boolean zA = this.f20031b.a(isEnable, interval);
        t5t.d("HeartHealthImpl", "set heart rate isEnable:" + isEnable + ", interval:" + interval + " result:" + zA);
        return zA;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableOsa(boolean isEnable) {
        b9 b9Var = this.f20030a;
        Boolean boolValueOf = b9Var != null ? Boolean.valueOf(b9Var.a(isEnable, this.c.hasSw(34))) : null;
        t5t.d("HeartHealthImpl", "set osa enable:" + isEnable + " result:" + boolValueOf);
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enablePressure(boolean isEnable) {
        b9 b9Var = this.f20030a;
        Boolean boolA = b9Var != null ? b9Var.a(isEnable) : null;
        t5t.d("HeartHealthImpl", "set pressure enable:" + isEnable + " result:" + boolA);
        if (boolA != null) {
            return boolA.booleanValue();
        }
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enablePressureAlert(boolean isEnable) {
        t5t.d("HeartHealthImpl", "not support getAtrialAlertSleepNotDisturbEnable");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean enableSmartSpo2(boolean isEnable) {
        if ((this.c.hasSw(59) ? this : null) != null) {
            b9 b9Var = this.f20030a;
            Boolean boolValueOf = b9Var != null ? Boolean.valueOf(b9Var.enableSmartSpo2(isEnable)) : null;
            if (boolValueOf != null) {
                t5t.d("HeartHealthImpl", "set smart spo2 result:" + boolValueOf.booleanValue());
                return boolValueOf.booleanValue();
            }
        }
        t5t.d("HeartHealthImpl", "set smart spo2 fail by null");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getAtrialAlertSleepNotDisturbEnable() {
        t5t.d("HeartHealthImpl", "not support getAtrialAlertSleepNotDisturbEnable");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getAtrialFibEnable() {
        b9 b9Var = this.f20030a;
        Boolean boolC = null;
        if (b9Var != null) {
            if (!(this.f20031b instanceof xg)) {
                b9Var = null;
            }
            if (b9Var != null) {
                boolC = b9Var.c();
            }
        }
        t5t.d("HeartHealthImpl", "read atrial fib enable result:" + boolC);
        return boolC;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @NotNull
    public Boolean getBodyEnergyEnable() {
        t5t.d("HeartHealthImpl", "not support body energy");
        return Boolean.FALSE;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HeartRateConfig getHeartRateConfig() {
        return this.f20031b.b();
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Integer getHrMaxValue() {
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HMHrReminder getHrReminder() {
        t5t.d("HeartHealthImpl", "get high hr reminder config not support");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public HMHrReminder getLowHrReminder() {
        t5t.d("HeartHealthImpl", "get low hr reminder config not support");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Integer getLowSpo2AlertValue() {
        if ((this.c.hasSw(59) ? this : null) != null) {
            b9 b9Var = this.f20030a;
            Integer lowSpo2AlertValue = b9Var != null ? b9Var.getLowSpo2AlertValue() : null;
            if (lowSpo2AlertValue != null) {
                t5t.d("HeartHealthImpl", "get low spo2 result:" + lowSpo2AlertValue.intValue());
                return Integer.valueOf(lowSpo2AlertValue.intValue());
            }
        }
        t5t.d("HeartHealthImpl", "get low spo2 fail by null");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getOsaEnable() {
        b9 b9Var;
        Boolean osaEnable = null;
        if ((this.c.hasSw(34) ? this : null) != null && (b9Var = this.f20030a) != null) {
            osaEnable = b9Var.getOsaEnable();
        }
        t5t.d("HeartHealthImpl", "get osa enable result:" + osaEnable);
        return osaEnable;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getPressureAlertEnable() {
        t5t.d("HeartHealthImpl", "not support getAtrialAlertSleepNotDisturbEnable");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getPressureEnable() {
        b9 b9Var = this.f20030a;
        Boolean boolD = b9Var != null ? b9Var.d() : null;
        t5t.d("HeartHealthImpl", "get pressure enable result:" + this);
        return boolD;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSleepAssistantEnable() {
        Boolean boolValueOf;
        if (!this.c.hasSw(34) || this.c.hasSw(7)) {
            HeartRateConfig heartRateConfig = getHeartRateConfig();
            if (heartRateConfig != null) {
                boolValueOf = Boolean.valueOf(heartRateConfig.isSleepAuxiliary());
            } else {
                boolValueOf = null;
            }
        } else {
            b9 b9Var = this.f20030a;
            if (b9Var != null) {
                boolValueOf = b9Var.b();
            } else {
                boolValueOf = null;
            }
        }
        t5t.d("HeartHealthImpl", "get sleep assistant enable result: " + boolValueOf);
        return boolValueOf;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSleepingBloodPressureMonitorEnable() {
        t5t.d("HeartHealthImpl", "getSleepingBloodPressureMonitorEnable config not support");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSmartSpo2Enable() {
        if ((this.c.hasSw(59) ? this : null) != null) {
            b9 b9Var = this.f20030a;
            Boolean smartSpo2Enable = b9Var != null ? b9Var.getSmartSpo2Enable() : null;
            if (smartSpo2Enable != null) {
                t5t.d("HeartHealthImpl", "get smart spo2 result:" + smartSpo2Enable.booleanValue());
                return smartSpo2Enable;
            }
        }
        t5t.d("HeartHealthImpl", "get smart spo2 fail by null");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    @Nullable
    public Boolean getSportHeartRateEnable() {
        t5t.d("HeartHealthImpl", "get sport heart rate enable not support");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00a1  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (setHeartRate(false, r6) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (enableFull(true, r6) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0076, code lost:
    
        if (setSleepAssistantEnable(true) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0092, code lost:
    
        r5 = true;
     */
    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean recoverHrSetting(boolean r5, int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            com.xiaomi.hm.health.bt.profile.feature.Feature r0 = r4.c
            r1 = 34
            boolean r0 = r0.hasSw(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            boolean r5 = r4.enableFull(r5, r6)
            if (r5 == 0) goto La4
            boolean r5 = r4.setSleepAssistantEnable(r7)
            if (r5 == 0) goto La4
            boolean r5 = r4.setAtrialFibEnable(r8)
            if (r5 == 0) goto La4
            goto La1
        L20:
            com.xiaomi.hm.health.bt.profile.feature.Feature r0 = r4.c
            r3 = 7
            boolean r0 = r0.hasSw(r3)
            if (r9 == 0) goto L30
            if (r8 != 0) goto L30
            boolean r3 = r4.setAtrialFibEnable(r1)
            goto L31
        L30:
            r3 = r2
        L31:
            if (r5 != 0) goto L49
            if (r7 != 0) goto L49
            if (r0 == 0) goto L40
            if (r3 == 0) goto L94
            boolean r5 = r4.setSleepAssistantEnable(r1)
            if (r5 == 0) goto L94
            goto L42
        L40:
            if (r3 == 0) goto L94
        L42:
            boolean r5 = r4.setHeartRate(r1, r6)
            if (r5 == 0) goto L94
            goto L92
        L49:
            if (r5 == 0) goto L61
            if (r7 != 0) goto L61
            if (r0 == 0) goto L58
            if (r3 == 0) goto L94
            boolean r5 = r4.setSleepAssistantEnable(r1)
            if (r5 == 0) goto L94
            goto L5a
        L58:
            if (r3 == 0) goto L94
        L5a:
            boolean r5 = r4.enableFull(r2, r6)
            if (r5 == 0) goto L94
            goto L92
        L61:
            if (r5 != 0) goto L79
            if (r7 == 0) goto L79
            if (r0 == 0) goto L70
            if (r3 == 0) goto L94
            boolean r5 = r4.enableFull(r1, r6)
            if (r5 == 0) goto L94
            goto L72
        L70:
            if (r3 == 0) goto L94
        L72:
            boolean r5 = r4.setSleepAssistantEnable(r2)
            if (r5 == 0) goto L94
            goto L92
        L79:
            if (r0 == 0) goto L8a
            if (r3 == 0) goto L94
            boolean r5 = r4.setSleepAssistantEnable(r2)
            if (r5 == 0) goto L94
            boolean r5 = r4.enableFull(r2, r6)
            if (r5 == 0) goto L94
            goto L92
        L8a:
            if (r3 == 0) goto L94
            boolean r5 = r4.setHeartRate(r2, r6)
            if (r5 == 0) goto L94
        L92:
            r5 = r2
            goto L95
        L94:
            r5 = r1
        L95:
            if (r9 == 0) goto La3
            if (r8 == 0) goto La3
            if (r5 == 0) goto La4
            boolean r5 = r4.setAtrialFibEnable(r2)
            if (r5 == 0) goto La4
        La1:
            r1 = r2
            goto La4
        La3:
            r1 = r5
        La4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "recover hr setting result: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "HeartHealthImpl"
            defpackage.t5t.d(r6, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg.recoverHrSetting(boolean, int, boolean, boolean, boolean):boolean");
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setAtrialFibEnable(boolean isEnable) {
        boolean zA = this.f20031b.a(isEnable);
        t5t.d("HeartHealthImpl", "set atrial fib enable: " + isEnable + ", result:" + zA);
        return zA;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setBodyEnergyEnable(boolean enable) {
        t5t.d("HeartHealthImpl", "not support body energy");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHeartRate(boolean isEnable, int interval) {
        return this.f20031b.b(isEnable, interval);
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrInterval(int interval) {
        boolean zA = this.f20031b.a(interval);
        t5t.d("HeartHealthImpl", "set heart rate interval:" + interval + " result:" + zA);
        return zA;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrMaxValue(int value) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setHrReminder(@NotNull HMHrReminder hrReminder) {
        boolean z;
        Intrinsics.checkNotNullParameter(hrReminder, "hrReminder");
        b9 b9Var = this.f20030a;
        if (b9Var != null) {
            z = b9Var.a(hrReminder);
        }
        t5t.d("HeartHealthImpl", "set high hr reminder:" + hrReminder + " result:" + z);
        return z;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setLowHrReminder(@NotNull HMHrReminder hrReminder) {
        Intrinsics.checkNotNullParameter(hrReminder, "hrReminder");
        t5t.d("HeartHealthImpl", "set low hr reminder config not support");
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setLowSpo2AlertValue(int value) {
        if ((this.c.hasSw(59) ? this : null) != null) {
            b9 b9Var = this.f20030a;
            Boolean boolValueOf = b9Var != null ? Boolean.valueOf(b9Var.setLowSpo2AlertValue(value)) : null;
            if (boolValueOf != null) {
                t5t.d("HeartHealthImpl", "set low spo2 result:" + boolValueOf.booleanValue());
                return boolValueOf.booleanValue();
            }
        }
        t5t.d("HeartHealthImpl", "set low spo2 fail by null");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSleepAssistantEnable(boolean isEnable) {
        boolean zB;
        if (this.c.hasSw(34) || !this.c.hasSw(7)) {
            zB = this.f20031b.b(isEnable);
        } else {
            b9 b9Var = this.f20030a;
            if (b9Var != null) {
                zB = true;
                if (!b9Var.d(isEnable)) {
                    zB = false;
                }
            } else {
                zB = false;
            }
        }
        t5t.d("HeartHealthImpl", "set sleep assistant enable:" + isEnable + " result:" + zB);
        return zB;
    }

    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSleepingBloodPressureMonitorEnable(boolean enable) {
        t5t.d("HeartHealthImpl", "setSleepingBloodPressureMonitorEnable config not support");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    @Override // com.huami.bluetooth.profile.channel.module.health.HeartHealthApi
    public boolean setSportHeartRateEnable(boolean isEnable) {
        boolean z;
        b9 b9Var = this.f20030a;
        if (b9Var != null) {
            z = b9Var.b(isEnable);
        }
        t5t.d("HeartHealthImpl", "set sport heart rate enable:" + isEnable + "  result:" + z);
        return z;
    }
}
