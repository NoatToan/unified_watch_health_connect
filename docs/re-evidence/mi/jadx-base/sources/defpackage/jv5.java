package defpackage;

import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.b;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.upstream.i;

/* JADX INFO: loaded from: classes4.dex */
public final class jv5 implements l9c {
    @Override // defpackage.l9c
    public i.a<k9c> a(b bVar, c cVar) {
        return new HlsPlaylistParser(bVar, cVar);
    }

    @Override // defpackage.l9c
    public i.a<k9c> b() {
        return new HlsPlaylistParser();
    }
}
