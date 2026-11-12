package org.apache.commons.lang.math;

import defpackage.eio;
import defpackage.obj;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class IntRange extends obj implements Serializable {
    private static final long serialVersionUID = 71849363892730L;
    private transient int hashCode;
    private final int max;
    private transient Integer maxObject;
    private final int min;
    private transient Integer minObject;
    private transient String toString;

    public IntRange(int i) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        this.min = i;
        this.max = i;
    }

    @Override // defpackage.obj
    public boolean containsInteger(int i) {
        return i >= this.min && i <= this.max;
    }

    @Override // defpackage.obj
    public boolean containsNumber(Number number) {
        if (number == null) {
            return false;
        }
        return containsInteger(number.intValue());
    }

    @Override // defpackage.obj
    public boolean containsRange(obj objVar) {
        return objVar != null && containsInteger(objVar.getMinimumInteger()) && containsInteger(objVar.getMaximumInteger());
    }

    @Override // defpackage.obj
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntRange)) {
            return false;
        }
        IntRange intRange = (IntRange) obj;
        return this.min == intRange.min && this.max == intRange.max;
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
        return this.max;
    }

    @Override // defpackage.obj
    public long getMaximumLong() {
        return this.max;
    }

    @Override // defpackage.obj
    public Number getMaximumNumber() {
        if (this.maxObject == null) {
            this.maxObject = new Integer(this.max);
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
        return this.min;
    }

    @Override // defpackage.obj
    public long getMinimumLong() {
        return this.min;
    }

    @Override // defpackage.obj
    public Number getMinimumNumber() {
        if (this.minObject == null) {
            this.minObject = new Integer(this.min);
        }
        return this.minObject;
    }

    @Override // defpackage.obj
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 17;
            this.hashCode = (((((17 * 37) + IntRange.class.hashCode()) * 37) + this.min) * 37) + this.max;
        }
        return this.hashCode;
    }

    @Override // defpackage.obj
    public boolean overlapsRange(obj objVar) {
        if (objVar == null) {
            return false;
        }
        return objVar.containsInteger(this.min) || objVar.containsInteger(this.max) || containsInteger(objVar.getMinimumInteger());
    }

    public int[] toArray() {
        int i = (this.max - this.min) + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = this.min + i2;
        }
        return iArr;
    }

    @Override // defpackage.obj
    public String toString() {
        if (this.toString == null) {
            eio eioVar = new eio(32);
            eioVar.f("Range[");
            eioVar.c(this.min);
            eioVar.a(',');
            eioVar.c(this.max);
            eioVar.a(AbstractJsonLexerKt.END_LIST);
            this.toString = eioVar.toString();
        }
        return this.toString;
    }

    public IntRange(Number number) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (number != null) {
            this.min = number.intValue();
            this.max = number.intValue();
            if (number instanceof Integer) {
                Integer num = (Integer) number;
                this.minObject = num;
                this.maxObject = num;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The number must not be null");
    }

    public IntRange(int i, int i2) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (i2 < i) {
            this.min = i2;
            this.max = i;
        } else {
            this.min = i;
            this.max = i2;
        }
    }

    public IntRange(Number number, Number number2) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (number != null && number2 != null) {
            int iIntValue = number.intValue();
            int iIntValue2 = number2.intValue();
            if (iIntValue2 < iIntValue) {
                this.min = iIntValue2;
                this.max = iIntValue;
                if (number2 instanceof Integer) {
                    this.minObject = (Integer) number2;
                }
                if (number instanceof Integer) {
                    this.maxObject = (Integer) number;
                    return;
                }
                return;
            }
            this.min = iIntValue;
            this.max = iIntValue2;
            if (number instanceof Integer) {
                this.minObject = (Integer) number;
            }
            if (number2 instanceof Integer) {
                this.maxObject = (Integer) number2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The numbers must not be null");
    }
}
