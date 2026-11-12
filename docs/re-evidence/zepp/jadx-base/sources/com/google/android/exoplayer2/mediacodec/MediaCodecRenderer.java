package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    public static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final String S0 = "MediaCodecRenderer";
    private static final long T0 = 1000;
    private static final int U0 = 10;
    private static final int V0 = 0;
    private static final int W0 = 1;
    private static final int X0 = 2;
    private static final int Y0 = 0;
    private static final int Z0 = 1;
    private static final int a1 = 2;
    private static final int b1 = 0;
    private static final int c1 = 1;
    private static final int d1 = 2;
    private static final int e1 = 3;
    private static final int f1 = 0;
    private static final int g1 = 1;
    private static final int h1 = 2;
    private static final byte[] i1 = {0, 0, 1, 103, org.threeten.bp.a.l, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, ByteSourceJsonBootstrapper.UTF8_BOM_3, 28, HMDisplaySetting.TYPE_OSPREY_W, -61, 39, RaceType.INDICATION, 120};
    private static final int j1 = 32;

    @Nullable
    private Format A;
    private int A0;

    @Nullable
    private Format B;
    private int B0;

    @Nullable
    private DrmSession C;
    private boolean C0;

    @Nullable
    private DrmSession D;
    private boolean D0;

    @Nullable
    private MediaCrypto E;
    private boolean E0;
    private boolean F;
    private long F0;
    private long G;
    private long G0;
    private float H;
    private boolean H0;
    private float I;
    private boolean I0;

    @Nullable
    private MediaCodecAdapter J;
    private boolean J0;

    @Nullable
    private Format K;
    private boolean K0;

    @Nullable
    private MediaFormat L;
    private boolean L0;
    private boolean M;
    private boolean M0;
    private float N;
    private boolean N0;

    @Nullable
    private ArrayDeque<MediaCodecInfo> O;

    @Nullable
    private ExoPlaybackException O0;

    @Nullable
    private DecoderInitializationException P;
    private long P0;

    @Nullable
    private MediaCodecInfo Q;
    private long Q0;
    private int R;
    private int R0;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    public DecoderCounters decoderCounters;
    private final MediaCodecAdapter.Factory m;
    private boolean m0;
    private final MediaCodecSelector n;
    private boolean n0;
    private final boolean o;

    @Nullable
    private f o0;
    private final float p;
    private long p0;
    private final DecoderInputBuffer q;
    private int q0;
    private final DecoderInputBuffer r;
    private int r0;
    private final DecoderInputBuffer s;

    @Nullable
    private ByteBuffer s0;
    private final e t;
    private boolean t0;
    private final TimedValueQueue<Format> u;
    private boolean u0;
    private final ArrayList<Long> v;
    private boolean v0;
    private final MediaCodec.BufferInfo w;
    private boolean w0;
    private final long[] x;
    private boolean x0;
    private final long[] y;
    private boolean y0;
    private final long[] z;
    private int z0;

    public MediaCodecRenderer(int trackType, MediaCodecAdapter.Factory codecAdapterFactory, MediaCodecSelector mediaCodecSelector, boolean enableDecoderFallback, float assumedMinimumCodecOperatingRate) {
        super(trackType);
        this.m = codecAdapterFactory;
        this.n = (MediaCodecSelector) Assertions.checkNotNull(mediaCodecSelector);
        this.o = enableDecoderFallback;
        this.p = assumedMinimumCodecOperatingRate;
        this.q = DecoderInputBuffer.newNoDataInstance();
        this.r = new DecoderInputBuffer(0);
        this.s = new DecoderInputBuffer(2);
        e eVar = new e();
        this.t = eVar;
        this.u = new TimedValueQueue<>();
        this.v = new ArrayList<>();
        this.w = new MediaCodec.BufferInfo();
        this.H = 1.0f;
        this.I = 1.0f;
        this.G = C.TIME_UNSET;
        this.x = new long[10];
        this.y = new long[10];
        this.z = new long[10];
        this.P0 = C.TIME_UNSET;
        this.Q0 = C.TIME_UNSET;
        eVar.ensureSpaceForWrite(0);
        eVar.data.order(ByteOrder.nativeOrder());
        this.N = -1.0f;
        this.R = 0;
        this.z0 = 0;
        this.q0 = -1;
        this.r0 = -1;
        this.p0 = C.TIME_UNSET;
        this.F0 = C.TIME_UNSET;
        this.G0 = C.TIME_UNSET;
        this.A0 = 0;
        this.B0 = 0;
    }

    @RequiresApi(21)
    private static boolean A(IllegalStateException error) {
        return error instanceof MediaCodec.CodecException;
    }

    @RequiresApi(21)
    private static boolean B(IllegalStateException error) {
        if (error instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) error).isRecoverable();
        }
        return false;
    }

    private void C(MediaCrypto crypto, boolean mediaCryptoRequiresSecureDecoder) throws DecoderInitializationException {
        if (this.O == null) {
            try {
                List<MediaCodecInfo> listT = t(mediaCryptoRequiresSecureDecoder);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.O = arrayDeque;
                if (this.o) {
                    arrayDeque.addAll(listT);
                } else if (!listT.isEmpty()) {
                    this.O.add(listT.get(0));
                }
                this.P = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.A, e, mediaCryptoRequiresSecureDecoder, -49998);
            }
        }
        if (this.O.isEmpty()) {
            throw new DecoderInitializationException(this.A, (Throwable) null, mediaCryptoRequiresSecureDecoder, -49999);
        }
        while (this.J == null) {
            MediaCodecInfo mediaCodecInfoPeekFirst = this.O.peekFirst();
            if (!shouldInitCodec(mediaCodecInfoPeekFirst)) {
                return;
            }
            try {
                x(mediaCodecInfoPeekFirst, crypto);
            } catch (Exception e2) {
                String strValueOf = String.valueOf(mediaCodecInfoPeekFirst);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
                sb.append("Failed to initialize decoder: ");
                sb.append(strValueOf);
                Log.w(S0, sb.toString(), e2);
                this.O.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.A, e2, mediaCryptoRequiresSecureDecoder, mediaCodecInfoPeekFirst);
                onCodecError(decoderInitializationException);
                if (this.P == null) {
                    this.P = decoderInitializationException;
                } else {
                    this.P = this.P.c(decoderInitializationException);
                }
                if (this.O.isEmpty()) {
                    throw this.P;
                }
            }
        }
        this.O = null;
    }

    private boolean D(FrameworkMediaCrypto sessionMediaCrypto, Format format) {
        if (sessionMediaCrypto.forceAllowInsecureDecoderComponents) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(sessionMediaCrypto.uuid, sessionMediaCrypto.sessionId);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(format.sampleMimeType);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @TargetApi(23)
    private void E() throws ExoPlaybackException {
        int i = this.B0;
        if (i == 1) {
            s();
            return;
        }
        if (i == 2) {
            s();
            O();
        } else if (i == 3) {
            H();
        } else {
            this.I0 = true;
            renderToEndOfStream();
        }
    }

    private void F() {
        this.E0 = true;
        MediaFormat outputFormat = this.J.getOutputFormat();
        if (this.R != 0 && outputFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 32 && outputFormat.getInteger("height") == 32) {
            this.m0 = true;
            return;
        }
        if (this.Y) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.L = outputFormat;
        this.M = true;
    }

    private boolean G(int readFlags) throws ExoPlaybackException {
        FormatHolder formatHolder = getFormatHolder();
        this.q.clear();
        int source = readSource(formatHolder, this.q, readFlags | 4);
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (source != -4 || !this.q.isEndOfStream()) {
            return false;
        }
        this.H0 = true;
        E();
        return false;
    }

    private void H() throws ExoPlaybackException {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    private void I() {
        this.q0 = -1;
        this.r.data = null;
    }

    private void J() {
        this.r0 = -1;
        this.s0 = null;
    }

    private void K(@Nullable DrmSession session) {
        com.google.android.exoplayer2.drm.g.b(this.C, session);
        this.C = session;
    }

    private void L(@Nullable DrmSession session) {
        com.google.android.exoplayer2.drm.g.b(this.D, session);
        this.D = session;
    }

    private boolean M(long renderStartTimeMs) {
        return this.G == C.TIME_UNSET || SystemClock.elapsedRealtime() - renderStartTimeMs < this.G;
    }

    private boolean N(Format format) throws ExoPlaybackException {
        if (Util.SDK_INT >= 23 && this.J != null && this.B0 != 3 && getState() != 0) {
            float codecOperatingRateV23 = getCodecOperatingRateV23(this.I, format, getStreamFormats());
            float f = this.N;
            if (f == codecOperatingRateV23) {
                return true;
            }
            if (codecOperatingRateV23 == -1.0f) {
                n();
                return false;
            }
            if (f == -1.0f && codecOperatingRateV23 <= this.p) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            this.J.setParameters(bundle);
            this.N = codecOperatingRateV23;
        }
        return true;
    }

    @RequiresApi(23)
    private void O() throws ExoPlaybackException {
        try {
            this.E.setMediaDrmSession(u(this.D).sessionId);
            K(this.D);
            this.A0 = 0;
            this.B0 = 0;
        } catch (MediaCryptoException e) {
            throw createRendererException(e, this.A, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
        }
    }

    private void a() throws ExoPlaybackException {
        Assertions.checkState(!this.H0);
        FormatHolder formatHolder = getFormatHolder();
        this.s.clear();
        do {
            this.s.clear();
            int source = readSource(formatHolder, this.s, 0);
            if (source == -5) {
                onInputFormatChanged(formatHolder);
                return;
            }
            if (source != -4) {
                if (source != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.s.isEndOfStream()) {
                    this.H0 = true;
                    return;
                }
                if (this.J0) {
                    Format format = (Format) Assertions.checkNotNull(this.A);
                    this.B = format;
                    onOutputFormatChanged(format, null);
                    this.J0 = false;
                }
                this.s.flip();
            }
        } while (this.t.b(this.s));
        this.w0 = true;
    }

    private boolean b(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
        Assertions.checkState(!this.I0);
        if (this.t.g()) {
            e eVar = this.t;
            if (!processOutputBuffer(positionUs, elapsedRealtimeUs, null, eVar.data, this.r0, 0, eVar.f(), this.t.d(), this.t.isDecodeOnly(), this.t.isEndOfStream(), this.B)) {
                return false;
            }
            onProcessedOutputBuffer(this.t.e());
            this.t.clear();
        }
        if (this.H0) {
            this.I0 = true;
            return false;
        }
        if (this.w0) {
            Assertions.checkState(this.t.b(this.s));
            this.w0 = false;
        }
        if (this.x0) {
            if (this.t.g()) {
                return true;
            }
            l();
            this.x0 = false;
            maybeInitCodecOrBypass();
            if (!this.v0) {
                return false;
            }
        }
        a();
        if (this.t.g()) {
            this.t.flip();
        }
        return this.t.g() || this.H0 || this.x0;
    }

    private int c(String name) {
        int i = Util.SDK_INT;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(name)) {
            String str = Util.MODEL;
            if (str.startsWith("SM-T585") || str.startsWith("SM-A510") || str.startsWith("SM-A520") || str.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(name) && !"OMX.Nvidia.h264.decode.secure".equals(name)) {
            return 0;
        }
        String str2 = Util.DEVICE;
        return ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) ? 1 : 0;
    }

    private static boolean d(String name, Format format) {
        return Util.SDK_INT < 21 && format.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(name);
    }

    private static boolean e(String codecName) {
        if (Util.SDK_INT < 21 && "OMX.SEC.mp3.dec".equals(codecName) && "samsung".equals(Util.MANUFACTURER)) {
            String str = Util.DEVICE;
            if (str.startsWith("baffin") || str.startsWith("grand") || str.startsWith("fortuna") || str.startsWith("gprimelte") || str.startsWith("j2y18lte") || str.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(String name) {
        int i = Util.SDK_INT;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(name)) {
            if (i <= 19) {
                String str = Util.DEVICE;
                if (("hb2000".equals(str) || "stvm8".equals(str)) && ("OMX.amlogic.avc.decoder.awesome".equals(name) || "OMX.amlogic.avc.decoder.awesome.secure".equals(name))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean g(String name) {
        return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(name);
    }

    private static boolean h(MediaCodecInfo codecInfo) {
        String str = codecInfo.name;
        int i = Util.SDK_INT;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(Util.MANUFACTURER) && "AFTS".equals(Util.MODEL) && codecInfo.secure));
    }

    private static boolean i(String name) {
        int i = Util.SDK_INT;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(name) || "OMX.SEC.avc.dec.secure".equals(name))) || (i == 19 && Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(name) || "OMX.Exynos.avc.dec.secure".equals(name)));
    }

    private static boolean j(String name, Format format) {
        return Util.SDK_INT <= 18 && format.channelCount == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(name);
    }

    private static boolean k(String name) {
        return Util.SDK_INT == 29 && "c2.android.aac.decoder".equals(name);
    }

    private void l() {
        this.x0 = false;
        this.t.clear();
        this.s.clear();
        this.w0 = false;
        this.v0 = false;
    }

    private boolean m() {
        if (this.C0) {
            this.A0 = 1;
            if (this.T || this.V) {
                this.B0 = 3;
                return false;
            }
            this.B0 = 1;
        }
        return true;
    }

    private void n() throws ExoPlaybackException {
        if (!this.C0) {
            H();
        } else {
            this.A0 = 1;
            this.B0 = 3;
        }
    }

    @TargetApi(23)
    private boolean o() throws ExoPlaybackException {
        if (this.C0) {
            this.A0 = 1;
            if (this.T || this.V) {
                this.B0 = 3;
                return false;
            }
            this.B0 = 2;
        } else {
            O();
        }
        return true;
    }

    private boolean p(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
        boolean z;
        boolean zProcessOutputBuffer;
        int iDequeueOutputBufferIndex;
        if (!v()) {
            if (this.W && this.D0) {
                try {
                    iDequeueOutputBufferIndex = this.J.dequeueOutputBufferIndex(this.w);
                } catch (IllegalStateException unused) {
                    E();
                    if (this.I0) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBufferIndex = this.J.dequeueOutputBufferIndex(this.w);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    F();
                    return true;
                }
                if (this.n0 && (this.H0 || this.A0 == 2)) {
                    E();
                }
                return false;
            }
            if (this.m0) {
                this.m0 = false;
                this.J.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.w;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                E();
                return false;
            }
            this.r0 = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = this.J.getOutputBuffer(iDequeueOutputBufferIndex);
            this.s0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.w.offset);
                ByteBuffer byteBuffer = this.s0;
                MediaCodec.BufferInfo bufferInfo2 = this.w;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.X) {
                MediaCodec.BufferInfo bufferInfo3 = this.w;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j = this.F0;
                    if (j != C.TIME_UNSET) {
                        bufferInfo3.presentationTimeUs = j;
                    }
                }
            }
            this.t0 = y(this.w.presentationTimeUs);
            long j2 = this.G0;
            long j3 = this.w.presentationTimeUs;
            this.u0 = j2 == j3;
            updateOutputFormatForTime(j3);
        }
        if (this.W && this.D0) {
            try {
                MediaCodecAdapter mediaCodecAdapter = this.J;
                ByteBuffer byteBuffer2 = this.s0;
                int i = this.r0;
                MediaCodec.BufferInfo bufferInfo4 = this.w;
                z = false;
                try {
                    zProcessOutputBuffer = processOutputBuffer(positionUs, elapsedRealtimeUs, mediaCodecAdapter, byteBuffer2, i, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.t0, this.u0, this.B);
                } catch (IllegalStateException unused2) {
                    E();
                    if (this.I0) {
                        releaseCodec();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            MediaCodecAdapter mediaCodecAdapter2 = this.J;
            ByteBuffer byteBuffer3 = this.s0;
            int i2 = this.r0;
            MediaCodec.BufferInfo bufferInfo5 = this.w;
            zProcessOutputBuffer = processOutputBuffer(positionUs, elapsedRealtimeUs, mediaCodecAdapter2, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.t0, this.u0, this.B);
        }
        if (zProcessOutputBuffer) {
            onProcessedOutputBuffer(this.w.presentationTimeUs);
            boolean z2 = (this.w.flags & 4) != 0;
            J();
            if (!z2) {
                return true;
            }
            E();
        }
        return z;
    }

    private boolean q(MediaCodecInfo codecInfo, Format newFormat, @Nullable DrmSession oldSession, @Nullable DrmSession newSession) throws ExoPlaybackException {
        FrameworkMediaCrypto frameworkMediaCryptoU;
        if (oldSession == newSession) {
            return false;
        }
        if (newSession == null || oldSession == null || Util.SDK_INT < 23) {
            return true;
        }
        UUID uuid = C.PLAYREADY_UUID;
        if (uuid.equals(oldSession.getSchemeUuid()) || uuid.equals(newSession.getSchemeUuid()) || (frameworkMediaCryptoU = u(newSession)) == null) {
            return true;
        }
        return !codecInfo.secure && D(frameworkMediaCryptoU, newFormat);
    }

    private boolean r() throws ExoPlaybackException {
        MediaCodecAdapter mediaCodecAdapter = this.J;
        if (mediaCodecAdapter == null || this.A0 == 2 || this.H0) {
            return false;
        }
        if (this.q0 < 0) {
            int iDequeueInputBufferIndex = mediaCodecAdapter.dequeueInputBufferIndex();
            this.q0 = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.r.data = this.J.getInputBuffer(iDequeueInputBufferIndex);
            this.r.clear();
        }
        if (this.A0 == 1) {
            if (!this.n0) {
                this.D0 = true;
                this.J.queueInputBuffer(this.q0, 0, 0, 0L, 4);
                I();
            }
            this.A0 = 2;
            return false;
        }
        if (this.Z) {
            this.Z = false;
            ByteBuffer byteBuffer = this.r.data;
            byte[] bArr = i1;
            byteBuffer.put(bArr);
            this.J.queueInputBuffer(this.q0, 0, bArr.length, 0L, 0);
            I();
            this.C0 = true;
            return true;
        }
        if (this.z0 == 1) {
            for (int i = 0; i < this.K.initializationData.size(); i++) {
                this.r.data.put(this.K.initializationData.get(i));
            }
            this.z0 = 2;
        }
        int iPosition = this.r.data.position();
        FormatHolder formatHolder = getFormatHolder();
        try {
            int source = readSource(formatHolder, this.r, 0);
            if (hasReadStreamToEnd()) {
                this.G0 = this.F0;
            }
            if (source == -3) {
                return false;
            }
            if (source == -5) {
                if (this.z0 == 2) {
                    this.r.clear();
                    this.z0 = 1;
                }
                onInputFormatChanged(formatHolder);
                return true;
            }
            if (this.r.isEndOfStream()) {
                if (this.z0 == 2) {
                    this.r.clear();
                    this.z0 = 1;
                }
                this.H0 = true;
                if (!this.C0) {
                    E();
                    return false;
                }
                try {
                    if (!this.n0) {
                        this.D0 = true;
                        this.J.queueInputBuffer(this.q0, 0, 0, 0L, 4);
                        I();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw createRendererException(e, this.A, C.getErrorCodeForMediaDrmErrorCode(e.getErrorCode()));
                }
            }
            if (!this.C0 && !this.r.isKeyFrame()) {
                this.r.clear();
                if (this.z0 == 2) {
                    this.z0 = 1;
                }
                return true;
            }
            boolean zIsEncrypted = this.r.isEncrypted();
            if (zIsEncrypted) {
                this.r.cryptoInfo.increaseClearDataFirstSubSampleBy(iPosition);
            }
            if (this.S && !zIsEncrypted) {
                NalUnitUtil.discardToSps(this.r.data);
                if (this.r.data.position() == 0) {
                    return true;
                }
                this.S = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.r;
            long jC = decoderInputBuffer.timeUs;
            f fVar = this.o0;
            if (fVar != null) {
                jC = fVar.c(this.A, decoderInputBuffer);
            }
            long j = jC;
            if (this.r.isDecodeOnly()) {
                this.v.add(Long.valueOf(j));
            }
            if (this.J0) {
                this.u.add(j, this.A);
                this.J0 = false;
            }
            if (this.o0 != null) {
                this.F0 = Math.max(this.F0, this.r.timeUs);
            } else {
                this.F0 = Math.max(this.F0, j);
            }
            this.r.flip();
            if (this.r.hasSupplementalData()) {
                handleInputBufferSupplementalData(this.r);
            }
            onQueueInputBuffer(this.r);
            try {
                if (zIsEncrypted) {
                    this.J.queueSecureInputBuffer(this.q0, 0, this.r.cryptoInfo, j, 0);
                } else {
                    this.J.queueInputBuffer(this.q0, 0, this.r.data.limit(), j, 0);
                }
                I();
                this.C0 = true;
                this.z0 = 0;
                this.decoderCounters.inputBufferCount++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw createRendererException(e2, this.A, C.getErrorCodeForMediaDrmErrorCode(e2.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
            onCodecError(e3);
            G(0);
            s();
            return true;
        }
    }

    private void s() {
        try {
            this.J.flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    public static boolean supportsFormatDrm(Format format) {
        Class<? extends ExoMediaCrypto> cls = format.exoMediaCryptoType;
        return cls == null || FrameworkMediaCrypto.class.equals(cls);
    }

    private List<MediaCodecInfo> t(boolean mediaCryptoRequiresSecureDecoder) throws MediaCodecUtil.DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.n, this.A, mediaCryptoRequiresSecureDecoder);
        if (decoderInfos.isEmpty() && mediaCryptoRequiresSecureDecoder) {
            decoderInfos = getDecoderInfos(this.n, this.A, false);
            if (!decoderInfos.isEmpty()) {
                String str = this.A.sampleMimeType;
                String strValueOf = String.valueOf(decoderInfos);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99 + strValueOf.length());
                sb.append("Drm session requires secure decoder for ");
                sb.append(str);
                sb.append(", but no secure decoder available. Trying to proceed with ");
                sb.append(strValueOf);
                sb.append(".");
                Log.w(S0, sb.toString());
            }
        }
        return decoderInfos;
    }

    @Nullable
    private FrameworkMediaCrypto u(DrmSession drmSession) throws ExoPlaybackException {
        ExoMediaCrypto mediaCrypto = drmSession.getMediaCrypto();
        if (mediaCrypto == null || (mediaCrypto instanceof FrameworkMediaCrypto)) {
            return (FrameworkMediaCrypto) mediaCrypto;
        }
        String strValueOf = String.valueOf(mediaCrypto);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 42);
        sb.append("Expecting FrameworkMediaCrypto but found: ");
        sb.append(strValueOf);
        throw createRendererException(new IllegalArgumentException(sb.toString()), this.A, PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED);
    }

    private boolean v() {
        return this.r0 >= 0;
    }

    private void w(Format format) {
        l();
        String str = format.sampleMimeType;
        if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
            this.t.h(32);
        } else {
            this.t.h(1);
        }
        this.v0 = true;
    }

    private void x(MediaCodecInfo codecInfo, MediaCrypto crypto) throws Exception {
        String str = codecInfo.name;
        int i = Util.SDK_INT;
        float codecOperatingRateV23 = i < 23 ? -1.0f : getCodecOperatingRateV23(this.I, this.A, getStreamFormats());
        float f = codecOperatingRateV23 > this.p ? codecOperatingRateV23 : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strValueOf = String.valueOf(str);
        TraceUtil.beginSection(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
        MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(codecInfo, this.A, crypto, f);
        MediaCodecAdapter mediaCodecAdapterCreateAdapter = (!this.L0 || i < 23) ? this.m.createAdapter(mediaCodecConfiguration) : new AsynchronousMediaCodecAdapter.Factory(getTrackType(), this.M0, this.N0).createAdapter(mediaCodecConfiguration);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.J = mediaCodecAdapterCreateAdapter;
        this.Q = codecInfo;
        this.N = f;
        this.K = this.A;
        this.R = c(str);
        this.S = d(str, this.K);
        this.T = i(str);
        this.U = k(str);
        this.V = f(str);
        this.W = g(str);
        this.X = e(str);
        this.Y = j(str, this.K);
        this.n0 = h(codecInfo) || getCodecNeedsEosPropagation();
        if (mediaCodecAdapterCreateAdapter.needsReconfiguration()) {
            this.y0 = true;
            this.z0 = 1;
            this.Z = this.R != 0;
        }
        if ("c2.android.mp3.decoder".equals(codecInfo.name)) {
            this.o0 = new f();
        }
        if (getState() == 2) {
            this.p0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.decoderCounters.decoderInitCount++;
        onCodecInitialized(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
    }

    private boolean y(long presentationTimeUs) {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            if (this.v.get(i).longValue() == presentationTimeUs) {
                this.v.remove(i);
                return true;
            }
        }
        return false;
    }

    private static boolean z(IllegalStateException error) {
        if (Util.SDK_INT >= 21 && A(error)) {
            return true;
        }
        StackTraceElement[] stackTrace = error.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo codecInfo, Format oldFormat, Format newFormat) {
        return new DecoderReuseEvaluation(codecInfo.name, oldFormat, newFormat, 0, 1);
    }

    public MediaCodecDecoderException createDecoderException(Throwable cause, @Nullable MediaCodecInfo codecInfo) {
        return new MediaCodecDecoderException(cause, codecInfo);
    }

    public void experimentalSetAsynchronousBufferQueueingEnabled(boolean enabled) {
        this.L0 = enabled;
    }

    public void experimentalSetForceAsyncQueueingSynchronizationWorkaround(boolean enabled) {
        this.M0 = enabled;
    }

    public void experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean enabled) {
        this.N0 = enabled;
    }

    public final boolean flushOrReinitializeCodec() throws ExoPlaybackException {
        boolean zFlushOrReleaseCodec = flushOrReleaseCodec();
        if (zFlushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return zFlushOrReleaseCodec;
    }

    public boolean flushOrReleaseCodec() {
        if (this.J == null) {
            return false;
        }
        if (this.B0 == 3 || this.T || ((this.U && !this.E0) || (this.V && this.D0))) {
            releaseCodec();
            return true;
        }
        s();
        return false;
    }

    @Nullable
    public final MediaCodecAdapter getCodec() {
        return this.J;
    }

    @Nullable
    public final MediaCodecInfo getCodecInfo() {
        return this.Q;
    }

    public boolean getCodecNeedsEosPropagation() {
        return false;
    }

    public float getCodecOperatingRate() {
        return this.N;
    }

    public float getCodecOperatingRateV23(float targetPlaybackSpeed, Format format, Format[] streamFormats) {
        return -1.0f;
    }

    @Nullable
    public final MediaFormat getCodecOutputMediaFormat() {
        return this.L;
    }

    public abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean requiresSecureDecoder) throws MediaCodecUtil.DecoderQueryException;

    @Nullable
    public abstract MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo codecInfo, Format format, @Nullable MediaCrypto crypto, float codecOperatingRate);

    public final long getOutputStreamOffsetUs() {
        return this.Q0;
    }

    public float getPlaybackSpeed() {
        return this.H;
    }

    public void handleInputBufferSupplementalData(DecoderInputBuffer buffer) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.I0;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return this.A != null && (isSourceReady() || v() || (this.p0 != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.p0));
    }

    public final void maybeInitCodecOrBypass() throws ExoPlaybackException {
        Format format;
        if (this.J != null || this.v0 || (format = this.A) == null) {
            return;
        }
        if (this.D == null && shouldUseBypass(format)) {
            w(this.A);
            return;
        }
        K(this.D);
        String str = this.A.sampleMimeType;
        DrmSession drmSession = this.C;
        if (drmSession != null) {
            if (this.E == null) {
                FrameworkMediaCrypto frameworkMediaCryptoU = u(drmSession);
                if (frameworkMediaCryptoU != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(frameworkMediaCryptoU.uuid, frameworkMediaCryptoU.sessionId);
                        this.E = mediaCrypto;
                        this.F = !frameworkMediaCryptoU.forceAllowInsecureDecoderComponents && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e) {
                        throw createRendererException(e, this.A, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
                    }
                } else if (this.C.getError() == null) {
                    return;
                }
            }
            if (FrameworkMediaCrypto.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) {
                int state = this.C.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) Assertions.checkNotNull(this.C.getError());
                    throw createRendererException(drmSessionException, this.A, drmSessionException.errorCode);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            C(this.E, this.F);
        } catch (DecoderInitializationException e2) {
            throw createRendererException(e2, this.A, 4001);
        }
    }

    public void onCodecError(Exception codecError) {
    }

    public void onCodecInitialized(String name, long initializedTimestampMs, long initializationDurationMs) {
    }

    public void onCodecReleased(String name) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.A = null;
        this.P0 = C.TIME_UNSET;
        this.Q0 = C.TIME_UNSET;
        this.R0 = 0;
        flushOrReleaseCodec();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean joining, boolean mayRenderStartOfStream) throws ExoPlaybackException {
        this.decoderCounters = new DecoderCounters();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    @Nullable
    @CallSuper
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        int i;
        boolean z = true;
        this.J0 = true;
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        if (format.sampleMimeType == null) {
            throw createRendererException(new IllegalArgumentException(), format, PlaybackException.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED);
        }
        L(formatHolder.drmSession);
        this.A = format;
        if (this.v0) {
            this.x0 = true;
            return null;
        }
        MediaCodecAdapter mediaCodecAdapter = this.J;
        if (mediaCodecAdapter == null) {
            this.O = null;
            maybeInitCodecOrBypass();
            return null;
        }
        MediaCodecInfo mediaCodecInfo = this.Q;
        Format format2 = this.K;
        if (q(mediaCodecInfo, format, this.C, this.D)) {
            n();
            return new DecoderReuseEvaluation(mediaCodecInfo.name, format2, format, 0, 128);
        }
        boolean z2 = this.D != this.C;
        Assertions.checkState(!z2 || Util.SDK_INT >= 23);
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = canReuseCodec(mediaCodecInfo, format2, format);
        int i2 = decoderReuseEvaluationCanReuseCodec.result;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    if (N(format)) {
                        this.K = format;
                        if (z2 && !o()) {
                            i = 2;
                        }
                    } else {
                        i = 16;
                    }
                } else if (N(format)) {
                    this.y0 = true;
                    this.z0 = 1;
                    int i3 = this.R;
                    if (i3 != 2 && (i3 != 1 || format.width != format2.width || format.height != format2.height)) {
                        z = false;
                    }
                    this.Z = z;
                    this.K = format;
                    if (z2 && !o()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (N(format)) {
                this.K = format;
                if (!z2 ? !m() : !o()) {
                    i = 2;
                }
            } else {
                i = 16;
            }
            return (decoderReuseEvaluationCanReuseCodec.result != 0 || (this.J == mediaCodecAdapter && this.B0 != 3)) ? decoderReuseEvaluationCanReuseCodec : new DecoderReuseEvaluation(mediaCodecInfo.name, format2, format, 0, i);
        }
        n();
        i = 0;
        if (decoderReuseEvaluationCanReuseCodec.result != 0) {
        }
    }

    public void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) throws ExoPlaybackException {
        this.H0 = false;
        this.I0 = false;
        this.K0 = false;
        if (this.v0) {
            this.t.clear();
            this.s.clear();
            this.w0 = false;
        } else {
            flushOrReinitializeCodec();
        }
        if (this.u.size() > 0) {
            this.J0 = true;
        }
        this.u.clear();
        int i = this.R0;
        if (i != 0) {
            this.Q0 = this.y[i - 1];
            this.P0 = this.x[i - 1];
            this.R0 = 0;
        }
    }

    @CallSuper
    public void onProcessedOutputBuffer(long presentationTimeUs) {
        while (true) {
            int i = this.R0;
            if (i == 0 || presentationTimeUs < this.z[0]) {
                return;
            }
            long[] jArr = this.x;
            this.P0 = jArr[0];
            this.Q0 = this.y[0];
            int i2 = i - 1;
            this.R0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.y;
            System.arraycopy(jArr2, 1, jArr2, 0, this.R0);
            long[] jArr3 = this.z;
            System.arraycopy(jArr3, 1, jArr3, 0, this.R0);
            onProcessedStreamChange();
        }
    }

    public void onProcessedStreamChange() {
    }

    public void onQueueInputBuffer(DecoderInputBuffer buffer) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onReset() {
        try {
            l();
            releaseCodec();
        } finally {
            L(null);
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formats, long startPositionUs, long offsetUs) throws ExoPlaybackException {
        if (this.Q0 == C.TIME_UNSET) {
            Assertions.checkState(this.P0 == C.TIME_UNSET);
            this.P0 = startPositionUs;
            this.Q0 = offsetUs;
            return;
        }
        int i = this.R0;
        long[] jArr = this.y;
        if (i == jArr.length) {
            long j = jArr[i - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j);
            Log.w(S0, sb.toString());
        } else {
            this.R0 = i + 1;
        }
        long[] jArr2 = this.x;
        int i2 = this.R0;
        jArr2[i2 - 1] = startPositionUs;
        this.y[i2 - 1] = offsetUs;
        this.z[i2 - 1] = this.F0;
    }

    public abstract boolean processOutputBuffer(long positionUs, long elapsedRealtimeUs, @Nullable MediaCodecAdapter codec, @Nullable ByteBuffer buffer, int bufferIndex, int bufferFlags, int sampleCount, long bufferPresentationTimeUs, boolean isDecodeOnlyBuffer, boolean isLastBuffer, Format format) throws ExoPlaybackException;

    /* JADX WARN: Multi-variable type inference failed */
    public void releaseCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.J;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.decoderCounters.decoderReleaseCount++;
                onCodecReleased(this.Q.name);
            }
            this.J = null;
            try {
                MediaCrypto mediaCrypto = this.E;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.E = null;
                K(null);
                resetCodecStateForRelease();
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
                K(null);
                resetCodecStateForRelease();
            }
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long positionUs, long elapsedRealtimeUs) throws ExoPlaybackException {
        boolean z = false;
        if (this.K0) {
            this.K0 = false;
            E();
        }
        ExoPlaybackException exoPlaybackException = this.O0;
        if (exoPlaybackException != null) {
            this.O0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.I0) {
                renderToEndOfStream();
                return;
            }
            if (this.A != null || G(2)) {
                maybeInitCodecOrBypass();
                if (this.v0) {
                    TraceUtil.beginSection("bypassRender");
                    while (b(positionUs, elapsedRealtimeUs)) {
                    }
                    TraceUtil.endSection();
                } else if (this.J != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    TraceUtil.beginSection("drainAndFeed");
                    while (p(positionUs, elapsedRealtimeUs) && M(jElapsedRealtime)) {
                    }
                    while (r() && M(jElapsedRealtime)) {
                    }
                    TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(positionUs);
                    G(1);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (IllegalStateException e) {
            if (!z(e)) {
                throw e;
            }
            onCodecError(e);
            if (Util.SDK_INT >= 21 && B(e)) {
                z = true;
            }
            if (z) {
                releaseCodec();
            }
            throw createRendererException(createDecoderException(e, getCodecInfo()), this.A, z, PlaybackException.ERROR_CODE_DECODING_FAILED);
        }
    }

    public void renderToEndOfStream() throws ExoPlaybackException {
    }

    @CallSuper
    public void resetCodecStateForFlush() {
        I();
        J();
        this.p0 = C.TIME_UNSET;
        this.D0 = false;
        this.C0 = false;
        this.Z = false;
        this.m0 = false;
        this.t0 = false;
        this.u0 = false;
        this.v.clear();
        this.F0 = C.TIME_UNSET;
        this.G0 = C.TIME_UNSET;
        f fVar = this.o0;
        if (fVar != null) {
            fVar.b();
        }
        this.A0 = 0;
        this.B0 = 0;
        this.z0 = this.y0 ? 1 : 0;
    }

    @CallSuper
    public void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.O0 = null;
        this.o0 = null;
        this.O = null;
        this.Q = null;
        this.K = null;
        this.L = null;
        this.M = false;
        this.E0 = false;
        this.N = -1.0f;
        this.R = 0;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.n0 = false;
        this.y0 = false;
        this.z0 = 0;
        this.F = false;
    }

    public final void setPendingOutputEndOfStream() {
        this.K0 = true;
    }

    public final void setPendingPlaybackException(ExoPlaybackException exception) {
        this.O0 = exception;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float currentPlaybackSpeed, float targetPlaybackSpeed) throws ExoPlaybackException {
        this.H = currentPlaybackSpeed;
        this.I = targetPlaybackSpeed;
        N(this.K);
    }

    public void setRenderTimeLimitMs(long renderTimeLimitMs) {
        this.G = renderTimeLimitMs;
    }

    public boolean shouldInitCodec(MediaCodecInfo codecInfo) {
        return true;
    }

    public boolean shouldUseBypass(Format format) {
        return false;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.n, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw createRendererException(e, format, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED);
        }
    }

    public abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException;

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public final boolean updateCodecOperatingRate() throws ExoPlaybackException {
        return N(this.K);
    }

    public final void updateOutputFormatForTime(long presentationTimeUs) throws ExoPlaybackException {
        boolean z;
        Format formatPollFloor = this.u.pollFloor(presentationTimeUs);
        if (formatPollFloor == null && this.M) {
            formatPollFloor = this.u.pollFirst();
        }
        if (formatPollFloor != null) {
            this.B = formatPollFloor;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.M && this.B != null)) {
            onOutputFormatChanged(this.B, this.L);
            this.M = false;
        }
    }

    public static class DecoderInitializationException extends Exception {
        private static final int a = -50000;
        private static final int b = -49999;
        private static final int c = -49998;

        @Nullable
        public final MediaCodecInfo codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, @Nullable Throwable cause, boolean secureDecoderRequired, int errorCode) {
            String strValueOf = String.valueOf(format);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
            sb.append("Decoder init failed: [");
            sb.append(errorCode);
            sb.append("], ");
            sb.append(strValueOf);
            this(sb.toString(), cause, format.sampleMimeType, secureDecoderRequired, null, b(errorCode), null);
        }

        private static String b(int errorCode) {
            String str = errorCode < 0 ? "neg_" : "";
            int iAbs = Math.abs(errorCode);
            StringBuilder sb = new StringBuilder(str.length() + 71);
            sb.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb.append(str);
            sb.append(iAbs);
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public DecoderInitializationException c(DecoderInitializationException fallbackException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, fallbackException);
        }

        @Nullable
        @RequiresApi(21)
        private static String e(@Nullable Throwable cause) {
            if (cause instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) cause).getDiagnosticInfo();
            }
            return null;
        }

        public DecoderInitializationException(Format format, @Nullable Throwable cause, boolean secureDecoderRequired, MediaCodecInfo mediaCodecInfo) {
            String str = mediaCodecInfo.name;
            String strValueOf = String.valueOf(format);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + strValueOf.length());
            sb.append("Decoder init failed: ");
            sb.append(str);
            sb.append(", ");
            sb.append(strValueOf);
            this(sb.toString(), cause, format.sampleMimeType, secureDecoderRequired, mediaCodecInfo, Util.SDK_INT >= 21 ? e(cause) : null, null);
        }

        private DecoderInitializationException(String message, @Nullable Throwable cause, String mimeType, boolean secureDecoderRequired, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable String diagnosticInfo, @Nullable DecoderInitializationException fallbackDecoderInitializationException) {
            super(message, cause);
            this.mimeType = mimeType;
            this.secureDecoderRequired = secureDecoderRequired;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = diagnosticInfo;
            this.fallbackDecoderInitializationException = fallbackDecoderInitializationException;
        }
    }
}
