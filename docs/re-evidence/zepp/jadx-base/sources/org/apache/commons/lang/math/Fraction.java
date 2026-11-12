package org.apache.commons.lang.math;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.huami.ecg.core.db.entity.EcgData;
import io.netty.util.internal.StringUtil;
import java.math.BigInteger;
import org.apache.commons.lang.text.StrBuilder;

/* JADX INFO: loaded from: classes23.dex */
public final class Fraction extends Number implements Comparable {
    private static final long serialVersionUID = 65382027393090L;
    private final int a;
    private final int b;
    private transient int c = 0;
    private transient String d = null;
    private transient String e = null;
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction ONE = new Fraction(1, 1);
    public static final Fraction ONE_HALF = new Fraction(1, 2);
    public static final Fraction ONE_THIRD = new Fraction(1, 3);
    public static final Fraction TWO_THIRDS = new Fraction(2, 3);
    public static final Fraction ONE_QUARTER = new Fraction(1, 4);
    public static final Fraction TWO_QUARTERS = new Fraction(2, 4);
    public static final Fraction THREE_QUARTERS = new Fraction(3, 4);
    public static final Fraction ONE_FIFTH = new Fraction(1, 5);
    public static final Fraction TWO_FIFTHS = new Fraction(2, 5);
    public static final Fraction THREE_FIFTHS = new Fraction(3, 5);
    public static final Fraction FOUR_FIFTHS = new Fraction(4, 5);

    private Fraction(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private static int a(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        if (j < ParserMinimalBase.MIN_INT_L || j > ParserMinimalBase.MAX_INT_L) {
            throw new ArithmeticException("overflow: add");
        }
        return (int) j;
    }

    private Fraction b(Fraction fraction, boolean z) {
        if (fraction == null) {
            throw new IllegalArgumentException("The fraction must not be null");
        }
        if (this.a == 0) {
            return z ? fraction : fraction.negate();
        }
        if (fraction.a == 0) {
            return this;
        }
        int iC = c(this.b, fraction.b);
        if (iC == 1) {
            int iE = e(this.a, fraction.b);
            int iE2 = e(fraction.a, this.b);
            return new Fraction(z ? a(iE, iE2) : g(iE, iE2), f(this.b, fraction.b));
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(this.a).multiply(BigInteger.valueOf(fraction.b / iC));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(fraction.a).multiply(BigInteger.valueOf(this.b / iC));
        BigInteger bigIntegerAdd = z ? bigIntegerMultiply.add(bigIntegerMultiply2) : bigIntegerMultiply.subtract(bigIntegerMultiply2);
        int iIntValue = bigIntegerAdd.mod(BigInteger.valueOf(iC)).intValue();
        int iC2 = iIntValue == 0 ? iC : c(iIntValue, iC);
        BigInteger bigIntegerDivide = bigIntegerAdd.divide(BigInteger.valueOf(iC2));
        if (bigIntegerDivide.bitLength() <= 31) {
            return new Fraction(bigIntegerDivide.intValue(), f(this.b / iC, fraction.b / iC2));
        }
        throw new ArithmeticException("overflow: numerator too large after multiply");
    }

    private static int c(int i, int i2) {
        int i3;
        if (Math.abs(i) <= 1 || Math.abs(i2) <= 1) {
            return 1;
        }
        if (i > 0) {
            i = -i;
        }
        if (i2 > 0) {
            i2 = -i2;
        }
        int i4 = 0;
        while (true) {
            i3 = i & 1;
            if (i3 != 0 || (i2 & 1) != 0 || i4 >= 31) {
                break;
            }
            i /= 2;
            i2 /= 2;
            i4++;
        }
        if (i4 == 31) {
            throw new ArithmeticException("overflow: gcd is 2^31");
        }
        int i5 = i3 == 1 ? i2 : -(i / 2);
        while (true) {
            if ((i5 & 1) == 0) {
                i5 /= 2;
            } else {
                if (i5 > 0) {
                    i = -i5;
                } else {
                    i2 = i5;
                }
                i5 = (i2 - i) / 2;
                if (i5 == 0) {
                    return (-i) * (1 << i4);
                }
            }
        }
    }

    private static int e(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        if (j < ParserMinimalBase.MIN_INT_L || j > ParserMinimalBase.MAX_INT_L) {
            throw new ArithmeticException("overflow: mul");
        }
        return (int) j;
    }

    private static int f(int i, int i2) {
        long j = ((long) i) * ((long) i2);
        if (j <= ParserMinimalBase.MAX_INT_L) {
            return (int) j;
        }
        throw new ArithmeticException("overflow: mulPos");
    }

    private static int g(int i, int i2) {
        long j = ((long) i) - ((long) i2);
        if (j < ParserMinimalBase.MIN_INT_L || j > ParserMinimalBase.MAX_INT_L) {
            throw new ArithmeticException("overflow: add");
        }
        return (int) j;
    }

    public static Fraction getFraction(int i, int i2) {
        if (i2 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (i2 < 0) {
            if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: can't negate");
            }
            i = -i;
            i2 = -i2;
        }
        return new Fraction(i, i2);
    }

    public static Fraction getReducedFraction(int i, int i2) {
        if (i2 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (i == 0) {
            return ZERO;
        }
        if (i2 == Integer.MIN_VALUE && (i & 1) == 0) {
            i /= 2;
            i2 /= 2;
        }
        if (i2 < 0) {
            if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: can't negate");
            }
            i = -i;
            i2 = -i2;
        }
        int iC = c(i, i2);
        return new Fraction(i / iC, i2 / iC);
    }

    public Fraction abs() {
        return this.a >= 0 ? this : negate();
    }

    public Fraction add(Fraction fraction) {
        return b(fraction, true);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Fraction fraction = (Fraction) obj;
        if (this == fraction) {
            return 0;
        }
        int i = this.a;
        int i2 = fraction.a;
        if (i == i2 && this.b == fraction.b) {
            return 0;
        }
        long j = ((long) i) * ((long) fraction.b);
        long j2 = ((long) i2) * ((long) this.b);
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public Fraction divideBy(Fraction fraction) {
        if (fraction == null) {
            throw new IllegalArgumentException("The fraction must not be null");
        }
        if (fraction.a != 0) {
            return multiplyBy(fraction.invert());
        }
        throw new ArithmeticException("The fraction to divide by must not be zero");
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return ((double) this.a) / ((double) this.b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Fraction)) {
            return false;
        }
        Fraction fraction = (Fraction) obj;
        return getNumerator() == fraction.getNumerator() && getDenominator() == fraction.getDenominator();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.a / this.b;
    }

    public int getDenominator() {
        return this.b;
    }

    public int getNumerator() {
        return this.a;
    }

    public int getProperNumerator() {
        return Math.abs(this.a % this.b);
    }

    public int getProperWhole() {
        return this.a / this.b;
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = ((getNumerator() + 629) * 37) + getDenominator();
        }
        return this.c;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.a / this.b;
    }

    public Fraction invert() {
        int i = this.a;
        if (i == 0) {
            throw new ArithmeticException("Unable to invert zero.");
        }
        if (i != Integer.MIN_VALUE) {
            return i < 0 ? new Fraction(-this.b, -i) : new Fraction(this.b, i);
        }
        throw new ArithmeticException("overflow: can't negate numerator");
    }

    @Override // java.lang.Number
    public long longValue() {
        return ((long) this.a) / ((long) this.b);
    }

    public Fraction multiplyBy(Fraction fraction) {
        if (fraction == null) {
            throw new IllegalArgumentException("The fraction must not be null");
        }
        int i = this.a;
        if (i == 0 || fraction.a == 0) {
            return ZERO;
        }
        int iC = c(i, fraction.b);
        int iC2 = c(fraction.a, this.b);
        return getReducedFraction(e(this.a / iC, fraction.a / iC2), f(this.b / iC2, fraction.b / iC));
    }

    public Fraction negate() {
        int i = this.a;
        if (i != Integer.MIN_VALUE) {
            return new Fraction(-i, this.b);
        }
        throw new ArithmeticException("overflow: too large to negate");
    }

    public Fraction pow(int i) {
        if (i == 1) {
            return this;
        }
        if (i == 0) {
            return ONE;
        }
        if (i < 0) {
            return i == Integer.MIN_VALUE ? invert().pow(2).pow(-(i / 2)) : invert().pow(-i);
        }
        Fraction fractionMultiplyBy = multiplyBy(this);
        return i % 2 == 0 ? fractionMultiplyBy.pow(i / 2) : fractionMultiplyBy.pow(i / 2).multiplyBy(this);
    }

    public Fraction reduce() {
        int i = this.a;
        if (i == 0) {
            Fraction fraction = ZERO;
            return equals(fraction) ? this : fraction;
        }
        int iC = c(Math.abs(i), this.b);
        return iC == 1 ? this : getFraction(this.a / iC, this.b / iC);
    }

    public Fraction subtract(Fraction fraction) {
        return b(fraction, false);
    }

    public String toProperString() {
        if (this.e == null) {
            int i = this.a;
            if (i == 0) {
                this.e = "0";
            } else {
                int i2 = this.b;
                if (i == i2) {
                    this.e = "1";
                } else if (i == i2 * (-1)) {
                    this.e = EcgData.DEFAULT_DIGIT_VALUE;
                } else {
                    if (i > 0) {
                        i = -i;
                    }
                    if (i < (-i2)) {
                        int properNumerator = getProperNumerator();
                        if (properNumerator == 0) {
                            this.e = Integer.toString(getProperWhole());
                        } else {
                            this.e = new StrBuilder(32).append(getProperWhole()).append(StringUtil.SPACE).append(properNumerator).append('/').append(getDenominator()).toString();
                        }
                    } else {
                        this.e = new StrBuilder(32).append(getNumerator()).append('/').append(getDenominator()).toString();
                    }
                }
            }
        }
        return this.e;
    }

    public String toString() {
        if (this.d == null) {
            this.d = new StrBuilder(32).append(getNumerator()).append('/').append(getDenominator()).toString();
        }
        return this.d;
    }

    public static Fraction getFraction(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (i3 < 0) {
            throw new ArithmeticException("The denominator must not be negative");
        }
        if (i2 < 0) {
            throw new ArithmeticException("The numerator must not be negative");
        }
        long j = i < 0 ? (((long) i) * ((long) i3)) - ((long) i2) : (((long) i) * ((long) i3)) + ((long) i2);
        if (j >= ParserMinimalBase.MIN_INT_L && j <= ParserMinimalBase.MAX_INT_L) {
            return new Fraction((int) j, i3);
        }
        throw new ArithmeticException("Numerator too large to represent as an Integer.");
    }

    public static Fraction getFraction(double d) {
        int i;
        int i2;
        int i3 = d < 0.0d ? -1 : 1;
        double dAbs = Math.abs(d);
        if (dAbs > 2.147483647E9d || Double.isNaN(dAbs)) {
            throw new ArithmeticException("The value must not be greater than Integer.MAX_VALUE or NaN");
        }
        int i4 = (int) dAbs;
        double d2 = dAbs - ((double) i4);
        int i5 = (int) d2;
        double d3 = 1.0d;
        double d4 = d2 - ((double) i5);
        double dAbs2 = Double.MAX_VALUE;
        int i6 = i3;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int i12 = (int) (d3 / d4);
            double d5 = dAbs2;
            double d6 = d3 - (((double) i12) * d4);
            int i13 = (i5 * i7) + i8;
            int i14 = (i5 * i9) + i10;
            dAbs2 = Math.abs(d2 - (((double) i13) / ((double) i14)));
            i = i11 + 1;
            if (d5 <= dAbs2 || i14 > 10000 || i14 <= 0) {
                i2 = 25;
                break;
            }
            i2 = 25;
            if (i >= 25) {
                break;
            }
            i11 = i;
            int i15 = i9;
            i9 = i14;
            i5 = i12;
            i8 = i7;
            i7 = i13;
            i10 = i15;
            d3 = d4;
            d4 = d6;
        }
        if (i != i2) {
            return getReducedFraction((i7 + (i4 * i9)) * i6, i9);
        }
        throw new ArithmeticException("Unable to convert double to fraction");
    }

    public static Fraction getFraction(String str) {
        if (str != null) {
            if (str.indexOf(46) >= 0) {
                return getFraction(Double.parseDouble(str));
            }
            int iIndexOf = str.indexOf(32);
            if (iIndexOf > 0) {
                int i = Integer.parseInt(str.substring(0, iIndexOf));
                String strSubstring = str.substring(iIndexOf + 1);
                int iIndexOf2 = strSubstring.indexOf(47);
                if (iIndexOf2 >= 0) {
                    return getFraction(i, Integer.parseInt(strSubstring.substring(0, iIndexOf2)), Integer.parseInt(strSubstring.substring(iIndexOf2 + 1)));
                }
                throw new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
            }
            int iIndexOf3 = str.indexOf(47);
            if (iIndexOf3 < 0) {
                return getFraction(Integer.parseInt(str), 1);
            }
            return getFraction(Integer.parseInt(str.substring(0, iIndexOf3)), Integer.parseInt(str.substring(iIndexOf3 + 1)));
        }
        throw new IllegalArgumentException("The string must not be null");
    }
}
