package l63;

import i63.i;
import m63.o1;

/* JADX INFO: loaded from: classes3.dex */
public interface d {
    void B(k63.e eVar, int i14, double d14);

    default boolean C(k63.e eVar) {
        eVar.getClass();
        return true;
    }

    void b(k63.e eVar);

    <T> void d(k63.e eVar, int i14, i<? super T> iVar, T t7);

    <T> void e(k63.e eVar, int i14, i<? super T> iVar, T t7);

    f f(o1 o1Var, int i14);

    void j(o1 o1Var, int i14, byte b14);

    void k(k63.e eVar, int i14, String str);

    void n(k63.e eVar, int i14, boolean z14);

    void r(o1 o1Var, int i14, short s8);

    void u(o1 o1Var, int i14, char c14);

    void v(int i14, int i15, k63.e eVar);

    void x(k63.e eVar, int i14, float f14);

    void z(k63.e eVar, int i14, long j8);
}
