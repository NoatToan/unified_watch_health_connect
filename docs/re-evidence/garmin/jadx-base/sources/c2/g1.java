package c2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f22661b;

    public /* synthetic */ g1(h1 h1Var, int i14) {
        this.f22660a = i14;
        this.f22661b = h1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        h5.e2 e2Var = (h5.e2) obj;
        switch (this.f22660a) {
            case 0:
                e2Var.getClass();
                h1 h1Var = (h1) e2Var;
                k3 k3Var = this.f22661b.f22675b;
                if (!p005kotlin.jvm.internal.s.g(h1Var.f22674a, k3Var)) {
                    h1Var.f22674a = k3Var;
                    h1Var.V1();
                }
                return h5.d2.SkipSubtreeAndContinueTraversal;
            default:
                e2Var.getClass();
                this.f22661b.f22674a = ((h1) e2Var).f22675b;
                return Boolean.FALSE;
        }
    }
}
