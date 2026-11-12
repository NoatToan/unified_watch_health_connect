package xa1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f189825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f189826c;

    public /* synthetic */ y(b0 b0Var, int i14, int i15) {
        this.f189824a = i15;
        this.f189825b = b0Var;
        this.f189826c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f189824a;
        int i15 = this.f189826c;
        b0 b0Var = this.f189825b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = b0.f189732f;
        switch (i14) {
            case 0:
                b0Var.k(mVar, p0.t(i15 | 1));
                break;
            case 1:
                b0Var.g(mVar, p0.t(i15 | 1));
                break;
            case 2:
                b0Var.j(mVar, p0.t(i15 | 1));
                break;
            default:
                b0Var.h(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
