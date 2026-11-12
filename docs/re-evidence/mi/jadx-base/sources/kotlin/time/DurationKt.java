package kotlin.time;

import java.util.Collection;
import java.util.Iterator;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1059:1\n1012#1,6:1061\n1015#1,3:1067\n1012#1,6:1070\n1012#1,6:1076\n1015#1,3:1085\n1#2:1060\n1734#3,3:1082\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n936#1:1061,6\n970#1:1067,3\n973#1:1070,6\n976#1:1076,6\n1012#1:1085,3\n1001#1:1082,3\n*E\n"})
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOf(long j, int i) {
        return Duration.m2241constructorimpl((j << 1) + ((long) i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillis(long j) {
        return Duration.m2241constructorimpl((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfMillisNormalized(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? durationOfMillis(RangesKt___RangesKt.coerceIn(j, -4611686018427387903L, MAX_MILLIS)) : durationOfNanos(millisToNanos(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanos(long j) {
        return Duration.m2241constructorimpl(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long durationOfNanosNormalized(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? durationOfMillis(nanosToMillis(j)) : durationOfNanos(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long millisToNanos(long j) {
        return j * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long nanosToMillis(long j) {
        return j / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long parseDuration(String str, boolean z) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        Duration.Companion companion = Duration.Companion;
        long jM2332getZEROUwyO8pc = companion.m2332getZEROUwyO8pc();
        char cCharAt4 = str.charAt(0);
        boolean z2 = true;
        int length2 = (cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0;
        boolean z3 = length2 > 0;
        boolean z4 = z3 && StringsKt__StringsKt.startsWith$default((CharSequence) str, '-', false, 2, (Object) null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char cCharAt5 = str.charAt(length2);
        char c = AbstractJsonLexerKt.COLON;
        char c2 = '0';
        if (cCharAt5 == 'P') {
            int i = length2 + 1;
            if (i == length) {
                throw new IllegalArgumentException();
            }
            DurationUnit durationUnit = null;
            boolean z5 = false;
            while (i < length) {
                if (str.charAt(i) != 'T') {
                    int i2 = i;
                    while (i2 < str.length() && ((c2 <= (cCharAt3 = str.charAt(i2)) && cCharAt3 < c) || StringsKt__StringsKt.contains$default((CharSequence) "+-.", cCharAt3, false, 2, (Object) null))) {
                        i2++;
                        c = AbstractJsonLexerKt.COLON;
                        c2 = '0';
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt6 = str.charAt(length3);
                    int i3 = length3 + 1;
                    DurationUnit durationUnitDurationUnitByIsoChar = DurationUnitKt__DurationUnitKt.durationUnitByIsoChar(cCharAt6, z5);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring, '.', 0, false, 6, (Object) null);
                    if (durationUnitDurationUnitByIsoChar != DurationUnit.SECONDS || iIndexOf$default <= 0) {
                        jM2332getZEROUwyO8pc = Duration.m2270plusLRDsOJo(jM2332getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring), durationUnitDurationUnitByIsoChar));
                    } else {
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        long jM2270plusLRDsOJo = Duration.m2270plusLRDsOJo(jM2332getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(strSubstring2), durationUnitDurationUnitByIsoChar));
                        Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM2332getZEROUwyO8pc = Duration.m2270plusLRDsOJo(jM2270plusLRDsOJo, toDuration(Double.parseDouble(strSubstring3), durationUnitDurationUnitByIsoChar));
                    }
                    i = i3;
                    durationUnit = durationUnitDurationUnitByIsoChar;
                    c = AbstractJsonLexerKt.COLON;
                    c2 = '0';
                    z2 = true;
                } else {
                    if (z5 || (i = i + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z5 = z2;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            String str2 = "Unexpected order of duration components";
            long jM2270plusLRDsOJo2 = jM2332getZEROUwyO8pc;
            if (StringsKt__StringsJVMKt.regionMatches(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jM2332getZEROUwyO8pc = companion.m2330getINFINITEUwyO8pc();
            } else {
                boolean z6 = !z3;
                if (z3 && str.charAt(length2) == '(' && StringsKt___StringsKt.last(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new IllegalArgumentException("No components");
                    }
                    z6 = true;
                }
                DurationUnit durationUnit2 = null;
                boolean z7 = false;
                while (length2 < length) {
                    if (z7 && z6) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i4 = length2;
                    while (i4 < str.length() && (('0' <= (cCharAt2 = str.charAt(i4)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i4++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i5 = length4;
                    while (i5 < str.length() && 'a' <= (cCharAt = str.charAt(i5)) && cCharAt < '{') {
                        i5++;
                    }
                    Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitDurationUnitByShortName = DurationUnitKt__DurationUnitKt.durationUnitByShortName(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException(str2);
                    }
                    String str3 = str2;
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring4, '.', 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jM2270plusLRDsOJo3 = Duration.m2270plusLRDsOJo(jM2270plusLRDsOJo2, toDuration(Long.parseLong(strSubstring6), durationUnitDurationUnitByShortName));
                        Intrinsics.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jM2270plusLRDsOJo2 = Duration.m2270plusLRDsOJo(jM2270plusLRDsOJo3, toDuration(Double.parseDouble(strSubstring7), durationUnitDurationUnitByShortName));
                        if (length2 < length) {
                            length2 = length2;
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                        length2 = length2;
                    } else {
                        jM2270plusLRDsOJo2 = Duration.m2270plusLRDsOJo(jM2270plusLRDsOJo2, toDuration(Long.parseLong(strSubstring4), durationUnitDurationUnitByShortName));
                    }
                    str2 = str3;
                    durationUnit2 = durationUnitDurationUnitByShortName;
                    z7 = true;
                }
                jM2332getZEROUwyO8pc = jM2270plusLRDsOJo2;
            }
        }
        return z4 ? Duration.m2285unaryMinusUwyO8pc(jM2332getZEROUwyO8pc) : jM2332getZEROUwyO8pc;
    }

    private static final long parseOverLongIsoComponent(String str) {
        int length = str.length();
        int i = (length <= 0 || !StringsKt__StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i > 16) {
            Iterable intRange = new IntRange(i, StringsKt__StringsKt.getLastIndex(str));
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it = intRange.iterator();
                while (true) {
                    if (it.hasNext()) {
                        char cCharAt = str.charAt(((IntIterator) it).nextInt());
                        if ('0' > cCharAt || cCharAt >= ':') {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(str, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
            str = StringsKt___StringsKt.drop(str, 1);
        }
        return Long.parseLong(str);
    }

    private static final int skipWhile(String str, int i, Function1<? super Character, Boolean> function1) {
        while (i < str.length() && function1.invoke2(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    private static final String substringWhile(String str, int i, Function1<? super Character, Boolean> function1) {
        int i2 = i;
        while (i2 < str.length() && function1.invoke2(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @InlineOnly
    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m2337timeskIfJnKk(double d, long j) {
        return Duration.m2271timesUwyO8pc(j, d);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @InlineOnly
    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m2338timesmvk6XK0(int i, long j) {
        return Duration.m2272timesUwyO8pc(j, i);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(int i, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i, unit, DurationUnit.NANOSECONDS)) : toDuration(i, unit);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(long j, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jConvertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(MAX_NANOS, durationUnit, unit);
        return ((-jConvertDurationUnitOverflow) > j || j > jConvertDurationUnitOverflow) ? durationOfMillis(RangesKt___RangesKt.coerceIn(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, MAX_MILLIS)) : durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j, unit, durationUnit));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(double d, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, unit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(dConvertDurationUnit)) {
            long jRoundToLong = MathKt__MathJVMKt.roundToLong(dConvertDurationUnit);
            if (-4611686018426999999L <= jRoundToLong && jRoundToLong < 4611686018427000000L) {
                return durationOfNanos(jRoundToLong);
            }
            return durationOfMillisNormalized(MathKt__MathJVMKt.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, unit, DurationUnit.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }
}
