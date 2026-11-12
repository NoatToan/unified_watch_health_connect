package org.joda.time.field;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.gq5;

/* JADX INFO: loaded from: classes3.dex */
public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;
    private final bw3 iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipUndoDateTimeField(bw3 bw3Var, gq5 gq5Var) {
        this(bw3Var, gq5Var, 0);
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, defpackage.gq5
    public int get(long j) {
        int i = super.get(j);
        return i < this.iSkip ? i + 1 : i;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, defpackage.gq5
    public int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, this.iMinValue, getMaximumValue());
        if (i <= this.iSkip) {
            i--;
        }
        return super.set(j, i);
    }

    public SkipUndoDateTimeField(bw3 bw3Var, gq5 gq5Var, int i) {
        super(gq5Var);
        this.iChronology = bw3Var;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i) {
            this.iMinValue = minimumValue + 1;
        } else if (minimumValue == i + 1) {
            this.iMinValue = i;
        } else {
            this.iMinValue = minimumValue;
        }
        this.iSkip = i;
    }
}
