package kotlin.time;

import androidx.exifinterface.media.ExifInterface;
import com.airbnb.lottie.utils.Utils;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.huami.passport.Configs;
import io.netty.util.internal.StringUtil;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.c;
import kotlin.ranges.LongRange;
import kotlin.ranges.e;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.6")
@JvmInline
@WasExperimental(markerClass = {ExperimentalTime.class})
public final class Duration implements Comparable<Duration> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long b = m4319constructorimpl(0);
    private static final long c = DurationKt.b(DurationKt.MAX_MILLIS);
    private static final long d = DurationKt.b(-4611686018427387903L);
    private final long a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long a(double d) {
            return DurationKt.toDuration(d, DurationUnit.DAYS);
        }

        private final long b(int i) {
            return DurationKt.toDuration(i, DurationUnit.DAYS);
        }

        private final long c(long j) {
            return DurationKt.toDuration(j, DurationUnit.DAYS);
        }

        private final long d(double d) {
            return DurationKt.toDuration(d, DurationUnit.HOURS);
        }

        private final long e(int i) {
            return DurationKt.toDuration(i, DurationUnit.HOURS);
        }

        private final long f(long j) {
            return DurationKt.toDuration(j, DurationUnit.HOURS);
        }

        private final long g(double d) {
            return DurationKt.toDuration(d, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4369getDaysUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4370getDaysUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4371getDaysUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4372getHoursUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4373getHoursUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4374getHoursUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4375getMicrosecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4376getMicrosecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4377getMicrosecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4378getMillisecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4379getMillisecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4380getMillisecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4381getMinutesUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4382getMinutesUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4383getMinutesUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4384getNanosecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4385getNanosecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4386getNanosecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4387getSecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4388getSecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m4389getSecondsUwyO8pc$annotations(long j) {
        }

        private final long h(int i) {
            return DurationKt.toDuration(i, DurationUnit.MICROSECONDS);
        }

        private final long i(long j) {
            return DurationKt.toDuration(j, DurationUnit.MICROSECONDS);
        }

        private final long j(double d) {
            return DurationKt.toDuration(d, DurationUnit.MILLISECONDS);
        }

        private final long k(int i) {
            return DurationKt.toDuration(i, DurationUnit.MILLISECONDS);
        }

        private final long l(long j) {
            return DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
        }

        private final long m(double d) {
            return DurationKt.toDuration(d, DurationUnit.MINUTES);
        }

        private final long n(int i) {
            return DurationKt.toDuration(i, DurationUnit.MINUTES);
        }

        private final long o(long j) {
            return DurationKt.toDuration(j, DurationUnit.MINUTES);
        }

        private final long p(double d) {
            return DurationKt.toDuration(d, DurationUnit.NANOSECONDS);
        }

        private final long q(int i) {
            return DurationKt.toDuration(i, DurationUnit.NANOSECONDS);
        }

        private final long r(long j) {
            return DurationKt.toDuration(j, DurationUnit.NANOSECONDS);
        }

        private final long s(double d) {
            return DurationKt.toDuration(d, DurationUnit.SECONDS);
        }

        private final long t(int i) {
            return DurationKt.toDuration(i, DurationUnit.SECONDS);
        }

        private final long u(long j) {
            return DurationKt.toDuration(j, DurationUnit.SECONDS);
        }

        @ExperimentalTime
        public final double convert(double d, @NotNull DurationUnit durationUnit, @NotNull DurationUnit durationUnit2) {
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, durationUnit, durationUnit2);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m4391daysUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m4393getINFINITEUwyO8pc() {
            return Duration.c;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m4394getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.d;
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m4395getZEROUwyO8pc() {
            return Duration.b;
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m4397hoursUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m4400microsecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m4403millisecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m4406minutesUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m4409nanosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m4411parseUwyO8pc(@NotNull String str) {
            try {
                return DurationKt.h(str, false);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + str + "'.", e);
            }
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m4412parseIsoStringUwyO8pc(@NotNull String str) {
            try {
                return DurationKt.h(str, true);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m4413parseIsoStringOrNullFghU774(@NotNull String str) {
            try {
                return Duration.m4317boximpl(DurationKt.h(str, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m4414parseOrNullFghU774(@NotNull String str) {
            try {
                return Duration.m4317boximpl(DurationKt.h(str, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m4416secondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.SECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m4392daysUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m4398hoursUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m4401microsecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m4404millisecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m4407minutesUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m4410nanosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m4417secondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.SECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final long m4390daysUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final long m4396hoursUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final long m4399microsecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final long m4402millisecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final long m4405minutesUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final long m4408nanosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(warningSince = "1.6")
        @ExperimentalTime
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final long m4415secondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.SECONDS);
        }
    }

    private /* synthetic */ Duration(long j) {
        this.a = j;
    }

    private static final long a(long j, long j2, long j3) {
        long jG = DurationKt.g(j3);
        long j4 = j2 + jG;
        boolean z = false;
        if (-4611686018426L <= j4 && j4 < 4611686018427L) {
            z = true;
        }
        if (!z) {
            return DurationKt.b(e.coerceIn(j4, -4611686018427387903L, DurationKt.MAX_MILLIS));
        }
        return DurationKt.d(DurationKt.f(j4) + (j3 - DurationKt.f(jG)));
    }

    private static final void b(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
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
                sb.append((CharSequence) strPadStart, 0, ((i6 + 2) / 3) * 3);
            } else {
                sb.append((CharSequence) strPadStart, 0, i6);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m4317boximpl(long j) {
        return new Duration(j);
    }

    private static final DurationUnit c(long j) {
        return g(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4319constructorimpl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (g(j)) {
                long jE = e(j);
                if (!(-4611686018426999999L <= jE && jE < 4611686018427000000L)) {
                    throw new AssertionError(e(j) + " ns is out of nanoseconds range");
                }
            } else {
                long jE2 = e(j);
                if (!(-4611686018427387903L <= jE2 && jE2 < 4611686018427387904L)) {
                    throw new AssertionError(e(j) + " ms is out of milliseconds range");
                }
                long jE3 = e(j);
                if (-4611686018426L <= jE3 && jE3 < 4611686018427L) {
                    throw new AssertionError(e(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    private static final int d(long j) {
        return ((int) j) & 1;
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m4320divLRDsOJo(long j, long j2) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(c(j), c(j2));
        return m4357toDoubleimpl(j, durationUnit) / m4357toDoubleimpl(j2, durationUnit);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m4322divUwyO8pc(long j, int i) {
        if (i == 0) {
            if (m4348isPositiveimpl(j)) {
                return c;
            }
            if (m4347isNegativeimpl(j)) {
                return d;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (g(j)) {
            return DurationKt.d(e(j) / ((long) i));
        }
        if (m4346isInfiniteimpl(j)) {
            return m4352timesUwyO8pc(j, c.getSign(i));
        }
        long j2 = i;
        long jE = e(j) / j2;
        boolean z = false;
        if (-4611686018426L <= jE && jE < 4611686018427L) {
            z = true;
        }
        if (!z) {
            return DurationKt.b(jE);
        }
        return DurationKt.d(DurationKt.f(jE) + (DurationKt.f(e(j) - (jE * j2)) / j2));
    }

    private static final long e(long j) {
        return j >> 1;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4323equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m4368unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4324equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private static final boolean f(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean g(long j) {
        return (((int) j) & 1) == 0;
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m4325getAbsoluteValueUwyO8pc(long j) {
        return m4347isNegativeimpl(j) ? m4366unaryMinusUwyO8pc(j) : j;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m4326getHoursComponentimpl(long j) {
        if (m4346isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m4335getInWholeHoursimpl(j) % ((long) 24));
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInDays$annotations() {
    }

    /* JADX INFO: renamed from: getInDays-impl, reason: not valid java name */
    public static final double m4327getInDaysimpl(long j) {
        return m4357toDoubleimpl(j, DurationUnit.DAYS);
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInHours$annotations() {
    }

    /* JADX INFO: renamed from: getInHours-impl, reason: not valid java name */
    public static final double m4328getInHoursimpl(long j) {
        return m4357toDoubleimpl(j, DurationUnit.HOURS);
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    /* JADX INFO: renamed from: getInMicroseconds-impl, reason: not valid java name */
    public static final double m4329getInMicrosecondsimpl(long j) {
        return m4357toDoubleimpl(j, DurationUnit.MICROSECONDS);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    /* JADX INFO: renamed from: getInMilliseconds-impl, reason: not valid java name */
    public static final double m4330getInMillisecondsimpl(long j) {
        return m4357toDoubleimpl(j, DurationUnit.MILLISECONDS);
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    /* JADX INFO: renamed from: getInMinutes-impl, reason: not valid java name */
    public static final double m4331getInMinutesimpl(long j) {
        return m4357toDoubleimpl(j, DurationUnit.MINUTES);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    /* JADX INFO: renamed from: getInNanoseconds-impl, reason: not valid java name */
    public static final double m4332getInNanosecondsimpl(long j) {
        return m4357toDoubleimpl(j, DurationUnit.NANOSECONDS);
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @ExperimentalTime
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    /* JADX INFO: renamed from: getInSeconds-impl, reason: not valid java name */
    public static final double m4333getInSecondsimpl(long j) {
        return m4357toDoubleimpl(j, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m4334getInWholeDaysimpl(long j) {
        return m4360toLongimpl(j, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m4335getInWholeHoursimpl(long j) {
        return m4360toLongimpl(j, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m4336getInWholeMicrosecondsimpl(long j) {
        return m4360toLongimpl(j, DurationUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m4337getInWholeMillisecondsimpl(long j) {
        return (f(j) && m4345isFiniteimpl(j)) ? e(j) : m4360toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m4338getInWholeMinutesimpl(long j) {
        return m4360toLongimpl(j, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m4339getInWholeNanosecondsimpl(long j) {
        long jE = e(j);
        if (g(j)) {
            return jE;
        }
        if (jE > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jE < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.f(jE);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m4340getInWholeSecondsimpl(long j) {
        return m4360toLongimpl(j, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m4341getMinutesComponentimpl(long j) {
        if (m4346isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m4338getInWholeMinutesimpl(j) % ((long) 60));
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m4342getNanosecondsComponentimpl(long j) {
        if (m4346isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (f(j) ? DurationKt.f(e(j) % ((long) 1000)) : e(j) % ((long) Utils.SECOND_IN_NANOS));
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m4343getSecondsComponentimpl(long j) {
        if (m4346isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m4340getInWholeSecondsimpl(j) % ((long) 60));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4344hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m4345isFiniteimpl(long j) {
        return !m4346isInfiniteimpl(j);
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m4346isInfiniteimpl(long j) {
        return j == c || j == d;
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m4347isNegativeimpl(long j) {
        return j < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m4348isPositiveimpl(long j) {
        return j > 0;
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m4349minusLRDsOJo(long j, long j2) {
        return m4350plusLRDsOJo(j, m4366unaryMinusUwyO8pc(j2));
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m4350plusLRDsOJo(long j, long j2) {
        if (m4346isInfiniteimpl(j)) {
            if (m4345isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m4346isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return f(j) ? a(j, e(j), e(j2)) : a(j, e(j2), e(j));
        }
        long jE = e(j) + e(j2);
        return g(j) ? DurationKt.e(jE) : DurationKt.c(jE);
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m4352timesUwyO8pc(long j, int i) {
        if (m4346isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m4366unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return b;
        }
        long jE = e(j);
        long j2 = i;
        long j3 = jE * j2;
        if (!g(j)) {
            if (j3 / j2 == jE) {
                return DurationKt.b(e.coerceIn(j3, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            }
            return c.getSign(jE) * c.getSign(i) > 0 ? c : d;
        }
        boolean z = false;
        if (jE <= ParserMinimalBase.MAX_INT_L && -2147483647L <= jE) {
            z = true;
        }
        if (z) {
            return DurationKt.d(j3);
        }
        if (j3 / j2 == jE) {
            return DurationKt.e(j3);
        }
        long jG = DurationKt.g(jE);
        long j4 = jG * j2;
        long jG2 = DurationKt.g((jE - DurationKt.f(jG)) * j2) + j4;
        if (j4 / j2 != jG || (jG2 ^ j4) < 0) {
            return c.getSign(jE) * c.getSign(i) > 0 ? c : d;
        }
        return DurationKt.b(e.coerceIn(jG2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m4356toComponentsimpl(long j, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> function5) {
        return function5.invoke(Long.valueOf(m4334getInWholeDaysimpl(j)), Integer.valueOf(m4326getHoursComponentimpl(j)), Integer.valueOf(m4341getMinutesComponentimpl(j)), Integer.valueOf(m4343getSecondsComponentimpl(j)), Integer.valueOf(m4342getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m4357toDoubleimpl(long j, @NotNull DurationUnit durationUnit) {
        if (j == c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == d) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(e(j), c(j), durationUnit);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m4358toIntimpl(long j, @NotNull DurationUnit durationUnit) {
        return (int) e.coerceIn(m4360toLongimpl(j, durationUnit), ParserMinimalBase.MIN_INT_L, ParserMinimalBase.MAX_INT_L);
    }

    @NotNull
    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m4359toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m4347isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM4325getAbsoluteValueUwyO8pc = m4325getAbsoluteValueUwyO8pc(j);
        long jM4335getInWholeHoursimpl = m4335getInWholeHoursimpl(jM4325getAbsoluteValueUwyO8pc);
        int iM4341getMinutesComponentimpl = m4341getMinutesComponentimpl(jM4325getAbsoluteValueUwyO8pc);
        int iM4343getSecondsComponentimpl = m4343getSecondsComponentimpl(jM4325getAbsoluteValueUwyO8pc);
        int iM4342getNanosecondsComponentimpl = m4342getNanosecondsComponentimpl(jM4325getAbsoluteValueUwyO8pc);
        if (m4346isInfiniteimpl(j)) {
            jM4335getInWholeHoursimpl = 9999999999999L;
        }
        boolean z = true;
        boolean z2 = jM4335getInWholeHoursimpl != 0;
        boolean z3 = (iM4343getSecondsComponentimpl == 0 && iM4342getNanosecondsComponentimpl == 0) ? false : true;
        if (iM4341getMinutesComponentimpl == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(jM4335getInWholeHoursimpl);
            sb.append('H');
        }
        if (z) {
            sb.append(iM4341getMinutesComponentimpl);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            b(j, sb, iM4343getSecondsComponentimpl, iM4342getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m4360toLongimpl(long j, @NotNull DurationUnit durationUnit) {
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(e(j), c(j), durationUnit);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    @ExperimentalTime
    /* JADX INFO: renamed from: toLongMilliseconds-impl, reason: not valid java name */
    public static final long m4361toLongMillisecondsimpl(long j) {
        return m4337getInWholeMillisecondsimpl(j);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    @ExperimentalTime
    /* JADX INFO: renamed from: toLongNanoseconds-impl, reason: not valid java name */
    public static final long m4362toLongNanosecondsimpl(long j) {
        return m4339getInWholeNanosecondsimpl(j);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4363toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return "Infinity";
        }
        if (j == d) {
            return "-Infinity";
        }
        boolean zM4347isNegativeimpl = m4347isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (zM4347isNegativeimpl) {
            sb.append('-');
        }
        long jM4325getAbsoluteValueUwyO8pc = m4325getAbsoluteValueUwyO8pc(j);
        long jM4334getInWholeDaysimpl = m4334getInWholeDaysimpl(jM4325getAbsoluteValueUwyO8pc);
        int iM4326getHoursComponentimpl = m4326getHoursComponentimpl(jM4325getAbsoluteValueUwyO8pc);
        int iM4341getMinutesComponentimpl = m4341getMinutesComponentimpl(jM4325getAbsoluteValueUwyO8pc);
        int iM4343getSecondsComponentimpl = m4343getSecondsComponentimpl(jM4325getAbsoluteValueUwyO8pc);
        int iM4342getNanosecondsComponentimpl = m4342getNanosecondsComponentimpl(jM4325getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = jM4334getInWholeDaysimpl != 0;
        boolean z2 = iM4326getHoursComponentimpl != 0;
        boolean z3 = iM4341getMinutesComponentimpl != 0;
        boolean z4 = (iM4343getSecondsComponentimpl == 0 && iM4342getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM4334getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(StringUtil.SPACE);
            }
            sb.append(iM4326getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(StringUtil.SPACE);
            }
            sb.append(iM4341getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(StringUtil.SPACE);
            }
            if (iM4343getSecondsComponentimpl != 0 || z || z2 || z3) {
                b(j, sb, iM4343getSecondsComponentimpl, iM4342getNanosecondsComponentimpl, 9, SOAP.XMLNS, false);
            } else if (iM4342getNanosecondsComponentimpl >= 1000000) {
                b(j, sb, iM4342getNanosecondsComponentimpl / 1000000, iM4342getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM4342getNanosecondsComponentimpl >= 1000) {
                b(j, sb, iM4342getNanosecondsComponentimpl / 1000, iM4342getNanosecondsComponentimpl % 1000, 3, Configs.Params.US, false);
            } else {
                sb.append(iM4342getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (zM4347isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m4365toStringimpl$default(long j, DurationUnit durationUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m4364toStringimpl(j, durationUnit, i);
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m4366unaryMinusUwyO8pc(long j) {
        return DurationKt.a(-e(j), ((int) j) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m4367compareToLRDsOJo(duration.m4368unboximpl());
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m4367compareToLRDsOJo(long j) {
        return m4318compareToLRDsOJo(this.a, j);
    }

    public boolean equals(Object obj) {
        return m4323equalsimpl(this.a, obj);
    }

    public int hashCode() {
        return m4344hashCodeimpl(this.a);
    }

    @NotNull
    public String toString() {
        return m4363toStringimpl(this.a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4368unboximpl() {
        return this.a;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m4318compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m4347isNegativeimpl(j) ? -i : i;
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m4355toComponentsimpl(long j, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> function4) {
        return function4.invoke(Long.valueOf(m4335getInWholeHoursimpl(j)), Integer.valueOf(m4341getMinutesComponentimpl(j)), Integer.valueOf(m4343getSecondsComponentimpl(j)), Integer.valueOf(m4342getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m4354toComponentsimpl(long j, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> function3) {
        return function3.invoke(Long.valueOf(m4338getInWholeMinutesimpl(j)), Integer.valueOf(m4343getSecondsComponentimpl(j)), Integer.valueOf(m4342getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m4353toComponentsimpl(long j, @NotNull Function2<? super Long, ? super Integer, ? extends T> function2) {
        return function2.invoke(Long.valueOf(m4340getInWholeSecondsimpl(j)), Integer.valueOf(m4342getNanosecondsComponentimpl(j)));
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m4321divUwyO8pc(long j, double d2) {
        int iRoundToInt = c.roundToInt(d2);
        if ((((double) iRoundToInt) == d2) && iRoundToInt != 0) {
            return m4322divUwyO8pc(j, iRoundToInt);
        }
        DurationUnit durationUnitC = c(j);
        return DurationKt.toDuration(m4357toDoubleimpl(j, durationUnitC) / d2, durationUnitC);
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m4351timesUwyO8pc(long j, double d2) {
        int iRoundToInt = c.roundToInt(d2);
        if (((double) iRoundToInt) == d2) {
            return m4352timesUwyO8pc(j, iRoundToInt);
        }
        DurationUnit durationUnitC = c(j);
        return DurationKt.toDuration(m4357toDoubleimpl(j, durationUnitC) * d2, durationUnitC);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final String m4364toStringimpl(long j, @NotNull DurationUnit durationUnit, int i) {
        if (i >= 0) {
            double dM4357toDoubleimpl = m4357toDoubleimpl(j, durationUnit);
            return Double.isInfinite(dM4357toDoubleimpl) ? String.valueOf(dM4357toDoubleimpl) : Intrinsics.stringPlus(DurationJvmKt.formatToExactDecimals(dM4357toDoubleimpl, e.coerceAtMost(i, 12)), DurationUnitKt__DurationUnitKt.shortName(durationUnit));
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("decimals must be not negative, but was ", Integer.valueOf(i)).toString());
    }
}
