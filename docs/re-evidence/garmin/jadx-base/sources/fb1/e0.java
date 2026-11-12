package fb1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f70227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j f70228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f70229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f70230e;

    public /* synthetic */ e0(ArrayList arrayList, com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j jVar, String str, String str2, int i14) {
        this.f70226a = i14;
        this.f70227b = arrayList;
        this.f70228c = jVar;
        this.f70229d = str;
        this.f70230e = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        switch (this.f70226a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.f40667v;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1780761511, new e0(this.f70227b, this.f70228c, this.f70229d, this.f70230e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.b bVar2 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.f40667v;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    float f14 = 16;
                    g6.f.a aVar2 = g6.f.f75994b;
                    h4.r rVarC = c2.l.C(aVar, 0.0f, f14, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
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
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    mVar.C(-2048611635);
                    Iterator it = this.f70227b.iterator();
                    while (it.hasNext()) {
                        x0.f111346a.e(c2.l.C(h4.r.S, f14, 0.0f, f14, f14, 2), z3.f.c(556072897, new fb0.b(this.f70228c, (List) it.next(), this.f70229d, this.f70230e, 1), mVar), mVar, (x0.f111348c << 6) | 54, 0);
                    }
                    mVar.f();
                    mVar.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}
