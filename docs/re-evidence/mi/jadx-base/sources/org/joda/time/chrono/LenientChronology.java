package org.joda.time.chrono;

import defpackage.bw3;
import defpackage.gq5;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTimeZone;
import org.joda.time.field.LenientDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
public final class LenientChronology extends AssembledChronology {
    private static final long serialVersionUID = -3148237568046877177L;
    private transient bw3 iWithUTC;

    private LenientChronology(bw3 bw3Var) {
        super(bw3Var, null);
    }

    private final gq5 convertField(gq5 gq5Var) {
        return LenientDateTimeField.getInstance(gq5Var, getBase());
    }

    public static LenientChronology getInstance(bw3 bw3Var) {
        if (bw3Var != null) {
            return new LenientChronology(bw3Var);
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.a aVar) {
        aVar.E = convertField(aVar.E);
        aVar.F = convertField(aVar.F);
        aVar.G = convertField(aVar.G);
        aVar.H = convertField(aVar.H);
        aVar.I = convertField(aVar.I);
        aVar.x = convertField(aVar.x);
        aVar.y = convertField(aVar.y);
        aVar.z = convertField(aVar.z);
        aVar.D = convertField(aVar.D);
        aVar.A = convertField(aVar.A);
        aVar.B = convertField(aVar.B);
        aVar.C = convertField(aVar.C);
        aVar.m = convertField(aVar.m);
        aVar.n = convertField(aVar.n);
        aVar.o = convertField(aVar.o);
        aVar.p = convertField(aVar.p);
        aVar.q = convertField(aVar.q);
        aVar.f29543r = convertField(aVar.f29543r);
        aVar.s = convertField(aVar.s);
        aVar.u = convertField(aVar.u);
        aVar.t = convertField(aVar.t);
        aVar.v = convertField(aVar.v);
        aVar.w = convertField(aVar.w);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LenientChronology) {
            return getBase().equals(((LenientChronology) obj).getBase());
        }
        return false;
    }

    public int hashCode() {
        return (getBase().hashCode() * 7) + 236548278;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public String toString() {
        return "LenientChronology[" + getBase().toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withUTC() {
        if (this.iWithUTC == null) {
            if (getZone() == DateTimeZone.UTC) {
                this.iWithUTC = this;
            } else {
                this.iWithUTC = getInstance(getBase().withUTC());
            }
        }
        return this.iWithUTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.bw3
    public bw3 withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == DateTimeZone.UTC) {
            return withUTC();
        }
        return dateTimeZone == getZone() ? this : getInstance(getBase().withZone(dateTimeZone));
    }
}
