package org.joda.time;

import com.miui.tsmclient.model.mitsm.h;
import defpackage.bw3;
import defpackage.fk4;
import defpackage.flh;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.jq5;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.sxc;
import defpackage.t67;
import defpackage.v82;
import defpackage.wq5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalTime extends v82 implements ogj, Serializable {
    private static final int HOUR_OF_DAY = 0;
    public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);
    private static final int MILLIS_OF_SECOND = 3;
    private static final int MINUTE_OF_HOUR = 1;
    private static final int SECOND_OF_MINUTE = 2;
    private static final Set<DurationFieldType> TIME_DURATION_TYPES;
    private static final long serialVersionUID = -12873158713873L;
    private final bw3 iChronology;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -325842547277223L;
        private transient gq5 iField;
        private transient LocalTime iInstant;

        public Property(LocalTime localTime, gq5 gq5Var) {
            this.iInstant = localTime;
            this.iField = gq5Var;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (LocalTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalTime addCopy(int i) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), i));
        }

        public LocalTime addNoWrapToCopy(int i) {
            long jAdd = this.iField.add(this.iInstant.getLocalMillis(), i);
            if (this.iInstant.getChronology().millisOfDay().get(jAdd) == jAdd) {
                return this.iInstant.withLocalMillis(jAdd);
            }
            throw new IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
        }

        public LocalTime addWrapFieldToCopy(int i) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.addWrapField(localTime.getLocalMillis(), i));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public bw3 getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public gq5 getField() {
            return this.iField;
        }

        public LocalTime getLocalTime() {
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalTime roundCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundFloor(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfEvenCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfEven(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfFloor(localTime.getLocalMillis()));
        }

        public LocalTime setCopy(int i) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), i));
        }

        public LocalTime withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalTime withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public LocalTime addCopy(long j) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), j));
        }

        public LocalTime setCopy(String str, Locale locale) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), str, locale));
        }

        public LocalTime setCopy(String str) {
            return setCopy(str, null);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        TIME_DURATION_TYPES = hashSet;
        hashSet.add(DurationFieldType.millis());
        hashSet.add(DurationFieldType.seconds());
        hashSet.add(DurationFieldType.minutes());
        hashSet.add(DurationFieldType.hours());
    }

    public LocalTime() {
        this(wq5.b(), ISOChronology.getInstance());
    }

    public static LocalTime fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new LocalTime(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static LocalTime fromDateFields(Date date) {
        if (date != null) {
            return new LocalTime(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static LocalTime fromMillisOfDay(long j) {
        return fromMillisOfDay(j, null);
    }

    public static LocalTime now(bw3 bw3Var) {
        if (bw3Var != null) {
            return new LocalTime(bw3Var);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    @FromString
    public static LocalTime parse(String str) {
        return parse(str, sxc.n());
    }

    private Object readResolve() {
        bw3 bw3Var = this.iChronology;
        if (bw3Var == null) {
            return new LocalTime(this.iLocalMillis, ISOChronology.getInstanceUTC());
        }
        return !DateTimeZone.UTC.equals(bw3Var.getZone()) ? new LocalTime(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    @Override // defpackage.i10, java.lang.Comparable
    public int compareTo(ogj ogjVar) {
        if (this == ogjVar) {
            return 0;
        }
        if (ogjVar instanceof LocalTime) {
            LocalTime localTime = (LocalTime) ogjVar;
            if (this.iChronology.equals(localTime.iChronology)) {
                long j = this.iLocalMillis;
                long j2 = localTime.iLocalMillis;
                if (j < j2) {
                    return -1;
                }
                return j == j2 ? 0 : 1;
            }
        }
        return super.compareTo(ogjVar);
    }

    @Override // defpackage.i10
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.iChronology.equals(localTime.iChronology)) {
                return this.iLocalMillis == localTime.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    @Override // defpackage.i10, defpackage.ogj
    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    @Override // defpackage.ogj
    public bw3 getChronology() {
        return this.iChronology;
    }

    @Override // defpackage.i10
    public gq5 getField(int i, bw3 bw3Var) {
        if (i == 0) {
            return bw3Var.hourOfDay();
        }
        if (i == 1) {
            return bw3Var.minuteOfHour();
        }
        if (i == 2) {
            return bw3Var.secondOfMinute();
        }
        if (i == 3) {
            return bw3Var.millisOfSecond();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    public int getHourOfDay() {
        return getChronology().hourOfDay().get(getLocalMillis());
    }

    @Override // defpackage.v82
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMillisOfDay() {
        return getChronology().millisOfDay().get(getLocalMillis());
    }

    public int getMillisOfSecond() {
        return getChronology().millisOfSecond().get(getLocalMillis());
    }

    public int getMinuteOfHour() {
        return getChronology().minuteOfHour().get(getLocalMillis());
    }

    public int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getLocalMillis());
    }

    @Override // defpackage.ogj
    public int getValue(int i) {
        if (i == 0) {
            return getChronology().hourOfDay().get(getLocalMillis());
        }
        if (i == 1) {
            return getChronology().minuteOfHour().get(getLocalMillis());
        }
        if (i == 2) {
            return getChronology().secondOfMinute().get(getLocalMillis());
        }
        if (i == 3) {
            return getChronology().millisOfSecond().get(getLocalMillis());
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    @Override // defpackage.i10
    public int hashCode() {
        return ((((((((((((((h.l + this.iChronology.hourOfDay().get(this.iLocalMillis)) * 23) + this.iChronology.hourOfDay().getType().hashCode()) * 23) + this.iChronology.minuteOfHour().get(this.iLocalMillis)) * 23) + this.iChronology.minuteOfHour().getType().hashCode()) * 23) + this.iChronology.secondOfMinute().get(this.iLocalMillis)) * 23) + this.iChronology.secondOfMinute().getType().hashCode()) * 23) + this.iChronology.millisOfSecond().get(this.iLocalMillis)) * 23) + this.iChronology.millisOfSecond().getType().hashCode() + getChronology().hashCode();
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    @Override // defpackage.i10, defpackage.ogj
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null || !isSupported(dateTimeFieldType.getDurationType())) {
            return false;
        }
        DurationFieldType rangeDurationType = dateTimeFieldType.getRangeDurationType();
        return isSupported(rangeDurationType) || rangeDurationType == DurationFieldType.days();
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public LocalTime minus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, -1);
    }

    public LocalTime minusHours(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i));
    }

    public LocalTime minusMillis(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i));
    }

    public LocalTime minusMinutes(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i));
    }

    public LocalTime minusSeconds(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i));
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public LocalTime plus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, 1);
    }

    public LocalTime plusHours(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().hours().add(getLocalMillis(), i));
    }

    public LocalTime plusMillis(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().millis().add(getLocalMillis(), i));
    }

    public LocalTime plusMinutes(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().minutes().add(getLocalMillis(), i));
    }

    public LocalTime plusSeconds(int i) {
        return i == 0 ? this : withLocalMillis(getChronology().seconds().add(getLocalMillis(), i));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.getField(getChronology()));
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Override // defpackage.ogj
    public int size() {
        return 4;
    }

    public DateTime toDateTimeToday() {
        return toDateTimeToday(null);
    }

    @ToString
    public String toString() {
        return sxc.p().l(this);
    }

    public LocalTime withField(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i));
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public LocalTime withFieldAdded(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (isSupported(durationFieldType)) {
            return i == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i));
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }

    public LocalTime withFields(ogj ogjVar) {
        return ogjVar == null ? this : withLocalMillis(getChronology().set(ogjVar, getLocalMillis()));
    }

    public LocalTime withHourOfDay(int i) {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i));
    }

    public LocalTime withLocalMillis(long j) {
        return j == getLocalMillis() ? this : new LocalTime(j, getChronology());
    }

    public LocalTime withMillisOfDay(int i) {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i));
    }

    public LocalTime withMillisOfSecond(int i) {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i));
    }

    public LocalTime withMinuteOfHour(int i) {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i));
    }

    public LocalTime withPeriodAdded(qgj qgjVar, int i) {
        return (qgjVar == null || i == 0) ? this : withLocalMillis(getChronology().add(qgjVar, getLocalMillis(), i));
    }

    public LocalTime withSecondOfMinute(int i) {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i));
    }

    public LocalTime(DateTimeZone dateTimeZone) {
        this(wq5.b(), ISOChronology.getInstance(dateTimeZone));
    }

    public static LocalTime fromMillisOfDay(long j, bw3 bw3Var) {
        return new LocalTime(j, wq5.c(bw3Var).withUTC());
    }

    public static LocalTime parse(String str, jq5 jq5Var) {
        return jq5Var.i(str);
    }

    public DateTime toDateTimeToday(DateTimeZone dateTimeZone) {
        bw3 bw3VarWithZone = getChronology().withZone(dateTimeZone);
        return new DateTime(bw3VarWithZone.set(this, wq5.b()), bw3VarWithZone);
    }

    public String toString(String str) {
        return str == null ? toString() : hq5.b(str).l(this);
    }

    public LocalTime(bw3 bw3Var) {
        this(wq5.b(), bw3Var);
    }

    public LocalTime(long j) {
        this(j, ISOChronology.getInstance());
    }

    public static LocalTime now() {
        return new LocalTime();
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        t67 field = durationFieldType.getField(getChronology());
        if (TIME_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() < getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return hq5.b(str).v(locale).l(this);
    }

    public LocalTime(long j, DateTimeZone dateTimeZone) {
        this(j, ISOChronology.getInstance(dateTimeZone));
    }

    public static LocalTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public LocalTime(long j, bw3 bw3Var) {
        bw3 bw3VarC = wq5.c(bw3Var);
        long millisKeepLocal = bw3VarC.getZone().getMillisKeepLocal(DateTimeZone.UTC, j);
        bw3 bw3VarWithUTC = bw3VarC.withUTC();
        this.iLocalMillis = bw3VarWithUTC.millisOfDay().get(millisKeepLocal);
        this.iChronology = bw3VarWithUTC;
    }

    public LocalTime(Object obj) {
        this(obj, (bw3) null);
    }

    public LocalTime(Object obj, DateTimeZone dateTimeZone) {
        flh flhVarE = fk4.b().e(obj);
        bw3 bw3VarC = wq5.c(flhVarE.a(obj, dateTimeZone));
        bw3 bw3VarWithUTC = bw3VarC.withUTC();
        this.iChronology = bw3VarWithUTC;
        int[] iArrK = flhVarE.k(this, obj, bw3VarC, sxc.n());
        this.iLocalMillis = bw3VarWithUTC.getDateTimeMillis(0L, iArrK[0], iArrK[1], iArrK[2], iArrK[3]);
    }

    public LocalTime(Object obj, bw3 bw3Var) {
        flh flhVarE = fk4.b().e(obj);
        bw3 bw3VarC = wq5.c(flhVarE.b(obj, bw3Var));
        bw3 bw3VarWithUTC = bw3VarC.withUTC();
        this.iChronology = bw3VarWithUTC;
        int[] iArrK = flhVarE.k(this, obj, bw3VarC, sxc.n());
        this.iLocalMillis = bw3VarWithUTC.getDateTimeMillis(0L, iArrK[0], iArrK[1], iArrK[2], iArrK[3]);
    }

    public LocalTime(int i, int i2) {
        this(i, i2, 0, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i, int i2, int i3) {
        this(i, i2, i3, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i, int i2, int i3, int i4, bw3 bw3Var) {
        bw3 bw3VarWithUTC = wq5.c(bw3Var).withUTC();
        long dateTimeMillis = bw3VarWithUTC.getDateTimeMillis(0L, i, i2, i3, i4);
        this.iChronology = bw3VarWithUTC;
        this.iLocalMillis = dateTimeMillis;
    }
}
