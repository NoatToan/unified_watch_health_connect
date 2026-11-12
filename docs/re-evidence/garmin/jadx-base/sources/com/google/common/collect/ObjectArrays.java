package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j20.x;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class ObjectArrays {
    private ObjectArrays() {
    }

    @CanIgnoreReturnValue
    public static Object checkElementNotNull(Object obj, int i14) {
        if (obj != null) {
            return obj;
        }
        x.l(am.j.h(i14, "at index "));
        return null;
    }

    @CanIgnoreReturnValue
    public static Object[] checkElementsNotNull(Object[] objArr, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            checkElementNotNull(objArr[i15], i15);
        }
        return objArr;
    }

    @GwtIncompatible
    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) newArray(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Object[] copyAsObjectArray(Object[] objArr, int i14, int i15) {
        Preconditions.checkPositionIndexes(i14, i14 + i15, objArr.length);
        if (i15 == 0) {
            return new Object[0];
        }
        Object[] objArr2 = new Object[i15];
        System.arraycopy(objArr, i14, objArr2, 0, i15);
        return objArr2;
    }

    @CanIgnoreReturnValue
    private static Object[] fillArray(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            objArr[i14] = it.next();
            i14++;
        }
        return objArr;
    }

    @GwtIncompatible
    public static <T> T[] newArray(Class<T> cls, int i14) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i14));
    }

    public static void swap(Object[] objArr, int i14, int i15) {
        Object obj = objArr[i14];
        objArr[i14] = objArr[i15];
        objArr[i15] = obj;
    }

    public static <T> T[] toArrayImpl(Object[] objArr, int i14, int i15, T[] tArr) {
        Preconditions.checkPositionIndexes(i14, i14 + i15, objArr.length);
        if (tArr.length < i15) {
            tArr = (T[]) newArray(tArr, i15);
        } else if (tArr.length > i15) {
            tArr[i15] = null;
        }
        System.arraycopy(objArr, i14, tArr, 0, i15);
        return tArr;
    }

    public static <T> T[] newArray(T[] tArr, int i14) {
        return (T[]) Platform.newArray(tArr, i14);
    }

    @CanIgnoreReturnValue
    public static Object[] checkElementsNotNull(Object... objArr) {
        checkElementsNotNull(objArr, objArr.length);
        return objArr;
    }

    public static <T> T[] concat(@ParametricNullness T t7, T[] tArr) {
        T[] tArr2 = (T[]) newArray(tArr, tArr.length + 1);
        tArr2[0] = t7;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] concat(T[] tArr, @ParametricNullness T t7) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t7;
        return tArr2;
    }

    public static <T> T[] toArrayImpl(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) newArray(tArr, size);
        }
        fillArray(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public static Object[] toArrayImpl(Collection<?> collection) {
        return fillArray(collection, new Object[collection.size()]);
    }
}
