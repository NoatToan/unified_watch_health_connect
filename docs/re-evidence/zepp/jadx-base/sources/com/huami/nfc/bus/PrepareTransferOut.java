package com.huami.nfc.bus;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/bus/PrepareTransferOut;", "", "", "component1", "component2", "component3", "orderId", "transferStatus", "transferOutToken", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "b", "getTransferStatus", "c", "getTransferOutToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PrepareTransferOut {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("orderId")
    @Nullable
    private final String orderId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("transferStatus")
    @NotNull
    private final String transferStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("transferOutToken")
    @Nullable
    private final String transferOutToken;

    public PrepareTransferOut(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        this.orderId = str;
        this.transferStatus = str2;
        this.transferOutToken = str3;
    }

    public static /* synthetic */ PrepareTransferOut copy$default(PrepareTransferOut prepareTransferOut, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prepareTransferOut.orderId;
        }
        if ((i & 2) != 0) {
            str2 = prepareTransferOut.transferStatus;
        }
        if ((i & 4) != 0) {
            str3 = prepareTransferOut.transferOutToken;
        }
        return prepareTransferOut.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransferStatus() {
        return this.transferStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransferOutToken() {
        return this.transferOutToken;
    }

    @NotNull
    public final PrepareTransferOut copy(@Nullable String orderId, @NotNull String transferStatus, @Nullable String transferOutToken) {
        return new PrepareTransferOut(orderId, transferStatus, transferOutToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrepareTransferOut)) {
            return false;
        }
        PrepareTransferOut prepareTransferOut = (PrepareTransferOut) other;
        return Intrinsics.areEqual(this.orderId, prepareTransferOut.orderId) && Intrinsics.areEqual(this.transferStatus, prepareTransferOut.transferStatus) && Intrinsics.areEqual(this.transferOutToken, prepareTransferOut.transferOutToken);
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getTransferOutToken() {
        return this.transferOutToken;
    }

    @NotNull
    public final String getTransferStatus() {
        return this.transferStatus;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.transferStatus.hashCode()) * 31;
        String str2 = this.transferOutToken;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PrepareTransferOut(orderId=" + ((Object) this.orderId) + ", transferStatus=" + this.transferStatus + ", transferOutToken=" + ((Object) this.transferOutToken) + ')';
    }
}
