package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class zxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f54737a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f54738b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54739c;
    private long d;
    private final int e;

    public zxk(int i, long j) {
        this.e = i;
        this.d = j;
    }

    public long b(long j) {
        long jRound;
        if (this.f54739c) {
            jRound = Math.round((this.f54738b * 0.875d) + (Math.abs(this.f54737a - j) * 0.125d));
            j = Math.round((this.f54737a * 0.75d) + (j * 0.25d));
        } else {
            this.f54739c = true;
            jRound = j / 2;
        }
        this.f54737a = j;
        this.f54738b = jRound;
        long jMax = j + Math.max(100L, ((long) this.e) * jRound);
        this.d = jMax;
        return jMax;
    }
}
