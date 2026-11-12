package f5;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class l0 extends p005kotlin.jvm.internal.w implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<e23.p<p3.m, Integer, Unit>> f69003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(List<? extends e23.p<? super p3.m, ? super Integer, Unit>> list) {
        super(2);
        this.f69003a = list;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            List<e23.p<p3.m, Integer, Unit>> list = this.f69003a;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                e23.p<p3.m, Integer, Unit> pVar = list.get(i14);
                p3.x1 x1Var2 = p3.n.f135158a;
                int iHashCode = Long.hashCode(mVar2.getU());
                h5.g.V.getClass();
                h5.g.a.i iVar = h5.g.a.f81806c;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(iVar);
                } else {
                    mVar2.c();
                }
                b4.c(h5.g.a.f81813j, Integer.valueOf(iHashCode), mVar2);
                pVar.invoke(mVar2, 0);
                mVar2.y();
            }
            p3.x1 x1Var3 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
