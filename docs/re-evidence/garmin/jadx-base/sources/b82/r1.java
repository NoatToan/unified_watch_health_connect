package b82;

import i3.wf;
import i3.yf;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r1 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f16757c;

    public /* synthetic */ r1(boolean z14, p3.n1 n1Var, int i14) {
        this.f16755a = i14;
        this.f16756b = z14;
        this.f16757c = n1Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f16755a;
        p3.n1 n1Var = this.f16757c;
        boolean z14 = this.f16756b;
        List list = (List) obj;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        y1 y1Var = y1.f16902a;
        switch (i14) {
            case 0:
                list.getClass();
                p3.x1 x1Var = p3.n.f135158a;
                if (!z14 || n1Var.getIntValue() >= list.size()) {
                    mVar.C(-275406154);
                    mVar.f();
                } else {
                    mVar.C(-275684844);
                    yf yfVar = yf.f90469a;
                    h4.r.a aVar = h4.r.S;
                    wf wfVar = (wf) list.get(n1Var.getIntValue());
                    yfVar.getClass();
                    h4.r rVarB = yf.b(aVar, wfVar);
                    d92.b.f58623a.getClass();
                    yfVar.a(0.0f, 0, 2, d92.b.a(mVar).j().e(), rVarB, mVar);
                    mVar.f();
                }
                break;
            case 1:
                list.getClass();
                p3.x1 x1Var2 = p3.n.f135158a;
                if (!z14 || n1Var.getIntValue() >= list.size()) {
                    mVar.C(-2160913);
                    mVar.f();
                } else {
                    mVar.C(-2430954);
                    yf yfVar2 = yf.f90469a;
                    h4.r.a aVar2 = h4.r.S;
                    wf wfVar2 = (wf) list.get(n1Var.getIntValue());
                    yfVar2.getClass();
                    h4.r rVarB2 = yf.b(aVar2, wfVar2);
                    d92.b.f58623a.getClass();
                    yfVar2.a(0.0f, 0, 2, d92.b.a(mVar).j().e(), rVarB2, mVar);
                    mVar.f();
                }
                break;
            case 2:
                list.getClass();
                p3.x1 x1Var3 = p3.n.f135158a;
                if (!z14 || n1Var.getIntValue() >= list.size()) {
                    mVar.C(392791829);
                    mVar.f();
                } else {
                    mVar.C(392516983);
                    yf yfVar3 = yf.f90469a;
                    h4.r.a aVar3 = h4.r.S;
                    wf wfVar3 = (wf) list.get(n1Var.getIntValue());
                    yfVar3.getClass();
                    yfVar3.a(0.0f, 0, 2, fb1.c.g(d92.b.f58623a, mVar), yf.b(aVar3, wfVar3), mVar);
                    mVar.f();
                }
                break;
            default:
                list.getClass();
                p3.x1 x1Var4 = p3.n.f135158a;
                if (!z14 || n1Var.getIntValue() >= list.size()) {
                    mVar.C(-670362864);
                    mVar.f();
                } else {
                    mVar.C(-670632905);
                    yf yfVar4 = yf.f90469a;
                    h4.r.a aVar4 = h4.r.S;
                    wf wfVar4 = (wf) list.get(n1Var.getIntValue());
                    yfVar4.getClass();
                    h4.r rVarB3 = yf.b(aVar4, wfVar4);
                    d92.b.f58623a.getClass();
                    yfVar4.a(0.0f, 0, 2, d92.b.a(mVar).j().e(), rVarB3, mVar);
                    mVar.f();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
