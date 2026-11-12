package g02;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f0 implements androidx.lifecycle.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f74386b;

    public /* synthetic */ f0(p3.p1 p1Var, int i14) {
        this.f74385a = i14;
        this.f74386b = p1Var;
    }

    @Override // androidx.lifecycle.k0
    public final void onStateChanged(androidx.lifecycle.n0 n0Var, androidx.lifecycle.b0.a aVar) {
        e23.a aVar2;
        switch (this.f74385a) {
            case 0:
                ((e23.p) this.f74386b.getF182175a()).invoke(n0Var, aVar);
                break;
            default:
                if (aVar == androidx.lifecycle.b0.a.ON_STOP && (aVar2 = (e23.a) this.f74386b.getF182175a()) != null) {
                    aVar2.invoke();
                    break;
                }
                break;
        }
    }
}
