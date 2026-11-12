package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class k implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f9185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0 f9187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f9188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9189e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9190f;

    public interface a {
    }

    public k(a aVar, fa.c cVar) {
        this.f9186b = aVar;
        this.f9185a = new y0(cVar);
    }

    @Override // androidx.media3.exoplayer.e0
    public final void b(androidx.media3.common.y yVar) {
        e0 e0Var = this.f9188d;
        if (e0Var != null) {
            e0Var.b(yVar);
            yVar = this.f9188d.getPlaybackParameters();
        }
        this.f9185a.b(yVar);
    }

    @Override // androidx.media3.exoplayer.e0
    public final androidx.media3.common.y getPlaybackParameters() {
        e0 e0Var = this.f9188d;
        return e0Var != null ? e0Var.getPlaybackParameters() : this.f9185a.f9884e;
    }

    @Override // androidx.media3.exoplayer.e0
    public final long getPositionUs() {
        if (this.f9189e) {
            return this.f9185a.getPositionUs();
        }
        e0 e0Var = this.f9188d;
        e0Var.getClass();
        return e0Var.getPositionUs();
    }

    @Override // androidx.media3.exoplayer.e0
    public final boolean i() {
        if (this.f9189e) {
            this.f9185a.getClass();
            return false;
        }
        e0 e0Var = this.f9188d;
        e0Var.getClass();
        return e0Var.i();
    }
}
