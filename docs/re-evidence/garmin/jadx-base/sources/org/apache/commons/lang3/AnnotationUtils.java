package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/* JADX INFO: loaded from: classes3.dex */
public class AnnotationUtils {
    private static final ToStringStyle TO_STRING_STYLE = new ToStringStyle() { // from class: org.apache.commons.lang3.AnnotationUtils.1
        private static final long serialVersionUID = 1;

        {
            setDefaultFullDetail(true);
            setArrayContentDetail(true);
            setUseClassName(true);
            setUseShortClassName(true);
            setUseIdentityHashCode(false);
            setContentStart("(");
            setContentEnd(")");
            setFieldSeparator(", ");
            setArrayStart("[");
            setArrayEnd("]");
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public void appendDetail(StringBuffer stringBuffer, String str, Object obj) {
            if (obj instanceof Annotation) {
                obj = AnnotationUtils.toString((Annotation) obj);
            }
            super.appendDetail(stringBuffer, str, obj);
        }

        @Override // org.apache.commons.lang3.builder.ToStringStyle
        public String getShortClassName(Class<?> cls) {
            for (Class<?> cls2 : ClassUtils.getAllInterfaces(cls)) {
                if (Annotation.class.isAssignableFrom(cls2)) {
                    return "@".concat(cls2.getName());
                }
            }
            return "";
        }
    };

    private static boolean annotationArrayMemberEquals(Annotation[] annotationArr, Annotation[] annotationArr2) {
        if (annotationArr.length != annotationArr2.length) {
            return false;
        }
        for (int i14 = 0; i14 < annotationArr.length; i14++) {
            if (!equals(annotationArr[i14], annotationArr2[i14])) {
                return false;
            }
        }
        return true;
    }

    private static boolean arrayMemberEquals(Class<?> cls, Object obj, Object obj2) {
        if (cls.isAnnotation()) {
            return annotationArrayMemberEquals((Annotation[]) obj, (Annotation[]) obj2);
        }
        if (cls.equals(Byte.TYPE)) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if (cls.equals(Short.TYPE)) {
            return Arrays.equals((short[]) obj, (short[]) obj2);
        }
        if (cls.equals(Integer.TYPE)) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if (cls.equals(Character.TYPE)) {
            return Arrays.equals((char[]) obj, (char[]) obj2);
        }
        if (cls.equals(Long.TYPE)) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if (cls.equals(Float.TYPE)) {
            return Arrays.equals((float[]) obj, (float[]) obj2);
        }
        if (cls.equals(Double.TYPE)) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        return cls.equals(Boolean.TYPE) ? Arrays.equals((boolean[]) obj, (boolean[]) obj2) : Arrays.equals((Object[]) obj, (Object[]) obj2);
    }

    private static int arrayMemberHash(Class<?> cls, Object obj) {
        if (cls.equals(Byte.TYPE)) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (cls.equals(Short.TYPE)) {
            return Arrays.hashCode((short[]) obj);
        }
        if (cls.equals(Integer.TYPE)) {
            return Arrays.hashCode((int[]) obj);
        }
        if (cls.equals(Character.TYPE)) {
            return Arrays.hashCode((char[]) obj);
        }
        if (cls.equals(Long.TYPE)) {
            return Arrays.hashCode((long[]) obj);
        }
        if (cls.equals(Float.TYPE)) {
            return Arrays.hashCode((float[]) obj);
        }
        if (cls.equals(Double.TYPE)) {
            return Arrays.hashCode((double[]) obj);
        }
        return cls.equals(Boolean.TYPE) ? Arrays.hashCode((boolean[]) obj) : Arrays.hashCode((Object[]) obj);
    }

    public static boolean equals(Annotation annotation, Annotation annotation2) {
        if (annotation == annotation2) {
            return true;
        }
        if (annotation != null && annotation2 != null) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<? extends Annotation> clsAnnotationType2 = annotation2.annotationType();
            Validate.notNull(clsAnnotationType, "Annotation %s with null annotationType()", annotation);
            Validate.notNull(clsAnnotationType2, "Annotation %s with null annotationType()", annotation2);
            if (!clsAnnotationType.equals(clsAnnotationType2)) {
                return false;
            }
            try {
                for (Method method : clsAnnotationType.getDeclaredMethods()) {
                    if (method.getParameterTypes().length == 0 && isValidAnnotationMemberType(method.getReturnType())) {
                        if (!memberEquals(method.getReturnType(), method.invoke(annotation, null), method.invoke(annotation2, null))) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    public static int hashCode(Annotation annotation) {
        int iHashMember = 0;
        for (Method method : annotation.annotationType().getDeclaredMethods()) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Annotation method " + method + " returned null");
                }
                iHashMember += hashMember(method.getName(), objInvoke);
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception e14) {
                o2.c.p(e14);
                return 0;
            }
        }
        return iHashMember;
    }

    private static int hashMember(String str, Object obj) {
        int iHashCode;
        int iHashCode2 = str.hashCode() * 127;
        if (obj.getClass().isArray()) {
            iHashCode = arrayMemberHash(obj.getClass().getComponentType(), obj);
        } else {
            iHashCode = obj instanceof Annotation ? hashCode((Annotation) obj) : obj.hashCode();
        }
        return iHashCode2 ^ iHashCode;
    }

    public static boolean isValidAnnotationMemberType(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls.isPrimitive() || cls.isEnum() || cls.isAnnotation() || String.class.equals(cls) || Class.class.equals(cls);
    }

    private static boolean memberEquals(Class<?> cls, Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (cls.isArray()) {
            return arrayMemberEquals(cls.getComponentType(), obj, obj2);
        }
        return cls.isAnnotation() ? equals((Annotation) obj, (Annotation) obj2) : obj.equals(obj2);
    }

    public static String toString(Annotation annotation) {
        ToStringBuilder toStringBuilder = new ToStringBuilder(annotation, TO_STRING_STYLE);
        for (Method method : annotation.annotationType().getDeclaredMethods()) {
            if (method.getParameterTypes().length <= 0) {
                try {
                    toStringBuilder.append(method.getName(), method.invoke(annotation, null));
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception e14) {
                    o2.c.p(e14);
                    return null;
                }
            }
        }
        return toStringBuilder.build();
    }
}
