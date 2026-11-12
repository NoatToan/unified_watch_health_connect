package dagger.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes22.dex */
public final class SingleCheck<T> implements Provider<T> {
    private static final Object c = new Object();
    public static final /* synthetic */ boolean d = false;
    private volatile Provider<T> a;
    private volatile Object b = c;

    private SingleCheck(Provider<T> provider) {
        this.a = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p) {
        return ((p instanceof SingleCheck) || (p instanceof DoubleCheck)) ? p : new SingleCheck((Provider) Preconditions.checkNotNull(p));
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.b;
        if (t != c) {
            return t;
        }
        Provider<T> provider = this.a;
        if (provider == null) {
            return (T) this.b;
        }
        T t2 = provider.get();
        this.b = t2;
        this.a = null;
        return t2;
    }
}
