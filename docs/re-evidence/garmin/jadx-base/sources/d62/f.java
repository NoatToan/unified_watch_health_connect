package d62;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.r0;
import b5.s0;
import c2.a0;
import c2.b0;
import c2.t2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.leaderboard.model.f0;
import e2.i0;
import f5.g0;
import gl1.y;
import h5.e0;
import i3.mh;
import i3.v5;
import i3.ve;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import ky0.w1;
import l72.p2;
import l72.v2;
import o4.d0;
import o4.m1;
import o4.t1;
import o4.u1;
import o4.v1;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.q2;
import s5.x0;
import s70.g1;
import ty1.g2;
import u1.a2;
import u1.w;
import v62.x4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f58008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f58010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f58011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f58012f;

    public /* synthetic */ f(e23.a aVar, e23.a aVar2, boolean z14, e23.a aVar3, p1 p1Var) {
        this.f58007a = 10;
        this.f58010d = aVar;
        this.f58009c = aVar2;
        this.f58008b = z14;
        this.f58011e = aVar3;
        this.f58012f = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0111  */
    /* JADX WARN: Code duplicated, block: B:25:0x0416  */
    /* JADX WARN: Code duplicated, block: B:32:0x045f  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        e23.a aVar = (e23.a) this.f58010d;
        e23.a aVar2 = (e23.a) this.f58009c;
        e23.a aVar3 = (e23.a) this.f58011e;
        p1 p1Var = (p1) this.f58012f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(mVar, R.string.lbl_profile);
            b3.b.f15502a.getClass();
            u4.d dVarC = d3.o.f57318a;
            if (dVarC == null) {
                g6.f.a aVar4 = g6.f.f75994b;
                u4.d.a aVar5 = new u4.d.a("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                j0 j0Var = u4.m.f168519a;
                d0.f128823b.getClass();
                t1 t1Var = new t1(d0.f128824c, null);
                u1.f129010b.getClass();
                v1.f129019b.getClass();
                int i14 = v1.f129021d;
                u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(12.0f, 12.0f);
                eVarL.e(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
                eVarL.n(-1.79f, -4.0f, -4.0f, -4.0f);
                eVarL.n(-4.0f, 1.79f, -4.0f, 4.0f);
                eVarL.n(1.79f, 4.0f, 4.0f, 4.0f);
                eVarL.c();
                eVarL.k(12.0f, 14.0f);
                eVarL.e(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
                eVarL.p(2.0f);
                eVarL.h(16.0f);
                eVarL.p(-2.0f);
                eVarL.e(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
                eVarL.c();
                u4.d.a.b(aVar5, eVarL.f168407a, 0, t1Var, 1.0f, null, 1.0f, i14, 1.0f);
                dVarC = aVar5.c();
                d3.o.f57318a = dVarC;
            }
            boolean zB = mVar.B(aVar);
            Object objQ = mVar.q();
            p3.m.a aVar6 = p3.m.f135153a;
            if (zB) {
                objQ = new p40.j0(aVar, p1Var, 7);
                mVar.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p40.j0(aVar, p1Var, 7);
                    mVar.K(objQ);
                }
            }
            g1.b(0, (e23.a) objQ, strQ, mVar, dVarC);
            h4.r.a aVar7 = h4.r.S;
            g6.f.a aVar8 = g6.f.f75994b;
            v5.a(0.0f, 6, 2, q2.e(d92.b.f58623a, mVar), x2.f(x2.h(aVar7, 1), 1.0f), mVar);
            String strQ2 = y.Q(mVar, R.string.lbl_settings);
            u4.d dVarC2 = d3.q.f57320a;
            if (dVarC2 == null) {
                u4.d.a aVar9 = new u4.d.a("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                j0 j0Var2 = u4.m.f168519a;
                d0.f128823b.getClass();
                t1 t1Var2 = new t1(d0.f128824c, null);
                u1.f129010b.getClass();
                v1.f129019b.getClass();
                int i15 = v1.f129021d;
                u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(19.14f, 12.94f);
                eVarL2.e(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
                eVarL2.e(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
                eVarL2.j(2.03f, -1.58f);
                eVarL2.e(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
                eVarL2.j(-1.92f, -3.32f);
                eVarL2.e(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
                eVarL2.j(-2.39f, 0.96f);
                eVarL2.e(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
                eVarL2.i(14.4f, 2.81f);
                eVarL2.e(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
                eVarL2.h(-3.84f);
                eVarL2.e(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
                eVarL2.i(9.25f, 5.35f);
                eVarL2.d(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
                eVarL2.i(5.24f, 5.33f);
                eVarL2.e(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
                eVarL2.i(2.74f, 8.87f);
                eVarL2.d(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
                eVarL2.j(2.03f, 1.58f);
                eVarL2.d(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
                eVarL2.n(0.02f, 0.64f, 0.07f, 0.94f);
                eVarL2.j(-2.03f, 1.58f);
                eVarL2.e(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
                eVarL2.j(1.92f, 3.32f);
                eVarL2.e(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
                eVarL2.j(2.39f, -0.96f);
                eVarL2.e(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
                eVarL2.j(0.36f, 2.54f);
                eVarL2.e(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
                eVarL2.h(3.84f);
                eVarL2.e(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
                eVarL2.j(0.36f, -2.54f);
                eVarL2.e(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
                eVarL2.j(2.39f, 0.96f);
                eVarL2.e(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
                eVarL2.j(1.92f, -3.32f);
                eVarL2.e(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
                q2.y(eVarL2, 19.14f, 12.94f, 12.0f, 15.6f);
                eVarL2.e(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
                eVarL2.n(1.62f, -3.6f, 3.6f, -3.6f);
                eVarL2.n(3.6f, 1.62f, 3.6f, 3.6f);
                eVarL2.m(13.98f, 15.6f, 12.0f, 15.6f);
                eVarL2.c();
                u4.d.a.b(aVar9, eVarL2.f168407a, 0, t1Var2, 1.0f, null, 1.0f, i15, 1.0f);
                dVarC2 = aVar9.c();
                d3.q.f57320a = dVarC2;
            }
            boolean zB2 = mVar.B(aVar2);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new p40.j0(aVar2, p1Var, 8);
                mVar.K(objQ2);
            } else {
                aVar6.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new p40.j0(aVar2, p1Var, 8);
                    mVar.K(objQ2);
                }
            }
            g1.b(0, (e23.a) objQ2, strQ2, mVar, dVarC2);
            if (this.f58008b) {
                mVar.C(-142495579);
                v5.a(8, 54, 0, q2.f(mVar), x2.f(aVar7, 1.0f), mVar);
                String strQ3 = y.Q(mVar, R.string.lbl_view_other_account);
                s62.a.f157643a.getClass();
                u4.d dVarA = x4.a(t62.b.f162798a);
                boolean zB3 = mVar.B(aVar3);
                Object objQ3 = mVar.q();
                if (zB3) {
                    objQ3 = new p40.j0(aVar3, p1Var, 9);
                    mVar.K(objQ3);
                } else {
                    aVar6.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new p40.j0(aVar3, p1Var, 9);
                        mVar.K(objQ3);
                    }
                }
                g1.b(0, (e23.a) objQ3, strQ3, mVar, dVarA);
                mVar.f();
            } else {
                mVar.C(-141974717);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0383  */
    /* JADX WARN: Code duplicated, block: B:130:0x0463  */
    /* JADX WARN: Code duplicated, block: B:190:0x0621  */
    /* JADX WARN: Code duplicated, block: B:263:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:299:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:307:0x0b1e  */
    /* JADX WARN: Code duplicated, block: B:49:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0214  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        String strV;
        h4.r rVarG;
        String strC;
        f0 f0Var;
        int i14 = this.f58007a;
        String strH = "";
        Object obj5 = null;
        boolean z14 = this.f58008b;
        p3.m.a aVar = p3.m.f135153a;
        Object obj6 = this.f58009c;
        Object obj7 = this.f58012f;
        Object obj8 = this.f58011e;
        Object obj9 = this.f58010d;
        switch (i14) {
            case 0:
                List<zd0.k.a> list = (List) obj6;
                e23.a aVar2 = (e23.a) obj9;
                zd0.k.a aVar3 = (zd0.k.a) obj8;
                e23.l lVar = (e23.l) obj7;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar4, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar5 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA = c2.y.a(c2.j.f22694d, aVar5, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarE, mVar);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar6);
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
                    b0 b0Var = b0.f22601a;
                    String strQ = y.Q(mVar, R.string.select_a_device);
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97932i, mVar);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(aVar4, eVar.f97920e);
                    d6.h.f57752b.getClass();
                    mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 130044);
                    mh.c(y.Q(mVar, R.string.start_workout_gc), c2.l.z(x2.f(aVar4, 1.0f), eVar.f97920e, eVar.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131068);
                    mVar.C(-676613345);
                    for (zd0.k.a aVar7 : list) {
                        boolean z15 = aVar3 != null && aVar7.f204042a == aVar3.f204042a;
                        boolean zB = mVar.B(lVar) | mVar.r(aVar7);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new c42.f0(lVar, aVar7, 1);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new c42.f0(lVar, aVar7, 1);
                                mVar.K(objQ);
                            }
                        }
                        g.a(aVar7, z15, (e23.a) objQ, mVar, zd0.k.a.f204041e);
                    }
                    mVar.f();
                    if (z14) {
                        mVar.C(500183100);
                        String strQ2 = y.Q(mVar, R.string.workouts_devices_screen_footer);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0Var = j92.f.f97933j;
                        x0 x0VarF2 = d92.c.f(x0Var, mVar);
                        h4.r.a aVar8 = h4.r.S;
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        mh.c(strQ2, c2.l.C(c2.l.A(aVar8, eVar2.f97920e, 0.0f, 2), 0.0f, eVar2.f97921f, 0.0f, eVar2.f97918c, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, mVar, 0, 0, 131068);
                        String strQ3 = y.Q(mVar, R.string.send_workouts_to_device);
                        x0 x0VarA = x0.a(x0Var, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        h4.r rVarC2 = c2.l.C(c2.l.A(x2.f(aVar8, 1.0f), eVar2.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                        boolean zB2 = mVar.B(aVar2);
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            obj4 = objQ2;
                            cw1.p0 p0Var = new cw1.p0(aVar2, 12);
                            mVar.K(p0Var);
                            obj4 = p0Var;
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                obj4 = objQ2;
                                cw1.p0 p0Var2 = new cw1.p0(aVar2, 12);
                                mVar.K(p0Var2);
                                obj4 = p0Var2;
                            }
                        }
                        obj4 = objQ2;
                        mh.c(strQ3, w.d(rVarC2, false, null, null, (e23.a) obj4, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, mVar, 0, 0, 131068);
                        mVar.f();
                    } else {
                        mVar.C(501103738);
                        mVar.f();
                    }
                    mVar.y();
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ArrayList<pu0.i> arrayList = (ArrayList) obj6;
                String str = (String) obj9;
                pu0.b bVar2 = (pu0.b) obj8;
                gv0.d dVar = (gv0.d) obj7;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String upperCase = y.Q(mVar2, R.string.lbl_text_message).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97920e;
                    h4.r rVarB = c2.l.B(aVar9, f14, f14, f14, eVar3.f97917b);
                    d92.b.f58624b.getClass();
                    mh.c(upperCase, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, mVar2), mVar2, 0, 0, 131068);
                    mVar2.C(1661249692);
                    for (pu0.i iVar : arrayList) {
                        String str2 = iVar.f141261b;
                        if (str2 == null) {
                            mVar2.C(-333202785);
                            mVar2.f();
                            strV = null;
                        } else {
                            mVar2.C(-1119127134);
                            strV = jg.b.v((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), str2);
                            mVar2.f();
                        }
                        if (strV == null) {
                            strV = "";
                        }
                        boolean zR = mVar2.r(bVar2) | mVar2.r(iVar) | mVar2.r(dVar);
                        Object objQ3 = mVar2.q();
                        if (zR) {
                            objQ3 = new fk0.a(bVar2, 15, iVar, dVar);
                            mVar2.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new fk0.a(bVar2, 15, iVar, dVar);
                                mVar2.K(objQ3);
                            }
                        }
                        gv0.j0.a(0, (e23.a) objQ3, strV, mVar2, z14);
                    }
                    mVar2.f();
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    h4.r rVarZ = c2.l.z(aVar10, eVar4.f97920e, eVar4.f97917b);
                    d92.b.f58624b.getClass();
                    mh.c(str, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                gc1.a aVar11 = (gc1.a) obj6;
                String str3 = (String) obj9;
                String str4 = (String) obj8;
                Double d14 = (Double) obj7;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    ic1.b.d(aVar11, str3, str4, d14, this.f58008b, mVar3, 8);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                i53.d dVar2 = (i53.d) obj6;
                kl1.a aVar12 = (kl1.a) obj9;
                e23.l lVar2 = (e23.l) obj7;
                e23.l lVar3 = (e23.l) obj8;
                int iIntValue4 = ((Integer) obj).intValue();
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar4.k(iIntValue4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    Iterable iterable = (List) dVar2.get((il1.a) h0.X(dVar2.keySet(), iIntValue4));
                    if (iterable == null) {
                        iterable = j0.f134944a;
                    }
                    il1.c.c(aVar12, i53.a.e(iterable), this.f58008b, lVar2, lVar3, mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                e23.a aVar13 = (e23.a) obj9;
                e23.l lVar4 = (e23.l) obj7;
                e23.p pVar = (e23.p) obj8;
                h4.r rVar = (h4.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                v.h.y(-1979982323, rVar, (Integer) obj3, mVar5);
                x1 x1Var7 = p3.n.f135158a;
                Object objQ4 = mVar5.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                Object obj10 = objQ4;
                if (objQ4 == c2565a) {
                    o53.b0 b0VarJ = l0.j(t13.h.f161748a, mVar5);
                    mVar5.K(b0VarJ);
                    obj10 = b0VarJ;
                }
                o53.b0 b0Var2 = (o53.b0) obj10;
                Object objQ5 = mVar5.q();
                Object obj11 = objQ5;
                if (objQ5 == c2565a) {
                    c2 c2VarN = p0.n(null);
                    mVar5.K(c2VarN);
                    obj11 = c2VarN;
                }
                p1 p1Var = (p1) obj11;
                Object objQ6 = mVar5.q();
                Object obj12 = objQ6;
                if (objQ6 == c2565a) {
                    c2 c2VarN2 = p0.n(Boolean.FALSE);
                    mVar5.K(c2VarN2);
                    obj12 = c2VarN2;
                }
                p1 p1Var2 = (p1) obj12;
                boolean zR2 = mVar5.r(b0Var2) | mVar5.B(null) | mVar5.B(aVar13);
                Object objQ7 = mVar5.q();
                if (zR2 || objQ7 == c2565a) {
                    ev2.f fVar = new ev2.f(aVar13, p1Var2, p1Var, b0Var2, 17);
                    mVar5.K(fVar);
                    objQ7 = fVar;
                }
                Object obj13 = this.f58009c;
                l0.a(obj13, (e23.l) objQ7, mVar5);
                boolean z16 = this.f58008b;
                Boolean boolValueOf = Boolean.valueOf(z16);
                boolean zH = mVar5.h(z16) | mVar5.r(b0Var2) | mVar5.B(null) | mVar5.B(lVar4) | mVar5.B(aVar13) | mVar5.B(pVar);
                Object objQ8 = mVar5.q();
                if (zH || objQ8 == c2565a) {
                    j02.e eVar5 = new j02.e(z16, pVar, lVar4, p1Var2, b0Var2, null, p1Var, aVar13);
                    mVar5.K(eVar5);
                    objQ8 = eVar5;
                }
                b5.q qVar = s0.f15885a;
                h4.r rVarThen = rVar.then(new r0(obj13, boolValueOf, null, (PointerInputEventHandler) objQ8, 4, null));
                mVar5.f();
                return rVarThen;
            case 5:
                sy0.k kVar = (sy0.k) obj6;
                sy0.t tVar = (sy0.t) obj8;
                e23.a aVar14 = (e23.a) obj9;
                e23.p pVar2 = (e23.p) obj7;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar15 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode2 = Long.hashCode(mVar6.getU());
                    i2 i2VarX2 = mVar6.x();
                    h4.r rVarC3 = h4.k.c(aVar15, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar16);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar6);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar6, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar6);
                    b0 b0Var3 = b0.f22601a;
                    PrivacyType privacyTypeB = PrivacyType.Companion.b(PrivacyType.INSTANCE, kVar.f161241i.f161256a);
                    boolean z17 = this.f58008b;
                    w1.a(z17, kVar, tVar, privacyTypeB, aVar14, mVar6, 0);
                    String str5 = kVar.f161236d;
                    String str6 = kVar.f161237e;
                    boolean zB3 = mVar6.B(pVar2);
                    Object objQ9 = mVar6.q();
                    if (zB3) {
                        objQ9 = new a3.d(pVar2, 20);
                        mVar6.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new a3.d(pVar2, 20);
                            mVar6.K(objQ9);
                        }
                    }
                    ky0.t.a(str5, str6, z17, (e23.p) objQ9, mVar6, 0);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                e23.p pVar3 = (e23.p) obj6;
                e23.p pVar4 = (e23.p) obj9;
                String str7 = (String) obj8;
                String str8 = (String) obj7;
                t2 t2Var = (t2) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                p2 p2Var = p2.f111205a;
                t2Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(t2Var) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (pVar3 == null) {
                        mVar7.C(-284572810);
                        mVar7.f();
                    } else {
                        v.h.D(mVar7, -979011093, pVar3, mVar7, 0);
                    }
                    float f15 = pVar3 != null ? 16 : 0;
                    g6.f.a aVar17 = g6.f.f75994b;
                    float f16 = f15;
                    float f17 = pVar4 != null ? 16 : 0;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str8, v2.a(t2Var.a(v2.a(c2.l.C(h4.r.S, f16, 0.0f, f17, 0.0f, 10), !z14, new l72.q(8), mVar7, 0), 1.0f, true), str7 != null, new j21.p(str7, 6), mVar7, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar7), mVar7, 0, 0, 131068);
                    if (pVar4 == null) {
                        mVar7.C(-283727626);
                        mVar7.f();
                    } else {
                        v.h.D(mVar7, -978983829, pVar4, mVar7, 0);
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                e23.a aVar18 = (e23.a) obj9;
                n1 n1Var = (n1) obj8;
                t2 t2Var2 = (t2) obj7;
                p3.m mVar8 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var10 = p3.n.f135158a;
                boolean z18 = ((lg2.r) obj6).f112356b;
                l72.f0.a aVar19 = l72.f0.a.f111000a;
                if (z18) {
                    mVar8.C(-1632669133);
                    rVarG = x2.b(h4.r.S, ((g6.c) mVar8.A(kotlin.t1.f91490h)).c1(n1Var.getIntValue()), 0.0f, 2);
                    mVar8.f();
                } else {
                    mVar8.C(-1632536019);
                    h4.r.a aVar20 = h4.r.S;
                    Object objQ10 = mVar8.q();
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new a11.h0(n1Var, 21);
                        mVar8.K(objQ10);
                    }
                    rVarG = g0.g(aVar20, (e23.l) objQ10);
                    mVar8.f();
                }
                h4.r rVar2 = rVarG;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC4 = c2.l.C(rVar2, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11);
                if (z18) {
                    mVar8.C(-1632360592);
                    mVar8.f();
                } else {
                    strH = sn.a.h(mVar8, 1332816815, R.string.lbl_stop, mVar8);
                }
                String str9 = strH;
                boolean z19 = z14 && !z18;
                z3.e eVarC = z3.f.c(1959653367, new lg2.o(t2Var2, z18, false ? 1 : 0), mVar8);
                boolean zB4 = mVar8.B(aVar18);
                Object objQ11 = mVar8.q();
                if (zB4) {
                    objQ11 = new l72.t(aVar18, 18);
                    mVar8.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new l72.t(aVar18, 18);
                        mVar8.K(objQ11);
                    }
                }
                aVar19.i(eVarC, str9, rVarC4, z19, (e23.a) objQ11, mVar8, 6, 0);
                return Unit.INSTANCE;
            case 8:
                h4.r rVar3 = (h4.r) obj8;
                e23.a aVar21 = (e23.a) obj9;
                t2 t2Var3 = (t2) obj7;
                p3.m mVar9 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var11 = p3.n.f135158a;
                boolean z24 = ((lg2.r) obj6).f112356b;
                lg2.m mVar10 = lg2.m.f112346a;
                if (z24) {
                    mVar9.C(685373056);
                    mVar9.f();
                } else {
                    strH = sn.a.h(mVar9, -254985569, R.string.lbl_stop, mVar9);
                }
                String str10 = strH;
                boolean z25 = z14 && !z24;
                z3.e eVarC2 = z3.f.c(472289027, new lg2.o(t2Var3, z24, true ? 1 : 0), mVar9);
                boolean zB5 = mVar9.B(aVar21);
                Object objQ12 = mVar9.q();
                if (zB5) {
                    objQ12 = new l72.t(aVar21, 19);
                    mVar9.K(objQ12);
                } else {
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new l72.t(aVar21, 19);
                        mVar9.K(objQ12);
                    }
                }
                mVar10.d(eVarC2, str10, rVar3, z25, (e23.a) objQ12, mVar9, 196656, 0);
                return Unit.INSTANCE;
            case 9:
                rx.a aVar22 = (rx.a) obj6;
                bx.b bVar4 = (bx.b) obj9;
                Integer num = (Integer) obj8;
                oi0.h hVar = (oi0.h) obj7;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar11.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var12 = p3.n.f135158a;
                    String strC2 = aVar22.c(bVar4);
                    if (num != null) {
                        u00.a aVar23 = aVar22.f154901c;
                        int iIntValue9 = num.intValue();
                        int i15 = u00.a.f167335c;
                        strC = aVar23.c(iIntValue9);
                    } else {
                        strC = aVar22.f154900b;
                    }
                    String str11 = strC;
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("label_secondary", num != null ? hVar.c(num.intValue(), false) : null);
                    b92.a aVarB = c0235a.b();
                    int i16 = b92.a.f16960b;
                    qx.h.c(0, aVarB, strC2, str11, mVar11, this.f58008b);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 10:
                return a(obj, obj2, obj3);
            case 11:
                pe0.f fVar2 = (pe0.f) obj6;
                l22.a aVar24 = (l22.a) obj8;
                e23.a aVar25 = (e23.a) obj9;
                p1 p1Var3 = (p1) obj7;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar12.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    ve.a(x2.f(h4.r.S, 1.0f), null, vb.h.e(d92.b.f58623a, mVar12), 0L, 0.0f, 0.0f, null, z3.f.c(1952915474, new ug2.p(fVar2, this.f58008b, aVar24, aVar25, p1Var3, 3), mVar12), mVar12, 12582918, 122);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            default:
                i0 i0Var = (i0) obj6;
                zc.d dVar3 = (zc.d) obj9;
                x3 x3Var = (x3) obj8;
                p1 p1Var4 = (p1) obj7;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar13.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var14 = p3.n.f135158a;
                    if (z14 && ((vt0.a) p1Var4.getF182175a()) != vt0.a.ALL) {
                        mVar13.C(-2051123051);
                        h4.r.a aVar26 = h4.r.S;
                        h4.r rVarB2 = a2.b(x2.d(aVar26, 1.0f), a2.a(mVar13), true);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar27 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        z zVarA3 = c2.y.a(c2.j.f22694d, aVar27, mVar13, 48);
                        int iHashCode3 = Long.hashCode(mVar13.getU());
                        i2 i2VarX3 = mVar13.x();
                        h4.r rVarC5 = h4.k.c(rVarB2, mVar13);
                        h5.g.V.getClass();
                        e0.a aVar28 = h5.g.a.f81805b;
                        if (mVar13.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar13.z();
                        if (mVar13.getT()) {
                            mVar13.M(aVar28);
                        } else {
                            mVar13.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA3, mVar13);
                        b4.c(h5.g.a.f81809f, i2VarX3, mVar13);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar13.getT() || !p005kotlin.jvm.internal.s.g(mVar13.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar13, iHashCode3, bVar5);
                        }
                        b4.c(h5.g.a.f81807d, rVarC5, mVar13);
                        b0 b0Var4 = b0.f22601a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarY2 = c2.l.y(aVar26, j92.b.f97899b.f97920e);
                        String strQ4 = y.Q(mVar13, R.string.msg_segments_no_filter_results);
                        d92.b.f58624b.getClass();
                        mh.c(strQ4, rVarY2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar13), mVar13, 0, 0, 131068);
                        mVar13.y();
                        mVar13.f();
                    } else if (z14) {
                        mVar13.C(-2050304930);
                        h4.r rVarB3 = a2.b(x2.d(h4.r.S, 1.0f), a2.a(mVar13), true);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar3 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA4 = c2.y.a(kVar3, h4.d.a.f81536n, mVar13, 0);
                        int iHashCode4 = Long.hashCode(mVar13.getU());
                        i2 i2VarX4 = mVar13.x();
                        h4.r rVarC6 = h4.k.c(rVarB3, mVar13);
                        h5.g.V.getClass();
                        e0.a aVar29 = h5.g.a.f81805b;
                        if (mVar13.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar13.z();
                        if (mVar13.getT()) {
                            mVar13.M(aVar29);
                        } else {
                            mVar13.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA4, mVar13);
                        b4.c(h5.g.a.f81809f, i2VarX4, mVar13);
                        h5.g.a.b bVar6 = h5.g.a.f81813j;
                        if (mVar13.getT() || !p005kotlin.jvm.internal.s.g(mVar13.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar13, iHashCode4, bVar6);
                        }
                        b4.c(h5.g.a.f81807d, rVarC6, mVar13);
                        b0 b0Var5 = b0.f22601a;
                        for (Object obj14 : dVar3.c().f196336d) {
                            if (((f0) obj14).f38157j) {
                                obj5 = obj14;
                                f0Var = (f0) obj5;
                                if (f0Var == null) {
                                    mVar13.C(-886990964);
                                    mVar13.f();
                                } else {
                                    mVar13.C(-886990963);
                                    vt0.d.a((vt0.b) x3Var.getF182175a(), f0Var, mVar13, f0.f38147k << 3);
                                    mVar13.f();
                                }
                                mVar13.y();
                                mVar13.f();
                            }
                        }
                        f0Var = (f0) obj5;
                        if (f0Var == null) {
                            mVar13.C(-886990964);
                            mVar13.f();
                        } else {
                            mVar13.C(-886990963);
                            vt0.d.a((vt0.b) x3Var.getF182175a(), f0Var, mVar13, f0.f38147k << 3);
                            mVar13.f();
                        }
                        mVar13.y();
                        mVar13.f();
                    } else {
                        mVar13.C(-2049657805);
                        boolean zR3 = mVar13.r(dVar3) | mVar13.B(x3Var);
                        Object objQ13 = mVar13.q();
                        if (zR3) {
                            objQ13 = new g2(22, dVar3, x3Var);
                            mVar13.K(objQ13);
                        } else {
                            aVar.getClass();
                            if (objQ13 == p3.m.a.f135155b) {
                                objQ13 = new g2(22, dVar3, x3Var);
                                mVar13.K(objQ13);
                            }
                        }
                        e2.c.b(null, i0Var, null, null, null, null, false, null, (e23.l) objQ13, mVar13, 0, 509);
                        mVar13.f();
                    }
                    x1 x1Var15 = p3.n.f135158a;
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(gc1.a aVar, String str, String str2, Double d14, boolean z14) {
        this.f58007a = 2;
        this.f58009c = aVar;
        this.f58010d = str;
        this.f58011e = str2;
        this.f58012f = d14;
        this.f58008b = z14;
    }

    public /* synthetic */ f(Object obj, Object obj2, boolean z14, e23.l lVar, o13.h hVar, int i14) {
        this.f58007a = i14;
        this.f58009c = obj;
        this.f58010d = obj2;
        this.f58008b = z14;
        this.f58012f = lVar;
        this.f58011e = hVar;
    }

    public /* synthetic */ f(Object obj, Object obj2, boolean z14, Comparable comparable, Object obj3, int i14) {
        this.f58007a = i14;
        this.f58009c = obj;
        this.f58010d = obj2;
        this.f58008b = z14;
        this.f58011e = comparable;
        this.f58012f = obj3;
    }

    public /* synthetic */ f(Object obj, boolean z14, e23.a aVar, Object obj2, Object obj3, int i14) {
        this.f58007a = i14;
        this.f58009c = obj;
        this.f58008b = z14;
        this.f58010d = aVar;
        this.f58011e = obj2;
        this.f58012f = obj3;
    }

    public /* synthetic */ f(Object obj, boolean z14, Object obj2, e23.a aVar, Object obj3, int i14) {
        this.f58007a = i14;
        this.f58009c = obj;
        this.f58008b = z14;
        this.f58011e = obj2;
        this.f58010d = aVar;
        this.f58012f = obj3;
    }

    public /* synthetic */ f(rx.a aVar, bx.b bVar, Integer num, boolean z14, oi0.h hVar) {
        this.f58007a = 9;
        this.f58009c = aVar;
        this.f58010d = bVar;
        this.f58011e = num;
        this.f58008b = z14;
        this.f58012f = hVar;
    }

    public /* synthetic */ f(boolean z14, i0 i0Var, zc.d dVar, x3 x3Var, p1 p1Var) {
        this.f58007a = 12;
        this.f58008b = z14;
        this.f58009c = i0Var;
        this.f58010d = dVar;
        this.f58011e = x3Var;
        this.f58012f = p1Var;
    }

    public /* synthetic */ f(boolean z14, sy0.k kVar, sy0.t tVar, e23.a aVar, e23.p pVar) {
        this.f58007a = 5;
        this.f58008b = z14;
        this.f58009c = kVar;
        this.f58011e = tVar;
        this.f58010d = aVar;
        this.f58012f = pVar;
    }
}
