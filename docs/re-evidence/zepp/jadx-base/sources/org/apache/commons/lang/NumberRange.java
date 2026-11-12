package org.apache.commons.lang;

import java.util.Objects;
import org.apache.commons.lang.text.StrBuilder;

/* JADX INFO: loaded from: classes23.dex */
public final class NumberRange {
    private final Number a;
    private final Number b;

    public NumberRange(Number number) {
        Objects.requireNonNull(number, "The number must not be null");
        this.a = number;
        this.b = number;
    }

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

    public Number getMaximum() {
        return this.b;
    }

    public Number getMinimum() {
        return this.a;
    }

    public int hashCode() {
        return ((629 + this.a.hashCode()) * 37) + this.b.hashCode();
    }

    public boolean includesNumber(Number number) {
        return number != null && this.a.doubleValue() <= number.doubleValue() && this.b.doubleValue() >= number.doubleValue();
    }

    public boolean includesRange(NumberRange numberRange) {
        return numberRange != null && includesNumber(numberRange.a) && includesNumber(numberRange.b);
    }

    public boolean overlaps(NumberRange numberRange) {
        if (numberRange == null) {
            return false;
        }
        return numberRange.includesNumber(this.a) || numberRange.includesNumber(this.b) || includesRange(numberRange);
    }

    public String toString() {
        StrBuilder strBuilder = new StrBuilder();
        if (this.a.doubleValue() < 0.0d) {
            strBuilder.append('(').append(this.a).append(')');
        } else {
            strBuilder.append(this.a);
        }
        strBuilder.append('-');
        if (this.b.doubleValue() < 0.0d) {
            strBuilder.append('(').append(this.b).append(')');
        } else {
            strBuilder.append(this.b);
        }
        return strBuilder.toString();
    }

    public NumberRange(Number number, Number number2) {
        Objects.requireNonNull(number, "The minimum value must not be null");
        Objects.requireNonNull(number2, "The maximum value must not be null");
        if (number2.doubleValue() < number.doubleValue()) {
            this.b = number;
            this.a = number;
        } else {
            this.a = number;
            this.b = number2;
        }
    }
}
