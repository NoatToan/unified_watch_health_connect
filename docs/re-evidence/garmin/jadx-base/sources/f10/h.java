package f10;

import p005kotlin.Unit;
import p13.h0;
import p3.n1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f67838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f67839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f67840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f67841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1 f67842f;

    public /* synthetic */ h(i53.c cVar, i53.c cVar2, e23.l lVar, n1 n1Var, n1 n1Var2, int i14) {
        this.f67837a = i14;
        this.f67838b = cVar;
        this.f67839c = cVar2;
        this.f67840d = lVar;
        this.f67841e = n1Var;
        this.f67842f = n1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f67837a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                i53.c cVar = this.f67838b;
                int size = cVar.size() - 1;
                i53.c cVar2 = this.f67839c;
                n1 n1Var = this.f67841e;
                if (iIntValue == size) {
                    n1Var.t(((Number) h0.b0(cVar2)).intValue());
                } else {
                    this.f67842f.t(((Number) h0.b0(cVar2)).intValue());
                    n1Var.t(((Number) h0.m0(cVar2)).intValue());
                }
                this.f67840d.invoke(cVar.get(iIntValue));
                break;
            default:
                i53.c cVar3 = this.f67838b;
                int size2 = cVar3.size() - 1;
                i53.c cVar4 = this.f67839c;
                n1 n1Var2 = this.f67841e;
                if (iIntValue == size2) {
                    n1Var2.t(((Number) cVar4.get(cVar4.size() - 1)).intValue());
                } else {
                    n1 n1Var3 = this.f67842f;
                    if (iIntValue == 0) {
                        n1Var3.t(((Number) cVar4.get(0)).intValue());
                    } else {
                        n1Var2.t(59);
                        n1Var3.t(0);
                    }
                }
                this.f67840d.invoke(cVar3.get(iIntValue));
                break;
        }
        return Unit.INSTANCE;
    }
}
