package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.item.GradePredictionItem;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\"\u001a\u00020#H\u0016J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010*\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010!¨\u00060"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "latestItem", "Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "itemList", "", "gradePredictionItem", "Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;", "<init>", "(JLjava/lang/String;Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;Ljava/util/List;Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "getLatestItem", "()Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "setLatestItem", "(Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;)V", "getItemList", "()Ljava/util/List;", "getGradePredictionItem", "()Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;", "setGradePredictionItem", "(Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;)V", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "isEmpty", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyRunningIndicatorReport extends DailyBasicReport {

    @Nullable
    private GradePredictionItem gradePredictionItem;

    @Nullable
    private final List<RunningIndicatorItem> itemList;

    @Nullable
    private RunningIndicatorItem latestItem;

    @Nullable
    private String sid;

    @NotNull
    private final String tag;
    private long time;

    public /* synthetic */ DailyRunningIndicatorReport(long j, String str, RunningIndicatorItem runningIndicatorItem, List list, GradePredictionItem gradePredictionItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? "days" : str, (i & 4) != 0 ? null : runningIndicatorItem, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : gradePredictionItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyRunningIndicatorReport copy$default(DailyRunningIndicatorReport dailyRunningIndicatorReport, long j, String str, RunningIndicatorItem runningIndicatorItem, List list, GradePredictionItem gradePredictionItem, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyRunningIndicatorReport.time;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = dailyRunningIndicatorReport.tag;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            runningIndicatorItem = dailyRunningIndicatorReport.latestItem;
        }
        RunningIndicatorItem runningIndicatorItem2 = runningIndicatorItem;
        if ((i & 8) != 0) {
            list = dailyRunningIndicatorReport.itemList;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            gradePredictionItem = dailyRunningIndicatorReport.gradePredictionItem;
        }
        return dailyRunningIndicatorReport.copy(j2, str2, runningIndicatorItem2, list2, gradePredictionItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RunningIndicatorItem getLatestItem() {
        return this.latestItem;
    }

    @Nullable
    public final List<RunningIndicatorItem> component4() {
        return this.itemList;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GradePredictionItem getGradePredictionItem() {
        return this.gradePredictionItem;
    }

    @NotNull
    public final DailyRunningIndicatorReport copy(long time, @NotNull String tag, @Nullable RunningIndicatorItem latestItem, @Nullable List<RunningIndicatorItem> itemList, @Nullable GradePredictionItem gradePredictionItem) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DailyRunningIndicatorReport(time, tag, latestItem, itemList, gradePredictionItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyRunningIndicatorReport)) {
            return false;
        }
        DailyRunningIndicatorReport dailyRunningIndicatorReport = (DailyRunningIndicatorReport) other;
        return this.time == dailyRunningIndicatorReport.time && Intrinsics.areEqual(this.tag, dailyRunningIndicatorReport.tag) && Intrinsics.areEqual(this.latestItem, dailyRunningIndicatorReport.latestItem) && Intrinsics.areEqual(this.itemList, dailyRunningIndicatorReport.itemList) && Intrinsics.areEqual(this.gradePredictionItem, dailyRunningIndicatorReport.gradePredictionItem);
    }

    @Nullable
    public final GradePredictionItem getGradePredictionItem() {
        return this.gradePredictionItem;
    }

    @Nullable
    public final List<RunningIndicatorItem> getItemList() {
        return this.itemList;
    }

    @Nullable
    public final RunningIndicatorItem getLatestItem() {
        return this.latestItem;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.time) * 31) + this.tag.hashCode()) * 31;
        RunningIndicatorItem runningIndicatorItem = this.latestItem;
        int iHashCode2 = (iHashCode + (runningIndicatorItem == null ? 0 : runningIndicatorItem.hashCode())) * 31;
        List<RunningIndicatorItem> list = this.itemList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        GradePredictionItem gradePredictionItem = this.gradePredictionItem;
        return iHashCode3 + (gradePredictionItem != null ? gradePredictionItem.hashCode() : 0);
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<RunningIndicatorItem> list = this.itemList;
        return list == null || list.isEmpty();
    }

    public final void setGradePredictionItem(@Nullable GradePredictionItem gradePredictionItem) {
        this.gradePredictionItem = gradePredictionItem;
    }

    public final void setLatestItem(@Nullable RunningIndicatorItem runningIndicatorItem) {
        this.latestItem = runningIndicatorItem;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "DailyRunningIndicatorReport(time=" + this.time + ", tag=" + this.tag + ", latestItem=" + this.latestItem + ", itemList=" + this.itemList + ", gradePredictionItem=" + this.gradePredictionItem + ")";
    }

    public DailyRunningIndicatorReport(long j, @NotNull String tag, @Nullable RunningIndicatorItem runningIndicatorItem, @Nullable List<RunningIndicatorItem> list, @Nullable GradePredictionItem gradePredictionItem) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.latestItem = runningIndicatorItem;
        this.itemList = list;
        this.gradePredictionItem = gradePredictionItem;
        this.sid = "default";
    }
}
