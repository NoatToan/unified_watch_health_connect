package com.xiaomi.fitness.watch.face.edit.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003JI\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/SlotEditItem;", "", "keyName", "", "movable", "", "selectWidgetIndex", "", "listWidget", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/EditWidget;", "positionList", "Lcom/xiaomi/fitness/watch/face/edit/entity/SlotPosition;", "<init>", "(Ljava/lang/String;ZILjava/util/List;Ljava/util/List;)V", "getKeyName", "()Ljava/lang/String;", "getMovable", "()Z", "getSelectWidgetIndex", "()I", "setSelectWidgetIndex", "(I)V", "getListWidget", "()Ljava/util/List;", "getPositionList", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SlotEditItem {

    @NotNull
    private final String keyName;

    @NotNull
    private final List<EditWidget> listWidget;
    private final boolean movable;

    @Nullable
    private final List<SlotPosition> positionList;
    private int selectWidgetIndex;

    public SlotEditItem(@NotNull String keyName, boolean z, int i, @NotNull List<EditWidget> listWidget, @Nullable List<SlotPosition> list) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(listWidget, "listWidget");
        this.keyName = keyName;
        this.movable = z;
        this.selectWidgetIndex = i;
        this.listWidget = listWidget;
        this.positionList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotEditItem copy$default(SlotEditItem slotEditItem, String str, boolean z, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = slotEditItem.keyName;
        }
        if ((i2 & 2) != 0) {
            z = slotEditItem.movable;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i = slotEditItem.selectWidgetIndex;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = slotEditItem.listWidget;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = slotEditItem.positionList;
        }
        return slotEditItem.copy(str, z2, i3, list3, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyName() {
        return this.keyName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMovable() {
        return this.movable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSelectWidgetIndex() {
        return this.selectWidgetIndex;
    }

    @NotNull
    public final List<EditWidget> component4() {
        return this.listWidget;
    }

    @Nullable
    public final List<SlotPosition> component5() {
        return this.positionList;
    }

    @NotNull
    public final SlotEditItem copy(@NotNull String keyName, boolean movable, int selectWidgetIndex, @NotNull List<EditWidget> listWidget, @Nullable List<SlotPosition> positionList) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(listWidget, "listWidget");
        return new SlotEditItem(keyName, movable, selectWidgetIndex, listWidget, positionList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotEditItem)) {
            return false;
        }
        SlotEditItem slotEditItem = (SlotEditItem) other;
        return Intrinsics.areEqual(this.keyName, slotEditItem.keyName) && this.movable == slotEditItem.movable && this.selectWidgetIndex == slotEditItem.selectWidgetIndex && Intrinsics.areEqual(this.listWidget, slotEditItem.listWidget) && Intrinsics.areEqual(this.positionList, slotEditItem.positionList);
    }

    @NotNull
    public final String getKeyName() {
        return this.keyName;
    }

    @NotNull
    public final List<EditWidget> getListWidget() {
        return this.listWidget;
    }

    public final boolean getMovable() {
        return this.movable;
    }

    @Nullable
    public final List<SlotPosition> getPositionList() {
        return this.positionList;
    }

    public final int getSelectWidgetIndex() {
        return this.selectWidgetIndex;
    }

    public int hashCode() {
        int iHashCode = ((((((this.keyName.hashCode() * 31) + Boolean.hashCode(this.movable)) * 31) + Integer.hashCode(this.selectWidgetIndex)) * 31) + this.listWidget.hashCode()) * 31;
        List<SlotPosition> list = this.positionList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setSelectWidgetIndex(int i) {
        this.selectWidgetIndex = i;
    }

    @NotNull
    public String toString() {
        return "SlotEditItem(keyName=" + this.keyName + ", movable=" + this.movable + ", selectWidgetIndex=" + this.selectWidgetIndex + ", listWidget=" + this.listWidget + ", positionList=" + this.positionList + ")";
    }

    public /* synthetic */ SlotEditItem(String str, boolean z, int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, i, list, (i2 & 16) != 0 ? null : list2);
    }
}
