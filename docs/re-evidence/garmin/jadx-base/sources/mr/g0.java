package mr;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import ps.o1;
import ps.p1;
import ps.v0;
import ps.x0;
import ps.x1;
import ps.y0;
import ps.y1;
import r53.c2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmr/g0;", "", "Lam/m;", "activityRepo", "Lpc0/j;", "devicesRepo", "<init>", "(Lam/m;Lpc0/j;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am.m f120273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc0.j f120274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ou1.d f120275c;

    public g0(am.m mVar, pc0.j jVar) {
        mVar.getClass();
        jVar.getClass();
        this.f120273a = mVar;
        this.f120274b = jVar;
        this.f120275c = (ou1.d) KoinJavaComponent.get$default(ou1.d.class, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(g0 g0Var, long j8, v13.c cVar) {
        v vVar;
        g0Var.getClass();
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f120325d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f120325d = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(g0Var, cVar);
            }
        } else {
            vVar = new v(g0Var, cVar);
        }
        Object objY = vVar.f120323b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f120325d;
        if (i15 == 0) {
            o13.r.b(objY);
            c2 c2Var = new c2(new am.u(g0Var.f120273a, j8, null));
            x53.c cVar2 = o53.s0.f129406a;
            r53.i iVarA = r53.s.A(c2Var, x53.b.f189152a);
            vVar.f120322a = j8;
            vVar.f120325d = 1;
            objY = r53.s.y(iVarA, vVar);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = vVar.f120322a;
            o13.r.b(objY);
        }
        long j14 = j8;
        v2 v2Var = (v2) objY;
        if (!(v2Var instanceof v2.b)) {
            return null;
        }
        v0 v0Var = (v0) ((v2.b) v2Var).f47386a;
        ps.p activitySplits = v0Var.getActivitySplits();
        List<ps.o0> listF = activitySplits != null ? activitySplits.f() : null;
        ps.p activitySplits2 = v0Var.getActivitySplits();
        List<x0> listG = activitySplits2 != null ? activitySplits2.g() : null;
        p1 splitSummary = v0Var.getSplitSummary();
        List<o1> listB = splitSummary != null ? splitSummary.b() : null;
        y1 typedSplits = v0Var.getTypedSplits();
        return new ps.p(j14, listF, listG, listB, typedSplits != null ? typedSplits.d() : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(g0 g0Var, long j8, boolean z14, v13.c cVar) {
        x xVar;
        long j14;
        boolean z15;
        List listN0;
        g0Var.getClass();
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f120330e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f120330e = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(g0Var, cVar);
            }
        } else {
            xVar = new x(g0Var, cVar);
        }
        Object objY = xVar.f120328c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f120330e;
        ArrayList arrayList = null;
        if (i15 == 0) {
            o13.r.b(objY);
            c2 c2Var = new c2(new am.w(g0Var.f120273a, j8, null));
            x53.c cVar2 = o53.s0.f129406a;
            r53.i iVarA = r53.s.A(c2Var, x53.b.f189152a);
            xVar.f120326a = j8;
            xVar.f120327b = z14;
            xVar.f120330e = 1;
            objY = r53.s.y(iVarA, xVar);
            if (objY != obj) {
                j14 = j8;
                z15 = z14;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objY);
                return objY;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z15 = xVar.f120327b;
        long j15 = xVar.f120326a;
        o13.r.b(objY);
        j14 = j15;
        v2 v2Var = (v2) objY;
        if (!(v2Var instanceof v2.b)) {
            return null;
        }
        y0 y0Var = (y0) ((v2.b) v2Var).f47386a;
        List<ps.o0> listD = y0Var.d();
        List<x0> listF = y0Var.f();
        if (listF != null && (listN0 = p13.h0.N0(listF, new w())) != null) {
            arrayList = new ArrayList(listN0);
        }
        ps.p pVar = new ps.p(j14, listD, arrayList, null, null, 24, null);
        if (!z15) {
            return pVar;
        }
        xVar.f120326a = j14;
        xVar.f120327b = z15;
        xVar.f120330e = 2;
        Object objE = g0Var.e(j14, pVar, xVar);
        return objE == obj ? obj : objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(g0 g0Var, long j8, v13.c cVar) {
        z zVar;
        g0Var.getClass();
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f120339c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f120339c = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(g0Var, cVar);
            }
        } else {
            zVar = new z(g0Var, cVar);
        }
        Object objY = zVar.f120337a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f120339c;
        if (i15 == 0) {
            o13.r.b(objY);
            r53.i<v2<ps.r>> iVarC = g0Var.f120273a.c(j8);
            zVar.f120339c = 1;
            objY = r53.s.y(iVarC, zVar);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        v2 v2Var = (v2) objY;
        if (v2Var instanceof v2.b) {
            return (ps.r) ((v2.b) v2Var).f47386a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(g0 g0Var, String str, String str2, v13.c cVar) {
        b0 b0Var;
        g0Var.getClass();
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f120246c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f120246c = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(g0Var, cVar);
            }
        } else {
            b0Var = new b0(g0Var, cVar);
        }
        Object objY = b0Var.f120244a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f120246c;
        if (i15 == 0) {
            o13.r.b(objY);
            pc0.j jVar = g0Var.f120274b;
            str.getClass();
            str2.getClass();
            c2 c2Var = new c2(new pc0.o(jVar, str, str2, null));
            b0Var.f120246c = 1;
            objY = r53.s.y(c2Var, b0Var);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        v2 v2Var = (v2) objY;
        if (v2Var instanceof v2.b) {
            return new nr.v((List) ((v2.b) v2Var).f47386a, null, null, null, 14, null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(long j8, ps.p pVar, v13.c cVar) {
        a0 a0Var;
        ps.p pVar2;
        x1 x1Var;
        Object next;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f120238d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f120238d = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objY = a0Var.f120236b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f120238d;
        ArrayList arrayList = null;
        if (i15 == 0) {
            o13.r.b(objY);
            c2 c2Var = new c2(new am.b0(this.f120273a, j8, null));
            x53.c cVar2 = o53.s0.f129406a;
            r53.i iVarA = r53.s.A(c2Var, x53.b.f189152a);
            a0Var.f120235a = pVar;
            a0Var.f120238d = 1;
            objY = r53.s.y(iVarA, a0Var);
            if (objY == aVar) {
                return aVar;
            }
            pVar2 = pVar;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ps.p pVar3 = a0Var.f120235a;
            o13.r.b(objY);
            pVar2 = pVar3;
        }
        v2 v2Var = (v2) objY;
        if (!(v2Var instanceof v2.b)) {
            return null;
        }
        y1 y1Var = (y1) ((v2.b) v2Var).f47386a;
        List<x1> listD = y1Var.d();
        List listN0 = listD != null ? p13.h0.N0(listD, new a61.c(new ml0.a(5), 11)) : null;
        if (pVar2.g() == null) {
            long activityId = y1Var.getActivityId();
            if (listN0 != null) {
                ArrayList arrayList2 = new ArrayList(p13.y.r(listN0, 10));
                Iterator it = listN0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ss.m.a((x1) it.next()));
                }
                arrayList = new ArrayList(arrayList2);
            }
            return ps.p.b(pVar2, activityId, null, arrayList, listN0, 10);
        }
        List<x0> listG = pVar2.g();
        ArrayList<x0> arrayList3 = listG != null ? new ArrayList(listG) : null;
        if (arrayList3 != null) {
            for (x0 x0Var : arrayList3) {
                if (x0Var.S0() == null) {
                    if (listN0 != null) {
                        Iterator it3 = listN0.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            List<Integer> listP0 = ((x1) next).p0();
                            if (listP0 != null && listP0.contains(new Integer(x0Var.getLapIndex() - 1))) {
                                break;
                            }
                        }
                        x1Var = (x1) next;
                    } else {
                        x1Var = null;
                    }
                    if (x1Var != null) {
                        arrayList3.set(x0Var.getLapIndex() - 1, x0.b(x0Var, null, x1Var.getInternalType(), -1, 524271));
                    }
                }
            }
        }
        return ps.p.b(pVar2, y1Var.getActivityId(), null, arrayList3, listN0, 10);
    }
}
