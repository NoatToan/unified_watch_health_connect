package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.mediacodec.a;
import defpackage.nkp;
import defpackage.s45;
import defpackage.spo;
import defpackage.wl1;
import defpackage.yl1;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(23)
public final class a implements com.google.android.exoplayer2.mediacodec.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f7973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yl1 f7974b;
    public final wl1 c;
    public final boolean d;
    public boolean e;
    public int f;

    public static final class b implements com.google.android.exoplayer2.mediacodec.b.InterfaceC0187b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final spo<HandlerThread> f7975b;
        public final spo<HandlerThread> c;
        public final boolean d;
        public final boolean e;

        public b(final int i, boolean z, boolean z2) {
            this(new spo() { // from class: ul1
                @Override // defpackage.spo
                public final Object get() {
                    return a.b.e(i);
                }
            }, new spo() { // from class: vl1
                @Override // defpackage.spo
                public final Object get() {
                    return a.b.f(i);
                }
            }, z, z2);
        }

        public static /* synthetic */ HandlerThread e(int i) {
            return new HandlerThread(a.t(i));
        }

        public static /* synthetic */ HandlerThread f(int i) {
            return new HandlerThread(a.u(i));
        }

        @Override // com.google.android.exoplayer2.mediacodec.b.InterfaceC0187b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(com.google.android.exoplayer2.mediacodec.b.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f7976a.f7979a;
            a aVar2 = null;
            try {
                String strValueOf = String.valueOf(str);
                nkp.a(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    a aVar3 = new a(mediaCodecCreateByCodecName, this.f7975b.get(), this.c.get(), this.d, this.e);
                    try {
                        nkp.c();
                        nkp.a("configureCodec");
                        aVar3.s(aVar.f7977b, aVar.d, aVar.e, aVar.f);
                        nkp.c();
                        nkp.a("startCodec");
                        aVar3.y();
                        nkp.c();
                        return aVar3;
                    } catch (Exception e) {
                        e = e;
                        aVar2 = aVar3;
                        if (aVar2 != null) {
                            aVar2.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }

        @VisibleForTesting
        public b(spo<HandlerThread> spoVar, spo<HandlerThread> spoVar2, boolean z, boolean z2) {
            this.f7975b = spoVar;
            this.c = spoVar2;
            this.d = z;
            this.e = z2;
        }
    }

    public static String t(int i) {
        return v(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String u(int i) {
        return v(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String v(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void a(int i, int i2, s45 s45Var, long j, int i3) {
        this.c.o(i, i2, s45Var, j, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void b(int i) {
        x();
        this.f7973a.setVideoScalingMode(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void c(Bundle bundle) {
        x();
        this.f7973a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void d(int i, long j) {
        this.f7973a.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public int e(MediaCodec.BufferInfo bufferInfo) {
        return this.f7974b.d(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void f(int i, boolean z) {
        this.f7973a.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void flush() {
        this.c.i();
        this.f7973a.flush();
        yl1 yl1Var = this.f7974b;
        final MediaCodec mediaCodec = this.f7973a;
        Objects.requireNonNull(mediaCodec);
        yl1Var.e(new Runnable() { // from class: sl1
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public MediaFormat g() {
        return this.f7974b.g();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void h(final com.google.android.exoplayer2.mediacodec.b.c cVar, Handler handler) {
        x();
        this.f7973a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: tl1
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.f34805a.w(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public ByteBuffer i(int i) {
        return this.f7973a.getInputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void j(Surface surface) {
        x();
        this.f7973a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void k(int i, int i2, int i3, long j, int i4) {
        this.c.n(i, i2, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public int l() {
        return this.f7974b.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public ByteBuffer m(int i) {
        return this.f7973a.getOutputBuffer(i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.b
    public void release() {
        try {
            if (this.f == 2) {
                this.c.r();
            }
            int i = this.f;
            if (i == 1 || i == 2) {
                this.f7974b.q();
            }
            this.f = 3;
        } finally {
            if (!this.e) {
                this.f7973a.release();
                this.e = true;
            }
        }
    }

    public final void s(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f7974b.h(this.f7973a);
        this.f7973a.configure(mediaFormat, surface, mediaCrypto, i);
        this.f = 1;
    }

    public final /* synthetic */ void w(com.google.android.exoplayer2.mediacodec.b.c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.a(this, j, j2);
    }

    public final void x() {
        if (this.d) {
            try {
                this.c.t();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void y() {
        this.c.s();
        this.f7973a.start();
        this.f = 2;
    }

    public a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f7973a = mediaCodec;
        this.f7974b = new yl1(handlerThread);
        this.c = new wl1(mediaCodec, handlerThread2, z);
        this.d = z2;
        this.f = 0;
    }
}
