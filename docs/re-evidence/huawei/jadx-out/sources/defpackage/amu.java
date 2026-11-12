package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class amu {
    public static <T> T[] e(Class<T> cls, int i) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
    }

    public static <T> T[] b(T[] tArr, int i) {
        return (T[]) amz.e(tArr, i);
    }

    public static <T> T[] a(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) b(tArr, size);
        }
        e(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    static <T> T[] e(Object[] objArr, int i, int i2, T[] tArr) {
        Preconditions.checkPositionIndexes(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = (T[]) b(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }

    static Object[] a(Collection<?> collection) {
        return e(collection, new Object[collection.size()]);
    }

    private static Object[] e(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public static Object[] e(Object... objArr) {
        a(objArr, objArr.length);
        return objArr;
    }

    public static Object[] a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }

    public static Object a(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }
}
