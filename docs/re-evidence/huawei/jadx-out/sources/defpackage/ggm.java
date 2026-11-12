package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class ggm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f35064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f35065c;
    private int d;
    private String e;
    private int f;

    public ggm() {
    }

    public int c() {
        return this.f;
    }

    public void c(int i) {
        this.f = i;
    }

    public long d() {
        return this.f35064b;
    }

    public void c(long j) {
        this.f35064b = j;
    }

    public long b() {
        return this.f35065c;
    }

    public void a(long j) {
        this.f35065c = j;
    }

    public void a(int i) {
        this.f35063a = i;
    }

    public int e() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public String a() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    public ggm(long j, long j2, int i, String str, int i2, int i3) {
        this.f35065c = j;
        this.f35064b = j2;
        this.f35063a = i;
        this.e = str;
        this.f = i2;
        this.d = i3;
    }

    public String toString() {
        return "SportRecordInfo{startTime=" + this.f35065c + ", endTime=" + this.f35064b + ", sportType=" + this.f35063a + ", timeZone='" + this.e + "', type=" + this.f + ", distance=" + this.d + '}';
    }
}
