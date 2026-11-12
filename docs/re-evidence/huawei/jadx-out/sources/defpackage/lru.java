package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class lru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40737b;
    private int e;

    public int d() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void a(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int e() {
        return ((Integer) lst.d(Integer.valueOf(this.f40736a))).intValue();
    }

    public void e(int i) {
        this.f40736a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String c() {
        return (String) lst.d(this.f40737b);
    }

    public void a(String str) {
        this.f40737b = (String) lst.d(str);
    }
}
