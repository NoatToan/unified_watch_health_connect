package com.xiaomi.fitness.devicesettings.bluttooth.wearmode;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeViewModel;
import defpackage.s7r;
import defpackage.txo;
import defpackage.vxo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "wearMode", "Landroidx/lifecycle/MutableLiveData;", "", "getWearMode", "()Landroidx/lifecycle/MutableLiveData;", "wearMode$delegate", "Lkotlin/Lazy;", "loadWearMode", "", "setWearModeRet", "Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeViewModel$SetWearModeRet;", "getSetWearModeRet", "setWearModeRet$delegate", "setWearMode", "modeBean", "Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/WearModeBean;", "SetWearModeRet", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SwitchWearModeViewModel extends AbsViewModel {
    public static final int BAND = 0;
    public static final int BEAN = 1;
    public static final int EXIT_ACCESSORY_MODE = -111;
    public static final int RING = 2;

    @NotNull
    private static final String TAG = "SwitchWearModeViewModel";

    /* JADX INFO: renamed from: wearMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy wearMode = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dso
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SwitchWearModeViewModel.wearMode_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: setWearModeRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setWearModeRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: eso
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SwitchWearModeViewModel.setWearModeRet_delegate$lambda$2();
        }
    });

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/wearmode/SwitchWearModeViewModel$SetWearModeRet;", "", "success", "", "mode", "", "code", "<init>", "(ZII)V", "getSuccess", "()Z", "getMode", "()I", "getCode", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SetWearModeRet {
        private final int code;
        private final int mode;
        private final boolean success;

        public SetWearModeRet(boolean z, int i, int i2) {
            this.success = z;
            this.mode = i;
            this.code = i2;
        }

        public static /* synthetic */ SetWearModeRet copy$default(SetWearModeRet setWearModeRet, boolean z, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = setWearModeRet.success;
            }
            if ((i3 & 2) != 0) {
                i = setWearModeRet.mode;
            }
            if ((i3 & 4) != 0) {
                i2 = setWearModeRet.code;
            }
            return setWearModeRet.copy(z, i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final SetWearModeRet copy(boolean success, int mode, int code) {
            return new SetWearModeRet(success, mode, code);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetWearModeRet)) {
                return false;
            }
            SetWearModeRet setWearModeRet = (SetWearModeRet) other;
            return this.success == setWearModeRet.success && this.mode == setWearModeRet.mode && this.code == setWearModeRet.code;
        }

        public final int getCode() {
            return this.code;
        }

        public final int getMode() {
            return this.mode;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.success) * 31) + Integer.hashCode(this.mode)) * 31) + Integer.hashCode(this.code);
        }

        @NotNull
        public String toString() {
            return "SetWearModeRet(success=" + this.success + ", mode=" + this.mode + ", code=" + this.code + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadWearMode$lambda$1(SwitchWearModeViewModel this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getWearMode().postValue(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setWearModeRet_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData wearMode_delegate$lambda$0() {
        return new MutableLiveData();
    }

    @NotNull
    public final MutableLiveData<SetWearModeRet> getSetWearModeRet() {
        return (MutableLiveData) this.setWearModeRet.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getWearMode() {
        return (MutableLiveData) this.wearMode.getValue();
    }

    public final void loadWearMode() {
        SwitchWearModeHelper.getWearMode$default(SwitchWearModeHelper.INSTANCE, null, new Function1() { // from class: cso
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SwitchWearModeViewModel.loadWearMode$lambda$1(this.f14684a, ((Integer) obj).intValue());
            }
        }, 1, null);
    }

    public final void setWearMode(@NotNull final WearModeBean modeBean) {
        Intrinsics.checkNotNullParameter(modeBean, "modeBean");
        if (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).hasAccessoryMode(modeBean.getMode())) {
            getSetWearModeRet().postValue(new SetWearModeRet(false, modeBean.getMode(), EXIT_ACCESSORY_MODE));
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 15;
        vxo.j jVar = new vxo.j();
        jVar.c = modeBean.getMode();
        txo txoVar = new txo();
        vxo vxoVar = new vxo();
        vxoVar.e = jVar;
        txoVar.m0(vxoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeViewModel.setWearMode.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(SwitchWearModeViewModel.TAG, "setWearMode fail: " + code);
                SwitchWearModeViewModel.this.getSetWearModeRet().postValue(new SetWearModeRet(false, modeBean.getMode(), code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null || !result.isSuccess()) {
                    onError(did, type, 255);
                    return;
                }
                SwitchWearModeViewModel.this.getSetWearModeRet().postValue(new SetWearModeRet(true, modeBean.getMode(), 0));
                if (did != null) {
                    DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).switchDeviceWearMode(did, modeBean.getMode(), true);
                }
            }
        }, 0, 8, null);
    }
}
