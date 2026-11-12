package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class qj1 extends p8i {
    public static <T> T[] A(T[] tArr, int i, T... tArr2) {
        return (T[]) ((Object[]) z(tArr, i, tArr2));
    }

    public static boolean B(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    public static boolean C(Object obj) {
        if (obj != null) {
            return B(obj) && Array.getLength(obj) == 0;
        }
        return true;
    }

    public static <T> boolean D(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static <T> boolean E(T[] tArr) {
        return (tArr == null || tArr.length == 0) ? false : true;
    }

    public static int G(Object obj) throws IllegalArgumentException {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static <T, R> R[] H(Object obj, Class<R> cls, Function<? super T, ? extends R> function) {
        int iG = G(obj);
        R[] rArr = (R[]) K(cls, iG);
        for (int i = 0; i < iG; i++) {
            rArr[i] = function.apply((Object) t(obj, i));
        }
        return rArr;
    }

    public static <T> int I(b8f<T> b8fVar, int i, T... tArr) {
        qk1.u(b8fVar, "Matcher must be not null !", new Object[0]);
        if (!E(tArr)) {
            return -1;
        }
        while (i < tArr.length) {
            if (b8fVar.a(tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> int J(b8f<T> b8fVar, T... tArr) {
        return I(b8fVar, 0, tArr);
    }

    public static <T> T[] K(Class<?> cls, int i) {
        return (T[]) ((Object[]) Array.newInstance(cls, i));
    }

    public static <T> T[] L(T[] tArr, int i) throws IllegalArgumentException {
        return (T[]) ((Object[]) p8i.f(tArr, i));
    }

    public static Object M(Object obj, int i, Object obj2) {
        if (i >= G(obj)) {
            return l(obj, obj2);
        }
        Array.set(obj, i, obj2);
        return obj;
    }

    public static Object[] N(Object obj, int i, int i2, int i3) {
        int iG = G(obj);
        if (i < 0) {
            i += iG;
        }
        if (i2 < 0) {
            i2 += iG;
        }
        if (i == iG) {
            return new Object[0];
        }
        if (i <= i2) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        if (i <= iG) {
            iG = i;
        } else if (i2 >= iG) {
            return new Object[0];
        }
        if (i3 <= 1) {
            i3 = 1;
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < iG) {
            arrayList.add(t(obj, i2));
            i2 += i3;
        }
        return arrayList.toArray();
    }

    public static <T> T[] O(T[] tArr, int i, int i2) {
        int iG = G(tArr);
        if (i < 0) {
            i += iG;
        }
        if (i2 < 0) {
            i2 += iG;
        }
        if (i == iG) {
            return (T[]) K(tArr.getClass().getComponentType(), 0);
        }
        if (i <= i2) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        if (i <= iG) {
            iG = i;
        } else if (i2 >= iG) {
            return (T[]) K(tArr.getClass().getComponentType(), 0);
        }
        return (T[]) Arrays.copyOfRange(tArr, i2, iG);
    }

    public static <T> T[] P(Collection<T> collection, Class<T> cls) {
        return (T[]) collection.toArray(K(cls, 0));
    }

    public static String Q(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof boolean[]) {
            return Arrays.toString((boolean[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        if (B(obj)) {
            try {
                return Arrays.deepToString((Object[]) obj);
            } catch (Exception unused) {
            }
        }
        return obj.toString();
    }

    @SafeVarargs
    public static <T> Object l(Object obj, T... tArr) {
        return C(obj) ? tArr : z(obj, G(obj), tArr);
    }

    @SafeVarargs
    public static <T> T[] m(T[] tArr, T... tArr2) {
        return D(tArr) ? tArr2 : (T[]) A(tArr, tArr.length, tArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T n(T t) {
        if (t == 0 || !B(t)) {
            return null;
        }
        Class<?> componentType = t.getClass().getComponentType();
        if (!componentType.isPrimitive()) {
            return (T) ((Object[]) t).clone();
        }
        int length = Array.getLength(t);
        T t2 = (T) Array.newInstance(componentType, length);
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return t2;
            }
            Array.set(t2, i, Array.get(t, i));
            length = i;
        }
    }

    public static <T> boolean o(T[] tArr, T t) {
        return y(tArr, t) > -1;
    }

    public static Object p(Object obj, Object obj2, int i) {
        System.arraycopy(obj, 0, obj2, 0, i);
        return obj2;
    }

    public static <T> T[] q(T[] tArr, T[] tArr2) {
        return D(tArr) ? tArr2 : tArr;
    }

    public static boolean r(Object obj, Object obj2) throws Throwable {
        if (obj == obj2) {
            return true;
        }
        if (x(obj, obj2)) {
            return false;
        }
        qk1.h(B(obj), "First is not a Array !", new Object[0]);
        qk1.h(B(obj2), "Second is not a Array !", new Object[0]);
        if (obj instanceof long[]) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if (obj instanceof int[]) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if (obj instanceof short[]) {
            return Arrays.equals((short[]) obj, (short[]) obj2);
        }
        if (obj instanceof char[]) {
            return Arrays.equals((char[]) obj, (char[]) obj2);
        }
        if (obj instanceof byte[]) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if (obj instanceof double[]) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if (obj instanceof float[]) {
            return Arrays.equals((float[]) obj, (float[]) obj2);
        }
        return obj instanceof boolean[] ? Arrays.equals((boolean[]) obj, (boolean[]) obj2) : Arrays.deepEquals((Object[]) obj, (Object[]) obj2);
    }

    public static <T> T s(b8f<T> b8fVar, T... tArr) {
        int iJ = J(b8fVar, tArr);
        if (iJ < 0) {
            return null;
        }
        return tArr[iJ];
    }

    public static <T> T t(Object obj, int i) {
        if (obj == null) {
            return null;
        }
        if (i < 0) {
            i += Array.getLength(obj);
        }
        try {
            return (T) Array.get(obj, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] u(Object obj, int... iArr) {
        if (obj == null) {
            return null;
        }
        T[] tArr = (T[]) K(obj.getClass().getComponentType(), iArr.length);
        for (int i : iArr) {
            tArr[i] = t(obj, i);
        }
        return tArr;
    }

    public static Class<?> v(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    public static Class<?> w(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getComponentType();
    }

    public static <T> boolean x(T... tArr) {
        if (E(tArr)) {
            for (T t : tArr) {
                if (t == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> int y(T[] tArr, final Object obj) {
        return J(new b8f() { // from class: pj1
            @Override // defpackage.b8f
            public final boolean a(Object obj2) {
                return g4h.g(obj, obj2);
            }
        }, tArr);
    }

    public static <T> Object z(Object obj, int i, T... tArr) {
        if (D(tArr)) {
            return obj;
        }
        if (C(obj)) {
            return tArr;
        }
        int iG = G(obj);
        if (i < 0) {
            i = (i % iG) + iG;
        }
        Object[] objArrK = K(obj.getClass().getComponentType(), Math.max(iG, i) + tArr.length);
        System.arraycopy(obj, 0, objArrK, 0, Math.min(iG, i));
        System.arraycopy(tArr, 0, objArrK, i, tArr.length);
        if (i < iG) {
            System.arraycopy(obj, i, objArrK, tArr.length + i, iG - i);
        }
        return objArrK;
    }
}
