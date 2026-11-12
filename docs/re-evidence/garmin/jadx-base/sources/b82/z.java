package b82;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16907a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f16909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f16910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f16911e;

    public /* synthetic */ z(e23.l lVar, e23.l lVar2, boolean z14, p3.p1 p1Var) {
        this.f16909c = lVar;
        this.f16910d = lVar2;
        this.f16908b = z14;
        this.f16911e = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ce  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f16907a;
        p3.m.a aVar = p3.m.f135153a;
        final p3.p1 p1Var = this.f16911e;
        final e23.l lVar = this.f16910d;
        final e23.l lVar2 = this.f16909c;
        boolean z14 = this.f16908b;
        final int i15 = 0;
        switch (i14) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                t0 t0Var = t0.f16792a;
                ((r1.l) obj).getClass();
                p3.x1 x1Var = p3.n.f135158a;
                if (zBooleanValue) {
                    mVar.C(1889437489);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = v62.n1.a(t62.b.f162798a);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarM = x2.m(aVar2, j92.b.f97901d.f97904c);
                    boolean zB = mVar.B(lVar2) | mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new e23.a() { // from class: b82.i0
                            @Override // e23.a
                            public final Object invoke() {
                                int i16 = i15;
                                p3.p1 p1Var2 = p1Var;
                                e23.l lVar3 = lVar;
                                e23.l lVar4 = lVar2;
                                switch (i16) {
                                    case 0:
                                        t0 t0Var2 = t0.f16792a;
                                        x5.l0 l0Var = (x5.l0) lVar4.invoke(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                                        if (l0Var != null) {
                                            lVar3.invoke(l0Var.f188878a.f157138b);
                                            p1Var2.setValue(l0Var);
                                        }
                                        break;
                                    default:
                                        x5.l0 l0Var2 = (x5.l0) lVar4.invoke(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                                        if (l0Var2 != null) {
                                            lVar3.invoke(l0Var2.f188878a.f157138b);
                                            p1Var2.setValue(l0Var2);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e23.a() { // from class: b82.i0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i16 = i15;
                                    p3.p1 p1Var2 = p1Var;
                                    e23.l lVar3 = lVar;
                                    e23.l lVar4 = lVar2;
                                    switch (i16) {
                                        case 0:
                                            t0 t0Var2 = t0.f16792a;
                                            x5.l0 l0Var = (x5.l0) lVar4.invoke(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                                            if (l0Var != null) {
                                                lVar3.invoke(l0Var.f188878a.f157138b);
                                                p1Var2.setValue(l0Var);
                                            }
                                            break;
                                        default:
                                            x5.l0 l0Var2 = (x5.l0) lVar4.invoke(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                                            if (l0Var2 != null) {
                                                lVar3.invoke(l0Var2.f188878a.f157138b);
                                                p1Var2.setValue(l0Var2);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    i7.b(dVarA, null, u1.w.d(rVarM, false, null, null, (e23.a) objQ, 15), sn.a.b(mVar), mVar, 48, 0);
                    mVar.f();
                } else if (z14) {
                    mVar.C(1890401434);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar = j92.b.f97901d;
                    float f14 = cVar.f97904c;
                    float f15 = cVar.f97903b;
                    h4.r rVarN = x2.n(aVar3, f14, f14);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarN, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
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
                    i7.a(n5.c.a(R.drawable.ic_exclamation, mVar, 0), null, u1.n.e(l4.k.b(c2.u.f22885a.c(x2.u(x2.h(aVar3, f15), f15), h4.d.a.f81528f), k2.i.f102406a), d92.b.a(mVar).f().f(), o4.m1.f128891a), d92.b.a(mVar).f().f63508c, mVar, 48, 0);
                    mVar.y();
                    mVar.f();
                } else {
                    mVar.C(1891508506);
                    mVar.f();
                }
                return Unit.INSTANCE;
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                if (zBooleanValue2 && !z14) {
                    mVar2.C(1306561692);
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = v62.n1.a(t62.b.f162798a);
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarM2 = x2.m(aVar5, j92.b.f97901d.f97904c);
                    boolean zB2 = mVar2.B(lVar2) | mVar2.B(lVar);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        final int i16 = 1;
                        objQ2 = new e23.a() { // from class: b82.i0
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                p3.p1 p1Var2 = p1Var;
                                e23.l lVar3 = lVar;
                                e23.l lVar4 = lVar2;
                                switch (i17) {
                                    case 0:
                                        t0 t0Var2 = t0.f16792a;
                                        x5.l0 l0Var = (x5.l0) lVar4.invoke(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                                        if (l0Var != null) {
                                            lVar3.invoke(l0Var.f188878a.f157138b);
                                            p1Var2.setValue(l0Var);
                                        }
                                        break;
                                    default:
                                        x5.l0 l0Var2 = (x5.l0) lVar4.invoke(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                                        if (l0Var2 != null) {
                                            lVar3.invoke(l0Var2.f188878a.f157138b);
                                            p1Var2.setValue(l0Var2);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int i17 = 1;
                            objQ2 = new e23.a() { // from class: b82.i0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i18 = i17;
                                    p3.p1 p1Var2 = p1Var;
                                    e23.l lVar3 = lVar;
                                    e23.l lVar4 = lVar2;
                                    switch (i18) {
                                        case 0:
                                            t0 t0Var2 = t0.f16792a;
                                            x5.l0 l0Var = (x5.l0) lVar4.invoke(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                                            if (l0Var != null) {
                                                lVar3.invoke(l0Var.f188878a.f157138b);
                                                p1Var2.setValue(l0Var);
                                            }
                                            break;
                                        default:
                                            x5.l0 l0Var2 = (x5.l0) lVar4.invoke(new x5.l0("", 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                                            if (l0Var2 != null) {
                                                lVar3.invoke(l0Var2.f188878a.f157138b);
                                                p1Var2.setValue(l0Var2);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    i7.b(dVarA2, null, u1.w.d(rVarM2, false, null, null, (e23.a) objQ2, 15), sn.a.b(mVar2), mVar2, 48, 0);
                    mVar2.f();
                } else if (z14) {
                    mVar2.C(1307469589);
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar2 = j92.b.f97901d;
                    float f16 = cVar2.f97904c;
                    float f17 = cVar2.f97903b;
                    h4.r rVarN2 = x2.n(aVar6, f16, f16);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarN2, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    i7.a(n5.c.a(R.drawable.ic_exclamation, mVar2, 0), null, u1.n.e(l4.k.b(c2.u.f22885a.c(x2.u(x2.h(aVar6, f17), f17), h4.d.a.f81528f), k2.i.f102406a), d92.b.a(mVar2).f().f(), o4.m1.f128891a), d92.b.a(mVar2).f().f63508c, mVar2, 48, 0);
                    mVar2.y();
                    mVar2.f();
                } else {
                    mVar2.C(1308511313);
                    mVar2.f();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ z(boolean z14, e23.l lVar, e23.l lVar2, p3.p1 p1Var) {
        this.f16908b = z14;
        this.f16909c = lVar;
        this.f16910d = lVar2;
        this.f16911e = p1Var;
    }
}
