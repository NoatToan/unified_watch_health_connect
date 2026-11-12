package com.huami.bloodoxygen.core.koin;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/bloodoxygen/core/koin/BoSleepPiece;", "", "", "component1", "component2", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SleepLevel;", "component3", "startTime", "endTime", FirebaseAnalytics.Param.LEVEL, "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getStartTime", "()J", "b", "getEndTime", "c", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SleepLevel;", "getLevel", "()Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SleepLevel;", "<init>", "(JJLcom/huami/bloodoxygen/core/local/config/BloodOxygen$SleepLevel;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BoSleepPiece {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long endTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final BloodOxygen.SleepLevel level;

    public BoSleepPiece(long j, long j2, @NotNull BloodOxygen.SleepLevel sleepLevel) {
        this.startTime = j;
        this.endTime = j2;
        this.level = sleepLevel;
    }

    public static /* synthetic */ BoSleepPiece copy$default(BoSleepPiece boSleepPiece, long j, long j2, BloodOxygen.SleepLevel sleepLevel, int i, Object obj) {
        if ((i & 1) != 0) {
            j = boSleepPiece.startTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = boSleepPiece.endTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            sleepLevel = boSleepPiece.level;
        }
        return boSleepPiece.copy(j3, j4, sleepLevel);
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
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BloodOxygen.SleepLevel getLevel() {
        return this.level;
    }

    @NotNull
    public final BoSleepPiece copy(long startTime, long endTime, @NotNull BloodOxygen.SleepLevel level) {
        return new BoSleepPiece(startTime, endTime, level);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoSleepPiece)) {
            return false;
        }
        BoSleepPiece boSleepPiece = (BoSleepPiece) other;
        return this.startTime == boSleepPiece.startTime && this.endTime == boSleepPiece.endTime && this.level == boSleepPiece.level;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final BloodOxygen.SleepLevel getLevel() {
        return this.level;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((b.a(this.startTime) * 31) + b.a(this.endTime)) * 31) + this.level.hashCode();
    }

    @NotNull
    public String toString() {
        return "BoSleepPiece(startTime=" + this.startTime + ", endTime=" + this.endTime + ", level=" + this.level + ")";
    }
}
