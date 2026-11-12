package li0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class u0 implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f112871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f112872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f112873c;

    public u0(List list, f fVar, float f14) {
        this.f112871a = list;
        this.f112872b = fVar;
        this.f112873c = f14;
    }

    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            d0 d0Var = (d0) this.f112871a.get(iIntValue);
            mVar2.C(2133753662);
            k0.g(d0Var, this.f112872b, this.f112873c, e2.d.c(dVar2, h4.r.S), mVar2, 0, 0);
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
