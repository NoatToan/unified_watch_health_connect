package org.joda.time;

import defpackage.bw3;
import defpackage.t67;
import defpackage.wq5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DurationFieldType implements Serializable {
    static final byte CENTURIES = 2;
    static final byte DAYS = 7;
    static final byte ERAS = 1;
    static final byte HALFDAYS = 8;
    static final byte HOURS = 9;
    static final byte MILLIS = 12;
    static final byte MINUTES = 10;
    static final byte MONTHS = 5;
    static final byte SECONDS = 11;
    static final byte WEEKS = 6;
    static final byte WEEKYEARS = 3;
    static final byte YEARS = 4;
    private static final long serialVersionUID = 8765135187319L;
    private final String iName;
    static final DurationFieldType ERAS_TYPE = new a("eras", (byte) 1);
    static final DurationFieldType CENTURIES_TYPE = new a("centuries", (byte) 2);
    static final DurationFieldType WEEKYEARS_TYPE = new a("weekyears", (byte) 3);
    static final DurationFieldType YEARS_TYPE = new a("years", (byte) 4);
    static final DurationFieldType MONTHS_TYPE = new a("months", (byte) 5);
    static final DurationFieldType WEEKS_TYPE = new a("weeks", (byte) 6);
    static final DurationFieldType DAYS_TYPE = new a("days", (byte) 7);
    static final DurationFieldType HALFDAYS_TYPE = new a("halfdays", (byte) 8);
    static final DurationFieldType HOURS_TYPE = new a("hours", (byte) 9);
    static final DurationFieldType MINUTES_TYPE = new a("minutes", (byte) 10);
    static final DurationFieldType SECONDS_TYPE = new a("seconds", (byte) 11);
    static final DurationFieldType MILLIS_TYPE = new a("millis", (byte) 12);

    public static class a extends DurationFieldType {
        private static final long serialVersionUID = 31156755687123L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f29538a;

        public a(String str, byte b2) {
            super(str);
            this.f29538a = b2;
        }

        private Object readResolve() {
            switch (this.f29538a) {
                case 1:
                    return DurationFieldType.ERAS_TYPE;
                case 2:
                    return DurationFieldType.CENTURIES_TYPE;
                case 3:
                    return DurationFieldType.WEEKYEARS_TYPE;
                case 4:
                    return DurationFieldType.YEARS_TYPE;
                case 5:
                    return DurationFieldType.MONTHS_TYPE;
                case 6:
                    return DurationFieldType.WEEKS_TYPE;
                case 7:
                    return DurationFieldType.DAYS_TYPE;
                case 8:
                    return DurationFieldType.HALFDAYS_TYPE;
                case 9:
                    return DurationFieldType.HOURS_TYPE;
                case 10:
                    return DurationFieldType.MINUTES_TYPE;
                case 11:
                    return DurationFieldType.SECONDS_TYPE;
                case 12:
                    return DurationFieldType.MILLIS_TYPE;
                default:
                    return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f29538a == ((a) obj).f29538a;
        }

        @Override // org.joda.time.DurationFieldType
        public t67 getField(bw3 bw3Var) {
            bw3 bw3VarC = wq5.c(bw3Var);
            switch (this.f29538a) {
                case 1:
                    return bw3VarC.eras();
                case 2:
                    return bw3VarC.centuries();
                case 3:
                    return bw3VarC.weekyears();
                case 4:
                    return bw3VarC.years();
                case 5:
                    return bw3VarC.months();
                case 6:
                    return bw3VarC.weeks();
                case 7:
                    return bw3VarC.days();
                case 8:
                    return bw3VarC.halfdays();
                case 9:
                    return bw3VarC.hours();
                case 10:
                    return bw3VarC.minutes();
                case 11:
                    return bw3VarC.seconds();
                case 12:
                    return bw3VarC.millis();
                default:
                    throw new InternalError();
            }
        }

        public int hashCode() {
            return 1 << this.f29538a;
        }
    }

    public DurationFieldType(String str) {
        this.iName = str;
    }

    public static DurationFieldType centuries() {
        return CENTURIES_TYPE;
    }

    public static DurationFieldType days() {
        return DAYS_TYPE;
    }

    public static DurationFieldType eras() {
        return ERAS_TYPE;
    }

    public static DurationFieldType halfdays() {
        return HALFDAYS_TYPE;
    }

    public static DurationFieldType hours() {
        return HOURS_TYPE;
    }

    public static DurationFieldType millis() {
        return MILLIS_TYPE;
    }

    public static DurationFieldType minutes() {
        return MINUTES_TYPE;
    }

    public static DurationFieldType months() {
        return MONTHS_TYPE;
    }

    public static DurationFieldType seconds() {
        return SECONDS_TYPE;
    }

    public static DurationFieldType weeks() {
        return WEEKS_TYPE;
    }

    public static DurationFieldType weekyears() {
        return WEEKYEARS_TYPE;
    }

    public static DurationFieldType years() {
        return YEARS_TYPE;
    }

    public abstract t67 getField(bw3 bw3Var);

    public String getName() {
        return this.iName;
    }

    public boolean isSupported(bw3 bw3Var) {
        return getField(bw3Var).isSupported();
    }

    public String toString() {
        return getName();
    }
}
