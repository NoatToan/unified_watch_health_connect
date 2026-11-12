package r1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/e0;", "", "invoke", "(Lr1/e0;Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class i extends p005kotlin.jvm.internal.w implements e23.q<e0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f4.s<Object> f149115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<Object> f149117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.r<l, Object, p3.m, Integer, Unit> f149118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(f4.s<Object> sVar, Object obj, q<Object> qVar, e23.r<? super l, Object, ? super p3.m, ? super Integer, Unit> rVar) {
        super(3);
        this.f149115a = sVar;
        this.f149116b = obj;
        this.f149117c = qVar;
        this.f149118d = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    @Override // e23.q
    public final Unit invoke(e0 e0Var, p3.m mVar, Integer num) {
        e0 e0Var2 = e0Var;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? mVar2.B(e0Var2) : mVar2.r(e0Var2) ? 4 : 2;
        }
        if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            f4.s<Object> sVar = this.f149115a;
            boolean zB = mVar2.B(sVar);
            Object obj = this.f149116b;
            boolean zR = zB | mVar2.r(obj);
            q<Object> qVar = this.f149117c;
            boolean zR2 = zR | mVar2.r(qVar);
            Object objQ = mVar2.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR2) {
                objQ = new h(sVar, obj, qVar);
                mVar2.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h(sVar, obj, qVar);
                    mVar2.K(objQ);
                }
            }
            p3.l0.a(e0Var2, (e23.l) objQ, mVar2);
            p1.t0<Object, x3<g6.m>> t0Var = qVar.f149195e;
            e0Var2.getClass();
            t0Var.m(obj, ((f0) e0Var2).f149081a);
            Object objQ2 = mVar2.q();
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new m(e0Var2);
                mVar2.K(objQ2);
            }
            this.f149118d.invoke((m) objQ2, obj, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
