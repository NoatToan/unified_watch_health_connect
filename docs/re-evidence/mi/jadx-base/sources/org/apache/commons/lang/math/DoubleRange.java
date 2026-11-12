package org.apache.commons.lang.math;

import defpackage.eio;
import defpackage.obj;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class DoubleRange extends obj implements Serializable {
    private static final long serialVersionUID = 71849363892740L;
    private transient int hashCode;
    private final double max;
    private transient Double maxObject;
    private final double min;
    private transient Double minObject;
    private transient String toString;

    public DoubleRange(double d) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("The number must not be NaN");
        }
        this.min = d;
        this.max = d;
    }

    @Override // defpackage.obj
    public boolean containsDouble(double d) {
        return d >= this.min && d <= this.max;
    }

    @Override // defpackage.obj
    public boolean containsNumber(Number number) {
        if (number == null) {
            return false;
        }
        return containsDouble(number.doubleValue());
    }

    @Override // defpackage.obj
    public boolean containsRange(obj objVar) {
        return objVar != null && containsDouble(objVar.getMinimumDouble()) && containsDouble(objVar.getMaximumDouble());
    }

    @Override // defpackage.obj
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoubleRange)) {
            return false;
        }
        DoubleRange doubleRange = (DoubleRange) obj;
        return Double.doubleToLongBits(this.min) == Double.doubleToLongBits(doubleRange.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(doubleRange.max);
    }

    @Override // defpackage.obj
    public double getMaximumDouble() {
        return this.max;
    }

    @Override // defpackage.obj
    public float getMaximumFloat() {
        return (float) this.max;
    }

    @Override // defpackage.obj
    public int getMaximumInteger() {
        return (int) this.max;
    }

    @Override // defpackage.obj
    public long getMaximumLong() {
        return (long) this.max;
    }

    @Override // defpackage.obj
    public Number getMaximumNumber() {
        if (this.maxObject == null) {
            this.maxObject = new Double(this.max);
        }
        return this.maxObject;
    }

    @Override // defpackage.obj
    public double getMinimumDouble() {
        return this.min;
    }

    @Override // defpackage.obj
    public float getMinimumFloat() {
        return (float) this.min;
    }

    @Override // defpackage.obj
    public int getMinimumInteger() {
        return (int) this.min;
    }

    @Override // defpackage.obj
    public long getMinimumLong() {
        return (long) this.min;
    }

    @Override // defpackage.obj
    public Number getMinimumNumber() {
        if (this.minObject == null) {
            this.minObject = new Double(this.min);
        }
        return this.minObject;
    }

    @Override // defpackage.obj
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 17;
            this.hashCode = (17 * 37) + DoubleRange.class.hashCode();
            long jDoubleToLongBits = Double.doubleToLongBits(this.min);
            this.hashCode = (this.hashCode * 37) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >> 32)));
            long jDoubleToLongBits2 = Double.doubleToLongBits(this.max);
            this.hashCode = (this.hashCode * 37) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >> 32)));
        }
        return this.hashCode;
    }

    @Override // defpackage.obj
    public boolean overlapsRange(obj objVar) {
        if (objVar == null) {
            return false;
        }
        return objVar.containsDouble(this.min) || objVar.containsDouble(this.max) || containsDouble(objVar.getMinimumDouble());
    }

    @Override // defpackage.obj
    public String toString() {
        if (this.toString == null) {
            eio eioVar = new eio(32);
            eioVar.f("Range[");
            eioVar.b(this.min);
            eioVar.a(',');
            eioVar.b(this.max);
            eioVar.a(AbstractJsonLexerKt.END_LIST);
            this.toString = eioVar.toString();
        }
        return this.toString;
    }

    public DoubleRange(Number number) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (number != null) {
            double dDoubleValue = number.doubleValue();
            this.min = dDoubleValue;
            double dDoubleValue2 = number.doubleValue();
            this.max = dDoubleValue2;
            if (!Double.isNaN(dDoubleValue) && !Double.isNaN(dDoubleValue2)) {
                if (number instanceof Double) {
                    Double d = (Double) number;
                    this.minObject = d;
                    this.maxObject = d;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("The number must not be NaN");
        }
        throw new IllegalArgumentException("The number must not be null");
    }

    public DoubleRange(double d, double d2) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (Double.isNaN(d) || Double.isNaN(d2)) {
            throw new IllegalArgumentException("The numbers must not be NaN");
        }
        if (d2 < d) {
            this.min = d2;
            this.max = d;
        } else {
            this.min = d;
            this.max = d2;
        }
    }

    public DoubleRange(Number number, Number number2) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (number != null && number2 != null) {
            double dDoubleValue = number.doubleValue();
            double dDoubleValue2 = number2.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2)) {
                throw new IllegalArgumentException("The numbers must not be NaN");
            }
            if (dDoubleValue2 < dDoubleValue) {
                this.min = dDoubleValue2;
                this.max = dDoubleValue;
                if (number2 instanceof Double) {
                    this.minObject = (Double) number2;
                }
                if (number instanceof Double) {
                    this.maxObject = (Double) number;
                    return;
                }
                return;
            }
            this.min = dDoubleValue;
            this.max = dDoubleValue2;
            if (number instanceof Double) {
                this.minObject = (Double) number;
            }
            if (number2 instanceof Double) {
                this.maxObject = (Double) number2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The numbers must not be null");
    }
}
