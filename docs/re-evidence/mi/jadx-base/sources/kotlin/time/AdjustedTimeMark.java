package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
final class AdjustedTimeMark implements TimeMark {
    private final long adjustment;

    @NotNull
    private final TimeMark mark;

    public /* synthetic */ AdjustedTimeMark(TimeMark timeMark, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j);
    }

    @Override // kotlin.time.TimeMark
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public long mo2231elapsedNowUwyO8pc() {
        return Duration.m2269minusLRDsOJo(this.mark.mo2231elapsedNowUwyO8pc(), this.adjustment);
    }

    /* JADX INFO: renamed from: getAdjustment-UwyO8pc, reason: not valid java name */
    public final long m2235getAdjustmentUwyO8pc() {
        return this.adjustment;
    }

    @NotNull
    public final TimeMark getMark() {
        return this.mark;
    }

    @Override // kotlin.time.TimeMark
    public boolean hasNotPassedNow() {
        return TimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    public boolean hasPassedNow() {
        return TimeMark.DefaultImpls.hasPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    public TimeMark mo2232minusLRDsOJo(long j) {
        return TimeMark.DefaultImpls.m2348minusLRDsOJo(this, j);
    }

    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public TimeMark mo2234plusLRDsOJo(long j) {
        return new AdjustedTimeMark(this.mark, Duration.m2270plusLRDsOJo(this.adjustment, j), null);
    }

    private AdjustedTimeMark(TimeMark mark, long j) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.mark = mark;
        this.adjustment = j;
    }
}
