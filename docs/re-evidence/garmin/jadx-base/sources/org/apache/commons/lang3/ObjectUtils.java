package org.apache.commons.lang3;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Supplier;
import org.apache.commons.lang3.exception.CloneFailedException;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.time.DurationUtils;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ObjectUtils {
    private static final char AT_SIGN = '@';
    public static final Null NULL = new Null();

    public static class Null implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        private Object readResolve() {
            return ObjectUtils.NULL;
        }
    }

    public static byte CONST(byte b14) {
        return b14;
    }

    public static char CONST(char c14) {
        return c14;
    }

    public static byte CONST_BYTE(int i14) {
        if (i14 >= -128 && i14 <= 127) {
            return (byte) i14;
        }
        h.s(e0.f(i14, "Supplied value must be a valid byte literal between -128 and 127: [", "]"));
        return (byte) 0;
    }

    public static short CONST_SHORT(int i14) {
        if (i14 >= -32768 && i14 <= 32767) {
            return (short) i14;
        }
        h.s(e0.f(i14, "Supplied value must be a valid byte literal between -32768 and 32767: [", "]"));
        return (short) 0;
    }

    public static boolean allNotNull(Object... objArr) {
        if (objArr == null) {
            return false;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean allNull(Object... objArr) {
        return !anyNotNull(objArr);
    }

    public static boolean anyNotNull(Object... objArr) {
        return firstNonNull(objArr) != null;
    }

    public static boolean anyNull(Object... objArr) {
        return !allNotNull(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T clone(T t7) {
        if (!(t7 instanceof Cloneable)) {
            return null;
        }
        if (!t7.getClass().isArray()) {
            try {
                return (T) t7.getClass().getMethod("clone", null).invoke(t7, null);
            } catch (IllegalAccessException e4) {
                throw new CloneFailedException("Cannot clone Cloneable type ".concat(t7.getClass().getName()), e4);
            } catch (NoSuchMethodException e14) {
                throw new CloneFailedException("Cloneable type " + t7.getClass().getName() + " has no clone method", e14);
            } catch (InvocationTargetException e15) {
                throw new CloneFailedException("Exception cloning Cloneable type ".concat(t7.getClass().getName()), e15.getCause());
            }
        }
        Class<?> componentType = t7.getClass().getComponentType();
        if (!componentType.isPrimitive()) {
            return (T) ((Object[]) t7).clone();
        }
        int length = Array.getLength(t7);
        T t14 = (T) Array.newInstance(componentType, length);
        while (true) {
            int i14 = length - 1;
            if (length <= 0) {
                return t14;
            }
            Array.set(t14, i14, Array.get(t7, i14));
            length = i14;
        }
    }

    public static <T> T cloneIfPossible(T t7) {
        T t14 = (T) clone(t7);
        return t14 == null ? t7 : t14;
    }

    public static <T extends Comparable<? super T>> int compare(T t7, T t14, boolean z14) {
        if (t7 == t14) {
            return 0;
        }
        if (t7 == null) {
            return z14 ? 1 : -1;
        }
        if (t14 == null) {
            return z14 ? -1 : 1;
        }
        return t7.compareTo(t14);
    }

    public static <T> T defaultIfNull(T t7, T t14) {
        return t7 != null ? t7 : t14;
    }

    @Deprecated
    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    @SafeVarargs
    public static <T> T firstNonNull(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t7 : tArr) {
            if (t7 != null) {
                return t7;
            }
        }
        return null;
    }

    @SafeVarargs
    public static <T> T getFirstNonNull(Supplier<T>... supplierArr) {
        T t7;
        if (supplierArr == null) {
            return null;
        }
        for (Supplier<T> supplier : supplierArr) {
            if (supplier != null && (t7 = supplier.get()) != null) {
                return t7;
            }
        }
        return null;
    }

    public static <T> T getIfNull(T t7, Supplier<T> supplier) {
        if (t7 != null) {
            return t7;
        }
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    @Deprecated
    public static int hashCode(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Deprecated
    public static int hashCodeMulti(Object... objArr) {
        int iHashCode = 1;
        if (objArr != null) {
            for (Object obj : objArr) {
                iHashCode = (iHashCode * 31) + hashCode(obj);
            }
        }
        return iHashCode;
    }

    @Deprecated
    public static void identityToString(StrBuilder strBuilder, Object obj) {
        Validate.notNull(obj, "object", new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        strBuilder.ensureCapacity(hexString.length() + name.length() + strBuilder.length() + 1);
        strBuilder.append(name).append(AT_SIGN).append(hexString);
    }

    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;
        }
        if (obj.getClass().isArray()) {
            return Array.getLength(obj) == 0;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T max(T... tArr) {
        T t7 = null;
        if (tArr != null) {
            for (T t14 : tArr) {
                if (compare(t14, t7, false) > 0) {
                    t7 = t14;
                }
            }
        }
        return t7;
    }

    @SafeVarargs
    public static <T> T median(Comparator<T> comparator, T... tArr) {
        Validate.notEmpty(tArr, "null/empty items", new Object[0]);
        Validate.noNullElements(tArr);
        Validate.notNull(comparator, "comparator", new Object[0]);
        TreeSet treeSet = new TreeSet(comparator);
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T min(T... tArr) {
        T t7 = null;
        if (tArr != null) {
            for (T t14 : tArr) {
                if (compare(t14, t7, true) < 0) {
                    t7 = t14;
                }
            }
        }
        return t7;
    }

    @SafeVarargs
    public static <T> T mode(T... tArr) {
        if (!ArrayUtils.isNotEmpty(tArr)) {
            return null;
        }
        HashMap map = new HashMap(tArr.length);
        int i14 = 0;
        for (T t7 : tArr) {
            MutableInt mutableInt = (MutableInt) map.get(t7);
            if (mutableInt == null) {
                map.put(t7, new MutableInt(1));
            } else {
                mutableInt.increment();
            }
        }
        while (true) {
            T t14 = null;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((MutableInt) entry.getValue()).intValue();
                if (iIntValue != i14) {
                    if (iIntValue > i14) {
                        t14 = (T) entry.getKey();
                        i14 = iIntValue;
                    }
                }
            }
            return t14;
        }
    }

    public static boolean notEqual(Object obj, Object obj2) {
        return !equals(obj, obj2);
    }

    public static <T> T requireNonEmpty(T t7, String str) {
        Objects.requireNonNull(t7, str);
        if (!isEmpty(t7)) {
            return t7;
        }
        h.s(str);
        return null;
    }

    public static String toString(Object obj, Supplier<String> supplier) {
        if (obj != null) {
            return obj.toString();
        }
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    public static void wait(Object obj, Duration duration) {
        obj.getClass();
        DurationUtils.accept(new b(obj, 0), DurationUtils.zeroIfNull(duration));
    }

    public static double CONST(double d14) {
        return d14;
    }

    public static float CONST(float f14) {
        return f14;
    }

    public static int CONST(int i14) {
        return i14;
    }

    public static long CONST(long j8) {
        return j8;
    }

    public static <T> T CONST(T t7) {
        return t7;
    }

    public static short CONST(short s8) {
        return s8;
    }

    public static boolean CONST(boolean z14) {
        return z14;
    }

    public static <T> T requireNonEmpty(T t7) {
        return (T) requireNonEmpty(t7, "object");
    }

    @Deprecated
    public static String toString(Object obj, String str) {
        return obj == null ? str : obj.toString();
    }

    @Deprecated
    public static String toString(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    public static <T extends Comparable<? super T>> int compare(T t7, T t14) {
        return compare(t7, t14, false);
    }

    @SafeVarargs
    public static <T extends Comparable<? super T>> T median(T... tArr) {
        Validate.notEmpty(tArr);
        Validate.noNullElements(tArr);
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, tArr);
        return (T) treeSet.toArray()[(treeSet.size() - 1) / 2];
    }

    public static String identityToString(Object obj) {
        if (obj == null) {
            return null;
        }
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        StringBuilder sb3 = new StringBuilder(hexString.length() + name.length() + 1);
        sb3.append(name);
        sb3.append(AT_SIGN);
        sb3.append(hexString);
        return sb3.toString();
    }

    public static void identityToString(Appendable appendable, Object obj) throws IOException {
        Validate.notNull(obj, "object", new Object[0]);
        appendable.append(obj.getClass().getName()).append(AT_SIGN).append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void identityToString(StringBuffer stringBuffer, Object obj) {
        Validate.notNull(obj, "object", new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
        stringBuffer.append(name);
        stringBuffer.append(AT_SIGN);
        stringBuffer.append(hexString);
    }

    public static void identityToString(StringBuilder sb3, Object obj) {
        Validate.notNull(obj, "object", new Object[0]);
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        sb3.ensureCapacity(hexString.length() + name.length() + sb3.length() + 1);
        sb3.append(name);
        sb3.append(AT_SIGN);
        sb3.append(hexString);
    }
}
