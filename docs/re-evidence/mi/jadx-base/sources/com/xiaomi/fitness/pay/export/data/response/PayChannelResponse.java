package com.xiaomi.fitness.pay.export.data.response;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/response/PayChannelResponse;", "", "pay_channel_list", "", "", "<init>", "(Ljava/util/List;)V", "getPay_channel_list", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PayChannelResponse {

    @NotNull
    private final List<String> pay_channel_list;

    public PayChannelResponse(@NotNull List<String> pay_channel_list) {
        Intrinsics.checkNotNullParameter(pay_channel_list, "pay_channel_list");
        this.pay_channel_list = pay_channel_list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayChannelResponse copy$default(PayChannelResponse payChannelResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = payChannelResponse.pay_channel_list;
        }
        return payChannelResponse.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.pay_channel_list;
    }

    @NotNull
    public final PayChannelResponse copy(@NotNull List<String> pay_channel_list) {
        Intrinsics.checkNotNullParameter(pay_channel_list, "pay_channel_list");
        return new PayChannelResponse(pay_channel_list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PayChannelResponse) && Intrinsics.areEqual(this.pay_channel_list, ((PayChannelResponse) other).pay_channel_list);
    }

    @NotNull
    public final List<String> getPay_channel_list() {
        return this.pay_channel_list;
    }

    public int hashCode() {
        return this.pay_channel_list.hashCode();
    }

    @NotNull
    public String toString() {
        return "PayChannelResponse(pay_channel_list=" + this.pay_channel_list + ")";
    }
}
