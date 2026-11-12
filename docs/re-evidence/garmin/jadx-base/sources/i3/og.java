package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class og implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.q<List<wf>, p3.m, Integer, Unit> f89214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<wf> f89215b;

    /* JADX WARN: Multi-variable type inference failed */
    public og(e23.q<? super List<wf>, ? super p3.m, ? super Integer, Unit> qVar, List<wf> list) {
        this.f89214a = qVar;
        this.f89215b = list;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            this.f89214a.invoke(this.f89215b, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
