package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.body;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.xiaomi.fit.fitness.export.data.aggregation.DailyExtraDataReport, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006&"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyExtraDataReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "<init>", "(J)V", "getTime", "()J", "setTime", "tag", "", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "lightValueItem", "", "Lcom/xiaomi/fit/fitness/export/data/item/LightValueItem;", "getLightValueItem", "()Ljava/util/List;", "setLightValueItem", "(Ljava/util/List;)V", "bodyMomentumItem", "Lcom/xiaomi/fit/fitness/export/data/item/BodyMomentumItem;", "getBodyMomentumItem", "setBodyMomentumItem", "isEmpty", "", "toString", "component1", "copy", "equals", "other", "", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyPhysicalStatusReport extends DailyBasicReport {

    @Nullable
    private List<body> bodyMomentumItem;

    @Nullable
    private List<LightValueItem> lightValueItem;

    @Nullable
    private String sid = "default";
    private long time;

    public DailyPhysicalStatusReport(long j) {
        this.time = j;
    }

    public static /* synthetic */ DailyPhysicalStatusReport copy$default(DailyPhysicalStatusReport dailyPhysicalStatusReport, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyPhysicalStatusReport.time;
        }
        return dailyPhysicalStatusReport.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final DailyPhysicalStatusReport copy(long time) {
        return new DailyPhysicalStatusReport(time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DailyPhysicalStatusReport) && this.time == ((DailyPhysicalStatusReport) other).time;
    }

    @Nullable
    public final List<body> getBodyMomentumItem() {
        return this.bodyMomentumItem;
    }

    @Nullable
    public final List<LightValueItem> getLightValueItem() {
        return this.lightValueItem;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String getTag() {
        return "days";
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time);
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<body> list;
        List<LightValueItem> list2 = this.lightValueItem;
        return (list2 == null || list2.isEmpty()) && ((list = this.bodyMomentumItem) == null || list.isEmpty());
    }

    public final void setBodyMomentumItem(@Nullable List<body> list) {
        this.bodyMomentumItem = list;
    }

    public final void setLightValueItem(@Nullable List<LightValueItem> list) {
        this.lightValueItem = list;
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
        return "DailyPhysicalStatusReport(time=" + getTime() + ", sid=" + getSid() + ", lightValueItem=" + this.lightValueItem + ")";
    }
}
