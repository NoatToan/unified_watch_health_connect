package org.joda.time.field;

import defpackage.fl9;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j) {
        super(durationFieldType);
        this.iUnitMillis = j;
    }

    @Override // defpackage.t67
    public long add(long j, int i) {
        return fl9.e(j, ((long) i) * this.iUnitMillis);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreciseDurationField)) {
            return false;
        }
        PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
        return getType() == preciseDurationField.getType() && this.iUnitMillis == preciseDurationField.iUnitMillis;
    }

    @Override // defpackage.t67
    public long getDifferenceAsLong(long j, long j2) {
        return fl9.l(j, j2) / this.iUnitMillis;
    }

    @Override // defpackage.t67
    public long getMillis(int i, long j) {
        return ((long) i) * this.iUnitMillis;
    }

    @Override // defpackage.t67
    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // defpackage.t67
    public long getValueAsLong(long j, long j2) {
        return j / this.iUnitMillis;
    }

    public int hashCode() {
        long j = this.iUnitMillis;
        return ((int) (j ^ (j >>> 32))) + getType().hashCode();
    }

    @Override // defpackage.t67
    public final boolean isPrecise() {
        return true;
    }

    @Override // defpackage.t67
    public long getMillis(long j, long j2) {
        return fl9.j(j, this.iUnitMillis);
    }

    @Override // defpackage.t67
    public long add(long j, long j2) {
        return fl9.e(j, fl9.j(j2, this.iUnitMillis));
    }
}
