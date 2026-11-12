package com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactViewModel;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.dg4;
import defpackage.eg4;
import defpackage.fg4;
import defpackage.s7r;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eJ0\u0010\u0013\u001a\u00020\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u000eJ\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0010J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\nR!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0019\u0010\n¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "getEmergencyResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactViewModel$GetEmergencyResult;", "getGetEmergencyResult", "()Landroidx/lifecycle/MutableLiveData;", "getEmergencyResult$delegate", "Lkotlin/Lazy;", "getEmergencyContact", "", "setEmergencyResult", "", "getSetEmergencyResult", "setEmergencyResult$delegate", "sendEmergencyContact", "remark", RealNameWebViewActivity.NUMBER, "enabled", "miuiSos", "animationUrl", "getAnimationUrl", "animationUrl$delegate", "loadAnimation", "isSupportMIUISos", "isMIUISosOpen", "attach", "savedInstanceState", "Landroid/os/Bundle;", "GetEmergencyResult", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmergencyContactViewModel extends AbsViewModel {

    @NotNull
    public static final String RESOURCE_ANIMATION = "resource-animation";

    @NotNull
    private final String TAG = "EmergencyContactViewModel";

    /* JADX INFO: renamed from: getEmergencyResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getEmergencyResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n88
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmergencyContactViewModel.getEmergencyResult_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: setEmergencyResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setEmergencyResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o88
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmergencyContactViewModel.setEmergencyResult_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: animationUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy animationUrl = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p88
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmergencyContactViewModel.animationUrl_delegate$lambda$2();
        }
    });

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactViewModel$GetEmergencyResult;", "", "", "component1", "()Z", "Lfg4;", "component2", "()Lfg4;", "success", "contact", "copy", "(ZLfg4;)Lcom/xiaomi/fitness/devicesettings/bluttooth/emergencycontact/EmergencyContactViewModel$GetEmergencyResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Lfg4;", "getContact", "<init>", "(ZLfg4;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class GetEmergencyResult {

        @Nullable
        private final fg4 contact;
        private final boolean success;

        public GetEmergencyResult(boolean z, @Nullable fg4 fg4Var) {
            this.success = z;
            this.contact = fg4Var;
        }

        public static /* synthetic */ GetEmergencyResult copy$default(GetEmergencyResult getEmergencyResult, boolean z, fg4 fg4Var, int i, Object obj) {
            if ((i & 1) != 0) {
                z = getEmergencyResult.success;
            }
            if ((i & 2) != 0) {
                fg4Var = getEmergencyResult.contact;
            }
            return getEmergencyResult.copy(z, fg4Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final fg4 getContact() {
            return this.contact;
        }

        @NotNull
        public final GetEmergencyResult copy(boolean success, @Nullable fg4 contact) {
            return new GetEmergencyResult(success, contact);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetEmergencyResult)) {
                return false;
            }
            GetEmergencyResult getEmergencyResult = (GetEmergencyResult) other;
            return this.success == getEmergencyResult.success && Intrinsics.areEqual(this.contact, getEmergencyResult.contact);
        }

        @Nullable
        public final fg4 getContact() {
            return this.contact;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.success) * 31;
            fg4 fg4Var = this.contact;
            return iHashCode + (fg4Var == null ? 0 : fg4Var.hashCode());
        }

        @NotNull
        public String toString() {
            return "GetEmergencyResult(success=" + this.success + ", contact=" + this.contact + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData animationUrl_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData getEmergencyResult_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAnimation$lambda$3(EmergencyContactViewModel this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null && str.length() != 0) {
            this$0.getAnimationUrl().postValue(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void sendEmergencyContact$default(EmergencyContactViewModel emergencyContactViewModel, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        emergencyContactViewModel.sendEmergencyContact(str, str2, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setEmergencyResult_delegate$lambda$1() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<String> getAnimationUrl() {
        return (MutableLiveData) this.animationUrl.getValue();
    }

    public final void getEmergencyContact() {
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 0;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactViewModel.getEmergencyContact.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("getEmergencyContact fail: " + code, new Object[0]);
                EmergencyContactViewModel.this.getGetEmergencyResult().postValue(new GetEmergencyResult(false, null));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                dg4 dg4VarR;
                if (result == null) {
                    EmergencyContactViewModel.this.getGetEmergencyResult().postValue(new GetEmergencyResult(false, null));
                    return;
                }
                s7r packet = result.getPacket();
                fg4 fg4VarP = (packet == null || (dg4VarR = packet.r()) == null) ? null : dg4VarR.p();
                if (fg4VarP == null) {
                    EmergencyContactViewModel.this.getGetEmergencyResult().postValue(new GetEmergencyResult(false, null));
                    return;
                }
                Logger.i(EmergencyContactViewModel.this.TAG, "getEmergencyContact success, enabled: " + fg4VarP.c + " isMIUI: " + fg4VarP.d);
                EmergencyContactViewModel.this.getGetEmergencyResult().postValue(new GetEmergencyResult(true, fg4VarP));
            }
        }, 0, 8, null);
    }

    @NotNull
    public final MutableLiveData<GetEmergencyResult> getGetEmergencyResult() {
        return (MutableLiveData) this.getEmergencyResult.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getSetEmergencyResult() {
        return (MutableLiveData) this.setEmergencyResult.getValue();
    }

    public final boolean isMIUISosOpen() {
        boolean zIsMIUISosOpen = EmergencyContactHelper.INSTANCE.isMIUISosOpen();
        Logger.i(this.TAG, "miui sos enabled: " + zIsMIUISosOpen);
        return zIsMIUISosOpen;
    }

    public final boolean isSupportMIUISos() {
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return false;
        }
        return RomUtils.isXiaomi() && !AppUtil.INSTANCE.isPlayChannel() && ((DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid()) & 64) != 0);
    }

    public final void loadAnimation() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        EmergencyContactHelper.INSTANCE.requestAnimationJson(wearableDeviceModel, new Function1() { // from class: m88
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EmergencyContactViewModel.loadAnimation$lambda$3(this.f25878a, (String) obj);
            }
        });
    }

    public final void sendEmergencyContact(@Nullable String remark, @Nullable String number, boolean enabled, boolean miuiSos) {
        fg4 fg4Var = new fg4();
        dg4 dg4Var = new dg4();
        if (!miuiSos) {
            eg4 eg4Var = new eg4();
            eg4Var.c = remark;
            eg4Var.d = number;
            fg4Var.e = eg4Var;
        }
        fg4Var.c = enabled;
        fg4Var.d = miuiSos;
        dg4Var.v(fg4Var);
        Logger.d(this.TAG, "sendEmergencyContact: " + dg4Var);
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 1;
        s7rVar.Q(dg4Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactViewModel.sendEmergencyContact.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(EmergencyContactViewModel.this.TAG, "sendEmergencyContact failed: " + code);
                EmergencyContactViewModel.this.getSetEmergencyResult().postValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null) {
                    EmergencyContactViewModel.this.getSetEmergencyResult().postValue(Boolean.FALSE);
                } else {
                    Logger.i(EmergencyContactViewModel.this.TAG, "sendEmergencyContact success");
                    EmergencyContactViewModel.this.getSetEmergencyResult().postValue(Boolean.TRUE);
                }
            }
        }, 0, 8, null);
    }
}
