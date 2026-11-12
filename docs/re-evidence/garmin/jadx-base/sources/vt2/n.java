package vt2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f180206a;

    public n(byte b14) {
        this.f180206a = b14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> n<?> b(T t7, boolean z14) {
        if (t7 == 0) {
            return new l((byte[]) null);
        }
        if (t7 instanceof n) {
            return (n) t7;
        }
        if (t7 instanceof Integer) {
            return new j(((Integer) t7).intValue());
        }
        if (t7 instanceof Long) {
            Number number = (Number) t7;
            long jLongValue = number.longValue();
            return (!z14 || jLongValue > 2147483647L || jLongValue < -2147483648L) ? new k(((Long) t7).longValue()) : new j(number.intValue());
        }
        if (t7 instanceof Float) {
            return new h(((Float) t7).floatValue());
        }
        if (t7 instanceof Double) {
            Number number2 = (Number) t7;
            float fFloatValue = number2.floatValue();
            return (!z14 || Math.abs(((double) fFloatValue) - number2.doubleValue()) >= 1.0E-5d) ? new g(((Double) t7).doubleValue()) : new h(fFloatValue);
        }
        if (t7 instanceof String) {
            return new m((String) t7);
        }
        if (t7 instanceof Character) {
            return new e(Integer.valueOf(((Character) t7).charValue()));
        }
        if (t7 instanceof List) {
            List list = (List) t7;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof Byte) {
                    }
                }
                return new d((List<Byte>) list);
            }
            return new b(list, z14);
        }
        if (t7 instanceof Boolean) {
            return new c(((Boolean) t7).booleanValue());
        }
        if (t7 instanceof Map) {
            return new i((Map) t7, z14);
        }
        if (!(t7 instanceof byte[])) {
            return new l((byte[]) null);
        }
        ArrayList arrayList = new ArrayList();
        for (byte b14 : (byte[]) t7) {
            arrayList.add(Byte.valueOf(b14));
        }
        return new d(arrayList);
    }

    public abstract int c();

    public abstract byte[] d();

    public abstract T e();

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return obj instanceof l ? this instanceof l : e().equals(((n) obj).e());
        }
        return false;
    }

    public int hashCode() {
        return e().hashCode();
    }
}
