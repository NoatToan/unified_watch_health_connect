package as;

import androidx.room.a0;
import b82.d2;
import c2.b0;
import c2.t2;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.i7;
import i3.mh;
import i3.wf;
import i3.yf;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12628b;

    public /* synthetic */ e(of1.a aVar, int i14) {
        this.f12627a = 4;
        this.f12628b = i14;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f12627a;
        int i15 = this.f12628b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
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
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u uVar = u.f22885a;
                    String strQ = y.Q(mVar, i15);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97931h;
                    h4.r rVarC2 = uVar.c(aVar, h4.d.a.f81527e);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    mh.c(strQ, c2.l.z(rVarC2, eVar.f97920e, eVar.f97917b), zl.a.a(mVar), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 131064);
                    b3.b.f15502a.getClass();
                    u4.d dVarA = d3.a.a();
                    String strQ2 = y.Q(mVar, i15);
                    g6.f.a aVar3 = g6.f.f75994b;
                    i7.b(dVarA, strQ2, uVar.c(x2.q(c2.l.y(aVar, eVar.f97920e), 24), h4.d.a.f81529g), a0.c(mVar), mVar, 0, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj;
                p3.m mVar2 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                list.getClass();
                x1 x1Var2 = p3.n.f135158a;
                if (i15 < list.size()) {
                    mVar2.C(-716238896);
                    yf yfVar = yf.f90469a;
                    h4.r.a aVar4 = h4.r.S;
                    wf wfVar = (wf) list.get(i15);
                    yfVar.getClass();
                    h4.r rVarB = yf.b(aVar4, wfVar);
                    d92.b.f58623a.getClass();
                    yfVar.a(0.0f, 0, 2, d92.b.a(mVar2).j().e(), rVarB, mVar2);
                    mVar2.f();
                } else {
                    mVar2.C(-716022671);
                    mVar2.f();
                }
                return Unit.INSTANCE;
            case 2:
                t2 t2Var = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(t2Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    String strValueOf = String.valueOf(i15);
                    c22.x0.f23314a.getClass();
                    x0Var2.f((l72.x0.f111348c << 24) | (iIntValue2 & 14), 116, null, t2Var, null, null, strValueOf, gl1.d.W(c22.x0.f23476jb), y.Q(mVar3, R.string.common_days), null, mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                t2 t2Var2 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(t2Var2) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    l72.x0 x0Var3 = l72.x0.f111346a;
                    String strValueOf2 = String.valueOf(i15);
                    c22.x0.f23314a.getClass();
                    x0Var3.a((l72.x0.f111348c << 24) | (iIntValue3 & 14), 116, null, t2Var2, null, null, strValueOf2, gl1.d.W(c22.x0.f23427ga), y.Q(mVar4, R.string.common_days), null, mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                c2.t tVar = (c2.t) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar5.B(tVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC3 = tVar.c(aVar5, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode2 = Long.hashCode(mVar5.getU());
                    i2 i2VarX2 = mVar5.x();
                    h4.r rVarC4 = h4.k.c(rVarC3, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar6);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar5);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar5);
                    b0 b0Var = b0.f22601a;
                    String strF = of1.a.f(i15);
                    mVar5.C(-1258920869);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strF, b0Var.b(aVar5, h4.d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar5), mVar5, 0, 0, 131068);
                    mVar5.f();
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                int i16 = 4;
                t2 t2Var3 = (t2) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    if (!mVar6.B(t2Var3)) {
                        i16 = 2;
                    }
                    iIntValue5 |= i16;
                }
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    d2.f16532a.f(t2Var3, am.j.h(i15, "Row "), null, null, 0, 0, mVar6, iIntValue5 & 14, 30);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                t2 t2Var4 = (t2) obj;
                int i17 = 4;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t2Var4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    if (!mVar7.B(t2Var4)) {
                        i17 = 2;
                    }
                    iIntValue6 |= i17;
                }
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    int i18 = iIntValue6;
                    d2 d2Var = d2.f16532a;
                    String strValueOf3 = String.valueOf(i15);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar7 = h4.d.a.f81538p;
                    d2Var.getClass();
                    int i19 = i18 & 14;
                    d2Var.f(t2Var4, strValueOf3, t2Var4.a(d2.i(), 0.2f, true), aVar7, 0, 0, mVar7, i19 | 3072, 24);
                    int i24 = i19 | 3120;
                    d2Var.f(t2Var4, "10:10", t2Var4.a(d2.i(), 0.2f, true), aVar7, 0, 0, mVar7, i24, 24);
                    d2Var.f(t2Var4, "30", t2Var4.a(d2.i(), 0.2f, true), aVar7, 0, 0, mVar7, i24, 24);
                    d2Var.f(t2Var4, "5", t2Var4.a(d2.i(), 0.2f, true), aVar7, 0, 0, mVar7, i24, 24);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(rVarF2, 0.0f, j92.b.f97899b.f97917b, 1);
                    uk0.i.f171830a.getClass();
                    String strF2 = uk0.i.f(mVar8, i15);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97933j, mVar8);
                    d6.h.f57752b.getClass();
                    mh.c(strF2, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar8, 0, 0, 130044);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                c2.t tVar2 = (c2.t) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                tVar2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar9.B(tVar2) ? 4 : 2;
                }
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC5 = tVar2.c(aVar8, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar9, 0);
                    int iHashCode3 = Long.hashCode(mVar9.getU());
                    i2 i2VarX3 = mVar9.x();
                    h4.r rVarC6 = h4.k.c(rVarC5, mVar9);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar9);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar9);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar9, iHashCode3, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar9);
                    b0 b0Var2 = b0.f22601a;
                    String strValueOf4 = String.valueOf(i15);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97928e, mVar9);
                    h4.g.a aVar10 = h4.d.a.f81537o;
                    mh.c(strValueOf4, b0Var2.b(aVar8, aVar10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar9, 0, 0, 131068);
                    mh.c(y.Q(mVar9, R.string.lbl_activites), b0Var2.b(aVar8, aVar10), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar9), mVar9, 0, 0, 131068);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                c2.t tVar3 = (c2.t) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                tVar3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar10.B(tVar3) ? 4 : 2;
                }
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC7 = tVar3.c(aVar11, h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA2 = c2.l.A(rVarC7, j92.b.f97899b.f97920e, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    z zVarA3 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar10, 0);
                    int iHashCode4 = Long.hashCode(mVar10.getU());
                    i2 i2VarX4 = mVar10.x();
                    h4.r rVarC8 = h4.k.c(rVarA2, mVar10);
                    h5.g.V.getClass();
                    e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar12);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar10);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar10.getT() || !p005kotlin.jvm.internal.s.g(mVar10.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar10, iHashCode4, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC8, mVar10);
                    b0 b0Var3 = b0.f22601a;
                    String strValueOf5 = String.valueOf(24 - i15);
                    d92.b.f58624b.getClass();
                    x0 x0VarB3 = d92.c.b(j92.f.f97928e, mVar10);
                    h4.g.a aVar13 = h4.d.a.f81537o;
                    mh.c(strValueOf5, b0Var3.b(aVar11, aVar13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, mVar10, 0, 0, 131068);
                    String strQ3 = y.Q(mVar10, R.string.common_hours);
                    x0 x0VarF = d92.c.f(j92.f.f97932i, mVar10);
                    d6.h.f57752b.getClass();
                    mh.c(strQ3, b0Var3.b(aVar11, aVar13), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar10, 0, 0, 130044);
                    mVar10.y();
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            default:
                h4.r rVar = (h4.r) obj;
                p3.m mVar11 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                TimingGatesActivity.a aVar14 = TimingGatesActivity.f29952c;
                rVar.getClass();
                mVar11.C(-1203658822);
                x1 x1Var11 = p3.n.f135158a;
                g6.f.a aVar15 = g6.f.f75994b;
                h4.r rVarU = x2.u(rVar, i15);
                mVar11.f();
                return rVarU;
        }
    }

    public /* synthetic */ e(int i14, int i15) {
        this.f12627a = i15;
        this.f12628b = i14;
    }
}
