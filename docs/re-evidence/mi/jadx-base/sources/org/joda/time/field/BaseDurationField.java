package org.joda.time.field;

import defpackage.fl9;
import defpackage.t67;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDurationField extends t67 implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    public BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.iType = durationFieldType;
    }

    @Override // defpackage.t67
    public int getDifference(long j, long j2) {
        return fl9.m(getDifferenceAsLong(j, j2));
    }

    @Override // defpackage.t67
    public long getMillis(int i) {
        return ((long) i) * getUnitMillis();
    }

    @Override // defpackage.t67
    public final String getName() {
        return this.iType.getName();
    }

    @Override // defpackage.t67
    public final DurationFieldType getType() {
        return this.iType;
    }

    @Override // defpackage.t67
    public int getValue(long j) {
        return fl9.m(getValueAsLong(j));
    }

    @Override // defpackage.t67
    public long getValueAsLong(long j) {
        return j / getUnitMillis();
    }

    @Override // defpackage.t67
    public final boolean isSupported() {
        return true;
    }

    @Override // defpackage.t67
    public String toString() {
        return "DurationField[" + getName() + AbstractJsonLexerKt.END_LIST;
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
    public long getMillis(long j) {
        return fl9.j(j, getUnitMillis());
    }

    @Override // defpackage.t67
    public int getValue(long j, long j2) {
        return fl9.m(getValueAsLong(j, j2));
    }
}
