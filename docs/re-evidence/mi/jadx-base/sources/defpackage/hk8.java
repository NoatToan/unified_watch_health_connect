package defpackage;

import com.google.crypto.tink.shaded.protobuf.l;

/* JADX INFO: loaded from: classes5.dex */
public final class hk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f20159a = c();

    public static l a() {
        l lVarB = b("getEmptyRegistry");
        return lVarB != null ? lVarB : l.d;
    }

    public static final l b(String str) {
        Class<?> cls = f20159a;
        if (cls == null) {
            return null;
        }
        try {
            return (l) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
