package h50;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import l72.t2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82037a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f82038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f82039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f82040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f82041e;

    public /* synthetic */ c(float f14, int i14, e23.a aVar, r rVar, boolean z14) {
        this.f82038b = f14;
        this.f82040d = aVar;
        this.f82041e = rVar;
        this.f82039c = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82037a;
        Object obj3 = this.f82041e;
        Object obj4 = this.f82040d;
        switch (i14) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    r.a aVar = r.S;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(aVar, mVar);
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
                    b4.c(h5.g.a.f81810g, s2VarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u2 u2Var = u2.f22900a;
                    t4.d dVarA = n5.c.a(this.f82039c ? R.drawable.unlock : R.drawable.lock, mVar, 0);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar);
                    d92.b.f58625c.getClass();
                    i7.a(dVarA, null, c2.l.C(x2.q(aVar, j92.b.f97901d.f97904c), 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), jA, mVar, 48, 0);
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97933j;
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 0, 0, 131070);
                    mVar.y();
                    c2.l.f(x2.u(aVar, this.f82038b), mVar);
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar), mVar, 0, 0, 131070);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                t2.a(this.f82038b, p0.t(224689), (e23.a) obj4, (r) obj3, (p3.m) obj, this.f82039c);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(float f14, String str, boolean z14, String str2) {
        this.f82038b = f14;
        this.f82040d = str;
        this.f82039c = z14;
        this.f82041e = str2;
    }
}
