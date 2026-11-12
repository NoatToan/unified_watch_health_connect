package zo1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.GroupRideGenesisActivity;
import com.google.android.exoplayer2.C;
import i3.ve;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vo1.b f206479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupRideGenesisActivity f206480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f206481d;

    public /* synthetic */ w(vo1.b bVar, GroupRideGenesisActivity groupRideGenesisActivity, long j8, int i14) {
        this.f206478a = i14;
        this.f206479b = bVar;
        this.f206480c = groupRideGenesisActivity;
        this.f206481d = j8;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0285  */
    /* JADX WARN: Code duplicated, block: B:61:0x02d5  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m.a.C2565a c2565a;
        Object objQ;
        vo1.b bVar;
        GroupRideGenesisActivity groupRideGenesisActivity;
        long j8;
        boolean zL;
        Object objQ2;
        switch (this.f206478a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GroupRideGenesisActivity.a aVar = GroupRideGenesisActivity.f44734a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-20685227, new w(this.f206479b, this.f206480c, this.f206481d, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                GroupRideGenesisActivity.a aVar2 = GroupRideGenesisActivity.f44734a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ve.a(null, null, tn.k.a(d92.b.f58623a, mVar2), 0L, 0.0f, 0.0f, null, z3.f.c(61673712, new w(this.f206479b, this.f206480c, this.f206481d, 2), mVar2), mVar2, 12582912, 123);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                GroupRideGenesisActivity.a aVar3 = GroupRideGenesisActivity.f44734a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(aVar4, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar5);
                    } else {
                        mVar3.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar3);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar3);
                    c2.b0 b0Var = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97918c;
                    float f15 = eVar2.f97920e;
                    h4.r rVarC2 = c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, f14, 7);
                    Object objQ3 = mVar3.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new z81.b(24);
                        mVar3.K(objQ3);
                    }
                    h4.r rVarB = p5.v.b(rVarC2, (e23.l) objQ3);
                    h4.g gVar = h4.d.a.f81524b;
                    f5.z0 z0VarD = c2.q.d(gVar, false);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarB, mVar3);
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar5);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar, z0VarD, mVar3);
                    b4.c(c1623g, i2VarX2, mVar3);
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC3, mVar3);
                    c2.u uVar = c2.u.f22885a;
                    t4.d dVarA = n5.c.a(R.drawable.art_group_ride_intro, mVar3, 0);
                    f5.k.f68985a.getClass();
                    f5.k.a.d dVar = f5.k.a.f68990e;
                    g6.f.a aVar6 = g6.f.f75994b;
                    float f16 = 32;
                    u1.y0.a(dVarA, "", c2.l.C(x2.h(x2.f(aVar4, 1.0f), 212), 0.0f, 0.0f, 0.0f, f16, 7), null, dVar, 0.0f, null, mVar3, 25008, 104);
                    h4.r rVarC4 = uVar.c(c2.l.A(aVar4, f15, 0.0f, 2), h4.d.a.f81530h);
                    f5.z0 z0VarD2 = c2.q.d(gVar, false);
                    int iHashCode3 = Long.hashCode(mVar3.getU());
                    i2 i2VarX3 = mVar3.x();
                    h4.r rVarC5 = h4.k.c(rVarC4, mVar3);
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar5);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar, z0VarD2, mVar3);
                    b4.c(c1623g, i2VarX3, mVar3);
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC5, mVar3);
                    final long jE = d92.b.a(mVar3).e().e();
                    final long jB = d92.b.a(mVar3).c().b();
                    final float fG = w02.b0.g(4, mVar3);
                    u4.d.b bVar3 = u4.d.f168373k;
                    final u4.o oVarB = u4.p.b(n5.e.b(R.drawable.group_ride, mVar3, 6), mVar3);
                    final float fG2 = w02.b0.g(f16, mVar3);
                    final float fG3 = w02.b0.g(16, mVar3);
                    final long j14 = d92.b.a(mVar3).f().f63508c;
                    h4.r rVarQ = x2.q(aVar4, j92.b.f97901d.f97907f);
                    boolean zL2 = mVar3.l(jE) | mVar3.l(jB) | mVar3.i(fG) | mVar3.i(fG3) | mVar3.r(oVarB) | mVar3.i(fG2) | mVar3.l(j14);
                    Object objQ4 = mVar3.q();
                    if (zL2) {
                        c2565a = c2565a2;
                    } else {
                        c2565a = c2565a2;
                        if (objQ4 == c2565a) {
                        }
                        u1.n.b(rVarQ, (e23.l) objQ4, mVar3, 0);
                        mVar3.y();
                        mVar3.y();
                        h4.r rVarA = b0Var.a(aVar4, 1.0f, true);
                        objQ = mVar3.q();
                        if (objQ == c2565a) {
                            objQ = new z81.b(25);
                            mVar3.K(objQ);
                        }
                        p3.m.a.C2565a c2565a3 = c2565a;
                        e2.c.b(rVarA, null, null, null, null, null, false, null, (e23.l) objQ, mVar3, C.ENCODING_PCM_32BIT, 510);
                        l72.f0 f0Var = l72.f0.f110999a;
                        String strQ = gl1.y.Q(mVar3, R.string.gcm_body_battery_popover_get_started_button);
                        h4.r rVarY = c2.l.y(x2.f(aVar4, 1.0f), f15);
                        bVar = this.f206479b;
                        boolean zR = mVar3.r(bVar);
                        groupRideGenesisActivity = this.f206480c;
                        boolean zR2 = zR | mVar3.r(groupRideGenesisActivity);
                        j8 = this.f206481d;
                        zL = zR2 | mVar3.l(j8);
                        objQ2 = mVar3.q();
                        if (zL || objQ2 == c2565a3) {
                            d62.s sVar = new d62.s(bVar, groupRideGenesisActivity, j8, 12);
                            mVar3.K(sVar);
                            objQ2 = sVar;
                        }
                        f0Var.d(0, 9, (e23.a) objQ2, rVarY, strQ, mVar3, null, false);
                        mVar3.y();
                    }
                    objQ4 = new e23.l() { // from class: zo1.x
                        @Override // e23.l
                        public final Object invoke(Object obj3) throws Throwable {
                            u4.o oVar = oVarB;
                            float f17 = fG2;
                            long j15 = j14;
                            q4.f fVar2 = (q4.f) obj3;
                            GroupRideGenesisActivity.a aVar7 = GroupRideGenesisActivity.f44734a;
                            fVar2.getClass();
                            q4.f.o0(fVar2, jE, 0.0f, 0L, null, 0, 126);
                            q4.f.o0(fVar2, jB, 0.0f, 0L, new q4.k(fG, 0.0f, 0, 0, null, 30, null), 0, 110);
                            q4.b bVar4 = fVar2.getF142543b().f142550a;
                            float f18 = fG3;
                            bVar4.h(f18, f18);
                            try {
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                                n4.g.a aVar8 = n4.g.f123559b;
                                try {
                                    t4.d.m500drawx_KDEd0$default(oVar, fVar2, jFloatToRawIntBits, 0.0f, o4.e0.a.a(o4.e0.f128843b, j15), 2, null);
                                    float f19 = -f18;
                                    fVar2.getF142543b().f142550a.h(f19, f19);
                                    return Unit.INSTANCE;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fVar2 = fVar2;
                                    Throwable th4 = th;
                                    float f22 = -f18;
                                    fVar2.getF142543b().f142550a.h(f22, f22);
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    };
                    mVar3.K(objQ4);
                    u1.n.b(rVarQ, (e23.l) objQ4, mVar3, 0);
                    mVar3.y();
                    mVar3.y();
                    h4.r rVarA2 = b0Var.a(aVar4, 1.0f, true);
                    objQ = mVar3.q();
                    if (objQ == c2565a) {
                        objQ = new z81.b(25);
                        mVar3.K(objQ);
                    }
                    p3.m.a.C2565a c2565a4 = c2565a;
                    e2.c.b(rVarA2, null, null, null, null, null, false, null, (e23.l) objQ, mVar3, C.ENCODING_PCM_32BIT, 510);
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    String strQ2 = gl1.y.Q(mVar3, R.string.gcm_body_battery_popover_get_started_button);
                    h4.r rVarY2 = c2.l.y(x2.f(aVar4, 1.0f), f15);
                    bVar = this.f206479b;
                    boolean zR3 = mVar3.r(bVar);
                    groupRideGenesisActivity = this.f206480c;
                    boolean zR4 = zR3 | mVar3.r(groupRideGenesisActivity);
                    j8 = this.f206481d;
                    zL = zR4 | mVar3.l(j8);
                    objQ2 = mVar3.q();
                    if (zL) {
                        d62.s sVar2 = new d62.s(bVar, groupRideGenesisActivity, j8, 12);
                        mVar3.K(sVar2);
                        objQ2 = sVar2;
                    } else {
                        d62.s sVar3 = new d62.s(bVar, groupRideGenesisActivity, j8, 12);
                        mVar3.K(sVar3);
                        objQ2 = sVar3;
                    }
                    f0Var2.d(0, 9, (e23.a) objQ2, rVarY2, strQ2, mVar3, null, false);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
