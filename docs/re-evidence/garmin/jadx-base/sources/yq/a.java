package yq;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.n0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import ps.x1;
import s5.x0;
import u1.a2;
import u1.d2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f198715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f198716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimingGatesActivity f198717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f198718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zq.b f198719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f198720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ HashMap f198721h;

    public /* synthetic */ a(ArrayList arrayList, m0 m0Var, TimingGatesActivity timingGatesActivity, n0 n0Var, zq.b bVar, m0 m0Var2, HashMap map, int i14) {
        this.f198714a = i14;
        this.f198715b = arrayList;
        this.f198716c = m0Var;
        this.f198717d = timingGatesActivity;
        this.f198718e = n0Var;
        this.f198719f = bVar;
        this.f198720g = m0Var2;
        this.f198721h = map;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar;
        List<x1> list;
        switch (this.f198714a) {
            case 0:
                m mVar2 = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                TimingGatesActivity.a aVar = TimingGatesActivity.f29952c;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(30846683, new a(this.f198715b, this.f198716c, this.f198717d, this.f198718e, this.f198719f, this.f198720g, this.f198721h, 1), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar3 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                TimingGatesActivity.a aVar2 = TimingGatesActivity.f29952c;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = n.f135158a;
                    d2 d2VarA = a2.a(mVar3);
                    r.a aVar3 = r.S;
                    g6.f.a aVar4 = g6.f.f75994b;
                    r rVarC = l.C(a2.b(x2.d(aVar3, 1.0f), d2VarA, true), 0.0f, 16, 0.0f, 0.0f, 13);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    r rVarC2 = k.c(rVarC, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar5);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                    b0 b0Var = b0.f22601a;
                    ArrayList arrayList = this.f198715b;
                    if (arrayList.isEmpty() || (list = ((zq.a) h0.b0(arrayList)).f206626c) == null || list.isEmpty()) {
                        mVar3.C(521521665);
                        String strQ = gl1.y.Q(mVar3, R.string.common_no_data);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97933j, mVar3);
                        r rVarF = x2.f(l.y(aVar3, 32), 1.0f);
                        d6.h.f57752b.getClass();
                        mVar = mVar3;
                        mh.c(strQ, rVarF, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar, 48, 0, 130044);
                        mVar.f();
                    } else {
                        mVar3.C(521102700);
                        m0 m0Var = this.f198716c;
                        boolean z14 = m0Var.f105804a;
                        TimingGatesActivity timingGatesActivity = this.f198717d;
                        zq.b bVar2 = this.f198719f;
                        if (z14) {
                            mVar3.C(521147588);
                            timingGatesActivity.ca(Double.valueOf(this.f198718e.f105805a), bVar2 != null ? Double.valueOf(bVar2.f206627a) : null, mVar3, 0);
                            mVar3.f();
                        } else {
                            mVar3.C(521252337);
                            mVar3.f();
                        }
                        f.b(this.f198720g.f105804a, m0Var.f105804a, mVar3, 0);
                        timingGatesActivity.ga(arrayList, m0Var.f105804a, this.f198721h, bVar2, mVar3, 0);
                        mVar3.f();
                        mVar = mVar3;
                    }
                    mVar.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
