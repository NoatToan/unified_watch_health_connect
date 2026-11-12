package com.huami.userproperty.entity;

import com.huami.userproperty.service.entity.remote.FetchResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0002`\u00060\u00040\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0002`\u00060\u00040\u0002HÆ\u0003J7\u0010\t\u001a\u00020\u00002,\b\u0002\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0002`\u00060\u00040\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R=\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0002`\u00060\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R7\u0010\u0016\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0002`\u00060\u00140\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R7\u0010\u0019\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0002`\u00060\u00170\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u001a\u001a\u00020\u000e8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/userproperty/entity/BatchFetchResult;", "", "", "Lcom/huami/userproperty/entity/AbsFetchParams;", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "Lcom/huami/userproperty/entity/RawResult;", "component1", "resultItems", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/Map;", "getResultItems", "()Ljava/util/Map;", "Lcom/huami/userproperty/service/entity/remote/FetchResult$Success;", "getSuccessItems", "successItems", "Lcom/huami/userproperty/service/entity/remote/FetchResult$Failed;", "getFailedItems", "failedItems", "isSuccess", "()Z", "<init>", "(Ljava/util/Map;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BatchFetchResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Map<AbsFetchParams, FetchResult<Map<String, String>>> resultItems;

    /* JADX WARN: Multi-variable type inference failed */
    public BatchFetchResult(@NotNull Map<AbsFetchParams, ? extends FetchResult<Map<String, String>>> map) {
        this.resultItems = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchFetchResult copy$default(BatchFetchResult batchFetchResult, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = batchFetchResult.resultItems;
        }
        return batchFetchResult.copy(map);
    }

    @NotNull
    public final Map<AbsFetchParams, FetchResult<Map<String, String>>> component1() {
        return this.resultItems;
    }

    @NotNull
    public final BatchFetchResult copy(@NotNull Map<AbsFetchParams, ? extends FetchResult<Map<String, String>>> resultItems) {
        return new BatchFetchResult(resultItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BatchFetchResult) && Intrinsics.areEqual(this.resultItems, ((BatchFetchResult) other).resultItems);
    }

    @NotNull
    public final Map<AbsFetchParams, FetchResult.Failed<Map<String, String>>> getFailedItems() {
        Map<AbsFetchParams, FetchResult<Map<String, String>>> map = this.resultItems;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<AbsFetchParams, FetchResult<Map<String, String>>> entry : map.entrySet()) {
            if (entry.getValue() instanceof FetchResult.Failed) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(TuplesKt.to(entry2.getKey(), (FetchResult.Failed) entry2.getValue()));
        }
        return r.toMap(arrayList);
    }

    @NotNull
    public final Map<AbsFetchParams, FetchResult<Map<String, String>>> getResultItems() {
        return this.resultItems;
    }

    @NotNull
    public final Map<AbsFetchParams, FetchResult.Success<Map<String, String>>> getSuccessItems() {
        Map<AbsFetchParams, FetchResult<Map<String, String>>> map = this.resultItems;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<AbsFetchParams, FetchResult<Map<String, String>>> entry : map.entrySet()) {
            if (entry.getValue() instanceof FetchResult.Success) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(TuplesKt.to(entry2.getKey(), (FetchResult.Success) entry2.getValue()));
        }
        return r.toMap(arrayList);
    }

    public int hashCode() {
        return this.resultItems.hashCode();
    }

    public final boolean isSuccess() {
        return getFailedItems().isEmpty();
    }

    @NotNull
    public String toString() {
        return "BatchFetchResult(resultItems=" + this.resultItems + ')';
    }
}
