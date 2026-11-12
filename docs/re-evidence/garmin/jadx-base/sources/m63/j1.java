package m63;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 {
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    public static final <T> i63.c<T> a(Class<T> cls, i63.c<Object>... cVarArr) {
        Object obj;
        i63.c<T> cVar;
        Class<?> cls2;
        Object obj2;
        i63.c<T> cVarB;
        Field field;
        cls.getClass();
        if (cls.isEnum() && cls.getAnnotation(i63.h.class) == null && cls.getAnnotation(i63.d.class) == null) {
            T[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new b0(canonicalName, (Enum[]) enumConstants);
        }
        i63.c[] cVarArr2 = (i63.c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        i63.c<T> cVarB2 = obj == null ? null : b(obj, (i63.c[]) Arrays.copyOf(cVarArr2, cVarArr2.length));
        if (cVarB2 != null) {
            return cVarB2;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 == null || d53.u.y(canonicalName2, "java.", false) || d53.u.y(canonicalName2, "kotlin.", false)) {
            cVar = null;
        } else {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            Field field2 = null;
            int i14 = 0;
            boolean z14 = false;
            while (true) {
                if (i14 >= length) {
                    if (!z14) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i14];
                if (p005kotlin.jvm.internal.s.g(field3.getName(), "INSTANCE") && p005kotlin.jvm.internal.s.g(field3.getType(), cls) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z14) {
                        z14 = true;
                        field2 = field3;
                    }
                }
                i14++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                cVar = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length2 = methods.length;
                Method method = null;
                int i15 = 0;
                boolean z15 = false;
                while (true) {
                    if (i15 >= length2) {
                        if (!z15) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i15];
                    if (p005kotlin.jvm.internal.s.g(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && p005kotlin.jvm.internal.s.g(method2.getReturnType(), i63.c.class)) {
                            if (!z15) {
                                z15 = true;
                                method = method2;
                            }
                        }
                    }
                    i15++;
                    method = null;
                    break;
                }
                if (method == null) {
                    cVar = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof i63.c) {
                        cVar = (i63.c) objInvoke;
                    } else {
                        cVar = null;
                    }
                }
            }
        }
        if (cVar != null) {
            return cVar;
        }
        i63.c[] cVarArr3 = (i63.c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        declaredClasses.getClass();
        int length3 = declaredClasses.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length3) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i16];
            if (cls2.getAnnotation(a1.class) != null) {
                break;
            }
            i16++;
        }
        if (cls2 == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = cls.getDeclaredField(cls2.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (cVarB = b(obj2, (i63.c[]) Arrays.copyOf(cVarArr3, cVarArr3.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                declaredClasses2.getClass();
                int length4 = declaredClasses2.length;
                Class<?> cls3 = null;
                int i17 = 0;
                boolean z16 = false;
                while (true) {
                    if (i17 < length4) {
                        Class<?> cls4 = declaredClasses2[i17];
                        if (cls4.getSimpleName().equals("$serializer")) {
                            if (!z16) {
                                z16 = true;
                                cls3 = cls4;
                            }
                        }
                        i17++;
                    } else if (!z16) {
                    }
                    cls3 = null;
                    break;
                }
                Object obj4 = (cls3 == null || (field = cls3.getField("INSTANCE")) == null) ? null : field.get(null);
                cVarB = obj4 instanceof i63.c ? (i63.c) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (cVarB != null) {
            return cVarB;
        }
        if (cls.getAnnotation(i63.d.class) == null) {
            i63.h hVar = (i63.h) cls.getAnnotation(i63.h.class);
            if (hVar == null) {
                return null;
            }
            Class<? extends i63.c<?>> clsWith = hVar.with();
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            if (!t0Var.b(clsWith).equals(t0Var.b(i63.e.class))) {
                return null;
            }
        }
        return new i63.e(p005kotlin.jvm.internal.s0.f105811a.b(cls));
    }

    public static final <T> i63.c<T> b(Object obj, i63.c<Object>... cVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (cVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = cVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i14 = 0; i14 < length; i14++) {
                    clsArr2[i14] = i63.c.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(cVarArr, cVarArr.length));
            if (objInvoke instanceof i63.c) {
                return (i63.c) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                throw e4;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e4.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }
}
