package nx1;

import c22.a4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p13.d0;
import p13.h0;
import p13.j0;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnx1/c0;", "", "Llx1/a;", "stpRepo", "<init>", "(Llx1/a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.a f128207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f128208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f128209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f128210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f128211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f128212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f128213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f128214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f128215i;

    public c0(lx1.a aVar) {
        aVar.getClass();
        this.f128207a = aVar;
        this.f128208b = q2.a(j53.l.b());
        this.f128209c = q2.a(j53.l.b());
        p2 p2VarA = q2.a(j53.l.b());
        this.f128210d = p2VarA;
        p2 p2VarA2 = q2.a(j53.l.b());
        this.f128211e = p2VarA2;
        p2 p2VarA3 = q2.a(new dy1.g(null, null, 3, null));
        this.f128212f = p2VarA3;
        this.f128213g = r53.s.d(p2VarA);
        this.f128214h = r53.s.d(p2VarA2);
        this.f128215i = r53.s.d(p2VarA3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        s sVar;
        ArrayList arrayListX;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f128256d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f128256d = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f128254b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f128256d;
        if (i15 != 0) {
            if (i15 == 1) {
                arrayListX = sVar.f128253a;
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        arrayListX = v.h.x(obj);
        arrayListX.add(new dy1.v(mx1.b.GENERIC_WORKOUT_1, new dy1.u(null, 1, null), j53.l.b(), new dy1.u(null, 1, null), null, 16, null));
        arrayListX.add(new dy1.v(mx1.b.GENERIC_WORKOUT_2, new dy1.u(null, 1, null), j53.l.b(), new dy1.u(null, 1, null), null, 16, null));
        arrayListX.add(new dy1.v(mx1.b.GENERIC_WORKOUT_3, new dy1.u(null, 1, null), j53.l.b(), new dy1.u(null, 1, null), null, 16, null));
        i53.c cVarE = i53.a.e(arrayListX);
        sVar.f128253a = arrayListX;
        sVar.f128256d = 1;
        this.f128208b.setValue(cVarE);
        if (Unit.INSTANCE != aVar) {
        }
        return aVar;
        i53.c cVarE2 = i53.a.e(arrayListX);
        sVar.f128253a = null;
        sVar.f128256d = 2;
        this.f128210d.setValue(cVarE2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:92:0x031b  */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0341, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r4) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(l22.b bVar, List list, v13.c cVar) {
        t tVar;
        ArrayList arrayList;
        int i14;
        List list2;
        ix1.f fVar;
        List listN0;
        List list3;
        List list4;
        List list5;
        HashSet hashSet;
        ArrayList arrayList2;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i15 = tVar.f128261e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                tVar.f128261e = i15 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.f128259c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = tVar.f128261e;
        if (i16 != 0) {
            if (i16 == 1) {
                arrayList = tVar.f128258b;
                List list6 = tVar.f128257a;
                o13.r.b(obj);
                list4 = list6;
            } else if (i16 == 2) {
                List list7 = tVar.f128257a;
                o13.r.b(obj);
                list5 = list7;
                hashSet = new HashSet();
                arrayList2 = new ArrayList();
                for (Object obj2 : list5) {
                    if (hashSet.add(((dy1.q) obj2).f61605a)) {
                        arrayList2.add(obj2);
                    }
                }
                i53.c cVarE = i53.a.e(arrayList2);
                tVar.f128257a = null;
                tVar.f128258b = null;
                tVar.f128261e = 3;
                this.f128211e.setValue(cVarE);
            } else {
                if (i16 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        ArrayList arrayListX = v.h.x(obj);
        ArrayList arrayList3 = new ArrayList();
        List listK = p13.x.k(mx1.b.GENERIC_WORKOUT_1, mx1.b.GENERIC_WORKOUT_2, mx1.b.GENERIC_WORKOUT_3, mx1.b.GENERIC_WORKOUT_4, mx1.b.GENERIC_WORKOUT_5);
        p0 p0Var = new p0();
        a4.f22995c.getClass();
        for (a4 a4Var : a4.a.b()) {
            Iterator it = list.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                if (((ix1.f) it.next()).getDayOfWeek() == a4Var) {
                    i14 = i17;
                    break;
                }
                i17++;
            }
            if (i14 != -1) {
                ix1.f fVar2 = (ix1.f) list.get(i14);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i18 = p0Var.f105807a;
                p0Var.f105807a = i18 + 1;
                mx1.b bVar2 = (mx1.b) listK.get(i18);
                arrayListX.add(new dy1.q(fVar2.getDayOfWeek(), null, bVar2, false, 10, null));
                arrayList4.add(mx1.i.a(mx1.i.WARM_UP_CARDIO, bVar, 0, fVar2.getIncludeWarmup(), 54));
                mx1.i iVar = mx1.i.MUSCLE_ACTIVATION;
                boolean includeActivation = fVar2.getIncludeActivation();
                List<ix1.i> listH = fVar2.h();
                if (listH == null) {
                    listH = j0.f134944a;
                }
                arrayList4.add(mx1.i.a(iVar, bVar, listH.size(), includeActivation, 52));
                List<ix1.i> listH2 = fVar2.h();
                if (listH2 == null || (listN0 = h0.N0(listH2, new u())) == null) {
                    fVar = fVar2;
                    list2 = listK;
                } else {
                    Iterator it3 = listN0.iterator();
                    while (it3.hasNext()) {
                        ix1.i iVar2 = (ix1.i) it3.next();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it4 = it3;
                        Integer num = new Integer(iVar2.getOrder());
                        ix1.f fVar3 = fVar2;
                        dy1.h hVarA = mx1.i.a(mx1.i.PRIMARY_LIFT, bVar, 0, false, 62);
                        String benchmark = iVar2.getBenchmark();
                        String benchmark2 = iVar2.getBenchmark();
                        lx1.a aVar2 = this.f128207a;
                        String str = aVar2.b(benchmark2).f107118c;
                        linkedHashMap.put(num, dy1.h.a(hVarA, benchmark, null, false, false, false, false, str == null ? "" : str, 814));
                        List<ix1.j> listI = fVar3.i();
                        if (listI != null) {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it5 = listI.iterator();
                            while (it5.hasNext()) {
                                Object next = it5.next();
                                Iterator it6 = it5;
                                List list8 = listK;
                                if (p005kotlin.jvm.internal.s.g(((ix1.j) next).getBenchmark(), iVar2.getBenchmark())) {
                                    arrayList6.add(next);
                                }
                                it5 = it6;
                                listK = list8;
                            }
                            list3 = listK;
                            List listN1 = h0.N0(arrayList6, new v());
                            if (listN1 != null) {
                                Iterator it7 = listN1.iterator();
                                while (it7.hasNext()) {
                                    ix1.j jVar = (ix1.j) it7.next();
                                    Integer num2 = new Integer(jVar.getOrder());
                                    Iterator it8 = it7;
                                    dy1.h hVarA2 = mx1.i.a(mx1.i.ACCESSORY_LIFT, bVar, 0, false, 62);
                                    String exerciseName = jVar.getExerciseName();
                                    String category = jVar.getCategory();
                                    String str2 = aVar2.b(jVar.getExerciseName()).f107118c;
                                    linkedHashMap.put(num2, dy1.h.a(hVarA2, exerciseName, category, false, false, false, false, str2 == null ? "" : str2, 812));
                                    it7 = it8;
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        } else {
                            list3 = listK;
                        }
                        List listN2 = h0.N0(linkedHashMap.entrySet(), new w());
                        ArrayList arrayList7 = new ArrayList(p13.y.r(listN2, 10));
                        Iterator it9 = listN2.iterator();
                        while (it9.hasNext()) {
                            arrayList7.add((dy1.h) ((Map.Entry) it9.next()).getValue());
                        }
                        arrayList5.add(new dy1.u(i53.a.e(arrayList7)));
                        it3 = it4;
                        fVar2 = fVar3;
                        listK = list3;
                    }
                    fVar = fVar2;
                    list2 = listK;
                    Unit unit2 = Unit.INSTANCE;
                }
                dy1.u uVar = new dy1.u(i53.a.e(arrayList4));
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj3 : arrayList5) {
                    if (hashSet2.add(((dy1.u) obj3).a())) {
                        arrayList8.add(obj3);
                    }
                }
                arrayList3.add(new dy1.v(bVar2, uVar, i53.a.e(arrayList8), new dy1.u(i53.a.a(mx1.i.a(mx1.i.COOLDOWN, bVar, 0, fVar.getIncludeCooldown(), 54))), null, 16, null));
            } else {
                list2 = listK;
            }
            listK = list2;
        }
        i53.c cVarE2 = i53.a.e(arrayList3);
        tVar.f128257a = arrayListX;
        tVar.f128258b = arrayList3;
        tVar.f128261e = 1;
        this.f128208b.setValue(cVarE2);
        if (Unit.INSTANCE != aVar) {
            arrayList = arrayList3;
            list4 = arrayListX;
        }
        return aVar;
        i53.c cVarE3 = i53.a.e(arrayList);
        tVar.f128257a = list4;
        tVar.f128258b = null;
        tVar.f128261e = 2;
        this.f128210d.setValue(cVarE3);
        if (Unit.INSTANCE != aVar) {
            list5 = list4;
            hashSet = new HashSet();
            arrayList2 = new ArrayList();
            while (r1.hasNext()) {
                if (hashSet.add(((dy1.q) obj2).f61605a)) {
                    arrayList2.add(obj2);
                }
            }
            i53.c cVarE4 = i53.a.e(arrayList2);
            tVar.f128257a = null;
            tVar.f128258b = null;
            tVar.f128261e = 3;
            this.f128211e.setValue(cVarE4);
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, v13.c cVar) {
        x xVar;
        ArrayList arrayListX;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f128266e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f128266e = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object obj = xVar.f128264c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f128266e;
        if (i15 == 0) {
            arrayListX = v.h.x(obj);
            xVar.f128262a = list;
            xVar.f128263b = arrayListX;
            xVar.f128266e = 1;
            if (a(xVar) != obj2) {
            }
            return obj2;
        }
        if (i15 == 1) {
            ArrayList arrayList = xVar.f128263b;
            List list2 = xVar.f128262a;
            o13.r.b(obj);
            arrayListX = arrayList;
            list = list2;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        ix1.f fVar = (ix1.f) h0.e0(0, list);
        if (fVar != null) {
            arrayListX.add(new dy1.q(fVar.getDayOfWeek(), null, mx1.b.GENERIC_WORKOUT_1, false, 10, null));
        }
        ix1.f fVar2 = (ix1.f) h0.e0(1, list);
        if (fVar2 != null) {
            arrayListX.add(new dy1.q(fVar2.getDayOfWeek(), null, mx1.b.GENERIC_WORKOUT_2, false, 10, null));
        }
        ix1.f fVar3 = (ix1.f) h0.e0(2, list);
        if (fVar3 != null) {
            arrayListX.add(new dy1.q(fVar3.getDayOfWeek(), null, mx1.b.GENERIC_WORKOUT_3, false, 10, null));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayListX) {
            if (hashSet.add(((dy1.q) obj3).f61605a)) {
                arrayList2.add(obj3);
            }
        }
        i53.c cVarE = i53.a.e(arrayList2);
        xVar.f128262a = null;
        xVar.f128263b = null;
        xVar.f128266e = 2;
        this.f128211e.setValue(cVarE);
    }

    /* JADX WARN: Code duplicated, block: B:161:0x043c  */
    /* JADX WARN: Code duplicated, block: B:170:0x044b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0462, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r4) goto L166;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v25, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v27, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(l22.b bVar, mx1.f fVar, List list, v13.c cVar) {
        y yVar;
        int i14;
        int i15;
        ArrayList arrayList;
        Object next;
        mx1.b bVar2;
        lx1.a aVar;
        List<ix1.i> listH;
        List listN0;
        Iterator it;
        ix1.i iVar;
        lx1.a aVar2;
        ?? arrayList2;
        ?? arrayList3;
        List list2;
        List list3;
        HashSet hashSet;
        ArrayList arrayList4;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i16 = yVar.f128271e;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                yVar.f128271e = i16 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object obj = yVar.f128269c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i17 = yVar.f128271e;
        int i18 = 1;
        if (i17 != 0) {
            if (i17 == 1) {
                arrayList = yVar.f128268b;
                List list4 = yVar.f128267a;
                o13.r.b(obj);
                list2 = list4;
            } else if (i17 == 2) {
                List list5 = yVar.f128267a;
                o13.r.b(obj);
                list3 = list5;
                hashSet = new HashSet();
                arrayList4 = new ArrayList();
                for (Object obj2 : list3) {
                    if (hashSet.add(((dy1.q) obj2).f61605a)) {
                        arrayList4.add(obj2);
                    }
                }
                i53.c cVarE = i53.a.e(arrayList4);
                yVar.f128267a = null;
                yVar.f128268b = null;
                yVar.f128271e = 3;
                this.f128211e.setValue(cVarE);
            } else {
                if (i17 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        ArrayList arrayListX = v.h.x(obj);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = list.iterator();
        while (true) {
            i14 = 10;
            if (!it3.hasNext()) {
                break;
            }
            List<ix1.i> listH2 = ((ix1.f) it3.next()).h();
            if (listH2 != null) {
                arrayList3 = new ArrayList(p13.y.r(listH2, 10));
                for (ix1.i iVar2 : listH2) {
                    mx1.a.C2299a c2299a = mx1.a.f121347g;
                    String benchmark = iVar2.getBenchmark();
                    c2299a.getClass();
                    mx1.a aVarB = mx1.a.C2299a.b(benchmark);
                    if (aVarB == null) {
                        aVarB = mx1.a.BENCH_PRESS;
                    }
                    arrayList3.add(new dy1.a(aVarB, d53.w.z(iVar2.getBenchmark(), "barbell", true)));
                }
            } else {
                arrayList3 = 0;
            }
            if (arrayList3 == 0) {
                arrayList3 = j0.f134944a;
            }
            d0.v(arrayList6, (Iterable) arrayList3);
        }
        String str = fVar.f121395a;
        lx1.a aVar4 = this.f128207a;
        ArrayList arrayListO = aVar4.o(str, arrayList6);
        if (arrayListO != null) {
            Iterator it4 = arrayListO.iterator();
            while (it4.hasNext()) {
                ix1.b bVar3 = (ix1.b) it4.next();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                mx1.b.a aVar5 = mx1.b.f121357d;
                String primaryKey = bVar3.getPrimaryKey();
                aVar5.getClass();
                mx1.b bVarA = mx1.b.a.a(primaryKey);
                if (bVarA == null) {
                    bVarA = mx1.b.PUSH_DAY;
                }
                mx1.b bVar4 = bVarA;
                Iterator it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        it4 = it4;
                        i18 = i18;
                        next = null;
                        break;
                    }
                    next = it5.next();
                    List<ix1.i> listH3 = ((ix1.f) next).h();
                    if (listH3 != null) {
                        arrayList2 = new ArrayList(p13.y.r(listH3, i14));
                        Iterator it6 = listH3.iterator();
                        while (it6.hasNext()) {
                            arrayList2.add(((ix1.i) it6.next()).getBenchmark());
                        }
                    } else {
                        arrayList2 = 0;
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = j0.f134944a;
                    }
                    if (!h0.h0((Iterable) arrayList2, h0.g1(bVar3.d())).isEmpty()) {
                        break;
                    }
                    it4 = it4;
                    i18 = i18;
                }
                ix1.f fVar2 = (ix1.f) next;
                if (fVar2 == null || fVar2.getDayOfWeek() == null) {
                    bVar2 = bVar4;
                } else {
                    bVar2 = bVar4;
                    arrayListX.add(new dy1.q(fVar2.getDayOfWeek(), null, bVar2, false, 10, null));
                }
                ?? r14 = 0;
                arrayList7.add(mx1.i.a(mx1.i.WARM_UP_CARDIO, bVar, 0, fVar2 != null ? fVar2.getIncludeWarmup() : false, 54));
                arrayList7.add(mx1.i.a(mx1.i.MUSCLE_ACTIVATION, bVar, bVar3.d().size(), fVar2 != null ? fVar2.getIncludeActivation() : false, 52));
                if (fVar2 == null || (listH = fVar2.h()) == null || (listN0 = h0.N0(listH, new z())) == null) {
                    aVar = aVar4;
                } else {
                    Iterator it7 = listN0.iterator();
                    while (it7.hasNext()) {
                        ix1.i iVar3 = (ix1.i) it7.next();
                        ArrayList arrayList9 = new ArrayList();
                        dy1.h hVarA = mx1.i.a(mx1.i.PRIMARY_LIFT, bVar, r14, r14, 62);
                        String benchmark2 = iVar3.getBenchmark();
                        String str2 = aVar4.b(iVar3.getBenchmark()).f107118c;
                        arrayList9.add(dy1.h.a(hVarA, benchmark2, null, false, false, false, false, str2 == null ? "" : str2, 894));
                        List<ix1.j> listI = fVar2.i();
                        if (listI != null) {
                            ArrayList arrayList10 = new ArrayList();
                            for (Object obj3 : listI) {
                                Iterator it8 = it7;
                                ix1.i iVar4 = iVar3;
                                if (p005kotlin.jvm.internal.s.g(((ix1.j) obj3).getBenchmark(), iVar4.getBenchmark())) {
                                    arrayList10.add(obj3);
                                }
                                iVar3 = iVar4;
                                it7 = it8;
                            }
                            it = it7;
                            iVar = iVar3;
                            List<ix1.j> listN1 = h0.N0(arrayList10, new a0());
                            if (listN1 != null) {
                                for (ix1.j jVar : listN1) {
                                    dy1.h hVarA2 = mx1.i.a(mx1.i.ACCESSORY_LIFT, bVar, 0, false, 62);
                                    String exerciseName = jVar.getExerciseName();
                                    String category = jVar.getCategory();
                                    String str3 = aVar4.b(jVar.getExerciseName()).f107118c;
                                    arrayList9.add(dy1.h.a(hVarA2, exerciseName, category, false, false, false, false, str3 == null ? "" : str3, 892));
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        } else {
                            it = it7;
                            iVar = iVar3;
                        }
                        List<kx1.a> listC = aVar4.c(iVar.getBenchmark());
                        if (arrayList9.size() < listC.size() + 1) {
                            ArrayList arrayList11 = new ArrayList();
                            Iterator it9 = listC.iterator();
                            while (it9.hasNext()) {
                                Object next2 = it9.next();
                                kx1.a aVar6 = (kx1.a) next2;
                                List<kx1.a> list6 = listC;
                                lx1.a aVar7 = aVar4;
                                Iterator it10 = it9;
                                ArrayList arrayList12 = new ArrayList(p13.y.r(arrayList9, 10));
                                Iterator it11 = arrayList9.iterator();
                                while (it11.hasNext()) {
                                    arrayList12.add(((dy1.h) it11.next()).f61556a);
                                }
                                if (!h0.R(arrayList12, aVar6.f107116a)) {
                                    arrayList11.add(next2);
                                }
                                listC = list6;
                                it9 = it10;
                                aVar4 = aVar7;
                            }
                            aVar2 = aVar4;
                            for (kx1.a aVar8 : h0.S0(arrayList11, (listC.size() + 1) - arrayList9.size())) {
                                dy1.h hVarA3 = mx1.i.a(mx1.i.ACCESSORY_LIFT, bVar, 0, false, 62);
                                String str4 = aVar8.f107116a;
                                String str5 = str4 == null ? "" : str4;
                                String str6 = aVar8.f107117b;
                                String str7 = aVar8.f107118c;
                                arrayList9.add(dy1.h.a(hVarA3, str5, str6, false, false, false, false, str7 == null ? "" : str7, 860));
                            }
                        } else {
                            aVar2 = aVar4;
                        }
                        arrayList8.add(new dy1.u(i53.a.e(arrayList9)));
                        it7 = it;
                        aVar4 = aVar2;
                        r14 = 0;
                    }
                    aVar = aVar4;
                    Unit unit2 = Unit.INSTANCE;
                }
                dy1.u uVar = new dy1.u(i53.a.e(arrayList7));
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList13 = new ArrayList();
                for (Object obj4 : arrayList8) {
                    if (hashSet2.add(((dy1.u) obj4).a())) {
                        arrayList13.add(obj4);
                    }
                }
                arrayList5.add(new dy1.v(bVar2, uVar, i53.a.e(arrayList13), new dy1.u(i53.a.a(mx1.i.a(mx1.i.COOLDOWN, bVar, 0, fVar2 != null ? fVar2.getIncludeCooldown() : false, 54))), null, 16, null));
                it4 = it4;
                i18 = i18;
                aVar4 = aVar;
                i14 = 10;
            }
            i15 = i18;
            Unit unit3 = Unit.INSTANCE;
        } else {
            i15 = 1;
        }
        i53.c cVarE2 = i53.a.e(arrayList5);
        yVar.f128267a = arrayListX;
        yVar.f128268b = arrayList5;
        yVar.f128271e = i15;
        this.f128208b.setValue(cVarE2);
        if (Unit.INSTANCE != aVar3) {
            arrayList = arrayList5;
            list2 = arrayListX;
        }
        return aVar3;
        i53.c cVarE3 = i53.a.e(arrayList);
        yVar.f128267a = list2;
        yVar.f128268b = null;
        yVar.f128271e = 2;
        this.f128210d.setValue(cVarE3);
        if (Unit.INSTANCE != aVar3) {
            list3 = list2;
            hashSet = new HashSet();
            arrayList4 = new ArrayList();
            while (r1.hasNext()) {
                if (hashSet.add(((dy1.q) obj2).f61605a)) {
                    arrayList4.add(obj2);
                }
            }
            i53.c cVarE4 = i53.a.e(arrayList4);
            yVar.f128267a = null;
            yVar.f128268b = null;
            yVar.f128271e = 3;
            this.f128211e.setValue(cVarE4);
        }
        return aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023f, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r6) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(l22.a aVar, List list, boolean z14, v13.c cVar) {
        b0 b0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z15;
        ArrayList arrayList3;
        kx1.a aVar2;
        String str;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f128205e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f128205e = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object obj = b0Var.f128203c;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f128205e;
        if (i15 != 0) {
            if (i15 == 1) {
                z15 = b0Var.f128202b;
                arrayList3 = b0Var.f128201a;
                o13.r.b(obj);
                arrayList2 = null;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        lx1.a aVar4 = this.f128207a;
        if (list != null) {
            arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(aVar4.i((ix1.b) it.next()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList();
        if (list != null) {
            Iterator it3 = list.iterator();
            int i16 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    p13.x.q();
                    throw null;
                }
                ix1.b bVar = (ix1.b) next;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                List list2 = arrayList != null ? (List) h0.e0(i16, arrayList) : null;
                mx1.b.a aVar5 = mx1.b.f121357d;
                String primaryKey = bVar.getPrimaryKey();
                aVar5.getClass();
                mx1.b bVarA = mx1.b.a.a(primaryKey);
                if (bVarA == null) {
                    bVarA = mx1.b.PUSH_DAY;
                }
                mx1.b bVar2 = bVarA;
                Iterator it4 = it3;
                arrayList5.add(mx1.i.a(mx1.i.WARM_UP_CARDIO, aVar, 0, false, 62));
                ArrayList arrayList7 = arrayList;
                arrayList5.add(mx1.i.a(mx1.i.MUSCLE_ACTIVATION, aVar, bVar.d().size(), false, 60));
                Iterator it5 = bVar.d().iterator();
                int i18 = 0;
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    String str2 = (String) next2;
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it6 = it5;
                    ArrayList arrayList9 = arrayList5;
                    String str3 = "";
                    boolean z16 = !z14;
                    arrayList8.add(dy1.h.a(mx1.i.a(mx1.i.PRIMARY_LIFT, aVar, 0, false, 62), str2, null, false, z16, false, false, (list2 == null || (aVar2 = (kx1.a) h0.e0(i18, list2)) == null || (str = aVar2.f107118c) == null) ? "" : str, 878));
                    for (kx1.a aVar6 : aVar4.c(str2)) {
                        String str4 = str3;
                        lx1.a aVar7 = aVar4;
                        dy1.h hVarA = mx1.i.a(mx1.i.ACCESSORY_LIFT, aVar, 0, false, 62);
                        String str5 = aVar6.f107116a;
                        String str6 = str5 == null ? str4 : str5;
                        String str7 = aVar6.f107117b;
                        String str8 = str7 == null ? str4 : str7;
                        String str9 = aVar6.f107118c;
                        arrayList8.add(dy1.h.a(hVarA, str6, str8, false, z16, false, z16, str9 == null ? str4 : str9, 812));
                        str3 = str4;
                        aVar4 = aVar7;
                    }
                    arrayList6.add(new dy1.u(i53.a.e(arrayList8)));
                    i18 = i19;
                    it5 = it6;
                    arrayList5 = arrayList9;
                    aVar4 = aVar4;
                }
                lx1.a aVar8 = aVar4;
                dy1.u uVar = new dy1.u(i53.a.e(arrayList5));
                HashSet hashSet = new HashSet();
                ArrayList arrayList10 = new ArrayList();
                for (Object obj2 : arrayList6) {
                    if (hashSet.add(((dy1.u) obj2).a())) {
                        arrayList10.add(obj2);
                    }
                }
                arrayList4.add(new dy1.v(bVar2, uVar, i53.a.e(arrayList10), new dy1.u(i53.a.a(mx1.i.a(mx1.i.COOLDOWN, aVar, 0, false, 62))), null, 16, null));
                it3 = it4;
                i16 = i17;
                arrayList = arrayList7;
                aVar4 = aVar8;
            }
        }
        arrayList2 = null;
        i53.c cVarE = i53.a.e(arrayList4);
        b0Var.f128201a = arrayList4;
        b0Var.f128202b = z14;
        b0Var.f128205e = 1;
        this.f128208b.setValue(cVarE);
        if (Unit.INSTANCE != aVar3) {
            z15 = z14;
            arrayList3 = arrayList4;
        }
        return aVar3;
        i53.c cVarE2 = i53.a.e(arrayList3);
        b0Var.f128201a = arrayList2;
        b0Var.f128202b = z15;
        b0Var.f128205e = 2;
        this.f128210d.setValue(cVarE2);
    }
}
