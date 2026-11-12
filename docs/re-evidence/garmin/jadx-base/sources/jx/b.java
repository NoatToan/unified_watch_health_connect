package jx;

import gs1.e;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final boolean a(a aVar) {
        List<e.a> list;
        if (aVar == null || (list = aVar.f101386c) == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((e.a) it.next()).f78731c != null) {
                return true;
            }
        }
        return false;
    }
}
