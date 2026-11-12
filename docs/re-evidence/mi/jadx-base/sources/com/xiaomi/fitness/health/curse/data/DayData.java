package com.xiaomi.fitness.health.curse.data;

import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010&\u001a\u00020'H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/curse/data/DayData;", "", "time", "", "periodId", "", "inIndex", "inDays", "cycle", "<init>", "(JIIII)V", "getTime", "()J", "setTime", "(J)V", "getPeriodId", "()I", "setPeriodId", "(I)V", "getInIndex", "setInIndex", "getInDays", "setInDays", "getCycle", "setCycle", "record", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "getRecord", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "setRecord", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;)V", "isIn", "", "isFirstDay", "isEndDay", "setDaysIn", "", "period", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DayData {
    private int cycle;
    private int inDays;
    private int inIndex;
    private int periodId;

    @Nullable
    private Record record;
    private long time;

    public DayData(long j, int i, int i2, int i3, int i4) {
        this.time = j;
        this.periodId = i;
        this.inIndex = i2;
        this.inDays = i3;
        this.cycle = i4;
    }

    public final int getCycle() {
        return this.cycle;
    }

    public final int getInDays() {
        return this.inDays;
    }

    public final int getInIndex() {
        return this.inIndex;
    }

    public final int getPeriodId() {
        return this.periodId;
    }

    @Nullable
    public final Record getRecord() {
        return this.record;
    }

    public final long getTime() {
        return this.time;
    }

    public final boolean isEndDay() {
        return isIn() && this.inIndex == this.inDays;
    }

    public final boolean isFirstDay() {
        return this.inIndex == 1;
    }

    public final boolean isIn() {
        return this.inIndex > 0;
    }

    public final void setCycle(int i) {
        this.cycle = i;
    }

    public final void setDaysIn(@NotNull Record period, int inIndex) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.record = period;
        this.periodId = period.getId();
        this.inIndex = inIndex;
        this.inDays = CurseRecordKt.getInDays(period);
        this.cycle = period.getInterval();
    }

    public final void setInDays(int i) {
        this.inDays = i;
    }

    public final void setInIndex(int i) {
        this.inIndex = i;
    }

    public final void setPeriodId(int i) {
        this.periodId = i;
    }

    public final void setRecord(@Nullable Record record) {
        this.record = record;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "DayData(time=" + new LocalDate(this.time) + ", periodId='" + this.periodId + "', inIndex=" + this.inIndex + ", inDays=" + this.inDays + ")";
    }

    public /* synthetic */ DayData(long j, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }
}
