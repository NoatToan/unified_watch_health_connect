package ct1;

import c2.b0;
import c2.t;
import c2.t2;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import e23.q;
import gl1.y;
import h4.r;
import i3.mh;
import l72.x0;
import o4.d0;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import q42.p;
import r1.e0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f55498c;

    public /* synthetic */ f(of1.a aVar, int i14, int i15) {
        this.f55496a = 1;
        this.f55497b = i14;
        this.f55498c = i15;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f55496a;
        int i15 = this.f55498c;
        int i16 = this.f55497b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var = p3.n.f135158a;
                r rVarB = l4.k.b(r.S, j92.h.f97941a.f87991b);
                d92.b.f58623a.getClass();
                r rVarE = u1.n.e(rVarB, d0.c(0.6f, d92.b.a(mVar).c().c(), 14), m1.f128891a);
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                r rVarZ = c2.l.z(rVarE, eVar.f97918c, eVar.f97917b);
                String strP = y.P(R.string.value_slash_value, new Object[]{Integer.valueOf(i16), Integer.valueOf(i15)}, mVar);
                d92.b.f58624b.getClass();
                mh.c(strP, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, mVar), mVar, 0, 0, 131068);
                return Unit.INSTANCE;
            case 1:
                t tVar = (t) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(tVar) ? 4 : 2;
                }
                if (mVar2.n(1 & iIntValue, (iIntValue & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar = r.S;
                    h4.d.f81522a.getClass();
                    r rVarC = tVar.c(aVar, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC2 = h4.k.c(rVarC, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    b0 b0Var = b0.f22601a;
                    int iH = of1.a.h();
                    Double dB = of1.a.b(Double.valueOf(i16));
                    mVar2.C(1474620595);
                    double dDoubleValue = dB.doubleValue();
                    l3.f23124b.getClass();
                    String str = l3.a.D(dDoubleValue) + StringUtils.SPACE + y.Q(mVar2, iH);
                    mVar2.f();
                    String strV = u.v(str, ".0", "", false);
                    mVar2.C(-1960010121);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strV, b0Var.b(aVar, h4.d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97928e, mVar2), mVar2, 0, 0, 131068);
                    mVar2.f();
                    String strG = tn.k.g(of1.a.d(mVar2, i15), y.Q(mVar2, R.string.lbl_per_week_abbrev));
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strG, b0Var.b(aVar, h4.d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97930g, mVar2), mVar2, 0, 0, 131068);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                h82.r rVar = (h82.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i17 = p.f142668f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(rVar) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    rVar.D(i16, mVar3, (iIntValue2 << 3) & 112);
                    rVar.o(this.f55498c, (iIntValue2 << 6) & 896, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                t2 t2Var = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(t2Var) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i18 = iIntValue3;
                    x0 x0Var = x0.f111346a;
                    String strValueOf = String.valueOf(i16);
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.f23476jb);
                    String strQ = y.Q(mVar4, R.string.common_days);
                    int i19 = (14 & i18) | (x0.f111348c << 24);
                    x0Var.a(i19, 116, null, t2Var, null, null, strValueOf, strW, strQ, null, mVar4);
                    x0Var.a(i19, 116, null, t2Var, null, null, String.valueOf(i15), gl1.d.W(c22.x0.f23427ga), y.Q(mVar4, R.string.common_days), null, mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(int i14, int i15, int i16) {
        this.f55496a = i16;
        this.f55497b = i14;
        this.f55498c = i15;
    }
}
