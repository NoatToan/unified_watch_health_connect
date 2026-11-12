package m82;

import android.content.Context;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import e23.p;
import e23.r;
import f5.z0;
import h2.c0;
import h2.j0;
import h4.k;
import h5.e0;
import i3.tb;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import wq0.a0;
import wq0.b0;
import wq0.l;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117169a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f117170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f117171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f117172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f117173e;

    public /* synthetic */ b(i53.c cVar, int i14, j0 j0Var, p1 p1Var) {
        this.f117171c = cVar;
        this.f117170b = i14;
        this.f117172d = j0Var;
        this.f117173e = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        int i15 = this.f117169a;
        Object obj5 = this.f117173e;
        Object obj6 = this.f117172d;
        Object obj7 = this.f117171c;
        int i16 = 6;
        switch (i15) {
            case 0:
                i53.c cVar = (i53.c) obj7;
                j0 j0Var = (j0) obj6;
                p1 p1Var = (p1) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                m mVar = (m) obj3;
                ((Integer) obj4).getClass();
                ((c0) obj).getClass();
                x1 x1Var = n.f135158a;
                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                h4.d.f81522a.getClass();
                z0 z0VarD = q.d(h4.d.a.f81528f, false);
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                h4.r rVarC = k.c(rVarD, mVar);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar);
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
                u uVar = u.f22885a;
                ((p) cVar.get(iIntValue)).invoke(mVar, 0);
                if (this.f117170b > 5) {
                    mVar.C(-307698776);
                    d.a(uVar, ((Boolean) p1Var.getF182175a()).booleanValue(), j0Var, mVar, 6);
                    mVar.f();
                } else {
                    mVar.C(-307619013);
                    mVar.f();
                }
                mVar.y();
                return Unit.INSTANCE;
            default:
                a0 a0Var = (a0) obj7;
                Context context = (Context) obj6;
                l lVar = (l) obj5;
                j02.j jVar = (j02.j) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                m mVar2 = (m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                jVar.getClass();
                int i17 = 2;
                if ((iIntValue2 & 6) == 0) {
                    i14 = (mVar2.B(jVar) ? 4 : 2) | iIntValue2;
                } else {
                    i14 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i14 |= mVar2.h(zBooleanValue) ? 32 : 16;
                }
                if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                    x1 x1Var2 = n.f135158a;
                    a0.b bVar2 = (a0.b) a0Var;
                    h4.r rVarE = wz1.i.e(u1.n.e(h4.r.S, fb1.c.z(d92.b.f58623a, mVar2), m1.f128891a), bVar2.f186582b.f166056b, new tb(zBooleanValue, jVar, i16), mVar2, 0);
                    boolean zR = mVar2.r(context) | mVar2.B(a0Var) | mVar2.r(lVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new wn2.f(context, i17, a0Var, lVar);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new wn2.f(context, i17, a0Var, lVar);
                            mVar2.K(objQ);
                        }
                    }
                    g6.f.a aVar2 = g6.f.f75994b;
                    h4.r rVarF = x2.f(c2.l.y(v.c((e23.l) objQ, rVarE, false), 16), 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar3, mVar2, 48);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = k.c(rVarF, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    b0.a(u2.f22900a, bVar2, lVar, this.f117170b, mVar2, 6);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(a0 a0Var, Context context, l lVar, int i14) {
        this.f117171c = a0Var;
        this.f117172d = context;
        this.f117173e = lVar;
        this.f117170b = i14;
    }
}
