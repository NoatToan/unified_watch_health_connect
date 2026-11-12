package b82;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f16843d;

    public /* synthetic */ u1(String str, int i14, p3.n1 n1Var, int i15) {
        this.f16840a = i15;
        this.f16841b = str;
        this.f16842c = i14;
        this.f16843d = n1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f16840a;
        p3.n1 n1Var = this.f16843d;
        int i15 = this.f16842c;
        String str = this.f16841b;
        switch (i14) {
            case 0:
                y1 y1Var = y1.f16902a;
                if (str.length() > 0) {
                    n1Var.t(i15);
                }
                break;
            case 1:
                y1 y1Var2 = y1.f16902a;
                if (str.length() > 0) {
                    n1Var.t(i15);
                }
                break;
            default:
                if (str.length() > 0) {
                    n1Var.t(i15);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
