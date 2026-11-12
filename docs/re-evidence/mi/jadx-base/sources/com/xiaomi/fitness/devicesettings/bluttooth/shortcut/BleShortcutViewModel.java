package com.xiaomi.fitness.devicesettings.bluttooth.shortcut;

import android.os.Bundle;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.shortcut.BleShortcutViewModel;
import defpackage.pxo;
import defpackage.s7r;
import defpackage.txo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b \u0010\nJ)\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\t\u0010\u001aR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001a¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lkotlin/Function2;", "", "Lpxo;", "", "callback", "loadData", "(Lkotlin/jvm/functions/Function2;)V", "getSupportShortcutList", "()V", "Landroid/util/Pair;", "value", "setDownButton", "(Landroid/util/Pair;)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "", "TAG", "Ljava/lang/String;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutViewModel$SupportShortcutList;", "supportShortcutList$delegate", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "supportShortcutList", "Lcom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutViewModel$SetResult;", "setResult$delegate", "getSetResult", "setResult", "<init>", "SupportShortcutList", "SetResult", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BleShortcutViewModel extends AbsViewModel {

    @NotNull
    private final String TAG = "BleShortcutViewModel";

    /* JADX INFO: renamed from: supportShortcutList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportShortcutList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pt2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BleShortcutViewModel.supportShortcutList_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: setResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qt2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BleShortcutViewModel.setResult_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutViewModel$SetResult;", "", "", "component1", "()I", "Lpxo;", "component2", "()Lpxo;", "code", "result", "copy", "(ILpxo;)Lcom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutViewModel$SetResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "Lpxo;", "getResult", "<init>", "(ILpxo;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class SetResult {
        private final int code;

        @Nullable
        private final pxo result;

        public SetResult(int i, @Nullable pxo pxoVar) {
            this.code = i;
            this.result = pxoVar;
        }

        public static /* synthetic */ SetResult copy$default(SetResult setResult, int i, pxo pxoVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = setResult.code;
            }
            if ((i2 & 2) != 0) {
                pxoVar = setResult.result;
            }
            return setResult.copy(i, pxoVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final pxo getResult() {
            return this.result;
        }

        @NotNull
        public final SetResult copy(int code, @Nullable pxo result) {
            return new SetResult(code, result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetResult)) {
                return false;
            }
            SetResult setResult = (SetResult) other;
            return this.code == setResult.code && Intrinsics.areEqual(this.result, setResult.result);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final pxo getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            pxo pxoVar = this.result;
            return iHashCode + (pxoVar == null ? 0 : pxoVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "SetResult(code=" + this.code + ", result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutViewModel$SupportShortcutList;", "", "", "component1", "()Z", "Lpxo$a;", "component2", "()Lpxo$a;", "success", "shortcuts", "copy", "(ZLpxo$a;)Lcom/xiaomi/fitness/devicesettings/bluttooth/shortcut/BleShortcutViewModel$SupportShortcutList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Lpxo$a;", "getShortcuts", "<init>", "(ZLpxo$a;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class SupportShortcutList {

        @Nullable
        private final pxo.a shortcuts;
        private final boolean success;

        public SupportShortcutList(boolean z, @Nullable pxo.a aVar) {
            this.success = z;
            this.shortcuts = aVar;
        }

        public static /* synthetic */ SupportShortcutList copy$default(SupportShortcutList supportShortcutList, boolean z, pxo.a aVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = supportShortcutList.success;
            }
            if ((i & 2) != 0) {
                aVar = supportShortcutList.shortcuts;
            }
            return supportShortcutList.copy(z, aVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final pxo.a getShortcuts() {
            return this.shortcuts;
        }

        @NotNull
        public final SupportShortcutList copy(boolean success, @Nullable pxo.a shortcuts) {
            return new SupportShortcutList(success, shortcuts);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportShortcutList)) {
                return false;
            }
            SupportShortcutList supportShortcutList = (SupportShortcutList) other;
            return this.success == supportShortcutList.success && Intrinsics.areEqual(this.shortcuts, supportShortcutList.shortcuts);
        }

        @Nullable
        public final pxo.a getShortcuts() {
            return this.shortcuts;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.success) * 31;
            pxo.a aVar = this.shortcuts;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "SupportShortcutList(success=" + this.success + ", shortcuts=" + this.shortcuts + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setResult_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData supportShortcutList_delegate$lambda$0() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<SetResult> getSetResult() {
        return (MutableLiveData) this.setResult.getValue();
    }

    @NotNull
    public final MutableLiveData<SupportShortcutList> getSupportShortcutList() {
        return (MutableLiveData) this.supportShortcutList.getValue();
    }

    public final void loadData(@NotNull final Function2<? super Integer, ? super pxo, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 35;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.shortcut.BleShortcutViewModel.loadData.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("load current shortcut fail: " + code, new Object[0]);
                callback.invoke(Integer.valueOf(code), null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                txo txoVarE;
                if (result == null) {
                    callback.invoke(255, null);
                    return;
                }
                s7r packet = result.getPacket();
                pxo pxoVarE = (packet == null || (txoVarE = packet.E()) == null) ? null : txoVarE.E();
                if (pxoVarE == null) {
                    callback.invoke(255, null);
                    return;
                }
                Logger.i("load current shortcut success: " + pxoVarE.c + " " + pxoVarE.d, new Object[0]);
                callback.invoke(0, pxoVarE);
            }
        }, 0, 8, null);
    }

    public final void setDownButton(@Nullable Pair<Integer, Integer> value) {
        final pxo pxoVar = new pxo();
        Intrinsics.checkNotNull(value);
        int iIntValue = ((Number) value.first).intValue();
        pxoVar.c = iIntValue;
        Logger.i("setSupportShortcut shortcut: " + iIntValue, new Object[0]);
        Object obj = value.second;
        if (obj != null) {
            pxoVar.d = ((Number) obj).intValue();
        }
        txo txoVar = new txo();
        txoVar.k0(pxoVar);
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 32;
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.shortcut.BleShortcutViewModel.setDownButton.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("setSupportShortcut fail: " + code, new Object[0]);
                BleShortcutViewModel.this.getSetResult().postValue(new SetResult(code, null));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null) {
                    BleShortcutViewModel.this.getSetResult().postValue(new SetResult(255, null));
                } else {
                    BleShortcutViewModel.this.getSetResult().postValue(new SetResult(0, pxoVar));
                    Logger.i("setSupportShortcut success", new Object[0]);
                }
            }
        }, 0, 8, null);
    }

    /* JADX INFO: renamed from: getSupportShortcutList, reason: collision with other method in class */
    public final void m270getSupportShortcutList() {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 38;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.shortcut.BleShortcutViewModel.getSupportShortcutList.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(BleShortcutViewModel.this.TAG, "getSupportShortcutList error: " + code);
                BleShortcutViewModel.this.getSupportShortcutList().postValue(new SupportShortcutList(false, null));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                txo txoVarE;
                if (result == null) {
                    BleShortcutViewModel.this.getSupportShortcutList().postValue(new SupportShortcutList(false, null));
                    return;
                }
                s7r packet = result.getPacket();
                pxo.a aVarF = (packet == null || (txoVarE = packet.E()) == null) ? null : txoVarE.F();
                if (aVarF == null) {
                    BleShortcutViewModel.this.getSupportShortcutList().postValue(new SupportShortcutList(false, null));
                    return;
                }
                Logger.i(BleShortcutViewModel.this.TAG, "getSupportShortcutList success size: " + aVarF.c.length);
                BleShortcutViewModel.this.getSupportShortcutList().postValue(new SupportShortcutList(true, aVarF));
            }
        }, 0, 8, null);
    }
}
