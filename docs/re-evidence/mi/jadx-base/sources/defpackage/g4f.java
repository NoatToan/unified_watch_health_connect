package defpackage;

import androidx.health.platform.client.proto.m0;
import androidx.health.platform.client.proto.n0;

/* JADX INFO: loaded from: classes.dex */
public final class g4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f18581a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m0 f18582b = new n0();

    public static m0 a() {
        return f18581a;
    }

    public static m0 b() {
        return f18582b;
    }

    public static m0 c() {
        try {
            return (m0) Class.forName("androidx.health.platform.client.proto.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
