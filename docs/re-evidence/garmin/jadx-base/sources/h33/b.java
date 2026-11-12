package h33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p13.c1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b<TAnnotation> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f81406c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f81407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap<Object, TAnnotation> f81408b;

    static {
        new a(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (c cVar : c.values()) {
            String str = cVar.f81418a;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, cVar);
            }
        }
        f81406c = linkedHashMap;
    }

    public b(x xVar) {
        xVar.getClass();
        this.f81407a = xVar;
        this.f81408b = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.Map] */
    public static y b(b bVar, y yVar, Iterable iterable) {
        boolean z14;
        q qVar;
        h0 h0VarJ;
        q qVar2;
        Object objD;
        Object next;
        o13.p pVar;
        p33.n nVarC;
        bVar.getClass();
        iterable.getClass();
        x xVar = bVar.f81407a;
        boolean z15 = xVar.f81513c;
        if (!z15) {
            ArrayList<q> arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                z14 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                q qVar3 = null;
                if (z15 || (qVar = (q) r.f81495e.get(bVar.e(next2))) == null) {
                    qVar2 = null;
                } else {
                    x33.c cVarE = bVar.e(next2);
                    if (cVarE == null || !r.f81493c.containsKey(cVarE)) {
                        h0VarJ = bVar.j(next2);
                        if (h0VarJ == null) {
                            h0VarJ = xVar.f81511a.f81402a;
                        }
                    } else {
                        h0VarJ = xVar.f81512b.invoke(cVarE);
                    }
                    if (h0VarJ == h0.IGNORE) {
                        h0VarJ = null;
                    }
                    if (h0VarJ == null) {
                        qVar2 = null;
                    } else {
                        p33.n nVarA = p33.n.a(qVar.f81486a, null, h0VarJ == h0.WARN, 1);
                        Collection<c> collection = qVar.f81487b;
                        boolean z16 = qVar.f81488c;
                        boolean z17 = qVar.f81489d;
                        boolean z18 = qVar.f81490e;
                        collection.getClass();
                        qVar2 = new q(nVarA, collection, z16, z17, z18);
                    }
                }
                if (qVar2 != null) {
                    qVar3 = qVar2;
                } else {
                    if (xVar.f81511a.f81405d || (objD = bVar.d(next2, d0.f81441f)) == null) {
                        pVar = null;
                    } else {
                        Iterator it3 = bVar.g(next2).iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (bVar.k(next) == null);
                        if (next == null) {
                            pVar = null;
                        } else {
                            ArrayList arrayListA = bVar.a(objD, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it4 = arrayListA.iterator();
                            while (it4.hasNext()) {
                                c cVar = (c) f81406c.get((String) it4.next());
                                if (cVar != null) {
                                    linkedHashSet.add(cVar);
                                }
                            }
                            if (linkedHashSet.contains(c.TYPE_USE)) {
                                linkedHashSet = c1.h(c1.f(p13.u.m0(c.values()), c.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                            }
                            pVar = new o13.p(next, linkedHashSet);
                        }
                    }
                    if (pVar != null) {
                        A a14 = pVar.f128594a;
                        Set set = (Set) pVar.f128595b;
                        h0 h0VarJ2 = bVar.j(next2);
                        if (h0VarJ2 == null && (h0VarJ2 = bVar.j(a14)) == null) {
                            h0VarJ2 = xVar.f81511a.f81402a;
                        }
                        h0VarJ2.getClass();
                        if (h0VarJ2 != h0.IGNORE && (nVarC = bVar.c(h33.a.f81401a, a14)) != null) {
                            qVar3 = new q(p33.n.a(nVarC, null, h0VarJ2 == h0.WARN, 1), set, false, false, false, 28, null);
                        }
                    }
                }
                if (qVar3 != null) {
                    arrayList.add(qVar3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(c.class);
                for (q qVar4 : arrayList) {
                    for (c cVar2 : qVar4.f81487b) {
                        enumMap.containsKey(cVar2);
                        enumMap.put(cVar2, qVar4);
                    }
                }
                EnumMap enumMap2 = yVar != null ? new EnumMap((EnumMap) yVar.f81514a) : new EnumMap(c.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    c cVar3 = (c) entry.getKey();
                    q qVar5 = (q) entry.getValue();
                    if (qVar5 != null) {
                        enumMap2.put(cVar3, qVar5);
                        z14 = true;
                    }
                }
                if (z14) {
                    return new y(enumMap2);
                }
            }
        }
        return yVar;
    }

    public abstract ArrayList a(Object obj, boolean z14);

    /* JADX WARN: Multi-variable type inference failed */
    public final p33.n c(e23.l lVar, Object obj) {
        p33.n nVarI;
        p33.n nVarI2 = i(obj, ((Boolean) lVar.invoke(obj)).booleanValue());
        if (nVarI2 != null) {
            return nVarI2;
        }
        TAnnotation tannotationK = k(obj);
        if (tannotationK != null) {
            h0 h0VarJ = j(obj);
            if (h0VarJ == null) {
                h0VarJ = this.f81407a.f81511a.f81402a;
            }
            h0VarJ.getClass();
            if (h0VarJ != h0.IGNORE && (nVarI = i(tannotationK, ((Boolean) lVar.invoke(tannotationK)).booleanValue())) != null) {
                return p33.n.a(nVarI, null, h0VarJ == h0.WARN, 1);
            }
        }
        return null;
    }

    public final TAnnotation d(TAnnotation tannotation, x33.c cVar) {
        for (TAnnotation tannotation2 : g(tannotation)) {
            if (p005kotlin.jvm.internal.s.g(e(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    public abstract x33.c e(TAnnotation tannotation);

    public abstract t23.e f(Object obj);

    public abstract Iterable<TAnnotation> g(TAnnotation tannotation);

    public final boolean h(TAnnotation tannotation, x33.c cVar) {
        Iterable<TAnnotation> iterableG = g(tannotation);
        if ((iterableG instanceof Collection) && ((Collection) iterableG).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableG.iterator();
        while (it.hasNext()) {
            if (p005kotlin.jvm.internal.s.g(e(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r6.equals("NEVER") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r6.equals("MAYBE") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r6 = p33.m.NULLABLE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p33.n i(TAnnotation tannotation, boolean z14) {
        p33.m mVar;
        x33.c cVarE = e(tannotation);
        if (cVarE != null) {
            h0 h0VarInvoke = this.f81407a.f81512b.invoke(cVarE);
            h0VarInvoke.getClass();
            if (h0VarInvoke == h0.IGNORE) {
                return null;
            }
            if (d0.f81446k.contains(cVarE)) {
                mVar = p33.m.NOT_NULL;
            } else if (d0.f81447l.contains(cVarE)) {
                mVar = p33.m.NULLABLE;
            } else if (d0.f81448m.contains(cVarE)) {
                mVar = p33.m.FORCE_FLEXIBILITY;
            } else if (cVarE.equals(d0.f81442g)) {
                String str = (String) p13.h0.c0(a(tannotation, false));
                if (str != null) {
                    switch (str.hashCode()) {
                        case 73135176:
                            break;
                        case 74175084:
                            break;
                        case 433141802:
                            if (str.equals("UNKNOWN")) {
                                mVar = p33.m.FORCE_FLEXIBILITY;
                            }
                            break;
                        case 1933739535:
                            break;
                    }
                } else {
                    mVar = p33.m.NOT_NULL;
                }
            }
            return new p33.n(mVar, h0VarInvoke == h0.WARN || z14);
        }
        return null;
    }

    public final h0 j(TAnnotation tannotation) {
        String str;
        a0 a0Var = this.f81407a.f81511a;
        h0 h0Var = a0Var.f81404c.get(e(tannotation));
        if (h0Var != null) {
            return h0Var;
        }
        TAnnotation tannotationD = d(tannotation, d0.f81452q);
        if (tannotationD == null || (str = (String) p13.h0.c0(a(tannotationD, false))) == null) {
            return null;
        }
        h0 h0Var2 = a0Var.f81403b;
        if (h0Var2 != null) {
            return h0Var2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return h0.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return h0.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return h0.WARN;
        }
        return null;
    }

    public final TAnnotation k(TAnnotation tannotation) {
        TAnnotation tannotationK;
        tannotation.getClass();
        if (!this.f81407a.f81511a.f81405d) {
            if (p13.h0.R(d0.f81445j, e(tannotation)) || h(tannotation, d0.f81439d)) {
                return tannotation;
            }
            if (h(tannotation, d0.f81440e)) {
                t23.e eVarF = f(tannotation);
                ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f81408b;
                TAnnotation tannotation2 = concurrentHashMap.get(eVarF);
                if (tannotation2 != null) {
                    return tannotation2;
                }
                Iterator<TAnnotation> it = g(tannotation).iterator();
                do {
                    if (!it.hasNext()) {
                        tannotationK = null;
                        break;
                    }
                    tannotationK = k(it.next());
                } while (tannotationK == null);
                if (tannotationK != null) {
                    TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(eVarF, tannotationK);
                    return tannotationPutIfAbsent == null ? tannotationK : tannotationPutIfAbsent;
                }
            }
        }
        return null;
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
