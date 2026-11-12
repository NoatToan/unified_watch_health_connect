package s1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f155738b;

    public /* synthetic */ s1(t1 t1Var, int i14) {
        this.f155737a = i14;
        this.f155738b = t1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f155737a) {
            case 0:
                return Long.valueOf(this.f155738b.b());
            case 1:
                t1 t1Var = this.f155738b;
                return Boolean.valueOf(!p005kotlin.jvm.internal.s.g(t1Var.f155747d.getF182175a(), t1Var.f155744a.a()) || t1Var.h() || ((Boolean) t1Var.f155751h.getF182175a()).booleanValue());
            default:
                return Boolean.valueOf(this.f155738b.h());
        }
    }
}
