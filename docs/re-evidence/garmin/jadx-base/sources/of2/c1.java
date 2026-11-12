package of2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lof2/c1;", "Lof2/z0;", "Lfg2/f;", "repository", "<init>", "(Lfg2/f;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg2.f f131791a;

    public c1(fg2.f fVar) {
        fVar.getClass();
        this.f131791a = fVar;
    }

    @Override // of2.z0
    public final ArrayList a() {
        Object value;
        List listK = p13.x.k(ag2.c.a.HEART_RATE, ag2.c.a.TIMER);
        ArrayList arrayList = new ArrayList(p13.y.r(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(new ag2.c(((ag2.c.a) it.next()).f3218a));
        }
        List listB1 = p13.h0.b1(arrayList);
        listB1.getClass();
        p2 p2Var = this.f131791a.B;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, listB1));
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = listB1.iterator();
        while (it3.hasNext()) {
            ag2.c.a aVarA = ((ag2.c) it3.next()).a();
            ArrayList arrayListB = aVarA != null ? zg2.e.b(aVarA) : null;
            if (arrayListB != null) {
                arrayList2.add(arrayListB);
            }
        }
        return p13.y.s(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    @Override // of2.z0
    public final Object b(zf2.d dVar, vf2.p pVar, rf2.l lVar, List list, long j8, v13.c cVar) {
        b1 b1Var;
        vf2.p pVar2;
        List list2;
        zf2.d dVar2;
        rf2.l lVar2;
        Set setG1;
        Object value;
        lt2.b bVarC;
        lt2.b bVarC2;
        Iterable iterableC;
        mt2.i iVar;
        mt2.i iVar2;
        vf2.w wVar;
        vf2.w wVar2;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i14 = b1Var.f131767g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b1Var.f131767g = i14 - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(this, cVar);
            }
        } else {
            b1Var = new b1(this, cVar);
        }
        b1 b1Var2 = b1Var;
        Object obj = b1Var2.f131765e;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = b1Var2.f131767g;
        int i16 = 0;
        if (i15 == 0) {
            o13.r.b(obj);
            boolean z14 = lVar != null;
            b1Var2.f131761a = dVar;
            pVar2 = pVar;
            b1Var2.f131762b = pVar2;
            b1Var2.f131763c = lVar;
            list2 = list;
            b1Var2.f131764d = list2;
            b1Var2.f131767g = 1;
            Object objC = c(dVar, z14, j8, b1Var2);
            if (objC == obj2) {
                return obj2;
            }
            dVar2 = dVar;
            obj = objC;
            lVar2 = lVar;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = b1Var2.f131764d;
            lVar2 = b1Var2.f131763c;
            vf2.p pVar3 = b1Var2.f131762b;
            dVar2 = b1Var2.f131761a;
            o13.r.b(obj);
            list2 = list3;
            pVar2 = pVar3;
        }
        List list4 = (List) obj;
        new zg2.b();
        List<vf2.v> listE = pVar2 != null ? pVar2.e() : null;
        dVar2.getClass();
        if (listE != null) {
            ArrayList arrayList = new ArrayList();
            for (vf2.v vVar : listE) {
                vf2.g gVar = vVar.f178039e;
                mt2.l lVarD = gVar != null ? zg2.f.d(gVar) : null;
                List<vf2.w> listM = vVar.m();
                if (listM == null || (wVar2 = (vf2.w) p13.h0.e0(i16, listM)) == null) {
                    bVarC = null;
                } else {
                    vf2.j.a aVar = vf2.j.f177974b;
                    Integer targetType = wVar2.getTargetType();
                    aVar.getClass();
                    vf2.j jVarA = vf2.j.a.a(targetType);
                    if (jVarA != null) {
                        bVarC = zg2.f.c(jVarA, wVar2, dVar2);
                    } else {
                        bVarC = null;
                    }
                }
                List<vf2.w> listM2 = vVar.m();
                if (listM2 == null || (wVar = (vf2.w) p13.h0.e0(1, listM2)) == null) {
                    bVarC2 = null;
                } else {
                    vf2.j.a aVar2 = vf2.j.f177974b;
                    Integer targetType2 = wVar.getTargetType();
                    aVar2.getClass();
                    vf2.j jVarA2 = vf2.j.a.a(targetType2);
                    if (jVarA2 != null) {
                        bVarC2 = zg2.f.c(jVarA2, wVar, dVar2);
                    } else {
                        bVarC2 = null;
                    }
                }
                vf2.i iVar3 = vVar.f178041g;
                mt2.c cVarB = iVar3 != null ? zg2.f.b(iVar3) : null;
                Double duration = vVar.getDuration();
                double dDoubleValue = duration != null ? duration.doubleValue() : 0.0d;
                vf2.i iVar4 = vVar.f178041g;
                mt2.c cVar2 = new lt2.a(cVarB, dDoubleValue, iVar4 != null ? zg2.f.a(iVar4) : null, null, 8, null).f114866a;
                if (cVar2 == null) {
                    iterableC = p13.j0.f134944a;
                } else {
                    boolean z15 = lVarD == mt2.l.REST;
                    switch (zg2.f.a.f204696c[cVar2.ordinal()]) {
                        case 1:
                            iterableC = p13.w.c(z15 ? ag2.c.a.REST_TIMER : ag2.c.a.STEP_TIMER);
                            break;
                        case 2:
                            iterableC = p13.w.c(z15 ? ag2.c.a.REST_DURATION : ag2.c.a.STEP_DURATION);
                            break;
                        case 3:
                            iterableC = p13.w.c(ag2.c.a.STEP_DISTANCE);
                            break;
                        case 4:
                            iterableC = p13.w.c(ag2.c.a.STEP_CALORIES);
                            break;
                        case 5:
                            iterableC = p13.w.c(ag2.c.a.POWER);
                            break;
                        case 6:
                            iterableC = p13.w.c(ag2.c.a.HEART_RATE);
                            break;
                        case 7:
                            iterableC = p13.w.c(ag2.c.a.REST_TIME);
                            break;
                        case 8:
                            iterableC = p13.w.c(ag2.c.a.REPS);
                            break;
                        case 9:
                            iterableC = p13.x.k(ag2.c.a.REPS, ag2.c.a.STEP_TIMER);
                            break;
                        default:
                            iterableC = p13.j0.f134944a;
                            break;
                    }
                    if (iterableC == null) {
                        iterableC = p13.j0.f134944a;
                    }
                }
                p13.d0.v(arrayList, p13.h0.C0(p13.u.C(new ag2.c.a[]{(bVarC == null || (iVar2 = bVarC.f114870a) == null) ? null : zg2.f.f(iVar2, dVar2), (bVarC2 == null || (iVar = bVarC2.f114870a) == null) ? null : zg2.f.f(iVar, dVar2), ag2.c.a.HEART_RATE_ZONE}), iterableC));
                i16 = 0;
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ag2.c(((ag2.c.a) it.next()).f3218a));
            }
            setG1 = p13.h0.g1(arrayList2);
            if (setG1 == null) {
                setG1 = p13.l0.f134950a;
            }
        } else {
            setG1 = p13.l0.f134950a;
        }
        Iterable iterableK = ((lVar2 instanceof rf2.l.b) || (lVar2 instanceof rf2.l.c)) ? p13.x.k(ag2.c.a.REST_TIMER, ag2.c.a.STEP_TIMER, ag2.c.a.REPS, ag2.c.a.INTERVALS, ag2.c.a.HEART_RATE_ZONE) : ((lVar2 instanceof rf2.l.e) || (lVar2 instanceof rf2.l.a)) ? p13.w.c(ag2.c.a.HEART_RATE_ZONE) : p13.j0.f134944a;
        ArrayList arrayList3 = new ArrayList(p13.y.r(iterableK, 10));
        Iterator it3 = iterableK.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new ag2.c(((ag2.c.a) it3.next()).f3218a));
        }
        List listB1 = p13.h0.b1(p13.h0.h1(list4, p13.c1.h(setG1, arrayList3)));
        listB1.getClass();
        p2 p2Var = this.f131791a.f71502z;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, listB1));
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = listB1.iterator();
        while (it4.hasNext()) {
            ag2.c.a aVarA = ((ag2.c) it4.next()).a();
            ArrayList arrayListB = aVarA != null ? zg2.e.b(aVarA) : null;
            if (arrayListB != null) {
                arrayList4.add(arrayListB);
            }
        }
        List listB2 = p13.h0.b1(p13.h0.f1(p13.y.s(arrayList4)));
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            p13.d0.v(arrayList5, ((zf2.c) it5.next()).f204575a);
        }
        List listB3 = p13.h0.b1(p13.h0.f1(arrayList5));
        Iterable iterableA = ((tf2.h) KoinJavaComponent.get$default(tf2.h.class, null, null, 6, null)).a(dVar2.f204629a);
        if (iterableA == null) {
            iterableA = p13.j0.f134944a;
        }
        return p13.h0.b1(p13.h0.f1(p13.h0.C0(p13.h0.C0(listB2, listB3), iterableA)));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(zf2.d dVar, boolean z14, long j8, v13.c cVar) {
        a1 a1Var;
        List<ag2.a> listB;
        ag2.c.a aVarA;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i14 = a1Var.f131720c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a1Var.f131720c = i14 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, cVar);
            }
        } else {
            a1Var = new a1(this, cVar);
        }
        a1 a1Var2 = a1Var;
        Object objG = a1Var2.f131718a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a1Var2.f131720c;
        if (i15 == 0) {
            o13.r.b(objG);
            a1Var2.f131720c = 1;
            int i16 = fg2.f.L;
            fg2.f fVar = this.f131791a;
            b0 b0Var = (b0) fVar.f71482f.getValue();
            objG = fVar.g(dVar, z14, b0Var != null ? b0Var.f131746c : null, j8, a1Var2);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objG);
        }
        ag2.d dVar2 = (ag2.d) objG;
        if (dVar2 != null && (listB = dVar2.b()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                List<ag2.c> listB2 = ((ag2.a) it.next()).b();
                if (listB2 != null) {
                    arrayList.add(listB2);
                }
            }
            ArrayList arrayListS = p13.y.s(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayListS) {
                ag2.c cVar2 = (ag2.c) obj;
                ag2.c.a aVarA2 = cVar2.a();
                if (aVarA2 != null) {
                    switch (og2.i.a.f132041a[aVarA2.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            arrayList2.add(obj);
                            break;
                        default:
                            aVarA = cVar2.a();
                            if (aVarA == null && zg2.e.a(aVarA)) {
                                arrayList2.add(obj);
                            }
                            break;
                    }
                } else {
                    aVarA = cVar2.a();
                    if (aVarA == null) {
                    }
                }
            }
            List listB1 = p13.h0.b1(p13.h0.f1(arrayList2));
            if (listB1 != null) {
                return listB1;
            }
        }
        return p13.j0.f134944a;
    }
}
