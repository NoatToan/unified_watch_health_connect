package com.xiaomi.hm.health.cashier.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/cashier/model/CashierPayChannel;", "", "", "component1", "payChannel", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getPayChannel", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CashierPayChannel {

    @NotNull
    public static final String PAY_ALI = "ZEPP_ALI";

    @NotNull
    public static final String PAY_WX = "ZEPP_WECHAT";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("payChannel")
    @NotNull
    private final String payChannel;

    public CashierPayChannel(@NotNull String str) {
        this.payChannel = str;
    }

    public static /* synthetic */ CashierPayChannel copy$default(CashierPayChannel cashierPayChannel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashierPayChannel.payChannel;
        }
        return cashierPayChannel.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayChannel() {
        return this.payChannel;
    }

    @NotNull
    public final CashierPayChannel copy(@NotNull String payChannel) {
        return new CashierPayChannel(payChannel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CashierPayChannel) && Intrinsics.areEqual(this.payChannel, ((CashierPayChannel) other).payChannel);
    }

    @NotNull
    public final String getPayChannel() {
        return this.payChannel;
    }

    public int hashCode() {
        return this.payChannel.hashCode();
    }

    @NotNull
    public String toString() {
        return "CashierPayChannel(payChannel=" + this.payChannel + ")";
    }
}
