package vg1;

/* JADX INFO: loaded from: classes10.dex */
public interface z {
    String A();

    default boolean C() {
        return d() != null;
    }

    String D();

    default boolean F() {
        return i();
    }

    String G();

    String H();

    default boolean I() {
        return G() != null;
    }

    boolean M();

    String Z();

    default boolean b() {
        return Z() != null;
    }

    String d();

    default boolean f() {
        return t() != null;
    }

    String g();

    default boolean h() {
        return A() != null;
    }

    default boolean hasUserSettings() {
        return D() != null;
    }

    boolean i();

    String j();

    default boolean k() {
        return s() != null;
    }

    String m();

    boolean o();

    default boolean q() {
        return M();
    }

    String r();

    String s();

    String t();

    default boolean u() {
        return o();
    }

    String y();

    default boolean z() {
        return y() != null;
    }
}
