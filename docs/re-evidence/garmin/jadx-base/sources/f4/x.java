package f4;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f68838a = new Object();

    public static final <T> boolean a(k0<T> k0Var, int i14, u3.e<? extends T> eVar) {
        boolean z14;
        synchronized (f68838a) {
            int i15 = k0Var.f68772d;
            if (i15 == i14) {
                k0Var.f68771c = eVar;
                z14 = true;
                k0Var.f68772d = i15 + 1;
            } else {
                z14 = false;
            }
        }
        return z14;
    }

    public static final <T> k0<T> b(w<T> wVar) {
        k0 k0Var = wVar.f68837a;
        k0Var.getClass();
        return (k0) l.s(k0Var, wVar);
    }
}
