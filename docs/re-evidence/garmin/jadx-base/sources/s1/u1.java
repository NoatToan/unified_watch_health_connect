package s1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f155811b;

    public /* synthetic */ u1(t1 t1Var, int i14) {
        this.f155810a = i14;
        this.f155811b = t1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f155810a) {
            case 0:
                return new w1.b(this.f155811b);
            default:
                return new z1(this.f155811b);
        }
    }
}
