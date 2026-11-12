package ew1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class u0 implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f66781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f66782b;

    public u0(boolean z14, e23.a<Unit> aVar) {
        this.f66781a = z14;
        this.f66782b = aVar;
    }

    @Override // e23.r
    public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
        bool.getClass();
        long j8 = d0Var.f128833a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
            p3.x1 x1Var = p3.n.f135158a;
            b82.c.b(null, null, z3.f.c(-153849204, new a42.e(this.f66781a, this.f66782b, 4), mVar2), null, b82.c.d(mVar2), mVar2, 384, 11);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
