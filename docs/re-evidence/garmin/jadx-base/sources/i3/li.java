package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class li implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2.j f88920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sg f88921b;

    public li(a2.j jVar, sg sgVar) {
        this.f88920a = jVar;
        this.f88921b = sgVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            ba baVar = ba.f87580a;
            n3.e1.f122797a.getClass();
            baVar.a(true, false, this.f88920a, null, this.f88921b, fc.c(n3.e1.f122801e, mVar2), 0.0f, 0.0f, mVar2, 100663734, 200);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
