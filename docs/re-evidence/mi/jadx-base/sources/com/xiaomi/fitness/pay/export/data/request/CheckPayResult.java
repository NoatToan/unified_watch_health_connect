package com.xiaomi.fitness.pay.export.data.request;

import com.xiaomi.fitness.pay.channel.PayChannelActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/request/CheckPayResult;", "", "order_id", "", PayChannelActivity.PAY_TYPE, "", "<init>", "(Ljava/lang/String;I)V", "getOrder_id", "()Ljava/lang/String;", "getPay_type", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckPayResult {

    @NotNull
    private final String order_id;
    private final int pay_type;

    public CheckPayResult(@NotNull String order_id, int i) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        this.order_id = order_id;
        this.pay_type = i;
    }

    public static /* synthetic */ CheckPayResult copy$default(CheckPayResult checkPayResult, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = checkPayResult.order_id;
        }
        if ((i2 & 2) != 0) {
            i = checkPayResult.pay_type;
        }
        return checkPayResult.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrder_id() {
        return this.order_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPay_type() {
        return this.pay_type;
    }

    @NotNull
    public final CheckPayResult copy(@NotNull String order_id, int pay_type) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        return new CheckPayResult(order_id, pay_type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPayResult)) {
            return false;
        }
        CheckPayResult checkPayResult = (CheckPayResult) other;
        return Intrinsics.areEqual(this.order_id, checkPayResult.order_id) && this.pay_type == checkPayResult.pay_type;
    }

    @NotNull
    public final String getOrder_id() {
        return this.order_id;
    }

    public final int getPay_type() {
        return this.pay_type;
    }

    public int hashCode() {
        return (this.order_id.hashCode() * 31) + Integer.hashCode(this.pay_type);
    }

    @NotNull
    public String toString() {
        return "CheckPayResult(order_id=" + this.order_id + ", pay_type=" + this.pay_type + ")";
    }
}
