package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class fqr extends be implements tqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b87 f18097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f18098b;
    public fe c;

    public fqr(b87 b87Var, byte[] bArr) {
        this.c = null;
        this.f18097a = b87Var;
        this.f18098b = bArr;
        i();
    }

    public b87 g() {
        return this.f18097a;
    }

    public byte[] h() {
        return this.f18098b;
    }

    public final void i() {
        if (u77.c(this.f18097a)) {
            this.c = tqr.i9;
        } else {
            if (!u77.a(this.f18097a)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            this.c = tqr.j9;
        }
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        if (this.c.equals(tqr.i9) || this.c.equals(tqr.j9)) {
            idVar.a(new nqr(this.f18097a.k()).toASN1Primitive());
            idVar.a(new nqr(this.f18097a.l()).toASN1Primitive());
        }
        if (this.f18098b != null) {
            idVar.a(new wf5(this.f18098b));
        }
        return new xg5(idVar);
    }

    public fqr(pqr pqrVar, se seVar) {
        int iIntValue;
        int iIntValue2;
        int i;
        this.c = null;
        fe feVarG = pqrVar.g();
        this.c = feVarG;
        if (feVarG.equals(tqr.i9)) {
            BigInteger bigIntegerR = ((vd) pqrVar.i()).r();
            this.f18097a = new b87.e(bigIntegerR, new nqr(bigIntegerR, (ge) seVar.t(0)).g().s(), new nqr(bigIntegerR, (ge) seVar.t(1)).g().s());
        } else if (this.c.equals(tqr.j9)) {
            se seVarQ = se.q(pqrVar.i());
            int iIntValue3 = ((vd) seVarQ.t(0)).r().intValue();
            fe feVar = (fe) seVarQ.t(1);
            if (feVar.equals(tqr.l9)) {
                iIntValue2 = vd.o(seVarQ.t(2)).r().intValue();
                i = 0;
                iIntValue = 0;
            } else if (feVar.equals(tqr.m9)) {
                se seVarQ2 = se.q(seVarQ.t(2));
                int iIntValue4 = vd.o(seVarQ2.t(0)).r().intValue();
                int iIntValue5 = vd.o(seVarQ2.t(1)).r().intValue();
                iIntValue = vd.o(seVarQ2.t(2)).r().intValue();
                iIntValue2 = iIntValue4;
                i = iIntValue5;
            } else {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            }
            int i2 = iIntValue2;
            int i3 = i;
            int i4 = iIntValue;
            this.f18097a = new b87.d(iIntValue3, i2, i3, i4, new nqr(iIntValue3, i2, i3, i4, (ge) seVar.t(0)).g().s(), new nqr(iIntValue3, i2, i3, i4, (ge) seVar.t(1)).g().s());
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        if (seVar.size() == 3) {
            this.f18098b = ((wf5) seVar.t(2)).r();
        }
    }
}
