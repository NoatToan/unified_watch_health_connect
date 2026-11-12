package c83;

/* JADX INFO: loaded from: classes11.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f25882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f25883c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f25881a = null;
            f25882b = new x();
            f25883c = new c();
        } else if (property.equals("Dalvik")) {
            f25881a = new a();
            f25882b = new x.a();
            f25883c = new c.a();
        } else {
            f25881a = null;
            f25882b = new x.b();
            f25883c = new c.a();
        }
    }

    private w() {
    }
}
