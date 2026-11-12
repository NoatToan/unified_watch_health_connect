package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class bk4<A, B> implements dua<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4302a;

    public bk4() {
        this(true);
    }

    public final B a(A a2) {
        return b(a2);
    }

    @Override // defpackage.dua
    @Deprecated
    public final B apply(A a2) {
        return a(a2);
    }

    public B b(A a2) {
        if (!this.f4302a) {
            return d(a2);
        }
        if (a2 == null) {
            return null;
        }
        return (B) c6i.o(c(a2));
    }

    public abstract B c(A a2);

    /* JADX WARN: Multi-variable type inference failed */
    public final B d(A a2) {
        return (B) c(f2h.a(a2));
    }

    public bk4(boolean z) {
        this.f4302a = z;
    }
}
