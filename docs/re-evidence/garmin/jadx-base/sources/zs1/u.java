package zs1;

import c2.k3;
import c2.q3;
import i3.e9;
import i3.f9;
import i3.mc;
import p004k6.e0;
import p3.o0;
import p3.p2;
import p3.x1;
import w52.z0;

/* JADX INFO: loaded from: classes10.dex */
public final class u {
    public static final void a(mc mcVar, e23.a aVar, h4.r rVar, boolean z14, e23.p pVar, z3.e eVar, p3.m mVar, int i14) {
        o0 o0Var;
        h4.r rVar2;
        mcVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(727373565);
        int i15 = i14 | (o0VarE.B(mcVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | 384 | (o0VarE.h(z14) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            int i16 = k3.f22728a;
            h4.r rVarG = c2.l.G(aVar2, q3.b(o0VarE));
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.d dVar = j92.b.f97900c;
            float f14 = dVar.f97912d;
            bVar.getClass();
            o0Var = o0VarE;
            e9.a(aVar, rVarG, mcVar, 0.0f, false, k2.i.c(f14, dVar.f97912d, 0.0f, 0.0f, 12), p6.b.b(o0VarE), 0L, 0.0f, 0L, null, new t(0), new f9(e0.Inherit, true, false, 4, (p005kotlin.jvm.internal.j) null), z3.f.c(-1493146017, new h21.m(z14, aVar, eVar, pVar), o0VarE), o0Var, ((i15 >> 3) & 14) | ((i15 << 6) & 896), 3462, 920);
            rVar2 = aVar2;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z0(mcVar, aVar, rVar2, z14, pVar, eVar, i14);
        }
    }
}
