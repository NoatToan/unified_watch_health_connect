package com.xiaomi.fit.fitness.export.data.project;

import com.xiaomi.fit.fitness.export.data.ITimeData;
import com.xiaomi.fit.fitness.export.data.annotation.SleepRhythmType;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\u0007J\b\u0010&\u001a\u00020\u0013H\u0016J\b\u0010'\u001a\u00020\u0007H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\t\u0010.\u001a\u00020\u0004HÆ\u0003J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J'\u00101\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u00102\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "Lcom/xiaomi/fit/fitness/export/data/ITimeData;", "Ljava/io/Serializable;", "type", "", "cycleDay", "time", "", "<init>", "(IIJ)V", "getType", "()I", "setType", "(I)V", "getCycleDay", "setCycleDay", "getTime", "()J", "sid", "", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "dbTime", "getDbTime", "()Ljava/lang/Long;", "setDbTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "dbZoneOffset", "getDbZoneOffset", "()Ljava/lang/Integer;", "setDbZoneOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEndTime", "getDBEndTime", "toString", "getTimestamp", "setTimestamp", "", "equals", "", "other", "", "component1", "component2", "component3", "copy", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepRhythmReport implements ITimeData, Serializable {
    private int cycleDay;

    @Nullable
    private Long dbTime;

    @Nullable
    private Integer dbZoneOffset;

    @Nullable
    private String sid;
    private final long time;
    private int type;

    public SleepRhythmReport(@SleepRhythmType int i, int i2, long j) {
        this.type = i;
        this.cycleDay = i2;
        this.time = j;
    }

    public static /* synthetic */ SleepRhythmReport copy$default(SleepRhythmReport sleepRhythmReport, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sleepRhythmReport.type;
        }
        if ((i3 & 2) != 0) {
            i2 = sleepRhythmReport.cycleDay;
        }
        if ((i3 & 4) != 0) {
            j = sleepRhythmReport.time;
        }
        return sleepRhythmReport.copy(i, i2, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCycleDay() {
        return this.cycleDay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final SleepRhythmReport copy(@SleepRhythmType int type, int cycleDay, long time) {
        return new SleepRhythmReport(type, cycleDay, time);
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof SleepRhythmReport)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        SleepRhythmReport sleepRhythmReport = (SleepRhythmReport) other;
        return this.type == sleepRhythmReport.type && this.time == sleepRhythmReport.time;
    }

    public final int getCycleDay() {
        return this.cycleDay;
    }

    public final long getDBEndTime() {
        Long l = this.dbTime;
        return (l != null ? l.longValue() : this.time) + TimeUnit.DAYS.toSeconds(this.cycleDay);
    }

    @Nullable
    public final Long getDbTime() {
        return this.dbTime;
    }

    @Nullable
    public final Integer getDbZoneOffset() {
        return this.dbZoneOffset;
    }

    public final long getEndTime() {
        return this.time + TimeUnit.DAYS.toSeconds(((long) this.cycleDay) - 1);
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.cycleDay)) * 31) + Long.hashCode(this.time);
    }

    public final void setCycleDay(int i) {
        this.cycleDay = i;
    }

    public final void setDbTime(@Nullable Long l) {
        this.dbTime = l;
    }

    public final void setDbZoneOffset(@Nullable Integer num) {
        this.dbZoneOffset = num;
    }

    public final void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "SleepRhythmReport{type=" + this.type + ", cycleDay=" + this.cycleDay + ", time = " + this.time + " , endTime = " + getEndTime() + "}";
    }
}
