package com.huami.watch.util;

import androidx.annotation.NonNull;
import com.alipay.sdk.m.n.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ArraysUtil {
    private static final String a = "Util-Arrays";

    public static <T> boolean contains(@NonNull T[] tArr, @NonNull T t) {
        boolean zContains = Arrays.asList(tArr).contains(t);
        Log.d(a, "Contains <" + t + "> : " + zContains, new Object[0]);
        return zContains;
    }

    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

    public static String join(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else if (charSequence3 != null) {
                sb.append(charSequence3);
            }
            if (charSequence != null) {
                sb.append(charSequence);
            }
            sb.append(obj);
            if (charSequence2 != null) {
                sb.append(charSequence2);
            }
        }
        return sb.toString();
    }

    public static String toString(List<?> list) {
        if (list == null) {
            return "null";
        }
        return Arrays.toString(list.toArray()) + ", Size : " + list.size();
    }

    public static boolean isEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static String toString(List<?> list, CharSequence charSequence) {
        Object[] array;
        if (list == null || (array = list.toArray()) == null) {
            return "null";
        }
        return join(array, (CharSequence) null, (CharSequence) null, charSequence) + ", Size : " + list.size();
    }

    public static String toString(Object[] objArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(objArr));
        if (objArr != null) {
            str = ", Size: " + objArr.length;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public static String toString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr + ", Size: " + bArr.length;
    }

    public static String toString(Map<String, Object> map, CharSequence charSequence) {
        return join(map, (CharSequence) null, (CharSequence) null, charSequence);
    }

    public static String join(@NonNull Map<String, Object> map, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (z) {
                z = false;
            } else if (charSequence3 != null) {
                sb.append(charSequence3);
            }
            if (charSequence != null) {
                sb.append(charSequence);
            }
            sb.append(entry.getKey());
            sb.append(a.h);
            sb.append(entry.getValue());
            if (charSequence2 != null) {
                sb.append(charSequence2);
            }
        }
        return sb.toString();
    }
}
