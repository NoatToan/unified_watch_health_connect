package com.huami.nfc.bus;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J=\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R$\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/huami/nfc/bus/TransferIn;", "", "", "component1", "component2", "component3", "", "Lcom/huami/nfc/bus/MiShiftActionToken;", "component4", "cardName", "orderId", TrainingWebConst.QueryParam.ORDERSTATUS, "tokens", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCardName", "()Ljava/lang/String;", "b", "getOrderId", "c", "getOrderStatus", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getTokens", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TransferIn {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("cardName")
    @Nullable
    private final String cardName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("orderId")
    @NotNull
    private final String orderId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName(TrainingWebConst.QueryParam.ORDERSTATUS)
    @Nullable
    private final String orderStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("actionToken")
    @Nullable
    private final List<MiShiftActionToken> tokens;

    public TransferIn(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable List<MiShiftActionToken> list) {
        this.cardName = str;
        this.orderId = str2;
        this.orderStatus = str3;
        this.tokens = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferIn copy$default(TransferIn transferIn, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferIn.cardName;
        }
        if ((i & 2) != 0) {
            str2 = transferIn.orderId;
        }
        if ((i & 4) != 0) {
            str3 = transferIn.orderStatus;
        }
        if ((i & 8) != 0) {
            list = transferIn.tokens;
        }
        return transferIn.copy(str, str2, str3, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final List<MiShiftActionToken> component4() {
        return this.tokens;
    }

    @NotNull
    public final TransferIn copy(@Nullable String cardName, @NotNull String orderId, @Nullable String orderStatus, @Nullable List<MiShiftActionToken> tokens) {
        return new TransferIn(cardName, orderId, orderStatus, tokens);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferIn)) {
            return false;
        }
        TransferIn transferIn = (TransferIn) other;
        return Intrinsics.areEqual(this.cardName, transferIn.cardName) && Intrinsics.areEqual(this.orderId, transferIn.orderId) && Intrinsics.areEqual(this.orderStatus, transferIn.orderStatus) && Intrinsics.areEqual(this.tokens, transferIn.tokens);
    }

    @Nullable
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final List<MiShiftActionToken> getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        String str = this.cardName;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.orderId.hashCode()) * 31;
        String str2 = this.orderStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MiShiftActionToken> list = this.tokens;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransferIn(cardName=" + ((Object) this.cardName) + ", orderId=" + this.orderId + ", orderStatus=" + ((Object) this.orderStatus) + ", tokens=" + this.tokens + ')';
    }

    public /* synthetic */ TransferIn(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : list);
    }
}
