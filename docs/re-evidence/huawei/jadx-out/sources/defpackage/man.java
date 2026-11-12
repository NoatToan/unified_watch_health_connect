package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class man {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41265b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41266c = -1;
    private int e = -1;

    public String a() {
        return (String) lst.d(this.f41264a);
    }

    public void c(String str) {
        this.f41264a = (String) lst.d(str);
    }

    public int d() {
        return ((Integer) lst.d(Integer.valueOf(this.f41265b))).intValue();
    }

    public void e(int i) {
        this.f41265b = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int c() {
        return ((Integer) lst.d(Integer.valueOf(this.f41266c))).intValue();
    }

    public void b(int i) {
        this.f41266c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void a(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
