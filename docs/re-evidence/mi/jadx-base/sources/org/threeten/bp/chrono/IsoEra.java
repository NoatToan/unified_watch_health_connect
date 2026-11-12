package org.threeten.bp.chrono;

import defpackage.a5p;
import defpackage.ad8;
import defpackage.b5p;
import defpackage.kq5;
import defpackage.s4p;
import defpackage.z4p;
import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public enum IsoEra implements ad8 {
    BCE,
    CE;

    public static IsoEra of(int i) {
        if (i == 0) {
            return BCE;
        }
        if (i == 1) {
            return CE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // defpackage.w4p
    public s4p adjustInto(s4p s4pVar) {
        return s4pVar.with(ChronoField.ERA, getValue());
    }

    @Override // defpackage.t4p
    public int get(z4p z4pVar) {
        return z4pVar == ChronoField.ERA ? getValue() : range(z4pVar).checkValidIntValue(getLong(z4pVar), z4pVar);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new kq5().k(ChronoField.ERA, textStyle).w(locale).b(this);
    }

    @Override // defpackage.t4p
    public long getLong(z4p z4pVar) {
        if (z4pVar == ChronoField.ERA) {
            return getValue();
        }
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.getFrom(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
    }

    @Override // defpackage.ad8
    public int getValue() {
        return ordinal();
    }

    @Override // defpackage.t4p
    public boolean isSupported(z4p z4pVar) {
        if (z4pVar instanceof ChronoField) {
            return z4pVar == ChronoField.ERA;
        }
        return z4pVar != null && z4pVar.isSupportedBy(this);
    }

    @Override // defpackage.t4p
    public <R> R query(b5p<R> b5pVar) {
        if (b5pVar == a5p.e()) {
            return (R) ChronoUnit.ERAS;
        }
        if (b5pVar == a5p.a() || b5pVar == a5p.f() || b5pVar == a5p.g() || b5pVar == a5p.d() || b5pVar == a5p.b() || b5pVar == a5p.c()) {
            return null;
        }
        return b5pVar.a(this);
    }

    @Override // defpackage.t4p
    public ValueRange range(z4p z4pVar) {
        if (z4pVar == ChronoField.ERA) {
            return z4pVar.range();
        }
        if (!(z4pVar instanceof ChronoField)) {
            return z4pVar.rangeRefinedBy(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
    }
}
