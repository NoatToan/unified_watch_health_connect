package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class be implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.q<wd, p3.m, Integer, Unit> f87595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd f87596b;

    /* JADX WARN: Multi-variable type inference failed */
    public be(e23.q<? super wd, ? super p3.m, ? super Integer, Unit> qVar, wd wdVar) {
        this.f87595a = qVar;
        this.f87596b = wdVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            wd wdVar = this.f87596b;
            wdVar.getClass();
            this.f87595a.invoke(wdVar, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
