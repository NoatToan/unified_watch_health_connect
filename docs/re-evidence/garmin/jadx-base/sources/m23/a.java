package m23;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k23.h;
import n23.h1;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(h1 h1Var) {
        if (h1Var instanceof h) {
            Field fieldB = b.b(h1Var);
            if (!(fieldB != null ? fieldB.isAccessible() : true)) {
                return false;
            }
            Method methodC = b.c(h1Var.getGetter());
            if (!(methodC != null ? methodC.isAccessible() : true)) {
                return false;
            }
            Method methodC2 = b.c(((h) h1Var).getSetter());
            if (!(methodC2 != null ? methodC2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldB2 = b.b(h1Var);
            if (!(fieldB2 != null ? fieldB2.isAccessible() : true)) {
                return false;
            }
            Method methodC3 = b.c(h1Var.getGetter());
            if (!(methodC3 != null ? methodC3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
