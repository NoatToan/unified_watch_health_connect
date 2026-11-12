package w43;

import p43.n0;
import t23.c0;
import t23.c1;
import t23.u0;

/* JADX INFO: loaded from: classes3.dex */
public class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f182024a = new r();

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean zD;
        x33.b bVarF;
        n0 returnType;
        boolean zD2;
        t23.v vVar = (t23.v) obj;
        s sVar = s.f182025a;
        vVar.getClass();
        u0 u0VarH = vVar.H();
        if (u0VarH == null) {
            u0VarH = vVar.I();
        }
        s sVar2 = s.f182025a;
        boolean z14 = false;
        if (u0VarH != null) {
            n0 returnType2 = vVar.getReturnType();
            if (returnType2 != null) {
                n0 type = u0VarH.getType();
                type.getClass();
                zD = q43.d.f142786a.d(returnType2, type);
            } else {
                zD = false;
            }
            if (zD) {
                z14 = true;
            } else {
                sVar2.getClass();
                j43.g value = u0VarH.getValue();
                value.getClass();
                if (value instanceof j43.e) {
                    t23.e eVar = ((j43.e) value).f97046a;
                    if (eVar.O() && (bVarF = f43.e.f(eVar)) != null) {
                        c0 c0VarC = b43.i.c(eVar);
                        c0VarC.getClass();
                        t23.h hVarB = t23.u.b(c0VarC, bVarF);
                        c1 c1Var = hVarB instanceof c1 ? (c1) hVarB : null;
                        if (c1Var == null || (returnType = vVar.getReturnType()) == null) {
                            zD2 = false;
                        } else {
                            zD2 = q43.d.f142786a.d(returnType, c1Var.E());
                        }
                    } else {
                        zD2 = false;
                    }
                } else {
                    zD2 = false;
                }
                if (zD2) {
                    z14 = true;
                }
            }
        }
        if (z14) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }
}
