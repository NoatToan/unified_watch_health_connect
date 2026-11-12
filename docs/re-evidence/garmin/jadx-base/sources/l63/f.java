package l63;

import i63.i;

/* JADX INFO: loaded from: classes3.dex */
public interface f {
    void A(double d14);

    void D();

    p63.e a();

    d c(k63.e eVar);

    f g(k63.e eVar);

    void h(short s8);

    void i(boolean z14);

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void l(i<? super T> iVar, T t7) {
        iVar.getClass();
        iVar.serialize(this, t7);
    }

    void m(k63.e eVar, int i14);

    void o(int i14);

    void p(String str);

    default d q(k63.e eVar) {
        eVar.getClass();
        return c(eVar);
    }

    void s(long j8);

    void t(char c14);

    void w(byte b14);

    void y(float f14);
}
