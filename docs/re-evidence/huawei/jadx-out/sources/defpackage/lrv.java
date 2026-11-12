package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class lrv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40740c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean i;
    private boolean j;

    public lrv(boolean[] zArr) {
        if (zArr == null || zArr.length != 8) {
            return;
        }
        this.f40738a = zArr[0];
        this.d = zArr[1];
        this.e = zArr[2];
        this.f40739b = zArr[3];
        this.f40740c = zArr[4];
        this.i = zArr[5];
        this.f = zArr[6];
        this.j = zArr[7];
    }

    public boolean c() {
        return ((Boolean) lst.d(Boolean.valueOf(this.f40738a))).booleanValue();
    }

    public boolean d() {
        return ((Boolean) lst.d(Boolean.valueOf(this.d))).booleanValue();
    }

    public boolean a() {
        return ((Boolean) lst.d(Boolean.valueOf(this.e))).booleanValue();
    }

    public boolean b() {
        return ((Boolean) lst.d(Boolean.valueOf(this.f40739b))).booleanValue();
    }

    public boolean e() {
        return ((Boolean) lst.d(Boolean.valueOf(this.f40740c))).booleanValue();
    }

    public boolean j() {
        return ((Boolean) lst.d(Boolean.valueOf(this.i))).booleanValue();
    }

    public boolean g() {
        return ((Boolean) lst.d(Boolean.valueOf(this.f))).booleanValue();
    }

    public boolean f() {
        return ((Boolean) lst.d(Boolean.valueOf(this.j))).booleanValue();
    }
}
