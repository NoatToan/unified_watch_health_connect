package com.huami.bodymeasurements.detailframe.event;

import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/bodymeasurements/detailframe/event/EventTargetPage;", "", "", "component1", "Lcom/huami/bodymeasurements/detailframe/event/EventTargetType;", "component2", "targetTime", "type", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTargetTime", "()J", "b", "Lcom/huami/bodymeasurements/detailframe/event/EventTargetType;", "getType", "()Lcom/huami/bodymeasurements/detailframe/event/EventTargetType;", "<init>", "(JLcom/huami/bodymeasurements/detailframe/event/EventTargetType;)V", "detailframe_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EventTargetPage {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long targetTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final EventTargetType type;

    public EventTargetPage(long j, @NotNull EventTargetType eventTargetType) {
        this.targetTime = j;
        this.type = eventTargetType;
    }

    public static /* synthetic */ EventTargetPage copy$default(EventTargetPage eventTargetPage, long j, EventTargetType eventTargetType, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eventTargetPage.targetTime;
        }
        if ((i & 2) != 0) {
            eventTargetType = eventTargetPage.type;
        }
        return eventTargetPage.copy(j, eventTargetType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTargetTime() {
        return this.targetTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventTargetType getType() {
        return this.type;
    }

    @NotNull
    public final EventTargetPage copy(long targetTime, @NotNull EventTargetType type) {
        return new EventTargetPage(targetTime, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTargetPage)) {
            return false;
        }
        EventTargetPage eventTargetPage = (EventTargetPage) other;
        return this.targetTime == eventTargetPage.targetTime && this.type == eventTargetPage.type;
    }

    public final long getTargetTime() {
        return this.targetTime;
    }

    @NotNull
    public final EventTargetType getType() {
        return this.type;
    }

    public int hashCode() {
        return (b.a(this.targetTime) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventTargetPage(targetTime=" + this.targetTime + ", type=" + this.type + ')';
    }

    public /* synthetic */ EventTargetPage(long j, EventTargetType eventTargetType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? EventTargetType.DETAIL_AUTO : eventTargetType);
    }
}
