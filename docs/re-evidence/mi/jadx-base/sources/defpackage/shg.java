package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class shg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static thg f33640a;

    public static synchronized void a(thg thgVar) {
        if (f33640a != null) {
            throw new IllegalStateException("Cannot re-initialize NativeLoader.");
        }
        f33640a = thgVar;
    }

    public static synchronized void b(thg thgVar) {
        if (!c()) {
            a(thgVar);
        }
    }

    public static synchronized boolean c() {
        return f33640a != null;
    }
}
