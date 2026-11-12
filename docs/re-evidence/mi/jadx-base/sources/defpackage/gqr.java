package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class gqr extends de implements uqr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a87 f19250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f19251b;
    public ee c;

    public gqr(a87 a87Var, byte[] bArr) {
        this.c = null;
        this.f19250a = a87Var;
        this.f19251b = bArr;
        i();
    }

    public a87 g() {
        return this.f19250a;
    }

    public byte[] h() {
        return this.f19251b;
    }

    public final void i() {
        ee eeVar;
        if (v77.f(this.f19250a)) {
            eeVar = uqr.Ba;
        } else {
            if (!v77.d(this.f19250a)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            eeVar = uqr.Ca;
        }
        this.c = eeVar;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        if (this.c.equals(uqr.Ba) || this.c.equals(uqr.Ca)) {
            jdVar.a(new oqr(this.f19250a.n()).toASN1Primitive());
            oqr oqrVar = new oqr(this.f19250a.o());
            jdVar.a(oqrVar.toASN1Primitive());
        }
        if (this.f19251b != null) {
            jdVar.a(new xf5(this.f19251b));
        }
        return new yg5(jdVar);
    }

    public gqr(qqr qqrVar, te teVar) {
        int iIntValue;
        int iIntValue2;
        int i;
        a87 dVar;
        this.c = null;
        ee eeVarG = qqrVar.g();
        this.c = eeVarG;
        if (eeVarG.equals(uqr.Ba)) {
            BigInteger bigIntegerR = ((wd) qqrVar.i()).r();
            dVar = new a87.e(bigIntegerR, new oqr(bigIntegerR, (he) teVar.t(0)).g().t(), new oqr(bigIntegerR, (he) teVar.t(1)).g().t());
        } else {
            if (!this.c.equals(uqr.Ca)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            te teVarQ = te.q(qqrVar.i());
            int iIntValue3 = ((wd) teVarQ.t(0)).r().intValue();
            ee eeVar = (ee) teVarQ.t(1);
            if (eeVar.equals(uqr.Ea)) {
                iIntValue2 = wd.o(teVarQ.t(2)).r().intValue();
                i = 0;
                iIntValue = 0;
            } else {
                if (!eeVar.equals(uqr.Fa)) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                te teVarQ2 = te.q(teVarQ.t(2));
                int iIntValue4 = wd.o(teVarQ2.t(0)).r().intValue();
                int iIntValue5 = wd.o(teVarQ2.t(1)).r().intValue();
                iIntValue = wd.o(teVarQ2.t(2)).r().intValue();
                iIntValue2 = iIntValue4;
                i = iIntValue5;
            }
            int i2 = iIntValue2;
            int i3 = i;
            int i4 = iIntValue;
            dVar = new a87.d(iIntValue3, i2, i3, i4, new oqr(iIntValue3, i2, i3, i4, (he) teVar.t(0)).g().t(), new oqr(iIntValue3, i2, i3, i4, (he) teVar.t(1)).g().t());
        }
        this.f19250a = dVar;
        if (teVar.size() == 3) {
            this.f19251b = ((xf5) teVar.t(2)).r();
        }
    }
}
