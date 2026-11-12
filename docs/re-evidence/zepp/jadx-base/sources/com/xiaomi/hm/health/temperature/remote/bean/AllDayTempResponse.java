package com.xiaomi.hm.health.temperature.remote.bean;

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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B!\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001f\u0010 B5\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0012\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean;", "component1", "component2", "items", "next", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "b", "Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean;", "getNext", "()Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean;", "<init>", "(Ljava/util/List;Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempBean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class AllDayTempResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<AllDayTempBean> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final AllDayTempBean next;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/xiaomi/hm/health/temperature/remote/bean/AllDayTempResponse;", "serializer", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<AllDayTempResponse> serializer() {
            return AllDayTempResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AllDayTempResponse(int i, List list, AllDayTempBean allDayTempBean, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AllDayTempResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.next = null;
        } else {
            this.next = allDayTempBean;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllDayTempResponse copy$default(AllDayTempResponse allDayTempResponse, List list, AllDayTempBean allDayTempBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = allDayTempResponse.items;
        }
        if ((i & 2) != 0) {
            allDayTempBean = allDayTempResponse.next;
        }
        return allDayTempResponse.copy(list, allDayTempBean);
    }

    @JvmStatic
    public static final void write$Self(@NotNull AllDayTempResponse self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        AllDayTempBean$$serializer allDayTempBean$$serializer = AllDayTempBean$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(allDayTempBean$$serializer), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.next != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, allDayTempBean$$serializer, self.next);
        }
    }

    @NotNull
    public final List<AllDayTempBean> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AllDayTempBean getNext() {
        return this.next;
    }

    @NotNull
    public final AllDayTempResponse copy(@NotNull List<AllDayTempBean> items, @Nullable AllDayTempBean next) {
        return new AllDayTempResponse(items, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllDayTempResponse)) {
            return false;
        }
        AllDayTempResponse allDayTempResponse = (AllDayTempResponse) other;
        return Intrinsics.areEqual(this.items, allDayTempResponse.items) && Intrinsics.areEqual(this.next, allDayTempResponse.next);
    }

    @NotNull
    public final List<AllDayTempBean> getItems() {
        return this.items;
    }

    @Nullable
    public final AllDayTempBean getNext() {
        return this.next;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        AllDayTempBean allDayTempBean = this.next;
        return iHashCode + (allDayTempBean == null ? 0 : allDayTempBean.hashCode());
    }

    @NotNull
    public String toString() {
        return "AllDayTempResponse(items=" + this.items + ", next=" + this.next + ")";
    }

    public AllDayTempResponse(@NotNull List<AllDayTempBean> list, @Nullable AllDayTempBean allDayTempBean) {
        this.items = list;
        this.next = allDayTempBean;
    }

    public /* synthetic */ AllDayTempResponse(List list, AllDayTempBean allDayTempBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : allDayTempBean);
    }
}
