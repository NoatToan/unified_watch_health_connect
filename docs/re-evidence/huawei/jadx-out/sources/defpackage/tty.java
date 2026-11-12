package defpackage;

/* JADX INFO: loaded from: classes43.dex */
public class tty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f49671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f49672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49673c;
    private int d;
    private boolean e;
    private String g;

    public int d() {
        return this.f49673c;
    }

    public void d(int i) {
        this.f49673c = i;
    }

    public int a() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public CharSequence c() {
        return this.f49672b;
    }

    public void b(CharSequence charSequence) {
        this.f49672b = charSequence;
    }

    public String e() {
        return this.g;
    }

    public void a(String str) {
        this.g = str;
    }

    public boolean h() {
        return this.e;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public long b() {
        return this.f49671a;
    }

    public void e(long j) {
        this.f49671a = j;
    }

    public String toString() {
        return "ActiveHoursData{mContent='" + ((Object) this.f49672b) + "', mTime='" + this.g + "', mIsMarked=" + this.e + ", mMarkViewTime=" + this.f49671a + '}';
    }
}
