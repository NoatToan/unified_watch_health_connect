package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.upstream.h;
import defpackage.e9c;
import defpackage.l9c;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }

    public interface a {
        HlsPlaylistTracker a(e9c e9cVar, h hVar, l9c l9cVar);
    }

    public interface b {
        void d();

        boolean l(Uri uri, long j);
    }

    public interface c {
        void h(com.google.android.exoplayer2.source.hls.playlist.c cVar);
    }

    void a(b bVar);

    long b();

    com.google.android.exoplayer2.source.hls.playlist.b c();

    void d(Uri uri, l.a aVar, c cVar);

    void e(Uri uri) throws IOException;

    void f(Uri uri);

    void g(b bVar);

    boolean h(Uri uri);

    boolean i();

    void j() throws IOException;

    com.google.android.exoplayer2.source.hls.playlist.c k(Uri uri, boolean z);

    void stop();
}
