package y3;

import i3.e5;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import tn.k;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly3/c;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {
    static {
        new c();
    }

    private c() {
    }

    public static final void a(int i14, int i15) {
        if (i14 < 0 || i14 >= i15) {
            e.v(k.e(i14, i15, "index: ", ", size: "));
        }
    }

    public static final void b(int i14, int i15) {
        if (i14 < 0 || i14 > i15) {
            e.v(k.e(i14, i15, "index: ", ", size: "));
        }
    }

    public static final void c(int i14, int i15, int i16) {
        if (i14 < 0 || i15 > i16) {
            l2.j(i16, e5.j(i14, i15, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i14 <= i15) {
                return;
            }
            h.s(k.e(i14, i15, "fromIndex: ", " > toIndex: "));
        }
    }
}
