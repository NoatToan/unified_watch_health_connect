package com.huami.nfc.bus.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.OrderCategory;
import com.huami.nfc.bus.OrderEntity;
import com.huami.nfc.bus.OrderInfoEntity;
import com.huami.nfc.bus.PayChannel;
import com.huami.nfc.bus.PayType;
import com.huami.nfc.bus.TransAmountEntity;
import com.huami.nfc.bus.entities.SiteInfo;
import com.huami.watch.companion.mediac.Command;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H&J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H&J>\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fH&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u001b\u001a\u00020\u0002H&J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\u001b\u001a\u00020\u0002H&J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180\u0006H&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H&¨\u0006%"}, d2 = {"Lcom/huami/nfc/bus/api/ISnowballWebApi;", "Lcom/huami/nfc/bus/api/ISnowballAppletWebApi;", "", "appCode", "Lcom/huami/nfc/bus/PayType;", "type", "Lcom/huami/nfc/base/PayResponse;", "", "Lcom/huami/nfc/bus/TransAmountEntity;", "getTransactionAmount", "Lcom/huami/nfc/bus/PayChannel;", "channel", "", "amount", "Lcom/huami/nfc/bus/OrderEntity;", "generateOrder", "shiftOrderNo", "generateShiftOrder", "", "start", Command.STOP, "Lcom/huami/nfc/bus/OrderCategory;", "category", "count", "", "Lcom/huami/nfc/bus/OrderInfoEntity;", "getOrders", "orderId", "getOrderInfo", "", FirebaseAnalytics.Event.REFUND, "getInstalledAids", "getCardNumber", "hciContent", "cityCode", "Lcom/huami/nfc/bus/entities/SiteInfo;", "getSiteInfo", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public interface ISnowballWebApi extends ISnowballAppletWebApi {
    @NotNull
    PayResponse<OrderEntity> generateOrder(@NotNull String appCode, @NotNull PayChannel channel, int amount, @NotNull PayType type);

    @NotNull
    PayResponse<OrderEntity> generateShiftOrder(@NotNull String appCode, @NotNull PayType type, @Nullable String shiftOrderNo);

    @NotNull
    PayResponse<String> getCardNumber(@NotNull String appCode);

    @NotNull
    PayResponse<List<String>> getInstalledAids();

    @NotNull
    PayResponse<OrderInfoEntity> getOrderInfo(@NotNull String orderId);

    @NotNull
    PayResponse<List<OrderInfoEntity>> getOrders(@Nullable String appCode, long start, long stop, @NotNull OrderCategory category, int count);

    @NotNull
    PayResponse<SiteInfo> getSiteInfo(@NotNull String hciContent, @NotNull String cityCode);

    @NotNull
    PayResponse<List<TransAmountEntity>> getTransactionAmount(@NotNull String appCode, @NotNull PayType type);

    @NotNull
    PayResponse<Unit> refund(@NotNull String orderId);
}
