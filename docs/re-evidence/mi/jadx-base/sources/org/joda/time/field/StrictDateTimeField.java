package org.joda.time.field;

import defpackage.fl9;
import defpackage.gq5;

/* JADX INFO: loaded from: classes3.dex */
public class StrictDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = 3154803964207950910L;

    public StrictDateTimeField(gq5 gq5Var) {
        super(gq5Var);
    }

    public static gq5 getInstance(gq5 gq5Var) {
        if (gq5Var == null) {
            return null;
        }
        if (gq5Var instanceof LenientDateTimeField) {
            gq5Var = ((LenientDateTimeField) gq5Var).getWrappedField();
        }
        return !gq5Var.isLenient() ? gq5Var : new StrictDateTimeField(gq5Var);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, defpackage.gq5
    public final boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, getMinimumValue(j), getMaximumValue(j));
        return super.set(j, i);
    }
}
