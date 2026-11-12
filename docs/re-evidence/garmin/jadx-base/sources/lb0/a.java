package lb0;

import c2.j;
import c2.l2;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import com.google.maps.android.compose.CameraPositionState;
import e2.i0;
import e2.k0;
import e23.l;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import ky0.k;
import l30.y0;
import lc.m0;
import lc.y;
import lj2.i;
import m30.o;
import m92.f0;
import m92.z;
import o53.b0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.d0;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.d2;
import u1.w;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f111706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f111707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f111708d;

    public /* synthetic */ a(r rVar, Object obj, Object obj2, int i14, int i15) {
        this.f111705a = i15;
        this.f111706b = rVar;
        this.f111707c = obj;
        this.f111708d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:159:0x057e  */
    /* JADX WARN: Code duplicated, block: B:164:0x059f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0727  */
    /* JADX WARN: Code duplicated, block: B:74:0x025c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        int i14 = this.f111705a;
        int i15 = 5;
        m.a aVar = m.f135153a;
        Object obj6 = this.f111706b;
        Object obj7 = this.f111708d;
        Object obj8 = this.f111707c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                b.a((mb0.b) obj8, (e23.a) obj7, (r) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                c.a(p0.t(1), (l) obj7, (r) obj6, (List) obj8, (m) obj);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                lh0.a.a((Double) obj8, (Double) obj7, (String) obj6, (m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 3:
                nj2.a aVar2 = (nj2.a) obj8;
                y yVar = (y) obj7;
                String str = (String) obj6;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.dialog_ok);
                    r.a aVar3 = r.S;
                    boolean zR = mVar.r(aVar2) | mVar.r(yVar) | mVar.B(str);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new lj2.d(aVar2, yVar, str, false ? 1 : 0);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new lj2.d(aVar2, yVar, str, false ? 1 : 0);
                            mVar.K(objQ);
                        }
                    }
                    r rVarD = w.d(aVar3, false, null, null, (e23.a) objQ, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarD, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97936m, mVar), mVar, 0, 0, 131068);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                i.a((y) obj8, (nj2.a) obj7, (l) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                l lVar = (l) obj8;
                p1 p1Var = (p1) obj7;
                ll0.f fVar = (ll0.f) obj6;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    if (((ll0.d) p1Var.getF182175a()).f113350b.isEmpty()) {
                        mVar2.C(1168880198);
                        ll0.c.d(mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(1168965324);
                        Object[] objArr = new Object[0];
                        Object objQ2 = mVar2.q();
                        aVar.getClass();
                        m.a.C2565a c2565a = m.a.f135155b;
                        if (objQ2 == c2565a) {
                            obj3 = objQ2;
                            ll0.b bVar = new ll0.b(0);
                            mVar2.K(bVar);
                            obj3 = bVar;
                        }
                        obj3 = objQ2;
                        p1 p1Var2 = (p1) d4.a.e(objArr, (e23.a) obj3, mVar2, 48);
                        il0.a aVar4 = (il0.a) p1Var2.getF182175a();
                        if (aVar4 == null) {
                            mVar2.C(1169096298);
                            mVar2.f();
                        } else {
                            mVar2.C(1169096299);
                            String name = aVar4.getName();
                            boolean zR2 = mVar2.r(fVar) | mVar2.B(aVar4) | mVar2.B(p1Var2);
                            Object objQ3 = mVar2.q();
                            if (zR2 || objQ3 == c2565a) {
                                obj4 = objQ3;
                                kk1.a aVar5 = new kk1.a(fVar, 12, aVar4, p1Var2);
                                mVar2.K(aVar5);
                                obj4 = aVar5;
                            }
                            e23.a aVar6 = (e23.a) obj4;
                            boolean zB = mVar2.B(p1Var2);
                            Object objQ4 = mVar2.q();
                            Object obj9 = objQ4;
                            if (zB || objQ4 == c2565a) {
                                l51.c cVar = new l51.c(p1Var2, 24);
                                mVar2.K(cVar);
                                obj9 = cVar;
                            }
                            ll0.c.a(name, aVar6, (e23.a) obj9, mVar2, 0);
                            mVar2.f();
                        }
                        List<il0.a> list = ((ll0.d) p1Var.getF182175a()).f113350b;
                        boolean zB2 = mVar2.B(p1Var2);
                        Object objQ5 = mVar2.q();
                        Object obj10 = objQ5;
                        if (zB2 || objQ5 == c2565a) {
                            k kVar = new k(p1Var2, 22);
                            mVar2.K(kVar);
                            obj10 = kVar;
                        }
                        ll0.c.c(list, lVar, (l) obj10, mVar2, 0);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                lm0.p.b((km0.e) obj8, (e23.a) obj7, (e23.a) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                CustomLineChart customLineChart = (CustomLineChart) obj8;
                tz.a aVar7 = (tz.a) obj7;
                ArrayList arrayList = (ArrayList) obj6;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    g6.f.a aVar8 = g6.f.f75994b;
                    r rVarH = x2.h(x2.f(r.S, 1.0f), 330);
                    boolean zR3 = mVar3.r(customLineChart);
                    Object objQ6 = mVar3.q();
                    if (zR3) {
                        objQ6 = new b40.a(customLineChart, 5);
                        mVar3.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new b40.a(customLineChart, 5);
                            mVar3.K(objQ6);
                        }
                    }
                    l lVar2 = (l) objQ6;
                    boolean zR4 = mVar3.r(aVar7) | mVar3.r(arrayList);
                    Object objQ7 = mVar3.q();
                    if (zR4) {
                        objQ7 = new l3.p1(18, aVar7, arrayList);
                        mVar3.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new l3.p1(18, aVar7, arrayList);
                            mVar3.K(objQ7);
                        }
                    }
                    p002j6.c.b(lVar2, rVarH, (l) objQ7, mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                lv1.b.a((mv1.d) obj8, (e23.a) obj7, (e23.a) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                m11.a.a((r) obj6, (n11.a) obj8, (l) obj7, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                m30.c.a((n30.f) obj8, (d2) obj7, (l) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                m30.g.a((r) obj6, (n30.d) obj8, (l) obj7, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                o.a((n30.l) obj8, (d2) obj7, (l) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                m30.p.a((n30.l) obj8, (l) obj7, (l) obj6, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                m30.w.a((n30.e) obj8, (com.garmin.android.apps.connectmobile.courses.model.i) obj7, (l) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                List list2 = (List) obj8;
                PreviewCatalogActivity previewCatalogActivity = (PreviewCatalogActivity) obj7;
                m0 m0Var = (m0) obj6;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i16 = PreviewCatalogActivity.f49781a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r.a aVar9 = r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar4.getU());
                    i2 i2VarX = mVar4.x();
                    r rVarC = h4.k.c(aVar9, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar10);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar4, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar4);
                    u uVar = u.f22885a;
                    i0 i0VarA = k0.a(0, 0, 3, mVar4);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    l2 l2VarE = c2.l.e(0.0f, f14, 0.0f, f14, 5);
                    j jVar = j.f22691a;
                    float f15 = eVar.f97920e;
                    h4.g.b bVar3 = h4.d.a.f81533k;
                    jVar.getClass();
                    j.i iVarK = j.k(f15, bVar3);
                    boolean zR5 = mVar4.r(list2) | mVar4.r(previewCatalogActivity) | mVar4.r(m0Var);
                    Object objQ8 = mVar4.q();
                    if (zR5) {
                        obj5 = objQ8;
                        ls0.h hVar = new ls0.h(list2, 6, previewCatalogActivity, m0Var);
                        mVar4.K(hVar);
                        obj5 = hVar;
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            obj5 = objQ8;
                            ls0.h hVar2 = new ls0.h(list2, 6, previewCatalogActivity, m0Var);
                            mVar4.K(hVar2);
                            obj5 = hVar2;
                        }
                    }
                    obj5 = objQ8;
                    e2.c.b(null, i0VarA, l2VarE, iVarK, null, null, false, null, (l) obj5, mVar4, 0, 489);
                    g6.f.a aVar11 = g6.f.f75994b;
                    float fS0 = ((g6.c) mVar4.A(t1.f91490h)).s0(56);
                    Object objQ9 = mVar4.q();
                    aVar.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    Object obj11 = objQ9;
                    if (objQ9 == c2565a2) {
                        d0 d0VarF = p0.f(new m72.m(i0VarA, fS0, false ? 1 : 0));
                        mVar4.K(d0VarF);
                        obj11 = d0VarF;
                    }
                    x3 x3Var = (x3) obj11;
                    Object objQ10 = mVar4.q();
                    Object obj12 = objQ10;
                    if (objQ10 == c2565a2) {
                        b0 b0VarJ = l0.j(t13.h.f161748a, mVar4);
                        mVar4.K(b0VarJ);
                        obj12 = b0VarJ;
                    }
                    b0 b0Var = (b0) obj12;
                    boolean zBooleanValue = ((Boolean) x3Var.getF182175a()).booleanValue();
                    boolean zR6 = mVar4.r(b0Var) | mVar4.B(i0VarA);
                    Object objQ11 = mVar4.q();
                    Object obj13 = objQ11;
                    if (zR6 || objQ11 == c2565a2) {
                        et1.y yVar2 = new et1.y(b0Var, i0VarA, i15);
                        mVar4.K(yVar2);
                        obj13 = yVar2;
                    }
                    n72.o.a(0, (e23.a) obj13, c2.l.s(uVar.c(aVar9, h4.d.a.f81532j)), mVar4, zBooleanValue);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                m72.p.a((n72.i) obj8, (m0) obj6, (e23.a) obj7, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                f0.a((r) obj6, (j23.l) obj8, (z) obj7, (m) obj, p0.t(513));
                return Unit.INSTANCE;
            case 18:
                be1.a aVar12 = (be1.a) obj8;
                fe1.n nVar = (fe1.n) obj7;
                x3 x3Var2 = (x3) obj6;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    if (dh.b.H(((fe1.o) x3Var2.getF182175a()).f70583e)) {
                        mVar5.C(1557950841);
                        me1.f.a(aVar12, nVar, null, mVar5, 0);
                        mVar5.f();
                    } else {
                        mVar5.C(1558054040);
                        me1.i.a(aVar12, null, mVar5, 0);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                me1.c.a((be1.a) obj8, (b63.o) obj7, (fe1.n) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                i53.c cVar2 = (i53.c) obj8;
                fe1.n nVar2 = (fe1.n) obj7;
                ArrayList arrayList2 = (ArrayList) obj6;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    i0 i0VarA2 = k0.a(0, 0, 3, mVar6);
                    f82.e eVar2 = new f82.e();
                    boolean zR7 = mVar6.r(nVar2) | mVar6.r(arrayList2);
                    Object objQ12 = mVar6.q();
                    if (zR7) {
                        objQ12 = new y0(20, nVar2, arrayList2);
                        mVar6.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == m.a.f135155b) {
                            objQ12 = new y0(20, nVar2, arrayList2);
                            mVar6.K(objQ12);
                        }
                    }
                    e82.a.b(cVar2, eVar2, i0VarA2, null, null, (p) objQ12, mVar6, 0, 24);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                me1.f.a((be1.a) obj8, (fe1.n) obj7, (r) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                i53.c cVar3 = (i53.c) obj8;
                i53.c cVar4 = (i53.c) obj7;
                CameraPositionState cameraPositionState = (CameraPositionState) obj6;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    mVar7.C(-1141851459);
                    Iterator<E> it = cVar3.iterator();
                    while (it.hasNext()) {
                        me2.y.c((le2.d) it.next(), cameraPositionState.getPosition().zoom, mVar7, 0);
                    }
                    mVar7.f();
                    Iterator<E> it3 = cVar4.iterator();
                    while (it3.hasNext()) {
                        me2.y.e((le2.c) it3.next(), null, mVar7, 0, 2);
                    }
                    x1 x1Var8 = n.f135158a;
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                mg2.n.a((mg2.g) obj8, (r) obj6, (e23.q) obj7, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                ml0.h.f((ml0.p) obj8, (l) obj6, (e23.a) obj7, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                ml1.b.d((String) obj8, (gk1.b) obj7, (ak0.i) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                mt1.g.a((com.garmin.android.apps.connectmobile.c) obj8, (m0) obj7, (l) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                l lVar3 = (l) obj8;
                l lVar4 = (l) obj7;
                p pVar = (p) obj6;
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r.a aVar13 = r.S;
                    j.f22691a.getClass();
                    j.k kVar2 = j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    r rVarC2 = h4.k.c(aVar13, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar14);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar8);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar8, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar8);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    g6.f.a aVar15 = g6.f.f75994b;
                    r rVarH2 = x2.h(x2.f(aVar13, 1.0f), 290);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    p002j6.c.b(lVar3, c2.l.C(rVarH2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), lVar4, mVar8, 0, 0);
                    if (pVar == null) {
                        mVar8.C(1501660874);
                    } else {
                        mVar8.C(1849555991);
                        pVar.invoke(mVar8, 0);
                    }
                    mVar8.f();
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                mw0.j.a((List) obj8, (pv0.w) obj7, (String) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                mw0.q.a((b63.o) obj8, (List) obj7, (l) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, int i14, Object obj2, Object obj3) {
        this.f111705a = i14;
        this.f111707c = obj;
        this.f111708d = obj2;
        this.f111706b = obj3;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f111705a = i15;
        this.f111707c = obj;
        this.f111708d = obj2;
        this.f111706b = obj3;
    }

    public /* synthetic */ a(Object obj, Object obj2, o13.h hVar, int i14, int i15) {
        this.f111705a = i15;
        this.f111707c = obj;
        this.f111706b = obj2;
        this.f111708d = hVar;
    }
}
