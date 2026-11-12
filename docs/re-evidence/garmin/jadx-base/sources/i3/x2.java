package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class x2 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.p1<String> f90190a;

    public x2(p3.p1<String> p1Var) {
        this.f90190a = p1Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1<String> p1Var = this.f90190a;
            if (d53.w.J(p1Var.getF182175a())) {
                mVar2.C(-1548950640);
            } else {
                mVar2.C(-327061465);
                mh.c(p1Var.getF182175a(), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262142);
                mVar2 = mVar2;
            }
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
