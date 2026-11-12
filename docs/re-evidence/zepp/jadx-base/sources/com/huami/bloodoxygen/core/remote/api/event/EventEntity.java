package com.huami.bloodoxygen.core.remote.api.event;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/api/event/EventEntity;", "", "Ljava/util/ArrayList;", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "items", "Ljava/util/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "next", "Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "getNext", "()Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;", "<init>", "(Ljava/util/ArrayList;Lcom/huami/bloodoxygen/core/remote/api/event/EventItem;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class EventEntity {

    @NotNull
    private final ArrayList<EventItem> items;

    @Nullable
    private final EventItem next;

    public EventEntity(@NotNull ArrayList<EventItem> arrayList, @Nullable EventItem eventItem) {
        this.items = arrayList;
        this.next = eventItem;
    }

    @NotNull
    public final ArrayList<EventItem> getItems() {
        return this.items;
    }

    @Nullable
    public final EventItem getNext() {
        return this.next;
    }

    public /* synthetic */ EventEntity(ArrayList arrayList, EventItem eventItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i & 2) != 0 ? null : eventItem);
    }
}
