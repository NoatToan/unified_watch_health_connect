package com.xiaomi.fit.data.common.data.sport;

import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\u001d\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0005HÖ\u0001J\t\u0010G\u001a\u00020HHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010(\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019R\u001e\u0010+\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&R\u001e\u0010.\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R\u001e\u00101\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R\u001e\u00104\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u0010\u0019R\u001e\u00107\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b8\u0010$\"\u0004\b9\u0010&R\u001e\u0010:\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b;\u0010\u0017\"\u0004\b<\u0010\u0019R\u001e\u0010=\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b>\u0010\u0017\"\u0004\b?\u0010\u0019¨\u0006I"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/ITSportDetailInfo;", "", "startTime", "", "sportState", "", "<init>", "(JI)V", "getStartTime", "()J", "getSportState", "()I", "setSportState", "(I)V", "endTime", "getEndTime", "setEndTime", "(J)V", "duration", "getDuration", "setDuration", "count", "getCount", "()Ljava/lang/Integer;", FitnessReportKey.setCount, "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "calories", "getCalories", "setCalories", "avgHr", "getAvgHr", "setAvgHr", "distance", "", "getDistance", "()Ljava/lang/Float;", "setDistance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", FitnessReportKey.maxPace, "getMaxPace", "setMaxPace", "totalUpHeight", "getTotalUpHeight", "setTotalUpHeight", "maxHr", "getMaxHr", "setMaxHr", "totalSteps", "getTotalSteps", "setTotalSteps", FitnessReportKey.avgPace, "getAvgPace", "setAvgPace", "avgSpeed", "getAvgSpeed", "setAvgSpeed", "swolf", "getSwolf", "setSwolf", "actionCount", "getActionCount", "setActionCount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ITSportDetailInfo {

    @Nullable
    private Integer actionCount;

    @Nullable
    private Integer avgHr;

    @Nullable
    private Integer avgPace;

    @Nullable
    private Float avgSpeed;

    @Nullable
    private Integer calories;

    @Nullable
    private Integer count;

    @Nullable
    private Float distance;
    private long duration;
    private long endTime;

    @Nullable
    private Integer maxHr;

    @Nullable
    private Integer maxPace;
    private int sportState;
    private final long startTime;

    @Nullable
    private Integer swolf;

    @Nullable
    private Integer totalSteps;

    @Nullable
    private Float totalUpHeight;

    public ITSportDetailInfo(long j, @ITSportTrainingState int i) {
        this.startTime = j;
        this.sportState = i;
    }

    public static /* synthetic */ ITSportDetailInfo copy$default(ITSportDetailInfo iTSportDetailInfo, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = iTSportDetailInfo.startTime;
        }
        if ((i2 & 2) != 0) {
            i = iTSportDetailInfo.sportState;
        }
        return iTSportDetailInfo.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSportState() {
        return this.sportState;
    }

    @NotNull
    public final ITSportDetailInfo copy(long startTime, @ITSportTrainingState int sportState) {
        return new ITSportDetailInfo(startTime, sportState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ITSportDetailInfo)) {
            return false;
        }
        ITSportDetailInfo iTSportDetailInfo = (ITSportDetailInfo) other;
        return this.startTime == iTSportDetailInfo.startTime && this.sportState == iTSportDetailInfo.sportState;
    }

    @Nullable
    public final Integer getActionCount() {
        return this.actionCount;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Integer getAvgPace() {
        return this.avgPace;
    }

    @Nullable
    public final Float getAvgSpeed() {
        return this.avgSpeed;
    }

    @Nullable
    public final Integer getCalories() {
        return this.calories;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final Float getDistance() {
        return this.distance;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    public final Integer getMaxPace() {
        return this.maxPace;
    }

    public final int getSportState() {
        return this.sportState;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Integer getSwolf() {
        return this.swolf;
    }

    @Nullable
    public final Integer getTotalSteps() {
        return this.totalSteps;
    }

    @Nullable
    public final Float getTotalUpHeight() {
        return this.totalUpHeight;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Integer.hashCode(this.sportState);
    }

    public final void setActionCount(@Nullable Integer num) {
        this.actionCount = num;
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setAvgPace(@Nullable Integer num) {
        this.avgPace = num;
    }

    public final void setAvgSpeed(@Nullable Float f) {
        this.avgSpeed = f;
    }

    public final void setCalories(@Nullable Integer num) {
        this.calories = num;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    public final void setDistance(@Nullable Float f) {
        this.distance = f;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setMaxHr(@Nullable Integer num) {
        this.maxHr = num;
    }

    public final void setMaxPace(@Nullable Integer num) {
        this.maxPace = num;
    }

    public final void setSportState(int i) {
        this.sportState = i;
    }

    public final void setSwolf(@Nullable Integer num) {
        this.swolf = num;
    }

    public final void setTotalSteps(@Nullable Integer num) {
        this.totalSteps = num;
    }

    public final void setTotalUpHeight(@Nullable Float f) {
        this.totalUpHeight = f;
    }

    @NotNull
    public String toString() {
        return "ITSportDetailInfo(startTime=" + this.startTime + ", sportState=" + this.sportState + ")";
    }
}
