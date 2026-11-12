package com.huami.healthlabel.entry;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B!\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\"\u0010#B9\b\u0017\u0012\u0006\u0010$\u001a\u00020\u0012\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/huami/healthlabel/entry/LabelItems;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "Lcom/huami/healthlabel/entry/HealthTagRecord;", "component1", "component2", "items", "next", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "()V", "b", "Lcom/huami/healthlabel/entry/HealthTagRecord;", "getNext", "()Lcom/huami/healthlabel/entry/HealthTagRecord;", "getNext$annotations", "<init>", "(Ljava/util/List;Lcom/huami/healthlabel/entry/HealthTagRecord;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/huami/healthlabel/entry/HealthTagRecord;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "serializer", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class LabelItems {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<HealthTagRecord> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final HealthTagRecord next;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/huami/healthlabel/entry/LabelItems$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/huami/healthlabel/entry/LabelItems;", "serializer", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LabelItems> serializer() {
            return LabelItems$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LabelItems(int i, @SerialName("items") List list, @SerialName("next") HealthTagRecord healthTagRecord, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, LabelItems$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        if ((i & 2) == 0) {
            this.next = null;
        } else {
            this.next = healthTagRecord;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabelItems copy$default(LabelItems labelItems, List list, HealthTagRecord healthTagRecord, int i, Object obj) {
        if ((i & 1) != 0) {
            list = labelItems.items;
        }
        if ((i & 2) != 0) {
            healthTagRecord = labelItems.next;
        }
        return labelItems.copy(list, healthTagRecord);
    }

    @SerialName("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @SerialName("next")
    public static /* synthetic */ void getNext$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull LabelItems self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        HealthTagRecord$$serializer healthTagRecord$$serializer = HealthTagRecord$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(healthTagRecord$$serializer), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.next != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, healthTagRecord$$serializer, self.next);
        }
    }

    @NotNull
    public final List<HealthTagRecord> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HealthTagRecord getNext() {
        return this.next;
    }

    @NotNull
    public final LabelItems copy(@NotNull List<HealthTagRecord> items, @Nullable HealthTagRecord next) {
        return new LabelItems(items, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelItems)) {
            return false;
        }
        LabelItems labelItems = (LabelItems) other;
        return Intrinsics.areEqual(this.items, labelItems.items) && Intrinsics.areEqual(this.next, labelItems.next);
    }

    @NotNull
    public final List<HealthTagRecord> getItems() {
        return this.items;
    }

    @Nullable
    public final HealthTagRecord getNext() {
        return this.next;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        HealthTagRecord healthTagRecord = this.next;
        return iHashCode + (healthTagRecord == null ? 0 : healthTagRecord.hashCode());
    }

    @NotNull
    public String toString() {
        return "LabelItems(items=" + this.items + ", next=" + this.next + ")";
    }

    public LabelItems(@NotNull List<HealthTagRecord> list, @Nullable HealthTagRecord healthTagRecord) {
        this.items = list;
        this.next = healthTagRecord;
    }

    public /* synthetic */ LabelItems(List list, HealthTagRecord healthTagRecord, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : healthTagRecord);
    }
}
