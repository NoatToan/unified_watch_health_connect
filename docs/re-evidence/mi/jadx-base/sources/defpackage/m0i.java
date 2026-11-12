package defpackage;

import androidx.annotation.CheckResult;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m0i {
    public static final k.a t = new k.a(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f25618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.a f25619b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final TrackGroupArray h;
    public final cop i;
    public final List<Metadata> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k.a f25620k;
    public final boolean l;
    public final int m;
    public final n0i n;
    public final boolean o;
    public final boolean p;
    public volatile long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f25621r;
    public volatile long s;

    public m0i(v vVar, k.a aVar, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, TrackGroupArray trackGroupArray, cop copVar, List<Metadata> list, k.a aVar2, boolean z2, int i2, n0i n0iVar, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.f25618a = vVar;
        this.f25619b = aVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = trackGroupArray;
        this.i = copVar;
        this.j = list;
        this.f25620k = aVar2;
        this.l = z2;
        this.m = i2;
        this.n = n0iVar;
        this.q = j3;
        this.f25621r = j4;
        this.s = j5;
        this.o = z3;
        this.p = z4;
    }

    public static m0i k(cop copVar) {
        v vVar = v.f8444a;
        k.a aVar = t;
        return new m0i(vVar, aVar, -9223372036854775807L, 0L, 1, null, false, TrackGroupArray.EMPTY, copVar, ImmutableList.of(), aVar, false, 0, n0i.d, 0L, 0L, 0L, false, false);
    }

    public static k.a l() {
        return t;
    }

    @CheckResult
    public m0i a(boolean z) {
        return new m0i(this.f25618a, this.f25619b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.f25620k, this.l, this.m, this.n, this.q, this.f25621r, this.s, this.o, this.p);
    }

    @CheckResult
    public m0i b(k.a aVar) {
        return new m0i(this.f25618a, this.f25619b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, aVar, this.l, this.m, this.n, this.q, this.f25621r, this.s, this.o, this.p);
    }

    @CheckResult
    public m0i c(k.a aVar, long j, long j2, long j3, long j4, TrackGroupArray trackGroupArray, cop copVar, List<Metadata> list) {
        return new m0i(this.f25618a, aVar, j2, j3, this.e, this.f, this.g, trackGroupArray, copVar, list, this.f25620k, this.l, this.m, this.n, this.q, j4, j, this.o, this.p);
    }

    @CheckResult
    public m0i d(boolean z) {
        return new m0i(this.f25618a, this.f25619b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.f25620k, this.l, this.m, this.n, this.q, this.f25621r, this.s, z, this.p);
    }

    @CheckResult
    public m0i e(boolean z, int i) {
        return new m0i(this.f25618a, this.f25619b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.f25620k, z, i, this.n, this.q, this.f25621r, this.s, this.o, this.p);
    }

    @CheckResult
    public m0i f(ExoPlaybackException exoPlaybackException) {
        return new m0i(this.f25618a, this.f25619b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.f25620k, this.l, this.m, this.n, this.q, this.f25621r, this.s, this.o, this.p);
    }

    @CheckResult
    public m0i g(n0i n0iVar) {
        return new m0i(this.f25618a, this.f25619b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.f25620k, this.l, this.m, n0iVar, this.q, this.f25621r, this.s, this.o, this.p);
    }

    @CheckResult
    public m0i h(int i) {
        return new m0i(this.f25618a, this.f25619b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.f25620k, this.l, this.m, this.n, this.q, this.f25621r, this.s, this.o, this.p);
    }

    @CheckResult
    public m0i i(boolean z) {
        return new m0i(this.f25618a, this.f25619b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.f25620k, this.l, this.m, this.n, this.q, this.f25621r, this.s, this.o, z);
    }

    @CheckResult
    public m0i j(v vVar) {
        return new m0i(vVar, this.f25619b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.f25620k, this.l, this.m, this.n, this.q, this.f25621r, this.s, this.o, this.p);
    }
}
