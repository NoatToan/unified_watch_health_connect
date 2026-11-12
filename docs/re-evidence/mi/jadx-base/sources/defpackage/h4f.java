package defpackage;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.z;

/* JADX INFO: loaded from: classes5.dex */
public final class h4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f19680a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f19681b = new a0();

    public static z a() {
        return f19680a;
    }

    public static z b() {
        return f19681b;
    }

    public static z c() {
        try {
            return (z) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
