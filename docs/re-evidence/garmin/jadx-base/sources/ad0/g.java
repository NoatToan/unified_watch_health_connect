package ad0;

import android.content.Context;
import android.content.Intent;
import b82.g0;
import b82.t0;
import c2.k3;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.StartWorkoutCapableDeviceSelectionActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import cw1.f0;
import e23.p;
import e23.q;
import et1.b2;
import f5.z0;
import f72.t9;
import g02.b0;
import gg1.o0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.b1;
import i3.bi;
import i3.d8;
import i3.e7;
import i3.ef;
import i3.f7;
import i3.ff;
import i3.h7;
import i3.hf;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.p7;
import i3.ph;
import i3.ri;
import java.util.List;
import jv1.o;
import ky0.t;
import l72.c1;
import l72.i3;
import l72.p2;
import l72.v2;
import o4.d0;
import o4.t1;
import o4.u1;
import o4.v1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l1;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import p5.v;
import u1.u;
import u1.w;
import v62.n3;
import v62.o3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2739e;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.contacts.emergency.f fVar, boolean z14, e23.l lVar, l20.c cVar) {
        this.f2735a = 20;
        this.f2738d = fVar;
        this.f2737c = z14;
        this.f2736b = lVar;
        this.f2739e = cVar;
    }

    private final Object a(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iT = p0.t(1);
        ki1.k.e((fi1.d) this.f2738d, (fi1.c) this.f2739e, this.f2737c, (e23.l) this.f2736b, (p3.m) obj, iT);
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iT = p0.t(1);
        t.a((String) this.f2738d, (String) this.f2739e, this.f2737c, (p) this.f2736b, (p3.m) obj, iT);
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iT = p0.t(1);
        l62.f.a((l62.g) this.f2736b, this.f2737c, (q) this.f2738d, (e23.a) this.f2739e, (p3.m) obj, iT);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x056f  */
    /* JADX WARN: Code duplicated, block: B:115:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:283:0x0ba2  */
    /* JADX WARN: Code duplicated, block: B:288:0x0bc0  */
    /* JADX WARN: Code duplicated, block: B:315:0x0c9f  */
    /* JADX WARN: Code duplicated, block: B:322:0x0cd6  */
    /* JADX WARN: Code duplicated, block: B:50:0x019b  */
    /* JADX WARN: Code duplicated, block: B:70:0x026e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        boolean z14;
        u4.d dVarA;
        i53.f fVar;
        int i14;
        int i15 = this.f2735a;
        int i16 = 20;
        u uVarA = null;
        p3.m.a aVar = p3.m.f135153a;
        boolean z15 = this.f2737c;
        Object obj3 = this.f2739e;
        Object obj4 = this.f2738d;
        Object obj5 = this.f2736b;
        switch (i15) {
            case 0:
                e23.l lVar = (e23.l) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarF = x2.f(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.u uVar = c2.u.f22885a;
                    p5.l.f136032b.getClass();
                    p5.l lVarA = p5.l.a(0);
                    boolean zH = mVar.h(z15) | mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zH) {
                        objQ = new e(z15, lVar, 0);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e(z15, lVar, 0);
                            mVar.K(objQ);
                        }
                    }
                    r rVarD = w.d(aVar2, false, null, lVarA, (e23.a) objQ, 11);
                    boolean zH2 = mVar.h(z15) | mVar.B(str) | mVar.B(str2);
                    Object objQ2 = mVar.q();
                    if (zH2) {
                        z14 = false;
                        objQ2 = new f(z15, (Object) str, (Object) str2, (int) (null == true ? 1 : 0));
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            z14 = false;
                            objQ2 = new f(z15, (Object) str, (Object) str2, (int) (null == true ? 1 : 0));
                            mVar.K(objQ2);
                        } else {
                            z14 = false;
                        }
                    }
                    r rVarC2 = v.c((e23.l) objQ2, rVarD, z14);
                    s62.a aVar4 = s62.a.f157643a;
                    if (z15) {
                        aVar4.getClass();
                        t62.c.f162799a.getClass();
                        dVarA = j72.a.a(t9.f69810a);
                    } else {
                        aVar4.getClass();
                        t62.c.f162799a.getClass();
                        dVarA = j72.b.a(t9.f69810a);
                    }
                    u4.d dVar = dVarA;
                    long jB = ds.e0.b(d92.b.f58623a, mVar);
                    long jB2 = d92.b.a(mVar).d().a().b();
                    d92.b.f58625c.getClass();
                    g02.i.a(rVarC2, dVar, jB, jB2, j92.b.f97901d.f97906e, 0.0f, null, mVar, 0, 224);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                e23.l lVar2 = (e23.l) obj5;
                e23.a aVar5 = (e23.a) obj4;
                l1 l1Var = (l1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    c1 c1Var = c1.f110940a;
                    String strQ = y.Q(mVar2, R.string.lbl_weight);
                    String strQ2 = y.Q(mVar2, R.string.lbl_done);
                    String strQ3 = y.Q(mVar2, R.string.lbl_cancel);
                    z3.e eVarC = z3.f.c(879635968, new ap2.f(z15, l1Var, 1), mVar2);
                    boolean zB = mVar2.B(lVar2);
                    Object objQ3 = mVar2.q();
                    if (zB) {
                        objQ3 = new ao1.i(2, lVar2, l1Var);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ao1.i(2, lVar2, l1Var);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a<Unit> aVar6 = (e23.a) objQ3;
                    boolean zB2 = mVar2.B(aVar5);
                    Object objQ4 = mVar2.q();
                    if (zB2) {
                        objQ4 = new defpackage.c(aVar5, 20);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new defpackage.c(aVar5, 20);
                            mVar2.K(objQ4);
                        }
                    }
                    c1Var.a(true, strQ, null, eVarC, null, strQ2, false, false, aVar6, strQ3, (e23.a) objQ4, mVar2, 3078, 0, 212);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                as.t.a((List) obj5, (String) obj4, this.f2737c, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                z3.e eVar = (z3.e) obj5;
                k3 k3Var = (k3) obj4;
                z3.e eVar2 = (z3.e) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    z02.d.a(this.f2737c, eVar, null, null, k3Var, eVar2, mVar3, 0, 8);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                r rVar = (r) obj5;
                e23.a aVar7 = (e23.a) obj3;
                String str3 = (String) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                t0 t0Var = t0.f16792a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    f7.f88085a.getClass();
                    e7 e7VarA = f7.a(mVar4);
                    d92.b.f58623a.getClass();
                    e7 e7VarA2 = e7.a(e7VarA, 0L, d0.c(0.5f, d92.b.a(mVar4).f().d(), 14), 7);
                    f5.p pVar = p7.f89279a;
                    byte b14 = 0;
                    h7.a(aVar7, rVar.then(d8.f87832a), true, e7VarA2, null, z3.f.c(-1234019615, new g0(z15, str3, b14, b14), mVar4), mVar4, 1572864, 48);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((bv1.r) obj5).c(p0.t(1), (e23.a) obj3, (r) obj4, (p3.m) obj, this.f2737c);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                f0.c((o) obj5, (String) obj4, this.f2737c, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                final StartWorkoutCapableDeviceSelectionActivity startWorkoutCapableDeviceSelectionActivity = (StartWorkoutCapableDeviceSelectionActivity) obj5;
                x3 x3Var = (x3) obj4;
                p1 p1Var = (p1) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                StartWorkoutCapableDeviceSelectionActivity.a aVar8 = StartWorkoutCapableDeviceSelectionActivity.f48554a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    List list = (List) x3Var.getF182175a();
                    zd0.k.a aVar9 = (zd0.k.a) p1Var.getF182175a();
                    Object objQ5 = mVar5.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ5 == c2565a) {
                        objQ5 = new a11.m(p1Var, 13);
                        mVar5.K(objQ5);
                    }
                    e23.l lVar3 = (e23.l) objQ5;
                    boolean zR = mVar5.r(startWorkoutCapableDeviceSelectionActivity);
                    Object objQ6 = mVar5.q();
                    if (zR || objQ6 == c2565a) {
                        final int i17 = 0;
                        objQ6 = new e23.a() { // from class: d62.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                StartWorkoutCapableDeviceSelectionActivity startWorkoutCapableDeviceSelectionActivity2 = startWorkoutCapableDeviceSelectionActivity;
                                switch (i18) {
                                    case 0:
                                        StartWorkoutCapableDeviceSelectionActivity.a aVar10 = StartWorkoutCapableDeviceSelectionActivity.f48554a;
                                        startWorkoutCapableDeviceSelectionActivity2.setResult(0);
                                        startWorkoutCapableDeviceSelectionActivity2.finish();
                                        break;
                                    default:
                                        StartWorkoutCapableDeviceSelectionActivity.a aVar11 = StartWorkoutCapableDeviceSelectionActivity.f48554a;
                                        Intent intent = new Intent();
                                        intent.putExtra("extra_send_to_device", true);
                                        Unit unit = Unit.INSTANCE;
                                        startWorkoutCapableDeviceSelectionActivity2.setResult(-1, intent);
                                        startWorkoutCapableDeviceSelectionActivity2.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar5.K(objQ6);
                    }
                    e23.a aVar10 = (e23.a) objQ6;
                    boolean zR2 = mVar5.r(startWorkoutCapableDeviceSelectionActivity);
                    Object objQ7 = mVar5.q();
                    if (zR2 || objQ7 == c2565a) {
                        objQ7 = new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(startWorkoutCapableDeviceSelectionActivity, i16);
                        mVar5.K(objQ7);
                    }
                    e23.l lVar4 = (e23.l) objQ7;
                    boolean zR3 = mVar5.r(startWorkoutCapableDeviceSelectionActivity);
                    Object objQ8 = mVar5.q();
                    if (zR3 || objQ8 == c2565a) {
                        final int i18 = 1;
                        objQ8 = new e23.a() { // from class: d62.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i18;
                                StartWorkoutCapableDeviceSelectionActivity startWorkoutCapableDeviceSelectionActivity2 = startWorkoutCapableDeviceSelectionActivity;
                                switch (i19) {
                                    case 0:
                                        StartWorkoutCapableDeviceSelectionActivity.a aVar11 = StartWorkoutCapableDeviceSelectionActivity.f48554a;
                                        startWorkoutCapableDeviceSelectionActivity2.setResult(0);
                                        startWorkoutCapableDeviceSelectionActivity2.finish();
                                        break;
                                    default:
                                        StartWorkoutCapableDeviceSelectionActivity.a aVar12 = StartWorkoutCapableDeviceSelectionActivity.f48554a;
                                        Intent intent = new Intent();
                                        intent.putExtra("extra_send_to_device", true);
                                        Unit unit = Unit.INSTANCE;
                                        startWorkoutCapableDeviceSelectionActivity2.setResult(-1, intent);
                                        startWorkoutCapableDeviceSelectionActivity2.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar5.K(objQ8);
                    }
                    d62.g.b(list, this.f2737c, aVar9, lVar3, aVar10, lVar4, (e23.a) objQ8, mVar5, (zd0.k.a.f204041e << 6) | 3072);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                e51.d.a((o51.i) obj5, this.f2737c, (q) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                et1.h.a((us1.n) obj4, this.f2737c, (e23.a) obj3, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                f21.t.a((v21.e) obj5, (g21.o) obj4, (e23.a) obj3, this.f2737c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                fo.q qVar = (fo.q) obj5;
                e23.a aVar11 = (e23.a) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    s62.a.f157643a.getClass();
                    t62.b bVar2 = t62.b.f162798a;
                    u4.d dVarA2 = v62.o.a(bVar2);
                    String strT = gl1.d.T(qVar.f72402a.f3961a, mVar6, 0);
                    if (z15) {
                        mVar6.C(-5884365);
                        i53.f fVarA = i53.a.a(new i3("filter", y.Q(mVar6, R.string.lbl_filter), false, (d0) null, d0.a(fb1.c.g(d92.b.f58623a, mVar6)), lg.d.p(qVar) ? o3.a(bVar2) : n3.a(bVar2), y.Q(mVar6, R.string.lbl_filter), 12, (p005kotlin.jvm.internal.j) null));
                        mVar6.f();
                        fVar = fVarA;
                    } else {
                        mVar6.C(-5174310);
                        mVar6.f();
                        fVar = null;
                    }
                    Object objQ9 = mVar6.q();
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new b2(p1Var2, 15);
                        mVar6.K(objQ9);
                    }
                    z02.f.b(dVarA2, null, strT, null, aVar11, fVar, null, (e23.l) objQ9, mVar6, 12845056, 74);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 12:
                p pVar2 = (p) obj5;
                String str4 = (String) obj4;
                s5.c cVar = (s5.c) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                b0 b0Var = b0.f74326a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    r.a aVar12 = r.S;
                    float f14 = 16;
                    g6.f.a aVar13 = g6.f.f75994b;
                    r rVarY = c2.l.y(aVar12, f14);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar3, mVar7, 48);
                    int iHashCode2 = Long.hashCode(mVar7.getU());
                    i2 i2VarX2 = mVar7.x();
                    r rVarC3 = h4.k.c(rVarY, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar14);
                    } else {
                        mVar7.c();
                    }
                    h5.g.a.e eVar3 = h5.g.a.f81810g;
                    b4.c(eVar3, s2VarA, mVar7);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar7);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar7, iHashCode2, bVar4);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC3, mVar7);
                    u2 u2Var = u2.f22900a;
                    if (pVar2 == null) {
                        mVar7.C(-2045928866);
                        mVar7.f();
                    } else {
                        v.h.D(mVar7, 349644291, pVar2, mVar7, 0);
                    }
                    if (pVar2 != null) {
                        i14 = 0;
                    } else {
                        i14 = 0;
                        f14 = 0;
                    }
                    r rVarC4 = c2.l.C(u2Var.a(aVar12, 1.0f, true), f14, 0.0f, i14, 0.0f, 10);
                    z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar7, i14);
                    int iHashCode3 = Long.hashCode(mVar7.getU());
                    i2 i2VarX3 = mVar7.x();
                    r rVarC5 = h4.k.c(rVarC4, mVar7);
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar14);
                    } else {
                        mVar7.c();
                    }
                    b4.c(eVar3, zVarA, mVar7);
                    b4.c(c1623g, i2VarX3, mVar7);
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar7, iHashCode3, bVar4);
                    }
                    b4.c(fVar2, rVarC5, mVar7);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    boolean z16 = !z15;
                    mh.c(str4, v2.a(aVar12, z16, new fx0.a(7), mVar7, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar7), mVar7, 0, 0, 131068);
                    if (cVar != null) {
                        mVar7.C(-1626109813);
                        mh.d(cVar, v2.a(aVar12, z16, new fx0.a(8), mVar7, 6), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.f(j92.f.f97933j, mVar7), mVar7, 0, 0, 262140);
                        mVar7.f();
                    } else {
                        mVar7.C(-1625763171);
                        mVar7.f();
                    }
                    mVar7.y();
                    mVar7.C(-2044738466);
                    mVar7.f();
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 13:
                ri riVar = (ri) obj5;
                ph phVar = (ph) obj4;
                p1 p1Var3 = (p1) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    if (((Boolean) p1Var3.getF182175a()).booleanValue() || z15) {
                        mVar8.C(-1636578627);
                        bi.j(0, null, phVar, riVar, mVar8);
                        mVar8.f();
                    } else {
                        mVar8.C(-1636398052);
                        bi.l(riVar, null, phVar, 0, mVar8, 0);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                h50.e.b((i50.f) obj5, this.f2737c, (o0) obj4, (r) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                h50.j.a((i50.i) obj4, (i50.j) obj3, this.f2737c, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                o53.b0 b0Var3 = (o53.b0) obj4;
                mc mcVar = (mc) obj3;
                e23.l lVar5 = (e23.l) obj5;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r.a aVar15 = r.S;
                    r rVarF2 = x2.f(aVar15, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    r rVarZ = c2.l.z(rVarF2, eVar4.f97920e, eVar4.f97918c);
                    c2.j.f22691a.getClass();
                    c2.j.h hVar = c2.j.f22697g;
                    h4.d.f81522a.getClass();
                    s2 s2VarA2 = q2.a(hVar, h4.d.a.f81534l, mVar9, 54);
                    int iHashCode4 = Long.hashCode(mVar9.getU());
                    i2 i2VarX4 = mVar9.x();
                    r rVarC6 = h4.k.c(rVarZ, mVar9);
                    h5.g.V.getClass();
                    e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar16);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA2, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar9);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar9.getT() || !s.g(mVar9.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar9, iHashCode4, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar9);
                    u2 u2Var2 = u2.f22900a;
                    String strQ4 = y.Q(mVar9, R.string.startup_daily_wheelchair_user);
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, u2Var2.a(aVar15, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar9), mVar9, 0, 0, 131068);
                    int i19 = b3.a.f15501a;
                    u4.d dVarC = c3.c.f23770a;
                    if (dVarC == null) {
                        g6.f.a aVar17 = g6.f.f75994b;
                        u4.d.a aVar18 = new u4.d.a("AutoMirrored.Filled.Help", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96, null);
                        j0 j0Var = u4.m.f168519a;
                        d0.f128823b.getClass();
                        t1 t1Var = new t1(d0.f128824c, null);
                        u1.f129010b.getClass();
                        v1.f129019b.getClass();
                        int i24 = v1.f129021d;
                        u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(12.0f, 2.0f);
                        eVarL.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        eVarL.n(4.48f, 10.0f, 10.0f, 10.0f);
                        eVarL.n(10.0f, -4.48f, 10.0f, -10.0f);
                        eVarL.m(17.52f, 2.0f, 12.0f, 2.0f);
                        eVarL.c();
                        eVarL.k(13.0f, 19.0f);
                        eVarL.h(-2.0f);
                        eVarL.p(-2.0f);
                        eVarL.h(2.0f);
                        eVarL.p(2.0f);
                        eVarL.c();
                        eVarL.k(15.07f, 11.25f);
                        eVarL.j(-0.9f, 0.92f);
                        eVarL.d(13.45f, 12.9f, 13.0f, 13.5f, 13.0f, 15.0f);
                        eVarL.h(-2.0f);
                        eVarL.p(-0.5f);
                        eVarL.e(0.0f, -1.1f, 0.45f, -2.1f, 1.17f, -2.83f);
                        eVarL.j(1.24f, -1.26f);
                        eVarL.e(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
                        eVarL.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        eVarL.n(-2.0f, 0.9f, -2.0f, 2.0f);
                        eVarL.i(8.0f, 9.0f);
                        eVarL.e(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
                        eVarL.n(4.0f, 1.79f, 4.0f, 4.0f);
                        eVarL.e(0.0f, 0.88f, -0.36f, 1.68f, -0.93f, 2.25f);
                        eVarL.c();
                        u4.d.a.b(aVar18, eVarL.f168407a, 0, t1Var, 1.0f, null, 1.0f, i24, 1.0f);
                        dVarC = aVar18.c();
                        c3.c.f23770a = dVarC;
                    }
                    u4.d dVar2 = dVarC;
                    r rVarA = c2.l.A(x2.z(aVar15, null, 3), eVar4.f97918c, 0.0f, 2);
                    boolean zR4 = mVar9.r(b0Var3) | mVar9.B(mcVar);
                    Object objQ10 = mVar9.q();
                    if (zR4) {
                        objQ10 = new cn1.t(b0Var3, mcVar, 12);
                        mVar9.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new cn1.t(b0Var3, mcVar, 12);
                            mVar9.K(objQ10);
                        }
                    }
                    i7.b(dVar2, null, w.d(rVarA, false, null, null, (e23.a) objQ10, 15), 0L, mVar9, 48, 8);
                    r rVarZ2 = x2.z(aVar15, null, 3);
                    ef efVarA = d92.c.a(ff.f88115a, mVar9);
                    boolean zB3 = mVar9.B(lVar5);
                    Object objQ11 = mVar9.q();
                    if (zB3) {
                        objQ11 = new fb0.d(lVar5, 16);
                        mVar9.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new fb0.d(lVar5, 16);
                            mVar9.K(objQ11);
                        }
                    }
                    hf.a(this.f2737c, (e23.l) objQ11, rVarZ2, false, efVarA, mVar9, 384, 88);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                hq.w.a((r) obj5, (List) obj4, (List) obj3, this.f2737c, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ht1.w.e((r) obj5, this.f2737c, (p1) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                i11.n.a(this.f2737c, (e23.l) obj5, (z3.e) obj4, (r) obj3, (p3.m) obj, p0.t(433));
                return Unit.INSTANCE;
            case 20:
                com.garmin.android.apps.connectmobile.contacts.emergency.f fVar3 = (com.garmin.android.apps.connectmobile.contacts.emergency.f) obj4;
                e23.l lVar6 = (e23.l) obj5;
                l20.c cVar2 = (l20.c) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.contacts.emergency.f.a aVar19 = com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    boolean z17 = this.f2737c;
                    String strQ5 = y.Q(mVar10, z17 ? R.string.activities_indoor_climb_lbl_send : R.string.lbl_connections_request_sent);
                    r.a aVar20 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY2 = c2.l.y(aVar20, j92.b.f97899b.f97916a);
                    i3.c1 c1Var2 = i3.c1.f87691a;
                    long jE = d92.b.a(mVar10).e().e();
                    long j8 = d92.b.a(mVar10).k().f63527d;
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar10);
                    long jD = d92.b.a(mVar10).k().d();
                    c1Var2.getClass();
                    b1 b1VarA = i3.c1.a(jE, j8, jC, jD, mVar10, 0);
                    boolean zB4 = mVar10.B(lVar6) | mVar10.r(cVar2);
                    Object objQ12 = mVar10.q();
                    if (zB4) {
                        objQ12 = new i91.c(i16, lVar6, cVar2);
                        mVar10.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new i91.c(i16, lVar6, cVar2);
                            mVar10.K(objQ12);
                        }
                    }
                    e23.a aVar21 = (e23.a) objQ12;
                    long jC2 = d92.b.a(mVar10).k().c();
                    if (z17) {
                        mVar10.C(-1135871792);
                    } else {
                        mVar10.C(-1560661316);
                        g6.f.a aVar22 = g6.f.f75994b;
                        uVarA = u1.n.a(2, d92.b.a(mVar10).j().d());
                    }
                    mVar10.f();
                    fVar3.v6(strQ5, rVarY2, z17, b1VarA, null, aVar21, jC2, null, uVarA, mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                jk1.d.c((jk1.e) obj5, this.f2737c, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                e23.a aVar23 = (e23.a) obj5;
                jl1.g gVar = (jl1.g) obj4;
                p1 p1Var4 = (p1) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    String strQ6 = y.Q(mVar11, R.string.lbl_select_activities);
                    String strQ7 = y.Q(mVar11, R.string.lbl_save);
                    jl1.d dVar3 = (jl1.d) p1Var4.getF182175a();
                    i53.f fVarA2 = i53.a.a(new i3("SAVE", strQ7, !s.g(dVar3.f99482e, dVar3.f99481d) || z15, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zR5 = mVar11.r(gVar) | mVar11.h(z15);
                    Object objQ13 = mVar11.q();
                    if (zR5) {
                        objQ13 = new as2.d(gVar, z15, 11);
                        mVar11.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new as2.d(gVar, z15, 11);
                            mVar11.K(objQ13);
                        }
                    }
                    z02.f.d(strQ6, null, null, aVar23, fVarA2, null, (e23.l) objQ13, mVar11, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                jy0.i.a((Context) obj4, (sy0.f) obj3, this.f2737c, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                k82.c.c((r) obj5, (u4.d) obj4, this.f2737c, (e23.a) obj3, (p3.m) obj, p0.t(24583));
                return Unit.INSTANCE;
            case 25:
                List list2 = (List) obj5;
                o82.g gVar2 = (o82.g) obj4;
                if1.b bVar6 = (if1.b) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    if (list2 == null || !(!list2.isEmpty())) {
                        mVar12.C(957178249);
                        mVar12.f();
                    } else {
                        mVar12.C(956035062);
                        c2.j.f22691a.getClass();
                        c2.j.c cVar3 = c2.j.f22696f;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar5 = j92.b.f97899b;
                        c2.t0.a(c2.l.A(c2.l.A(x2.f(r.S, 1.0f), 0.0f, gVar2 == o82.g.f130854g ? eVar5.f97918c : eVar5.f97921f, 1), eVar5.f97920e, 0.0f, 2), cVar3, c2.j.i(eVar5.f97918c), null, 0, 0, z3.f.c(-847524679, new kf1.i(bVar6, gVar2, z15), mVar12), mVar12, 1572912, 56);
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 26:
                return a(obj, obj2);
            case 27:
                return b(obj, obj2);
            case 28:
                return c(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                p2 p2Var = p2.f111205a;
                ((p2) obj5).c(p0.t(3073), (String) obj4, (String) obj3, (p3.m) obj, this.f2737c);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(r rVar, e23.a aVar, boolean z14, String str) {
        this.f2735a = 4;
        this.f2736b = rVar;
        this.f2739e = aVar;
        this.f2737c = z14;
        this.f2738d = str;
    }

    public /* synthetic */ g(Object obj, e23.a aVar, boolean z14, p1 p1Var, int i14) {
        this.f2735a = i14;
        this.f2736b = obj;
        this.f2738d = aVar;
        this.f2737c = z14;
        this.f2739e = p1Var;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, boolean z14, int i14, int i15) {
        this.f2735a = i15;
        this.f2736b = obj;
        this.f2738d = obj2;
        this.f2739e = obj3;
        this.f2737c = z14;
    }

    public /* synthetic */ g(Object obj, Object obj2, boolean z14, Object obj3, int i14, int i15) {
        this.f2735a = i15;
        this.f2736b = obj;
        this.f2738d = obj2;
        this.f2737c = z14;
        this.f2739e = obj3;
    }

    public /* synthetic */ g(Object obj, Object obj2, boolean z14, o13.h hVar, int i14, int i15) {
        this.f2735a = i15;
        this.f2738d = obj;
        this.f2739e = obj2;
        this.f2737c = z14;
        this.f2736b = hVar;
    }

    public /* synthetic */ g(Object obj, boolean z14, Object obj2, Object obj3, int i14, int i15) {
        this.f2735a = i15;
        this.f2736b = obj;
        this.f2737c = z14;
        this.f2738d = obj2;
        this.f2739e = obj3;
    }

    public /* synthetic */ g(List list, o82.g gVar, if1.b bVar, boolean z14) {
        this.f2735a = 25;
        this.f2736b = list;
        this.f2738d = gVar;
        this.f2739e = bVar;
        this.f2737c = z14;
    }

    public /* synthetic */ g(o13.h hVar, boolean z14, Object obj, Object obj2, int i14) {
        this.f2735a = i14;
        this.f2736b = hVar;
        this.f2737c = z14;
        this.f2738d = obj;
        this.f2739e = obj2;
    }

    public /* synthetic */ g(o53.b0 b0Var, mc mcVar, boolean z14, e23.l lVar) {
        this.f2735a = 16;
        this.f2738d = b0Var;
        this.f2739e = mcVar;
        this.f2737c = z14;
        this.f2736b = lVar;
    }

    public /* synthetic */ g(us1.n nVar, boolean z14, e23.a aVar, e23.l lVar, int i14) {
        this.f2735a = 9;
        this.f2738d = nVar;
        this.f2737c = z14;
        this.f2739e = aVar;
        this.f2736b = lVar;
    }

    public /* synthetic */ g(boolean z14, e23.l lVar, z3.e eVar, r rVar, int i14) {
        this.f2735a = 19;
        this.f2737c = z14;
        this.f2736b = lVar;
        this.f2738d = eVar;
        this.f2739e = rVar;
    }

    public /* synthetic */ g(boolean z14, Object obj, Object obj2, Object obj3, int i14) {
        this.f2735a = i14;
        this.f2737c = z14;
        this.f2736b = obj;
        this.f2738d = obj2;
        this.f2739e = obj3;
    }
}
