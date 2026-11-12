package com.huami.treadmill.data;

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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002*)B!\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b#\u0010$B9\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0015\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J;\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tHÇ\u0001J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003R(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/huami/treadmill/data/Items;", ExifInterface.GPS_DIRECTION_TRUE, "", "T0", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "", "write$Self", "", "component1", "", "component2", "items", "next", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "()V", "Ljava/lang/String;", "getNext", "()Ljava/lang/String;", "getNext$annotations", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "treadmill_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class Items<T> {

    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<T> items;

    @Nullable
    private final String next;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0003\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001¨\u0006\t"}, d2 = {"Lcom/huami/treadmill/data/Items$Companion;", "", "T0", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lcom/huami/treadmill/data/Items;", "serializer", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T0> KSerializer<Items<T0>> serializer(@NotNull KSerializer<T0> typeSerial0) {
            return new Items$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.huami.treadmill.data.Items", null, 2);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("next", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Items(int i, @SerialName("items") List list, @SerialName("next") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, $cachedDescriptor);
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.next = null;
        } else {
            this.next = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Items copy$default(Items items, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = items.items;
        }
        if ((i & 2) != 0) {
            str = items.next;
        }
        return items.copy(list, str);
    }

    @SerialName("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @SerialName("next")
    public static /* synthetic */ void getNext$annotations() {
    }

    @JvmStatic
    public static final <T0> void write$Self(@NotNull Items<T0> self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc, @NotNull KSerializer<T0> typeSerial0) {
        output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(typeSerial0), ((Items) self).items);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || ((Items) self).next != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, ((Items) self).next);
        }
    }

    @NotNull
    public final List<T> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    @NotNull
    public final Items<T> copy(@NotNull List<? extends T> items, @Nullable String next) {
        return new Items<>(items, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Items)) {
            return false;
        }
        Items items = (Items) other;
        return Intrinsics.areEqual(this.items, items.items) && Intrinsics.areEqual(this.next, items.next);
    }

    @NotNull
    public final List<T> getItems() {
        return this.items;
    }

    @Nullable
    public final String getNext() {
        return this.next;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.next;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "Items(items=" + this.items + ", next=" + ((Object) this.next) + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Items(@NotNull List<? extends T> list, @Nullable String str) {
        this.items = list;
        this.next = str;
    }

    public /* synthetic */ Items(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
