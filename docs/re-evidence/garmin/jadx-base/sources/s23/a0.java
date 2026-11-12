package s23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.h0;
import p13.u0;
import p43.n1;
import p43.o1;
import p43.v0;
import p43.v1;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {
    public static final n1 a(t23.e eVar, t23.e eVar2) {
        eVar.getClass();
        eVar2.getClass();
        eVar.q().size();
        eVar2.q().size();
        o1.a aVar = o1.f135897b;
        List<d1> listQ = eVar.q();
        listQ.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(listQ, 10));
        Iterator<T> it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((d1) it.next()).h());
        }
        List<d1> listQ2 = eVar2.q();
        listQ2.getClass();
        ArrayList arrayList2 = new ArrayList(p13.y.r(listQ2, 10));
        Iterator<T> it3 = listQ2.iterator();
        while (it3.hasNext()) {
            v0 v0VarP = ((d1) it3.next()).p();
            v0VarP.getClass();
            arrayList2.add(new v1(v0VarP));
        }
        return o1.a.b(aVar, u0.l(h0.k1(arrayList, arrayList2)));
    }
}
