package f21;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class n implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f68600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f68601b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2) {
        this.f68600a = pVar;
        this.f68601b = pVar2;
    }

    @Override // e23.r
    public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
        bool.getClass();
        long j8 = d0Var.f128833a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.b(null, null, z3.f.c(-1111860315, new a3.d(this.f68600a, 13), mVar2), z3.f.c(-1865884604, new a3.d(this.f68601b, 14), mVar2), fb1.c.z(d92.b.f58623a, mVar2), mVar2, 3456, 3);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
