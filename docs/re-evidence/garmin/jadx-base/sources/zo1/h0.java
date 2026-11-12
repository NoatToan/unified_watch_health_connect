package zo1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp1.a f206340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yo1.b f206341c;

    public /* synthetic */ h0(String str, bp1.a aVar, yo1.b bVar) {
        this.f206339a = 2;
        this.f206340b = aVar;
        this.f206341c = bVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        p5.k0 k0Var = (p5.k0) obj;
        switch (this.f206339a) {
            case 0:
                k0Var.getClass();
                p5.h0.n(k0Var, this.f206340b.a(this.f206341c, true));
                break;
            case 1:
                k0Var.getClass();
                p5.h0.n(k0Var, this.f206340b.a(this.f206341c, true));
                break;
            default:
                k0Var.getClass();
                this.f206340b.a(this.f206341c, true);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h0(bp1.a aVar, yo1.b bVar, int i14) {
        this.f206339a = i14;
        this.f206340b = aVar;
        this.f206341c = bVar;
    }
}
