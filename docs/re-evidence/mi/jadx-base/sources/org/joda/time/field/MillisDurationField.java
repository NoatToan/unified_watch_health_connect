package org.joda.time.field;

import defpackage.fl9;
import defpackage.t67;
import java.io.Serializable;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public final class MillisDurationField extends t67 implements Serializable {
    public static final t67 INSTANCE = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    private MillisDurationField() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // defpackage.t67
    public long add(long j, int i) {
        return fl9.e(j, i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof MillisDurationField) && getUnitMillis() == ((MillisDurationField) obj).getUnitMillis();
    }

    @Override // defpackage.t67
    public int getDifference(long j, long j2) {
        return fl9.m(fl9.l(j, j2));
    }

    @Override // defpackage.t67
    public long getDifferenceAsLong(long j, long j2) {
        return fl9.l(j, j2);
    }

    @Override // defpackage.t67
    public long getMillis(int i) {
        return i;
    }

    @Override // defpackage.t67
    public String getName() {
        return "millis";
    }

    @Override // defpackage.t67
    public DurationFieldType getType() {
        return DurationFieldType.millis();
    }

    @Override // defpackage.t67
    public final long getUnitMillis() {
        return 1L;
    }

    @Override // defpackage.t67
    public int getValue(long j) {
        return fl9.m(j);
    }

    @Override // defpackage.t67
    public long getValueAsLong(long j) {
        return j;
    }

    public int hashCode() {
        return (int) getUnitMillis();
    }

    @Override // defpackage.t67
    public final boolean isPrecise() {
        return true;
    }

    @Override // defpackage.t67
    public boolean isSupported() {
        return true;
    }

    @Override // defpackage.t67
    public String toString() {
        return "DurationField[millis]";
    }

    @Override // defpackage.t67
    public long add(long j, long j2) {
        return fl9.e(j, j2);
    }

    @Override // java.lang.Comparable
    public int compareTo(t67 t67Var) {
        long unitMillis = t67Var.getUnitMillis();
        long unitMillis2 = getUnitMillis();
        if (unitMillis2 == unitMillis) {
            return 0;
        }
        return unitMillis2 < unitMillis ? -1 : 1;
    }

    @Override // defpackage.t67
    public long getMillis(int i, long j) {
        return i;
    }

    @Override // defpackage.t67
    public int getValue(long j, long j2) {
        return fl9.m(j);
    }

    @Override // defpackage.t67
    public long getValueAsLong(long j, long j2) {
        return j;
    }

    @Override // defpackage.t67
    public long getMillis(long j) {
        return j;
    }

    @Override // defpackage.t67
    public long getMillis(long j, long j2) {
        return j;
    }
}
