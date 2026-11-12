package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ri f89539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph f89540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f89541d;

    public /* synthetic */ rh(ri riVar, ph phVar, int i14, int i15) {
        this.f89538a = i15;
        this.f89539b = riVar;
        this.f89540c = phVar;
        this.f89541d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f89538a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                bi.f(this.f89539b, this.f89540c, mVar, p3.p0.t(this.f89541d | 1));
                break;
            case 1:
                bi.b(this.f89539b, this.f89540c, mVar, p3.p0.t(this.f89541d | 1));
                break;
            default:
                bi.p(this.f89539b, this.f89540c, mVar, p3.p0.t(this.f89541d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
