package com.xiaomi.fitness.pay.export.data.response;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.pay.channel.PayChannelActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/response/OrderInfoResponse;", "", PayChannelActivity.PAY_PARAMS, "", TSMAuthContants.PARAM_ORDER_INFO, "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)V", "getPay_params", "()Ljava/lang/String;", "getOrderInfo", "()Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrderInfoResponse {
    public static final int ERROR_CODE_DEDUCT_DUPLICATE = -4004006;
    public static final int ERROR_CODE_DUPLICATE_ORDER = -4004001;
    public static final int ERROR_CODE_PROMOTION_LIMIT = -4004103;
    public static final int ERROR_CODE_PROMOTION_NOT_START = -4004102;
    public static final int ERROR_CODE_PROMOTION_NULL = -4004101;
    public static final int ERROR_CODE_PROMOTION_STOCK_EMPTY = -4004104;
    public static final int ERROR_CODE_USER_LOCKED = -4004003;
    public static final int ERROR_CODE_WRONG_COMMODITY = -4004002;

    @SerializedName("order_info")
    @NotNull
    private final OrderInfo orderInfo;

    @NotNull
    private final String pay_params;

    public OrderInfoResponse(@NotNull String pay_params, @NotNull OrderInfo orderInfo) {
        Intrinsics.checkNotNullParameter(pay_params, "pay_params");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        this.pay_params = pay_params;
        this.orderInfo = orderInfo;
    }

    public static /* synthetic */ OrderInfoResponse copy$default(OrderInfoResponse orderInfoResponse, String str, OrderInfo orderInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderInfoResponse.pay_params;
        }
        if ((i & 2) != 0) {
            orderInfo = orderInfoResponse.orderInfo;
        }
        return orderInfoResponse.copy(str, orderInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPay_params() {
        return this.pay_params;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    @NotNull
    public final OrderInfoResponse copy(@NotNull String pay_params, @NotNull OrderInfo orderInfo) {
        Intrinsics.checkNotNullParameter(pay_params, "pay_params");
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        return new OrderInfoResponse(pay_params, orderInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderInfoResponse)) {
            return false;
        }
        OrderInfoResponse orderInfoResponse = (OrderInfoResponse) other;
        return Intrinsics.areEqual(this.pay_params, orderInfoResponse.pay_params) && Intrinsics.areEqual(this.orderInfo, orderInfoResponse.orderInfo);
    }

    @NotNull
    public final OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    @NotNull
    public final String getPay_params() {
        return this.pay_params;
    }

    public int hashCode() {
        return (this.pay_params.hashCode() * 31) + this.orderInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "OrderInfoResponse(pay_params=" + this.pay_params + ", orderInfo=" + this.orderInfo + ")";
    }
}
