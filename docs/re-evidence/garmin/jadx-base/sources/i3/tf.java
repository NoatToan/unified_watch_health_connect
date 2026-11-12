package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class tf implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89803a;

    /* JADX WARN: Multi-variable type inference failed */
    public tf(e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f89803a = pVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            n3.q0.f123226a.getClass();
            s5.x0 x0VarA = sj.a(n3.q0.f123231f, mVar2);
            d6.h.f57752b.getClass();
            mh.a(s5.x0.a(x0VarA, 0L, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744447), this.f89803a, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
