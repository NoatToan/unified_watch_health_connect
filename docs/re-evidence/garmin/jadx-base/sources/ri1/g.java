package ri1;

import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import lc.m0;
import o53.s0;
import p005kotlin.Unit;
import p3.l0;
import p3.p1;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152827a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f152828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f152829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f152830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f152831e;

    public /* synthetic */ g(p pVar, m0 m0Var, boolean z14, e23.a aVar) {
        this.f152828b = pVar;
        this.f152830d = m0Var;
        this.f152829c = z14;
        this.f152831e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007e  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x0100  */
    /* JADX WARN: Code duplicated, block: B:30:0x012c  */
    /* JADX WARN: Code duplicated, block: B:35:0x014a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0051  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f152827a;
        p3.m.a aVar = p3.m.f135153a;
        m0 m0Var = this.f152830d;
        final p pVar = this.f152828b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                ((lc.v) obj2).getClass();
                x1 x1Var = p3.n.f135158a;
                p1 p1VarC = s9.c.c(pVar.f152868k, mVar);
                p1 p1VarC2 = s9.c.c(pVar.f152864g, mVar);
                ui1.j jVar = (ui1.j) p1VarC2.getF182175a();
                boolean zB = mVar.B(p1VarC2) | mVar.r(m0Var) | mVar.B(p1VarC);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new i.a(m0Var, p1VarC2, p1VarC, null);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new i.a(m0Var, p1VarC2, p1VarC, null);
                        mVar.K(objQ);
                    }
                }
                l0.e((e23.p) objQ, jVar, mVar);
                ti1.a aVar2 = (ti1.a) p1VarC.getF182175a();
                ui1.j jVar2 = (ui1.j) p1VarC2.getF182175a();
                boolean zR = mVar.r(pVar);
                Object objQ2 = mVar.q();
                if (zR) {
                    objQ2 = new qw0.y(pVar, 14);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new qw0.y(pVar, 14);
                        mVar.K(objQ2);
                    }
                }
                e23.l lVar = (e23.l) objQ2;
                boolean zR2 = mVar.r(pVar);
                Object objQ3 = mVar.q();
                if (zR2) {
                    final int i15 = 1;
                    objQ3 = new e23.a() { // from class: ri1.d
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            int i16 = i15;
                            p pVar2 = pVar;
                            switch (i16) {
                                case 0:
                                    pVar2.getClass();
                                    w9.a aVarA = v1.a(pVar2);
                                    x53.c cVar = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new q(pVar2, null), 2);
                                    boolean zB2 = hb2.g.b(pVar2.f152859b, hb2.g.a.GARMIN_MESSENGER);
                                    p2 p2Var = pVar2.f152865h;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, ti1.b.b((ti1.b) value, zB2, 59)));
                                    break;
                                case 1:
                                    pVar2.x4().b(pVar2.f152858a);
                                    break;
                                default:
                                    pVar2.y4();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        final int i16 = 1;
                        objQ3 = new e23.a() { // from class: ri1.d
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                int i17 = i16;
                                p pVar2 = pVar;
                                switch (i17) {
                                    case 0:
                                        pVar2.getClass();
                                        w9.a aVarA = v1.a(pVar2);
                                        x53.c cVar = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new q(pVar2, null), 2);
                                        boolean zB2 = hb2.g.b(pVar2.f152859b, hb2.g.a.GARMIN_MESSENGER);
                                        p2 p2Var = pVar2.f152865h;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, ti1.b.b((ti1.b) value, zB2, 59)));
                                        break;
                                    case 1:
                                        pVar2.x4().b(pVar2.f152858a);
                                        break;
                                    default:
                                        pVar2.y4();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ3);
                    }
                }
                e23.a aVar3 = (e23.a) objQ3;
                Object objQ4 = mVar.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                final int i17 = 2;
                if (objQ4 == c2565a) {
                    objQ4 = new b(2);
                    mVar.K(objQ4);
                }
                e23.a aVar4 = (e23.a) objQ4;
                boolean zR3 = mVar.r(pVar);
                Object objQ5 = mVar.q();
                if (zR3 || objQ5 == c2565a) {
                    objQ5 = new e23.a() { // from class: ri1.d
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            int i18 = i17;
                            p pVar2 = pVar;
                            switch (i18) {
                                case 0:
                                    pVar2.getClass();
                                    w9.a aVarA = v1.a(pVar2);
                                    x53.c cVar = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new q(pVar2, null), 2);
                                    boolean zB2 = hb2.g.b(pVar2.f152859b, hb2.g.a.GARMIN_MESSENGER);
                                    p2 p2Var = pVar2.f152865h;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, ti1.b.b((ti1.b) value, zB2, 59)));
                                    break;
                                case 1:
                                    pVar2.x4().b(pVar2.f152858a);
                                    break;
                                default:
                                    pVar2.y4();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ5);
                }
                si1.j.d(aVar2, jVar2, this.f152829c, lVar, aVar3, aVar4, this.f152831e, (e23.a) objQ5, mVar, 196608);
                return Unit.INSTANCE;
            default:
                lc.v vVar = (lc.v) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                vVar.getClass();
                x1 x1Var2 = p3.n.f135158a;
                k kVar = (k) lc.w.a(vVar, p005kotlin.jvm.internal.s0.f105811a.b(k.class));
                p1 p1VarC3 = s9.c.c(pVar.f152866i, mVar2);
                b0.a aVar5 = b0.a.ON_RESUME;
                boolean zR4 = mVar2.r(pVar);
                Object objQ6 = mVar2.q();
                final int i18 = 0;
                if (zR4) {
                    objQ6 = new e23.a() { // from class: ri1.d
                        @Override // e23.a
                        public final Object invoke() {
                            Object value;
                            int i19 = i18;
                            p pVar2 = pVar;
                            switch (i19) {
                                case 0:
                                    pVar2.getClass();
                                    w9.a aVarA = v1.a(pVar2);
                                    x53.c cVar = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new q(pVar2, null), 2);
                                    boolean zB2 = hb2.g.b(pVar2.f152859b, hb2.g.a.GARMIN_MESSENGER);
                                    p2 p2Var = pVar2.f152865h;
                                    do {
                                        value = p2Var.getValue();
                                    } while (!p2Var.b(value, ti1.b.b((ti1.b) value, zB2, 59)));
                                    break;
                                case 1:
                                    pVar2.x4().b(pVar2.f152858a);
                                    break;
                                default:
                                    pVar2.y4();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new e23.a() { // from class: ri1.d
                            @Override // e23.a
                            public final Object invoke() {
                                Object value;
                                int i19 = i18;
                                p pVar2 = pVar;
                                switch (i19) {
                                    case 0:
                                        pVar2.getClass();
                                        w9.a aVarA = v1.a(pVar2);
                                        x53.c cVar = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new q(pVar2, null), 2);
                                        boolean zB2 = hb2.g.b(pVar2.f152859b, hb2.g.a.GARMIN_MESSENGER);
                                        p2 p2Var = pVar2.f152865h;
                                        do {
                                            value = p2Var.getValue();
                                        } while (!p2Var.b(value, ti1.b.b((ti1.b) value, zB2, 59)));
                                        break;
                                    case 1:
                                        pVar2.x4().b(pVar2.f152858a);
                                        break;
                                    default:
                                        pVar2.y4();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ6);
                    }
                }
                s9.e.a(aVar5, null, (e23.a) objQ6, mVar2, 6);
                Unit unit = Unit.INSTANCE;
                boolean zR5 = mVar2.r(pVar) | mVar2.B(kVar);
                boolean z14 = this.f152829c;
                boolean zH = zR5 | mVar2.h(z14);
                Object objQ7 = mVar2.q();
                if (zH) {
                    objQ7 = new i.b(pVar, kVar, z14, null);
                    mVar2.K(objQ7);
                } else {
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new i.b(pVar, kVar, z14, null);
                        mVar2.K(objQ7);
                    }
                }
                l0.e((e23.p) objQ7, unit, mVar2);
                ti1.b bVar = (ti1.b) p1VarC3.getF182175a();
                boolean zR6 = mVar2.r(m0Var);
                e23.a aVar6 = this.f152831e;
                boolean zB2 = zR6 | mVar2.B(aVar6);
                Object objQ8 = mVar2.q();
                if (zB2) {
                    objQ8 = new dt.b(m0Var, aVar6, 3);
                    mVar2.K(objQ8);
                } else {
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new dt.b(m0Var, aVar6, 3);
                        mVar2.K(objQ8);
                    }
                }
                i.b(bVar, (e23.a) objQ8, mVar2, 0);
                return unit;
        }
    }

    public /* synthetic */ g(p pVar, boolean z14, m0 m0Var, e23.a aVar) {
        this.f152828b = pVar;
        this.f152829c = z14;
        this.f152830d = m0Var;
        this.f152831e = aVar;
    }
}
