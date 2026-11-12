package org.apache.commons.lang.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang.ArrayUtils;

/* JADX INFO: loaded from: classes23.dex */
public class HashCodeBuilder {
    private static final ThreadLocal c = new ThreadLocal();
    public static /* synthetic */ Class d;
    private final int a;
    private int b;

    public HashCodeBuilder() {
        this.b = 0;
        this.a = 37;
        this.b = 17;
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static Set b() {
        return (Set) c.get();
    }

    public static boolean c(Object obj) {
        Set setB = b();
        return setB != null && setB.contains(new a(obj));
    }

    private static void d(Object obj, Class cls, HashCodeBuilder hashCodeBuilder, boolean z, String[] strArr) {
        if (c(obj)) {
            return;
        }
        try {
            e(obj);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (Field field : declaredFields) {
                if (!ArrayUtils.contains(strArr, field.getName()) && field.getName().indexOf(36) == -1 && ((z || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                    try {
                        hashCodeBuilder.append(field.get(obj));
                    } catch (IllegalAccessException unused) {
                        throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }
            f(obj);
        } catch (Throwable th) {
            f(obj);
            throw th;
        }
    }

    public static void e(Object obj) {
        Class clsA = d;
        if (clsA == null) {
            clsA = a("org.apache.commons.lang.builder.HashCodeBuilder");
            d = clsA;
        }
        synchronized (clsA) {
            if (b() == null) {
                c.set(new HashSet());
            }
        }
        b().add(new a(obj));
    }

    public static void f(Object obj) {
        Set setB = b();
        if (setB != null) {
            setB.remove(new a(obj));
            Class clsA = d;
            if (clsA == null) {
                clsA = a("org.apache.commons.lang.builder.HashCodeBuilder");
                d = clsA;
            }
            synchronized (clsA) {
                Set setB2 = b();
                if (setB2 != null && setB2.isEmpty()) {
                    c.set(null);
                }
            }
        }
    }

    public static int reflectionHashCode(int i, int i2, Object obj) {
        return reflectionHashCode(i, i2, obj, false, null, null);
    }

    public HashCodeBuilder append(boolean z) {
        this.b = (this.b * this.a) + (!z ? 1 : 0);
        return this;
    }

    public HashCodeBuilder appendSuper(int i) {
        this.b = (this.b * this.a) + i;
        return this;
    }

    public int hashCode() {
        return toHashCode();
    }

    public int toHashCode() {
        return this.b;
    }

    public static int reflectionHashCode(int i, int i2, Object obj, boolean z) {
        return reflectionHashCode(i, i2, obj, z, null, null);
    }

    public HashCodeBuilder append(boolean[] zArr) {
        if (zArr == null) {
            this.b *= this.a;
        } else {
            for (boolean z : zArr) {
                append(z);
            }
        }
        return this;
    }

    public static int reflectionHashCode(int i, int i2, Object obj, boolean z, Class cls) {
        return reflectionHashCode(i, i2, obj, z, cls, null);
    }

    public static int reflectionHashCode(int i, int i2, Object obj, boolean z, Class cls, String[] strArr) {
        if (obj != null) {
            HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(i, i2);
            Class<?> superclass = obj.getClass();
            d(obj, superclass, hashCodeBuilder, z, strArr);
            while (superclass.getSuperclass() != null && superclass != cls) {
                superclass = superclass.getSuperclass();
                d(obj, superclass, hashCodeBuilder, z, strArr);
            }
            return hashCodeBuilder.toHashCode();
        }
        throw new IllegalArgumentException("The object to build a hash code for must not be null");
    }

    public HashCodeBuilder(int i, int i2) {
        this.b = 0;
        if (i != 0) {
            if (i % 2 == 0) {
                throw new IllegalArgumentException("HashCodeBuilder requires an odd initial value");
            }
            if (i2 != 0) {
                if (i2 % 2 != 0) {
                    this.a = i2;
                    this.b = i;
                    return;
                }
                throw new IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
            }
            throw new IllegalArgumentException("HashCodeBuilder requires a non zero multiplier");
        }
        throw new IllegalArgumentException("HashCodeBuilder requires a non zero initial value");
    }

    public HashCodeBuilder append(byte b) {
        this.b = (this.b * this.a) + b;
        return this;
    }

    public HashCodeBuilder append(byte[] bArr) {
        if (bArr == null) {
            this.b *= this.a;
        } else {
            for (byte b : bArr) {
                append(b);
            }
        }
        return this;
    }

    public HashCodeBuilder append(char c2) {
        this.b = (this.b * this.a) + c2;
        return this;
    }

    public HashCodeBuilder append(char[] cArr) {
        if (cArr == null) {
            this.b *= this.a;
        } else {
            for (char c2 : cArr) {
                append(c2);
            }
        }
        return this;
    }

    public static int reflectionHashCode(Object obj) {
        return reflectionHashCode(17, 37, obj, false, null, null);
    }

    public static int reflectionHashCode(Object obj, boolean z) {
        return reflectionHashCode(17, 37, obj, z, null, null);
    }

    public HashCodeBuilder append(double d2) {
        return append(Double.doubleToLongBits(d2));
    }

    public static int reflectionHashCode(Object obj, Collection collection) {
        return reflectionHashCode(obj, ReflectionToStringBuilder.a(collection));
    }

    public HashCodeBuilder append(double[] dArr) {
        if (dArr == null) {
            this.b *= this.a;
        } else {
            for (double d2 : dArr) {
                append(d2);
            }
        }
        return this;
    }

    public static int reflectionHashCode(Object obj, String[] strArr) {
        return reflectionHashCode(17, 37, obj, false, null, strArr);
    }

    public HashCodeBuilder append(float f) {
        this.b = (this.b * this.a) + Float.floatToIntBits(f);
        return this;
    }

    public HashCodeBuilder append(float[] fArr) {
        if (fArr == null) {
            this.b *= this.a;
        } else {
            for (float f : fArr) {
                append(f);
            }
        }
        return this;
    }

    public HashCodeBuilder append(int i) {
        this.b = (this.b * this.a) + i;
        return this;
    }

    public HashCodeBuilder append(int[] iArr) {
        if (iArr == null) {
            this.b *= this.a;
        } else {
            for (int i : iArr) {
                append(i);
            }
        }
        return this;
    }

    public HashCodeBuilder append(long j) {
        this.b = (this.b * this.a) + ((int) (j ^ (j >> 32)));
        return this;
    }

    public HashCodeBuilder append(long[] jArr) {
        if (jArr == null) {
            this.b *= this.a;
        } else {
            for (long j : jArr) {
                append(j);
            }
        }
        return this;
    }

    public HashCodeBuilder append(Object obj) {
        if (obj == null) {
            this.b *= this.a;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                append((long[]) obj);
            } else if (obj instanceof int[]) {
                append((int[]) obj);
            } else if (obj instanceof short[]) {
                append((short[]) obj);
            } else if (obj instanceof char[]) {
                append((char[]) obj);
            } else if (obj instanceof byte[]) {
                append((byte[]) obj);
            } else if (obj instanceof double[]) {
                append((double[]) obj);
            } else if (obj instanceof float[]) {
                append((float[]) obj);
            } else if (obj instanceof boolean[]) {
                append((boolean[]) obj);
            } else {
                append((Object[]) obj);
            }
        } else {
            this.b = (this.b * this.a) + obj.hashCode();
        }
        return this;
    }

    public HashCodeBuilder append(Object[] objArr) {
        if (objArr == null) {
            this.b *= this.a;
        } else {
            for (Object obj : objArr) {
                append(obj);
            }
        }
        return this;
    }

    public HashCodeBuilder append(short s) {
        this.b = (this.b * this.a) + s;
        return this;
    }

    public HashCodeBuilder append(short[] sArr) {
        if (sArr == null) {
            this.b *= this.a;
        } else {
            for (short s : sArr) {
                append(s);
            }
        }
        return this;
    }
}
