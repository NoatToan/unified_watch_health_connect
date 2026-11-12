package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class d {
    private static final List<d> d = new ArrayList();
    public Object a;
    public h b;
    public d c;

    private d(Object obj, h hVar) {
        this.a = obj;
        this.b = hVar;
    }

    public static d a(h hVar, Object obj) {
        List<d> list = d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new d(obj, hVar);
            }
            d dVarRemove = list.remove(size - 1);
            dVarRemove.a = obj;
            dVarRemove.b = hVar;
            dVarRemove.c = null;
            return dVarRemove;
        }
    }

    public static void b(d dVar) {
        dVar.a = null;
        dVar.b = null;
        dVar.c = null;
        List<d> list = d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(dVar);
            }
        }
    }
}
