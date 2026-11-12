package com.xiaomi.fit.data.common.data.sport;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\u0005R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006)"}, d2 = {"Lcom/xiaomi/fit/data/common/data/sport/OneSkiGlide;", "", "pathType", "", "<init>", "(I)V", "getPathType", "()I", "duration", "getDuration", "setDuration", "distance", "getDistance", "setDistance", "maxSpeed", "", "getMaxSpeed", "()Ljava/lang/Float;", "setMaxSpeed", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "avgSpeed", "getAvgSpeed", "setAvgSpeed", "skiSlope", "getSkiSlope", "()Ljava/lang/Integer;", "setSkiSlope", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "avgHr", "getAvgHr", "setAvgHr", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OneSkiGlide {

    @Nullable
    private Integer avgHr;

    @Nullable
    private Float avgSpeed;
    private int distance;
    private int duration;

    @Nullable
    private Float maxSpeed;
    private final int pathType;

    @Nullable
    private Integer skiSlope;

    public OneSkiGlide(int i) {
        this.pathType = i;
    }

    public static /* synthetic */ OneSkiGlide copy$default(OneSkiGlide oneSkiGlide, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oneSkiGlide.pathType;
        }
        return oneSkiGlide.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPathType() {
        return this.pathType;
    }

    @NotNull
    public final OneSkiGlide copy(int pathType) {
        return new OneSkiGlide(pathType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OneSkiGlide) && this.pathType == ((OneSkiGlide) other).pathType;
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Float getAvgSpeed() {
        return this.avgSpeed;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final Float getMaxSpeed() {
        return this.maxSpeed;
    }

    public final int getPathType() {
        return this.pathType;
    }

    @Nullable
    public final Integer getSkiSlope() {
        return this.skiSlope;
    }

    public int hashCode() {
        return Integer.hashCode(this.pathType);
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setAvgSpeed(@Nullable Float f) {
        this.avgSpeed = f;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setMaxSpeed(@Nullable Float f) {
        this.maxSpeed = f;
    }

    public final void setSkiSlope(@Nullable Integer num) {
        this.skiSlope = num;
    }

    @NotNull
    public String toString() {
        return "OneSkiGlide(pathType=" + this.pathType + ")";
    }
}
