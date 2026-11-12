package c63;

import java.util.Arrays;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class t {
    public static final <T extends s> void a(T t7, e23.l<? super T, Unit>[] lVarArr, e23.l<? super T, Unit> lVar) {
        t7.getClass();
        if (!(t7 instanceof b)) {
            vb.h.z("impossible");
            return;
        }
        e23.l[] lVarArr2 = (e23.l[]) Arrays.copyOf(lVarArr, lVarArr.length);
        p005kotlin.jvm.internal.y0.e(1, lVar);
        ((b) t7).L(lVarArr2, lVar);
    }

    public static final void b(s sVar, char c14) {
        sVar.getClass();
        sVar.q(String.valueOf(c14));
    }

    public static final <T extends s> void c(T t7, String str, e23.l<? super T, Unit> lVar) {
        t7.getClass();
        if (!(t7 instanceof b)) {
            vb.h.z("impossible");
        } else {
            p005kotlin.jvm.internal.y0.e(1, lVar);
            ((b) t7).z(lVar, str);
        }
    }
}
