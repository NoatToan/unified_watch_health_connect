package kotlin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes23.dex */
class d {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal a(BigDecimal bigDecimal) {
        return bigDecimal.subtract(BigDecimal.ONE);
    }

    @InlineOnly
    private static final BigDecimal b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal c(BigDecimal bigDecimal) {
        return bigDecimal.add(BigDecimal.ONE);
    }

    @InlineOnly
    private static final BigDecimal d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.subtract(bigDecimal2);
    }

    @InlineOnly
    private static final BigDecimal e(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.add(bigDecimal2);
    }

    @InlineOnly
    private static final BigDecimal f(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.remainder(bigDecimal2);
    }

    @InlineOnly
    private static final BigDecimal g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.multiply(bigDecimal2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal h(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal i(double d, MathContext mathContext) {
        return new BigDecimal(String.valueOf(d), mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal j(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal k(float f, MathContext mathContext) {
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal l(int i) {
        return BigDecimal.valueOf(i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal m(int i, MathContext mathContext) {
        return new BigDecimal(i, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal n(long j) {
        return BigDecimal.valueOf(j);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal o(long j, MathContext mathContext) {
        return new BigDecimal(j, mathContext);
    }

    @InlineOnly
    private static final BigDecimal p(BigDecimal bigDecimal) {
        return bigDecimal.negate();
    }
}
