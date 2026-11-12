package l23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k23.k;
import p13.k0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static final <T> T a(k23.d<T> dVar) {
        dVar.getClass();
        Iterator<T> it = dVar.n().iterator();
        T t7 = null;
        boolean z14 = false;
        T t14 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z14) {
                    break;
                }
                t7 = t14;
                break;
            }
            T next = it.next();
            List<k> parameters = ((k23.g) next).getParameters();
            if (parameters == null || !parameters.isEmpty()) {
                Iterator<T> it3 = parameters.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (!((k) it3.next()).d()) {
                        }
                    }
                }
            }
            if (z14) {
                break;
            }
            z14 = true;
            t14 = next;
        }
        k23.g gVar = (k23.g) t7;
        if (gVar == null) {
            h.s(p6.b.e("Class should have a single no-arg constructor: ", dVar));
            return null;
        }
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        return (T) gVar.callBy(k0Var);
    }

    public static final ArrayList b(k23.d dVar) {
        dVar.getClass();
        Collection<k23.c<?>> collectionS = dVar.s();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionS) {
            if (obj instanceof k23.g) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
