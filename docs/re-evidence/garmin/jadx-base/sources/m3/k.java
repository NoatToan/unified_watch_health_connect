package m3;

import c2.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class k implements e23.q<t, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f116263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f116264b;

    public k(r rVar, boolean z14) {
        this.f116263a = rVar;
        this.f116264b = z14;
    }

    @Override // e23.q
    public final Unit invoke(t tVar, p3.m mVar, Integer num) {
        t tVar2 = tVar;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar2.B(tVar2) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            i iVar = i.f116250a;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            iVar.a(this.f116263a, this.f116264b, tVar2.c(aVar, h4.d.a.f81525c), 0L, 0L, 0.0f, mVar2, 1572864, 56);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
