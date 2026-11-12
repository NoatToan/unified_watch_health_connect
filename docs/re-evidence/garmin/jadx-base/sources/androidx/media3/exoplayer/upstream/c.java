package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import fa.z;
import ha.d;
import ha.e;
import ha.g;
import ha.m;
import sa.i;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f9726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f9728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a<? extends T> f9729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile T f9730f;

    public interface a<T> {
        Object a(Uri uri, e eVar);
    }

    public c(d dVar, g gVar, int i14, a<? extends T> aVar) {
        this.f9728d = new m(dVar);
        this.f9726b = gVar;
        this.f9727c = i14;
        this.f9729e = aVar;
        this.f9725a = i.f158115c.getAndIncrement();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void cancelLoad() {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void load() {
        this.f9728d.f82617b = 0L;
        e eVar = new e(this.f9728d, this.f9726b);
        try {
            eVar.a();
            Uri uri = this.f9728d.f82616a.getUri();
            uri.getClass();
            this.f9730f = (T) this.f9729e.a(uri, eVar);
        } finally {
            z.g(eVar);
        }
    }

    public c(d dVar, Uri uri, int i14, a<? extends T> aVar) {
        g.b bVar = new g.b();
        bVar.f82565a = uri;
        bVar.f82573i = 1;
        this(dVar, bVar.a(), i14, aVar);
    }
}
