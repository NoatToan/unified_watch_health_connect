package com.xiaomi.hm.health.bt.profile.hr;

import com.google.android.gms.common.Scopes;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/hr/HmNewHeartRateController;", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController;", "", "enable", "", "interval", "enableFull", "setHrInterval", "enableAtrialFib", "enableSleepAssist", "enableHeartRate", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "Lcom/xiaomi/hm/health/bt/profile/milipro/MiLiProProfile;", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/xiaomi/hm/health/bt/profile/milipro/MiLiProProfile;", "getProfile", "()Lcom/xiaomi/hm/health/bt/profile/milipro/MiLiProProfile;", Scopes.PROFILE, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/milipro/MiLiProProfile;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HmNewHeartRateController extends HMHeartRateController {

    @NotNull
    private static final String q = "HmNewHeartRateController";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MiLiProProfile profile;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            Debug.fi(HmNewHeartRateController.q, "set atrial fib enable:" + this.a + " fail by response null");
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, int i) {
            super(0);
            this.a = z;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            Debug.fi(HmNewHeartRateController.q, "set all day heartrate enable:" + this.a + " interval:" + this.b + " fail by response null");
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            Debug.fi(HmNewHeartRateController.q, "set rem enable:" + this.a + " fail by response null");
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            Debug.fi(HmNewHeartRateController.q, "set all day heartrate interval:" + this.a + " fail by response null");
            return false;
        }
    }

    public HmNewHeartRateController(@NotNull MiLiProProfile miLiProProfile, @Nullable HMBaseDevice hMBaseDevice) {
        super(miLiProProfile, hMBaseDevice);
        this.profile = miLiProProfile;
    }

    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController
    public boolean enableAtrialFib(boolean enable) {
        Boolean atrialFibEnable = this.profile.getEcfController().setAtrialFibEnable(enable);
        if (atrialFibEnable == null) {
            atrialFibEnable = null;
        } else {
            Debug.fi(q, "set atrial fib enable:" + enable + " result:" + atrialFibEnable.booleanValue());
        }
        return atrialFibEnable == null ? ((Boolean) new a(enable).invoke()).booleanValue() : atrialFibEnable.booleanValue();
    }

    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController
    public boolean enableFull(boolean enable, int interval) {
        Boolean alldayHeartRate = this.profile.getEcfController().setAlldayHeartRate(enable ? interval : 0);
        if (alldayHeartRate == null) {
            alldayHeartRate = null;
        } else {
            Debug.fi(q, "set all day heartrate enable:" + enable + " interval:" + interval + " result:" + alldayHeartRate.booleanValue());
        }
        return alldayHeartRate == null ? ((Boolean) new b(enable, interval).invoke()).booleanValue() : alldayHeartRate.booleanValue();
    }

    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController
    public boolean enableHeartRate(boolean enable, int interval) {
        return enableFull(enable, interval) && enableSleepAssist(enable);
    }

    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController
    public boolean enableSleepAssist(boolean enable) {
        Boolean remEnable = this.profile.getEcfController().setRemEnable(enable);
        if (remEnable == null) {
            remEnable = null;
        } else {
            Debug.fi(q, "set rem enable:" + enable + " result:" + remEnable.booleanValue());
        }
        return remEnable == null ? ((Boolean) new c(enable).invoke()).booleanValue() : remEnable.booleanValue();
    }

    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController
    @Nullable
    public HeartRateConfig getHeartRateConfig() {
        boolean zAreEqual = Intrinsics.areEqual(this.profile.getEcfController().getRemEnable(), Boolean.TRUE);
        Integer alldayHeartRate = this.profile.getEcfController().getAlldayHeartRate();
        return new HeartRateConfig(zAreEqual, alldayHeartRate == null ? 0 : alldayHeartRate.intValue());
    }

    @NotNull
    public final MiLiProProfile getProfile() {
        return this.profile;
    }

    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController
    public boolean setHrInterval(int interval) {
        Boolean alldayHeartRate = this.profile.getEcfController().setAlldayHeartRate(interval);
        if (alldayHeartRate == null) {
            alldayHeartRate = null;
        } else {
            Debug.fi(q, "set all day heartrate interval:" + interval + " result:" + alldayHeartRate.booleanValue());
        }
        return alldayHeartRate == null ? ((Boolean) new d(interval).invoke()).booleanValue() : alldayHeartRate.booleanValue();
    }
}
