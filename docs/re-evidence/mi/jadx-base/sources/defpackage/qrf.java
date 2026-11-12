package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class qrf {
    public static final f1a a(String str, Object[] objArr) {
        int i;
        Throwable thJ = j(objArr);
        if (str == null) {
            return new f1a(null, objArr, thJ);
        }
        if (objArr == null) {
            return new f1a(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int iIndexOf = str.indexOf("{}", i3);
            if (iIndexOf == -1) {
                if (i3 == 0) {
                    return new f1a(str, objArr, thJ);
                }
                sb.append(str.substring(i3, str.length()));
                return new f1a(sb.toString(), objArr, thJ);
            }
            if (m(str, iIndexOf)) {
                if (l(str, iIndexOf)) {
                    sb.append(str.substring(i3, iIndexOf - 1));
                    e(sb, objArr[i2], new HashMap());
                } else {
                    i2--;
                    sb.append(str.substring(i3, iIndexOf - 1));
                    sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
                    i = iIndexOf + 1;
                }
                i3 = i;
                i2++;
            } else {
                sb.append(str.substring(i3, iIndexOf));
                e(sb, objArr[i2], new HashMap());
            }
            i = iIndexOf + 2;
            i3 = i;
            i2++;
        }
        sb.append(str.substring(i3, str.length()));
        return i2 < objArr.length + (-1) ? new f1a(sb.toString(), objArr, thJ) : new f1a(sb.toString(), objArr, null);
    }

    public static void b(StringBuilder sb, boolean[] zArr) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(zArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    public static void c(StringBuilder sb, byte[] bArr) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) bArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    public static void d(StringBuilder sb, char[] cArr) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(cArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    public static void e(StringBuilder sb, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb.append(AbstractJsonLexerKt.NULL);
            return;
        }
        if (!obj.getClass().isArray()) {
            p(sb, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            b(sb, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            c(sb, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            d(sb, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            q(sb, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            k(sb, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            n(sb, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            g(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            f(sb, (double[]) obj);
        } else {
            o(sb, (Object[]) obj, map);
        }
    }

    public static void f(StringBuilder sb, double[] dArr) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(dArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    public static void g(StringBuilder sb, float[] fArr) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(fArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    public static final f1a h(String str, Object obj) {
        return a(str, new Object[]{obj});
    }

    public static final f1a i(String str, Object obj, Object obj2) {
        return a(str, new Object[]{obj, obj2});
    }

    public static final Throwable j(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    public static void k(StringBuilder sb, int[] iArr) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(iArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    public static final boolean l(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    public static final boolean m(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    public static void n(StringBuilder sb, long[] jArr) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(jArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    public static void o(StringBuilder sb, Object[] objArr, Map<Object[], Object> map) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        if (map.containsKey(objArr)) {
            sb.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                e(sb, objArr[i], map);
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    public static void p(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            System.err.println("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]");
            th.printStackTrace();
            sb.append("[FAILED toString()]");
        }
    }

    public static void q(StringBuilder sb, short[] sArr) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) sArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
    }
}
