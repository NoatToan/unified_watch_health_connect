package b82;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class x0 implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f16890a;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f16890a = pVar;
    }

    @Override // e23.r
    public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
        bool.booleanValue();
        long j8 = d0Var.f128833a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= mVar2.l(j8) ? 32 : 16;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 145) != 144)) {
            p3.x1 x1Var = p3.n.f135158a;
            c.a(null, null, this.f16890a, j8, mVar2, (iIntValue << 6) & 7168, 3);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
