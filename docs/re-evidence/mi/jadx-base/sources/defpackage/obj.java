package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class obj {
    public boolean containsDouble(Number number) {
        if (number == null) {
            return false;
        }
        return containsDouble(number.doubleValue());
    }

    public boolean containsFloat(Number number) {
        if (number == null) {
            return false;
        }
        return containsFloat(number.floatValue());
    }

    public boolean containsInteger(Number number) {
        if (number == null) {
            return false;
        }
        return containsInteger(number.intValue());
    }

    public boolean containsLong(Number number) {
        if (number == null) {
            return false;
        }
        return containsLong(number.longValue());
    }

    public abstract boolean containsNumber(Number number);

    public boolean containsRange(obj objVar) {
        return objVar != null && containsNumber(objVar.getMinimumNumber()) && containsNumber(objVar.getMaximumNumber());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        obj objVar = (obj) obj;
        return getMinimumNumber().equals(objVar.getMinimumNumber()) && getMaximumNumber().equals(objVar.getMaximumNumber());
    }

    public double getMaximumDouble() {
        return getMaximumNumber().doubleValue();
    }

    public float getMaximumFloat() {
        return getMaximumNumber().floatValue();
    }

    public int getMaximumInteger() {
        return getMaximumNumber().intValue();
    }

    public long getMaximumLong() {
        return getMaximumNumber().longValue();
    }

    public abstract Number getMaximumNumber();

    public double getMinimumDouble() {
        return getMinimumNumber().doubleValue();
    }

    public float getMinimumFloat() {
        return getMinimumNumber().floatValue();
    }

    public int getMinimumInteger() {
        return getMinimumNumber().intValue();
    }

    public long getMinimumLong() {
        return getMinimumNumber().longValue();
    }

    public abstract Number getMinimumNumber();

    public int hashCode() {
        return ((((629 + getClass().hashCode()) * 37) + getMinimumNumber().hashCode()) * 37) + getMaximumNumber().hashCode();
    }

    public boolean overlapsRange(obj objVar) {
        if (objVar == null) {
            return false;
        }
        return objVar.containsNumber(getMinimumNumber()) || objVar.containsNumber(getMaximumNumber()) || containsNumber(objVar.getMinimumNumber());
    }

    public String toString() {
        eio eioVar = new eio(32);
        eioVar.f("Range[");
        eioVar.e(getMinimumNumber());
        eioVar.a(',');
        eioVar.e(getMaximumNumber());
        eioVar.a(AbstractJsonLexerKt.END_LIST);
        return eioVar.toString();
    }

    public boolean containsDouble(double d) {
        return t2h.a(getMinimumDouble(), d) <= 0 && t2h.a(getMaximumDouble(), d) >= 0;
    }

    public boolean containsFloat(float f) {
        return t2h.b(getMinimumFloat(), f) <= 0 && t2h.b(getMaximumFloat(), f) >= 0;
    }

    public boolean containsInteger(int i) {
        return i >= getMinimumInteger() && i <= getMaximumInteger();
    }

    public boolean containsLong(long j) {
        return j >= getMinimumLong() && j <= getMaximumLong();
    }
}
