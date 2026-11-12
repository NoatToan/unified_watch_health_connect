package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.q;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f9263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f9264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q f9265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f9266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f9267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final pa.f f9268f;

        private a(d dVar, MediaFormat mediaFormat, q qVar, Surface surface, MediaCrypto mediaCrypto, pa.f fVar) {
            this.f9263a = dVar;
            this.f9264b = mediaFormat;
            this.f9265c = qVar;
            this.f9266d = surface;
            this.f9267e = mediaCrypto;
            this.f9268f = fVar;
        }

        public static a a(d dVar, MediaFormat mediaFormat, q qVar, MediaCrypto mediaCrypto, pa.f fVar) {
            return new a(dVar, mediaFormat, qVar, null, mediaCrypto, fVar);
        }

        public static a b(d dVar, MediaFormat mediaFormat, q qVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(dVar, mediaFormat, qVar, surface, mediaCrypto, null);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f9269a = 0;

        static {
            new androidx.media3.exoplayer.mediacodec.b();
        }

        c a(a aVar);
    }

    void a(int i14, int i15, int i16, long j8);

    void b(int i14, ia.b bVar, long j8, int i15);

    void c(androidx.media3.exoplayer.video.b.e eVar, Handler handler);

    void d(int i14);

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    default boolean e(MediaCodecRenderer.b bVar) {
        return false;
    }

    void f();

    void flush();

    ByteBuffer getInputBuffer(int i14);

    ByteBuffer getOutputBuffer(int i14);

    MediaFormat getOutputFormat();

    void release();

    void releaseOutputBuffer(int i14, long j8);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i14);
}
