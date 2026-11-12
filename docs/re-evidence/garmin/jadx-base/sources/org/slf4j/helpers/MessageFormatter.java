package org.slf4j.helpers;

import com.google.maps.android.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class MessageFormatter {
    static final char DELIM_START = '{';
    static final char DELIM_STOP = '}';
    static final String DELIM_STR = "{}";
    private static final char ESCAPE_CHAR = '\\';

    public static final FormattingTuple arrayFormat(String str, Object[] objArr, Throwable th3) {
        int i14;
        if (str == null) {
            return new FormattingTuple(null, objArr, th3);
        }
        if (objArr == null) {
            return new FormattingTuple(str);
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 50);
        int i15 = 0;
        int i16 = 0;
        while (i15 < objArr.length) {
            int iIndexOf = str.indexOf(DELIM_STR, i16);
            if (iIndexOf == -1) {
                if (i16 == 0) {
                    return new FormattingTuple(str, objArr, th3);
                }
                sb3.append((CharSequence) str, i16, str.length());
                return new FormattingTuple(sb3.toString(), objArr, th3);
            }
            if (isEscapedDelimeter(str, iIndexOf)) {
                if (isDoubleEscaped(str, iIndexOf)) {
                    sb3.append((CharSequence) str, i16, iIndexOf - 1);
                    deeplyAppendParameter(sb3, objArr[i15], new HashMap());
                } else {
                    i15--;
                    sb3.append((CharSequence) str, i16, iIndexOf - 1);
                    sb3.append('{');
                    i14 = iIndexOf + 1;
                }
                i16 = i14;
                i15++;
            } else {
                sb3.append((CharSequence) str, i16, iIndexOf);
                deeplyAppendParameter(sb3, objArr[i15], new HashMap());
            }
            i14 = iIndexOf + 2;
            i16 = i14;
            i15++;
        }
        sb3.append((CharSequence) str, i16, str.length());
        return new FormattingTuple(sb3.toString(), objArr, th3);
    }

    private static void booleanArrayAppend(StringBuilder sb3, boolean[] zArr) {
        sb3.append('[');
        int length = zArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            sb3.append(zArr[i14]);
            if (i14 != length - 1) {
                sb3.append(", ");
            }
        }
        sb3.append(']');
    }

    private static void byteArrayAppend(StringBuilder sb3, byte[] bArr) {
        sb3.append('[');
        int length = bArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            sb3.append((int) bArr[i14]);
            if (i14 != length - 1) {
                sb3.append(", ");
            }
        }
        sb3.append(']');
    }

    private static void charArrayAppend(StringBuilder sb3, char[] cArr) {
        sb3.append('[');
        int length = cArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            sb3.append(cArr[i14]);
            if (i14 != length - 1) {
                sb3.append(", ");
            }
        }
        sb3.append(']');
    }

    private static void deeplyAppendParameter(StringBuilder sb3, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb3.append(BuildConfig.TRAVIS);
            return;
        }
        if (!obj.getClass().isArray()) {
            safeObjectAppend(sb3, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            booleanArrayAppend(sb3, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayAppend(sb3, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            charArrayAppend(sb3, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            shortArrayAppend(sb3, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            intArrayAppend(sb3, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            longArrayAppend(sb3, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            floatArrayAppend(sb3, (float[]) obj);
        } else if (obj instanceof double[]) {
            doubleArrayAppend(sb3, (double[]) obj);
        } else {
            objectArrayAppend(sb3, (Object[]) obj, map);
        }
    }

    private static void doubleArrayAppend(StringBuilder sb3, double[] dArr) {
        sb3.append('[');
        int length = dArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            sb3.append(dArr[i14]);
            if (i14 != length - 1) {
                sb3.append(", ");
            }
        }
        sb3.append(']');
    }

    private static void floatArrayAppend(StringBuilder sb3, float[] fArr) {
        sb3.append('[');
        int length = fArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            sb3.append(fArr[i14]);
            if (i14 != length - 1) {
                sb3.append(", ");
            }
        }
        sb3.append(']');
    }

    public static final FormattingTuple format(String str, Object obj) {
        return arrayFormat(str, new Object[]{obj});
    }

    public static Throwable getThrowableCandidate(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    private static void intArrayAppend(StringBuilder sb3, int[] iArr) {
        sb3.append('[');
        int length = iArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            sb3.append(iArr[i14]);
            if (i14 != length - 1) {
                sb3.append(", ");
            }
        }
        sb3.append(']');
    }

    public static final boolean isDoubleEscaped(String str, int i14) {
        return i14 >= 2 && str.charAt(i14 - 2) == '\\';
    }

    public static final boolean isEscapedDelimeter(String str, int i14) {
        return i14 != 0 && str.charAt(i14 - 1) == '\\';
    }

    private static void longArrayAppend(StringBuilder sb3, long[] jArr) {
        sb3.append('[');
        int length = jArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            sb3.append(jArr[i14]);
            if (i14 != length - 1) {
                sb3.append(", ");
            }
        }
        sb3.append(']');
    }

    private static void objectArrayAppend(StringBuilder sb3, Object[] objArr, Map<Object[], Object> map) {
        sb3.append('[');
        if (map.containsKey(objArr)) {
            sb3.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                deeplyAppendParameter(sb3, objArr[i14], map);
                if (i14 != length - 1) {
                    sb3.append(", ");
                }
            }
            map.remove(objArr);
        }
        sb3.append(']');
    }

    private static void safeObjectAppend(StringBuilder sb3, Object obj) {
        try {
            sb3.append(obj.toString());
        } catch (Throwable th3) {
            Util.report("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th3);
            sb3.append("[FAILED toString()]");
        }
    }

    private static void shortArrayAppend(StringBuilder sb3, short[] sArr) {
        sb3.append('[');
        int length = sArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            sb3.append((int) sArr[i14]);
            if (i14 != length - 1) {
                sb3.append(", ");
            }
        }
        sb3.append(']');
    }

    public static Object[] trimmedCopy(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            h.z("non-sensical empty or null argument array");
            return null;
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }

    public static final FormattingTuple format(String str, Object obj, Object obj2) {
        return arrayFormat(str, new Object[]{obj, obj2});
    }

    public static final FormattingTuple arrayFormat(String str, Object[] objArr) {
        Throwable throwableCandidate = getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            objArr = trimmedCopy(objArr);
        }
        return arrayFormat(str, objArr, throwableCandidate);
    }
}
