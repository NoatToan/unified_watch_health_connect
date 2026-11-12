package androidx.media3.exoplayer.source;

import androidx.media3.common.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends c<Void> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f9691k;

    public x(j jVar) {
        this.f9691k = jVar;
    }

    @Override // androidx.media3.exoplayer.source.j
    public i c(j.b bVar, xa.b bVar2, long j8) {
        return this.f9691k.c(bVar, bVar2, j8);
    }

    @Override // androidx.media3.exoplayer.source.j
    public final d0 getInitialTimeline() {
        return this.f9691k.getInitialTimeline();
    }

    @Override // androidx.media3.exoplayer.source.j
    public final androidx.media3.common.t getMediaItem() {
        return this.f9691k.getMediaItem();
    }

    @Override // androidx.media3.exoplayer.source.j
    public void h(i iVar) {
        this.f9691k.h(iVar);
    }

    @Override // androidx.media3.exoplayer.source.j
    public final boolean isSingleWindow() {
        return this.f9691k.isSingleWindow();
    }

    @Override // androidx.media3.exoplayer.source.j
    public void k(androidx.media3.common.t tVar) {
        this.f9691k.k(tVar);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void p(ha.n nVar) {
        super.p(nVar);
        y();
    }

    @Override // androidx.media3.exoplayer.source.c
    public final j.b s(Void r14, j.b bVar) {
        return x(bVar);
    }

    @Override // androidx.media3.exoplayer.source.c
    public final long t(Object obj, long j8) {
        return j8;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final int u(Void r14, int i14) {
        return i14;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void v(Object obj, a aVar, d0 d0Var) {
        o(d0Var);
    }

    public j.b x(j.b bVar) {
        return bVar;
    }

    public void y() {
        w(null, this.f9691k);
    }
}
