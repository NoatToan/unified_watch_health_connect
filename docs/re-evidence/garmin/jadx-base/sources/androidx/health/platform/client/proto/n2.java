package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public interface n2<T> {
    void a(T t7, byte[] bArr, int i14, int i15, e.b bVar);

    int b(j0 j0Var);

    void c(T t7, d3 d3Var);

    int d(a aVar);

    void e(Object obj, k kVar, a0 a0Var);

    boolean f(j0 j0Var, j0 j0Var2);

    boolean isInitialized(T t7);

    void makeImmutable(T t7);

    void mergeFrom(T t7, T t14);

    T newInstance();
}
