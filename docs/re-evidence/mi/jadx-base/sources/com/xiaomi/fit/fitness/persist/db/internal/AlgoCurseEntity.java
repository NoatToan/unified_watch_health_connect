package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Entity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"id"}, tableName = "algo_curse")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/AlgoCurseEntity;", "", "id", "", "startTime", "", "endTime", "ovulationTime", "cursePeriod", "menstrualPeriod", "status", "<init>", "(IJJJIII)V", "getId", "()I", "getStartTime", "()J", "getEndTime", "getOvulationTime", "getCursePeriod", "getMenstrualPeriod", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AlgoCurseEntity {
    private final int cursePeriod;
    private final long endTime;
    private final int id;
    private final int menstrualPeriod;
    private final long ovulationTime;
    private final long startTime;
    private final int status;

    public AlgoCurseEntity(int i, long j, long j2, long j3, int i2, int i3, int i4) {
        this.id = i;
        this.startTime = j;
        this.endTime = j2;
        this.ovulationTime = j3;
        this.cursePeriod = i2;
        this.menstrualPeriod = i3;
        this.status = i4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getOvulationTime() {
        return this.ovulationTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCursePeriod() {
        return this.cursePeriod;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final AlgoCurseEntity copy(int id, long startTime, long endTime, long ovulationTime, int cursePeriod, int menstrualPeriod, int status) {
        return new AlgoCurseEntity(id, startTime, endTime, ovulationTime, cursePeriod, menstrualPeriod, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlgoCurseEntity)) {
            return false;
        }
        AlgoCurseEntity algoCurseEntity = (AlgoCurseEntity) other;
        return this.id == algoCurseEntity.id && this.startTime == algoCurseEntity.startTime && this.endTime == algoCurseEntity.endTime && this.ovulationTime == algoCurseEntity.ovulationTime && this.cursePeriod == algoCurseEntity.cursePeriod && this.menstrualPeriod == algoCurseEntity.menstrualPeriod && this.status == algoCurseEntity.status;
    }

    public final int getCursePeriod() {
        return this.cursePeriod;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getId() {
        return this.id;
    }

    public final int getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    public final long getOvulationTime() {
        return this.ovulationTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + Long.hashCode(this.ovulationTime)) * 31) + Integer.hashCode(this.cursePeriod)) * 31) + Integer.hashCode(this.menstrualPeriod)) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "AlgoCurseEntity(id=" + this.id + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", ovulationTime=" + this.ovulationTime + ", cursePeriod=" + this.cursePeriod + ", menstrualPeriod=" + this.menstrualPeriod + ", status=" + this.status + ")";
    }
}
