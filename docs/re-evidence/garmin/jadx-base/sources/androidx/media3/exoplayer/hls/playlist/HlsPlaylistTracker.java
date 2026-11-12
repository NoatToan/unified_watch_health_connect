package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.k;
import java.io.IOException;
import ma.l;

/* JADX INFO: loaded from: classes.dex */
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
        void a();

        boolean b(Uri uri, androidx.media3.exoplayer.upstream.b.c cVar, boolean z14);
    }

    void a(Uri uri, k.a aVar, HlsMediaSource hlsMediaSource);

    void b(l lVar);

    default void c(Uri uri) {
    }

    c d();

    void e(l lVar);

    void f();

    b h(Uri uri, boolean z14);

    long j();

    boolean k(long j8, Uri uri);

    void m(Uri uri);

    void n(Uri uri);

    boolean o(Uri uri);

    boolean p();

    void stop();
}
