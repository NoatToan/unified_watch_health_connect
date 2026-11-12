package com.huami.wallet.lib.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/huami/wallet/lib/entity/BusRefundOpenFeeEntity;", "", "", "component1", "voucherCode", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getVoucherCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "core-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BusRefundOpenFeeEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String voucherCode;

    public BusRefundOpenFeeEntity(@NotNull String str) {
        this.voucherCode = str;
    }

    public static /* synthetic */ BusRefundOpenFeeEntity copy$default(BusRefundOpenFeeEntity busRefundOpenFeeEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = busRefundOpenFeeEntity.voucherCode;
        }
        return busRefundOpenFeeEntity.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVoucherCode() {
        return this.voucherCode;
    }

    @NotNull
    public final BusRefundOpenFeeEntity copy(@NotNull String voucherCode) {
        return new BusRefundOpenFeeEntity(voucherCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BusRefundOpenFeeEntity) && Intrinsics.areEqual(this.voucherCode, ((BusRefundOpenFeeEntity) other).voucherCode);
    }

    @NotNull
    public final String getVoucherCode() {
        return this.voucherCode;
    }

    public int hashCode() {
        return this.voucherCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "BusRefundOpenFeeEntity(voucherCode=" + this.voucherCode + ')';
    }
}
