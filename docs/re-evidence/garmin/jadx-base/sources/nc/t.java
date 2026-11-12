package nc;

import lc.h0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class t implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.v f125341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.l f125342b;

    public t(lc.v vVar, r1.l lVar) {
        this.f125341a = vVar;
        this.f125342b = lVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        if ((num.intValue() & 3) == 2 && mVar2.b()) {
            mVar2.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            lc.v vVar = this.f125341a;
            h0 h0Var = vVar.f111882b;
            h0Var.getClass();
            ((e.b) h0Var).f125266g.invoke(this.f125342b, vVar, mVar2, 0);
        }
        return Unit.INSTANCE;
    }
}
