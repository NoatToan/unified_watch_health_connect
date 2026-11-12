package is;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p13.h0;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
public final class o {
    public static final ArrayList a(List list, ps.q qVar) {
        Object next;
        jr.p pVarA;
        jr.p pVarA2;
        jr.p pVarA3;
        ls.e eVarA;
        Object next2;
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        int i14 = 0;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((List) entry.getValue()).size() == 1) {
                        pVarA = ((jr.r) ((List) entry.getValue()).get(0)).a();
                    } else {
                        Iterator it3 = ((Iterable) entry.getValue()).iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            pVarA3 = ((jr.r) next).a();
                        } while (!((pVarA3 == null || (eVarA = m.a(pVarA3)) == null) ? false : ss.k.p(eVarA, ss.k.k(eVarA, qVar))));
                        jr.r rVar = (jr.r) next;
                        pVarA = (rVar == null || (pVarA2 = rVar.a()) == null) ? ((jr.r) h0.b0((List) entry.getValue())).a() : pVarA2;
                    }
                    if (pVarA != null) {
                        arrayList.add(pVarA);
                    }
                }
                return arrayList;
            }
            Object next3 = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            jr.r rVar2 = (jr.r) next3;
            if (rVar2.getZOrder() == null) {
                linkedHashMap.put(Integer.valueOf(i14), w.c(rVar2));
            } else {
                for (Object obj2 : linkedHashMap.values()) {
                    Iterator it4 = ((List) obj2).iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        Integer zOrder = ((jr.r) next2).getZOrder();
                        int iIntValue = rVar2.getZOrder().intValue();
                        if (zOrder != null && zOrder.intValue() == iIntValue) {
                            break;
                        }
                    }
                    if (next2 != null) {
                        obj = obj2;
                        break;
                    }
                }
                Collection collection = (Collection) obj;
                if (collection == null || collection.isEmpty()) {
                    Integer numValueOf = Integer.valueOf(i14);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        Integer zOrder2 = ((jr.r) obj3).getZOrder();
                        int iIntValue2 = rVar2.getZOrder().intValue();
                        if (zOrder2 != null && zOrder2.intValue() == iIntValue2) {
                            arrayList2.add(obj3);
                        }
                    }
                    linkedHashMap.put(numValueOf, arrayList2);
                }
            }
            i14 = i15;
        }
    }
}
