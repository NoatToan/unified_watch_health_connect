package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.d0;
import androidx.media3.exoplayer.drm.DrmSession;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.base.Supplier;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.media3.exoplayer.source.a implements o.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ha.d.a f9588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n.a f9589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.c f9590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f9591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f9593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Supplier<ya.b> f9594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f9596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ha.n f9599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.media3.common.t f9600t;

    public class a extends sa.h {
        public a(p pVar, d0 d0Var) {
            super(d0Var);
        }

        @Override // sa.h, androidx.media3.common.d0
        public final d0.b f(int i14, d0.b bVar, boolean z14) {
            super.f(i14, bVar, z14);
            bVar.f8192f = true;
            return bVar;
        }

        @Override // sa.h, androidx.media3.common.d0
        public final d0.c m(int i14, d0.c cVar, long j8) {
            super.m(i14, cVar, j8);
            cVar.f8206k = true;
            return cVar;
        }
    }

    private p(androidx.media3.common.t tVar, ha.d.a aVar, n.a aVar2, androidx.media3.exoplayer.drm.c cVar, androidx.media3.exoplayer.upstream.b bVar, int i14, boolean z14, Supplier<ya.b> supplier) {
        this.f9600t = tVar;
        this.f9588h = aVar;
        this.f9589i = aVar2;
        this.f9590j = cVar;
        this.f9591k = bVar;
        this.f9592l = i14;
        this.f9593m = z14;
        this.f9595o = true;
        this.f9596p = C.TIME_UNSET;
        this.f9594n = supplier;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final i c(j.b bVar, xa.b bVar2, long j8) {
        ha.d dVarCreateDataSource = this.f9588h.createDataSource();
        ha.n nVar = this.f9599s;
        if (nVar != null) {
            dVarCreateDataSource.a(nVar);
        }
        androidx.media3.common.t.h hVar = getMediaItem().f8439b;
        hVar.getClass();
        Uri uri = hVar.f8482a;
        fa.a.f(this.f9404g);
        bb.r rVar = (bb.r) ((r22.a) this.f9589i).f149546b;
        int i14 = b.f9601h;
        sa.a aVar = new sa.a(rVar);
        androidx.media3.exoplayer.drm.b.a aVarG = this.f9401d.g(0, bVar);
        k.a aVarL = l(bVar);
        String str = hVar.f8487f;
        long jO = z.O(hVar.f8490i);
        Supplier<ya.b> supplier = this.f9594n;
        return new o(uri, dVarCreateDataSource, aVar, this.f9590j, aVarG, this.f9591k, aVarL, this, bVar2, str, this.f9592l, this.f9593m, jO, supplier != null ? supplier.get() : null);
    }

    @Override // androidx.media3.exoplayer.source.j
    public final synchronized androidx.media3.common.t getMediaItem() {
        return this.f9600t;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void h(i iVar) {
        o oVar = (o) iVar;
        if (oVar.f9565z) {
            for (r rVar : oVar.f9562w) {
                rVar.i();
                DrmSession drmSession = rVar.f9626h;
                if (drmSession != null) {
                    drmSession.a(rVar.f9623e);
                    rVar.f9626h = null;
                    rVar.f9625g = null;
                }
            }
        }
        oVar.f9554m.d(oVar);
        oVar.f9559r.removeCallbacksAndMessages(null);
        oVar.f9560t = null;
        oVar.L0 = true;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final synchronized void k(androidx.media3.common.t tVar) {
        this.f9600t = tVar;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void p(ha.n nVar) {
        this.f9599s = nVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        ja.q qVar = this.f9404g;
        fa.a.f(qVar);
        androidx.media3.exoplayer.drm.c cVar = this.f9590j;
        cVar.d(looperMyLooper, qVar);
        cVar.prepare();
        s();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r() {
        this.f9590j.release();
    }

    public final void s() {
        d0 oVar = new sa.o(this.f9596p, this.f9597q, false, this.f9598r, (Object) null, getMediaItem());
        if (this.f9595o) {
            oVar = new a(this, oVar);
        }
        q(oVar);
    }

    public final void t(long j8, boolean z14, boolean z15) {
        if (j8 == C.TIME_UNSET) {
            j8 = this.f9596p;
        }
        if (!this.f9595o && this.f9596p == j8 && this.f9597q == z14 && this.f9598r == z15) {
            return;
        }
        this.f9596p = j8;
        this.f9597q = z14;
        this.f9598r = z15;
        this.f9595o = false;
        s();
    }

    public static final class b implements l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f9601h = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ha.d.a f9602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n.a f9603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final la.b f9604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final androidx.media3.exoplayer.upstream.b f9605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f9606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f9607g;

        public b(ha.d.a aVar, n.a aVar2) {
            this(aVar, aVar2, new androidx.media3.exoplayer.drm.a(), new androidx.media3.exoplayer.upstream.a(), ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        }

        @Override // androidx.media3.exoplayer.source.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final p b(androidx.media3.common.t tVar) {
            tVar.f8439b.getClass();
            return new p(tVar, this.f9602b, this.f9603c, this.f9604d.a(tVar), this.f9605e, this.f9606f, this.f9607g, null, null);
        }

        @Override // androidx.media3.exoplayer.source.j.a
        public final int[] getSupportedTypes() {
            return new int[]{4};
        }

        public b(ha.d.a aVar, bb.r rVar) {
            this(aVar, new r22.a(rVar, 14));
        }

        public b(ha.d.a aVar) {
            this(aVar, new bb.j());
        }

        public b(ha.d.a aVar, n.a aVar2, la.b bVar, androidx.media3.exoplayer.upstream.b bVar2, int i14) {
            this.f9602b = aVar;
            this.f9603c = aVar2;
            this.f9604d = bVar;
            this.f9605e = bVar2;
            this.f9606f = i14;
        }
    }

    public /* synthetic */ p(androidx.media3.common.t tVar, ha.d.a aVar, n.a aVar2, androidx.media3.exoplayer.drm.c cVar, androidx.media3.exoplayer.upstream.b bVar, int i14, boolean z14, Supplier supplier, a aVar3) {
        this(tVar, aVar, aVar2, cVar, bVar, i14, z14, supplier);
    }
}
