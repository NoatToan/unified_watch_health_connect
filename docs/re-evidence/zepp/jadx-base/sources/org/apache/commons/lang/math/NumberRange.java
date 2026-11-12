package org.apache.commons.lang.math;

import java.io.Serializable;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.apache.commons.lang.text.StrBuilder;

/* JADX INFO: loaded from: classes23.dex */
public final class NumberRange extends Range implements Serializable {
    private static final long serialVersionUID = 71849363892710L;
    private final Number a;
    private final Number b;
    private transient int c = 0;
    private transient String d = null;

    public NumberRange(Number number) {
        if (number == null) {
            throw new IllegalArgumentException("The number must not be null");
        }
        if (!(number instanceof Comparable)) {
            throw new IllegalArgumentException("The number must implement Comparable");
        }
        if ((number instanceof Double) && ((Double) number).isNaN()) {
            throw new IllegalArgumentException("The number must not be NaN");
        }
        if ((number instanceof Float) && ((Float) number).isNaN()) {
            throw new IllegalArgumentException("The number must not be NaN");
        }
        this.a = number;
        this.b = number;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsNumber(Number number) {
        if (number == null) {
            return false;
        }
        if (number.getClass() == this.a.getClass()) {
            return ((Comparable) this.a).compareTo(number) <= 0 && ((Comparable) this.b).compareTo(number) >= 0;
        }
        throw new IllegalArgumentException("The number must be of the same type as the range numbers");
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NumberRange)) {
            return false;
        }
        NumberRange numberRange = (NumberRange) obj;
        return this.a.equals(numberRange.a) && this.b.equals(numberRange.b);
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMaximumNumber() {
        return this.b;
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMinimumNumber() {
        return this.a;
    }

    @Override // org.apache.commons.lang.math.Range
    public int hashCode() {
        if (this.c == 0) {
            this.c = 17;
            int iHashCode = (17 * 37) + NumberRange.class.hashCode();
            this.c = iHashCode;
            int iHashCode2 = (iHashCode * 37) + this.a.hashCode();
            this.c = iHashCode2;
            this.c = (iHashCode2 * 37) + this.b.hashCode();
        }
        return this.c;
    }

    @Override // org.apache.commons.lang.math.Range
    public String toString() {
        if (this.d == null) {
            StrBuilder strBuilder = new StrBuilder(32);
            strBuilder.append("Range[");
            strBuilder.append(this.a);
            strBuilder.append(',');
            strBuilder.append(this.b);
            strBuilder.append(JsonLexerKt.END_LIST);
            this.d = strBuilder.toString();
        }
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NumberRange(Number number, Number number2) {
        if (number != 0 && number2 != null) {
            if (number.getClass() == number2.getClass()) {
                if (number instanceof Comparable) {
                    if (number instanceof Double) {
                        if (((Double) number).isNaN() || ((Double) number2).isNaN()) {
                            throw new IllegalArgumentException("The number must not be NaN");
                        }
                    } else if ((number instanceof Float) && (((Float) number).isNaN() || ((Float) number2).isNaN())) {
                        throw new IllegalArgumentException("The number must not be NaN");
                    }
                    int iCompareTo = ((Comparable) number).compareTo(number2);
                    if (iCompareTo == 0) {
                        this.a = number;
                        this.b = number;
                        return;
                    } else if (iCompareTo > 0) {
                        this.a = number2;
                        this.b = number;
                        return;
                    } else {
                        this.a = number;
                        this.b = number2;
                        return;
                    }
                }
                throw new IllegalArgumentException("The numbers must implement Comparable");
            }
            throw new IllegalArgumentException("The numbers must be of the same type");
        }
        throw new IllegalArgumentException("The numbers must not be null");
    }
}
