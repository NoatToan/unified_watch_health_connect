package by1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.m0;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f22193c;

    public /* synthetic */ k(ey1.a aVar, m0 m0Var, int i14) {
        this.f22191a = i14;
        this.f22192b = aVar;
        this.f22193c = m0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        int i14 = this.f22191a;
        m0 m0Var = this.f22193c;
        ey1.a aVar = this.f22192b;
        switch (i14) {
            case 0:
                m mVar = m.f22196a;
                aVar.V4(null);
                aVar.f67285q = null;
                while (m0Var.n()) {
                }
                lc.y.k(x.f22221a.c(), m0Var);
                break;
            case 1:
                r rVar = r.f22207a;
                aVar.V4(null);
                String strC = x.f22221a.c();
                m0Var.getClass();
                qc.h hVar = m0Var.f111904b;
                hVar.getClass();
                if (hVar.s(strC, false, false)) {
                    hVar.b();
                }
                break;
            case 2:
                cy1.d dVar = cy1.d.f56799a;
                nx1.m mVar2 = aVar.f67282n;
                mx1.f fVar = ((dy1.p) aVar.f67289w.f150540a.getValue()).f61598d;
                int i15 = fVar != null ? fVar.f121398d : 0;
                mVar2.getClass();
                List listS0 = h0.S0(p13.x.k(mx1.b.GENERIC_WORKOUT_1, mx1.b.GENERIC_WORKOUT_2, mx1.b.GENERIC_WORKOUT_3, mx1.b.GENERIC_WORKOUT_4, mx1.b.GENERIC_WORKOUT_5), i15);
                ArrayList arrayList = new ArrayList(p13.y.r(listS0, 10));
                Iterator it = listS0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new dy1.k((mx1.b) it.next(), j53.l.b()));
                }
                i53.c cVarE = i53.a.e(arrayList);
                p2 p2Var = mVar2.f128245b;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, cVarE));
                mVar2.a(mx1.b.GENERIC_WORKOUT_1);
                lc.y.k(cy1.f.f56801a.c(), m0Var);
                break;
            default:
                cy1.e eVar = cy1.e.f56800a;
                aVar.T4(null);
                lc.y.k(cy1.d.f56799a.c(), m0Var);
                break;
        }
        return Unit.INSTANCE;
    }
}
