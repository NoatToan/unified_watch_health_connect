package com.xiaomi.hm.health.dataprocess;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/ModifySleepData;", "", StatConstants.PARAM_START, "", BroadcastsKt.SILENT_PUSHING_STOP, "(II)V", "getStart", "()I", "getStop", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "dataprocess_release"}, k = 1, mv = {1, 1, 13})
public final /* data */ class ModifySleepData {
    private final int start;
    private final int stop;

    public ModifySleepData(int i, int i2) {
        this.start = i;
        this.stop = i2;
    }

    @NotNull
    public static /* synthetic */ ModifySleepData copy$default(ModifySleepData modifySleepData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = modifySleepData.start;
        }
        if ((i3 & 2) != 0) {
            i2 = modifySleepData.stop;
        }
        return modifySleepData.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStop() {
        return this.stop;
    }

    @NotNull
    public final ModifySleepData copy(int start, int stop) {
        return new ModifySleepData(start, stop);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModifySleepData)) {
            return false;
        }
        ModifySleepData modifySleepData = (ModifySleepData) other;
        return this.start == modifySleepData.start && this.stop == modifySleepData.stop;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getStop() {
        return this.stop;
    }

    public int hashCode() {
        return (this.start * 31) + this.stop;
    }

    @NotNull
    public String toString() {
        return "ModifySleepData(start=" + this.start + ", stop=" + this.stop + ")";
    }
}
