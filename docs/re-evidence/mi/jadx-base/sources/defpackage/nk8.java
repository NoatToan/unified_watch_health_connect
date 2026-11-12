package defpackage;

import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.n;

/* JADX INFO: loaded from: classes.dex */
public final class nk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m<?> f28005a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m<?> f28006b = c();

    public static m<?> a() {
        m<?> mVar = f28006b;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static m<?> b() {
        return f28005a;
    }

    public static m<?> c() {
        try {
            return (m) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
