package com.xiaomi.hm.health.cashier.model;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJB\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\n¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/cashier/model/Order;", "", "", "Lcom/xiaomi/hm/health/cashier/model/Product;", "component1", "", "component2", "component3", "", "component4", "()Ljava/lang/Long;", "items", "description", "orderId", "expiredAt", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/xiaomi/hm/health/cashier/model/Order;", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "c", "getOrderId", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getExpiredAt", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Order {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("items")
    @NotNull
    private final List<Product> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("orderId")
    @Nullable
    private final String orderId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("expiredAt")
    @Nullable
    private final Long expiredAt;

    public Order(@NotNull List<Product> list, @NotNull String str, @Nullable String str2, @Nullable Long l) {
        this.items = list;
        this.description = str;
        this.orderId = str2;
        this.expiredAt = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Order copy$default(Order order, List list, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = order.items;
        }
        if ((i & 2) != 0) {
            str = order.description;
        }
        if ((i & 4) != 0) {
            str2 = order.orderId;
        }
        if ((i & 8) != 0) {
            l = order.expiredAt;
        }
        return order.copy(list, str, str2, l);
    }

    @NotNull
    public final List<Product> component1() {
        return this.items;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    @NotNull
    public final Order copy(@NotNull List<Product> items, @NotNull String description, @Nullable String orderId, @Nullable Long expiredAt) {
        return new Order(items, description, orderId, expiredAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Order)) {
            return false;
        }
        Order order = (Order) other;
        return Intrinsics.areEqual(this.items, order.items) && Intrinsics.areEqual(this.description, order.description) && Intrinsics.areEqual(this.orderId, order.orderId) && Intrinsics.areEqual(this.expiredAt, order.expiredAt);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    @NotNull
    public final List<Product> getItems() {
        return this.items;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        int iHashCode = ((this.items.hashCode() * 31) + this.description.hashCode()) * 31;
        String str = this.orderId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.expiredAt;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Order(items=" + this.items + ", description=" + this.description + ", orderId=" + this.orderId + ", expiredAt=" + this.expiredAt + ")";
    }

    public /* synthetic */ Order(List list, String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l);
    }
}
