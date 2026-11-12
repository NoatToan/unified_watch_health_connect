package r21;

import p005kotlin.Unit;
import p3.n1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f149539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f149540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f149541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f149542e;

    public /* synthetic */ p(i53.c cVar, e23.l lVar, n1 n1Var, n1 n1Var2, int i14) {
        this.f149538a = i14;
        this.f149539b = cVar;
        this.f149540c = lVar;
        this.f149541d = n1Var;
        this.f149542e = n1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f149538a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                int iIntValue2 = ((Number) this.f149539b.get(iIntValue)).intValue();
                n1 n1Var = this.f149541d;
                n1Var.t(iIntValue2);
                this.f149540c.invoke(Double.valueOf((((double) n1Var.getIntValue()) * 0.1d) + ((double) this.f149542e.getIntValue())));
                break;
            case 1:
                int iIntValue3 = ((Number) this.f149539b.get(iIntValue)).intValue();
                n1 n1Var2 = this.f149541d;
                n1Var2.t(iIntValue3);
                this.f149540c.invoke(Double.valueOf((((double) this.f149542e.getIntValue()) * 0.1d) + ((double) n1Var2.getIntValue())));
                break;
            default:
                int iIntValue4 = ((Number) this.f149539b.get(iIntValue)).intValue();
                n1 n1Var3 = this.f149541d;
                n1Var3.t(iIntValue4);
                this.f149540c.invoke(Double.valueOf((((double) n1Var3.getIntValue()) * 0.1d) + ((double) this.f149542e.getIntValue())));
                break;
        }
        return Unit.INSTANCE;
    }
}
