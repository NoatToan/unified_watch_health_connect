package zd0;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public interface g1 {
    static /* synthetic */ ub1.l u(g1 g1Var, c80.s0 s0Var, e0 e0Var, int i14) {
        if ((i14 & 2) != 0) {
            e0Var = null;
        }
        return g1Var.q(s0Var, e0Var, new z81.b(4));
    }

    void a();

    boolean c(c80.s0 s0Var);

    void d(c80.m0 m0Var, e0 e0Var);

    List<c80.y0> g();

    ArrayList h(c80.s0 s0Var, z81.b bVar);

    void l();

    void n(String str);

    void p(String str);

    ub1.l q(c80.s0 s0Var, e0 e0Var, e23.l<? super i0, Unit> lVar);

    i0 r(Context context, String str, c80.w0 w0Var);

    void t(z70.w wVar);

    o13.p v(c80.s0 s0Var, z81.b bVar);

    Object w(t13.d dVar);
}
