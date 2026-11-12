package com.huami.pay.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J3\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015¨\u0006 "}, d2 = {"Lcom/huami/pay/service/GoodsSku;", "", "", "component1", "component2", "", "component3", "component4", "sku", "thirdId", FirebaseAnalytics.Param.QUANTITY, "extra", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSku", "()Ljava/lang/String;", "b", "getThirdId", "c", LogUtil.I, "getQuantity", "()I", GoogleApiAvailabilityLight.a, "getExtra", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "pay-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GoodsSku {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String sku;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String thirdId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int quantity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String extra;

    public GoodsSku(@NotNull String str, @NotNull String str2, int i, @Nullable String str3) {
        this.sku = str;
        this.thirdId = str2;
        this.quantity = i;
        this.extra = str3;
    }

    public static /* synthetic */ GoodsSku copy$default(GoodsSku goodsSku, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = goodsSku.sku;
        }
        if ((i2 & 2) != 0) {
            str2 = goodsSku.thirdId;
        }
        if ((i2 & 4) != 0) {
            i = goodsSku.quantity;
        }
        if ((i2 & 8) != 0) {
            str3 = goodsSku.extra;
        }
        return goodsSku.copy(str, str2, i, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getThirdId() {
        return this.thirdId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final GoodsSku copy(@NotNull String sku, @NotNull String thirdId, int quantity, @Nullable String extra) {
        return new GoodsSku(sku, thirdId, quantity, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoodsSku)) {
            return false;
        }
        GoodsSku goodsSku = (GoodsSku) other;
        return Intrinsics.areEqual(this.sku, goodsSku.sku) && Intrinsics.areEqual(this.thirdId, goodsSku.thirdId) && this.quantity == goodsSku.quantity && Intrinsics.areEqual(this.extra, goodsSku.extra);
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    public final String getThirdId() {
        return this.thirdId;
    }

    public int hashCode() {
        int iHashCode = ((((this.sku.hashCode() * 31) + this.thirdId.hashCode()) * 31) + this.quantity) * 31;
        String str = this.extra;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "GoodsSku(sku=" + this.sku + ", thirdId=" + this.thirdId + ", quantity=" + this.quantity + ", extra=" + this.extra + ")";
    }

    public /* synthetic */ GoodsSku(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? null : str3);
    }
}
