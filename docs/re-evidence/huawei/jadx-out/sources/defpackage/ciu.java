package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class ciu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1627b;
    private long d;
    private int e;

    public void d(long j) {
        this.f1627b = j;
    }

    public void a(long j) {
        this.d = j;
    }

    public long a() {
        return ((Long) lst.d(Long.valueOf(this.d))).longValue();
    }

    public void b(int i) {
        this.e = i;
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public String toString() {
        return "SleepErrorFrame{startTime=" + this.f1627b + ", endTime=" + this.d + ", errorCode=" + this.e + '}';
    }
}
