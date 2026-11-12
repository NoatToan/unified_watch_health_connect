package zd0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public interface e0 {
    static l0 b(boolean z14) {
        return z14 ? l0.SHOW : l0.HIDE;
    }

    c80.m0 a();

    Object c(t13.d<? super Unit> dVar);

    l0 d(c80.n0 n0Var);

    default String e() {
        return toString();
    }
}
