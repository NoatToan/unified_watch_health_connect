package ht1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d0 implements e23.r<f2.r, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f85544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k02.d f85545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f85546c;

    public d0(List list, k02.d dVar, e23.l lVar) {
        this.f85544a = list;
        this.f85545b = dVar;
        this.f85546c = lVar;
    }

    @Override // e23.r
    public final Unit invoke(f2.r rVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        f2.r rVar2 = rVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(rVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            pt1.u uVar = (pt1.u) this.f85544a.get(iIntValue);
            mVar2.C(1611547135);
            k02.b.a(rVar2, this.f85545b, iIntValue, h4.r.S, z3.f.c(742032127, new b0(uVar, this.f85546c), mVar2), mVar2, (i14 & 14) | 27712 | (((i14 & 126) << 3) & 896));
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
