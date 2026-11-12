package defpackage;

import androidx.health.platform.client.proto.a0;
import androidx.health.platform.client.proto.z;

/* JADX INFO: loaded from: classes.dex */
public final class kk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z<?> f23942a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z<?> f23943b = c();

    public static z<?> a() {
        z<?> zVar = f23943b;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static z<?> b() {
        return f23942a;
    }

    public static z<?> c() {
        try {
            return (z) Class.forName("androidx.health.platform.client.proto.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
