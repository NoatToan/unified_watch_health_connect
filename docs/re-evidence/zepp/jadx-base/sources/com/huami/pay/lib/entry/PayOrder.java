package com.huami.pay.lib.entry;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0004'&()B\u0019\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, d2 = {"Lcom/huami/pay/lib/entry/PayOrder;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/huami/pay/lib/entry/PayOrder$Order;", "component1", "Lcom/huami/pay/lib/entry/PayOrder$Payment;", "component2", StatEvent.MINE_KINGKONG_C_ORDER_VALUE, "payment", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/pay/lib/entry/PayOrder$Order;", "getOrder", "()Lcom/huami/pay/lib/entry/PayOrder$Order;", "getOrder$annotations", "()V", "Lcom/huami/pay/lib/entry/PayOrder$Payment;", "getPayment", "()Lcom/huami/pay/lib/entry/PayOrder$Payment;", "getPayment$annotations", "<init>", "(Lcom/huami/pay/lib/entry/PayOrder$Order;Lcom/huami/pay/lib/entry/PayOrder$Payment;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/huami/pay/lib/entry/PayOrder$Order;Lcom/huami/pay/lib/entry/PayOrder$Payment;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "Order", WFStateEvent.WF_PAYMENT, "pay-lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class PayOrder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Order order;

    @Nullable
    private final Payment payment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/pay/lib/entry/PayOrder$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/pay/lib/entry/PayOrder;", "serializer", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PayOrder> serializer() {
            return PayOrder$$serializer.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0003+*,B'\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b$\u0010%BE\b\u0017\u0012\u0006\u0010&\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\tHÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\t2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001e\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 R\"\u0010\u0011\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u001b¨\u0006-"}, d2 = {"Lcom/huami/pay/lib/entry/PayOrder$Order;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "Lcom/huami/pay/lib/entry/PayOrder$Order$OrderSku;", "component2", "component3", "description", "skus", "orderId", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "getDescription$annotations", "()V", "Ljava/util/List;", "getSkus", "()Ljava/util/List;", "getSkus$annotations", "getOrderId", "getOrderId$annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "OrderSku", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
    @Serializable
    public static final /* data */ class Order {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String description;

        @NotNull
        private final String orderId;

        @NotNull
        private final List<OrderSku> skus;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/pay/lib/entry/PayOrder$Order$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/pay/lib/entry/PayOrder$Order;", "serializer", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer<Order> serializer() {
                return PayOrder$Order$$serializer.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B)\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#B=\b\u0017\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000f\u001a\u00020\u000b8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u0012\u0004\b!\u0010\u001b\u001a\u0004\b \u0010\u0019¨\u0006*"}, d2 = {"Lcom/huami/pay/lib/entry/PayOrder$Order$OrderSku;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "component3", TrainingWebConst.QueryParam.SKUID, FirebaseAnalytics.Param.QUANTITY, "extra", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSkuId", "()Ljava/lang/String;", "getSkuId$annotations", "()V", LogUtil.I, "getQuantity", "()I", "getQuantity$annotations", "getExtra", "getExtra$annotations", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
        @Serializable
        public static final /* data */ class OrderSku {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @Nullable
            private final String extra;
            private final int quantity;

            @Nullable
            private final String skuId;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/pay/lib/entry/PayOrder$Order$OrderSku$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/pay/lib/entry/PayOrder$Order$OrderSku;", "serializer", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer<OrderSku> serializer() {
                    return PayOrder$Order$OrderSku$$serializer.INSTANCE;
                }
            }

            public OrderSku() {
                this((String) null, 0, (String) null, 7, (DefaultConstructorMarker) null);
            }

            @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ OrderSku(int i, @SerialName(TrainingWebConst.QueryParam.SKUID) String str, @SerialName(FirebaseAnalytics.Param.QUANTITY) int i2, @SerialName("extra") String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 0) != 0) {
                    PluginExceptionsKt.throwMissingFieldException(i, 0, PayOrder$Order$OrderSku$$serializer.INSTANCE.getDescriptor());
                }
                if ((i & 1) == 0) {
                    this.skuId = null;
                } else {
                    this.skuId = str;
                }
                if ((i & 2) == 0) {
                    this.quantity = 1;
                } else {
                    this.quantity = i2;
                }
                if ((i & 4) == 0) {
                    this.extra = null;
                } else {
                    this.extra = str2;
                }
            }

            public static /* synthetic */ OrderSku copy$default(OrderSku orderSku, String str, int i, String str2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = orderSku.skuId;
                }
                if ((i2 & 2) != 0) {
                    i = orderSku.quantity;
                }
                if ((i2 & 4) != 0) {
                    str2 = orderSku.extra;
                }
                return orderSku.copy(str, i, str2);
            }

            @SerialName("extra")
            public static /* synthetic */ void getExtra$annotations() {
            }

            @SerialName(FirebaseAnalytics.Param.QUANTITY)
            public static /* synthetic */ void getQuantity$annotations() {
            }

            @SerialName(TrainingWebConst.QueryParam.SKUID)
            public static /* synthetic */ void getSkuId$annotations() {
            }

            @JvmStatic
            public static final void write$Self(@NotNull OrderSku self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.skuId != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.skuId);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.quantity != 1) {
                    output.encodeIntElement(serialDesc, 1, self.quantity);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 2) || self.extra != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.extra);
                }
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getSkuId() {
                return this.skuId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getQuantity() {
                return this.quantity;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getExtra() {
                return this.extra;
            }

            @NotNull
            public final OrderSku copy(@Nullable String skuId, int quantity, @Nullable String extra) {
                return new OrderSku(skuId, quantity, extra);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderSku)) {
                    return false;
                }
                OrderSku orderSku = (OrderSku) other;
                return Intrinsics.areEqual(this.skuId, orderSku.skuId) && this.quantity == orderSku.quantity && Intrinsics.areEqual(this.extra, orderSku.extra);
            }

            @Nullable
            public final String getExtra() {
                return this.extra;
            }

            public final int getQuantity() {
                return this.quantity;
            }

            @Nullable
            public final String getSkuId() {
                return this.skuId;
            }

            public int hashCode() {
                String str = this.skuId;
                int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.quantity) * 31;
                String str2 = this.extra;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "OrderSku(skuId=" + this.skuId + ", quantity=" + this.quantity + ", extra=" + this.extra + ")";
            }

            public OrderSku(@Nullable String str, int i, @Nullable String str2) {
                this.skuId = str;
                this.quantity = i;
                this.extra = str2;
            }

            public /* synthetic */ OrderSku(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? null : str2);
            }
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Order(int i, @SerialName("description") String str, @SerialName("items") List list, @SerialName("orderId") String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, PayOrder$Order$$serializer.INSTANCE.getDescriptor());
            }
            this.description = str;
            this.skus = list;
            if ((i & 4) == 0) {
                this.orderId = "";
            } else {
                this.orderId = str2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Order copy$default(Order order, String str, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = order.description;
            }
            if ((i & 2) != 0) {
                list = order.skus;
            }
            if ((i & 4) != 0) {
                str2 = order.orderId;
            }
            return order.copy(str, list, str2);
        }

        @SerialName("description")
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("orderId")
        public static /* synthetic */ void getOrderId$annotations() {
        }

        @SerialName("items")
        public static /* synthetic */ void getSkus$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull Order self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.description);
            output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(PayOrder$Order$OrderSku$$serializer.INSTANCE), self.skus);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.orderId, "")) {
                output.encodeStringElement(serialDesc, 2, self.orderId);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final List<OrderSku> component2() {
            return this.skus;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        @NotNull
        public final Order copy(@NotNull String description, @NotNull List<OrderSku> skus, @NotNull String orderId) {
            return new Order(description, skus, orderId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Order)) {
                return false;
            }
            Order order = (Order) other;
            return Intrinsics.areEqual(this.description, order.description) && Intrinsics.areEqual(this.skus, order.skus) && Intrinsics.areEqual(this.orderId, order.orderId);
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getOrderId() {
            return this.orderId;
        }

        @NotNull
        public final List<OrderSku> getSkus() {
            return this.skus;
        }

        public int hashCode() {
            return (((this.description.hashCode() * 31) + this.skus.hashCode()) * 31) + this.orderId.hashCode();
        }

        @NotNull
        public String toString() {
            return "Order(description=" + this.description + ", skus=" + this.skus + ", orderId=" + this.orderId + ")";
        }

        public Order(@NotNull String str, @NotNull List<OrderSku> list, @NotNull String str2) {
            this.description = str;
            this.skus = list;
            this.orderId = str2;
        }

        public /* synthetic */ Order(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i & 4) != 0 ? "" : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001d\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dB3\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R$\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006$"}, d2 = {"Lcom/huami/pay/lib/entry/PayOrder$Payment;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "payChannel", "prepaidData", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getPayChannel", "()Ljava/lang/String;", "getPayChannel$annotations", "()V", "getPrepaidData", "getPrepaidData$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
    @Serializable
    public static final /* data */ class Payment {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String payChannel;

        @Nullable
        private final String prepaidData;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/pay/lib/entry/PayOrder$Payment$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/pay/lib/entry/PayOrder$Payment;", "serializer", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer<Payment> serializer() {
                return PayOrder$Payment$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Payment() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Payment(int i, @SerialName("payChannel") String str, @SerialName("prepaidData") String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i, 0, PayOrder$Payment$$serializer.INSTANCE.getDescriptor());
            }
            this.payChannel = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.prepaidData = null;
            } else {
                this.prepaidData = str2;
            }
        }

        public static /* synthetic */ Payment copy$default(Payment payment, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payment.payChannel;
            }
            if ((i & 2) != 0) {
                str2 = payment.prepaidData;
            }
            return payment.copy(str, str2);
        }

        @SerialName("payChannel")
        public static /* synthetic */ void getPayChannel$annotations() {
        }

        @SerialName("prepaidData")
        public static /* synthetic */ void getPrepaidData$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull Payment self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.payChannel, "")) {
                output.encodeStringElement(serialDesc, 0, self.payChannel);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.prepaidData != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.prepaidData);
            }
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPayChannel() {
            return this.payChannel;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPrepaidData() {
            return this.prepaidData;
        }

        @NotNull
        public final Payment copy(@NotNull String payChannel, @Nullable String prepaidData) {
            return new Payment(payChannel, prepaidData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) other;
            return Intrinsics.areEqual(this.payChannel, payment.payChannel) && Intrinsics.areEqual(this.prepaidData, payment.prepaidData);
        }

        @NotNull
        public final String getPayChannel() {
            return this.payChannel;
        }

        @Nullable
        public final String getPrepaidData() {
            return this.prepaidData;
        }

        public int hashCode() {
            int iHashCode = this.payChannel.hashCode() * 31;
            String str = this.prepaidData;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Payment(payChannel=" + this.payChannel + ", prepaidData=" + this.prepaidData + ")";
        }

        public Payment(@NotNull String str, @Nullable String str2) {
            this.payChannel = str;
            this.prepaidData = str2;
        }

        public /* synthetic */ Payment(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PayOrder(int i, @SerialName(StatEvent.MINE_KINGKONG_C_ORDER_VALUE) Order order, @SerialName("payment") Payment payment, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PayOrder$$serializer.INSTANCE.getDescriptor());
        }
        this.order = order;
        this.payment = payment;
    }

    public static /* synthetic */ PayOrder copy$default(PayOrder payOrder, Order order, Payment payment, int i, Object obj) {
        if ((i & 1) != 0) {
            order = payOrder.order;
        }
        if ((i & 2) != 0) {
            payment = payOrder.payment;
        }
        return payOrder.copy(order, payment);
    }

    @SerialName(StatEvent.MINE_KINGKONG_C_ORDER_VALUE)
    public static /* synthetic */ void getOrder$annotations() {
    }

    @SerialName("payment")
    public static /* synthetic */ void getPayment$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull PayOrder self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, PayOrder$Order$$serializer.INSTANCE, self.order);
        output.encodeNullableSerializableElement(serialDesc, 1, PayOrder$Payment$$serializer.INSTANCE, self.payment);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Order getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Payment getPayment() {
        return this.payment;
    }

    @NotNull
    public final PayOrder copy(@NotNull Order order, @Nullable Payment payment) {
        return new PayOrder(order, payment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayOrder)) {
            return false;
        }
        PayOrder payOrder = (PayOrder) other;
        return Intrinsics.areEqual(this.order, payOrder.order) && Intrinsics.areEqual(this.payment, payOrder.payment);
    }

    @NotNull
    public final Order getOrder() {
        return this.order;
    }

    @Nullable
    public final Payment getPayment() {
        return this.payment;
    }

    public int hashCode() {
        int iHashCode = this.order.hashCode() * 31;
        Payment payment = this.payment;
        return iHashCode + (payment == null ? 0 : payment.hashCode());
    }

    @NotNull
    public String toString() {
        return "PayOrder(order=" + this.order + ", payment=" + this.payment + ")";
    }

    public PayOrder(@NotNull Order order, @Nullable Payment payment) {
        this.order = order;
        this.payment = payment;
    }
}
