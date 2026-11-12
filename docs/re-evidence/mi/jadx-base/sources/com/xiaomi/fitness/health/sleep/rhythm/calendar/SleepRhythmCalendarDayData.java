package com.xiaomi.fitness.health.sleep.rhythm.calendar;

import com.xiaomi.fit.fitness.export.data.annotation.SleepRhythmAndDiaryRecordStatus;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/calendar/SleepRhythmCalendarDayData;", "", "time", "", "type", "", "<init>", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getType", "()I", "setType", "(I)V", "rhythmInfo", "Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "getRhythmInfo", "()Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;", "setRhythmInfo", "(Lcom/xiaomi/fit/fitness/export/data/project/SleepRhythmReport;)V", "setRhythm", "", "info", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepRhythmCalendarDayData {

    @Nullable
    private SleepRhythmReport rhythmInfo;
    private long time;
    private int type;

    public SleepRhythmCalendarDayData(long j, @SleepRhythmAndDiaryRecordStatus int i) {
        this.time = j;
        this.type = i;
    }

    public static /* synthetic */ SleepRhythmCalendarDayData copy$default(SleepRhythmCalendarDayData sleepRhythmCalendarDayData, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = sleepRhythmCalendarDayData.time;
        }
        if ((i2 & 2) != 0) {
            i = sleepRhythmCalendarDayData.type;
        }
        return sleepRhythmCalendarDayData.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final SleepRhythmCalendarDayData copy(long time, @SleepRhythmAndDiaryRecordStatus int type) {
        return new SleepRhythmCalendarDayData(time, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepRhythmCalendarDayData)) {
            return false;
        }
        SleepRhythmCalendarDayData sleepRhythmCalendarDayData = (SleepRhythmCalendarDayData) other;
        return this.time == sleepRhythmCalendarDayData.time && this.type == sleepRhythmCalendarDayData.type;
    }

    @Nullable
    public final SleepRhythmReport getRhythmInfo() {
        return this.rhythmInfo;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.type);
    }

    public final void setRhythm(@NotNull SleepRhythmReport info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.rhythmInfo = info;
    }

    public final void setRhythmInfo(@Nullable SleepRhythmReport sleepRhythmReport) {
        this.rhythmInfo = sleepRhythmReport;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "SleepRhythmCalendarDayData(time=" + this.time + ", type=" + this.type + ")";
    }

    public /* synthetic */ SleepRhythmCalendarDayData(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? 0 : i);
    }
}
