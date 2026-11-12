package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeSource {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    public static final class Monotonic implements WithComparableMarks {

        @NotNull
        public static final Monotonic INSTANCE = new Monotonic();

        @SinceKotlin(version = "1.9")
        @JvmInline
        @WasExperimental(markerClass = {ExperimentalTime.class})
        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j) {
                this.reading = j;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m2351boximpl(long j) {
                return new ValueTimeMark(j);
            }

            /* JADX INFO: renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m2352compareTo6eNON_k(long j, long j2) {
                return Duration.m2240compareToLRDsOJo(m2361minus6eNON_k(j, j2), Duration.Companion.m2332getZEROUwyO8pc());
            }

            /* JADX INFO: renamed from: compareTo-impl, reason: not valid java name */
            public static int m2353compareToimpl(long j, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m2351boximpl(j).compareTo(other);
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m2354constructorimpl(long j) {
                return j;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m2356equalsimpl(long j, Object obj) {
                return (obj instanceof ValueTimeMark) && j == ((ValueTimeMark) obj).m2368unboximpl();
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m2357equalsimpl0(long j, long j2) {
                return j == j2;
            }

            /* JADX INFO: renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m2358hasNotPassedNowimpl(long j) {
                return Duration.m2267isNegativeimpl(m2355elapsedNowUwyO8pc(j));
            }

            /* JADX INFO: renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m2359hasPassedNowimpl(long j) {
                return !Duration.m2267isNegativeimpl(m2355elapsedNowUwyO8pc(j));
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m2360hashCodeimpl(long j) {
                return Long.hashCode(j);
            }

            /* JADX INFO: renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m2361minus6eNON_k(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m2343differenceBetweenfRLX17w(j, j2);
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m2365toStringimpl(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public long mo2231elapsedNowUwyO8pc() {
                return m2355elapsedNowUwyO8pc(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(Object obj) {
                return m2356equalsimpl(this.reading, obj);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m2358hasNotPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m2359hasPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m2360hashCodeimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo2232minusLRDsOJo(long j) {
                return m2351boximpl(m2366minusLRDsOJo(j));
            }

            @Override // kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: minus-UwyO8pc */
            public long mo2233minusUwyO8pc(@NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m2363minusUwyO8pc(this.reading, other);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo2234plusLRDsOJo(long j) {
                return m2351boximpl(m2367plusLRDsOJo(j));
            }

            public String toString() {
                return m2365toStringimpl(this.reading);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ long m2368unboximpl() {
                return this.reading;
            }

            /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m2355elapsedNowUwyO8pc(long j) {
                return MonotonicTimeSource.INSTANCE.m2344elapsedFrom6eNON_k(j);
            }

            /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m2363minusUwyO8pc(long j, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m2361minus6eNON_k(j, ((ValueTimeMark) other).m2368unboximpl());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m2365toStringimpl(j)) + " and " + other);
            }

            @Override // java.lang.Comparable
            public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo2232minusLRDsOJo(long j) {
                return m2351boximpl(m2366minusLRDsOJo(j));
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo2234plusLRDsOJo(long j) {
                return m2351boximpl(m2367plusLRDsOJo(j));
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m2366minusLRDsOJo(long j) {
                return m2362minusLRDsOJo(this.reading, j);
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m2367plusLRDsOJo(long j) {
                return m2364plusLRDsOJo(this.reading, j);
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m2362minusLRDsOJo(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m2342adjustReading6QKq23U(j, Duration.m2285unaryMinusUwyO8pc(j2));
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m2364plusLRDsOJo(long j, long j2) {
                return MonotonicTimeSource.INSTANCE.m2342adjustReading6QKq23U(j, j2);
            }
        }

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m2351boximpl(m2350markNowz9LOYto());
        }

        /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m2350markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m2345markNowz9LOYto();
        }

        @NotNull
        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m2351boximpl(m2350markNowz9LOYto());
        }
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public interface WithComparableMarks extends TimeSource {
        @Override // kotlin.time.TimeSource
        @NotNull
        ComparableTimeMark markNow();
    }

    @NotNull
    TimeMark markNow();
}
