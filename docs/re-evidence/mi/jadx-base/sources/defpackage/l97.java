package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class l97 extends be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public se f24797a;

    public l97(int i, BigInteger bigInteger, gd gdVar) {
        this(i, bigInteger, null, gdVar);
    }

    public static l97 g(Object obj) {
        if (obj instanceof l97) {
            return (l97) obj;
        }
        if (obj != null) {
            return new l97(se.q(obj));
        }
        return null;
    }

    public BigInteger h() {
        return new BigInteger(1, ((ge) this.f24797a.t(1)).r());
    }

    public final pe i(int i) {
        Enumeration enumerationU = this.f24797a.u();
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

    public wf5 j() {
        return (wf5) i(1);
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        return this.f24797a;
    }

    public l97(se seVar) {
        this.f24797a = seVar;
    }

    public l97(int i, BigInteger bigInteger, wf5 wf5Var, gd gdVar) {
        byte[] bArrA = xi2.a((i + 7) / 8, bigInteger);
        id idVar = new id();
        idVar.a(new vd(1L));
        idVar.a(new pg5(bArrA));
        if (gdVar != null) {
            idVar.a(new hh5(true, 0, gdVar));
        }
        if (wf5Var != null) {
            idVar.a(new hh5(true, 1, wf5Var));
        }
        this.f24797a = new xg5(idVar);
    }
}
