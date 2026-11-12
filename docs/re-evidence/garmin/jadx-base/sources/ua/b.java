package ua;

import androidx.media3.common.q;
import androidx.media3.exoplayer.upstream.Loader;
import ha.g;
import ha.m;
import sa.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f169583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f169584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f169585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f169586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f169587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f169588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f169589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f169590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f169591i;

    public b(ha.d dVar, g gVar, int i14, q qVar, int i15, Object obj, long j8, long j14) {
        this.f169591i = new m(dVar);
        gVar.getClass();
        this.f169584b = gVar;
        this.f169585c = i14;
        this.f169586d = qVar;
        this.f169587e = i15;
        this.f169588f = obj;
        this.f169589g = j8;
        this.f169590h = j14;
        this.f169583a = i.f158115c.getAndIncrement();
    }
}
