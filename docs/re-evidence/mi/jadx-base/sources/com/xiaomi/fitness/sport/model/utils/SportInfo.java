package com.xiaomi.fitness.sport.model.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/model/utils/SportInfo;", "", "duration", "", "distance", "calorie", "", "<init>", "(IIF)V", "getDuration", "()I", "getDistance", "getCalorie", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportInfo {
    private final float calorie;
    private final int distance;
    private final int duration;

    public SportInfo(int i, int i2, float f) {
        this.duration = i;
        this.distance = i2;
        this.calorie = f;
    }

    public static /* synthetic */ SportInfo copy$default(SportInfo sportInfo, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sportInfo.duration;
        }
        if ((i3 & 2) != 0) {
            i2 = sportInfo.distance;
        }
        if ((i3 & 4) != 0) {
            f = sportInfo.calorie;
        }
        return sportInfo.copy(i, i2, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getCalorie() {
        return this.calorie;
    }

    @NotNull
    public final SportInfo copy(int duration, int distance, float calorie) {
        return new SportInfo(duration, distance, calorie);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportInfo)) {
            return false;
        }
        SportInfo sportInfo = (SportInfo) other;
        return this.duration == sportInfo.duration && this.distance == sportInfo.distance && Float.compare(this.calorie, sportInfo.calorie) == 0;
    }

    public final float getCalorie() {
        return this.calorie;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.duration) * 31) + Integer.hashCode(this.distance)) * 31) + Float.hashCode(this.calorie);
    }

    @NotNull
    public String toString() {
        return "SportInfo(duration=" + this.duration + ", distance=" + this.distance + ", calorie=" + this.calorie + ")";
    }
}
