package g03;

import com.google.firebase.perf.FirebasePerformance_Factory;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f74665c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile c<T> f74666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f74667b = f74665c;

    private a(c<T> cVar) {
        this.f74666a = cVar;
    }

    public static c a(FirebasePerformance_Factory firebasePerformance_Factory) {
        firebasePerformance_Factory.getClass();
        return new a(firebasePerformance_Factory);
    }

    @Override // n13.a
    public final T get() {
        T t7;
        T t14 = (T) this.f74667b;
        Object obj = f74665c;
        if (t14 != obj) {
            return t14;
        }
        synchronized (this) {
            try {
                t7 = (T) this.f74667b;
                if (t7 == obj) {
                    t7 = this.f74666a.get();
                    Object obj2 = this.f74667b;
                    if (obj2 != obj && obj2 != t7) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t7 + ". This is likely due to a circular dependency.");
                    }
                    this.f74667b = t7;
                    this.f74666a = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t7;
    }
}
