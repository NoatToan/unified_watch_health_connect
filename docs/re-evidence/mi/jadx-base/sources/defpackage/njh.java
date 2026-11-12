package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class njh<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f27979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f27980b;

    public njh(F f, S s) {
        this.f27979a = f;
        this.f27980b = s;
    }

    public static <A, B> njh<A, B> a(A a2, B b2) {
        return new njh<>(a2, b2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof njh)) {
            return false;
        }
        njh njhVar = (njh) obj;
        return l4h.a(njhVar.f27979a, this.f27979a) && l4h.a(njhVar.f27980b, this.f27980b);
    }

    public int hashCode() {
        F f = this.f27979a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f27980b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f27979a + " " + this.f27980b + "}";
    }
}
