package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e52<T> implements cg4<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16272a = false;

    public static boolean d(int i) {
        return (i & 1) == 1;
    }

    public static boolean e(int i) {
        return !d(i);
    }

    public static int k(boolean z) {
        return z ? 1 : 0;
    }

    public static boolean l(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean m(int i, int i2) {
        return (i & i2) == i2;
    }

    public static int n(int i, int i2) {
        return i & (~i2);
    }

    @Override // defpackage.cg4
    public synchronized void a() {
        if (this.f16272a) {
            return;
        }
        this.f16272a = true;
        try {
            f();
        } catch (Exception e) {
            j(e);
        }
    }

    @Override // defpackage.cg4
    public synchronized void b(T t, int i) {
        if (this.f16272a) {
            return;
        }
        this.f16272a = d(i);
        try {
            h(t, i);
        } catch (Exception e) {
            j(e);
        }
    }

    @Override // defpackage.cg4
    public synchronized void c(float f) {
        if (this.f16272a) {
            return;
        }
        try {
            i(f);
        } catch (Exception e) {
            j(e);
        }
    }

    public abstract void f();

    public abstract void g(Throwable th);

    public abstract void h(T t, int i);

    public abstract void i(float f);

    public void j(Exception exc) {
        cm8.G(getClass(), "unhandled exception", exc);
    }

    @Override // defpackage.cg4
    public synchronized void onFailure(Throwable th) {
        if (this.f16272a) {
            return;
        }
        this.f16272a = true;
        try {
            g(th);
        } catch (Exception e) {
            j(e);
        }
    }
}
