package bb;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17212b;

    public j0(long j8, long j14) {
        this.f17211a = j8;
        this.f17212b = j14;
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.f17211a;
    }

    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        return new g0.a(new h0(j8, this.f17212b));
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return true;
    }

    public j0(long j8) {
        this(j8, 0L);
    }
}
