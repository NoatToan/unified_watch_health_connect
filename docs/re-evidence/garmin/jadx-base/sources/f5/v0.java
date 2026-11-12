package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class v0 extends p005kotlin.jvm.internal.w implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.b f69142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f69143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(q0.b bVar, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        super(2);
        this.f69142a = bVar;
        this.f69143b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Boolean bool = (Boolean) this.f69142a.f69047g.getF182175a();
            boolean zBooleanValue = bool.booleanValue();
            mVar2.d(bool);
            boolean zH = mVar2.h(zBooleanValue);
            if (zBooleanValue) {
                this.f69143b.invoke(mVar2, 0);
            } else {
                mVar2.u(zH);
            }
            mVar2.p();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
