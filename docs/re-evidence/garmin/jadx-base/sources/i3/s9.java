package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class s9 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3.f1 f89642a;

    public s9(l3.f1 f1Var) {
        this.f89642a = f1Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarE = f5.g0.e(h4.r.S, "indicatorRipple");
            n3.j0.f122993a.getClass();
            c2.q.a(u1.b1.a(l4.k.b(rVarE, fc.c(n3.j0.f122996d, mVar2)), this.f89642a, fb.a(0.0f, 7, 0L, false)), mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
