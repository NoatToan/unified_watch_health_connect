package g2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f75148b;

    public /* synthetic */ k1(l1 l1Var, int i14) {
        this.f75147a = i14;
        this.f75148b = l1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f75147a) {
            case 0:
                return Float.valueOf(this.f75148b.f75157b.f());
            case 1:
                return Float.valueOf(this.f75148b.f75157b.c());
            default:
                l1 l1Var = this.f75148b;
                return Float.valueOf(l1Var.f75157b.e() - l1Var.f75157b.a());
        }
    }
}
