package com.xiaomi.hm.health.step.stage.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/model/StageInfo;", "", "", "component1", "component2", "component3", "component4", "component5", "time", "count", "dis", "step", "cal", "copy", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getTime", "()I", "getCount", "getDis", "getStep", "getCal", "<init>", "(IIIII)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StageInfo {
    private final int cal;
    private final int count;
    private final int dis;
    private final int step;
    private final int time;

    public StageInfo(int i, int i2, int i3, int i4, int i5) {
        this.time = i;
        this.count = i2;
        this.dis = i3;
        this.step = i4;
        this.cal = i5;
    }

    public static /* synthetic */ StageInfo copy$default(StageInfo stageInfo, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = stageInfo.time;
        }
        if ((i6 & 2) != 0) {
            i2 = stageInfo.count;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = stageInfo.dis;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = stageInfo.step;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = stageInfo.cal;
        }
        return stageInfo.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDis() {
        return this.dis;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCal() {
        return this.cal;
    }

    @NotNull
    public final StageInfo copy(int time, int count, int dis, int step, int cal) {
        return new StageInfo(time, count, dis, step, cal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageInfo)) {
            return false;
        }
        StageInfo stageInfo = (StageInfo) other;
        return this.time == stageInfo.time && this.count == stageInfo.count && this.dis == stageInfo.dis && this.step == stageInfo.step && this.cal == stageInfo.cal;
    }

    public final int getCal() {
        return this.cal;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDis() {
        return this.dis;
    }

    public final int getStep() {
        return this.step;
    }

    public final int getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((((this.time * 31) + this.count) * 31) + this.dis) * 31) + this.step) * 31) + this.cal;
    }

    @NotNull
    public String toString() {
        return "StageInfo(time=" + this.time + ", count=" + this.count + ", dis=" + this.dis + ", step=" + this.step + ", cal=" + this.cal + ")";
    }
}
