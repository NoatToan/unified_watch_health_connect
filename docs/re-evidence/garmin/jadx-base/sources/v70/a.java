package v70;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.u1;
import b.u;
import b63.o;
import c.q;
import c2.t;
import ci0.j;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import e23.p;
import e23.r;
import i3.fe;
import i53.f;
import lc.m0;
import lc.v;
import lc.w;
import lc.y;
import n70.g;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import qr1.d;
import r1.l;
import r1.q2;
import r53.p2;
import r70.z;
import ty1.g2;
import u70.h;
import u70.i;
import ug2.b0;
import yq1.e;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f176112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f176113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f176114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f176115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f176116f;

    public /* synthetic */ a(f fVar, yd1.b bVar, e eVar, o82.a aVar, e23.a aVar2) {
        this.f176111a = 7;
        this.f176116f = fVar;
        this.f176115e = bVar;
        this.f176114d = eVar;
        this.f176113c = aVar;
        this.f176112b = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:113:0x031b  */
    /* JADX WARN: Code duplicated, block: B:118:0x033c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0358  */
    /* JADX WARN: Code duplicated, block: B:128:0x037b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0416  */
    /* JADX WARN: Code duplicated, block: B:167:0x0460  */
    /* JADX WARN: Code duplicated, block: B:172:0x047d  */
    /* JADX WARN: Code duplicated, block: B:177:0x049a  */
    /* JADX WARN: Code duplicated, block: B:182:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:195:0x0537  */
    /* JADX WARN: Code duplicated, block: B:198:0x054e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0555  */
    /* JADX WARN: Code duplicated, block: B:203:0x056e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0575  */
    /* JADX WARN: Code duplicated, block: B:212:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:217:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0169  */
    /* JADX WARN: Code duplicated, block: B:63:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x0212  */
    /* JADX WARN: Code duplicated, block: B:99:0x028d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        h hVar;
        boolean zR;
        Object objQ;
        boolean zR2;
        Object objQ2;
        o82.a aVar;
        u82.f fVar;
        Object bVar;
        m mVar;
        final d dVar;
        int i14 = this.f176111a;
        int i15 = 24;
        final int i16 = 2;
        Object obj5 = null;
        int i17 = 3;
        int i18 = 16;
        boolean z14 = false;
        m.a aVar2 = m.f135153a;
        Object obj6 = this.f176112b;
        Object obj7 = this.f176113c;
        Object obj8 = this.f176114d;
        Object obj9 = this.f176115e;
        Object obj10 = this.f176116f;
        final int i19 = 1;
        switch (i14) {
            case 0:
                g gVar = (g) obj10;
                z zVar = (z) obj9;
                final m0 m0Var = (m0) obj8;
                final e23.a aVar3 = (e23.a) obj6;
                final DashboardRoute dashboardRoute = (DashboardRoute) obj7;
                v vVar = (v) obj2;
                m mVar2 = (m) obj3;
                ((Integer) obj4).getClass();
                ((l) obj).getClass();
                vVar.getClass();
                x1 x1Var = n.f135158a;
                boolean z15 = ((DashboardRoute.HomeSettings) w.a(vVar, s0.f105811a.b(DashboardRoute.HomeSettings.class))).f33497b;
                boolean zR3 = mVar2.r(m0Var);
                Object objQ3 = mVar2.q();
                if (zR3) {
                    objQ3 = new ky0.w(m0Var, i15);
                    mVar2.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new ky0.w(m0Var, i15);
                        mVar2.K(objQ3);
                    }
                }
                e23.l lVar = (e23.l) objQ3;
                boolean zR4 = mVar2.r(dashboardRoute) | mVar2.r(m0Var) | mVar2.B(aVar3);
                Object objQ4 = mVar2.q();
                if (zR4) {
                    final int i24 = z14 ? 1 : 0;
                    objQ4 = new e23.a() { // from class: v70.b
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    DashboardRoute.Dashboard dashboard = DashboardRoute.Dashboard.INSTANCE;
                                    if (s.g(dashboardRoute, dashboard)) {
                                        y.q(m0Var, dashboard);
                                    } else {
                                        aVar3.invoke();
                                    }
                                    break;
                                default:
                                    DashboardRoute.Dashboard dashboard2 = DashboardRoute.Dashboard.INSTANCE;
                                    if (s.g(dashboardRoute, dashboard2)) {
                                        y.q(m0Var, dashboard2);
                                    } else {
                                        aVar3.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        final int i25 = z14 ? 1 : 0;
                        objQ4 = new e23.a() { // from class: v70.b
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i25) {
                                    case 0:
                                        DashboardRoute.Dashboard dashboard = DashboardRoute.Dashboard.INSTANCE;
                                        if (s.g(dashboardRoute, dashboard)) {
                                            y.q(m0Var, dashboard);
                                        } else {
                                            aVar3.invoke();
                                        }
                                        break;
                                    default:
                                        DashboardRoute.Dashboard dashboard2 = DashboardRoute.Dashboard.INSTANCE;
                                        if (s.g(dashboardRoute, dashboard2)) {
                                            y.q(m0Var, dashboard2);
                                        } else {
                                            aVar3.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ4);
                    }
                }
                w70.e.e(gVar, zVar, null, z15, lVar, aVar3, (e23.a) objQ4, mVar2, 0);
                break;
            case 1:
                i iVar = (i) obj10;
                final e23.a aVar4 = (e23.a) obj6;
                final DashboardRoute dashboardRoute2 = (DashboardRoute) obj7;
                final m0 m0Var2 = (m0) obj8;
                z zVar2 = (z) obj9;
                v vVar2 = (v) obj2;
                m mVar3 = (m) obj3;
                ((Integer) obj4).getClass();
                ((l) obj).getClass();
                vVar2.getClass();
                x1 x1Var2 = n.f135158a;
                DashboardRoute.SelectHomeLayout selectHomeLayout = (DashboardRoute.SelectHomeLayout) w.a(vVar2, s0.f105811a.b(DashboardRoute.SelectHomeLayout.class));
                for (Object obj11 : h.f169427e) {
                    if (s.g(((h) obj11).name(), selectHomeLayout.f33500b)) {
                        obj5 = obj11;
                        hVar = (h) obj5;
                        if (hVar == null) {
                            hVar = h.STATIC_SINGLE;
                        }
                        h hVar2 = hVar;
                        zR = mVar3.r(dashboardRoute2) | mVar3.r(m0Var2) | mVar3.B(aVar4);
                        objQ = mVar3.q();
                        if (zR) {
                            objQ = new e23.a() { // from class: v70.b
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            DashboardRoute.Dashboard dashboard = DashboardRoute.Dashboard.INSTANCE;
                                            if (s.g(dashboardRoute2, dashboard)) {
                                                y.q(m0Var2, dashboard);
                                            } else {
                                                aVar4.invoke();
                                            }
                                            break;
                                        default:
                                            DashboardRoute.Dashboard dashboard2 = DashboardRoute.Dashboard.INSTANCE;
                                            if (s.g(dashboardRoute2, dashboard2)) {
                                                y.q(m0Var2, dashboard2);
                                            } else {
                                                aVar4.invoke();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ);
                        } else {
                            aVar2.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new e23.a() { // from class: v70.b
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i19) {
                                            case 0:
                                                DashboardRoute.Dashboard dashboard = DashboardRoute.Dashboard.INSTANCE;
                                                if (s.g(dashboardRoute2, dashboard)) {
                                                    y.q(m0Var2, dashboard);
                                                } else {
                                                    aVar4.invoke();
                                                }
                                                break;
                                            default:
                                                DashboardRoute.Dashboard dashboard2 = DashboardRoute.Dashboard.INSTANCE;
                                                if (s.g(dashboardRoute2, dashboard2)) {
                                                    y.q(m0Var2, dashboard2);
                                                } else {
                                                    aVar4.invoke();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar3.K(objQ);
                            }
                        }
                        e23.a aVar5 = (e23.a) objQ;
                        zR2 = mVar3.r(zVar2) | mVar3.r(m0Var2);
                        objQ2 = mVar3.q();
                        if (zR2) {
                            objQ2 = new g2(10, zVar2, m0Var2);
                            mVar3.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new g2(10, zVar2, m0Var2);
                                mVar3.K(objQ2);
                            }
                        }
                        u70.g.c(iVar, hVar2, aVar4, aVar5, (e23.l) objQ2, mVar3, 0);
                        x1 x1Var3 = n.f135158a;
                        break;
                    }
                }
                hVar = (h) obj5;
                if (hVar == null) {
                    hVar = h.STATIC_SINGLE;
                }
                h hVar3 = hVar;
                zR = mVar3.r(dashboardRoute2) | mVar3.r(m0Var2) | mVar3.B(aVar4);
                objQ = mVar3.q();
                if (zR) {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new e23.a() { // from class: v70.b
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        DashboardRoute.Dashboard dashboard = DashboardRoute.Dashboard.INSTANCE;
                                        if (s.g(dashboardRoute2, dashboard)) {
                                            y.q(m0Var2, dashboard);
                                        } else {
                                            aVar4.invoke();
                                        }
                                        break;
                                    default:
                                        DashboardRoute.Dashboard dashboard2 = DashboardRoute.Dashboard.INSTANCE;
                                        if (s.g(dashboardRoute2, dashboard2)) {
                                            y.q(m0Var2, dashboard2);
                                        } else {
                                            aVar4.invoke();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ);
                    }
                } else {
                    objQ = new e23.a() { // from class: v70.b
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    DashboardRoute.Dashboard dashboard = DashboardRoute.Dashboard.INSTANCE;
                                    if (s.g(dashboardRoute2, dashboard)) {
                                        y.q(m0Var2, dashboard);
                                    } else {
                                        aVar4.invoke();
                                    }
                                    break;
                                default:
                                    DashboardRoute.Dashboard dashboard2 = DashboardRoute.Dashboard.INSTANCE;
                                    if (s.g(dashboardRoute2, dashboard2)) {
                                        y.q(m0Var2, dashboard2);
                                    } else {
                                        aVar4.invoke();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar3.K(objQ);
                }
                e23.a aVar6 = (e23.a) objQ;
                zR2 = mVar3.r(zVar2) | mVar3.r(m0Var2);
                objQ2 = mVar3.q();
                if (zR2) {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new g2(10, zVar2, m0Var2);
                        mVar3.K(objQ2);
                    }
                } else {
                    objQ2 = new g2(10, zVar2, m0Var2);
                    mVar3.K(objQ2);
                }
                u70.g.c(iVar, hVar3, aVar4, aVar6, (e23.l) objQ2, mVar3, 0);
                x1 x1Var4 = n.f135158a;
                break;
            case 2:
                n82.f fVar2 = (n82.f) obj10;
                o82.a aVar7 = (o82.a) obj9;
                d dVar2 = (d) obj8;
                p1 p1Var = (p1) obj6;
                p1 p1Var2 = (p1) obj7;
                u82.f fVar3 = (u82.f) obj2;
                m mVar4 = (m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((t) obj).getClass();
                fVar3.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? mVar4.B(fVar3) : mVar4.r(fVar3) ? 32 : 16;
                }
                int i26 = iIntValue;
                if (mVar4.n(i26 & 1, (i26 & 145) != 144)) {
                    x1 x1Var5 = n.f135158a;
                    boolean zB = ((i26 & 112) == 32 || ((i26 & 64) != 0 && mVar4.r(fVar3))) | mVar4.B(fVar2) | mVar4.B(aVar7) | mVar4.r(dVar2);
                    Object objQ5 = mVar4.q();
                    if (zB) {
                        aVar = aVar7;
                        fVar = fVar3;
                        mVar = mVar4;
                        bVar = new vr1.m.b(fVar2, aVar, fVar, dVar2, null);
                        dVar = dVar2;
                        mVar.K(bVar);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == m.a.f135155b) {
                            aVar = aVar7;
                            fVar = fVar3;
                            mVar = mVar4;
                            bVar = new vr1.m.b(fVar2, aVar, fVar, dVar2, null);
                            dVar = dVar2;
                            mVar.K(bVar);
                        } else {
                            bVar = objQ5;
                            dVar = dVar2;
                            aVar = aVar7;
                            fVar = fVar3;
                            mVar = mVar4;
                        }
                    }
                    int i27 = gs1.t.f78871l;
                    l0.e((p) bVar, fVar, mVar);
                    gs1.t tVar = (gs1.t) fVar.a();
                    DateTime dateTimeK = vb.h.k(aVar.f130843a);
                    boolean z16 = ((qr1.c) p1Var2.getF182175a()).f146900e;
                    tf0.i iVar2 = dVar.f146913i;
                    boolean zR5 = mVar.r(dVar);
                    Object objQ6 = mVar.q();
                    if (zR5) {
                        final int i28 = z14 ? 1 : 0;
                        objQ6 = new e23.l() { // from class: vr1.l
                            @Override // e23.l
                            public final Object invoke(Object obj12) {
                                Object value;
                                Object value2;
                                switch (i28) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                        p2 p2Var = dVar.f146911g;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, qr1.c.a((qr1.c) value, null, null, false, zBooleanValue, false, false, 0, false, 247)));
                                        break;
                                    case 1:
                                        o oVar = (o) obj12;
                                        oVar.getClass();
                                        qr1.d dVar3 = dVar;
                                        dVar3.getClass();
                                        dVar3.f146908d.i(new o82.a(oVar, null, 2, null), true);
                                        break;
                                    default:
                                        boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                        qr1.d dVar4 = dVar;
                                        p2 p2Var2 = dVar4.f146911g;
                                        boolean z17 = ((qr1.c) p2Var2.getValue()).f146898c;
                                        wr1.a aVar8 = dVar4.f146907c;
                                        if (z17) {
                                            aVar8.e();
                                        } else {
                                            aVar8.d();
                                        }
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, qr1.c.a((qr1.c) value2, null, null, false, false, zBooleanValue2, false, 0, false, 239)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == m.a.f135155b) {
                            final int i29 = z14 ? 1 : 0;
                            objQ6 = new e23.l() { // from class: vr1.l
                                @Override // e23.l
                                public final Object invoke(Object obj12) {
                                    Object value;
                                    Object value2;
                                    switch (i29) {
                                        case 0:
                                            boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                            p2 p2Var = dVar.f146911g;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, qr1.c.a((qr1.c) value, null, null, false, zBooleanValue, false, false, 0, false, 247)));
                                            break;
                                        case 1:
                                            o oVar = (o) obj12;
                                            oVar.getClass();
                                            qr1.d dVar3 = dVar;
                                            dVar3.getClass();
                                            dVar3.f146908d.i(new o82.a(oVar, null, 2, null), true);
                                            break;
                                        default:
                                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                            qr1.d dVar4 = dVar;
                                            p2 p2Var2 = dVar4.f146911g;
                                            boolean z17 = ((qr1.c) p2Var2.getValue()).f146898c;
                                            wr1.a aVar8 = dVar4.f146907c;
                                            if (z17) {
                                                aVar8.e();
                                            } else {
                                                aVar8.d();
                                            }
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, qr1.c.a((qr1.c) value2, null, null, false, false, zBooleanValue2, false, 0, false, 239)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ6);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ6;
                    boolean zR6 = mVar.r(dVar);
                    Object objQ7 = mVar.q();
                    if (zR6) {
                        objQ7 = new e23.l() { // from class: vr1.l
                            @Override // e23.l
                            public final Object invoke(Object obj12) {
                                Object value;
                                Object value2;
                                switch (i19) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                        p2 p2Var = dVar.f146911g;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, qr1.c.a((qr1.c) value, null, null, false, zBooleanValue, false, false, 0, false, 247)));
                                        break;
                                    case 1:
                                        o oVar = (o) obj12;
                                        oVar.getClass();
                                        qr1.d dVar3 = dVar;
                                        dVar3.getClass();
                                        dVar3.f146908d.i(new o82.a(oVar, null, 2, null), true);
                                        break;
                                    default:
                                        boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                        qr1.d dVar4 = dVar;
                                        p2 p2Var2 = dVar4.f146911g;
                                        boolean z17 = ((qr1.c) p2Var2.getValue()).f146898c;
                                        wr1.a aVar8 = dVar4.f146907c;
                                        if (z17) {
                                            aVar8.e();
                                        } else {
                                            aVar8.d();
                                        }
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, qr1.c.a((qr1.c) value2, null, null, false, false, zBooleanValue2, false, 0, false, 239)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new e23.l() { // from class: vr1.l
                                @Override // e23.l
                                public final Object invoke(Object obj12) {
                                    Object value;
                                    Object value2;
                                    switch (i19) {
                                        case 0:
                                            boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                            p2 p2Var = dVar.f146911g;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, qr1.c.a((qr1.c) value, null, null, false, zBooleanValue, false, false, 0, false, 247)));
                                            break;
                                        case 1:
                                            o oVar = (o) obj12;
                                            oVar.getClass();
                                            qr1.d dVar3 = dVar;
                                            dVar3.getClass();
                                            dVar3.f146908d.i(new o82.a(oVar, null, 2, null), true);
                                            break;
                                        default:
                                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                            qr1.d dVar4 = dVar;
                                            p2 p2Var2 = dVar4.f146911g;
                                            boolean z17 = ((qr1.c) p2Var2.getValue()).f146898c;
                                            wr1.a aVar8 = dVar4.f146907c;
                                            if (z17) {
                                                aVar8.e();
                                            } else {
                                                aVar8.d();
                                            }
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, qr1.c.a((qr1.c) value2, null, null, false, false, zBooleanValue2, false, 0, false, 239)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ7);
                        }
                    }
                    e23.l lVar3 = (e23.l) objQ7;
                    boolean zR7 = mVar.r(dVar);
                    Object objQ8 = mVar.q();
                    if (zR7) {
                        objQ8 = new e23.l() { // from class: vr1.l
                            @Override // e23.l
                            public final Object invoke(Object obj12) {
                                Object value;
                                Object value2;
                                switch (i16) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                        p2 p2Var = dVar.f146911g;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, qr1.c.a((qr1.c) value, null, null, false, zBooleanValue, false, false, 0, false, 247)));
                                        break;
                                    case 1:
                                        o oVar = (o) obj12;
                                        oVar.getClass();
                                        qr1.d dVar3 = dVar;
                                        dVar3.getClass();
                                        dVar3.f146908d.i(new o82.a(oVar, null, 2, null), true);
                                        break;
                                    default:
                                        boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                        qr1.d dVar4 = dVar;
                                        p2 p2Var2 = dVar4.f146911g;
                                        boolean z17 = ((qr1.c) p2Var2.getValue()).f146898c;
                                        wr1.a aVar8 = dVar4.f146907c;
                                        if (z17) {
                                            aVar8.e();
                                        } else {
                                            aVar8.d();
                                        }
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, qr1.c.a((qr1.c) value2, null, null, false, false, zBooleanValue2, false, 0, false, 239)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new e23.l() { // from class: vr1.l
                                @Override // e23.l
                                public final Object invoke(Object obj12) {
                                    Object value;
                                    Object value2;
                                    switch (i16) {
                                        case 0:
                                            boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                            p2 p2Var = dVar.f146911g;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, qr1.c.a((qr1.c) value, null, null, false, zBooleanValue, false, false, 0, false, 247)));
                                            break;
                                        case 1:
                                            o oVar = (o) obj12;
                                            oVar.getClass();
                                            qr1.d dVar3 = dVar;
                                            dVar3.getClass();
                                            dVar3.f146908d.i(new o82.a(oVar, null, 2, null), true);
                                            break;
                                        default:
                                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                            qr1.d dVar4 = dVar;
                                            p2 p2Var2 = dVar4.f146911g;
                                            boolean z17 = ((qr1.c) p2Var2.getValue()).f146898c;
                                            wr1.a aVar8 = dVar4.f146907c;
                                            if (z17) {
                                                aVar8.e();
                                            } else {
                                                aVar8.d();
                                            }
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, qr1.c.a((qr1.c) value2, null, null, false, false, zBooleanValue2, false, 0, false, 239)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ8);
                        }
                    }
                    e23.l lVar4 = (e23.l) objQ8;
                    boolean zB2 = mVar.B(p1Var);
                    Object objQ9 = mVar.q();
                    if (zB2) {
                        objQ9 = new vd0.d(p1Var, 9);
                        mVar.K(objQ9);
                    } else {
                        aVar2.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new vd0.d(p1Var, 9);
                            mVar.K(objQ9);
                        }
                    }
                    wr1.g.e(dateTimeK, tVar, z16, iVar2, lVar2, lVar3, lVar4, (e23.l) objQ9, mVar, (i27 << 3) | (tf0.i.f164439d << 9));
                } else {
                    mVar4.e();
                }
                break;
            case 3:
                ba1.d dVar3 = (ba1.d) obj10;
                fe feVar = (fe) obj9;
                Context context = (Context) obj6;
                q qVar = (q) obj7;
                m0 m0Var3 = (m0) obj8;
                m mVar5 = (m) obj3;
                ((Integer) obj4).getClass();
                ((l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var6 = n.f135158a;
                aa1.a aVar8 = (aa1.a) s9.c.c(dVar3.C, mVar5).getF182175a();
                boolean zR8 = mVar5.r(dVar3) | mVar5.r(context) | mVar5.r(qVar);
                Object objQ10 = mVar5.q();
                if (zR8) {
                    objQ10 = new w91.e(dVar3, context, qVar, 1);
                    mVar5.K(objQ10);
                } else {
                    aVar2.getClass();
                    if (objQ10 == m.a.f135155b) {
                        objQ10 = new w91.e(dVar3, context, qVar, 1);
                        mVar5.K(objQ10);
                    }
                }
                p pVar = (p) objQ10;
                boolean zR9 = mVar5.r(dVar3) | mVar5.r(m0Var3);
                Object objQ11 = mVar5.q();
                if (zR9) {
                    objQ11 = new w91.c(dVar3, m0Var3, i16);
                    mVar5.K(objQ11);
                } else {
                    aVar2.getClass();
                    if (objQ11 == m.a.f135155b) {
                        objQ11 = new w91.c(dVar3, m0Var3, i16);
                        mVar5.K(objQ11);
                    }
                }
                p pVar2 = (p) objQ11;
                boolean zR10 = mVar5.r(context);
                Object objQ12 = mVar5.q();
                if (zR10) {
                    objQ12 = new tz1.h(context, i18);
                    mVar5.K(objQ12);
                } else {
                    aVar2.getClass();
                    if (objQ12 == m.a.f135155b) {
                        objQ12 = new tz1.h(context, i18);
                        mVar5.K(objQ12);
                    }
                }
                e23.a aVar9 = (e23.a) objQ12;
                u uVar = (u) mVar5.A(g02.d.f74342a);
                boolean zR11 = mVar5.r(uVar);
                Object objQ13 = mVar5.q();
                if (zR11) {
                    objQ13 = new w91.v(uVar);
                    mVar5.K(objQ13);
                } else {
                    aVar2.getClass();
                    if (objQ13 == m.a.f135155b) {
                        objQ13 = new w91.v(uVar);
                        mVar5.K(objQ13);
                    }
                }
                x91.i.a(dVar3, aVar8, feVar, pVar, pVar2, aVar9, (e23.a) ((k23.g) objQ13), mVar5, 384);
                break;
            case 4:
                wn0.l lVar5 = (wn0.l) obj10;
                nk0.l lVar6 = (nk0.l) obj9;
                o82.a aVar10 = (o82.a) obj8;
                nk0.l lVar7 = (nk0.l) obj6;
                nk0.l lVar8 = (nk0.l) obj7;
                u82.f fVar4 = (u82.f) obj2;
                m mVar6 = (m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((t) obj).getClass();
                fVar4.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= (iIntValue2 & 64) == 0 ? mVar6.B(fVar4) : mVar6.r(fVar4) ? 32 : 16;
                }
                if (mVar6.n(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    x1 x1Var7 = n.f135158a;
                    boolean zR12 = mVar6.r(lVar5);
                    Object objQ14 = mVar6.q();
                    if (zR12) {
                        objQ14 = new wn0.c(lVar5, i19);
                        mVar6.K(objQ14);
                    } else {
                        aVar2.getClass();
                        if (objQ14 == m.a.f135155b) {
                            objQ14 = new wn0.c(lVar5, i19);
                            mVar6.K(objQ14);
                        }
                    }
                    e23.a aVar11 = (e23.a) objQ14;
                    boolean zR13 = mVar6.r(lVar5) | mVar6.B(aVar10);
                    Object objQ15 = mVar6.q();
                    if (zR13) {
                        objQ15 = new vv0.n(25, lVar5, aVar10);
                        mVar6.K(objQ15);
                    } else {
                        aVar2.getClass();
                        if (objQ15 == m.a.f135155b) {
                            objQ15 = new vv0.n(25, lVar5, aVar10);
                            mVar6.K(objQ15);
                        }
                    }
                    wn0.g.g(fVar4, lVar5, aVar11, lVar6, (e23.a) objQ15, lVar7, lVar8, mVar6, 8 | ((iIntValue2 >> 3) & 14));
                } else {
                    mVar6.e();
                }
                break;
            case 5:
                Activity activity = (Activity) obj9;
                vv1.c cVar = (vv1.c) obj6;
                uv1.c cVar2 = (uv1.c) obj7;
                m0 m0Var4 = (m0) obj8;
                m mVar7 = (m) obj3;
                q2.t((Integer) obj4, (l) obj, (v) obj2);
                x1 x1Var8 = n.f135158a;
                ((qv1.b) obj10).f147946m.k(null, Boolean.TRUE);
                boolean zK = mVar7.k(cVar2.ordinal()) | mVar7.r(activity) | mVar7.r(m0Var4);
                Object objQ16 = mVar7.q();
                if (zK) {
                    objQ16 = new b0(cVar2, i15, activity, m0Var4);
                    mVar7.K(objQ16);
                } else {
                    aVar2.getClass();
                    if (objQ16 == m.a.f135155b) {
                        objQ16 = new b0(cVar2, i15, activity, m0Var4);
                        mVar7.K(objQ16);
                    }
                }
                rv1.t.b(activity, cVar, cVar2, (e23.a) objQ16, mVar7, 0);
                break;
            case 6:
                n82.f fVar5 = (n82.f) obj10;
                o82.a aVar12 = (o82.a) obj9;
                final xh0.h hVar4 = (xh0.h) obj8;
                p1 p1Var3 = (p1) obj6;
                p1 p1Var4 = (p1) obj7;
                u82.f fVar6 = (u82.f) obj2;
                m mVar8 = (m) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((t) obj).getClass();
                fVar6.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= (iIntValue3 & 64) == 0 ? mVar8.B(fVar6) : mVar8.r(fVar6) ? 32 : 16;
                }
                int i30 = iIntValue3;
                if (mVar8.n(i30 & 1, (i30 & 145) != 144)) {
                    x1 x1Var9 = n.f135158a;
                    boolean zB3 = mVar8.B(fVar5) | mVar8.B(aVar12) | mVar8.r(hVar4);
                    Object objQ17 = mVar8.q();
                    if (zB3) {
                        objQ17 = new xh0.f.b(fVar5, aVar12, hVar4, null);
                        mVar8.K(objQ17);
                    } else {
                        aVar2.getClass();
                        if (objQ17 == m.a.f135155b) {
                            objQ17 = new xh0.f.b(fVar5, aVar12, hVar4, null);
                            mVar8.K(objQ17);
                        }
                    }
                    l0.e((p) objQ17, fVar6, mVar8);
                    DateTime dateTimeK2 = vb.h.k(aVar12.f130843a);
                    sh0.d dVar4 = (sh0.d) fVar6.a();
                    boolean z17 = ((xh0.g) p1Var4.getF182175a()).f191004e;
                    boolean z18 = ((xh0.g) p1Var4.getF182175a()).f191003d;
                    tf0.i iVar3 = hVar4.f191012e;
                    boolean zR14 = mVar8.r(hVar4);
                    Object objQ18 = mVar8.q();
                    if (zR14) {
                        final int i34 = z14 ? 1 : 0;
                        objQ18 = new e23.l() { // from class: xh0.e
                            @Override // e23.l
                            public final Object invoke(Object obj12) {
                                Object value;
                                Object value2;
                                switch (i34) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                        p2 p2Var = hVar4.f191013f;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, g.a((g) value, null, null, zBooleanValue, false, false, false, false, false, 251)));
                                        break;
                                    case 1:
                                        o oVar = (o) obj12;
                                        oVar.getClass();
                                        h hVar5 = hVar4;
                                        hVar5.getClass();
                                        hVar5.f191014g.i(new o82.a(oVar, null, 2, null), true);
                                        break;
                                    default:
                                        boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                        h hVar6 = hVar4;
                                        p2 p2Var2 = hVar6.f191013f;
                                        boolean z19 = ((g) p2Var2.getValue()).f191003d;
                                        j jVar = hVar6.f191011d;
                                        if (z19) {
                                            jVar.e();
                                        } else {
                                            jVar.d();
                                        }
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, g.a((g) value2, null, null, false, false, zBooleanValue2, false, false, false, 239)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ18);
                    } else {
                        aVar2.getClass();
                        if (objQ18 == m.a.f135155b) {
                            final int i35 = z14 ? 1 : 0;
                            objQ18 = new e23.l() { // from class: xh0.e
                                @Override // e23.l
                                public final Object invoke(Object obj12) {
                                    Object value;
                                    Object value2;
                                    switch (i35) {
                                        case 0:
                                            boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                            p2 p2Var = hVar4.f191013f;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, g.a((g) value, null, null, zBooleanValue, false, false, false, false, false, 251)));
                                            break;
                                        case 1:
                                            o oVar = (o) obj12;
                                            oVar.getClass();
                                            h hVar5 = hVar4;
                                            hVar5.getClass();
                                            hVar5.f191014g.i(new o82.a(oVar, null, 2, null), true);
                                            break;
                                        default:
                                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                            h hVar6 = hVar4;
                                            p2 p2Var2 = hVar6.f191013f;
                                            boolean z19 = ((g) p2Var2.getValue()).f191003d;
                                            j jVar = hVar6.f191011d;
                                            if (z19) {
                                                jVar.e();
                                            } else {
                                                jVar.d();
                                            }
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, g.a((g) value2, null, null, false, false, zBooleanValue2, false, false, false, 239)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ18);
                        }
                    }
                    e23.l lVar9 = (e23.l) objQ18;
                    boolean zR15 = mVar8.r(hVar4);
                    Object objQ19 = mVar8.q();
                    if (zR15) {
                        objQ19 = new e23.l() { // from class: xh0.e
                            @Override // e23.l
                            public final Object invoke(Object obj12) {
                                Object value;
                                Object value2;
                                switch (i19) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                        p2 p2Var = hVar4.f191013f;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, g.a((g) value, null, null, zBooleanValue, false, false, false, false, false, 251)));
                                        break;
                                    case 1:
                                        o oVar = (o) obj12;
                                        oVar.getClass();
                                        h hVar5 = hVar4;
                                        hVar5.getClass();
                                        hVar5.f191014g.i(new o82.a(oVar, null, 2, null), true);
                                        break;
                                    default:
                                        boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                        h hVar6 = hVar4;
                                        p2 p2Var2 = hVar6.f191013f;
                                        boolean z19 = ((g) p2Var2.getValue()).f191003d;
                                        j jVar = hVar6.f191011d;
                                        if (z19) {
                                            jVar.e();
                                        } else {
                                            jVar.d();
                                        }
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, g.a((g) value2, null, null, false, false, zBooleanValue2, false, false, false, 239)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ19);
                    } else {
                        aVar2.getClass();
                        if (objQ19 == m.a.f135155b) {
                            objQ19 = new e23.l() { // from class: xh0.e
                                @Override // e23.l
                                public final Object invoke(Object obj12) {
                                    Object value;
                                    Object value2;
                                    switch (i19) {
                                        case 0:
                                            boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                            p2 p2Var = hVar4.f191013f;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, g.a((g) value, null, null, zBooleanValue, false, false, false, false, false, 251)));
                                            break;
                                        case 1:
                                            o oVar = (o) obj12;
                                            oVar.getClass();
                                            h hVar5 = hVar4;
                                            hVar5.getClass();
                                            hVar5.f191014g.i(new o82.a(oVar, null, 2, null), true);
                                            break;
                                        default:
                                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                            h hVar6 = hVar4;
                                            p2 p2Var2 = hVar6.f191013f;
                                            boolean z19 = ((g) p2Var2.getValue()).f191003d;
                                            j jVar = hVar6.f191011d;
                                            if (z19) {
                                                jVar.e();
                                            } else {
                                                jVar.d();
                                            }
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, g.a((g) value2, null, null, false, false, zBooleanValue2, false, false, false, 239)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ19);
                        }
                    }
                    e23.l lVar10 = (e23.l) objQ19;
                    boolean zR16 = mVar8.r(hVar4);
                    Object objQ20 = mVar8.q();
                    if (zR16) {
                        objQ20 = new e23.l() { // from class: xh0.e
                            @Override // e23.l
                            public final Object invoke(Object obj12) {
                                Object value;
                                Object value2;
                                switch (i16) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                        p2 p2Var = hVar4.f191013f;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, g.a((g) value, null, null, zBooleanValue, false, false, false, false, false, 251)));
                                        break;
                                    case 1:
                                        o oVar = (o) obj12;
                                        oVar.getClass();
                                        h hVar5 = hVar4;
                                        hVar5.getClass();
                                        hVar5.f191014g.i(new o82.a(oVar, null, 2, null), true);
                                        break;
                                    default:
                                        boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                        h hVar6 = hVar4;
                                        p2 p2Var2 = hVar6.f191013f;
                                        boolean z19 = ((g) p2Var2.getValue()).f191003d;
                                        j jVar = hVar6.f191011d;
                                        if (z19) {
                                            jVar.e();
                                        } else {
                                            jVar.d();
                                        }
                                        do {
                                            value2 = p2Var2.getValue();
                                        } while (!p2Var2.b(value2, g.a((g) value2, null, null, false, false, zBooleanValue2, false, false, false, 239)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ20);
                    } else {
                        aVar2.getClass();
                        if (objQ20 == m.a.f135155b) {
                            objQ20 = new e23.l() { // from class: xh0.e
                                @Override // e23.l
                                public final Object invoke(Object obj12) {
                                    Object value;
                                    Object value2;
                                    switch (i16) {
                                        case 0:
                                            boolean zBooleanValue = ((Boolean) obj12).booleanValue();
                                            p2 p2Var = hVar4.f191013f;
                                            do {
                                                value = p2Var.getValue();
                                            } while (!p2Var.b(value, g.a((g) value, null, null, zBooleanValue, false, false, false, false, false, 251)));
                                            break;
                                        case 1:
                                            o oVar = (o) obj12;
                                            oVar.getClass();
                                            h hVar5 = hVar4;
                                            hVar5.getClass();
                                            hVar5.f191014g.i(new o82.a(oVar, null, 2, null), true);
                                            break;
                                        default:
                                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                                            h hVar6 = hVar4;
                                            p2 p2Var2 = hVar6.f191013f;
                                            boolean z19 = ((g) p2Var2.getValue()).f191003d;
                                            j jVar = hVar6.f191011d;
                                            if (z19) {
                                                jVar.e();
                                            } else {
                                                jVar.d();
                                            }
                                            do {
                                                value2 = p2Var2.getValue();
                                            } while (!p2Var2.b(value2, g.a((g) value2, null, null, false, false, zBooleanValue2, false, false, false, 239)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ20);
                        }
                    }
                    e23.l lVar11 = (e23.l) objQ20;
                    boolean zB4 = mVar8.B(p1Var3);
                    Object objQ21 = mVar8.q();
                    if (zB4) {
                        objQ21 = new vd0.d(p1Var3, 29);
                        mVar8.K(objQ21);
                    } else {
                        aVar2.getClass();
                        if (objQ21 == m.a.f135155b) {
                            objQ21 = new vd0.d(p1Var3, 29);
                            mVar8.K(objQ21);
                        }
                    }
                    ci0.d.a(dateTimeK2, dVar4, z17, z18, iVar3, lVar9, lVar10, lVar11, (e23.l) objQ21, mVar8, 64 | (tf0.i.f164439d << 12));
                } else {
                    mVar8.e();
                }
                break;
            default:
                f fVar7 = (f) obj10;
                yd1.b bVar2 = (yd1.b) obj9;
                e eVar = (e) obj8;
                o82.a aVar13 = (o82.a) obj7;
                e23.a aVar14 = (e23.a) obj6;
                u82.f fVar8 = (u82.f) obj2;
                m mVar9 = (m) obj3;
                int iC = vb.h.c((Integer) obj4, (t) obj, fVar8);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar9.B(fVar8) : mVar9.r(fVar8) ? 32 : 16;
                }
                if (mVar9.n(iC & 1, (iC & 145) != 144)) {
                    x1 x1Var10 = n.f135158a;
                    boolean zR17 = mVar9.r(eVar);
                    Object objQ22 = mVar9.q();
                    if (zR17) {
                        objQ22 = new pq1.g(eVar, i17);
                        mVar9.K(objQ22);
                    } else {
                        aVar2.getClass();
                        if (objQ22 == m.a.f135155b) {
                            objQ22 = new pq1.g(eVar, i17);
                            mVar9.K(objQ22);
                        }
                    }
                    xq1.j.b(fVar7, bVar2, (e23.l) objQ22, z3.f.c(-2011350228, new g52.p(fVar8, aVar13, aVar14, i19), mVar9), mVar9, 3072);
                } else {
                    mVar9.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(u1 u1Var, Object obj, Object obj2, Object obj3, m0 m0Var, int i14) {
        this.f176111a = i14;
        this.f176116f = u1Var;
        this.f176115e = obj;
        this.f176112b = obj2;
        this.f176113c = obj3;
        this.f176114d = m0Var;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f176111a = i14;
        this.f176116f = obj;
        this.f176115e = obj2;
        this.f176114d = obj3;
        this.f176112b = obj4;
        this.f176113c = obj5;
    }

    public /* synthetic */ a(i iVar, e23.a aVar, DashboardRoute dashboardRoute, m0 m0Var, z zVar) {
        this.f176111a = 1;
        this.f176116f = iVar;
        this.f176112b = aVar;
        this.f176113c = dashboardRoute;
        this.f176114d = m0Var;
        this.f176115e = zVar;
    }
}
