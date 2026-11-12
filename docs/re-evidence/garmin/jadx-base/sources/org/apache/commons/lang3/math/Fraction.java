package org.apache.commons.lang3.math;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
public final class Fraction extends Number implements Comparable<Fraction> {
    private static final long serialVersionUID = 65382027393090L;
    private final int denominator;
    private transient int hashCode;
    private final int numerator;
    private transient String toProperString;
    private transient String toString;
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

    private Fraction(int i14, int i15) {
        this.numerator = i14;
        this.denominator = i15;
    }

    private static int addAndCheck(int i14, int i15) {
        long j8 = ((long) i14) + ((long) i15);
        if (j8 >= -2147483648L && j8 <= 2147483647L) {
            return (int) j8;
        }
        e.u("overflow: add");
        return 0;
    }

    private Fraction addSub(Fraction fraction, boolean z14) {
        Validate.notNull(fraction, "fraction", new Object[0]);
        if (this.numerator == 0) {
            return z14 ? fraction : fraction.negate();
        }
        if (fraction.numerator == 0) {
            return this;
        }
        int iGreatestCommonDivisor = greatestCommonDivisor(this.denominator, fraction.denominator);
        int i14 = this.numerator;
        if (iGreatestCommonDivisor == 1) {
            int iMulAndCheck = mulAndCheck(i14, fraction.denominator);
            int iMulAndCheck2 = mulAndCheck(fraction.numerator, this.denominator);
            return new Fraction(z14 ? addAndCheck(iMulAndCheck, iMulAndCheck2) : subAndCheck(iMulAndCheck, iMulAndCheck2), mulPosAndCheck(this.denominator, fraction.denominator));
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(i14).multiply(BigInteger.valueOf(fraction.denominator / iGreatestCommonDivisor));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(fraction.numerator).multiply(BigInteger.valueOf(this.denominator / iGreatestCommonDivisor));
        BigInteger bigIntegerAdd = z14 ? bigIntegerMultiply.add(bigIntegerMultiply2) : bigIntegerMultiply.subtract(bigIntegerMultiply2);
        int iIntValue = bigIntegerAdd.mod(BigInteger.valueOf(iGreatestCommonDivisor)).intValue();
        int iGreatestCommonDivisor2 = iIntValue == 0 ? iGreatestCommonDivisor : greatestCommonDivisor(iIntValue, iGreatestCommonDivisor);
        BigInteger bigIntegerDivide = bigIntegerAdd.divide(BigInteger.valueOf(iGreatestCommonDivisor2));
        if (bigIntegerDivide.bitLength() <= 31) {
            return new Fraction(bigIntegerDivide.intValue(), mulPosAndCheck(this.denominator / iGreatestCommonDivisor, fraction.denominator / iGreatestCommonDivisor2));
        }
        e.u("overflow: numerator too large after multiply");
        return null;
    }

    public static Fraction getFraction(double d14) {
        int i14;
        int i15;
        int i16 = d14 < 0.0d ? -1 : 1;
        double dAbs = Math.abs(d14);
        if (dAbs > 2.147483647E9d || Double.isNaN(dAbs)) {
            e.u("The value must not be greater than Integer.MAX_VALUE or NaN");
            return null;
        }
        int i17 = (int) dAbs;
        double d15 = dAbs - ((double) i17);
        int i18 = (int) d15;
        double d16 = d15 - ((double) i18);
        double d17 = Double.MAX_VALUE;
        int i19 = 1;
        int i24 = 1;
        double d18 = 1.0d;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1;
        while (true) {
            int i28 = (int) (d18 / d16);
            double d19 = d18 - (((double) i28) * d16);
            int i29 = (i18 * i27) + i25;
            int i30 = (i18 * i26) + i19;
            i14 = i16;
            double dAbs2 = Math.abs(d15 - (((double) i29) / ((double) i30)));
            i15 = i24 + 1;
            if (d17 <= dAbs2 || i30 > 10000 || i30 <= 0 || i15 >= 25) {
                break;
            }
            d17 = dAbs2;
            i16 = i14;
            i24 = i15;
            i25 = i27;
            i19 = i26;
            i27 = i29;
            i26 = i30;
            i18 = i28;
            d18 = d16;
            d16 = d19;
        }
        if (i15 != 25) {
            return getReducedFraction(((i17 * i26) + i27) * i14, i26);
        }
        e.u("Unable to convert double to fraction");
        return null;
    }

    public static Fraction getReducedFraction(int i14, int i15) {
        if (i15 == 0) {
            e.u("The denominator must not be zero");
            return null;
        }
        if (i14 == 0) {
            return ZERO;
        }
        if (i15 == Integer.MIN_VALUE && (i14 & 1) == 0) {
            i14 /= 2;
            i15 /= 2;
        }
        if (i15 < 0) {
            if (i14 == Integer.MIN_VALUE || i15 == Integer.MIN_VALUE) {
                e.u("overflow: can't negate");
                return null;
            }
            i14 = -i14;
            i15 = -i15;
        }
        int iGreatestCommonDivisor = greatestCommonDivisor(i14, i15);
        return new Fraction(i14 / iGreatestCommonDivisor, i15 / iGreatestCommonDivisor);
    }

    private static int greatestCommonDivisor(int i14, int i15) {
        int i16;
        if (i14 == 0 || i15 == 0) {
            if (i14 != Integer.MIN_VALUE && i15 != Integer.MIN_VALUE) {
                return Math.abs(i15) + Math.abs(i14);
            }
            e.u("overflow: gcd is 2^31");
            return 0;
        }
        if (Math.abs(i14) == 1 || Math.abs(i15) == 1) {
            return 1;
        }
        if (i14 > 0) {
            i14 = -i14;
        }
        if (i15 > 0) {
            i15 = -i15;
        }
        int i17 = 0;
        while (true) {
            i16 = i14 & 1;
            if (i16 != 0 || (i15 & 1) != 0 || i17 >= 31) {
                break;
            }
            i14 /= 2;
            i15 /= 2;
            i17++;
        }
        if (i17 == 31) {
            e.u("overflow: gcd is 2^31");
            return 0;
        }
        int i18 = i16 == 1 ? i15 : -(i14 / 2);
        while (true) {
            if ((i18 & 1) == 0) {
                i18 /= 2;
            } else {
                if (i18 > 0) {
                    i14 = -i18;
                } else {
                    i15 = i18;
                }
                i18 = (i15 - i14) / 2;
                if (i18 == 0) {
                    return (-i14) * (1 << i17);
                }
            }
        }
    }

    private static int mulAndCheck(int i14, int i15) {
        long j8 = ((long) i14) * ((long) i15);
        if (j8 >= -2147483648L && j8 <= 2147483647L) {
            return (int) j8;
        }
        e.u("overflow: mul");
        return 0;
    }

    private static int mulPosAndCheck(int i14, int i15) {
        long j8 = ((long) i14) * ((long) i15);
        if (j8 <= 2147483647L) {
            return (int) j8;
        }
        e.u("overflow: mulPos");
        return 0;
    }

    private static int subAndCheck(int i14, int i15) {
        long j8 = ((long) i14) - ((long) i15);
        if (j8 >= -2147483648L && j8 <= 2147483647L) {
            return (int) j8;
        }
        e.u("overflow: add");
        return 0;
    }

    public Fraction abs() {
        return this.numerator >= 0 ? this : negate();
    }

    public Fraction add(Fraction fraction) {
        return addSub(fraction, true);
    }

    @Override // java.lang.Comparable
    public int compareTo(Fraction fraction) {
        if (this == fraction) {
            return 0;
        }
        int i14 = this.numerator;
        int i15 = fraction.numerator;
        if (i14 == i15 && this.denominator == fraction.denominator) {
            return 0;
        }
        return Long.compare(((long) i14) * ((long) fraction.denominator), ((long) i15) * ((long) this.denominator));
    }

    public Fraction divideBy(Fraction fraction) {
        Validate.notNull(fraction, "fraction", new Object[0]);
        if (fraction.numerator != 0) {
            return multiplyBy(fraction.invert());
        }
        e.u("The fraction to divide by must not be zero");
        return null;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return ((double) this.numerator) / ((double) this.denominator);
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
        return this.numerator / this.denominator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getProperNumerator() {
        return Math.abs(this.numerator % this.denominator);
    }

    public int getProperWhole() {
        return this.numerator / this.denominator;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = getDenominator() + ((getNumerator() + 629) * 37);
        }
        return this.hashCode;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.numerator / this.denominator;
    }

    public Fraction invert() {
        int i14 = this.numerator;
        if (i14 == 0) {
            e.u("Unable to invert zero.");
            return null;
        }
        if (i14 != Integer.MIN_VALUE) {
            int i15 = this.denominator;
            return i14 < 0 ? new Fraction(-i15, -i14) : new Fraction(i15, i14);
        }
        e.u("overflow: can't negate numerator");
        return null;
    }

    @Override // java.lang.Number
    public long longValue() {
        return ((long) this.numerator) / ((long) this.denominator);
    }

    public Fraction multiplyBy(Fraction fraction) {
        Validate.notNull(fraction, "fraction", new Object[0]);
        int i14 = this.numerator;
        if (i14 == 0 || fraction.numerator == 0) {
            return ZERO;
        }
        int iGreatestCommonDivisor = greatestCommonDivisor(i14, fraction.denominator);
        int iGreatestCommonDivisor2 = greatestCommonDivisor(fraction.numerator, this.denominator);
        return getReducedFraction(mulAndCheck(this.numerator / iGreatestCommonDivisor, fraction.numerator / iGreatestCommonDivisor2), mulPosAndCheck(this.denominator / iGreatestCommonDivisor2, fraction.denominator / iGreatestCommonDivisor));
    }

    public Fraction negate() {
        int i14 = this.numerator;
        if (i14 != Integer.MIN_VALUE) {
            return new Fraction(-i14, this.denominator);
        }
        e.u("overflow: too large to negate");
        return null;
    }

    public Fraction pow(int i14) {
        if (i14 == 1) {
            return this;
        }
        if (i14 == 0) {
            return ONE;
        }
        if (i14 < 0) {
            return i14 == Integer.MIN_VALUE ? invert().pow(2).pow(-(i14 / 2)) : invert().pow(-i14);
        }
        Fraction fractionMultiplyBy = multiplyBy(this);
        return i14 % 2 == 0 ? fractionMultiplyBy.pow(i14 / 2) : fractionMultiplyBy.pow(i14 / 2).multiplyBy(this);
    }

    public Fraction reduce() {
        int i14 = this.numerator;
        if (i14 == 0) {
            Fraction fraction = ZERO;
            if (!equals(fraction)) {
                return fraction;
            }
        } else {
            int iGreatestCommonDivisor = greatestCommonDivisor(Math.abs(i14), this.denominator);
            if (iGreatestCommonDivisor != 1) {
                return getFraction(this.numerator / iGreatestCommonDivisor, this.denominator / iGreatestCommonDivisor);
            }
        }
        return this;
    }

    public Fraction subtract(Fraction fraction) {
        return addSub(fraction, false);
    }

    public String toProperString() {
        if (this.toProperString == null) {
            int i14 = this.numerator;
            if (i14 == 0) {
                this.toProperString = "0";
            } else {
                int i15 = this.denominator;
                if (i14 == i15) {
                    this.toProperString = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                } else if (i14 == i15 * (-1)) {
                    this.toProperString = "-1";
                } else {
                    if (i14 > 0) {
                        i14 = -i14;
                    }
                    if (i14 < (-i15)) {
                        int properNumerator = getProperNumerator();
                        if (properNumerator == 0) {
                            this.toProperString = Integer.toString(getProperWhole());
                        } else {
                            this.toProperString = getProperWhole() + StringUtils.SPACE + properNumerator + "/" + getDenominator();
                        }
                    } else {
                        this.toProperString = getNumerator() + "/" + getDenominator();
                    }
                }
            }
        }
        return this.toProperString;
    }

    public String toString() {
        if (this.toString == null) {
            this.toString = getNumerator() + "/" + getDenominator();
        }
        return this.toString;
    }

    public static Fraction getFraction(int i14, int i15, int i16) {
        if (i16 == 0) {
            e.u("The denominator must not be zero");
            return null;
        }
        if (i16 < 0) {
            e.u("The denominator must not be negative");
            return null;
        }
        if (i15 < 0) {
            e.u("The numerator must not be negative");
            return null;
        }
        long j8 = i14 < 0 ? (((long) i14) * ((long) i16)) - ((long) i15) : (((long) i14) * ((long) i16)) + ((long) i15);
        if (j8 >= -2147483648L && j8 <= 2147483647L) {
            return new Fraction((int) j8, i16);
        }
        e.u("Numerator too large to represent as an Integer.");
        return null;
    }

    public static Fraction getFraction(int i14, int i15) {
        if (i15 != 0) {
            if (i15 < 0) {
                if (i14 == Integer.MIN_VALUE || i15 == Integer.MIN_VALUE) {
                    e.u("overflow: can't negate");
                    return null;
                }
                i14 = -i14;
                i15 = -i15;
            }
            return new Fraction(i14, i15);
        }
        e.u("The denominator must not be zero");
        return null;
    }

    public static Fraction getFraction(String str) {
        Validate.notNull(str, "str", new Object[0]);
        if (str.indexOf(46) >= 0) {
            return getFraction(Double.parseDouble(str));
        }
        int iIndexOf = str.indexOf(32);
        if (iIndexOf > 0) {
            int i14 = Integer.parseInt(str.substring(0, iIndexOf));
            String strSubstring = str.substring(iIndexOf + 1);
            int iIndexOf2 = strSubstring.indexOf(47);
            if (iIndexOf2 >= 0) {
                return getFraction(i14, Integer.parseInt(strSubstring.substring(0, iIndexOf2)), Integer.parseInt(strSubstring.substring(iIndexOf2 + 1)));
            }
            throw new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
        }
        int iIndexOf3 = str.indexOf(47);
        if (iIndexOf3 < 0) {
            return getFraction(Integer.parseInt(str), 1);
        }
        return getFraction(Integer.parseInt(str.substring(0, iIndexOf3)), Integer.parseInt(str.substring(iIndexOf3 + 1)));
    }
}
