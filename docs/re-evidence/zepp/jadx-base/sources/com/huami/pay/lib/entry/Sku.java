package com.huami.pay.lib.entry;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 BC\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006'"}, d2 = {"Lcom/huami/pay/lib/entry/Sku;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "component3", "component4", "currencyCode", FirebaseAnalytics.Param.PRICE, "subscriptionId", TrainingWebConst.QueryParam.SKUID, "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getCurrencyCode", "()Ljava/lang/String;", "getPrice", "getSubscriptionId", "getSkuId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class Sku {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String currencyCode;

    @NotNull
    private final String price;

    @NotNull
    private final String skuId;

    @NotNull
    private final String subscriptionId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/pay/lib/entry/Sku$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/pay/lib/entry/Sku;", "serializer", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Sku> serializer() {
            return Sku$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Sku(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, Sku$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyCode = str;
        this.price = str2;
        this.subscriptionId = str3;
        this.skuId = str4;
    }

    public static /* synthetic */ Sku copy$default(Sku sku, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sku.currencyCode;
        }
        if ((i & 2) != 0) {
            str2 = sku.price;
        }
        if ((i & 4) != 0) {
            str3 = sku.subscriptionId;
        }
        if ((i & 8) != 0) {
            str4 = sku.skuId;
        }
        return sku.copy(str, str2, str3, str4);
    }

    @JvmStatic
    public static final void write$Self(@NotNull Sku self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.currencyCode);
        output.encodeStringElement(serialDesc, 1, self.price);
        output.encodeStringElement(serialDesc, 2, self.subscriptionId);
        output.encodeStringElement(serialDesc, 3, self.skuId);
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
    public final Sku copy(@NotNull String currencyCode, @NotNull String price, @NotNull String subscriptionId, @NotNull String skuId) {
        return new Sku(currencyCode, price, subscriptionId, skuId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sku)) {
            return false;
        }
        Sku sku = (Sku) other;
        return Intrinsics.areEqual(this.currencyCode, sku.currencyCode) && Intrinsics.areEqual(this.price, sku.price) && Intrinsics.areEqual(this.subscriptionId, sku.subscriptionId) && Intrinsics.areEqual(this.skuId, sku.skuId);
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
        return "Sku(currencyCode=" + this.currencyCode + ", price=" + this.price + ", subscriptionId=" + this.subscriptionId + ", skuId=" + this.skuId + ")";
    }

    public Sku(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.currencyCode = str;
        this.price = str2;
        this.subscriptionId = str3;
        this.skuId = str4;
    }
}
