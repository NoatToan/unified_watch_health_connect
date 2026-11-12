package u33;

import java.util.ArrayList;
import java.util.List;
import p13.y;
import s33.o;
import s33.s;
import s33.t;
import s33.u;
import s33.w;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final List<s> a(s33.c cVar, h hVar) {
        cVar.getClass();
        hVar.getClass();
        List<s> arrayList = cVar.f156534m;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = cVar.f156535n;
            list.getClass();
            arrayList = new ArrayList<>(y.r(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(hVar.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final List<s> b(s33.j jVar, h hVar) {
        jVar.getClass();
        hVar.getClass();
        List<s> arrayList = jVar.f156691l;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = jVar.f156692m;
            list.getClass();
            arrayList = new ArrayList<>(y.r(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(hVar.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final List<s> c(o oVar, h hVar) {
        oVar.getClass();
        hVar.getClass();
        List<s> arrayList = oVar.f156777l;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = oVar.f156778m;
            list.getClass();
            arrayList = new ArrayList<>(y.r(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(hVar.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final s d(t tVar, h hVar) {
        tVar.getClass();
        hVar.getClass();
        int i14 = tVar.f156909c;
        if ((i14 & 16) == 16) {
            s sVar = tVar.f156915i;
            sVar.getClass();
            return sVar;
        }
        if ((i14 & 32) == 32) {
            return hVar.a(tVar.f156916j);
        }
        vb.h.z("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final s e(s sVar, h hVar) {
        sVar.getClass();
        hVar.getClass();
        int i14 = sVar.f156853c;
        if ((i14 & 256) == 256) {
            return sVar.f156863m;
        }
        if ((i14 & 512) == 512) {
            return hVar.a(sVar.f156864n);
        }
        return null;
    }

    public static final s f(s33.j jVar, h hVar) {
        jVar.getClass();
        hVar.getClass();
        int i14 = jVar.f156682c;
        if ((i14 & 32) == 32) {
            return jVar.f156689j;
        }
        if ((i14 & 64) == 64) {
            return hVar.a(jVar.f156690k);
        }
        return null;
    }

    public static final s g(o oVar, h hVar) {
        oVar.getClass();
        hVar.getClass();
        int i14 = oVar.f156768c;
        if ((i14 & 32) == 32) {
            return oVar.f156775j;
        }
        if ((i14 & 64) == 64) {
            return hVar.a(oVar.f156776k);
        }
        return null;
    }

    public static final s h(s33.j jVar, h hVar) {
        jVar.getClass();
        hVar.getClass();
        int i14 = jVar.f156682c;
        if ((i14 & 8) == 8) {
            s sVar = jVar.f156686g;
            sVar.getClass();
            return sVar;
        }
        if ((i14 & 16) == 16) {
            return hVar.a(jVar.f156687h);
        }
        vb.h.z("No returnType in ProtoBuf.Function");
        return null;
    }

    public static final s i(o oVar, h hVar) {
        oVar.getClass();
        hVar.getClass();
        int i14 = oVar.f156768c;
        if ((i14 & 8) == 8) {
            s sVar = oVar.f156772g;
            sVar.getClass();
            return sVar;
        }
        if ((i14 & 16) == 16) {
            return hVar.a(oVar.f156773h);
        }
        vb.h.z("No returnType in ProtoBuf.Property");
        return null;
    }

    public static final List<s> j(s33.c cVar, h hVar) {
        cVar.getClass();
        hVar.getClass();
        List<s> arrayList = cVar.f156529h;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = cVar.f156530i;
            list.getClass();
            arrayList = new ArrayList<>(y.r(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(hVar.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final s k(w wVar, h hVar) {
        wVar.getClass();
        hVar.getClass();
        int i14 = wVar.f156974c;
        if ((i14 & 4) == 4) {
            s sVar = wVar.f156977f;
            sVar.getClass();
            return sVar;
        }
        if ((i14 & 8) == 8) {
            return hVar.a(wVar.f156978g);
        }
        vb.h.z("No type in ProtoBuf.ValueParameter");
        return null;
    }

    public static final s l(t tVar, h hVar) {
        tVar.getClass();
        hVar.getClass();
        int i14 = tVar.f156909c;
        if ((i14 & 4) == 4) {
            s sVar = tVar.f156913g;
            sVar.getClass();
            return sVar;
        }
        if ((i14 & 8) == 8) {
            return hVar.a(tVar.f156914h);
        }
        vb.h.z("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final List<s> m(u uVar, h hVar) {
        uVar.getClass();
        hVar.getClass();
        List<s> arrayList = uVar.f156941h;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = uVar.f156942i;
            list.getClass();
            arrayList = new ArrayList<>(y.r(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(hVar.a(num.intValue()));
            }
        }
        return arrayList;
    }
}
