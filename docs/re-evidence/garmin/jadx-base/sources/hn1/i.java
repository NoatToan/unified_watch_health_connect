package hn1;

import e23.p;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u82.f f84530b;

    public /* synthetic */ i(u82.f fVar, int i14) {
        this.f84529a = i14;
        this.f84530b = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        mm1.b bVar;
        int i14 = this.f84529a;
        overallStats = null;
        mm1.a overallStats = null;
        u82.f fVar = this.f84530b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    m.a(fVar != null ? (i41.e) fVar.a() : null, mVar, i41.e.f90924b);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (fVar != null && (bVar = (mm1.b) fVar.a()) != null) {
                        overallStats = bVar.getOverallStats();
                    }
                    o.a(overallStats, mVar, mm1.a.f119613m);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
