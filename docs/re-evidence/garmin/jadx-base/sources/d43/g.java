package d43;

import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f57481a;

    public g(T t7) {
        this.f57481a = t7;
    }

    public abstract n0 a(t23.c0 c0Var);

    public T b() {
        return this.f57481a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        T tB = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return p005kotlin.jvm.internal.s.g(tB, gVar != null ? gVar.b() : null);
    }

    public final int hashCode() {
        T tB = b();
        if (tB != null) {
            return tB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
