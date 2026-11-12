package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class qwl {
    public static <T> T a(T t) {
        if (t instanceof Serializable) {
            return (T) b(c(t));
        }
        return null;
    }

    public static <T> T b(byte[] bArr) {
        return (T) cid.o(new ByteArrayInputStream(bArr));
    }

    public static <T> byte[] c(T t) {
        if (!(t instanceof Serializable)) {
            return null;
        }
        y99 y99Var = new y99();
        cid.s(y99Var, false, (Serializable) t);
        return y99Var.a();
    }
}
