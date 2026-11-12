package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.g3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/g3;", "Lh5/g;", "", "invoke-Deg8D_g", "(Lp3/m;Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class m0 extends p005kotlin.jvm.internal.w implements e23.q<g3<h5.g>, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h4.r f69007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(h4.r rVar) {
        super(3);
        this.f69007a = rVar;
    }

    @Override // e23.q
    public final Unit invoke(g3<h5.g> g3Var, p3.m mVar, Integer num) {
        p3.m mVar2 = g3Var.f135101a;
        p3.m mVar3 = mVar;
        num.intValue();
        p3.x1 x1Var = p3.n.f135158a;
        int iHashCode = Long.hashCode(mVar3.getU());
        h4.r rVarC = h4.k.c(this.f69007a, mVar3);
        mVar2.L(509942095);
        h5.g.V.getClass();
        b4.c(h5.g.a.f81807d, rVarC, mVar2);
        b4.c(h5.g.a.f81813j, Integer.valueOf(iHashCode), mVar2);
        mVar2.R();
        return Unit.INSTANCE;
    }
}
