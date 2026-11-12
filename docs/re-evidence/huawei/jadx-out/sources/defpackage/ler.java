package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class ler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39995c;
    private String d;
    private String e;
    private int i;
    private String j;

    public ler(String str, int i, String str2) {
        this(str, i, str2, null, null);
    }

    public ler(String str, int i, String str2, String str3) {
        this(str, i, str2, str3, null);
    }

    public ler(String str, int i, String str2, String str3, String str4) {
        this.d = str;
        this.i = i;
        this.e = str2;
        this.f39993a = str3;
        this.f39994b = str4;
    }

    public ler e(int i) {
        this.i = i;
        return this;
    }

    public void e(String str) {
        this.f39994b = str;
    }

    public void d(String str) {
        this.j = str;
    }

    public void c(int i) {
        this.f39995c = i;
    }

    public void a(String str) {
        this.e = str;
    }

    public String a() {
        return this.d;
    }

    public int f() {
        return this.i;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.f39993a;
    }

    public String b() {
        return this.f39994b;
    }

    public String i() {
        return this.j;
    }

    public int e() {
        return this.f39995c;
    }
}
