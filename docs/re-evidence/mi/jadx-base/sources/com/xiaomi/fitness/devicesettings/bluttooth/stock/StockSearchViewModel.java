package com.xiaomi.fitness.devicesettings.bluttooth.stock;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.stock.StockSearchViewModel;
import com.xiaomi.fitness.sync.export.db.StockDatabase;
import com.xiaomi.fitness.sync.export.db.StockInfoEntity;
import com.xiaomi.fitness.sync.export.di.SyncExportManager;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.sync.export.model.StockModel;
import defpackage.be1;
import defpackage.bg4;
import defpackage.bua;
import defpackage.j5h;
import defpackage.jz6;
import defpackage.o4h;
import defpackage.o5h;
import defpackage.s7r;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.v84;
import defpackage.xgo;
import defpackage.ygo;
import defpackage.z5h;
import defpackage.zgo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 -2\u00020\u0001:\u0004-./0B\u0007¢\u0006\u0004\b,\u0010\u0014J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020)0\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "Lygo;", "stockInfo", "Lo4h;", "", "syncStockInfo", "(Lygo;)Lo4h;", "Lzgo$a;", "stockSymbolList", "", "Lzgo;", "syncStockList", "(Lzgo$a;)Lo4h;", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult$Item;", "item", "getStockInfo", "(Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult$Item;)Lo4h;", "", "loadStockList", "()V", "", "adapterPosition", "sortedList", "add", "(ILcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult$Item;Lzgo$a;)V", "", "text", "requestStockSuggest", "(Ljava/lang/String;)V", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchViewModel$StockSymbolResult;", "Landroidx/lifecycle/MutableLiveData;", "getStockSymbolList", "()Landroidx/lifecycle/MutableLiveData;", "setStockSymbolList", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchViewModel$AddSymbolResult;", "addSymbolList", "getAddSymbolList", "setAddSymbolList", "Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchViewModel$RequestStockSuggestResult;", "getRequestStockSuggest", "setRequestStockSuggest", "<init>", "Companion", "StockSymbolResult", "AddSymbolResult", "RequestStockSuggestResult", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StockSearchViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    public static final String TAG = "StockSearchViewModel";

    @NotNull
    private MutableLiveData<StockSymbolResult> stockSymbolList = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<AddSymbolResult> addSymbolList = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<RequestStockSuggestResult> requestStockSuggest = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\f\u0010\u0004\"\u0004\b\u0019\u0010\u001aR\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u001eR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchViewModel$AddSymbolResult;", "", "", "component1", "()Z", "", "component2", "()I", "", "Lzgo;", "component3", "()Ljava/util/List;", "isSuc", "adapterPosition", "stockSymbolList", "copy", "(ZILjava/util/List;)Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchViewModel$AddSymbolResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "setSuc", "(Z)V", "I", "getAdapterPosition", "setAdapterPosition", "(I)V", "Ljava/util/List;", "getStockSymbolList", "setStockSymbolList", "(Ljava/util/List;)V", "<init>", "(ZILjava/util/List;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class AddSymbolResult {
        private int adapterPosition;
        private boolean isSuc;

        @Nullable
        private List<zgo> stockSymbolList;

        public AddSymbolResult(boolean z, int i, @Nullable List<zgo> list) {
            this.isSuc = z;
            this.adapterPosition = i;
            this.stockSymbolList = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddSymbolResult copy$default(AddSymbolResult addSymbolResult, boolean z, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = addSymbolResult.isSuc;
            }
            if ((i2 & 2) != 0) {
                i = addSymbolResult.adapterPosition;
            }
            if ((i2 & 4) != 0) {
                list = addSymbolResult.stockSymbolList;
            }
            return addSymbolResult.copy(z, i, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSuc() {
            return this.isSuc;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getAdapterPosition() {
            return this.adapterPosition;
        }

        @Nullable
        public final List<zgo> component3() {
            return this.stockSymbolList;
        }

        @NotNull
        public final AddSymbolResult copy(boolean isSuc, int adapterPosition, @Nullable List<zgo> stockSymbolList) {
            return new AddSymbolResult(isSuc, adapterPosition, stockSymbolList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddSymbolResult)) {
                return false;
            }
            AddSymbolResult addSymbolResult = (AddSymbolResult) other;
            return this.isSuc == addSymbolResult.isSuc && this.adapterPosition == addSymbolResult.adapterPosition && Intrinsics.areEqual(this.stockSymbolList, addSymbolResult.stockSymbolList);
        }

        public final int getAdapterPosition() {
            return this.adapterPosition;
        }

        @Nullable
        public final List<zgo> getStockSymbolList() {
            return this.stockSymbolList;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isSuc) * 31) + Integer.hashCode(this.adapterPosition)) * 31;
            List<zgo> list = this.stockSymbolList;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final boolean isSuc() {
            return this.isSuc;
        }

        public final void setAdapterPosition(int i) {
            this.adapterPosition = i;
        }

        public final void setStockSymbolList(@Nullable List<zgo> list) {
            this.stockSymbolList = list;
        }

        public final void setSuc(boolean z) {
            this.isSuc = z;
        }

        @NotNull
        public String toString() {
            return "AddSymbolResult(isSuc=" + this.isSuc + ", adapterPosition=" + this.adapterPosition + ", stockSymbolList=" + this.stockSymbolList + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchViewModel$RequestStockSuggestResult;", "", "isSuc", "", "text", "", "stockInfo", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;", "<init>", "(ZLjava/lang/String;Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;)V", "()Z", "setSuc", "(Z)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getStockInfo", "()Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;", "setStockInfo", "(Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequestStockSuggestResult {
        private boolean isSuc;

        @Nullable
        private StockModel.StockSuggestResult stockInfo;

        @NotNull
        private String text;

        public RequestStockSuggestResult(boolean z, @NotNull String text, @Nullable StockModel.StockSuggestResult stockSuggestResult) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.isSuc = z;
            this.text = text;
            this.stockInfo = stockSuggestResult;
        }

        public static /* synthetic */ RequestStockSuggestResult copy$default(RequestStockSuggestResult requestStockSuggestResult, boolean z, String str, StockModel.StockSuggestResult stockSuggestResult, int i, Object obj) {
            if ((i & 1) != 0) {
                z = requestStockSuggestResult.isSuc;
            }
            if ((i & 2) != 0) {
                str = requestStockSuggestResult.text;
            }
            if ((i & 4) != 0) {
                stockSuggestResult = requestStockSuggestResult.stockInfo;
            }
            return requestStockSuggestResult.copy(z, str, stockSuggestResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSuc() {
            return this.isSuc;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final StockModel.StockSuggestResult getStockInfo() {
            return this.stockInfo;
        }

        @NotNull
        public final RequestStockSuggestResult copy(boolean isSuc, @NotNull String text, @Nullable StockModel.StockSuggestResult stockInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new RequestStockSuggestResult(isSuc, text, stockInfo);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestStockSuggestResult)) {
                return false;
            }
            RequestStockSuggestResult requestStockSuggestResult = (RequestStockSuggestResult) other;
            return this.isSuc == requestStockSuggestResult.isSuc && Intrinsics.areEqual(this.text, requestStockSuggestResult.text) && Intrinsics.areEqual(this.stockInfo, requestStockSuggestResult.stockInfo);
        }

        @Nullable
        public final StockModel.StockSuggestResult getStockInfo() {
            return this.stockInfo;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isSuc) * 31) + this.text.hashCode()) * 31;
            StockModel.StockSuggestResult stockSuggestResult = this.stockInfo;
            return iHashCode + (stockSuggestResult == null ? 0 : stockSuggestResult.hashCode());
        }

        public final boolean isSuc() {
            return this.isSuc;
        }

        public final void setStockInfo(@Nullable StockModel.StockSuggestResult stockSuggestResult) {
            this.stockInfo = stockSuggestResult;
        }

        public final void setSuc(boolean z) {
            this.isSuc = z;
        }

        public final void setText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }

        @NotNull
        public String toString() {
            return "RequestStockSuggestResult(isSuc=" + this.isSuc + ", text=" + this.text + ", stockInfo=" + this.stockInfo + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004\"\u0004\b\u0019\u0010\u001aR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchViewModel$StockSymbolResult;", "", "", "component1", "()Ljava/lang/Throwable;", "", "Lzgo;", "component2", "()Ljava/util/List;", "throwable", "stockSymbolList", "copy", "(Ljava/lang/Throwable;Ljava/util/List;)Lcom/xiaomi/fitness/devicesettings/bluttooth/stock/StockSearchViewModel$StockSymbolResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "setThrowable", "(Ljava/lang/Throwable;)V", "Ljava/util/List;", "getStockSymbolList", "setStockSymbolList", "(Ljava/util/List;)V", "<init>", "(Ljava/lang/Throwable;Ljava/util/List;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final /* data */ class StockSymbolResult {

        @Nullable
        private List<zgo> stockSymbolList;

        @Nullable
        private Throwable throwable;

        public StockSymbolResult(@Nullable Throwable th, @Nullable List<zgo> list) {
            this.throwable = th;
            this.stockSymbolList = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StockSymbolResult copy$default(StockSymbolResult stockSymbolResult, Throwable th, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                th = stockSymbolResult.throwable;
            }
            if ((i & 2) != 0) {
                list = stockSymbolResult.stockSymbolList;
            }
            return stockSymbolResult.copy(th, list);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @Nullable
        public final List<zgo> component2() {
            return this.stockSymbolList;
        }

        @NotNull
        public final StockSymbolResult copy(@Nullable Throwable throwable, @Nullable List<zgo> stockSymbolList) {
            return new StockSymbolResult(throwable, stockSymbolList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StockSymbolResult)) {
                return false;
            }
            StockSymbolResult stockSymbolResult = (StockSymbolResult) other;
            return Intrinsics.areEqual(this.throwable, stockSymbolResult.throwable) && Intrinsics.areEqual(this.stockSymbolList, stockSymbolResult.stockSymbolList);
        }

        @Nullable
        public final List<zgo> getStockSymbolList() {
            return this.stockSymbolList;
        }

        @Nullable
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            Throwable th = this.throwable;
            int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
            List<zgo> list = this.stockSymbolList;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final void setStockSymbolList(@Nullable List<zgo> list) {
            this.stockSymbolList = list;
        }

        public final void setThrowable(@Nullable Throwable th) {
            this.throwable = th;
        }

        @NotNull
        public String toString() {
            return "StockSymbolResult(throwable=" + this.throwable + ", stockSymbolList=" + this.stockSymbolList + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h add$lambda$0(StockSearchViewModel this$0, ygo stockInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(stockInfo, "stockInfo");
        return this$0.syncStockInfo(stockInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h add$lambda$1(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (o5h) tmp0.invoke2(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h add$lambda$2(StockSearchViewModel this$0, zgo.a sortedList, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sortedList, "$sortedList");
        Intrinsics.checkNotNullParameter(it, "it");
        return this$0.syncStockList(sortedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o5h add$lambda$3(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return (o5h) tmp0.invoke2(p0);
    }

    private final o4h<ygo> getStockInfo(final StockModel.StockSuggestResult.Item item) {
        final ArrayList arrayList = new ArrayList();
        String symbol = item.symbol;
        Intrinsics.checkNotNullExpressionValue(symbol, "symbol");
        arrayList.add(symbol);
        o4h<ygo> o4hVarF = o4h.f(new j5h() { // from class: pho
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                StockSearchViewModel.getStockInfo$lambda$6(arrayList, item, v4hVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(o4hVarF, "create(...)");
        return o4hVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getStockInfo$lambda$6(List list, final StockModel.StockSuggestResult.Item item, final v4h emitter) {
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        SyncExtKt.getInstance(SyncExportManager.INSTANCE).requestStockInfo(true, list, new be1<StockModel.StockInfo>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockSearchViewModel$getStockInfo$1$1
            @Override // defpackage.be1
            public void onFailure() {
                Logger.i(StockSearchViewModel.TAG, "getStockInfo onFailure");
            }

            @Override // defpackage.be1
            public void onResponse(StockModel.StockInfo response) {
                float fFloatValue;
                Intrinsics.checkNotNullParameter(response, "response");
                List<StockModel.StockInfo.Item> list2 = response.items;
                ygo ygoVar = null;
                if (list2 != null) {
                    Iterator<StockModel.StockInfo.Item> it = list2.iterator();
                    while (it.hasNext()) {
                        StockModel.StockInfo.Item next = it.next();
                        String symbol = next.symbol;
                        Intrinsics.checkNotNullExpressionValue(symbol, "symbol");
                        String market = next.market;
                        Intrinsics.checkNotNullExpressionValue(market, "market");
                        String str = next.nameCN;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        Float latestPrice = next.latestPrice;
                        Intrinsics.checkNotNullExpressionValue(latestPrice, "latestPrice");
                        float fFloatValue2 = latestPrice.floatValue();
                        Float preClose = next.preClose;
                        Intrinsics.checkNotNullExpressionValue(preClose, "preClose");
                        float fFloatValue3 = preClose.floatValue();
                        Float f = next.halted;
                        int iIntValue = 0;
                        int iFloatValue = f == null ? 0 : (int) f.floatValue();
                        Integer delay = next.delay;
                        Intrinsics.checkNotNullExpressionValue(delay, "delay");
                        int iIntValue2 = delay.intValue();
                        Long timestamp = next.timestamp;
                        it = it;
                        Intrinsics.checkNotNullExpressionValue(timestamp, "timestamp");
                        ygo ygoVar2 = ygoVar;
                        StockDatabase.INSTANCE.getInstance().getStockDao().insertOrUpdate(new StockInfoEntity(symbol, market, str2, fFloatValue2, fFloatValue3, iFloatValue, iIntValue2, timestamp.longValue(), System.currentTimeMillis()));
                        if (next.symbol.equals(item.symbol)) {
                            ygoVar = new ygo();
                            ygoVar.c = v84.d(next.symbol);
                            ygoVar.d = v84.d(next.market);
                            ygoVar.e = v84.d(next.nameCN);
                            Float latestPrice2 = next.latestPrice;
                            float fFloatValue4 = 0.0f;
                            if (latestPrice2 == null) {
                                fFloatValue = 0.0f;
                            } else {
                                Intrinsics.checkNotNullExpressionValue(latestPrice2, "latestPrice");
                                fFloatValue = latestPrice2.floatValue();
                            }
                            ygoVar.f = fFloatValue;
                            Float preClose2 = next.preClose;
                            if (preClose2 != null) {
                                Intrinsics.checkNotNullExpressionValue(preClose2, "preClose");
                                fFloatValue4 = preClose2.floatValue();
                            }
                            ygoVar.g = fFloatValue4;
                            Float f2 = next.halted;
                            ygoVar.h = f2 == null ? 0 : (int) f2.floatValue();
                            Long l = next.timestamp;
                            ygoVar.i = l == null ? 0 : (int) (l.longValue() / ((long) 1000));
                            Integer delay2 = next.delay;
                            if (delay2 != null) {
                                Intrinsics.checkNotNullExpressionValue(delay2, "delay");
                                iIntValue = delay2.intValue();
                            }
                            ygoVar.j = iIntValue;
                        } else {
                            ygoVar = ygoVar2;
                        }
                    }
                }
                if (ygoVar != null) {
                    Logger.i(StockSearchViewModel.TAG, "getStockInfo onResponse stockInfo = " + ygoVar);
                    emitter.onNext(ygoVar);
                    emitter.onComplete();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestStockSuggest$lambda$12$lambda$10(RequestStockSuggestResult requestStockSuggestResult, StockSearchViewModel this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(requestStockSuggestResult, "$requestStockSuggestResult");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        requestStockSuggestResult.setSuc(false);
        this$0.requestStockSuggest.postValue(requestStockSuggestResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestStockSuggest$lambda$12$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestStockSuggest$lambda$12$lambda$8(RequestStockSuggestResult requestStockSuggestResult, StockSearchViewModel this$0, StockModel.StockSuggestResult stockSuggestResult) {
        Intrinsics.checkNotNullParameter(requestStockSuggestResult, "$requestStockSuggestResult");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        requestStockSuggestResult.setSuc(true);
        requestStockSuggestResult.setStockInfo(stockSuggestResult);
        this$0.requestStockSuggest.postValue(requestStockSuggestResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestStockSuggest$lambda$12$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestStockSuggest$lambda$7(final String text, final v4h emitter) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        SyncExtKt.getInstance(SyncExportManager.INSTANCE).requestStockSuggest(true, text, new be1<StockModel.StockSuggestResult>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockSearchViewModel$requestStockSuggest$observable$1$1
            @Override // defpackage.be1
            public void onFailure() {
                Logger.i(StockSearchViewModel.TAG, "requestStockSuggest onFailure = " + text);
            }

            @Override // defpackage.be1
            public void onResponse(StockModel.StockSuggestResult response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Logger.i(StockSearchViewModel.TAG, "requestStockSuggest onResponse = " + response.ret);
                emitter.onNext(response);
                emitter.onComplete();
            }
        });
    }

    private final o4h<Boolean> syncStockInfo(final ygo stockInfo) {
        o4h<Boolean> o4hVarF = o4h.f(new j5h() { // from class: lho
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                StockSearchViewModel.syncStockInfo$lambda$4(stockInfo, v4hVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(o4hVarF, "create(...)");
        return o4hVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncStockInfo$lambda$4(ygo stockInfo, final v4h emitter) {
        Intrinsics.checkNotNullParameter(stockInfo, "$stockInfo");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        s7r s7rVar = new s7r();
        s7rVar.e = 11;
        s7rVar.f = 0;
        xgo xgoVar = new xgo();
        xgoVar.q(stockInfo);
        s7rVar.b0(xgoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockSearchViewModel$syncStockInfo$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(StockSearchViewModel.TAG, "syncStockInfo onError resultCode = " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Intrinsics.checkNotNull(result);
                Logger.i(StockSearchViewModel.TAG, "syncStockInfo onSuccess resultCode = " + result.getCode());
                if (result.getCode() == 0) {
                    emitter.onNext(Boolean.TRUE);
                    emitter.onComplete();
                }
            }
        }, 0, 8, null);
    }

    private final o4h<List<zgo>> syncStockList(final zgo.a stockSymbolList) {
        o4h<List<zgo>> o4hVarF = o4h.f(new j5h() { // from class: oho
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                StockSearchViewModel.syncStockList$lambda$5(stockSymbolList, v4hVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(o4hVarF, "create(...)");
        return o4hVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncStockList$lambda$5(final zgo.a stockSymbolList, final v4h emitter) {
        Intrinsics.checkNotNullParameter(stockSymbolList, "$stockSymbolList");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        s7r s7rVar = new s7r();
        s7rVar.e = 11;
        s7rVar.f = 3;
        xgo xgoVar = new xgo();
        xgoVar.s(stockSymbolList);
        s7rVar.b0(xgoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockSearchViewModel$syncStockList$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(StockSearchViewModel.TAG, "syncStockList onError  = " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null || result.getCode() != 0) {
                    return;
                }
                SyncExtKt.getInstance(SyncExportManager.INSTANCE).setStockSymbolList(stockSymbolList);
                ArrayList arrayList = new ArrayList();
                zgo[] zgoVarArr = stockSymbolList.c;
                if (zgoVarArr != null) {
                    Iterator it = ArrayIteratorKt.iterator(zgoVarArr);
                    while (it.hasNext()) {
                        ListExtKt.add(arrayList, (zgo) it.next());
                    }
                }
                Logger.i(StockSearchViewModel.TAG, "syncStockList onSuccess  = " + result.getCode());
                emitter.onNext(arrayList);
                emitter.onComplete();
            }
        }, 0, 8, null);
    }

    public final void add(int adapterPosition, @NotNull StockModel.StockSuggestResult.Item item, @NotNull final zgo.a sortedList) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(sortedList, "sortedList");
        final AddSymbolResult addSymbolResult = new AddSymbolResult(false, adapterPosition, null);
        postDataOnLoading();
        o4h<ygo> stockInfo = getStockInfo(item);
        final Function1 function1 = new Function1() { // from class: vho
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockSearchViewModel.add$lambda$0(this.f36909a, (ygo) obj);
            }
        };
        o4h<R> o4hVarR = stockInfo.r(new bua() { // from class: who
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return StockSearchViewModel.add$lambda$1(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: mho
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockSearchViewModel.add$lambda$2(this.f26196a, sortedList, (Boolean) obj);
            }
        };
        o4hVarR.r(new bua() { // from class: nho
            @Override // defpackage.bua
            public final Object apply(Object obj) {
                return StockSearchViewModel.add$lambda$3(function2, obj);
            }
        }).H(ua1.c()).a(new z5h<List<? extends zgo>>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockSearchViewModel.add.3
            @Override // defpackage.z5h
            public void onComplete() {
            }

            @Override // defpackage.z5h
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                StockSearchViewModel.this.postDataLoaded();
                addSymbolResult.setSuc(false);
                Logger.i(StockSearchViewModel.TAG, "add onError Throwable = " + e);
                StockSearchViewModel.this.getAddSymbolList().postValue(addSymbolResult);
            }

            @Override // defpackage.z5h
            public /* bridge */ /* synthetic */ void onNext(List<? extends zgo> list) {
                onNext2((List<zgo>) list);
            }

            @Override // defpackage.z5h
            public void onSubscribe(jz6 d) {
                Intrinsics.checkNotNullParameter(d, "d");
                Logger.i(StockSearchViewModel.TAG, "add onSubscribe Disposable = " + d);
            }

            /* JADX INFO: renamed from: onNext, reason: avoid collision after fix types in other method */
            public void onNext2(List<zgo> t) {
                Intrinsics.checkNotNullParameter(t, "t");
                StockSearchViewModel.this.postDataLoaded();
                addSymbolResult.setSuc(true);
                addSymbolResult.setStockSymbolList(t);
                Logger.i(StockSearchViewModel.TAG, "add onNext List = " + t);
                StockSearchViewModel.this.getAddSymbolList().postValue(addSymbolResult);
            }
        });
    }

    @NotNull
    public final MutableLiveData<AddSymbolResult> getAddSymbolList() {
        return this.addSymbolList;
    }

    @NotNull
    public final MutableLiveData<RequestStockSuggestResult> getRequestStockSuggest() {
        return this.requestStockSuggest;
    }

    @NotNull
    public final MutableLiveData<StockSymbolResult> getStockSymbolList() {
        return this.stockSymbolList;
    }

    public final void loadStockList() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            return;
        }
        final StockSymbolResult stockSymbolResult = new StockSymbolResult(null, null);
        SyncExtKt.getInstance(SyncExportManager.INSTANCE).getStockSymbolList(wearableDeviceModel.getDid()).H(ua1.c()).a(new z5h<List<? extends zgo>>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.stock.StockSearchViewModel.loadStockList.1
            @Override // defpackage.z5h
            public void onComplete() {
            }

            @Override // defpackage.z5h
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                stockSymbolResult.setStockSymbolList(null);
                stockSymbolResult.setThrowable(e);
                this.getStockSymbolList().postValue(stockSymbolResult);
            }

            @Override // defpackage.z5h
            public /* bridge */ /* synthetic */ void onNext(List<? extends zgo> list) {
                onNext2((List<zgo>) list);
            }

            @Override // defpackage.z5h
            public void onSubscribe(jz6 d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }

            /* JADX INFO: renamed from: onNext, reason: avoid collision after fix types in other method */
            public void onNext2(List<zgo> t) {
                Intrinsics.checkNotNullParameter(t, "t");
                stockSymbolResult.setThrowable(null);
                stockSymbolResult.setStockSymbolList(t);
                this.getStockSymbolList().postValue(stockSymbolResult);
            }
        });
    }

    public final void requestStockSuggest(@NotNull final String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        final RequestStockSuggestResult requestStockSuggestResult = new RequestStockSuggestResult(false, text, null);
        o4h o4hVarF = o4h.f(new j5h() { // from class: qho
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                StockSearchViewModel.requestStockSuggest$lambda$7(text, v4hVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(o4hVarF, "create(...)");
        final Function1 function1 = new Function1() { // from class: rho
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockSearchViewModel.requestStockSuggest$lambda$12$lambda$8(requestStockSuggestResult, this, (StockModel.StockSuggestResult) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: sho
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                StockSearchViewModel.requestStockSuggest$lambda$12$lambda$9(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: tho
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockSearchViewModel.requestStockSuggest$lambda$12$lambda$10(requestStockSuggestResult, this, (Throwable) obj);
            }
        };
        o4hVarF.O(bg4Var, new bg4() { // from class: uho
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                StockSearchViewModel.requestStockSuggest$lambda$12$lambda$11(function2, obj);
            }
        });
    }

    public final void setAddSymbolList(@NotNull MutableLiveData<AddSymbolResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.addSymbolList = mutableLiveData;
    }

    public final void setRequestStockSuggest(@NotNull MutableLiveData<RequestStockSuggestResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.requestStockSuggest = mutableLiveData;
    }

    public final void setStockSymbolList(@NotNull MutableLiveData<StockSymbolResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.stockSymbolList = mutableLiveData;
    }
}
