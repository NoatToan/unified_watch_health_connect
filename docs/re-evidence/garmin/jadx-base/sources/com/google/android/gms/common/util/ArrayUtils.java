package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @KeepForSdk
    public static <T> T[] concat(T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], length);
        int length2 = tArr[0].length;
        for (int i14 = 1; i14 < tArr.length; i14++) {
            T[] tArr4 = tArr[i14];
            int length3 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length2, length3);
            length2 += length3;
        }
        return tArr3;
    }

    @KeepForSdk
    public static byte[] concatByteArrays(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr[0], length);
        int length2 = bArr[0].length;
        for (int i14 = 1; i14 < bArr.length; i14++) {
            byte[] bArr3 = bArr[i14];
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArrCopyOf, length2, length3);
            length2 += length3;
        }
        return bArrCopyOf;
    }

    @KeepForSdk
    public static <T> boolean contains(T[] tArr, T t7) {
        int length = tArr != null ? tArr.length : 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (Objects.equal(tArr[i14], t7)) {
                if (i14 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @KeepForSdk
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    @KeepForSdk
    public static <T> T[] removeAll(T[] tArr, T... tArr2) {
        int length;
        int i14;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        Class<?> cls = tArr2.getClass();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), tArr.length));
        if (length == 1) {
            i14 = 0;
            for (T t7 : tArr) {
                if (!Objects.equal(tArr2[0], t7)) {
                    tArr3[i14] = t7;
                    i14++;
                }
            }
        } else {
            int i15 = 0;
            for (T t14 : tArr) {
                if (!contains(tArr2, t14)) {
                    tArr3[i15] = t14;
                    i15++;
                }
            }
            i14 = i15;
        }
        if (tArr3 == null) {
            return null;
        }
        return i14 == tArr3.length ? tArr3 : (T[]) Arrays.copyOf(tArr3, i14);
    }

    @KeepForSdk
    public static <T> ArrayList<T> toArrayList(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t7 : tArr) {
            arrayList.add(t7);
        }
        return arrayList;
    }

    @KeepForSdk
    public static int[] toPrimitiveArray(Collection<Integer> collection) {
        int i14 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i14] = it.next().intValue();
            i14++;
        }
        return iArr;
    }

    @KeepForSdk
    public static Integer[] toWrapperArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i14 = 0; i14 < length; i14++) {
            numArr[i14] = Integer.valueOf(iArr[i14]);
        }
        return numArr;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb3, double[] dArr) {
        int length = dArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != 0) {
                sb3.append(",");
            }
            sb3.append(dArr[i14]);
        }
    }

    @KeepForSdk
    public static void writeStringArray(StringBuilder sb3, String[] strArr) {
        int length = strArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != 0) {
                sb3.append(",");
            }
            sb3.append("\"");
            sb3.append(strArr[i14]);
            sb3.append("\"");
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb3, float[] fArr) {
        int length = fArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != 0) {
                sb3.append(",");
            }
            sb3.append(fArr[i14]);
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb3, int[] iArr) {
        int length = iArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != 0) {
                sb3.append(",");
            }
            sb3.append(iArr[i14]);
        }
    }

    @KeepForSdk
    public static boolean contains(int[] iArr, int i14) {
        if (iArr != null) {
            for (int i15 : iArr) {
                if (i15 == i14) {
                    return true;
                }
            }
        }
        return false;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb3, long[] jArr) {
        int length = jArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != 0) {
                sb3.append(",");
            }
            sb3.append(jArr[i14]);
        }
    }

    @KeepForSdk
    public static <T> void writeArray(StringBuilder sb3, T[] tArr) {
        int length = tArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != 0) {
                sb3.append(",");
            }
            sb3.append(tArr[i14]);
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb3, boolean[] zArr) {
        int length = zArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != 0) {
                sb3.append(",");
            }
            sb3.append(zArr[i14]);
        }
    }
}
