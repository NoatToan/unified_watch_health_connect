package ew1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k2 implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<vt1.e, Unit> f66556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f66557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1<vt1.e> f66558c;

    /* JADX WARN: Multi-variable type inference failed */
    public k2(e23.l<? super vt1.e, Unit> lVar, p3.p1<Boolean> p1Var, p3.p1<vt1.e> p1Var2) {
        this.f66556a = lVar;
        this.f66557b = p1Var;
        this.f66558c = p1Var2;
    }

    @Override // e23.r
    public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
        bool.getClass();
        long j8 = d0Var.f128833a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
            p3.x1 x1Var = p3.n.f135158a;
            b82.c.b(null, null, z3.f.c(-970280157, new cw1.h0(this.f66556a, this.f66557b, this.f66558c, 4), mVar2), null, fb1.c.z(d92.b.f58623a, mVar2), mVar2, 384, 11);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
