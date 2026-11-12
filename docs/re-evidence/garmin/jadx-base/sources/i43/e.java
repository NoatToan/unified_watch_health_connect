package i43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p13.d0;
import p13.h0;
import p13.j0;
import p43.n0;
import w02.b0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f91048a;

    public e(g gVar) {
        this.f91048a = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0 */
    @Override // e23.a
    public final Object invoke() {
        ?? arrayList;
        k23.l<Object>[] lVarArr = g.f91051d;
        g gVar = this.f91048a;
        List<t23.v> listH = gVar.h();
        ArrayList arrayList2 = new ArrayList(3);
        Collection<n0> collectionB = gVar.f91052b.h().b();
        collectionB.getClass();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            d0.v(arrayList3, o.a.a(((n0) it.next()).i(), null, 3));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (obj instanceof t23.b) {
                arrayList4.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            x33.f name = ((t23.b) obj2).getName();
            Object arrayList5 = linkedHashMap.get(name);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(name, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            x33.f fVar = (x33.f) key;
            List list = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list) {
                Boolean boolValueOf = Boolean.valueOf(((t23.b) obj3) instanceof t23.v);
                Object arrayList6 = linkedHashMap2.get(boolValueOf);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList6);
                }
                ((List) arrayList6).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list2 = (List) entry2.getValue();
                p005kotlin.reflect.jvm.internal.impl.resolve.b bVar = p005kotlin.reflect.jvm.internal.impl.resolve.b.f105945f;
                if (zBooleanValue) {
                    arrayList = new ArrayList();
                    for (Object obj4 : listH) {
                        if (p005kotlin.jvm.internal.s.g(((t23.v) obj4).getName(), fVar)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = j0.f134944a;
                }
                bVar.j(fVar, list2, (Collection) arrayList, gVar.f91052b, new f(arrayList2, gVar));
            }
        }
        return h0.C0(listH, b0.f(arrayList2));
    }
}
