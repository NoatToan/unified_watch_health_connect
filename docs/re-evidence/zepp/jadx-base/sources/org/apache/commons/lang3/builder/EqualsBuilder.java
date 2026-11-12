package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes23.dex */
public class EqualsBuilder implements Builder<Boolean> {
    private static final ThreadLocal<Set<Pair<a, a>>> f = new ThreadLocal<>();
    private boolean a = true;
    private boolean b = false;
    private boolean c = false;
    private Class<?> d = null;
    private String[] e = null;

    private void a(Object obj, Object obj2) {
        if (obj.getClass() != obj2.getClass()) {
            setEquals(false);
            return;
        }
        if (obj instanceof long[]) {
            append((long[]) obj, (long[]) obj2);
            return;
        }
        if (obj instanceof int[]) {
            append((int[]) obj, (int[]) obj2);
            return;
        }
        if (obj instanceof short[]) {
            append((short[]) obj, (short[]) obj2);
            return;
        }
        if (obj instanceof char[]) {
            append((char[]) obj, (char[]) obj2);
            return;
        }
        if (obj instanceof byte[]) {
            append((byte[]) obj, (byte[]) obj2);
            return;
        }
        if (obj instanceof double[]) {
            append((double[]) obj, (double[]) obj2);
            return;
        }
        if (obj instanceof float[]) {
            append((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            append((boolean[]) obj, (boolean[]) obj2);
        } else {
            append((Object[]) obj, (Object[]) obj2);
        }
    }

    public static Pair<a, a> b(Object obj, Object obj2) {
        return Pair.of(new a(obj), new a(obj2));
    }

    public static Set<Pair<a, a>> c() {
        return f.get();
    }

    public static boolean d(Object obj, Object obj2) {
        Set<Pair<a, a>> setC = c();
        Pair<a, a> pairB = b(obj, obj2);
        return setC != null && (setC.contains(pairB) || setC.contains(Pair.of(pairB.getLeft(), pairB.getRight())));
    }

    private void e(Object obj, Object obj2, Class<?> cls) {
        if (d(obj, obj2)) {
            return;
        }
        try {
            f(obj, obj2);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i = 0; i < declaredFields.length && this.a; i++) {
                Field field = declaredFields[i];
                if (!ArrayUtils.contains(this.e, field.getName()) && !field.getName().contains("$") && ((this.b || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(EqualsExclude.class))) {
                    try {
                        append(field.get(obj), field.get(obj2));
                    } catch (IllegalAccessException unused) {
                        throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }
            g(obj, obj2);
        } catch (Throwable th) {
            g(obj, obj2);
            throw th;
        }
    }

    private static void f(Object obj, Object obj2) {
        Set<Pair<a, a>> setC = c();
        if (setC == null) {
            setC = new HashSet<>();
            f.set(setC);
        }
        setC.add(b(obj, obj2));
    }

    private static void g(Object obj, Object obj2) {
        Set<Pair<a, a>> setC = c();
        if (setC != null) {
            setC.remove(b(obj, obj2));
            if (setC.isEmpty()) {
                f.remove();
            }
        }
    }

    public static boolean reflectionEquals(Object obj, Object obj2, Collection<String> collection) {
        return reflectionEquals(obj, obj2, ReflectionToStringBuilder.b(collection));
    }

    public EqualsBuilder append(Object obj, Object obj2) {
        if (!this.a || obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            setEquals(false);
            return this;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            a(obj, obj2);
        } else if (!this.c || ClassUtils.isPrimitiveOrWrapper(cls)) {
            this.a = obj.equals(obj2);
        } else {
            reflectionAppend(obj, obj2);
        }
        return this;
    }

    public EqualsBuilder appendSuper(boolean z) {
        if (!this.a) {
            return this;
        }
        this.a = z;
        return this;
    }

    public boolean isEquals() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    public EqualsBuilder reflectionAppend(Object obj, Object obj2) {
        if (!this.a || obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            this.a = false;
            return this;
        }
        Class<?> superclass = obj.getClass();
        Class<?> cls = obj2.getClass();
        if (superclass.isInstance(obj2)) {
            if (!cls.isInstance(obj)) {
                superclass = cls;
            }
        } else {
            if (!cls.isInstance(obj)) {
                this.a = false;
                return this;
            }
            if (superclass.isInstance(obj2)) {
                superclass = cls;
            }
        }
        try {
            if (superclass.isArray()) {
                append(obj, obj2);
            } else {
                e(obj, obj2, superclass);
                while (superclass.getSuperclass() != null && superclass != this.d) {
                    superclass = superclass.getSuperclass();
                    e(obj, obj2, superclass);
                }
            }
            return this;
        } catch (IllegalArgumentException unused) {
            this.a = false;
            return this;
        }
    }

    public void reset() {
        this.a = true;
    }

    public void setEquals(boolean z) {
        this.a = z;
    }

    public EqualsBuilder setExcludeFields(String... strArr) {
        this.e = strArr;
        return this;
    }

    public EqualsBuilder setReflectUpToClass(Class<?> cls) {
        this.d = cls;
        return this;
    }

    public EqualsBuilder setTestRecursive(boolean z) {
        this.c = z;
        return this;
    }

    public EqualsBuilder setTestTransients(boolean z) {
        this.b = z;
        return this;
    }

    public static boolean reflectionEquals(Object obj, Object obj2, String... strArr) {
        return reflectionEquals(obj, obj2, false, null, strArr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.builder.Builder
    public Boolean build() {
        return Boolean.valueOf(isEquals());
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z) {
        return reflectionEquals(obj, obj2, z, null, new String[0]);
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z, Class<?> cls, String... strArr) {
        return reflectionEquals(obj, obj2, z, cls, false, strArr);
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z, Class<?> cls, boolean z2, String... strArr) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return new EqualsBuilder().setExcludeFields(strArr).setReflectUpToClass(cls).setTestTransients(z).setTestRecursive(z2).reflectionAppend(obj, obj2).isEquals();
    }

    public EqualsBuilder append(long j, long j2) {
        if (!this.a) {
            return this;
        }
        this.a = j == j2;
        return this;
    }

    public EqualsBuilder append(int i, int i2) {
        if (!this.a) {
            return this;
        }
        this.a = i == i2;
        return this;
    }

    public EqualsBuilder append(short s, short s2) {
        if (!this.a) {
            return this;
        }
        this.a = s == s2;
        return this;
    }

    public EqualsBuilder append(char c, char c2) {
        if (!this.a) {
            return this;
        }
        this.a = c == c2;
        return this;
    }

    public EqualsBuilder append(byte b, byte b2) {
        if (!this.a) {
            return this;
        }
        this.a = b == b2;
        return this;
    }

    public EqualsBuilder append(double d, double d2) {
        return !this.a ? this : append(Double.doubleToLongBits(d), Double.doubleToLongBits(d2));
    }

    public EqualsBuilder append(float f2, float f3) {
        return !this.a ? this : append(Float.floatToIntBits(f2), Float.floatToIntBits(f3));
    }

    public EqualsBuilder append(boolean z, boolean z2) {
        if (!this.a) {
            return this;
        }
        this.a = z == z2;
        return this;
    }

    public EqualsBuilder append(Object[] objArr, Object[] objArr2) {
        if (!this.a || objArr == objArr2) {
            return this;
        }
        if (objArr != null && objArr2 != null) {
            if (objArr.length != objArr2.length) {
                setEquals(false);
                return this;
            }
            for (int i = 0; i < objArr.length && this.a; i++) {
                append(objArr[i], objArr2[i]);
            }
            return this;
        }
        setEquals(false);
        return this;
    }

    public EqualsBuilder append(long[] jArr, long[] jArr2) {
        if (!this.a || jArr == jArr2) {
            return this;
        }
        if (jArr != null && jArr2 != null) {
            if (jArr.length != jArr2.length) {
                setEquals(false);
                return this;
            }
            for (int i = 0; i < jArr.length && this.a; i++) {
                append(jArr[i], jArr2[i]);
            }
            return this;
        }
        setEquals(false);
        return this;
    }

    public EqualsBuilder append(int[] iArr, int[] iArr2) {
        if (!this.a || iArr == iArr2) {
            return this;
        }
        if (iArr != null && iArr2 != null) {
            if (iArr.length != iArr2.length) {
                setEquals(false);
                return this;
            }
            for (int i = 0; i < iArr.length && this.a; i++) {
                append(iArr[i], iArr2[i]);
            }
            return this;
        }
        setEquals(false);
        return this;
    }

    public EqualsBuilder append(short[] sArr, short[] sArr2) {
        if (!this.a || sArr == sArr2) {
            return this;
        }
        if (sArr != null && sArr2 != null) {
            if (sArr.length != sArr2.length) {
                setEquals(false);
                return this;
            }
            for (int i = 0; i < sArr.length && this.a; i++) {
                append(sArr[i], sArr2[i]);
            }
            return this;
        }
        setEquals(false);
        return this;
    }

    public EqualsBuilder append(char[] cArr, char[] cArr2) {
        if (!this.a || cArr == cArr2) {
            return this;
        }
        if (cArr != null && cArr2 != null) {
            if (cArr.length != cArr2.length) {
                setEquals(false);
                return this;
            }
            for (int i = 0; i < cArr.length && this.a; i++) {
                append(cArr[i], cArr2[i]);
            }
            return this;
        }
        setEquals(false);
        return this;
    }

    public EqualsBuilder append(byte[] bArr, byte[] bArr2) {
        if (!this.a || bArr == bArr2) {
            return this;
        }
        if (bArr != null && bArr2 != null) {
            if (bArr.length != bArr2.length) {
                setEquals(false);
                return this;
            }
            for (int i = 0; i < bArr.length && this.a; i++) {
                append(bArr[i], bArr2[i]);
            }
            return this;
        }
        setEquals(false);
        return this;
    }

    public EqualsBuilder append(double[] dArr, double[] dArr2) {
        if (!this.a || dArr == dArr2) {
            return this;
        }
        if (dArr != null && dArr2 != null) {
            if (dArr.length != dArr2.length) {
                setEquals(false);
                return this;
            }
            for (int i = 0; i < dArr.length && this.a; i++) {
                append(dArr[i], dArr2[i]);
            }
            return this;
        }
        setEquals(false);
        return this;
    }

    public EqualsBuilder append(float[] fArr, float[] fArr2) {
        if (!this.a || fArr == fArr2) {
            return this;
        }
        if (fArr != null && fArr2 != null) {
            if (fArr.length != fArr2.length) {
                setEquals(false);
                return this;
            }
            for (int i = 0; i < fArr.length && this.a; i++) {
                append(fArr[i], fArr2[i]);
            }
            return this;
        }
        setEquals(false);
        return this;
    }

    public EqualsBuilder append(boolean[] zArr, boolean[] zArr2) {
        if (!this.a || zArr == zArr2) {
            return this;
        }
        if (zArr != null && zArr2 != null) {
            if (zArr.length != zArr2.length) {
                setEquals(false);
                return this;
            }
            for (int i = 0; i < zArr.length && this.a; i++) {
                append(zArr[i], zArr2[i]);
            }
            return this;
        }
        setEquals(false);
        return this;
    }
}
