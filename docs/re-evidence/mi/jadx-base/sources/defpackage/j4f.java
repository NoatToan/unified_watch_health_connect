package defpackage;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.z;

/* JADX INFO: loaded from: classes.dex */
public final class j4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f22407a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f22408b = new a0();

    public static z a() {
        return f22407a;
    }

    public static z b() {
        return f22408b;
    }

    public static z c() {
        try {
            return (z) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
