package in0;

import b63.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.jvm.internal.s;
import p13.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final h.b a(o oVar, List list) {
        Object next;
        list.getClass();
        oVar.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s.g(((a) next).f94416a, oVar));
        a aVar = (a) next;
        if (aVar != null) {
            return aVar.f94419d;
        }
        return null;
    }

    public static final i53.d<o, j23.g<Double>> b(List<a> list, m mVar) {
        list.getClass();
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            j23.g<Double> gVar = aVar.f94418c.get(mVar);
            p pVar = gVar != null ? new p(aVar.f94416a, gVar) : null;
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return i53.a.g(u0.l(arrayList));
    }

    public static final i53.d<o, Double> c(List<a> list, m mVar) {
        list.getClass();
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            Double d14 = aVar.f94417b.get(mVar);
            p pVar = d14 != null ? new p(aVar.f94416a, Double.valueOf(d14.doubleValue())) : null;
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return i53.a.g(u0.l(arrayList));
    }
}
