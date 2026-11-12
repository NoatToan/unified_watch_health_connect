package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public class uwu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50675c;
    private boolean d;
    private String e;
    private boolean g;
    private boolean h;

    public uwu(String str) {
        this.g = true;
        this.e = str;
    }

    public uwu(String str, boolean z, int i, boolean z2) {
        this.e = str;
        this.g = z;
        this.f50675c = i;
        this.f50674b = z2;
    }

    public String b() {
        return this.e;
    }

    public boolean f() {
        return this.g;
    }

    public void e(boolean z) {
        this.g = z;
    }

    public int e() {
        return this.f50675c;
    }

    public boolean a() {
        return this.d;
    }

    public void d(boolean z) {
        this.d = z;
        if (z) {
            this.f50675c = 1073741824;
        }
    }

    public boolean d() {
        return this.f50673a;
    }

    public void b(boolean z) {
        this.f50673a = z;
    }

    public boolean c() {
        return this.f50674b;
    }

    public boolean g() {
        return this.h;
    }

    public void a(boolean z) {
        this.h = z;
    }
}
