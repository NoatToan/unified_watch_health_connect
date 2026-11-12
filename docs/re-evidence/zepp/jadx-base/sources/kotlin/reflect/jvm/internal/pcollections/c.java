package kotlin.reflect.jvm.internal.pcollections;

/* JADX INFO: loaded from: classes23.dex */
final class c<V> {
    private static final c<Object> b = new c<>(b.f);
    private final b<V> a;

    private c(b<V> bVar) {
        this.a = bVar;
    }

    public static <V> c<V> a() {
        return (c<V>) b;
    }

    private c<V> e(b<V> bVar) {
        return bVar == this.a ? this : new c<>(bVar);
    }

    public V b(int i) {
        return this.a.a(i);
    }

    public c<V> c(int i) {
        return e(this.a.c(i));
    }

    public c<V> d(int i, V v) {
        return e(this.a.d(i, v));
    }
}
