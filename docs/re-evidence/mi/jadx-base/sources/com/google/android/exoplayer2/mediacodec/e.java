package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import defpackage.nkp;
import defpackage.rk1;
import defpackage.s45;
import defpackage.wlq;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class e implements com.google.android.exoplayer2.mediacodec.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f7983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f7984b;
    public ByteBuffer[] c;

    public static class b implements com.google.android.exoplayer2.mediacodec.b.InterfaceC0187b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.mediacodec.e$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // com.google.android.exoplayer2.mediacodec.b.InterfaceC0187b
        public com.google.android.exoplayer2.mediacodec.b a(com.google.android.exoplayer2.mediacodec.b.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecB = b(aVar);
                try {
                    nkp.a("configureCodec");
                    mediaCodecB.configure(aVar.f7977b, aVar.d, aVar.e, aVar.f);
                    nkp.c();
                    nkp.a("startCodec");
                    mediaCodecB.start();
                    nkp.c();
                    return new e(mediaCodecB);
                } catch (IOException | RuntimeException e) {
                    e = e;
                    mediaCodec = mediaCodecB;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
        }

        public MediaCodec b(com.google.android.exoplayer2.mediacodec.b.a aVar) throws IOException {
            rk1.e(aVar.f7976a);
            String str = aVar.f7976a.f7979a;
            String strValueOf = String.valueOf(str);
            nkp.a(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            nkp.c();
            return mediaCodecCreateByCodecName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(com.google.android.exoplayer2.mediacodec.b.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void a(int i, int i2, s45 s45Var, long j, int i3) {
        this.f7983a.queueSecureInputBuffer(i, i2, s45Var.a(), j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void b(int i) {
        this.f7983a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    @RequiresApi(19)
    public void c(Bundle bundle) {
        this.f7983a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    @RequiresApi(21)
    public void d(int i, long j) {
        this.f7983a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public int e(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f7983a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && wlq.f38110a < 21) {
                this.c = this.f7983a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void f(int i, boolean z) {
        this.f7983a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void flush() {
        this.f7983a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public MediaFormat g() {
        return this.f7983a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    @RequiresApi(23)
    public void h(final com.google.android.exoplayer2.mediacodec.b.c cVar, Handler handler) {
        this.f7983a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: mvo
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f27268a.o(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public ByteBuffer i(int i) {
        return wlq.f38110a >= 21 ? this.f7983a.getInputBuffer(i) : ((ByteBuffer[]) wlq.j(this.f7984b))[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    @RequiresApi(23)
    public void j(Surface surface) {
        this.f7983a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void k(int i, int i2, int i3, long j, int i4) {
        this.f7983a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public int l() {
        return this.f7983a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public ByteBuffer m(int i) {
        return wlq.f38110a >= 21 ? this.f7983a.getOutputBuffer(i) : ((ByteBuffer[]) wlq.j(this.c))[i];
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void release() {
        this.f7984b = null;
        this.c = null;
        this.f7983a.release();
    }

    public e(MediaCodec mediaCodec) {
        this.f7983a = mediaCodec;
        if (wlq.f38110a < 21) {
            this.f7984b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }
}
