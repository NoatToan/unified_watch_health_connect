package b82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f16863c;

    public /* synthetic */ v1(p3.n1 n1Var, int i14) {
        this.f16861a = 0;
        this.f16863c = n1Var;
        this.f16862b = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f16861a;
        p3.n1 n1Var = this.f16863c;
        int i15 = this.f16862b;
        switch (i14) {
            case 0:
                y1 y1Var = y1.f16902a;
                n1Var.t(i15);
                break;
            case 1:
                n1Var.t(i15);
                break;
            case 2:
                n1Var.t(i15);
                break;
            default:
                n1Var.t(i15);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ v1(int i14, p3.n1 n1Var, int i15) {
        this.f16861a = i15;
        this.f16862b = i14;
        this.f16863c = n1Var;
    }
}
