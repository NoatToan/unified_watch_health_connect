package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.sleep.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.sleep.viewmodel.BleSleepSettingViewModel;
import defpackage.h4b;
import defpackage.ls9;
import defpackage.s7r;
import defpackage.ur9;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b*\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0013\u0010\t\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0013\u0010\n\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/sleep/viewmodel/BleSleepSettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorViewModel;", "Lls9;", "", "isSupportAssistSleep", "(Lls9;)Z", "isSupportSleepBreath", "isSupportSleepRate", "isSleepSwitchOn", "isSleepBreathSwitchOn", "isSleepRateSwitchOn", "deepCopy", "(Lls9;)Lls9;", "", "loadAssistSleepSwitch", "()V", "isChecked", "setAssistSleepSwitch", "(Z)V", "isDetect", "setSleepBreathSwitch", "(ZZ)V", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Landroidx/lifecycle/MutableLiveData;", "sleepSettingSwitch", "Landroidx/lifecycle/MutableLiveData;", "getSleepSettingSwitch", "()Landroidx/lifecycle/MutableLiveData;", "sleepBreathSwitch", "getSleepBreathSwitch", "sleepBreathSupport", "getSleepBreathSupport", "sleepRateSupport", "getSleepRateSupport", "sleepRateSwitch", "getSleepRateSwitch", "hrConfig", "Lls9;", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBleSleepSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSleepSettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/sleep/viewmodel/BleSleepSettingViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
public class BleSleepSettingViewModel extends BaseHealthMonitorViewModel {

    @NotNull
    private final String TAG = "BleSleepSettingViewModel";
    private ls9 hrConfig;

    @NotNull
    private final MutableLiveData<Boolean> sleepBreathSupport;

    @NotNull
    private final MutableLiveData<Boolean> sleepBreathSwitch;

    @NotNull
    private final MutableLiveData<Boolean> sleepRateSupport;

    @NotNull
    private final MutableLiveData<Boolean> sleepRateSwitch;

    @NotNull
    private final MutableLiveData<Boolean> sleepSettingSwitch;

    public BleSleepSettingViewModel() {
        Boolean bool = Boolean.FALSE;
        this.sleepSettingSwitch = new MutableLiveData<>(bool);
        this.sleepBreathSwitch = new MutableLiveData<>(bool);
        this.sleepBreathSupport = new MutableLiveData<>(bool);
        this.sleepRateSupport = new MutableLiveData<>(bool);
        this.sleepRateSwitch = new MutableLiveData<>(bool);
    }

    private final ls9 deepCopy(ls9 ls9Var) {
        Object objD = h4b.d(h4b.c(ls9Var), ls9.class);
        Intrinsics.checkNotNullExpressionValue(objD, "toObject(...)");
        return (ls9) objD;
    }

    private final boolean isSleepBreathSwitchOn(ls9 ls9Var) {
        return ls9Var.f25395k == 1;
    }

    private final boolean isSleepRateSwitchOn(ls9 ls9Var) {
        return ls9Var.l == 1;
    }

    private final boolean isSleepSwitchOn(ls9 ls9Var) {
        ls9.a aVar = ls9Var.j;
        if (aVar != null) {
            return aVar.c;
        }
        return false;
    }

    private final boolean isSupportAssistSleep(ls9 ls9Var) {
        return ls9Var.j != null;
    }

    private final boolean isSupportSleepBreath(ls9 ls9Var) {
        return ls9Var.f25395k != 0;
    }

    private final boolean isSupportSleepRate(ls9 ls9Var) {
        return ls9Var.l != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAssistSleepSwitch$lambda$2(BleSleepSettingViewModel this$0, SyncResult it) {
        ur9 ur9VarU;
        ls9 ls9VarZ;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        s7r packet = it.getPacket();
        if (packet != null && (ur9VarU = packet.u()) != null && (ls9VarZ = ur9VarU.z()) != null) {
            this$0.hrConfig = ls9VarZ;
            if (!this$0.isSupportAssistSleep(ls9VarZ)) {
                this$0.getLoadStatus().postValue(4);
            }
            this$0.sleepSettingSwitch.postValue(Boolean.valueOf(this$0.isSleepSwitchOn(ls9VarZ)));
            if (this$0.isSupportSleepBreath(ls9VarZ)) {
                this$0.sleepBreathSwitch.postValue(Boolean.valueOf(this$0.isSleepBreathSwitchOn(ls9VarZ)));
            }
            if (this$0.isSupportSleepRate(ls9VarZ)) {
                this$0.sleepRateSwitch.postValue(Boolean.valueOf(this$0.isSleepRateSwitchOn(ls9VarZ)));
            }
            this$0.sleepBreathSupport.postValue(Boolean.valueOf(this$0.isSupportSleepBreath(ls9VarZ)));
            this$0.sleepRateSupport.postValue(Boolean.valueOf(this$0.isSupportSleepRate(ls9VarZ)));
            String tag = this$0.getTAG();
            ls9.a aVar = ls9VarZ.j;
            Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.c) : null;
            Logger.i(tag, "loadAssistSleepSwitch assitSleep(" + boolValueOf + ") sleepBreatheQuality:" + ls9VarZ.f25395k + " sleepRateSupport:" + ls9VarZ.l);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAssistSleepSwitch$lambda$6(BleSleepSettingViewModel this$0, boolean z, SyncResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.sleepSettingSwitch.postValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSleepBreathSwitch$lambda$10(boolean z, BleSleepSettingViewModel this$0, boolean z2, SyncResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (z) {
            this$0.sleepBreathSwitch.postValue(Boolean.valueOf(z2));
        } else {
            this$0.sleepRateSwitch.postValue(Boolean.valueOf(z2));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepBreathSupport() {
        return this.sleepBreathSupport;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepBreathSwitch() {
        return this.sleepBreathSwitch;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepRateSupport() {
        return this.sleepRateSupport;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepRateSwitch() {
        return this.sleepRateSwitch;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepSettingSwitch() {
        return this.sleepSettingSwitch;
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    public final void loadAssistSleepSwitch() {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 10;
        BaseHealthMonitorViewModel.deviceApiCall$default(this, s7rVar, true, "loadSleepSettingSwitch", new Function1() { // from class: zt2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BleSleepSettingViewModel.loadAssistSleepSwitch$lambda$2(this.f41647a, (SyncResult) obj);
            }
        }, null, 16, null);
    }

    public final void setAssistSleepSwitch(final boolean isChecked) {
        if (!isDeviceConnected() || this.hrConfig == null) {
            Logger.e(getTAG(), "setAssistSleepSwitch(" + isChecked + ") error:" + (this.hrConfig != null));
            ToastUtil.showShortToast(wzi.common_set_error);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 11;
        ls9 ls9Var = this.hrConfig;
        if (ls9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrConfig");
            ls9Var = null;
        }
        ls9.a aVar = ls9Var.j;
        if (aVar != null) {
            aVar.c = isChecked;
        }
        ur9 ur9Var = new ur9();
        ur9Var.o0(ls9Var);
        s7rVar.S(ur9Var);
        String tag = getTAG();
        ls9.a aVar2 = s7rVar.u().z().j;
        Boolean boolValueOf = aVar2 != null ? Boolean.valueOf(aVar2.c) : null;
        Logger.i(tag, "setAssistSleepSwitch assitSleep(" + boolValueOf + ") sleepBreatheQuality:" + s7rVar.u().z().f25395k);
        StringBuilder sb = new StringBuilder();
        sb.append("setAssistSleepSwitch ");
        sb.append(isChecked);
        sb.append(" ");
        BaseHealthMonitorViewModel.deviceApiCall$default(this, s7rVar, true, sb.toString(), new Function1() { // from class: yt2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BleSleepSettingViewModel.setAssistSleepSwitch$lambda$6(this.f40510a, isChecked, (SyncResult) obj);
            }
        }, null, 16, null);
    }

    public final void setSleepBreathSwitch(final boolean isChecked, final boolean isDetect) {
        if (!isDeviceConnected() || this.hrConfig == null) {
            Logger.e(getTAG(), "setSleepBreathSwitch(" + isChecked + ") error:" + (this.hrConfig != null));
            ToastUtil.showShortToast(wzi.common_set_error);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 11;
        ls9 ls9Var = this.hrConfig;
        if (ls9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrConfig");
            ls9Var = null;
        }
        if (isDetect) {
            ls9Var.f25395k = isChecked ? 1 : 2;
        } else {
            ls9Var.l = isChecked ? 1 : 2;
        }
        ur9 ur9Var = new ur9();
        ur9Var.o0(ls9Var);
        s7rVar.S(ur9Var);
        String tag = getTAG();
        ls9.a aVar = s7rVar.u().z().j;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.c) : null;
        Logger.i(tag, "setSleepBreathSwitch assitSleep(" + boolValueOf + ") sleepBreatheQuality:" + s7rVar.u().z().f25395k + " sleepBreatheRate:" + s7rVar.u().z().l);
        StringBuilder sb = new StringBuilder();
        sb.append("setSleepBreathSwitch ");
        sb.append(isChecked);
        sb.append(" ");
        BaseHealthMonitorViewModel.deviceApiCall$default(this, s7rVar, true, sb.toString(), new Function1() { // from class: au2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BleSleepSettingViewModel.setSleepBreathSwitch$lambda$10(isDetect, this, isChecked, (SyncResult) obj);
            }
        }, null, 16, null);
    }
}
