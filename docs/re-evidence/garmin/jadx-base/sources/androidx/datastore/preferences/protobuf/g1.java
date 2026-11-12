package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface g1<T> {
    int a(a aVar);

    void b(Object obj, j jVar, o oVar);

    boolean c(x xVar, x xVar2);

    void d(T t7, u1 u1Var);

    int e(x xVar);

    boolean isInitialized(T t7);

    void makeImmutable(T t7);

    void mergeFrom(T t7, T t14);

    T newInstance();
}
