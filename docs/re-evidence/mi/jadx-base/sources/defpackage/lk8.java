package defpackage;

import com.google.crypto.tink.shaded.protobuf.m;
import com.google.crypto.tink.shaded.protobuf.n;

/* JADX INFO: loaded from: classes5.dex */
public final class lk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m<?> f25164a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m<?> f25165b = c();

    public static m<?> a() {
        m<?> mVar = f25165b;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static m<?> b() {
        return f25164a;
    }

    public static m<?> c() {
        try {
            return (m) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
