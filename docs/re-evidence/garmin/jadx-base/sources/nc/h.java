package nc;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class h implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.b f125281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f125282b;

    public h(k.b bVar, lc.v vVar) {
        this.f125281a = bVar;
        this.f125282b = vVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        if ((num.intValue() & 3) == 2 && mVar2.b()) {
            mVar2.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            this.f125281a.f125297h.invoke(this.f125282b, mVar2, 0);
        }
        return Unit.INSTANCE;
    }
}
