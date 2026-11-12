package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class oj1 {
    public static <T> T[] a(T[] tArr, int i) {
        if (tArr.length < i) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        }
        if (tArr.length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
