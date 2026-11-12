package com.huami.nfc.bus;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/huami/nfc/bus/XiaomiPrepareReturn;", "", "", "component1", "component2", "orderId", "transferOutToken", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "b", "getTransferOutToken", "setTransferOutToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class XiaomiPrepareReturn {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("orderId")
    @NotNull
    private String orderId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("transferOutToken")
    @NotNull
    private String transferOutToken;

    public XiaomiPrepareReturn(@NotNull String str, @NotNull String str2) {
        this.orderId = str;
        this.transferOutToken = str2;
    }

    public static /* synthetic */ XiaomiPrepareReturn copy$default(XiaomiPrepareReturn xiaomiPrepareReturn, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xiaomiPrepareReturn.orderId;
        }
        if ((i & 2) != 0) {
            str2 = xiaomiPrepareReturn.transferOutToken;
        }
        return xiaomiPrepareReturn.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransferOutToken() {
        return this.transferOutToken;
    }

    @NotNull
    public final XiaomiPrepareReturn copy(@NotNull String orderId, @NotNull String transferOutToken) {
        return new XiaomiPrepareReturn(orderId, transferOutToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XiaomiPrepareReturn)) {
            return false;
        }
        XiaomiPrepareReturn xiaomiPrepareReturn = (XiaomiPrepareReturn) other;
        return Intrinsics.areEqual(this.orderId, xiaomiPrepareReturn.orderId) && Intrinsics.areEqual(this.transferOutToken, xiaomiPrepareReturn.transferOutToken);
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getTransferOutToken() {
        return this.transferOutToken;
    }

    public int hashCode() {
        return (this.orderId.hashCode() * 31) + this.transferOutToken.hashCode();
    }

    public final void setOrderId(@NotNull String str) {
        this.orderId = str;
    }

    public final void setTransferOutToken(@NotNull String str) {
        this.transferOutToken = str;
    }

    @NotNull
    public String toString() {
        return "XiaomiPrepareReturn(orderId=" + this.orderId + ", transferOutToken=" + this.transferOutToken + ')';
    }
}
