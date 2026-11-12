package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class m97 extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public te f25910a;

    public m97(int i, BigInteger bigInteger, hd hdVar) {
        this(i, bigInteger, null, hdVar);
    }

    public static m97 g(Object obj) {
        if (obj instanceof m97) {
            return (m97) obj;
        }
        if (obj != null) {
            return new m97(te.q(obj));
        }
        return null;
    }

    public BigInteger h() {
        return new BigInteger(1, ((he) this.f25910a.t(1)).r());
    }

    public final re i(int i) {
        Enumeration enumerationU = this.f25910a.u();
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

    public xf5 j() {
        return (xf5) i(1);
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        return this.f25910a;
    }

    public m97(int i, BigInteger bigInteger, xf5 xf5Var, hd hdVar) {
        byte[] bArrA = yi2.a((i + 7) / 8, bigInteger);
        jd jdVar = new jd();
        jdVar.a(new wd(1L));
        jdVar.a(new qg5(bArrA));
        if (hdVar != null) {
            jdVar.a(new ih5(true, 0, hdVar));
        }
        if (xf5Var != null) {
            jdVar.a(new ih5(true, 1, xf5Var));
        }
        this.f25910a = new yg5(jdVar);
    }

    public m97(te teVar) {
        this.f25910a = teVar;
    }
}
