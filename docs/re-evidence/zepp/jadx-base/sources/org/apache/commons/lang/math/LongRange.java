package org.apache.commons.lang.math;

import java.io.Serializable;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.apache.commons.lang.text.StrBuilder;

/* JADX INFO: loaded from: classes23.dex */
public final class LongRange extends Range implements Serializable {
    private static final long serialVersionUID = 71849363892720L;
    private final long a;
    private final long b;
    private transient Long c;
    private transient Long d;
    private transient int e;
    private transient String f;

    public LongRange(long j) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        this.a = j;
        this.b = j;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsLong(long j) {
        return j >= this.a && j <= this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsNumber(Number number) {
        if (number == null) {
            return false;
        }
        return containsLong(number.longValue());
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsRange(Range range) {
        return range != null && containsLong(range.getMinimumLong()) && containsLong(range.getMaximumLong());
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongRange)) {
            return false;
        }
        LongRange longRange = (LongRange) obj;
        return this.a == longRange.a && this.b == longRange.b;
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
        return this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMaximumNumber() {
        if (this.d == null) {
            this.d = new Long(this.b);
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
        return this.a;
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMinimumNumber() {
        if (this.c == null) {
            this.c = new Long(this.a);
        }
        return this.c;
    }

    @Override // org.apache.commons.lang.math.Range
    public int hashCode() {
        if (this.e == 0) {
            this.e = 17;
            int iHashCode = (17 * 37) + LongRange.class.hashCode();
            this.e = iHashCode;
            long j = this.a;
            int i = (iHashCode * 37) + ((int) (j ^ (j >> 32)));
            this.e = i;
            long j2 = this.b;
            this.e = (i * 37) + ((int) (j2 ^ (j2 >> 32)));
        }
        return this.e;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean overlapsRange(Range range) {
        if (range == null) {
            return false;
        }
        return range.containsLong(this.a) || range.containsLong(this.b) || containsLong(range.getMinimumLong());
    }

    public long[] toArray() {
        int i = (int) ((this.b - this.a) + 1);
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = this.a + ((long) i2);
        }
        return jArr;
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

    public LongRange(Number number) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (number != null) {
            this.a = number.longValue();
            this.b = number.longValue();
            if (number instanceof Long) {
                Long l = (Long) number;
                this.c = l;
                this.d = l;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The number must not be null");
    }

    public LongRange(long j, long j2) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (j2 < j) {
            this.a = j2;
            this.b = j;
        } else {
            this.a = j;
            this.b = j2;
        }
    }

    public LongRange(Number number, Number number2) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = null;
        if (number != null && number2 != null) {
            long jLongValue = number.longValue();
            long jLongValue2 = number2.longValue();
            if (jLongValue2 < jLongValue) {
                this.a = jLongValue2;
                this.b = jLongValue;
                if (number2 instanceof Long) {
                    this.c = (Long) number2;
                }
                if (number instanceof Long) {
                    this.d = (Long) number;
                    return;
                }
                return;
            }
            this.a = jLongValue;
            this.b = jLongValue2;
            if (number instanceof Long) {
                this.c = (Long) number;
            }
            if (number2 instanceof Long) {
                this.d = (Long) number2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The numbers must not be null");
    }
}
