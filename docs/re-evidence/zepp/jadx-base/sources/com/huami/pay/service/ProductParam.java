package com.huami.pay.service;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003JK\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\fHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0012\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0013\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/huami/pay/service/ProductParam;", "", "", "component1", "Lcom/huami/pay/service/PayChannel;", "component2", "component3", "", "Lcom/huami/pay/service/GoodsSku;", "component4", "Lcom/huami/pay/service/SkuType;", "component5", "", "component6", "userId", "channel", "description", "skus", "skuType", "needConsume", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "Lcom/huami/pay/service/PayChannel;", "getChannel", "()Lcom/huami/pay/service/PayChannel;", "c", "getDescription", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getSkus", "()Ljava/util/List;", "e", "Lcom/huami/pay/service/SkuType;", "getSkuType", "()Lcom/huami/pay/service/SkuType;", "f", "Z", "getNeedConsume", "()Z", "<init>", "(Ljava/lang/String;Lcom/huami/pay/service/PayChannel;Ljava/lang/String;Ljava/util/List;Lcom/huami/pay/service/SkuType;Z)V", "pay-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ProductParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final PayChannel channel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<GoodsSku> skus;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final SkuType skuType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean needConsume;

    public ProductParam(@NotNull String str, @NotNull PayChannel payChannel, @NotNull String str2, @NotNull List<GoodsSku> list, @NotNull SkuType skuType, boolean z) {
        this.userId = str;
        this.channel = payChannel;
        this.description = str2;
        this.skus = list;
        this.skuType = skuType;
        this.needConsume = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductParam copy$default(ProductParam productParam, String str, PayChannel payChannel, String str2, List list, SkuType skuType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productParam.userId;
        }
        if ((i & 2) != 0) {
            payChannel = productParam.channel;
        }
        PayChannel payChannel2 = payChannel;
        if ((i & 4) != 0) {
            str2 = productParam.description;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            list = productParam.skus;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            skuType = productParam.skuType;
        }
        SkuType skuType2 = skuType;
        if ((i & 32) != 0) {
            z = productParam.needConsume;
        }
        return productParam.copy(str, payChannel2, str3, list2, skuType2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PayChannel getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final List<GoodsSku> component4() {
        return this.skus;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SkuType getSkuType() {
        return this.skuType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNeedConsume() {
        return this.needConsume;
    }

    @NotNull
    public final ProductParam copy(@NotNull String userId, @NotNull PayChannel channel, @NotNull String description, @NotNull List<GoodsSku> skus, @NotNull SkuType skuType, boolean needConsume) {
        return new ProductParam(userId, channel, description, skus, skuType, needConsume);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductParam)) {
            return false;
        }
        ProductParam productParam = (ProductParam) other;
        return Intrinsics.areEqual(this.userId, productParam.userId) && this.channel == productParam.channel && Intrinsics.areEqual(this.description, productParam.description) && Intrinsics.areEqual(this.skus, productParam.skus) && this.skuType == productParam.skuType && this.needConsume == productParam.needConsume;
    }

    @NotNull
    public final PayChannel getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getNeedConsume() {
        return this.needConsume;
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
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((((this.userId.hashCode() * 31) + this.channel.hashCode()) * 31) + this.description.hashCode()) * 31) + this.skus.hashCode()) * 31) + this.skuType.hashCode()) * 31;
        boolean z = this.needConsume;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "ProductParam(userId=" + this.userId + ", channel=" + this.channel + ", description=" + this.description + ", skus=" + this.skus + ", skuType=" + this.skuType + ", needConsume=" + this.needConsume + ")";
    }
}
