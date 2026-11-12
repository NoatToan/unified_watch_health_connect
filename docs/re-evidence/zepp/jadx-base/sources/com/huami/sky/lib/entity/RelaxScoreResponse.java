package com.huami.sky.lib.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R!\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/sky/lib/entity/RelaxScoreResponse;", "", "", "Lcom/huami/sky/lib/entity/RelaxInfo;", "component1", "items", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RelaxScoreResponse {

    @Nullable
    private final List<RelaxInfo> items;

    public RelaxScoreResponse(@Nullable List<RelaxInfo> list) {
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RelaxScoreResponse copy$default(RelaxScoreResponse relaxScoreResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = relaxScoreResponse.items;
        }
        return relaxScoreResponse.copy(list);
    }

    @Nullable
    public final List<RelaxInfo> component1() {
        return this.items;
    }

    @NotNull
    public final RelaxScoreResponse copy(@Nullable List<RelaxInfo> items) {
        return new RelaxScoreResponse(items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RelaxScoreResponse) && Intrinsics.areEqual(this.items, ((RelaxScoreResponse) other).items);
    }

    @Nullable
    public final List<RelaxInfo> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<RelaxInfo> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "RelaxScoreResponse(items=" + this.items + ")";
    }
}
