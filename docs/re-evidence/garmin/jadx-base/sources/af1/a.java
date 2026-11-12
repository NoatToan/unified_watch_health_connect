package af1;

import a03.h0;
import b82.y0;
import c2.b0;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h4.r;
import h5.e0;
import i3.mh;
import kotlin.k2;
import l72.f0;
import l72.g1;
import l72.y2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.x1;
import s5.x0;
import t21.r0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f3069d;

    public /* synthetic */ a(e23.a aVar, String str, String str2) {
        this.f3066a = 2;
        this.f3069d = aVar;
        this.f3067b = str;
        this.f3068c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x02aa  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3066a;
        String str = this.f3067b;
        e23.a aVar = this.f3069d;
        String str2 = this.f3068c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                b.a(str, str2, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                cr.g.b(str, str2, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    Unit unit = Unit.INSTANCE;
                    boolean zB = mVar.B(aVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new h0(aVar, 21);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(aVar, 21);
                            mVar.K(objQ);
                        }
                    }
                    l0.a(unit, (e23.l) objQ, mVar);
                    u4.d.b bVar = u4.d.f168373k;
                    y0.c(this.f3067b, n5.e.b(R.drawable.stopwatch_outline, mVar, 6), null, null, null, null, z3.f.c(207703669, new as.p(str2, 17), mVar), mVar, 1572864, 60);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                g1.a(str, str2, aVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarD = x2.d(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(rVarD, mVar2);
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
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    u uVar = u.f22885a;
                    r0.a(uVar.c(aVar2, h4.d.a.f81528f), mVar2, 0);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97920e;
                    float f15 = eVar2.f97921f;
                    r rVarD2 = x2.d(c2.l.y(aVar2, f14), 1.0f);
                    c2.j.f22691a.getClass();
                    z zVarA = y.a(c2.j.f22696f, h4.d.a.f81537o, mVar2, 54);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    r rVarC2 = h4.k.c(rVarD2, mVar2);
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
                    b4.c(eVar, zVarA, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58624b.getClass();
                    x0 x0VarE = d92.c.e(j92.f.f97930g);
                    long j8 = d92.b.a(mVar2).k().f63527d;
                    d6.h.f57752b.getClass();
                    int i15 = d6.h.f57755e;
                    mh.c(this.f3067b, null, j8, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarE, mVar2, 0, 0, 130042);
                    y2.f111386a.c(100.0f, c2.l.y(aVar2, f15), false, mVar2, 6, 4);
                    x0 x0VarE2 = d92.c.e(j92.f.f97931h);
                    mh.c(this.f3068c, c2.l.A(aVar2, eVar2.f97920e, 0.0f, 2), d92.b.a(mVar2).k().f63527d, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarE2, mVar2, 0, 0, 130040);
                    mVar2.y();
                    r rVarC3 = uVar.c(c2.l.y(c2.l.H(x2.f(aVar2, 1.0f), k2.f91249a, new bt1.s(29)), f15), h4.d.a.f81531i);
                    z zVarA2 = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    r rVarC4 = h4.k.c(rVarC3, mVar2);
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
                    b4.c(eVar, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC4, mVar2);
                    f0.f110999a.d(384, 9, this.f3069d, x2.f(aVar2, 1.0f), gl1.y.Q(mVar2, R.string.lbl_got_it), mVar2, null, false);
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(String str, String str2, e23.a aVar) {
        this.f3066a = 4;
        this.f3067b = str;
        this.f3068c = str2;
        this.f3069d = aVar;
    }

    public /* synthetic */ a(String str, String str2, e23.a aVar, int i14, int i15) {
        this.f3066a = i15;
        this.f3067b = str;
        this.f3068c = str2;
        this.f3069d = aVar;
    }
}
