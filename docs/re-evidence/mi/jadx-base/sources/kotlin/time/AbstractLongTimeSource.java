package kotlin.time;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    @NotNull
    private final DurationUnit unit;

    @NotNull
    private final Lazy zero$delegate;

    @SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,202:1\n80#2:203\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:203\n*E\n"})
    public static final class LongTimeMark implements ComparableTimeMark {
        private final long offset;
        private final long startedAt;

        @NotNull
        private final AbstractLongTimeSource timeSource;

        public /* synthetic */ LongTimeMark(long j, AbstractLongTimeSource abstractLongTimeSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }

        @Override // kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo2231elapsedNowUwyO8pc() {
            return Duration.m2269minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(@Nullable Object obj) {
            return (obj instanceof LongTimeMark) && Intrinsics.areEqual(this.timeSource, ((LongTimeMark) obj).timeSource) && Duration.m2246equalsimpl0(mo2233minusUwyO8pc((ComparableTimeMark) obj), Duration.Companion.m2332getZEROUwyO8pc());
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return (Duration.m2262hashCodeimpl(this.offset) * 37) + Long.hashCode(this.startedAt);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo2232minusLRDsOJo(long j) {
            return ComparableTimeMark.DefaultImpls.m2236minusLRDsOJo(this, j);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc */
        public long mo2233minusUwyO8pc(@NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof LongTimeMark) {
                LongTimeMark longTimeMark = (LongTimeMark) other;
                if (Intrinsics.areEqual(this.timeSource, longTimeMark.timeSource)) {
                    return Duration.m2270plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), Duration.m2269minusLRDsOJo(this.offset, longTimeMark.offset));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @NotNull
        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m2281toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }

        private LongTimeMark(long j, AbstractLongTimeSource timeSource, long j2) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = j;
            this.timeSource = timeSource;
            this.offset = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo2234plusLRDsOJo(long j) {
            DurationUnit unit = this.timeSource.getUnit();
            if (Duration.m2266isInfiniteimpl(j)) {
                return new LongTimeMark(LongSaturatedMathKt.m2340saturatingAddNuflL3o(this.startedAt, unit, j), this.timeSource, Duration.Companion.m2332getZEROUwyO8pc(), null);
            }
            long jM2284truncateToUwyO8pc$kotlin_stdlib = Duration.m2284truncateToUwyO8pc$kotlin_stdlib(j, unit);
            long jM2270plusLRDsOJo = Duration.m2270plusLRDsOJo(Duration.m2269minusLRDsOJo(j, jM2284truncateToUwyO8pc$kotlin_stdlib), this.offset);
            long jM2340saturatingAddNuflL3o = LongSaturatedMathKt.m2340saturatingAddNuflL3o(this.startedAt, unit, jM2284truncateToUwyO8pc$kotlin_stdlib);
            long jM2284truncateToUwyO8pc$kotlin_stdlib2 = Duration.m2284truncateToUwyO8pc$kotlin_stdlib(jM2270plusLRDsOJo, unit);
            long jM2340saturatingAddNuflL3o2 = LongSaturatedMathKt.m2340saturatingAddNuflL3o(jM2340saturatingAddNuflL3o, unit, jM2284truncateToUwyO8pc$kotlin_stdlib2);
            long jM2269minusLRDsOJo = Duration.m2269minusLRDsOJo(jM2270plusLRDsOJo, jM2284truncateToUwyO8pc$kotlin_stdlib2);
            long jM2254getInWholeNanosecondsimpl = Duration.m2254getInWholeNanosecondsimpl(jM2269minusLRDsOJo);
            if (jM2340saturatingAddNuflL3o2 != 0 && jM2254getInWholeNanosecondsimpl != 0 && (jM2340saturatingAddNuflL3o2 ^ jM2254getInWholeNanosecondsimpl) < 0) {
                long duration = DurationKt.toDuration(MathKt__MathJVMKt.getSign(jM2254getInWholeNanosecondsimpl), unit);
                jM2340saturatingAddNuflL3o2 = LongSaturatedMathKt.m2340saturatingAddNuflL3o(jM2340saturatingAddNuflL3o2, unit, duration);
                jM2269minusLRDsOJo = Duration.m2269minusLRDsOJo(jM2269minusLRDsOJo, duration);
            }
            if ((1 | (jM2340saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                jM2269minusLRDsOJo = Duration.Companion.m2332getZEROUwyO8pc();
            }
            return new LongTimeMark(jM2340saturatingAddNuflL3o2, this.timeSource, jM2269minusLRDsOJo, null);
        }
    }

    public AbstractLongTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.zero$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: d10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(this.f14944a.read());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    private final long getZero() {
        return ((Number) this.zero$delegate.getValue()).longValue();
    }

    @NotNull
    public final DurationUnit getUnit() {
        return this.unit;
    }

    public abstract long read();

    @Override // kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new LongTimeMark(adjustedRead(), this, Duration.Companion.m2332getZEROUwyO8pc(), null);
    }
}
