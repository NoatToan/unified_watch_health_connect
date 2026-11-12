package sg2;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.s0;
import c2.c3;
import c2.k3;
import c2.n3;
import c2.p3;
import c2.q3;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import c22.o2;
import c22.x0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import ew1.v1;
import f5.z0;
import h5.e0;
import i3.mh;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.m3;
import ky0.w;
import l72.c1;
import l72.f0;
import l72.h3;
import l72.i3;
import l72.p2;
import lc.m0;
import o4.m1;
import p005kotlin.Unit;
import p13.j0;
import p13.t0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import sk0.l0;
import sk0.l1;
import sk0.n0;
import t70.a1;
import u1.a2;
import ug2.b0;
import ug2.q0;
import ug2.r0;
import vy0.a0;
import vy0.x;
import w51.h0;
import w51.o0;
import w51.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f159234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f159235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f159236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f159237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f159238f;

    public /* synthetic */ g(l90.b bVar, d90.b bVar2, e23.a aVar, e23.l lVar, e23.a aVar2, int i14) {
        this.f159233a = 10;
        this.f159234b = bVar;
        this.f159235c = bVar2;
        this.f159237e = aVar;
        this.f159236d = lVar;
        this.f159238f = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    private final Object a(Object obj, Object obj2) {
        u4.d dVarA;
        x3 x3Var = (x3) this.f159234b;
        r0 r0Var = (r0) this.f159235c;
        e23.l lVar = (e23.l) this.f159236d;
        x3 x3Var2 = (x3) this.f159237e;
        x3 x3Var3 = (x3) this.f159238f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String str = (String) x3Var2.getF182175a();
            e23.a aVar = null;
            if (!((Boolean) x3Var3.getF182175a()).booleanValue() || q0.d(x3Var)) {
                int i15 = b3.a.f15501a;
                dVarA = c3.a.a();
            } else {
                dVarA = null;
            }
            if (!((Boolean) x3Var3.getF182175a()).booleanValue() || q0.d(x3Var)) {
                mVar.C(1086417807);
                boolean zB = mVar.B(x3Var) | mVar.r(r0Var) | mVar.B(lVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new b0(r0Var, i14, lVar, x3Var);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new b0(r0Var, i14, lVar, x3Var);
                        mVar.K(objQ);
                    }
                }
                aVar = (e23.a) objQ;
                mVar.f();
            } else {
                mVar.C(1086764076);
                mVar.f();
            }
            h3.e(dVarA, str, null, null, aVar, null, null, mVar, 0, 108);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    private final Object b(Object obj, Object obj2) {
        String str = (String) this.f159234b;
        u4.d dVar = (u4.d) this.f159235c;
        e23.a aVar = (e23.a) this.f159237e;
        i3 i3Var = (i3) this.f159236d;
        e23.l lVar = (e23.l) this.f159238f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = mVar.B(aVar);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new ux1.g(aVar, 2);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ux1.g(aVar, 2);
                    mVar.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            i53.f fVarA = i53.a.a(i3Var);
            boolean zB2 = mVar.B(lVar);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new ta0.j(lVar, 17);
                mVar.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ta0.j(lVar, 17);
                    mVar.K(objQ2);
                }
            }
            z02.f.d(str, null, dVar, aVar3, fVarA, null, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 82);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0283  */
    private final Object c(Object obj, Object obj2) {
        Object lVar;
        h5.g.a.C1623g c1623g;
        p1 p1Var;
        int i14;
        String strH;
        p1 p1Var2 = (p1) this.f159234b;
        List list = (List) this.f159235c;
        pe0.d dVar = (pe0.d) this.f159236d;
        p1 p1Var3 = (p1) this.f159237e;
        e23.l lVar2 = (e23.l) this.f159238f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = c2.l.D(aVar);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarD, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, mVar);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            u uVar = u.f22885a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.g.a aVar3 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar3, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(aVar, mVar);
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
            b4.c(eVar, zVarA, mVar);
            b4.c(c1623g2, i2VarX2, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            h4.r rVarA = c2.b0.f22601a.a(aVar, 1.0f, true);
            boolean zB = mVar.B(p1Var2) | mVar.r(list) | mVar.B(dVar);
            Object objQ = mVar.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zB) {
                c1623g = c1623g2;
                p1Var = p1Var3;
                i14 = 0;
                lVar = new t42.l(list, p1Var2, dVar, p1Var, 13);
                mVar.K(lVar);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    c1623g = c1623g2;
                    p1Var = p1Var3;
                    i14 = 0;
                    lVar = new t42.l(list, p1Var2, dVar, p1Var, 13);
                    mVar.K(lVar);
                } else {
                    lVar = objQ;
                    c1623g = c1623g2;
                    p1Var = p1Var3;
                    i14 = 0;
                }
            }
            p1 p1Var4 = p1Var;
            e2.c.b(rVarA, null, null, null, null, null, false, null, (e23.l) lVar, mVar, 0, 510);
            h4.r rVarE = u1.n.e(aVar, fb1.c.z(d92.b.f58623a, mVar), m1.f128891a);
            z zVarA2 = y.a(kVar, aVar3, mVar, i14);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            h4.r rVarC3 = h4.k.c(rVarE, mVar);
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
            b4.c(eVar, zVarA2, mVar);
            b4.c(c1623g, i2VarX3, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                v.h.z(iHashCode3, mVar, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, mVar);
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.O8);
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            h4.r rVarB = c2.l.B(rVarF, f14, f14, f14, eVar2.f97918c);
            d6.h.f57752b.getClass();
            mh.c(strW, rVarB, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, null, mVar, 0, 0, 261116);
            f0 f0Var = f0.f110999a;
            if (((i53.c) p1Var4.getF182175a()).isEmpty()) {
                strH = sn.a.h(mVar, 674673030, R.string.lbl_select_snapshot, mVar);
            } else {
                mVar.C(674537126);
                strH = gl1.y.Q(mVar, R.string.lbl_select_snapshot) + " (" + ((i53.c) p1Var4.getF182175a()).size() + ")";
                mVar.f();
            }
            String str = strH;
            h4.r rVarY = c2.l.y(x2.f(aVar, 1.0f), f14);
            boolean zB2 = mVar.B(lVar2);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new v1(lVar2, p1Var4, 25);
                mVar.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new v1(lVar2, p1Var4, 25);
                    mVar.K(objQ2);
                }
            }
            f0Var.d(3072, 1, (e23.a) objQ2, rVarY, str, mVar, null, true);
            mVar.y();
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0111  */
    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d4  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj, Object obj2) {
        m4.q qVar = (m4.q) this.f159234b;
        m3 m3Var = (m3) this.f159235c;
        p1 p1Var = (p1) this.f159236d;
        final e23.l lVar = (e23.l) this.f159237e;
        final a0 a0Var = (a0) this.f159238f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        final int i14 = 1;
        final int i15 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (((x) p1Var.getF182175a()).f180777b) {
                return Unit.INSTANCE;
            }
            h4.r rVarP = c2.l.p(a2.b(x2.f(h4.r.S, 1.0f), a2.a(mVar), true));
            Unit unit = Unit.INSTANCE;
            boolean zR = mVar.r(qVar) | mVar.B(m3Var);
            Object objQ = mVar.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new vy0.k.d(qVar, m3Var);
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new vy0.k.d(qVar, m3Var);
                    mVar.K(objQ);
                }
            }
            h4.r rVarB = s0.b(rVarP, unit, (PointerInputEventHandler) objQ);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarB, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            vy0.q qVar2 = ((x) p1Var.getF182175a()).f180779d;
            if (qVar2 instanceof vy0.q.a) {
                mVar.C(2137379918);
                List<com.garmin.android.apps.connectmobile.navigation.more.b> list = ((vy0.q.a) qVar2).f180765a;
                boolean z14 = ((x) p1Var.getF182175a()).f180778c;
                boolean zB = mVar.B(lVar);
                Object objQ2 = mVar.q();
                if (zB) {
                    objQ2 = new ta0.j(lVar, 20);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ta0.j(lVar, 20);
                        mVar.K(objQ2);
                    }
                }
                com.garmin.android.apps.connectmobile.navigation.more.a.a(b0Var, list, z14, (e23.l) objQ2, mVar, 6);
                mVar.f();
            } else if (qVar2 instanceof vy0.q.c) {
                mVar.C(2137727335);
                List<vy0.e0> list2 = ((vy0.q.c) qVar2).f180767a;
                if (list2.isEmpty()) {
                    mVar.C(2137816026);
                    vy0.f0.a(((x) p1Var.getF182175a()).f180776a.f180720b, mVar, 0);
                    mVar.f();
                } else {
                    mVar.C(2137941080);
                    boolean z15 = ((x) p1Var.getF182175a()).f180778c;
                    boolean zR2 = mVar.r(a0Var) | mVar.B(lVar);
                    Object objQ3 = mVar.q();
                    if (zR2) {
                        objQ3 = new e23.l() { // from class: vy0.j
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                com.garmin.android.apps.connectmobile.navigation.more.b bVar2 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj3;
                                switch (i15) {
                                    case 0:
                                        bVar2.getClass();
                                        String strC = bVar2.c();
                                        a0 a0Var2 = a0Var;
                                        ge1.b.T(androidx.lifecycle.v1.a(a0Var2), null, null, new y(a0Var2, strC, null), 3);
                                        lVar.invoke(bVar2);
                                        break;
                                    default:
                                        bVar2.getClass();
                                        String strC2 = bVar2.c();
                                        a0 a0Var3 = a0Var;
                                        ge1.b.T(androidx.lifecycle.v1.a(a0Var3), null, null, new y(a0Var3, strC2, null), 3);
                                        ge1.b.T(androidx.lifecycle.v1.a(a0Var3), null, null, new b0(a0Var3, null), 3);
                                        lVar.invoke(bVar2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.l() { // from class: vy0.j
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    com.garmin.android.apps.connectmobile.navigation.more.b bVar2 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj3;
                                    switch (i15) {
                                        case 0:
                                            bVar2.getClass();
                                            String strC = bVar2.c();
                                            a0 a0Var2 = a0Var;
                                            ge1.b.T(androidx.lifecycle.v1.a(a0Var2), null, null, new y(a0Var2, strC, null), 3);
                                            lVar.invoke(bVar2);
                                            break;
                                        default:
                                            bVar2.getClass();
                                            String strC2 = bVar2.c();
                                            a0 a0Var3 = a0Var;
                                            ge1.b.T(androidx.lifecycle.v1.a(a0Var3), null, null, new y(a0Var3, strC2, null), 3);
                                            ge1.b.T(androidx.lifecycle.v1.a(a0Var3), null, null, new b0(a0Var3, null), 3);
                                            lVar.invoke(bVar2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ3);
                        }
                    }
                    vy0.f0.c(b0Var, list2, z15, (e23.l) objQ3, mVar, 6);
                    mVar.f();
                }
                mVar.f();
            } else {
                if (!(qVar2 instanceof vy0.q.b)) {
                    throw n23.j.m(mVar, 900230413);
                }
                mVar.C(2138449511);
                List<com.garmin.android.apps.connectmobile.navigation.more.b> list3 = ((vy0.q.b) qVar2).f180766a;
                if (list3.isEmpty()) {
                    mVar.C(2138550106);
                    vy0.f0.a(((x) p1Var.getF182175a()).f180776a.f180720b, mVar, 0);
                    mVar.f();
                } else {
                    mVar.C(2138674788);
                    boolean zR3 = mVar.r(a0Var) | mVar.B(lVar);
                    Object objQ4 = mVar.q();
                    if (zR3) {
                        objQ4 = new e23.l() { // from class: vy0.j
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                com.garmin.android.apps.connectmobile.navigation.more.b bVar2 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj3;
                                switch (i14) {
                                    case 0:
                                        bVar2.getClass();
                                        String strC = bVar2.c();
                                        a0 a0Var2 = a0Var;
                                        ge1.b.T(androidx.lifecycle.v1.a(a0Var2), null, null, new y(a0Var2, strC, null), 3);
                                        lVar.invoke(bVar2);
                                        break;
                                    default:
                                        bVar2.getClass();
                                        String strC2 = bVar2.c();
                                        a0 a0Var3 = a0Var;
                                        ge1.b.T(androidx.lifecycle.v1.a(a0Var3), null, null, new y(a0Var3, strC2, null), 3);
                                        ge1.b.T(androidx.lifecycle.v1.a(a0Var3), null, null, new b0(a0Var3, null), 3);
                                        lVar.invoke(bVar2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new e23.l() { // from class: vy0.j
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    com.garmin.android.apps.connectmobile.navigation.more.b bVar2 = (com.garmin.android.apps.connectmobile.navigation.more.b) obj3;
                                    switch (i14) {
                                        case 0:
                                            bVar2.getClass();
                                            String strC = bVar2.c();
                                            a0 a0Var2 = a0Var;
                                            ge1.b.T(androidx.lifecycle.v1.a(a0Var2), null, null, new y(a0Var2, strC, null), 3);
                                            lVar.invoke(bVar2);
                                            break;
                                        default:
                                            bVar2.getClass();
                                            String strC2 = bVar2.c();
                                            a0 a0Var3 = a0Var;
                                            ge1.b.T(androidx.lifecycle.v1.a(a0Var3), null, null, new y(a0Var3, strC2, null), 3);
                                            ge1.b.T(androidx.lifecycle.v1.a(a0Var3), null, null, new b0(a0Var3, null), 3);
                                            lVar.invoke(bVar2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ4);
                        }
                    }
                    vy0.f0.b(b0Var, list3, (e23.l) objQ4, mVar, 6);
                    mVar.f();
                }
                mVar.f();
            }
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0057  */
    /* JADX WARN: Code duplicated, block: B:17:0x0083  */
    private final Object e(Object obj, Object obj2) {
        CustomCombinedChart customCombinedChart = (CustomCombinedChart) this.f159234b;
        z31.b bVar = (z31.b) this.f159235c;
        x3 x3Var = (x3) this.f159236d;
        b41.b bVar2 = (b41.b) this.f159237e;
        String str = (String) this.f159238f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 290);
            boolean zR = mVar.r(customCombinedChart);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new hn1.j(customCombinedChart, 8);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new hn1.j(customCombinedChart, 8);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = mVar.r(bVar) | mVar.B(x3Var) | mVar.r(bVar2) | mVar.B(str);
            Object objQ2 = mVar.q();
            if (zR2) {
                t42.l lVar2 = new t42.l(bVar, bVar2, str, x3Var, 19);
                mVar.K(lVar2);
                objQ2 = lVar2;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    t42.l lVar3 = new t42.l(bVar, bVar2, str, x3Var, 19);
                    mVar.K(lVar3);
                    objQ2 = lVar3;
                }
            }
            p002j6.c.b(lVar, rVarH, (e23.l) objQ2, mVar, 48, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        x11.f fVar = (x11.f) this.f159234b;
        e23.a aVar = (e23.a) this.f159237e;
        e23.l lVar = (e23.l) this.f159235c;
        v21.e eVar = (v21.e) this.f159236d;
        e23.l lVar2 = (e23.l) this.f159238f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.c(z3.f.c(1927507671, new w11.i.a(aVar), mVar), z3.f.c(-214705507, new ku1.l(fVar, lVar, eVar, lVar2, fVar.f188408d, 25), mVar), mVar, 54);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        w11.r.b((v21.e) this.f159235c, (v11.b.e) this.f159236d, (e23.a) this.f159237e, (e23.l) this.f159238f, (h4.r) this.f159234b, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    private final Object h(Object obj, Object obj2) {
        CustomCombinedChart customCombinedChart = (CustomCombinedChart) this.f159234b;
        z31.b bVar = (z31.b) this.f159235c;
        x3 x3Var = (x3) this.f159236d;
        b41.b bVar2 = (b41.b) this.f159237e;
        w31.h hVar = (w31.h) this.f159238f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarH = x2.h(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), 290);
            boolean zR = mVar.r(customCombinedChart);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new hn1.j(customCombinedChart, 10);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new hn1.j(customCombinedChart, 10);
                    mVar.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR2 = mVar.r(bVar) | mVar.B(x3Var) | mVar.r(bVar2) | mVar.r(hVar);
            Object objQ2 = mVar.q();
            if (zR2) {
                t42.l lVar2 = new t42.l(bVar, bVar2, hVar, x3Var, 24);
                mVar.K(lVar2);
                objQ2 = lVar2;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    t42.l lVar3 = new t42.l(bVar, bVar2, hVar, x3Var, 24);
                    mVar.K(lVar3);
                    objQ2 = lVar3;
                }
            }
            p002j6.c.b(lVar, rVarH, (e23.l) objQ2, mVar, 0, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    private final Object i(Object obj, Object obj2) {
        e23.a aVar = (e23.a) this.f159237e;
        h0 h0Var = (h0) this.f159234b;
        Context context = (Context) this.f159235c;
        p1 p1Var = (p1) this.f159236d;
        p1 p1Var2 = (p1) this.f159238f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(mVar, R.string.lbl_auto_detected_activities);
            boolean zB = mVar.B(aVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new w51.j(aVar, 1);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w51.j(aVar, 1);
                    mVar.K(objQ);
                }
            }
            z02.f.c(196608, 22, null, (e23.a) objQ, z3.f.c(-426796730, new w21.d((Object) h0Var, (Object) context, (Object) p1Var, (Object) p1Var2, 1), mVar), strQ, mVar, null);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x008d  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:26:0x010c  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object j(Object obj, Object obj2) {
        h0 h0Var = (h0) this.f159234b;
        p1 p1Var = (p1) this.f159235c;
        p1 p1Var2 = (p1) this.f159236d;
        Context context = (Context) this.f159237e;
        w wVar = (w) this.f159238f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (((w51.w) p1Var2.getF182175a()).f182446b) {
                mVar.C(-2059484072);
                mVar.f();
            } else {
                mVar.C(-2062733213);
                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarE = u1.n.e(c2.l.A(rVarD, j92.b.f97899b.f97920e, 0.0f, 2), d92.b.a(mVar).c().b(), m1.f128891a);
                boolean z14 = ((w51.w) p1Var2.getF182175a()).f182450f;
                boolean zR = mVar.r(h0Var);
                Object objQ = mVar.q();
                p3.m.a aVar = p3.m.f135153a;
                if (zR) {
                    objQ = new w51.l(h0Var, 0);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new w51.l(h0Var, 0);
                        mVar.K(objQ);
                    }
                }
                v.d(3072, (e23.a) objQ, rVarE, mVar, z3.f.c(-321397950, new w21.d(h0Var, p1Var2, context, wVar), mVar), z14);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    mVar.C(-2060172892);
                    c1 c1Var = c1.f110940a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_discard_all_activities);
                    String strQ2 = gl1.y.Q(mVar, R.string.msg_discard_all_activities);
                    String strQ3 = gl1.y.Q(mVar, R.string.lbl_discard);
                    String strQ4 = gl1.y.Q(mVar, R.string.common_cancel);
                    boolean zB = mVar.B(p1Var) | mVar.r(h0Var);
                    Object objQ2 = mVar.q();
                    if (zB) {
                        objQ2 = new vv0.n(13, h0Var, p1Var);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new vv0.n(13, h0Var, p1Var);
                            mVar.K(objQ2);
                        }
                    }
                    e23.a<Unit> aVar2 = (e23.a) objQ2;
                    boolean zB2 = mVar.B(p1Var);
                    Object objQ3 = mVar.q();
                    if (zB2) {
                        objQ3 = new vd0.c(p1Var, 29);
                        mVar.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new vd0.c(p1Var, 29);
                            mVar.K(objQ3);
                        }
                    }
                    c1Var.a(false, strQ, strQ2, null, null, strQ3, true, false, aVar2, strQ4, (e23.a) objQ3, mVar, 1572870, 0, SyslogConstants.LOG_LOCAL3);
                    mVar = mVar;
                    mVar.f();
                } else {
                    mVar.C(-2059493992);
                    mVar.f();
                }
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object k(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        o0.d((List) this.f159234b, (String) this.f159235c, (e23.q) this.f159236d, (e23.l) this.f159237e, (Long) this.f159238f, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2) {
        e23.a aVar = (e23.a) this.f159237e;
        lc.y yVar = (lc.y) this.f159234b;
        we1.d dVar = (we1.d) this.f159235c;
        p1 p1Var = (p1) this.f159236d;
        yd1.a aVar2 = (yd1.a) this.f159238f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(-1325165575, new ih0.q(3, aVar, yVar), mVar), null, null, null, z3.f.c(-902041995, new w21.d(yVar, dVar, p1Var, aVar2, 7), mVar), mVar, 196656, 29);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0311  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:151:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:154:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:158:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:160:0x0503  */
    /* JADX WARN: Code duplicated, block: B:161:0x0507  */
    /* JADX WARN: Code duplicated, block: B:164:0x0516  */
    /* JADX WARN: Code duplicated, block: B:168:0x0528  */
    /* JADX WARN: Code duplicated, block: B:171:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:172:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:175:0x0626  */
    /* JADX WARN: Code duplicated, block: B:176:0x0630  */
    /* JADX WARN: Code duplicated, block: B:178:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:198:0x0743  */
    /* JADX WARN: Code duplicated, block: B:203:0x0773  */
    /* JADX WARN: Code duplicated, block: B:236:0x0983  */
    /* JADX WARN: Code duplicated, block: B:241:0x09d4  */
    /* JADX WARN: Code duplicated, block: B:246:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:266:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:269:0x0ae8 A[LOOP:0: B:267:0x0ae2->B:269:0x0ae8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x0b79  */
    /* JADX WARN: Code duplicated, block: B:291:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:300:0x0c09  */
    /* JADX WARN: Code duplicated, block: B:309:0x0c25  */
    /* JADX WARN: Code duplicated, block: B:318:0x0c4b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0230  */
    /* JADX WARN: Code duplicated, block: B:76:0x0250  */
    /* JADX WARN: Code duplicated, block: B:81:0x0279  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        String string2;
        String string3;
        String string4;
        Collator collator;
        LinkedHashMap linkedHashMap;
        Iterator<T> it;
        h4.r.a aVar;
        h5.g.a.f fVar;
        j92.e eVar;
        float f14;
        h4.r.a aVar2;
        boolean zB;
        Object objQ;
        h5.g.a.f fVar2;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        int i14;
        s5.x0 x0Var;
        String str;
        String str2;
        int i15 = this.f159233a;
        p3.m.a aVar3 = p3.m.f135153a;
        int i16 = 2;
        Object obj3 = this.f159238f;
        Object obj4 = this.f159237e;
        Object obj5 = this.f159236d;
        Object obj6 = this.f159235c;
        Object obj7 = this.f159234b;
        switch (i15) {
            case 0:
                ((Integer) obj2).getClass();
                j.a((h4.r) obj7, (yg2.o) obj6, (yg2.h0) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                r.c((h4.r) obj7, (lt2.a) obj6, (ah2.e) obj5, (ag2.c.a) obj4, (String) obj3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                r.b((h4.r) obj7, (lt2.b) obj6, (ah2.e) obj5, (ag2.c.a) obj4, (zf2.d) obj3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 3:
                l0 l0Var = (l0) obj7;
                GearActivity.w wVar = (GearActivity.w) obj6;
                sk0.p0 p0Var = (sk0.p0) obj5;
                Context context = (Context) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                l0 l0Var2 = (l0) obj;
                List list = (List) obj2;
                l0Var2.getClass();
                list.getClass();
                if (l0Var2.equals(l0Var)) {
                    wVar.invoke();
                } else {
                    jk0.j jVarD = l0Var2.d();
                    i53.c<uk0.a> cVar = l0Var.f159722c;
                    ArrayList arrayList2 = new ArrayList(p13.y.r(cVar, 10));
                    Iterator<uk0.a> it3 = cVar.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(it3.next().f171795a);
                    }
                    i53.c<uk0.a> cVar2 = l0Var2.f159722c;
                    ArrayList arrayList3 = new ArrayList(p13.y.r(cVar2, 10));
                    Iterator<uk0.a> it4 = cVar2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(it4.next().f171795a);
                    }
                    p0Var.z4(context, jVarD, arrayList2, arrayList3, false, arrayList, l0Var2.f159727h, list);
                }
                return Unit.INSTANCE;
            case 4:
                GearActivity.w wVar2 = (GearActivity.w) obj6;
                sk0.q0 q0Var = (sk0.q0) obj5;
                Context context2 = (Context) obj4;
                jk0.x xVar = (jk0.x) obj3;
                n0 n0Var = (n0) obj;
                List<qk0.h> list2 = (List) obj2;
                n0Var.getClass();
                list2.getClass();
                if (n0Var.equals((n0) obj7)) {
                    wVar2.invoke();
                } else {
                    c80.u uVar = n0Var.f159762a;
                    String str3 = n0Var.f159763b;
                    if (str3 == null) {
                        string = null;
                    } else {
                        if (d53.w.J(str3)) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            string = d53.w.i0(str3).toString();
                        } else {
                            string = null;
                        }
                    }
                    String str4 = n0Var.f159764c;
                    if (str4 == null) {
                        string2 = null;
                    } else {
                        if (d53.w.J(str4)) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            string2 = d53.w.i0(str4).toString();
                        } else {
                            string2 = null;
                        }
                    }
                    String str5 = n0Var.f159765d;
                    if (str5 == null) {
                        string3 = null;
                    } else {
                        if (d53.w.J(str5)) {
                            str5 = null;
                        }
                        if (str5 != null) {
                            string3 = d53.w.i0(str5).toString();
                        } else {
                            string3 = null;
                        }
                    }
                    b63.o oVar = n0Var.f159766e;
                    c80.w wVar3 = n0Var.f159767f;
                    Double d14 = n0Var.f159768g;
                    Long l14 = n0Var.f159769h;
                    b63.o oVar2 = n0Var.f159770i;
                    String str6 = n0Var.f159773l;
                    if (str6 == null) {
                        string4 = null;
                    } else {
                        if (d53.w.J(str6)) {
                            str6 = null;
                        }
                        if (str6 != null) {
                            string4 = d53.w.i0(str6).toString();
                        } else {
                            string4 = null;
                        }
                    }
                    i53.c<am.x0> cVar3 = n0Var.f159771j;
                    ArrayList arrayList4 = new ArrayList(p13.y.r(cVar3, 10));
                    Iterator<am.x0> it5 = cVar3.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(new jk0.g(it5.next().f4358a, Boolean.TRUE, (Boolean) null, 4, (p005kotlin.jvm.internal.j) null));
                    }
                    jk0.x xVarB = jk0.x.b(xVar, uVar, oVar, wVar3, arrayList4, null, string3, string, string2, string4, null, oVar2, d14, l14, null, null, 8358000);
                    List<jk0.n> list3 = xVar.f99371w;
                    if (list3 == null) {
                        list3 = j0.f134944a;
                    }
                    q0Var.x4(context2, xVarB, false, list3, n0Var.f159774m, list2);
                }
                return Unit.INSTANCE;
            case 5:
                p1 p1Var = (p1) obj7;
                p1 p1Var2 = (p1) obj6;
                e23.a aVar4 = (e23.a) obj4;
                p1 p1Var3 = (p1) obj5;
                Context context3 = (Context) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean zB2 = mVar.B(((sk0.m1) p1Var3.getF182175a()).f159758d);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        collator = Collator.getInstance();
                        collator.setStrength(1);
                        i53.d<c80.u, i53.c<uk0.a>> dVar = ((sk0.m1) p1Var3.getF182175a()).f159758d;
                        linkedHashMap = new LinkedHashMap(t0.a(dVar.size()));
                        it = dVar.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            linkedHashMap.put(entry.getKey(), i53.a.e(p13.h0.N0((Iterable) entry.getValue(), new l1.d(collator, context3))));
                        }
                        TreeMap treeMap = new TreeMap(new l1.c());
                        treeMap.putAll(linkedHashMap);
                        objQ2 = i53.a.g(treeMap);
                        mVar.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            collator = Collator.getInstance();
                            collator.setStrength(1);
                            i53.d<c80.u, i53.c<uk0.a>> dVar2 = ((sk0.m1) p1Var3.getF182175a()).f159758d;
                            linkedHashMap = new LinkedHashMap(t0.a(dVar2.size()));
                            it = dVar2.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it.next();
                                linkedHashMap.put(entry2.getKey(), i53.a.e(p13.h0.N0((Iterable) entry2.getValue(), new l1.d(collator, context3))));
                            }
                            TreeMap treeMap2 = new TreeMap(new l1.c());
                            treeMap2.putAll(linkedHashMap);
                            objQ2 = i53.a.g(treeMap2);
                            mVar.K(objQ2);
                        }
                    }
                    i53.d dVar3 = (i53.d) objQ2;
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    int i17 = k3.f22728a;
                    c3 c3VarB = q3.b(mVar);
                    p3.f22815b.getClass();
                    c2.x1 x1VarD = n3.d(c3VarB, p3.f22826m | p3.f22823j);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l1 l1VarC = n3.c(new c2.a(x1VarD, n3.b(0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7)), mVar);
                    boolean zR = mVar.r(dVar3) | mVar.B(p1Var) | mVar.B(p1Var2) | mVar.B(aVar4);
                    Object objQ3 = mVar.q();
                    if (zR) {
                        mt0.e0 e0Var = new mt0.e0(dVar3, p1Var, p1Var2, aVar4, 28);
                        mVar.K(e0Var);
                        objQ3 = e0Var;
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            mt0.e0 e0Var2 = new mt0.e0(dVar3, p1Var, p1Var2, aVar4, 28);
                            mVar.K(e0Var2);
                            objQ3 = e0Var2;
                        }
                    }
                    e2.c.b(rVarD, null, l1VarC, null, null, null, false, null, (e23.l) objQ3, mVar, 6, 506);
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                t21.k.a((u21.e0) obj7, (v21.e) obj6, (e23.l) obj5, (e23.l) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                u21.l0 l0Var3 = (u21.l0) obj7;
                v21.e eVar2 = (v21.e) obj6;
                e23.l lVar = (e23.l) obj5;
                e23.l lVar2 = (e23.l) obj4;
                e23.l lVar3 = (e23.l) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.r rVarB = a2.b(c2.l.p(c2.l.s(x2.c(aVar5, 1.0f))), a2.a(mVar2), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarB, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    p2 p2Var = p2.f111205a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(aVar5, 0.0f, eVar3.f97920e, 1);
                    String strQ = gl1.y.Q(mVar2, R.string.total_macronutrients);
                    int i18 = l0Var3.f168035h;
                    String strQ2 = gl1.y.Q(mVar2, R.string.unit_g);
                    Double dValueOf = Double.valueOf(l0Var3.f168036i);
                    eVar2.getClass();
                    strQ2.getClass();
                    p2Var.h(strQ, eVar2.f175325b.a(R.string.string_space_bullet_string_pattern, eVar2.g(Double.valueOf(i18)), v21.e.d(eVar2, dValueOf, strQ2, 4)), null, rVarA, null, false, false, null, z3.f.c(-103303472, new t21.l(0, b0Var, l0Var3), mVar2), null, null, mVar2, 100663296, 0, 1780);
                    if (l0Var3.f168037j) {
                        mVar2.C(-392903163);
                        mVar2.f();
                    } else {
                        mVar2.C(-393249557);
                        h4.r rVarC3 = c2.l.C(c2.l.A(aVar5, eVar3.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
                        String strQ3 = gl1.y.Q(mVar2, R.string.total_macronutrients_rule);
                        d92.b.f58624b.getClass();
                        mh.c(strQ3, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                        mVar2.f();
                    }
                    h4.r rVarC4 = c2.l.C(aVar5, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
                    String strQ4 = gl1.y.Q(mVar2, R.string.protein);
                    String strD = v21.e.d(eVar2, Double.valueOf(l0Var3.f168029b), gl1.y.Q(mVar2, R.string.unit_g), 4);
                    float f15 = l0Var3.f168030c;
                    boolean zB3 = mVar2.B(lVar);
                    Object objQ4 = mVar2.q();
                    if (zB3) {
                        objQ4 = new qe2.c(lVar, 25);
                        mVar2.K(objQ4);
                    } else {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new qe2.c(lVar, 25);
                            mVar2.K(objQ4);
                        }
                    }
                    t21.m.b(rVarC4, strQ4, strD, f15, (e23.l) objQ4, mVar2, 0);
                    h4.r rVarC5 = c2.l.C(aVar5, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
                    String strQ5 = gl1.y.Q(mVar2, R.string.fat);
                    String strD2 = v21.e.d(eVar2, Double.valueOf(l0Var3.f168031d), gl1.y.Q(mVar2, R.string.unit_g), 4);
                    float f16 = l0Var3.f168032e;
                    boolean zB4 = mVar2.B(lVar2);
                    Object objQ5 = mVar2.q();
                    if (zB4) {
                        objQ5 = new qe2.c(lVar2, 26);
                        mVar2.K(objQ5);
                    } else {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new qe2.c(lVar2, 26);
                            mVar2.K(objQ5);
                        }
                    }
                    t21.m.b(rVarC5, strQ5, strD2, f16, (e23.l) objQ5, mVar2, 0);
                    h4.r rVarC6 = c2.l.C(aVar5, 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
                    String strQ6 = gl1.y.Q(mVar2, R.string.carbs);
                    String strD3 = v21.e.d(eVar2, Double.valueOf(l0Var3.f168033f), gl1.y.Q(mVar2, R.string.unit_g), 4);
                    float f17 = l0Var3.f168034g;
                    boolean zB5 = mVar2.B(lVar3);
                    Object objQ6 = mVar2.q();
                    if (zB5) {
                        objQ6 = new qe2.c(lVar3, 27);
                        mVar2.K(objQ6);
                    } else {
                        aVar3.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new qe2.c(lVar3, 27);
                            mVar2.K(objQ6);
                        }
                    }
                    t21.m.b(rVarC6, strQ6, strD3, f17, (e23.l) objQ6, mVar2, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                t21.h0.a((h4.r) obj7, (u21.i) obj6, (e23.l) obj5, (e23.p) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                CustomCombinedChart customCombinedChart = (CustomCombinedChart) obj7;
                sz.a aVar7 = (sz.a) obj6;
                q42.g gVar = (q42.g) obj5;
                l42.d dVar4 = (l42.d) obj4;
                Context context4 = (Context) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarH = x2.h(c2.l.A(x2.f(u1.n.e(h4.r.S, vb.h.e(d92.b.f58623a, mVar3), m1.f128891a), 1.0f), 16, 0.0f, 2), 330);
                    boolean zR2 = mVar3.r(customCombinedChart);
                    Object objQ7 = mVar3.q();
                    if (zR2) {
                        objQ7 = new hn1.j(customCombinedChart, 6);
                        mVar3.K(objQ7);
                    } else {
                        aVar3.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new hn1.j(customCombinedChart, 6);
                            mVar3.K(objQ7);
                        }
                    }
                    e23.l lVar4 = (e23.l) objQ7;
                    boolean zR3 = mVar3.r(aVar7) | mVar3.r(gVar) | mVar3.k(dVar4.ordinal()) | mVar3.r(context4);
                    Object objQ8 = mVar3.q();
                    if (zR3) {
                        objQ8 = new t42.l(aVar7, gVar, context4, dVar4, 0);
                        mVar3.K(objQ8);
                    } else {
                        aVar3.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new t42.l(aVar7, gVar, context4, dVar4, 0);
                            mVar3.K(objQ8);
                        }
                    }
                    p002j6.c.b(lVar4, rVarH, (e23.l) objQ8, mVar3, 0, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ta0.l0.b((l90.b) obj7, (d90.b) obj6, (e23.a) obj4, (e23.l) obj5, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                d90.b bVar2 = (d90.b) obj7;
                o90.a aVar9 = (o90.a) obj6;
                e23.l lVar5 = (e23.l) obj5;
                e23.a aVar10 = (e23.a) obj4;
                String str7 = (String) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    h4.r rVarD2 = x2.d(aVar11, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar12 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    z zVarA3 = y.a(kVar2, aVar12, mVar4, 48);
                    int iHashCode3 = Long.hashCode(mVar4.getU());
                    i2 i2VarX3 = mVar4.x();
                    h4.r rVarC7 = h4.k.c(rVarD2, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar13);
                    } else {
                        mVar4.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, zVarA3, mVar4);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar4);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar4.getT()) {
                        aVar = aVar11;
                    } else {
                        aVar = aVar11;
                        if (!p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC7, mVar4);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        d90.c cVar4 = bVar2.f58427d;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        eVar = j92.b.f97899b;
                        f14 = eVar.f97920e;
                        aVar2 = aVar;
                        h4.r rVarC8 = x2.c(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), 0.33f);
                        zB = mVar4.B(lVar5);
                        objQ = mVar4.q();
                        if (zB) {
                            fVar2 = fVar;
                        } else {
                            aVar3.getClass();
                            fVar2 = fVar;
                            if (objQ == p3.m.a.f135155b) {
                            }
                            ta0.l0.a(cVar4, aVar9, x80.c.a(rVarC8, (e23.l) objQ), mVar4, 0);
                            h4.r rVarB2 = a2.b(c2.l.A(b0Var2.a(aVar2, 1.0f, true), f14, 0.0f, 2), a2.a(mVar4), true);
                            zVarA = y.a(kVar2, aVar12, mVar4, 48);
                            iHashCode = Long.hashCode(mVar4.getU());
                            i2VarX = mVar4.x();
                            rVarC = h4.k.c(rVarB2, mVar4);
                            if (mVar4.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar4.z();
                            if (mVar4.getT()) {
                                mVar4.M(aVar13);
                            } else {
                                mVar4.c();
                            }
                            b4.c(eVar4, zVarA, mVar4);
                            b4.c(c1623g, i2VarX, mVar4);
                            if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar4, iHashCode, bVar3);
                            }
                            b4.c(fVar2, rVarC, mVar4);
                            String strQ7 = gl1.y.Q(mVar4, R.string.lbl_pairing_your_device);
                            h4.r rVarC9 = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97930g, mVar4);
                            d6.h.f57752b.getClass();
                            i14 = d6.h.f57755e;
                            mh.c(strQ7, rVarC9, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB, mVar4, 0, 0, 130044);
                            mh.c(g22.n.g(str7), c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, mVar4), mVar4, 0, 0, 130044);
                            String str8 = bVar2.f58424a;
                            h4.r rVarC10 = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                            x0Var = j92.f.f97931h;
                            mh.c(str8, rVarC10, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                            str = bVar2.f58425b;
                            if (str == null) {
                                mVar4.C(717671449);
                                mVar4.f();
                            } else {
                                mVar4.C(717671450);
                                mh.c(str, c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                                Unit unit = Unit.INSTANCE;
                                mVar4.f();
                            }
                            str2 = bVar2.f58426c;
                            if (str2 == null) {
                                mVar4.C(718115989);
                                mVar4.f();
                            } else {
                                mVar4.C(718115990);
                                mh.c(str2, c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                                Unit unit2 = Unit.INSTANCE;
                                mVar4.f();
                            }
                            mVar4.y();
                            da0.b.a(c2.l.y(aVar2, f14), gl1.y.Q(mVar4, R.string.lbl_start), aVar10, false, null, null, false, null, null, false, mVar4, 0, 1016);
                            mVar4.y();
                        }
                        objQ = new ta0.j(lVar5, 4);
                        mVar4.K(objQ);
                        ta0.l0.a(cVar4, aVar9, x80.c.a(rVarC8, (e23.l) objQ), mVar4, 0);
                        h4.r rVarB3 = a2.b(c2.l.A(b0Var2.a(aVar2, 1.0f, true), f14, 0.0f, 2), a2.a(mVar4), true);
                        zVarA = y.a(kVar2, aVar12, mVar4, 48);
                        iHashCode = Long.hashCode(mVar4.getU());
                        i2VarX = mVar4.x();
                        rVarC = h4.k.c(rVarB3, mVar4);
                        if (mVar4.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar13);
                        } else {
                            mVar4.c();
                        }
                        b4.c(eVar4, zVarA, mVar4);
                        b4.c(c1623g, i2VarX, mVar4);
                        if (mVar4.getT()) {
                            v.h.z(iHashCode, mVar4, iHashCode, bVar3);
                        } else {
                            v.h.z(iHashCode, mVar4, iHashCode, bVar3);
                        }
                        b4.c(fVar2, rVarC, mVar4);
                        String strQ8 = gl1.y.Q(mVar4, R.string.lbl_pairing_your_device);
                        h4.r rVarC11 = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97930g, mVar4);
                        d6.h.f57752b.getClass();
                        i14 = d6.h.f57755e;
                        mh.c(strQ8, rVarC11, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB2, mVar4, 0, 0, 130044);
                        mh.c(g22.n.g(str7), c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, mVar4), mVar4, 0, 0, 130044);
                        String str9 = bVar2.f58424a;
                        h4.r rVarC12 = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                        x0Var = j92.f.f97931h;
                        mh.c(str9, rVarC12, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                        str = bVar2.f58425b;
                        if (str == null) {
                            mVar4.C(717671449);
                            mVar4.f();
                        } else {
                            mVar4.C(717671450);
                            mh.c(str, c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                            Unit unit3 = Unit.INSTANCE;
                            mVar4.f();
                        }
                        str2 = bVar2.f58426c;
                        if (str2 == null) {
                            mVar4.C(718115989);
                            mVar4.f();
                        } else {
                            mVar4.C(718115990);
                            mh.c(str2, c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                            Unit unit4 = Unit.INSTANCE;
                            mVar4.f();
                        }
                        mVar4.y();
                        da0.b.a(c2.l.y(aVar2, f14), gl1.y.Q(mVar4, R.string.lbl_start), aVar10, false, null, null, false, null, null, false, mVar4, 0, 1016);
                        mVar4.y();
                    }
                    v.h.z(iHashCode3, mVar4, iHashCode3, bVar3);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC7, mVar4);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    d90.c cVar5 = bVar2.f58427d;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    eVar = j92.b.f97899b;
                    f14 = eVar.f97920e;
                    aVar2 = aVar;
                    h4.r rVarC13 = x2.c(c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13), 0.33f);
                    zB = mVar4.B(lVar5);
                    objQ = mVar4.q();
                    if (zB) {
                        aVar3.getClass();
                        fVar2 = fVar;
                        if (objQ == p3.m.a.f135155b) {
                        }
                        ta0.l0.a(cVar5, aVar9, x80.c.a(rVarC13, (e23.l) objQ), mVar4, 0);
                        h4.r rVarB4 = a2.b(c2.l.A(b0Var3.a(aVar2, 1.0f, true), f14, 0.0f, 2), a2.a(mVar4), true);
                        zVarA = y.a(kVar2, aVar12, mVar4, 48);
                        iHashCode = Long.hashCode(mVar4.getU());
                        i2VarX = mVar4.x();
                        rVarC = h4.k.c(rVarB4, mVar4);
                        if (mVar4.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar13);
                        } else {
                            mVar4.c();
                        }
                        b4.c(eVar4, zVarA, mVar4);
                        b4.c(c1623g, i2VarX, mVar4);
                        if (mVar4.getT()) {
                            v.h.z(iHashCode, mVar4, iHashCode, bVar3);
                        } else {
                            v.h.z(iHashCode, mVar4, iHashCode, bVar3);
                        }
                        b4.c(fVar2, rVarC, mVar4);
                        String strQ9 = gl1.y.Q(mVar4, R.string.lbl_pairing_your_device);
                        h4.r rVarC14 = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB3 = d92.c.b(j92.f.f97930g, mVar4);
                        d6.h.f57752b.getClass();
                        i14 = d6.h.f57755e;
                        mh.c(strQ9, rVarC14, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB3, mVar4, 0, 0, 130044);
                        mh.c(g22.n.g(str7), c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, mVar4), mVar4, 0, 0, 130044);
                        String str10 = bVar2.f58424a;
                        h4.r rVarC15 = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                        x0Var = j92.f.f97931h;
                        mh.c(str10, rVarC15, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                        str = bVar2.f58425b;
                        if (str == null) {
                            mVar4.C(717671449);
                            mVar4.f();
                        } else {
                            mVar4.C(717671450);
                            mh.c(str, c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                            Unit unit5 = Unit.INSTANCE;
                            mVar4.f();
                        }
                        str2 = bVar2.f58426c;
                        if (str2 == null) {
                            mVar4.C(718115989);
                            mVar4.f();
                        } else {
                            mVar4.C(718115990);
                            mh.c(str2, c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                            Unit unit6 = Unit.INSTANCE;
                            mVar4.f();
                        }
                        mVar4.y();
                        da0.b.a(c2.l.y(aVar2, f14), gl1.y.Q(mVar4, R.string.lbl_start), aVar10, false, null, null, false, null, null, false, mVar4, 0, 1016);
                        mVar4.y();
                    } else {
                        fVar2 = fVar;
                    }
                    objQ = new ta0.j(lVar5, 4);
                    mVar4.K(objQ);
                    ta0.l0.a(cVar5, aVar9, x80.c.a(rVarC13, (e23.l) objQ), mVar4, 0);
                    h4.r rVarB5 = a2.b(c2.l.A(b0Var3.a(aVar2, 1.0f, true), f14, 0.0f, 2), a2.a(mVar4), true);
                    zVarA = y.a(kVar2, aVar12, mVar4, 48);
                    iHashCode = Long.hashCode(mVar4.getU());
                    i2VarX = mVar4.x();
                    rVarC = h4.k.c(rVarB5, mVar4);
                    if (mVar4.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar13);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar4, zVarA, mVar4);
                    b4.c(c1623g, i2VarX, mVar4);
                    if (mVar4.getT()) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar3);
                    } else {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar3);
                    }
                    b4.c(fVar2, rVarC, mVar4);
                    String strQ10 = gl1.y.Q(mVar4, R.string.lbl_pairing_your_device);
                    h4.r rVarC16 = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB4 = d92.c.b(j92.f.f97930g, mVar4);
                    d6.h.f57752b.getClass();
                    i14 = d6.h.f57755e;
                    mh.c(strQ10, rVarC16, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, x0VarB4, mVar4, 0, 0, 130044);
                    mh.c(g22.n.g(str7), c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, mVar4), mVar4, 0, 0, 130044);
                    String str11 = bVar2.f58424a;
                    h4.r rVarC17 = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                    x0Var = j92.f.f97931h;
                    mh.c(str11, rVarC17, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                    str = bVar2.f58425b;
                    if (str == null) {
                        mVar4.C(717671449);
                        mVar4.f();
                    } else {
                        mVar4.C(717671450);
                        mh.c(str, c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                        Unit unit7 = Unit.INSTANCE;
                        mVar4.f();
                    }
                    str2 = bVar2.f58426c;
                    if (str2 == null) {
                        mVar4.C(718115989);
                        mVar4.f();
                    } else {
                        mVar4.C(718115990);
                        mh.c(str2, c2.l.C(x2.f(aVar2, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar4), mVar4, 0, 0, 130044);
                        Unit unit8 = Unit.INSTANCE;
                        mVar4.f();
                    }
                    mVar4.y();
                    da0.b.a(c2.l.y(aVar2, f14), gl1.y.Q(mVar4, R.string.lbl_start), aVar10, false, null, null, false, null, null, false, mVar4, 0, 1016);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 12:
                String str12 = (String) obj7;
                e23.a aVar14 = (e23.a) obj4;
                e23.l lVar6 = (e23.l) obj6;
                o90.a aVar15 = (o90.a) obj5;
                p1 p1Var4 = (p1) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (((tb0.u) p1Var4.getF182175a()).f163711a) {
                        mVar5.C(-1984027101);
                        mVar5.f();
                    } else if (((tb0.u) p1Var4.getF182175a()).f163713c != null) {
                        mVar5.C(-1983908774);
                        tb0.k.c((tb0.u) p1Var4.getF182175a(), str12, aVar14, lVar6, mVar5, 0);
                        mVar5.f();
                    } else {
                        mVar5.C(-1983620164);
                        boolean zB6 = mVar5.B(aVar14);
                        Object objQ9 = mVar5.q();
                        if (zB6) {
                            objQ9 = new a1(aVar14, 6);
                            mVar5.K(objQ9);
                        } else {
                            aVar3.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new a1(aVar14, 6);
                                mVar5.K(objQ9);
                            }
                        }
                        ub0.d.a(str12, aVar15, lVar6, (e23.a) objQ9, mVar5, 0);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 13:
                tn.m mVar6 = (tn.m) obj7;
                m0 m0Var = (m0) obj6;
                p1 p1Var5 = (p1) obj5;
                p1 p1Var6 = (p1) obj4;
                p1 p1Var7 = (p1) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i19 = tn.m.f165476e;
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    String strQ11 = gl1.y.Q(mVar7, R.string.lbl_edit_snapshot_name);
                    boolean zR4 = mVar7.r(mVar6) | mVar7.r(m0Var);
                    Object objQ10 = mVar7.q();
                    if (zR4) {
                        ok0.d dVar5 = new ok0.d(mVar6, m0Var, p1Var5, p1Var6, 26);
                        mVar7.K(dVar5);
                        objQ10 = dVar5;
                    } else {
                        aVar3.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            ok0.d dVar6 = new ok0.d(mVar6, m0Var, p1Var5, p1Var6, 26);
                            mVar7.K(dVar6);
                            objQ10 = dVar6;
                        }
                    }
                    e23.a aVar16 = (e23.a) objQ10;
                    i53.c cVar6 = (i53.c) p1Var7.getF182175a();
                    boolean zR5 = mVar7.r(mVar6) | mVar7.r(m0Var);
                    Object objQ11 = mVar7.q();
                    if (zR5) {
                        objQ11 = new rp.b(mVar6, 22, m0Var, p1Var5);
                        mVar7.K(objQ11);
                    } else {
                        aVar3.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new rp.b(mVar6, 22, m0Var, p1Var5);
                            mVar7.K(objQ11);
                        }
                    }
                    z02.f.d(strQ11, null, null, aVar16, cVar6, null, (e23.l) objQ11, mVar7, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 14:
                e23.l lVar7 = (e23.l) obj7;
                CustomLineChart customLineChart = (CustomLineChart) obj6;
                sp1.a aVar17 = (sp1.a) obj5;
                xp1.b bVar4 = (xp1.b) obj4;
                String str13 = (String) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarH2 = x2.h(c2.l.A(rVarF, j92.b.f97899b.f97918c, 0.0f, 2), tp1.a.f165939a);
                    boolean zB7 = mVar8.B(lVar7) | mVar8.r(customLineChart);
                    Object objQ12 = mVar8.q();
                    if (zB7) {
                        objQ12 = new ci0.i(lVar7, customLineChart, 3);
                        mVar8.K(objQ12);
                    } else {
                        aVar3.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new ci0.i(lVar7, customLineChart, 3);
                            mVar8.K(objQ12);
                        }
                    }
                    h4.r rVarB6 = wz1.i.b(rVarH2, (e23.a) objQ12, mVar8);
                    boolean zR6 = mVar8.r(customLineChart);
                    Object objQ13 = mVar8.q();
                    if (zR6) {
                        objQ13 = new b40.a(customLineChart, 14);
                        mVar8.K(objQ13);
                    } else {
                        aVar3.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new b40.a(customLineChart, 14);
                            mVar8.K(objQ13);
                        }
                    }
                    e23.l lVar8 = (e23.l) objQ13;
                    boolean zR7 = mVar8.r(aVar17) | mVar8.B(bVar4) | mVar8.B(str13);
                    Object objQ14 = mVar8.q();
                    if (zR7) {
                        objQ14 = new tn2.s0(aVar17, i16, bVar4, str13);
                        mVar8.K(objQ14);
                    } else {
                        aVar3.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new tn2.s0(aVar17, i16, bVar4, str13);
                            mVar8.K(objQ14);
                        }
                    }
                    p002j6.c.b(lVar8, rVarB6, (e23.l) objQ14, mVar8, 0, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                u70.g.c((u70.i) obj7, (u70.h) obj6, (e23.a) obj4, (e23.a) obj3, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                return a(obj, obj2);
            case 17:
                return b(obj, obj2);
            case 18:
                return c(obj, obj2);
            case 19:
                return d(obj, obj2);
            case 20:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.navigation.more.c.a((ty0.b) obj7, (e23.l) obj6, (e23.l) obj5, (e23.l) obj3, (e23.a) obj4, (p3.m) obj, p0.t(3457));
                return Unit.INSTANCE;
            case 21:
                return e(obj, obj2);
            case 22:
                return f(obj, obj2);
            case 23:
                return g(obj, obj2);
            case 24:
                return h(obj, obj2);
            case 25:
                return i(obj, obj2);
            case 26:
                return j(obj, obj2);
            case 27:
                return k(obj, obj2);
            case 28:
                return l(obj, obj2);
            default:
                i53.f fVar3 = (i53.f) obj7;
                n82.f fVar4 = (n82.f) obj6;
                yd1.a aVar18 = (yd1.a) obj5;
                u82.d dVar7 = (u82.d) obj4;
                e23.l lVar9 = (e23.l) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r.a aVar19 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar19, 1.0f), vb.h.e(d92.b.f58623a, mVar9), m1.f128891a);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar20 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA4 = y.a(c2.j.f22694d, aVar20, mVar9, 48);
                    int iHashCode4 = Long.hashCode(mVar9.getU());
                    i2 i2VarX4 = mVar9.x();
                    h4.r rVarC18 = h4.k.c(rVarE, mVar9);
                    h5.g.V.getClass();
                    e0.a aVar21 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar21);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA4, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar9);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar9, iHashCode4, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC18, mVar9);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    i53.c cVarE = i53.a.e(o2.b(fVar3, mVar9));
                    int iIndexOf = fVar3.indexOf(fVar4.f124961b.a());
                    boolean zB8 = mVar9.B(fVar4);
                    Object objQ15 = mVar9.q();
                    if (zB8) {
                        objQ15 = new a42.f0(fVar4, fVar3, 16);
                        mVar9.K(objQ15);
                    } else {
                        aVar3.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new a42.f0(fVar4, fVar3, 16);
                            mVar9.K(objQ15);
                        }
                    }
                    t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) objQ15, mVar9, 0, 26);
                    q82.a.a(x2.f(aVar19, 1.0f), new n82.n(fVar4, aVar18), null, mVar9, 6, 4);
                    n82.c.a(b0Var4.a(aVar19, 1.0f, true), fVar4, 3, false, z3.f.c(1900079358, new o72.m1(20, dVar7, lVar9), mVar9), mVar9, 24960, 8);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(e23.a aVar, Object obj, Object obj2, p1 p1Var, Object obj3, int i14) {
        this.f159233a = i14;
        this.f159237e = aVar;
        this.f159234b = obj;
        this.f159235c = obj2;
        this.f159236d = p1Var;
        this.f159238f = obj3;
    }

    public /* synthetic */ g(Object obj, Object obj2, e23.a aVar, Object obj3, Object obj4, int i14) {
        this.f159233a = i14;
        this.f159234b = obj;
        this.f159235c = obj2;
        this.f159237e = aVar;
        this.f159236d = obj3;
        this.f159238f = obj4;
    }

    public /* synthetic */ g(Object obj, Object obj2, e23.l lVar, o13.h hVar, e23.a aVar, int i14, int i15) {
        this.f159233a = i15;
        this.f159234b = obj;
        this.f159235c = obj2;
        this.f159236d = lVar;
        this.f159238f = hVar;
        this.f159237e = aVar;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f159233a = i14;
        this.f159234b = obj;
        this.f159235c = obj2;
        this.f159236d = obj3;
        this.f159237e = obj4;
        this.f159238f = obj5;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14, int i15) {
        this.f159233a = i15;
        this.f159234b = obj;
        this.f159235c = obj2;
        this.f159236d = obj3;
        this.f159237e = obj4;
        this.f159238f = obj5;
    }

    public /* synthetic */ g(int i14, e23.a aVar, e23.l lVar, Object obj, Object obj2, Object obj3) {
        this.f159233a = i14;
        this.f159234b = obj;
        this.f159237e = aVar;
        this.f159235c = lVar;
        this.f159236d = obj2;
        this.f159238f = obj3;
    }

    public /* synthetic */ g(u70.i iVar, u70.h hVar, e23.a aVar, e23.a aVar2, e23.l lVar, int i14) {
        this.f159233a = 15;
        this.f159234b = iVar;
        this.f159235c = hVar;
        this.f159237e = aVar;
        this.f159238f = aVar2;
        this.f159236d = lVar;
    }

    public /* synthetic */ g(v21.e eVar, v11.b.e eVar2, e23.a aVar, e23.l lVar, h4.r rVar, int i14) {
        this.f159233a = 23;
        this.f159235c = eVar;
        this.f159236d = eVar2;
        this.f159237e = aVar;
        this.f159238f = lVar;
        this.f159234b = rVar;
    }
}
