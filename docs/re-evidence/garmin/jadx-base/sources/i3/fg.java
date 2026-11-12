package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class fg implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.q<lf, p3.m, Integer, Unit> f88116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ig f88117b;

    /* JADX WARN: Multi-variable type inference failed */
    public fg(e23.q<? super lf, ? super p3.m, ? super Integer, Unit> qVar, ig igVar) {
        this.f88116a = qVar;
        this.f88117b = igVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            this.f88116a.invoke(this.f88117b, mVar2, 6);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
