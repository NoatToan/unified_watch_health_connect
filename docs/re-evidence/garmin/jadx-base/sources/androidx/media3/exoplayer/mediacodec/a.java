package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.common.base.Supplier;
import fa.z;
import java.nio.ByteBuffer;
import k32.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f9254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pa.c f9255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pa.g f9256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pa.f f9257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9259f;

    private a(MediaCodec mediaCodec, HandlerThread handlerThread, pa.g gVar, pa.f fVar) {
        this.f9254a = mediaCodec;
        this.f9255b = new pa.c(handlerThread);
        this.f9256c = gVar;
        this.f9257d = fVar;
        this.f9259f = 0;
    }

    public static void g(a aVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i14) {
        pa.f fVar;
        LoudnessCodecController loudnessCodecController;
        pa.c cVar = aVar.f9255b;
        MediaCodec mediaCodec = aVar.f9254a;
        HandlerThread handlerThread = cVar.f136684b;
        fa.a.d(cVar.f136685c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(cVar, handler);
        cVar.f136685c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i14);
        Trace.endSection();
        aVar.f9256c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (z.f70071a >= 35 && (fVar = aVar.f9257d) != null && ((loudnessCodecController = fVar.f136704c) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            fa.a.d(fVar.f136702a.add(mediaCodec));
        }
        aVar.f9259f = 1;
    }

    public static String h(int i14, String str) {
        StringBuilder sb3 = new StringBuilder(str);
        if (i14 == 1) {
            sb3.append("Audio");
        } else if (i14 == 2) {
            sb3.append("Video");
        } else {
            sb3.append("Unknown(");
            sb3.append(i14);
            sb3.append(")");
        }
        return sb3.toString();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void a(int i14, int i15, int i16, long j8) {
        this.f9256c.a(i14, i15, i16, j8);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void b(int i14, ia.b bVar, long j8, int i15) {
        this.f9256c.b(i14, bVar, j8, i15);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void c(androidx.media3.exoplayer.video.b.e eVar, Handler handler) {
        this.f9254a.setOnFrameRenderedListener(new pa.a(this, eVar, 0), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void d(int i14) {
        this.f9254a.releaseOutputBuffer(i14, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int dequeueInputBufferIndex() {
        this.f9256c.c();
        pa.c cVar = this.f9255b;
        synchronized (cVar.f136683a) {
            try {
                IllegalStateException illegalStateException = cVar.f136696n;
                if (illegalStateException != null) {
                    cVar.f136696n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = cVar.f136692j;
                if (codecException != null) {
                    cVar.f136692j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = cVar.f136693k;
                if (cryptoException != null) {
                    cVar.f136693k = null;
                    throw cryptoException;
                }
                int i14 = -1;
                if (cVar.f136694l > 0 || cVar.f136695m) {
                    return -1;
                }
                p1.c cVar2 = cVar.f136686d;
                int i15 = cVar2.f134680b;
                int i16 = cVar2.f134681c;
                if (!(i15 == i16)) {
                    if (i15 == i16) {
                        int i17 = p1.d.f134691a;
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i14 = cVar2.f134679a[i15];
                    cVar2.f134680b = (i15 + 1) & cVar2.f134682d;
                }
                return i14;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.f9256c.c();
        pa.c cVar = this.f9255b;
        synchronized (cVar.f136683a) {
            try {
                IllegalStateException illegalStateException = cVar.f136696n;
                if (illegalStateException != null) {
                    cVar.f136696n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = cVar.f136692j;
                if (codecException != null) {
                    cVar.f136692j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = cVar.f136693k;
                if (cryptoException != null) {
                    cVar.f136693k = null;
                    throw cryptoException;
                }
                if (cVar.f136694l > 0 || cVar.f136695m) {
                    return -1;
                }
                p1.c cVar2 = cVar.f136687e;
                int i14 = cVar2.f134680b;
                int i15 = cVar2.f134681c;
                if (i14 == i15) {
                    return -1;
                }
                if (i14 == i15) {
                    int i16 = p1.d.f134691a;
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i17 = cVar2.f134679a[i14];
                cVar2.f134680b = cVar2.f134682d & (i14 + 1);
                if (i17 >= 0) {
                    fa.a.f(cVar.f136690h);
                    MediaCodec.BufferInfo bufferInfoRemove = cVar.f136688f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (i17 == -2) {
                    cVar.f136690h = cVar.f136689g.remove();
                }
                return i17;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final boolean e(MediaCodecRenderer.b bVar) {
        pa.c cVar = this.f9255b;
        synchronized (cVar.f136683a) {
            cVar.f136697o = bVar;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void f() {
        this.f9254a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void flush() {
        this.f9256c.flush();
        this.f9254a.flush();
        pa.c cVar = this.f9255b;
        synchronized (cVar.f136683a) {
            cVar.f136694l++;
            Handler handler = cVar.f136685c;
            int i14 = z.f70071a;
            handler.post(new n(cVar, 27));
        }
        this.f9254a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final ByteBuffer getInputBuffer(int i14) {
        return this.f9254a.getInputBuffer(i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final ByteBuffer getOutputBuffer(int i14) {
        return this.f9254a.getOutputBuffer(i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        pa.c cVar = this.f9255b;
        synchronized (cVar.f136683a) {
            try {
                mediaFormat = cVar.f136690h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void release() {
        pa.f fVar;
        pa.f fVar2;
        try {
            if (this.f9259f == 1) {
                this.f9256c.shutdown();
                pa.c cVar = this.f9255b;
                synchronized (cVar.f136683a) {
                    cVar.f136695m = true;
                    cVar.f136684b.quit();
                    cVar.a();
                }
            }
            this.f9259f = 2;
            if (this.f9258e) {
                return;
            }
            try {
                int i14 = z.f70071a;
                if (i14 >= 30 && i14 < 33) {
                    this.f9254a.stop();
                }
            } finally {
                if (z.f70071a >= 35 && (fVar2 = this.f9257d) != null) {
                    fVar2.a(this.f9254a);
                }
                this.f9254a.release();
                this.f9258e = true;
            }
        } catch (Throwable th3) {
            if (!this.f9258e) {
                try {
                    int i15 = z.f70071a;
                    if (i15 >= 30 && i15 < 33) {
                        this.f9254a.stop();
                    }
                } finally {
                    if (z.f70071a >= 35 && (fVar = this.f9257d) != null) {
                        fVar.a(this.f9254a);
                    }
                    this.f9254a.release();
                    this.f9258e = true;
                }
            }
            throw th3;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void releaseOutputBuffer(int i14, long j8) {
        this.f9254a.releaseOutputBuffer(i14, j8);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setOutputSurface(Surface surface) {
        this.f9254a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setParameters(Bundle bundle) {
        this.f9256c.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.c
    public final void setVideoScalingMode(int i14) {
        this.f9254a.setVideoScalingMode(i14);
    }

    public static final class b implements c.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Supplier<HandlerThread> f9260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Supplier<HandlerThread> f9261c;

        public b(int i14) {
            this(new com.google.android.exoplayer2.mediacodec.b(i14, 4), new com.google.android.exoplayer2.mediacodec.b(i14, 5));
        }

        @Override // androidx.media3.exoplayer.mediacodec.c.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a a(c.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f9263a.f9270a;
            a aVar2 = null;
            try {
                Trace.beginSection("createCodec:".concat(str));
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    a aVar3 = new a(mediaCodecCreateByCodecName, this.f9260b.get(), new pa.b(mediaCodecCreateByCodecName, this.f9261c.get()), aVar.f9268f);
                    try {
                        Trace.endSection();
                        Surface surface = aVar.f9266d;
                        a.g(aVar3, aVar.f9264b, surface, aVar.f9267e, (surface == null && aVar.f9263a.f9277h && z.f70071a >= 35) ? 8 : 0);
                        return aVar3;
                    } catch (Exception e4) {
                        exc = e4;
                        aVar2 = aVar3;
                        if (aVar2 != null) {
                            aVar2.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e14) {
                    exc = e14;
                }
            } catch (Exception e15) {
                exc = e15;
                mediaCodecCreateByCodecName = null;
            }
        }

        public b(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2) {
            this.f9260b = supplier;
            this.f9261c = supplier2;
        }
    }
}
