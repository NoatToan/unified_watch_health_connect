package xe1;

import c2.x2;
import e23.l;
import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m92.h0;
import o13.p;
import o4.d0;
import p13.t0;
import p13.x;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import ug2.q;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:76:0x01a4  */
    public static final void a(List list, Float f14, Float f15, Float f16, m mVar, int i14) {
        o0 o0VarE = mVar.E(1454109720);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.B(f14) ? 32 : 16) | (o0VarE.B(f15) ? 256 : 128) | (o0VarE.B(f16) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            ArrayList<h0.e.a> arrayList = new ArrayList();
            if (list != null) {
                int i16 = 0;
                for (Object obj : list) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        x.q();
                        throw null;
                    }
                    Integer num = ((ue1.d) obj).f170239c;
                    if (num != null) {
                        arrayList.add(new h0.e.a(i16, num.intValue()));
                    }
                    i16 = i17;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            if (list == null) {
                o0VarE.C(343003890);
                o0VarE.g0(false);
            } else {
                o0VarE.C(343003891);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ue1.d dVar = (ue1.d) it.next();
                    if (dVar.f170240d != null) {
                        o0VarE.C(-4480629);
                        arrayList2.add(d0.a(af1.f.a(af1.e.valueOf(dVar.f170240d), o0VarE)));
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-4326869);
                        o0VarE.g0(false);
                    }
                }
                o0VarE.g0(false);
            }
            int iA = t0.a(y.r(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
            for (h0.e.a aVar : arrayList) {
                p pVar = new p(Float.valueOf(aVar.f117346a), Float.valueOf(aVar.f117347b));
                linkedHashMap.put(pVar.f128594a, pVar.f128595b);
            }
            o0VarE.C(1535095344);
            Iterable<Map.Entry> iterableEntrySet = c.b(linkedHashMap, arrayList2, null, o0VarE, 4).entrySet();
            ArrayList arrayList3 = new ArrayList(y.r(iterableEntrySet, 10));
            for (Map.Entry entry : iterableEntrySet) {
                arrayList3.add(new p(entry.getKey(), entry.getValue()));
            }
            o0VarE.g0(false);
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarH = x2.h(x2.f(r.S, 1.0f), 25);
            boolean zR = o0VarE.r(arrayList3) | o0VarE.r(arrayList) | ((i15 & 112) == 32) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (zR) {
                q qVar = new q(arrayList3, arrayList, f14, f15, f16, 12);
                o0VarE.K(qVar);
                objQ = qVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    q qVar2 = new q(arrayList3, arrayList, f14, f15, f16, 12);
                    o0VarE.K(qVar2);
                    objQ = qVar2;
                }
            }
            u1.n.b(rVarH, (l) objQ, o0VarE, 6);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(list, f14, f15, f16, i14, 24);
        }
    }
}
