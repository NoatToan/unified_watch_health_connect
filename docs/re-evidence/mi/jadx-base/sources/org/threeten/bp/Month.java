package org.threeten.bp;

import defpackage.a5p;
import defpackage.b5p;
import defpackage.kq5;
import defpackage.s4p;
import defpackage.t4p;
import defpackage.w4p;
import defpackage.z4p;
import java.util.Locale;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public enum Month implements t4p, w4p {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static final b5p<Month> FROM = new b5p<Month>() { // from class: org.threeten.bp.Month.a
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month a(t4p t4pVar) {
            return Month.from(t4pVar);
        }
    };
    private static final Month[] ENUMS = values();

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29598a;

        static {
            int[] iArr = new int[Month.values().length];
            f29598a = iArr;
            try {
                iArr[Month.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29598a[Month.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29598a[Month.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29598a[Month.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29598a[Month.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29598a[Month.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29598a[Month.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29598a[Month.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29598a[Month.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29598a[Month.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29598a[Month.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29598a[Month.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static Month from(t4p t4pVar) {
        if (t4pVar instanceof Month) {
            return (Month) t4pVar;
        }
        try {
            if (!IsoChronology.INSTANCE.equals(org.threeten.bp.chrono.b.from(t4pVar))) {
                t4pVar = LocalDate.from(t4pVar);
            }
            return of(t4pVar.get(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Month from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName(), e);
        }
    }

    public static Month of(int i) {
        if (i >= 1 && i <= 12) {
            return ENUMS[i - 1];
        }
        throw new DateTimeException("Invalid value for MonthOfYear: " + i);
    }

    @Override // defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        if (org.threeten.bp.chrono.b.from(s4pVar).equals(IsoChronology.INSTANCE)) {
            return s4pVar.with(ChronoField.MONTH_OF_YEAR, getValue());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public int firstDayOfYear(boolean z) {
        switch (b.f29598a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public Month firstMonthOfQuarter() {
        return ENUMS[(ordinal() / 3) * 3];
    }

    @Override // defpackage.t4p
    public int get(z4p z4pVar) {
        return z4pVar == ChronoField.MONTH_OF_YEAR ? getValue() : range(z4pVar).checkValidIntValue(getLong(z4pVar), z4pVar);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new kq5().k(ChronoField.MONTH_OF_YEAR, textStyle).w(locale).b(this);
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (z4pVar == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar == ChronoField.MONTH_OF_YEAR;
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    public int length(boolean z) {
        int i = b.f29598a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    public int maxLength() {
        int i = b.f29598a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public int minLength() {
        int i = b.f29598a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 28;
    }

    public Month minus(long j) {
        return plus(-(j % 12));
    }

    public Month plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }

    @Override // defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.a()) {
            return (R) IsoChronology.INSTANCE;
        }
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.MONTHS;
        }
        if (b5pVar == a5p.b() || b5pVar == a5p.c() || b5pVar == a5p.f() || b5pVar == a5p.g() || b5pVar == a5p.d()) {
            return null;
        }
        return b5pVar.a(this);
    }

    @Override // defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar == ChronoField.MONTH_OF_YEAR) {
            return z4pVar.range();
        }
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.rangeRefinedBy(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
    }
}
