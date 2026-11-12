package n23;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c4 {

    public static class a<T> extends b<T> implements e23.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<T> f122417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile SoftReference<Object> f122418c;

        public a(T t7, e23.a<T> aVar) {
            if (aVar == null) {
                vb.h.s("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
                throw null;
            }
            this.f122418c = null;
            this.f122417b = aVar;
            if (t7 != null) {
                this.f122418c = new SoftReference<>(t7);
            }
        }

        @Override // e23.a
        public final T invoke() {
            T t7;
            SoftReference<Object> softReference = this.f122418c;
            if (softReference == null || (t7 = (T) softReference.get()) == null) {
                T tInvoke = this.f122417b.invoke();
                this.f122418c = new SoftReference<>(tInvoke == null ? b.f122419a : tInvoke);
                return tInvoke;
            }
            if (t7 == b.f122419a) {
                return null;
            }
            return t7;
        }
    }

    public static abstract class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f122419a = new a();

        public static class a {
        }
    }

    public static a a(t23.b bVar, e23.a aVar) {
        return new a(bVar, aVar);
    }
}
