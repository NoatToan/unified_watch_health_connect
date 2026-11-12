package ew1;

import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f66883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f66884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f66885d;

    public /* synthetic */ z1(e23.p pVar, p3.p1 p1Var, p3.p1 p1Var2, int i14) {
        this.f66882a = i14;
        this.f66883b = pVar;
        this.f66884c = p1Var;
        this.f66885d = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f66882a;
        p3.p1 p1Var = this.f66885d;
        p3.p1 p1Var2 = this.f66884c;
        e23.p pVar = this.f66883b;
        switch (i14) {
            case 0:
                a2.a aVar = a2.f66311e;
                pVar.invoke((hv1.j) p1Var2.getF182175a(), Integer.valueOf(((Number) p1Var.getF182175a()).intValue()));
                break;
            case 1:
                pVar.invoke(Double.valueOf(((n02.f) p1Var2.getF182175a()).f122171b), ((n02.f) p1Var2.getF182175a()).f122170a);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 2:
                p1Var2.setValue(Boolean.valueOf(!((Boolean) p1Var2.getF182175a()).booleanValue()));
                Boolean bool = (Boolean) p1Var2.getF182175a();
                bool.getClass();
                pVar.invoke(bool, i53.a.e((List) p1Var.getF182175a()));
                break;
            case 3:
                pVar.invoke((sk0.l0) p1Var2.getF182175a(), (List) p1Var.getF182175a());
                break;
            default:
                pVar.invoke((sk0.n0) p1Var2.getF182175a(), (List) p1Var.getF182175a());
                break;
        }
        return Unit.INSTANCE;
    }
}
