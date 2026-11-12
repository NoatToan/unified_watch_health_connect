package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEcgReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "latestItem", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "getLatestItem", "()Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "setLatestItem", "(Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;)V", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "isEmpty", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyEcgReport extends DailyBasicReport {

    @Nullable
    private EcgMedicalItemReport latestItem;

    @Nullable
    private String sid;

    @NotNull
    private final String tag;
    private long time;

    public /* synthetic */ DailyEcgReport(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? "days" : str);
    }

    public static /* synthetic */ DailyEcgReport copy$default(DailyEcgReport dailyEcgReport, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyEcgReport.time;
        }
        if ((i & 2) != 0) {
            str = dailyEcgReport.tag;
        }
        return dailyEcgReport.copy(j, str);
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

    @NotNull
    public final DailyEcgReport copy(long time, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DailyEcgReport(time, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyEcgReport)) {
            return false;
        }
        DailyEcgReport dailyEcgReport = (DailyEcgReport) other;
        return this.time == dailyEcgReport.time && Intrinsics.areEqual(this.tag, dailyEcgReport.tag);
    }

    @Nullable
    public final EcgMedicalItemReport getLatestItem() {
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
        return (Long.hashCode(this.time) * 31) + this.tag.hashCode();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        return this.latestItem == null;
    }

    public final void setLatestItem(@Nullable EcgMedicalItemReport ecgMedicalItemReport) {
        this.latestItem = ecgMedicalItemReport;
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
        return "DailyEcgReport(time=" + this.time + ", tag=" + this.tag + ")";
    }

    public DailyEcgReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = "default";
    }
}
