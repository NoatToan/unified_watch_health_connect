package com.huami.pay.lib.entry;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B;\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0004\b&\u0010'BY\b\u0017\u0012\u0006\u0010(\u001a\u00020\u0018\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\nHÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0003JG\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0001J\t\u0010\u0017\u001a\u00020\nHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0012\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0013\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\u0014\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b$\u0010\"R\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b%\u0010\u001f¨\u0006."}, d2 = {"Lcom/huami/pay/lib/entry/PayNotification;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "", "component1", "component2", "component3", "component4", "Lcom/huami/pay/lib/entry/Orders;", "component5", "orderIds", "token", "subscriptionId", "packageName", "orders", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getOrderIds", "()Ljava/util/List;", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "getSubscriptionId", "getPackageName", "getOrders", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class PayNotification {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<String> orderIds;

    @NotNull
    private final List<Orders> orders;

    @NotNull
    private final String packageName;

    @NotNull
    private final String subscriptionId;

    @NotNull
    private final String token;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/pay/lib/entry/PayNotification$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/pay/lib/entry/PayNotification;", "serializer", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PayNotification> serializer() {
            return PayNotification$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PayNotification(int i, List list, String str, String str2, String str3, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, PayNotification$$serializer.INSTANCE.getDescriptor());
        }
        this.orderIds = list;
        this.token = str;
        this.subscriptionId = str2;
        this.packageName = str3;
        this.orders = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayNotification copy$default(PayNotification payNotification, List list, String str, String str2, String str3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = payNotification.orderIds;
        }
        if ((i & 2) != 0) {
            str = payNotification.token;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = payNotification.subscriptionId;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = payNotification.packageName;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list2 = payNotification.orders;
        }
        return payNotification.copy(list, str4, str5, str6, list2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull PayNotification self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(StringSerializer.INSTANCE), self.orderIds);
        output.encodeStringElement(serialDesc, 1, self.token);
        output.encodeStringElement(serialDesc, 2, self.subscriptionId);
        output.encodeStringElement(serialDesc, 3, self.packageName);
        output.encodeSerializableElement(serialDesc, 4, new ArrayListSerializer(Orders$$serializer.INSTANCE), self.orders);
    }

    @NotNull
    public final List<String> component1() {
        return this.orderIds;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final List<Orders> component5() {
        return this.orders;
    }

    @NotNull
    public final PayNotification copy(@NotNull List<String> orderIds, @NotNull String token, @NotNull String subscriptionId, @NotNull String packageName, @NotNull List<Orders> orders) {
        return new PayNotification(orderIds, token, subscriptionId, packageName, orders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayNotification)) {
            return false;
        }
        PayNotification payNotification = (PayNotification) other;
        return Intrinsics.areEqual(this.orderIds, payNotification.orderIds) && Intrinsics.areEqual(this.token, payNotification.token) && Intrinsics.areEqual(this.subscriptionId, payNotification.subscriptionId) && Intrinsics.areEqual(this.packageName, payNotification.packageName) && Intrinsics.areEqual(this.orders, payNotification.orders);
    }

    @NotNull
    public final List<String> getOrderIds() {
        return this.orderIds;
    }

    @NotNull
    public final List<Orders> getOrders() {
        return this.orders;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((((((this.orderIds.hashCode() * 31) + this.token.hashCode()) * 31) + this.subscriptionId.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.orders.hashCode();
    }

    @NotNull
    public String toString() {
        return "PayNotification(orderIds=" + this.orderIds + ", token=" + this.token + ", subscriptionId=" + this.subscriptionId + ", packageName=" + this.packageName + ", orders=" + this.orders + ")";
    }

    public PayNotification(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<Orders> list2) {
        this.orderIds = list;
        this.token = str;
        this.subscriptionId = str2;
        this.packageName = str3;
        this.orders = list2;
    }
}
