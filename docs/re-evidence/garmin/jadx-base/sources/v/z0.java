package v;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements androidx.concurrent.futures.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f174139a;

    public void a() {
        c1 c1Var = this.f174139a;
        synchronized (c1Var.f173719a) {
            try {
                if (c1Var.f173728j == c1.a.f173746h) {
                    c1Var.q(c1Var.f173724f);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.concurrent.futures.b.c
    public Object d(androidx.concurrent.futures.b.a aVar) {
        String str;
        c1 c1Var = this.f174139a;
        synchronized (c1Var.f173719a) {
            k7.h.f(c1Var.f173730l == null, "Release completer expected to be null");
            c1Var.f173730l = aVar;
            str = "Release[session=" + c1Var + "]";
        }
        return str;
    }
}
