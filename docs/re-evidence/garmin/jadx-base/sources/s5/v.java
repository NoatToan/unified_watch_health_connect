package s5;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static b a(String str, x0 x0Var, long j8, g6.c cVar, w5.q.b bVar, List list, int i14, int i15, int i16) {
        int i17;
        List list2 = (i16 & 32) != 0 ? p13.j0.f134944a : list;
        p13.j0 j0Var = p13.j0.f134944a;
        int i18 = (i16 & 128) != 0 ? Integer.MAX_VALUE : i14;
        if ((i16 & 256) != 0) {
            d6.p.f57793b.getClass();
            i17 = d6.p.f57794c;
        } else {
            i17 = i15;
        }
        return new b(new a6.d(str, x0Var, list2, j0Var, bVar, cVar), i18, i17, j8, null);
    }

    public static final int b(float f14) {
        return (int) Math.ceil(f14);
    }
}
