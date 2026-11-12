package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u27<T> implements dei<T>, fee<T> {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile dei<T> f35307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f35308b = c;

    public u27(dei<T> deiVar) {
        this.f35307a = deiVar;
    }

    public static <T> fee<T> b(dei<T> deiVar) {
        return deiVar instanceof fee ? (fee) deiVar : new u27((dei) f6i.b(deiVar));
    }

    public static <T> dei<T> c(dei<T> deiVar) {
        f6i.b(deiVar);
        return deiVar instanceof u27 ? deiVar : new u27(deiVar);
    }

    public static Object d(Object obj, Object obj2) {
        if (obj == c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public final synchronized Object a() {
        Object obj;
        obj = this.f35308b;
        if (obj == c) {
            obj = this.f35307a.get();
            this.f35308b = d(this.f35308b, obj);
            this.f35307a = null;
        }
        return obj;
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.f35308b;
        return t == c ? (T) a() : t;
    }
}
