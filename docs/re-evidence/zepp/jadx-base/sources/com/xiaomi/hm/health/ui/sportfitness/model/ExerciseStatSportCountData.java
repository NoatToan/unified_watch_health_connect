package com.xiaomi.hm.health.ui.sportfitness.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/ui/sportfitness/model/ExerciseStatSportCountData;", "", "", "component1", "", "component2", "count", "type", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getCount", "()J", "setCount", "(J)V", "b", LogUtil.I, "getType", "()I", "setType", "(I)V", "<init>", "(JI)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ExerciseStatSportCountData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private long count;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private int type;

    public ExerciseStatSportCountData(long j, int i) {
        this.count = j;
        this.type = i;
    }

    public static /* synthetic */ ExerciseStatSportCountData copy$default(ExerciseStatSportCountData exerciseStatSportCountData, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = exerciseStatSportCountData.count;
        }
        if ((i2 & 2) != 0) {
            i = exerciseStatSportCountData.type;
        }
        return exerciseStatSportCountData.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final ExerciseStatSportCountData copy(long count, int type) {
        return new ExerciseStatSportCountData(count, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseStatSportCountData)) {
            return false;
        }
        ExerciseStatSportCountData exerciseStatSportCountData = (ExerciseStatSportCountData) other;
        return this.count == exerciseStatSportCountData.count && this.type == exerciseStatSportCountData.type;
    }

    public final long getCount() {
        return this.count;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (b.a(this.count) * 31) + this.type;
    }

    public final void setCount(long j) {
        this.count = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "ExerciseStatSportCountData(count=" + this.count + ", type=" + this.type + ")";
    }
}
