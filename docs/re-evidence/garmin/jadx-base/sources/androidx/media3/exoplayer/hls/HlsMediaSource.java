package androidx.media3.exoplayer.hls;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.b0;
import androidx.media3.common.t;
import androidx.media3.common.u;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.c;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.k;
import androidx.media3.exoplayer.upstream.b;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import fa.z;
import ha.n;
import ja.q;
import java.util.List;
import ma.f;
import ma.g;
import ma.h;
import ma.l;
import ma.o;
import sa.d;
import sa.e;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f8998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f8999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f9000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xa.d f9001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f9002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f9003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HlsPlaylistTracker f9007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f9008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f9009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t.g f9010t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f9011u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t f9012v;

    static {
        u.a("media3.exoplayer.hls");
    }

    private HlsMediaSource(t tVar, g gVar, h hVar, d dVar, xa.d dVar2, c cVar, b bVar, HlsPlaylistTracker hlsPlaylistTracker, long j8, boolean z14, int i14, boolean z15, long j14) {
        this.f9012v = tVar;
        this.f9010t = tVar.f8440c;
        this.f8999i = gVar;
        this.f8998h = hVar;
        this.f9000j = dVar;
        this.f9001k = dVar2;
        this.f9002l = cVar;
        this.f9003m = bVar;
        this.f9007q = hlsPlaylistTracker;
        this.f9008r = j8;
        this.f9004n = z14;
        this.f9005o = i14;
        this.f9006p = z15;
        this.f9009s = j14;
    }

    public static androidx.media3.exoplayer.hls.playlist.b.C0125b s(long j8, List list) {
        androidx.media3.exoplayer.hls.playlist.b.C0125b c0125b = null;
        for (int i14 = 0; i14 < list.size(); i14++) {
            androidx.media3.exoplayer.hls.playlist.b.C0125b c0125b2 = (androidx.media3.exoplayer.hls.playlist.b.C0125b) list.get(i14);
            long j14 = c0125b2.f9116e;
            if (j14 > j8 || !c0125b2.f9105l) {
                if (j14 > j8) {
                    break;
                }
            } else {
                c0125b = c0125b2;
            }
        }
        return c0125b;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final i c(j.b bVar, xa.b bVar2, long j8) {
        k.a aVarL = l(bVar);
        androidx.media3.exoplayer.drm.b.a aVarG = this.f9401d.g(0, bVar);
        n nVar = this.f9011u;
        q qVar = this.f9404g;
        fa.a.f(qVar);
        return new l(this.f8998h, this.f9007q, this.f8999i, nVar, this.f9001k, this.f9002l, aVarG, this.f9003m, aVarL, bVar2, this.f9000j, this.f9004n, this.f9005o, this.f9006p, qVar, this.f9009s);
    }

    @Override // androidx.media3.exoplayer.source.j
    public final synchronized t getMediaItem() {
        return this.f9012v;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void h(i iVar) {
        l lVar = (l) iVar;
        lVar.f117530b.b(lVar);
        for (o oVar : lVar.f117551y) {
            if (oVar.F) {
                for (o.d dVar : oVar.f117581x) {
                    dVar.i();
                    DrmSession drmSession = dVar.f9626h;
                    if (drmSession != null) {
                        drmSession.a(dVar.f9623e);
                        dVar.f9626h = null;
                        dVar.f9625g = null;
                    }
                }
            }
            f fVar = oVar.f117562d;
            fVar.f117486g.c(fVar.f117484e[fVar.f117498s.getSelectedIndexInTrackGroup()]);
            fVar.f117495p = null;
            oVar.f117568j.d(oVar);
            oVar.f117577r.removeCallbacksAndMessages(null);
            oVar.X = true;
            oVar.f117578t.clear();
        }
        lVar.f117548v = null;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final synchronized void k(t tVar) {
        this.f9012v = tVar;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void maybeThrowSourceInfoRefreshError() {
        this.f9007q.f();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void p(n nVar) {
        this.f9011u = nVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        q qVar = this.f9404g;
        fa.a.f(qVar);
        c cVar = this.f9002l;
        cVar.d(looperMyLooper, qVar);
        cVar.prepare();
        k.a aVarL = l(null);
        t.h hVar = getMediaItem().f8439b;
        hVar.getClass();
        this.f9007q.a(hVar.f8482a, aVarL, this);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void r() {
        this.f9007q.stop();
        this.f9002l.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(androidx.media3.exoplayer.hls.playlist.b bVar) {
        long j8;
        sa.o oVar;
        long jO;
        long j14;
        long jO2;
        long j15;
        boolean z14 = bVar.f9098p;
        boolean z15 = bVar.f9089g;
        ImmutableList immutableList = bVar.f9100r;
        long j16 = bVar.f9103u;
        long jO3 = bVar.f9087e;
        int i14 = bVar.f9086d;
        long j17 = bVar.f9090h;
        long jY = z14 ? z.Y(j17) : C.TIME_UNSET;
        long j18 = (i14 == 2 || i14 == 1) ? jY : C.TIME_UNSET;
        HlsPlaylistTracker hlsPlaylistTracker = this.f9007q;
        androidx.media3.exoplayer.hls.playlist.c cVarD = hlsPlaylistTracker.d();
        cVarD.getClass();
        ma.i iVar = new ma.i(cVarD, bVar);
        long j19 = 0;
        if (hlsPlaylistTracker.p()) {
            androidx.media3.exoplayer.hls.playlist.b.f fVar = bVar.f9104v;
            long j24 = j17 - hlsPlaylistTracker.j();
            boolean z16 = bVar.f9097o;
            long j25 = z16 ? j24 + j16 : -9223372036854775807L;
            if (bVar.f9098p) {
                int i15 = z.f70071a;
                long j26 = this.f9008r;
                jO = z.O(j26 == C.TIME_UNSET ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j26) - (j17 + j16);
            } else {
                jO = 0;
            }
            long j27 = this.f9010t.f8472a;
            if (j27 != C.TIME_UNSET) {
                jO2 = z.O(j27);
            } else {
                if (jO3 != C.TIME_UNSET) {
                    j14 = j16 - jO3;
                } else {
                    j14 = fVar.f9126d;
                    if (j14 == C.TIME_UNSET || bVar.f9096n == C.TIME_UNSET) {
                        j14 = fVar.f9125c;
                        if (j14 == C.TIME_UNSET) {
                            j14 = 3 * bVar.f9095m;
                        }
                    }
                }
                jO2 = j14 + jO;
            }
            long j28 = j16 + jO;
            long j29 = z.j(jO2, jO, j28);
            t.g gVar = getMediaItem().f8440c;
            boolean z17 = gVar.f8475d == -3.4028235E38f && gVar.f8476e == -3.4028235E38f && fVar.f9125c == C.TIME_UNSET && fVar.f9126d == C.TIME_UNSET;
            t.g.a aVar = new t.g.a();
            aVar.f8477a = z.Y(j29);
            aVar.f8480d = z17 ? 1.0f : this.f9010t.f8475d;
            aVar.f8481e = z17 ? 1.0f : this.f9010t.f8476e;
            t.g gVar2 = new t.g(aVar);
            this.f9010t = gVar2;
            if (jO3 == C.TIME_UNSET) {
                jO3 = j28 - z.O(gVar2.f8472a);
            }
            if (z15) {
                j19 = jO3;
            } else {
                androidx.media3.exoplayer.hls.playlist.b.C0125b c0125bS = s(jO3, bVar.f9101s);
                if (c0125bS != null) {
                    j15 = c0125bS.f9116e;
                } else if (!immutableList.isEmpty()) {
                    androidx.media3.exoplayer.hls.playlist.b.d dVar = (androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(z.c(immutableList, Long.valueOf(jO3), true));
                    androidx.media3.exoplayer.hls.playlist.b.C0125b c0125bS2 = s(jO3, dVar.f9111m);
                    j15 = c0125bS2 != null ? c0125bS2.f9116e : dVar.f9116e;
                }
                j19 = j15;
            }
            oVar = new sa.o(j18, jY, C.TIME_UNSET, j25, bVar.f9103u, j24, j19, true, !z16, i14 == 2 && bVar.f9088f, iVar, getMediaItem(), this.f9010t);
        } else {
            if (jO3 == C.TIME_UNSET || immutableList.isEmpty()) {
                j8 = 0;
            } else {
                if (!z15 && jO3 != j16) {
                    jO3 = ((androidx.media3.exoplayer.hls.playlist.b.d) immutableList.get(z.c(immutableList, Long.valueOf(jO3), true))).f9116e;
                }
                j8 = jO3;
            }
            long j34 = bVar.f9103u;
            oVar = new sa.o(j18, jY, C.TIME_UNSET, j34, j34, 0L, j8, true, false, true, iVar, getMediaItem(), null);
        }
        q(oVar);
    }

    public static final class Factory implements androidx.media3.exoplayer.source.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ int f9013n = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f9014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ma.d f9015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public yb.n.a f9016d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9017e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final na.a f9018f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final n23.j f9019g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e f9020h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final androidx.media3.exoplayer.drm.a f9021i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final androidx.media3.exoplayer.upstream.a f9022j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f9023k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f9024l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f9025m;

        public Factory(g gVar) {
            gVar.getClass();
            this.f9014b = gVar;
            this.f9021i = new androidx.media3.exoplayer.drm.a();
            this.f9018f = new na.a();
            this.f9019g = androidx.media3.exoplayer.hls.playlist.a.f9057p;
            this.f9022j = new androidx.media3.exoplayer.upstream.a();
            this.f9020h = new e();
            this.f9024l = 1;
            this.f9025m = C.TIME_UNSET;
            this.f9023k = true;
            this.f9017e = true;
        }

        @Override // androidx.media3.exoplayer.source.j.a
        @CanIgnoreReturnValue
        public final void a(yb.n.a aVar) {
            this.f9016d = aVar;
        }

        @Override // androidx.media3.exoplayer.source.j.a
        @CanIgnoreReturnValue
        @Deprecated
        public final void c(boolean z14) {
            this.f9017e = z14;
        }

        @Override // androidx.media3.exoplayer.source.j.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final HlsMediaSource b(t tVar) {
            tVar.f8439b.getClass();
            if (this.f9015c == null) {
                this.f9015c = new ma.d();
            }
            yb.n.a aVar = this.f9016d;
            if (aVar != null) {
                this.f9015c.f117475b = aVar;
            }
            ma.d dVar = this.f9015c;
            dVar.f117476c = this.f9017e;
            List<b0> list = tVar.f8439b.f8486e;
            boolean zIsEmpty = list.isEmpty();
            na.d bVar = this.f9018f;
            if (!zIsEmpty) {
                bVar = new na.b(bVar, list);
            }
            c cVarA = this.f9021i.a(tVar);
            this.f9019g.getClass();
            g gVar = this.f9014b;
            androidx.media3.exoplayer.upstream.a aVar2 = this.f9022j;
            return new HlsMediaSource(tVar, this.f9014b, dVar, this.f9020h, null, cVarA, aVar2, new androidx.media3.exoplayer.hls.playlist.a(gVar, aVar2, bVar), this.f9025m, this.f9023k, this.f9024l, false, 0L);
        }

        @Override // androidx.media3.exoplayer.source.j.a
        public final int[] getSupportedTypes() {
            return new int[]{2};
        }

        public Factory(ha.d.a aVar) {
            this(new ma.c(aVar));
        }
    }
}
