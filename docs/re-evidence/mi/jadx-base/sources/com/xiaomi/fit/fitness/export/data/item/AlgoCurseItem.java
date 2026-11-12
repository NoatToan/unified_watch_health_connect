package com.xiaomi.fit.fitness.export.data.item;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/AlgoCurseItem;", "Ljava/io/Serializable;", "id", "", "startTime", "endTime", "ovulationTime", "cursePeriod", "menstrualPeriod", "status", "<init>", "(IIIIIII)V", "getId", "()I", "getStartTime", "getEndTime", "getOvulationTime", "getCursePeriod", "getMenstrualPeriod", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AlgoCurseItem implements Serializable {
    private final int cursePeriod;
    private final int endTime;
    private final int id;
    private final int menstrualPeriod;
    private final int ovulationTime;
    private final int startTime;
    private final int status;

    public AlgoCurseItem(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.id = i;
        this.startTime = i2;
        this.endTime = i3;
        this.ovulationTime = i4;
        this.cursePeriod = i5;
        this.menstrualPeriod = i6;
        this.status = i7;
    }

    public static /* synthetic */ AlgoCurseItem copy$default(AlgoCurseItem algoCurseItem, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = algoCurseItem.id;
        }
        if ((i8 & 2) != 0) {
            i2 = algoCurseItem.startTime;
        }
        int i9 = i2;
        if ((i8 & 4) != 0) {
            i3 = algoCurseItem.endTime;
        }
        int i10 = i3;
        if ((i8 & 8) != 0) {
            i4 = algoCurseItem.ovulationTime;
        }
        int i11 = i4;
        if ((i8 & 16) != 0) {
            i5 = algoCurseItem.cursePeriod;
        }
        int i12 = i5;
        if ((i8 & 32) != 0) {
            i6 = algoCurseItem.menstrualPeriod;
        }
        int i13 = i6;
        if ((i8 & 64) != 0) {
            i7 = algoCurseItem.status;
        }
        return algoCurseItem.copy(i, i9, i10, i11, i12, i13, i7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOvulationTime() {
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
    public final AlgoCurseItem copy(int id, int startTime, int endTime, int ovulationTime, int cursePeriod, int menstrualPeriod, int status) {
        return new AlgoCurseItem(id, startTime, endTime, ovulationTime, cursePeriod, menstrualPeriod, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlgoCurseItem)) {
            return false;
        }
        AlgoCurseItem algoCurseItem = (AlgoCurseItem) other;
        return this.id == algoCurseItem.id && this.startTime == algoCurseItem.startTime && this.endTime == algoCurseItem.endTime && this.ovulationTime == algoCurseItem.ovulationTime && this.cursePeriod == algoCurseItem.cursePeriod && this.menstrualPeriod == algoCurseItem.menstrualPeriod && this.status == algoCurseItem.status;
    }

    public final int getCursePeriod() {
        return this.cursePeriod;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getId() {
        return this.id;
    }

    public final int getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    public final int getOvulationTime() {
        return this.ovulationTime;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.startTime)) * 31) + Integer.hashCode(this.endTime)) * 31) + Integer.hashCode(this.ovulationTime)) * 31) + Integer.hashCode(this.cursePeriod)) * 31) + Integer.hashCode(this.menstrualPeriod)) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "AlgoCurseItem(id=" + this.id + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", ovulationTime=" + this.ovulationTime + ", cursePeriod=" + this.cursePeriod + ", menstrualPeriod=" + this.menstrualPeriod + ", status=" + this.status + ")";
    }
}
