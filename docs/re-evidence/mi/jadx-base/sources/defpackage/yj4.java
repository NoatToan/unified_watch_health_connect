package defpackage;

import cn.hutool.core.convert.ConvertException;
import cn.hutool.core.convert.ConverterRegistry;
import cn.hutool.core.convert.impl.EnumConverter;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class yj4 {
    public static <T> T a(Class<T> cls, Object obj) throws ConvertException {
        return (T) c(cls, obj);
    }

    public static <T> T b(Class<T> cls, Object obj, T t) throws ConvertException {
        return (T) d(cls, obj, t);
    }

    public static <T> T c(Type type, Object obj) throws ConvertException {
        return (T) d(type, obj, null);
    }

    public static <T> T d(Type type, Object obj, T t) throws ConvertException {
        return (T) f(type, obj, t, false);
    }

    public static <T> T e(Type type, Object obj, T t) {
        return (T) f(type, obj, t, true);
    }

    public static <T> T f(Type type, Object obj, T t, boolean z) throws Exception {
        try {
            return (T) ConverterRegistry.getInstance().convert(type, obj, t);
        } catch (Exception e) {
            if (z) {
                return t;
            }
            throw e;
        }
    }

    public static BigDecimal g(Object obj) {
        return h(obj, null);
    }

    public static BigDecimal h(Object obj, BigDecimal bigDecimal) {
        return (BigDecimal) e(BigDecimal.class, obj, bigDecimal);
    }

    public static BigInteger i(Object obj) {
        return j(obj, null);
    }

    public static BigInteger j(Object obj, BigInteger bigInteger) {
        return (BigInteger) e(BigInteger.class, obj, bigInteger);
    }

    public static Boolean k(Object obj, Boolean bool) {
        return (Boolean) e(Boolean.class, obj, bool);
    }

    public static Byte l(Object obj, Byte b2) {
        return (Byte) e(Byte.class, obj, b2);
    }

    public static Character m(Object obj, Character ch) {
        return (Character) e(Character.class, obj, ch);
    }

    public static Date n(Object obj, Date date) {
        return (Date) e(Date.class, obj, date);
    }

    public static Double o(Object obj, Double d) {
        return (Double) e(Double.class, obj, d);
    }

    public static <E extends Enum<E>> E p(Class<E> cls, Object obj) {
        return (E) q(cls, obj, null);
    }

    public static <E extends Enum<E>> E q(Class<E> cls, Object obj, E e) {
        return (E) new EnumConverter(cls).convertQuietly(obj, e);
    }

    public static Float r(Object obj, Float f) {
        return (Float) e(Float.class, obj, f);
    }

    public static Integer s(Object obj) {
        return t(obj, null);
    }

    public static Integer t(Object obj, Integer num) {
        return (Integer) e(Integer.class, obj, num);
    }

    public static Long u(Object obj, Long l) {
        return (Long) e(Long.class, obj, l);
    }

    public static Short v(Object obj, Short sh) {
        return (Short) e(Short.class, obj, sh);
    }

    public static String w(Object obj) {
        return x(obj, null);
    }

    public static String x(Object obj, String str) {
        return (String) e(String.class, obj, str);
    }

    public static String[] y(Object obj) {
        return (String[]) a(String[].class, obj);
    }
}
