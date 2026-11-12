package na;

import androidx.media3.common.b0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f125100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b0> f125101b;

    public b(d dVar, List<b0> list) {
        this.f125100a = dVar;
        this.f125101b = list;
    }

    @Override // na.d
    public final androidx.media3.exoplayer.upstream.c.a<c> a() {
        return new ra.a(this.f125100a.a(), this.f125101b);
    }

    @Override // na.d
    public final androidx.media3.exoplayer.upstream.c.a<c> b(androidx.media3.exoplayer.hls.playlist.c cVar, androidx.media3.exoplayer.hls.playlist.b bVar) {
        return new ra.a(this.f125100a.b(cVar, bVar), this.f125101b);
    }
}
