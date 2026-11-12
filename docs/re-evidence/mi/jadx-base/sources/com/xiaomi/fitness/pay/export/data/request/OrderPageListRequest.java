package com.xiaomi.fitness.pay.export.data.request;

import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/request/OrderPageListRequest;", "", RouteRequest.KEY_NEXT_KEY, "", "limit", "", "category_id", "product_category", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getNext_key", "()Ljava/lang/String;", "getLimit", "()I", "getCategory_id", "getProduct_category", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrderPageListRequest {

    @NotNull
    private final String category_id;
    private final int limit;

    @NotNull
    private final String next_key;
    private final int product_category;

    public OrderPageListRequest(@NotNull String next_key, int i, @NotNull String category_id, int i2) {
        Intrinsics.checkNotNullParameter(next_key, "next_key");
        Intrinsics.checkNotNullParameter(category_id, "category_id");
        this.next_key = next_key;
        this.limit = i;
        this.category_id = category_id;
        this.product_category = i2;
    }

    public static /* synthetic */ OrderPageListRequest copy$default(OrderPageListRequest orderPageListRequest, String str, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = orderPageListRequest.next_key;
        }
        if ((i3 & 2) != 0) {
            i = orderPageListRequest.limit;
        }
        if ((i3 & 4) != 0) {
            str2 = orderPageListRequest.category_id;
        }
        if ((i3 & 8) != 0) {
            i2 = orderPageListRequest.product_category;
        }
        return orderPageListRequest.copy(str, i, str2, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNext_key() {
        return this.next_key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategory_id() {
        return this.category_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getProduct_category() {
        return this.product_category;
    }

    @NotNull
    public final OrderPageListRequest copy(@NotNull String next_key, int limit, @NotNull String category_id, int product_category) {
        Intrinsics.checkNotNullParameter(next_key, "next_key");
        Intrinsics.checkNotNullParameter(category_id, "category_id");
        return new OrderPageListRequest(next_key, limit, category_id, product_category);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPageListRequest)) {
            return false;
        }
        OrderPageListRequest orderPageListRequest = (OrderPageListRequest) other;
        return Intrinsics.areEqual(this.next_key, orderPageListRequest.next_key) && this.limit == orderPageListRequest.limit && Intrinsics.areEqual(this.category_id, orderPageListRequest.category_id) && this.product_category == orderPageListRequest.product_category;
    }

    @NotNull
    public final String getCategory_id() {
        return this.category_id;
    }

    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    public final String getNext_key() {
        return this.next_key;
    }

    public final int getProduct_category() {
        return this.product_category;
    }

    public int hashCode() {
        return (((((this.next_key.hashCode() * 31) + Integer.hashCode(this.limit)) * 31) + this.category_id.hashCode()) * 31) + Integer.hashCode(this.product_category);
    }

    @NotNull
    public String toString() {
        return "OrderPageListRequest(next_key=" + this.next_key + ", limit=" + this.limit + ", category_id=" + this.category_id + ", product_category=" + this.product_category + ")";
    }

    public /* synthetic */ OrderPageListRequest(String str, int i, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 4) != 0 ? "" : str2, i2);
    }
}
