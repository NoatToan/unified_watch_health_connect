package nc;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class m implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d4.c f125301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f125302b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(d4.c cVar, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f125301a = cVar;
        this.f125302b = pVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        if ((num.intValue() & 3) == 2 && mVar2.b()) {
            mVar2.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            gl1.d.g(this.f125301a, this.f125302b, mVar2, 0);
        }
        return Unit.INSTANCE;
    }
}
