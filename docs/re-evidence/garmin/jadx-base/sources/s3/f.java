package s3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p1.h0;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Ls3/f;", "", "list", "Lp1/h0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f156331a;

    public static final void a(h0 h0Var, int i14) {
        if (h0Var.f134763b == 0 || !(h0Var.a(0) == i14 || h0Var.a(h0Var.f134763b - 1) == i14)) {
            int i15 = h0Var.f134763b;
            h0Var.d(i14);
            while (i15 > 0) {
                int i16 = ((i15 + 1) >>> 1) - 1;
                int iA = h0Var.a(i16);
                if (i14 <= iA) {
                    break;
                }
                h0Var.g(i15, iA);
                i15 = i16;
            }
            h0Var.g(i15, i14);
        }
    }

    public static final int b(h0 h0Var) {
        int iA;
        int i14 = h0Var.f134763b;
        int iA2 = h0Var.a(0);
        while (h0Var.f134763b != 0 && h0Var.a(0) == iA2) {
            h0Var.g(0, h0Var.b());
            h0Var.f(h0Var.f134763b - 1);
            int i15 = h0Var.f134763b;
            int i16 = i15 >>> 1;
            int i17 = 0;
            while (i17 < i16) {
                int iA3 = h0Var.a(i17);
                int i18 = (i17 + 1) * 2;
                int i19 = i18 - 1;
                int iA4 = h0Var.a(i19);
                if (i18 < i15 && (iA = h0Var.a(i18)) > iA4) {
                    if (iA <= iA3) {
                        break;
                    }
                    h0Var.g(i17, iA);
                    h0Var.g(i18, iA3);
                    i17 = i18;
                } else {
                    if (iA4 <= iA3) {
                        break;
                    }
                    h0Var.g(i17, iA4);
                    h0Var.g(i19, iA3);
                    i17 = i19;
                }
            }
        }
        return iA2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return s.g(this.f156331a, ((f) obj).f156331a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f156331a.hashCode();
    }

    public final String toString() {
        return "PrioritySet(list=" + this.f156331a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
