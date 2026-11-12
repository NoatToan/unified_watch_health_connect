package com.xiaomi.fitness.devicesettings.bluttooth.sportsort;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import defpackage.rxo;
import defpackage.s7r;
import defpackage.txo;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u001c\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "loadSportSortItem", "()V", "Ljava/util/LinkedList;", "Lrxo;", "sportOptionList", "setSportSortItem", "(Ljava/util/LinkedList;)V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "", "TAG", "Ljava/lang/String;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortViewModel$LoadRet;", "loadRet$delegate", "Lkotlin/Lazy;", "getLoadRet", "()Landroidx/lifecycle/MutableLiveData;", "loadRet", "", "setRet$delegate", "getSetRet", "setRet", "<init>", "LoadRet", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportSortViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSortViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,86:1\n37#2:87\n36#2,3:88\n*S KotlinDebug\n*F\n+ 1 SportSortViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortViewModel\n*L\n59#1:87\n59#1:88,3\n*E\n"})
public final class SportSortViewModel extends AbsViewModel {

    @NotNull
    private final String TAG = "SportSortViewModel";

    /* JADX INFO: renamed from: loadRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l1o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportSortViewModel.loadRet_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: setRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: m1o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportSortViewModel.setRet_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortViewModel$LoadRet;", "", "", "Lrxo;", "component1", "()Ljava/util/List;", "", "component2", "()I", "optionList", "code", "copy", "(Ljava/util/List;I)Lcom/xiaomi/fitness/devicesettings/bluttooth/sportsort/SportSortViewModel$LoadRet;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOptionList", "I", "getCode", "<init>", "(Ljava/util/List;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class LoadRet {
        private final int code;

        @Nullable
        private final List<rxo> optionList;

        public LoadRet(@Nullable List<rxo> list, int i) {
            this.optionList = list;
            this.code = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadRet copy$default(LoadRet loadRet, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = loadRet.optionList;
            }
            if ((i2 & 2) != 0) {
                i = loadRet.code;
            }
            return loadRet.copy(list, i);
        }

        @Nullable
        public final List<rxo> component1() {
            return this.optionList;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final LoadRet copy(@Nullable List<rxo> optionList, int code) {
            return new LoadRet(optionList, code);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadRet)) {
                return false;
            }
            LoadRet loadRet = (LoadRet) other;
            return Intrinsics.areEqual(this.optionList, loadRet.optionList) && this.code == loadRet.code;
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final List<rxo> getOptionList() {
            return this.optionList;
        }

        public int hashCode() {
            List<rxo> list = this.optionList;
            return ((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.code);
        }

        @NotNull
        public String toString() {
            return "LoadRet(optionList=" + this.optionList + ", code=" + this.code + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData loadRet_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setRet_delegate$lambda$1() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<LoadRet> getLoadRet() {
        return (MutableLiveData) this.loadRet.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getSetRet() {
        return (MutableLiveData) this.setRet.getValue();
    }

    public final void loadSportSortItem() {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 39;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortViewModel.loadSportSortItem.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(SportSortViewModel.this.TAG, "loadSportSortItem fail, code: " + code);
                SportSortViewModel.this.getLoadRet().postValue(new LoadRet(null, code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                txo txoVarE;
                rxo.a aVarG;
                if (result == null || !SyncResultExitKt.isSuccess(result)) {
                    SportSortViewModel.this.getLoadRet().postValue(new LoadRet(null, 255));
                    return;
                }
                Logger.i(SportSortViewModel.this.TAG, "loadSportSortItem success");
                s7r packet = result.getPacket();
                rxo[] rxoVarArr = (packet == null || (txoVarE = packet.E()) == null || (aVarG = txoVarE.G()) == null) ? null : aVarG.c;
                if (rxoVarArr != null) {
                    SportSortViewModel.this.getLoadRet().postValue(new LoadRet(ArraysKt___ArraysJvmKt.asList(rxoVarArr), result.getCode()));
                } else {
                    SportSortViewModel.this.getLoadRet().postValue(new LoadRet(null, 255));
                }
            }
        }, 0, 8, null);
    }

    public final void setSportSortItem(@NotNull LinkedList<rxo> sportOptionList) {
        Intrinsics.checkNotNullParameter(sportOptionList, "sportOptionList");
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 40;
        rxo[] rxoVarArr = (rxo[]) sportOptionList.toArray(new rxo[0]);
        rxo.a aVar = new rxo.a();
        aVar.c = rxoVarArr;
        txo txoVar = new txo();
        txoVar.l0(aVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.sportsort.SportSortViewModel.setSportSortItem.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(SportSortViewModel.this.TAG, "setSportSortItem fail, code: " + code);
                SportSortViewModel.this.getSetRet().postValue(Integer.valueOf(code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null || !SyncResultExitKt.isSuccess(result)) {
                    SportSortViewModel.this.getSetRet().postValue(result != null ? Integer.valueOf(result.getCode()) : null);
                } else {
                    Logger.i(SportSortViewModel.this.TAG, "setSportSortItem success");
                    SportSortViewModel.this.getSetRet().postValue(0);
                }
            }
        }, 0, 8, null);
    }
}
