package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class l1p<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1p<TResult> f24532a = new k1p<>();

    public k1p<TResult> a() {
        return this.f24532a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f24532a.p();
    }

    public boolean f(Exception exc) {
        return this.f24532a.q(exc);
    }

    public boolean g(TResult tresult) {
        return this.f24532a.r(tresult);
    }
}
