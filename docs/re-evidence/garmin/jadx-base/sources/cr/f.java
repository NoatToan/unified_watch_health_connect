package cr;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f55278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f55279c;

    public /* synthetic */ f(m4.b0 b0Var, p1 p1Var, int i14) {
        this.f55277a = i14;
        this.f55278b = b0Var;
        this.f55279c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f55277a) {
            case 0:
                p1 p1Var = this.f55279c;
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                m4.b0.a(this.f55278b);
                break;
            case 1:
                p1 p1Var2 = this.f55279c;
                p1Var2.setValue(Boolean.valueOf(!((Boolean) p1Var2.getF182175a()).booleanValue()));
                m4.b0.a(this.f55278b);
                break;
            default:
                if (!((Boolean) this.f55279c.getF182175a()).booleanValue()) {
                    m4.b0.a(this.f55278b);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
