package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes23.dex */
public final class MessageFormatter {
    public static final char a = '{';
    public static final char b = '}';
    public static final String c = "{}";
    private static final char d = '\\';

    private static void a(StringBuilder sb, boolean[] zArr) {
        sb.append(JsonLexerKt.BEGIN_LIST);
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(zArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(JsonLexerKt.END_LIST);
    }

    public static final FormattingTuple arrayFormat(String str, Object[] objArr) {
        Throwable thG = g(objArr);
        if (thG != null) {
            objArr = o(objArr);
        }
        return arrayFormat(str, objArr, thG);
    }

    private static void b(StringBuilder sb, byte[] bArr) {
        sb.append(JsonLexerKt.BEGIN_LIST);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) bArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(JsonLexerKt.END_LIST);
    }

    private static void c(StringBuilder sb, char[] cArr) {
        sb.append(JsonLexerKt.BEGIN_LIST);
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(cArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(JsonLexerKt.END_LIST);
    }

    private static void d(StringBuilder sb, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            m(sb, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            a(sb, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            b(sb, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            c(sb, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            n(sb, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            h(sb, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            k(sb, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            f(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            e(sb, (double[]) obj);
        } else {
            l(sb, (Object[]) obj, map);
        }
    }

    private static void e(StringBuilder sb, double[] dArr) {
        sb.append(JsonLexerKt.BEGIN_LIST);
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(dArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(JsonLexerKt.END_LIST);
    }

    private static void f(StringBuilder sb, float[] fArr) {
        sb.append(JsonLexerKt.BEGIN_LIST);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(fArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(JsonLexerKt.END_LIST);
    }

    public static final FormattingTuple format(String str, Object obj) {
        return arrayFormat(str, new Object[]{obj});
    }

    public static final Throwable g(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    private static void h(StringBuilder sb, int[] iArr) {
        sb.append(JsonLexerKt.BEGIN_LIST);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(iArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(JsonLexerKt.END_LIST);
    }

    public static final boolean i(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    public static final boolean j(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    private static void k(StringBuilder sb, long[] jArr) {
        sb.append(JsonLexerKt.BEGIN_LIST);
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(jArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(JsonLexerKt.END_LIST);
    }

    private static void l(StringBuilder sb, Object[] objArr, Map<Object[], Object> map) {
        sb.append(JsonLexerKt.BEGIN_LIST);
        if (map.containsKey(objArr)) {
            sb.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                d(sb, objArr[i], map);
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        }
        sb.append(JsonLexerKt.END_LIST);
    }

    private static void m(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            Util.report("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th);
            sb.append("[FAILED toString()]");
        }
    }

    private static void n(StringBuilder sb, short[] sArr) {
        sb.append(JsonLexerKt.BEGIN_LIST);
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) sArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(JsonLexerKt.END_LIST);
    }

    private static Object[] o(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    public static final FormattingTuple format(String str, Object obj, Object obj2) {
        return arrayFormat(str, new Object[]{obj, obj2});
    }

    public static final FormattingTuple arrayFormat(String str, Object[] objArr, Throwable th) {
        int i;
        if (str == null) {
            return new FormattingTuple(null, objArr, th);
        }
        if (objArr == null) {
            return new FormattingTuple(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int iIndexOf = str.indexOf(c, i3);
            if (iIndexOf == -1) {
                if (i3 == 0) {
                    return new FormattingTuple(str, objArr, th);
                }
                sb.append((CharSequence) str, i3, str.length());
                return new FormattingTuple(sb.toString(), objArr, th);
            }
            if (j(str, iIndexOf)) {
                if (!i(str, iIndexOf)) {
                    i2--;
                    sb.append((CharSequence) str, i3, iIndexOf - 1);
                    sb.append('{');
                    i = iIndexOf + 1;
                } else {
                    sb.append((CharSequence) str, i3, iIndexOf - 1);
                    d(sb, objArr[i2], new HashMap());
                }
                i3 = i;
                i2++;
            } else {
                sb.append((CharSequence) str, i3, iIndexOf);
                d(sb, objArr[i2], new HashMap());
            }
            i = iIndexOf + 2;
            i3 = i;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        return new FormattingTuple(sb.toString(), objArr, th);
    }
}
