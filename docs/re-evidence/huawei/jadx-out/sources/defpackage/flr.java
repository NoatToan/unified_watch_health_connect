package defpackage;

/* JADX INFO: loaded from: classes29.dex */
public class flr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f34192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34194c;
    private long d;
    private int e;
    private String i;

    public flr(long j, long j2, String str, String str2) {
        this.d = j;
        this.f34192a = j2;
        this.f34193b = str;
        this.i = str2;
    }

    public long b() {
        return this.d;
    }

    public long d() {
        return this.f34192a;
    }

    public String h() {
        return this.i;
    }

    public String a() {
        return this.f34193b;
    }

    public String e() {
        return this.f34194c;
    }

    public void e(String str) {
        this.f34194c = str;
    }

    public int c() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public String toString() {
        return "RecordReadOption{startTime=" + this.d + ", endTime=" + this.f34192a + ", type=" + this.i + ", count = " + this.e + ", sortOrder=" + this.f34194c + '}';
    }
}
