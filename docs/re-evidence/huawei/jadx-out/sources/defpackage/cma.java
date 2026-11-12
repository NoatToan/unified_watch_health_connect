package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class cma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1757c;
    private int d;

    public int a() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public void c(int i) {
        this.f1755a = i;
    }

    public void e(int i) {
        this.f1756b = i;
    }

    public int b() {
        return this.f1757c;
    }

    public void b(int i) {
        this.f1757c = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(0);
        stringBuffer.append("bondStatus: ").append(this.d).append(" BondStatusInfo: ").append(this.f1755a).append("VersionInfo: ").append(this.f1756b).append(" ServiceMtu: ").append(this.f1757c);
        return stringBuffer.toString();
    }
}
