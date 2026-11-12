package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class pic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private phx f45419c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private phv m;
    private String n;

    public phx j() {
        return this.f45419c;
    }

    public void c(phx phxVar) {
        this.f45419c = phxVar;
    }

    public phv h() {
        return (phv) lst.d(this.m);
    }

    public void a(phv phvVar) {
        this.m = (phv) lst.d(phvVar);
    }

    public void j(String str) {
        this.i = (String) lst.d(str);
    }

    public String b() {
        return (String) lst.d(this.j);
    }

    public void f(String str) {
        this.j = (String) lst.d(str);
    }

    public String g() {
        return (String) lst.d(this.k);
    }

    public void g(String str) {
        this.k = (String) lst.d(str);
    }

    public void i(String str) {
        this.f = (String) lst.d(str);
    }

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.f45418b))).intValue();
    }

    public void b(int i) {
        this.f45418b = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String c() {
        return (String) lst.d(this.e);
    }

    public void d(String str) {
        this.e = (String) lst.d(str);
    }

    public void a(String str) {
        this.h = (String) lst.d(str);
    }

    public void c(String str) {
        this.f45417a = (String) lst.d(str);
    }

    public void h(String str) {
        this.n = (String) lst.d(str);
    }

    public String e() {
        return (String) lst.d(this.d);
    }

    public void e(String str) {
        this.d = (String) lst.d(str);
    }

    public String d() {
        return (String) lst.d(this.g);
    }

    public void b(String str) {
        this.g = (String) lst.d(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("EzPluginInfo{, pluginName='");
        sb.append(this.i);
        sb.append("', pluginUuid='");
        sb.append(this.j);
        sb.append("', version='");
        sb.append(this.k);
        sb.append("', modifyDate='");
        sb.append(this.f);
        sb.append("', fileSize='");
        sb.append(this.f45418b);
        sb.append("', digest='");
        sb.append(this.e);
        sb.append("', form='");
        sb.append(this.h);
        sb.append("', description='");
        sb.append(this.f45417a);
        sb.append("', prompt='");
        sb.append(this.n);
        sb.append("', fileName='");
        sb.append(this.d);
        sb.append("', fileType='");
        sb.append(this.g);
        sb.append("'}");
        return sb.toString();
    }
}
