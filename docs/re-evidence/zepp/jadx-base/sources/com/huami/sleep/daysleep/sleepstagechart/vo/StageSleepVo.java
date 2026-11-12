package com.huami.sleep.daysleep.sleepstagechart.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/StageSleepVo;", "", "", "component1", "component2", "component3", "start", Command.STOP, "mode", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStart", "()I", "b", "getStop", "c", "getMode", "<init>", "(III)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StageSleepVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int stop;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int mode;

    public StageSleepVo(int i, int i2, int i3) {
        this.start = i;
        this.stop = i2;
        this.mode = i3;
    }

    public static /* synthetic */ StageSleepVo copy$default(StageSleepVo stageSleepVo, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = stageSleepVo.start;
        }
        if ((i4 & 2) != 0) {
            i2 = stageSleepVo.stop;
        }
        if ((i4 & 4) != 0) {
            i3 = stageSleepVo.mode;
        }
        return stageSleepVo.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStop() {
        return this.stop;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final StageSleepVo copy(int start, int stop, int mode) {
        return new StageSleepVo(start, stop, mode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageSleepVo)) {
            return false;
        }
        StageSleepVo stageSleepVo = (StageSleepVo) other;
        return this.start == stageSleepVo.start && this.stop == stageSleepVo.stop && this.mode == stageSleepVo.mode;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getStop() {
        return this.stop;
    }

    public int hashCode() {
        return (((this.start * 31) + this.stop) * 31) + this.mode;
    }

    @NotNull
    public String toString() {
        return "StageSleepVo(start=" + this.start + ", stop=" + this.stop + ", mode=" + this.mode + ")";
    }
}
