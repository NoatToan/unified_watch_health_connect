package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class b2 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f87535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87536b;

    /* JADX WARN: Multi-variable type inference failed */
    public b2(long j8, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f87535a = j8;
        this.f87536b = pVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.v.a(s2.f89590a.c(o4.d0.a(this.f87535a)), this.f87536b, mVar2, 8);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
