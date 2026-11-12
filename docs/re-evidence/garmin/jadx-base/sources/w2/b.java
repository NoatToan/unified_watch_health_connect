package w2;

import ch.qos.logback.core.CoreConstants;
import lc.u0;
import p005kotlin.Metadata;
import v2.k2;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lw2/b;", "", "value", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f181284a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181285a;

        static {
            int[] iArr = new int[k2.values().length];
            try {
                iArr[k2.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k2.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f181285a = iArr;
        }
    }

    public static final k2 a(long j8) {
        int i14 = (int) (j8 & 4294967295L);
        if (i14 < 0) {
            return null;
        }
        return i14 == 0 ? k2.Start : k2.End;
    }

    public static long b(int i14, k2 k2Var) {
        int i15 = -1;
        int i16 = k2Var == null ? -1 : a.f181285a[k2Var.ordinal()];
        if (i16 != -1) {
            i15 = 1;
            if (i16 == 1) {
                i15 = 0;
            } else if (i16 != 2) {
                u0.r();
                return 0L;
            }
        }
        return (((long) i14) << 32) | (((long) i15) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f181284a == ((b) obj).f181284a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f181284a);
    }

    public final String toString() {
        return "CursorAndWedgeAffinity(value=" + this.f181284a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
