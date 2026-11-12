package com.xiaomi.fitness.pay.export.data.response;

import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/pay/export/data/response/MibiDeductResult;", "", Constants.KEY_MARKET_DEDUCT_ID, "", "orderId", Constants.KEY_CHARGE_STATUS, Constants.KEY_PAY_STATUS, "", Constants.KEY_DEDUCT_SIGN_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getMarketDeductId", "()Ljava/lang/String;", "getOrderId", "getChargeStatus", "getPayStatus", "()I", "getDeductSignStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "pay-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MibiDeductResult {

    @Nullable
    private final String chargeStatus;
    private final int deductSignStatus;

    @Nullable
    private final String marketDeductId;

    @Nullable
    private final String orderId;
    private final int payStatus;

    public MibiDeductResult(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2) {
        this.marketDeductId = str;
        this.orderId = str2;
        this.chargeStatus = str3;
        this.payStatus = i;
        this.deductSignStatus = i2;
    }

    public static /* synthetic */ MibiDeductResult copy$default(MibiDeductResult mibiDeductResult, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = mibiDeductResult.marketDeductId;
        }
        if ((i3 & 2) != 0) {
            str2 = mibiDeductResult.orderId;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = mibiDeductResult.chargeStatus;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = mibiDeductResult.payStatus;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = mibiDeductResult.deductSignStatus;
        }
        return mibiDeductResult.copy(str, str4, str5, i4, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarketDeductId() {
        return this.marketDeductId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChargeStatus() {
        return this.chargeStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPayStatus() {
        return this.payStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeductSignStatus() {
        return this.deductSignStatus;
    }

    @NotNull
    public final MibiDeductResult copy(@Nullable String marketDeductId, @Nullable String orderId, @Nullable String chargeStatus, int payStatus, int deductSignStatus) {
        return new MibiDeductResult(marketDeductId, orderId, chargeStatus, payStatus, deductSignStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MibiDeductResult)) {
            return false;
        }
        MibiDeductResult mibiDeductResult = (MibiDeductResult) other;
        return Intrinsics.areEqual(this.marketDeductId, mibiDeductResult.marketDeductId) && Intrinsics.areEqual(this.orderId, mibiDeductResult.orderId) && Intrinsics.areEqual(this.chargeStatus, mibiDeductResult.chargeStatus) && this.payStatus == mibiDeductResult.payStatus && this.deductSignStatus == mibiDeductResult.deductSignStatus;
    }

    @Nullable
    public final String getChargeStatus() {
        return this.chargeStatus;
    }

    public final int getDeductSignStatus() {
        return this.deductSignStatus;
    }

    @Nullable
    public final String getMarketDeductId() {
        return this.marketDeductId;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public final int getPayStatus() {
        return this.payStatus;
    }

    public int hashCode() {
        String str = this.marketDeductId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chargeStatus;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.payStatus)) * 31) + Integer.hashCode(this.deductSignStatus);
    }

    @NotNull
    public String toString() {
        return "MibiDeductResult(marketDeductId=" + this.marketDeductId + ", orderId=" + this.orderId + ", chargeStatus=" + this.chargeStatus + ", payStatus=" + this.payStatus + ", deductSignStatus=" + this.deductSignStatus + ")";
    }

    public /* synthetic */ MibiDeductResult(String str, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
