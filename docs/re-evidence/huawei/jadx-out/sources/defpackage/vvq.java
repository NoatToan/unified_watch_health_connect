package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public final class vvq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51633c;
    private boolean d;
    private String e;
    private int h;
    private int i;

    public vvq(int i, String str, boolean z, boolean z2, int i2) {
        this.i = i;
        this.f51631a = str;
        this.f51633c = z;
        this.d = z2;
        this.h = i2;
    }

    public vvq(int i, String str, String str2, boolean z, int i2) {
        this.i = i;
        this.e = str;
        this.f51632b = str2;
        this.f51633c = z;
        this.h = i2;
    }

    public String a() {
        return this.f51631a;
    }

    public int f() {
        return this.h;
    }

    public boolean i() {
        return this.d;
    }

    public boolean g() {
        return this.f51633c;
    }

    public void d(boolean z) {
        this.f51633c = z;
    }

    public boolean d() {
        return this.f51633c;
    }

    public int e() {
        return this.i;
    }

    public String c() {
        return this.e;
    }

    public String b() {
        return this.f51632b;
    }

    public String toString() {
        return "ThirdPartAccountAuthBean{itemViewType=" + this.i + ", itemTitleShow=" + this.d + ", operationType=" + this.h + "', isOpen=" + this.f51633c + '}';
    }
}
