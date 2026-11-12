package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f5750b;

    public /* synthetic */ s1(t1 t1Var, int i14) {
        this.f5749a = i14;
        this.f5750b = t1Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5749a) {
            case 0:
                t1 t1Var = this.f5750b;
                a4.b bVar = t1Var.f5755c;
                if (bVar != null) {
                    t1Var.f5753a.k(bVar);
                }
                break;
            default:
                t1 t1Var2 = this.f5750b;
                if (t1Var2.f5755c == null) {
                    t1Var2.f5755c = new a4.b(t1Var2, 5);
                }
                t1Var2.f5753a.g(t1Var2.f5755c);
                break;
        }
    }
}
