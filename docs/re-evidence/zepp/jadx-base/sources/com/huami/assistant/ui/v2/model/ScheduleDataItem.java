package com.huami.assistant.ui.v2.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0007\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleDataItem;", "Lcom/huami/assistant/ui/v2/model/ScheduleListItemModel;", "Lcom/huami/assistant/ui/v2/model/ScheduleListModel;", "component1", "", "component2", "schedule", "isEnd", "copy", "", "toString", "", "hashCode", "", "other", "equals", "b", "Lcom/huami/assistant/ui/v2/model/ScheduleListModel;", "getSchedule", "()Lcom/huami/assistant/ui/v2/model/ScheduleListModel;", "c", "Z", "()Z", "<init>", "(Lcom/huami/assistant/ui/v2/model/ScheduleListModel;Z)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScheduleDataItem extends ScheduleListItemModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ScheduleListModel schedule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isEnd;

    public ScheduleDataItem(@NotNull ScheduleListModel scheduleListModel, boolean z) {
        super(ScheduleListType.DATA.INSTANCE);
        this.schedule = scheduleListModel;
        this.isEnd = z;
    }

    public static /* synthetic */ ScheduleDataItem copy$default(ScheduleDataItem scheduleDataItem, ScheduleListModel scheduleListModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            scheduleListModel = scheduleDataItem.schedule;
        }
        if ((i & 2) != 0) {
            z = scheduleDataItem.isEnd;
        }
        return scheduleDataItem.copy(scheduleListModel, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScheduleListModel getSchedule() {
        return this.schedule;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnd() {
        return this.isEnd;
    }

    @NotNull
    public final ScheduleDataItem copy(@NotNull ScheduleListModel schedule, boolean isEnd) {
        return new ScheduleDataItem(schedule, isEnd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleDataItem)) {
            return false;
        }
        ScheduleDataItem scheduleDataItem = (ScheduleDataItem) other;
        return Intrinsics.areEqual(this.schedule, scheduleDataItem.schedule) && this.isEnd == scheduleDataItem.isEnd;
    }

    @NotNull
    public final ScheduleListModel getSchedule() {
        return this.schedule;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.schedule.hashCode() * 31;
        boolean z = this.isEnd;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isEnd() {
        return this.isEnd;
    }

    @NotNull
    public String toString() {
        return "ScheduleDataItem(schedule=" + this.schedule + ", isEnd=" + this.isEnd + ")";
    }

    public /* synthetic */ ScheduleDataItem(ScheduleListModel scheduleListModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(scheduleListModel, (i & 2) != 0 ? false : z);
    }
}
