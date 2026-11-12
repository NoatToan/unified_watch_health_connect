package pv0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final List<d> a(List<d> list, b bVar) {
        list.getClass();
        if (bVar == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d dVar = (d) obj;
            if (d(dVar) == bVar || (bVar == b.CUSTOM && d(dVar) == b.CUSTOM_SLEEP_RELATED)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            if (f((d) obj)) {
                arrayListL.add(obj);
            }
        }
        return arrayListL;
    }

    public static final d c(long j8, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((d) next).f141358a == j8) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public static final b d(d dVar) {
        dVar.getClass();
        String str = dVar.f141364g;
        if (str == null) {
            return null;
        }
        b.f141341b.getClass();
        return b.a.a(str);
    }

    public static final boolean e(List<d> list) {
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (f((d) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(d dVar) {
        dVar.getClass();
        return p005kotlin.jvm.internal.s.g(dVar.f141365h, Boolean.TRUE);
    }

    public static final ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            w.a aVar = w.f141433b;
            Long lValueOf = Long.valueOf(dVar.f141358a);
            aVar.getClass();
            w wVarA = w.a.a(lValueOf);
            if (wVarA != null) {
                arrayList2.add(wVarA);
            }
        }
        return arrayList2;
    }
}
