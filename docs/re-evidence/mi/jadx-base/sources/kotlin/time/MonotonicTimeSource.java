package kotlin.time;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.3")
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {

    @NotNull
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
    private static final long zero = System.nanoTime();

    private MonotonicTimeSource() {
    }

    private final long read() {
        return System.nanoTime() - zero;
    }

    /* JADX INFO: renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m2342adjustReading6QKq23U(long j, long j2) {
        return TimeSource.Monotonic.ValueTimeMark.m2354constructorimpl(LongSaturatedMathKt.m2340saturatingAddNuflL3o(j, DurationUnit.NANOSECONDS, j2));
    }

    /* JADX INFO: renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m2343differenceBetweenfRLX17w(long j, long j2) {
        return LongSaturatedMathKt.saturatingOriginsDiff(j, j2, DurationUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m2344elapsedFrom6eNON_k(long j) {
        return LongSaturatedMathKt.saturatingDiff(read(), j, DurationUnit.NANOSECONDS);
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m2351boximpl(m2345markNowz9LOYto());
    }

    /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m2345markNowz9LOYto() {
        return TimeSource.Monotonic.ValueTimeMark.m2354constructorimpl(read());
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // kotlin.time.TimeSource
    public /* bridge */ /* synthetic */ TimeMark markNow() {
        return TimeSource.Monotonic.ValueTimeMark.m2351boximpl(m2345markNowz9LOYto());
    }
}
