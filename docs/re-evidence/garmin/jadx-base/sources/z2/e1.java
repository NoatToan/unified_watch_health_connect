package z2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements e23.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f201569a;

    @Override // e23.t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        f5.c0 c0Var = (f5.c0) obj2;
        long j8 = ((n4.c) obj3).f123544a;
        o1 o1Var = this.f201569a;
        long jA = o1Var.a(c0Var, j8);
        long jA2 = o1Var.a(c0Var, ((n4.c) obj4).f123544a);
        o1Var.n(zBooleanValue);
        return Boolean.valueOf(o1Var.q(n4.c.a(jA).f123544a, jA2, ((Boolean) obj5).booleanValue(), (d0) obj6));
    }
}
