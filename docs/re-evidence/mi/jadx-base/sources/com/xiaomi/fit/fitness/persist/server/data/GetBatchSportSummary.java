package com.xiaomi.fit.fitness.persist.server.data;

import com.xiaomi.fit.data.common.data.sport.SportSummary;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetBatchSportSummary;", "", "key_list", "", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary$SummaryKey;", "<init>", "(Ljava/util/List;)V", "getKey_list", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetBatchSportSummary {

    @NotNull
    private final List<SportSummary.SummaryKey> key_list;

    /* JADX WARN: Multi-variable type inference failed */
    public GetBatchSportSummary(@NotNull List<? extends SportSummary.SummaryKey> key_list) {
        Intrinsics.checkNotNullParameter(key_list, "key_list");
        this.key_list = key_list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetBatchSportSummary copy$default(GetBatchSportSummary getBatchSportSummary, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getBatchSportSummary.key_list;
        }
        return getBatchSportSummary.copy(list);
    }

    @NotNull
    public final List<SportSummary.SummaryKey> component1() {
        return this.key_list;
    }

    @NotNull
    public final GetBatchSportSummary copy(@NotNull List<? extends SportSummary.SummaryKey> key_list) {
        Intrinsics.checkNotNullParameter(key_list, "key_list");
        return new GetBatchSportSummary(key_list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetBatchSportSummary) && Intrinsics.areEqual(this.key_list, ((GetBatchSportSummary) other).key_list);
    }

    @NotNull
    public final List<SportSummary.SummaryKey> getKey_list() {
        return this.key_list;
    }

    public int hashCode() {
        return this.key_list.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetBatchSportSummary(key_list=" + this.key_list + ")";
    }
}
