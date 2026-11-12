package x33;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o13.p;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
public final class j {
    public static final b a(String str) {
        i.f188617a.getClass();
        return new b(i.f188625i, f.e(str));
    }

    public static final b b(String str) {
        i.f188617a.getClass();
        return new b(i.f188618b, f.e(str));
    }

    public static final b c(String str) {
        i.f188617a.getClass();
        return new b(i.f188620d, f.e(str));
    }

    public static final LinkedHashMap d(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iA = t0.a(y.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            p pVar = new p(entry.getValue(), entry.getKey());
            linkedHashMap2.put(pVar.f128594a, pVar.f128595b);
        }
        return linkedHashMap2;
    }

    public static final b e(f fVar) {
        i.f188617a.getClass();
        b bVar = i.f188631o;
        return new b(bVar.f188591a, f.e(fVar.c() + bVar.f().c()));
    }

    public static final b f(String str) {
        i.f188617a.getClass();
        return new b(i.f188619c, f.e(str));
    }

    public static final b g(b bVar) {
        i.f188617a.getClass();
        return new b(i.f188618b, f.e("U" + bVar.f().c()));
    }
}
