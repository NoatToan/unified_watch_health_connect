package mf2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import lc.u0;
import o13.p;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList a(h hVar) {
        i53.c cVarE = i53.a.e(hVar.f118316k);
        ArrayList arrayList = new ArrayList(y.r(cVarE, 10));
        Iterator<E> it = cVarE.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) ((p) it.next()).f128594a).intValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList b(h hVar) {
        i53.c cVarE = i53.a.e(hVar.f118316k);
        ArrayList arrayList = new ArrayList(y.r(cVarE, 10));
        Iterator<E> it = cVarE.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) ((p) it.next()).f128595b).intValue()));
        }
        return arrayList;
    }

    public static final int c(h hVar) {
        Iterator<T> it = d(hVar).values().iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        return MathKt.b(jLongValue / ((double) 1000));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i53.d<h.d, Long> d(h hVar) {
        long jLongValue;
        long j8;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i53.c cVarE = i53.a.e(hVar.f118311f);
        for (int i14 = 0; i14 < cVarE.size(); i14++) {
            h.e eVar = (h.e) cVarE.get(i14);
            if (eVar instanceof h.e.b) {
                long j14 = eVar.f118338a;
                h.e eVar2 = (h.e) h0.e0(i14 + 1, cVarE);
                if (eVar2 == null) {
                    Long l14 = hVar.f118310e;
                    if (l14 != null) {
                        jLongValue = l14.longValue();
                    } else {
                        j8 = 0;
                    }
                    h.d dVar = ((h.e.b) eVar).f118339b;
                    Long l15 = (Long) linkedHashMap.get(dVar);
                    linkedHashMap.put(dVar, Long.valueOf((l15 != null ? l15.longValue() : 0L) + j8));
                } else {
                    jLongValue = eVar2.f118338a;
                }
                j8 = jLongValue - j14;
                h.d dVar2 = ((h.e.b) eVar).f118339b;
                Long l16 = (Long) linkedHashMap.get(dVar2);
                linkedHashMap.put(dVar2, Long.valueOf((l16 != null ? l16.longValue() : 0L) + j8));
            } else if (!(eVar instanceof h.e.a)) {
                u0.r();
                return null;
            }
        }
        return i53.a.g(linkedHashMap);
    }
}
