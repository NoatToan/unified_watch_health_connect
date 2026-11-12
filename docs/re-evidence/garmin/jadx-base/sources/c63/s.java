package c63;

/* JADX INFO: loaded from: classes3.dex */
public interface s {

    public interface a extends f {
        void c(r0 r0Var);

        void h(r0 r0Var);

        void k(r<b63.o> rVar);

        void l(w wVar);
    }

    public interface b extends a, d {
    }

    public interface c extends b, e {
        void G();

        void N(r<m> rVar);
    }

    public interface d extends s {
        default void H(int i14) {
            b(i14, i14);
        }

        void b(int i14, int i15);

        void e(r0 r0Var);

        void i(r0 r0Var);

        void m(r0 r0Var);

        void n(r0 r0Var);

        void p();

        void s(k0 k0Var);
    }

    public interface e extends s {
        void a(d1 d1Var);

        void g(r0 r0Var);

        void u(r0 r0Var);

        void w(r0 r0Var);
    }

    public interface f extends s {
        void j();

        void o(r0 r0Var);

        void r(r0 r0Var);

        void t(p0 p0Var);
    }

    void q(String str);
}
