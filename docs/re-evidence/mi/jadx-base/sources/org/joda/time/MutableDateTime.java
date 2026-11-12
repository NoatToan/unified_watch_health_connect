package org.joda.time;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.ggj;
import defpackage.gq5;
import defpackage.hgj;
import defpackage.jq5;
import defpackage.kgj;
import defpackage.qgj;
import defpackage.sxc;
import defpackage.wq5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;

/* JADX INFO: loaded from: classes3.dex */
public class MutableDateTime extends BaseDateTime implements ggj, kgj, Cloneable, Serializable {
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_FLOOR = 1;
    public static final int ROUND_HALF_CEILING = 4;
    public static final int ROUND_HALF_EVEN = 5;
    public static final int ROUND_HALF_FLOOR = 3;
    public static final int ROUND_NONE = 0;
    private static final long serialVersionUID = 2852608688135209575L;
    private gq5 iRoundingField;
    private int iRoundingMode;

    public MutableDateTime() {
    }

    public static MutableDateTime now(bw3 bw3Var) {
        if (bw3Var != null) {
            return new MutableDateTime(bw3Var);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    @FromString
    public static MutableDateTime parse(String str) {
        return parse(str, sxc.i().w());
    }

    public void add(hgj hgjVar) {
        add(hgjVar, 1);
    }

    public void addDays(int i) {
        if (i != 0) {
            setMillis(getChronology().days().add(getMillis(), i));
        }
    }

    public void addHours(int i) {
        if (i != 0) {
            setMillis(getChronology().hours().add(getMillis(), i));
        }
    }

    public void addMillis(int i) {
        if (i != 0) {
            setMillis(getChronology().millis().add(getMillis(), i));
        }
    }

    public void addMinutes(int i) {
        if (i != 0) {
            setMillis(getChronology().minutes().add(getMillis(), i));
        }
    }

    public void addMonths(int i) {
        if (i != 0) {
            setMillis(getChronology().months().add(getMillis(), i));
        }
    }

    public void addSeconds(int i) {
        if (i != 0) {
            setMillis(getChronology().seconds().add(getMillis(), i));
        }
    }

    public void addWeeks(int i) {
        if (i != 0) {
            setMillis(getChronology().weeks().add(getMillis(), i));
        }
    }

    public void addWeekyears(int i) {
        if (i != 0) {
            setMillis(getChronology().weekyears().add(getMillis(), i));
        }
    }

    public void addYears(int i) {
        if (i != 0) {
            setMillis(getChronology().years().add(getMillis(), i));
        }
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutableDateTime copy() {
        return (MutableDateTime) clone();
    }

    public Property dayOfMonth() {
        return new Property(this, getChronology().dayOfMonth());
    }

    public Property dayOfWeek() {
        return new Property(this, getChronology().dayOfWeek());
    }

    public Property dayOfYear() {
        return new Property(this, getChronology().dayOfYear());
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    public gq5 getRoundingField() {
        return this.iRoundingField;
    }

    public int getRoundingMode() {
        return this.iRoundingMode;
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public Property minuteOfDay() {
        return new Property(this, getChronology().minuteOfDay());
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        gq5 field = dateTimeFieldType.getField(getChronology());
        if (field.isSupported()) {
            return new Property(this, field);
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public Property secondOfDay() {
        return new Property(this, getChronology().secondOfDay());
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    public void set(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        setMillis(dateTimeFieldType.getField(getChronology()).set(getMillis(), i));
    }

    @Override // org.joda.time.base.BaseDateTime
    public void setChronology(bw3 bw3Var) {
        super.setChronology(bw3Var);
    }

    public void setDate(long j) {
        setMillis(getChronology().millisOfDay().set(j, getMillisOfDay()));
    }

    public void setDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        setMillis(getChronology().getDateTimeMillis(i, i2, i3, i4, i5, i6, i7));
    }

    public void setDayOfMonth(int i) {
        setMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    public void setDayOfWeek(int i) {
        setMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    public void setDayOfYear(int i) {
        setMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    public void setHourOfDay(int i) {
        setMillis(getChronology().hourOfDay().set(getMillis(), i));
    }

    @Override // org.joda.time.base.BaseDateTime
    public void setMillis(long j) {
        int i = this.iRoundingMode;
        if (i == 1) {
            j = this.iRoundingField.roundFloor(j);
        } else if (i == 2) {
            j = this.iRoundingField.roundCeiling(j);
        } else if (i == 3) {
            j = this.iRoundingField.roundHalfFloor(j);
        } else if (i == 4) {
            j = this.iRoundingField.roundHalfCeiling(j);
        } else if (i == 5) {
            j = this.iRoundingField.roundHalfEven(j);
        }
        super.setMillis(j);
    }

    public void setMillisOfDay(int i) {
        setMillis(getChronology().millisOfDay().set(getMillis(), i));
    }

    public void setMillisOfSecond(int i) {
        setMillis(getChronology().millisOfSecond().set(getMillis(), i));
    }

    public void setMinuteOfDay(int i) {
        setMillis(getChronology().minuteOfDay().set(getMillis(), i));
    }

    public void setMinuteOfHour(int i) {
        setMillis(getChronology().minuteOfHour().set(getMillis(), i));
    }

    public void setMonthOfYear(int i) {
        setMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public void setRounding(gq5 gq5Var) {
        setRounding(gq5Var, 1);
    }

    public void setSecondOfDay(int i) {
        setMillis(getChronology().secondOfDay().set(getMillis(), i));
    }

    public void setSecondOfMinute(int i) {
        setMillis(getChronology().secondOfMinute().set(getMillis(), i));
    }

    public void setTime(long j) {
        setMillis(getChronology().millisOfDay().set(getMillis(), ISOChronology.getInstanceUTC().millisOfDay().get(j)));
    }

    public void setWeekOfWeekyear(int i) {
        setMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    public void setWeekyear(int i) {
        setMillis(getChronology().weekyear().set(getMillis(), i));
    }

    public void setYear(int i) {
        setMillis(getChronology().year().set(getMillis(), i));
    }

    public void setZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZoneM = wq5.m(dateTimeZone);
        bw3 chronology = getChronology();
        if (chronology.getZone() != dateTimeZoneM) {
            setChronology(chronology.withZone(dateTimeZoneM));
        }
    }

    public void setZoneRetainFields(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZoneM = wq5.m(dateTimeZone);
        DateTimeZone dateTimeZoneM2 = wq5.m(getZone());
        if (dateTimeZoneM == dateTimeZoneM2) {
            return;
        }
        long millisKeepLocal = dateTimeZoneM2.getMillisKeepLocal(dateTimeZoneM, getMillis());
        setChronology(getChronology().withZone(dateTimeZoneM));
        setMillis(millisKeepLocal);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public Property year() {
        return new Property(this, getChronology().year());
    }

    public Property yearOfCentury() {
        return new Property(this, getChronology().yearOfCentury());
    }

    public Property yearOfEra() {
        return new Property(this, getChronology().yearOfEra());
    }

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -4481126543819298617L;
        private gq5 iField;
        private MutableDateTime iInstant;

        public Property(MutableDateTime mutableDateTime, gq5 gq5Var) {
            this.iInstant = mutableDateTime;
            this.iField = gq5Var;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (MutableDateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public MutableDateTime add(int i) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        public MutableDateTime addWrapField(int i) {
            this.iInstant.setMillis(getField().addWrapField(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public bw3 getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public gq5 getField() {
            return this.iField;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getMillis();
        }

        public MutableDateTime getMutableDateTime() {
            return this.iInstant;
        }

        public MutableDateTime roundCeiling() {
            this.iInstant.setMillis(getField().roundCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundFloor() {
            this.iInstant.setMillis(getField().roundFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfCeiling() {
            this.iInstant.setMillis(getField().roundHalfCeiling(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfEven() {
            this.iInstant.setMillis(getField().roundHalfEven(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime roundHalfFloor() {
            this.iInstant.setMillis(getField().roundHalfFloor(this.iInstant.getMillis()));
            return this.iInstant;
        }

        public MutableDateTime set(int i) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), i));
            return this.iInstant;
        }

        public MutableDateTime add(long j) {
            this.iInstant.setMillis(getField().add(this.iInstant.getMillis(), j));
            return this.iInstant;
        }

        public MutableDateTime set(String str, Locale locale) {
            this.iInstant.setMillis(getField().set(this.iInstant.getMillis(), str, locale));
            return this.iInstant;
        }

        public MutableDateTime set(String str) {
            set(str, null);
            return this.iInstant;
        }
    }

    public MutableDateTime(DateTimeZone dateTimeZone) {
        super(dateTimeZone);
    }

    public static MutableDateTime parse(String str, jq5 jq5Var) {
        return jq5Var.f(str).toMutableDateTime();
    }

    public void setDate(kgj kgjVar) {
        DateTimeZone zone;
        long jH = wq5.h(kgjVar);
        if ((kgjVar instanceof ggj) && (zone = wq5.c(((ggj) kgjVar).getChronology()).getZone()) != null) {
            jH = zone.getMillisKeepLocal(getZone(), jH);
        }
        setDate(jH);
    }

    public MutableDateTime(bw3 bw3Var) {
        super(bw3Var);
    }

    public void add(hgj hgjVar, int i) {
        if (hgjVar != null) {
            add(fl9.i(hgjVar.getMillis(), i));
        }
    }

    public void setRounding(gq5 gq5Var, int i) {
        if (gq5Var != null && (i < 0 || i > 5)) {
            throw new IllegalArgumentException("Illegal rounding mode: " + i);
        }
        this.iRoundingField = i == 0 ? null : gq5Var;
        if (gq5Var == null) {
            i = 0;
        }
        this.iRoundingMode = i;
        setMillis(getMillis());
    }

    public void setTime(kgj kgjVar) {
        long jH = wq5.h(kgjVar);
        DateTimeZone zone = wq5.g(kgjVar).getZone();
        if (zone != null) {
            jH = zone.getMillisKeepLocal(DateTimeZone.UTC, jH);
        }
        setTime(jH);
    }

    public MutableDateTime(long j) {
        super(j);
    }

    public static MutableDateTime now() {
        return new MutableDateTime();
    }

    public MutableDateTime(long j, DateTimeZone dateTimeZone) {
        super(j, dateTimeZone);
    }

    public static MutableDateTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MutableDateTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public void add(qgj qgjVar) {
        add(qgjVar, 1);
    }

    public MutableDateTime(long j, bw3 bw3Var) {
        super(j, bw3Var);
    }

    public MutableDateTime(Object obj) {
        super(obj, (bw3) null);
    }

    public void add(qgj qgjVar, int i) {
        if (qgjVar != null) {
            setMillis(getChronology().add(qgjVar, getMillis(), i));
        }
    }

    public MutableDateTime(Object obj, DateTimeZone dateTimeZone) {
        super(obj, dateTimeZone);
    }

    public void setMillis(kgj kgjVar) {
        setMillis(wq5.h(kgjVar));
    }

    public void setTime(int i, int i2, int i3, int i4) {
        setMillis(getChronology().getDateTimeMillis(getMillis(), i, i2, i3, i4));
    }

    public MutableDateTime(Object obj, bw3 bw3Var) {
        super(obj, wq5.c(bw3Var));
    }

    public void add(long j) {
        setMillis(fl9.e(getMillis(), j));
    }

    public void setDate(int i, int i2, int i3) {
        setDate(getChronology().getDateTimeMillis(i, i2, i3, 0));
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i, i2, i3, i4, i5, i6, i7);
    }

    public void add(DurationFieldType durationFieldType, int i) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (i != 0) {
            setMillis(durationFieldType.getField(getChronology()).add(getMillis(), i));
        }
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        super(i, i2, i3, i4, i5, i6, i7, dateTimeZone);
    }

    public MutableDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, bw3 bw3Var) {
        super(i, i2, i3, i4, i5, i6, i7, bw3Var);
    }
}
