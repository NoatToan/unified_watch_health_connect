package wv0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k implements e23.q<e23.a<? extends Unit>, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.r<Long, e23.a<Unit>, p3.m, Integer, Unit> f187436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pv0.d f187437b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(e23.r<? super Long, ? super e23.a<Unit>, ? super p3.m, ? super Integer, Unit> rVar, pv0.d dVar) {
        this.f187436a = rVar;
        this.f187437b = dVar;
    }

    @Override // e23.q
    public final Unit invoke(e23.a<? extends Unit> aVar, p3.m mVar, Integer num) {
        e23.a<? extends Unit> aVar2 = aVar;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        aVar2.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.r(aVar2) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            this.f187436a.invoke(Long.valueOf(this.f187437b.f141358a), (e23.a<Unit>) aVar2, mVar2, Integer.valueOf((iIntValue << 3) & 112));
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
