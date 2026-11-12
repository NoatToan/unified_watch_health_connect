package org.apache.commons.lang.math;

import java.io.Serializable;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.apache.commons.lang.text.StrBuilder;

/* JADX INFO: loaded from: classes23.dex */
public final class IntRange extends Range implements Serializable {
    private static final long serialVersionUID = 71849363892730L;
    private final int a;
    private final int b;
    private transient Integer c;
    private transient Integer d;
    private transient int e;
    private transient String f;

    public IntRange(int i) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        this.a = i;
        this.b = i;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsInteger(int i) {
        return i >= this.a && i <= this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsNumber(Number number) {
        if (number == null) {
            return false;
        }
        return containsInteger(number.intValue());
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsRange(Range range) {
        return range != null && containsInteger(range.getMinimumInteger()) && containsInteger(range.getMaximumInteger());
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntRange)) {
            return false;
        }
        IntRange intRange = (IntRange) obj;
        return this.a == intRange.a && this.b == intRange.b;
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
        return this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public long getMaximumLong() {
        return this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMaximumNumber() {
        if (this.d == null) {
            this.d = new Integer(this.b);
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
        return this.a;
    }

    @Override // org.apache.commons.lang.math.Range
    public long getMinimumLong() {
        return this.a;
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMinimumNumber() {
        if (this.c == null) {
            this.c = new Integer(this.a);
        }
        return this.c;
    }

    @Override // org.apache.commons.lang.math.Range
    public int hashCode() {
        if (this.e == 0) {
            this.e = 17;
            int iHashCode = (17 * 37) + IntRange.class.hashCode();
            this.e = iHashCode;
            int i = (iHashCode * 37) + this.a;
            this.e = i;
            this.e = (i * 37) + this.b;
        }
        return this.e;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean overlapsRange(Range range) {
        if (range == null) {
            return false;
        }
        return range.containsInteger(this.a) || range.containsInteger(this.b) || containsInteger(range.getMinimumInteger());
    }

    public int[] toArray() {
        int i = (this.b - this.a) + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = this.a + i2;
        }
        return iArr;
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

    public IntRange(Number number) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (number != null) {
            this.a = number.intValue();
            this.b = number.intValue();
            if (number instanceof Integer) {
                Integer num = (Integer) number;
                this.c = num;
                this.d = num;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The number must not be null");
    }

    public IntRange(int i, int i2) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (i2 < i) {
            this.a = i2;
            this.b = i;
        } else {
            this.a = i;
            this.b = i2;
        }
    }

    public IntRange(Number number, Number number2) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (number != null && number2 != null) {
            int iIntValue = number.intValue();
            int iIntValue2 = number2.intValue();
            if (iIntValue2 < iIntValue) {
                this.a = iIntValue2;
                this.b = iIntValue;
                if (number2 instanceof Integer) {
                    this.c = (Integer) number2;
                }
                if (number instanceof Integer) {
                    this.d = (Integer) number;
                    return;
                }
                return;
            }
            this.a = iIntValue;
            this.b = iIntValue2;
            if (number instanceof Integer) {
                this.c = (Integer) number;
            }
            if (number2 instanceof Integer) {
                this.d = (Integer) number2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The numbers must not be null");
    }
}
