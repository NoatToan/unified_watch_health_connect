package defpackage;

/* JADX INFO: loaded from: classes46.dex */
public class ytf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53845a = "-1.0D";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53847c = "-1.0D";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53846b = "-1.0D";

    public double c() {
        return Double.parseDouble(this.f53845a);
    }

    public void b(String str) {
        this.f53845a = str;
    }

    public double d() {
        return Double.parseDouble(this.f53847c);
    }

    public void e(String str) {
        this.f53847c = str;
    }

    public double e() {
        return Double.parseDouble(this.f53846b);
    }

    public void d(String str) {
        this.f53846b = str;
    }

    public String toString() {
        return "AudioCoordinate{mX='" + this.f53845a + "', mY='" + this.f53847c + "', mGain='" + this.f53846b + "'}";
    }
}
