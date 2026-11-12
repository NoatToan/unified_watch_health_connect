package com.huami.femalehealth.uilib.adapter;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000e\u0010$¨\u0006'"}, d2 = {"Lcom/huami/femalehealth/uilib/adapter/DetailSummaryVo;", "Lcom/huami/femalehealth/uilib/adapter/HistoryDetailVo;", "", "component1", "component2", "", "component3", "component4", "", "component5", "cycle", TypedValues.CycleType.S_WAVE_PERIOD, "start", "end", "isEnd", "copy", "", "toString", "hashCode", "", "other", "equals", "a", LogUtil.I, "getCycle", "()I", "b", "getPeriod", "c", "J", "getStart", "()J", GoogleApiAvailabilityLight.a, "getEnd", "e", "Z", "()Z", "<init>", "(IIJJZ)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DetailSummaryVo extends HistoryDetailVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int cycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int period;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long start;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long end;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean isEnd;

    public DetailSummaryVo(int i, int i2, long j, long j2, boolean z) {
        super(null);
        this.cycle = i;
        this.period = i2;
        this.start = j;
        this.end = j2;
        this.isEnd = z;
    }

    public static /* synthetic */ DetailSummaryVo copy$default(DetailSummaryVo detailSummaryVo, int i, int i2, long j, long j2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = detailSummaryVo.cycle;
        }
        if ((i3 & 2) != 0) {
            i2 = detailSummaryVo.period;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            j = detailSummaryVo.start;
        }
        long j3 = j;
        if ((i3 & 8) != 0) {
            j2 = detailSummaryVo.end;
        }
        long j4 = j2;
        if ((i3 & 16) != 0) {
            z = detailSummaryVo.isEnd;
        }
        return detailSummaryVo.copy(i, i4, j3, j4, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCycle() {
        return this.cycle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsEnd() {
        return this.isEnd;
    }

    @NotNull
    public final DetailSummaryVo copy(int cycle, int period, long start, long end, boolean isEnd) {
        return new DetailSummaryVo(cycle, period, start, end, isEnd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailSummaryVo)) {
            return false;
        }
        DetailSummaryVo detailSummaryVo = (DetailSummaryVo) other;
        return this.cycle == detailSummaryVo.cycle && this.period == detailSummaryVo.period && this.start == detailSummaryVo.start && this.end == detailSummaryVo.end && this.isEnd == detailSummaryVo.isEnd;
    }

    public final int getCycle() {
        return this.cycle;
    }

    public final long getEnd() {
        return this.end;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final long getStart() {
        return this.start;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iA = ((((((this.cycle * 31) + this.period) * 31) + b.a(this.start)) * 31) + b.a(this.end)) * 31;
        boolean z = this.isEnd;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final boolean isEnd() {
        return this.isEnd;
    }

    @NotNull
    public String toString() {
        return "DetailSummaryVo(cycle=" + this.cycle + ", period=" + this.period + ", start=" + this.start + ", end=" + this.end + ", isEnd=" + this.isEnd + ')';
    }
}
