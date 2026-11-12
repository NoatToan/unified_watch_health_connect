package com.xiaomi.fitness.devicesettings.bluttooth.directcard;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.directcard.DirectCardViewModel;
import defpackage.iyo;
import defpackage.s7r;
import defpackage.txo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "getWidgetSetting", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Ltxo;", "system", "setWidget", "(Ltxo;)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardViewModel$GetWidgetSetting;", "getWidgetSetting$delegate", "Lkotlin/Lazy;", "getGetWidgetSetting", "()Landroidx/lifecycle/MutableLiveData;", "", "setWidgetRet$delegate", "getSetWidgetRet", "setWidgetRet", "<init>", "()V", "GetWidgetSetting", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DirectCardViewModel extends AbsViewModel {

    /* JADX INFO: renamed from: getWidgetSetting$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getWidgetSetting = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tx6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DirectCardViewModel.getWidgetSetting_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: setWidgetRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setWidgetRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ux6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DirectCardViewModel.setWidgetRet_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardViewModel$GetWidgetSetting;", "", "", "component1", "()I", "Liyo$a;", "component2", "()Liyo$a;", "code", "result", "copy", "(ILiyo$a;)Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardViewModel$GetWidgetSetting;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "Liyo$a;", "getResult", "<init>", "(ILiyo$a;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class GetWidgetSetting {
        private final int code;

        @Nullable
        private final iyo.a result;

        public GetWidgetSetting(int i, @Nullable iyo.a aVar) {
            this.code = i;
            this.result = aVar;
        }

        public static /* synthetic */ GetWidgetSetting copy$default(GetWidgetSetting getWidgetSetting, int i, iyo.a aVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = getWidgetSetting.code;
            }
            if ((i2 & 2) != 0) {
                aVar = getWidgetSetting.result;
            }
            return getWidgetSetting.copy(i, aVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final iyo.a getResult() {
            return this.result;
        }

        @NotNull
        public final GetWidgetSetting copy(int code, @Nullable iyo.a result) {
            return new GetWidgetSetting(code, result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetWidgetSetting)) {
                return false;
            }
            GetWidgetSetting getWidgetSetting = (GetWidgetSetting) other;
            return this.code == getWidgetSetting.code && Intrinsics.areEqual(this.result, getWidgetSetting.result);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final iyo.a getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            iyo.a aVar = this.result;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "GetWidgetSetting(code=" + this.code + ", result=" + this.result + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData getWidgetSetting_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setWidgetRet_delegate$lambda$1() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<GetWidgetSetting> getGetWidgetSetting() {
        return (MutableLiveData) this.getWidgetSetting.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getSetWidgetRet() {
        return (MutableLiveData) this.setWidgetRet.getValue();
    }

    public final void getWidgetSetting(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 28;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), deviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.directcard.DirectCardViewModel.getWidgetSetting.4
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("getWidgetSetting fail: " + code, new Object[0]);
                DirectCardViewModel.this.getGetWidgetSetting().postValue(new GetWidgetSetting(code, null));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                txo txoVarE;
                if (result == null) {
                    DirectCardViewModel.this.getGetWidgetSetting().postValue(new GetWidgetSetting(255, null));
                    return;
                }
                s7r packet = result.getPacket();
                iyo.a aVarM = (packet == null || (txoVarE = packet.E()) == null) ? null : txoVarE.M();
                if (aVarM == null) {
                    DirectCardViewModel.this.getGetWidgetSetting().postValue(new GetWidgetSetting(255, null));
                    return;
                }
                Logger.i("getWidgetSetting success size: " + aVarM.c.length, new Object[0]);
                DirectCardViewModel.this.getGetWidgetSetting().postValue(new GetWidgetSetting(0, aVarM));
            }
        }, 0, 16, (Object) null);
    }

    public final void setWidget(@NotNull txo system) {
        Intrinsics.checkNotNullParameter(system, "system");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 27;
        s7rVar.c0(system);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.directcard.DirectCardViewModel.setWidget.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("setWidget fail: " + code, new Object[0]);
                DirectCardViewModel.this.getSetWidgetRet().postValue(Integer.valueOf(code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null) {
                    DirectCardViewModel.this.getSetWidgetRet().postValue(255);
                } else {
                    Logger.i("setWidget success", new Object[0]);
                    DirectCardViewModel.this.getSetWidgetRet().postValue(0);
                }
            }
        }, 0, 8, null);
    }
}
