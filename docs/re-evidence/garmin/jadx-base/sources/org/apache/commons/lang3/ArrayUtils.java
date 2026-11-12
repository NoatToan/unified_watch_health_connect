package org.apache.commons.lang3;

import b71.i;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableInt;
import tn.k;
import v.e0;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public class ArrayUtils {
    public static final int INDEX_NOT_FOUND = -1;
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];
    public static final char[] EMPTY_CHAR_ARRAY = new char[0];
    public static final Character[] EMPTY_CHARACTER_OBJECT_ARRAY = new Character[0];
    public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];
    public static final Field[] EMPTY_FIELD_ARRAY = new Field[0];
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    public static final Long[] EMPTY_LONG_OBJECT_ARRAY = new Long[0];
    public static final Method[] EMPTY_METHOD_ARRAY = new Method[0];
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
    public static final short[] EMPTY_SHORT_ARRAY = new short[0];
    public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = new Short[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final Throwable[] EMPTY_THROWABLE_ARRAY = new Throwable[0];
    public static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    private static Object add(Object obj, int i14, Object obj2, Class<?> cls) {
        if (obj == null) {
            if (i14 != 0) {
                e.v(e0.f(i14, "Index: ", ", Length: 0"));
                return null;
            }
            Object objNewInstance = Array.newInstance(cls, 1);
            Array.set(objNewInstance, 0, obj2);
            return objNewInstance;
        }
        int length = Array.getLength(obj);
        if (i14 > length || i14 < 0) {
            e.v(k.e(i14, length, "Index: ", ", Length: "));
            return null;
        }
        Object objNewInstance2 = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, objNewInstance2, 0, i14);
        Array.set(objNewInstance2, i14, obj2);
        if (i14 < length) {
            System.arraycopy(obj, i14, objNewInstance2, i14 + 1, length - i14);
        }
        return objNewInstance2;
    }

    public static <T> T[] addAll(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return (T[]) clone(tArr2);
        }
        if (tArr2 == null) {
            return (T[]) clone(tArr);
        }
        Class<?> componentType = tArr.getClass().getComponentType();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(componentType, tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        try {
            System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
            return tArr3;
        } catch (ArrayStoreException e4) {
            Class<?> componentType2 = tArr2.getClass().getComponentType();
            if (componentType.isAssignableFrom(componentType2)) {
                throw e4;
            }
            throw new IllegalArgumentException("Cannot store " + componentType2.getName() + " in an array of " + componentType.getName(), e4);
        }
    }

    public static boolean[] addFirst(boolean[] zArr, boolean z14) {
        return zArr == null ? add(zArr, z14) : insert(0, zArr, z14);
    }

    public static boolean[] clone(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public static boolean contains(double[] dArr, double d14, double d15) {
        return indexOf(dArr, d14, 0, d15) != -1;
    }

    private static Object copyArrayGrow1(Object obj, Class<?> cls) {
        if (obj == null) {
            return Array.newInstance(cls, 1);
        }
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        return objNewInstance;
    }

    public static <T> T get(T[] tArr, int i14, T t7) {
        return isArrayIndexValid(tArr, i14) ? tArr[i14] : t7;
    }

    public static int getLength(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static int hashCode(Object obj) {
        return new HashCodeBuilder().append(obj).toHashCode();
    }

    public static int indexOf(double[] dArr, double d14, int i14) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        boolean zIsNaN = Double.isNaN(d14);
        while (i14 < dArr.length) {
            double d15 = dArr[i14];
            if (d14 == d15 || (zIsNaN && Double.isNaN(d15))) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static BitSet indexesOf(boolean[] zArr, boolean z14, int i14) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (zArr != null) {
            while (i14 < zArr.length && (iIndexOf = indexOf(zArr, z14, i14)) != -1) {
                bitSet.set(iIndexOf);
                i14 = iIndexOf + 1;
            }
        }
        return bitSet;
    }

    @SafeVarargs
    public static <T> T[] insert(int i14, T[] tArr, T... tArr2) {
        if (tArr == null) {
            return null;
        }
        if (isEmpty(tArr2)) {
            return (T[]) clone(tArr);
        }
        if (i14 < 0 || i14 > tArr.length) {
            l2.j(tArr.length, i.i(i14, "Index: ", ", Length: "));
            return null;
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length));
        System.arraycopy(tArr2, 0, tArr3, i14, tArr2.length);
        if (i14 > 0) {
            System.arraycopy(tArr, 0, tArr3, 0, i14);
        }
        if (i14 < tArr.length) {
            System.arraycopy(tArr, i14, tArr3, tArr2.length + i14, tArr.length - i14);
        }
        return tArr3;
    }

    public static <T> boolean isArrayIndexValid(T[] tArr, int i14) {
        return i14 >= 0 && getLength(tArr) > i14;
    }

    public static boolean isEmpty(boolean[] zArr) {
        return getLength(zArr) == 0;
    }

    @Deprecated
    public static boolean isEquals(Object obj, Object obj2) {
        return new EqualsBuilder().append(obj, obj2).isEquals();
    }

    public static boolean isNotEmpty(boolean[] zArr) {
        return !isEmpty(zArr);
    }

    public static boolean isSameLength(boolean[] zArr, boolean[] zArr2) {
        return getLength(zArr) == getLength(zArr2);
    }

    public static boolean isSameType(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return obj.getClass().getName().equals(obj2.getClass().getName());
        }
        h.s("The Array must not be null");
        return false;
    }

    public static <T> boolean isSorted(T[] tArr, Comparator<T> comparator) {
        if (comparator == null) {
            h.s("Comparator should not be null.");
            return false;
        }
        if (tArr != null && tArr.length >= 2) {
            T t7 = tArr[0];
            int length = tArr.length;
            int i14 = 1;
            while (i14 < length) {
                T t14 = tArr[i14];
                if (comparator.compare(t7, t14) > 0) {
                    return false;
                }
                i14++;
                t7 = t14;
            }
        }
        return true;
    }

    public static int lastIndexOf(Object[] objArr, Object obj, int i14) {
        if (objArr == null || i14 < 0) {
            return -1;
        }
        if (i14 >= objArr.length) {
            i14 = objArr.length - 1;
        }
        if (obj == null) {
            while (i14 >= 0) {
                if (objArr[i14] == null) {
                    return i14;
                }
                i14--;
            }
        } else if (objArr.getClass().getComponentType().isInstance(obj)) {
            while (i14 >= 0) {
                if (obj.equals(objArr[i14])) {
                    return i14;
                }
                i14--;
            }
        }
        return -1;
    }

    public static <T> T[] nullToEmpty(T[] tArr, Class<T[]> cls) {
        if (cls != null) {
            return tArr == null ? cls.cast(Array.newInstance(cls.getComponentType(), 0)) : tArr;
        }
        h.s("The type must not be null");
        return null;
    }

    private static Object remove(Object obj, int i14) {
        int length = getLength(obj);
        if (i14 < 0 || i14 >= length) {
            e.v(k.e(i14, length, "Index: ", ", Length: "));
            return null;
        }
        int i15 = length - 1;
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i15);
        System.arraycopy(obj, 0, objNewInstance, 0, i14);
        if (i14 < i15) {
            System.arraycopy(obj, i14 + 1, objNewInstance, i14, (length - i14) - 1);
        }
        return objNewInstance;
    }

    public static Object removeAll(Object obj, int... iArr) {
        int i14;
        int length = getLength(obj);
        int[] iArrSort = ArraySorter.sort(clone(iArr));
        if (isNotEmpty(iArrSort)) {
            int length2 = iArrSort.length;
            int i15 = length;
            i14 = 0;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                int i16 = iArrSort[length2];
                if (i16 < 0 || i16 >= length) {
                    e.v(k.e(i16, length, "Index: ", ", Length: "));
                    return null;
                }
                if (i16 < i15) {
                    i14++;
                    i15 = i16;
                }
            }
        } else {
            i14 = 0;
        }
        int i17 = length - i14;
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i17);
        if (i14 < length) {
            int length3 = iArrSort.length - 1;
            while (length3 >= 0) {
                int i18 = iArrSort[length3];
                int i19 = length - i18;
                if (i19 > 1) {
                    int i24 = i19 - 1;
                    i17 -= i24;
                    System.arraycopy(obj, i18 + 1, objNewInstance, i17, i24);
                }
                length3--;
                length = i18;
            }
            if (length > 0) {
                System.arraycopy(obj, 0, objNewInstance, 0, length);
            }
        }
        return objNewInstance;
    }

    @Deprecated
    public static boolean[] removeAllOccurences(boolean[] zArr, boolean z14) {
        return (boolean[]) removeAll(zArr, indexesOf(zArr, z14));
    }

    public static boolean[] removeAllOccurrences(boolean[] zArr, boolean z14) {
        return (boolean[]) removeAll(zArr, indexesOf(zArr, z14));
    }

    public static boolean[] removeElement(boolean[] zArr, boolean z14) {
        int iIndexOf = indexOf(zArr, z14);
        return iIndexOf == -1 ? clone(zArr) : remove(zArr, iIndexOf);
    }

    public static boolean[] removeElements(boolean[] zArr, boolean... zArr2) {
        if (isEmpty(zArr) || isEmpty(zArr2)) {
            return clone(zArr);
        }
        HashMap map = new HashMap(2);
        for (boolean z14 : zArr2) {
            Boolean boolValueOf = Boolean.valueOf(z14);
            MutableInt mutableInt = (MutableInt) map.get(boolValueOf);
            if (mutableInt == null) {
                map.put(boolValueOf, new MutableInt(1));
            } else {
                mutableInt.increment();
            }
        }
        BitSet bitSet = new BitSet();
        for (int i14 = 0; i14 < zArr.length; i14++) {
            boolean z15 = zArr[i14];
            MutableInt mutableInt2 = (MutableInt) map.get(Boolean.valueOf(z15));
            if (mutableInt2 != null) {
                if (mutableInt2.decrementAndGet() == 0) {
                    map.remove(Boolean.valueOf(z15));
                }
                bitSet.set(i14);
            }
        }
        return (boolean[]) removeAll(zArr, bitSet);
    }

    public static void reverse(boolean[] zArr, int i14, int i15) {
        if (zArr == null) {
            return;
        }
        int iMin = Math.min(zArr.length, i15) - 1;
        for (int iMax = Math.max(i14, 0); iMin > iMax; iMax++) {
            boolean z14 = zArr[iMin];
            zArr[iMin] = zArr[iMax];
            zArr[iMax] = z14;
            iMin--;
        }
    }

    public static void shift(boolean[] zArr, int i14, int i15, int i16) {
        if (zArr != null && i14 < zArr.length - 1 && i15 > 0) {
            if (i14 < 0) {
                i14 = 0;
            }
            if (i15 >= zArr.length) {
                i15 = zArr.length;
            }
            int i17 = i15 - i14;
            if (i17 <= 1) {
                return;
            }
            int i18 = i16 % i17;
            if (i18 < 0) {
                i18 += i17;
            }
            while (i17 > 1 && i18 > 0) {
                int i19 = i17 - i18;
                if (i18 > i19) {
                    swap(zArr, i14, (i17 + i14) - i19, i19);
                    int i24 = i18;
                    i18 -= i19;
                    i17 = i24;
                } else if (i18 >= i19) {
                    swap(zArr, i14, i19 + i14, i18);
                    return;
                } else {
                    swap(zArr, i14, i14 + i19, i18);
                    i14 += i18;
                    i17 = i19;
                }
            }
        }
    }

    public static void shuffle(boolean[] zArr, Random random) {
        for (int length = zArr.length; length > 1; length--) {
            swap(zArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static <T> T[] subarray(T[] tArr, int i14, int i15) {
        if (tArr == null) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 > tArr.length) {
            i15 = tArr.length;
        }
        int i16 = i15 - i14;
        Class<?> componentType = tArr.getClass().getComponentType();
        if (i16 <= 0) {
            return (T[]) ((Object[]) Array.newInstance(componentType, 0));
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(componentType, i16));
        System.arraycopy(tArr, i14, tArr2, 0, i16);
        return tArr2;
    }

    public static void swap(short[] sArr, int i14, int i15, int i16) {
        if (isEmpty(sArr) || i14 >= sArr.length || i15 >= sArr.length) {
            return;
        }
        int i17 = 0;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        if (i14 == i15) {
            return;
        }
        int iMin = Math.min(Math.min(i16, sArr.length - i14), sArr.length - i15);
        while (i17 < iMin) {
            short s8 = sArr[i14];
            sArr[i14] = sArr[i15];
            sArr[i15] = s8;
            i17++;
            i14++;
            i15++;
        }
    }

    public static <T> T[] toArray(T... tArr) {
        return tArr;
    }

    public static Map<Object, Object> toMap(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        HashMap map = new HashMap((int) (((double) objArr.length) * 1.5d));
        for (int i14 = 0; i14 < objArr.length; i14++) {
            Object obj = objArr[i14];
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                map.put(entry.getKey(), entry.getValue());
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Array element " + i14 + ", '" + obj + "', is neither of type Map.Entry nor an Array");
                }
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length < 2) {
                    throw new IllegalArgumentException("Array element " + i14 + ", '" + obj + "', has a length less than 2");
                }
                map.put(objArr2[0], objArr2[1]);
            }
        }
        return map;
    }

    public static Boolean[] toObject(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return EMPTY_BOOLEAN_OBJECT_ARRAY;
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i14 = 0; i14 < zArr.length; i14++) {
            boolArr[i14] = zArr[i14] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    public static Object toPrimitive(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> clsWrapperToPrimitive = ClassUtils.wrapperToPrimitive(obj.getClass().getComponentType());
        if (Boolean.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Boolean[]) obj);
        }
        if (Character.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Character[]) obj);
        }
        if (Byte.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Byte[]) obj);
        }
        if (Integer.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Integer[]) obj);
        }
        if (Long.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Long[]) obj);
        }
        if (Short.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Short[]) obj);
        }
        if (Double.TYPE.equals(clsWrapperToPrimitive)) {
            return toPrimitive((Double[]) obj);
        }
        return Float.TYPE.equals(clsWrapperToPrimitive) ? toPrimitive((Float[]) obj) : obj;
    }

    public static String toString(Object obj, String str) {
        return obj == null ? str : new ToStringBuilder(obj, ToStringStyle.SIMPLE_STYLE).append(obj).toString();
    }

    public static String[] toStringArray(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return EMPTY_STRING_ARRAY;
        }
        String[] strArr = new String[objArr.length];
        for (int i14 = 0; i14 < objArr.length; i14++) {
            Object obj = objArr[i14];
            strArr[i14] = obj == null ? str : obj.toString();
        }
        return strArr;
    }

    public static boolean isNotEmpty(byte[] bArr) {
        return !isEmpty(bArr);
    }

    public static boolean isNotEmpty(char[] cArr) {
        return !isEmpty(cArr);
    }

    public static boolean isNotEmpty(double[] dArr) {
        return !isEmpty(dArr);
    }

    public static <T> T get(T[] tArr, int i14) {
        return (T) get(tArr, i14, null);
    }

    public static boolean isEmpty(byte[] bArr) {
        return getLength(bArr) == 0;
    }

    public static boolean isNotEmpty(float[] fArr) {
        return !isEmpty(fArr);
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static boolean isEmpty(char[] cArr) {
        return getLength(cArr) == 0;
    }

    public static boolean isNotEmpty(int[] iArr) {
        return !isEmpty(iArr);
    }

    @Deprecated
    public static byte[] removeAllOccurences(byte[] bArr, byte b14) {
        return (byte[]) removeAll(bArr, indexesOf(bArr, b14));
    }

    public static byte[] removeAllOccurrences(byte[] bArr, byte b14) {
        return (byte[]) removeAll(bArr, indexesOf(bArr, b14));
    }

    public static char[] clone(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static boolean isEmpty(double[] dArr) {
        return getLength(dArr) == 0;
    }

    public static boolean isNotEmpty(long[] jArr) {
        return !isEmpty(jArr);
    }

    @Deprecated
    public static char[] removeAllOccurences(char[] cArr, char c14) {
        return (char[]) removeAll(cArr, indexesOf(cArr, c14));
    }

    public static char[] removeAllOccurrences(char[] cArr, char c14) {
        return (char[]) removeAll(cArr, indexesOf(cArr, c14));
    }

    public static double[] clone(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return (double[]) dArr.clone();
    }

    public static boolean isEmpty(float[] fArr) {
        return getLength(fArr) == 0;
    }

    public static boolean isNotEmpty(short[] sArr) {
        return !isEmpty(sArr);
    }

    @Deprecated
    public static double[] removeAllOccurences(double[] dArr, double d14) {
        return (double[]) removeAll(dArr, indexesOf(dArr, d14));
    }

    public static double[] removeAllOccurrences(double[] dArr, double d14) {
        return (double[]) removeAll(dArr, indexesOf(dArr, d14));
    }

    public static float[] clone(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return (float[]) fArr.clone();
    }

    public static boolean isEmpty(int[] iArr) {
        return getLength(iArr) == 0;
    }

    public static <T> boolean isNotEmpty(T[] tArr) {
        return !isEmpty(tArr);
    }

    public static boolean isSameLength(byte[] bArr, byte[] bArr2) {
        return getLength(bArr) == getLength(bArr2);
    }

    @Deprecated
    public static float[] removeAllOccurences(float[] fArr, float f14) {
        return (float[]) removeAll(fArr, indexesOf(fArr, f14));
    }

    public static float[] removeAllOccurrences(float[] fArr, float f14) {
        return (float[]) removeAll(fArr, indexesOf(fArr, f14));
    }

    public static int[] clone(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static boolean contains(byte[] bArr, byte b14) {
        return indexOf(bArr, b14) != -1;
    }

    public static boolean isEmpty(long[] jArr) {
        return getLength(jArr) == 0;
    }

    public static boolean isSameLength(char[] cArr, char[] cArr2) {
        return getLength(cArr) == getLength(cArr2);
    }

    @Deprecated
    public static int[] removeAllOccurences(int[] iArr, int i14) {
        return (int[]) removeAll(iArr, indexesOf(iArr, i14));
    }

    public static int[] removeAllOccurrences(int[] iArr, int i14) {
        return (int[]) removeAll(iArr, indexesOf(iArr, i14));
    }

    public static long[] clone(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static boolean contains(char[] cArr, char c14) {
        return indexOf(cArr, c14) != -1;
    }

    public static boolean isEmpty(Object[] objArr) {
        return getLength(objArr) == 0;
    }

    public static boolean isSameLength(double[] dArr, double[] dArr2) {
        return getLength(dArr) == getLength(dArr2);
    }

    @Deprecated
    public static long[] removeAllOccurences(long[] jArr, long j8) {
        return (long[]) removeAll(jArr, indexesOf(jArr, j8));
    }

    public static long[] removeAllOccurrences(long[] jArr, long j8) {
        return (long[]) removeAll(jArr, indexesOf(jArr, j8));
    }

    public static short[] clone(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static boolean contains(double[] dArr, double d14) {
        return indexOf(dArr, d14) != -1;
    }

    public static boolean isEmpty(short[] sArr) {
        return getLength(sArr) == 0;
    }

    public static boolean isSameLength(float[] fArr, float[] fArr2) {
        return getLength(fArr) == getLength(fArr2);
    }

    @Deprecated
    public static short[] removeAllOccurences(short[] sArr, short s8) {
        return (short[]) removeAll(sArr, indexesOf(sArr, s8));
    }

    public static short[] removeAllOccurrences(short[] sArr, short s8) {
        return (short[]) removeAll(sArr, indexesOf(sArr, s8));
    }

    public static byte[] removeElement(byte[] bArr, byte b14) {
        int iIndexOf = indexOf(bArr, b14);
        if (iIndexOf == -1) {
            return clone(bArr);
        }
        return remove(bArr, iIndexOf);
    }

    public static void shuffle(boolean[] zArr) {
        shuffle(zArr, new Random());
    }

    public static byte[] addFirst(byte[] bArr, byte b14) {
        return bArr == null ? add(bArr, b14) : insert(0, bArr, b14);
    }

    public static <T> T[] clone(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    public static boolean contains(boolean[] zArr, boolean z14) {
        return indexOf(zArr, z14) != -1;
    }

    public static boolean isSameLength(int[] iArr, int[] iArr2) {
        return getLength(iArr) == getLength(iArr2);
    }

    @Deprecated
    public static <T> T[] removeAllOccurences(T[] tArr, T t7) {
        return (T[]) ((Object[]) removeAll(tArr, indexesOf(tArr, t7)));
    }

    public static <T> T[] removeAllOccurrences(T[] tArr, T t7) {
        return (T[]) ((Object[]) removeAll(tArr, indexesOf(tArr, t7)));
    }

    public static void shuffle(byte[] bArr) {
        shuffle(bArr, new Random());
    }

    public static char[] addFirst(char[] cArr, char c14) {
        return cArr == null ? add(cArr, c14) : insert(0, cArr, c14);
    }

    public static boolean contains(float[] fArr, float f14) {
        return indexOf(fArr, f14) != -1;
    }

    public static boolean isSameLength(long[] jArr, long[] jArr2) {
        return getLength(jArr) == getLength(jArr2);
    }

    public static void shuffle(byte[] bArr, Random random) {
        for (int length = bArr.length; length > 1; length--) {
            swap(bArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static String toString(Object obj) {
        return toString(obj, "{}");
    }

    public static double[] addFirst(double[] dArr, double d14) {
        return dArr == null ? add(dArr, d14) : insert(0, dArr, d14);
    }

    public static boolean contains(int[] iArr, int i14) {
        return indexOf(iArr, i14) != -1;
    }

    public static boolean isSameLength(Object obj, Object obj2) {
        return getLength(obj) == getLength(obj2);
    }

    public static char[] removeElement(char[] cArr, char c14) {
        int iIndexOf = indexOf(cArr, c14);
        if (iIndexOf == -1) {
            return clone(cArr);
        }
        return remove(cArr, iIndexOf);
    }

    public static float[] addFirst(float[] fArr, float f14) {
        return fArr == null ? add(fArr, f14) : insert(0, fArr, f14);
    }

    public static boolean contains(long[] jArr, long j8) {
        return indexOf(jArr, j8) != -1;
    }

    public static boolean isSameLength(Object[] objArr, Object[] objArr2) {
        return getLength(objArr) == getLength(objArr2);
    }

    public static void shuffle(char[] cArr) {
        shuffle(cArr, new Random());
    }

    public static int[] addFirst(int[] iArr, int i14) {
        return iArr == null ? add(iArr, i14) : insert(0, iArr, i14);
    }

    public static boolean contains(Object[] objArr, Object obj) {
        return indexOf(objArr, obj) != -1;
    }

    public static boolean isSameLength(short[] sArr, short[] sArr2) {
        return getLength(sArr) == getLength(sArr2);
    }

    public static void shuffle(char[] cArr, Random random) {
        for (int length = cArr.length; length > 1; length--) {
            swap(cArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static long[] addFirst(long[] jArr, long j8) {
        return jArr == null ? add(jArr, j8) : insert(0, jArr, j8);
    }

    public static boolean contains(short[] sArr, short s8) {
        return indexOf(sArr, s8) != -1;
    }

    public static double[] removeElement(double[] dArr, double d14) {
        int iIndexOf = indexOf(dArr, d14);
        if (iIndexOf == -1) {
            return clone(dArr);
        }
        return remove(dArr, iIndexOf);
    }

    public static short[] addFirst(short[] sArr, short s8) {
        return sArr == null ? add(sArr, s8) : insert(0, sArr, s8);
    }

    public static void shuffle(double[] dArr) {
        shuffle(dArr, new Random());
    }

    public static <T> T[] addFirst(T[] tArr, T t7) {
        return tArr == null ? (T[]) add(tArr, t7) : (T[]) insert(0, tArr, t7);
    }

    public static void shuffle(double[] dArr, Random random) {
        for (int length = dArr.length; length > 1; length--) {
            swap(dArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static BitSet indexesOf(boolean[] zArr, boolean z14) {
        return indexesOf(zArr, z14, 0);
    }

    public static float[] removeElement(float[] fArr, float f14) {
        int iIndexOf = indexOf(fArr, f14);
        if (iIndexOf == -1) {
            return clone(fArr);
        }
        return remove(fArr, iIndexOf);
    }

    public static BitSet indexesOf(byte[] bArr, byte b14) {
        return indexesOf(bArr, b14, 0);
    }

    public static Boolean[] nullToEmpty(Boolean[] boolArr) {
        return isEmpty(boolArr) ? EMPTY_BOOLEAN_OBJECT_ARRAY : boolArr;
    }

    public static void shuffle(float[] fArr) {
        shuffle(fArr, new Random());
    }

    public static BitSet indexesOf(byte[] bArr, byte b14, int i14) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (bArr != null) {
            while (i14 < bArr.length && (iIndexOf = indexOf(bArr, b14, i14)) != -1) {
                bitSet.set(iIndexOf);
                i14 = iIndexOf + 1;
            }
        }
        return bitSet;
    }

    public static void shuffle(float[] fArr, Random random) {
        for (int length = fArr.length; length > 1; length--) {
            swap(fArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static byte[] nullToEmpty(byte[] bArr) {
        return isEmpty(bArr) ? EMPTY_BYTE_ARRAY : bArr;
    }

    public static int[] removeElement(int[] iArr, int i14) {
        int iIndexOf = indexOf(iArr, i14);
        if (iIndexOf == -1) {
            return clone(iArr);
        }
        return remove(iArr, iIndexOf);
    }

    public static void shuffle(int[] iArr) {
        shuffle(iArr, new Random());
    }

    public static Byte[] nullToEmpty(Byte[] bArr) {
        return isEmpty(bArr) ? EMPTY_BYTE_OBJECT_ARRAY : bArr;
    }

    public static void reverse(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        reverse(zArr, 0, zArr.length);
    }

    public static void shuffle(int[] iArr, Random random) {
        for (int length = iArr.length; length > 1; length--) {
            swap(iArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static BitSet indexesOf(char[] cArr, char c14) {
        return indexesOf(cArr, c14, 0);
    }

    public static long[] removeElement(long[] jArr, long j8) {
        int iIndexOf = indexOf(jArr, j8);
        if (iIndexOf == -1) {
            return clone(jArr);
        }
        return remove(jArr, iIndexOf);
    }

    public static void reverse(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        reverse(bArr, 0, bArr.length);
    }

    public static Byte[] toObject(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return EMPTY_BYTE_OBJECT_ARRAY;
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArr2[i14] = Byte.valueOf(bArr[i14]);
        }
        return bArr2;
    }

    public static BitSet indexesOf(char[] cArr, char c14, int i14) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (cArr != null) {
            while (i14 < cArr.length && (iIndexOf = indexOf(cArr, c14, i14)) != -1) {
                bitSet.set(iIndexOf);
                i14 = iIndexOf + 1;
            }
        }
        return bitSet;
    }

    public static char[] nullToEmpty(char[] cArr) {
        return isEmpty(cArr) ? EMPTY_CHAR_ARRAY : cArr;
    }

    public static void reverse(byte[] bArr, int i14, int i15) {
        if (bArr == null) {
            return;
        }
        int iMin = Math.min(bArr.length, i15) - 1;
        for (int iMax = Math.max(i14, 0); iMin > iMax; iMax++) {
            byte b14 = bArr[iMin];
            bArr[iMin] = bArr[iMax];
            bArr[iMax] = b14;
            iMin--;
        }
    }

    public static void shuffle(long[] jArr) {
        shuffle(jArr, new Random());
    }

    public static String[] toStringArray(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return EMPTY_STRING_ARRAY;
        }
        String[] strArr = new String[objArr.length];
        for (int i14 = 0; i14 < objArr.length; i14++) {
            strArr[i14] = objArr[i14].toString();
        }
        return strArr;
    }

    public static void shuffle(long[] jArr, Random random) {
        for (int length = jArr.length; length > 1; length--) {
            swap(jArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Character[] nullToEmpty(Character[] chArr) {
        return isEmpty(chArr) ? EMPTY_CHARACTER_OBJECT_ARRAY : chArr;
    }

    public static short[] removeElement(short[] sArr, short s8) {
        int iIndexOf = indexOf(sArr, s8);
        if (iIndexOf == -1) {
            return clone(sArr);
        }
        return remove(sArr, iIndexOf);
    }

    public static void shuffle(Object[] objArr) {
        shuffle(objArr, new Random());
    }

    public static BitSet indexesOf(double[] dArr, double d14) {
        return indexesOf(dArr, d14, 0);
    }

    public static Class<?>[] nullToEmpty(Class<?>[] clsArr) {
        return isEmpty(clsArr) ? EMPTY_CLASS_ARRAY : clsArr;
    }

    public static void shuffle(Object[] objArr, Random random) {
        for (int length = objArr.length; length > 1; length--) {
            swap(objArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static Character[] toObject(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return EMPTY_CHARACTER_OBJECT_ARRAY;
        }
        Character[] chArr = new Character[cArr.length];
        for (int i14 = 0; i14 < cArr.length; i14++) {
            chArr[i14] = Character.valueOf(cArr[i14]);
        }
        return chArr;
    }

    public static int indexOf(boolean[] zArr, boolean z14, int i14) {
        if (isEmpty(zArr)) {
            return -1;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        while (i14 < zArr.length) {
            if (z14 == zArr[i14]) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static BitSet indexesOf(double[] dArr, double d14, double d15) {
        return indexesOf(dArr, d14, 0, d15);
    }

    public static boolean isSorted(byte[] bArr) {
        if (bArr != null && bArr.length >= 2) {
            byte b14 = bArr[0];
            int length = bArr.length;
            int i14 = 1;
            while (i14 < length) {
                byte b15 = bArr[i14];
                if (NumberUtils.compare(b14, b15) > 0) {
                    return false;
                }
                i14++;
                b14 = b15;
            }
        }
        return true;
    }

    public static <T> T[] removeElement(T[] tArr, Object obj) {
        int iIndexOf = indexOf(tArr, obj);
        if (iIndexOf == -1) {
            return (T[]) clone(tArr);
        }
        return (T[]) remove((Object[]) tArr, iIndexOf);
    }

    public static void reverse(char[] cArr) {
        if (cArr == null) {
            return;
        }
        reverse(cArr, 0, cArr.length);
    }

    public static BitSet indexesOf(double[] dArr, double d14, int i14) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (dArr != null) {
            while (i14 < dArr.length && (iIndexOf = indexOf(dArr, d14, i14)) != -1) {
                bitSet.set(iIndexOf);
                i14 = iIndexOf + 1;
            }
        }
        return bitSet;
    }

    public static double[] nullToEmpty(double[] dArr) {
        return isEmpty(dArr) ? EMPTY_DOUBLE_ARRAY : dArr;
    }

    public static void reverse(char[] cArr, int i14, int i15) {
        if (cArr == null) {
            return;
        }
        int iMin = Math.min(cArr.length, i15) - 1;
        for (int iMax = Math.max(i14, 0); iMin > iMax; iMax++) {
            char c14 = cArr[iMin];
            cArr[iMin] = cArr[iMax];
            cArr[iMax] = c14;
            iMin--;
        }
    }

    public static void shuffle(short[] sArr) {
        shuffle(sArr, new Random());
    }

    public static void shuffle(short[] sArr, Random random) {
        for (int length = sArr.length; length > 1; length--) {
            swap(sArr, length - 1, random.nextInt(length), 1);
        }
    }

    public static byte[] subarray(byte[] bArr, int i14, int i15) {
        if (bArr == null) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 > bArr.length) {
            i15 = bArr.length;
        }
        int i16 = i15 - i14;
        if (i16 <= 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = new byte[i16];
        System.arraycopy(bArr, i14, bArr2, 0, i16);
        return bArr2;
    }

    public static int indexOf(byte[] bArr, byte b14) {
        return indexOf(bArr, b14, 0);
    }

    public static Double[] nullToEmpty(Double[] dArr) {
        return isEmpty(dArr) ? EMPTY_DOUBLE_OBJECT_ARRAY : dArr;
    }

    public static int indexOf(byte[] bArr, byte b14, int i14) {
        if (bArr == null) {
            return -1;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        while (i14 < bArr.length) {
            if (b14 == bArr[i14]) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static Double[] toObject(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return EMPTY_DOUBLE_OBJECT_ARRAY;
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i14 = 0; i14 < dArr.length; i14++) {
            dArr2[i14] = Double.valueOf(dArr[i14]);
        }
        return dArr2;
    }

    public static BitSet indexesOf(double[] dArr, double d14, int i14, double d15) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (dArr != null) {
            while (i14 < dArr.length && (iIndexOf = indexOf(dArr, d14, i14, d15)) != -1) {
                bitSet.set(iIndexOf);
                i14 = iIndexOf + 1;
            }
        }
        return bitSet;
    }

    public static boolean isSorted(char[] cArr) {
        if (cArr != null && cArr.length >= 2) {
            char c14 = cArr[0];
            int length = cArr.length;
            int i14 = 1;
            while (i14 < length) {
                char c15 = cArr[i14];
                if (CharUtils.compare(c14, c15) > 0) {
                    return false;
                }
                i14++;
                c14 = c15;
            }
        }
        return true;
    }

    public static float[] nullToEmpty(float[] fArr) {
        return isEmpty(fArr) ? EMPTY_FLOAT_ARRAY : fArr;
    }

    public static int indexOf(char[] cArr, char c14) {
        return indexOf(cArr, c14, 0);
    }

    public static void reverse(double[] dArr) {
        if (dArr == null) {
            return;
        }
        reverse(dArr, 0, dArr.length);
    }

    public static int indexOf(char[] cArr, char c14, int i14) {
        if (cArr == null) {
            return -1;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        while (i14 < cArr.length) {
            if (c14 == cArr[i14]) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static Float[] nullToEmpty(Float[] fArr) {
        return isEmpty(fArr) ? EMPTY_FLOAT_OBJECT_ARRAY : fArr;
    }

    public static void reverse(double[] dArr, int i14, int i15) {
        if (dArr == null) {
            return;
        }
        int iMin = Math.min(dArr.length, i15) - 1;
        for (int iMax = Math.max(i14, 0); iMin > iMax; iMax++) {
            double d14 = dArr[iMin];
            dArr[iMin] = dArr[iMax];
            dArr[iMax] = d14;
            iMin--;
        }
    }

    public static char[] subarray(char[] cArr, int i14, int i15) {
        if (cArr == null) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 > cArr.length) {
            i15 = cArr.length;
        }
        int i16 = i15 - i14;
        if (i16 <= 0) {
            return EMPTY_CHAR_ARRAY;
        }
        char[] cArr2 = new char[i16];
        System.arraycopy(cArr, i14, cArr2, 0, i16);
        return cArr2;
    }

    public static int indexOf(double[] dArr, double d14) {
        return indexOf(dArr, d14, 0);
    }

    public static BitSet indexesOf(float[] fArr, float f14) {
        return indexesOf(fArr, f14, 0);
    }

    public static int[] nullToEmpty(int[] iArr) {
        return isEmpty(iArr) ? EMPTY_INT_ARRAY : iArr;
    }

    public static Float[] toObject(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return EMPTY_FLOAT_OBJECT_ARRAY;
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i14 = 0; i14 < fArr.length; i14++) {
            fArr2[i14] = Float.valueOf(fArr[i14]);
        }
        return fArr2;
    }

    public static int indexOf(double[] dArr, double d14, double d15) {
        return indexOf(dArr, d14, 0, d15);
    }

    public static BitSet indexesOf(float[] fArr, float f14, int i14) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (fArr != null) {
            while (i14 < fArr.length && (iIndexOf = indexOf(fArr, f14, i14)) != -1) {
                bitSet.set(iIndexOf);
                i14 = iIndexOf + 1;
            }
        }
        return bitSet;
    }

    public static boolean isSorted(double[] dArr) {
        if (dArr != null && dArr.length >= 2) {
            double d14 = dArr[0];
            int length = dArr.length;
            int i14 = 1;
            while (i14 < length) {
                double d15 = dArr[i14];
                if (Double.compare(d14, d15) > 0) {
                    return false;
                }
                i14++;
                d14 = d15;
            }
        }
        return true;
    }

    public static int indexOf(boolean[] zArr, boolean z14) {
        return indexOf(zArr, z14, 0);
    }

    public static Integer[] nullToEmpty(Integer[] numArr) {
        return isEmpty(numArr) ? EMPTY_INTEGER_OBJECT_ARRAY : numArr;
    }

    public static int indexOf(double[] dArr, double d14, int i14, double d15) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        double d16 = d14 - d15;
        double d17 = d14 + d15;
        while (i14 < dArr.length) {
            double d18 = dArr[i14];
            if (d18 >= d16 && d18 <= d17) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static byte[] remove(byte[] bArr, int i14) {
        return (byte[]) remove((Object) bArr, i14);
    }

    public static void reverse(float[] fArr) {
        if (fArr == null) {
            return;
        }
        reverse(fArr, 0, fArr.length);
    }

    public static double[] subarray(double[] dArr, int i14, int i15) {
        if (dArr == null) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 > dArr.length) {
            i15 = dArr.length;
        }
        int i16 = i15 - i14;
        if (i16 <= 0) {
            return EMPTY_DOUBLE_ARRAY;
        }
        double[] dArr2 = new double[i16];
        System.arraycopy(dArr, i14, dArr2, 0, i16);
        return dArr2;
    }

    public static long[] nullToEmpty(long[] jArr) {
        return isEmpty(jArr) ? EMPTY_LONG_ARRAY : jArr;
    }

    public static char[] remove(char[] cArr, int i14) {
        return (char[]) remove((Object) cArr, i14);
    }

    public static void reverse(float[] fArr, int i14, int i15) {
        if (fArr == null) {
            return;
        }
        int iMin = Math.min(fArr.length, i15) - 1;
        for (int iMax = Math.max(i14, 0); iMin > iMax; iMax++) {
            float f14 = fArr[iMin];
            fArr[iMin] = fArr[iMax];
            fArr[iMax] = f14;
            iMin--;
        }
    }

    public static BitSet indexesOf(int[] iArr, int i14) {
        return indexesOf(iArr, i14, 0);
    }

    public static double[] remove(double[] dArr, int i14) {
        return (double[]) remove((Object) dArr, i14);
    }

    public static Integer[] toObject(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return EMPTY_INTEGER_OBJECT_ARRAY;
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            numArr[i14] = Integer.valueOf(iArr[i14]);
        }
        return numArr;
    }

    public static int indexOf(float[] fArr, float f14) {
        return indexOf(fArr, f14, 0);
    }

    public static BitSet indexesOf(int[] iArr, int i14, int i15) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (iArr != null) {
            while (i15 < iArr.length && (iIndexOf = indexOf(iArr, i14, i15)) != -1) {
                bitSet.set(iIndexOf);
                i15 = iIndexOf + 1;
            }
        }
        return bitSet;
    }

    public static boolean isSorted(float[] fArr) {
        if (fArr != null && fArr.length >= 2) {
            float f14 = fArr[0];
            int length = fArr.length;
            int i14 = 1;
            while (i14 < length) {
                float f15 = fArr[i14];
                if (Float.compare(f14, f15) > 0) {
                    return false;
                }
                i14++;
                f14 = f15;
            }
        }
        return true;
    }

    public static Long[] nullToEmpty(Long[] lArr) {
        return isEmpty(lArr) ? EMPTY_LONG_OBJECT_ARRAY : lArr;
    }

    public static float[] remove(float[] fArr, int i14) {
        return (float[]) remove((Object) fArr, i14);
    }

    public static void swap(boolean[] zArr, int i14, int i15, int i16) {
        if (isEmpty(zArr) || i14 >= zArr.length || i15 >= zArr.length) {
            return;
        }
        int i17 = 0;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        int iMin = Math.min(Math.min(i16, zArr.length - i14), zArr.length - i15);
        while (i17 < iMin) {
            boolean z14 = zArr[i14];
            zArr[i14] = zArr[i15];
            zArr[i15] = z14;
            i17++;
            i14++;
            i15++;
        }
    }

    public static int indexOf(float[] fArr, float f14, int i14) {
        if (isEmpty(fArr)) {
            return -1;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        boolean zIsNaN = Float.isNaN(f14);
        while (i14 < fArr.length) {
            float f15 = fArr[i14];
            if (f14 == f15 || (zIsNaN && Float.isNaN(f15))) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static int lastIndexOf(boolean[] zArr, boolean z14, int i14) {
        if (isEmpty(zArr) || i14 < 0) {
            return -1;
        }
        if (i14 >= zArr.length) {
            i14 = zArr.length - 1;
        }
        while (i14 >= 0) {
            if (z14 == zArr[i14]) {
                return i14;
            }
            i14--;
        }
        return -1;
    }

    public static int[] remove(int[] iArr, int i14) {
        return (int[]) remove((Object) iArr, i14);
    }

    public static Object[] nullToEmpty(Object[] objArr) {
        return isEmpty(objArr) ? EMPTY_OBJECT_ARRAY : objArr;
    }

    public static long[] remove(long[] jArr, int i14) {
        return (long[]) remove((Object) jArr, i14);
    }

    public static float[] subarray(float[] fArr, int i14, int i15) {
        if (fArr == null) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 > fArr.length) {
            i15 = fArr.length;
        }
        int i16 = i15 - i14;
        if (i16 <= 0) {
            return EMPTY_FLOAT_ARRAY;
        }
        float[] fArr2 = new float[i16];
        System.arraycopy(fArr, i14, fArr2, 0, i16);
        return fArr2;
    }

    public static boolean[] remove(boolean[] zArr, int i14) {
        return (boolean[]) remove((Object) zArr, i14);
    }

    public static void reverse(int[] iArr) {
        if (iArr == null) {
            return;
        }
        reverse(iArr, 0, iArr.length);
    }

    public static BitSet indexesOf(long[] jArr, long j8) {
        return indexesOf(jArr, j8, 0);
    }

    public static short[] nullToEmpty(short[] sArr) {
        return isEmpty(sArr) ? EMPTY_SHORT_ARRAY : sArr;
    }

    public static short[] remove(short[] sArr, int i14) {
        return (short[]) remove((Object) sArr, i14);
    }

    public static void reverse(int[] iArr, int i14, int i15) {
        if (iArr == null) {
            return;
        }
        int iMin = Math.min(iArr.length, i15) - 1;
        for (int iMax = Math.max(i14, 0); iMin > iMax; iMax++) {
            int i16 = iArr[iMin];
            iArr[iMin] = iArr[iMax];
            iArr[iMax] = i16;
            iMin--;
        }
    }

    public static Long[] toObject(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return EMPTY_LONG_OBJECT_ARRAY;
        }
        Long[] lArr = new Long[jArr.length];
        for (int i14 = 0; i14 < jArr.length; i14++) {
            lArr[i14] = Long.valueOf(jArr[i14]);
        }
        return lArr;
    }

    public static BitSet indexesOf(long[] jArr, long j8, int i14) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (jArr != null) {
            while (i14 < jArr.length && (iIndexOf = indexOf(jArr, j8, i14)) != -1) {
                bitSet.set(iIndexOf);
                i14 = iIndexOf + 1;
            }
        }
        return bitSet;
    }

    public static boolean isSorted(int[] iArr) {
        if (iArr != null && iArr.length >= 2) {
            int i14 = iArr[0];
            int length = iArr.length;
            int i15 = 1;
            while (i15 < length) {
                int i16 = iArr[i15];
                if (NumberUtils.compare(i14, i16) > 0) {
                    return false;
                }
                i15++;
                i14 = i16;
            }
        }
        return true;
    }

    public static int lastIndexOf(byte[] bArr, byte b14) {
        return lastIndexOf(bArr, b14, Integer.MAX_VALUE);
    }

    public static <T> T[] remove(T[] tArr, int i14) {
        return (T[]) ((Object[]) remove((Object) tArr, i14));
    }

    public static void swap(byte[] bArr, int i14, int i15) {
        if (isEmpty(bArr)) {
            return;
        }
        swap(bArr, i14, i15, 1);
    }

    public static int indexOf(int[] iArr, int i14) {
        return indexOf(iArr, i14, 0);
    }

    public static int lastIndexOf(byte[] bArr, byte b14, int i14) {
        if (bArr == null || i14 < 0) {
            return -1;
        }
        if (i14 >= bArr.length) {
            i14 = bArr.length - 1;
        }
        while (i14 >= 0) {
            if (b14 == bArr[i14]) {
                return i14;
            }
            i14--;
        }
        return -1;
    }

    public static Short[] nullToEmpty(Short[] shArr) {
        return isEmpty(shArr) ? EMPTY_SHORT_OBJECT_ARRAY : shArr;
    }

    public static int indexOf(int[] iArr, int i14, int i15) {
        if (iArr == null) {
            return -1;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        while (i15 < iArr.length) {
            if (i14 == iArr[i15]) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    public static void shift(boolean[] zArr, int i14) {
        if (zArr == null) {
            return;
        }
        shift(zArr, 0, zArr.length, i14);
    }

    public static int[] subarray(int[] iArr, int i14, int i15) {
        if (iArr == null) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 > iArr.length) {
            i15 = iArr.length;
        }
        int i16 = i15 - i14;
        if (i16 <= 0) {
            return EMPTY_INT_ARRAY;
        }
        int[] iArr2 = new int[i16];
        System.arraycopy(iArr, i14, iArr2, 0, i16);
        return iArr2;
    }

    public static void swap(byte[] bArr, int i14, int i15, int i16) {
        if (isEmpty(bArr) || i14 >= bArr.length || i15 >= bArr.length) {
            return;
        }
        int i17 = 0;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        int iMin = Math.min(Math.min(i16, bArr.length - i14), bArr.length - i15);
        while (i17 < iMin) {
            byte b14 = bArr[i14];
            bArr[i14] = bArr[i15];
            bArr[i15] = b14;
            i17++;
            i14++;
            i15++;
        }
    }

    public static String[] nullToEmpty(String[] strArr) {
        return isEmpty(strArr) ? EMPTY_STRING_ARRAY : strArr;
    }

    public static void shift(byte[] bArr, int i14) {
        if (bArr == null) {
            return;
        }
        shift(bArr, 0, bArr.length, i14);
    }

    public static int indexOf(long[] jArr, long j8) {
        return indexOf(jArr, j8, 0);
    }

    public static BitSet indexesOf(Object[] objArr, Object obj) {
        return indexesOf(objArr, obj, 0);
    }

    public static int lastIndexOf(char[] cArr, char c14) {
        return lastIndexOf(cArr, c14, Integer.MAX_VALUE);
    }

    public static void reverse(long[] jArr) {
        if (jArr == null) {
            return;
        }
        reverse(jArr, 0, jArr.length);
    }

    public static void shift(byte[] bArr, int i14, int i15, int i16) {
        if (bArr != null && i14 < bArr.length - 1 && i15 > 0) {
            if (i14 < 0) {
                i14 = 0;
            }
            if (i15 >= bArr.length) {
                i15 = bArr.length;
            }
            int i17 = i15 - i14;
            if (i17 <= 1) {
                return;
            }
            int i18 = i16 % i17;
            if (i18 < 0) {
                i18 += i17;
            }
            while (i17 > 1 && i18 > 0) {
                int i19 = i17 - i18;
                if (i18 > i19) {
                    swap(bArr, i14, (i17 + i14) - i19, i19);
                    int i24 = i18;
                    i18 -= i19;
                    i17 = i24;
                } else if (i18 < i19) {
                    swap(bArr, i14, i14 + i19, i18);
                    i14 += i18;
                    i17 = i19;
                } else {
                    swap(bArr, i14, i19 + i14, i18);
                    return;
                }
            }
        }
    }

    public static Short[] toObject(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return EMPTY_SHORT_OBJECT_ARRAY;
        }
        Short[] shArr = new Short[sArr.length];
        for (int i14 = 0; i14 < sArr.length; i14++) {
            shArr[i14] = Short.valueOf(sArr[i14]);
        }
        return shArr;
    }

    public static int indexOf(long[] jArr, long j8, int i14) {
        if (jArr == null) {
            return -1;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        while (i14 < jArr.length) {
            if (j8 == jArr[i14]) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static BitSet indexesOf(Object[] objArr, Object obj, int i14) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (objArr != null) {
            while (i14 < objArr.length && (iIndexOf = indexOf(objArr, obj, i14)) != -1) {
                bitSet.set(iIndexOf);
                i14 = iIndexOf + 1;
            }
        }
        return bitSet;
    }

    public static boolean isSorted(long[] jArr) {
        if (jArr != null && jArr.length >= 2) {
            long j8 = jArr[0];
            int length = jArr.length;
            int i14 = 1;
            while (i14 < length) {
                long j14 = jArr[i14];
                if (NumberUtils.compare(j8, j14) > 0) {
                    return false;
                }
                i14++;
                j8 = j14;
            }
        }
        return true;
    }

    public static int lastIndexOf(char[] cArr, char c14, int i14) {
        if (cArr == null || i14 < 0) {
            return -1;
        }
        if (i14 >= cArr.length) {
            i14 = cArr.length - 1;
        }
        while (i14 >= 0) {
            if (c14 == cArr[i14]) {
                return i14;
            }
            i14--;
        }
        return -1;
    }

    public static boolean[] nullToEmpty(boolean[] zArr) {
        return isEmpty(zArr) ? EMPTY_BOOLEAN_ARRAY : zArr;
    }

    public static void reverse(long[] jArr, int i14, int i15) {
        if (jArr == null) {
            return;
        }
        int iMin = Math.min(jArr.length, i15) - 1;
        for (int iMax = Math.max(i14, 0); iMin > iMax; iMax++) {
            long j8 = jArr[iMin];
            jArr[iMin] = jArr[iMax];
            jArr[iMax] = j8;
            iMin--;
        }
    }

    public static int indexOf(Object[] objArr, Object obj) {
        return indexOf(objArr, obj, 0);
    }

    public static long[] subarray(long[] jArr, int i14, int i15) {
        if (jArr == null) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 > jArr.length) {
            i15 = jArr.length;
        }
        int i16 = i15 - i14;
        if (i16 <= 0) {
            return EMPTY_LONG_ARRAY;
        }
        long[] jArr2 = new long[i16];
        System.arraycopy(jArr, i14, jArr2, 0, i16);
        return jArr2;
    }

    public static void swap(char[] cArr, int i14, int i15) {
        if (isEmpty(cArr)) {
            return;
        }
        swap(cArr, i14, i15, 1);
    }

    public static int indexOf(Object[] objArr, Object obj, int i14) {
        if (objArr == null) {
            return -1;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (obj == null) {
            while (i14 < objArr.length) {
                if (objArr[i14] == null) {
                    return i14;
                }
                i14++;
            }
        } else {
            while (i14 < objArr.length) {
                if (obj.equals(objArr[i14])) {
                    return i14;
                }
                i14++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(double[] dArr, double d14) {
        return lastIndexOf(dArr, d14, Integer.MAX_VALUE);
    }

    @Deprecated
    public static boolean[] add(boolean[] zArr, int i14, boolean z14) {
        return (boolean[]) add(zArr, i14, Boolean.valueOf(z14), Boolean.TYPE);
    }

    public static BitSet indexesOf(short[] sArr, short s8) {
        return indexesOf(sArr, s8, 0);
    }

    public static int lastIndexOf(double[] dArr, double d14, double d15) {
        return lastIndexOf(dArr, d14, Integer.MAX_VALUE, d15);
    }

    public static void swap(char[] cArr, int i14, int i15, int i16) {
        if (isEmpty(cArr) || i14 >= cArr.length || i15 >= cArr.length) {
            return;
        }
        int i17 = 0;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        int iMin = Math.min(Math.min(i16, cArr.length - i14), cArr.length - i15);
        while (i17 < iMin) {
            char c14 = cArr[i14];
            cArr[i14] = cArr[i15];
            cArr[i15] = c14;
            i17++;
            i14++;
            i15++;
        }
    }

    public static byte[] add(byte[] bArr, byte b14) {
        byte[] bArr2 = (byte[]) copyArrayGrow1(bArr, Byte.TYPE);
        bArr2[bArr2.length - 1] = b14;
        return bArr2;
    }

    public static BitSet indexesOf(short[] sArr, short s8, int i14) {
        int iIndexOf;
        BitSet bitSet = new BitSet();
        if (sArr != null) {
            while (i14 < sArr.length && (iIndexOf = indexOf(sArr, s8, i14)) != -1) {
                bitSet.set(iIndexOf);
                i14 = iIndexOf + 1;
            }
        }
        return bitSet;
    }

    public static boolean isSorted(short[] sArr) {
        if (sArr != null && sArr.length >= 2) {
            short s8 = sArr[0];
            int length = sArr.length;
            int i14 = 1;
            while (i14 < length) {
                short s14 = sArr[i14];
                if (NumberUtils.compare(s8, s14) > 0) {
                    return false;
                }
                i14++;
                s8 = s14;
            }
        }
        return true;
    }

    public static int lastIndexOf(double[] dArr, double d14, int i14) {
        if (isEmpty(dArr) || i14 < 0) {
            return -1;
        }
        if (i14 >= dArr.length) {
            i14 = dArr.length - 1;
        }
        while (i14 >= 0) {
            if (d14 == dArr[i14]) {
                return i14;
            }
            i14--;
        }
        return -1;
    }

    public static void reverse(Object[] objArr) {
        if (objArr == null) {
            return;
        }
        reverse(objArr, 0, objArr.length);
    }

    public static void reverse(Object[] objArr, int i14, int i15) {
        if (objArr == null) {
            return;
        }
        int iMin = Math.min(objArr.length, i15) - 1;
        for (int iMax = Math.max(i14, 0); iMin > iMax; iMax++) {
            Object obj = objArr[iMin];
            objArr[iMin] = objArr[iMax];
            objArr[iMax] = obj;
            iMin--;
        }
    }

    public static void shift(char[] cArr, int i14) {
        if (cArr == null) {
            return;
        }
        shift(cArr, 0, cArr.length, i14);
    }

    @Deprecated
    public static byte[] add(byte[] bArr, int i14, byte b14) {
        return (byte[]) add(bArr, i14, Byte.valueOf(b14), Byte.TYPE);
    }

    public static int indexOf(short[] sArr, short s8) {
        return indexOf(sArr, s8, 0);
    }

    public static void shift(char[] cArr, int i14, int i15, int i16) {
        if (cArr != null && i14 < cArr.length - 1 && i15 > 0) {
            if (i14 < 0) {
                i14 = 0;
            }
            if (i15 >= cArr.length) {
                i15 = cArr.length;
            }
            int i17 = i15 - i14;
            if (i17 <= 1) {
                return;
            }
            int i18 = i16 % i17;
            if (i18 < 0) {
                i18 += i17;
            }
            while (i17 > 1 && i18 > 0) {
                int i19 = i17 - i18;
                if (i18 > i19) {
                    swap(cArr, i14, (i17 + i14) - i19, i19);
                    int i24 = i18;
                    i18 -= i19;
                    i17 = i24;
                } else if (i18 < i19) {
                    swap(cArr, i14, i14 + i19, i18);
                    i14 += i18;
                    i17 = i19;
                } else {
                    swap(cArr, i14, i19 + i14, i18);
                    return;
                }
            }
        }
    }

    public static short[] subarray(short[] sArr, int i14, int i15) {
        if (sArr == null) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 > sArr.length) {
            i15 = sArr.length;
        }
        int i16 = i15 - i14;
        if (i16 <= 0) {
            return EMPTY_SHORT_ARRAY;
        }
        short[] sArr2 = new short[i16];
        System.arraycopy(sArr, i14, sArr2, 0, i16);
        return sArr2;
    }

    public static char[] add(char[] cArr, char c14) {
        char[] cArr2 = (char[]) copyArrayGrow1(cArr, Character.TYPE);
        cArr2[cArr2.length - 1] = c14;
        return cArr2;
    }

    public static int indexOf(short[] sArr, short s8, int i14) {
        if (sArr == null) {
            return -1;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        while (i14 < sArr.length) {
            if (s8 == sArr[i14]) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static byte[] insert(int i14, byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return null;
        }
        if (isEmpty(bArr2)) {
            return clone(bArr);
        }
        if (i14 >= 0 && i14 <= bArr.length) {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, i14, bArr2.length);
            if (i14 > 0) {
                System.arraycopy(bArr, 0, bArr3, 0, i14);
            }
            if (i14 < bArr.length) {
                System.arraycopy(bArr, i14, bArr3, bArr2.length + i14, bArr.length - i14);
            }
            return bArr3;
        }
        l2.j(bArr.length, i.i(i14, "Index: ", ", Length: "));
        return null;
    }

    public static int lastIndexOf(double[] dArr, double d14, int i14, double d15) {
        if (isEmpty(dArr) || i14 < 0) {
            return -1;
        }
        if (i14 >= dArr.length) {
            i14 = dArr.length - 1;
        }
        double d16 = d14 - d15;
        double d17 = d14 + d15;
        while (i14 >= 0) {
            double d18 = dArr[i14];
            if (d18 >= d16 && d18 <= d17) {
                return i14;
            }
            i14--;
        }
        return -1;
    }

    public static void swap(double[] dArr, int i14, int i15) {
        if (isEmpty(dArr)) {
            return;
        }
        swap(dArr, i14, i15, 1);
    }

    @Deprecated
    public static char[] add(char[] cArr, int i14, char c14) {
        return (char[]) add(cArr, i14, Character.valueOf(c14), Character.TYPE);
    }

    public static <T extends Comparable<? super T>> boolean isSorted(T[] tArr) {
        return isSorted(tArr, new androidx.browser.trusted.c(25));
    }

    public static double[] add(double[] dArr, double d14) {
        double[] dArr2 = (double[]) copyArrayGrow1(dArr, Double.TYPE);
        dArr2[dArr2.length - 1] = d14;
        return dArr2;
    }

    public static boolean isSorted(boolean[] zArr) {
        if (zArr != null && zArr.length >= 2) {
            boolean z14 = zArr[0];
            int length = zArr.length;
            int i14 = 1;
            while (i14 < length) {
                boolean z15 = zArr[i14];
                if (BooleanUtils.compare(z14, z15) > 0) {
                    return false;
                }
                i14++;
                z14 = z15;
            }
        }
        return true;
    }

    public static void reverse(short[] sArr) {
        if (sArr == null) {
            return;
        }
        reverse(sArr, 0, sArr.length);
    }

    public static void swap(double[] dArr, int i14, int i15, int i16) {
        if (isEmpty(dArr) || i14 >= dArr.length || i15 >= dArr.length) {
            return;
        }
        int i17 = 0;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        int iMin = Math.min(Math.min(i16, dArr.length - i14), dArr.length - i15);
        while (i17 < iMin) {
            double d14 = dArr[i14];
            dArr[i14] = dArr[i15];
            dArr[i15] = d14;
            i17++;
            i14++;
            i15++;
        }
    }

    public static void reverse(short[] sArr, int i14, int i15) {
        if (sArr == null) {
            return;
        }
        int iMin = Math.min(sArr.length, i15) - 1;
        for (int iMax = Math.max(i14, 0); iMin > iMax; iMax++) {
            short s8 = sArr[iMin];
            sArr[iMin] = sArr[iMax];
            sArr[iMax] = s8;
            iMin--;
        }
    }

    public static boolean[] subarray(boolean[] zArr, int i14, int i15) {
        if (zArr == null) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 > zArr.length) {
            i15 = zArr.length;
        }
        int i16 = i15 - i14;
        if (i16 <= 0) {
            return EMPTY_BOOLEAN_ARRAY;
        }
        boolean[] zArr2 = new boolean[i16];
        System.arraycopy(zArr, i14, zArr2, 0, i16);
        return zArr2;
    }

    @Deprecated
    public static double[] add(double[] dArr, int i14, double d14) {
        return (double[]) add(dArr, i14, Double.valueOf(d14), Double.TYPE);
    }

    public static int lastIndexOf(float[] fArr, float f14) {
        return lastIndexOf(fArr, f14, Integer.MAX_VALUE);
    }

    public static float[] add(float[] fArr, float f14) {
        float[] fArr2 = (float[]) copyArrayGrow1(fArr, Float.TYPE);
        fArr2[fArr2.length - 1] = f14;
        return fArr2;
    }

    public static int lastIndexOf(float[] fArr, float f14, int i14) {
        if (isEmpty(fArr) || i14 < 0) {
            return -1;
        }
        if (i14 >= fArr.length) {
            i14 = fArr.length - 1;
        }
        while (i14 >= 0) {
            if (f14 == fArr[i14]) {
                return i14;
            }
            i14--;
        }
        return -1;
    }

    public static void shift(double[] dArr, int i14) {
        if (dArr == null) {
            return;
        }
        shift(dArr, 0, dArr.length, i14);
    }

    public static void shift(double[] dArr, int i14, int i15, int i16) {
        if (dArr != null && i14 < dArr.length - 1 && i15 > 0) {
            if (i14 < 0) {
                i14 = 0;
            }
            if (i15 >= dArr.length) {
                i15 = dArr.length;
            }
            int i17 = i15 - i14;
            if (i17 <= 1) {
                return;
            }
            int i18 = i16 % i17;
            if (i18 < 0) {
                i18 += i17;
            }
            while (i17 > 1 && i18 > 0) {
                int i19 = i17 - i18;
                if (i18 > i19) {
                    swap(dArr, i14, (i17 + i14) - i19, i19);
                    int i24 = i18;
                    i18 -= i19;
                    i17 = i24;
                } else if (i18 < i19) {
                    swap(dArr, i14, i14 + i19, i18);
                    i14 += i18;
                    i17 = i19;
                } else {
                    swap(dArr, i14, i19 + i14, i18);
                    return;
                }
            }
        }
    }

    @Deprecated
    public static float[] add(float[] fArr, int i14, float f14) {
        return (float[]) add(fArr, i14, Float.valueOf(f14), Float.TYPE);
    }

    public static void swap(float[] fArr, int i14, int i15) {
        if (isEmpty(fArr)) {
            return;
        }
        swap(fArr, i14, i15, 1);
    }

    public static int[] add(int[] iArr, int i14) {
        int[] iArr2 = (int[]) copyArrayGrow1(iArr, Integer.TYPE);
        iArr2[iArr2.length - 1] = i14;
        return iArr2;
    }

    public static int lastIndexOf(int[] iArr, int i14) {
        return lastIndexOf(iArr, i14, Integer.MAX_VALUE);
    }

    public static void swap(float[] fArr, int i14, int i15, int i16) {
        if (isEmpty(fArr) || i14 >= fArr.length || i15 >= fArr.length) {
            return;
        }
        int i17 = 0;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        int iMin = Math.min(Math.min(i16, fArr.length - i14), fArr.length - i15);
        while (i17 < iMin) {
            float f14 = fArr[i14];
            fArr[i14] = fArr[i15];
            fArr[i15] = f14;
            i17++;
            i14++;
            i15++;
        }
    }

    @Deprecated
    public static int[] add(int[] iArr, int i14, int i15) {
        return (int[]) add(iArr, i14, Integer.valueOf(i15), Integer.TYPE);
    }

    public static int lastIndexOf(int[] iArr, int i14, int i15) {
        if (iArr == null || i15 < 0) {
            return -1;
        }
        if (i15 >= iArr.length) {
            i15 = iArr.length - 1;
        }
        while (i15 >= 0) {
            if (i14 == iArr[i15]) {
                return i15;
            }
            i15--;
        }
        return -1;
    }

    @Deprecated
    public static long[] add(long[] jArr, int i14, long j8) {
        return (long[]) add(jArr, i14, Long.valueOf(j8), Long.TYPE);
    }

    public static char[] insert(int i14, char[] cArr, char... cArr2) {
        if (cArr == null) {
            return null;
        }
        if (isEmpty(cArr2)) {
            return clone(cArr);
        }
        if (i14 >= 0 && i14 <= cArr.length) {
            char[] cArr3 = new char[cArr.length + cArr2.length];
            System.arraycopy(cArr2, 0, cArr3, i14, cArr2.length);
            if (i14 > 0) {
                System.arraycopy(cArr, 0, cArr3, 0, i14);
            }
            if (i14 < cArr.length) {
                System.arraycopy(cArr, i14, cArr3, cArr2.length + i14, cArr.length - i14);
            }
            return cArr3;
        }
        l2.j(cArr.length, i.i(i14, "Index: ", ", Length: "));
        return null;
    }

    public static long[] add(long[] jArr, long j8) {
        long[] jArr2 = (long[]) copyArrayGrow1(jArr, Long.TYPE);
        jArr2[jArr2.length - 1] = j8;
        return jArr2;
    }

    public static int lastIndexOf(long[] jArr, long j8) {
        return lastIndexOf(jArr, j8, Integer.MAX_VALUE);
    }

    public static void shift(float[] fArr, int i14) {
        if (fArr == null) {
            return;
        }
        shift(fArr, 0, fArr.length, i14);
    }

    public static boolean[] add(boolean[] zArr, boolean z14) {
        boolean[] zArr2 = (boolean[]) copyArrayGrow1(zArr, Boolean.TYPE);
        zArr2[zArr2.length - 1] = z14;
        return zArr2;
    }

    public static int lastIndexOf(long[] jArr, long j8, int i14) {
        if (jArr == null || i14 < 0) {
            return -1;
        }
        if (i14 >= jArr.length) {
            i14 = jArr.length - 1;
        }
        while (i14 >= 0) {
            if (j8 == jArr[i14]) {
                return i14;
            }
            i14--;
        }
        return -1;
    }

    public static void shift(float[] fArr, int i14, int i15, int i16) {
        if (fArr != null && i14 < fArr.length - 1 && i15 > 0) {
            if (i14 < 0) {
                i14 = 0;
            }
            if (i15 >= fArr.length) {
                i15 = fArr.length;
            }
            int i17 = i15 - i14;
            if (i17 <= 1) {
                return;
            }
            int i18 = i16 % i17;
            if (i18 < 0) {
                i18 += i17;
            }
            while (i17 > 1 && i18 > 0) {
                int i19 = i17 - i18;
                if (i18 > i19) {
                    swap(fArr, i14, (i17 + i14) - i19, i19);
                    int i24 = i18;
                    i18 -= i19;
                    i17 = i24;
                } else if (i18 < i19) {
                    swap(fArr, i14, i14 + i19, i18);
                    i14 += i18;
                    i17 = i19;
                } else {
                    swap(fArr, i14, i19 + i14, i18);
                    return;
                }
            }
        }
    }

    public static void swap(int[] iArr, int i14, int i15) {
        if (isEmpty(iArr)) {
            return;
        }
        swap(iArr, i14, i15, 1);
    }

    @Deprecated
    public static short[] add(short[] sArr, int i14, short s8) {
        return (short[]) add(sArr, i14, Short.valueOf(s8), Short.TYPE);
    }

    public static void swap(int[] iArr, int i14, int i15, int i16) {
        if (isEmpty(iArr) || i14 >= iArr.length || i15 >= iArr.length) {
            return;
        }
        int i17 = 0;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        int iMin = Math.min(Math.min(i16, iArr.length - i14), iArr.length - i15);
        while (i17 < iMin) {
            int i18 = iArr[i14];
            iArr[i14] = iArr[i15];
            iArr[i15] = i18;
            i17++;
            i14++;
            i15++;
        }
    }

    public static short[] add(short[] sArr, short s8) {
        short[] sArr2 = (short[]) copyArrayGrow1(sArr, Short.TYPE);
        sArr2[sArr2.length - 1] = s8;
        return sArr2;
    }

    public static int lastIndexOf(Object[] objArr, Object obj) {
        return lastIndexOf(objArr, obj, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(boolean[] zArr, boolean z14) {
        return lastIndexOf(zArr, z14, Integer.MAX_VALUE);
    }

    @Deprecated
    public static <T> T[] add(T[] tArr, int i14, T t7) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else if (t7 != null) {
            componentType = t7.getClass();
        } else {
            h.s("Array and element cannot both be null");
            return null;
        }
        return (T[]) ((Object[]) add(tArr, i14, t7, componentType));
    }

    public static int lastIndexOf(short[] sArr, short s8) {
        return lastIndexOf(sArr, s8, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(short[] sArr, short s8, int i14) {
        if (sArr == null || i14 < 0) {
            return -1;
        }
        if (i14 >= sArr.length) {
            i14 = sArr.length - 1;
        }
        while (i14 >= 0) {
            if (s8 == sArr[i14]) {
                return i14;
            }
            i14--;
        }
        return -1;
    }

    public static void shift(int[] iArr, int i14) {
        if (iArr == null) {
            return;
        }
        shift(iArr, 0, iArr.length, i14);
    }

    public static void swap(long[] jArr, int i14, int i15) {
        if (isEmpty(jArr)) {
            return;
        }
        swap(jArr, i14, i15, 1);
    }

    public static byte[] addAll(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return clone(bArr2);
        }
        if (bArr2 == null) {
            return clone(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static double[] insert(int i14, double[] dArr, double... dArr2) {
        if (dArr == null) {
            return null;
        }
        if (isEmpty(dArr2)) {
            return clone(dArr);
        }
        if (i14 >= 0 && i14 <= dArr.length) {
            double[] dArr3 = new double[dArr.length + dArr2.length];
            System.arraycopy(dArr2, 0, dArr3, i14, dArr2.length);
            if (i14 > 0) {
                System.arraycopy(dArr, 0, dArr3, 0, i14);
            }
            if (i14 < dArr.length) {
                System.arraycopy(dArr, i14, dArr3, dArr2.length + i14, dArr.length - i14);
            }
            return dArr3;
        }
        l2.j(dArr.length, i.i(i14, "Index: ", ", Length: "));
        return null;
    }

    public static void shift(int[] iArr, int i14, int i15, int i16) {
        if (iArr != null && i14 < iArr.length - 1 && i15 > 0) {
            if (i14 < 0) {
                i14 = 0;
            }
            if (i15 >= iArr.length) {
                i15 = iArr.length;
            }
            int i17 = i15 - i14;
            if (i17 <= 1) {
                return;
            }
            int i18 = i16 % i17;
            if (i18 < 0) {
                i18 += i17;
            }
            while (i17 > 1 && i18 > 0) {
                int i19 = i17 - i18;
                if (i18 > i19) {
                    swap(iArr, i14, (i17 + i14) - i19, i19);
                    int i24 = i18;
                    i18 -= i19;
                    i17 = i24;
                } else if (i18 < i19) {
                    swap(iArr, i14, i14 + i19, i18);
                    i14 += i18;
                    i17 = i19;
                } else {
                    swap(iArr, i14, i19 + i14, i18);
                    return;
                }
            }
        }
    }

    public static <T> T[] add(T[] tArr, T t7) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else if (t7 != null) {
            componentType = t7.getClass();
        } else {
            h.s("Arguments cannot both be null");
            return null;
        }
        T[] tArr2 = (T[]) ((Object[]) copyArrayGrow1(tArr, componentType));
        tArr2[tArr2.length - 1] = t7;
        return tArr2;
    }

    public static void swap(long[] jArr, int i14, int i15, int i16) {
        if (isEmpty(jArr) || i14 >= jArr.length || i15 >= jArr.length) {
            return;
        }
        int i17 = 0;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        int iMin = Math.min(Math.min(i16, jArr.length - i14), jArr.length - i15);
        while (i17 < iMin) {
            long j8 = jArr[i14];
            jArr[i14] = jArr[i15];
            jArr[i15] = j8;
            i17++;
            i14++;
            i15++;
        }
    }

    public static byte[] removeAll(byte[] bArr, int... iArr) {
        return (byte[]) removeAll((Object) bArr, iArr);
    }

    public static char[] removeAll(char[] cArr, int... iArr) {
        return (char[]) removeAll((Object) cArr, iArr);
    }

    public static char[] addAll(char[] cArr, char... cArr2) {
        if (cArr == null) {
            return clone(cArr2);
        }
        if (cArr2 == null) {
            return clone(cArr);
        }
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
        System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
        return cArr3;
    }

    public static double[] removeAll(double[] dArr, int... iArr) {
        return (double[]) removeAll((Object) dArr, iArr);
    }

    public static float[] removeAll(float[] fArr, int... iArr) {
        return (float[]) removeAll((Object) fArr, iArr);
    }

    public static void swap(Object[] objArr, int i14, int i15) {
        if (isEmpty(objArr)) {
            return;
        }
        swap(objArr, i14, i15, 1);
    }

    public static int[] removeAll(int[] iArr, int... iArr2) {
        return (int[]) removeAll((Object) iArr, iArr2);
    }

    public static void shift(long[] jArr, int i14) {
        if (jArr == null) {
            return;
        }
        shift(jArr, 0, jArr.length, i14);
    }

    public static long[] removeAll(long[] jArr, int... iArr) {
        return (long[]) removeAll((Object) jArr, iArr);
    }

    public static void shift(long[] jArr, int i14, int i15, int i16) {
        if (jArr != null && i14 < jArr.length - 1 && i15 > 0) {
            if (i14 < 0) {
                i14 = 0;
            }
            if (i15 >= jArr.length) {
                i15 = jArr.length;
            }
            int i17 = i15 - i14;
            if (i17 <= 1) {
                return;
            }
            int i18 = i16 % i17;
            if (i18 < 0) {
                i18 += i17;
            }
            while (i17 > 1 && i18 > 0) {
                int i19 = i17 - i18;
                if (i18 > i19) {
                    swap(jArr, i14, (i17 + i14) - i19, i19);
                    int i24 = i18;
                    i18 -= i19;
                    i17 = i24;
                } else if (i18 < i19) {
                    swap(jArr, i14, i14 + i19, i18);
                    i14 += i18;
                    i17 = i19;
                } else {
                    swap(jArr, i14, i19 + i14, i18);
                    return;
                }
            }
        }
    }

    public static void swap(Object[] objArr, int i14, int i15, int i16) {
        if (isEmpty(objArr) || i14 >= objArr.length || i15 >= objArr.length) {
            return;
        }
        int i17 = 0;
        if (i14 < 0) {
            i14 = 0;
        }
        if (i15 < 0) {
            i15 = 0;
        }
        int iMin = Math.min(Math.min(i16, objArr.length - i14), objArr.length - i15);
        while (i17 < iMin) {
            Object obj = objArr[i14];
            objArr[i14] = objArr[i15];
            objArr[i15] = obj;
            i17++;
            i14++;
            i15++;
        }
    }

    public static Object removeAll(Object obj, BitSet bitSet) {
        if (obj == null) {
            return null;
        }
        int length = getLength(obj);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length - bitSet.cardinality());
        int iNextClearBit = 0;
        int i14 = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(iNextClearBit);
            if (iNextSetBit == -1) {
                break;
            }
            int i15 = iNextSetBit - iNextClearBit;
            if (i15 > 0) {
                System.arraycopy(obj, iNextClearBit, objNewInstance, i14, i15);
                i14 += i15;
            }
            iNextClearBit = bitSet.nextClearBit(iNextSetBit);
        }
        int i16 = length - iNextClearBit;
        if (i16 > 0) {
            System.arraycopy(obj, iNextClearBit, objNewInstance, i14, i16);
        }
        return objNewInstance;
    }

    public static double[] addAll(double[] dArr, double... dArr2) {
        if (dArr == null) {
            return clone(dArr2);
        }
        if (dArr2 == null) {
            return clone(dArr);
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr, 0, dArr3, 0, dArr.length);
        System.arraycopy(dArr2, 0, dArr3, dArr.length, dArr2.length);
        return dArr3;
    }

    public static float[] insert(int i14, float[] fArr, float... fArr2) {
        if (fArr == null) {
            return null;
        }
        if (isEmpty(fArr2)) {
            return clone(fArr);
        }
        if (i14 >= 0 && i14 <= fArr.length) {
            float[] fArr3 = new float[fArr.length + fArr2.length];
            System.arraycopy(fArr2, 0, fArr3, i14, fArr2.length);
            if (i14 > 0) {
                System.arraycopy(fArr, 0, fArr3, 0, i14);
            }
            if (i14 < fArr.length) {
                System.arraycopy(fArr, i14, fArr3, fArr2.length + i14, fArr.length - i14);
            }
            return fArr3;
        }
        l2.j(fArr.length, i.i(i14, "Index: ", ", Length: "));
        return null;
    }

    public static byte[] removeElements(byte[] bArr, byte... bArr2) {
        if (!isEmpty(bArr) && !isEmpty(bArr2)) {
            HashMap map = new HashMap(bArr2.length);
            for (byte b14 : bArr2) {
                Byte bValueOf = Byte.valueOf(b14);
                MutableInt mutableInt = (MutableInt) map.get(bValueOf);
                if (mutableInt == null) {
                    map.put(bValueOf, new MutableInt(1));
                } else {
                    mutableInt.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i14 = 0; i14 < bArr.length; i14++) {
                byte b15 = bArr[i14];
                MutableInt mutableInt2 = (MutableInt) map.get(Byte.valueOf(b15));
                if (mutableInt2 != null) {
                    if (mutableInt2.decrementAndGet() == 0) {
                        map.remove(Byte.valueOf(b15));
                    }
                    bitSet.set(i14);
                }
            }
            return (byte[]) removeAll(bArr, bitSet);
        }
        return clone(bArr);
    }

    public static void swap(short[] sArr, int i14, int i15) {
        if (isEmpty(sArr)) {
            return;
        }
        swap(sArr, i14, i15, 1);
    }

    public static float[] addAll(float[] fArr, float... fArr2) {
        if (fArr == null) {
            return clone(fArr2);
        }
        if (fArr2 == null) {
            return clone(fArr);
        }
        float[] fArr3 = new float[fArr.length + fArr2.length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        return fArr3;
    }

    public static void shift(Object[] objArr, int i14) {
        if (objArr == null) {
            return;
        }
        shift(objArr, 0, objArr.length, i14);
    }

    public static void swap(boolean[] zArr, int i14, int i15) {
        if (isEmpty(zArr)) {
            return;
        }
        swap(zArr, i14, i15, 1);
    }

    public static boolean[] removeAll(boolean[] zArr, int... iArr) {
        return (boolean[]) removeAll((Object) zArr, iArr);
    }

    public static void shift(Object[] objArr, int i14, int i15, int i16) {
        if (objArr != null && i14 < objArr.length - 1 && i15 > 0) {
            if (i14 < 0) {
                i14 = 0;
            }
            if (i15 >= objArr.length) {
                i15 = objArr.length;
            }
            int i17 = i15 - i14;
            if (i17 <= 1) {
                return;
            }
            int i18 = i16 % i17;
            if (i18 < 0) {
                i18 += i17;
            }
            while (i17 > 1 && i18 > 0) {
                int i19 = i17 - i18;
                if (i18 > i19) {
                    swap(objArr, i14, (i17 + i14) - i19, i19);
                    int i24 = i18;
                    i18 -= i19;
                    i17 = i24;
                } else if (i18 < i19) {
                    swap(objArr, i14, i14 + i19, i18);
                    i14 += i18;
                    i17 = i19;
                } else {
                    swap(objArr, i14, i19 + i14, i18);
                    return;
                }
            }
        }
    }

    public static short[] removeAll(short[] sArr, int... iArr) {
        return (short[]) removeAll((Object) sArr, iArr);
    }

    public static <T> T[] removeAll(T[] tArr, int... iArr) {
        return (T[]) ((Object[]) removeAll((Object) tArr, iArr));
    }

    public static int[] addAll(int[] iArr, int... iArr2) {
        if (iArr == null) {
            return clone(iArr2);
        }
        if (iArr2 == null) {
            return clone(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static int[] insert(int i14, int[] iArr, int... iArr2) {
        if (iArr == null) {
            return null;
        }
        if (isEmpty(iArr2)) {
            return clone(iArr);
        }
        if (i14 >= 0 && i14 <= iArr.length) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, i14, iArr2.length);
            if (i14 > 0) {
                System.arraycopy(iArr, 0, iArr3, 0, i14);
            }
            if (i14 < iArr.length) {
                System.arraycopy(iArr, i14, iArr3, iArr2.length + i14, iArr.length - i14);
            }
            return iArr3;
        }
        l2.j(iArr.length, i.i(i14, "Index: ", ", Length: "));
        return null;
    }

    public static void shift(short[] sArr, int i14) {
        if (sArr == null) {
            return;
        }
        shift(sArr, 0, sArr.length, i14);
    }

    public static void shift(short[] sArr, int i14, int i15, int i16) {
        if (sArr != null && i14 < sArr.length - 1 && i15 > 0) {
            if (i14 < 0) {
                i14 = 0;
            }
            if (i15 >= sArr.length) {
                i15 = sArr.length;
            }
            int i17 = i15 - i14;
            if (i17 <= 1) {
                return;
            }
            int i18 = i16 % i17;
            if (i18 < 0) {
                i18 += i17;
            }
            while (i17 > 1 && i18 > 0) {
                int i19 = i17 - i18;
                if (i18 > i19) {
                    swap(sArr, i14, (i17 + i14) - i19, i19);
                    int i24 = i18;
                    i18 -= i19;
                    i17 = i24;
                } else if (i18 < i19) {
                    swap(sArr, i14, i14 + i19, i18);
                    i14 += i18;
                    i17 = i19;
                } else {
                    swap(sArr, i14, i19 + i14, i18);
                    return;
                }
            }
        }
    }

    public static long[] addAll(long[] jArr, long... jArr2) {
        if (jArr == null) {
            return clone(jArr2);
        }
        if (jArr2 == null) {
            return clone(jArr);
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    public static char[] removeElements(char[] cArr, char... cArr2) {
        if (!isEmpty(cArr) && !isEmpty(cArr2)) {
            HashMap map = new HashMap(cArr2.length);
            for (char c14 : cArr2) {
                Character chValueOf = Character.valueOf(c14);
                MutableInt mutableInt = (MutableInt) map.get(chValueOf);
                if (mutableInt == null) {
                    map.put(chValueOf, new MutableInt(1));
                } else {
                    mutableInt.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i14 = 0; i14 < cArr.length; i14++) {
                char c15 = cArr[i14];
                MutableInt mutableInt2 = (MutableInt) map.get(Character.valueOf(c15));
                if (mutableInt2 != null) {
                    if (mutableInt2.decrementAndGet() == 0) {
                        map.remove(Character.valueOf(c15));
                    }
                    bitSet.set(i14);
                }
            }
            return (char[]) removeAll(cArr, bitSet);
        }
        return clone(cArr);
    }

    public static short[] addAll(short[] sArr, short... sArr2) {
        if (sArr == null) {
            return clone(sArr2);
        }
        if (sArr2 == null) {
            return clone(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static long[] insert(int i14, long[] jArr, long... jArr2) {
        if (jArr == null) {
            return null;
        }
        if (isEmpty(jArr2)) {
            return clone(jArr);
        }
        if (i14 >= 0 && i14 <= jArr.length) {
            long[] jArr3 = new long[jArr.length + jArr2.length];
            System.arraycopy(jArr2, 0, jArr3, i14, jArr2.length);
            if (i14 > 0) {
                System.arraycopy(jArr, 0, jArr3, 0, i14);
            }
            if (i14 < jArr.length) {
                System.arraycopy(jArr, i14, jArr3, jArr2.length + i14, jArr.length - i14);
            }
            return jArr3;
        }
        l2.j(jArr.length, i.i(i14, "Index: ", ", Length: "));
        return null;
    }

    public static boolean[] addAll(boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return clone(zArr2);
        }
        if (zArr2 == null) {
            return clone(zArr);
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr, 0, zArr3, 0, zArr.length);
        System.arraycopy(zArr2, 0, zArr3, zArr.length, zArr2.length);
        return zArr3;
    }

    public static boolean[] toPrimitive(Boolean[] boolArr, boolean z14) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return EMPTY_BOOLEAN_ARRAY;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i14 = 0; i14 < boolArr.length; i14++) {
            Boolean bool = boolArr[i14];
            zArr[i14] = bool == null ? z14 : bool.booleanValue();
        }
        return zArr;
    }

    public static short[] insert(int i14, short[] sArr, short... sArr2) {
        if (sArr == null) {
            return null;
        }
        if (isEmpty(sArr2)) {
            return clone(sArr);
        }
        if (i14 >= 0 && i14 <= sArr.length) {
            short[] sArr3 = new short[sArr.length + sArr2.length];
            System.arraycopy(sArr2, 0, sArr3, i14, sArr2.length);
            if (i14 > 0) {
                System.arraycopy(sArr, 0, sArr3, 0, i14);
            }
            if (i14 < sArr.length) {
                System.arraycopy(sArr, i14, sArr3, sArr2.length + i14, sArr.length - i14);
            }
            return sArr3;
        }
        l2.j(sArr.length, i.i(i14, "Index: ", ", Length: "));
        return null;
    }

    public static double[] removeElements(double[] dArr, double... dArr2) {
        if (!isEmpty(dArr) && !isEmpty(dArr2)) {
            HashMap map = new HashMap(dArr2.length);
            for (double d14 : dArr2) {
                Double dValueOf = Double.valueOf(d14);
                MutableInt mutableInt = (MutableInt) map.get(dValueOf);
                if (mutableInt == null) {
                    map.put(dValueOf, new MutableInt(1));
                } else {
                    mutableInt.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i14 = 0; i14 < dArr.length; i14++) {
                double d15 = dArr[i14];
                MutableInt mutableInt2 = (MutableInt) map.get(Double.valueOf(d15));
                if (mutableInt2 != null) {
                    if (mutableInt2.decrementAndGet() == 0) {
                        map.remove(Double.valueOf(d15));
                    }
                    bitSet.set(i14);
                }
            }
            return (double[]) removeAll(dArr, bitSet);
        }
        return clone(dArr);
    }

    public static byte[] toPrimitive(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArr2[i14] = bArr[i14].byteValue();
        }
        return bArr2;
    }

    public static byte[] toPrimitive(Byte[] bArr, byte b14) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i14 = 0; i14 < bArr.length; i14++) {
            Byte b15 = bArr[i14];
            bArr2[i14] = b15 == null ? b14 : b15.byteValue();
        }
        return bArr2;
    }

    public static boolean[] insert(int i14, boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return null;
        }
        if (isEmpty(zArr2)) {
            return clone(zArr);
        }
        if (i14 >= 0 && i14 <= zArr.length) {
            boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
            System.arraycopy(zArr2, 0, zArr3, i14, zArr2.length);
            if (i14 > 0) {
                System.arraycopy(zArr, 0, zArr3, 0, i14);
            }
            if (i14 < zArr.length) {
                System.arraycopy(zArr, i14, zArr3, zArr2.length + i14, zArr.length - i14);
            }
            return zArr3;
        }
        l2.j(zArr.length, i.i(i14, "Index: ", ", Length: "));
        return null;
    }

    public static char[] toPrimitive(Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return EMPTY_CHAR_ARRAY;
        }
        char[] cArr = new char[chArr.length];
        for (int i14 = 0; i14 < chArr.length; i14++) {
            cArr[i14] = chArr[i14].charValue();
        }
        return cArr;
    }

    public static float[] removeElements(float[] fArr, float... fArr2) {
        if (!isEmpty(fArr) && !isEmpty(fArr2)) {
            HashMap map = new HashMap(fArr2.length);
            for (float f14 : fArr2) {
                Float fValueOf = Float.valueOf(f14);
                MutableInt mutableInt = (MutableInt) map.get(fValueOf);
                if (mutableInt == null) {
                    map.put(fValueOf, new MutableInt(1));
                } else {
                    mutableInt.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i14 = 0; i14 < fArr.length; i14++) {
                float f15 = fArr[i14];
                MutableInt mutableInt2 = (MutableInt) map.get(Float.valueOf(f15));
                if (mutableInt2 != null) {
                    if (mutableInt2.decrementAndGet() == 0) {
                        map.remove(Float.valueOf(f15));
                    }
                    bitSet.set(i14);
                }
            }
            return (float[]) removeAll(fArr, bitSet);
        }
        return clone(fArr);
    }

    public static char[] toPrimitive(Character[] chArr, char c14) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return EMPTY_CHAR_ARRAY;
        }
        char[] cArr = new char[chArr.length];
        for (int i14 = 0; i14 < chArr.length; i14++) {
            Character ch3 = chArr[i14];
            cArr[i14] = ch3 == null ? c14 : ch3.charValue();
        }
        return cArr;
    }

    public static double[] toPrimitive(Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return EMPTY_DOUBLE_ARRAY;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i14 = 0; i14 < dArr.length; i14++) {
            dArr2[i14] = dArr[i14].doubleValue();
        }
        return dArr2;
    }

    public static double[] toPrimitive(Double[] dArr, double d14) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return EMPTY_DOUBLE_ARRAY;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i14 = 0; i14 < dArr.length; i14++) {
            Double d15 = dArr[i14];
            dArr2[i14] = d15 == null ? d14 : d15.doubleValue();
        }
        return dArr2;
    }

    public static int[] removeElements(int[] iArr, int... iArr2) {
        if (!isEmpty(iArr) && !isEmpty(iArr2)) {
            HashMap map = new HashMap(iArr2.length);
            for (int i14 : iArr2) {
                Integer numValueOf = Integer.valueOf(i14);
                MutableInt mutableInt = (MutableInt) map.get(numValueOf);
                if (mutableInt == null) {
                    map.put(numValueOf, new MutableInt(1));
                } else {
                    mutableInt.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i15 = 0; i15 < iArr.length; i15++) {
                int i16 = iArr[i15];
                MutableInt mutableInt2 = (MutableInt) map.get(Integer.valueOf(i16));
                if (mutableInt2 != null) {
                    if (mutableInt2.decrementAndGet() == 0) {
                        map.remove(Integer.valueOf(i16));
                    }
                    bitSet.set(i15);
                }
            }
            return (int[]) removeAll(iArr, bitSet);
        }
        return clone(iArr);
    }

    public static float[] toPrimitive(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return EMPTY_FLOAT_ARRAY;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i14 = 0; i14 < fArr.length; i14++) {
            fArr2[i14] = fArr[i14].floatValue();
        }
        return fArr2;
    }

    public static float[] toPrimitive(Float[] fArr, float f14) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return EMPTY_FLOAT_ARRAY;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i14 = 0; i14 < fArr.length; i14++) {
            Float f15 = fArr[i14];
            fArr2[i14] = f15 == null ? f14 : f15.floatValue();
        }
        return fArr2;
    }

    public static int[] toPrimitive(Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return EMPTY_INT_ARRAY;
        }
        int[] iArr = new int[numArr.length];
        for (int i14 = 0; i14 < numArr.length; i14++) {
            iArr[i14] = numArr[i14].intValue();
        }
        return iArr;
    }

    public static long[] removeElements(long[] jArr, long... jArr2) {
        if (!isEmpty(jArr) && !isEmpty(jArr2)) {
            HashMap map = new HashMap(jArr2.length);
            for (long j8 : jArr2) {
                Long lValueOf = Long.valueOf(j8);
                MutableInt mutableInt = (MutableInt) map.get(lValueOf);
                if (mutableInt == null) {
                    map.put(lValueOf, new MutableInt(1));
                } else {
                    mutableInt.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i14 = 0; i14 < jArr.length; i14++) {
                long j14 = jArr[i14];
                MutableInt mutableInt2 = (MutableInt) map.get(Long.valueOf(j14));
                if (mutableInt2 != null) {
                    if (mutableInt2.decrementAndGet() == 0) {
                        map.remove(Long.valueOf(j14));
                    }
                    bitSet.set(i14);
                }
            }
            return (long[]) removeAll(jArr, bitSet);
        }
        return clone(jArr);
    }

    public static int[] toPrimitive(Integer[] numArr, int i14) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return EMPTY_INT_ARRAY;
        }
        int[] iArr = new int[numArr.length];
        for (int i15 = 0; i15 < numArr.length; i15++) {
            Integer num = numArr[i15];
            iArr[i15] = num == null ? i14 : num.intValue();
        }
        return iArr;
    }

    public static long[] toPrimitive(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return EMPTY_LONG_ARRAY;
        }
        long[] jArr = new long[lArr.length];
        for (int i14 = 0; i14 < lArr.length; i14++) {
            jArr[i14] = lArr[i14].longValue();
        }
        return jArr;
    }

    public static long[] toPrimitive(Long[] lArr, long j8) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return EMPTY_LONG_ARRAY;
        }
        long[] jArr = new long[lArr.length];
        for (int i14 = 0; i14 < lArr.length; i14++) {
            Long l14 = lArr[i14];
            jArr[i14] = l14 == null ? j8 : l14.longValue();
        }
        return jArr;
    }

    public static short[] removeElements(short[] sArr, short... sArr2) {
        if (!isEmpty(sArr) && !isEmpty(sArr2)) {
            HashMap map = new HashMap(sArr2.length);
            for (short s8 : sArr2) {
                Short shValueOf = Short.valueOf(s8);
                MutableInt mutableInt = (MutableInt) map.get(shValueOf);
                if (mutableInt == null) {
                    map.put(shValueOf, new MutableInt(1));
                } else {
                    mutableInt.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i14 = 0; i14 < sArr.length; i14++) {
                short s14 = sArr[i14];
                MutableInt mutableInt2 = (MutableInt) map.get(Short.valueOf(s14));
                if (mutableInt2 != null) {
                    if (mutableInt2.decrementAndGet() == 0) {
                        map.remove(Short.valueOf(s14));
                    }
                    bitSet.set(i14);
                }
            }
            return (short[]) removeAll(sArr, bitSet);
        }
        return clone(sArr);
    }

    public static boolean[] toPrimitive(Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return EMPTY_BOOLEAN_ARRAY;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i14 = 0; i14 < boolArr.length; i14++) {
            zArr[i14] = boolArr[i14].booleanValue();
        }
        return zArr;
    }

    public static short[] toPrimitive(Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return EMPTY_SHORT_ARRAY;
        }
        short[] sArr = new short[shArr.length];
        for (int i14 = 0; i14 < shArr.length; i14++) {
            sArr[i14] = shArr[i14].shortValue();
        }
        return sArr;
    }

    public static short[] toPrimitive(Short[] shArr, short s8) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return EMPTY_SHORT_ARRAY;
        }
        short[] sArr = new short[shArr.length];
        for (int i14 = 0; i14 < shArr.length; i14++) {
            Short sh3 = shArr[i14];
            sArr[i14] = sh3 == null ? s8 : sh3.shortValue();
        }
        return sArr;
    }

    @SafeVarargs
    public static <T> T[] removeElements(T[] tArr, T... tArr2) {
        if (!isEmpty(tArr) && !isEmpty(tArr2)) {
            HashMap map = new HashMap(tArr2.length);
            for (T t7 : tArr2) {
                MutableInt mutableInt = (MutableInt) map.get(t7);
                if (mutableInt == null) {
                    map.put(t7, new MutableInt(1));
                } else {
                    mutableInt.increment();
                }
            }
            BitSet bitSet = new BitSet();
            for (int i14 = 0; i14 < tArr.length; i14++) {
                T t14 = tArr[i14];
                MutableInt mutableInt2 = (MutableInt) map.get(t14);
                if (mutableInt2 != null) {
                    if (mutableInt2.decrementAndGet() == 0) {
                        map.remove(t14);
                    }
                    bitSet.set(i14);
                }
            }
            return (T[]) ((Object[]) removeAll(tArr, bitSet));
        }
        return (T[]) clone(tArr);
    }
}
