package com.xiaomi.fitness.devicesettings.bluttooth.screenwake;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import com.xiaomi.fitness.settingitem.settingitem.LiftWristBrightView;
import defpackage.myo;
import defpackage.s7r;
import defpackage.t64;
import defpackage.txo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J6\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/screenwake/ScreenWakeForBleViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "<init>", "()V", "mInfoData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/screenwake/WristScreenResult;", "getMInfoData", "()Landroidx/lifecycle/MutableLiveData;", "setMInfoData", "(Landroidx/lifecycle/MutableLiveData;)V", "mResultData", "", "getMResultData", "setMResultData", "getWristScreenInfo", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "setWristScreenInfo", "mode", "startHour", "startMin", "endHour", "endMin", "sensitivity", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenWakeForBleViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    private MutableLiveData<WristScreenResult> mInfoData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Integer> mResultData = new MutableLiveData<>();

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
    }

    @NotNull
    public final MutableLiveData<WristScreenResult> getMInfoData() {
        return this.mInfoData;
    }

    @NotNull
    public final MutableLiveData<Integer> getMResultData() {
        return this.mResultData;
    }

    public final void getWristScreenInfo() {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 24;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.screenwake.ScreenWakeForBleViewModel.getWristScreenInfo.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(ScreenWakeForBleViewModelKt.TAG, "getWristScreenInfo fail, code: " + code);
                ScreenWakeForBleViewModel.this.getMInfoData().postValue(new WristScreenResult(code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                myo myoVarR;
                if (result == null || !SyncResultExitKt.isSuccess(result)) {
                    return;
                }
                s7r packet = result.getPacket();
                if ((packet != null ? packet.E() : null) == null || (myoVarR = packet.E().R()) == null) {
                    return;
                }
                LiftWristBrightView liftWristBrightView = new LiftWristBrightView();
                if (myoVarR.c == 2) {
                    liftWristBrightView.setStart(480);
                    liftWristBrightView.setStop(1320);
                } else {
                    t64 t64Var = myoVarR.d;
                    int i = t64Var != null ? t64Var.c : 0;
                    int i2 = t64Var != null ? t64Var.d : 0;
                    t64 t64Var2 = myoVarR.e;
                    int i3 = t64Var2 != null ? t64Var2.c : 0;
                    int i4 = t64Var2 != null ? t64Var2.d : 0;
                    liftWristBrightView.setStart((i * 60) + i2);
                    liftWristBrightView.setStop((i3 * 60) + i4);
                }
                liftWristBrightView.setEnable(myoVarR.c != 2);
                liftWristBrightView.setAllday(myoVarR.c == 0);
                liftWristBrightView.setSensitivity(myoVarR.f);
                ScreenWakeForBleViewModel.this.getMInfoData().postValue(new WristScreenResult(liftWristBrightView));
            }
        }, 0, 8, null);
    }

    public final void setMInfoData(@NotNull MutableLiveData<WristScreenResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mInfoData = mutableLiveData;
    }

    public final void setMResultData(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mResultData = mutableLiveData;
    }

    public final void setWristScreenInfo(int mode, int startHour, int startMin, int endHour, int endMin, int sensitivity) {
        myo myoVar = new myo();
        myoVar.c = mode;
        myoVar.f = sensitivity;
        t64 t64Var = new t64();
        t64Var.c = startHour;
        t64Var.d = startMin;
        myoVar.d = t64Var;
        t64 t64Var2 = new t64();
        t64Var2.c = endHour;
        t64Var2.d = endMin;
        myoVar.e = t64Var2;
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 25;
        txo txoVar = new txo();
        txoVar.y0(myoVar);
        s7rVar.c0(txoVar);
        Logger.i("screen_wake", " set info = " + myoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.screenwake.ScreenWakeForBleViewModel.setWristScreenInfo.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                ScreenWakeForBleViewModel.this.getMResultData().postValue(Integer.valueOf(code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null || !SyncResultExitKt.isSuccess(result)) {
                    ScreenWakeForBleViewModel.this.getMResultData().postValue(255);
                } else {
                    ScreenWakeForBleViewModel.this.getMResultData().postValue(0);
                }
            }
        }, 0, 8, null);
    }
}
