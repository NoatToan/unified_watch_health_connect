package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes21.dex */
public class ahr {
    public static Object d(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> clsV = ahw.v(rawClass);
        if (clsV != null) {
            return ahw.b(clsV);
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

    public static String a(JavaType javaType) {
        String str;
        String str2;
        String name = javaType.getRawClass().getName();
        if (b(name)) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else {
            if (!c(name)) {
                return null;
            }
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", str, ahw.a(javaType), str2);
    }

    private static boolean b(String str) {
        return str.startsWith("java.time.");
    }

    private static boolean c(String str) {
        return str.startsWith("org.joda.time.");
    }
}
