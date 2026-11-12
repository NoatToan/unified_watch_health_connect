package defpackage;

import androidx.datastore.preferences.protobuf.f0;

/* JADX INFO: loaded from: classes.dex */
public final class flg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final alg f17897a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final alg f17898b = new f0();

    public static alg a() {
        return f17897a;
    }

    public static alg b() {
        return f17898b;
    }

    public static alg c() {
        try {
            return (alg) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
