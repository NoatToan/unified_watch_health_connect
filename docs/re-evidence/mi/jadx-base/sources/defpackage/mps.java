package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class mps {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile mps f27083b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jps f27084a;

    public static mps b() {
        if (f27083b == null) {
            synchronized (mps.class) {
                try {
                    if (f27083b == null) {
                        f27083b = new mps();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f27083b;
    }

    public jps a() {
        return this.f27084a;
    }

    public void c(jps jpsVar) {
        this.f27084a = jpsVar;
    }
}
