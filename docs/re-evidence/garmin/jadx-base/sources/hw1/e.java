package hw1;

import com.garmin.android.apps.connectmobile.R;
import e23.l;
import f2.o;
import f72.t0;
import g22.k;
import gl1.y;
import h4.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.p;
import org.joda.time.LocalDate;
import p13.h0;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:111:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x0224  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void a(r rVar, ArrayList arrayList, m mVar, int i14) {
        String strJ;
        Object obj;
        ?? r14;
        int i15;
        c82.h dVar;
        rVar.getClass();
        o0 o0VarE = mVar.E(635950392);
        int i16 = (i14 & 6) == 0 ? (o0VarE.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(arrayList) ? 32 : 16;
        }
        boolean z14 = false;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                lu1.e eVar = (lu1.e) obj2;
                if (eVar.f115005a != null || eVar.f115013i) {
                    if (!eVar.f115007c) {
                        arrayList2.add(obj2);
                    }
                }
            }
            int size = arrayList2.size();
            if (size == 0) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1262980582, R.string.no_workouts_remaining, o0VarE, false);
            } else if (size != 1) {
                o0VarE.C(1262985861);
                strJ = y.P(R.string.num_workouts_remaining, new Object[]{String.valueOf(size)}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1262982663);
                strJ = y.P(R.string.single_workout_remaining, new Object[]{String.valueOf(size)}, o0VarE);
                o0VarE.g0(false);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : arrayList) {
                LocalDate localDate = ((lu1.e) obj3).f115006b.toLocalDate();
                Object arrayList3 = linkedHashMap.get(localDate);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(localDate, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            o0VarE.C(1262996340);
            ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                p pVar = new p((LocalDate) entry.getKey(), (List) entry.getValue());
                x1 x1Var2 = n.f135158a;
                Object obj4 = pVar.f128595b;
                List list = (List) obj4;
                int size2 = list.size();
                Iterable iterable = (Iterable) obj4;
                boolean z15 = iterable instanceof Collection;
                if (!z15 || !((Collection) iterable).isEmpty()) {
                    r14 = z14;
                    Iterator it = iterable.iterator();
                    int i17 = z14 ? 1 : 0;
                    while (it.hasNext()) {
                        if (((lu1.e) it.next()).f115007c && (i17 = i17 + 1) < 0) {
                            x.p();
                            throw null;
                        }
                    }
                    r14 = i17;
                }
                if (z15 && ((Collection) iterable).isEmpty()) {
                    i15 = 0;
                } else {
                    Iterator it3 = iterable.iterator();
                    i15 = 0;
                    while (it3.hasNext()) {
                        if (((lu1.e) it3.next()).f115013i && (i15 = i15 + 1) < 0) {
                            x.p();
                            throw null;
                        }
                    }
                }
                boolean z16 = size2 > 1 && r14 == 0 && i15 == 0;
                lu1.e eVar2 = (lu1.e) h0.d0(list);
                boolean z17 = eVar2 != null ? eVar2.f115008d : false;
                if (z16) {
                    dVar = new c82.h.g(size2);
                } else if (z17) {
                    s62.a.f157643a.getClass();
                    dVar = new c82.h.d(t0.a(t62.c.f162799a));
                } else if (r14 >= 1) {
                    dVar = new c82.h.a(null, 1, null);
                } else if (i15 > 0) {
                    s62.a.f157643a.getClass();
                    dVar = new c82.h.d(t0.a(t62.c.f162799a));
                } else if (eVar2 != null && eVar2.f115010f && eVar2.f115005a != null) {
                    dVar = !eVar2.f115012h ? c82.h.c.f25732a : c82.h.f.f25735a;
                } else if (size2 != 1) {
                    dVar = c82.h.f.f25735a;
                } else if ((eVar2 != null ? eVar2.f115005a : null) != null) {
                    dVar = new c82.h.d(eVar2.f115005a.f116772h);
                } else {
                    dVar = c82.h.f.f25735a;
                }
                c82.i iVar = new c82.i(k.t((LocalDate) pVar.f128594a), dVar, false, 4, null);
                x1 x1Var3 = n.f135158a;
                arrayList4.add(iVar);
                z14 = false;
            }
            o0VarE.g0(z14);
            boolean zB = o0VarE.B(strJ);
            Object objQ = o0VarE.q();
            if (zB) {
                obj = objQ;
                gp.j jVar = new gp.j(strJ, 25);
                o0VarE.K(jVar);
                obj = jVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    obj = objQ;
                    gp.j jVar2 = new gp.j(strJ, 25);
                    o0VarE.K(jVar2);
                    obj = jVar2;
                }
            }
            obj = objQ;
            c82.g.c(v.b(rVar, (l) obj), arrayList4, o0VarE, 0);
            x1 x1Var4 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(rVar, arrayList, i14, 24);
        }
    }
}
