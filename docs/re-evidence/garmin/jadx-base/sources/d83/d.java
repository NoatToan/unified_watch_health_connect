package d83;

import c83.a0;
import j20.x;

/* JADX INFO: loaded from: classes11.dex */
public final class d<T> {
    private d(a0<T> a0Var, Throwable th3) {
    }

    public static <T> d<T> a(Throwable th3) {
        if (th3 != null) {
            return new d<>(null, th3);
        }
        x.l("error == null");
        return null;
    }

    public static <T> d<T> b(a0<T> a0Var) {
        if (a0Var != null) {
            return new d<>(a0Var, null);
        }
        x.l("response == null");
        return null;
    }
}
