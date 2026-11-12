package k7;

import j20.x;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    private h() {
    }

    public static void a(boolean z14) {
        if (z14) {
            return;
        }
        vb.h.w();
    }

    public static void b(boolean z14, String str) {
        if (z14) {
            return;
        }
        vb.h.s(str);
    }

    public static void c(int i14, int i15, int i16, String str) {
        if (i14 < i15) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i15 + ", " + i16 + "] (too low)");
        }
        if (i14 <= i16) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i15 + ", " + i16 + "] (too high)");
    }

    public static void d(int i14) {
        if (i14 >= 0) {
            return;
        }
        vb.h.w();
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        x.l(str);
    }

    public static void f(boolean z14, String str) {
        if (z14) {
            return;
        }
        vb.h.z(str);
    }
}
