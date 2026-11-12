package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class c0b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile T f4785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f4786b;

        public a(b bVar) {
            this.f4786b = bVar;
        }

        @Override // c0b.b
        public T get() {
            if (this.f4785a == null) {
                synchronized (this) {
                    try {
                        if (this.f4785a == null) {
                            this.f4785a = (T) a6i.d(this.f4786b.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f4785a;
        }
    }

    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
