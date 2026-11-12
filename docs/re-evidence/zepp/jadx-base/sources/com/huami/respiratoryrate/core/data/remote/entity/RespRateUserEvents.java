package com.huami.respiratoryrate.core.data.remote.entity;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003J%\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateUserEvents;", "", "", "Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;", "component1", "component2", "items", "next", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;", "getNext", "()Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;", "<init>", "(Ljava/util/List;Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RespRateUserEvents {

    @NotNull
    private final List<RespRateEventItem> items;

    @Nullable
    private final RespRateEventItem next;

    /* JADX WARN: Multi-variable type inference failed */
    public RespRateUserEvents() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public RespRateUserEvents(@NotNull List<RespRateEventItem> list, @Nullable RespRateEventItem respRateEventItem) {
        this.items = list;
        this.next = respRateEventItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RespRateUserEvents copy$default(RespRateUserEvents respRateUserEvents, List list, RespRateEventItem respRateEventItem, int i, Object obj) {
        if ((i & 1) != 0) {
            list = respRateUserEvents.items;
        }
        if ((i & 2) != 0) {
            respRateEventItem = respRateUserEvents.next;
        }
        return respRateUserEvents.copy(list, respRateEventItem);
    }

    @NotNull
    public final List<RespRateEventItem> component1() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RespRateEventItem getNext() {
        return this.next;
    }

    @NotNull
    public final RespRateUserEvents copy(@NotNull List<RespRateEventItem> items, @Nullable RespRateEventItem next) {
        return new RespRateUserEvents(items, next);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RespRateUserEvents)) {
            return false;
        }
        RespRateUserEvents respRateUserEvents = (RespRateUserEvents) other;
        return Intrinsics.areEqual(this.items, respRateUserEvents.items) && Intrinsics.areEqual(this.next, respRateUserEvents.next);
    }

    @NotNull
    public final List<RespRateEventItem> getItems() {
        return this.items;
    }

    @Nullable
    public final RespRateEventItem getNext() {
        return this.next;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        RespRateEventItem respRateEventItem = this.next;
        return iHashCode + (respRateEventItem == null ? 0 : respRateEventItem.hashCode());
    }

    @NotNull
    public String toString() {
        return "RespRateUserEvents(items=" + this.items + ", next=" + this.next + ')';
    }

    public /* synthetic */ RespRateUserEvents(List list, RespRateEventItem respRateEventItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : respRateEventItem);
    }
}
