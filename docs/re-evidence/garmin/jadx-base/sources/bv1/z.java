package bv1;

import java.util.List;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f21458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f21459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f21460d;

    public /* synthetic */ z(i53.c cVar, List list, a0 a0Var, int i14) {
        this.f21457a = i14;
        this.f21458b = cVar;
        this.f21459c = list;
        this.f21460d = a0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f21457a;
        a0 a0Var = this.f21460d;
        List list = this.f21459c;
        i53.c cVar = this.f21458b;
        int i15 = 1;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1726830279, new z(cVar, list, a0Var, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    b0.b(cVar, list.size(), a0Var.f21378b, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
