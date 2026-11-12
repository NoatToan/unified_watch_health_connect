package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordFloat;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u0005H\u0016J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u001d\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010;\u001a\u0002062\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001a\u0010%\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001a\u0010(\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001a\u0010+\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\u001a\u0010.\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\"\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018¨\u0006@"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "skinTempRecords", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordFloat;", "getSkinTempRecords", "()Ljava/util/List;", "setSkinTempRecords", "(Ljava/util/List;)V", "bodyTempRecords", "getBodyTempRecords", "setBodyTempRecords", "avgSkinTemp", "", "getAvgSkinTemp", "()F", "setAvgSkinTemp", "(F)V", "maxSkinTemp", "getMaxSkinTemp", "setMaxSkinTemp", "minSkinTemp", "getMinSkinTemp", "setMinSkinTemp", "avgBodyTemp", "getAvgBodyTemp", "setAvgBodyTemp", "maxBodyTemp", "getMaxBodyTemp", "setMaxBodyTemp", "minBodyTemp", "getMinBodyTemp", "setMinBodyTemp", "dailyAllTempDatas", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "getDailyAllTempDatas", "setDailyAllTempDatas", "isEmpty", "", "toString", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyTempReport extends DailyBasicReport {
    private float avgBodyTemp;
    private float avgSkinTemp;

    @Nullable
    private List<TimesDataRecordFloat> bodyTempRecords;

    @Nullable
    private List<TemperatureItem> dailyAllTempDatas;
    private float maxBodyTemp;
    private float maxSkinTemp;
    private float minBodyTemp;
    private float minSkinTemp;

    @Nullable
    private String sid;

    @Nullable
    private List<TimesDataRecordFloat> skinTempRecords;

    @NotNull
    private final String tag;
    private long time;

    public DailyTempReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = "default";
    }

    public static /* synthetic */ DailyTempReport copy$default(DailyTempReport dailyTempReport, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyTempReport.time;
        }
        if ((i & 2) != 0) {
            str = dailyTempReport.tag;
        }
        return dailyTempReport.copy(j, str);
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
    public final DailyTempReport copy(long time, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DailyTempReport(time, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyTempReport)) {
            return false;
        }
        DailyTempReport dailyTempReport = (DailyTempReport) other;
        return this.time == dailyTempReport.time && Intrinsics.areEqual(this.tag, dailyTempReport.tag);
    }

    public final float getAvgBodyTemp() {
        return this.avgBodyTemp;
    }

    public final float getAvgSkinTemp() {
        return this.avgSkinTemp;
    }

    @Nullable
    public final List<TimesDataRecordFloat> getBodyTempRecords() {
        return this.bodyTempRecords;
    }

    @Nullable
    public final List<TemperatureItem> getDailyAllTempDatas() {
        return this.dailyAllTempDatas;
    }

    public final float getMaxBodyTemp() {
        return this.maxBodyTemp;
    }

    public final float getMaxSkinTemp() {
        return this.maxSkinTemp;
    }

    public final float getMinBodyTemp() {
        return this.minBodyTemp;
    }

    public final float getMinSkinTemp() {
        return this.minSkinTemp;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Nullable
    public final List<TimesDataRecordFloat> getSkinTempRecords() {
        return this.skinTempRecords;
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
        List<TimesDataRecordFloat> list = this.skinTempRecords;
        boolean zIsEmpty = list != null ? list.isEmpty() : true;
        List<TimesDataRecordFloat> list2 = this.bodyTempRecords;
        return (list2 == null || list2.isEmpty()) && zIsEmpty;
    }

    public final void setAvgBodyTemp(float f) {
        this.avgBodyTemp = f;
    }

    public final void setAvgSkinTemp(float f) {
        this.avgSkinTemp = f;
    }

    public final void setBodyTempRecords(@Nullable List<TimesDataRecordFloat> list) {
        this.bodyTempRecords = list;
    }

    public final void setDailyAllTempDatas(@Nullable List<TemperatureItem> list) {
        this.dailyAllTempDatas = list;
    }

    public final void setMaxBodyTemp(float f) {
        this.maxBodyTemp = f;
    }

    public final void setMaxSkinTemp(float f) {
        this.maxSkinTemp = f;
    }

    public final void setMinBodyTemp(float f) {
        this.minBodyTemp = f;
    }

    public final void setMinSkinTemp(float f) {
        this.minSkinTemp = f;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setSkinTempRecords(@Nullable List<TimesDataRecordFloat> list) {
        this.skinTempRecords = list;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "DailyTempReport(time=" + getTime() + ", tag='" + getTag() + "', sid=" + getSid() + ", skinTempRecords=" + this.skinTempRecords + ", bodyTempRecords=" + this.bodyTempRecords + ", avgSkinTemp=" + this.avgSkinTemp + ", maxSkinTemp=" + this.maxSkinTemp + ", minSkinTemp=" + this.minSkinTemp + ", avgBodyTemp=" + this.avgBodyTemp + ", maxBodyTemp=" + this.maxBodyTemp + ", minBodyTemp=" + this.minBodyTemp + ", dailyAllTempDatas=" + this.dailyAllTempDatas + ")";
    }
}
