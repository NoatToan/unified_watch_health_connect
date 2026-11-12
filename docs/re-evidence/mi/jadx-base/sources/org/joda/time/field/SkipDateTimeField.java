package org.joda.time.field;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.gq5;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;
    private final bw3 iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipDateTimeField(bw3 bw3Var, gq5 gq5Var) {
        this(bw3Var, gq5Var, 0);
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, defpackage.gq5
    public int get(long j) {
        int i = super.get(j);
        return i <= this.iSkip ? i - 1 : i;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, defpackage.gq5
    public int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, this.iMinValue, getMaximumValue());
        int i2 = this.iSkip;
        if (i <= i2) {
            if (i == i2) {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i), (Number) null, (Number) null);
            }
            i++;
        }
        return super.set(j, i);
    }

    public SkipDateTimeField(bw3 bw3Var, gq5 gq5Var, int i) {
        super(gq5Var);
        this.iChronology = bw3Var;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i) {
            this.iMinValue = minimumValue - 1;
        } else if (minimumValue == i) {
            this.iMinValue = i + 1;
        } else {
            this.iMinValue = minimumValue;
        }
        this.iSkip = i;
    }
}
