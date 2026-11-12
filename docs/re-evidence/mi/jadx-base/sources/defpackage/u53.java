package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35389a;

    public final void e(int i) {
        this.f35389a = i | this.f35389a;
    }

    public void h() {
        this.f35389a = 0;
    }

    public final void i(int i) {
        this.f35389a = (~i) & this.f35389a;
    }

    public final boolean k(int i) {
        return (this.f35389a & i) == i;
    }

    public final boolean l() {
        return k(268435456);
    }

    public final boolean m() {
        return k(Integer.MIN_VALUE);
    }

    public final boolean n() {
        return k(4);
    }

    public final boolean o() {
        return k(1);
    }

    public final void p(int i) {
        this.f35389a = i;
    }
}
