package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class dwe {
    private int d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32444a = 0;
    private String e = null;
    private String j = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32446c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32445b = true;
    private boolean f = false;
    private boolean h = true;

    public boolean a() {
        return this.f;
    }

    public void c(boolean z) {
        this.f = z;
    }

    public int e() {
        return ((Integer) dym.d(Integer.valueOf(this.d))).intValue();
    }

    public void d(int i) {
        this.d = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public int b() {
        return ((Integer) dym.d(Integer.valueOf(this.f32444a))).intValue();
    }

    public void a(int i) {
        this.f32444a = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public String d() {
        return (String) dym.d(this.e);
    }

    public void e(String str) {
        this.e = (String) dym.d(str);
    }

    public String i() {
        return (String) dym.d(this.j);
    }

    public void c(String str) {
        this.j = (String) dym.d(str);
    }

    public String c() {
        return (String) dym.d(this.f32446c);
    }

    public void b(String str) {
        this.f32446c = (String) dym.d(str);
    }

    public boolean f() {
        return ((Boolean) dym.d(Boolean.valueOf(this.f32445b))).booleanValue();
    }

    public void e(boolean z) {
        this.f32445b = ((Boolean) dym.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean g() {
        return this.h;
    }

    public void a(boolean z) {
        this.h = z;
    }
}
