package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class EqualsBuilder implements Builder<Boolean> {
    private static final ThreadLocal<Set<Pair<IDKey, IDKey>>> REGISTRY = new ThreadLocal<>();
    private List<Class<?>> bypassReflectionClasses;
    private String[] excludeFields;
    private boolean isEquals = true;
    private Class<?> reflectUpToClass;
    private boolean testRecursive;
    private boolean testTransients;

    public EqualsBuilder() {
        ArrayList arrayList = new ArrayList();
        this.bypassReflectionClasses = arrayList;
        arrayList.add(String.class);
    }

    private void appendArray(Object obj, Object obj2) {
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

    public static Pair<IDKey, IDKey> getRegisterPair(Object obj, Object obj2) {
        return Pair.of(new IDKey(obj), new IDKey(obj2));
    }

    public static Set<Pair<IDKey, IDKey>> getRegistry() {
        return REGISTRY.get();
    }

    public static boolean isRegistered(Object obj, Object obj2) {
        Set<Pair<IDKey, IDKey>> registry = getRegistry();
        Pair<IDKey, IDKey> registerPair = getRegisterPair(obj, obj2);
        Pair pairOf = Pair.of(registerPair.getRight(), registerPair.getLeft());
        if (registry != null) {
            return registry.contains(registerPair) || registry.contains(pairOf);
        }
        return false;
    }

    private void reflectionAppend(Object obj, Object obj2, Class<?> cls) {
        if (isRegistered(obj, obj2)) {
            return;
        }
        try {
            register(obj, obj2);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i14 = 0; i14 < declaredFields.length && this.isEquals; i14++) {
                Field field = declaredFields[i14];
                if (!ArrayUtils.contains(this.excludeFields, field.getName()) && !field.getName().contains("$") && (this.testTransients || !Modifier.isTransient(field.getModifiers()))) {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(EqualsExclude.class)) {
                        try {
                            append(field.get(obj), field.get(obj2));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            }
            unregister(obj, obj2);
        } catch (Throwable th3) {
            unregister(obj, obj2);
            throw th3;
        }
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z14, Class<?> cls, boolean z15, String... strArr) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return new EqualsBuilder().setExcludeFields(strArr).setReflectUpToClass(cls).setTestTransients(z14).setTestRecursive(z15).reflectionAppend(obj, obj2).isEquals();
    }

    private static void register(Object obj, Object obj2) {
        Set<Pair<IDKey, IDKey>> registry = getRegistry();
        if (registry == null) {
            registry = new HashSet<>();
            REGISTRY.set(registry);
        }
        registry.add(getRegisterPair(obj, obj2));
    }

    private static void unregister(Object obj, Object obj2) {
        Set<Pair<IDKey, IDKey>> registry = getRegistry();
        if (registry != null) {
            registry.remove(getRegisterPair(obj, obj2));
            if (registry.isEmpty()) {
                REGISTRY.remove();
            }
        }
    }

    public EqualsBuilder append(Object obj, Object obj2) {
        if (!this.isEquals || obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            setEquals(false);
            return this;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            appendArray(obj, obj2);
            return this;
        }
        if (!this.testRecursive || ClassUtils.isPrimitiveOrWrapper(cls)) {
            this.isEquals = obj.equals(obj2);
            return this;
        }
        reflectionAppend(obj, obj2);
        return this;
    }

    public EqualsBuilder appendSuper(boolean z14) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = z14;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.builder.Builder
    public Boolean build() {
        return Boolean.valueOf(isEquals());
    }

    public boolean isEquals() {
        return this.isEquals;
    }

    public void reset() {
        this.isEquals = true;
    }

    public EqualsBuilder setBypassReflectionClasses(List<Class<?>> list) {
        this.bypassReflectionClasses = list;
        return this;
    }

    public void setEquals(boolean z14) {
        this.isEquals = z14;
    }

    public EqualsBuilder setExcludeFields(String... strArr) {
        this.excludeFields = strArr;
        return this;
    }

    public EqualsBuilder setReflectUpToClass(Class<?> cls) {
        this.reflectUpToClass = cls;
        return this;
    }

    public EqualsBuilder setTestRecursive(boolean z14) {
        this.testRecursive = z14;
        return this;
    }

    public EqualsBuilder setTestTransients(boolean z14) {
        this.testTransients = z14;
        return this;
    }

    public static boolean reflectionEquals(Object obj, Object obj2, String... strArr) {
        return reflectionEquals(obj, obj2, false, null, strArr);
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z14) {
        return reflectionEquals(obj, obj2, z14, null, new String[0]);
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z14, Class<?> cls, String... strArr) {
        return reflectionEquals(obj, obj2, z14, cls, false, strArr);
    }

    public static boolean reflectionEquals(Object obj, Object obj2, Collection<String> collection) {
        return reflectionEquals(obj, obj2, ReflectionToStringBuilder.toNoNullStringArray(collection));
    }

    public EqualsBuilder append(long j8, long j14) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = j8 == j14;
        return this;
    }

    public EqualsBuilder append(int i14, int i15) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = i14 == i15;
        return this;
    }

    public EqualsBuilder append(short s8, short s14) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = s8 == s14;
        return this;
    }

    public EqualsBuilder append(char c14, char c15) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = c14 == c15;
        return this;
    }

    public EqualsBuilder append(byte b14, byte b15) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = b14 == b15;
        return this;
    }

    public EqualsBuilder append(double d14, double d15) {
        return !this.isEquals ? this : append(Double.doubleToLongBits(d14), Double.doubleToLongBits(d15));
    }

    public EqualsBuilder append(float f14, float f15) {
        return !this.isEquals ? this : append(Float.floatToIntBits(f14), Float.floatToIntBits(f15));
    }

    public EqualsBuilder append(boolean z14, boolean z15) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = z14 == z15;
        return this;
    }

    public EqualsBuilder append(Object[] objArr, Object[] objArr2) {
        if (this.isEquals && objArr != objArr2) {
            if (objArr != null && objArr2 != null) {
                if (objArr.length != objArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i14 = 0; i14 < objArr.length && this.isEquals; i14++) {
                    append(objArr[i14], objArr2[i14]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(long[] jArr, long[] jArr2) {
        if (this.isEquals && jArr != jArr2) {
            if (jArr != null && jArr2 != null) {
                if (jArr.length != jArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i14 = 0; i14 < jArr.length && this.isEquals; i14++) {
                    append(jArr[i14], jArr2[i14]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(int[] iArr, int[] iArr2) {
        if (this.isEquals && iArr != iArr2) {
            if (iArr != null && iArr2 != null) {
                if (iArr.length != iArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i14 = 0; i14 < iArr.length && this.isEquals; i14++) {
                    append(iArr[i14], iArr2[i14]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(short[] sArr, short[] sArr2) {
        if (this.isEquals && sArr != sArr2) {
            if (sArr != null && sArr2 != null) {
                if (sArr.length != sArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i14 = 0; i14 < sArr.length && this.isEquals; i14++) {
                    append(sArr[i14], sArr2[i14]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(char[] cArr, char[] cArr2) {
        if (this.isEquals && cArr != cArr2) {
            if (cArr != null && cArr2 != null) {
                if (cArr.length != cArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i14 = 0; i14 < cArr.length && this.isEquals; i14++) {
                    append(cArr[i14], cArr2[i14]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(byte[] bArr, byte[] bArr2) {
        if (this.isEquals && bArr != bArr2) {
            if (bArr != null && bArr2 != null) {
                if (bArr.length != bArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i14 = 0; i14 < bArr.length && this.isEquals; i14++) {
                    append(bArr[i14], bArr2[i14]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(double[] dArr, double[] dArr2) {
        if (this.isEquals && dArr != dArr2) {
            if (dArr != null && dArr2 != null) {
                if (dArr.length != dArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i14 = 0; i14 < dArr.length && this.isEquals; i14++) {
                    append(dArr[i14], dArr2[i14]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(float[] fArr, float[] fArr2) {
        if (this.isEquals && fArr != fArr2) {
            if (fArr != null && fArr2 != null) {
                if (fArr.length != fArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i14 = 0; i14 < fArr.length && this.isEquals; i14++) {
                    append(fArr[i14], fArr2[i14]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    public EqualsBuilder append(boolean[] zArr, boolean[] zArr2) {
        if (this.isEquals && zArr != zArr2) {
            if (zArr != null && zArr2 != null) {
                if (zArr.length != zArr2.length) {
                    setEquals(false);
                    return this;
                }
                for (int i14 = 0; i14 < zArr.length && this.isEquals; i14++) {
                    append(zArr[i14], zArr2[i14]);
                }
            } else {
                setEquals(false);
                return this;
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0032  */
    public EqualsBuilder reflectionAppend(Object obj, Object obj2) {
        Class<?> superclass;
        if (this.isEquals && obj != obj2) {
            if (obj != null && obj2 != null) {
                Class<?> cls = obj.getClass();
                Class<?> cls2 = obj2.getClass();
                if (cls.isInstance(obj2)) {
                    if (cls2.isInstance(obj)) {
                        superclass = cls;
                    } else {
                        superclass = cls2;
                    }
                } else if (cls2.isInstance(obj)) {
                    if (cls.isInstance(obj2)) {
                        superclass = cls2;
                    } else {
                        superclass = cls;
                    }
                } else {
                    this.isEquals = false;
                    return this;
                }
                try {
                    if (superclass.isArray()) {
                        append(obj, obj2);
                        return this;
                    }
                    List<Class<?>> list = this.bypassReflectionClasses;
                    if (list != null && (list.contains(cls) || this.bypassReflectionClasses.contains(cls2))) {
                        this.isEquals = obj.equals(obj2);
                        return this;
                    }
                    reflectionAppend(obj, obj2, superclass);
                    while (superclass.getSuperclass() != null && superclass != this.reflectUpToClass) {
                        superclass = superclass.getSuperclass();
                        reflectionAppend(obj, obj2, superclass);
                    }
                } catch (IllegalArgumentException unused) {
                    this.isEquals = false;
                    return this;
                }
            } else {
                this.isEquals = false;
                return this;
            }
        }
        return this;
    }
}
