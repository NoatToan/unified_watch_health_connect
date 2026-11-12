package org.joda.time.field;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.gq5;
import defpackage.kgj;
import defpackage.ogj;
import defpackage.t67;
import defpackage.wq5;
import java.io.Serializable;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractReadableInstantFieldProperty implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    public int compareTo(kgj kgjVar) {
        if (kgjVar == null) {
            throw new IllegalArgumentException("The instant must not be null");
        }
        int i = get();
        int i2 = kgjVar.get(getFieldType());
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractReadableInstantFieldProperty)) {
            return false;
        }
        AbstractReadableInstantFieldProperty abstractReadableInstantFieldProperty = (AbstractReadableInstantFieldProperty) obj;
        return get() == abstractReadableInstantFieldProperty.get() && getFieldType().equals(abstractReadableInstantFieldProperty.getFieldType()) && fl9.a(getChronology(), abstractReadableInstantFieldProperty.getChronology());
    }

    public int get() {
        return getField().get(getMillis());
    }

    public String getAsShortText() {
        return getAsShortText(null);
    }

    public String getAsString() {
        return Integer.toString(get());
    }

    public String getAsText() {
        return getAsText(null);
    }

    public bw3 getChronology() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    public int getDifference(kgj kgjVar) {
        return kgjVar == null ? getField().getDifference(getMillis(), wq5.b()) : getField().getDifference(getMillis(), kgjVar.getMillis());
    }

    public long getDifferenceAsLong(kgj kgjVar) {
        return kgjVar == null ? getField().getDifferenceAsLong(getMillis(), wq5.b()) : getField().getDifferenceAsLong(getMillis(), kgjVar.getMillis());
    }

    public t67 getDurationField() {
        return getField().getDurationField();
    }

    public abstract gq5 getField();

    public DateTimeFieldType getFieldType() {
        return getField().getType();
    }

    public int getLeapAmount() {
        return getField().getLeapAmount(getMillis());
    }

    public t67 getLeapDurationField() {
        return getField().getLeapDurationField();
    }

    public int getMaximumShortTextLength(Locale locale) {
        return getField().getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale) {
        return getField().getMaximumTextLength(locale);
    }

    public int getMaximumValue() {
        return getField().getMaximumValue(getMillis());
    }

    public int getMaximumValueOverall() {
        return getField().getMaximumValue();
    }

    public abstract long getMillis();

    public int getMinimumValue() {
        return getField().getMinimumValue(getMillis());
    }

    public int getMinimumValueOverall() {
        return getField().getMinimumValue();
    }

    public String getName() {
        return getField().getName();
    }

    public t67 getRangeDurationField() {
        return getField().getRangeDurationField();
    }

    public int hashCode() {
        return (get() * 17) + getFieldType().hashCode() + getChronology().hashCode();
    }

    public boolean isLeap() {
        return getField().isLeap(getMillis());
    }

    public long remainder() {
        return getField().remainder(getMillis());
    }

    public Interval toInterval() {
        gq5 field = getField();
        long jRoundFloor = field.roundFloor(getMillis());
        return new Interval(jRoundFloor, field.add(jRoundFloor, 1), getChronology());
    }

    public String toString() {
        return "Property[" + getName() + "]";
    }

    public String getAsShortText(Locale locale) {
        return getField().getAsShortText(getMillis(), locale);
    }

    public String getAsText(Locale locale) {
        return getField().getAsText(getMillis(), locale);
    }

    public int compareTo(ogj ogjVar) {
        if (ogjVar != null) {
            int i = get();
            int i2 = ogjVar.get(getFieldType());
            if (i < i2) {
                return -1;
            }
            return i > i2 ? 1 : 0;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }
}
