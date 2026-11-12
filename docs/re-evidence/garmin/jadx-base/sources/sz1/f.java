package sz1;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;
import s70.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f161550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f161551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f161552d;

    public /* synthetic */ f(String str, String str2, boolean z14, int i14) {
        this.f161549a = i14;
        this.f161550b = str;
        this.f161551c = str2;
        this.f161552d = z14;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01bb  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i14 = this.f161549a;
        boolean z14 = this.f161552d;
        switch (i14) {
            case 0:
                c2.t tVar = (c2.t) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(tVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC = tVar.c(aVar, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(rVarC, j92.b.f97899b.f97920e, 0.0f, 2);
                    String str2 = this.f161550b;
                    boolean zB = mVar.B(str2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new r0(str2, 10);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new r0(str2, 10);
                            mVar.K(objQ);
                        }
                    }
                    h4.r rVarC2 = v.c((e23.l) objQ, rVarA, false);
                    c2.j.f22691a.getClass();
                    z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC3 = h4.k.c(rVarC2, mVar);
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
                    b4.c(h5.g.a.f81807d, rVarC3, mVar);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97928e, mVar);
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    mh.c(this.f161551c, b0Var.b(aVar, aVar3), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
                    if (z14) {
                        mVar.C(-1743398752);
                        mVar.f();
                    } else {
                        mVar.C(-1743693252);
                        String strValueOf = String.valueOf((int) oz1.u.PRIME.f134641d);
                        x0 x0VarF = d92.c.f(j92.f.f97932i, mVar);
                        d6.h.f57752b.getClass();
                        mh.c(strValueOf, b0Var.b(aVar, aVar3), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 130044);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                c2.t tVar2 = (c2.t) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(tVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String str3 = this.f161550b;
                    if (str3 != null && (str = this.f161551c) != null) {
                        h4.r.a aVar4 = h4.r.S;
                        h4.d.f81522a.getClass();
                        h4.r rVarC4 = tVar2.c(aVar4, h4.d.a.f81528f);
                        c2.j.f22691a.getClass();
                        z zVarA2 = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC5 = h4.k.c(rVarC4, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar5 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar5);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC5, mVar2);
                        b0 b0Var2 = b0.f22601a;
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB2 = d92.c.b(j92.f.f97929f, mVar2);
                        h4.g.a aVar6 = h4.d.a.f81537o;
                        mh.c(str3, b0Var2.b(aVar4, aVar6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar2, 0, 0, 131068);
                        mh.c(str, b0Var2.b(aVar4, aVar6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar2), mVar2, 0, 0, 131068);
                        if (z14) {
                            mVar2.C(1331424811);
                            t4.d dVarA = n5.c.a(R.drawable.check, mVar2, 0);
                            gl.c.f77766a.getClass();
                            long jD = gl.c.a(mVar2).d();
                            d92.b.f58625c.getClass();
                            i7.a(dVarA, null, b0Var2.b(x2.q(aVar4, j92.b.f97901d.f97905d), aVar6), jD, mVar2, 0, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(1331828028);
                            mVar2.f();
                        }
                        mVar2.y();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
