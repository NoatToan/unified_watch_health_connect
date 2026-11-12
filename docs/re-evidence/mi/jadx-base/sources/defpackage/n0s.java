package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class n0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f27423a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static r04<l0s> f27424b;

    public static r04<l0s> a() {
        r04<l0s> r04Var;
        r04<l0s> r04Var2 = f27424b;
        if (r04Var2 != null) {
            return r04Var2;
        }
        synchronized (f27423a) {
            try {
                if (f27424b == null) {
                    f27424b = new r04<>(1024);
                }
                r04Var = f27424b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r04Var;
    }
}
