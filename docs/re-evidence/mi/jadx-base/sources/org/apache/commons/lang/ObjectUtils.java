package org.apache.commons.lang;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ObjectUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Null f29436a = new Null();

    public static class Null implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        private Object readResolve() {
            return ObjectUtils.f29436a;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static void c(StringBuffer stringBuffer, Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot get the toString of a null identity");
        }
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static boolean d(Object obj, Object obj2) {
        return !a(obj, obj2);
    }
}
