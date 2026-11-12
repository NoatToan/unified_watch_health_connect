package defpackage;

import com.google.protobuf.s;
import com.google.protobuf.t;

/* JADX INFO: loaded from: classes5.dex */
public final class ik8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f21249a = c();

    public static t a() {
        t tVarB = b("getEmptyRegistry");
        return tVarB != null ? tVarB : t.e;
    }

    public static final t b(String str) {
        Class<?> cls = f21249a;
        if (cls == null) {
            return null;
        }
        try {
            return (t) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class<?> c() {
        try {
            s sVar = s.j;
            return s.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
