package cw1;

import i3.wf;
import i3.yf;
import java.util.List;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f56195b;

    public /* synthetic */ s0(p3.n1 n1Var, int i14) {
        this.f56194a = i14;
        this.f56195b = n1Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f56194a;
        p3.n1 n1Var = this.f56195b;
        switch (i14) {
            case 0:
                List list = (List) obj;
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                list.getClass();
                x1 x1Var = p3.n.f135158a;
                if (n1Var.getIntValue() < list.size()) {
                    mVar.C(146756840);
                    yf yfVar = yf.f90469a;
                    h4.r.a aVar = h4.r.S;
                    wf wfVar = (wf) list.get(n1Var.getIntValue());
                    yfVar.getClass();
                    h4.r rVarB = yf.b(aVar, wfVar);
                    d92.b.f58623a.getClass();
                    yfVar.a(0.0f, 0, 2, d92.b.a(mVar).j().e(), rVarB, mVar);
                    mVar.f();
                } else {
                    mVar.C(146991324);
                    mVar.f();
                }
                return Unit.INSTANCE;
            case 1:
                List list2 = (List) obj;
                p3.m mVar2 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                list2.getClass();
                x1 x1Var2 = p3.n.f135158a;
                if (n1Var.getIntValue() < list2.size()) {
                    mVar2.C(-328214255);
                    yf yfVar2 = yf.f90469a;
                    h4.r.a aVar2 = h4.r.S;
                    wf wfVar2 = (wf) list2.get(n1Var.getIntValue());
                    yfVar2.getClass();
                    h4.r rVarB2 = yf.b(aVar2, wfVar2);
                    d92.b.f58623a.getClass();
                    yfVar2.a(0.0f, 0, 2, d92.b.a(mVar2).j().e(), rVarB2, mVar2);
                    mVar2.f();
                } else {
                    mVar2.C(-327979771);
                    mVar2.f();
                }
                return Unit.INSTANCE;
            default:
                f5.b1 b1Var = (f5.b1) obj;
                f5.y0 y0Var = (f5.y0) obj2;
                b1Var.getClass();
                y0Var.getClass();
                f5.v1 v1VarQ = y0Var.Q(((g6.a) obj3).f75988a);
                return f5.b1.h0(b1Var, v1VarQ.f69144a, n1Var.getIntValue(), new a03.k0(v1VarQ, 23));
        }
    }
}
