package h33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b<u23.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(x xVar) {
        super(xVar);
        xVar.getClass();
    }

    public static List l(d43.g gVar) {
        if (!(gVar instanceof d43.b)) {
            return gVar instanceof d43.k ? p13.w.c(((d43.k) gVar).f57485c.c()) : p13.j0.f134944a;
        }
        Iterable iterable = (Iterable) ((d43.b) gVar).f57481a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p13.d0.v(arrayList, l((d43.g) it.next()));
        }
        return arrayList;
    }

    @Override // h33.b
    public final ArrayList a(Object obj, boolean z14) {
        u23.c cVar = (u23.c) obj;
        cVar.getClass();
        Map<x33.f, d43.g<?>> mapB = cVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<x33.f, d43.g<?>> entry : mapB.entrySet()) {
            p13.d0.v(arrayList, (!z14 || p005kotlin.jvm.internal.s.g(entry.getKey(), c0.f81420b)) ? l(entry.getValue()) : p13.j0.f134944a);
        }
        return arrayList;
    }

    @Override // h33.b
    public final x33.c e(u23.c cVar) {
        u23.c cVar2 = cVar;
        cVar2.getClass();
        return cVar2.c();
    }

    @Override // h33.b
    public final t23.e f(Object obj) {
        u23.c cVar = (u23.c) obj;
        cVar.getClass();
        t23.e eVarD = f43.e.d(cVar);
        eVarD.getClass();
        return eVarD;
    }

    @Override // h33.b
    public final Iterable<u23.c> g(u23.c cVar) {
        u23.h annotations;
        u23.c cVar2 = cVar;
        cVar2.getClass();
        t23.e eVarD = f43.e.d(cVar2);
        return (eVarD == null || (annotations = eVarD.getAnnotations()) == null) ? p13.j0.f134944a : annotations;
    }
}
