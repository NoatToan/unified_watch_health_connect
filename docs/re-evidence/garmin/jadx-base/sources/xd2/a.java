package xd2;

import fe2.p1;
import fe2.v1;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import wd2.c2;
import wd2.h2;
import wd2.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static final z1 a(p1 p1Var) {
        c2 c2Var;
        long f70633a = p1Var.getF70789a();
        String f70650r = p1Var.getF70805q();
        DateTime f70647o = p1Var.getF70647o();
        Boolean boolValueOf = Boolean.valueOf(p1Var.getF70804p());
        String identifier = p1Var.getF70798j().getIdentifier();
        List<v1> listK = p1Var.k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (v1 v1Var : listK) {
            String str = v1Var.f70965a;
            String str2 = v1Var.f70966b;
            String str3 = v1Var.f70967c;
            v1.b bVar = v1Var.f70968d;
            if (bVar == null) {
                c2Var = null;
            } else if (bVar.equals(v1.b.a.f70975a)) {
                c2Var = c2.a.f184409a;
            } else if (bVar.equals(v1.b.c.f70977a)) {
                c2Var = c2.c.f184411a;
            } else if (bVar.equals(v1.b.f.f70980a)) {
                c2Var = c2.f.f184414a;
            } else if (bVar.equals(v1.b.C1451b.f70976a)) {
                c2Var = c2.b.f184410a;
            } else if (bVar.equals(v1.b.d.f70978a)) {
                c2Var = c2.d.f184412a;
            } else if (bVar.equals(v1.b.e.f70979a)) {
                c2Var = c2.e.f184413a;
            } else {
                if (!bVar.equals(v1.b.g.f70981a)) {
                    lc.u0.r();
                    return null;
                }
                c2Var = c2.g.f184415a;
            }
            linkedHashSet.add(new h2(str, str2, str3, c2Var));
        }
        return new z1(f70633a, f70650r, f70647o, boolValueOf, identifier, linkedHashSet, p1Var.q());
    }

    public static final HashMap b(Map map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            be2.f.a aVar = (be2.f.a) entry.getValue();
            aVar.getClass();
            map2.put(key, new ge2.a(aVar.f17759a, aVar.f17760b, aVar.f17761c, aVar.f17762d));
        }
        return map2;
    }

    public static final HashMap c(Map map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ge2.a aVar = (ge2.a) entry.getValue();
            aVar.getClass();
            map2.put(key, new be2.f.a(aVar.f77007a, aVar.f77008b, aVar.f77009c, aVar.f77010d));
        }
        return map2;
    }

    public static final ge2.e d(be2.f fVar) {
        fVar.getClass();
        HashMap mapB = b(fVar.f17751a);
        Boolean bool = fVar.f17752b;
        Boolean bool2 = fVar.f17753c;
        Boolean bool3 = fVar.f17754d;
        Boolean bool4 = fVar.f17755e;
        be2.f.b bVar = fVar.f17757g;
        return new ge2.e(mapB, bool, bool2, bool3, bool4, new ge2.d(bVar != null ? bVar.f17763a : null, bVar != null ? bVar.f17764b : null), null, 64, null);
    }

    public static final v1.b e(c2 c2Var) {
        c2Var.getClass();
        if (c2Var.equals(c2.a.f184409a)) {
            return v1.b.a.f70975a;
        }
        if (c2Var.equals(c2.c.f184411a)) {
            return v1.b.c.f70977a;
        }
        if (c2Var.equals(c2.f.f184414a)) {
            return v1.b.f.f70980a;
        }
        if (c2Var.equals(c2.b.f184410a)) {
            return v1.b.C1451b.f70976a;
        }
        if (c2Var.equals(c2.d.f184412a)) {
            return v1.b.d.f70978a;
        }
        if (c2Var.equals(c2.e.f184413a)) {
            return v1.b.e.f70979a;
        }
        if (c2Var.equals(c2.g.f184415a)) {
            return v1.b.g.f70981a;
        }
        lc.u0.r();
        return null;
    }
}
