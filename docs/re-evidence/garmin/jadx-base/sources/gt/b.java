package gt;

import j23.l;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final boolean a(a aVar) {
        List<gs1.e.C1588e> list;
        if (aVar != null && (list = aVar.f78897c) != null && !list.isEmpty()) {
            for (gs1.e.C1588e c1588e : list) {
                if (c1588e.f78747b != null) {
                    l lVar = new l(0, 25);
                    Integer num = c1588e.f78747b;
                    if (num != null && lVar.d(num.intValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean b(a aVar) {
        List<gs1.e.C1588e> list;
        if (aVar != null && (list = aVar.f78897c) != null && !list.isEmpty()) {
            for (gs1.e.C1588e c1588e : list) {
                if (c1588e.f78747b != null) {
                    l lVar = new l(26, 100);
                    Integer num = c1588e.f78747b;
                    if (num != null && lVar.d(num.intValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean c(a aVar) {
        List<gs1.e.C1588e> list;
        if (aVar != null && (list = aVar.f78897c) != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Integer num = ((gs1.e.C1588e) it.next()).f78747b;
                if (num != null && num.intValue() == -2) {
                    return true;
                }
            }
        }
        return false;
    }
}
