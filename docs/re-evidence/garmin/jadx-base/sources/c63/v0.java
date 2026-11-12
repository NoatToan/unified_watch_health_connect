package c63;

/* JADX INFO: loaded from: classes3.dex */
public interface v0 {
    void B(Integer num);

    Integer a();

    Integer b();

    void c(Integer num);

    default void e(d63.a aVar) {
        w(aVar != null ? Integer.valueOf(aVar.a(9)) : null);
    }

    void f(i iVar);

    Integer k();

    default d63.a n() {
        Integer numR = r();
        if (numR != null) {
            return new d63.a(numR.intValue(), 9);
        }
        return null;
    }

    Integer r();

    Integer s();

    i u();

    void v(Integer num);

    void w(Integer num);

    void y(Integer num);
}
