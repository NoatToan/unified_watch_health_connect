package com.xiaomi.fitness.sync.export.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sync/export/model/PressureItems;", "", "fxTime", "", "seaLevelPressure", "", "<init>", "(JF)V", "getFxTime", "()J", "getSeaLevelPressure", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sync-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PressureItems {
    private final long fxTime;
    private final float seaLevelPressure;

    public PressureItems(long j, float f) {
        this.fxTime = j;
        this.seaLevelPressure = f;
    }

    public static /* synthetic */ PressureItems copy$default(PressureItems pressureItems, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pressureItems.fxTime;
        }
        if ((i & 2) != 0) {
            f = pressureItems.seaLevelPressure;
        }
        return pressureItems.copy(j, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getFxTime() {
        return this.fxTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSeaLevelPressure() {
        return this.seaLevelPressure;
    }

    @NotNull
    public final PressureItems copy(long fxTime, float seaLevelPressure) {
        return new PressureItems(fxTime, seaLevelPressure);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PressureItems)) {
            return false;
        }
        PressureItems pressureItems = (PressureItems) other;
        return this.fxTime == pressureItems.fxTime && Float.compare(this.seaLevelPressure, pressureItems.seaLevelPressure) == 0;
    }

    public final long getFxTime() {
        return this.fxTime;
    }

    public final float getSeaLevelPressure() {
        return this.seaLevelPressure;
    }

    public int hashCode() {
        return (Long.hashCode(this.fxTime) * 31) + Float.hashCode(this.seaLevelPressure);
    }

    @NotNull
    public String toString() {
        return "PressureItems(fxTime=" + this.fxTime + ", seaLevelPressure=" + this.seaLevelPressure + ")";
    }
}
