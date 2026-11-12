package md;

import androidx.room.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:17:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[EDGE_INSN: B:45:0x008e->B:41:0x008e BREAK  A[LOOP:0: B:11:0x0014->B:49:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x006f A[SYNTHETIC] */
    public static final List<kd.a> a(b0.e eVar, int i14, int i15) {
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        o13.p pVar;
        Iterator it;
        boolean z14;
        int iIntValue;
        TreeMap treeMap2;
        eVar.getClass();
        if (i14 == i15) {
            return j0.f134944a;
        }
        boolean z15 = i15 > i14;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z15) {
                if (i14 <= i15) {
                    return arrayList;
                }
                linkedHashMap = eVar.f10747a;
                if (z15) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i14));
                    if (treeMap2 == null) {
                        pVar = null;
                    } else {
                        pVar = new o13.p(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i14));
                    if (treeMap == null) {
                        pVar = null;
                    } else {
                        pVar = new o13.p(treeMap, treeMap.keySet());
                    }
                }
                if (pVar == null) {
                    Map map = (Map) pVar.f128594a;
                    it = ((Iterable) pVar.f128595b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z14 = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z15) {
                            if (i14 + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i15 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i14 >= i15) {
                    return arrayList;
                }
                linkedHashMap = eVar.f10747a;
                if (z15) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i14));
                    if (treeMap2 == null) {
                        pVar = null;
                    } else {
                        pVar = new o13.p(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i14));
                    if (treeMap == null) {
                        pVar = null;
                    } else {
                        pVar = new o13.p(treeMap, treeMap.keySet());
                    }
                }
                if (pVar == null) {
                    Map map2 = (Map) pVar.f128594a;
                    it = ((Iterable) pVar.f128595b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z14 = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z15) {
                            if (i15 <= iIntValue && iIntValue < i14) {
                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                obj.getClass();
                                arrayList.add(obj);
                                z14 = true;
                                i14 = iIntValue;
                                break;
                                break;
                            }
                        } else if (i14 + 1 <= iIntValue && iIntValue <= i15) {
                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                            obj2.getClass();
                            arrayList.add(obj2);
                            z14 = true;
                            i14 = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z14);
        return null;
    }

    public static final boolean b(androidx.room.c cVar, int i14, int i15) {
        cVar.getClass();
        if (i14 > i15 && cVar.f10781l) {
            return false;
        }
        Set<Integer> set = cVar.f10782m;
        return cVar.f10780k && (set == null || !set.contains(Integer.valueOf(i14)));
    }
}
