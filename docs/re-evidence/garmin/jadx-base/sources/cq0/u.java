package cq0;

import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class u implements e23.r<Boolean, d0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f55170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f55171c;

    public u(String str, e23.a<Unit> aVar, boolean z14) {
        this.f55169a = str;
        this.f55170b = aVar;
        this.f55171c = z14;
    }

    @Override // e23.r
    public final Unit invoke(Boolean bool, d0 d0Var, p3.m mVar, Integer num) {
        e23.a<Unit> aVar;
        bool.getClass();
        long j8 = d0Var.f128833a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
            x1 x1Var = p3.n.f135158a;
            String str = this.f55169a;
            if (str == null || (aVar = this.f55170b) == null) {
                mVar2.C(-1445263449);
                mVar2.f();
            } else {
                mVar2.C(-1445763169);
                b82.c.b(null, null, z3.f.c(-1065279925, new af1.g(this.f55171c, str, aVar, 3, (byte) 0), mVar2), null, vb.h.e(d92.b.f58623a, mVar2), mVar2, 384, 11);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
