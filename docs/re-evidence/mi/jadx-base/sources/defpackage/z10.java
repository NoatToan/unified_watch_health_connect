package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z10 implements npr {
    public static Hashtable e(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    @Override // defpackage.npr
    public boolean b(lpr lprVar, lpr lprVar2) {
        r6j[] r6jVarArrJ = lprVar.j();
        r6j[] r6jVarArrJ2 = lprVar2.j();
        if (r6jVarArrJ.length != r6jVarArrJ2.length) {
            return false;
        }
        boolean z = (r6jVarArrJ[0].g() == null || r6jVarArrJ2[0].g() == null) ? false : !r6jVarArrJ[0].g().h().equals(r6jVarArrJ2[0].g().h());
        for (int i = 0; i != r6jVarArrJ.length; i++) {
            if (!f(z, r6jVarArrJ[i], r6jVarArrJ2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.npr
    public int c(lpr lprVar) {
        r6j[] r6jVarArrJ = lprVar.j();
        int iHashCode = 0;
        for (int i = 0; i != r6jVarArrJ.length; i++) {
            if (r6jVarArrJ[i].j()) {
                im1[] im1VarArrI = r6jVarArrJ[i].i();
                for (int i2 = 0; i2 != im1VarArrI.length; i2++) {
                    iHashCode = (iHashCode ^ im1VarArrI[i2].h().hashCode()) ^ d(im1VarArrI[i2].i());
                }
            } else {
                iHashCode = (iHashCode ^ r6jVarArrJ[i].g().h().hashCode()) ^ d(r6jVarArrJ[i].g().i());
            }
        }
        return iHashCode;
    }

    public final int d(gd gdVar) {
        return urc.e(urc.i(gdVar)).hashCode();
    }

    public final boolean f(boolean z, r6j r6jVar, r6j[] r6jVarArr) {
        if (z) {
            for (int length = r6jVarArr.length - 1; length >= 0; length--) {
                r6j r6jVar2 = r6jVarArr[length];
                if (r6jVar2 != null && g(r6jVar, r6jVar2)) {
                    r6jVarArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i = 0; i != r6jVarArr.length; i++) {
                r6j r6jVar3 = r6jVarArr[i];
                if (r6jVar3 != null && g(r6jVar, r6jVar3)) {
                    r6jVarArr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean g(r6j r6jVar, r6j r6jVar2) {
        return urc.g(r6jVar, r6jVar2);
    }
}
