package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class rf implements e23.q<c2.a0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89533b;

    /* JADX WARN: Multi-variable type inference failed */
    public rf(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2) {
        this.f89532a = pVar;
        this.f89533b = pVar2;
    }

    @Override // e23.q
    public final Unit invoke(c2.a0 a0Var, p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            uf.d(this.f89532a, this.f89533b, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
