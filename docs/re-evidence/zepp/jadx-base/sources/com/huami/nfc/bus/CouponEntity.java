package com.huami.nfc.bus;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b4\u00105J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003Jc\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\fHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u0011\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0012\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001c\u0010\u0014\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u001fR\u001c\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u001c\u0010\u0016\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/huami/nfc/bus/CouponEntity;", "", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "", "component9", "couponId", "issueDiscount", "issuePayFee", "name", "rechargeDiscount", "rechargePayFee", "totalDiscount", "totalPayFee", "valid", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getCouponId", "()I", "b", "getIssueDiscount", "c", "getIssuePayFee", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "e", "getRechargeDiscount", "f", "getRechargePayFee", "g", "getTotalDiscount", "h", "getTotalPayFee", "i", "Z", "getValid", "()Z", "<init>", "(IIILjava/lang/String;IIIIZ)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CouponEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("couponId")
    private final int couponId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("issueDiscount")
    private final int issueDiscount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("issuePayFee")
    private final int issuePayFee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("rechargeDiscount")
    private final int rechargeDiscount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("rechargePayFee")
    private final int rechargePayFee;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("totalDiscount")
    private final int totalDiscount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("totalPayFee")
    private final int totalPayFee;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("valid")
    private final boolean valid;

    public CouponEntity(int i, int i2, int i3, @NotNull String str, int i4, int i5, int i6, int i7, boolean z) {
        this.couponId = i;
        this.issueDiscount = i2;
        this.issuePayFee = i3;
        this.name = str;
        this.rechargeDiscount = i4;
        this.rechargePayFee = i5;
        this.totalDiscount = i6;
        this.totalPayFee = i7;
        this.valid = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCouponId() {
        return this.couponId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIssueDiscount() {
        return this.issueDiscount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIssuePayFee() {
        return this.issuePayFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRechargeDiscount() {
        return this.rechargeDiscount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRechargePayFee() {
        return this.rechargePayFee;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTotalDiscount() {
        return this.totalDiscount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getTotalPayFee() {
        return this.totalPayFee;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    @NotNull
    public final CouponEntity copy(int couponId, int issueDiscount, int issuePayFee, @NotNull String name, int rechargeDiscount, int rechargePayFee, int totalDiscount, int totalPayFee, boolean valid) {
        return new CouponEntity(couponId, issueDiscount, issuePayFee, name, rechargeDiscount, rechargePayFee, totalDiscount, totalPayFee, valid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponEntity)) {
            return false;
        }
        CouponEntity couponEntity = (CouponEntity) other;
        return this.couponId == couponEntity.couponId && this.issueDiscount == couponEntity.issueDiscount && this.issuePayFee == couponEntity.issuePayFee && Intrinsics.areEqual(this.name, couponEntity.name) && this.rechargeDiscount == couponEntity.rechargeDiscount && this.rechargePayFee == couponEntity.rechargePayFee && this.totalDiscount == couponEntity.totalDiscount && this.totalPayFee == couponEntity.totalPayFee && this.valid == couponEntity.valid;
    }

    public final int getCouponId() {
        return this.couponId;
    }

    public final int getIssueDiscount() {
        return this.issueDiscount;
    }

    public final int getIssuePayFee() {
        return this.issuePayFee;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getRechargeDiscount() {
        return this.rechargeDiscount;
    }

    public final int getRechargePayFee() {
        return this.rechargePayFee;
    }

    public final int getTotalDiscount() {
        return this.totalDiscount;
    }

    public final int getTotalPayFee() {
        return this.totalPayFee;
    }

    public final boolean getValid() {
        return this.valid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.couponId * 31) + this.issueDiscount) * 31) + this.issuePayFee) * 31) + this.name.hashCode()) * 31) + this.rechargeDiscount) * 31) + this.rechargePayFee) * 31) + this.totalDiscount) * 31) + this.totalPayFee) * 31;
        boolean z = this.valid;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "CouponEntity(couponId=" + this.couponId + ", issueDiscount=" + this.issueDiscount + ", issuePayFee=" + this.issuePayFee + ", name=" + this.name + ", rechargeDiscount=" + this.rechargeDiscount + ", rechargePayFee=" + this.rechargePayFee + ", totalDiscount=" + this.totalDiscount + ", totalPayFee=" + this.totalPayFee + ", valid=" + this.valid + ')';
    }
}
