package p81;

import c2.b0;
import c2.j;
import c2.l;
import c2.y;
import c2.z;
import e23.p;
import h4.d;
import h4.r;
import h5.e0;
import h5.g;
import java.util.List;
import o4.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p40.o0;
import pi0.e;
import tn.k;
import v.h;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u81.b f136379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f136380c;

    public /* synthetic */ a(u81.b bVar, b bVar2, int i14) {
        this.f136378a = i14;
        this.f136379b = bVar;
        this.f136380c = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0140  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar;
        String strD;
        String strD2;
        String strValueOf;
        int i14 = this.f136378a;
        b bVar = this.f136380c;
        u81.b bVar2 = this.f136379b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar2 = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = b.f136381e;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-332440170, new a(bVar2, bVar, i15), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                e eVar = bVar.f136384c;
                String str = bVar.f136385d;
                m mVar3 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = b.f136381e;
                if (mVar3.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar = r.S;
                    r rVarE = u1.n.e(aVar, k.a(d92.b.f58623a, mVar3), m1.f128891a);
                    float f14 = 8;
                    g6.f.a aVar2 = g6.f.f75994b;
                    r rVarC = l.C(rVarE, 0.0f, f14, 0.0f, 0.0f, 13);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    d.f81522a.getClass();
                    z zVarA = y.a(kVar, d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    r rVarC2 = h4.k.c(rVarC, mVar3);
                    g.V.getClass();
                    e0.a aVar3 = g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar3);
                    } else {
                        mVar3.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar3);
                    b4.c(g.a.f81809f, i2VarX, mVar3);
                    g.a.b bVar3 = g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar3, iHashCode, bVar3);
                    }
                    b4.c(g.a.f81807d, rVarC2, mVar3);
                    b0 b0Var = b0.f22601a;
                    r rVarZ = l.z(aVar, 16, f14);
                    List<u81.a> list = bVar2 != null ? bVar2.f169476f : null;
                    if (list == null) {
                        mVar3.C(-1795826711);
                        mVar3.f();
                        mVar = mVar3;
                    } else {
                        mVar3.C(-1795826710);
                        mVar3.C(2020281523);
                        for (u81.a aVar4 : list) {
                            LocalDate localDate = aVar4.f169461c;
                            Integer num = aVar4.f169466h;
                            q81.k.f143328e.getClass();
                            q81.k kVarB = q81.k.a.b(num);
                            if (localDate != null) {
                                strD = eVar.d(localDate, qi0.a.WEEKDAY);
                                strD2 = eVar.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                            } else {
                                strD = str;
                                strD2 = strD;
                            }
                            if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                                strValueOf = str;
                            }
                            String string = kVarB != null ? bVar.f136382a.getContext().getString(kVarB.f143337b) : str;
                            boolean zR = mVar3.r(localDate) | mVar3.r(bVar);
                            Object objQ = mVar3.q();
                            if (zR) {
                                objQ = new o0(2, localDate, bVar);
                                mVar3.K(objQ);
                            } else {
                                m.f135153a.getClass();
                                if (objQ == m.a.f135155b) {
                                    objQ = new o0(2, localDate, bVar);
                                    mVar3.K(objQ);
                                }
                            }
                            m mVar4 = mVar3;
                            l72.l.e(strD, strD2, strValueOf, string, null, null, rVarZ, null, false, (e23.a) objQ, mVar4, 0, 432);
                            mVar3 = mVar4;
                        }
                        mVar = mVar3;
                        mVar.f();
                        mVar.f();
                    }
                    mVar.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
