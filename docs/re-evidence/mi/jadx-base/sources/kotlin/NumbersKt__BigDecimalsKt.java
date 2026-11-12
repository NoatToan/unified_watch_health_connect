package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
class NumbersKt__BigDecimalsKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal dec(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(BigDecimal.ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @InlineOnly
    private static final BigDecimal div(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalDivide = bigDecimal.divide(other, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal inc(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalAdd = bigDecimal.add(BigDecimal.ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @InlineOnly
    private static final BigDecimal minus(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @InlineOnly
    private static final BigDecimal plus(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalAdd = bigDecimal.add(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @InlineOnly
    private static final BigDecimal rem(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalRemainder = bigDecimal.remainder(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimalRemainder, "remainder(...)");
        return bigDecimalRemainder;
    }

    @InlineOnly
    private static final BigDecimal times(BigDecimal bigDecimal, BigDecimal other) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(other);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(int i) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @InlineOnly
    private static final BigDecimal unaryMinus(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalNegate = bigDecimal.negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        return bigDecimalNegate;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(int i, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(i, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(long j) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(long j, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(j, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(float f, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(double d, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d), mathContext);
    }
}
