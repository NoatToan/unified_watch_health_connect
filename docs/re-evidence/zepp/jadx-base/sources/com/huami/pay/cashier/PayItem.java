package com.huami.pay.cashier;

import com.huami.pay.service.PayChannel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/pay/cashier/PayItem;", "", "Lcom/huami/pay/service/PayChannel;", "component1", "", "component2", "payChannel", "select", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/huami/pay/service/PayChannel;", "getPayChannel", "()Lcom/huami/pay/service/PayChannel;", "b", "Z", "getSelect", "()Z", "<init>", "(Lcom/huami/pay/service/PayChannel;Z)V", "pay-cashier_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PayItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final PayChannel payChannel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean select;

    public PayItem(@NotNull PayChannel payChannel, boolean z) {
        this.payChannel = payChannel;
        this.select = z;
    }

    public static /* synthetic */ PayItem copy$default(PayItem payItem, PayChannel payChannel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            payChannel = payItem.payChannel;
        }
        if ((i & 2) != 0) {
            z = payItem.select;
        }
        return payItem.copy(payChannel, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PayChannel getPayChannel() {
        return this.payChannel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSelect() {
        return this.select;
    }

    @NotNull
    public final PayItem copy(@NotNull PayChannel payChannel, boolean select) {
        return new PayItem(payChannel, select);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayItem)) {
            return false;
        }
        PayItem payItem = (PayItem) other;
        return this.payChannel == payItem.payChannel && this.select == payItem.select;
    }

    @NotNull
    public final PayChannel getPayChannel() {
        return this.payChannel;
    }

    public final boolean getSelect() {
        return this.select;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.payChannel.hashCode() * 31;
        boolean z = this.select;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "PayItem(payChannel=" + this.payChannel + ", select=" + this.select + ")";
    }
}
