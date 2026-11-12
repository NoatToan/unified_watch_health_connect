package hq;

import b82.d2;
import c2.l2;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f72.s9;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85131a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f85132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f85133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f85134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f85135e;

    public /* synthetic */ q(k kVar, String str, boolean z14, boolean z15) {
        this.f85135e = kVar;
        this.f85134d = str;
        this.f85132b = z14;
        this.f85133c = z15;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h4.r rVarA;
        int i14 = this.f85131a;
        boolean z14 = this.f85133c;
        Object obj4 = this.f85135e;
        boolean z15 = this.f85132b;
        switch (i14) {
            case 0:
                k kVar = (k) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97918c;
                    l2 l2VarD = c2.l.d(f14, d.f84986b, f14, f14);
                    int i15 = iIntValue;
                    d2 d2Var = d2.f16532a;
                    if (kVar.f85056f) {
                        h4.r rVarX = c2.l.x(h4.r.S, l2VarD);
                        float f15 = kVar.f85051a + f14;
                        g6.f.a aVar = g6.f.f75994b;
                        rVarA = x2.u(rVarX, f15 + eVar.f97917b + j92.b.f97901d.f97903b);
                    } else {
                        rVarA = t2Var.a(c2.l.x(h4.r.S, l2VarD), 1.0f, true);
                    }
                    int i16 = i15 & 14;
                    d2Var.c(t2Var, this.f85134d, null, rVarA, null, 0, 0, mVar, i16, 58);
                    h4.r.a aVar2 = h4.r.S;
                    d2Var.c(t2Var, gl1.y.Q(mVar, R.string.lbl_time), null, x2.u(c2.l.x(aVar2, l2VarD), kVar.f85052b), null, 0, 0, mVar, i16, 58);
                    d2Var.c(t2Var, gl1.y.Q(mVar, R.string.strength_training_reps), null, x2.u(c2.l.x(aVar2, l2VarD), kVar.f85053c), null, 0, 0, mVar, i16, 58);
                    int i17 = R.string.lbl_lbs;
                    if (z15) {
                        mVar.C(1181513691);
                        d2Var.c(t2Var, gl1.y.Q(mVar, R.string.lbl_weight), gl1.y.Q(mVar, z14 ? R.string.lbl_kg : R.string.lbl_lbs), x2.u(c2.l.x(aVar2, l2VarD), kVar.f85054d), null, 0, 0, mVar, i16, 56);
                        mVar.f();
                    } else {
                        mVar.C(1181864766);
                        mVar.f();
                    }
                    h4.r rVarU = x2.u(c2.l.x(aVar2, l2VarD), kVar.f85055e);
                    String strQ = gl1.y.Q(mVar, R.string.strength_training_volume);
                    if (z14) {
                        i17 = R.string.lbl_kg;
                    }
                    d2Var.c(t2Var, strQ, gl1.y.Q(mVar, i17), rVarU, null, 0, 0, mVar, i16, 56);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                pu0.b bVar = (pu0.b) obj4;
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarA2 = t2Var2.a(aVar3, 1.0f, true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarA2, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String strA = og.a.A(bVar);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f16 = eVar3.f97917b;
                    float f17 = eVar3.f97920e;
                    s2 s2VarA = q2.a(c2.j.i(f16), bVar3, mVar2, 48);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(aVar3, mVar2);
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar2, s2VarA, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    u2 u2Var = u2.f22900a;
                    if (z14) {
                        mVar2.C(-397656879);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = s9.a(t62.c.f162799a);
                        gl.c.f77766a.getClass();
                        i7.b(dVarA, null, x2.q(aVar3, f17), gl.c.f77767b.P, mVar2, 48, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-397323567);
                        mVar2.f();
                    }
                    mh.c(this.f85134d, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131070);
                    mVar2.y();
                    mVar2.y();
                    if (z15) {
                        mVar2.C(-1851975276);
                        u1.y0.a(n5.c.a(R.drawable.ic_error_circle_small, mVar2, 0), gl1.y.Q(mVar2, R.string.lbl_declined), x2.q(aVar3, f17), null, null, 0.0f, null, mVar2, 0, 120);
                        mVar2.f();
                    } else {
                        mVar2.C(-1851664873);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q(boolean z14, pu0.b bVar, boolean z15, String str) {
        this.f85132b = z14;
        this.f85135e = bVar;
        this.f85133c = z15;
        this.f85134d = str;
    }
}
