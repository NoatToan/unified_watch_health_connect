package in1;

import m4.g0;
import o53.b0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f94518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i2.a f94519c;

    public /* synthetic */ g(b0 b0Var, i2.a aVar, int i14) {
        this.f94517a = i14;
        this.f94518b = b0Var;
        this.f94519c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        g0 g0Var = (g0) obj;
        switch (this.f94517a) {
            case 0:
                g0Var.getClass();
                if (g0Var.a()) {
                    ge1.b.T(this.f94518b, null, null, new h(this.f94519c, null), 3);
                }
                break;
            default:
                g0Var.getClass();
                if (g0Var.a()) {
                    ge1.b.T(this.f94518b, null, null, new ro0.c(this.f94519c, null), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
