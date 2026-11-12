package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class clg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xkg f5454a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xkg f5455b = new blg();

    public static xkg a() {
        return f5454a;
    }

    public static xkg b() {
        return f5455b;
    }

    public static xkg c() {
        try {
            return (xkg) Class.forName("androidx.health.platform.client.proto.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
