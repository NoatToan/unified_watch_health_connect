package com.xiaomi.fitness.nfc.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/nfc/entity/RequestOTPLimitEntry;", "", "limit", "", "cardNum", "", "<init>", "(ILjava/lang/String;)V", "getLimit", "()I", "setLimit", "(I)V", "getCardNum", "()Ljava/lang/String;", "setCardNum", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RequestOTPLimitEntry {

    @NotNull
    private String cardNum;
    private int limit;

    public RequestOTPLimitEntry(int i, @NotNull String cardNum) {
        Intrinsics.checkNotNullParameter(cardNum, "cardNum");
        this.limit = i;
        this.cardNum = cardNum;
    }

    public static /* synthetic */ RequestOTPLimitEntry copy$default(RequestOTPLimitEntry requestOTPLimitEntry, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = requestOTPLimitEntry.limit;
        }
        if ((i2 & 2) != 0) {
            str = requestOTPLimitEntry.cardNum;
        }
        return requestOTPLimitEntry.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardNum() {
        return this.cardNum;
    }

    @NotNull
    public final RequestOTPLimitEntry copy(int limit, @NotNull String cardNum) {
        Intrinsics.checkNotNullParameter(cardNum, "cardNum");
        return new RequestOTPLimitEntry(limit, cardNum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestOTPLimitEntry)) {
            return false;
        }
        RequestOTPLimitEntry requestOTPLimitEntry = (RequestOTPLimitEntry) other;
        return this.limit == requestOTPLimitEntry.limit && Intrinsics.areEqual(this.cardNum, requestOTPLimitEntry.cardNum);
    }

    @NotNull
    public final String getCardNum() {
        return this.cardNum;
    }

    public final int getLimit() {
        return this.limit;
    }

    public int hashCode() {
        return (Integer.hashCode(this.limit) * 31) + this.cardNum.hashCode();
    }

    public final void setCardNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardNum = str;
    }

    public final void setLimit(int i) {
        this.limit = i;
    }

    @NotNull
    public String toString() {
        return "RequestOTPLimitEntry(limit=" + this.limit + ", cardNum=" + this.cardNum + ")";
    }
}
