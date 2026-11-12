package qj;

import j20.x;

/* JADX INFO: loaded from: classes7.dex */
public final class l {
    private l() {
    }

    public static void a(boolean z14, String str) {
        if (z14) {
            return;
        }
        vb.h.s(str);
    }

    public static void b(Object obj) {
        c(obj, "Argument must not be null");
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        x.l(str);
    }
}
