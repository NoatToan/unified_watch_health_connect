package com.xiaomi.fitness.pay.export.data.request;

import com.xiaomi.fitness.pay.channel.PayChannelActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/request/PayChannelRequest;", "", PayChannelActivity.PAY_TYPE, "", "is_contract", "", "<init>", "(IZ)V", "getPay_type", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PayChannelRequest {
    private final boolean is_contract;
    private final int pay_type;

    public PayChannelRequest(int i, boolean z) {
        this.pay_type = i;
        this.is_contract = z;
    }

    public static /* synthetic */ PayChannelRequest copy$default(PayChannelRequest payChannelRequest, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = payChannelRequest.pay_type;
        }
        if ((i2 & 2) != 0) {
            z = payChannelRequest.is_contract;
        }
        return payChannelRequest.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPay_type() {
        return this.pay_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIs_contract() {
        return this.is_contract;
    }

    @NotNull
    public final PayChannelRequest copy(int pay_type, boolean is_contract) {
        return new PayChannelRequest(pay_type, is_contract);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayChannelRequest)) {
            return false;
        }
        PayChannelRequest payChannelRequest = (PayChannelRequest) other;
        return this.pay_type == payChannelRequest.pay_type && this.is_contract == payChannelRequest.is_contract;
    }

    public final int getPay_type() {
        return this.pay_type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.pay_type) * 31) + Boolean.hashCode(this.is_contract);
    }

    public final boolean is_contract() {
        return this.is_contract;
    }

    @NotNull
    public String toString() {
        return "PayChannelRequest(pay_type=" + this.pay_type + ", is_contract=" + this.is_contract + ")";
    }

    public /* synthetic */ PayChannelRequest(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, z);
    }
}
