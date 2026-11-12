package cq0;

import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class q implements e23.r<Boolean, d0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f55166a;

    public q(e23.a<Unit> aVar) {
        this.f55166a = aVar;
    }

    @Override // e23.r
    public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
        bool.getClass();
        long j8 = d0Var.f128833a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
            x1 x1Var = p3.n.f135158a;
            e23.a<Unit> aVar = this.f55166a;
            if (aVar != null) {
                mVar2.C(-624917972);
                b82.c.b(null, null, z3.f.c(1574581189, new p(aVar, 0), mVar2), null, vb.h.e(d92.b.f58623a, mVar2), mVar2, 384, 11);
                mVar2.f();
            } else {
                mVar2.C(-624486483);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
