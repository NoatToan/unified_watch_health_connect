package com.huami.bloodpressure_core.dc.remote;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 **\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002+*B!\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b$\u0010%B5\b\u0017\u0012\u0006\u0010&\u001a\u00020\u001a\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0001\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)JU\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00030\u000bHÇ\u0001J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010\u0015\u001a\u0004\u0018\u00018\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006,"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/UserEventsResponse;", ExifInterface.GPS_DIRECTION_TRUE, "R", "", "T0", "T1", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "typeSerial1", "", "write$Self", "", "component1", "component2", "()Ljava/lang/Object;", "items", "next", "copy", "(Ljava/util/List;Ljava/lang/Object;)Lcom/huami/bloodpressure_core/dc/remote/UserEventsResponse;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/Object;", "getNext", "<init>", "(Ljava/util/List;Ljava/lang/Object;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Object;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class UserEventsResponse<T, R> {

    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<T> items;

    @Nullable
    private final R next;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJC\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00070\u0004\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004HÆ\u0001¨\u0006\u000b"}, d2 = {"Lcom/huami/bloodpressure_core/dc/remote/UserEventsResponse$Companion;", "", "T0", "T1", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "typeSerial1", "Lcom/huami/bloodpressure_core/dc/remote/UserEventsResponse;", "serializer", "<init>", "()V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T0, T1> KSerializer<UserEventsResponse<T0, T1>> serializer(@NotNull KSerializer<T0> typeSerial0, @NotNull KSerializer<T1> typeSerial1) {
            return new UserEventsResponse$$serializer(typeSerial0, typeSerial1);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.bloodpressure_core.dc.remote.UserEventsResponse", null, 2);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("next", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ UserEventsResponse(int i, List list, Object obj, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, $cachedDescriptor);
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.next = null;
        } else {
            this.next = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserEventsResponse copy$default(UserEventsResponse userEventsResponse, List list, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = userEventsResponse.items;
        }
        if ((i & 2) != 0) {
            obj = userEventsResponse.next;
        }
        return userEventsResponse.copy(list, obj);
    }

    @JvmStatic
    public static final <T0, T1> void write$Self(@NotNull UserEventsResponse<T0, T1> self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc, @NotNull KSerializer<T0> typeSerial0, @NotNull KSerializer<T1> typeSerial1) {
        output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(typeSerial0), ((UserEventsResponse) self).items);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || ((UserEventsResponse) self).next != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, typeSerial1, ((UserEventsResponse) self).next);
        }
    }

    @NotNull
    public final List<T> component1() {
        return this.items;
    }

    @Nullable
    public final R component2() {
        return this.next;
    }

    @NotNull
    public final UserEventsResponse<T, R> copy(@NotNull List<? extends T> items, @Nullable R next) {
        return new UserEventsResponse<>(items, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserEventsResponse)) {
            return false;
        }
        UserEventsResponse userEventsResponse = (UserEventsResponse) other;
        return Intrinsics.areEqual(this.items, userEventsResponse.items) && Intrinsics.areEqual(this.next, userEventsResponse.next);
    }

    @NotNull
    public final List<T> getItems() {
        return this.items;
    }

    @Nullable
    public final R getNext() {
        return this.next;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        R r = this.next;
        return iHashCode + (r == null ? 0 : r.hashCode());
    }

    @NotNull
    public String toString() {
        return "UserEventsResponse(items=" + this.items + ", next=" + this.next + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserEventsResponse(@NotNull List<? extends T> list, @Nullable R r) {
        this.items = list;
        this.next = r;
    }

    public /* synthetic */ UserEventsResponse(List list, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : obj);
    }
}
