package q3;

import am.j;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final void a(int i14, List list) {
        int size = list.size();
        if (i14 < 0 || i14 >= size) {
            c(i14, size);
        }
    }

    public static final void b(int i14, int i15, List list) {
        if (i14 > i15) {
            f(i14, i15);
        }
        if (i14 < 0) {
            d(i14);
        }
        if (i15 > list.size()) {
            e(i15, list.size());
        }
    }

    private static final void c(int i14, int i15) {
        throw new IndexOutOfBoundsException(j.g(i14, i15, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i14) {
        throw new IndexOutOfBoundsException(e0.f(i14, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i14, int i15) {
        throw new IndexOutOfBoundsException("toIndex (" + i14 + ") is more than than the list size (" + i15 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    private static final void f(int i14, int i15) {
        throw new IllegalArgumentException(j.g(i14, i15, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
