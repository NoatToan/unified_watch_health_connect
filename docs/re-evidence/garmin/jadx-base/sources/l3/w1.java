package l3;

import i3.gh;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class w1 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.q<gh, p3.m, Integer, Unit> f109451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f109452b;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(e23.q<? super gh, ? super p3.m, ? super Integer, Unit> qVar, e2 e2Var) {
        this.f109451a = qVar;
        this.f109452b = e2Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            this.f109451a.invoke(this.f109452b, mVar2, 6);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
