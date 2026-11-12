package qk0;

import am.x0;
import c2.x2;
import ds.e0;
import i3.i7;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145120a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f145121b;

    public /* synthetic */ p(int i14, x0 x0Var) {
        this.f145121b = x0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f145120a;
        x0 x0Var = this.f145121b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                r.b(x0Var, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    u4.d dVar = x0Var.f4362e;
                    long jB = e0.b(d92.b.f58623a, mVar);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVar, null, x2.q(aVar, j92.b.f97901d.f97905d), jB, mVar, 48, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
