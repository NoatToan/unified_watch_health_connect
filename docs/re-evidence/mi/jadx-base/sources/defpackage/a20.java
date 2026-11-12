package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a20 implements opr {
    public static Hashtable e(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    @Override // defpackage.opr
    public int a(mpr mprVar) {
        s6j[] s6jVarArrJ = mprVar.j();
        int iHashCode = 0;
        for (int i = 0; i != s6jVarArrJ.length; i++) {
            if (s6jVarArrJ[i].j()) {
                jm1[] jm1VarArrI = s6jVarArrJ[i].i();
                for (int i2 = 0; i2 != jm1VarArrI.length; i2++) {
                    iHashCode = (iHashCode ^ jm1VarArrI[i2].h().hashCode()) ^ d(jm1VarArrI[i2].i());
                }
            } else {
                iHashCode = (iHashCode ^ s6jVarArrJ[i].g().h().hashCode()) ^ d(s6jVarArrJ[i].g().i());
            }
        }
        return iHashCode;
    }

    @Override // defpackage.opr
    public boolean c(mpr mprVar, mpr mprVar2) {
        s6j[] s6jVarArrJ = mprVar.j();
        s6j[] s6jVarArrJ2 = mprVar2.j();
        if (s6jVarArrJ.length != s6jVarArrJ2.length) {
            return false;
        }
        boolean z = (s6jVarArrJ[0].g() == null || s6jVarArrJ2[0].g() == null) ? false : !s6jVarArrJ[0].g().h().equals(s6jVarArrJ2[0].g().h());
        for (int i = 0; i != s6jVarArrJ.length; i++) {
            if (!f(z, s6jVarArrJ[i], s6jVarArrJ2)) {
                return false;
            }
        }
        return true;
    }

    public final int d(hd hdVar) {
        return vrc.e(vrc.i(hdVar)).hashCode();
    }

    public final boolean f(boolean z, s6j s6jVar, s6j[] s6jVarArr) {
        if (z) {
            for (int length = s6jVarArr.length - 1; length >= 0; length--) {
                s6j s6jVar2 = s6jVarArr[length];
                if (s6jVar2 != null && g(s6jVar, s6jVar2)) {
                    s6jVarArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i = 0; i != s6jVarArr.length; i++) {
                s6j s6jVar3 = s6jVarArr[i];
                if (s6jVar3 != null && g(s6jVar, s6jVar3)) {
                    s6jVarArr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean g(s6j s6jVar, s6j s6jVar2) {
        return vrc.g(s6jVar, s6jVar2);
    }
}
