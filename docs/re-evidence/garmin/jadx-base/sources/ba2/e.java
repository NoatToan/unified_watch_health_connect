package ba2;

import androidx.fragment.app.Fragment;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.compose.MapClickListenersKt;
import da0.z;
import e23.p;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import jy0.u;
import lc.u0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s5.x0;
import v62.g4;
import zo1.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17069b;

    public /* synthetic */ e(int i14, int i15) {
        this.f17068a = i15;
        this.f17069b = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f17068a;
        int i15 = this.f17069b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    String strValueOf = String.valueOf(i15);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    c.a(strValueOf, null, 0L, 0, false, 0, j92.f.f97928e, 0.0d, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                return MapClickListenersKt.MapClickListenerUpdater$lambda$27(i15, (m) obj, ((Integer) obj2).intValue());
            case 2:
                ((Integer) obj2).getClass();
                z.a(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarZ = l.z(aVar, eVar.f97920e, eVar.f97918c);
                    c2.j jVar = c2.j.f22691a;
                    float f14 = eVar.f97919d;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(rVarZ, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    u2 u2Var = u2.f22900a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = g4.a(t62.b.f162798a);
                    f02.h.f67736a.getClass();
                    long jA = f02.h.a(mVar2);
                    gl.c.f77766a.getClass();
                    g02.i.a(null, dVarA, jA, gl.c.a(mVar2).g(), j92.b.f97901d.f97906e, 0.0f, null, mVar2, 0, 225);
                    String strP = y.P(R.string.lbl_pending_activities_count_plural, new Object[]{Integer.valueOf(i15)}, mVar2);
                    d92.b.f58624b.getClass();
                    mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 131070);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                p003ji0.l.a(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                u.c(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    String strQ = y.Q(mVar3, i15);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ln1.k.c(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ng2.f.a(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                g8.i.d(i15, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 10:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    String strF = v.e0.f(i15 + 1, "Page ", ": Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97931h;
                    long jC = d92.b.a(mVar4).k().c();
                    r.a aVar3 = r.S;
                    d92.b.f58625c.getClass();
                    r rVarY = l.y(aVar3, j92.b.f97899b.f97920e);
                    d6.p.f57793b.getClass();
                    mh.c(strF, rVarY, jC, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 0, 0, null, x0Var, mVar4, 0, 384, 126968);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                s12.e.a(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r.a aVar4 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.a(n5.c.a(i15, mVar5, 0), null, x2.q(aVar4, j92.b.f97901d.f97905d), u0.f(mVar5), mVar5, 48, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                w52.y.d(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                wt0.d.g(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                Fragment fragment = (Fragment) obj;
                dx2.c cVar = (dx2.c) obj2;
                fragment.getClass();
                cVar.getClass();
                wu2.a.f187327a.getClass();
                wu2.a.a(fragment, cVar, i15);
                return Unit.INSTANCE;
            case 16:
                Fragment fragment2 = (Fragment) obj;
                dx2.c cVar2 = (dx2.c) obj2;
                fragment2.getClass();
                cVar2.getClass();
                wu2.a.f187327a.getClass();
                wu2.a.a(fragment2, cVar2, i15);
                return Unit.INSTANCE;
            case 17:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    g02.g.a(String.valueOf(i15), d92.b.a(mVar6).f().c(), fb1.c.g(d92.b.f58623a, mVar6), null, 0.0f, 0.0f, mVar6, 0, 56);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                xq0.b.b(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                r0.g(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zr.h.b(i15, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(int i14, int i15, int i16) {
        this.f17068a = i16;
        this.f17069b = i14;
    }
}
