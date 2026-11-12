package com.huami.heartrate.ui;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0003J#\u0010\u0007\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R)\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/huami/heartrate/ui/ListData;", "Lcom/huami/heartrate/ui/HistoryViewTypeData;", "Ljava/util/ArrayList;", "Lcom/huami/heartrate/ui/HistoryListValueData;", "Lkotlin/collections/ArrayList;", "component1", "list", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/util/ArrayList;", "getList", "()Ljava/util/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ListData extends HistoryViewTypeData {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<HistoryListValueData> list;

    public ListData(@NotNull ArrayList<HistoryListValueData> arrayList) {
        super(ViewType.LIST, null);
        this.list = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListData copy$default(ListData listData, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = listData.list;
        }
        return listData.copy(arrayList);
    }

    @NotNull
    public final ArrayList<HistoryListValueData> component1() {
        return this.list;
    }

    @NotNull
    public final ListData copy(@NotNull ArrayList<HistoryListValueData> list) {
        return new ListData(list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ListData) && Intrinsics.areEqual(this.list, ((ListData) other).list);
    }

    @NotNull
    public final ArrayList<HistoryListValueData> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    @NotNull
    public String toString() {
        return "ListData(list=" + this.list + ")";
    }
}
