package com.xiaomi.fitness.sync.export.di;

import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sync.export.MyAction1;
import com.xiaomi.fitness.sync.export.model.StockModel;
import com.xiaomi.onetrack.api.b;
import defpackage.be1;
import defpackage.eu6;
import defpackage.o4h;
import defpackage.zgo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\bf\u0018\u0000 72\u00020\u0001:\u00017J?\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000fH&¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000e0\u001a2\u0006\u0010\u0019\u001a\u00020\u000fH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH&¢\u0006\u0004\b \u0010!J-\u0010$\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020#0\u0011H&¢\u0006\u0004\b$\u0010%J=\u0010+\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020'2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H&¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u00020\n2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0/H&¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204\u0018\u000103H&¢\u0006\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/sync/export/di/SyncExportManager;", "", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "force", "Lcom/xiaomi/fitness/sync/export/MyAction1;", "callback", "Leu6;", "deviceTaskCallBack", "", "syncCalendarToDevice", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ZLcom/xiaomi/fitness/sync/export/MyAction1;Leu6;)V", "needRetry", "", "", "symbols", "Lbe1;", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockInfo;", b.I, "requestStockInfo", "(ZLjava/util/List;Lbe1;)V", "symbol", "deleteStockSymbol", "(Ljava/lang/String;)V", "did", "Lo4h;", "Lzgo;", "getStockSymbolList", "(Ljava/lang/String;)Lo4h;", "Lzgo$a;", "stockSymbolList", "setStockSymbolList", "(Lzgo$a;)V", "suggest", "Lcom/xiaomi/fitness/sync/export/model/StockModel$StockSuggestResult;", "requestStockSuggest", "(ZLjava/lang/String;Lbe1;)V", "source", "", "type", "online", "days", "performAgpsRequest", "(Ljava/lang/String;IZILbe1;)V", "clearAllCalendars", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Lkotlin/Function1;", DevInfoKeys.CAPABILITY, "getWifiPasswordCapability", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Pair;", "", "getGpsLocation", "()Lkotlin/Pair;", "Companion", "sync-export_release"}, k = 1, mv = {2, 0, 0})
public interface SyncExportManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sync/export/di/SyncExportManager$Companion;", "", "<init>", "()V", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void clearAllCalendars(@NotNull WearableDeviceModel deviceModel);

    void deleteStockSymbol(@NotNull String symbol);

    @Nullable
    Pair<Double, Double> getGpsLocation();

    @NotNull
    o4h<List<zgo>> getStockSymbolList(@NotNull String did);

    void getWifiPasswordCapability(@NotNull Function1<? super Boolean, Unit> capability);

    void performAgpsRequest(@NotNull String source, int type, boolean online, int days, @NotNull be1<String> response);

    void requestStockInfo(boolean needRetry, @NotNull List<String> symbols, @NotNull be1<StockModel.StockInfo> response);

    void requestStockSuggest(boolean needRetry, @NotNull String suggest, @NotNull be1<StockModel.StockSuggestResult> response);

    void setStockSymbolList(@Nullable zgo.a stockSymbolList);

    void syncCalendarToDevice(@NotNull WearableDeviceModel deviceModel, boolean force, @Nullable MyAction1<Boolean> callback, @Nullable eu6<Boolean> deviceTaskCallBack);
}
