package j70;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static final ArrayList a(f fVar) {
        fVar.getClass();
        c dailyStatsConfig = fVar.getDailyStatsConfig();
        List<b> listG = dailyStatsConfig != null ? dailyStatsConfig.g() : null;
        if (listG == null) {
            listG = j0.f134944a;
        }
        c dailyStatsConfig2 = fVar.getDailyStatsConfig();
        List<b> listE = dailyStatsConfig2 != null ? dailyStatsConfig2.e() : null;
        if (listE == null) {
            listE = j0.f134944a;
        }
        return h0.C0(listG, listE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static final Set<o70.c> b(List<b> list) {
        ?? arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (b bVar : list) {
                o70.c.a aVar = o70.c.f129930b;
                String cardType = bVar.getCardType();
                aVar.getClass();
                o70.c cVarA = o70.c.a.a(cardType);
                if (cVarA != null) {
                    arrayList.add(cVarA);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = j0.f134944a;
        }
        return h0.g1((Iterable) arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static final Set<o70.i> c(List<b> list) {
        ?? arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (b bVar : list) {
                o70.i.a aVar = o70.i.f129998f;
                String cardType = bVar.getCardType();
                aVar.getClass();
                o70.i iVarA = o70.i.a.a(cardType);
                if (iVarA != null) {
                    arrayList.add(iVarA);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = j0.f134944a;
        }
        return h0.g1((Iterable) arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static final Set<o70.o> d(List<b> list) {
        ?? arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (b bVar : list) {
                o70.o.a aVar = o70.o.f130039b;
                String cardType = bVar.getCardType();
                aVar.getClass();
                o70.o oVarA = o70.o.a.a(cardType);
                if (oVarA != null) {
                    arrayList.add(oVarA);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = j0.f134944a;
        }
        return h0.g1((Iterable) arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static final Set<o70.t> e(List<b> list) {
        ?? arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (b bVar : list) {
                o70.t.a aVar = o70.t.f130062f;
                String cardType = bVar.getCardType();
                aVar.getClass();
                o70.t tVarA = o70.t.a.a(cardType);
                if (tVarA != null) {
                    arrayList.add(tVarA);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = j0.f134944a;
        }
        return h0.g1((Iterable) arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static final Set<o70.f> f(List<v> list) {
        ?? arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (v vVar : list) {
                o70.f.a aVar = o70.f.f129966c;
                String sectionType = vVar.getSectionType();
                aVar.getClass();
                o70.f fVarC = o70.f.a.c(sectionType);
                if (fVarC != null) {
                    arrayList.add(fVarC);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = j0.f134944a;
        }
        return h0.g1((Iterable) arrayList);
    }

    public static final ArrayList g(List list, boolean z14) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            b bVar = (b) obj;
            if (z14 || (!p005kotlin.jvm.internal.s.g(bVar.getCardType(), o70.t.T.f130082a) && !p005kotlin.jvm.internal.s.g(bVar.getCardType(), o70.o.NUTRITION.f130049a))) {
                arrayListL.add(obj);
            }
        }
        return arrayListL;
    }
}
