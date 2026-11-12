package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes4.dex */
public class qh2 {
    public static Object a(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> clsX = h04.X(rawClass);
        if (clsX != null) {
            return h04.l(clsX);
        }
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return JsonInclude.Include.NON_EMPTY;
        }
        if (rawClass == String.class) {
            return "";
        }
        if (javaType.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0L);
        }
        if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    public static boolean b(AnnotatedMethod annotatedMethod) {
        String strG;
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType.isArray() && (strG = h04.G(rawType.getComponentType())) != null && strG.contains(".cglib")) {
            return strG.startsWith("net.sf.cglib") || strG.startsWith("org.hibernate.repackage.cglib") || strG.startsWith("org.springframework.cglib");
        }
        return false;
    }

    public static boolean c(AnnotatedMethod annotatedMethod) {
        String strG = h04.G(annotatedMethod.getRawType());
        return strG != null && strG.startsWith("groovy.lang");
    }

    public static String d(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb.append((CharSequence) str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public static String e(AnnotatedMethod annotatedMethod, boolean z) {
        String name = annotatedMethod.getName();
        String strF = f(annotatedMethod, name, z);
        return strF == null ? h(annotatedMethod, name, z) : strF;
    }

    public static String f(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType == Boolean.class || rawType == Boolean.TYPE) {
            return z ? i(str, 2) : d(str, 2);
        }
        return null;
    }

    public static String g(AnnotatedMethod annotatedMethod, String str, boolean z) {
        String name = annotatedMethod.getName();
        if (name.startsWith(str)) {
            return z ? i(name, str.length()) : d(name, str.length());
        }
        return null;
    }

    public static String h(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (!str.startsWith("get")) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            if (b(annotatedMethod)) {
                return null;
            }
        } else if ("getMetaClass".equals(str) && c(annotatedMethod)) {
            return null;
        }
        return z ? i(str, 3) : d(str, 3);
    }

    public static String i(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i2, length);
        return sb.toString();
    }
}
