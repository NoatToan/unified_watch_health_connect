package org.apache.commons.lang.math;

import defpackage.eio;
import defpackage.obj;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class LongRange extends obj implements Serializable {
    private static final long serialVersionUID = 71849363892720L;
    private transient int hashCode;
    private final long max;
    private transient Long maxObject;
    private final long min;
    private transient Long minObject;
    private transient String toString;

    public LongRange(long j) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        this.min = j;
        this.max = j;
    }

    @Override // defpackage.obj
    public boolean containsLong(long j) {
        return j >= this.min && j <= this.max;
    }

    @Override // defpackage.obj
    public boolean containsNumber(Number number) {
        if (number == null) {
            return false;
        }
        return containsLong(number.longValue());
    }

    @Override // defpackage.obj
    public boolean containsRange(obj objVar) {
        return objVar != null && containsLong(objVar.getMinimumLong()) && containsLong(objVar.getMaximumLong());
    }

    @Override // defpackage.obj
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongRange)) {
            return false;
        }
        LongRange longRange = (LongRange) obj;
        return this.min == longRange.min && this.max == longRange.max;
    }

    @Override // defpackage.obj
    public double getMaximumDouble() {
        return this.max;
    }

    @Override // defpackage.obj
    public float getMaximumFloat() {
        return this.max;
    }

    @Override // defpackage.obj
    public int getMaximumInteger() {
        return (int) this.max;
    }

    @Override // defpackage.obj
    public long getMaximumLong() {
        return this.max;
    }

    @Override // defpackage.obj
    public Number getMaximumNumber() {
        if (this.maxObject == null) {
            this.maxObject = new Long(this.max);
        }
        return this.maxObject;
    }

    @Override // defpackage.obj
    public double getMinimumDouble() {
        return this.min;
    }

    @Override // defpackage.obj
    public float getMinimumFloat() {
        return this.min;
    }

    @Override // defpackage.obj
    public int getMinimumInteger() {
        return (int) this.min;
    }

    @Override // defpackage.obj
    public long getMinimumLong() {
        return this.min;
    }

    @Override // defpackage.obj
    public Number getMinimumNumber() {
        if (this.minObject == null) {
            this.minObject = new Long(this.min);
        }
        return this.minObject;
    }

    @Override // defpackage.obj
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 17;
            int iHashCode = ((17 * 37) + LongRange.class.hashCode()) * 37;
            long j = this.min;
            int i = (iHashCode + ((int) (j ^ (j >> 32)))) * 37;
            long j2 = this.max;
            this.hashCode = i + ((int) (j2 ^ (j2 >> 32)));
        }
        return this.hashCode;
    }

    @Override // defpackage.obj
    public boolean overlapsRange(obj objVar) {
        if (objVar == null) {
            return false;
        }
        return objVar.containsLong(this.min) || objVar.containsLong(this.max) || containsLong(objVar.getMinimumLong());
    }

    public long[] toArray() {
        int i = (int) ((this.max - this.min) + 1);
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = this.min + ((long) i2);
        }
        return jArr;
    }

    @Override // defpackage.obj
    public String toString() {
        if (this.toString == null) {
            eio eioVar = new eio(32);
            eioVar.f("Range[");
            eioVar.d(this.min);
            eioVar.a(',');
            eioVar.d(this.max);
            eioVar.a(AbstractJsonLexerKt.END_LIST);
            this.toString = eioVar.toString();
        }
        return this.toString;
    }

    public LongRange(Number number) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (number != null) {
            this.min = number.longValue();
            this.max = number.longValue();
            if (number instanceof Long) {
                Long l = (Long) number;
                this.minObject = l;
                this.maxObject = l;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The number must not be null");
    }

    public LongRange(long j, long j2) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (j2 < j) {
            this.min = j2;
            this.max = j;
        } else {
            this.min = j;
            this.max = j2;
        }
    }

    public LongRange(Number number, Number number2) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (number != null && number2 != null) {
            long jLongValue = number.longValue();
            long jLongValue2 = number2.longValue();
            if (jLongValue2 < jLongValue) {
                this.min = jLongValue2;
                this.max = jLongValue;
                if (number2 instanceof Long) {
                    this.minObject = (Long) number2;
                }
                if (number instanceof Long) {
                    this.maxObject = (Long) number;
                    return;
                }
                return;
            }
            this.min = jLongValue;
            this.max = jLongValue2;
            if (number instanceof Long) {
                this.minObject = (Long) number;
            }
            if (number2 instanceof Long) {
                this.maxObject = (Long) number2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The numbers must not be null");
    }
}
