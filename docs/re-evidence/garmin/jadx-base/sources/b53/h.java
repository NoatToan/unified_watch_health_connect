package b53;

import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p13.j0;
import p13.x;
import p13.y;
import p43.n0;
import p43.t1;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f16121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a f16122b;

    public h(l lVar, e23.a aVar) {
        this.f16121a = lVar;
        this.f16122b = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.r rVarA;
        k23.r rVar;
        l lVar = this.f16121a;
        List<t1> listD0 = lVar.f16127b.D0();
        if (listD0.isEmpty()) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(y.r(listD0, 10));
        int i14 = 0;
        for (Object obj : listD0) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            t1 t1Var = (t1) obj;
            n23.y yVar = this.f16122b != null ? new n23.y(new k(lVar), i14) : null;
            if (t1Var.b()) {
                k23.r.f102461c.getClass();
                rVarA = k23.r.f102462d;
            } else {
                n0 type = t1Var.getType();
                type.getClass();
                l lVar2 = new l(type, yVar);
                int i16 = l.a.f16131a[t1Var.a().ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        k23.r.f102461c.getClass();
                        rVar = new k23.r(k23.s.IN, lVar2);
                    } else {
                        if (i16 != 3) {
                            u0.r();
                            return null;
                        }
                        k23.r.f102461c.getClass();
                        rVar = new k23.r(k23.s.OUT, lVar2);
                    }
                    rVarA = rVar;
                } else {
                    k23.r.f102461c.getClass();
                    rVarA = k23.r.a.a(lVar2);
                }
            }
            arrayList.add(rVarA);
            i14 = i15;
        }
        return arrayList;
    }
}
