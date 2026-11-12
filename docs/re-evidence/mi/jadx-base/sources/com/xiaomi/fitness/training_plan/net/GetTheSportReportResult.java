package com.xiaomi.fitness.training_plan.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import com.xiaomi.fitness.training_plan_export.model.SportKey;
import com.xiaomi.fitness.training_plan_export.model.SportReportItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/GetTheSportReportResult;", "", "reports", "", "Lcom/xiaomi/fitness/training_plan_export/model/SportReportItem;", "hasMore", "", "sportKey", "Lcom/xiaomi/fitness/training_plan_export/model/SportKey;", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/xiaomi/fitness/training_plan_export/model/SportKey;)V", "getReports", "()Ljava/util/List;", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSportKey", "()Lcom/xiaomi/fitness/training_plan_export/model/SportKey;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/xiaomi/fitness/training_plan_export/model/SportKey;)Lcom/xiaomi/fitness/training_plan/net/GetTheSportReportResult;", "equals", "other", "hashCode", "", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetTheSportReportResult {

    @SerializedName("has_more")
    @Nullable
    private final Boolean hasMore;

    @SerializedName("record_list")
    @Nullable
    private final List<SportReportItem> reports;

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    @Nullable
    private final SportKey sportKey;

    public GetTheSportReportResult(@Nullable List<SportReportItem> list, @Nullable Boolean bool, @Nullable SportKey sportKey) {
        this.reports = list;
        this.hasMore = bool;
        this.sportKey = sportKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetTheSportReportResult copy$default(GetTheSportReportResult getTheSportReportResult, List list, Boolean bool, SportKey sportKey, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getTheSportReportResult.reports;
        }
        if ((i & 2) != 0) {
            bool = getTheSportReportResult.hasMore;
        }
        if ((i & 4) != 0) {
            sportKey = getTheSportReportResult.sportKey;
        }
        return getTheSportReportResult.copy(list, bool, sportKey);
    }

    @Nullable
    public final List<SportReportItem> component1() {
        return this.reports;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SportKey getSportKey() {
        return this.sportKey;
    }

    @NotNull
    public final GetTheSportReportResult copy(@Nullable List<SportReportItem> reports, @Nullable Boolean hasMore, @Nullable SportKey sportKey) {
        return new GetTheSportReportResult(reports, hasMore, sportKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTheSportReportResult)) {
            return false;
        }
        GetTheSportReportResult getTheSportReportResult = (GetTheSportReportResult) other;
        return Intrinsics.areEqual(this.reports, getTheSportReportResult.reports) && Intrinsics.areEqual(this.hasMore, getTheSportReportResult.hasMore) && Intrinsics.areEqual(this.sportKey, getTheSportReportResult.sportKey);
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final List<SportReportItem> getReports() {
        return this.reports;
    }

    @Nullable
    public final SportKey getSportKey() {
        return this.sportKey;
    }

    public int hashCode() {
        List<SportReportItem> list = this.reports;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        SportKey sportKey = this.sportKey;
        return iHashCode2 + (sportKey != null ? sportKey.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetTheSportReportResult(reports=" + this.reports + ", hasMore=" + this.hasMore + ", sportKey=" + this.sportKey + ")";
    }
}
