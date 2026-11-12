package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.c f9880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.media3.common.y f9884e = androidx.media3.common.y.f8583d;

    public y0(fa.c cVar) {
        this.f9880a = cVar;
    }

    public final void a(long j8) {
        this.f9882c = j8;
        if (this.f9881b) {
            this.f9883d = this.f9880a.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.e0
    public final void b(androidx.media3.common.y yVar) {
        if (this.f9881b) {
            a(getPositionUs());
        }
        this.f9884e = yVar;
    }

    @Override // androidx.media3.exoplayer.e0
    public final androidx.media3.common.y getPlaybackParameters() {
        return this.f9884e;
    }

    @Override // androidx.media3.exoplayer.e0
    public final long getPositionUs() {
        long j8 = this.f9882c;
        if (!this.f9881b) {
            return j8;
        }
        long jElapsedRealtime = this.f9880a.elapsedRealtime() - this.f9883d;
        androidx.media3.common.y yVar = this.f9884e;
        return (yVar.f8584a == 1.0f ? fa.z.O(jElapsedRealtime) : jElapsedRealtime * ((long) yVar.f8586c)) + j8;
    }
}
