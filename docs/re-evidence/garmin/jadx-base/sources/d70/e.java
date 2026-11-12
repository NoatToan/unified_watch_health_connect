package d70;

import a03.k0;
import c2.c1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import f5.b1;
import f5.v1;
import f5.y0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.dd;
import i3.i7;
import i3.kd;
import i3.mh;
import i3.ud;
import jf.v;
import jf.w;
import o13.p;
import o4.d0;
import o4.m1;
import o4.s0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p008y1.b2;
import p13.t0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import v62.ia;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f58100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58101c;

    public /* synthetic */ e(float f14, Object obj, int i14) {
        this.f58099a = i14;
        this.f58100b = f14;
        this.f58101c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:40:0x0123  */
    /* JADX WARN: Code duplicated, block: B:45:0x0152  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iF0;
        long j8;
        int i14 = this.f58099a;
        Object obj4 = this.f58101c;
        float f14 = this.f58100b;
        switch (i14) {
            case 0:
                x0 x0Var = (x0) obj4;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f15 = eVar.f97918c;
                    float f16 = eVar.f97920e;
                    r rVarA = c2.l.A(aVar, f15, 0.0f, 2);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    s2 s2VarA = q2.a(c0343j, bVar, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarA, mVar);
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
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, s2VarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar);
                    u2 u2Var = u2.f22900a;
                    r rVarR = x2.r(aVar, f16, f14);
                    k2.h hVar = k2.i.f102406a;
                    r rVarB = l4.k.b(rVarR, hVar);
                    gl.c.f77766a.getClass();
                    long jK = gl.c.a(mVar).k();
                    m1.a aVar3 = m1.f128891a;
                    c2.q.a(u1.n.e(rVarB, jK, aVar3), mVar, 0);
                    mh.c(y.Q(mVar, R.string.lbl_anaerobic_capacity), c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 131068);
                    mVar.y();
                    r rVarA2 = c2.l.A(aVar, f15, 0.0f, 2);
                    s2 s2VarA2 = q2.a(c0343j, bVar, mVar, 48);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    r rVarC2 = h4.k.c(rVarA2, mVar);
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
                    b4.c(eVar2, s2VarA2, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    c2.q.a(u1.n.e(l4.k.b(x2.r(aVar, f16, f14), hVar), gl.c.a(mVar).i(), aVar3), mVar, 0);
                    mh.c(y.Q(mVar, R.string.lbl_aerobic_capacity), c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 131068);
                    mVar.y();
                    r rVarA3 = c2.l.A(aVar, f15, 0.0f, 2);
                    s2 s2VarA3 = q2.a(c0343j, bVar, mVar, 48);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    r rVarC3 = h4.k.c(rVarA3, mVar);
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
                    b4.c(eVar2, s2VarA3, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, mVar);
                    c2.q.a(u1.n.e(l4.k.b(x2.r(aVar, f16, f14), hVar), gl.c.a(mVar).o(), aVar3), mVar, 0);
                    mh.c(y.Q(mVar, R.string.lbl_aerobic_endurance), c2.l.C(aVar, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 131068);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ud udVar = (ud) obj4;
                b1 b1Var = (b1) obj;
                dd ddVar = dd.f87874a;
                v1 v1VarQ = ((y0) obj2).Q(((g6.a) obj3).f75988a);
                g6.f.f75994b.getClass();
                if (g6.f.c(f14, g6.f.f75996d)) {
                    iF0 = udVar.f89922m == b2.Vertical ? v1VarQ.f69144a / 2 : v1VarQ.f69145b / 2;
                } else {
                    iF0 = b1Var.f0(f14);
                }
                return b1Var.H1(v1VarQ.f69144a, v1VarQ.f69145b, t0.b(new p(kd.f88709f, Integer.valueOf(iF0))), new k0(v1VarQ, 13));
            case 2:
                p1 p1Var = (p1) obj4;
                w wVar = (w) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i15 = com.garmin.android.apps.connectmobile.userprofile.editimage.c.f46657x;
                wVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(wVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (((jf.d.c) p0.c(wVar.getF98679b().f98632q, mVar2, 0).getF182175a()) instanceof jf.d.c.C1894d) {
                        mVar2.C(-63881957);
                        p1Var.setValue(Boolean.TRUE);
                        v.b(wVar, null, null, null, null, null, 0.0f, null, false, mVar2, iIntValue2 & 14);
                        mVar2.f();
                    } else {
                        mVar2.C(-694791651);
                        b12.k.a(f14, mVar2, 0);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                x3 x3Var = (x3) obj4;
                c2.w wVar2 = (c2.w) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                wVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(wVar2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    float f17 = ((g6.f) r13.b.e(g6.f.a(wVar2.j()), g6.f.a(wVar2.g()))).f75997a / f14;
                    float f18 = f17 - 1.0f;
                    float fFloatValue = (((Number) x3Var.getF182175a()).floatValue() * f18) + 1.0f;
                    float fFloatValue2 = f17 - (((Number) x3Var.getF182175a()).floatValue() * f18);
                    float f19 = (fFloatValue - 1.0f) / f18;
                    float f22 = (fFloatValue2 - 1.0f) / f18;
                    float f24 = 0.15f - (f19 * 0.07f);
                    if (f24 < 0.0f) {
                        f24 = 0.0f;
                    }
                    float f25 = 0.15f - (0.07f * f22);
                    float f26 = f25 >= 0.0f ? f25 : 0.0f;
                    float f27 = 1;
                    final float f28 = f19 * f27;
                    final float f29 = f27 * f22;
                    final long jB = ds.e0.b(d92.b.f58623a, mVar3);
                    final long jA = zl.a.a(mVar3);
                    r.a aVar4 = r.S;
                    r rVarQ = x2.q(aVar4, f14);
                    boolean zI = mVar3.i(fFloatValue);
                    Object objQ = mVar3.q();
                    p3.m.a aVar5 = p3.m.f135153a;
                    if (zI) {
                        objQ = new a81.d(fFloatValue, 6);
                        mVar3.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a81.d(fFloatValue, 6);
                            mVar3.K(objQ);
                        }
                    }
                    r rVarA4 = s0.a(rVarQ, (e23.l) objQ);
                    boolean zL = mVar3.l(jA) | mVar3.i(f24) | mVar3.l(jB) | mVar3.i(f28);
                    Object objQ2 = mVar3.q();
                    if (zL) {
                        final int i16 = 0;
                        final float f34 = f24;
                        objQ2 = new e23.l() { // from class: sa0.g
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                switch (i16) {
                                    case 0:
                                        q4.f fVar2 = (q4.f) obj5;
                                        fVar2.getClass();
                                        q4.f.o0(fVar2, d0.c(f34, jA, 14), 0.0f, 0L, null, 0, 126);
                                        q4.f.o0(fVar2, d0.c(0.4f, jB, 14), 0.0f, 0L, new q4.k(fVar2.s0(f28), 0.0f, 0, 0, null, 30, null), 0, 110);
                                        break;
                                    default:
                                        q4.f fVar3 = (q4.f) obj5;
                                        fVar3.getClass();
                                        q4.f.o0(fVar3, d0.c(f34, jA, 14), 0.0f, 0L, null, 0, 126);
                                        q4.f.o0(fVar3, d0.c(0.4f, jB, 14), 0.0f, 0L, new q4.k(fVar3.s0(f28), 0.0f, 0, 0, null, 30, null), 0, 110);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        j8 = jA;
                        mVar3.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int i17 = 0;
                            final float f35 = f24;
                            objQ2 = new e23.l() { // from class: sa0.g
                                @Override // e23.l
                                public final Object invoke(Object obj5) {
                                    switch (i17) {
                                        case 0:
                                            q4.f fVar2 = (q4.f) obj5;
                                            fVar2.getClass();
                                            q4.f.o0(fVar2, d0.c(f35, jA, 14), 0.0f, 0L, null, 0, 126);
                                            q4.f.o0(fVar2, d0.c(0.4f, jB, 14), 0.0f, 0L, new q4.k(fVar2.s0(f28), 0.0f, 0, 0, null, 30, null), 0, 110);
                                            break;
                                        default:
                                            q4.f fVar3 = (q4.f) obj5;
                                            fVar3.getClass();
                                            q4.f.o0(fVar3, d0.c(f35, jA, 14), 0.0f, 0L, null, 0, 126);
                                            q4.f.o0(fVar3, d0.c(0.4f, jB, 14), 0.0f, 0L, new q4.k(fVar3.s0(f28), 0.0f, 0, 0, null, 30, null), 0, 110);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            j8 = jA;
                            mVar3.K(objQ2);
                        } else {
                            j8 = jA;
                        }
                    }
                    c2.q.a(l4.k.d(rVarA4, (e23.l) objQ2), mVar3, 0);
                    r rVarQ2 = x2.q(aVar4, f14);
                    boolean zI2 = mVar3.i(fFloatValue2);
                    Object objQ3 = mVar3.q();
                    if (zI2) {
                        objQ3 = new a81.d(fFloatValue2, 7);
                        mVar3.K(objQ3);
                    } else {
                        aVar5.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new a81.d(fFloatValue2, 7);
                            mVar3.K(objQ3);
                        }
                    }
                    r rVarA5 = s0.a(rVarQ2, (e23.l) objQ3);
                    boolean zL2 = mVar3.l(j8) | mVar3.i(f26) | mVar3.l(jB) | mVar3.i(f29);
                    Object objQ4 = mVar3.q();
                    if (zL2) {
                        final int i18 = 1;
                        final float f36 = f26;
                        final long j14 = j8;
                        objQ4 = new e23.l() { // from class: sa0.g
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                switch (i18) {
                                    case 0:
                                        q4.f fVar2 = (q4.f) obj5;
                                        fVar2.getClass();
                                        q4.f.o0(fVar2, d0.c(f36, j14, 14), 0.0f, 0L, null, 0, 126);
                                        q4.f.o0(fVar2, d0.c(0.4f, jB, 14), 0.0f, 0L, new q4.k(fVar2.s0(f29), 0.0f, 0, 0, null, 30, null), 0, 110);
                                        break;
                                    default:
                                        q4.f fVar3 = (q4.f) obj5;
                                        fVar3.getClass();
                                        q4.f.o0(fVar3, d0.c(f36, j14, 14), 0.0f, 0L, null, 0, 126);
                                        q4.f.o0(fVar3, d0.c(0.4f, jB, 14), 0.0f, 0L, new q4.k(fVar3.s0(f29), 0.0f, 0, 0, null, 30, null), 0, 110);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ4);
                    } else {
                        aVar5.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int i19 = 1;
                            final float f37 = f26;
                            final long j15 = j8;
                            objQ4 = new e23.l() { // from class: sa0.g
                                @Override // e23.l
                                public final Object invoke(Object obj5) {
                                    switch (i19) {
                                        case 0:
                                            q4.f fVar2 = (q4.f) obj5;
                                            fVar2.getClass();
                                            q4.f.o0(fVar2, d0.c(f37, j15, 14), 0.0f, 0L, null, 0, 126);
                                            q4.f.o0(fVar2, d0.c(0.4f, jB, 14), 0.0f, 0L, new q4.k(fVar2.s0(f29), 0.0f, 0, 0, null, 30, null), 0, 110);
                                            break;
                                        default:
                                            q4.f fVar3 = (q4.f) obj5;
                                            fVar3.getClass();
                                            q4.f.o0(fVar3, d0.c(f37, j15, 14), 0.0f, 0L, null, 0, 126);
                                            q4.f.o0(fVar3, d0.c(0.4f, jB, 14), 0.0f, 0L, new q4.k(fVar3.s0(f29), 0.0f, 0, 0, null, 30, null), 0, 110);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ4);
                        }
                    }
                    c2.q.a(l4.k.d(rVarA5, (e23.l) objQ4), mVar3, 0);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = ia.a(t62.b.f162798a);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, null, x2.q(aVar4, j92.b.f97901d.f97907f), jB, mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
