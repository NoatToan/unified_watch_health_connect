package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import fa.z;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f9281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pa.f f9282b;

    public static class b implements c.b {
        public static MediaCodec b(c.a aVar) throws IOException {
            aVar.f9263a.getClass();
            String str = aVar.f9263a.f9270a;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0045  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.g$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.c.b
        @SuppressLint({"WrongConstant"})
        public final c a(c.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecB = b(aVar);
                try {
                    Trace.beginSection("configureCodec");
                    Surface surface = aVar.f9266d;
                    mediaCodecB.configure(aVar.f9264b, surface, aVar.f9267e, (surface == null && aVar.f9263a.f9277h && z.f70071a >= 35) ? 8 : 0);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    mediaCodecB.start();
                    Trace.endSection();
                    return new g(mediaCodecB, aVar.f9268f);
                } catch (IOException e4) {
                    e = e4;
                    mediaCodec = mediaCodecB;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e14) {
                    e = e14;
                    mediaCodec = mediaCodecB;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e15) {
                e = e15;
            } catch (RuntimeException e16) {
                e = e16;
            }
        }
    }

    private g(MediaCodec mediaCodec, pa.f fVar) {
        this.f9281a = mediaCodec;
        this.f9282b = fVar;
        if (z.f70071a < 35 || fVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = fVar.f136704c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            fa.a.d(fVar.f136702a.add(mediaCodec));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void a(int i14, int i15, int i16, long j8) {
        this.f9281a.queueInputBuffer(i14, 0, i15, j8, i16);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void b(int i14, ia.b bVar, long j8, int i15) {
        this.f9281a.queueSecureInputBuffer(i14, 0, bVar.f92381i, j8, i15);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void c(androidx.media3.exoplayer.video.b.e eVar, Handler handler) {
        this.f9281a.setOnFrameRenderedListener(new pa.a(this, eVar, 1), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void d(int i14) {
        this.f9281a.releaseOutputBuffer(i14, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int dequeueInputBufferIndex() {
        return this.f9281a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f9281a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void f() {
        this.f9281a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void flush() {
        this.f9281a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final ByteBuffer getInputBuffer(int i14) {
        return this.f9281a.getInputBuffer(i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final ByteBuffer getOutputBuffer(int i14) {
        return this.f9281a.getOutputBuffer(i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final MediaFormat getOutputFormat() {
        return this.f9281a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void release() {
        pa.f fVar = this.f9282b;
        MediaCodec mediaCodec = this.f9281a;
        try {
            int i14 = z.f70071a;
            if (i14 >= 30 && i14 < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (z.f70071a >= 35 && fVar != null) {
                fVar.a(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void releaseOutputBuffer(int i14, long j8) {
        this.f9281a.releaseOutputBuffer(i14, j8);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setOutputSurface(Surface surface) {
        this.f9281a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setParameters(Bundle bundle) {
        this.f9281a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setVideoScalingMode(int i14) {
        this.f9281a.setVideoScalingMode(i14);
    }
}
