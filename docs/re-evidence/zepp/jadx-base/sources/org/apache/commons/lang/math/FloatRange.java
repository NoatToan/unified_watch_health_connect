package org.apache.commons.lang.math;

import java.io.Serializable;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes23.dex */
public final class FloatRange extends Range implements Serializable {
    private static final long serialVersionUID = 71849363892750L;
    private final float a;
    private final float b;
    private transient Float c;
    private transient Float d;
    private transient int e;
    private transient String f;

    public FloatRange(float f) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("The number must not be NaN");
        }
        this.a = f;
        this.b = f;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsFloat(float f) {
        return f >= this.a && f <= this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsNumber(Number number) {
        if (number == null) {
            return false;
        }
        return containsFloat(number.floatValue());
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsRange(Range range) {
        return range != null && containsFloat(range.getMinimumFloat()) && containsFloat(range.getMaximumFloat());
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatRange)) {
            return false;
        }
        FloatRange floatRange = (FloatRange) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(floatRange.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(floatRange.b);
    }

    @Override // org.apache.commons.lang.math.Range
    public double getMaximumDouble() {
        return this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public float getMaximumFloat() {
        return this.b;
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
            this.d = new Float(this.b);
        }
        return this.d;
    }

    @Override // org.apache.commons.lang.math.Range
    public double getMinimumDouble() {
        return this.a;
    }

    @Override // org.apache.commons.lang.math.Range
    public float getMinimumFloat() {
        return this.a;
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
            this.c = new Float(this.a);
        }
        return this.c;
    }

    @Override // org.apache.commons.lang.math.Range
    public int hashCode() {
        if (this.e == 0) {
            this.e = 17;
            int iHashCode = (17 * 37) + FloatRange.class.hashCode();
            this.e = iHashCode;
            int iFloatToIntBits = (iHashCode * 37) + Float.floatToIntBits(this.a);
            this.e = iFloatToIntBits;
            this.e = (iFloatToIntBits * 37) + Float.floatToIntBits(this.b);
        }
        return this.e;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean overlapsRange(Range range) {
        if (range == null) {
            return false;
        }
        return range.containsFloat(this.a) || range.containsFloat(this.b) || containsFloat(range.getMinimumFloat());
    }

    @Override // org.apache.commons.lang.math.Range
    public String toString() {
        if (this.f == null) {
            StringBuffer stringBuffer = new StringBuffer(32);
            stringBuffer.append("Range[");
            stringBuffer.append(this.a);
            stringBuffer.append(',');
            stringBuffer.append(this.b);
            stringBuffer.append(JsonLexerKt.END_LIST);
            this.f = stringBuffer.toString();
        }
        return this.f;
    }

    public FloatRange(Number number) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (number != null) {
            float fFloatValue = number.floatValue();
            this.a = fFloatValue;
            float fFloatValue2 = number.floatValue();
            this.b = fFloatValue2;
            if (!Float.isNaN(fFloatValue) && !Float.isNaN(fFloatValue2)) {
                if (number instanceof Float) {
                    Float f = (Float) number;
                    this.c = f;
                    this.d = f;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("The number must not be NaN");
        }
        throw new IllegalArgumentException("The number must not be null");
    }

    public FloatRange(float f, float f2) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            throw new IllegalArgumentException("The numbers must not be NaN");
        }
        if (f2 < f) {
            this.a = f2;
            this.b = f;
        } else {
            this.a = f;
            this.b = f2;
        }
    }

    public FloatRange(Number number, Number number2) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (number != null && number2 != null) {
            float fFloatValue = number.floatValue();
            float fFloatValue2 = number2.floatValue();
            if (Float.isNaN(fFloatValue) || Float.isNaN(fFloatValue2)) {
                throw new IllegalArgumentException("The numbers must not be NaN");
            }
            if (fFloatValue2 < fFloatValue) {
                this.a = fFloatValue2;
                this.b = fFloatValue;
                if (number2 instanceof Float) {
                    this.c = (Float) number2;
                }
                if (number instanceof Float) {
                    this.d = (Float) number;
                    return;
                }
                return;
            }
            this.a = fFloatValue;
            this.b = fFloatValue2;
            if (number instanceof Float) {
                this.c = (Float) number;
            }
            if (number2 instanceof Float) {
                this.d = (Float) number2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The numbers must not be null");
    }
}
