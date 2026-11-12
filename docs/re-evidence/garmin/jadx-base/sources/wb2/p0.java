package wb2;

/* JADX INFO: loaded from: classes11.dex */
public class p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p0 f184081c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StringBuffer f184082a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f184083b = false;

    private p0() {
    }

    public static p0 b() {
        if (f184081c == null) {
            f184081c = new p0();
        }
        return f184081c;
    }

    public final void a() {
        StringBuffer stringBuffer = this.f184082a;
        if (stringBuffer != null) {
            stringBuffer.replace(0, stringBuffer.length(), "");
            this.f184082a = null;
            this.f184083b = false;
        }
    }
}
