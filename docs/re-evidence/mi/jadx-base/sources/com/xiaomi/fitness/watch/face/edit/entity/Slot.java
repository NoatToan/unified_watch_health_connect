package com.xiaomi.fitness.watch.face.edit.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/Slot;", "", "name", "", "type", "movable", "", "itemList", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/SlotWidgetItem;", "positionList", "Lcom/xiaomi/fitness/watch/face/edit/entity/SlotPosition;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getType", "getMovable", "()Z", "getItemList", "()Ljava/util/List;", "setItemList", "(Ljava/util/List;)V", "getPositionList", "setPositionList", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Slot {

    @Nullable
    private List<SlotWidgetItem> itemList;
    private final boolean movable;

    @Nullable
    private final String name;

    @Nullable
    private List<SlotPosition> positionList;

    @NotNull
    private final String type;

    public Slot(@Nullable String str, @NotNull String type, boolean z, @Nullable List<SlotWidgetItem> list, @Nullable List<SlotPosition> list2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.name = str;
        this.type = type;
        this.movable = z;
        this.itemList = list;
        this.positionList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slot copy$default(Slot slot, String str, String str2, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slot.name;
        }
        if ((i & 2) != 0) {
            str2 = slot.type;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = slot.movable;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            list = slot.itemList;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = slot.positionList;
        }
        return slot.copy(str, str3, z2, list3, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMovable() {
        return this.movable;
    }

    @Nullable
    public final List<SlotWidgetItem> component4() {
        return this.itemList;
    }

    @Nullable
    public final List<SlotPosition> component5() {
        return this.positionList;
    }

    @NotNull
    public final Slot copy(@Nullable String name, @NotNull String type, boolean movable, @Nullable List<SlotWidgetItem> itemList, @Nullable List<SlotPosition> positionList) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new Slot(name, type, movable, itemList, positionList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Slot)) {
            return false;
        }
        Slot slot = (Slot) other;
        return Intrinsics.areEqual(this.name, slot.name) && Intrinsics.areEqual(this.type, slot.type) && this.movable == slot.movable && Intrinsics.areEqual(this.itemList, slot.itemList) && Intrinsics.areEqual(this.positionList, slot.positionList);
    }

    @Nullable
    public final List<SlotWidgetItem> getItemList() {
        return this.itemList;
    }

    public final boolean getMovable() {
        return this.movable;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<SlotPosition> getPositionList() {
        return this.positionList;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.movable)) * 31;
        List<SlotWidgetItem> list = this.itemList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SlotPosition> list2 = this.positionList;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setItemList(@Nullable List<SlotWidgetItem> list) {
        this.itemList = list;
    }

    public final void setPositionList(@Nullable List<SlotPosition> list) {
        this.positionList = list;
    }

    @NotNull
    public String toString() {
        return "Slot(name=" + this.name + ", type=" + this.type + ", movable=" + this.movable + ", itemList=" + this.itemList + ", positionList=" + this.positionList + ")";
    }

    public /* synthetic */ Slot(String str, String str2, boolean z, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
    }
}
