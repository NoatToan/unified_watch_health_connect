package in0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class l {
    public static final boolean a(List<h> list) {
        Object next;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).f94449d) {
                Iterator<T> it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (((h) next).f94446a != m.PULSE_OX);
                h hVar = (h) next;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((h) obj).f94446a != m.PULSE_OX) {
                        arrayList.add(obj);
                    }
                }
                if ((hVar != null ? hVar.f94447b : null) == null || hVar.f94449d) {
                    if (arrayList.isEmpty()) {
                        return true;
                    }
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (!((h) it4.next()).f94449d) {
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static final boolean b(List<h> list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            if (((h) obj).f94447b != null) {
                arrayListL.add(obj);
            }
        }
        if (arrayListL.isEmpty()) {
            arrayListL = null;
        }
        if (arrayListL == null) {
            return false;
        }
        if (!arrayListL.isEmpty()) {
            Iterator it = arrayListL.iterator();
            while (it.hasNext()) {
                h.a aVar = ((h) it.next()).f94447b;
                if (aVar == null || aVar.f94451b.f94454b != h.a.C1802a.EnumC1803a.IN_RANGE) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean c(List<h> list) {
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            h.a aVar = ((h) it.next()).f94447b;
            if (aVar != null ? d(aVar) : false) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(h.a aVar) {
        h.a.C1802a.EnumC1803a enumC1803a = aVar.f94451b.f94454b;
        return enumC1803a == h.a.C1802a.EnumC1803a.BELOW || enumC1803a == h.a.C1802a.EnumC1803a.ABOVE;
    }
}
