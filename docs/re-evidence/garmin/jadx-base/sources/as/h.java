package as;

import b82.d2;
import c2.a0;
import c2.t2;
import c2.x2;
import c2.y;
import c2.z;
import c22.h0;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import i3.u;
import java.util.List;
import nr.b0;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12645h;

    public /* synthetic */ h(int i14, b0 b0Var, p1 p1Var, p1 p1Var2, p1 p1Var3, p1 p1Var4, p1 p1Var5) {
        this.f12638a = 0;
        this.f12639b = i14;
        this.f12640c = b0Var;
        this.f12641d = p1Var;
        this.f12642e = p1Var2;
        this.f12643f = p1Var3;
        this.f12644g = p1Var4;
        this.f12645h = p1Var5;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x028b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0300  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x0 x0VarB;
        boolean z14;
        String strH;
        int i14;
        x0 x0VarF;
        int i15 = this.f12638a;
        int i16 = 2;
        p3.m.a aVar = p3.m.f135153a;
        Object obj4 = this.f12645h;
        int i17 = this.f12639b;
        Object obj5 = this.f12644g;
        Object obj6 = this.f12643f;
        Object obj7 = this.f12641d;
        Object obj8 = this.f12642e;
        Object obj9 = this.f12640c;
        switch (i15) {
            case 0:
                b0 b0Var = (b0) obj9;
                p1 p1Var = (p1) obj7;
                p1 p1Var2 = (p1) obj8;
                p1 p1Var3 = (p1) obj6;
                p1 p1Var4 = (p1) obj5;
                p1 p1Var5 = (p1) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    String strValueOf = String.valueOf(i17 + 1);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = eVar.f97918c;
                    int i18 = iIntValue & 14;
                    d2Var.f(t2Var, strValueOf, x2.u(c2.l.C(aVar2, f14, 0.0f, f15, 0.0f, 10), ((g6.f) p1Var.getF182175a()).f75997a), null, 0, 0, mVar, i18, 28);
                    d2Var.f(t2Var, b0Var.f126991b, x2.u(c2.l.A(aVar2, f15, 0.0f, 2), ((g6.f) p1Var2.getF182175a()).f75997a), null, 0, 0, mVar, i18, 28);
                    d2Var.f(t2Var, b0Var.f126992c, x2.u(c2.l.C(aVar2, eVar.f97917b, 0.0f, eVar.f97918c, 0.0f, 10), ((g6.f) p1Var3.getF182175a()).f75997a), null, 0, 0, mVar, i18, 28);
                    d2Var.f(t2Var, b0Var.f126993d, x2.u(c2.l.A(aVar2, f15, 0.0f, 2), ((g6.f) p1Var4.getF182175a()).f75997a), null, 0, 0, mVar, i18, 28);
                    d2Var.f(t2Var, b0Var.f126994e, x2.u(c2.l.C(aVar2, eVar.f97918c, 0.0f, eVar.f97920e, 0.0f, 10), ((g6.f) p1Var5.getF182175a()).f75997a), null, 0, 0, mVar, i18, 28);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj9;
                dx0.e eVar2 = (dx0.e) obj7;
                String str2 = (String) obj8;
                String str3 = (String) obj6;
                h0 h0Var = (h0) obj5;
                LocalDate localDate = (LocalDate) obj4;
                c2.t tVar = (c2.t) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(tVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC = tVar.c(aVar3, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    str.getClass();
                    dx0.a aVar5 = eVar2.f61467a;
                    dx0.a aVar6 = dx0.a.NORMAL;
                    if (aVar5 == aVar6) {
                        mVar2.C(-2078415739);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarB = d92.c.b(d92.c.e(j92.f.f97928e), mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-2078323483);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarB = d92.c.b(d92.c.e(j92.f.f97929f), mVar2);
                        mVar2.f();
                    }
                    x0 x0Var = x0VarB;
                    h4.g.a aVar7 = h4.d.a.f81537o;
                    h4.r rVarB = b0Var2.b(aVar3, aVar7);
                    boolean zB = mVar2.B(str) | mVar2.B(str2) | mVar2.B(str3);
                    Object objQ = mVar2.q();
                    if (zB) {
                        z14 = false;
                        objQ = new dx0.c(str, str2, str3, 0);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            z14 = false;
                            objQ = new dx0.c(str, str2, str3, 0);
                            mVar2.K(objQ);
                        } else {
                            z14 = false;
                        }
                    }
                    mh.c(str, v.c((e23.l) objQ, rVarB, z14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 0, 0, 131068);
                    if (eVar2.f61468b) {
                        mVar2.C(-2076859012);
                        mVar2.f();
                    } else {
                        mVar2.C(-2077890599);
                        boolean z15 = eVar2.f61469c;
                        int i19 = R.string.mct_cycle_day;
                        if (z15) {
                            strH = sn.a.h(mVar2, -2077831079, R.string.mct_cycle_day, mVar2);
                        } else if (aVar5 == dx0.a.REPORT || i17 <= 0) {
                            mVar2.C(-2077320478);
                            mVar2.f();
                            strH = "";
                        } else {
                            mVar2.C(-2077637670);
                            if (h0Var != null) {
                                localDate.getClass();
                                if (j23.g.a.a(h0Var, localDate)) {
                                    i14 = -2077569904;
                                    i19 = R.string.mct_period_day;
                                } else {
                                    i14 = -2077456847;
                                }
                            } else {
                                i14 = -2077456847;
                            }
                            strH = sn.a.h(mVar2, i14, i19, mVar2);
                            mVar2.f();
                        }
                        String str4 = strH;
                        if (aVar5 == aVar6) {
                            mVar2.C(-2077143995);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0VarF = d92.c.f(j92.f.f97932i, mVar2);
                            mVar2.f();
                        } else {
                            mVar2.C(-2077051739);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0VarF = d92.c.f(j92.f.f97935l, mVar2);
                            mVar2.f();
                        }
                        mh.c(str4, b0Var2.b(aVar3, aVar7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj9;
                e23.l lVar = (e23.l) obj8;
                p1 p1Var6 = (p1) obj7;
                e23.l lVar2 = (e23.l) obj6;
                e23.q qVar = (e23.q) obj5;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    for (Object obj10 : list) {
                        mVar3.N(2115476762, lVar.invoke(obj10));
                        z3.e eVarC = z3.f.c(-158593291, new com.google.maps.android.compose.t(qVar, obj10, i17, i16), mVar3);
                        boolean zB2 = mVar3.B(p1Var6) | mVar3.B(lVar2) | mVar3.r(obj10);
                        Object objQ2 = mVar3.q();
                        if (zB2) {
                            objQ2 = new uk0.l(p1Var6, lVar2, obj10);
                            mVar3.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new uk0.l(p1Var6, lVar2, obj10);
                                mVar3.K(objQ2);
                            }
                        }
                        u.b(eVarC, (e23.a) objQ2, null, null, z3.f.c(2066302833, new da0.s(1, obj4, obj10), mVar3), false, null, null, mVar3, 24582, 492);
                        mVar3.Q();
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                List list2 = (List) obj9;
                e23.l lVar3 = (e23.l) obj8;
                p1 p1Var7 = (p1) obj7;
                e23.l lVar4 = (e23.l) obj6;
                s50.b bVar2 = (s50.b) obj5;
                jk0.o oVar = (jk0.o) obj4;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    for (Object obj11 : list2) {
                        mVar4.N(-1645632632, lVar3.invoke(obj11));
                        z3.e eVarC2 = z3.f.c(-1271413526, new sg0.m(bVar2, obj11, i17, 23), mVar4);
                        boolean zB3 = mVar4.B(p1Var7) | mVar4.B(lVar4) | mVar4.r(obj11);
                        Object objQ3 = mVar4.q();
                        if (zB3) {
                            objQ3 = new uk0.l(lVar4, obj11, p1Var7);
                            mVar4.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new uk0.l(lVar4, obj11, p1Var7);
                                mVar4.K(objQ3);
                            }
                        }
                        u.b(eVarC2, (e23.a) objQ3, null, null, z3.f.c(168970598, new u91.i(11, oVar, obj11), mVar4), false, null, null, mVar4, 24582, 492);
                        mVar4.Q();
                    }
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(String str, dx0.e eVar, String str2, String str3, int i14, h0 h0Var, LocalDate localDate) {
        this.f12638a = 1;
        this.f12640c = str;
        this.f12641d = eVar;
        this.f12642e = str2;
        this.f12643f = str3;
        this.f12639b = i14;
        this.f12644g = h0Var;
        this.f12645h = localDate;
    }

    public /* synthetic */ h(List list, e23.l lVar, p1 p1Var, e23.l lVar2, e23.q qVar, int i14, Object obj, int i15) {
        this.f12638a = i15;
        this.f12640c = list;
        this.f12642e = lVar;
        this.f12641d = p1Var;
        this.f12643f = lVar2;
        this.f12644g = qVar;
        this.f12639b = i14;
        this.f12645h = obj;
    }
}
