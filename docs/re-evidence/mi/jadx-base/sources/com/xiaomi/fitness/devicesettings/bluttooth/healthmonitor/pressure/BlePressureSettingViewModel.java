package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.pressure;

import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.pressure.BlePressureSettingViewModel;
import defpackage.av9;
import defpackage.dt9;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u001d\u0010\u000bJ)\u0010\b\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0082\b¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/pressure/BlePressureSettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorViewModel;", "Lkotlin/Function1;", "Ldt9;", "", "Lkotlin/ExtensionFunctionType;", "block", "Ls7r;", "createPacket", "(Lkotlin/jvm/functions/Function1;)Ls7r;", "loadPressureSwitch", "()V", "", "isChecked", "setPressureSwitch", "(Z)V", "setHighPressureNoticeSwitch", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/pressure/PressureModel;", "pressureModel", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/pressure/PressureModel;", "getPressureModel", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/pressure/PressureModel;", "setPressureModel", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/pressure/PressureModel;)V", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBlePressureSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlePressureSettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/pressure/BlePressureSettingViewModel\n*L\n1#1,67:1\n57#1,10:68\n57#1,10:78\n*S KotlinDebug\n*F\n+ 1 BlePressureSettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/pressure/BlePressureSettingViewModel\n*L\n38#1:68,10\n48#1:78,10\n*E\n"})
public class BlePressureSettingViewModel extends BaseHealthMonitorViewModel {

    @NotNull
    private final String TAG = "BlePressureSettingViewModel";
    public PressureModel pressureModel;

    public BlePressureSettingViewModel() {
        getType().postValue(3);
    }

    private final s7r createPacket(Function1<? super dt9, Unit> block) {
        s7r s7rVar = new s7r();
        s7rVar.f = 15;
        s7rVar.e = 8;
        dt9 dt9VarTransform2Monitor = getPressureModel().transform2Monitor();
        block.invoke(dt9VarTransform2Monitor);
        ur9 ur9Var = new ur9();
        ur9Var.z0(dt9VarTransform2Monitor);
        s7rVar.S(ur9Var);
        return s7rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadPressureSwitch$lambda$1(BlePressureSettingViewModel this$0, SyncResult it) {
        ur9 ur9VarU;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        PressureModel pressureModel = this$0.getPressureModel();
        s7r packet = it.getPacket();
        pressureModel.setConfig((packet == null || (ur9VarU = packet.u()) == null) ? null : ur9VarU.I());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHighPressureNoticeSwitch$lambda$5(BlePressureSettingViewModel this$0, boolean z, SyncResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getPressureModel().getHighPressureNoticeSwitch().set(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPressureSwitch$lambda$3(BlePressureSettingViewModel this$0, boolean z, SyncResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getPressureModel().getPressureDetectionSwitch().set(z);
        if (z) {
            ToastUtil.showShortToast(wzi.common_set_success);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final PressureModel getPressureModel() {
        PressureModel pressureModel = this.pressureModel;
        if (pressureModel != null) {
            return pressureModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pressureModel");
        return null;
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorViewModel
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    public final void loadPressureSwitch() {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 14;
        BaseHealthMonitorViewModel.deviceApiCall$default(this, s7rVar, true, "loadPressureSwitch", new Function1() { // from class: zs2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlePressureSettingViewModel.loadPressureSwitch$lambda$1(this.f41620a, (SyncResult) obj);
            }
        }, null, 16, null);
    }

    public final void setHighPressureNoticeSwitch(final boolean isChecked) {
        s7r s7rVar = new s7r();
        s7rVar.f = 15;
        s7rVar.e = 8;
        dt9 dt9VarTransform2Monitor = getPressureModel().transform2Monitor();
        av9 av9Var = dt9VarTransform2Monitor.d;
        if (av9Var != null) {
            av9Var.c = isChecked;
        }
        ur9 ur9Var = new ur9();
        ur9Var.z0(dt9VarTransform2Monitor);
        s7rVar.S(ur9Var);
        BaseHealthMonitorViewModel.deviceApiCall$default(this, s7rVar, true, "setPressureSwitch " + isChecked + " ", new Function1() { // from class: bt2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlePressureSettingViewModel.setHighPressureNoticeSwitch$lambda$5(this.f4582a, isChecked, (SyncResult) obj);
            }
        }, null, 16, null);
    }

    public final void setPressureModel(@NotNull PressureModel pressureModel) {
        Intrinsics.checkNotNullParameter(pressureModel, "<set-?>");
        this.pressureModel = pressureModel;
    }

    public final void setPressureSwitch(final boolean isChecked) {
        s7r s7rVar = new s7r();
        s7rVar.f = 15;
        s7rVar.e = 8;
        dt9 dt9VarTransform2Monitor = getPressureModel().transform2Monitor();
        dt9VarTransform2Monitor.c = isChecked;
        ur9 ur9Var = new ur9();
        ur9Var.z0(dt9VarTransform2Monitor);
        s7rVar.S(ur9Var);
        BaseHealthMonitorViewModel.deviceApiCall$default(this, s7rVar, true, "setPressureSwitch " + isChecked + " ", new Function1() { // from class: at2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlePressureSettingViewModel.setPressureSwitch$lambda$3(this.f3426a, isChecked, (SyncResult) obj);
            }
        }, null, 16, null);
    }
}
