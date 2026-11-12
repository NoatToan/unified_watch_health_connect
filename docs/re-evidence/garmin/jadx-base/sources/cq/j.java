package cq;

import c2.k3;
import c2.n3;
import c2.q3;
import c2.x2;
import gg1.o0;
import h2.j0;
import h5.e0;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import ps.x1;
import rk0.d0;
import rk0.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55032a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f55034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f55038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f55039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f55040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f55041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f55042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o13.h f55043l;

    public /* synthetic */ j(e23.a aVar, e23.a aVar2, e23.p pVar, e23.p pVar2, o0 o0Var, i53.c cVar, String str, p1 p1Var, f0 f0Var, boolean z14, boolean z15) {
        this.f55033b = z14;
        this.f55035d = f0Var;
        this.f55036e = cVar;
        this.f55034c = z15;
        this.f55037f = o0Var;
        this.f55038g = aVar;
        this.f55039h = p1Var;
        this.f55040i = pVar;
        this.f55041j = pVar2;
        this.f55042k = str;
        this.f55043l = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0069  */
    /* JADX WARN: Code duplicated, block: B:18:0x0092  */
    /* JADX WARN: Code duplicated, block: B:23:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f55032a;
        o13.h hVar = this.f55043l;
        Object obj4 = this.f55042k;
        Object obj5 = this.f55041j;
        Object obj6 = this.f55040i;
        Object obj7 = this.f55039h;
        Object obj8 = this.f55038g;
        Object obj9 = this.f55037f;
        Object obj10 = this.f55036e;
        Object obj11 = this.f55035d;
        switch (i14) {
            case 0:
                g3.f fVar = (g3.f) obj11;
                j0 j0Var = (j0) obj10;
                o53.b0 b0Var = (o53.b0) obj9;
                i53.f fVar2 = (i53.f) obj8;
                final x1 x1Var = (x1) obj7;
                final dq.a aVar = (dq.a) obj6;
                final yo1.f fVar3 = (yo1.f) obj5;
                final yo1.d dVar = (yo1.d) obj4;
                final e23.l lVar = (e23.l) hVar;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i15 = k3.f22728a;
                    h4.r rVarA = a5.f.a(c2.l.C(u1.n.e(x2.d(h4.r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a), 0.0f, 0.0f, 0.0f, n3.c(q3.a(mVar), mVar).getF22739d(), 7), new g3.d(new g3.b(fVar), new g3.c(fVar), true), null);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar);
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
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    g02.t.a(j0Var, b0Var, fVar2, null, mVar, 0, 8);
                    int size = fVar2.size();
                    final boolean z14 = this.f55033b;
                    final boolean z15 = this.f55034c;
                    h2.u.a(j0Var, null, null, null, size, 0.0f, null, null, false, null, null, null, null, z3.f.c(-30552643, new e23.r() { // from class: cq.l
                        @Override // e23.r
                        public final Object invoke(Object obj12, Object obj13, Object obj14, Object obj15) {
                            yo1.d dVar2;
                            List<yo1.e> listF;
                            int iIntValue2 = ((Integer) obj13).intValue();
                            p3.m mVar2 = (p3.m) obj14;
                            ((Integer) obj15).getClass();
                            ((h2.c0) obj12).getClass();
                            p3.x1 x1Var3 = p3.n.f135158a;
                            x1 x1Var4 = x1Var;
                            if (iIntValue2 == 0) {
                                mVar2.C(703683485);
                                u.c(x1Var4, aVar, z14, mVar2, x1.G1);
                                mVar2.f();
                            } else if (iIntValue2 == 1) {
                                mVar2.C(703686338);
                                u.f(x1Var4, mVar2, x1.G1);
                                mVar2.f();
                            } else if (iIntValue2 != 2) {
                                mVar2.C(339926917);
                                mVar2.f();
                            } else {
                                mVar2.C(339514090);
                                yo1.f fVar4 = fVar3;
                                Long lValueOf = fVar4 != null ? Long.valueOf(fVar4.getForUserPk()) : null;
                                if (lValueOf != null && (dVar2 = dVar) != null && ((listF = dVar2.f()) == null || !listF.isEmpty())) {
                                    Iterator<T> it = listF.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            mVar2.C(339887237);
                                            mVar2.f();
                                            break;
                                        }
                                        if (((yo1.e) it.next()).getFinal()) {
                                            mVar2.C(339719062);
                                            u.g(lValueOf.longValue(), dVar2, z15, fVar4.getUserCount(), lVar, mVar2, yo1.d.f198429g << 3);
                                            mVar2.f();
                                            break;
                                        }
                                    }
                                } else {
                                    mVar2.C(339887237);
                                    mVar2.f();
                                    break;
                                }
                                mVar2.f();
                            }
                            p3.x1 x1Var5 = p3.n.f135158a;
                            return Unit.INSTANCE;
                        }
                    }, mVar), mVar, 0, 24576, 16366);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                f0 f0Var = (f0) obj11;
                i53.c cVar = (i53.c) obj10;
                o0 o0Var = (o0) obj9;
                e23.a aVar3 = (e23.a) obj8;
                p1 p1Var = (p1) obj7;
                e23.p pVar = (e23.p) obj6;
                e23.p pVar2 = (e23.p) obj5;
                String str = (String) obj4;
                e23.a aVar4 = (e23.a) hVar;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    boolean zB = mVar2.B(p1Var);
                    Object objQ = mVar2.q();
                    p3.m.a aVar5 = p3.m.f135153a;
                    if (zB) {
                        objQ = new qk0.m(p1Var, 29);
                        mVar2.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new qk0.m(p1Var, 29);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar6 = (e23.a) objQ;
                    boolean zR = mVar2.r(f0Var) | mVar2.B(pVar) | mVar2.B(cVar);
                    Object objQ2 = mVar2.q();
                    if (zR) {
                        objQ2 = new q42.v(f0Var, 14, pVar, cVar);
                        mVar2.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new q42.v(f0Var, 14, pVar, cVar);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ2;
                    boolean zR2 = mVar2.r(f0Var) | mVar2.B(pVar2) | mVar2.B(str);
                    Object objQ3 = mVar2.q();
                    if (zR2) {
                        objQ3 = new p90.h(f0Var, 26, pVar2, str);
                        mVar2.K(objQ3);
                    } else {
                        aVar5.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new p90.h(f0Var, 26, pVar2, str);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ3;
                    boolean zB2 = mVar2.B(aVar4);
                    Object objQ4 = mVar2.q();
                    if (zB2) {
                        objQ4 = new qk0.o(aVar4, 27);
                        mVar2.K(objQ4);
                    } else {
                        aVar5.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new qk0.o(aVar4, 27);
                            mVar2.K(objQ4);
                        }
                    }
                    d0.d(this.f55033b, f0Var, cVar, this.f55034c, o0Var, aVar3, aVar6, aVar7, lVar2, (e23.a) objQ4, mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(g3.f fVar, h2.b bVar, o53.b0 b0Var, i53.f fVar2, x1 x1Var, dq.a aVar, boolean z14, yo1.f fVar3, yo1.d dVar, boolean z15, e23.l lVar) {
        this.f55035d = fVar;
        this.f55036e = bVar;
        this.f55037f = b0Var;
        this.f55038g = fVar2;
        this.f55039h = x1Var;
        this.f55040i = aVar;
        this.f55033b = z14;
        this.f55041j = fVar3;
        this.f55042k = dVar;
        this.f55034c = z15;
        this.f55043l = lVar;
    }
}
