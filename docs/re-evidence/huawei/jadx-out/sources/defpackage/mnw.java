package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class mnw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42048c;
    private int d = -1;
    private int e = 1;

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.f42048c))).intValue();
    }

    public void c(int i) {
        this.f42048c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String e() {
        return (String) lst.d(this.f42047b);
    }

    public void c(String str) {
        this.f42047b = (String) lst.d(str);
    }

    public String d() {
        return (String) lst.d(this.f42046a);
    }

    public void d(String str) {
        this.f42046a = (String) lst.d(str);
    }

    public int c() {
        return ((Integer) lst.d(Integer.valueOf(this.d))).intValue();
    }

    public void b(int i) {
        this.d = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void a(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
