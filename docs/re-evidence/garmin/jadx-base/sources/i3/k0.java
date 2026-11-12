package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class k0 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.h2, p3.m, Integer, Unit> f88652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f88653b;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(e23.q<? super c2.h2, ? super p3.m, ? super Integer, Unit> qVar, float f14) {
        this.f88652a = qVar;
        this.f88653b = f14;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            this.f88652a.invoke(c2.l.e(0.0f, 0.0f, 0.0f, this.f88653b, 7), mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
