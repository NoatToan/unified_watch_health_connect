package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.miui.tsmclient.service.DKFRequestService;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import defpackage.a1a;
import defpackage.e83;
import defpackage.g83;
import defpackage.kfp;
import defpackage.kgg;
import defpackage.loa;
import defpackage.nkp;
import defpackage.oh8;
import defpackage.rk1;
import defpackage.ss5;
import defpackage.toe;
import defpackage.us5;
import defpackage.wlq;
import defpackage.yg2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaCodecRenderer extends com.google.android.exoplayer2.e {
    public static final byte[] I0 = {0, 0, 1, 103, 66, -64, 11, -38, HMProSyncDataBaseProfile.DATA_SPO2_POINT, -112, 0, 0, 1, 104, -50, 15, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 32, 0, 0, 1, 101, -120, -124, HMProSyncDataBaseProfile.DATA_TYPE_PAI, -50, 113, 24, DKFRequestService.o, 0, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, -65, 28, 49, -61, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT, 93, 120};
    public Format A;
    public boolean A0;
    public Format B;
    public boolean B0;
    public DrmSession C;
    public boolean C0;
    public DrmSession D;
    public ExoPlaybackException D0;
    public MediaCrypto E;
    public ss5 E0;
    public boolean F;
    public long F0;
    public long G;
    public long G0;
    public float H;
    public int H0;
    public float I;
    public b J;
    public Format K;
    public MediaFormat L;
    public boolean M;
    public float N;
    public ArrayDeque<c> O;
    public DecoderInitializationException P;
    public c Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public e83 c0;
    public long d0;
    public int e0;
    public int f0;
    public ByteBuffer g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final b.InterfaceC0187b m;
    public boolean m0;
    public final d n;
    public int n0;
    public final boolean o;
    public int o0;
    public final float p;
    public int p0;
    public final DecoderInputBuffer q;
    public boolean q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DecoderInputBuffer f7966r;
    public boolean r0;
    public final DecoderInputBuffer s;
    public boolean s0;
    public final yg2 t;
    public long t0;
    public final kfp<Format> u;
    public long u0;
    public final ArrayList<Long> v;
    public boolean v0;
    public final MediaCodec.BufferInfo w;
    public boolean w0;
    public final long[] x;
    public boolean x0;
    public final long[] y;
    public boolean y0;
    public final long[] z;
    public boolean z0;

    public MediaCodecRenderer(int i, b.InterfaceC0187b interfaceC0187b, d dVar, boolean z, float f) {
        super(i);
        this.m = interfaceC0187b;
        this.n = (d) rk1.e(dVar);
        this.o = z;
        this.p = f;
        this.q = DecoderInputBuffer.x();
        this.f7966r = new DecoderInputBuffer(0);
        this.s = new DecoderInputBuffer(2);
        yg2 yg2Var = new yg2();
        this.t = yg2Var;
        this.u = new kfp<>();
        this.v = new ArrayList<>();
        this.w = new MediaCodec.BufferInfo();
        this.H = 1.0f;
        this.I = 1.0f;
        this.G = -9223372036854775807L;
        this.x = new long[10];
        this.y = new long[10];
        this.z = new long[10];
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        yg2Var.s(0);
        yg2Var.c.order(ByteOrder.nativeOrder());
        this.N = -1.0f;
        this.R = 0;
        this.n0 = 0;
        this.e0 = -1;
        this.f0 = -1;
        this.d0 = -9223372036854775807L;
        this.t0 = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.o0 = 0;
        this.p0 = 0;
    }

    public static boolean E0(IllegalStateException illegalStateException) {
        if (wlq.f38110a >= 21 && F0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @RequiresApi(21)
    public static boolean F0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @RequiresApi(21)
    public static boolean G0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    public static boolean S(String str, Format format) {
        return wlq.f38110a < 21 && format.n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean T(String str) {
        if (wlq.f38110a < 21 && "OMX.SEC.mp3.dec".equals(str) && RomUtils.SAMSUNG.equals(wlq.c)) {
            String str2 = wlq.f38111b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(String str) {
        int i = wlq.f38110a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = wlq.f38111b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean V(String str) {
        return wlq.f38110a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean W(c cVar) {
        String str = cVar.f7979a;
        int i = wlq.f38110a;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(wlq.c) && "AFTS".equals(wlq.d) && cVar.g));
    }

    public static boolean X(String str) {
        int i = wlq.f38110a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && wlq.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean Y(String str, Format format) {
        return wlq.f38110a <= 18 && format.y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static boolean Z(String str) {
        return wlq.f38110a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public static boolean m1(Format format) {
        Class<? extends oh8> cls = format.E;
        return cls == null || loa.class.equals(cls);
    }

    public final boolean A0() {
        return this.f0 >= 0;
    }

    public final void B0(Format format) {
        b0();
        String str = format.l;
        if (MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE.equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.t.F(32);
        } else {
            this.t.F(1);
        }
        this.j0 = true;
    }

    public final void C0(c cVar, MediaCrypto mediaCrypto) throws Exception {
        String str = cVar.f7979a;
        int i = wlq.f38110a;
        float fS0 = i < 23 ? -1.0f : s0(this.I, this.A, D());
        float f = fS0 > this.p ? fS0 : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strValueOf = String.valueOf(str);
        nkp.a(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
        b.a aVarW0 = w0(cVar, this.A, mediaCrypto, f);
        b bVarA = (!this.z0 || i < 23) ? this.m.a(aVarW0) : new a.b(e(), this.A0, this.B0).a(aVarW0);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.J = bVarA;
        this.Q = cVar;
        this.N = f;
        this.K = this.A;
        this.R = R(str);
        this.S = S(str, this.K);
        this.T = X(str);
        this.U = Z(str);
        this.V = U(str);
        this.W = V(str);
        this.X = T(str);
        this.Y = Y(str, this.K);
        this.b0 = W(cVar) || r0();
        if ("c2.android.mp3.decoder".equals(cVar.f7979a)) {
            this.c0 = new e83();
        }
        if (getState() == 2) {
            this.d0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.E0.f33939a++;
        M0(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
    }

    public final boolean D0(long j) {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            if (this.v.get(i).longValue() == j) {
                this.v.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.e
    public void F() {
        this.A = null;
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.H0 = 0;
        if (this.D == null && this.C == null) {
            n0();
        } else {
            I();
        }
    }

    @Override // com.google.android.exoplayer2.e
    public void G(boolean z, boolean z2) throws ExoPlaybackException {
        this.E0 = new ss5();
    }

    @Override // com.google.android.exoplayer2.e
    public void H(long j, boolean z) throws ExoPlaybackException {
        this.v0 = false;
        this.w0 = false;
        this.y0 = false;
        if (this.j0) {
            this.t.h();
            this.s.h();
            this.k0 = false;
        } else {
            m0();
        }
        if (this.u.l() > 0) {
            this.x0 = true;
        }
        this.u.c();
        int i = this.H0;
        if (i != 0) {
            this.G0 = this.y[i - 1];
            this.F0 = this.x[i - 1];
            this.H0 = 0;
        }
    }

    public boolean H0() {
        return false;
    }

    @Override // com.google.android.exoplayer2.e
    public void I() {
        try {
            b0();
            Y0();
        } finally {
            h1(null);
        }
    }

    public final void I0() throws ExoPlaybackException {
        Format format;
        if (this.J != null || this.j0 || (format = this.A) == null) {
            return;
        }
        if (this.D == null && k1(format)) {
            B0(this.A);
            return;
        }
        e1(this.D);
        String str = this.A.l;
        DrmSession drmSession = this.C;
        if (drmSession != null) {
            if (this.E == null) {
                loa loaVarV0 = v0(drmSession);
                if (loaVarV0 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(loaVarV0.f25263a, loaVarV0.f25264b);
                        this.E = mediaCrypto;
                        this.F = !loaVarV0.c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e) {
                        throw y(e, this.A);
                    }
                } else if (this.C.c() == null) {
                    return;
                }
            }
            if (loa.d) {
                int state = this.C.getState();
                if (state == 1) {
                    throw y(this.C.c(), this.A);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            J0(this.E, this.F);
        } catch (DecoderInitializationException e2) {
            throw y(e2, this.A);
        }
    }

    @Override // com.google.android.exoplayer2.e
    public void J() {
    }

    public final void J0(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        if (this.O == null) {
            try {
                List<c> listO0 = o0(z);
                ArrayDeque<c> arrayDeque = new ArrayDeque<>();
                this.O = arrayDeque;
                if (this.o) {
                    arrayDeque.addAll(listO0);
                } else if (!listO0.isEmpty()) {
                    this.O.add(listO0.get(0));
                }
                this.P = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.A, e, z, -49998);
            }
        }
        if (this.O.isEmpty()) {
            throw new DecoderInitializationException(this.A, (Throwable) null, z, -49999);
        }
        while (this.J == null) {
            c cVarPeekFirst = this.O.peekFirst();
            if (!j1(cVarPeekFirst)) {
                return;
            }
            try {
                C0(cVarPeekFirst, mediaCrypto);
            } catch (Exception e2) {
                String strValueOf = String.valueOf(cVarPeekFirst);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
                sb.append("Failed to initialize decoder: ");
                sb.append(strValueOf);
                toe.i("MediaCodecRenderer", sb.toString(), e2);
                this.O.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.A, e2, z, cVarPeekFirst);
                if (this.P == null) {
                    this.P = decoderInitializationException;
                } else {
                    this.P = this.P.copyWithFallbackException(decoderInitializationException);
                }
                if (this.O.isEmpty()) {
                    throw this.P;
                }
            }
        }
        this.O = null;
    }

    @Override // com.google.android.exoplayer2.e
    public void K() {
    }

    public final boolean K0(loa loaVar, Format format) {
        if (loaVar.c) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(loaVar.f25263a, loaVar.f25264b);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(format.l);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.e
    public void L(Format[] formatArr, long j, long j2) throws ExoPlaybackException {
        if (this.G0 == -9223372036854775807L) {
            rk1.g(this.F0 == -9223372036854775807L);
            this.F0 = j;
            this.G0 = j2;
            return;
        }
        int i = this.H0;
        long[] jArr = this.y;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            toe.h("MediaCodecRenderer", sb.toString());
        } else {
            this.H0 = i + 1;
        }
        long[] jArr2 = this.x;
        int i2 = this.H0;
        jArr2[i2 - 1] = j;
        this.y[i2 - 1] = j2;
        this.z[i2 - 1] = this.t0;
    }

    public abstract void L0(Exception exc);

    public abstract void M0(String str, long j, long j2);

    public abstract void N0(String str);

    public final void O() throws ExoPlaybackException {
        rk1.g(!this.v0);
        a1a a1aVarB = B();
        this.s.h();
        do {
            this.s.h();
            int iM = M(a1aVarB, this.s, 0);
            if (iM == -5) {
                O0(a1aVarB);
                return;
            }
            if (iM != -4) {
                if (iM != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.s.n()) {
                    this.v0 = true;
                    return;
                }
                if (this.x0) {
                    Format format = (Format) rk1.e(this.A);
                    this.B = format;
                    P0(format, null);
                    this.x0 = false;
                }
                this.s.u();
            }
        } while (this.t.z(this.s));
        this.k0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    public us5 O0(a1a a1aVar) throws ExoPlaybackException {
        int i;
        boolean z = true;
        this.x0 = true;
        Format format = (Format) rk1.e(a1aVar.f517b);
        if (format.l == null) {
            throw y(new IllegalArgumentException(), format);
        }
        h1(a1aVar.f516a);
        this.A = format;
        if (this.j0) {
            this.l0 = true;
            return null;
        }
        b bVar = this.J;
        if (bVar == null) {
            if (!H0()) {
                this.O = null;
            }
            I0();
            return null;
        }
        c cVar = this.Q;
        Format format2 = this.K;
        if (g0(cVar, format, this.C, this.D)) {
            d0();
            return new us5(cVar.f7979a, format2, format, 0, 128);
        }
        boolean z2 = this.D != this.C;
        rk1.g(!z2 || wlq.f38110a >= 23);
        us5 us5VarQ = Q(cVar, format2, format);
        int i2 = us5VarQ.d;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (n1(format)) {
                        this.K = format;
                        if (z2 && !e0()) {
                            i = 2;
                        }
                    } else {
                        i = 16;
                    }
                } else if (n1(format)) {
                    this.m0 = true;
                    this.n0 = 1;
                    int i3 = this.R;
                    if (i3 != 2 && (i3 != 1 || format.q != format2.q || format.f7818r != format2.f7818r)) {
                        z = false;
                    }
                    this.Z = z;
                    this.K = format;
                    if (z2 && !e0()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (n1(format)) {
                this.K = format;
                if (!z2 ? !c0() : !e0()) {
                    i = 2;
                }
            } else {
                i = 16;
            }
            return (us5VarQ.d != 0 || (this.J == bVar && this.p0 != 3)) ? us5VarQ : new us5(cVar.f7979a, format2, format, 0, i);
        }
        d0();
        i = 0;
        if (us5VarQ.d != 0) {
        }
    }

    public final boolean P(long j, long j2) throws ExoPlaybackException {
        boolean z;
        rk1.g(!this.w0);
        if (this.t.E()) {
            yg2 yg2Var = this.t;
            if (!U0(j, j2, null, yg2Var.c, this.f0, 0, yg2Var.D(), this.t.B(), this.t.m(), this.t.n(), this.B)) {
                return false;
            }
            Q0(this.t.C());
            this.t.h();
            z = false;
        } else {
            z = false;
        }
        if (this.v0) {
            this.w0 = true;
            return z;
        }
        if (this.k0) {
            rk1.g(this.t.z(this.s));
            this.k0 = z;
        }
        if (this.l0) {
            if (this.t.E()) {
                return true;
            }
            b0();
            this.l0 = z;
            I0();
            if (!this.j0) {
                return z;
            }
        }
        O();
        if (this.t.E()) {
            this.t.u();
        }
        if (this.t.E() || this.v0 || this.l0) {
            return true;
        }
        return z;
    }

    public abstract void P0(Format format, MediaFormat mediaFormat) throws ExoPlaybackException;

    public abstract us5 Q(c cVar, Format format, Format format2);

    public void Q0(long j) {
        while (true) {
            int i = this.H0;
            if (i == 0 || j < this.z[0]) {
                return;
            }
            long[] jArr = this.x;
            this.F0 = jArr[0];
            this.G0 = this.y[0];
            int i2 = i - 1;
            this.H0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.y;
            System.arraycopy(jArr2, 1, jArr2, 0, this.H0);
            long[] jArr3 = this.z;
            System.arraycopy(jArr3, 1, jArr3, 0, this.H0);
            R0();
        }
    }

    public final int R(String str) {
        int i = wlq.f38110a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = wlq.d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = wlq.f38111b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public void R0() {
    }

    public abstract void S0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    @TargetApi(23)
    public final void T0() throws ExoPlaybackException {
        int i = this.p0;
        if (i == 1) {
            l0();
            return;
        }
        if (i == 2) {
            l0();
            o1();
        } else if (i == 3) {
            X0();
        } else {
            this.w0 = true;
            Z0();
        }
    }

    public abstract boolean U0(long j, long j2, b bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    public final void V0() {
        this.s0 = true;
        MediaFormat mediaFormatG = this.J.g();
        if (this.R != 0 && mediaFormatG.getInteger("width") == 32 && mediaFormatG.getInteger("height") == 32) {
            this.a0 = true;
            return;
        }
        if (this.Y) {
            mediaFormatG.setInteger("channel-count", 1);
        }
        this.L = mediaFormatG;
        this.M = true;
    }

    public final boolean W0(int i) throws ExoPlaybackException {
        a1a a1aVarB = B();
        this.q.h();
        int iM = M(a1aVarB, this.q, i | 4);
        if (iM == -5) {
            O0(a1aVarB);
            return true;
        }
        if (iM != -4 || !this.q.n()) {
            return false;
        }
        this.v0 = true;
        T0();
        return false;
    }

    public final void X0() throws ExoPlaybackException {
        Y0();
        I0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Y0() {
        try {
            b bVar = this.J;
            if (bVar != null) {
                bVar.release();
                this.E0.f33940b++;
                N0(this.Q.f7979a);
            }
            this.J = null;
            try {
                MediaCrypto mediaCrypto = this.E;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.E = null;
                e1(null);
                b1();
            }
        } catch (Throwable th) {
            this.J = null;
            try {
                MediaCrypto mediaCrypto2 = this.E;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.E = null;
                e1(null);
                b1();
            }
        }
    }

    public void Z0() throws ExoPlaybackException {
    }

    @Override // defpackage.rkk
    public final int a(Format format) throws ExoPlaybackException {
        try {
            return l1(this.n, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw y(e, format);
        }
    }

    public MediaCodecDecoderException a0(Throwable th, c cVar) {
        return new MediaCodecDecoderException(th, cVar);
    }

    public void a1() {
        c1();
        d1();
        this.d0 = -9223372036854775807L;
        this.r0 = false;
        this.q0 = false;
        this.Z = false;
        this.a0 = false;
        this.h0 = false;
        this.i0 = false;
        this.v.clear();
        this.t0 = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        e83 e83Var = this.c0;
        if (e83Var != null) {
            e83Var.b();
        }
        this.o0 = 0;
        this.p0 = 0;
        this.n0 = this.m0 ? 1 : 0;
    }

    @Override // com.google.android.exoplayer2.s
    public boolean b() {
        return this.w0;
    }

    public final void b0() {
        this.l0 = false;
        this.t.h();
        this.s.h();
        this.k0 = false;
        this.j0 = false;
    }

    public void b1() {
        a1();
        this.D0 = null;
        this.c0 = null;
        this.O = null;
        this.Q = null;
        this.K = null;
        this.L = null;
        this.M = false;
        this.s0 = false;
        this.N = -1.0f;
        this.R = 0;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.b0 = false;
        this.m0 = false;
        this.n0 = 0;
        this.F = false;
    }

    public final boolean c0() {
        if (this.q0) {
            this.o0 = 1;
            if (this.T || this.V) {
                this.p0 = 3;
                return false;
            }
            this.p0 = 1;
        }
        return true;
    }

    public final void c1() {
        this.e0 = -1;
        this.f7966r.c = null;
    }

    public final void d0() throws ExoPlaybackException {
        if (!this.q0) {
            X0();
        } else {
            this.o0 = 1;
            this.p0 = 3;
        }
    }

    public final void d1() {
        this.f0 = -1;
        this.g0 = null;
    }

    @TargetApi(23)
    public final boolean e0() throws ExoPlaybackException {
        if (this.q0) {
            this.o0 = 1;
            if (this.T || this.V) {
                this.p0 = 3;
                return false;
            }
            this.p0 = 2;
        } else {
            o1();
        }
        return true;
    }

    public final void e1(DrmSession drmSession) {
        DrmSession.d(this.C, drmSession);
        this.C = drmSession;
    }

    public final boolean f0(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean zU0;
        int iE;
        if (!A0()) {
            if (this.W && this.r0) {
                try {
                    iE = this.J.e(this.w);
                } catch (IllegalStateException unused) {
                    T0();
                    if (this.w0) {
                        Y0();
                    }
                    return false;
                }
            } else {
                iE = this.J.e(this.w);
            }
            if (iE < 0) {
                if (iE == -2) {
                    V0();
                    return true;
                }
                if (this.b0 && (this.v0 || this.o0 == 2)) {
                    T0();
                }
                return false;
            }
            if (this.a0) {
                this.a0 = false;
                this.J.f(iE, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.w;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                T0();
                return false;
            }
            this.f0 = iE;
            ByteBuffer byteBufferM = this.J.m(iE);
            this.g0 = byteBufferM;
            if (byteBufferM != null) {
                byteBufferM.position(this.w.offset);
                ByteBuffer byteBuffer = this.g0;
                MediaCodec.BufferInfo bufferInfo2 = this.w;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.X) {
                MediaCodec.BufferInfo bufferInfo3 = this.w;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j3 = this.t0;
                    if (j3 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j3;
                    }
                }
            }
            this.h0 = D0(this.w.presentationTimeUs);
            long j4 = this.u0;
            long j5 = this.w.presentationTimeUs;
            this.i0 = j4 == j5;
            p1(j5);
        }
        if (this.W && this.r0) {
            try {
                b bVar = this.J;
                ByteBuffer byteBuffer2 = this.g0;
                int i = this.f0;
                MediaCodec.BufferInfo bufferInfo4 = this.w;
                z = false;
                try {
                    zU0 = U0(j, j2, bVar, byteBuffer2, i, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.h0, this.i0, this.B);
                } catch (IllegalStateException unused2) {
                    T0();
                    if (this.w0) {
                        Y0();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            b bVar2 = this.J;
            ByteBuffer byteBuffer3 = this.g0;
            int i2 = this.f0;
            MediaCodec.BufferInfo bufferInfo5 = this.w;
            zU0 = U0(j, j2, bVar2, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.h0, this.i0, this.B);
        }
        if (zU0) {
            Q0(this.w.presentationTimeUs);
            boolean z2 = (this.w.flags & 4) != 0 ? true : z;
            d1();
            if (!z2) {
                return true;
            }
            T0();
        }
        return z;
    }

    public final void f1() {
        this.y0 = true;
    }

    public final boolean g0(c cVar, Format format, DrmSession drmSession, DrmSession drmSession2) throws ExoPlaybackException {
        loa loaVarV0;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 == null || drmSession == null || wlq.f38110a < 23) {
            return true;
        }
        UUID uuid = g83.e;
        if (uuid.equals(drmSession.g()) || uuid.equals(drmSession2.g()) || (loaVarV0 = v0(drmSession2)) == null) {
            return true;
        }
        return !cVar.g && K0(loaVarV0, format);
    }

    public final void g1(ExoPlaybackException exoPlaybackException) {
        this.D0 = exoPlaybackException;
    }

    public void h0(boolean z) {
        this.z0 = z;
    }

    public final void h1(DrmSession drmSession) {
        DrmSession.d(this.D, drmSession);
        this.D = drmSession;
    }

    public void i0(boolean z) {
        this.A0 = z;
    }

    public final boolean i1(long j) {
        return this.G == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.G;
    }

    @Override // com.google.android.exoplayer2.s
    public boolean isReady() {
        return this.A != null && (E() || A0() || (this.d0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.d0));
    }

    public void j0(boolean z) {
        this.B0 = z;
    }

    public boolean j1(c cVar) {
        return true;
    }

    public final boolean k0() throws ExoPlaybackException {
        b bVar = this.J;
        if (bVar == null || this.o0 == 2 || this.v0) {
            return false;
        }
        if (this.e0 < 0) {
            int iL = bVar.l();
            this.e0 = iL;
            if (iL < 0) {
                return false;
            }
            this.f7966r.c = this.J.i(iL);
            this.f7966r.h();
        }
        if (this.o0 == 1) {
            if (!this.b0) {
                this.r0 = true;
                this.J.k(this.e0, 0, 0, 0L, 4);
                c1();
            }
            this.o0 = 2;
            return false;
        }
        if (this.Z) {
            this.Z = false;
            ByteBuffer byteBuffer = this.f7966r.c;
            byte[] bArr = I0;
            byteBuffer.put(bArr);
            this.J.k(this.e0, 0, bArr.length, 0L, 0);
            c1();
            this.q0 = true;
            return true;
        }
        if (this.n0 == 1) {
            for (int i = 0; i < this.K.n.size(); i++) {
                this.f7966r.c.put(this.K.n.get(i));
            }
            this.n0 = 2;
        }
        int iPosition = this.f7966r.c.position();
        a1a a1aVarB = B();
        try {
            int iM = M(a1aVarB, this.f7966r, 0);
            if (f()) {
                this.u0 = this.t0;
            }
            if (iM == -3) {
                return false;
            }
            if (iM == -5) {
                if (this.n0 == 2) {
                    this.f7966r.h();
                    this.n0 = 1;
                }
                O0(a1aVarB);
                return true;
            }
            if (this.f7966r.n()) {
                if (this.n0 == 2) {
                    this.f7966r.h();
                    this.n0 = 1;
                }
                this.v0 = true;
                if (!this.q0) {
                    T0();
                    return false;
                }
                try {
                    if (!this.b0) {
                        this.r0 = true;
                        this.J.k(this.e0, 0, 0, 0L, 4);
                        c1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw y(e, this.A);
                }
            }
            if (!this.q0 && !this.f7966r.o()) {
                this.f7966r.h();
                if (this.n0 == 2) {
                    this.n0 = 1;
                }
                return true;
            }
            boolean zW = this.f7966r.w();
            if (zW) {
                this.f7966r.f7867b.b(iPosition);
            }
            if (this.S && !zW) {
                kgg.b(this.f7966r.c);
                if (this.f7966r.c.position() == 0) {
                    return true;
                }
                this.S = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.f7966r;
            long jC = decoderInputBuffer.e;
            e83 e83Var = this.c0;
            if (e83Var != null) {
                jC = e83Var.c(this.A, decoderInputBuffer);
            }
            long j = jC;
            if (this.f7966r.m()) {
                this.v.add(Long.valueOf(j));
            }
            if (this.x0) {
                this.u.a(j, this.A);
                this.x0 = false;
            }
            if (this.c0 != null) {
                this.t0 = Math.max(this.t0, this.f7966r.e);
            } else {
                this.t0 = Math.max(this.t0, j);
            }
            this.f7966r.u();
            if (this.f7966r.l()) {
                z0(this.f7966r);
            }
            S0(this.f7966r);
            try {
                if (zW) {
                    this.J.a(this.e0, 0, this.f7966r.f7867b, j, 0);
                } else {
                    this.J.k(this.e0, 0, this.f7966r.c.limit(), j, 0);
                }
                c1();
                this.q0 = true;
                this.n0 = 0;
                this.E0.c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw y(e2, this.A);
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
            L0(e3);
            if (!this.C0) {
                throw z(a0(e3, q0()), this.A, false);
            }
            W0(0);
            l0();
            return true;
        }
    }

    public boolean k1(Format format) {
        return false;
    }

    @Override // com.google.android.exoplayer2.s
    public void l(long j, long j2) throws ExoPlaybackException {
        boolean z = false;
        if (this.y0) {
            this.y0 = false;
            T0();
        }
        ExoPlaybackException exoPlaybackException = this.D0;
        if (exoPlaybackException != null) {
            this.D0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.w0) {
                Z0();
                return;
            }
            if (this.A != null || W0(2)) {
                I0();
                if (this.j0) {
                    nkp.a("bypassRender");
                    while (P(j, j2)) {
                    }
                    nkp.c();
                } else if (this.J != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    nkp.a("drainAndFeed");
                    while (f0(j, j2) && i1(jElapsedRealtime)) {
                    }
                    while (k0() && i1(jElapsedRealtime)) {
                    }
                    nkp.c();
                } else {
                    this.E0.d += N(j);
                    W0(1);
                }
                this.E0.c();
            }
        } catch (IllegalStateException e) {
            if (!E0(e)) {
                throw e;
            }
            L0(e);
            if (wlq.f38110a >= 21 && G0(e)) {
                z = true;
            }
            if (z) {
                Y0();
            }
            throw z(a0(e, q0()), this.A, z);
        }
    }

    public final void l0() {
        try {
            this.J.flush();
        } finally {
            a1();
        }
    }

    public abstract int l1(d dVar, Format format) throws MediaCodecUtil.DecoderQueryException;

    public final boolean m0() throws ExoPlaybackException {
        boolean zN0 = n0();
        if (zN0) {
            I0();
        }
        return zN0;
    }

    public boolean n0() {
        if (this.J == null) {
            return false;
        }
        if (this.p0 == 3 || this.T || ((this.U && !this.s0) || (this.V && this.r0))) {
            Y0();
            return true;
        }
        l0();
        return false;
    }

    public final boolean n1(Format format) throws ExoPlaybackException {
        if (wlq.f38110a >= 23 && this.J != null && this.p0 != 3 && getState() != 0) {
            float fS0 = s0(this.I, format, D());
            float f = this.N;
            if (f == fS0) {
                return true;
            }
            if (fS0 == -1.0f) {
                d0();
                return false;
            }
            if (f == -1.0f && fS0 <= this.p) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fS0);
            this.J.c(bundle);
            this.N = fS0;
        }
        return true;
    }

    public final List<c> o0(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<c> listU0 = u0(this.n, this.A, z);
        if (listU0.isEmpty() && z) {
            listU0 = u0(this.n, this.A, false);
            if (!listU0.isEmpty()) {
                String str = this.A.l;
                String strValueOf = String.valueOf(listU0);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99 + strValueOf.length());
                sb.append("Drm session requires secure decoder for ");
                sb.append(str);
                sb.append(", but no secure decoder available. Trying to proceed with ");
                sb.append(strValueOf);
                sb.append(".");
                toe.h("MediaCodecRenderer", sb.toString());
            }
        }
        return listU0;
    }

    @RequiresApi(23)
    public final void o1() throws ExoPlaybackException {
        try {
            this.E.setMediaDrmSession(v0(this.D).f25264b);
            e1(this.D);
            this.o0 = 0;
            this.p0 = 0;
        } catch (MediaCryptoException e) {
            throw y(e, this.A);
        }
    }

    public final b p0() {
        return this.J;
    }

    public final void p1(long j) throws ExoPlaybackException {
        Format formatJ = this.u.j(j);
        if (formatJ == null && this.M) {
            formatJ = this.u.i();
        }
        if (formatJ != null) {
            this.B = formatJ;
        } else if (!this.M || this.B == null) {
            return;
        }
        P0(this.B, this.L);
        this.M = false;
    }

    public final c q0() {
        return this.Q;
    }

    public boolean r0() {
        return false;
    }

    public abstract float s0(float f, Format format, Format[] formatArr);

    public final MediaFormat t0() {
        return this.L;
    }

    public abstract List<c> u0(d dVar, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException;

    public final loa v0(DrmSession drmSession) throws ExoPlaybackException {
        oh8 oh8VarH = drmSession.h();
        if (oh8VarH == null || (oh8VarH instanceof loa)) {
            return (loa) oh8VarH;
        }
        String strValueOf = String.valueOf(oh8VarH);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 42);
        sb.append("Expecting FrameworkMediaCrypto but found: ");
        sb.append(strValueOf);
        throw y(new IllegalArgumentException(sb.toString()), this.A);
    }

    @Override // com.google.android.exoplayer2.s
    public void w(float f, float f2) throws ExoPlaybackException {
        this.H = f;
        this.I = f2;
        n1(this.K);
    }

    public abstract b.a w0(c cVar, Format format, MediaCrypto mediaCrypto, float f);

    @Override // com.google.android.exoplayer2.e, defpackage.rkk
    public final int x() {
        return 8;
    }

    public final long x0() {
        return this.G0;
    }

    public float y0() {
        return this.H;
    }

    public void z0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final c codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th, boolean z, int i) {
            String strValueOf = String.valueOf(format);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
            sb.append("Decoder init failed: [");
            sb.append(i);
            sb.append("], ");
            sb.append(strValueOf);
            this(sb.toString(), th, format.l, z, null, buildCustomDiagnosticInfo(i), null);
        }

        private static String buildCustomDiagnosticInfo(int i) {
            String str = i < 0 ? "neg_" : "";
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder(str.length() + 71);
            sb.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb.append(str);
            sb.append(iAbs);
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        @RequiresApi(21)
        private static String getDiagnosticInfoV21(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public DecoderInitializationException(Format format, Throwable th, boolean z, c cVar) {
            String str = cVar.f7979a;
            String strValueOf = String.valueOf(format);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + strValueOf.length());
            sb.append("Decoder init failed: ");
            sb.append(str);
            sb.append(", ");
            sb.append(strValueOf);
            this(sb.toString(), th, format.l, z, cVar, wlq.f38110a >= 21 ? getDiagnosticInfoV21(th) : null, null);
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z, c cVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = cVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
