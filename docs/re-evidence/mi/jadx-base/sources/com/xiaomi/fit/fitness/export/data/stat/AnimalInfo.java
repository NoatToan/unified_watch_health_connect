package com.xiaomi.fit.fitness.export.data.stat;

import com.xiaomi.fit.fitness.export.data.annotation.SleepAnimalType;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/stat/AnimalInfo;", "Ljava/io/Serializable;", "type", "", "startTime", "", "endTime", "updateTime", "<init>", "(IJJJ)V", "getType", "()I", "getStartTime", "()J", "getEndTime", "getUpdateTime", "toString", "", "equals", "", "other", "", "component1", "component2", "component3", "component4", "copy", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AnimalInfo implements Serializable {

    /* JADX INFO: renamed from: endTime, reason: from kotlin metadata and from toString */
    private final long end;
    private final long startTime;
    private final int type;
    private final long updateTime;

    public AnimalInfo(@SleepAnimalType int i, long j, long j2, long j3) {
        this.type = i;
        this.startTime = j;
        this.end = j2;
        this.updateTime = j3;
    }

    public static /* synthetic */ AnimalInfo copy$default(AnimalInfo animalInfo, int i, long j, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = animalInfo.type;
        }
        if ((i2 & 2) != 0) {
            j = animalInfo.startTime;
        }
        long j4 = j;
        if ((i2 & 4) != 0) {
            j2 = animalInfo.end;
        }
        long j5 = j2;
        if ((i2 & 8) != 0) {
            j3 = animalInfo.updateTime;
        }
        return animalInfo.copy(i, j4, j5, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final AnimalInfo copy(@SleepAnimalType int type, long startTime, long endTime, long updateTime) {
        return new AnimalInfo(type, startTime, endTime, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof AnimalInfo)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        AnimalInfo animalInfo = (AnimalInfo) other;
        return this.type == animalInfo.type && this.startTime == animalInfo.startTime && this.end == animalInfo.end;
    }

    public final long getEndTime() {
        return this.end;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.type) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.end)) * 31) + Long.hashCode(this.updateTime);
    }

    @NotNull
    public String toString() {
        return "{type=" + this.type + ", startTime=" + this.startTime + ", end=" + this.end + ", updateTime=" + this.updateTime + "}";
    }
}
