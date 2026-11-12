package l63;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    boolean D();

    p63.e a();

    c c(k63.e eVar);

    double f();

    default <T> T h(i63.b<? extends T> bVar) {
        bVar.getClass();
        return bVar.deserialize(this);
    }

    e k(k63.e eVar);

    byte m();

    long o();

    short p();

    char q();

    String s();

    int u();

    float x();

    boolean y();

    int z(k63.e eVar);
}
