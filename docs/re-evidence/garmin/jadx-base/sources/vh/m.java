package vh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class m {
    public static final boolean a(k.b bVar, Set set, b bVar2) {
        set.getClass();
        bVar2.getClass();
        return b(bVar, new l(set, bVar2, null, null));
    }

    public static final boolean b(k kVar, l lVar) {
        kVar.getClass();
        if (kVar.equals(k.f.f178341a)) {
            return true;
        }
        if (kVar.equals(k.c.f178338a)) {
            return false;
        }
        if (kVar instanceof k.d) {
            return !b(((k.d) kVar).f178339a, lVar);
        }
        if (kVar instanceof k.e) {
            Iterable iterable = ((k.e) kVar).f178340a;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (b((k) it.next(), lVar)) {
                    return true;
                }
            }
            return false;
        }
        if (!(kVar instanceof k.a)) {
            if (kVar instanceof k.b) {
                return ((Boolean) lVar.invoke(((k.b) kVar).f178337a)).booleanValue();
            }
            lc.u0.r();
            return false;
        }
        Iterable iterable2 = ((k.a) kVar).f178336a;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            return true;
        }
        Iterator it3 = iterable2.iterator();
        while (it3.hasNext()) {
            if (!b((k) it3.next(), lVar)) {
                return false;
            }
        }
        return true;
    }

    public static final k.b c(String str) {
        return new k.b(new j(str));
    }
}
