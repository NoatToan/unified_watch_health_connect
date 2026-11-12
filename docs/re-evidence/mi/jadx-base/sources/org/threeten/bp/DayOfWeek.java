package org.threeten.bp;

import defpackage.a5p;
import defpackage.b5p;
import defpackage.kq5;
import defpackage.s4p;
import defpackage.t4p;
import defpackage.w4p;
import defpackage.z4p;
import java.util.Locale;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public enum DayOfWeek implements t4p, w4p {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static final b5p<DayOfWeek> FROM = new b5p<DayOfWeek>() { // from class: org.threeten.bp.DayOfWeek.a
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DayOfWeek a(t4p t4pVar) {
            return DayOfWeek.from(t4pVar);
        }
    };
    private static final DayOfWeek[] ENUMS = values();

    public static DayOfWeek from(t4p t4pVar) {
        if (t4pVar instanceof DayOfWeek) {
            return (DayOfWeek) t4pVar;
        }
        try {
            return of(t4pVar.get(ChronoField.DAY_OF_WEEK));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain DayOfWeek from TemporalAccessor: " + t4pVar + ", type " + t4pVar.getClass().getName(), e);
        }
    }

    public static DayOfWeek of(int i) {
        if (i >= 1 && i <= 7) {
            return ENUMS[i - 1];
        }
        throw new DateTimeException("Invalid value for DayOfWeek: " + i);
    }

    @Override // defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        return s4pVar.with(ChronoField.DAY_OF_WEEK, getValue());
    }

    @Override // defpackage.t4p
    public int get(z4p z4pVar) {
        return z4pVar == ChronoField.DAY_OF_WEEK ? getValue() : range(z4pVar).checkValidIntValue(getLong(z4pVar), z4pVar);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new kq5().k(ChronoField.DAY_OF_WEEK, textStyle).w(locale).b(this);
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (z4pVar == ChronoField.DAY_OF_WEEK) {
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
            return z4pVar == ChronoField.DAY_OF_WEEK;
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    public DayOfWeek minus(long j) {
        return plus(-(j % 7));
    }

    public DayOfWeek plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 7)) + 7)) % 7];
    }

    @Override // defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.DAYS;
        }
        if (b5pVar == a5p.b() || b5pVar == a5p.c() || b5pVar == a5p.a() || b5pVar == a5p.f() || b5pVar == a5p.g() || b5pVar == a5p.d()) {
            return null;
        }
        return b5pVar.a(this);
    }

    @Override // defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar == ChronoField.DAY_OF_WEEK) {
            return z4pVar.range();
        }
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.rangeRefinedBy(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
    }
}
