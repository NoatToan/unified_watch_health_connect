package org.apache.commons.lang3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ObjectUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Null f29464a = new Null();

    public static class Null implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        private Object readResolve() {
            return ObjectUtils.f29464a;
        }
    }

    public static <T> T a(T t, T t2) {
        return t != null ? t : t2;
    }

    @Deprecated
    public static boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    @Deprecated
    public static int c(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String d(Object obj) {
        if (obj == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f(sb, obj);
        return sb.toString();
    }

    public static void e(StringBuffer stringBuffer, Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot get the toString of a null identity");
        }
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void f(StringBuilder sb, Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot get the toString of a null identity");
        }
        sb.append(obj.getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static boolean g(Object obj, Object obj2) {
        return !b(obj, obj2);
    }

    @Deprecated
    public static String h(Object obj) {
        return obj == null ? "" : obj.toString();
    }
}
