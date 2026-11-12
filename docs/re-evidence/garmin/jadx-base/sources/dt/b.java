package dt;

import lc.m0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f61099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f61100c;

    public /* synthetic */ b(m0 m0Var, e23.a aVar, int i14) {
        this.f61098a = i14;
        this.f61099b = m0Var;
        this.f61100c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f61098a) {
            case 0:
                if (!this.f61099b.n()) {
                    this.f61100c.invoke();
                }
                break;
            case 1:
                if (!this.f61099b.n()) {
                    this.f61100c.invoke();
                }
                break;
            case 2:
                if (!this.f61099b.m()) {
                    this.f61100c.invoke();
                }
                break;
            case 3:
                if (!this.f61099b.n()) {
                    this.f61100c.invoke();
                }
                break;
            case 4:
                m0 m0Var = this.f61099b;
                if (m0Var.f() != null) {
                    m0Var.n();
                } else {
                    this.f61100c.invoke();
                }
                break;
            default:
                m0 m0Var2 = this.f61099b;
                if (m0Var2.f() != null) {
                    m0Var2.n();
                } else {
                    this.f61100c.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
