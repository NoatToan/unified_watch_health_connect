package androidx.media3.exoplayer.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.Trace;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.q;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.t0;
import bb.e0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import fa.k;
import fa.v;
import fa.z;
import j20.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import ka.m;
import sa.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecRenderer extends androidx.media3.exoplayer.f {

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final byte[] f9209y1 = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    public final pa.d A;
    public final MediaCodec.BufferInfo B;
    public final ArrayDeque<c> C;
    public final m D;
    public q E;
    public q F;
    public androidx.media3.exoplayer.mediacodec.c H0;
    public DrmSession I;
    public q I0;
    public MediaFormat J0;
    public boolean K0;
    public float L0;
    public ArrayDeque<d> M0;
    public DecoderInitializationException N0;
    public d O0;
    public DrmSession P;
    public int P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public t0.a T;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public long W0;
    public MediaCrypto X;
    public long X0;
    public final long Y;
    public int Y0;
    public float Z;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public ByteBuffer f9210a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f9211b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f9212c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f9213d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f9214e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f9215f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f9216g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f9217h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f9218i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f9219j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f9220k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f9221k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f9222l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f9223m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public long f9224n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public long f9225o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f9226p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f9227q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.media3.exoplayer.mediacodec.c.b f9228r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean f9229r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f9230s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f9231t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public ExoPlaybackException f9232t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public androidx.media3.exoplayer.g f9233u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9234v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public c f9235v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f9236w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public long f9237w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DecoderInputBuffer f9238x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f9239x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DecoderInputBuffer f9240y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final DecoderInputBuffer f9241z;

    public final class b {
        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f9243e = new c(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v<q> f9247d = new v<>();

        public c(long j8, long j14, long j15) {
            this.f9244a = j8;
            this.f9245b = j14;
            this.f9246c = j15;
        }
    }

    public MediaCodecRenderer(int i14, androidx.media3.exoplayer.mediacodec.c.b bVar, f fVar, boolean z14, float f14) {
        super(i14);
        this.f9228r = bVar;
        fVar.getClass();
        this.f9231t = fVar;
        this.f9234v = z14;
        this.f9236w = f14;
        this.f9238x = new DecoderInputBuffer(0);
        this.f9240y = new DecoderInputBuffer(0);
        this.f9241z = new DecoderInputBuffer(2);
        pa.d dVar = new pa.d();
        this.A = dVar;
        this.B = new MediaCodec.BufferInfo();
        this.Z = 1.0f;
        this.f9220k0 = 1.0f;
        this.Y = C.TIME_UNSET;
        this.C = new ArrayDeque<>();
        this.f9235v1 = c.f9243e;
        dVar.e(0);
        dVar.f8631d.order(ByteOrder.nativeOrder());
        this.D = new m();
        this.L0 = -1.0f;
        this.P0 = 0;
        this.f9217h1 = 0;
        this.Y0 = -1;
        this.Z0 = -1;
        this.X0 = C.TIME_UNSET;
        this.f9224n1 = C.TIME_UNSET;
        this.f9225o1 = C.TIME_UNSET;
        this.f9237w1 = C.TIME_UNSET;
        this.W0 = C.TIME_UNSET;
        this.f9218i1 = 0;
        this.f9219j1 = 0;
        this.f9233u1 = new androidx.media3.exoplayer.g();
    }

    public final boolean A(long j8, long j14) throws ExoPlaybackException {
        boolean z14;
        MediaCodec.BufferInfo bufferInfo;
        boolean zB0;
        int iDequeueOutputBufferIndex;
        androidx.media3.exoplayer.mediacodec.c cVar = this.H0;
        cVar.getClass();
        int i14 = this.Z0;
        MediaCodec.BufferInfo bufferInfo2 = this.B;
        if (i14 < 0) {
            if (this.S0 && this.f9222l1) {
                try {
                    iDequeueOutputBufferIndex = cVar.dequeueOutputBufferIndex(bufferInfo2);
                } catch (IllegalStateException unused) {
                    a0();
                    if (this.f9227q1) {
                        d0();
                    }
                }
            } else {
                iDequeueOutputBufferIndex = cVar.dequeueOutputBufferIndex(bufferInfo2);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    this.f9223m1 = true;
                    androidx.media3.exoplayer.mediacodec.c cVar2 = this.H0;
                    cVar2.getClass();
                    MediaFormat outputFormat = cVar2.getOutputFormat();
                    if (this.P0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.U0 = true;
                        return true;
                    }
                    this.J0 = outputFormat;
                    this.K0 = true;
                    return true;
                }
                if (this.V0 && (this.f9226p1 || this.f9218i1 == 2)) {
                    a0();
                }
                long j15 = this.W0;
                if (j15 != C.TIME_UNSET) {
                    long j16 = j15 + 100;
                    fa.c cVar3 = this.f8927g;
                    cVar3.getClass();
                    if (j16 < cVar3.currentTimeMillis()) {
                        a0();
                        return false;
                    }
                }
                return false;
            }
            if (this.U0) {
                this.U0 = false;
                cVar.d(iDequeueOutputBufferIndex);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                a0();
                return false;
            }
            this.Z0 = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = cVar.getOutputBuffer(iDequeueOutputBufferIndex);
            this.f9210a1 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.f9210a1.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j17 = bufferInfo2.presentationTimeUs;
            this.f9211b1 = j17 < this.f8932l;
            long j18 = this.f9225o1;
            this.f9212c1 = j18 != C.TIME_UNSET && j18 <= j17;
            p0(j17);
        }
        if (this.S0 && this.f9222l1) {
            try {
                ByteBuffer byteBuffer = this.f9210a1;
                int i15 = this.Z0;
                int i16 = bufferInfo2.flags;
                long j19 = bufferInfo2.presentationTimeUs;
                boolean z15 = this.f9211b1;
                boolean z16 = this.f9212c1;
                q qVar = this.F;
                qVar.getClass();
                z14 = false;
                bufferInfo = bufferInfo2;
                try {
                    zB0 = b0(j8, j14, cVar, byteBuffer, i15, i16, 1, j19, z15, z16, qVar);
                } catch (IllegalStateException unused2) {
                    a0();
                    if (!this.f9227q1) {
                        return z14;
                    }
                    d0();
                    return z14;
                }
            } catch (IllegalStateException unused3) {
                z14 = false;
            }
        } else {
            z14 = false;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.f9210a1;
            int i17 = this.Z0;
            int i18 = bufferInfo.flags;
            long j24 = bufferInfo.presentationTimeUs;
            boolean z17 = this.f9211b1;
            boolean z18 = this.f9212c1;
            q qVar2 = this.F;
            qVar2.getClass();
            zB0 = b0(j8, j14, cVar, byteBuffer2, i17, i18, 1, j24, z17, z18, qVar2);
        }
        if (!zB0) {
            return z14;
        }
        W(bufferInfo.presentationTimeUs);
        boolean z19 = (bufferInfo.flags & 4) != 0 ? true : z14;
        if (!z19 && this.f9222l1 && this.f9212c1) {
            fa.c cVar4 = this.f8927g;
            cVar4.getClass();
            this.W0 = cVar4.currentTimeMillis();
        }
        this.Z0 = -1;
        this.f9210a1 = null;
        if (!z19) {
            return r15;
        }
        a0();
        return z14;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x0091 A[EDGE_INSN: B:111:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:30:0x006f->B:32:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x006f->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:79:0x0128  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0130  */
    /* JADX WARN: Code duplicated, block: B:86:0x0145  */
    /* JADX WARN: Code duplicated, block: B:88:0x014d  */
    /* JADX WARN: Code duplicated, block: B:89:0x015e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:98:0x0191  */
    public final boolean B() throws ExoPlaybackException {
        int iPosition;
        a0 a0Var;
        int iU;
        boolean zB;
        long j8;
        int iF;
        int i14;
        ArrayDeque<c> arrayDeque;
        ia.b bVar;
        int i15;
        q qVar;
        androidx.media3.exoplayer.mediacodec.c cVar = this.H0;
        if (cVar != null && this.f9218i1 != 2 && !this.f9226p1) {
            int i16 = this.Y0;
            DecoderInputBuffer decoderInputBuffer = this.f9240y;
            if (i16 < 0) {
                int iDequeueInputBufferIndex = cVar.dequeueInputBufferIndex();
                this.Y0 = iDequeueInputBufferIndex;
                if (iDequeueInputBufferIndex >= 0) {
                    decoderInputBuffer.f8631d = cVar.getInputBuffer(iDequeueInputBufferIndex);
                    decoderInputBuffer.c();
                    if (this.f9218i1 == 1) {
                        if (!this.V0) {
                            this.f9222l1 = true;
                            cVar.a(this.Y0, 0, 4, 0L);
                            this.Y0 = -1;
                            decoderInputBuffer.f8631d = null;
                        }
                        this.f9218i1 = 2;
                        return false;
                    }
                    if (this.T0) {
                        this.T0 = false;
                        ByteBuffer byteBuffer = decoderInputBuffer.f8631d;
                        byteBuffer.getClass();
                        byteBuffer.put(f9209y1);
                        cVar.a(this.Y0, 38, 0, 0L);
                        this.Y0 = -1;
                        decoderInputBuffer.f8631d = null;
                        this.f9221k1 = true;
                        return true;
                    }
                    if (this.f9217h1 == 1) {
                        i15 = 0;
                        while (true) {
                            qVar = this.I0;
                            qVar.getClass();
                            if (i15 < qVar.f8389q.size()) {
                                break;
                            }
                            byte[] bArr = this.I0.f8389q.get(i15);
                            ByteBuffer byteBuffer2 = decoderInputBuffer.f8631d;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i15++;
                        }
                        this.f9217h1 = 2;
                    }
                    ByteBuffer byteBuffer3 = decoderInputBuffer.f8631d;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    a0Var = this.f8923c;
                    a0Var.a();
                    try {
                        iU = u(a0Var, decoderInputBuffer, 0);
                        if (iU == -3) {
                            if (hasReadStreamToEnd()) {
                                this.f9225o1 = this.f9224n1;
                                return false;
                            }
                        } else {
                            if (iU == -5) {
                                if (this.f9217h1 == 2) {
                                    decoderInputBuffer.c();
                                    this.f9217h1 = 1;
                                }
                                T(a0Var);
                                return true;
                            }
                            if (decoderInputBuffer.b(4)) {
                                if (this.f9221k1 && !decoderInputBuffer.b(1)) {
                                    decoderInputBuffer.c();
                                    if (this.f9217h1 == 2) {
                                        this.f9217h1 = 1;
                                    }
                                    return true;
                                }
                                if (k0(decoderInputBuffer)) {
                                    decoderInputBuffer.c();
                                    this.f9233u1.f8958d++;
                                    return true;
                                }
                                zB = decoderInputBuffer.b(1073741824);
                                if (zB) {
                                    bVar = decoderInputBuffer.f8630c;
                                    if (iPosition == 0) {
                                        bVar.getClass();
                                    } else {
                                        if (bVar.f92376d == null) {
                                            int[] iArr = new int[1];
                                            bVar.f92376d = iArr;
                                            bVar.f92381i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = bVar.f92376d;
                                        iArr2[0] = iArr2[0] + iPosition;
                                    }
                                }
                                j8 = decoderInputBuffer.f8633f;
                                if (this.f9229r1) {
                                    arrayDeque = this.C;
                                    if (arrayDeque.isEmpty()) {
                                        v<q> vVar = this.f9235v1.f9247d;
                                        q qVar2 = this.E;
                                        qVar2.getClass();
                                        vVar.a(j8, qVar2);
                                    } else {
                                        v<q> vVar2 = arrayDeque.peekLast().f9247d;
                                        q qVar3 = this.E;
                                        qVar3.getClass();
                                        vVar2.a(j8, qVar3);
                                    }
                                    this.f9229r1 = false;
                                }
                                this.f9224n1 = Math.max(this.f9224n1, j8);
                                if (hasReadStreamToEnd() || decoderInputBuffer.b(536870912)) {
                                    this.f9225o1 = this.f9224n1;
                                }
                                decoderInputBuffer.f();
                                if (decoderInputBuffer.b(268435456)) {
                                    L(decoderInputBuffer);
                                }
                                Y(decoderInputBuffer);
                                iF = F(decoderInputBuffer);
                                i14 = this.Y0;
                                if (zB) {
                                    cVar.b(i14, decoderInputBuffer.f8630c, j8, iF);
                                } else {
                                    ByteBuffer byteBuffer4 = decoderInputBuffer.f8631d;
                                    byteBuffer4.getClass();
                                    cVar.a(i14, byteBuffer4.limit(), iF, j8);
                                }
                                this.Y0 = -1;
                                decoderInputBuffer.f8631d = null;
                                this.f9221k1 = true;
                                this.f9217h1 = 0;
                                this.f9233u1.f8957c++;
                                return true;
                            }
                            this.f9225o1 = this.f9224n1;
                            if (this.f9217h1 == 2) {
                                decoderInputBuffer.c();
                                this.f9217h1 = 1;
                            }
                            this.f9226p1 = true;
                            if (!this.f9221k1) {
                                a0();
                                return false;
                            }
                            if (!this.V0) {
                                this.f9222l1 = true;
                                cVar.a(this.Y0, 0, 4, 0L);
                                this.Y0 = -1;
                                decoderInputBuffer.f8631d = null;
                                return false;
                            }
                        }
                    } catch (DecoderInputBuffer.InsufficientCapacityException e4) {
                        Q(e4);
                        c0(0);
                        C();
                        return true;
                    }
                }
            } else {
                if (this.f9218i1 == 1) {
                    if (!this.V0) {
                        this.f9222l1 = true;
                        cVar.a(this.Y0, 0, 4, 0L);
                        this.Y0 = -1;
                        decoderInputBuffer.f8631d = null;
                    }
                    this.f9218i1 = 2;
                    return false;
                }
                if (this.T0) {
                    this.T0 = false;
                    ByteBuffer byteBuffer5 = decoderInputBuffer.f8631d;
                    byteBuffer5.getClass();
                    byteBuffer5.put(f9209y1);
                    cVar.a(this.Y0, 38, 0, 0L);
                    this.Y0 = -1;
                    decoderInputBuffer.f8631d = null;
                    this.f9221k1 = true;
                    return true;
                }
                if (this.f9217h1 == 1) {
                    i15 = 0;
                    while (true) {
                        qVar = this.I0;
                        qVar.getClass();
                        if (i15 < qVar.f8389q.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = this.I0.f8389q.get(i15);
                        ByteBuffer byteBuffer6 = decoderInputBuffer.f8631d;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i15++;
                    }
                    this.f9217h1 = 2;
                }
                ByteBuffer byteBuffer7 = decoderInputBuffer.f8631d;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                a0Var = this.f8923c;
                a0Var.a();
                iU = u(a0Var, decoderInputBuffer, 0);
                if (iU == -3) {
                    if (hasReadStreamToEnd()) {
                        this.f9225o1 = this.f9224n1;
                        return false;
                    }
                } else {
                    if (iU == -5) {
                        if (this.f9217h1 == 2) {
                            decoderInputBuffer.c();
                            this.f9217h1 = 1;
                        }
                        T(a0Var);
                        return true;
                    }
                    if (decoderInputBuffer.b(4)) {
                        if (this.f9221k1) {
                        }
                        if (k0(decoderInputBuffer)) {
                            decoderInputBuffer.c();
                            this.f9233u1.f8958d++;
                            return true;
                        }
                        zB = decoderInputBuffer.b(1073741824);
                        if (zB) {
                            bVar = decoderInputBuffer.f8630c;
                            if (iPosition == 0) {
                                bVar.getClass();
                            } else {
                                if (bVar.f92376d == null) {
                                    int[] iArr3 = new int[1];
                                    bVar.f92376d = iArr3;
                                    bVar.f92381i.numBytesOfClearData = iArr3;
                                }
                                int[] iArr4 = bVar.f92376d;
                                iArr4[0] = iArr4[0] + iPosition;
                            }
                        }
                        j8 = decoderInputBuffer.f8633f;
                        if (this.f9229r1) {
                            arrayDeque = this.C;
                            if (arrayDeque.isEmpty()) {
                                v<q> vVar3 = arrayDeque.peekLast().f9247d;
                                q qVar4 = this.E;
                                qVar4.getClass();
                                vVar3.a(j8, qVar4);
                            } else {
                                v<q> vVar4 = this.f9235v1.f9247d;
                                q qVar5 = this.E;
                                qVar5.getClass();
                                vVar4.a(j8, qVar5);
                            }
                            this.f9229r1 = false;
                        }
                        this.f9224n1 = Math.max(this.f9224n1, j8);
                        if (hasReadStreamToEnd()) {
                            this.f9225o1 = this.f9224n1;
                        } else {
                            this.f9225o1 = this.f9224n1;
                        }
                        decoderInputBuffer.f();
                        if (decoderInputBuffer.b(268435456)) {
                            L(decoderInputBuffer);
                        }
                        Y(decoderInputBuffer);
                        iF = F(decoderInputBuffer);
                        i14 = this.Y0;
                        if (zB) {
                            cVar.b(i14, decoderInputBuffer.f8630c, j8, iF);
                        } else {
                            ByteBuffer byteBuffer8 = decoderInputBuffer.f8631d;
                            byteBuffer8.getClass();
                            cVar.a(i14, byteBuffer8.limit(), iF, j8);
                        }
                        this.Y0 = -1;
                        decoderInputBuffer.f8631d = null;
                        this.f9221k1 = true;
                        this.f9217h1 = 0;
                        this.f9233u1.f8957c++;
                        return true;
                    }
                    this.f9225o1 = this.f9224n1;
                    if (this.f9217h1 == 2) {
                        decoderInputBuffer.c();
                        this.f9217h1 = 1;
                    }
                    this.f9226p1 = true;
                    if (!this.f9221k1) {
                        a0();
                        return false;
                    }
                    if (!this.V0) {
                        this.f9222l1 = true;
                        cVar.a(this.Y0, 0, 4, 0L);
                        this.Y0 = -1;
                        decoderInputBuffer.f8631d = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void C() {
        try {
            androidx.media3.exoplayer.mediacodec.c cVar = this.H0;
            fa.a.f(cVar);
            cVar.flush();
        } finally {
            f0();
        }
    }

    public final boolean D() {
        if (this.H0 == null) {
            return false;
        }
        int i14 = this.f9219j1;
        if (i14 == 3 || ((this.Q0 && !this.f9223m1) || (this.R0 && this.f9222l1))) {
            d0();
            return true;
        }
        if (i14 == 2) {
            int i15 = z.f70071a;
            fa.a.d(i15 >= 23);
            if (i15 >= 23) {
                try {
                    o0();
                } catch (ExoPlaybackException e4) {
                    k.h("Failed to update the DRM session, releasing the codec instead.", e4);
                    d0();
                    return true;
                }
            }
        }
        C();
        return false;
    }

    public final List<d> E(boolean z14) {
        q qVar = this.E;
        qVar.getClass();
        f fVar = this.f9231t;
        ArrayList arrayListI = I(fVar, qVar, z14);
        if (!arrayListI.isEmpty() || !z14) {
            return arrayListI;
        }
        ArrayList arrayListI2 = I(fVar, qVar, false);
        if (!arrayListI2.isEmpty()) {
            k.g("Drm session requires secure decoder for " + qVar.f8386n + ", but no secure decoder available. Trying to proceed with " + arrayListI2 + ".");
        }
        return arrayListI2;
    }

    public int F(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    public boolean G() {
        return false;
    }

    public float H(float f14, q[] qVarArr) {
        return -1.0f;
    }

    public abstract ArrayList I(f fVar, q qVar, boolean z14);

    public long J(long j8, long j14) {
        return AbstractComponentTracker.LINGERING_TIMEOUT;
    }

    public abstract androidx.media3.exoplayer.mediacodec.c.a K(d dVar, q qVar, MediaCrypto mediaCrypto, float f14);

    public void L(DecoderInputBuffer decoderInputBuffer) {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    public final void M(d dVar, MediaCrypto mediaCrypto) {
        float fH;
        int i14;
        q qVar = this.E;
        qVar.getClass();
        String str = dVar.f9270a;
        int i15 = z.f70071a;
        if (i15 < 23) {
            fH = -1.0f;
        } else {
            float f14 = this.f9220k0;
            q[] qVarArr = this.f8930j;
            qVarArr.getClass();
            fH = H(f14, qVarArr);
        }
        float f15 = fH > this.f9236w ? fH : -1.0f;
        Z(qVar);
        fa.c cVar = this.f8927g;
        cVar.getClass();
        long jElapsedRealtime = cVar.elapsedRealtime();
        androidx.media3.exoplayer.mediacodec.c.a aVarK = K(dVar, qVar, mediaCrypto, f15);
        if (i15 >= 31) {
            ja.q qVar2 = this.f8926f;
            qVar2.getClass();
            ja.q.a aVar = qVar2.f98046b;
            aVar.getClass();
            LogSessionId logSessionId = aVar.f98049a;
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                aVarK.f9264b.setString("log-session-id", logSessionId.getStringId());
            }
        }
        try {
            Trace.beginSection("createCodec:".concat(str));
            androidx.media3.exoplayer.mediacodec.c cVarA = this.f9228r.a(aVarK);
            this.H0 = cVarA;
            cVarA.e(new b());
            Trace.endSection();
            fa.c cVar2 = this.f8927g;
            cVar2.getClass();
            long jElapsedRealtime2 = cVar2.elapsedRealtime();
            if (!dVar.d(qVar)) {
                String strD = q.d(qVar);
                Locale locale = Locale.US;
                k.g("Format exceeds selected codec's capabilities [" + strD + ", " + str + "]");
            }
            this.O0 = dVar;
            this.L0 = f15;
            this.I0 = qVar;
            if (i15 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = z.f70074d;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i14 = 2;
                } else if (i15 < 24) {
                    i14 = 0;
                } else {
                    i14 = 0;
                }
            } else if (i15 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i14 = 0;
            } else {
                String str3 = z.f70072b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
            }
            this.P0 = i14;
            this.Q0 = i15 == 29 && "c2.android.aac.decoder".equals(str);
            this.R0 = i15 <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.S0 = i15 == 21 && "OMX.google.aac.decoder".equals(str);
            this.V0 = (i15 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i15 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || (("Amazon".equals(z.f70073c) && "AFTS".equals(z.f70074d) && dVar.f9275f) || G());
            this.H0.getClass();
            if (this.f8928h == 2) {
                fa.c cVar3 = this.f8927g;
                cVar3.getClass();
                this.X0 = cVar3.elapsedRealtime() + 1000;
            }
            this.f9233u1.f8955a++;
            R(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str);
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final boolean N(long j8, long j14) {
        if (j14 >= j8) {
            return false;
        }
        q qVar = this.F;
        return qVar == null || !Objects.equals(qVar.f8386n, MimeTypes.AUDIO_OPUS) || j8 - j14 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5 A[Catch: DecoderInitializationException -> 0x00b5, TryCatch #0 {DecoderInitializationException -> 0x00b5, blocks: (B:47:0x00a1, B:49:0x00a5, B:51:0x00ac, B:56:0x00b7, B:60:0x00c4), top: B:70:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void O() {
        q qVar;
        DrmSession drmSession;
        if (this.H0 != null || this.f9213d1 || (qVar = this.E) == null) {
            return;
        }
        String str = qVar.f8386n;
        boolean z14 = true;
        if (this.P == null && l0(qVar)) {
            y();
            boolean zEquals = MimeTypes.AUDIO_AAC.equals(str);
            pa.d dVar = this.A;
            if (zEquals || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                dVar.getClass();
                dVar.f136700l = 32;
            } else {
                dVar.getClass();
                dVar.f136700l = 1;
            }
            this.f9213d1 = true;
            return;
        }
        h0(this.P);
        if (this.I == null) {
            try {
                drmSession = this.I;
                if (drmSession == null && (drmSession.getState() == 3 || this.I.getState() == 4)) {
                    DrmSession drmSession2 = this.I;
                    fa.a.f(str);
                    if (!drmSession2.requiresSecureDecoder(str)) {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                P(this.X, z14);
            } catch (DecoderInitializationException e4) {
                throw l(e4, qVar, false, 4001);
            }
        } else {
            fa.a.d(this.X == null);
            DrmSession drmSession3 = this.I;
            la.c cryptoConfig = drmSession3.getCryptoConfig();
            if (!la.c.f111603c || cryptoConfig == null) {
                if (cryptoConfig == null) {
                    try {
                        this.X = new MediaCrypto(cryptoConfig.f111604a, cryptoConfig.f111605b);
                    } catch (MediaCryptoException e14) {
                        throw l(e14, this.E, false, 6006);
                    }
                } else if (drmSession3.getError() != null) {
                }
                drmSession = this.I;
                if (drmSession == null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                P(this.X, z14);
            } else {
                int state = drmSession3.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException error = drmSession3.getError();
                    error.getClass();
                    throw l(error, this.E, false, error.errorCode);
                }
                if (state == 4) {
                    if (cryptoConfig == null) {
                        this.X = new MediaCrypto(cryptoConfig.f111604a, cryptoConfig.f111605b);
                    } else if (drmSession3.getError() != null) {
                    }
                    drmSession = this.I;
                    if (drmSession == null) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    P(this.X, z14);
                }
            }
        }
        MediaCrypto mediaCrypto = this.X;
        if (mediaCrypto == null || this.H0 != null) {
            return;
        }
        mediaCrypto.release();
        this.X = null;
    }

    public final void P(MediaCrypto mediaCrypto, boolean z14) throws DecoderInitializationException {
        q qVar = this.E;
        qVar.getClass();
        if (this.M0 == null) {
            try {
                List<d> listE = E(z14);
                ArrayDeque<d> arrayDeque = new ArrayDeque<>();
                this.M0 = arrayDeque;
                if (this.f9234v) {
                    arrayDeque.addAll(listE);
                } else {
                    ArrayList arrayList = (ArrayList) listE;
                    if (!arrayList.isEmpty()) {
                        this.M0.add((d) arrayList.get(0));
                    }
                }
                this.N0 = null;
            } catch (MediaCodecUtil.DecoderQueryException e4) {
                throw new DecoderInitializationException(qVar, e4, z14, -49998);
            }
        }
        if (this.M0.isEmpty()) {
            throw new DecoderInitializationException(qVar, (Throwable) null, z14, -49999);
        }
        ArrayDeque<d> arrayDeque2 = this.M0;
        arrayDeque2.getClass();
        while (this.H0 == null) {
            d dVarPeekFirst = arrayDeque2.peekFirst();
            dVarPeekFirst.getClass();
            if (!j0(dVarPeekFirst)) {
                return;
            }
            try {
                M(dVarPeekFirst, mediaCrypto);
            } catch (Exception e14) {
                k.h("Failed to initialize decoder: " + dVarPeekFirst, e14);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(qVar, e14, z14, dVarPeekFirst);
                Q(decoderInitializationException);
                if (this.N0 == null) {
                    this.N0 = decoderInitializationException;
                } else {
                    this.N0 = this.N0.copyWithFallbackException(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.N0;
                }
            }
        }
        this.M0 = null;
    }

    public void Q(Exception exc) {
    }

    public void R(long j8, long j14, String str) {
    }

    public void S(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d3, code lost:
    
        if (r4.requiresSecureDecoder(r2) != false) goto L130;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h T(a0 a0Var) {
        boolean z14 = true;
        this.f9229r1 = true;
        q qVarA = a0Var.f8667b;
        qVarA.getClass();
        String str = qVarA.f8386n;
        if (str == null) {
            throw l(new IllegalArgumentException("Sample MIME type is null."), qVarA, false, 4005);
        }
        if (str.equals(MimeTypes.VIDEO_AV1) && !qVarA.f8389q.isEmpty()) {
            q.b bVarA = qVarA.a();
            bVarA.f8414p = null;
            qVarA = bVarA.a();
        }
        q qVar = qVarA;
        DrmSession drmSession = a0Var.f8666a;
        DrmSession drmSession2 = this.P;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.b(null);
            }
            if (drmSession2 != null) {
                drmSession2.a(null);
            }
        }
        this.P = drmSession;
        this.E = qVar;
        if (this.f9213d1) {
            this.f9215f1 = true;
            return null;
        }
        androidx.media3.exoplayer.mediacodec.c cVar = this.H0;
        if (cVar == null) {
            this.M0 = null;
            O();
            return null;
        }
        d dVar = this.O0;
        dVar.getClass();
        String str2 = dVar.f9270a;
        q qVar2 = this.I0;
        qVar2.getClass();
        DrmSession drmSession3 = this.I;
        DrmSession drmSession4 = this.P;
        int i14 = 2;
        if (drmSession3 != drmSession4) {
            if (drmSession4 != null && drmSession3 != null && drmSession4.getCryptoConfig() != null && drmSession3.getCryptoConfig() != null && la.c.class.equals(la.c.class) && drmSession4.getSchemeUuid().equals(drmSession3.getSchemeUuid()) && z.f70071a >= 23) {
                UUID uuid = androidx.media3.common.h.f8300e;
                if (!uuid.equals(drmSession3.getSchemeUuid()) && !uuid.equals(drmSession4.getSchemeUuid())) {
                    if (!dVar.f9275f) {
                        if (drmSession4.getState() != 2) {
                            if (drmSession4.getState() == 3 || drmSession4.getState() == 4) {
                                String str3 = qVar.f8386n;
                                str3.getClass();
                            }
                        }
                    }
                }
            }
            if (this.f9221k1) {
                this.f9218i1 = 1;
                this.f9219j1 = 3;
            } else {
                d0();
                O();
            }
            return new h(str2, qVar2, qVar, 0, 128);
        }
        boolean z15 = this.P != this.I;
        fa.a.d(!z15 || z.f70071a >= 23);
        h hVarW = w(dVar, qVar2, qVar);
        int i15 = hVarW.f8979d;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        x.h();
                        return null;
                    }
                    if (n0(qVar)) {
                        this.I0 = qVar;
                        if (!z15 || z()) {
                        }
                    } else {
                        i14 = 16;
                    }
                } else if (n0(qVar)) {
                    this.f9216g1 = true;
                    this.f9217h1 = 1;
                    int i16 = this.P0;
                    if (i16 != 2 && (i16 != 1 || qVar.f8393u != qVar2.f8393u || qVar.f8394v != qVar2.f8394v)) {
                        z14 = false;
                    }
                    this.T0 = z14;
                    this.I0 = qVar;
                    if (!z15 || z()) {
                    }
                } else {
                    i14 = 16;
                }
            } else if (n0(qVar)) {
                this.I0 = qVar;
                if (z15) {
                    if (z()) {
                    }
                } else if (this.f9221k1) {
                    this.f9218i1 = 1;
                    if (this.R0) {
                        this.f9219j1 = 3;
                    } else {
                        this.f9219j1 = 1;
                    }
                }
            } else {
                i14 = 16;
            }
            return (i15 != 0 || (this.H0 == cVar && this.f9219j1 != 3)) ? hVarW : new h(str2, qVar2, qVar, 0, i14);
        }
        if (this.f9221k1) {
            this.f9218i1 = 1;
            this.f9219j1 = 3;
        } else {
            d0();
            O();
        }
        i14 = 0;
        if (i15 != 0) {
        }
    }

    public void U(q qVar, MediaFormat mediaFormat) {
    }

    public void V(long j8) {
    }

    public void W(long j8) {
        this.f9237w1 = j8;
        while (true) {
            ArrayDeque<c> arrayDeque = this.C;
            if (arrayDeque.isEmpty() || j8 < arrayDeque.peek().f9244a) {
                return;
            }
            c cVarPoll = arrayDeque.poll();
            cVarPoll.getClass();
            i0(cVarPoll);
            X();
        }
    }

    public void X() {
    }

    public void Y(DecoderInputBuffer decoderInputBuffer) {
    }

    public void Z(q qVar) {
    }

    @Override // androidx.media3.exoplayer.u0
    public final int a(q qVar) throws ExoPlaybackException {
        try {
            return m0(this.f9231t, qVar);
        } catch (MediaCodecUtil.DecoderQueryException e4) {
            throw l(e4, qVar, false, 4002);
        }
    }

    @TargetApi(23)
    public final void a0() throws ExoPlaybackException {
        int i14 = this.f9219j1;
        if (i14 == 1) {
            C();
            return;
        }
        if (i14 == 2) {
            C();
            o0();
        } else if (i14 != 3) {
            this.f9227q1 = true;
            e0();
        } else {
            d0();
            O();
        }
    }

    public abstract boolean b0(long j8, long j14, androidx.media3.exoplayer.mediacodec.c cVar, ByteBuffer byteBuffer, int i14, int i15, int i16, long j15, boolean z14, boolean z15, q qVar);

    public final boolean c0(int i14) throws ExoPlaybackException {
        a0 a0Var = this.f8923c;
        a0Var.a();
        DecoderInputBuffer decoderInputBuffer = this.f9238x;
        decoderInputBuffer.c();
        int iU = u(a0Var, decoderInputBuffer, i14 | 4);
        if (iU == -5) {
            T(a0Var);
            return true;
        }
        if (iU != -4 || !decoderInputBuffer.b(4)) {
            return false;
        }
        this.f9226p1 = true;
        a0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0() {
        try {
            androidx.media3.exoplayer.mediacodec.c cVar = this.H0;
            if (cVar != null) {
                cVar.release();
                this.f9233u1.f8956b++;
                d dVar = this.O0;
                dVar.getClass();
                S(dVar.f9270a);
            }
            this.H0 = null;
            try {
                MediaCrypto mediaCrypto = this.X;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.X = null;
                h0(null);
                g0();
            }
        } catch (Throwable th3) {
            this.H0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.X;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th3;
            } finally {
                this.X = null;
                h0(null);
                g0();
            }
        }
    }

    public void e0() {
    }

    public void f0() {
        this.Y0 = -1;
        this.f9240y.f8631d = null;
        this.Z0 = -1;
        this.f9210a1 = null;
        this.X0 = C.TIME_UNSET;
        this.f9222l1 = false;
        this.W0 = C.TIME_UNSET;
        this.f9221k1 = false;
        this.T0 = false;
        this.U0 = false;
        this.f9211b1 = false;
        this.f9212c1 = false;
        this.f9224n1 = C.TIME_UNSET;
        this.f9225o1 = C.TIME_UNSET;
        this.f9237w1 = C.TIME_UNSET;
        this.f9218i1 = 0;
        this.f9219j1 = 0;
        this.f9217h1 = this.f9216g1 ? 1 : 0;
    }

    public final void g0() {
        f0();
        this.f9232t1 = null;
        this.M0 = null;
        this.O0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = false;
        this.f9223m1 = false;
        this.L0 = -1.0f;
        this.P0 = 0;
        this.Q0 = false;
        this.R0 = false;
        this.S0 = false;
        this.V0 = false;
        this.f9216g1 = false;
        this.f9217h1 = 0;
    }

    public final void h0(DrmSession drmSession) {
        DrmSession drmSession2 = this.I;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.b(null);
            }
            if (drmSession2 != null) {
                drmSession2.a(null);
            }
        }
        this.I = drmSession;
    }

    @Override // androidx.media3.exoplayer.f, androidx.media3.exoplayer.r0.b
    public void handleMessage(int i14, Object obj) {
        if (i14 == 11) {
            this.T = (t0.a) obj;
        }
    }

    public final void i0(c cVar) {
        this.f9235v1 = cVar;
        long j8 = cVar.f9246c;
        if (j8 != C.TIME_UNSET) {
            this.f9239x1 = true;
            V(j8);
        }
    }

    @Override // androidx.media3.exoplayer.f, androidx.media3.exoplayer.t0
    public boolean isEnded() {
        return this.f9227q1;
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean isReady() {
        boolean zIsReady;
        if (this.E != null) {
            if (hasReadStreamToEnd()) {
                zIsReady = this.f8934n;
            } else {
                n nVar = this.f8929i;
                nVar.getClass();
                zIsReady = nVar.isReady();
            }
            if (!zIsReady) {
                if (!(this.Z0 >= 0)) {
                    if (this.X0 != C.TIME_UNSET) {
                        fa.c cVar = this.f8927g;
                        cVar.getClass();
                        if (cVar.elapsedRealtime() < this.X0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean j0(d dVar) {
        return true;
    }

    @Override // androidx.media3.exoplayer.t0
    public final long k(long j8, long j14) {
        return J(j8, j14);
    }

    public boolean k0(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    public boolean l0(q qVar) {
        return false;
    }

    @Override // androidx.media3.exoplayer.f
    public void m() {
        this.E = null;
        i0(c.f9243e);
        this.C.clear();
        D();
    }

    public abstract int m0(f fVar, q qVar);

    @Override // androidx.media3.exoplayer.f
    public void n(boolean z14, boolean z15) {
        this.f9233u1 = new androidx.media3.exoplayer.g();
    }

    public final boolean n0(q qVar) {
        if (z.f70071a >= 23 && this.H0 != null && this.f9219j1 != 3 && this.f8928h != 0) {
            float f14 = this.f9220k0;
            qVar.getClass();
            q[] qVarArr = this.f8930j;
            qVarArr.getClass();
            float fH = H(f14, qVarArr);
            float f15 = this.L0;
            if (f15 != fH) {
                if (fH == -1.0f) {
                    if (this.f9221k1) {
                        this.f9218i1 = 1;
                        this.f9219j1 = 3;
                        return false;
                    }
                    d0();
                    O();
                    return false;
                }
                if (f15 != -1.0f || fH > this.f9236w) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fH);
                    androidx.media3.exoplayer.mediacodec.c cVar = this.H0;
                    cVar.getClass();
                    cVar.setParameters(bundle);
                    this.L0 = fH;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.f
    public void o(long j8, boolean z14) {
        this.f9226p1 = false;
        this.f9227q1 = false;
        this.f9230s1 = false;
        if (this.f9213d1) {
            this.A.c();
            this.f9241z.c();
            this.f9214e1 = false;
            m mVar = this.D;
            mVar.getClass();
            mVar.f103704a = AudioProcessor.f8121a;
            mVar.f103706c = 0;
            mVar.f103705b = 2;
        } else if (D()) {
            O();
        }
        if (this.f9235v1.f9247d.h() > 0) {
            this.f9229r1 = true;
        }
        this.f9235v1.f9247d.b();
        this.C.clear();
    }

    public final void o0() throws ExoPlaybackException {
        DrmSession drmSession = this.P;
        drmSession.getClass();
        la.c cryptoConfig = drmSession.getCryptoConfig();
        if (cryptoConfig != null) {
            try {
                MediaCrypto mediaCrypto = this.X;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(cryptoConfig.f111605b);
            } catch (MediaCryptoException e4) {
                throw l(e4, this.E, false, 6006);
            }
        }
        h0(this.P);
        this.f9218i1 = 0;
        this.f9219j1 = 0;
    }

    public final void p0(long j8) {
        q qVarF = this.f9235v1.f9247d.f(j8);
        if (qVarF == null && this.f9239x1 && this.J0 != null) {
            qVarF = this.f9235v1.f9247d.e();
        }
        if (qVarF != null) {
            this.F = qVarF;
        } else if (!this.K0 || this.F == null) {
            return;
        }
        q qVar = this.F;
        qVar.getClass();
        U(qVar, this.J0);
        this.K0 = false;
        this.f9239x1 = false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.exoplayer.f
    public void q() {
        try {
            y();
            d0();
            if (this.P != null && r1 != null) {
            }
        } finally {
            DrmSession drmSession = this.P;
            if (drmSession != null && drmSession != null) {
                drmSession.a(null);
            }
            this.P = null;
        }
    }

    @Override // androidx.media3.exoplayer.f
    public void r() {
    }

    @Override // androidx.media3.exoplayer.t0
    public void render(long j8, long j14) {
        boolean z14;
        boolean z15;
        boolean z16 = false;
        if (this.f9230s1) {
            this.f9230s1 = false;
            a0();
        }
        ExoPlaybackException exoPlaybackException = this.f9232t1;
        if (exoPlaybackException != null) {
            this.f9232t1 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f9227q1) {
                e0();
                return;
            }
            if (this.E != null || c0(2)) {
                O();
                if (this.f9213d1) {
                    Trace.beginSection("bypassRender");
                    while (v(j8, j14)) {
                    }
                    Trace.endSection();
                } else if (this.H0 != null) {
                    fa.c cVar = this.f8927g;
                    cVar.getClass();
                    long jElapsedRealtime = cVar.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (A(j8, j14)) {
                        long j15 = this.Y;
                        if (j15 != C.TIME_UNSET) {
                            fa.c cVar2 = this.f8927g;
                            cVar2.getClass();
                            z15 = cVar2.elapsedRealtime() - jElapsedRealtime < j15;
                        }
                        if (!z15) {
                            break;
                        }
                    }
                    while (B()) {
                        long j16 = this.Y;
                        if (j16 != C.TIME_UNSET) {
                            fa.c cVar3 = this.f8927g;
                            cVar3.getClass();
                            z14 = cVar3.elapsedRealtime() - jElapsedRealtime < j16;
                        }
                        if (!z14) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    androidx.media3.exoplayer.g gVar = this.f9233u1;
                    int i14 = gVar.f8958d;
                    n nVar = this.f8929i;
                    nVar.getClass();
                    gVar.f8958d = i14 + nVar.skipData(j8 - this.f8931k);
                    c0(1);
                }
                synchronized (this.f9233u1) {
                }
            }
        } catch (MediaCodec.CryptoException e4) {
            throw l(e4, this.E, false, z.t(e4.getErrorCode()));
        } catch (IllegalStateException e14) {
            boolean z17 = e14 instanceof MediaCodec.CodecException;
            if (!z17) {
                StackTraceElement[] stackTrace = e14.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e14;
                }
            }
            Q(e14);
            if (z17 && ((MediaCodec.CodecException) e14).isRecoverable()) {
                z16 = true;
            }
            if (z16) {
                d0();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionX = x(e14, this.O0);
            throw l(mediaCodecDecoderExceptionX, this.E, z16, mediaCodecDecoderExceptionX.errorCode == 1101 ? PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED : 4003);
        }
    }

    @Override // androidx.media3.exoplayer.f
    public void s() {
    }

    @Override // androidx.media3.exoplayer.t0
    public void setPlaybackSpeed(float f14, float f15) {
        this.Z = f14;
        this.f9220k0 = f15;
        n0(this.I0);
    }

    @Override // androidx.media3.exoplayer.f, androidx.media3.exoplayer.u0
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // androidx.media3.exoplayer.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(q[] qVarArr, long j8, long j14, j.b bVar) {
        if (this.f9235v1.f9246c == C.TIME_UNSET) {
            i0(new c(C.TIME_UNSET, j8, j14));
            return;
        }
        ArrayDeque<c> arrayDeque = this.C;
        if (arrayDeque.isEmpty()) {
            long j15 = this.f9224n1;
            if (j15 != C.TIME_UNSET) {
                long j16 = this.f9237w1;
                if (j16 != C.TIME_UNSET) {
                }
            }
            i0(new c(C.TIME_UNSET, j8, j14));
            if (this.f9235v1.f9246c != C.TIME_UNSET) {
                X();
                return;
            }
            return;
        }
        arrayDeque.add(new c(this.f9224n1, j8, j14));
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0301  */
    /* JADX WARN: Code duplicated, block: B:117:0x0309 A[LOOP:0: B:25:0x008e->B:117:0x0309, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.media3.exoplayer.f, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v22, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final boolean v(long j8, long j14) {
        pa.d dVar;
        ?? r14;
        ?? r28;
        fa.a.d(!this.f9227q1);
        pa.d dVar2 = this.A;
        if (dVar2.h()) {
            ByteBuffer byteBuffer = dVar2.f8631d;
            int i14 = this.Z0;
            int i15 = dVar2.f136699k;
            long j15 = dVar2.f8633f;
            boolean zN = N(this.f8932l, dVar2.f136698j);
            boolean zB = dVar2.b(4);
            q qVar = this.F;
            qVar.getClass();
            dVar = dVar2;
            if (b0(j8, j14, null, byteBuffer, i14, 0, i15, j15, zN, zB, qVar)) {
                W(dVar.f136698j);
                dVar.c();
            }
        }
        dVar = dVar2;
        if (this.f9226p1) {
            this.f9227q1 = true;
            return false;
        }
        ?? r15 = 0;
        boolean z14 = this.f9214e1;
        DecoderInputBuffer decoderInputBuffer = this.f9241z;
        if (z14) {
            fa.a.d(dVar.g(decoderInputBuffer));
            this.f9214e1 = false;
        }
        if (this.f9215f1) {
            if (dVar.h()) {
                return true;
            }
            y();
            this.f9215f1 = false;
            O();
            if (!this.f9213d1) {
                return false;
            }
        }
        fa.a.d(!this.f9226p1);
        a0 a0Var = this.f8923c;
        a0Var.a();
        decoderInputBuffer.c();
        while (true) {
            decoderInputBuffer.c();
            int iU = u(a0Var, decoderInputBuffer, r15);
            if (iU == -5) {
                T(a0Var);
            } else if (iU != -4) {
                if (iU != -3) {
                    x.h();
                    return false;
                }
                if (hasReadStreamToEnd()) {
                    this.f9225o1 = this.f9224n1;
                }
            } else if (decoderInputBuffer.b(4)) {
                this.f9226p1 = true;
                this.f9225o1 = this.f9224n1;
            } else {
                this.f9224n1 = Math.max(this.f9224n1, decoderInputBuffer.f8633f);
                if (hasReadStreamToEnd() || this.f9240y.b(536870912)) {
                    this.f9225o1 = this.f9224n1;
                }
                byte[] bArr = null;
                if (this.f9229r1) {
                    q qVar2 = this.E;
                    qVar2.getClass();
                    this.F = qVar2;
                    if (Objects.equals(qVar2.f8386n, MimeTypes.AUDIO_OPUS) && !this.F.f8389q.isEmpty()) {
                        byte[] bArr2 = this.F.f8389q.get(r15);
                        int i16 = (bArr2[10] & UnsignedBytes.MAX_VALUE) | ((bArr2[11] & UnsignedBytes.MAX_VALUE) << 8);
                        q qVar3 = this.F;
                        qVar3.getClass();
                        q.b bVarA = qVar3.a();
                        bVarA.E = i16;
                        this.F = bVarA.a();
                    }
                    U(this.F, null);
                    this.f9229r1 = r15;
                }
                decoderInputBuffer.f();
                q qVar4 = this.F;
                if (qVar4 != null && Objects.equals(qVar4.f8386n, MimeTypes.AUDIO_OPUS)) {
                    if (decoderInputBuffer.b(268435456)) {
                        decoderInputBuffer.f8629b = this.F;
                        L(decoderInputBuffer);
                    }
                    if (this.f8932l - decoderInputBuffer.f8633f <= 80000) {
                        q qVar5 = this.F;
                        qVar5.getClass();
                        List<byte[]> list = qVar5.f8389q;
                        m mVar = this.D;
                        mVar.getClass();
                        decoderInputBuffer.f8631d.getClass();
                        if (decoderInputBuffer.f8631d.limit() - decoderInputBuffer.f8631d.position() != 0) {
                            if (mVar.f103705b == 2 && (list.size() == 1 || list.size() == 3)) {
                                bArr = list.get(r15);
                            }
                            ByteBuffer byteBuffer2 = decoderInputBuffer.f8631d;
                            int iPosition = byteBuffer2.position();
                            int iLimit = byteBuffer2.limit();
                            int i17 = iLimit - iPosition;
                            int i18 = (i17 + 255) / 255;
                            int i19 = i18 + 27 + i17;
                            if (mVar.f103705b == 2) {
                                int length = bArr != null ? bArr.length + 28 : 47;
                                i19 = (length == true ? 1 : 0) + 44 + i19;
                                r14 = length;
                            } else {
                                r14 = r15;
                            }
                            if (mVar.f103704a.capacity() < i19) {
                                mVar.f103704a = ByteBuffer.allocate(i19).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                mVar.f103704a.clear();
                            }
                            ByteBuffer byteBuffer3 = mVar.f103704a;
                            if (mVar.f103705b == 2) {
                                if (bArr != null) {
                                    m.a(byteBuffer3, 0L, 0, 1, true);
                                    byteBuffer3.put(UnsignedBytes.checkedCast(bArr.length));
                                    byteBuffer3.put(bArr);
                                    byteBuffer3.putInt(22, z.l(byteBuffer3.array(), byteBuffer3.arrayOffset(), bArr.length + 28, 0));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    byteBuffer3.put(m.f103702d);
                                }
                                byteBuffer3.put(m.f103703e);
                                r28 = r14;
                            } else {
                                r28 = r14 == true ? 1 : 0;
                                iLimit = iLimit;
                            }
                            int iB = mVar.f103706c + ((int) ((e0.b(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            mVar.f103706c = iB;
                            m.a(byteBuffer3, iB, mVar.f103705b, i18, false);
                            for (int i24 = 0; i24 < i18; i24++) {
                                if (i17 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i17 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i17);
                                    i17 = 0;
                                }
                            }
                            int i25 = iLimit;
                            while (iPosition < i25) {
                                byteBuffer3.put(byteBuffer2.get(iPosition));
                                iPosition++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (mVar.f103705b == 2) {
                                byteBuffer3.putInt(r28 + 66, z.l(byteBuffer3.array(), byteBuffer3.arrayOffset() + r28 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
                            } else {
                                byteBuffer3.putInt(22, z.l(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
                            }
                            mVar.f103705b++;
                            mVar.f103704a = byteBuffer3;
                            decoderInputBuffer.c();
                            decoderInputBuffer.e(mVar.f103704a.remaining());
                            decoderInputBuffer.f8631d.put(mVar.f103704a);
                            decoderInputBuffer.f();
                        }
                    }
                }
                if (dVar.h()) {
                    long j16 = this.f8932l;
                    if (N(j16, dVar.f136698j) == N(j16, decoderInputBuffer.f8633f)) {
                        if (!dVar.g(decoderInputBuffer)) {
                            r15 = 0;
                        }
                    }
                } else if (!dVar.g(decoderInputBuffer)) {
                    r15 = 0;
                }
                this.f9214e1 = true;
            }
            if (dVar.h()) {
                dVar.f();
            }
            return dVar.h() || this.f9226p1 || this.f9215f1;
        }
    }

    public h w(d dVar, q qVar, q qVar2) {
        return new h(dVar.f9270a, qVar, qVar2, 0, 1);
    }

    public MediaCodecDecoderException x(IllegalStateException illegalStateException, d dVar) {
        return new MediaCodecDecoderException(illegalStateException, dVar);
    }

    public final void y() {
        this.f9215f1 = false;
        this.A.c();
        this.f9241z.c();
        this.f9214e1 = false;
        this.f9213d1 = false;
        m mVar = this.D;
        mVar.getClass();
        mVar.f103704a = AudioProcessor.f8121a;
        mVar.f103706c = 0;
        mVar.f103705b = 2;
    }

    @TargetApi(23)
    public final boolean z() throws ExoPlaybackException {
        if (!this.f9221k1) {
            o0();
            return true;
        }
        this.f9218i1 = 1;
        if (this.R0) {
            this.f9219j1 = 3;
            return false;
        }
        this.f9219j1 = 2;
        return true;
    }

    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final d codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(q qVar, Throwable th3, boolean z14, d dVar) {
            this("Decoder init failed: " + dVar.f9270a + ", " + qVar, th3, qVar.f8386n, z14, dVar, th3 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th3).getDiagnosticInfo() : null, null);
        }

        private static String buildCustomDiagnosticInfo(int i14) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i14 < 0 ? "neg_" : "") + Math.abs(i14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        public DecoderInitializationException(q qVar, Throwable th3, boolean z14, int i14) {
            this("Decoder init failed: [" + i14 + "], " + qVar, th3, qVar.f8386n, z14, null, buildCustomDiagnosticInfo(i14), null);
        }

        private DecoderInitializationException(String str, Throwable th3, String str2, boolean z14, d dVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th3);
            this.mimeType = str2;
            this.secureDecoderRequired = z14;
            this.codecInfo = dVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
