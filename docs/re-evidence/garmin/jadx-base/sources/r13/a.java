package r13;

import e23.l;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
public class a {
    public static a61.c a(l... lVarArr) {
        if (lVarArr.length > 0) {
            return new a61.c(lVarArr, 19);
        }
        h.s("Failed requirement.");
        return null;
    }

    public static <T extends Comparable<?>> int b(T t7, T t14) {
        if (t7 == t14) {
            return 0;
        }
        if (t7 == null) {
            return -1;
        }
        if (t14 == null) {
            return 1;
        }
        return t7.compareTo(t14);
    }
}
