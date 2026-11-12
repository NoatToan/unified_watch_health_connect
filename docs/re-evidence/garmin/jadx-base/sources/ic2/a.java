package ic2;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f92642c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StringBuffer f92643a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f92644b = false;

    private a() {
    }

    public static a b() {
        if (f92642c == null) {
            f92642c = new a();
        }
        return f92642c;
    }

    public final void a() {
        StringBuffer stringBuffer = this.f92643a;
        if (stringBuffer != null) {
            stringBuffer.replace(0, stringBuffer.length(), "");
            this.f92643a = null;
            this.f92644b = false;
        }
    }
}
