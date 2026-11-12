package nx1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnx1/b;", "", "Llx1/a;", "stpRepo", "Lk52/a;", "dataFormatter", "<init>", "(Llx1/a;Lk52/a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.a f128197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k52.a f128198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f128199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f128200d;

    public b(lx1.a aVar, k52.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f128197a = aVar;
        this.f128198b = aVar2;
        p2 p2VarA = q2.a(new dy1.c(false, null, null, false, 15, null));
        this.f128199c = p2VarA;
        this.f128200d = r53.s.d(p2VarA);
    }

    public static ArrayList a(String str, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new dy1.a((mx1.a) it.next(), str.equals(mx1.c.FULL_GYM.f121373a)));
        }
        return arrayList;
    }

    public final void b(l22.a aVar, List list, boolean z14, boolean z15) {
        lx1.a aVar2;
        p2 p2Var;
        Object value;
        dy1.c cVar;
        ArrayList arrayList;
        list.getClass();
        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            aVar2 = this.f128197a;
            if (!zHasNext) {
                break;
            }
            mx1.a aVar3 = (mx1.a) it.next();
            arrayList2.add(new dy1.d(aVar3, z15, dy1.s.c(aVar2.l(aVar3.f121354d, aVar3.f121355e), aVar, z14), dy1.s.c(aVar2.l(aVar3.f121354d, aVar3.f121356f), aVar, z14), null, null, null, 112, null));
        }
        i53.c cVarE = i53.a.e(arrayList2);
        do {
            p2Var = this.f128199c;
            value = p2Var.getValue();
            cVar = (dy1.c) this.f128200d.f150540a.getValue();
            List<com.garmin.android.apps.connectmobile.workouts.data.model.b> listJ = aVar2.j();
            arrayList = new ArrayList(p13.y.r(listJ, 10));
            Iterator<T> it3 = listJ.iterator();
            while (it3.hasNext()) {
                arrayList.add(this.f128198b.c((com.garmin.android.apps.connectmobile.workouts.data.model.b) it3.next()));
            }
        } while (!p2Var.b(value, dy1.c.a(cVar, z15, cVarE, i53.a.e(h0.M0(arrayList)), 8)));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193 A[LOOP:1: B:80:0x018d->B:82:0x0193, LOOP_END] */
    public final Object c(l22.a aVar, boolean z14, v13.c cVar) {
        a aVar2;
        l22.b bVar;
        boolean z15;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVarA;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVarA2;
        boolean z16;
        l22.b bVar2;
        boolean z17;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVarA3;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVarA4;
        Object value;
        dy1.c cVar2;
        ArrayList arrayList;
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i14 = aVar2.f128196f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.f128196f = i14 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(this, cVar);
            }
        } else {
            aVar2 = new a(this, cVar);
        }
        Object objA = aVar2.f128194d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar2.f128196f;
        boolean z18 = false;
        p2 p2Var = this.f128199c;
        lx1.a aVar4 = this.f128197a;
        if (i15 != 0) {
            if (i15 == 1) {
                boolean z19 = aVar2.f128192b;
                l22.b bVar3 = aVar2.f128191a;
                o13.r.b(objA);
                z15 = z19;
                bVar = bVar3;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z16 = aVar2.f128193c;
                z17 = aVar2.f128192b;
                bVar2 = aVar2.f128191a;
                o13.r.b(objA);
            }
            boolean zBooleanValue = ((Boolean) objA).booleanValue();
            if (z16 && zBooleanValue) {
                do {
                    value = p2Var.getValue();
                    cVar2 = (dy1.c) value;
                    i53.c<dy1.d> cVar3 = cVar2.f61536b;
                    arrayList = new ArrayList(p13.y.r(cVar3, 10));
                    for (dy1.d dVar : cVar3) {
                        mx1.a aVar5 = dVar.f61540a;
                        dy1.b bVarC = dy1.s.c(aVar4.l(aVar5.f121354d, aVar5.f121355e), bVar2, z17);
                        mx1.a aVar6 = dVar.f61540a;
                        arrayList.add(dy1.d.a(dVar, false, bVarC, dy1.s.c(aVar4.l(aVar6.f121354d, aVar6.f121356f), bVar2, z17), 115));
                    }
                } while (!p2Var.b(value, dy1.c.a(cVar2, false, i53.a.e(arrayList), null, 13)));
                z18 = true;
            }
            return Boolean.valueOf(z18);
        }
        o13.r.b(objA);
        i53.c<dy1.d> cVar4 = ((dy1.c) p2Var.getValue()).f61536b;
        ArrayList arrayList2 = new ArrayList();
        for (dy1.d dVar2 : cVar4) {
            dy1.b bVar4 = dVar2.f61542c;
            if (bVar4 == null || !bVar4.f61534g) {
                bVarA2 = null;
            } else {
                bVarA2 = dy1.s.a(bVar4, dVar2.f61540a, true);
                if (bVarA2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                    bVarA2 = null;
                }
            }
            if (bVarA2 != null) {
                arrayList2.add(bVarA2);
            }
        }
        i53.c<dy1.d> cVar5 = ((dy1.c) p2Var.getValue()).f61536b;
        ArrayList arrayList3 = new ArrayList();
        for (dy1.d dVar3 : cVar5) {
            dy1.b bVar5 = dVar3.f61543d;
            if (bVar5 == null || !bVar5.f61534g) {
                bVarA = null;
            } else {
                bVarA = dy1.s.a(bVar5, dVar3.f61540a, false);
                if (bVarA.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != null) {
                    bVarA = null;
                }
            }
            if (bVarA != null) {
                arrayList3.add(bVarA);
            }
        }
        ArrayList arrayListC0 = h0.C0(arrayList2, arrayList3);
        bVar = aVar;
        aVar2.f128191a = bVar;
        z15 = z14;
        aVar2.f128192b = z15;
        aVar2.f128196f = 1;
        objA = aVar4.a(arrayListC0, aVar2);
        if (objA != aVar3) {
        }
        return aVar3;
        boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
        i53.c<dy1.d> cVar6 = ((dy1.c) p2Var.getValue()).f61536b;
        ArrayList arrayList4 = new ArrayList();
        for (dy1.d dVar4 : cVar6) {
            dy1.b bVar6 = dVar4.f61542c;
            if (bVar6 == null || !bVar6.f61534g) {
                bVarA4 = null;
            } else {
                bVarA4 = dy1.s.a(bVar6, dVar4.f61540a, true);
                if (bVarA4.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() == null) {
                    bVarA4 = null;
                }
            }
            if (bVarA4 != null) {
                arrayList4.add(bVarA4);
            }
        }
        i53.c<dy1.d> cVar7 = ((dy1.c) p2Var.getValue()).f61536b;
        ArrayList arrayList5 = new ArrayList();
        for (dy1.d dVar5 : cVar7) {
            dy1.b bVar7 = dVar5.f61543d;
            if (bVar7 == null || !bVar7.f61534g) {
                bVarA3 = null;
            } else {
                bVarA3 = dy1.s.a(bVar7, dVar5.f61540a, false);
                if (bVarA3.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() == null) {
                    bVarA3 = null;
                }
            }
            if (bVarA3 != null) {
                arrayList5.add(bVarA3);
            }
        }
        ArrayList arrayListC1 = h0.C0(arrayList4, arrayList5);
        aVar2.f128191a = bVar;
        aVar2.f128192b = z15;
        aVar2.f128193c = zBooleanValue2;
        aVar2.f128196f = 2;
        Object objD = aVar4.d(arrayListC1, aVar2);
        if (objD != aVar3) {
            z16 = zBooleanValue2;
            objA = objD;
            bVar2 = bVar;
            z17 = z15;
            boolean zBooleanValue3 = ((Boolean) objA).booleanValue();
            if (z16) {
                do {
                    value = p2Var.getValue();
                    cVar2 = (dy1.c) value;
                    i53.c<dy1.d> cVar8 = cVar2.f61536b;
                    arrayList = new ArrayList(p13.y.r(cVar8, 10));
                    while (r5.hasNext()) {
                        mx1.a aVar7 = dVar.f61540a;
                        dy1.b bVarC2 = dy1.s.c(aVar4.l(aVar7.f121354d, aVar7.f121355e), bVar2, z17);
                        mx1.a aVar8 = dVar.f61540a;
                        arrayList.add(dy1.d.a(dVar, false, bVarC2, dy1.s.c(aVar4.l(aVar8.f121354d, aVar8.f121356f), bVar2, z17), 115));
                    }
                } while (!p2Var.b(value, dy1.c.a(cVar2, false, i53.a.e(arrayList), null, 13)));
                z18 = true;
            }
            return Boolean.valueOf(z18);
        }
        return aVar3;
    }
}
