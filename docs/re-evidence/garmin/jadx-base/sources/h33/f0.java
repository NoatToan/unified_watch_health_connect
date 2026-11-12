package h33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f81458a;

    public f0(g0 g0Var) {
        this.f81458a = g0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object next;
        x33.c cVar = (x33.c) obj;
        cVar.getClass();
        Map<x33.c, T> map = this.f81458a.f81460b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            x33.c cVar2 = (x33.c) entry.getKey();
            if (!cVar.equals(cVar2)) {
                cVar2.getClass();
                if (p005kotlin.jvm.internal.s.g(cVar.f188596a.c() ? null : cVar.b(), cVar2)) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            Iterator it3 = linkedHashMap.entrySet().iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int length = x33.e.a((x33.c) ((Map.Entry) next).getKey(), cVar).f188596a.f188600a.length();
                    do {
                        Object next2 = it3.next();
                        int length2 = x33.e.a((x33.c) ((Map.Entry) next2).getKey(), cVar).f188596a.f188600a.length();
                        if (length > length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry2 = (Map.Entry) next;
            if (entry2 != null) {
                return entry2.getValue();
            }
        }
        return null;
    }
}
