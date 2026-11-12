package com.huami.assistant.ui.v2.model;

import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleDateItem;", "Lcom/huami/assistant/ui/v2/model/ScheduleListItemModel;", "", "component1", "timestamp", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "J", "getTimestamp", "()J", "<init>", "(J)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScheduleDateItem extends ScheduleListItemModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long timestamp;

    public ScheduleDateItem(long j) {
        super(ScheduleListType.DATE.INSTANCE);
        this.timestamp = j;
    }

    public static /* synthetic */ ScheduleDateItem copy$default(ScheduleDateItem scheduleDateItem, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = scheduleDateItem.timestamp;
        }
        return scheduleDateItem.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final ScheduleDateItem copy(long timestamp) {
        return new ScheduleDateItem(timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ScheduleDateItem) && this.timestamp == ((ScheduleDateItem) other).timestamp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return b.a(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "ScheduleDateItem(timestamp=" + this.timestamp + ")";
    }
}
