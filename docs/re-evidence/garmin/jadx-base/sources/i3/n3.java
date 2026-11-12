package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n3 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o13.p f89056b;

    public /* synthetic */ n3(int i14, o13.p pVar) {
        this.f89055a = i14;
        this.f89056b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        p5.k0 k0Var = (p5.k0) obj;
        switch (this.f89055a) {
            case 0:
                p5.h0.n(k0Var, (String) this.f89056b.f128594a);
                break;
            default:
                k0Var.getClass();
                p5.h0.n(k0Var, (String) this.f89056b.f128594a);
                break;
        }
        return Unit.INSTANCE;
    }
}
