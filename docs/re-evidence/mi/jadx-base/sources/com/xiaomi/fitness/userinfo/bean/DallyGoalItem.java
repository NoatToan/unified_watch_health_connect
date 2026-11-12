package com.xiaomi.fitness.userinfo.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/userinfo/bean/DallyGoalItem;", "", "field", "", "target", "<init>", "(II)V", "getField", "()I", "setField", "(I)V", "getTarget", "setTarget", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DallyGoalItem {
    private int field;
    private int target;

    /* JADX WARN: Illegal instructions before constructor call */
    public DallyGoalItem() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ DallyGoalItem copy$default(DallyGoalItem dallyGoalItem, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dallyGoalItem.field;
        }
        if ((i3 & 2) != 0) {
            i2 = dallyGoalItem.target;
        }
        return dallyGoalItem.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getField() {
        return this.field;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTarget() {
        return this.target;
    }

    @NotNull
    public final DallyGoalItem copy(int field, int target) {
        return new DallyGoalItem(field, target);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DallyGoalItem)) {
            return false;
        }
        DallyGoalItem dallyGoalItem = (DallyGoalItem) other;
        return this.field == dallyGoalItem.field && this.target == dallyGoalItem.target;
    }

    public final int getField() {
        return this.field;
    }

    public final int getTarget() {
        return this.target;
    }

    public int hashCode() {
        return (Integer.hashCode(this.field) * 31) + Integer.hashCode(this.target);
    }

    public final void setField(int i) {
        this.field = i;
    }

    public final void setTarget(int i) {
        this.target = i;
    }

    @NotNull
    public String toString() {
        return "DallyGoalItem(field=" + this.field + ", target=" + this.target + ")";
    }

    public DallyGoalItem(int i, int i2) {
        this.field = i;
        this.target = i2;
    }

    public /* synthetic */ DallyGoalItem(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
