package kh0;

import c2.a0;
import c2.b0;
import c2.c1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f72.n2;
import h5.e0;
import i3.mh;
import l72.g3;
import l72.v2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f104747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f104748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f104749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f104750e;

    public /* synthetic */ p(String str, String str2, String str3, boolean z14) {
        this.f104746a = 0;
        this.f104748c = str;
        this.f104749d = str2;
        this.f104750e = str3;
        this.f104747b = z14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j92.e eVar;
        int i14 = this.f104746a;
        boolean z14 = this.f104747b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    g6.f.a aVar2 = g6.f.f75994b;
                    h4.r rVarY = c2.l.y(aVar, 16);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarY, mVar);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
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
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f104748c, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), mVar), mVar, 0, 0, 131070);
                    x0 x0VarF = d92.c.f(j92.f.f97933j, mVar);
                    h4.r rVarC2 = c2.l.C(aVar, 0.0f, 4, 0.0f, 0.0f, 13);
                    String str = this.f104749d;
                    mh.c(this.f104750e, v2.a(rVarC2, str != null, new j21.p(str, 3), mVar, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 131068);
                    if (z14) {
                        mVar.C(-1896605665);
                        g3.a(48, 0, c2.l.C(aVar, 0.0f, 8, 0.0f, 0.0f, 13), gl1.y.Q(mVar, R.string.lbl_higher_priority_recommendation), mVar);
                        mVar.f();
                    } else {
                        mVar.C(-1896459593);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar2, R.string.golf_lbl_searching);
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarF = x2.f(aVar4, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarC3 = c2.l.C(rVarF, 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97931h;
                    x0 x0VarB = d92.c.b(x0Var, mVar2);
                    d6.h.f57752b.getClass();
                    int i15 = d6.h.f57755e;
                    mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                    String str2 = this.f104749d;
                    if (z14) {
                        mVar2.C(1360855123);
                        l72.s sVar = l72.s.f111232a;
                        h4.r rVarC4 = c2.l.C(x2.f(aVar4, 1.0f), 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = n2.a(t62.c.f162799a);
                        String strQ2 = gl1.y.Q(mVar2, R.string.lbl_trouble_finding_device);
                        String str3 = this.f104748c;
                        sVar.d(rVarC4, null, dVarA, strQ2, str3 == null ? str2 : str3, null, null, null, mVar2, 0, 482);
                        mVar2.f();
                    } else {
                        mVar2.C(1361254310);
                        if (str2 == null) {
                            mVar2.C(1361254309);
                            mVar2.f();
                        } else {
                            mVar2.C(1361254310);
                            mh.c(str2, c2.l.C(x2.f(aVar4, 1.0f), 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 130044);
                            mVar2.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        mVar2.f();
                    }
                    String str4 = this.f104750e;
                    if (str4 == null) {
                        mVar2.C(1361634152);
                        mVar2.f();
                    } else {
                        mVar2.C(1361634153);
                        mh.c(str4, c2.l.C(x2.f(aVar4, 1.0f), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar2, 0, 0, 130044);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                c1 c1Var = (c1) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                c1Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(c1Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    c2.j.f fVar = c2.j.f22699i;
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97917b;
                    float f15 = eVar3.f97920e;
                    h4.r rVarC5 = c2.l.C(aVar5, 0.0f, 0.0f, 0.0f, f14, 7);
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(fVar, h4.d.a.f81536n, mVar3, 6);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC6 = h4.k.c(rVarC5, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar6);
                    } else {
                        mVar3.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, zVarA2, mVar3);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC6, mVar3);
                    b0 b0Var2 = b0.f22601a;
                    d92.b.f58624b.getClass();
                    boolean z15 = !z14;
                    mh.c(this.f104748c, v2.a(c2.l.A(aVar5, f15, 0.0f, 2), z15, new yp0.b(8), mVar3, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97932i, mVar3)), mVar3, 0, 0, 131068);
                    p3.m mVar4 = mVar3;
                    String str5 = this.f104749d;
                    if (str5 == null || str5.length() == 0) {
                        eVar = eVar3;
                        mVar4.C(-1868559593);
                        mVar4.f();
                    } else {
                        mVar4.C(-1869069481);
                        x0 x0VarF2 = d92.c.f(j92.f.f97933j, mVar4);
                        eVar = eVar3;
                        h4.r rVarA = v2.a(c2.l.C(c2.l.A(aVar5, f15, 0.0f, 2), 0.0f, eVar3.f97917b, 0.0f, 0.0f, 13), z15, new yp0.b(9), mVar4, 0);
                        d6.h.f57752b.getClass();
                        mh.c(str5, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57753c), 0L, 0, false, 0, 0, null, x0VarF2, mVar4, 0, 0, 130044);
                        mVar4 = mVar4;
                        mVar4.f();
                    }
                    mVar4.y();
                    h4.r rVarC7 = c1Var.c(c2.l.C(c2.l.A(aVar5, f15, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97917b, 7), h4.d.a.f81534l);
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar4, 0);
                    int iHashCode3 = Long.hashCode(mVar4.getU());
                    i2 i2VarX3 = mVar4.x();
                    h4.r rVarC8 = h4.k.c(rVarC7, mVar4);
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar6);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar4, s2VarA, mVar4);
                    b4.c(c1623g, i2VarX3, mVar4);
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar4, iHashCode3, bVar2);
                    }
                    b4.c(fVar2, rVarC8, mVar4);
                    u2 u2Var = u2.f22900a;
                    String str6 = this.f104750e;
                    if (str6 == null) {
                        str6 = "";
                    }
                    p3.m mVar5 = mVar4;
                    mh.c(str6, v2.a(aVar5, z15, new yp0.b(10), mVar4, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar4), mVar5, 0, 0, 131068);
                    mVar5.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p(int i14, String str, String str2, String str3, boolean z14) {
        this.f104746a = i14;
        this.f104747b = z14;
        this.f104748c = str;
        this.f104749d = str2;
        this.f104750e = str3;
    }
}
