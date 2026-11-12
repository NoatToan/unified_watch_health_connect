package ff;

import cf.d0;
import cf.i;
import cf.j;
import cf.m;
import cf.o;
import cf.t;
import fb1.c;
import java.util.Iterator;
import java.util.List;
import jg.b;
import p13.h0;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f71029a = 0;

    static {
        u.b("DiagnosticsWrkr");
    }

    public static final String a(o oVar, d0 d0Var, j jVar, List list) {
        StringBuilder sb3 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            m mVarW = b.w(tVar);
            String str = tVar.f26941a;
            i iVarB = jVar.b(mVarW);
            Integer numValueOf = iVarB != null ? Integer.valueOf(iVarB.f26922c) : null;
            String strK0 = h0.k0(oVar.a(str), ",", null, null, null, 62);
            String strK1 = h0.k0(d0Var.c(str), ",", null, null, null, 62);
            StringBuilder sbL = hb.a.l("\n", str, "\t ");
            c.u(numValueOf, tVar.f26943c, "\t ", "\t ", sbL);
            sbL.append(tVar.f26942b.name());
            sbL.append("\t ");
            sbL.append(strK0);
            sbL.append("\t ");
            sbL.append(strK1);
            sbL.append('\t');
            sb3.append(sbL.toString());
        }
        return sb3.toString();
    }
}
