package com.xiaomi.fitness.pay.export.data.response;

import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/response/OrderPageResponse;", "", "order_info_list", "", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", RouteRequest.KEY_NEXT_KEY, "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getOrder_info_list", "()Ljava/util/List;", "getNext_key", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrderPageResponse {

    @Nullable
    private final String next_key;

    @Nullable
    private final List<OrderInfo> order_info_list;

    public OrderPageResponse(@Nullable List<OrderInfo> list, @Nullable String str) {
        this.order_info_list = list;
        this.next_key = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderPageResponse copy$default(OrderPageResponse orderPageResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = orderPageResponse.order_info_list;
        }
        if ((i & 2) != 0) {
            str = orderPageResponse.next_key;
        }
        return orderPageResponse.copy(list, str);
    }

    @Nullable
    public final List<OrderInfo> component1() {
        return this.order_info_list;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext_key() {
        return this.next_key;
    }

    @NotNull
    public final OrderPageResponse copy(@Nullable List<OrderInfo> order_info_list, @Nullable String next_key) {
        return new OrderPageResponse(order_info_list, next_key);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPageResponse)) {
            return false;
        }
        OrderPageResponse orderPageResponse = (OrderPageResponse) other;
        return Intrinsics.areEqual(this.order_info_list, orderPageResponse.order_info_list) && Intrinsics.areEqual(this.next_key, orderPageResponse.next_key);
    }

    @Nullable
    public final String getNext_key() {
        return this.next_key;
    }

    @Nullable
    public final List<OrderInfo> getOrder_info_list() {
        return this.order_info_list;
    }

    public int hashCode() {
        List<OrderInfo> list = this.order_info_list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.next_key;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OrderPageResponse(order_info_list=" + this.order_info_list + ", next_key=" + this.next_key + ")";
    }
}
