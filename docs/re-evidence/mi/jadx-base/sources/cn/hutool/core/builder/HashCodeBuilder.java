package cn.hutool.core.builder;

import defpackage.pqc;
import defpackage.qj1;
import defpackage.qk1;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class HashCodeBuilder implements Builder<Integer> {
    private static final int DEFAULT_INITIAL_VALUE = 17;
    private static final int DEFAULT_MULTIPLIER_VALUE = 37;
    private static final ThreadLocal<Set<pqc>> REGISTRY = new ThreadLocal<>();
    private static final long serialVersionUID = 1;
    private final int iConstant;
    private int iTotal;

    public HashCodeBuilder() {
        this.iConstant = 37;
        this.iTotal = 17;
    }

    private static Set<pqc> getRegistry() {
        return REGISTRY.get();
    }

    private static boolean isRegistered(Object obj) {
        Set<pqc> registry = getRegistry();
        return registry != null && registry.contains(new pqc(obj));
    }

    private static void reflectionAppend(Object obj, Class<?> cls, HashCodeBuilder hashCodeBuilder, boolean z, String[] strArr) {
        if (isRegistered(obj)) {
            return;
        }
        try {
            register(obj);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (Field field : declaredFields) {
                if (!qj1.o(strArr, field.getName()) && field.getName().indexOf(36) == -1 && (z || !Modifier.isTransient(field.getModifiers()))) {
                    if (Modifier.isStatic(field.getModifiers())) {
                        continue;
                    } else {
                        try {
                            hashCodeBuilder.append(field.get(obj));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            }
            unregister(obj);
        } catch (Throwable th) {
            unregister(obj);
            throw th;
        }
    }

    public static int reflectionHashCode(int i, int i2, Object obj) {
        return reflectionHashCode(i, i2, obj, false, null, new String[0]);
    }

    public static void register(Object obj) {
        synchronized (HashCodeBuilder.class) {
            try {
                if (getRegistry() == null) {
                    REGISTRY.set(new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        getRegistry().add(new pqc(obj));
    }

    public static void unregister(Object obj) {
        Set<pqc> registry = getRegistry();
        if (registry != null) {
            registry.remove(new pqc(obj));
            synchronized (HashCodeBuilder.class) {
                try {
                    Set<pqc> registry2 = getRegistry();
                    if (registry2 != null && registry2.isEmpty()) {
                        REGISTRY.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public HashCodeBuilder append(boolean z) {
        this.iTotal = (this.iTotal * this.iConstant) + (!z ? 1 : 0);
        return this;
    }

    public HashCodeBuilder appendSuper(int i) {
        this.iTotal = (this.iTotal * this.iConstant) + i;
        return this;
    }

    public int hashCode() {
        return toHashCode();
    }

    public int toHashCode() {
        return this.iTotal;
    }

    public static int reflectionHashCode(int i, int i2, Object obj, boolean z) {
        return reflectionHashCode(i, i2, obj, z, null, new String[0]);
    }

    public HashCodeBuilder append(boolean[] zArr) {
        if (zArr == null) {
            this.iTotal *= this.iConstant;
        } else {
            for (boolean z : zArr) {
                append(z);
            }
        }
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.builder.Builder
    public Integer build() {
        return Integer.valueOf(toHashCode());
    }

    public static <T> int reflectionHashCode(int i, int i2, T t, boolean z, Class<? super T> cls, String... strArr) {
        if (t != null) {
            HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(i, i2);
            Class<?> superclass = t.getClass();
            reflectionAppend(t, superclass, hashCodeBuilder, z, strArr);
            while (superclass.getSuperclass() != null && superclass != cls) {
                superclass = superclass.getSuperclass();
                reflectionAppend(t, superclass, hashCodeBuilder, z, strArr);
            }
            return hashCodeBuilder.toHashCode();
        }
        throw new IllegalArgumentException("The object to build a hash code for must not be null");
    }

    public HashCodeBuilder(int i, int i2) throws Throwable {
        qk1.h(i % 2 != 0, "HashCodeBuilder requires an odd initial value", new Object[0]);
        qk1.h(i2 % 2 != 0, "HashCodeBuilder requires an odd multiplier", new Object[0]);
        this.iConstant = i2;
        this.iTotal = i;
    }

    public HashCodeBuilder append(byte b2) {
        this.iTotal = (this.iTotal * this.iConstant) + b2;
        return this;
    }

    public HashCodeBuilder append(byte[] bArr) {
        if (bArr == null) {
            this.iTotal *= this.iConstant;
        } else {
            for (byte b2 : bArr) {
                append(b2);
            }
        }
        return this;
    }

    public HashCodeBuilder append(char c) {
        this.iTotal = (this.iTotal * this.iConstant) + c;
        return this;
    }

    public HashCodeBuilder append(char[] cArr) {
        if (cArr == null) {
            this.iTotal *= this.iConstant;
        } else {
            for (char c : cArr) {
                append(c);
            }
        }
        return this;
    }

    public static int reflectionHashCode(Object obj, boolean z) {
        return reflectionHashCode(17, 37, obj, z, null, new String[0]);
    }

    public static int reflectionHashCode(Object obj, Collection<String> collection) {
        return reflectionHashCode(obj, (String[]) qj1.P(collection, String.class));
    }

    public static int reflectionHashCode(Object obj, String... strArr) {
        return reflectionHashCode(17, 37, obj, false, null, strArr);
    }

    public HashCodeBuilder append(double d) {
        return append(Double.doubleToLongBits(d));
    }

    public HashCodeBuilder append(double[] dArr) {
        if (dArr == null) {
            this.iTotal *= this.iConstant;
        } else {
            for (double d : dArr) {
                append(d);
            }
        }
        return this;
    }

    public HashCodeBuilder append(float f) {
        this.iTotal = (this.iTotal * this.iConstant) + Float.floatToIntBits(f);
        return this;
    }

    public HashCodeBuilder append(float[] fArr) {
        if (fArr == null) {
            this.iTotal *= this.iConstant;
        } else {
            for (float f : fArr) {
                append(f);
            }
        }
        return this;
    }

    public HashCodeBuilder append(int i) {
        this.iTotal = (this.iTotal * this.iConstant) + i;
        return this;
    }

    public HashCodeBuilder append(int[] iArr) {
        if (iArr == null) {
            this.iTotal *= this.iConstant;
        } else {
            for (int i : iArr) {
                append(i);
            }
        }
        return this;
    }

    public HashCodeBuilder append(long j) {
        this.iTotal = (this.iTotal * this.iConstant) + ((int) (j ^ (j >> 32)));
        return this;
    }

    public HashCodeBuilder append(long[] jArr) {
        if (jArr == null) {
            this.iTotal *= this.iConstant;
        } else {
            for (long j : jArr) {
                append(j);
            }
        }
        return this;
    }

    public HashCodeBuilder append(Object obj) {
        if (obj == null) {
            this.iTotal *= this.iConstant;
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
            this.iTotal = (this.iTotal * this.iConstant) + obj.hashCode();
        }
        return this;
    }

    public HashCodeBuilder append(Object[] objArr) {
        if (objArr == null) {
            this.iTotal *= this.iConstant;
        } else {
            for (Object obj : objArr) {
                append(obj);
            }
        }
        return this;
    }

    public HashCodeBuilder append(short s) {
        this.iTotal = (this.iTotal * this.iConstant) + s;
        return this;
    }

    public HashCodeBuilder append(short[] sArr) {
        if (sArr == null) {
            this.iTotal *= this.iConstant;
        } else {
            for (short s : sArr) {
                append(s);
            }
        }
        return this;
    }
}
