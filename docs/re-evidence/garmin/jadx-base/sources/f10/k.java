package f10;

import a11.h0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.r;
import h5.e0;
import i3.mh;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f67863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f67864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f67865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f67866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1 f67867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n1 f67868g;

    public /* synthetic */ k(i53.c cVar, i53.c cVar2, int i14, int i15, n1 n1Var, n1 n1Var2, int i16) {
        this.f67862a = i16;
        this.f67863b = cVar;
        this.f67864c = cVar2;
        this.f67865d = i14;
        this.f67866e = i15;
        this.f67867f = n1Var;
        this.f67868g = n1Var2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f67862a;
        p3.m.a aVar = p3.m.f135153a;
        n1 n1Var = this.f67868g;
        n1 n1Var2 = this.f67867f;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarF = x2.f(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA = y.a(c2.j.f22694d, aVar3, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    r rVarX = x2.x(x2.z(aVar2, null, 3), null, 3);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new h0(n1Var2, 8);
                        mVar.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new h0(n1Var, 9);
                        mVar.K(objQ2);
                    }
                    m.c(rVarX, this.f67863b, this.f67864c, this.f67865d, this.f67866e, lVar, (e23.l) objQ2, mVar, 1769478);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar5 = r.S;
                    r rVarF2 = x2.f(aVar5, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar6 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA2 = y.a(c2.j.f22694d, aVar6, mVar2, 48);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    r rVarC2 = h4.k.c(rVarF2, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA2, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar2);
                    b0 b0Var2 = b0.f22601a;
                    r rVarF3 = x2.f(aVar5, 1.0f);
                    s2 s2VarA = q2.a(c2.j.f22696f, h4.d.a.f81534l, mVar2, 54);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    r rVarC3 = h4.k.c(rVarF3, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, s2VarA, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, mVar2);
                    u2 u2Var = u2.f22900a;
                    r rVarX2 = x2.x(x2.z(aVar5, null, 3), null, 3);
                    int i15 = this.f67865d;
                    Integer numValueOf = Integer.valueOf(i15);
                    i53.c cVar = this.f67863b;
                    int iIndexOf = cVar.contains(numValueOf) ? cVar.indexOf(Integer.valueOf(i15)) : ((Number) p13.h0.m0(cVar)).intValue();
                    Object objQ3 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new h0(n1Var2, 10);
                        mVar2.K(objQ3);
                    }
                    e23.l lVar2 = (e23.l) objQ3;
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new h0(n1Var, 11);
                        mVar2.K(objQ4);
                    }
                    m.a(rVarX2, cVar, this.f67864c, iIndexOf, this.f67866e, lVar2, (e23.l) objQ4, mVar2, 1769478);
                    mh.c(gl1.y.Q(mVar2, mg0.b.c() ? R.string.lbl_pace_unit_km : R.string.lbl_pace_unit_mi), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262142);
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
