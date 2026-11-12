package com.huami.assistant.ui.v2.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleSplitItem;", "Lcom/huami/assistant/ui/v2/model/ScheduleListItemModel;", "", "a", "any", "copy", "", "toString", "", "hashCode", "other", "", "equals", "b", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScheduleSplitItem extends ScheduleListItemModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Object any;

    /* JADX WARN: Illegal instructions before constructor call */
    public ScheduleSplitItem() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public ScheduleSplitItem(@NotNull Object obj) {
        super(ScheduleListType.SPLIT.INSTANCE);
        this.any = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final Object getAny() {
        return this.any;
    }

    public static /* synthetic */ ScheduleSplitItem copy$default(ScheduleSplitItem scheduleSplitItem, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = scheduleSplitItem.any;
        }
        return scheduleSplitItem.copy(obj);
    }

    @NotNull
    public final ScheduleSplitItem copy(@NotNull Object any) {
        return new ScheduleSplitItem(any);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ScheduleSplitItem) && Intrinsics.areEqual(this.any, ((ScheduleSplitItem) other).any);
    }

    public int hashCode() {
        return this.any.hashCode();
    }

    @NotNull
    public String toString() {
        return "ScheduleSplitItem(any=" + this.any + ")";
    }

    public /* synthetic */ ScheduleSplitItem(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Object() : obj);
    }
}
