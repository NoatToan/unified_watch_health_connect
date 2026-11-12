package org.apache.commons.lang3.builder;

import com.google.android.material.color.utilities.f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.ArraySorter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
public class HashCodeBuilder implements Builder<Integer> {
    private static final int DEFAULT_INITIAL_VALUE = 17;
    private static final int DEFAULT_MULTIPLIER_VALUE = 37;
    private static final ThreadLocal<Set<IDKey>> REGISTRY = new ThreadLocal<>();
    private final int iConstant;
    private int iTotal;

    public HashCodeBuilder(int i14, int i15) {
        Validate.isTrue(i14 % 2 != 0, "HashCodeBuilder requires an odd initial value", new Object[0]);
        Validate.isTrue(i15 % 2 != 0, "HashCodeBuilder requires an odd multiplier", new Object[0]);
        this.iConstant = i15;
        this.iTotal = i14;
    }

    private void appendArray(Object obj) {
        if (obj instanceof long[]) {
            append((long[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            append((int[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            append((short[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            append((char[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            append((byte[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            append((double[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            append((float[]) obj);
        } else if (obj instanceof boolean[]) {
            append((boolean[]) obj);
        } else {
            append((Object[]) obj);
        }
    }

    public static Set<IDKey> getRegistry() {
        return REGISTRY.get();
    }

    public static boolean isRegistered(Object obj) {
        Set<IDKey> registry = getRegistry();
        return registry != null && registry.contains(new IDKey(obj));
    }

    private static void reflectionAppend(Object obj, Class<?> cls, HashCodeBuilder hashCodeBuilder, boolean z14, String[] strArr) {
        if (isRegistered(obj)) {
            return;
        }
        try {
            register(obj);
            Field[] fieldArr = (Field[]) ArraySorter.sort(cls.getDeclaredFields(), Comparator.comparing(new f(6)));
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field : fieldArr) {
                if (!ArrayUtils.contains(strArr, field.getName()) && !field.getName().contains("$") && (z14 || !Modifier.isTransient(field.getModifiers()))) {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(HashCodeExclude.class)) {
                        try {
                            hashCodeBuilder.append(field.get(obj));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            }
            unregister(obj);
        } catch (Throwable th3) {
            unregister(obj);
            throw th3;
        }
    }

    public static <T> int reflectionHashCode(int i14, int i15, T t7, boolean z14, Class<? super T> cls, String... strArr) {
        Validate.notNull(t7, "object", new Object[0]);
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(i14, i15);
        Class<?> superclass = t7.getClass();
        reflectionAppend(t7, superclass, hashCodeBuilder, z14, strArr);
        while (superclass.getSuperclass() != null && superclass != cls) {
            superclass = superclass.getSuperclass();
            reflectionAppend(t7, superclass, hashCodeBuilder, z14, strArr);
        }
        return hashCodeBuilder.toHashCode();
    }

    private static void register(Object obj) {
        Set<IDKey> registry = getRegistry();
        if (registry == null) {
            registry = new HashSet<>();
            REGISTRY.set(registry);
        }
        registry.add(new IDKey(obj));
    }

    private static void unregister(Object obj) {
        Set<IDKey> registry = getRegistry();
        if (registry != null) {
            registry.remove(new IDKey(obj));
            if (registry.isEmpty()) {
                REGISTRY.remove();
            }
        }
    }

    public HashCodeBuilder append(Object obj) {
        if (obj == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        if (obj.getClass().isArray()) {
            appendArray(obj);
            return this;
        }
        this.iTotal = obj.hashCode() + (this.iTotal * this.iConstant);
        return this;
    }

    public HashCodeBuilder appendSuper(int i14) {
        this.iTotal = (this.iTotal * this.iConstant) + i14;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.builder.Builder
    public Integer build() {
        return Integer.valueOf(toHashCode());
    }

    public int hashCode() {
        return toHashCode();
    }

    public int toHashCode() {
        return this.iTotal;
    }

    public HashCodeBuilder() {
        this.iConstant = 37;
        this.iTotal = 17;
    }

    public HashCodeBuilder append(boolean[] zArr) {
        if (zArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (boolean z14 : zArr) {
            append(z14);
        }
        return this;
    }

    public HashCodeBuilder append(byte b14) {
        this.iTotal = (this.iTotal * this.iConstant) + b14;
        return this;
    }

    public static int reflectionHashCode(int i14, int i15, Object obj, boolean z14) {
        return reflectionHashCode(i14, i15, obj, z14, null, new String[0]);
    }

    public HashCodeBuilder append(byte[] bArr) {
        if (bArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (byte b14 : bArr) {
            append(b14);
        }
        return this;
    }

    public static int reflectionHashCode(int i14, int i15, Object obj) {
        return reflectionHashCode(i14, i15, obj, false, null, new String[0]);
    }

    public static int reflectionHashCode(Object obj, boolean z14) {
        return reflectionHashCode(17, 37, obj, z14, null, new String[0]);
    }

    public static int reflectionHashCode(Object obj, Collection<String> collection) {
        return reflectionHashCode(obj, ReflectionToStringBuilder.toNoNullStringArray(collection));
    }

    public HashCodeBuilder append(char c14) {
        this.iTotal = (this.iTotal * this.iConstant) + c14;
        return this;
    }

    public static int reflectionHashCode(Object obj, String... strArr) {
        return reflectionHashCode(17, 37, obj, false, null, strArr);
    }

    public HashCodeBuilder append(char[] cArr) {
        if (cArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (char c14 : cArr) {
            append(c14);
        }
        return this;
    }

    public HashCodeBuilder append(double d14) {
        return append(Double.doubleToLongBits(d14));
    }

    public HashCodeBuilder append(double[] dArr) {
        if (dArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (double d14 : dArr) {
            append(d14);
        }
        return this;
    }

    public HashCodeBuilder append(float f14) {
        this.iTotal = Float.floatToIntBits(f14) + (this.iTotal * this.iConstant);
        return this;
    }

    public HashCodeBuilder append(float[] fArr) {
        if (fArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (float f14 : fArr) {
            append(f14);
        }
        return this;
    }

    public HashCodeBuilder append(int i14) {
        this.iTotal = (this.iTotal * this.iConstant) + i14;
        return this;
    }

    public HashCodeBuilder append(int[] iArr) {
        if (iArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (int i14 : iArr) {
            append(i14);
        }
        return this;
    }

    public HashCodeBuilder append(long j8) {
        this.iTotal = (this.iTotal * this.iConstant) + ((int) (j8 ^ (j8 >> 32)));
        return this;
    }

    public HashCodeBuilder append(long[] jArr) {
        if (jArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (long j8 : jArr) {
            append(j8);
        }
        return this;
    }

    public HashCodeBuilder append(boolean z14) {
        this.iTotal = (this.iTotal * this.iConstant) + (!z14 ? 1 : 0);
        return this;
    }

    public HashCodeBuilder append(Object[] objArr) {
        if (objArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (Object obj : objArr) {
            append(obj);
        }
        return this;
    }

    public HashCodeBuilder append(short s8) {
        this.iTotal = (this.iTotal * this.iConstant) + s8;
        return this;
    }

    public HashCodeBuilder append(short[] sArr) {
        if (sArr == null) {
            this.iTotal *= this.iConstant;
            return this;
        }
        for (short s8 : sArr) {
            append(s8);
        }
        return this;
    }
}
