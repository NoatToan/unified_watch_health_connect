package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f111125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f111126c;

    public /* synthetic */ l0(j0 j0Var, e23.l lVar, int i14) {
        this.f111124a = i14;
        this.f111125b = j0Var;
        this.f111126c = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f111124a) {
            case 0:
                if (this.f111125b.f111075d) {
                    this.f111126c.invoke(Boolean.TRUE);
                }
                break;
            case 1:
                if (this.f111125b.f111075d) {
                    this.f111126c.invoke(Boolean.TRUE);
                }
                break;
            default:
                j0 j0Var = this.f111125b;
                if (j0Var.f111075d) {
                    this.f111126c.invoke(Boolean.valueOf(j0Var.f111076e));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
