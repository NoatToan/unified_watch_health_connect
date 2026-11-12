package na;

import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {
    @Override // na.d
    public final androidx.media3.exoplayer.upstream.c.a<c> a() {
        return new HlsPlaylistParser();
    }

    @Override // na.d
    public final androidx.media3.exoplayer.upstream.c.a<c> b(androidx.media3.exoplayer.hls.playlist.c cVar, androidx.media3.exoplayer.hls.playlist.b bVar) {
        return new HlsPlaylistParser(cVar, bVar);
    }
}
