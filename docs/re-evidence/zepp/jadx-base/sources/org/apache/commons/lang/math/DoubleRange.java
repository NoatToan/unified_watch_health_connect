package org.apache.commons.lang.math;

import java.io.Serializable;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.apache.commons.lang.text.StrBuilder;

/* JADX INFO: loaded from: classes23.dex */
public final class DoubleRange extends Range implements Serializable {
    private static final long serialVersionUID = 71849363892740L;
    private final double a;
    private final double b;
    private transient Double c;
    private transient Double d;
    private transient int e;
    private transient String f;

    public DoubleRange(double d) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("The number must not be NaN");
        }
        this.a = d;
        this.b = d;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsDouble(double d) {
        return d >= this.a && d <= this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsNumber(Number number) {
        if (number == null) {
            return false;
        }
        return containsDouble(number.doubleValue());
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsRange(Range range) {
        return range != null && containsDouble(range.getMinimumDouble()) && containsDouble(range.getMaximumDouble());
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoubleRange)) {
            return false;
        }
        DoubleRange doubleRange = (DoubleRange) obj;
        return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(doubleRange.a) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(doubleRange.b);
    }

    @Override // org.apache.commons.lang.math.Range
    public double getMaximumDouble() {
        return this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public float getMaximumFloat() {
        return (float) this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public int getMaximumInteger() {
        return (int) this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public long getMaximumLong() {
        return (long) this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMaximumNumber() {
        if (this.d == null) {
            this.d = new Double(this.b);
        }
        return this.d;
    }

    @Override // org.apache.commons.lang.math.Range
    public double getMinimumDouble() {
        return this.a;
    }

    @Override // org.apache.commons.lang.math.Range
    public float getMinimumFloat() {
        return (float) this.a;
    }

    @Override // org.apache.commons.lang.math.Range
    public int getMinimumInteger() {
        return (int) this.a;
    }

    @Override // org.apache.commons.lang.math.Range
    public long getMinimumLong() {
        return (long) this.a;
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMinimumNumber() {
        if (this.c == null) {
            this.c = new Double(this.a);
        }
        return this.c;
    }

    @Override // org.apache.commons.lang.math.Range
    public int hashCode() {
        if (this.e == 0) {
            this.e = 17;
            this.e = (17 * 37) + DoubleRange.class.hashCode();
            long jDoubleToLongBits = Double.doubleToLongBits(this.a);
            this.e = (this.e * 37) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >> 32)));
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
            this.e = (this.e * 37) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >> 32)));
        }
        return this.e;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean overlapsRange(Range range) {
        if (range == null) {
            return false;
        }
        return range.containsDouble(this.a) || range.containsDouble(this.b) || containsDouble(range.getMinimumDouble());
    }

    @Override // org.apache.commons.lang.math.Range
    public String toString() {
        if (this.f == null) {
            StrBuilder strBuilder = new StrBuilder(32);
            strBuilder.append("Range[");
            strBuilder.append(this.a);
            strBuilder.append(',');
            strBuilder.append(this.b);
            strBuilder.append(JsonLexerKt.END_LIST);
            this.f = strBuilder.toString();
        }
        return this.f;
    }

    public DoubleRange(Number number) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (number != null) {
            double dDoubleValue = number.doubleValue();
            this.a = dDoubleValue;
            double dDoubleValue2 = number.doubleValue();
            this.b = dDoubleValue2;
            if (!Double.isNaN(dDoubleValue) && !Double.isNaN(dDoubleValue2)) {
                if (number instanceof Double) {
                    Double d = (Double) number;
                    this.c = d;
                    this.d = d;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("The number must not be NaN");
        }
        throw new IllegalArgumentException("The number must not be null");
    }

    public DoubleRange(double d, double d2) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (Double.isNaN(d) || Double.isNaN(d2)) {
            throw new IllegalArgumentException("The numbers must not be NaN");
        }
        if (d2 < d) {
            this.a = d2;
            this.b = d;
        } else {
            this.a = d;
            this.b = d2;
        }
    }

    public DoubleRange(Number number, Number number2) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (number != null && number2 != null) {
            double dDoubleValue = number.doubleValue();
            double dDoubleValue2 = number2.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2)) {
                throw new IllegalArgumentException("The numbers must not be NaN");
            }
            if (dDoubleValue2 < dDoubleValue) {
                this.a = dDoubleValue2;
                this.b = dDoubleValue;
                if (number2 instanceof Double) {
                    this.c = (Double) number2;
                }
                if (number instanceof Double) {
                    this.d = (Double) number;
                    return;
                }
                return;
            }
            this.a = dDoubleValue;
            this.b = dDoubleValue2;
            if (number instanceof Double) {
                this.c = (Double) number;
            }
            if (number2 instanceof Double) {
                this.d = (Double) number2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The numbers must not be null");
    }
}
