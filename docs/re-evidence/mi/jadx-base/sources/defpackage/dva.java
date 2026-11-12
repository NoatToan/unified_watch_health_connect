package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.a;
import org.joda.time.field.UnsupportedDurationField;

/* JADX INFO: loaded from: classes3.dex */
public final class dva extends o62 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f15959b;

    public dva(a aVar) {
        super(DateTimeFieldType.era());
        this.f15959b = aVar;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return this.f15959b.getYear(j) <= 0 ? 0 : 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public String getAsText(int i, Locale locale) {
        return eva.h(locale).g(i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getDurationField() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumTextLength(Locale locale) {
        return eva.h(locale).k();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 0;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return null;
    }

    @Override // defpackage.gq5
    public boolean isLenient() {
        return false;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundCeiling(long j) {
        if (get(j) == 0) {
            return this.f15959b.setYear(0L, 1);
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundFloor(long j) {
        if (get(j) == 1) {
            return this.f15959b.setYear(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundHalfCeiling(long j) {
        return roundFloor(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundHalfEven(long j) {
        return roundFloor(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundHalfFloor(long j) {
        return roundFloor(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, 0, 1);
        if (get(j) == i) {
            return j;
        }
        return this.f15959b.setYear(j, -this.f15959b.getYear(j));
    }

    @Override // defpackage.o62, defpackage.gq5
    public long set(long j, String str, Locale locale) {
        return set(j, eva.h(locale).f(str));
    }
}
