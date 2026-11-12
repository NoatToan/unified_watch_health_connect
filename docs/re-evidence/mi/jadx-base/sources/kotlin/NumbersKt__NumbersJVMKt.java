package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
class NumbersKt__NumbersJVMKt extends NumbersKt__FloorDivModKt {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(int i) {
        return Integer.bitCount(i);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double fromBits(DoubleCompanionObject doubleCompanionObject, long j) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return Double.longBitsToDouble(j);
    }

    @InlineOnly
    private static final boolean isFinite(double d) {
        return (Double.isInfinite(d) || Double.isNaN(d)) ? false : true;
    }

    @InlineOnly
    private static final boolean isInfinite(double d) {
        return Double.isInfinite(d);
    }

    @InlineOnly
    private static final boolean isNaN(double d) {
        return Double.isNaN(d);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int rotateLeft(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int rotateRight(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int takeHighestOneBit(int i) {
        return Integer.highestOneBit(i);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int takeLowestOneBit(int i) {
        return Integer.lowestOneBit(i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long toBits(double d) {
        return Double.doubleToLongBits(d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long toRawBits(double d) {
        return Double.doubleToRawLongBits(d);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(long j) {
        return Long.bitCount(j);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float fromBits(FloatCompanionObject floatCompanionObject, int i) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return Float.intBitsToFloat(i);
    }

    @InlineOnly
    private static final boolean isFinite(float f) {
        return (Float.isInfinite(f) || Float.isNaN(f)) ? false : true;
    }

    @InlineOnly
    private static final boolean isInfinite(float f) {
        return Float.isInfinite(f);
    }

    @InlineOnly
    private static final boolean isNaN(float f) {
        return Float.isNaN(f);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long rotateLeft(long j, int i) {
        return Long.rotateLeft(j, i);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long rotateRight(long j, int i) {
        return Long.rotateRight(j, i);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long takeHighestOneBit(long j) {
        return Long.highestOneBit(j);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final long takeLowestOneBit(long j) {
        return Long.lowestOneBit(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int toBits(float f) {
        return Float.floatToIntBits(f);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int toRawBits(float f) {
        return Float.floatToRawIntBits(f);
    }
}
