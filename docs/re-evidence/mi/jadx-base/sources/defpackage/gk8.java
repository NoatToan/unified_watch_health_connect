package defpackage;

import androidx.health.platform.client.proto.y;

/* JADX INFO: loaded from: classes.dex */
public final class gk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f19076a = c();

    public static y a() {
        y yVarB = b("getEmptyRegistry");
        return yVarB != null ? yVarB : y.d;
    }

    public static final y b(String str) {
        Class<?> cls = f19076a;
        if (cls == null) {
            return null;
        }
        try {
            return (y) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class<?> c() {
        try {
            return Class.forName("androidx.health.platform.client.proto.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
