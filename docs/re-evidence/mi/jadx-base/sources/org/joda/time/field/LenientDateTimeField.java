package org.joda.time.field;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.gq5;

/* JADX INFO: loaded from: classes3.dex */
public class LenientDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = 8714085824173290599L;
    private final bw3 iBase;

    public LenientDateTimeField(gq5 gq5Var, bw3 bw3Var) {
        super(gq5Var);
        this.iBase = bw3Var;
    }

    public static gq5 getInstance(gq5 gq5Var, bw3 bw3Var) {
        if (gq5Var == null) {
            return null;
        }
        if (gq5Var instanceof StrictDateTimeField) {
            gq5Var = ((StrictDateTimeField) gq5Var).getWrappedField();
        }
        return gq5Var.isLenient() ? gq5Var : new LenientDateTimeField(gq5Var, bw3Var);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, defpackage.gq5
    public final boolean isLenient() {
        return true;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, defpackage.gq5
    public long set(long j, int i) {
        return this.iBase.getZone().convertLocalToUTC(getType().getField(this.iBase.withUTC()).add(this.iBase.getZone().convertUTCToLocal(j), fl9.l(i, get(j))), false, j);
    }
}
