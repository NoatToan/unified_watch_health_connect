package kotlin.ranges;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1538:1\n1#2:1539\n*E\n"})
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, double d) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(d);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b2, byte b3) {
        return b2 < b3 ? b3 : b2;
    }

    public static final byte coerceAtMost(byte b2, byte b3) {
        return b2 > b3 ? b3 : b2;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @Nullable T t2, @Nullable T t3) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        if (t2 == null || t3 == null) {
            if (t2 != null && t.compareTo(t2) < 0) {
                return t2;
            }
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        } else {
            if (t2.compareTo(t3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
            }
            if (t.compareTo(t2) < 0) {
                return t2;
            }
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(IntRange intRange, Integer num) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return num != null && intRange.contains(num.intValue());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, byte b2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(b2));
    }

    @NotNull
    public static final IntProgression downTo(int i, byte b2) {
        return IntProgression.Companion.fromClosedRange(i, b2, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Integer firstOrNull(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, byte b2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(b2));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, byte b2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(b2));
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Integer lastOrNull(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getLast());
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, byte b2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(b2));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int random(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return random(intRange, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Integer randomOrNull(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return randomOrNull(intRange, Random.Default);
    }

    @NotNull
    public static final IntProgression reversed(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        return IntProgression.Companion.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, byte b2) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Short.valueOf(b2));
    }

    @NotNull
    public static IntProgression step(@NotNull IntProgression intProgression, int i) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        IntProgression.Companion companion = IntProgression.Companion;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    @Nullable
    public static final Byte toByteExactOrNull(int i) {
        if (-128 > i || i >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i);
    }

    @Nullable
    public static final Integer toIntExactOrNull(long j) {
        if (-2147483648L > j || j >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j);
    }

    @Nullable
    public static final Long toLongExactOrNull(double d) {
        if (-9.223372036854776E18d > d || d > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d);
    }

    @Nullable
    public static final Short toShortExactOrNull(int i) {
        if (-32768 > i || i >= 32768) {
            return null;
        }
        return Short.valueOf((short) i);
    }

    @NotNull
    public static IntRange until(int i, byte b2) {
        return new IntRange(i, b2 - 1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, float f) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(f);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final double coerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static double coerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(LongRange longRange, Long l) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return l != null && longRange.contains(l.longValue());
    }

    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull ClosedRange<Double> closedRange, float f) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(f));
    }

    @NotNull
    public static final LongProgression downTo(long j, byte b2) {
        return LongProgression.Companion.fromClosedRange(j, b2, -1L);
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Long firstOrNull(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getFirst());
    }

    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(@NotNull ClosedRange<Float> closedRange, double d) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf((float) d));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, byte b2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(b2));
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Long lastOrNull(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getLast());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, byte b2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(b2));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final long random(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return random(longRange, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Long randomOrNull(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return randomOrNull(longRange, Random.Default);
    }

    @NotNull
    public static final LongProgression reversed(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        return LongProgression.Companion.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, byte b2) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Short.valueOf(b2));
    }

    @Nullable
    public static final Byte toByteExactOrNull(long j) {
        if (-128 > j || j >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j);
    }

    @Nullable
    public static final Integer toIntExactOrNull(double d) {
        if (-2.147483648E9d > d || d > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d);
    }

    @Nullable
    public static final Long toLongExactOrNull(float f) {
        if (-9.223372E18f > f || f > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f);
    }

    @Nullable
    public static final Short toShortExactOrNull(long j) {
        if (-32768 > j || j >= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) {
            return null;
        }
        return Short.valueOf((short) j);
    }

    @NotNull
    public static final LongRange until(long j, byte b2) {
        return new LongRange(j, ((long) b2) - 1);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static float coerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static float coerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(CharRange charRange, Character ch) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return ch != null && charRange.contains(ch.charValue());
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@NotNull OpenEndRange<Double> openEndRange, float f) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Double.valueOf(f));
    }

    @NotNull
    public static final IntProgression downTo(byte b2, byte b3) {
        return IntProgression.Companion.fromClosedRange(b2, b3, -1);
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Character firstOrNull(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(i));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, double d) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(d);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final Character lastOrNull(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getLast());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, double d) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(d);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return random(charRange, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Character randomOrNull(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return randomOrNull(charRange, Random.Default);
    }

    @NotNull
    public static final CharProgression reversed(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        return CharProgression.Companion.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, double d) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(d);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static LongProgression step(@NotNull LongProgression longProgression, long j) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j > 0, Long.valueOf(j));
        LongProgression.Companion companion = LongProgression.Companion;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j = -j;
        }
        return companion.fromClosedRange(first, last, j);
    }

    @Nullable
    public static final Byte toByteExactOrNull(short s) {
        if (-128 > s || s >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s);
    }

    @Nullable
    public static final Integer toIntExactOrNull(float f) {
        if (-2.14748365E9f > f || f > 2.14748365E9f) {
            return null;
        }
        return Integer.valueOf((int) f);
    }

    @Nullable
    public static final Short toShortExactOrNull(double d) {
        if (-32768.0d > d || d > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d);
    }

    @NotNull
    public static final IntRange until(byte b2, byte b3) {
        return new IntRange(b2, b3 - 1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, int i) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, byte b2) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, b2);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(i));
    }

    @NotNull
    public static final IntProgression downTo(short s, byte b2) {
        return IntProgression.Companion.fromClosedRange(s, b2, -1);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, long j) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(j));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, float f) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(f);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, float f) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(f);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.3")
    public static int random(@NotNull IntRange intRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextInt(random, intRange);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Integer randomOrNull(@NotNull IntRange intRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.nextInt(random, intRange));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, float f) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(f);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @Nullable
    public static final Byte toByteExactOrNull(double d) {
        if (-128.0d > d || d > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d);
    }

    @Nullable
    public static final Short toShortExactOrNull(float f) {
        if (-32768.0f > f || f > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f);
    }

    @NotNull
    public static final IntRange until(short s, byte b2) {
        return new IntRange(s, b2 - 1);
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, long j) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, byte b2) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, b2);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, long j) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(j));
    }

    @NotNull
    public static final CharProgression downTo(char c, char c2) {
        return CharProgression.Companion.fromClosedRange(c, c2, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, short s) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(s));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, long j) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(i));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, int i) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final CharProgression step(@NotNull CharProgression charProgression, int i) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        CharProgression.Companion companion = CharProgression.Companion;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    @Nullable
    public static final Byte toByteExactOrNull(float f) {
        if (-128.0f > f || f > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f);
    }

    @NotNull
    public static final CharRange until(char c, char c2) {
        return Intrinsics.compare((int) c2, 0) <= 0 ? CharRange.Companion.getEMPTY() : new CharRange(c, (char) (c2 - 1));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, long j) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceAtLeast(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final short coerceAtMost(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, int i) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, i);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, short s) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(s));
    }

    @NotNull
    public static IntProgression downTo(int i, int i2) {
        return IntProgression.Companion.fromClosedRange(i, i2, -1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, long j) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, int i) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(i));
    }

    @SinceKotlin(version = "1.3")
    public static final long random(@NotNull LongRange longRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextLong(random, longRange);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Long randomOrNull(@NotNull LongRange longRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (longRange.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.nextLong(random, longRange));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, int i) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull ClosedRange<Byte> closedRange, short s) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceAtLeast(@NotNull T t, @NotNull T minimumValue) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t.compareTo(minimumValue) < 0 ? minimumValue : t;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceAtMost(@NotNull T t, @NotNull T maximumValue) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t.compareTo(maximumValue) > 0 ? maximumValue : t;
    }

    public static final byte coerceIn(byte b2, byte b3, byte b4) {
        if (b3 <= b4) {
            if (b2 < b3) {
                return b3;
            }
            return b2 > b4 ? b4 : b2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b4) + " is less than minimum " + ((int) b3) + '.');
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, long j) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, j);
    }

    @NotNull
    public static final LongProgression downTo(long j, int i) {
        return LongProgression.Companion.fromClosedRange(j, i, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final char first(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull ClosedRange<Integer> closedRange, short s) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(s));
    }

    @SinceKotlin(version = "1.7")
    public static final char last(@NotNull CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull ClosedRange<Long> closedRange, short s) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(s));
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull ClosedRange<Short> closedRange, long j) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static IntRange until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange(i, i2 - 1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(@NotNull OpenEndRange<Byte> openEndRange, short s) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceIn(short s, short s2, short s3) {
        if (s2 <= s3) {
            if (s < s2) {
                return s2;
            }
            return s > s3 ? s3 : s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + '.');
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, short s) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, s);
    }

    @NotNull
    public static final IntProgression downTo(byte b2, int i) {
        return IntProgression.Companion.fromClosedRange(b2, i, -1);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(@NotNull OpenEndRange<Integer> openEndRange, short s) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(s));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(@NotNull OpenEndRange<Long> openEndRange, short s) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(s));
    }

    @SinceKotlin(version = "1.3")
    public static final char random(@NotNull CharRange charRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final Character randomOrNull(@NotNull CharRange charRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charRange.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(@NotNull OpenEndRange<Short> openEndRange, long j) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static int coerceIn(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, short s) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, s);
    }

    @NotNull
    public static final IntProgression downTo(short s, int i) {
        return IntProgression.Companion.fromClosedRange(s, i, -1);
    }

    @NotNull
    public static final LongRange until(long j, int i) {
        return new LongRange(j, ((long) i) - 1);
    }

    public static long coerceIn(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    @NotNull
    public static final LongProgression downTo(int i, long j) {
        return LongProgression.Companion.fromClosedRange(i, j, -1L);
    }

    @NotNull
    public static final IntRange until(byte b2, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange(b2, i - 1);
    }

    public static float coerceIn(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    @NotNull
    public static final LongProgression downTo(long j, long j2) {
        return LongProgression.Companion.fromClosedRange(j, j2, -1L);
    }

    public static double coerceIn(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    @NotNull
    public static final LongProgression downTo(byte b2, long j) {
        return LongProgression.Companion.fromClosedRange(b2, j, -1L);
    }

    @NotNull
    public static final IntRange until(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.Companion.getEMPTY();
        }
        return new IntRange(s, i - 1);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @NotNull ClosedFloatingPointRange<T> range) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (!range.lessThanOrEquals(t, range.getStart()) || range.lessThanOrEquals(range.getStart(), t)) {
                return (!range.lessThanOrEquals(range.getEndInclusive(), t) || range.lessThanOrEquals(t, range.getEndInclusive())) ? t : range.getEndInclusive();
            }
            return range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    public static final LongProgression downTo(short s, long j) {
        return LongProgression.Companion.fromClosedRange(s, j, -1L);
    }

    @NotNull
    public static final IntProgression downTo(int i, short s) {
        return IntProgression.Companion.fromClosedRange(i, s, -1);
    }

    @NotNull
    public static final LongRange until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange(i, j - 1);
    }

    @NotNull
    public static final LongProgression downTo(long j, short s) {
        return LongProgression.Companion.fromClosedRange(j, s, -1L);
    }

    @NotNull
    public static final IntProgression downTo(byte b2, short s) {
        return IntProgression.Companion.fromClosedRange(b2, s, -1);
    }

    @NotNull
    public static LongRange until(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange(j, j2 - 1);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @NotNull ClosedRange<T> range) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return (T) coerceIn((Comparable) t, (ClosedFloatingPointRange) range);
        }
        if (!range.isEmpty()) {
            if (t.compareTo(range.getStart()) < 0) {
                return (T) range.getStart();
            }
            return t.compareTo(range.getEndInclusive()) > 0 ? (T) range.getEndInclusive() : t;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    public static final IntProgression downTo(short s, short s2) {
        return IntProgression.Companion.fromClosedRange(s, s2, -1);
    }

    @NotNull
    public static final LongRange until(byte b2, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange(b2, j - 1);
    }

    @NotNull
    public static final LongRange until(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.Companion.getEMPTY();
        }
        return new LongRange(s, j - 1);
    }

    @NotNull
    public static IntRange until(int i, short s) {
        return new IntRange(i, s - 1);
    }

    public static int coerceIn(int i, @NotNull ClosedRange<Integer> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Integer.valueOf(i), (ClosedFloatingPointRange<Integer>) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i < ((Number) range.getStart()).intValue()) {
                return ((Number) range.getStart()).intValue();
            }
            return i > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @NotNull
    public static final LongRange until(long j, short s) {
        return new LongRange(j, ((long) s) - 1);
    }

    @NotNull
    public static final IntRange until(byte b2, short s) {
        return new IntRange(b2, s - 1);
    }

    @NotNull
    public static final IntRange until(short s, short s2) {
        return new IntRange(s, s2 - 1);
    }

    public static long coerceIn(long j, @NotNull ClosedRange<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Long.valueOf(j), (ClosedFloatingPointRange<Long>) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j < ((Number) range.getStart()).longValue()) {
                return ((Number) range.getStart()).longValue();
            }
            return j > ((Number) range.getEndInclusive()).longValue() ? ((Number) range.getEndInclusive()).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }
}
