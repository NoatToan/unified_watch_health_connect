package q33;

import java.util.Iterator;
import p43.d2;
import p43.n0;
import t23.j1;
import t23.s0;
import t23.u0;
import t23.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    public static String a(t23.v vVar, int i14) {
        String strB;
        boolean z14 = (i14 & 1) != 0;
        boolean z15 = (i14 & 2) != 0;
        vVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        if (z15) {
            if (vVar instanceof t23.k) {
                strB = "<init>";
            } else {
                strB = vVar.getName().b();
                strB.getClass();
            }
            sb3.append(strB);
        }
        sb3.append("(");
        u0 u0VarI = vVar.I();
        if (u0VarI != null) {
            n0 type = u0VarI.getType();
            type.getClass();
            sb3.append(c(type));
        }
        Iterator<j1> it = vVar.f().iterator();
        while (it.hasNext()) {
            n0 type2 = it.next().getType();
            type2.getClass();
            sb3.append(c(type2));
        }
        sb3.append(")");
        if (z14) {
            if (vVar instanceof t23.k) {
                sb3.append("V");
            } else {
                n0 returnType = vVar.getReturnType();
                returnType.getClass();
                x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
                if (p005kotlin.reflect.jvm.internal.impl.builtins.d.E(returnType, kotlin.reflect.jvm.internal.impl.builtins.f.a.f105875e)) {
                    n0 returnType2 = vVar.getReturnType();
                    returnType2.getClass();
                    if (!d2.g(returnType2) && !(vVar instanceof s0)) {
                        sb3.append("V");
                    }
                }
                n0 returnType3 = vVar.getReturnType();
                returnType3.getClass();
                sb3.append(c(returnType3));
            }
        }
        return sb3.toString();
    }

    public static final String b(t23.a aVar) {
        aVar.getClass();
        e0 e0Var = e0.f142457a;
        if (!b43.i.m(aVar)) {
            t23.l lVarD = aVar.d();
            t23.e eVar = lVarD instanceof t23.e ? (t23.e) lVarD : null;
            if (eVar != null && !eVar.getName().f188606b) {
                t23.a aVarA = aVar.a();
                x0 x0Var = aVarA instanceof x0 ? (x0) aVarA : null;
                if (x0Var != null) {
                    return oc.b.I(e0Var, eVar, a(x0Var, 3));
                }
            }
        }
        return null;
    }

    public static final s c(n0 n0Var) {
        return (s) o72.t.T(n0Var, u.f142537a, g0.f142468l, f0.f142465a, z43.h.f202422b);
    }
}
