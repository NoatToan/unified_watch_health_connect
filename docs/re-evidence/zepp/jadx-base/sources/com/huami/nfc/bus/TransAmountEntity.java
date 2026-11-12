package com.huami.nfc.bus;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0002HÆ\u0003JN\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\bR\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001b¨\u0006)"}, d2 = {"Lcom/huami/nfc/bus/TransAmountEntity;", "", "", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "amount", "couponAmount", "chargeAmount", "chargeCouponAmount", "freeId", "type", "copy", "(IIIILjava/lang/Integer;I)Lcom/huami/nfc/bus/TransAmountEntity;", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getAmount", "()I", "b", "getCouponAmount", "c", "getChargeAmount", GoogleApiAvailabilityLight.a, "getChargeCouponAmount", "e", "Ljava/lang/Integer;", "getFreeId", "f", "getType", "<init>", "(IIIILjava/lang/Integer;I)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TransAmountEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("normal_card_fee")
    private final int amount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("promotion_card_fee")
    private final int couponAmount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("normal_topup_fee")
    private final int chargeAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("promotion_topup_fee")
    private final int chargeCouponAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("fee_id")
    @Nullable
    private final Integer freeId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("type")
    private final int type;

    public TransAmountEntity(int i, int i2, int i3, int i4, @Nullable Integer num, int i5) {
        this.amount = i;
        this.couponAmount = i2;
        this.chargeAmount = i3;
        this.chargeCouponAmount = i4;
        this.freeId = num;
        this.type = i5;
    }

    public static /* synthetic */ TransAmountEntity copy$default(TransAmountEntity transAmountEntity, int i, int i2, int i3, int i4, Integer num, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = transAmountEntity.amount;
        }
        if ((i6 & 2) != 0) {
            i2 = transAmountEntity.couponAmount;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = transAmountEntity.chargeAmount;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = transAmountEntity.chargeCouponAmount;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            num = transAmountEntity.freeId;
        }
        Integer num2 = num;
        if ((i6 & 32) != 0) {
            i5 = transAmountEntity.type;
        }
        return transAmountEntity.copy(i, i7, i8, i9, num2, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCouponAmount() {
        return this.couponAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getChargeAmount() {
        return this.chargeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getChargeCouponAmount() {
        return this.chargeCouponAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getFreeId() {
        return this.freeId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final TransAmountEntity copy(int amount, int couponAmount, int chargeAmount, int chargeCouponAmount, @Nullable Integer freeId, int type) {
        return new TransAmountEntity(amount, couponAmount, chargeAmount, chargeCouponAmount, freeId, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransAmountEntity)) {
            return false;
        }
        TransAmountEntity transAmountEntity = (TransAmountEntity) other;
        return this.amount == transAmountEntity.amount && this.couponAmount == transAmountEntity.couponAmount && this.chargeAmount == transAmountEntity.chargeAmount && this.chargeCouponAmount == transAmountEntity.chargeCouponAmount && Intrinsics.areEqual(this.freeId, transAmountEntity.freeId) && this.type == transAmountEntity.type;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getChargeAmount() {
        return this.chargeAmount;
    }

    public final int getChargeCouponAmount() {
        return this.chargeCouponAmount;
    }

    public final int getCouponAmount() {
        return this.couponAmount;
    }

    @Nullable
    public final Integer getFreeId() {
        return this.freeId;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int i = ((((((this.amount * 31) + this.couponAmount) * 31) + this.chargeAmount) * 31) + this.chargeCouponAmount) * 31;
        Integer num = this.freeId;
        return ((i + (num == null ? 0 : num.hashCode())) * 31) + this.type;
    }

    @NotNull
    public String toString() {
        return "TransAmountEntity(amount=" + this.amount + ", couponAmount=" + this.couponAmount + ", chargeAmount=" + this.chargeAmount + ", chargeCouponAmount=" + this.chargeCouponAmount + ", freeId=" + this.freeId + ", type=" + this.type + ')';
    }

    public /* synthetic */ TransAmountEntity(int i, int i2, int i3, int i4, Integer num, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? -1 : i, (i6 & 2) != 0 ? -1 : i2, (i6 & 4) != 0 ? -1 : i3, (i6 & 8) != 0 ? -1 : i4, num, i5);
    }
}
