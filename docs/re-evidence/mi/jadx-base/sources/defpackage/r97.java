package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class r97 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public se f32329a;

    public r97(BigInteger bigInteger, gd gdVar) {
        this(bigInteger, null, gdVar);
    }

    private pe h(int i) {
        Enumeration enumerationU = this.f32329a.u();
        while (enumerationU.hasMoreElements()) {
            gd gdVar = (gd) enumerationU.nextElement();
            if (gdVar instanceof ef) {
                ef efVar = (ef) gdVar;
                if (efVar.q() == i) {
                    return efVar.o().toASN1Primitive();
                }
            }
        }
        return null;
    }

    public BigInteger g() {
        return new BigInteger(1, ((ge) this.f32329a.t(1)).r());
    }

    public wf5 i() {
        return (wf5) h(1);
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        return this.f32329a;
    }

    public r97(se seVar) {
        this.f32329a = seVar;
    }

    public r97(BigInteger bigInteger, wf5 wf5Var, gd gdVar) {
        byte[] bArrB = xi2.b(bigInteger);
        id idVar = new id();
        idVar.a(new vd(1L));
        idVar.a(new pg5(bArrB));
        if (gdVar != null) {
            idVar.a(new hh5(true, 0, gdVar));
        }
        if (wf5Var != null) {
            idVar.a(new hh5(true, 1, wf5Var));
        }
        this.f32329a = new xg5(idVar);
    }
}
