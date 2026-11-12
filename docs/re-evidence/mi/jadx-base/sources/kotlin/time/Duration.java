package kotlin.time;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.6")
@JvmInline
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1059:1\n38#1:1060\n38#1:1061\n38#1:1062\n38#1:1063\n38#1:1064\n501#1:1065\n518#1:1073\n170#2,6:1066\n1#3:1072\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1060\n40#1:1061\n275#1:1062\n295#1:1063\n479#1:1064\n728#1:1065\n819#1:1073\n770#1:1066,6\n*E\n"})
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m2241constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m2289getDaysUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.DAYS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2291getDaysUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m2295getHoursUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.HOURS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2297getHoursUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m2301getMicrosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2303getMicrosecondsUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m2307getMillisecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2309getMillisecondsUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m2313getMinutesUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2315getMinutesUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m2319getNanosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2321getNanosecondsUwyO8pc$annotations(double d) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m2325getSecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2327getSecondsUwyO8pc$annotations(double d) {
        }

        @ExperimentalTime
        public final double convert(double d, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, sourceUnit, targetUnit);
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m2330getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m2331getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m2332getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m2333parseUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, false);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e);
            }
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m2334parseIsoStringUwyO8pc(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m2335parseIsoStringOrNullFghU774(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m2239boximpl(DurationKt.parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m2336parseOrNullFghU774(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m2239boximpl(DurationKt.parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m2290getDaysUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.DAYS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2292getDaysUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m2296getHoursUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.HOURS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2298getHoursUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m2302getMicrosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2304getMicrosecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m2308getMillisecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2310getMillisecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m2314getMinutesUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2316getMinutesUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m2320getNanosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2322getNanosecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m2326getSecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2328getSecondsUwyO8pc$annotations(int i) {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m2288getDaysUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.DAYS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2293getDaysUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m2294getHoursUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.HOURS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2299getHoursUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m2300getMicrosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2305getMicrosecondsUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m2306getMillisecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2311getMillisecondsUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m2312getMinutesUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2317getMinutesUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m2318getNanosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2323getNanosecondsUwyO8pc$annotations(long j) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m2324getSecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m2329getSecondsUwyO8pc$annotations(long j) {
        }
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m2237addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long jNanosToMillis = DurationKt.nanosToMillis(j3);
        long j4 = j2 + jNanosToMillis;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return DurationKt.durationOfMillis(RangesKt___RangesKt.coerceIn(j4, -4611686018427387903L, DurationKt.MAX_MILLIS));
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(j4) + (j3 - DurationKt.millisToNanos(jNanosToMillis)));
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m2238appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strPadStart = StringsKt__StringsKt.padStart(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strPadStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPadStart, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m2239boximpl(long j) {
        return new Duration(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2241constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m2265isInNanosimpl(j)) {
                long jM2261getValueimpl = m2261getValueimpl(j);
                if (-4611686018426999999L > jM2261getValueimpl || jM2261getValueimpl >= 4611686018427000000L) {
                    throw new AssertionError(m2261getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jM2261getValueimpl2 = m2261getValueimpl(j);
                if (-4611686018427387903L > jM2261getValueimpl2 || jM2261getValueimpl2 >= 4611686018427387904L) {
                    throw new AssertionError(m2261getValueimpl(j) + " ms is out of milliseconds range");
                }
                long jM2261getValueimpl3 = m2261getValueimpl(j);
                if (-4611686018426L <= jM2261getValueimpl3 && jM2261getValueimpl3 < 4611686018427L) {
                    throw new AssertionError(m2261getValueimpl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m2242divLRDsOJo(long j, long j2) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt___ComparisonsJvmKt.maxOf(m2259getStorageUnitimpl(j), m2259getStorageUnitimpl(j2));
        return m2277toDoubleimpl(j, durationUnit) / m2277toDoubleimpl(j2, durationUnit);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m2244divUwyO8pc(long j, int i) {
        if (i == 0) {
            if (m2268isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m2267isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m2265isInNanosimpl(j)) {
            return DurationKt.durationOfNanos(m2261getValueimpl(j) / ((long) i));
        }
        if (m2266isInfiniteimpl(j)) {
            return m2272timesUwyO8pc(j, MathKt__MathJVMKt.getSign(i));
        }
        long j2 = i;
        long jM2261getValueimpl = m2261getValueimpl(j) / j2;
        if (-4611686018426L > jM2261getValueimpl || jM2261getValueimpl >= 4611686018427L) {
            return DurationKt.durationOfMillis(jM2261getValueimpl);
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(jM2261getValueimpl) + (DurationKt.millisToNanos(m2261getValueimpl(j) - (jM2261getValueimpl * j2)) / j2));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2245equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m2287unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2246equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m2247getAbsoluteValueUwyO8pc(long j) {
        return m2267isNegativeimpl(j) ? m2285unaryMinusUwyO8pc(j) : j;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m2248getHoursComponentimpl(long j) {
        if (m2266isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m2250getInWholeHoursimpl(j) % ((long) 24));
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m2249getInWholeDaysimpl(long j) {
        return m2280toLongimpl(j, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m2250getInWholeHoursimpl(long j) {
        return m2280toLongimpl(j, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m2251getInWholeMicrosecondsimpl(long j) {
        return m2280toLongimpl(j, DurationUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m2252getInWholeMillisecondsimpl(long j) {
        return (m2264isInMillisimpl(j) && m2263isFiniteimpl(j)) ? m2261getValueimpl(j) : m2280toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m2253getInWholeMinutesimpl(long j) {
        return m2280toLongimpl(j, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m2254getInWholeNanosecondsimpl(long j) {
        long jM2261getValueimpl = m2261getValueimpl(j);
        if (m2265isInNanosimpl(j)) {
            return jM2261getValueimpl;
        }
        if (jM2261getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM2261getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.millisToNanos(jM2261getValueimpl);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m2255getInWholeSecondsimpl(long j) {
        return m2280toLongimpl(j, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m2256getMinutesComponentimpl(long j) {
        if (m2266isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m2253getInWholeMinutesimpl(j) % ((long) 60));
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m2257getNanosecondsComponentimpl(long j) {
        if (m2266isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m2264isInMillisimpl(j) ? DurationKt.millisToNanos(m2261getValueimpl(j) % ((long) 1000)) : m2261getValueimpl(j) % ((long) 1000000000));
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m2258getSecondsComponentimpl(long j) {
        if (m2266isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m2255getInWholeSecondsimpl(j) % ((long) 60));
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m2259getStorageUnitimpl(long j) {
        return m2265isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m2260getUnitDiscriminatorimpl(long j) {
        return ((int) j) & 1;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m2261getValueimpl(long j) {
        return j >> 1;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2262hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m2263isFiniteimpl(long j) {
        return !m2266isInfiniteimpl(j);
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m2264isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m2265isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m2266isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m2267isNegativeimpl(long j) {
        return j < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m2268isPositiveimpl(long j) {
        return j > 0;
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m2269minusLRDsOJo(long j, long j2) {
        return m2270plusLRDsOJo(j, m2285unaryMinusUwyO8pc(j2));
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m2270plusLRDsOJo(long j, long j2) {
        if (m2266isInfiniteimpl(j)) {
            if (m2263isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m2266isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return m2264isInMillisimpl(j) ? m2237addValuesMixedRangesUwyO8pc(j, m2261getValueimpl(j), m2261getValueimpl(j2)) : m2237addValuesMixedRangesUwyO8pc(j, m2261getValueimpl(j2), m2261getValueimpl(j));
        }
        long jM2261getValueimpl = m2261getValueimpl(j) + m2261getValueimpl(j2);
        return m2265isInNanosimpl(j) ? DurationKt.durationOfNanosNormalized(jM2261getValueimpl) : DurationKt.durationOfMillisNormalized(jM2261getValueimpl);
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m2272timesUwyO8pc(long j, int i) {
        if (m2266isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m2285unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return ZERO;
        }
        long jM2261getValueimpl = m2261getValueimpl(j);
        long j2 = i;
        long j3 = jM2261getValueimpl * j2;
        if (!m2265isInNanosimpl(j)) {
            if (j3 / j2 == jM2261getValueimpl) {
                return DurationKt.durationOfMillis(RangesKt___RangesKt.coerceIn(j3, (ClosedRange<Long>) new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            }
            return MathKt__MathJVMKt.getSign(jM2261getValueimpl) * MathKt__MathJVMKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (-2147483647L <= jM2261getValueimpl && jM2261getValueimpl < 2147483648L) {
            return DurationKt.durationOfNanos(j3);
        }
        if (j3 / j2 == jM2261getValueimpl) {
            return DurationKt.durationOfNanosNormalized(j3);
        }
        long jNanosToMillis = DurationKt.nanosToMillis(jM2261getValueimpl);
        long j4 = jNanosToMillis * j2;
        long jNanosToMillis2 = DurationKt.nanosToMillis((jM2261getValueimpl - DurationKt.millisToNanos(jNanosToMillis)) * j2) + j4;
        if (j4 / j2 != jNanosToMillis || (jNanosToMillis2 ^ j4) < 0) {
            return MathKt__MathJVMKt.getSign(jM2261getValueimpl) * MathKt__MathJVMKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        return DurationKt.durationOfMillis(RangesKt___RangesKt.coerceIn(jNanosToMillis2, (ClosedRange<Long>) new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2276toComponentsimpl(long j, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m2249getInWholeDaysimpl(j)), Integer.valueOf(m2248getHoursComponentimpl(j)), Integer.valueOf(m2256getMinutesComponentimpl(j)), Integer.valueOf(m2258getSecondsComponentimpl(j)), Integer.valueOf(m2257getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m2277toDoubleimpl(long j, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m2261getValueimpl(j), m2259getStorageUnitimpl(j), unit);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m2278toIntimpl(long j, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt___RangesKt.coerceIn(m2280toLongimpl(j, unit), -2147483648L, 2147483647L);
    }

    @NotNull
    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m2279toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m2267isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM2247getAbsoluteValueUwyO8pc = m2247getAbsoluteValueUwyO8pc(j);
        long jM2250getInWholeHoursimpl = m2250getInWholeHoursimpl(jM2247getAbsoluteValueUwyO8pc);
        int iM2256getMinutesComponentimpl = m2256getMinutesComponentimpl(jM2247getAbsoluteValueUwyO8pc);
        int iM2258getSecondsComponentimpl = m2258getSecondsComponentimpl(jM2247getAbsoluteValueUwyO8pc);
        int iM2257getNanosecondsComponentimpl = m2257getNanosecondsComponentimpl(jM2247getAbsoluteValueUwyO8pc);
        if (m2266isInfiniteimpl(j)) {
            jM2250getInWholeHoursimpl = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = jM2250getInWholeHoursimpl != 0;
        boolean z3 = (iM2258getSecondsComponentimpl == 0 && iM2257getNanosecondsComponentimpl == 0) ? false : true;
        if (iM2256getMinutesComponentimpl != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM2250getInWholeHoursimpl);
            sb.append('H');
        }
        if (z) {
            sb.append(iM2256getMinutesComponentimpl);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            m2238appendFractionalimpl(j, sb, iM2258getSecondsComponentimpl, iM2257getNanosecondsComponentimpl, 9, "S", true);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m2280toLongimpl(long j, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m2261getValueimpl(j), m2259getStorageUnitimpl(j), unit);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2281toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM2267isNegativeimpl = m2267isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM2267isNegativeimpl) {
            sb.append('-');
        }
        long jM2247getAbsoluteValueUwyO8pc = m2247getAbsoluteValueUwyO8pc(j);
        long jM2249getInWholeDaysimpl = m2249getInWholeDaysimpl(jM2247getAbsoluteValueUwyO8pc);
        int iM2248getHoursComponentimpl = m2248getHoursComponentimpl(jM2247getAbsoluteValueUwyO8pc);
        int iM2256getMinutesComponentimpl = m2256getMinutesComponentimpl(jM2247getAbsoluteValueUwyO8pc);
        int iM2258getSecondsComponentimpl = m2258getSecondsComponentimpl(jM2247getAbsoluteValueUwyO8pc);
        int iM2257getNanosecondsComponentimpl = m2257getNanosecondsComponentimpl(jM2247getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM2249getInWholeDaysimpl != 0;
        boolean z2 = iM2248getHoursComponentimpl != 0;
        boolean z3 = iM2256getMinutesComponentimpl != 0;
        boolean z4 = (iM2258getSecondsComponentimpl == 0 && iM2257getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM2249getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM2248getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM2256getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM2258getSecondsComponentimpl != 0 || z || z2 || z3) {
                m2238appendFractionalimpl(j, sb, iM2258getSecondsComponentimpl, iM2257getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM2257getNanosecondsComponentimpl >= 1000000) {
                m2238appendFractionalimpl(j, sb, iM2257getNanosecondsComponentimpl / 1000000, iM2257getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM2257getNanosecondsComponentimpl >= 1000) {
                m2238appendFractionalimpl(j, sb, iM2257getNanosecondsComponentimpl / 1000, iM2257getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM2257getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM2267isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m2283toStringimpl$default(long j, DurationUnit durationUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m2282toStringimpl(j, durationUnit, i);
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m2284truncateToUwyO8pc$kotlin_stdlib(long j, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnitM2259getStorageUnitimpl = m2259getStorageUnitimpl(j);
        if (unit.compareTo(durationUnitM2259getStorageUnitimpl) <= 0 || m2266isInfiniteimpl(j)) {
            return j;
        }
        return DurationKt.toDuration(m2261getValueimpl(j) - (m2261getValueimpl(j) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, durationUnitM2259getStorageUnitimpl)), durationUnitM2259getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m2285unaryMinusUwyO8pc(long j) {
        return DurationKt.durationOf(-m2261getValueimpl(j), ((int) j) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m2286compareToLRDsOJo(duration.m2287unboximpl());
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m2286compareToLRDsOJo(long j) {
        return m2240compareToLRDsOJo(this.rawValue, j);
    }

    public boolean equals(Object obj) {
        return m2245equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m2262hashCodeimpl(this.rawValue);
    }

    @NotNull
    public String toString() {
        return m2281toStringimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2287unboximpl() {
        return this.rawValue;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m2240compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m2267isNegativeimpl(j) ? -i : i;
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2275toComponentsimpl(long j, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m2250getInWholeHoursimpl(j)), Integer.valueOf(m2256getMinutesComponentimpl(j)), Integer.valueOf(m2258getSecondsComponentimpl(j)), Integer.valueOf(m2257getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2274toComponentsimpl(long j, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m2253getInWholeMinutesimpl(j)), Integer.valueOf(m2258getSecondsComponentimpl(j)), Integer.valueOf(m2257getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m2273toComponentsimpl(long j, @NotNull Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m2255getInWholeSecondsimpl(j)), Integer.valueOf(m2257getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m2243divUwyO8pc(long j, double d) {
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(d);
        if (iRoundToInt == d && iRoundToInt != 0) {
            return m2244divUwyO8pc(j, iRoundToInt);
        }
        DurationUnit durationUnitM2259getStorageUnitimpl = m2259getStorageUnitimpl(j);
        return DurationKt.toDuration(m2277toDoubleimpl(j, durationUnitM2259getStorageUnitimpl) / d, durationUnitM2259getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m2271timesUwyO8pc(long j, double d) {
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(d);
        if (iRoundToInt == d) {
            return m2272timesUwyO8pc(j, iRoundToInt);
        }
        DurationUnit durationUnitM2259getStorageUnitimpl = m2259getStorageUnitimpl(j);
        return DurationKt.toDuration(m2277toDoubleimpl(j, durationUnitM2259getStorageUnitimpl) * d, durationUnitM2259getStorageUnitimpl);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final String m2282toStringimpl(long j, @NotNull DurationUnit unit, int i) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i >= 0) {
            double dM2277toDoubleimpl = m2277toDoubleimpl(j, unit);
            if (Double.isInfinite(dM2277toDoubleimpl)) {
                return String.valueOf(dM2277toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(dM2277toDoubleimpl, RangesKt___RangesKt.coerceAtMost(i, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
    }
}
