package com.huami.nfc.bus.entities;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.nfc.bus.ConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/huami/nfc/bus/entities/TopRefundTicketPostBody;", "", "Lcom/huami/nfc/bus/entities/RefundTicketPostBody;", "component1", "", "component2", "component3", "component4", "extra", "appCode", "refundReasonCode", "cardNo", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/nfc/bus/entities/RefundTicketPostBody;", "getExtra", "()Lcom/huami/nfc/bus/entities/RefundTicketPostBody;", "b", "Ljava/lang/String;", "getAppCode", "()Ljava/lang/String;", "c", "getRefundReasonCode", GoogleApiAvailabilityLight.a, "getCardNo", "<init>", "(Lcom/huami/nfc/bus/entities/RefundTicketPostBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TopRefundTicketPostBody {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("extra")
    @NotNull
    private final RefundTicketPostBody extra;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(ConstantKt.KEY_APP_CODE)
    @Nullable
    private final String appCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("refundReasonCode")
    @Nullable
    private final String refundReasonCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("cardNo")
    @Nullable
    private final String cardNo;

    public TopRefundTicketPostBody(@NotNull RefundTicketPostBody refundTicketPostBody, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.extra = refundTicketPostBody;
        this.appCode = str;
        this.refundReasonCode = str2;
        this.cardNo = str3;
    }

    public static /* synthetic */ TopRefundTicketPostBody copy$default(TopRefundTicketPostBody topRefundTicketPostBody, RefundTicketPostBody refundTicketPostBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            refundTicketPostBody = topRefundTicketPostBody.extra;
        }
        if ((i & 2) != 0) {
            str = topRefundTicketPostBody.appCode;
        }
        if ((i & 4) != 0) {
            str2 = topRefundTicketPostBody.refundReasonCode;
        }
        if ((i & 8) != 0) {
            str3 = topRefundTicketPostBody.cardNo;
        }
        return topRefundTicketPostBody.copy(refundTicketPostBody, str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RefundTicketPostBody getExtra() {
        return this.extra;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefundReasonCode() {
        return this.refundReasonCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @NotNull
    public final TopRefundTicketPostBody copy(@NotNull RefundTicketPostBody extra, @Nullable String appCode, @Nullable String refundReasonCode, @Nullable String cardNo) {
        return new TopRefundTicketPostBody(extra, appCode, refundReasonCode, cardNo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopRefundTicketPostBody)) {
            return false;
        }
        TopRefundTicketPostBody topRefundTicketPostBody = (TopRefundTicketPostBody) other;
        return Intrinsics.areEqual(this.extra, topRefundTicketPostBody.extra) && Intrinsics.areEqual(this.appCode, topRefundTicketPostBody.appCode) && Intrinsics.areEqual(this.refundReasonCode, topRefundTicketPostBody.refundReasonCode) && Intrinsics.areEqual(this.cardNo, topRefundTicketPostBody.cardNo);
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @NotNull
    public final RefundTicketPostBody getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getRefundReasonCode() {
        return this.refundReasonCode;
    }

    public int hashCode() {
        int iHashCode = this.extra.hashCode() * 31;
        String str = this.appCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.refundReasonCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardNo;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TopRefundTicketPostBody(extra=" + this.extra + ", appCode=" + ((Object) this.appCode) + ", refundReasonCode=" + ((Object) this.refundReasonCode) + ", cardNo=" + ((Object) this.cardNo) + ')';
    }
}
