package a71;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.q;
import f5.z0;
import fb1.r0;
import h4.r;
import h5.e0;
import o72.r3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p3.y3;
import yr.c0;
import zo1.f1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1785c;

    public /* synthetic */ l(int i14, int i15, int i16) {
        this.f1783a = i16;
        this.f1784b = i14;
        this.f1785c = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f1783a;
        int i15 = 3;
        int i16 = this.f1785c;
        int i17 = this.f1784b;
        int i18 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1524431374, new l(i17, i16, i18), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    String string = ((Context) mVar2.A(y3Var)).getString(i17);
                    String string2 = ((Context) mVar2.A(y3Var)).getString(i16);
                    string2.getClass();
                    b82.n.c(null, string, string2, null, null, mVar2, 0, 25);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                q.a aVar = q.f40794v;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1738118685, new l(i17, i16, i15), mVar3), mVar3, 196608, 31);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                q.a aVar2 = q.f40794v;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    r0.a(i17, i16, 6, mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                r0.a(i17, i16, p0.t(7), (p3.m) obj);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                gw0.j.e(i17, i16, p0.t(1), (p3.m) obj);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                li0.p0.b(i17, (p3.m) obj, p0.t(i16 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                mw0.c.c(i17, i16, p0.t(1), (p3.m) obj);
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).intValue();
                r3.a(i17, (p3.m) obj, p0.t(i16 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                rr0.g.a(i17, (p3.m) obj, p0.t(i16 | 1));
                return Unit.INSTANCE;
            case 10:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    if (i17 == 1) {
                        return Unit.INSTANCE;
                    }
                    r.a aVar3 = r.S;
                    r rVarF = x2.f(aVar3, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    r rVarC = h4.k.c(rVarF, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar4);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar5);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar5);
                    u uVar = u.f22885a;
                    int i19 = i16 - 1;
                    int i24 = i17 - 1;
                    ub0.r.b(i19 < 0 ? 0 : i19, x2.z(aVar3, null, 3), i24 < 0 ? 0 : i24, 0L, 0L, 0.0f, 0.0f, 0.0f, null, mVar5, 48);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    int i25 = this.f1784b;
                    if (i25 == 1) {
                        return Unit.INSTANCE;
                    }
                    r.a aVar5 = r.S;
                    r rVarF2 = x2.f(aVar5, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode2 = Long.hashCode(mVar6.getU());
                    i2 i2VarX2 = mVar6.x();
                    r rVarC2 = h4.k.c(rVarF2, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar6);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar6);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar6, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar6);
                    u uVar2 = u.f22885a;
                    ub0.r.b(this.f1785c, x2.z(aVar5, null, 3), i25, 0L, 0L, 0.0f, 0.0f, 0.0f, null, mVar6, 48);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).intValue();
                c0.b(i17, (p3.m) obj, p0.t(i16 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                f1.a(i17, i16, p0.t(1), (p3.m) obj);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(int i14, int i15, int i16, int i17) {
        this.f1783a = i17;
        this.f1784b = i14;
        this.f1785c = i15;
    }
}
