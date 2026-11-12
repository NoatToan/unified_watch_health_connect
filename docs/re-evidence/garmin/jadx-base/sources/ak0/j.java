package ak0;

import am.e1;
import android.content.Context;
import android.content.Intent;
import b21.s8;
import b21.v4;
import b82.y0;
import c2.c1;
import c2.k3;
import c2.l2;
import c2.n3;
import c2.o3;
import c2.q3;
import c2.t2;
import c2.x2;
import c22.c3;
import ca0.j1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.consent.ConsentActivity;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import et1.l1;
import ew1.r1;
import f5.z0;
import g02.q0;
import i3.fe;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.k2;
import l72.n0;
import l72.p2;
import lc.m0;
import lc.u0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.b2;
import s5.x0;
import u21.o0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3641f;

    public /* synthetic */ j(Context context, String str, String str2, String str3, String str4) {
        this.f3636a = 25;
        this.f3639d = str;
        this.f3637b = str2;
        this.f3640e = str3;
        this.f3641f = str4;
        this.f3638c = context;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        gv0.d dVar;
        gv0.d dVar2 = (gv0.d) this.f3639d;
        e23.a aVar = (e23.a) this.f3641f;
        sc.f fVar = (sc.f) this.f3638c;
        e23.a aVar2 = (e23.a) this.f3637b;
        e23.a aVar3 = (e23.a) this.f3640e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bv0.a.t) obj).getClass();
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = mVar.r(fVar) | mVar.r(dVar2);
            Object objQ = mVar.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                objQ = new bv0.l(fVar, dVar2, i14);
                mVar.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new bv0.l(fVar, dVar2, i14);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = mVar.r(fVar);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new bv0.m(fVar, 0);
                mVar.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new bv0.m(fVar, 0);
                    mVar.K(objQ2);
                }
            }
            e23.p pVar = (e23.p) objQ2;
            boolean zR3 = mVar.r(fVar);
            Object objQ3 = mVar.q();
            if (zR3) {
                objQ3 = new bv0.k(fVar, 2);
                mVar.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new bv0.k(fVar, 2);
                    mVar.K(objQ3);
                }
            }
            e23.l lVar2 = (e23.l) objQ3;
            boolean zR4 = mVar.r(fVar) | mVar.B(aVar2) | mVar.r(dVar2) | mVar.B(aVar3);
            Object objQ4 = mVar.q();
            if (zR4) {
                dVar = dVar2;
                bv0.c cVar = new bv0.c(fVar, aVar2, dVar, aVar3, 3);
                mVar.K(cVar);
                objQ4 = cVar;
            } else {
                aVar4.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    dVar = dVar2;
                    bv0.c cVar2 = new bv0.c(fVar, aVar2, dVar, aVar3, 3);
                    mVar.K(cVar2);
                    objQ4 = cVar2;
                } else {
                    dVar = dVar2;
                }
            }
            iv0.y.b(dVar, aVar, lVar, pVar, lVar2, (e23.a) objQ4, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0108  */
    private final Object b(Object obj, Object obj2, Object obj3) {
        List list = (List) this.f3639d;
        m00.a aVar = (m00.a) this.f3638c;
        yo1.f fVar = (yo1.f) this.f3637b;
        n1 n1Var = (n1) this.f3640e;
        p1 p1Var = (p1) this.f3641f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            int i14 = k3.f22728a;
            float f22739d = n3.c(q3.a(mVar), mVar).getF22739d();
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar2, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarE, 0.0f, j92.b.f97899b.f97920e, 0.0f, f22739d, 5);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            h4.r rVarA = c2.b0.f22601a.a(aVar2, 1.0f, true);
            g6.f.a aVar4 = g6.f.f75994b;
            l2 l2VarB = c2.l.b(16, 0);
            boolean zR = mVar.r(list) | mVar.r(aVar) | mVar.r(fVar);
            Object objQ = mVar.q();
            if (zR) {
                e1 e1Var = new e1(list, aVar, fVar, n1Var, p1Var, 10);
                mVar.K(e1Var);
                objQ = e1Var;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    e1 e1Var2 = new e1(list, aVar, fVar, n1Var, p1Var, 10);
                    mVar.K(e1Var2);
                    objQ = e1Var2;
                }
            }
            e2.c.b(rVarA, null, l2VarB, null, null, null, false, null, (e23.l) objQ, mVar, 384, 506);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f3639d;
        String str2 = (String) this.f3638c;
        String str3 = (String) this.f3637b;
        String str4 = (String) this.f3640e;
        List list = (List) this.f3641f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarH = c2.l.H(x2.f(aVar, 1.0f), k2.f91249a, new o3(4));
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarH, 0.0f, eVar.f97923h, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            c2.l.f(x2.h(aVar, eVar.f97923h), mVar);
            cq0.t.a(str, str2, str3, str4, list, mVar, 0);
            c2.l.f(x2.h(aVar, eVar.f97922g), mVar);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01f8  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String strK0;
        String str = (String) this.f3639d;
        List<d62.i> list = (List) this.f3638c;
        WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity = (WorkoutActivityProfileSelectionActivity) this.f3637b;
        d62.i iVar = (d62.i) this.f3640e;
        e23.l lVar = (e23.l) this.f3641f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            if (str == null) {
                str = "";
            }
            String strP = gl1.y.P(R.string.compatible_activities_for_workout, new Object[]{str}, mVar);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            mh.c(strP, c2.l.C(c2.l.A(aVar, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97921f, 0.0f, eVar.f97920e, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
            mVar.C(192100012);
            for (d62.i iVar2 : list) {
                d62.j jVar = iVar2.f58016a;
                String strB = d62.k.b(jVar, mVar);
                List<d62.j> list2 = iVar2.f58017b;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : list2) {
                        if (((d62.j) obj4) != jVar) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    mVar.C(-1779580589);
                    mVar.f();
                    arrayList2 = null;
                } else {
                    mVar.C(-1779580588);
                    ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(d62.k.b((d62.j) it.next(), mVar));
                    }
                    mVar.f();
                    arrayList2 = arrayList3;
                }
                p3.m.a aVar4 = p3.m.f135153a;
                if (arrayList2 == null) {
                    mVar.C(-1779502996);
                    mVar.f();
                    strK0 = null;
                } else {
                    mVar.C(-611592651);
                    Object objQ = mVar.q();
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new com.google.maps.android.compose.clustering.d(28);
                        mVar.K(objQ);
                    }
                    strK0 = h0.k0(arrayList2, null, null, null, (e23.l) objQ, 31);
                    mVar.f();
                }
                u4.d dVarA = d62.k.a(jVar);
                String str2 = strK0;
                boolean zEquals = iVar2.equals(iVar);
                boolean zB = mVar.B(lVar) | mVar.r(iVar2);
                Object objQ2 = mVar.q();
                if (zB) {
                    objQ2 = new j1(24, lVar, iVar2);
                    mVar.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new j1(24, lVar, iVar2);
                        mVar.K(objQ2);
                    }
                }
                workoutActivityProfileSelectionActivity.da(strB, str2, dVarA, zEquals, (e23.a) objQ2, mVar, com.garmin.android.apps.connectmobile.d.$stable << 15, 0);
            }
            mVar.f();
            mVar.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2, Object obj3) {
        pt1.n nVar = (pt1.n) this.f3639d;
        p1 p1Var = (p1) this.f3638c;
        e23.l lVar = (e23.l) this.f3637b;
        e23.p pVar = (e23.p) this.f3640e;
        e23.l lVar2 = (e23.l) this.f3641f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            if (((pt1.n) p1Var.getF182175a()) instanceof pt1.n.c) {
                mVar.C(378840951);
                pt1.n.c cVar = nVar instanceof pt1.n.c ? (pt1.n.c) nVar : null;
                if (cVar == null) {
                    mVar.C(378840950);
                    mVar.f();
                } else {
                    mVar.C(378840951);
                    long j8 = cVar.f140896b;
                    us1.c cVar2 = cVar.f140895a;
                    boolean z14 = cVar.f140897c;
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new e40.g(lVar, 14);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e40.g(lVar, 14);
                            mVar.K(objQ);
                        }
                    }
                    jt1.f.a(j8, cVar2, z14, (e23.a) objQ, pVar, lVar2, mVar, 0);
                    mVar.f();
                    Unit unit = Unit.INSTANCE;
                }
                mVar.f();
            } else {
                mVar.C(-819037319);
                h4.r.a aVar = h4.r.S;
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                h4.r rVarC = h4.k.c(aVar, mVar);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar2);
                } else {
                    mVar.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, mVar);
                b4.c(h5.g.a.f81809f, i2VarX, mVar);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar);
                c2.u uVar = c2.u.f22885a;
                mVar.y();
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    private final Object f(Object obj, Object obj2, Object obj3) {
        a5.a aVar = (a5.a) this.f3639d;
        pt1.a aVar2 = (pt1.a) this.f3638c;
        e23.l lVar = (e23.l) this.f3637b;
        e23.l lVar2 = (e23.l) this.f3640e;
        je2.b bVar = (je2.b) this.f3641f;
        c2.w wVar = (c2.w) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        wVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(wVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            float fG = wVar.g() * 0.5f;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarA = a5.f.a(x2.j(aVar3, 0.0f, fG, 1), aVar, null);
            i53.c<pt1.t> cVar = aVar2.f140800c;
            boolean zB = mVar.B(lVar2) | mVar.r(bVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new l1(lVar2, bVar, 0);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new l1(lVar2, bVar, 0);
                    mVar.K(objQ);
                }
            }
            zs1.j.a(rVarA, cVar, lVar, (e23.a) objQ, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f5  */
    private final Object g(Object obj, Object obj2, Object obj3) {
        e23.a aVar = (e23.a) this.f3641f;
        pt1.c cVar = (pt1.c) this.f3639d;
        e23.l lVar = (e23.l) this.f3638c;
        e23.l lVar2 = (e23.l) this.f3637b;
        e23.l lVar3 = (e23.l) this.f3640e;
        c2.w wVar = (c2.w) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        wVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(wVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            float fG = wVar.g() * 0.5f;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarE = u1.n.e(x2.f(x2.j(aVar2, 0.0f, fG, 1), 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(mVar, R.string.lbl_map_settings);
            boolean zB = mVar.B(aVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new e52.c(aVar, 23);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e52.c(aVar, 23);
                    mVar.K(objQ);
                }
            }
            ys1.b.a(null, strQ, (e23.a) objQ, mVar, 0, 1);
            h4.r rVarJ = x2.j(aVar2, 0.0f, wVar.g() * 0.5f, 1);
            pt1.d dVar = cVar.f140819d;
            rw0.o.a(rVarJ, dVar.f140830f, dVar.f140835k, dVar.f140836l, false, lVar, lVar2, lVar3, mVar, 24576, 96);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0083  */
    private final Object h(Object obj, Object obj2, Object obj3) {
        z3.e eVar;
        i53.c<jo.f> cVar = (i53.c) this.f3639d;
        jo.f fVar = (jo.f) this.f3637b;
        e23.l lVar = (e23.l) this.f3640e;
        Context context = (Context) this.f3638c;
        p1 p1Var = (p1) this.f3641f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            for (jo.f fVar2 : cVar) {
                if (p005kotlin.jvm.internal.s.g(fVar2, fVar)) {
                    fo.y.f72452a.getClass();
                    eVar = fo.y.f72454c;
                } else {
                    eVar = null;
                }
                z3.e eVar2 = eVar;
                z3.e eVarC = z3.f.c(-1846835684, new r1(18, fVar2, context), mVar);
                boolean zB = mVar.B(lVar) | mVar.B(fVar2);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new fk0.a(lVar, 2, fVar2, p1Var);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new fk0.a(lVar, 2, fVar2, p1Var);
                        mVar.K(objQ);
                    }
                }
                i3.u.b(eVarC, (e23.a) objQ, null, null, eVar2, false, null, null, mVar, 6, 492);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f3639d;
        d52.e eVar = (d52.e) this.f3638c;
        String str2 = (String) this.f3637b;
        String str3 = (String) this.f3640e;
        b92.a aVar = (b92.a) this.f3641f;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.x0 x0Var = l72.x0.f111346a;
            String strQ = gl1.y.Q(mVar, R.string.common_lbl_avg_daily);
            b92.a aVarD = eVar.d(str);
            int i14 = iIntValue & 14;
            int i15 = b92.a.f16960b;
            int i16 = i14 | (l72.x0.f111348c << 24);
            x0Var.a(i16, 60, aVarD, t2Var, null, null, str, strQ, null, null, mVar);
            x0Var.a(i16, 60, aVar, t2Var, null, null, str2, str3, null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    private final Object j(Object obj, Object obj2, Object obj3) {
        in.c cVar = (in.c) this.f3639d;
        l22.a aVar = (l22.a) this.f3638c;
        e23.l lVar = (e23.l) this.f3637b;
        p1 p1Var = (p1) this.f3640e;
        p1 p1Var2 = (p1) this.f3641f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            List<in.e> list = cVar != null ? cVar.f94402j : null;
            if (list == null) {
                mVar.C(82417422);
                mVar.f();
            } else {
                mVar.C(82417423);
                for (in.e eVar : list) {
                    eVar.getClass();
                    c3 c3Var = eVar.f94413b;
                    String strA = c3Var != null ? dh.b.A(aVar.f109162a, c3Var) : aVar.getString(eVar.f94412a);
                    boolean zK = mVar.k(eVar.ordinal()) | mVar.r(cVar) | mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zK) {
                        v4 v4Var = new v4(eVar, cVar, lVar, p1Var, p1Var2, 8);
                        mVar.K(v4Var);
                        objQ = v4Var;
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            v4 v4Var2 = new v4(eVar, cVar, lVar, p1Var, p1Var2, 8);
                            mVar.K(v4Var2);
                            objQ = v4Var2;
                        }
                    }
                    gp.l.d(0, (e23.a) objQ, strA, mVar);
                }
                mVar.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        i53.c cVar = (i53.c) this.f3639d;
        b63.o oVar = (b63.o) this.f3638c;
        pv0.q qVar = (pv0.q) this.f3637b;
        e23.l lVar = (e23.l) this.f3640e;
        p1 p1Var = (p1) this.f3641f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            i53.c cVar2 = (i53.c) p1Var.getF182175a();
            Iterable iterable = qVar.f141406b;
            if (iterable == null) {
                iterable = j0.f134944a;
            }
            i53.c cVarE = i53.a.e(iterable);
            int i14 = pv0.h.f141372i;
            int i15 = i14 | (i14 << 3);
            pv0.l.Companion companion = pv0.l.INSTANCE;
            gw0.j.d(cVar, cVar2, oVar, cVarE, lVar, mVar, i15);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0250  */
    private final Object l(Object obj, Object obj2, Object obj3) {
        h4.r.a aVar;
        Integer num;
        c2.b0 b0Var;
        int i14;
        ArrayList arrayList;
        e23.l lVar;
        Object next;
        String string;
        pv0.a aVar2 = (pv0.a) this.f3639d;
        List list = (List) this.f3638c;
        Long l14 = (Long) this.f3637b;
        Long l15 = (Long) this.f3640e;
        e23.l lVar2 = (e23.l) this.f3641f;
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarF, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var2 = c2.b0.f22601a;
            if (aVar2 != null) {
                mVar.C(-778265752);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                zv0.d dVar = zv0.d.f207169a;
                l22.a aVarS = w2.a0.s(mVar);
                dVar.getClass();
                int i15 = zv0.d.a.f207173d[aVar2.ordinal()];
                if (i15 == 1) {
                    string = aVarS.getString(R.string.lbl_positive_impact);
                } else if (i15 == 2) {
                    string = aVarS.getString(R.string.lbl_negative_impact);
                } else if (i15 == 3) {
                    string = aVarS.getString(R.string.lbl_minimal_impact);
                } else {
                    if (i15 != 4) {
                        u0.r();
                        return null;
                    }
                    string = aVarS.getString(R.string.lbl_not_enough_logged);
                }
                d92.b.f58624b.getClass();
                num = 5;
                aVar = aVar3;
                b0Var = b0Var2;
                mh.c(string, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar), mVar, 0, 0, 131068);
                mVar = mVar;
                mVar.f();
            } else {
                aVar = aVar3;
                num = 5;
                b0Var = b0Var2;
                mVar.C(-777943259);
                mVar.f();
            }
            h4.r rVarF2 = x2.f(aVar, 0.5f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(b0Var.b(x2.h(rVarF2, j92.b.f97899b.f97920e), h4.d.a.f81537o).then(rVar), mVar);
            if (list != null) {
                arrayList = new ArrayList(list);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    pv0.c cVar = (pv0.c) next;
                    long j8 = cVar.f141352a;
                    if (l14 != 0 && j8 == l14.longValue()) {
                        break;
                    }
                    long j14 = cVar.f141352a;
                    if (l15 != null && j14 == l15.longValue()) {
                        break;
                    }
                }
                pv0.c cVar2 = (pv0.c) next;
                if (cVar2 != null) {
                    arrayList.remove(cVar2);
                    i14 = 0;
                    arrayList.add(0, cVar2);
                } else {
                    i14 = 0;
                }
            } else {
                i14 = 0;
                arrayList = null;
            }
            if (arrayList == null) {
                mVar.C(-777500487);
                mVar.f();
            } else {
                mVar.C(-777500486);
                int i16 = i14;
                for (Object obj4 : arrayList) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    pv0.c cVar3 = (pv0.c) obj4;
                    if (lVar2 == null) {
                        mVar.C(644382849);
                        mVar.f();
                        lVar = null;
                    } else {
                        mVar.C(644382850);
                        boolean zB = mVar.B(lVar2);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new fb0.d(lVar2, 6);
                            mVar.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new fb0.d(lVar2, 6);
                                mVar.K(objQ);
                            }
                        }
                        mVar.f();
                        lVar = (e23.l) objQ;
                    }
                    pv0.c.Companion companion = pv0.c.INSTANCE;
                    gw0.g0.f(cVar3, l14, l15, lVar, mVar, 0);
                    i16 = i17;
                }
                mVar.f();
            }
            if (aVar2 == pv0.a.UNLOGGED) {
                mVar.C(-776978942);
                Integer num2 = num;
                String strP = gl1.y.P(R.string.msg_not_enough_logged, new Object[]{num2, num2}, mVar);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                p3.m mVar2 = mVar;
                mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar2, 0, 0, 131070);
                mVar = mVar2;
                mVar.f();
            } else {
                mVar.C(-776730043);
                mVar.f();
            }
            mVar.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00af  */
    /* JADX WARN: Code duplicated, block: B:22:0x00da  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj, Object obj2, Object obj3) {
        String strP;
        CustomCombinedChart customCombinedChart = (CustomCombinedChart) this.f3639d;
        DateTime dateTime = (DateTime) this.f3638c;
        DateTime dateTime2 = (DateTime) this.f3637b;
        u82.f fVar = (u82.f) this.f3640e;
        p1 p1Var = (p1) this.f3641f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(64237929);
                mVar.f();
                strP = null;
            } else {
                mVar.C(833356585);
                strP = gl1.y.P(R.string.common_no_certain_data, new Object[]{gl1.y.Q(mVar, R.string.ohrv_status)}, mVar);
                mVar.f();
            }
            String str = strP;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 350);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarH, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            boolean zR = mVar.r(customCombinedChart);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new hn1.j(customCombinedChart, 0);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new hn1.j(customCombinedChart, 0);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = mVar.r(dateTime) | mVar.r(dateTime2) | mVar.r(fVar) | mVar.B(str);
            Object objQ2 = mVar.q();
            if (zR2) {
                hn1.k kVar = new hn1.k(dateTime, dateTime2, fVar, str, 0);
                mVar.K(kVar);
                objQ2 = kVar;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    hn1.k kVar2 = new hn1.k(dateTime, dateTime2, fVar, str, 0);
                    mVar.K(kVar2);
                    objQ2 = kVar2;
                }
            }
            p002j6.c.b(lVar, rVarC, (e23.l) objQ2, mVar, 0, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f3639d;
        String str2 = (String) this.f3637b;
        String str3 = (String) this.f3640e;
        String str4 = (String) this.f3641f;
        Context context = (Context) this.f3638c;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.x0 x0Var = l72.x0.f111346a;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new ha0.b(22);
                mVar.K(objQ);
            }
            String strA = oi0.c.A(context, (e23.l) objQ, str3);
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new ha0.b(23);
                mVar.K(objQ2);
            }
            c0235a.f16962a.put("merge", j20.x.d(str4, StringUtils.SPACE, strA, StringUtils.SPACE, oi0.c.A(context, (e23.l) objQ2, str2)));
            b92.a aVarB = c0235a.b();
            int i14 = iIntValue & 14;
            int i15 = b92.a.f16960b;
            int i16 = l72.x0.f111348c;
            x0Var.a((i16 << 24) | i14, 52, aVarB, t2Var, null, null, str, str2, str3, null, mVar);
            x0Var.h(t2Var, mVar, i14 | (i16 << 3));
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009d  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object q(Object obj, Object obj2, Object obj3) {
        String strH;
        CustomBarChart customBarChart = (CustomBarChart) this.f3639d;
        DateTime dateTime = (DateTime) this.f3638c;
        DateTime dateTime2 = (DateTime) this.f3637b;
        u82.f fVar = (u82.f) this.f3640e;
        p1 p1Var = (p1) this.f3641f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(-931850847);
                mVar.f();
                strH = null;
            } else {
                strH = sn.a.h(mVar, 801224655, R.string.msg_no_sleep_duration_data, mVar);
            }
            String str = strH;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 350);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarH, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            boolean zR = mVar.r(customBarChart);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new di0.c(customBarChart, 4);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new di0.c(customBarChart, 4);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = mVar.r(dateTime) | mVar.r(dateTime2) | mVar.r(fVar) | mVar.B(str);
            Object objQ2 = mVar.q();
            if (zR2) {
                hn1.k kVar = new hn1.k(dateTime, dateTime2, fVar, str, 1);
                mVar.K(kVar);
                objQ2 = kVar;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    hn1.k kVar2 = new hn1.k(dateTime, dateTime2, fVar, str, 1);
                    mVar.K(kVar2);
                    objQ2 = kVar2;
                }
            }
            p002j6.c.b(lVar, rVarC, (e23.l) objQ2, mVar, 0, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e4  */
    private final Object r(Object obj, Object obj2, Object obj3) {
        p3.m mVar;
        ho.y yVar = (ho.y) this.f3639d;
        Context context = (Context) this.f3638c;
        e23.q qVar = (e23.q) this.f3637b;
        e23.p pVar = (e23.p) this.f3640e;
        e23.p pVar2 = (e23.p) this.f3641f;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        int i14 = 0;
        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar, j92.b.f97899b.f97918c), mVar2);
            for (jo.c cVar : yVar.f84690a) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                jo.c cVar2 = cVar;
                String strB = cVar2.b(context);
                if (cVar2 instanceof jo.c.a) {
                    mVar2.C(-744043787);
                    ho.w.b(strB, cVar2.c(context), z3.f.c(-503235025, new q0(cVar2, qVar, i14, pVar, pVar2), mVar2), mVar2, 384);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar2, j92.b.f97899b.f97918c), mVar2);
                    mVar2.f();
                    mVar = mVar2;
                } else {
                    if (!(cVar2 instanceof jo.c.AbstractC1918c)) {
                        throw n23.j.m(mVar2, 1638565396);
                    }
                    mVar2.C(-743215808);
                    p2 p2Var = p2.f111205a;
                    z3.e eVarC = z3.f.c(-660412298, new fp0.l(cVar2, 12), mVar2);
                    boolean zB = mVar2.B(cVar2) | mVar2.B(qVar) | mVar2.k(i14);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new a83.a(cVar2, qVar, i14, 7);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a83.a(cVar2, qVar, i14, 7);
                            mVar2.K(objQ);
                        }
                    }
                    p3.m mVar3 = mVar2;
                    p2Var.g(strB, null, null, null, eVarC, false, false, (e23.a) objQ, mVar3, 24576, 238);
                    mVar = mVar3;
                    mVar.f();
                }
                mVar2 = mVar;
                i14 = i15;
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        h4.r rVar = (h4.r) this.f3639d;
        pt1.l lVar = (pt1.l) this.f3638c;
        e23.l lVar2 = (e23.l) this.f3637b;
        e23.p pVar = (e23.p) this.f3640e;
        e23.l lVar3 = (e23.l) this.f3641f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            ht1.w.g(rVar, lVar.f140886m, lVar2, pVar, lVar3, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0227  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:134:0x030f  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:211:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:216:0x0515  */
    /* JADX WARN: Code duplicated, block: B:221:0x0535  */
    /* JADX WARN: Code duplicated, block: B:226:0x0556  */
    /* JADX WARN: Code duplicated, block: B:231:0x0577  */
    /* JADX WARN: Code duplicated, block: B:258:0x0692  */
    /* JADX WARN: Code duplicated, block: B:263:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:268:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:273:0x0729  */
    /* JADX WARN: Code duplicated, block: B:325:0x09ec  */
    /* JADX WARN: Code duplicated, block: B:345:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:350:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:355:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:393:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:417:0x0c5b  */
    /* JADX WARN: Code duplicated, block: B:422:0x0c85  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bk0.d dVar;
        Context context;
        Intent intentA;
        c.q qVar;
        q92.x xVar;
        e23.a aVar;
        Object obj4;
        gv0.d dVar2;
        int i14 = this.f3636a;
        int i15 = 9;
        bk0.f fVar = null;
        p3.m.a aVar2 = p3.m.f135153a;
        int i16 = 6;
        Object obj5 = this.f3639d;
        Object obj6 = this.f3641f;
        Object obj7 = this.f3640e;
        int i17 = 3;
        Object obj8 = this.f3637b;
        Object obj9 = this.f3638c;
        int i18 = 0;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a aVar3 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.a) obj5;
                final Context context2 = (Context) obj9;
                final a aVar4 = (a) obj8;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj7;
                e23.a aVar5 = (e23.a) obj6;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean z14 = aVar3.f35379b;
                    boolean z15 = aVar3.f35380c && z6.a0.a(context2).f202582b.areNotificationsEnabled();
                    boolean z16 = aVar3.f35381d;
                    boolean zR = mVar.r(aVar4) | mVar.r(context2);
                    Object objQ = mVar.q();
                    if (zR) {
                        final int i19 = 1;
                        objQ = new e23.a() { // from class: ak0.l
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        aVar4.p(context2);
                                        break;
                                    default:
                                        aVar4.p(context2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i110 = 1;
                            objQ = new e23.a() { // from class: ak0.l
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i110) {
                                        case 0:
                                            aVar4.p(context2);
                                            break;
                                        default:
                                            aVar4.p(context2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar6 = (e23.a) objQ;
                    c80.q qVar2 = eVar.f35417k;
                    boolean zR2 = mVar.r(eVar) | mVar.B(aVar5) | mVar.B(aVar3);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new m(eVar, false ? 1 : 0, aVar5, aVar3);
                        mVar.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new m(eVar, false ? 1 : 0, aVar5, aVar3);
                            mVar.K(objQ2);
                        }
                    }
                    dk0.e.a(z14, z15, z16, aVar6, aVar4, qVar2, (e23.a) objQ2, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                g3 g3Var = (g3) obj5;
                b.u uVar = (b.u) obj7;
                a aVar7 = (a) obj8;
                Context context3 = (Context) obj9;
                o53.b0 b0Var = (o53.b0) obj6;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.g gVar = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.g) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(gVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    T t7 = g3Var.f35301b;
                    com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c cVar = t7 instanceof com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c ? (com.garmin.android.apps.connectmobile.gcplus.presentation.home.i.c) t7 : null;
                    if (cVar != null && (dVar = cVar.f35483c) != null) {
                        for (bk0.f fVar2 : dVar.f18476d) {
                            if (fVar2.f18478a == gVar.f35394b) {
                                fVar = fVar2;
                                fVar = fVar;
                            }
                        }
                        fVar = fVar;
                    }
                    if (fVar != null) {
                        mVar2.C(1787773145);
                        String str = fVar.f18479b;
                        boolean zR3 = mVar2.r(uVar);
                        Object objQ3 = mVar2.q();
                        if (zR3) {
                            objQ3 = new i(uVar, 0);
                            mVar2.K(objQ3);
                        } else {
                            aVar2.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new i(uVar, 0);
                                mVar2.K(objQ3);
                            }
                        }
                        com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.b(str, null, false, false, (e23.a) objQ3, null, z3.f.c(-1088031524, new a42.y(fVar, aVar7, context3, b0Var, 2), mVar2), mVar2, 1572912, 44);
                        mVar2.f();
                    } else {
                        mVar2.C(1790236188);
                        mVar2.f();
                    }
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                i53.c cVar2 = (i53.c) obj5;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar2 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj7;
                final a aVar8 = (a) obj8;
                final Context context4 = (Context) obj9;
                sc.f fVar3 = (sc.f) obj6;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    b2 b2Var = eVar2.A;
                    boolean zR4 = mVar3.r(eVar2);
                    Object objQ4 = mVar3.q();
                    if (zR4) {
                        objQ4 = new a03.e(eVar2, 10);
                        mVar3.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new a03.e(eVar2, 10);
                            mVar3.K(objQ4);
                        }
                    }
                    e23.a aVar9 = (e23.a) objQ4;
                    boolean zR5 = mVar3.r(aVar8) | mVar3.r(context4);
                    Object objQ5 = mVar3.q();
                    if (zR5) {
                        final int i24 = false ? 1 : 0;
                        objQ5 = new e23.a() { // from class: ak0.l
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i24) {
                                    case 0:
                                        aVar8.p(context4);
                                        break;
                                    default:
                                        aVar8.p(context4);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            final int i25 = false ? 1 : 0;
                            objQ5 = new e23.a() { // from class: ak0.l
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            aVar8.p(context4);
                                            break;
                                        default:
                                            aVar8.p(context4);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ5);
                        }
                    }
                    e23.a aVar10 = (e23.a) objQ5;
                    boolean zR6 = mVar3.r(fVar3) | mVar3.r(eVar2);
                    Object objQ6 = mVar3.q();
                    if (zR6) {
                        objQ6 = new a42.i(5, fVar3, eVar2);
                        mVar3.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new a42.i(5, fVar3, eVar2);
                            mVar3.K(objQ6);
                        }
                    }
                    ck0.u.b(cVar2, b2Var, aVar9, aVar10, (e23.l) objQ6, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                Context context5 = (Context) obj9;
                p1 p1Var = (p1) obj5;
                com.garmin.android.apps.connectmobile.startup.b bVar = (com.garmin.android.apps.connectmobile.startup.b) obj8;
                c.q qVar3 = (c.q) obj7;
                p1 p1Var2 = (p1) obj6;
                c2.a0 a0Var = (c2.a0) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.startup.b.a aVar11 = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                a0Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(a0Var) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar12 = h4.r.S;
                    g6.f.a aVar13 = g6.f.f75994b;
                    h4.r rVarF = x2.f(x2.h(aVar12, 300), 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar4.getU());
                    i2 i2VarX = mVar4.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar14);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar4);
                    c2.u uVar2 = c2.u.f22885a;
                    wf.f.a aVar15 = new wf.f.a(context5);
                    aVar15.f184930c = 2131230997;
                    wf.g.a(aVar15);
                    wf.f fVarA = aVar15.a();
                    f5.k.f68985a.getClass();
                    f5.k.a.C1427a c1427a = f5.k.a.f68987b;
                    h4.g gVar2 = h4.d.a.f81528f;
                    d92.b.f58623a.getClass();
                    jf.r.b(fVarA, null, x2.d(aVar12, 1.0f), new t4.c(d92.b.a(mVar4).c().g(), null), new t4.c(d92.b.a(mVar4).c().g(), null), null, null, null, null, gVar2, c1427a, null, mVar4, 805306800, 6, 31200);
                    h4.r rVarC2 = uVar2.c(x2.h(x2.f(aVar12, 1.0f), 50), h4.d.a.f81531i);
                    o4.w.a aVar16 = o4.w.f129023a;
                    o4.d0.f128823b.getClass();
                    c2.q.a(u1.n.d(rVarC2, o4.w.a.i(aVar16, p13.x.k(o4.d0.a(o4.d0.f128831j), o4.d0.a(d92.b.a(mVar4).c().c())), 0.0f, 14), null, 6), mVar4, 0);
                    mVar4.y();
                    String strQ = gl1.y.Q(mVar4, R.string.lbl_you_now_manage_your_own_account);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97930g, mVar4);
                    d6.h.f57752b.getClass();
                    int i26 = d6.h.f57755e;
                    h4.g.a aVar17 = h4.d.a.f81537o;
                    h4.r rVarA = c2.l.A(a0Var.b(aVar12, aVar17), 76, 0.0f, 2);
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    mh.c(strQ, c2.l.C(rVarA, 0.0f, eVar3.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i26), 0L, 0, false, 0, 0, null, x0VarB, mVar4, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar4, R.string.msg_following_permissions_previously_provided), c2.l.C(c2.l.A(a0Var.b(aVar12, aVar17), eVar3.f97920e, 0.0f, 2), 0.0f, eVar3.f97919d, 0.0f, eVar3.f97920e, 5), 0L, null, 0L, null, 0L, d6.h.a(i26), 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar4), mVar4, 0, 0, 130044);
                    mVar4.C(-1796291236);
                    for (q92.x xVar2 : ((aq1.e) p1Var.getF182175a()).f12364a) {
                        bVar.getClass();
                        switch (com.garmin.android.apps.connectmobile.startup.b.c.f44804a[xVar2.ordinal()]) {
                            case 2:
                                context = context5;
                                intentA = DataStorageConsentActivity.a.a(DataStorageConsentActivity.f32194t, context, null, 60);
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 7:
                                context = context5;
                                intentA = ConsentActivity.a.b(ConsentActivity.f32155r, context, xVar2, false, null, 24);
                                break;
                            case 6:
                                intentA = ProductImprovementConsentActivity.a.a(ProductImprovementConsentActivity.f32230h, context5, null, 6);
                                context = context5;
                                break;
                            default:
                                context = context5;
                                intentA = null;
                                break;
                        }
                        if (intentA != null) {
                            intentA.putExtra("extra_launched_from_graduation", true);
                        } else {
                            intentA = null;
                        }
                        if (intentA == null) {
                            mVar4.C(493997825);
                            mVar4.f();
                            aVar = null;
                            qVar = qVar3;
                            xVar = xVar2;
                        } else {
                            mVar4.C(493997826);
                            boolean zK = mVar4.k(xVar2.ordinal()) | mVar4.r(qVar3) | mVar4.r(intentA);
                            Object objQ7 = mVar4.q();
                            if (zK) {
                                qVar = qVar3;
                                objQ7 = new af0.e((Object) xVar2, (Object) qVar, (Object) intentA, (Object) p1Var2, 2);
                                xVar = xVar2;
                                mVar4.K(objQ7);
                            } else {
                                aVar2.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    qVar = qVar3;
                                    objQ7 = new af0.e((Object) xVar2, (Object) qVar, (Object) intentA, (Object) p1Var2, 2);
                                    xVar = xVar2;
                                    mVar4.K(objQ7);
                                } else {
                                    qVar = qVar3;
                                    xVar = xVar2;
                                }
                            }
                            aVar = (e23.a) objQ7;
                            mVar4.f();
                        }
                        bVar.u6(xVar, aVar, mVar4, 0);
                        context5 = context;
                        qVar3 = qVar;
                    }
                    mVar4.f();
                    String strQ2 = gl1.y.Q(mVar4, R.string.msg_you_can_manage_these_permissions);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97935l, mVar4);
                    h4.r.a aVar18 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    mh.c(strQ2, c2.l.C(c2.l.A(aVar18, eVar4.f97920e, 0.0f, 2), 0.0f, eVar4.f97919d, 0.0f, eVar4.f97921f, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar4, 0, 0, 131068);
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                e23.a aVar19 = (e23.a) obj6;
                bt.a aVar20 = (bt.a) obj5;
                e23.a aVar21 = (e23.a) obj9;
                e23.a aVar22 = (e23.a) obj8;
                o13.p pVar = (o13.p) obj7;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar23 = h4.r.S;
                    h4.r rVarS = c2.l.s(u1.n.e(aVar23, vb.h.e(d92.b.f58623a, mVar5), m1.f128891a));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode2 = Long.hashCode(mVar5.getU());
                    i2 i2VarX2 = mVar5.x();
                    h4.r rVarC3 = h4.k.c(rVarS, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar24 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar24);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar5);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    d92.b.f58625c.getClass();
                    j92.e eVar5 = j92.b.f97899b;
                    float f14 = eVar5.f97920e;
                    float f15 = eVar5.f97918c;
                    x0Var.e(c2.l.y(aVar23, f14), z3.f.c(1487894476, new at.d(false ? 1 : 0, pVar), mVar5), mVar5, (l72.x0.f111348c << 6) | 48, 0);
                    l72.f0 f0Var = l72.f0.f110999a;
                    String strQ3 = gl1.y.Q(mVar5, R.string.lbl_save);
                    h4.r rVarF2 = x2.f(c2.l.z(aVar23, f14, f15), 1.0f);
                    boolean zB = mVar5.B(aVar19);
                    Object objQ8 = mVar5.q();
                    if (zB) {
                        objQ8 = new as.n(aVar19, 3);
                        mVar5.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new as.n(aVar19, 3);
                            mVar5.K(objQ8);
                        }
                    }
                    f0Var.d(0, 9, (e23.a) objQ8, rVarF2, strQ3, mVar5, null, false);
                    String strQ4 = gl1.y.Q(mVar5, R.string.lbl_resume);
                    h4.r rVarF3 = x2.f(c2.l.z(aVar23, f14, f15), 1.0f);
                    boolean zR7 = mVar5.r(aVar20);
                    Object objQ9 = mVar5.q();
                    if (zR7) {
                        objQ9 = new a03.f(aVar20, 20);
                        mVar5.K(objQ9);
                    } else {
                        aVar2.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new a03.f(aVar20, 20);
                            mVar5.K(objQ9);
                        }
                    }
                    h4.r rVarB = p5.v.b(rVarF3, (e23.l) objQ9);
                    boolean zB2 = mVar5.B(aVar21);
                    Object objQ10 = mVar5.q();
                    if (zB2) {
                        objQ10 = new as.n(aVar21, 4);
                        mVar5.K(objQ10);
                    } else {
                        aVar2.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new as.n(aVar21, 4);
                            mVar5.K(objQ10);
                        }
                    }
                    f0Var.i(strQ4, rVarB, false, (e23.a) objQ10, mVar5, 0, 4);
                    String strQ5 = gl1.y.Q(mVar5, R.string.lbl_discard);
                    h4.r rVarF4 = x2.f(c2.l.z(aVar23, f14, f15), 1.0f);
                    boolean zB3 = mVar5.B(aVar22);
                    Object objQ11 = mVar5.q();
                    if (zB3) {
                        objQ11 = new as.n(aVar22, 5);
                        mVar5.K(objQ11);
                    } else {
                        aVar2.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new as.n(aVar22, 5);
                            mVar5.K(objQ11);
                        }
                    }
                    f0Var.b(strQ5, rVarF4, false, (e23.a) objQ11, mVar5, 0, 4);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                s21.s sVar = (s21.s) obj5;
                v21.e eVar6 = (v21.e) obj9;
                o0 o0Var = (o0) obj8;
                m0 m0Var = (m0) obj7;
                p1 p1Var3 = (p1) obj6;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    s21.x xVar3 = (s21.x) p1Var3.getF182175a();
                    boolean zR8 = mVar6.r(o0Var);
                    Object objQ12 = mVar6.q();
                    if (zR8) {
                        objQ12 = new a03.f(o0Var, 29);
                        mVar6.K(objQ12);
                    } else {
                        aVar2.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new a03.f(o0Var, 29);
                            mVar6.K(objQ12);
                        }
                    }
                    e23.l lVar = (e23.l) objQ12;
                    boolean zR9 = mVar6.r(m0Var) | mVar6.B(p1Var3);
                    Object objQ13 = mVar6.q();
                    if (zR9) {
                        objQ13 = new s8(m0Var, p1Var3, 5);
                        mVar6.K(objQ13);
                    } else {
                        aVar2.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new s8(m0Var, p1Var3, 5);
                            mVar6.K(objQ13);
                        }
                    }
                    e23.a aVar25 = (e23.a) objQ13;
                    boolean zR10 = mVar6.r(m0Var) | mVar6.B(p1Var3);
                    Object objQ14 = mVar6.q();
                    if (zR10) {
                        objQ14 = new s8(m0Var, p1Var3, i16);
                        mVar6.K(objQ14);
                    } else {
                        aVar2.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new s8(m0Var, p1Var3, i16);
                            mVar6.K(objQ14);
                        }
                    }
                    e23.a aVar26 = (e23.a) objQ14;
                    boolean zR11 = mVar6.r(m0Var) | mVar6.B(p1Var3);
                    Object objQ15 = mVar6.q();
                    if (zR11) {
                        objQ15 = new s8(m0Var, p1Var3, 7);
                        mVar6.K(objQ15);
                    } else {
                        aVar2.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new s8(m0Var, p1Var3, 7);
                            mVar6.K(objQ15);
                        }
                    }
                    e23.a aVar27 = (e23.a) objQ15;
                    boolean zR12 = mVar6.r(m0Var) | mVar6.B(p1Var3);
                    Object objQ16 = mVar6.q();
                    if (zR12) {
                        objQ16 = new s8(m0Var, p1Var3, 1);
                        mVar6.K(objQ16);
                    } else {
                        aVar2.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new s8(m0Var, p1Var3, 1);
                            mVar6.K(objQ16);
                        }
                    }
                    e23.a aVar28 = (e23.a) objQ16;
                    boolean zB4 = mVar6.B(p1Var3) | mVar6.r(m0Var);
                    Object objQ17 = mVar6.q();
                    if (zB4) {
                        objQ17 = new s8(m0Var, p1Var3, i17);
                        mVar6.K(objQ17);
                    } else {
                        aVar2.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            objQ17 = new s8(m0Var, p1Var3, i17);
                            mVar6.K(objQ17);
                        }
                    }
                    t21.z0.b(sVar, xVar3, eVar6, lVar, aVar25, aVar26, aVar27, aVar28, (e23.a) objQ17, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                String str2 = (String) obj5;
                e23.p pVar2 = (e23.p) obj9;
                String str3 = (String) obj8;
                String str4 = (String) obj7;
                e23.p pVar3 = (e23.p) obj6;
                c2.a0 a0Var2 = (c2.a0) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                a0Var2.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(a0Var2) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    y0.b(str2, null, pVar2, mVar7, 0, 2);
                    y0.a(str3, str4, z3.f.c(1511650674, new a3.d(pVar3, 5), mVar7), mVar7, 384);
                    c2.l.f(a0Var2.a(h4.r.S, 1.0f, true), mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                u4.d dVar3 = (u4.d) obj9;
                String str5 = (String) obj8;
                String str6 = (String) obj7;
                e23.p pVar4 = (e23.p) obj6;
                c2.a0 a0Var3 = (c2.a0) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                a0Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(a0Var3) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    y0.b(this.f3639d, dVar3, null, mVar8, 0, 4);
                    y0.a(str5, str6, z3.f.c(-30300787, new a3.d(pVar4, 6), mVar8), mVar8, 384);
                    c2.l.f(a0Var3.a(h4.r.S, 1.0f, true), mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                String str7 = (String) obj5;
                o4.z0 z0Var = (o4.z0) obj9;
                String str8 = (String) obj8;
                o4.d0 d0Var = (o4.d0) obj7;
                Boolean bool = (Boolean) obj6;
                an1.e eVar7 = (an1.e) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                eVar7.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(eVar7) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    eVar7.a(str7, z0Var, mVar9, (iIntValue9 << 6) & 896);
                    if (str8 == null || d0Var == null || bool == null) {
                        mVar9.C(-1708206784);
                        mVar9.f();
                    } else {
                        mVar9.C(-1708442229);
                        eVar7.b(str8, bool.booleanValue() ? R.drawable.circle_white : R.drawable.circle_outline, d0Var, mVar9, (iIntValue9 << 9) & 7168);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                i53.c cVar3 = (i53.c) obj5;
                e23.a aVar29 = (e23.a) obj6;
                i53.c cVar4 = (i53.c) obj9;
                i53.c cVar5 = (i53.c) obj8;
                e23.l lVar2 = (e23.l) obj7;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var12 = p3.n.f135158a;
                    l72.j0 j0Var = new l72.j0(gl1.y.Q(mVar10, R.string.lbl_any), null, null, false, cVar3.isEmpty(), 14, null);
                    boolean zB5 = mVar10.B(aVar29);
                    Object objQ18 = mVar10.q();
                    if (zB5) {
                        obj4 = objQ18;
                        a03.h0 h0Var = new a03.h0(aVar29, i15);
                        mVar10.K(h0Var);
                        obj4 = h0Var;
                    } else {
                        aVar2.getClass();
                        if (objQ18 == p3.m.a.f135155b) {
                            obj4 = objQ18;
                            a03.h0 h0Var2 = new a03.h0(aVar29, i15);
                            mVar10.K(h0Var2);
                            obj4 = h0Var2;
                        }
                    }
                    obj4 = objQ18;
                    n0.a(null, j0Var, 0L, (e23.l) obj4, mVar10, 0, 5);
                    for (Object obj10 : cVar4) {
                        int i27 = i18 + 1;
                        if (i18 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        String str9 = (String) obj10;
                        l72.j0 j0Var2 = new l72.j0(str9, (String) ((i18 < 0 || i18 >= cVar5.size()) ? str9 : cVar5.get(i18)), null, false, cVar3.contains(str9), 12, null);
                        boolean zB6 = mVar10.B(lVar2) | mVar10.B(str9);
                        Object objQ19 = mVar10.q();
                        if (zB6) {
                            objQ19 = new au0.g(lVar2, str9, 2);
                            mVar10.K(objQ19);
                        } else {
                            aVar2.getClass();
                            if (objQ19 == p3.m.a.f135155b) {
                                objQ19 = new au0.g(lVar2, str9, 2);
                                mVar10.K(objQ19);
                            }
                        }
                        n0.a(null, j0Var2, 0L, (e23.l) objQ19, mVar10, 0, 5);
                        i18 = i27;
                    }
                    x1 x1Var13 = p3.n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                gv0.d dVar4 = (gv0.d) obj5;
                e23.l lVar3 = (e23.l) obj9;
                sc.f fVar4 = (sc.f) obj8;
                e23.a aVar30 = (e23.a) obj6;
                e23.a aVar31 = (e23.a) obj7;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((bv0.a.a0) obj).getClass();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var14 = p3.n.f135158a;
                    boolean zR13 = mVar11.r(fVar4) | mVar11.r(dVar4);
                    Object objQ20 = mVar11.q();
                    if (zR13) {
                        objQ20 = new bv0.p(fVar4, dVar4, false ? 1 : 0);
                        mVar11.K(objQ20);
                    } else {
                        aVar2.getClass();
                        if (objQ20 == p3.m.a.f135155b) {
                            objQ20 = new bv0.p(fVar4, dVar4, false ? 1 : 0);
                            mVar11.K(objQ20);
                        }
                    }
                    e23.a aVar32 = (e23.a) objQ20;
                    boolean zR14 = mVar11.r(fVar4) | mVar11.B(aVar30) | mVar11.r(dVar4) | mVar11.B(aVar31);
                    Object objQ21 = mVar11.q();
                    if (zR14) {
                        dVar2 = dVar4;
                        bv0.c cVar6 = new bv0.c(fVar4, aVar30, dVar2, aVar31, 10);
                        mVar11.K(cVar6);
                        objQ21 = cVar6;
                    } else {
                        aVar2.getClass();
                        if (objQ21 == p3.m.a.f135155b) {
                            dVar2 = dVar4;
                            bv0.c cVar7 = new bv0.c(fVar4, aVar30, dVar2, aVar31, 10);
                            mVar11.K(cVar7);
                            objQ21 = cVar7;
                        } else {
                            dVar2 = dVar4;
                        }
                    }
                    jv0.j.a(dVar2, lVar3, aVar32, (e23.a) objQ21, mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                return a(obj, obj2, obj3);
            case 12:
                return b(obj, obj2, obj3);
            case 13:
                return c(obj, obj2, obj3);
            case 14:
                return d(obj, obj2, obj3);
            case 15:
                gj0.a aVar33 = (gj0.a) obj5;
                yi0.b bVar4 = (yi0.b) obj9;
                gj0.d dVar5 = (gj0.d) obj8;
                e23.l lVar4 = (e23.l) obj7;
                e23.l lVar5 = (e23.l) obj6;
                Integer num = (Integer) obj;
                int iIntValue12 = num.intValue();
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar12.k(iIntValue12) ? 4 : 2;
                }
                if (mVar12.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var15 = p3.n.f135158a;
                    yi0.c cVar8 = (yi0.c) h0.e0(iIntValue12, h0.b1(aVar33.f77487a.keySet()));
                    if (cVar8 == null) {
                        mVar12.C(-440471821);
                        mVar12.f();
                    } else {
                        mVar12.C(-440471820);
                        dj0.i.a(cVar8, bVar4, dVar5 != null ? dVar5.f77496a.get(cVar8) : null, lVar4, mVar12, 0);
                        boolean zB7 = mVar12.B(lVar5) | mVar12.k(cVar8.ordinal());
                        Object objQ22 = mVar12.q();
                        if (zB7) {
                            objQ22 = new dj0.i.a(lVar5, cVar8, null);
                            mVar12.K(objQ22);
                        } else {
                            aVar2.getClass();
                            if (objQ22 == p3.m.a.f135155b) {
                                objQ22 = new dj0.i.a(lVar5, cVar8, null);
                                mVar12.K(objQ22);
                            }
                        }
                        l0.e((e23.p) objQ22, num, mVar12);
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 16:
                return e(obj, obj2, obj3);
            case 17:
                return f(obj, obj2, obj3);
            case 18:
                return g(obj, obj2, obj3);
            case 19:
                return h(obj, obj2, obj3);
            case 20:
                return i(obj, obj2, obj3);
            case 21:
                return j(obj, obj2, obj3);
            case 22:
                return k(obj, obj2, obj3);
            case 23:
                return l(obj, obj2, obj3);
            case 24:
                return n(obj, obj2, obj3);
            case 25:
                return o(obj, obj2, obj3);
            case 26:
                return q(obj, obj2, obj3);
            case 27:
                return r(obj, obj2, obj3);
            case 28:
                return s(obj, obj2, obj3);
            default:
                km1.c cVar9 = (km1.c) obj5;
                o53.b0 b0Var3 = (o53.b0) obj9;
                mc mcVar = (mc) obj8;
                p005kotlin.jvm.internal.m0 m0Var2 = (p005kotlin.jvm.internal.m0) obj7;
                p1 p1Var4 = (p1) obj6;
                h4.r rVar = (h4.r) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                rVar.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar13.B(rVar) ? 4 : 2;
                }
                if (mVar13.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var16 = p3.n.f135158a;
                    kn1.c cVar10 = new kn1.c(m0Var2, 0);
                    boolean zR15 = mVar13.r(b0Var3) | mVar13.B(mcVar);
                    Object objQ23 = mVar13.q();
                    if (zR15) {
                        objQ23 = new jt1.m((Object) b0Var3, (Object) p1Var4, (Object) mcVar, false, 18);
                        mVar13.K(objQ23);
                    } else {
                        aVar2.getClass();
                        if (objQ23 == p3.m.a.f135155b) {
                            objQ23 = new jt1.m((Object) b0Var3, (Object) p1Var4, (Object) mcVar, false, 18);
                            mVar13.K(objQ23);
                        }
                    }
                    kn1.k.j(rVar, cVar9, cVar10, (e23.p) objQ23, mVar13, (iIntValue14 & 14) | (km1.c.B << 3));
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(Context context, p1 p1Var, com.garmin.android.apps.connectmobile.startup.b bVar, c.q qVar, p1 p1Var2) {
        this.f3636a = 3;
        this.f3638c = context;
        this.f3639d = p1Var;
        this.f3637b = bVar;
        this.f3640e = qVar;
        this.f3641f = p1Var2;
    }

    public /* synthetic */ j(e23.a aVar, Object obj, o13.h hVar, o13.h hVar2, Object obj2, int i14) {
        this.f3636a = i14;
        this.f3641f = aVar;
        this.f3639d = obj;
        this.f3638c = hVar;
        this.f3637b = hVar2;
        this.f3640e = obj2;
    }

    public /* synthetic */ j(gv0.d dVar, e23.l lVar, sc.f fVar, e23.a aVar, e23.a aVar2) {
        this.f3636a = 10;
        this.f3639d = dVar;
        this.f3638c = lVar;
        this.f3637b = fVar;
        this.f3641f = aVar;
        this.f3640e = aVar2;
    }

    public /* synthetic */ j(i53.c cVar, jo.f fVar, e23.l lVar, Context context, p1 p1Var) {
        this.f3636a = 19;
        this.f3639d = cVar;
        this.f3637b = fVar;
        this.f3640e = lVar;
        this.f3638c = context;
        this.f3641f = p1Var;
    }

    public /* synthetic */ j(Object obj, e23.a aVar, Object obj2, Object obj3, o13.h hVar, int i14) {
        this.f3636a = i14;
        this.f3639d = obj;
        this.f3641f = aVar;
        this.f3638c = obj2;
        this.f3637b = obj3;
        this.f3640e = hVar;
    }

    public /* synthetic */ j(Object obj, Object obj2, a aVar, Context context, Object obj3, int i14) {
        this.f3636a = i14;
        this.f3639d = obj;
        this.f3640e = obj2;
        this.f3637b = aVar;
        this.f3638c = context;
        this.f3641f = obj3;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f3636a = i14;
        this.f3639d = obj;
        this.f3638c = obj2;
        this.f3637b = obj3;
        this.f3640e = obj4;
        this.f3641f = obj5;
    }
}
