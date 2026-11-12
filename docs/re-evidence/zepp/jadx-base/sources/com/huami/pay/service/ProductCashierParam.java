package com.huami.pay.service;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b2\u00103J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J[\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\rHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u0019\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0015\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/huami/pay/service/ProductCashierParam;", "", "", "component1", "", "Lcom/huami/pay/service/PayChannel;", "component2", "component3", "component4", "Lcom/huami/pay/service/GoodsSku;", "component5", "Lcom/huami/pay/service/SkuType;", "component6", "", "component7", "userId", "supportChannel", "description", FirebaseAnalytics.Param.PRICE, "skus", "skuType", "needConsume", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getSupportChannel", "()Ljava/util/List;", "c", "getDescription", GoogleApiAvailabilityLight.a, "getPrice", "e", "getSkus", "f", "Lcom/huami/pay/service/SkuType;", "getSkuType", "()Lcom/huami/pay/service/SkuType;", "g", "Z", "getNeedConsume", "()Z", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huami/pay/service/SkuType;Z)V", "pay-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ProductCashierParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<PayChannel> supportChannel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String price;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<GoodsSku> skus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final SkuType skuType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean needConsume;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductCashierParam(@NotNull String str, @NotNull List<? extends PayChannel> list, @NotNull String str2, @NotNull String str3, @NotNull List<GoodsSku> list2, @NotNull SkuType skuType, boolean z) {
        this.userId = str;
        this.supportChannel = list;
        this.description = str2;
        this.price = str3;
        this.skus = list2;
        this.skuType = skuType;
        this.needConsume = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductCashierParam copy$default(ProductCashierParam productCashierParam, String str, List list, String str2, String str3, List list2, SkuType skuType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productCashierParam.userId;
        }
        if ((i & 2) != 0) {
            list = productCashierParam.supportChannel;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            str2 = productCashierParam.description;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = productCashierParam.price;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            list2 = productCashierParam.skus;
        }
        List list4 = list2;
        if ((i & 32) != 0) {
            skuType = productCashierParam.skuType;
        }
        SkuType skuType2 = skuType;
        if ((i & 64) != 0) {
            z = productCashierParam.needConsume;
        }
        return productCashierParam.copy(str, list3, str4, str5, list4, skuType2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final List<PayChannel> component2() {
        return this.supportChannel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final List<GoodsSku> component5() {
        return this.skus;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SkuType getSkuType() {
        return this.skuType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getNeedConsume() {
        return this.needConsume;
    }

    @NotNull
    public final ProductCashierParam copy(@NotNull String userId, @NotNull List<? extends PayChannel> supportChannel, @NotNull String description, @NotNull String price, @NotNull List<GoodsSku> skus, @NotNull SkuType skuType, boolean needConsume) {
        return new ProductCashierParam(userId, supportChannel, description, price, skus, skuType, needConsume);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCashierParam)) {
            return false;
        }
        ProductCashierParam productCashierParam = (ProductCashierParam) other;
        return Intrinsics.areEqual(this.userId, productCashierParam.userId) && Intrinsics.areEqual(this.supportChannel, productCashierParam.supportChannel) && Intrinsics.areEqual(this.description, productCashierParam.description) && Intrinsics.areEqual(this.price, productCashierParam.price) && Intrinsics.areEqual(this.skus, productCashierParam.skus) && this.skuType == productCashierParam.skuType && this.needConsume == productCashierParam.needConsume;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getNeedConsume() {
        return this.needConsume;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final SkuType getSkuType() {
        return this.skuType;
    }

    @NotNull
    public final List<GoodsSku> getSkus() {
        return this.skus;
    }

    @NotNull
    public final List<PayChannel> getSupportChannel() {
        return this.supportChannel;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public int hashCode() {
        int iHashCode = ((((((((((this.userId.hashCode() * 31) + this.supportChannel.hashCode()) * 31) + this.description.hashCode()) * 31) + this.price.hashCode()) * 31) + this.skus.hashCode()) * 31) + this.skuType.hashCode()) * 31;
        boolean z = this.needConsume;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "ProductCashierParam(userId=" + this.userId + ", supportChannel=" + this.supportChannel + ", description=" + this.description + ", price=" + this.price + ", skus=" + this.skus + ", skuType=" + this.skuType + ", needConsume=" + this.needConsume + ")";
    }
}
