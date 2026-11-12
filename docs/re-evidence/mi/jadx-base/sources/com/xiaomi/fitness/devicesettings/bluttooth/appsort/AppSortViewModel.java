package com.xiaomi.fitness.devicesettings.bluttooth.appsort;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortViewModel;
import defpackage.jwo;
import defpackage.s7r;
import defpackage.txo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "getAppListRet", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortViewModel$GetAppListRet;", "getGetAppListRet", "()Landroidx/lifecycle/MutableLiveData;", "getAppListRet$delegate", "Lkotlin/Lazy;", "getAppList", "", "setResult", "", "getSetResult", "setResult$delegate", "setAppSort", "appWrapperList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortWrapper;", "GetAppListRet", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppSortViewModel extends AbsViewModel {

    @NotNull
    private final String TAG = "AppSortViewModel";

    /* JADX INFO: renamed from: getAppListRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getAppListRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hh1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppSortViewModel.getAppListRet_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: setResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ih1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppSortViewModel.setResult_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortViewModel$GetAppListRet;", "", "", "component1", "()I", "", "Ljwo;", "component2", "()Ljava/util/List;", "code", "list", "copy", "(ILjava/util/List;)Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortViewModel$GetAppListRet;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "Ljava/util/List;", "getList", "<init>", "(ILjava/util/List;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class GetAppListRet {
        private final int code;

        @Nullable
        private final List<jwo> list;

        public GetAppListRet(int i, @Nullable List<jwo> list) {
            this.code = i;
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GetAppListRet copy$default(GetAppListRet getAppListRet, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = getAppListRet.code;
            }
            if ((i2 & 2) != 0) {
                list = getAppListRet.list;
            }
            return getAppListRet.copy(i, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final List<jwo> component2() {
            return this.list;
        }

        @NotNull
        public final GetAppListRet copy(int code, @Nullable List<jwo> list) {
            return new GetAppListRet(code, list);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetAppListRet)) {
                return false;
            }
            GetAppListRet getAppListRet = (GetAppListRet) other;
            return this.code == getAppListRet.code && Intrinsics.areEqual(this.list, getAppListRet.list);
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final List<jwo> getList() {
            return this.list;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            List<jwo> list = this.list;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "GetAppListRet(code=" + this.code + ", list=" + this.list + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData getAppListRet_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setResult_delegate$lambda$1() {
        return new MutableLiveData();
    }

    public final void getAppList() {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 29;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortViewModel.getAppList.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(AppSortViewModel.this.TAG, "getOrderAppList fail: " + code);
                AppSortViewModel.this.getGetAppListRet().postValue(new GetAppListRet(code, null));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                txo txoVarE;
                if (result == null) {
                    AppSortViewModel.this.getGetAppListRet().postValue(new GetAppListRet(255, null));
                    return;
                }
                s7r packet = result.getPacket();
                jwo.a aVarP = (packet == null || (txoVarE = packet.E()) == null) ? null : txoVarE.p();
                if (aVarP == null) {
                    AppSortViewModel.this.getGetAppListRet().postValue(new GetAppListRet(255, null));
                    return;
                }
                jwo[] list = aVarP.c;
                Intrinsics.checkNotNullExpressionValue(list, "list");
                List list2 = ArraysKt___ArraysKt.toList(list);
                Logger.i(AppSortViewModel.this.TAG, "getOrderAppList: " + list2);
                AppSortViewModel.this.getGetAppListRet().postValue(new GetAppListRet(0, list2));
            }
        }, 0, 8, null);
    }

    @NotNull
    public final MutableLiveData<GetAppListRet> getGetAppListRet() {
        return (MutableLiveData) this.getAppListRet.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getSetResult() {
        return (MutableLiveData) this.setResult.getValue();
    }

    public final void setAppSort(@Nullable List<AppSortWrapper> appWrapperList) {
        List<AppSortWrapper> list = appWrapperList;
        if (list == null || list.isEmpty()) {
            getSetResult().postValue(255);
            return;
        }
        Logger.i(this.TAG, "setAppSort: " + appWrapperList);
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 30;
        jwo[] jwoVarArr = new jwo[appWrapperList.size()];
        int size = appWrapperList.size();
        for (int i = 0; i < size; i++) {
            AppSortWrapper appSortWrapper = appWrapperList.get(i);
            if (appSortWrapper.getViewType() != 4 && appSortWrapper.getViewType() != 3) {
                jwoVarArr[i] = appWrapperList.get(i).getData();
            }
        }
        jwo.a aVar = new jwo.a();
        aVar.c = jwoVarArr;
        txo txoVar = new txo();
        txoVar.V(aVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.appsort.AppSortViewModel.setAppSort.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(AppSortViewModel.this.TAG, "setOrderAppList fail: " + code);
                AppSortViewModel.this.getSetResult().postValue(Integer.valueOf(code));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null) {
                    AppSortViewModel.this.getSetResult().postValue(255);
                } else {
                    Logger.i(AppSortViewModel.this.TAG, "setOrderAppList success");
                    AppSortViewModel.this.getSetResult().postValue(0);
                }
            }
        }, 0, 8, null);
    }
}
