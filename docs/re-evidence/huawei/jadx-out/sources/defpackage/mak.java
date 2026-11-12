package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class mak {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41259c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41257a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41258b = -1;
    private int d = -1;
    private int e = -1;

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.f41257a))).intValue();
    }

    public void e(int i) {
        this.f41257a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String b() {
        return (String) lst.d(this.f41259c);
    }

    public void e(String str) {
        this.f41259c = (String) lst.d(str);
    }

    public int e() {
        return ((Integer) lst.d(Integer.valueOf(this.f41258b))).intValue();
    }

    public void a(int i) {
        this.f41258b = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int c() {
        return ((Integer) lst.d(Integer.valueOf(this.d))).intValue();
    }

    public int d() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void c(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
