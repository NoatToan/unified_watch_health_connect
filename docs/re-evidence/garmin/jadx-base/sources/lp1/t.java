package lp1;

import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f114200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f114201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f114202d;

    public /* synthetic */ t(long j8, v vVar, long j14, int i14) {
        this.f114199a = i14;
        this.f114200b = j8;
        this.f114201c = vVar;
        this.f114202d = j14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        switch (this.f114199a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-996883943, new t(this.f114200b, this.f114201c, this.f114202d, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0.f111346a.e(null, z3.f.c(1592887666, new u(this.f114200b, this.f114201c, this.f114202d), mVar), mVar, (x0.f111348c << 6) | 48, 1);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
