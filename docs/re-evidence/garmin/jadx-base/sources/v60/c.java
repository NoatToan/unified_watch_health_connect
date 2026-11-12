package v60;

import am.j;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"Lv60/c;", "", "", "availableForPurchase", "", "productId", "shopUrl", "sku", "skuName", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Z", "()Z", "b", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "c", "d", "getSku", JWKParameterNames.RSA_EXPONENT, "getSkuName", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("availableForPurchase")
    private final boolean availableForPurchase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productId")
    private final String productId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shopUrl")
    private final String shopUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sku")
    private final String sku;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("skuName")
    private final String skuName;

    public c(boolean z14, String str, String str2, String str3, String str4) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str3, str4);
        this.availableForPurchase = z14;
        this.productId = str;
        this.shopUrl = str2;
        this.sku = str3;
        this.skuName = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAvailableForPurchase() {
        return this.availableForPurchase;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getShopUrl() {
        return this.shopUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.availableForPurchase == cVar.availableForPurchase && s.g(this.productId, cVar.productId) && s.g(this.shopUrl, cVar.shopUrl) && s.g(this.sku, cVar.sku) && s.g(this.skuName, cVar.skuName);
    }

    public final int hashCode() {
        int iJ = g.j(Boolean.hashCode(this.availableForPurchase) * 31, 31, this.productId);
        String str = this.shopUrl;
        return this.skuName.hashCode() + g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.sku);
    }

    public final String toString() {
        boolean z14 = this.availableForPurchase;
        String str = this.productId;
        String str2 = this.shopUrl;
        String str3 = this.sku;
        String str4 = this.skuName;
        StringBuilder sb3 = new StringBuilder("ProductSearchDTO(availableForPurchase=");
        sb3.append(z14);
        sb3.append(", productId=");
        sb3.append(str);
        sb3.append(", shopUrl=");
        sn.a.t(sb3, str2, ", sku=", str3, ", skuName=");
        return j.o(str4, ")", sb3);
    }
}
