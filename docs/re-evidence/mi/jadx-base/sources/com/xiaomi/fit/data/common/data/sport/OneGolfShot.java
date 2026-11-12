package com.xiaomi.fit.data.common.data.sport;

import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u001d\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\u001e\u0010!\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019¨\u0006-"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/OneGolfShot;", "", "startTime", "", "endTime", "<init>", "(JJ)V", "getStartTime", "()J", "getEndTime", StepsInfo.KEY_CALORIES, "", "getCal", "()Ljava/lang/Integer;", "setCal", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "totalCal", "getTotalCal", "setTotalCal", "backSwingDuration", "", "getBackSwingDuration", "()Ljava/lang/Float;", "setBackSwingDuration", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "downSwingDuration", "getDownSwingDuration", "setDownSwingDuration", FitnessRecordKey.swingRhythm, "getSwingRhythm", "setSwingRhythm", FitnessRecordKey.swingSpeed, "getSwingSpeed", "setSwingSpeed", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OneGolfShot {

    @Nullable
    private Float backSwingDuration;

    @Nullable
    private Integer cal;

    @Nullable
    private Float downSwingDuration;
    private final long endTime;
    private final long startTime;

    @Nullable
    private Float swingRhythm;

    @Nullable
    private Float swingSpeed;

    @Nullable
    private Integer totalCal;

    public OneGolfShot(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public static /* synthetic */ OneGolfShot copy$default(OneGolfShot oneGolfShot, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = oneGolfShot.startTime;
        }
        if ((i & 2) != 0) {
            j2 = oneGolfShot.endTime;
        }
        return oneGolfShot.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final OneGolfShot copy(long startTime, long endTime) {
        return new OneGolfShot(startTime, endTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneGolfShot)) {
            return false;
        }
        OneGolfShot oneGolfShot = (OneGolfShot) other;
        return this.startTime == oneGolfShot.startTime && this.endTime == oneGolfShot.endTime;
    }

    @Nullable
    public final Float getBackSwingDuration() {
        return this.backSwingDuration;
    }

    @Nullable
    public final Integer getCal() {
        return this.cal;
    }

    @Nullable
    public final Float getDownSwingDuration() {
        return this.downSwingDuration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Float getSwingRhythm() {
        return this.swingRhythm;
    }

    @Nullable
    public final Float getSwingSpeed() {
        return this.swingSpeed;
    }

    @Nullable
    public final Integer getTotalCal() {
        return this.totalCal;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime);
    }

    public final void setBackSwingDuration(@Nullable Float f) {
        this.backSwingDuration = f;
    }

    public final void setCal(@Nullable Integer num) {
        this.cal = num;
    }

    public final void setDownSwingDuration(@Nullable Float f) {
        this.downSwingDuration = f;
    }

    public final void setSwingRhythm(@Nullable Float f) {
        this.swingRhythm = f;
    }

    public final void setSwingSpeed(@Nullable Float f) {
        this.swingSpeed = f;
    }

    public final void setTotalCal(@Nullable Integer num) {
        this.totalCal = num;
    }

    @NotNull
    public String toString() {
        return "OneGolfShot(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }
}
