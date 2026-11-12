package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class s97 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public te f33428a;

    public s97(te teVar) {
        this.f33428a = teVar;
    }

    private re h(int i) {
        Enumeration enumerationU = this.f33428a.u();
        while (enumerationU.hasMoreElements()) {
            hd hdVar = (hd) enumerationU.nextElement();
            if (hdVar instanceof ff) {
                ff ffVar = (ff) hdVar;
                if (ffVar.r() == i) {
                    return ffVar.q().toASN1Primitive();
                }
            }
        }
        return null;
    }

    public BigInteger g() {
        return new BigInteger(1, ((he) this.f33428a.t(1)).r());
    }

    public xf5 i() {
        return (xf5) h(1);
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        return this.f33428a;
    }

    public s97(BigInteger bigInteger, hd hdVar) {
        this(bigInteger, null, hdVar);
    }

    public s97(BigInteger bigInteger, xf5 xf5Var, hd hdVar) {
        byte[] bArrB = yi2.b(bigInteger);
        jd jdVar = new jd();
        jdVar.a(new wd(1L));
        jdVar.a(new qg5(bArrB));
        if (hdVar != null) {
            jdVar.a(new ih5(true, 0, hdVar));
        }
        if (xf5Var != null) {
            jdVar.a(new ih5(true, 1, xf5Var));
        }
        this.f33428a = new yg5(jdVar);
    }
}
