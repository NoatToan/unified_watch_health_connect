package com.huami.pay.lib.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@TypeConverters({PurchaseSkuConvert.class})
@Entity(tableName = "pay_notification")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\"B-\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J7\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/pay/lib/db/PayPurchase;", "", "", "component1", "component2", "component3", "", "Lcom/huami/pay/lib/db/PayPurchase$PurchaseSku;", "component4", "userId", "orderId", "purchaseToken", "skus", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "getOrderId", "c", "getPurchaseToken", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getSkus", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "PurchaseSku", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PayPurchase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String orderId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @NotNull
    private final String purchaseToken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<PurchaseSku> skus;

    @Entity
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/pay/lib/db/PayPurchase$PurchaseSku;", "", "", "component1", "component2", "component3", "component4", "currencyCode", FirebaseAnalytics.Param.PRICE, "subscriptionId", TrainingWebConst.QueryParam.SKUID, "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCurrencyCode", "()Ljava/lang/String;", "b", "getPrice", "c", "getSubscriptionId", GoogleApiAvailabilityLight.a, "getSkuId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class PurchaseSku {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final String price;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @PrimaryKey
        @NotNull
        private final String subscriptionId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        private final String skuId;

        public PurchaseSku(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            this.currencyCode = str;
            this.price = str2;
            this.subscriptionId = str3;
            this.skuId = str4;
        }

        public static /* synthetic */ PurchaseSku copy$default(PurchaseSku purchaseSku, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = purchaseSku.currencyCode;
            }
            if ((i & 2) != 0) {
                str2 = purchaseSku.price;
            }
            if ((i & 4) != 0) {
                str3 = purchaseSku.subscriptionId;
            }
            if ((i & 8) != 0) {
                str4 = purchaseSku.skuId;
            }
            return purchaseSku.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSubscriptionId() {
            return this.subscriptionId;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSkuId() {
            return this.skuId;
        }

        @NotNull
        public final PurchaseSku copy(@NotNull String currencyCode, @NotNull String price, @NotNull String subscriptionId, @NotNull String skuId) {
            return new PurchaseSku(currencyCode, price, subscriptionId, skuId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PurchaseSku)) {
                return false;
            }
            PurchaseSku purchaseSku = (PurchaseSku) other;
            return Intrinsics.areEqual(this.currencyCode, purchaseSku.currencyCode) && Intrinsics.areEqual(this.price, purchaseSku.price) && Intrinsics.areEqual(this.subscriptionId, purchaseSku.subscriptionId) && Intrinsics.areEqual(this.skuId, purchaseSku.skuId);
        }

        @NotNull
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        @NotNull
        public final String getPrice() {
            return this.price;
        }

        @NotNull
        public final String getSkuId() {
            return this.skuId;
        }

        @NotNull
        public final String getSubscriptionId() {
            return this.subscriptionId;
        }

        public int hashCode() {
            return (((((this.currencyCode.hashCode() * 31) + this.price.hashCode()) * 31) + this.subscriptionId.hashCode()) * 31) + this.skuId.hashCode();
        }

        @NotNull
        public String toString() {
            return "PurchaseSku(currencyCode=" + this.currencyCode + ", price=" + this.price + ", subscriptionId=" + this.subscriptionId + ", skuId=" + this.skuId + ")";
        }
    }

    public PayPurchase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<PurchaseSku> list) {
        this.userId = str;
        this.orderId = str2;
        this.purchaseToken = str3;
        this.skus = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayPurchase copy$default(PayPurchase payPurchase, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payPurchase.userId;
        }
        if ((i & 2) != 0) {
            str2 = payPurchase.orderId;
        }
        if ((i & 4) != 0) {
            str3 = payPurchase.purchaseToken;
        }
        if ((i & 8) != 0) {
            list = payPurchase.skus;
        }
        return payPurchase.copy(str, str2, str3, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final List<PurchaseSku> component4() {
        return this.skus;
    }

    @NotNull
    public final PayPurchase copy(@NotNull String userId, @NotNull String orderId, @NotNull String purchaseToken, @NotNull List<PurchaseSku> skus) {
        return new PayPurchase(userId, orderId, purchaseToken, skus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayPurchase)) {
            return false;
        }
        PayPurchase payPurchase = (PayPurchase) other;
        return Intrinsics.areEqual(this.userId, payPurchase.userId) && Intrinsics.areEqual(this.orderId, payPurchase.orderId) && Intrinsics.areEqual(this.purchaseToken, payPurchase.purchaseToken) && Intrinsics.areEqual(this.skus, payPurchase.skus);
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final List<PurchaseSku> getSkus() {
        return this.skus;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.orderId.hashCode()) * 31) + this.purchaseToken.hashCode()) * 31) + this.skus.hashCode();
    }

    @NotNull
    public String toString() {
        return "PayPurchase(userId=" + this.userId + ", orderId=" + this.orderId + ", purchaseToken=" + this.purchaseToken + ", skus=" + this.skus + ")";
    }
}
