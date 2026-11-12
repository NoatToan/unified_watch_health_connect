package com.xiaomi.fitness.devicesettings.bluttooth.stock;

import android.annotation.SuppressLint;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.stock.StockListViewModel;
import com.xiaomi.fitness.sync.export.db.StockDatabase;
import com.xiaomi.fitness.sync.export.db.StockInfoEntity;
import com.xiaomi.fitness.sync.export.di.SyncExportManager;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.sync.export.model.StockModel;
import defpackage.be1;
import defpackage.bg4;
import defpackage.j5h;
import defpackage.jz6;
import defpackage.o4h;
import defpackage.s7r;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.xgo;
import defpackage.z5h;
import defpackage.zgo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0007¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\rR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001b¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "", "loadStockList", "()V", "", "symbol", "Lcom/xiaomi/fitness/sync/export/db/StockInfoEntity;", "getStockInfo", "(Ljava/lang/String;)Lcom/xiaomi/fitness/sync/export/db/StockInfoEntity;", "", "adapterPosition", "requestStockInfo", "(ILjava/lang/String;)V", "", "Lzgo;", "list", "saveList", "(Ljava/util/List;)V", "delete", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListViewModel$StockSymbolResult;", "stockSymbolList", "Landroidx/lifecycle/MutableLiveData;", "getStockSymbolList", "()Landroidx/lifecycle/MutableLiveData;", "setStockSymbolList", "(Landroidx/lifecycle/MutableLiveData;)V", "updateItemPosition", "getUpdateItemPosition", "setUpdateItemPosition", "", "getSaveList", "setSaveList", "deleteItemPosition", "getDeleteItemPosition", "setDeleteItemPosition", "<init>", "Companion", "StockSymbolResult", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStockListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockListViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,186:1\n37#2:187\n36#2,3:188\n*S KotlinDebug\n*F\n+ 1 StockListViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListViewModel\n*L\n123#1:187\n123#1:188,3\n*E\n"})
public final class StockListViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    public static final String TAG = "StockListViewModel";

    @NotNull
    private MutableLiveData<StockSymbolResult> stockSymbolList = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Integer> updateItemPosition = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> saveList = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Integer> deleteItemPosition = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b\t\u0010\u0004\"\u0004\b\u0017\u0010\u0018R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListViewModel$StockSymbolResult;", "", "", "component1", "()Z", "", "Lzgo;", "component2", "()Ljava/util/List;", "isSuc", "stockSymbolList", "copy", "(ZLjava/util/List;)Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockListViewModel$StockSymbolResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "setSuc", "(Z)V", "Ljava/util/List;", "getStockSymbolList", "setStockSymbolList", "(Ljava/util/List;)V", "<init>", "(ZLjava/util/List;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class StockSymbolResult {
        private boolean isSuc;

        @Nullable
        private List<zgo> stockSymbolList;

        public StockSymbolResult(boolean z, @Nullable List<zgo> list) {
            this.isSuc = z;
            this.stockSymbolList = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StockSymbolResult copy$default(StockSymbolResult stockSymbolResult, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = stockSymbolResult.isSuc;
            }
            if ((i & 2) != 0) {
                list = stockSymbolResult.stockSymbolList;
            }
            return stockSymbolResult.copy(z, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSuc() {
            return this.isSuc;
        }

        @Nullable
        public final List<zgo> component2() {
            return this.stockSymbolList;
        }

        @NotNull
        public final StockSymbolResult copy(boolean isSuc, @Nullable List<zgo> stockSymbolList) {
            return new StockSymbolResult(isSuc, stockSymbolList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StockSymbolResult)) {
                return false;
            }
            StockSymbolResult stockSymbolResult = (StockSymbolResult) other;
            return this.isSuc == stockSymbolResult.isSuc && Intrinsics.areEqual(this.stockSymbolList, stockSymbolResult.stockSymbolList);
        }

        @Nullable
        public final List<zgo> getStockSymbolList() {
            return this.stockSymbolList;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isSuc) * 31;
            List<zgo> list = this.stockSymbolList;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final boolean isSuc() {
            return this.isSuc;
        }

        public final void setStockSymbolList(@Nullable List<zgo> list) {
            this.stockSymbolList = list;
        }

        public final void setSuc(boolean z) {
            this.isSuc = z;
        }

        @NotNull
        public String toString() {
            return "StockSymbolResult(isSuc=" + this.isSuc + ", stockSymbolList=" + this.stockSymbolList + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadStockList$lambda$0(StockListViewModel this$0, StockSymbolResult stockSymbolResult, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(stockSymbolResult, "$stockSymbolResult");
        this$0.postDataLoaded();
        stockSymbolResult.setSuc(true);
        stockSymbolResult.setStockSymbolList(list);
        this$0.stockSymbolList.postValue(stockSymbolResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStockList$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadStockList$lambda$2(StockSymbolResult stockSymbolResult, StockListViewModel this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(stockSymbolResult, "$stockSymbolResult");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        stockSymbolResult.setStockSymbolList(null);
        stockSymbolResult.setSuc(false);
        this$0.stockSymbolList.postValue(stockSymbolResult);
        this$0.postDataLoaded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadStockList$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestStockInfo$lambda$4(StockListViewModel this$0, final String symbol, final v4h emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(symbol, "$symbol");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        if (this$0.getStockInfo(symbol) != null) {
            emitter.onNext(Boolean.TRUE);
            emitter.onComplete();
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(symbol);
            SyncExtKt.getInstance(SyncExportManager.INSTANCE).requestStockInfo(true, arrayList, new be1<StockModel.StockInfo>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockListViewModel$requestStockInfo$observable$1$1
                @Override // defpackage.be1
                public void onFailure() {
                }

                @Override // defpackage.be1
                public void onResponse(StockModel.StockInfo response) {
                    if ((response != null ? response.items : null) != null) {
                        boolean z = false;
                        for (StockModel.StockInfo.Item item : response.items) {
                            String symbol2 = item.symbol;
                            Intrinsics.checkNotNullExpressionValue(symbol2, "symbol");
                            String market = item.market;
                            Intrinsics.checkNotNullExpressionValue(market, "market");
                            String str = item.nameCN;
                            if (str == null) {
                                str = "";
                            }
                            String str2 = str;
                            Float latestPrice = item.latestPrice;
                            Intrinsics.checkNotNullExpressionValue(latestPrice, "latestPrice");
                            float fFloatValue = latestPrice.floatValue();
                            Float preClose = item.preClose;
                            Intrinsics.checkNotNullExpressionValue(preClose, "preClose");
                            float fFloatValue2 = preClose.floatValue();
                            Float f = item.halted;
                            int iFloatValue = f == null ? 0 : (int) f.floatValue();
                            Integer delay = item.delay;
                            Intrinsics.checkNotNullExpressionValue(delay, "delay");
                            int iIntValue = delay.intValue();
                            Long timestamp = item.timestamp;
                            Intrinsics.checkNotNullExpressionValue(timestamp, "timestamp");
                            StockDatabase.INSTANCE.getInstance().getStockDao().insertOrUpdate(new StockInfoEntity(symbol2, market, str2, fFloatValue, fFloatValue2, iFloatValue, iIntValue, timestamp.longValue(), System.currentTimeMillis()));
                            if (item.symbol.equals(symbol)) {
                                z = true;
                            }
                        }
                        if (z) {
                            emitter.onNext(Boolean.TRUE);
                            emitter.onComplete();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveList$lambda$5(List list, final StockListViewModel this$0, final v4h emitter) {
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        final zgo.a aVar = new zgo.a();
        aVar.c = (zgo[]) list.toArray(new zgo[0]);
        s7r s7rVar = new s7r();
        s7rVar.e = 11;
        s7rVar.f = 3;
        xgo xgoVar = new xgo();
        xgoVar.s(aVar);
        s7rVar.b0(xgoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockListViewModel$saveList$observable$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                this$0.postDataLoaded();
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                emitter.onNext(aVar);
                emitter.onComplete();
            }
        }, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveList$lambda$6(StockListViewModel this$0, zgo.a aVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onSuccess saveList $ suc listy=" + aVar);
        this$0.postDataLoaded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveList$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveList$lambda$8(StockListViewModel this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "onError saveList  =" + th);
        this$0.postDataLoaded();
        this$0.loadStockList();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveList$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    public final void delete(final int adapterPosition, @Nullable final String symbol) {
        s7r s7rVar = new s7r();
        s7rVar.e = 11;
        s7rVar.f = 2;
        xgo xgoVar = new xgo();
        xgoVar.t(symbol);
        s7rVar.b0(xgoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockListViewModel.delete.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(StockListViewModel.TAG, "onError deleteStock  code$ =" + code);
                this.loadStockList();
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result != null) {
                    int i = adapterPosition;
                    Logger.i(StockListViewModel.TAG, "onSuccess deleteStockPosition " + i + " suc position=" + i);
                    SyncExportManager syncExtKt = SyncExtKt.getInstance(SyncExportManager.INSTANCE);
                    String str = symbol;
                    Intrinsics.checkNotNull(str);
                    syncExtKt.deleteStockSymbol(str);
                    this.getDeleteItemPosition().postValue(Integer.valueOf(adapterPosition));
                }
            }
        }, 0, 8, null);
    }

    @NotNull
    public final MutableLiveData<Integer> getDeleteItemPosition() {
        return this.deleteItemPosition;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSaveList() {
        return this.saveList;
    }

    @Nullable
    public final StockInfoEntity getStockInfo(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return StockDatabase.INSTANCE.getInstance().getStockDao().getStockInfo(symbol);
    }

    @NotNull
    public final MutableLiveData<StockSymbolResult> getStockSymbolList() {
        return this.stockSymbolList;
    }

    @NotNull
    public final MutableLiveData<Integer> getUpdateItemPosition() {
        return this.updateItemPosition;
    }

    @SuppressLint({"CheckResult"})
    public final void loadStockList() {
        postDataOnLoading();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            return;
        }
        final StockSymbolResult stockSymbolResult = new StockSymbolResult(false, null);
        o4h<List<zgo>> stockSymbolList = SyncExtKt.getInstance(SyncExportManager.INSTANCE).getStockSymbolList(wearableDeviceModel.getDid());
        final Function1 function1 = new Function1() { // from class: tgo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockListViewModel.loadStockList$lambda$0(this.f34682a, stockSymbolResult, (List) obj);
            }
        };
        bg4<? super List<zgo>> bg4Var = new bg4() { // from class: ugo
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                StockListViewModel.loadStockList$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: vgo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockListViewModel.loadStockList$lambda$2(stockSymbolResult, this, (Throwable) obj);
            }
        };
        stockSymbolList.O(bg4Var, new bg4() { // from class: wgo
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                StockListViewModel.loadStockList$lambda$3(function2, obj);
            }
        });
    }

    public final void requestStockInfo(final int adapterPosition, @NotNull final String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        o4h o4hVarF = o4h.f(new j5h() { // from class: ngo
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                StockListViewModel.requestStockInfo$lambda$4(this.f27914a, symbol, v4hVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(o4hVarF, "create(...)");
        o4hVarF.H(ua1.c()).a(new z5h<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockListViewModel.requestStockInfo.1
            @Override // defpackage.z5h
            public void onComplete() {
            }

            @Override // defpackage.z5h
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
            }

            @Override // defpackage.z5h
            public /* bridge */ /* synthetic */ void onNext(Boolean bool) {
                onNext(bool.booleanValue());
            }

            @Override // defpackage.z5h
            public void onSubscribe(jz6 d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }

            public void onNext(boolean t) {
                StockListViewModel.this.getUpdateItemPosition().postValue(Integer.valueOf(adapterPosition));
            }
        });
    }

    public final void saveList(@NotNull final List<zgo> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        postDataOnLoading();
        o4h o4hVarH = o4h.f(new j5h() { // from class: ogo
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                StockListViewModel.saveList$lambda$5(list, this, v4hVar);
            }
        }).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: pgo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockListViewModel.saveList$lambda$6(this.f30382a, (zgo.a) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: qgo
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                StockListViewModel.saveList$lambda$7(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: rgo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockListViewModel.saveList$lambda$8(this.f32528a, (Throwable) obj);
            }
        };
        o4hVarH.O(bg4Var, new bg4() { // from class: sgo
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                StockListViewModel.saveList$lambda$9(function2, obj);
            }
        });
    }

    public final void setDeleteItemPosition(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.deleteItemPosition = mutableLiveData;
    }

    public final void setSaveList(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.saveList = mutableLiveData;
    }

    public final void setStockSymbolList(@NotNull MutableLiveData<StockSymbolResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.stockSymbolList = mutableLiveData;
    }

    public final void setUpdateItemPosition(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.updateItemPosition = mutableLiveData;
    }
}
