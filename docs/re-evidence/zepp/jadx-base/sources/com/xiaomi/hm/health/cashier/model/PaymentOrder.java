package com.xiaomi.hm.health.cashier.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/cashier/model/PaymentOrder;", "", "Lcom/xiaomi/hm/health/cashier/model/Order;", "component1", "", "component2", StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "payment", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/cashier/model/Order;", "getOrder", "()Lcom/xiaomi/hm/health/cashier/model/Order;", "b", "Ljava/lang/String;", "getPayment", "()Ljava/lang/String;", "<init>", "(Lcom/xiaomi/hm/health/cashier/model/Order;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PaymentOrder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(StatEvent.MINE_KINGKONG_C_ORDER_VALUE)
    @NotNull
    private final Order order;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("payment")
    @Nullable
    private final String payment;

    public PaymentOrder(@NotNull Order order, @Nullable String str) {
        this.order = order;
        this.payment = str;
    }

    public static /* synthetic */ PaymentOrder copy$default(PaymentOrder paymentOrder, Order order, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            order = paymentOrder.order;
        }
        if ((i & 2) != 0) {
            str = paymentOrder.payment;
        }
        return paymentOrder.copy(order, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Order getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPayment() {
        return this.payment;
    }

    @NotNull
    public final PaymentOrder copy(@NotNull Order order, @Nullable String payment) {
        return new PaymentOrder(order, payment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOrder)) {
            return false;
        }
        PaymentOrder paymentOrder = (PaymentOrder) other;
        return Intrinsics.areEqual(this.order, paymentOrder.order) && Intrinsics.areEqual(this.payment, paymentOrder.payment);
    }

    @NotNull
    public final Order getOrder() {
        return this.order;
    }

    @Nullable
    public final String getPayment() {
        return this.payment;
    }

    public int hashCode() {
        int iHashCode = this.order.hashCode() * 31;
        String str = this.payment;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "PaymentOrder(order=" + this.order + ", payment=" + this.payment + ")";
    }

    public /* synthetic */ PaymentOrder(Order order, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(order, (i & 2) != 0 ? null : str);
    }
}
