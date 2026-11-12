package kotlin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes23.dex */
class e extends d {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger A(BigInteger bigInteger, int i) {
        return bigInteger.shiftRight(i);
    }

    @InlineOnly
    private static final BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.multiply(bigInteger2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal C(BigInteger bigInteger) {
        return new BigDecimal(bigInteger);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal D(BigInteger bigInteger, int i, MathContext mathContext) {
        return new BigDecimal(bigInteger, i, mathContext);
    }

    public static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
        }
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger F(int i) {
        return BigInteger.valueOf(i);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger G(long j) {
        return BigInteger.valueOf(j);
    }

    @InlineOnly
    private static final BigInteger H(BigInteger bigInteger) {
        return bigInteger.negate();
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger I(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.xor(bigInteger2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger q(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.and(bigInteger2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger r(BigInteger bigInteger) {
        return bigInteger.subtract(BigInteger.ONE);
    }

    @InlineOnly
    private static final BigInteger s(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.divide(bigInteger2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger t(BigInteger bigInteger) {
        return bigInteger.add(BigInteger.ONE);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger u(BigInteger bigInteger) {
        return bigInteger.not();
    }

    @InlineOnly
    private static final BigInteger v(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.subtract(bigInteger2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger w(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.or(bigInteger2);
    }

    @InlineOnly
    private static final BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.add(bigInteger2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final BigInteger y(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.remainder(bigInteger2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger z(BigInteger bigInteger, int i) {
        return bigInteger.shiftLeft(i);
    }
}
