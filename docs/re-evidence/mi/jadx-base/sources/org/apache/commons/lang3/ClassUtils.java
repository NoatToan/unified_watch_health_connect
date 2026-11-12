package org.apache.commons.lang3;

import com.xiaomi.onetrack.api.c;
import defpackage.mlo;
import defpackage.nyo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public class ClassUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f29462a = String.valueOf('.');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f29463b = String.valueOf(Typography.dollar);
    public static final Map<Class<?>, Class<?>> c;
    public static final Map<Class<?>, Class<?>> d;
    public static final Map<String, String> e;
    public static final Map<String, String> f;

    public enum Interfaces {
        INCLUDE,
        EXCLUDE
    }

    static {
        HashMap map = new HashMap();
        c = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        Class cls = Void.TYPE;
        map.put(cls, cls);
        d = new HashMap();
        for (Class<?> cls2 : map.keySet()) {
            Class<?> cls3 = c.get(cls2);
            if (!cls2.equals(cls3)) {
                d.put(cls3, cls2);
            }
        }
        HashMap map2 = new HashMap();
        map2.put("int", "I");
        map2.put("boolean", "Z");
        map2.put("float", "F");
        map2.put("long", "J");
        map2.put("short", "S");
        map2.put("byte", c.f13755a);
        map2.put("double", "D");
        map2.put("char", "C");
        map2.put("void", "V");
        HashMap map3 = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            map3.put(entry.getValue(), entry.getKey());
        }
        e = Collections.unmodifiableMap(map2);
        f = Collections.unmodifiableMap(map3);
    }

    public static String a(Class<?> cls) {
        return cls == null ? "" : b(cls.getName());
    }

    public static String b(String str) {
        if (mlo.c(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
            Map<String, String> map = f;
            if (map.containsKey(str)) {
                str = map.get(str);
            }
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iIndexOf = str.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace(Typography.dollar, '.');
        }
        return strSubstring + ((Object) sb);
    }

    public static boolean c(Class<?> cls, Class<?> cls2) {
        return d(cls, cls2, nyo.e(JavaVersion.JAVA_1_5));
    }

    public static boolean d(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = f(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = g(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return cls2.isAssignableFrom(cls);
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        Class cls3 = Integer.TYPE;
        if (cls3.equals(cls)) {
            return Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
        }
        Class cls4 = Long.TYPE;
        if (cls4.equals(cls)) {
            return Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
        }
        if (Boolean.TYPE.equals(cls)) {
            return false;
        }
        Class cls5 = Double.TYPE;
        if (cls5.equals(cls)) {
            return false;
        }
        Class cls6 = Float.TYPE;
        if (cls6.equals(cls)) {
            return cls5.equals(cls2);
        }
        if (Character.TYPE.equals(cls)) {
            return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        Class cls7 = Short.TYPE;
        if (cls7.equals(cls)) {
            return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        if (Byte.TYPE.equals(cls)) {
            return cls7.equals(cls2) || cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
        }
        return false;
    }

    public static boolean e(Class<?> cls) {
        return d.containsKey(cls);
    }

    public static Class<?> f(Class<?> cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : c.get(cls);
    }

    public static Class<?> g(Class<?> cls) {
        return d.get(cls);
    }
}
