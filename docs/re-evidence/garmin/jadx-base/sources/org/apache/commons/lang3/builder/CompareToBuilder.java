package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import org.apache.commons.lang3.ArrayUtils;

/* JADX INFO: loaded from: classes3.dex */
public class CompareToBuilder implements Builder<Integer> {
    private int comparison = 0;

    private void appendArray(Object obj, Object obj2, Comparator<?> comparator) {
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
            append((Object[]) obj, (Object[]) obj2, comparator);
        }
    }

    private static void reflectionAppend(Object obj, Object obj2, Class<?> cls, CompareToBuilder compareToBuilder, boolean z14, String[] strArr) {
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i14 = 0; i14 < declaredFields.length && compareToBuilder.comparison == 0; i14++) {
            Field field = declaredFields[i14];
            if (!ArrayUtils.contains(strArr, field.getName()) && !field.getName().contains("$") && ((z14 || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                try {
                    compareToBuilder.append(field.get(obj), field.get(obj2));
                } catch (IllegalAccessException unused) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
    }

    public static int reflectionCompare(Object obj, Object obj2, boolean z14, Class<?> cls, String... strArr) {
        if (obj == obj2) {
            return 0;
        }
        Objects.requireNonNull(obj, "lhs");
        Objects.requireNonNull(obj2, "rhs");
        Class<?> cls2 = obj.getClass();
        if (!cls2.isInstance(obj2)) {
            throw new ClassCastException();
        }
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        boolean z15 = z14;
        String[] strArr2 = strArr;
        reflectionAppend(obj, obj2, cls2, compareToBuilder, z15, strArr2);
        while (cls2.getSuperclass() != null && cls2 != cls) {
            Class<? super Object> superclass = cls2.getSuperclass();
            CompareToBuilder compareToBuilder2 = compareToBuilder;
            boolean z16 = z15;
            String[] strArr3 = strArr2;
            reflectionAppend(obj, obj2, superclass, compareToBuilder2, z16, strArr3);
            cls2 = superclass;
            compareToBuilder = compareToBuilder2;
            z15 = z16;
            strArr2 = strArr3;
        }
        return compareToBuilder.toComparison();
    }

    public CompareToBuilder append(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.comparison != 0 || obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.comparison = -1;
            return this;
        }
        if (obj2 == null) {
            this.comparison = 1;
            return this;
        }
        if (obj.getClass().isArray()) {
            appendArray(obj, obj2, comparator);
            return this;
        }
        if (comparator == null) {
            this.comparison = ((Comparable) obj).compareTo(obj2);
            return this;
        }
        this.comparison = comparator.compare(obj, obj2);
        return this;
    }

    public CompareToBuilder appendSuper(int i14) {
        if (this.comparison != 0) {
            return this;
        }
        this.comparison = i14;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.builder.Builder
    public Integer build() {
        return Integer.valueOf(toComparison());
    }

    public int toComparison() {
        return this.comparison;
    }

    public CompareToBuilder append(Object obj, Object obj2) {
        return append(obj, obj2, (Comparator<?>) null);
    }

    public CompareToBuilder append(long j8, long j14) {
        if (this.comparison != 0) {
            return this;
        }
        this.comparison = Long.compare(j8, j14);
        return this;
    }

    public CompareToBuilder append(int i14, int i15) {
        if (this.comparison != 0) {
            return this;
        }
        this.comparison = Integer.compare(i14, i15);
        return this;
    }

    public CompareToBuilder append(short s8, short s14) {
        if (this.comparison != 0) {
            return this;
        }
        this.comparison = Short.compare(s8, s14);
        return this;
    }

    public CompareToBuilder append(char c14, char c15) {
        if (this.comparison != 0) {
            return this;
        }
        this.comparison = Character.compare(c14, c15);
        return this;
    }

    public CompareToBuilder append(byte b14, byte b15) {
        if (this.comparison != 0) {
            return this;
        }
        this.comparison = Byte.compare(b14, b15);
        return this;
    }

    public CompareToBuilder append(double d14, double d15) {
        if (this.comparison != 0) {
            return this;
        }
        this.comparison = Double.compare(d14, d15);
        return this;
    }

    public CompareToBuilder append(float f14, float f15) {
        if (this.comparison != 0) {
            return this;
        }
        this.comparison = Float.compare(f14, f15);
        return this;
    }

    public CompareToBuilder append(boolean z14, boolean z15) {
        if (this.comparison != 0 || z14 == z15) {
            return this;
        }
        if (z14) {
            this.comparison = 1;
            return this;
        }
        this.comparison = -1;
        return this;
    }

    public CompareToBuilder append(Object[] objArr, Object[] objArr2) {
        return append(objArr, objArr2, (Comparator<?>) null);
    }

    public CompareToBuilder append(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.comparison == 0 && objArr != objArr2) {
            if (objArr == null) {
                this.comparison = -1;
                return this;
            }
            if (objArr2 == null) {
                this.comparison = 1;
                return this;
            }
            if (objArr.length != objArr2.length) {
                this.comparison = objArr.length >= objArr2.length ? 1 : -1;
                return this;
            }
            for (int i14 = 0; i14 < objArr.length && this.comparison == 0; i14++) {
                append(objArr[i14], objArr2[i14], comparator);
            }
        }
        return this;
    }

    public static int reflectionCompare(Object obj, Object obj2, boolean z14) {
        return reflectionCompare(obj, obj2, z14, null, new String[0]);
    }

    public static int reflectionCompare(Object obj, Object obj2, Collection<String> collection) {
        return reflectionCompare(obj, obj2, ReflectionToStringBuilder.toNoNullStringArray(collection));
    }

    public static int reflectionCompare(Object obj, Object obj2, String... strArr) {
        return reflectionCompare(obj, obj2, false, null, strArr);
    }

    public static int reflectionCompare(Object obj, Object obj2) {
        return reflectionCompare(obj, obj2, false, null, new String[0]);
    }

    public CompareToBuilder append(long[] jArr, long[] jArr2) {
        if (this.comparison == 0 && jArr != jArr2) {
            if (jArr == null) {
                this.comparison = -1;
                return this;
            }
            if (jArr2 == null) {
                this.comparison = 1;
                return this;
            }
            if (jArr.length != jArr2.length) {
                this.comparison = jArr.length >= jArr2.length ? 1 : -1;
                return this;
            }
            for (int i14 = 0; i14 < jArr.length && this.comparison == 0; i14++) {
                append(jArr[i14], jArr2[i14]);
            }
        }
        return this;
    }

    public CompareToBuilder append(int[] iArr, int[] iArr2) {
        if (this.comparison == 0 && iArr != iArr2) {
            if (iArr == null) {
                this.comparison = -1;
                return this;
            }
            if (iArr2 == null) {
                this.comparison = 1;
                return this;
            }
            if (iArr.length != iArr2.length) {
                this.comparison = iArr.length >= iArr2.length ? 1 : -1;
                return this;
            }
            for (int i14 = 0; i14 < iArr.length && this.comparison == 0; i14++) {
                append(iArr[i14], iArr2[i14]);
            }
        }
        return this;
    }

    public CompareToBuilder append(short[] sArr, short[] sArr2) {
        if (this.comparison == 0 && sArr != sArr2) {
            if (sArr == null) {
                this.comparison = -1;
                return this;
            }
            if (sArr2 == null) {
                this.comparison = 1;
                return this;
            }
            if (sArr.length != sArr2.length) {
                this.comparison = sArr.length >= sArr2.length ? 1 : -1;
                return this;
            }
            for (int i14 = 0; i14 < sArr.length && this.comparison == 0; i14++) {
                append(sArr[i14], sArr2[i14]);
            }
        }
        return this;
    }

    public CompareToBuilder append(char[] cArr, char[] cArr2) {
        if (this.comparison == 0 && cArr != cArr2) {
            if (cArr == null) {
                this.comparison = -1;
                return this;
            }
            if (cArr2 == null) {
                this.comparison = 1;
                return this;
            }
            if (cArr.length != cArr2.length) {
                this.comparison = cArr.length >= cArr2.length ? 1 : -1;
                return this;
            }
            for (int i14 = 0; i14 < cArr.length && this.comparison == 0; i14++) {
                append(cArr[i14], cArr2[i14]);
            }
        }
        return this;
    }

    public CompareToBuilder append(byte[] bArr, byte[] bArr2) {
        if (this.comparison == 0 && bArr != bArr2) {
            if (bArr == null) {
                this.comparison = -1;
                return this;
            }
            if (bArr2 == null) {
                this.comparison = 1;
                return this;
            }
            if (bArr.length != bArr2.length) {
                this.comparison = bArr.length >= bArr2.length ? 1 : -1;
                return this;
            }
            for (int i14 = 0; i14 < bArr.length && this.comparison == 0; i14++) {
                append(bArr[i14], bArr2[i14]);
            }
        }
        return this;
    }

    public CompareToBuilder append(double[] dArr, double[] dArr2) {
        if (this.comparison == 0 && dArr != dArr2) {
            if (dArr == null) {
                this.comparison = -1;
                return this;
            }
            if (dArr2 == null) {
                this.comparison = 1;
                return this;
            }
            if (dArr.length != dArr2.length) {
                this.comparison = dArr.length >= dArr2.length ? 1 : -1;
                return this;
            }
            for (int i14 = 0; i14 < dArr.length && this.comparison == 0; i14++) {
                append(dArr[i14], dArr2[i14]);
            }
        }
        return this;
    }

    public CompareToBuilder append(float[] fArr, float[] fArr2) {
        if (this.comparison == 0 && fArr != fArr2) {
            if (fArr == null) {
                this.comparison = -1;
                return this;
            }
            if (fArr2 == null) {
                this.comparison = 1;
                return this;
            }
            if (fArr.length != fArr2.length) {
                this.comparison = fArr.length >= fArr2.length ? 1 : -1;
                return this;
            }
            for (int i14 = 0; i14 < fArr.length && this.comparison == 0; i14++) {
                append(fArr[i14], fArr2[i14]);
            }
        }
        return this;
    }

    public CompareToBuilder append(boolean[] zArr, boolean[] zArr2) {
        if (this.comparison == 0 && zArr != zArr2) {
            if (zArr == null) {
                this.comparison = -1;
                return this;
            }
            if (zArr2 == null) {
                this.comparison = 1;
                return this;
            }
            if (zArr.length != zArr2.length) {
                this.comparison = zArr.length >= zArr2.length ? 1 : -1;
                return this;
            }
            for (int i14 = 0; i14 < zArr.length && this.comparison == 0; i14++) {
                append(zArr[i14], zArr2[i14]);
            }
        }
        return this;
    }
}
