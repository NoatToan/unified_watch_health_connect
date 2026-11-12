package com.xiaomi.fit.fitness.export.data.aggregation;

import android.text.TextUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0010J\u0006\u0010/\u001a\u00020\bJ\u0006\u00100\u001a\u00020\bJ\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\bH\u0016J\b\u00104\u001a\u000202H\u0016J\b\u00105\u001a\u00020\u0006H\u0016J\b\u00106\u001a\u00020\u0006H\u0016J\t\u00107\u001a\u00020\u0004HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JK\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010>\u001a\u0002022\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010.¨\u0006B"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/IRainbowSourceData;", "time", "", "tag", "", "steps", "", "distance", "calories", "stepRecords", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/StepRecord;", "<init>", "(JLjava/lang/String;IIILjava/util/List;)V", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "getSteps", "()I", "getDistance", "getCalories", "getStepRecords", "()Ljava/util/List;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "minStartTime", "getMinStartTime", "()Ljava/lang/Long;", "setMinStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "maxEndTime", "getMaxEndTime", "setMaxEndTime", "activeStageList", "Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "getActiveStageList", "setActiveStageList", "(Ljava/util/List;)V", "getAvgStepsPerDay", "getAvgDistancePerDay", "isEmpty", "", "getSourceData", "isValidate", "simpleInfo", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyStepReport extends DailyBasicReport implements IRainbowSourceData {

    /* JADX INFO: renamed from: activeStageList, reason: from kotlin metadata and from toString */
    @Nullable
    private List<ActiveStageItem> active;
    private final int calories;
    private final int distance;

    @Nullable
    private Long maxEndTime;

    @Nullable
    private Long minStartTime;

    @Nullable
    private String sid;

    @NotNull
    private final List<StepRecord> stepRecords;
    private final int steps;

    @NotNull
    private final String tag;
    private long time;

    public DailyStepReport(long j, @NotNull String tag, int i, int i2, int i3, @NotNull List<StepRecord> stepRecords) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stepRecords, "stepRecords");
        this.time = j;
        this.tag = tag;
        this.steps = i;
        this.distance = i2;
        this.calories = i3;
        this.stepRecords = stepRecords;
        this.sid = "default";
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    @NotNull
    public final List<StepRecord> component6() {
        return this.stepRecords;
    }

    @NotNull
    public final DailyStepReport copy(long time, @NotNull String tag, int steps, int distance, int calories, @NotNull List<StepRecord> stepRecords) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(stepRecords, "stepRecords");
        return new DailyStepReport(time, tag, steps, distance, calories, stepRecords);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyStepReport)) {
            return false;
        }
        DailyStepReport dailyStepReport = (DailyStepReport) other;
        return this.time == dailyStepReport.time && Intrinsics.areEqual(this.tag, dailyStepReport.tag) && this.steps == dailyStepReport.steps && this.distance == dailyStepReport.distance && this.calories == dailyStepReport.calories && Intrinsics.areEqual(this.stepRecords, dailyStepReport.stepRecords);
    }

    @Nullable
    public final List<ActiveStageItem> getActiveStageList() {
        return this.active;
    }

    public final int getAvgDistancePerDay() {
        return (TextUtils.equals(getTag(), "days") || this.stepRecords.isEmpty()) ? this.distance : this.distance / this.stepRecords.size();
    }

    public final int getAvgStepsPerDay() {
        return (TextUtils.equals(getTag(), "days") || this.stepRecords.isEmpty()) ? this.steps : this.steps / this.stepRecords.size();
    }

    public final int getCalories() {
        return this.calories;
    }

    public final int getDistance() {
        return this.distance;
    }

    @Nullable
    public final Long getMaxEndTime() {
        return this.maxEndTime;
    }

    @Nullable
    public final Long getMinStartTime() {
        return this.minStartTime;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.IRainbowSourceData
    public int getSourceData() {
        return this.steps;
    }

    @NotNull
    public final List<StepRecord> getStepRecords() {
        return this.stepRecords;
    }

    public final int getSteps() {
        return this.steps;
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
        return (((((((((Long.hashCode(this.time) * 31) + this.tag.hashCode()) * 31) + Integer.hashCode(this.steps)) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.calories)) * 31) + this.stepRecords.hashCode();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<StepRecord> list = this.stepRecords;
        return list == null || list.isEmpty();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.IRainbowSourceData
    public boolean isValidate() {
        return !isEmpty();
    }

    public final void setActiveStageList(@Nullable List<ActiveStageItem> list) {
        this.active = list;
    }

    public final void setMaxEndTime(@Nullable Long l) {
        this.maxEndTime = l;
    }

    public final void setMinStartTime(@Nullable Long l) {
        this.minStartTime = l;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String simpleInfo() {
        return "DailyStepReport[time=" + getTime() + ", steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + "]";
    }

    @NotNull
    public String toString() {
        return "DailyStepReport(time=" + getTime() + ", time = " + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", tag='" + getTag() + "', steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + ", minStartTime=" + this.minStartTime + ", maxEndTime=" + this.maxEndTime + ", avgStep=" + getAvgStepsPerDay() + ", avgDis=" + getAvgDistancePerDay() + ", active=" + this.active + ", stepRecords=" + this.stepRecords + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DailyStepReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        this(j, tag, 0, 0, 0, listEmptyList);
    }
}
