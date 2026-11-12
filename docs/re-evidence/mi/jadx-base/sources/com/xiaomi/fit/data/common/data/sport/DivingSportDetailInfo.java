package com.xiaomi.fit.data.common.data.sport;

import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u001d\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010/\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0011HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010 \u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\u001e\u0010#\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001e\u0010&\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR\u001e\u0010)\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001b¨\u00064"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/DivingSportDetailInfo;", "", "startTime", "", "outDiving", "", "<init>", "(JZ)V", "getStartTime", "()J", "getOutDiving", "()Z", "endTime", "getEndTime", "setEndTime", "(J)V", "duration", "", "getDuration", "()I", "setDuration", "(I)V", FitnessReportKey.maxDivingDepth, "", "getMaxDivingDepth", "()Ljava/lang/Float;", "setMaxDivingDepth", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", FitnessReportKey.avgDivingDepth, "getAvgDivingDepth", "setAvgDivingDepth", FitnessRecordKey.avgTemperature, "getAvgTemperature", "setAvgTemperature", FitnessRecordKey.minTemperature, "getMinTemperature", "setMinTemperature", "avgUpSpeed", "getAvgUpSpeed", "setAvgUpSpeed", "avgDownSpeed", "getAvgDownSpeed", "setAvgDownSpeed", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DivingSportDetailInfo {

    @Nullable
    private Float avgDivingDepth;

    @Nullable
    private Float avgDownSpeed;

    @Nullable
    private Float avgTemperature;

    @Nullable
    private Float avgUpSpeed;
    private int duration;
    private long endTime;

    @Nullable
    private Float maxDivingDepth;

    @Nullable
    private Float minTemperature;
    private final boolean outDiving;
    private final long startTime;

    public DivingSportDetailInfo(long j, boolean z) {
        this.startTime = j;
        this.outDiving = z;
    }

    public static /* synthetic */ DivingSportDetailInfo copy$default(DivingSportDetailInfo divingSportDetailInfo, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = divingSportDetailInfo.startTime;
        }
        if ((i & 2) != 0) {
            z = divingSportDetailInfo.outDiving;
        }
        return divingSportDetailInfo.copy(j, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getOutDiving() {
        return this.outDiving;
    }

    @NotNull
    public final DivingSportDetailInfo copy(long startTime, boolean outDiving) {
        return new DivingSportDetailInfo(startTime, outDiving);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivingSportDetailInfo)) {
            return false;
        }
        DivingSportDetailInfo divingSportDetailInfo = (DivingSportDetailInfo) other;
        return this.startTime == divingSportDetailInfo.startTime && this.outDiving == divingSportDetailInfo.outDiving;
    }

    @Nullable
    public final Float getAvgDivingDepth() {
        return this.avgDivingDepth;
    }

    @Nullable
    public final Float getAvgDownSpeed() {
        return this.avgDownSpeed;
    }

    @Nullable
    public final Float getAvgTemperature() {
        return this.avgTemperature;
    }

    @Nullable
    public final Float getAvgUpSpeed() {
        return this.avgUpSpeed;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final Float getMaxDivingDepth() {
        return this.maxDivingDepth;
    }

    @Nullable
    public final Float getMinTemperature() {
        return this.minTemperature;
    }

    public final boolean getOutDiving() {
        return this.outDiving;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Boolean.hashCode(this.outDiving);
    }

    public final void setAvgDivingDepth(@Nullable Float f) {
        this.avgDivingDepth = f;
    }

    public final void setAvgDownSpeed(@Nullable Float f) {
        this.avgDownSpeed = f;
    }

    public final void setAvgTemperature(@Nullable Float f) {
        this.avgTemperature = f;
    }

    public final void setAvgUpSpeed(@Nullable Float f) {
        this.avgUpSpeed = f;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setMaxDivingDepth(@Nullable Float f) {
        this.maxDivingDepth = f;
    }

    public final void setMinTemperature(@Nullable Float f) {
        this.minTemperature = f;
    }

    @NotNull
    public String toString() {
        return "DivingSportDetailInfo(startTime=" + this.startTime + ", outDiving=" + this.outDiving + ")";
    }
}
