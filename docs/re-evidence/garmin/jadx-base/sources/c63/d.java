package c63;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends c, f, s.b {
    void O(e63.o<Object> oVar);

    @Override // c63.f
    default void d(e63.o<? super v0> oVar) {
        oVar.getClass();
        O(oVar);
    }

    @Override // c63.c
    default void f(e63.o<? super k> oVar) {
        oVar.getClass();
        O(oVar);
    }
}
