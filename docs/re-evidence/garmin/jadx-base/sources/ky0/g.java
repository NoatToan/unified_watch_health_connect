package ky0;

import com.garmin.android.apps.connectmobile.R;
import i3.mc;
import i3.mh;
import l72.v2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f107315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f107316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p f107317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc f107318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f107319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f107320g;

    public /* synthetic */ g(boolean z14, o53.b0 b0Var, e23.p pVar, mc mcVar, p3.p1 p1Var, p3.p1 p1Var2, int i14) {
        this.f107314a = i14;
        this.f107315b = z14;
        this.f107316c = b0Var;
        this.f107317d = pVar;
        this.f107318e = mcVar;
        this.f107319f = p1Var;
        this.f107320g = p1Var2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f107314a;
        boolean z14 = this.f107315b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_save);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var = j92.f.f97931h;
                    long jE = ds.e0.e(mVar);
                    h4.r.a aVar = h4.r.S;
                    final int i15 = 0;
                    final o53.b0 b0Var = this.f107316c;
                    final e23.p pVar = this.f107317d;
                    final mc mcVar = this.f107318e;
                    final p3.p1 p1Var = this.f107319f;
                    final p3.p1 p1Var2 = this.f107320g;
                    h4.r rVarA = v2.a(v2.a(aVar, z14, new e23.q() { // from class: ky0.h
                        /* JADX WARN: Code duplicated, block: B:15:0x0085  */
                        /* JADX WARN: Code duplicated, block: B:8:0x0037  */
                        @Override // e23.q
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i16 = i15;
                            p3.m.a aVar2 = p3.m.f135153a;
                            switch (i16) {
                                case 0:
                                    h4.r rVar = (h4.r) obj3;
                                    p3.m mVar2 = (p3.m) obj4;
                                    v.h.y(156379584, rVar, (Integer) obj5, mVar2);
                                    p3.x1 x1Var2 = p3.n.f135158a;
                                    final o53.b0 b0Var2 = b0Var;
                                    boolean zR = mVar2.r(b0Var2);
                                    final e23.p pVar2 = pVar;
                                    boolean zB = zR | mVar2.B(pVar2);
                                    final mc mcVar2 = mcVar;
                                    boolean zB2 = zB | mVar2.B(mcVar2);
                                    Object objQ = mVar2.q();
                                    if (zB2) {
                                        final int i17 = 0;
                                        final p3.p1 p1Var3 = p1Var;
                                        final p3.p1 p1Var4 = p1Var2;
                                        e23.a aVar3 = new e23.a() { // from class: ky0.j
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i17) {
                                                    case 0:
                                                        ge1.b.T(b0Var2, null, null, new o(pVar2, mcVar2, p1Var3, p1Var4, null), 3);
                                                        break;
                                                    default:
                                                        ge1.b.T(b0Var2, null, null, new yr.u(pVar2, mcVar2, p1Var3, p1Var4, null), 3);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar2.K(aVar3);
                                        objQ = aVar3;
                                    } else {
                                        aVar2.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            final int i18 = 0;
                                            final p3.p1 p1Var5 = p1Var;
                                            final p3.p1 p1Var6 = p1Var2;
                                            e23.a aVar4 = new e23.a() { // from class: ky0.j
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i18) {
                                                        case 0:
                                                            ge1.b.T(b0Var2, null, null, new o(pVar2, mcVar2, p1Var5, p1Var6, null), 3);
                                                            break;
                                                        default:
                                                            ge1.b.T(b0Var2, null, null, new yr.u(pVar2, mcVar2, p1Var5, p1Var6, null), 3);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar2.K(aVar4);
                                            objQ = aVar4;
                                        }
                                    }
                                    h4.r rVarD = u1.w.d(rVar, false, null, null, (e23.a) objQ, 15);
                                    mVar2.f();
                                    return rVarD;
                                default:
                                    h4.r rVar2 = (h4.r) obj3;
                                    p3.m mVar3 = (p3.m) obj4;
                                    v.h.y(899164430, rVar2, (Integer) obj5, mVar3);
                                    p3.x1 x1Var3 = p3.n.f135158a;
                                    final o53.b0 b0Var3 = b0Var;
                                    boolean zR2 = mVar3.r(b0Var3);
                                    final e23.p pVar3 = pVar;
                                    boolean zB3 = zR2 | mVar3.B(pVar3);
                                    final mc mcVar3 = mcVar;
                                    boolean zB4 = zB3 | mVar3.B(mcVar3);
                                    Object objQ2 = mVar3.q();
                                    if (zB4) {
                                        final int i19 = 1;
                                        final p3.p1 p1Var7 = p1Var;
                                        final p3.p1 p1Var8 = p1Var2;
                                        e23.a aVar5 = new e23.a() { // from class: ky0.j
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i19) {
                                                    case 0:
                                                        ge1.b.T(b0Var3, null, null, new o(pVar3, mcVar3, p1Var7, p1Var8, null), 3);
                                                        break;
                                                    default:
                                                        ge1.b.T(b0Var3, null, null, new yr.u(pVar3, mcVar3, p1Var7, p1Var8, null), 3);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar3.K(aVar5);
                                        objQ2 = aVar5;
                                    } else {
                                        aVar2.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            final int i110 = 1;
                                            final p3.p1 p1Var9 = p1Var;
                                            final p3.p1 p1Var10 = p1Var2;
                                            e23.a aVar6 = new e23.a() { // from class: ky0.j
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i110) {
                                                        case 0:
                                                            ge1.b.T(b0Var3, null, null, new o(pVar3, mcVar3, p1Var9, p1Var10, null), 3);
                                                            break;
                                                        default:
                                                            ge1.b.T(b0Var3, null, null, new yr.u(pVar3, mcVar3, p1Var9, p1Var10, null), 3);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(aVar6);
                                            objQ2 = aVar6;
                                        }
                                    }
                                    h4.r rVarD2 = u1.w.d(rVar2, false, null, null, (e23.a) objQ2, 15);
                                    mVar3.f();
                                    return rVarD2;
                            }
                        }
                    }, mVar, 6), !z14, new kq.r(13), mVar, 0);
                    d92.b.f58625c.getClass();
                    mh.c(strQ, c2.l.y(rVarA, j92.b.f97899b.f97920e), jE, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 131064);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar2, R.string.lbl_save);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var2 = j92.f.f97931h;
                    long jE2 = ds.e0.e(mVar2);
                    h4.r.a aVar2 = h4.r.S;
                    final int i16 = 1;
                    final o53.b0 b0Var2 = this.f107316c;
                    final e23.p pVar2 = this.f107317d;
                    final mc mcVar2 = this.f107318e;
                    final p3.p1 p1Var3 = this.f107319f;
                    final p3.p1 p1Var4 = this.f107320g;
                    h4.r rVarA2 = v2.a(v2.a(aVar2, z14, new e23.q() { // from class: ky0.h
                        /* JADX WARN: Code duplicated, block: B:15:0x0085  */
                        /* JADX WARN: Code duplicated, block: B:8:0x0037  */
                        @Override // e23.q
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i17 = i16;
                            p3.m.a aVar3 = p3.m.f135153a;
                            switch (i17) {
                                case 0:
                                    h4.r rVar = (h4.r) obj3;
                                    p3.m mVar3 = (p3.m) obj4;
                                    v.h.y(156379584, rVar, (Integer) obj5, mVar3);
                                    p3.x1 x1Var3 = p3.n.f135158a;
                                    final o53.b0 b0Var3 = b0Var2;
                                    boolean zR = mVar3.r(b0Var3);
                                    final e23.p pVar3 = pVar2;
                                    boolean zB = zR | mVar3.B(pVar3);
                                    final mc mcVar3 = mcVar2;
                                    boolean zB2 = zB | mVar3.B(mcVar3);
                                    Object objQ = mVar3.q();
                                    if (zB2) {
                                        final int i18 = 0;
                                        final p3.p1 p1Var5 = p1Var3;
                                        final p3.p1 p1Var6 = p1Var4;
                                        e23.a aVar4 = new e23.a() { // from class: ky0.j
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i18) {
                                                    case 0:
                                                        ge1.b.T(b0Var3, null, null, new o(pVar3, mcVar3, p1Var5, p1Var6, null), 3);
                                                        break;
                                                    default:
                                                        ge1.b.T(b0Var3, null, null, new yr.u(pVar3, mcVar3, p1Var5, p1Var6, null), 3);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar3.K(aVar4);
                                        objQ = aVar4;
                                    } else {
                                        aVar3.getClass();
                                        if (objQ == p3.m.a.f135155b) {
                                            final int i19 = 0;
                                            final p3.p1 p1Var7 = p1Var3;
                                            final p3.p1 p1Var8 = p1Var4;
                                            e23.a aVar5 = new e23.a() { // from class: ky0.j
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i19) {
                                                        case 0:
                                                            ge1.b.T(b0Var3, null, null, new o(pVar3, mcVar3, p1Var7, p1Var8, null), 3);
                                                            break;
                                                        default:
                                                            ge1.b.T(b0Var3, null, null, new yr.u(pVar3, mcVar3, p1Var7, p1Var8, null), 3);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar3.K(aVar5);
                                            objQ = aVar5;
                                        }
                                    }
                                    h4.r rVarD = u1.w.d(rVar, false, null, null, (e23.a) objQ, 15);
                                    mVar3.f();
                                    return rVarD;
                                default:
                                    h4.r rVar2 = (h4.r) obj3;
                                    p3.m mVar4 = (p3.m) obj4;
                                    v.h.y(899164430, rVar2, (Integer) obj5, mVar4);
                                    p3.x1 x1Var4 = p3.n.f135158a;
                                    final o53.b0 b0Var4 = b0Var2;
                                    boolean zR2 = mVar4.r(b0Var4);
                                    final e23.p pVar4 = pVar2;
                                    boolean zB3 = zR2 | mVar4.B(pVar4);
                                    final mc mcVar4 = mcVar2;
                                    boolean zB4 = zB3 | mVar4.B(mcVar4);
                                    Object objQ2 = mVar4.q();
                                    if (zB4) {
                                        final int i110 = 1;
                                        final p3.p1 p1Var9 = p1Var3;
                                        final p3.p1 p1Var10 = p1Var4;
                                        e23.a aVar6 = new e23.a() { // from class: ky0.j
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i110) {
                                                    case 0:
                                                        ge1.b.T(b0Var4, null, null, new o(pVar4, mcVar4, p1Var9, p1Var10, null), 3);
                                                        break;
                                                    default:
                                                        ge1.b.T(b0Var4, null, null, new yr.u(pVar4, mcVar4, p1Var9, p1Var10, null), 3);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar4.K(aVar6);
                                        objQ2 = aVar6;
                                    } else {
                                        aVar3.getClass();
                                        if (objQ2 == p3.m.a.f135155b) {
                                            final int i111 = 1;
                                            final p3.p1 p1Var11 = p1Var3;
                                            final p3.p1 p1Var12 = p1Var4;
                                            e23.a aVar7 = new e23.a() { // from class: ky0.j
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i111) {
                                                        case 0:
                                                            ge1.b.T(b0Var4, null, null, new o(pVar4, mcVar4, p1Var11, p1Var12, null), 3);
                                                            break;
                                                        default:
                                                            ge1.b.T(b0Var4, null, null, new yr.u(pVar4, mcVar4, p1Var11, p1Var12, null), 3);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar4.K(aVar7);
                                            objQ2 = aVar7;
                                        }
                                    }
                                    h4.r rVarD2 = u1.w.d(rVar2, false, null, null, (e23.a) objQ2, 15);
                                    mVar4.f();
                                    return rVarD2;
                            }
                        }
                    }, mVar2, 6), !z14, new yp0.b(4), mVar2, 0);
                    d92.b.f58625c.getClass();
                    mh.c(strQ2, c2.l.y(rVarA2, j92.b.f97899b.f97920e), jE2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar2, 0, 0, 131064);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
