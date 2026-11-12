package org.joda.time;

import defpackage.bw3;
import defpackage.gq5;
import defpackage.wq5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DateTimeFieldType implements Serializable {
    static final byte CENTURY_OF_ERA = 3;
    static final byte CLOCKHOUR_OF_DAY = 16;
    static final byte DAY_OF_MONTH = 8;
    static final byte DAY_OF_WEEK = 12;
    static final byte DAY_OF_YEAR = 6;
    static final byte ERA = 1;
    static final byte HALFDAY_OF_DAY = 13;
    static final byte HOUR_OF_DAY = 17;
    static final byte HOUR_OF_HALFDAY = 14;
    static final byte MINUTE_OF_DAY = 18;
    static final byte MINUTE_OF_HOUR = 19;
    static final byte MONTH_OF_YEAR = 7;
    static final byte WEEKYEAR = 10;
    static final byte WEEKYEAR_OF_CENTURY = 9;
    static final byte WEEK_OF_WEEKYEAR = 11;
    static final byte YEAR = 5;
    static final byte YEAR_OF_CENTURY = 4;
    static final byte YEAR_OF_ERA = 2;
    private static final long serialVersionUID = -42615285973990L;
    private final String iName;
    private static final DateTimeFieldType ERA_TYPE = new a("era", (byte) 1, DurationFieldType.eras(), null);
    private static final DateTimeFieldType YEAR_OF_ERA_TYPE = new a("yearOfEra", (byte) 2, DurationFieldType.years(), DurationFieldType.eras());
    private static final DateTimeFieldType CENTURY_OF_ERA_TYPE = new a("centuryOfEra", (byte) 3, DurationFieldType.centuries(), DurationFieldType.eras());
    private static final DateTimeFieldType YEAR_OF_CENTURY_TYPE = new a("yearOfCentury", (byte) 4, DurationFieldType.years(), DurationFieldType.centuries());
    private static final DateTimeFieldType YEAR_TYPE = new a("year", (byte) 5, DurationFieldType.years(), null);
    private static final DateTimeFieldType DAY_OF_YEAR_TYPE = new a("dayOfYear", (byte) 6, DurationFieldType.days(), DurationFieldType.years());
    private static final DateTimeFieldType MONTH_OF_YEAR_TYPE = new a("monthOfYear", (byte) 7, DurationFieldType.months(), DurationFieldType.years());
    private static final DateTimeFieldType DAY_OF_MONTH_TYPE = new a("dayOfMonth", (byte) 8, DurationFieldType.days(), DurationFieldType.months());
    private static final DateTimeFieldType WEEKYEAR_OF_CENTURY_TYPE = new a("weekyearOfCentury", (byte) 9, DurationFieldType.weekyears(), DurationFieldType.centuries());
    private static final DateTimeFieldType WEEKYEAR_TYPE = new a("weekyear", (byte) 10, DurationFieldType.weekyears(), null);
    private static final DateTimeFieldType WEEK_OF_WEEKYEAR_TYPE = new a("weekOfWeekyear", (byte) 11, DurationFieldType.weeks(), DurationFieldType.weekyears());
    private static final DateTimeFieldType DAY_OF_WEEK_TYPE = new a("dayOfWeek", (byte) 12, DurationFieldType.days(), DurationFieldType.weeks());
    private static final DateTimeFieldType HALFDAY_OF_DAY_TYPE = new a("halfdayOfDay", (byte) 13, DurationFieldType.halfdays(), DurationFieldType.days());
    private static final DateTimeFieldType HOUR_OF_HALFDAY_TYPE = new a("hourOfHalfday", (byte) 14, DurationFieldType.hours(), DurationFieldType.halfdays());
    static final byte CLOCKHOUR_OF_HALFDAY = 15;
    private static final DateTimeFieldType CLOCKHOUR_OF_HALFDAY_TYPE = new a("clockhourOfHalfday", CLOCKHOUR_OF_HALFDAY, DurationFieldType.hours(), DurationFieldType.halfdays());
    private static final DateTimeFieldType CLOCKHOUR_OF_DAY_TYPE = new a("clockhourOfDay", (byte) 16, DurationFieldType.hours(), DurationFieldType.days());
    private static final DateTimeFieldType HOUR_OF_DAY_TYPE = new a("hourOfDay", (byte) 17, DurationFieldType.hours(), DurationFieldType.days());
    private static final DateTimeFieldType MINUTE_OF_DAY_TYPE = new a("minuteOfDay", (byte) 18, DurationFieldType.minutes(), DurationFieldType.days());
    private static final DateTimeFieldType MINUTE_OF_HOUR_TYPE = new a("minuteOfHour", (byte) 19, DurationFieldType.minutes(), DurationFieldType.hours());
    static final byte SECOND_OF_DAY = 20;
    private static final DateTimeFieldType SECOND_OF_DAY_TYPE = new a("secondOfDay", SECOND_OF_DAY, DurationFieldType.seconds(), DurationFieldType.days());
    static final byte SECOND_OF_MINUTE = 21;
    private static final DateTimeFieldType SECOND_OF_MINUTE_TYPE = new a("secondOfMinute", SECOND_OF_MINUTE, DurationFieldType.seconds(), DurationFieldType.minutes());
    static final byte MILLIS_OF_DAY = 22;
    private static final DateTimeFieldType MILLIS_OF_DAY_TYPE = new a("millisOfDay", MILLIS_OF_DAY, DurationFieldType.millis(), DurationFieldType.days());
    static final byte MILLIS_OF_SECOND = 23;
    private static final DateTimeFieldType MILLIS_OF_SECOND_TYPE = new a("millisOfSecond", MILLIS_OF_SECOND, DurationFieldType.millis(), DurationFieldType.seconds());

    public static class a extends DateTimeFieldType {
        private static final long serialVersionUID = -9937958251642L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f29533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final transient DurationFieldType f29534b;
        public final transient DurationFieldType c;

        public a(String str, byte b2, DurationFieldType durationFieldType, DurationFieldType durationFieldType2) {
            super(str);
            this.f29533a = b2;
            this.f29534b = durationFieldType;
            this.c = durationFieldType2;
        }

        private Object readResolve() {
            switch (this.f29533a) {
                case 1:
                    return DateTimeFieldType.ERA_TYPE;
                case 2:
                    return DateTimeFieldType.YEAR_OF_ERA_TYPE;
                case 3:
                    return DateTimeFieldType.CENTURY_OF_ERA_TYPE;
                case 4:
                    return DateTimeFieldType.YEAR_OF_CENTURY_TYPE;
                case 5:
                    return DateTimeFieldType.YEAR_TYPE;
                case 6:
                    return DateTimeFieldType.DAY_OF_YEAR_TYPE;
                case 7:
                    return DateTimeFieldType.MONTH_OF_YEAR_TYPE;
                case 8:
                    return DateTimeFieldType.DAY_OF_MONTH_TYPE;
                case 9:
                    return DateTimeFieldType.WEEKYEAR_OF_CENTURY_TYPE;
                case 10:
                    return DateTimeFieldType.WEEKYEAR_TYPE;
                case 11:
                    return DateTimeFieldType.WEEK_OF_WEEKYEAR_TYPE;
                case 12:
                    return DateTimeFieldType.DAY_OF_WEEK_TYPE;
                case 13:
                    return DateTimeFieldType.HALFDAY_OF_DAY_TYPE;
                case 14:
                    return DateTimeFieldType.HOUR_OF_HALFDAY_TYPE;
                case 15:
                    return DateTimeFieldType.CLOCKHOUR_OF_HALFDAY_TYPE;
                case 16:
                    return DateTimeFieldType.CLOCKHOUR_OF_DAY_TYPE;
                case 17:
                    return DateTimeFieldType.HOUR_OF_DAY_TYPE;
                case 18:
                    return DateTimeFieldType.MINUTE_OF_DAY_TYPE;
                case 19:
                    return DateTimeFieldType.MINUTE_OF_HOUR_TYPE;
                case 20:
                    return DateTimeFieldType.SECOND_OF_DAY_TYPE;
                case 21:
                    return DateTimeFieldType.SECOND_OF_MINUTE_TYPE;
                case 22:
                    return DateTimeFieldType.MILLIS_OF_DAY_TYPE;
                case 23:
                    return DateTimeFieldType.MILLIS_OF_SECOND_TYPE;
                default:
                    return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f29533a == ((a) obj).f29533a;
        }

        @Override // org.joda.time.DateTimeFieldType
        public DurationFieldType getDurationType() {
            return this.f29534b;
        }

        @Override // org.joda.time.DateTimeFieldType
        public gq5 getField(bw3 bw3Var) {
            bw3 bw3VarC = wq5.c(bw3Var);
            switch (this.f29533a) {
                case 1:
                    return bw3VarC.era();
                case 2:
                    return bw3VarC.yearOfEra();
                case 3:
                    return bw3VarC.centuryOfEra();
                case 4:
                    return bw3VarC.yearOfCentury();
                case 5:
                    return bw3VarC.year();
                case 6:
                    return bw3VarC.dayOfYear();
                case 7:
                    return bw3VarC.monthOfYear();
                case 8:
                    return bw3VarC.dayOfMonth();
                case 9:
                    return bw3VarC.weekyearOfCentury();
                case 10:
                    return bw3VarC.weekyear();
                case 11:
                    return bw3VarC.weekOfWeekyear();
                case 12:
                    return bw3VarC.dayOfWeek();
                case 13:
                    return bw3VarC.halfdayOfDay();
                case 14:
                    return bw3VarC.hourOfHalfday();
                case 15:
                    return bw3VarC.clockhourOfHalfday();
                case 16:
                    return bw3VarC.clockhourOfDay();
                case 17:
                    return bw3VarC.hourOfDay();
                case 18:
                    return bw3VarC.minuteOfDay();
                case 19:
                    return bw3VarC.minuteOfHour();
                case 20:
                    return bw3VarC.secondOfDay();
                case 21:
                    return bw3VarC.secondOfMinute();
                case 22:
                    return bw3VarC.millisOfDay();
                case 23:
                    return bw3VarC.millisOfSecond();
                default:
                    throw new InternalError();
            }
        }

        @Override // org.joda.time.DateTimeFieldType
        public DurationFieldType getRangeDurationType() {
            return this.c;
        }

        public int hashCode() {
            return 1 << this.f29533a;
        }
    }

    public DateTimeFieldType(String str) {
        this.iName = str;
    }

    public static DateTimeFieldType centuryOfEra() {
        return CENTURY_OF_ERA_TYPE;
    }

    public static DateTimeFieldType clockhourOfDay() {
        return CLOCKHOUR_OF_DAY_TYPE;
    }

    public static DateTimeFieldType clockhourOfHalfday() {
        return CLOCKHOUR_OF_HALFDAY_TYPE;
    }

    public static DateTimeFieldType dayOfMonth() {
        return DAY_OF_MONTH_TYPE;
    }

    public static DateTimeFieldType dayOfWeek() {
        return DAY_OF_WEEK_TYPE;
    }

    public static DateTimeFieldType dayOfYear() {
        return DAY_OF_YEAR_TYPE;
    }

    public static DateTimeFieldType era() {
        return ERA_TYPE;
    }

    public static DateTimeFieldType halfdayOfDay() {
        return HALFDAY_OF_DAY_TYPE;
    }

    public static DateTimeFieldType hourOfDay() {
        return HOUR_OF_DAY_TYPE;
    }

    public static DateTimeFieldType hourOfHalfday() {
        return HOUR_OF_HALFDAY_TYPE;
    }

    public static DateTimeFieldType millisOfDay() {
        return MILLIS_OF_DAY_TYPE;
    }

    public static DateTimeFieldType millisOfSecond() {
        return MILLIS_OF_SECOND_TYPE;
    }

    public static DateTimeFieldType minuteOfDay() {
        return MINUTE_OF_DAY_TYPE;
    }

    public static DateTimeFieldType minuteOfHour() {
        return MINUTE_OF_HOUR_TYPE;
    }

    public static DateTimeFieldType monthOfYear() {
        return MONTH_OF_YEAR_TYPE;
    }

    public static DateTimeFieldType secondOfDay() {
        return SECOND_OF_DAY_TYPE;
    }

    public static DateTimeFieldType secondOfMinute() {
        return SECOND_OF_MINUTE_TYPE;
    }

    public static DateTimeFieldType weekOfWeekyear() {
        return WEEK_OF_WEEKYEAR_TYPE;
    }

    public static DateTimeFieldType weekyear() {
        return WEEKYEAR_TYPE;
    }

    public static DateTimeFieldType weekyearOfCentury() {
        return WEEKYEAR_OF_CENTURY_TYPE;
    }

    public static DateTimeFieldType year() {
        return YEAR_TYPE;
    }

    public static DateTimeFieldType yearOfCentury() {
        return YEAR_OF_CENTURY_TYPE;
    }

    public static DateTimeFieldType yearOfEra() {
        return YEAR_OF_ERA_TYPE;
    }

    public abstract DurationFieldType getDurationType();

    public abstract gq5 getField(bw3 bw3Var);

    public String getName() {
        return this.iName;
    }

    public abstract DurationFieldType getRangeDurationType();

    public boolean isSupported(bw3 bw3Var) {
        return getField(bw3Var).isSupported();
    }

    public String toString() {
        return getName();
    }
}
