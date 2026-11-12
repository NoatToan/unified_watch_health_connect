package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public class xg2 extends b7d {
    public final a d;

    public xg2(a aVar) {
        super(DateTimeFieldType.year(), aVar.getAverageMillisPerYear());
        this.d = aVar;
    }

    @Override // defpackage.b7d, defpackage.o62, defpackage.gq5
    public long add(long j, int i) {
        return i == 0 ? j : set(j, fl9.d(get(j), i));
    }

    @Override // defpackage.o62, defpackage.gq5
    public long addWrapField(long j, int i) {
        return i == 0 ? j : set(j, fl9.c(this.d.getYear(j), i, this.d.getMinYear(), this.d.getMaxYear()));
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return this.d.getYear(j);
    }

    @Override // defpackage.b7d, defpackage.o62, defpackage.gq5
    public long getDifferenceAsLong(long j, long j2) {
        return j < j2 ? -this.d.getYearDifference(j2, j) : this.d.getYearDifference(j, j2);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getLeapAmount(long j) {
        return this.d.isLeapYear(get(j)) ? 1 : 0;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getLeapDurationField() {
        return this.d.days();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return this.d.getMaxYear();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return this.d.getMinYear();
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return null;
    }

    @Override // defpackage.o62, defpackage.gq5
    public boolean isLeap(long j) {
        return this.d.isLeapYear(get(j));
    }

    @Override // defpackage.gq5
    public boolean isLenient() {
        return false;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundCeiling(long j) {
        int i = get(j);
        return j != this.d.getYearMillis(i) ? this.d.getYearMillis(i + 1) : j;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundFloor(long j) {
        return this.d.getYearMillis(get(j));
    }

    @Override // defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, this.d.getMinYear(), this.d.getMaxYear());
        return this.d.setYear(j, i);
    }

    @Override // defpackage.gq5
    public long setExtended(long j, int i) {
        fl9.n(this, i, this.d.getMinYear() - 1, this.d.getMaxYear() + 1);
        return this.d.setYear(j, i);
    }

    @Override // defpackage.b7d, defpackage.o62, defpackage.gq5
    public long add(long j, long j2) {
        return add(j, fl9.m(j2));
    }
}
