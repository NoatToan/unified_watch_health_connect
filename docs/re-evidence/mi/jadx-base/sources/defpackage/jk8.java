package defpackage;

import androidx.datastore.preferences.protobuf.l;

/* JADX INFO: loaded from: classes.dex */
public final class jk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f22886a = c();

    public static l a() {
        if (f22886a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return l.e;
    }

    public static final l b(String str) throws Exception {
        return (l) f22886a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    public static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
