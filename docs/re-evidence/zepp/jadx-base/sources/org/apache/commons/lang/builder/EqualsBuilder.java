package org.apache.commons.lang.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import org.apache.commons.lang.ArrayUtils;

/* JADX INFO: loaded from: classes23.dex */
public class EqualsBuilder {
    private boolean a = true;

    private static void a(Object obj, Object obj2, Class cls, EqualsBuilder equalsBuilder, boolean z, String[] strArr) {
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i = 0; i < declaredFields.length && equalsBuilder.a; i++) {
            Field field = declaredFields[i];
            if (!ArrayUtils.contains(strArr, field.getName()) && field.getName().indexOf(36) == -1 && ((z || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                try {
                    equalsBuilder.append(field.get(obj), field.get(obj2));
                } catch (IllegalAccessException unused) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
    }

    public static boolean reflectionEquals(Object obj, Object obj2) {
        return reflectionEquals(obj, obj2, false, null, null);
    }

    public EqualsBuilder append(Object obj, Object obj2) {
        if (!this.a || obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            setEquals(false);
            return this;
        }
        if (!obj.getClass().isArray()) {
            this.a = obj.equals(obj2);
        } else if (obj.getClass() != obj2.getClass()) {
            setEquals(false);
        } else if (obj instanceof long[]) {
            append((long[]) obj, (long[]) obj2);
        } else if (obj instanceof int[]) {
            append((int[]) obj, (int[]) obj2);
        } else if (obj instanceof short[]) {
            append((short[]) obj, (short[]) obj2);
        } else if (obj instanceof char[]) {
            append((char[]) obj, (char[]) obj2);
        } else if (obj instanceof byte[]) {
            append((byte[]) obj, (byte[]) obj2);
        } else if (obj instanceof double[]) {
            append((double[]) obj, (double[]) obj2);
        } else if (obj instanceof float[]) {
            append((float[]) obj, (float[]) obj2);
        } else if (obj instanceof boolean[]) {
            append((boolean[]) obj, (boolean[]) obj2);
        } else {
            append((Object[]) obj, (Object[]) obj2);
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

    public void reset() {
        this.a = true;
    }

    public void setEquals(boolean z) {
        this.a = z;
    }

    public static boolean reflectionEquals(Object obj, Object obj2, Collection collection) {
        return reflectionEquals(obj, obj2, ReflectionToStringBuilder.a(collection));
    }

    public static boolean reflectionEquals(Object obj, Object obj2, String[] strArr) {
        return reflectionEquals(obj, obj2, false, null, strArr);
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z) {
        return reflectionEquals(obj, obj2, z, null, null);
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z, Class cls) {
        return reflectionEquals(obj, obj2, z, cls, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    public static boolean reflectionEquals(Object obj, Object obj2, boolean z, Class cls, String[] strArr) {
        EqualsBuilder equalsBuilder;
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            Class<?> superclass = obj.getClass();
            Class<?> cls2 = obj2.getClass();
            if (superclass.isInstance(obj2)) {
                if (!cls2.isInstance(obj)) {
                    superclass = cls2;
                }
                equalsBuilder = new EqualsBuilder();
                try {
                    a(obj, obj2, superclass, equalsBuilder, z, strArr);
                    while (superclass.getSuperclass() != null && superclass != cls) {
                        superclass = superclass.getSuperclass();
                        a(obj, obj2, superclass, equalsBuilder, z, strArr);
                    }
                    return equalsBuilder.isEquals();
                } catch (IllegalArgumentException unused) {
                }
            } else if (cls2.isInstance(obj)) {
                if (superclass.isInstance(obj2)) {
                    superclass = cls2;
                }
                equalsBuilder = new EqualsBuilder();
                a(obj, obj2, superclass, equalsBuilder, z, strArr);
                while (superclass.getSuperclass() != null) {
                    superclass = superclass.getSuperclass();
                    a(obj, obj2, superclass, equalsBuilder, z, strArr);
                }
                return equalsBuilder.isEquals();
            }
        }
        return false;
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

    public EqualsBuilder append(float f, float f2) {
        return !this.a ? this : append(Float.floatToIntBits(f), Float.floatToIntBits(f2));
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
