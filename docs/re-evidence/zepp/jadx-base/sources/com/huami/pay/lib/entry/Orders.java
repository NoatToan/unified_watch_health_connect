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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001d\u0010\u001eB5\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0012\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/huami/pay/lib/entry/Orders;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "Lcom/huami/pay/lib/entry/Sku;", "component2", "orderId", "skus", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getOrderId", "()Ljava/lang/String;", "Ljava/util/List;", "getSkus", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class Orders {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String orderId;

    @NotNull
    private final List<Sku> skus;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/pay/lib/entry/Orders$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/pay/lib/entry/Orders;", "serializer", "<init>", "()V", "pay-lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Orders> serializer() {
            return Orders$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Orders(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, Orders$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.skus = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Orders copy$default(Orders orders, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orders.orderId;
        }
        if ((i & 2) != 0) {
            list = orders.skus;
        }
        return orders.copy(str, list);
    }

    @JvmStatic
    public static final void write$Self(@NotNull Orders self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.orderId);
        output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(Sku$$serializer.INSTANCE), self.skus);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final List<Sku> component2() {
        return this.skus;
    }

    @NotNull
    public final Orders copy(@NotNull String orderId, @NotNull List<Sku> skus) {
        return new Orders(orderId, skus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Orders)) {
            return false;
        }
        Orders orders = (Orders) other;
        return Intrinsics.areEqual(this.orderId, orders.orderId) && Intrinsics.areEqual(this.skus, orders.skus);
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final List<Sku> getSkus() {
        return this.skus;
    }

    public int hashCode() {
        return (this.orderId.hashCode() * 31) + this.skus.hashCode();
    }

    @NotNull
    public String toString() {
        return "Orders(orderId=" + this.orderId + ", skus=" + this.skus + ")";
    }

    public Orders(@NotNull String str, @NotNull List<Sku> list) {
        this.orderId = str;
        this.skus = list;
    }
}
