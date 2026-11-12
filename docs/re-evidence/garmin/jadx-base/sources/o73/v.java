package o73;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o53.c0;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @v13.e(c = "org.jetbrains.compose.resources.StringResourcesKt", f = "StringResources.kt", l = {63}, m = "loadString")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f130778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f130779b;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f130778a = obj;
            this.f130779b |= Integer.MIN_VALUE;
            return v.d(null, null, null, this);
        }
    }

    public static final Object a(u uVar, t13.d<? super String> dVar) {
        return d(uVar, p.f130771a, (h) i.f130763b.invoke(), dVar);
    }

    public static final Object b(u uVar, Object[] objArr, v13.c cVar) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj.toString());
        }
        return c(uVar, arrayList, p.f130771a, (h) i.f130763b.invoke(), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(u uVar, ArrayList arrayList, o oVar, h hVar, v13.c cVar) {
        w wVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f130782c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f130782c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(cVar);
            }
        } else {
            wVar = new w(cVar);
        }
        Object objD = wVar.f130781b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f130782c;
        if (i15 == 0) {
            o13.r.b(objD);
            wVar.f130780a = arrayList;
            wVar.f130782c = 1;
            objD = d(uVar, oVar, hVar, wVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = wVar.f130780a;
            o13.r.b(objD);
        }
        String str = (String) objD;
        d53.k kVar = z.f130787a;
        str.getClass();
        arrayList.getClass();
        return z.f130787a.e(new y(arrayList), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    public static final Object d(u uVar, o oVar, h hVar, t13.d<? super String> dVar) {
        a aVar;
        n nVar;
        e eVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f130779b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f130779b = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objE = aVar.f130778a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f130779b;
        if (i15 == 0) {
            o13.r.b(objE);
            i.a aVar3 = i.f130762a;
            uVar.getClass();
            hVar.getClass();
            List listB1 = h0.b1(uVar.f130757b);
            d dVar2 = hVar.f130758a;
            f fVar = hVar.f130759b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB1) {
                Set<e> set = ((n) obj).f130767a;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (p005kotlin.jvm.internal.s.g((e) it.next(), dVar2)) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                Set<e> set2 = ((n) obj2).f130767a;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator it3 = set2.iterator();
                    while (it3.hasNext()) {
                        if (p005kotlin.jvm.internal.s.g((e) it3.next(), fVar)) {
                            arrayList2.add(obj2);
                            break;
                        }
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    Set<e> set3 = ((n) obj3).f130767a;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        Iterator it4 = set3.iterator();
                        do {
                            if (it4.hasNext()) {
                            }
                        } while (!(((e) it4.next()) instanceof f));
                    }
                    arrayList2.add(obj3);
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = new ArrayList();
                    for (Object obj4 : listB1) {
                        Set<e> set4 = ((n) obj4).f130767a;
                        if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                            Iterator it5 = set4.iterator();
                            do {
                                if (it5.hasNext()) {
                                    eVar = (e) it5.next();
                                    if (eVar instanceof d) {
                                        break;
                                    }
                                }
                            } while (!(eVar instanceof f));
                        }
                        arrayList2.add(obj4);
                    }
                }
            }
            if (arrayList2.size() == 1) {
                nVar = (n) h0.b0(arrayList2);
            } else {
                a0 a0Var = hVar.f130760c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : arrayList2) {
                    Set<e> set5 = ((n) obj5).f130767a;
                    if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                        Iterator it6 = set5.iterator();
                        while (it6.hasNext()) {
                            if (p005kotlin.jvm.internal.s.g((e) it6.next(), a0Var)) {
                                arrayList3.add(obj5);
                                break;
                            }
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3 = new ArrayList();
                    for (Object obj6 : arrayList2) {
                        Set<e> set6 = ((n) obj6).f130767a;
                        if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                            Iterator it7 = set6.iterator();
                            do {
                                if (it7.hasNext()) {
                                }
                            } while (((e) it7.next()).getClass() != a0.class);
                        }
                        arrayList3.add(obj6);
                    }
                }
                if (arrayList3.size() == 1) {
                    nVar = (n) h0.b0(arrayList3);
                } else {
                    int i16 = hVar.f130761d.f130753a;
                    j0 j0Var = j0.f134944a;
                    w13.c cVar = c.f130752j;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj7 : cVar) {
                        if (((c) obj7).f130753a >= i16) {
                            arrayList4.add(obj7);
                        }
                    }
                    ?? arrayList5 = j0Var;
                    for (c cVar2 : h0.N0(arrayList4, new j())) {
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj8 : arrayList3) {
                            Set<e> set7 = ((n) obj8).f130767a;
                            if (!(set7 instanceof Collection) || !set7.isEmpty()) {
                                Iterator it8 = set7.iterator();
                                while (it8.hasNext()) {
                                    if (((e) it8.next()) == cVar2) {
                                        arrayList6.add(obj8);
                                        break;
                                    }
                                }
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            arrayList5 = arrayList6;
                            break;
                        }
                        arrayList5 = arrayList6;
                    }
                    if (((Collection) arrayList5).isEmpty()) {
                        ArrayList arrayListY0 = h0.y0(c.f130752j, c.LDPI);
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj9 : arrayListY0) {
                            if (((c) obj9).f130753a < i16) {
                                arrayList7.add(obj9);
                            }
                        }
                        arrayList5 = arrayList5;
                        for (c cVar3 : h0.N0(arrayList7, new k())) {
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj10 : arrayList3) {
                                Set<e> set8 = ((n) obj10).f130767a;
                                if (!(set8 instanceof Collection) || !set8.isEmpty()) {
                                    Iterator it9 = set8.iterator();
                                    while (it9.hasNext()) {
                                        if (((e) it9.next()) == cVar3) {
                                            arrayList8.add(obj10);
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!arrayList8.isEmpty()) {
                                arrayList5 = arrayList8;
                                break;
                            }
                            arrayList5 = arrayList8;
                        }
                        if (((Collection) arrayList5).isEmpty()) {
                            arrayList5 = new ArrayList();
                            for (Object obj11 : arrayList3) {
                                Set<e> set9 = ((n) obj11).f130767a;
                                if (!(set9 instanceof Collection) || !set9.isEmpty()) {
                                    Iterator it10 = set9.iterator();
                                    do {
                                        if (it10.hasNext()) {
                                        }
                                    } while (!(((e) it10.next()) instanceof c));
                                }
                                arrayList5.add(obj11);
                            }
                            if (arrayList5.isEmpty()) {
                                arrayList5 = new ArrayList();
                                for (Object obj12 : arrayList3) {
                                    Set<e> set10 = ((n) obj12).f130767a;
                                    if (!(set10 instanceof Collection) || !set10.isEmpty()) {
                                        Iterator it11 = set10.iterator();
                                        while (it11.hasNext()) {
                                            if (((e) it11.next()) == c.LDPI) {
                                                arrayList5.add(obj12);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList5.size() != 1) {
                        boolean zIsEmpty = arrayList5.isEmpty();
                        String str = uVar.f130756a;
                        if (zIsEmpty) {
                            l2.m("Resource with ID='", str, "' not found");
                            return null;
                        }
                        androidx.core.view.j.B("Resource with ID='", str, "' has more than one file: ", h0.k0((Iterable) arrayList5, null, null, null, l.f130766a, 31));
                        return null;
                    }
                    nVar = (n) h0.b0(arrayList5);
                }
            }
            aVar.f130779b = 1;
            b<String, Object> bVar = z.f130788b;
            String str2 = nVar.f130768b + "/" + nVar.f130769c + "-" + nVar.f130770d;
            x xVar = new x(oVar, nVar, null);
            bVar.getClass();
            objE = c0.e(new o73.a(bVar, str2, xVar, null), aVar);
            if (objE == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        objE.getClass();
        return ((t) objE).f130777a;
    }
}
