package s70;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls70/t;", "Lr70/r;", "Ly70/d;", "stateHolder", "<init>", "(Ly70/d;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.d f157800a;

    public t(y70.d dVar) {
        dVar.getClass();
        this.f157800a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar2;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -1025996606);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarQ.B(this) : o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = this.f157800a.f194654a.f124607a.a();
                o0VarQ.K(objQ);
            }
            List list = (List) s9.c.b((r53.i) objQ, p13.j0.f134944a, o0VarQ, 48).getF182175a();
            if (list.isEmpty()) {
                rVar2 = rVar;
                o0VarQ.C(1817943552);
                o0VarQ.g0(false);
            } else {
                o0VarQ.C(1817656213);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                float f15 = eVar.f97920e;
                bVar.getClass();
                rVar2 = rVar;
                h4.r rVarC = c2.l.C(rVar2, f14, eVar.f97920e, f15, 0.0f, 8);
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((o13.p) it.next()).f128595b);
                }
                u.a(rVarC, arrayList, o0VarQ, 0);
                o0VarQ.g0(false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            rVar2 = rVar;
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(this, rVar2, qVar, i14, 2);
        }
    }
}
