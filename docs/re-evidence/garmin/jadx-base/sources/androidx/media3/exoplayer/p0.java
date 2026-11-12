package androidx.media3.exoplayer;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final androidx.media3.exoplayer.source.j.b f9317u = new androidx.media3.exoplayer.source.j.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.d0 f9318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.j.b f9319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f9323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sa.r f9325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wa.m f9326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<androidx.media3.common.w> f9327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.j.b f9328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.media3.common.y f9332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f9334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f9335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f9336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f9337t;

    public p0(androidx.media3.common.d0 d0Var, androidx.media3.exoplayer.source.j.b bVar, long j8, long j14, int i14, ExoPlaybackException exoPlaybackException, boolean z14, sa.r rVar, wa.m mVar, List<androidx.media3.common.w> list, androidx.media3.exoplayer.source.j.b bVar2, boolean z15, int i15, int i16, androidx.media3.common.y yVar, long j15, long j16, long j17, long j18, boolean z16) {
        this.f9318a = d0Var;
        this.f9319b = bVar;
        this.f9320c = j8;
        this.f9321d = j14;
        this.f9322e = i14;
        this.f9323f = exoPlaybackException;
        this.f9324g = z14;
        this.f9325h = rVar;
        this.f9326i = mVar;
        this.f9327j = list;
        this.f9328k = bVar2;
        this.f9329l = z15;
        this.f9330m = i15;
        this.f9331n = i16;
        this.f9332o = yVar;
        this.f9334q = j15;
        this.f9335r = j16;
        this.f9336s = j17;
        this.f9337t = j18;
        this.f9333p = z16;
    }

    public static p0 i(wa.m mVar) {
        androidx.media3.common.d0.a aVar = androidx.media3.common.d0.f8186a;
        sa.r rVar = sa.r.f158151d;
        ImmutableList immutableListOf = ImmutableList.of();
        androidx.media3.common.y yVar = androidx.media3.common.y.f8583d;
        androidx.media3.exoplayer.source.j.b bVar = f9317u;
        return new p0(aVar, bVar, C.TIME_UNSET, 0L, 1, null, false, rVar, mVar, immutableListOf, bVar, false, 1, 0, yVar, 0L, 0L, 0L, 0L, false);
    }

    public final p0 a() {
        return new p0(this.f9318a, this.f9319b, this.f9320c, this.f9321d, this.f9322e, this.f9323f, this.f9324g, this.f9325h, this.f9326i, this.f9327j, this.f9328k, this.f9329l, this.f9330m, this.f9331n, this.f9332o, this.f9334q, this.f9335r, j(), SystemClock.elapsedRealtime(), this.f9333p);
    }

    public final p0 b(androidx.media3.exoplayer.source.j.b bVar) {
        return new p0(this.f9318a, this.f9319b, this.f9320c, this.f9321d, this.f9322e, this.f9323f, this.f9324g, this.f9325h, this.f9326i, this.f9327j, bVar, this.f9329l, this.f9330m, this.f9331n, this.f9332o, this.f9334q, this.f9335r, this.f9336s, this.f9337t, this.f9333p);
    }

    public final p0 c(androidx.media3.exoplayer.source.j.b bVar, long j8, long j14, long j15, long j16, sa.r rVar, wa.m mVar, List<androidx.media3.common.w> list) {
        return new p0(this.f9318a, bVar, j14, j15, this.f9322e, this.f9323f, this.f9324g, rVar, mVar, list, this.f9328k, this.f9329l, this.f9330m, this.f9331n, this.f9332o, this.f9334q, j16, j8, SystemClock.elapsedRealtime(), this.f9333p);
    }

    public final p0 d(int i14, int i15, boolean z14) {
        return new p0(this.f9318a, this.f9319b, this.f9320c, this.f9321d, this.f9322e, this.f9323f, this.f9324g, this.f9325h, this.f9326i, this.f9327j, this.f9328k, z14, i14, i15, this.f9332o, this.f9334q, this.f9335r, this.f9336s, this.f9337t, this.f9333p);
    }

    public final p0 e(ExoPlaybackException exoPlaybackException) {
        return new p0(this.f9318a, this.f9319b, this.f9320c, this.f9321d, this.f9322e, exoPlaybackException, this.f9324g, this.f9325h, this.f9326i, this.f9327j, this.f9328k, this.f9329l, this.f9330m, this.f9331n, this.f9332o, this.f9334q, this.f9335r, this.f9336s, this.f9337t, this.f9333p);
    }

    public final p0 f(androidx.media3.common.y yVar) {
        return new p0(this.f9318a, this.f9319b, this.f9320c, this.f9321d, this.f9322e, this.f9323f, this.f9324g, this.f9325h, this.f9326i, this.f9327j, this.f9328k, this.f9329l, this.f9330m, this.f9331n, yVar, this.f9334q, this.f9335r, this.f9336s, this.f9337t, this.f9333p);
    }

    public final p0 g(int i14) {
        return new p0(this.f9318a, this.f9319b, this.f9320c, this.f9321d, i14, this.f9323f, this.f9324g, this.f9325h, this.f9326i, this.f9327j, this.f9328k, this.f9329l, this.f9330m, this.f9331n, this.f9332o, this.f9334q, this.f9335r, this.f9336s, this.f9337t, this.f9333p);
    }

    public final p0 h(androidx.media3.common.d0 d0Var) {
        return new p0(d0Var, this.f9319b, this.f9320c, this.f9321d, this.f9322e, this.f9323f, this.f9324g, this.f9325h, this.f9326i, this.f9327j, this.f9328k, this.f9329l, this.f9330m, this.f9331n, this.f9332o, this.f9334q, this.f9335r, this.f9336s, this.f9337t, this.f9333p);
    }

    public final long j() {
        long j8;
        long j14;
        if (!k()) {
            return this.f9336s;
        }
        do {
            j8 = this.f9337t;
            j14 = this.f9336s;
        } while (j8 != this.f9337t);
        return fa.z.O(fa.z.Y(j14) + ((long) ((SystemClock.elapsedRealtime() - j8) * this.f9332o.f8584a)));
    }

    public final boolean k() {
        return this.f9322e == 3 && this.f9329l && this.f9331n == 0;
    }
}
