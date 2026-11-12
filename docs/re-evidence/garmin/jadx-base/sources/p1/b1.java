package p1;

import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f134677a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f134678b = new q0(0);

    public static final void a(int i14, List list) {
        int size = list.size();
        if (i14 < 0 || i14 >= size) {
            org.apache.commons.lang3.e.v(am.j.g(i14, size, "Index ", " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(int i14, int i15, List list) {
        int size = list.size();
        if (i14 > i15) {
            vb.h.s(am.j.g(i14, i15, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
            return;
        }
        if (i14 < 0) {
            org.apache.commons.lang3.e.v(v.e0.f(i14, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i15 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i15 + ") is more than than the list size (" + size + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
