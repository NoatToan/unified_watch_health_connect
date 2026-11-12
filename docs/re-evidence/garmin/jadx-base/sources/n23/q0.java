package n23;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class q0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f122573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122574b;

    public q0(t0 t0Var, String str) {
        this.f122573a = t0Var;
        this.f122574b = str;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0094  */
    @Override // e23.a
    public final Object invoke() {
        Collection<t23.v> collectionI;
        ArrayList arrayList;
        String f122392b;
        t0 t0Var = this.f122573a;
        i3 i3Var = t0Var.f122613h;
        String str = t0Var.f122614i;
        i3Var.getClass();
        String str2 = this.f122574b;
        str2.getClass();
        str.getClass();
        if (str2.equals("<init>")) {
            collectionI = p13.h0.b1(i3Var.H());
            arrayList = new ArrayList();
            for (Object obj : collectionI) {
                t23.k kVar = (t23.k) obj;
                if (kVar.L()) {
                    t23.i iVarD = kVar.d();
                    iVarD.getClass();
                    if (b43.j.c(iVarD)) {
                        m4.f122535a.getClass();
                        String f122392b2 = m4.c(kVar).getF122392b();
                        if (!d53.u.y(f122392b2, "constructor-impl", false) || !d53.u.p(f122392b2, ")V", false)) {
                            vb.h.A("Invalid signature of ", kVar, ": ", f122392b2);
                            return null;
                        }
                        String strR = d53.w.R(f122392b2, "V");
                        t23.i iVarD2 = kVar.d();
                        iVarD2.getClass();
                        x33.b bVarF = f43.e.f(iVarD2);
                        bVarF.getClass();
                        f122392b = strR.concat(w33.b.b(bVarF.b()));
                    } else {
                        m4.f122535a.getClass();
                        f122392b = m4.c(kVar).getF122392b();
                    }
                } else {
                    m4.f122535a.getClass();
                    f122392b = m4.c(kVar).getF122392b();
                }
                if (p005kotlin.jvm.internal.s.g(f122392b, str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            collectionI = i3Var.I(x33.f.e(str2));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : collectionI) {
                m4.f122535a.getClass();
                if (p005kotlin.jvm.internal.s.g(m4.c((t23.v) obj2).getF122392b(), str)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList.size() == 1) {
            return (t23.v) p13.h0.I0(arrayList);
        }
        String strK0 = p13.h0.k0(collectionI, "\n", null, null, h3.f122496a, 30);
        StringBuilder sbI = p6.b.i("Function '", str2, "' (JVM signature: ", str, ") not resolved in ");
        sbI.append(i3Var);
        sbI.append(CoreConstants.COLON_CHAR);
        sbI.append(strK0.length() == 0 ? " no members found" : "\n".concat(strK0));
        throw new w3(sbI.toString());
    }
}
