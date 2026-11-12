package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/TrainingSportReportInfo;", "Ljava/io/Serializable;", "reports", "", "Lcom/xiaomi/fitness/training_plan_export/model/SportReportItem;", "hasMore", "", "nextKey", "", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "getReports", "()Ljava/util/List;", "getHasMore", "()Z", "getNextKey", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrainingSportReportInfo implements Serializable {

    @SerializedName("has_more")
    private final boolean hasMore;

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    @NotNull
    private final String nextKey;

    @SerializedName("sport_record_list")
    @Nullable
    private final List<SportReportItem> reports;

    public TrainingSportReportInfo(@Nullable List<SportReportItem> list, boolean z, @NotNull String nextKey) {
        Intrinsics.checkNotNullParameter(nextKey, "nextKey");
        this.reports = list;
        this.hasMore = z;
        this.nextKey = nextKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrainingSportReportInfo copy$default(TrainingSportReportInfo trainingSportReportInfo, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = trainingSportReportInfo.reports;
        }
        if ((i & 2) != 0) {
            z = trainingSportReportInfo.hasMore;
        }
        if ((i & 4) != 0) {
            str = trainingSportReportInfo.nextKey;
        }
        return trainingSportReportInfo.copy(list, z, str);
    }

    @Nullable
    public final List<SportReportItem> component1() {
        return this.reports;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public final TrainingSportReportInfo copy(@Nullable List<SportReportItem> reports, boolean hasMore, @NotNull String nextKey) {
        Intrinsics.checkNotNullParameter(nextKey, "nextKey");
        return new TrainingSportReportInfo(reports, hasMore, nextKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingSportReportInfo)) {
            return false;
        }
        TrainingSportReportInfo trainingSportReportInfo = (TrainingSportReportInfo) other;
        return Intrinsics.areEqual(this.reports, trainingSportReportInfo.reports) && this.hasMore == trainingSportReportInfo.hasMore && Intrinsics.areEqual(this.nextKey, trainingSportReportInfo.nextKey);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final String getNextKey() {
        return this.nextKey;
    }

    @Nullable
    public final List<SportReportItem> getReports() {
        return this.reports;
    }

    public int hashCode() {
        List<SportReportItem> list = this.reports;
        return ((((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.hasMore)) * 31) + this.nextKey.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrainingSportReportInfo(reports=" + this.reports + ", hasMore=" + this.hasMore + ", nextKey=" + this.nextKey + ")";
    }
}
