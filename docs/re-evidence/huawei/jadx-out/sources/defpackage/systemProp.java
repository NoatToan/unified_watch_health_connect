package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: zmd, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a,\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\t"}, d2 = {"systemProp", "", "propertyName", "", "defaultValue", "", "minValue", "maxValue", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
final /* synthetic */ class systemProp {
    public static final boolean b(String str, boolean z) {
        String strC = zme.c(str);
        return strC != null ? Boolean.parseBoolean(strC) : z;
    }

    public static /* synthetic */ int e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return zme.a(str, i, i2, i3);
    }

    public static final int e(String str, int i, int i2, int i3) {
        return (int) zme.e(str, i, i2, i3);
    }

    public static /* synthetic */ long b(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return zme.e(str, j, j4, j3);
    }

    public static final long d(String str, long j, long j2, long j3) {
        String strC = zme.c(str);
        if (strC == null) {
            return j;
        }
        Long lB = zes.b(strC);
        if (lB == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strC + '\'').toString());
        }
        long jLongValue = lB.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String e(String str, String str2) {
        String strC = zme.c(str);
        return strC == null ? str2 : strC;
    }
}
