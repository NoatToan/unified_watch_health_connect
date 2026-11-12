package cn.hutool.core.builder;

import cn.hutool.core.lang.Pair;
import defpackage.pqc;
import defpackage.qj1;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class EqualsBuilder implements Builder<Boolean> {
    private static final ThreadLocal<Set<Pair<pqc, pqc>>> REGISTRY = new ThreadLocal<>();
    private static final long serialVersionUID = 1;
    private boolean isEquals = true;

    public static Pair<pqc, pqc> getRegisterPair(Object obj, Object obj2) {
        return new Pair<>(new pqc(obj), new pqc(obj2));
    }

    public static Set<Pair<pqc, pqc>> getRegistry() {
        return REGISTRY.get();
    }

    public static boolean isRegistered(Object obj, Object obj2) {
        Set<Pair<pqc, pqc>> registry = getRegistry();
        Pair<pqc, pqc> registerPair = getRegisterPair(obj, obj2);
        return registry != null && (registry.contains(registerPair) || registry.contains(new Pair(registerPair.getKey(), registerPair.getValue())));
    }

    private static void reflectionAppend(Object obj, Object obj2, Class<?> cls, EqualsBuilder equalsBuilder, boolean z, String[] strArr) {
        if (isRegistered(obj, obj2)) {
            return;
        }
        try {
            register(obj, obj2);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i = 0; i < declaredFields.length && equalsBuilder.isEquals; i++) {
                Field field = declaredFields[i];
                if (!qj1.o(strArr, field.getName()) && field.getName().indexOf(36) == -1 && (z || !Modifier.isTransient(field.getModifiers()))) {
                    if (Modifier.isStatic(field.getModifiers())) {
                        continue;
                    } else {
                        try {
                            equalsBuilder.append(field.get(obj), field.get(obj2));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            }
            unregister(obj, obj2);
        } catch (Throwable th) {
            unregister(obj, obj2);
            throw th;
        }
    }

    public static boolean reflectionEquals(Object obj, Object obj2, Collection<String> collection) {
        return reflectionEquals(obj, obj2, (String[]) qj1.P(collection, String.class));
    }

    public static void register(Object obj, Object obj2) {
        synchronized (EqualsBuilder.class) {
            try {
                if (getRegistry() == null) {
                    REGISTRY.set(new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        getRegistry().add(getRegisterPair(obj, obj2));
    }

    public static void unregister(Object obj, Object obj2) {
        Set<Pair<pqc, pqc>> registry = getRegistry();
        if (registry != null) {
            registry.remove(getRegisterPair(obj, obj2));
            synchronized (EqualsBuilder.class) {
                try {
                    Set<Pair<pqc, pqc>> registry2 = getRegistry();
                    if (registry2 != null && registry2.isEmpty()) {
                        REGISTRY.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public EqualsBuilder append(Object obj, Object obj2) {
        if (!this.isEquals || obj == obj2) {
            return this;
        }
        if (obj == null || obj2 == null) {
            return setEquals(false);
        }
        return qj1.B(obj) ? setEquals(qj1.r(obj, obj2)) : setEquals(obj.equals(obj2));
    }

    public EqualsBuilder appendSuper(boolean z) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = z;
        return this;
    }

    public boolean isEquals() {
        return this.isEquals;
    }

    public void reset() {
        this.isEquals = true;
    }

    public EqualsBuilder setEquals(boolean z) {
        this.isEquals = z;
        return this;
    }

    public static boolean reflectionEquals(Object obj, Object obj2, String... strArr) {
        return reflectionEquals(obj, obj2, false, null, strArr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.builder.Builder
    public Boolean build() {
        return Boolean.valueOf(isEquals());
    }

    public static boolean reflectionEquals(Object obj, Object obj2, boolean z) {
        return reflectionEquals(obj, obj2, z, null, new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0039 A[Catch: IllegalArgumentException -> 0x0061, TryCatch #0 {IllegalArgumentException -> 0x0061, blocks: (B:21:0x0033, B:23:0x0039, B:24:0x003d, B:25:0x0046, B:28:0x004e), top: B:34:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x003d A[Catch: IllegalArgumentException -> 0x0061, TryCatch #0 {IllegalArgumentException -> 0x0061, blocks: (B:21:0x0033, B:23:0x0039, B:24:0x003d, B:25:0x0046, B:28:0x004e), top: B:34:0x0033 }] */
    public static boolean reflectionEquals(Object obj, Object obj2, boolean z, Class<?> cls, String... strArr) {
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
                    if (superclass.isArray()) {
                        equalsBuilder.append(obj, obj2);
                    } else {
                        reflectionAppend(obj, obj2, superclass, equalsBuilder, z, strArr);
                        while (superclass.getSuperclass() != null && superclass != cls) {
                            superclass = superclass.getSuperclass();
                            reflectionAppend(obj, obj2, superclass, equalsBuilder, z, strArr);
                        }
                    }
                    return equalsBuilder.isEquals();
                } catch (IllegalArgumentException unused) {
                }
            } else if (cls2.isInstance(obj)) {
                if (superclass.isInstance(obj2)) {
                    superclass = cls2;
                }
                equalsBuilder = new EqualsBuilder();
                if (superclass.isArray()) {
                    equalsBuilder.append(obj, obj2);
                } else {
                    reflectionAppend(obj, obj2, superclass, equalsBuilder, z, strArr);
                    while (superclass.getSuperclass() != null) {
                        superclass = superclass.getSuperclass();
                        reflectionAppend(obj, obj2, superclass, equalsBuilder, z, strArr);
                    }
                }
                return equalsBuilder.isEquals();
            }
        }
        return false;
    }

    public EqualsBuilder append(long j, long j2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = j == j2;
        return this;
    }

    public EqualsBuilder append(int i, int i2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = i == i2;
        return this;
    }

    public EqualsBuilder append(short s, short s2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = s == s2;
        return this;
    }

    public EqualsBuilder append(char c, char c2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = c == c2;
        return this;
    }

    public EqualsBuilder append(byte b2, byte b3) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = b2 == b3;
        return this;
    }

    public EqualsBuilder append(double d, double d2) {
        return !this.isEquals ? this : append(Double.doubleToLongBits(d), Double.doubleToLongBits(d2));
    }

    public EqualsBuilder append(float f, float f2) {
        return !this.isEquals ? this : append(Float.floatToIntBits(f), Float.floatToIntBits(f2));
    }

    public EqualsBuilder append(boolean z, boolean z2) {
        if (!this.isEquals) {
            return this;
        }
        this.isEquals = z == z2;
        return this;
    }
}
