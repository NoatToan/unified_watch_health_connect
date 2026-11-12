package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaFormatUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer {
    private static final String T1 = "MediaCodecVideoRenderer";
    private static final String U1 = "crop-left";
    private static final String V1 = "crop-right";
    private static final String W1 = "crop-bottom";
    private static final String X1 = "crop-top";
    private static final int[] Y1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static final float Z1 = 1.5f;
    private static final long a2 = Long.MAX_VALUE;
    private static boolean b2;
    private static boolean c2;
    private long A1;
    private long B1;
    private long C1;
    private int D1;
    private int E1;
    private int F1;
    private long G1;
    private long H1;
    private long I1;
    private int J1;
    private int K1;
    private int L1;
    private int M1;
    private float N1;

    @Nullable
    private VideoSize O1;
    private boolean P1;
    private int Q1;

    @Nullable
    public a R1;

    @Nullable
    private VideoFrameMetadataListener S1;
    private final Context k1;
    private final VideoFrameReleaseHelper l1;
    private final VideoRendererEventListener.EventDispatcher m1;
    private final long n1;
    private final int o1;
    private final boolean p1;
    private CodecMaxValues q1;
    private boolean r1;
    private boolean s1;

    @Nullable
    private Surface t1;

    @Nullable
    private DummySurface u1;
    private boolean v1;
    private int w1;
    private boolean x1;
    private boolean y1;
    private boolean z1;

    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int width, int height, int inputSize) {
            this.width = width;
            this.height = height;
            this.inputSize = inputSize;
        }
    }

    @RequiresApi(23)
    public final class a implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        private static final int c = 0;
        private final Handler a;

        public a(MediaCodecAdapter codec) {
            Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(this);
            this.a = handlerCreateHandlerForCurrentLooper;
            codec.setOnFrameRenderedListener(this, handlerCreateHandlerForCurrentLooper);
        }

        private void a(long presentationTimeUs) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.R1) {
                return;
            }
            if (presentationTimeUs == Long.MAX_VALUE) {
                mediaCodecVideoRenderer.i0();
                return;
            }
            try {
                mediaCodecVideoRenderer.onProcessedTunneledBuffer(presentationTimeUs);
            } catch (ExoPlaybackException e) {
                MediaCodecVideoRenderer.this.setPendingPlaybackException(e);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(Util.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(MediaCodecAdapter codec, long presentationTimeUs, long nanoTime) {
            if (Util.SDK_INT >= 30) {
                a(presentationTimeUs);
            } else {
                this.a.sendMessageAtFrontOfQueue(Message.obtain(this.a, 0, (int) (presentationTimeUs >> 32), (int) presentationTimeUs));
            }
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    private void R() {
        MediaCodecAdapter codec;
        this.x1 = false;
        if (Util.SDK_INT < 23 || !this.P1 || (codec = getCodec()) == null) {
            return;
        }
        this.R1 = new a(codec);
    }

    private void S() {
        this.O1 = null;
    }

    @RequiresApi(21)
    private static void T(MediaFormat mediaFormat, int tunnelingAudioSessionId) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", tunnelingAudioSessionId);
    }

    private static boolean U() {
        return "NVIDIA".equals(Util.MANUFACTURER);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:610:0x0829  */
    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private static boolean V() {
        /*
            Method dump skipped, instruction units count: 3046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.MediaCodecVideoRenderer.V():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    private static int W(MediaCodecInfo codecInfo, String sampleMimeType, int width, int height) {
        int iCeilDivide;
        if (width != -1 && height != -1) {
            sampleMimeType.hashCode();
            int i = 4;
            switch (sampleMimeType) {
                case "video/dolby-vision":
                case "video/avc":
                    String str = Util.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str) && (!"Amazon".equals(Util.MANUFACTURER) || (!"KFSOWI".equals(str) && (!"AFTS".equals(str) || !codecInfo.secure)))) {
                        iCeilDivide = Util.ceilDivide(width, 16) * Util.ceilDivide(height, 16) * 16 * 16;
                        i = 2;
                        return (iCeilDivide * 3) / (i * 2);
                    }
                    break;
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    iCeilDivide = width * height;
                    i = 2;
                    return (iCeilDivide * 3) / (i * 2);
                case "video/hevc":
                case "video/x-vnd.on2.vp9":
                    iCeilDivide = width * height;
                    return (iCeilDivide * 3) / (i * 2);
                default:
                    return -1;
            }
        }
        return -1;
    }

    private static Point X(MediaCodecInfo codecInfo, Format format) {
        int i = format.height;
        int i2 = format.width;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : Y1) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (Util.SDK_INT >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointAlignVideoSizeV21 = codecInfo.alignVideoSizeV21(i6, i4);
                if (codecInfo.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, format.frameRate)) {
                    return pointAlignVideoSizeV21;
                }
            } else {
                try {
                    int iCeilDivide = Util.ceilDivide(i4, 16) * 16;
                    int iCeilDivide2 = Util.ceilDivide(i5, 16) * 16;
                    if (iCeilDivide * iCeilDivide2 <= MediaCodecUtil.maxH264DecodableFrameSize()) {
                        int i7 = z ? iCeilDivide2 : iCeilDivide;
                        if (!z) {
                            iCeilDivide = iCeilDivide2;
                        }
                        return new Point(i7, iCeilDivide);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    private static List<MediaCodecInfo> Y(MediaCodecSelector mediaCodecSelector, Format format, boolean requiresSecureDecoder, boolean requiresTunnelingDecoder) throws MediaCodecUtil.DecoderQueryException {
        Pair<Integer, Integer> codecProfileAndLevel;
        String str = format.sampleMimeType;
        if (str == null) {
            return Collections.emptyList();
        }
        List<MediaCodecInfo> decoderInfosSortedByFormatSupport = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(mediaCodecSelector.getDecoderInfos(str, requiresSecureDecoder, requiresTunnelingDecoder), format);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str) && (codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                decoderInfosSortedByFormatSupport.addAll(mediaCodecSelector.getDecoderInfos(MimeTypes.VIDEO_H265, requiresSecureDecoder, requiresTunnelingDecoder));
            } else if (iIntValue == 512) {
                decoderInfosSortedByFormatSupport.addAll(mediaCodecSelector.getDecoderInfos(MimeTypes.VIDEO_H264, requiresSecureDecoder, requiresTunnelingDecoder));
            }
        }
        return Collections.unmodifiableList(decoderInfosSortedByFormatSupport);
    }

    private static boolean Z(long earlyUs) {
        return earlyUs < -30000;
    }

    private static boolean a0(long earlyUs) {
        return earlyUs < -500000;
    }

    private void b0() {
        if (this.D1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.m1.droppedFrames(this.D1, jElapsedRealtime - this.C1);
            this.D1 = 0;
            this.C1 = jElapsedRealtime;
        }
    }

    private void d0() {
        int i = this.J1;
        if (i != 0) {
            this.m1.reportVideoFrameProcessingOffset(this.I1, i);
            this.I1 = 0L;
            this.J1 = 0;
        }
    }

    private void e0() {
        int i = this.K1;
        if (i == -1 && this.L1 == -1) {
            return;
        }
        VideoSize videoSize = this.O1;
        if (videoSize != null && videoSize.width == i && videoSize.height == this.L1 && videoSize.unappliedRotationDegrees == this.M1 && videoSize.pixelWidthHeightRatio == this.N1) {
            return;
        }
        VideoSize videoSize2 = new VideoSize(this.K1, this.L1, this.M1, this.N1);
        this.O1 = videoSize2;
        this.m1.videoSizeChanged(videoSize2);
    }

    private void f0() {
        if (this.v1) {
            this.m1.renderedFirstFrame(this.t1);
        }
    }

    private void g0() {
        VideoSize videoSize = this.O1;
        if (videoSize != null) {
            this.m1.videoSizeChanged(videoSize);
        }
    }

    public static int getMaxInputSize(MediaCodecInfo codecInfo, Format format) {
        if (format.maxInputSize == -1) {
            return W(codecInfo, format.sampleMimeType, format.width, format.height);
        }
        int size = format.initializationData.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += format.initializationData.get(i).length;
        }
        return format.maxInputSize + length;
    }

    private void h0(long presentationTimeUs, long releaseTimeNs, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.S1;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(presentationTimeUs, releaseTimeNs, format, getCodecOutputMediaFormat());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        setPendingOutputEndOfStream();
    }

    @RequiresApi(29)
    private static void j0(MediaCodecAdapter codec, byte[] hdr10PlusInfo) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", hdr10PlusInfo);
        codec.setParameters(bundle);
    }

    private void k0() {
        this.B1 = this.n1 > 0 ? SystemClock.elapsedRealtime() + this.n1 : C.TIME_UNSET;
    }

    private boolean l0(MediaCodecInfo codecInfo) {
        return Util.SDK_INT >= 23 && !this.P1 && !codecNeedsSetOutputSurfaceWorkaround(codecInfo.name) && (!codecInfo.secure || DummySurface.isSecureSupported(this.k1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.exoplayer2.video.VideoFrameReleaseHelper] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.video.MediaCodecVideoRenderer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.exoplayer2.video.DummySurface] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    private void setOutput(@Nullable Object obj) throws ExoPlaybackException {
        ?? NewInstanceV17;
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            NewInstanceV17 = 0;
        }
        if (NewInstanceV17 == 0) {
            DummySurface dummySurface = this.u1;
            if (dummySurface != null) {
                NewInstanceV17 = surface;
                NewInstanceV17 = dummySurface;
            } else {
                MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && l0(codecInfo)) {
                    NewInstanceV17 = surface;
                    NewInstanceV17 = DummySurface.newInstanceV17(this.k1, codecInfo.secure);
                    this.u1 = NewInstanceV17;
                }
            }
        }
        NewInstanceV17 = surface;
        NewInstanceV17 = surface;
        NewInstanceV17 = surface;
        if (this.t1 == NewInstanceV17) {
            if (NewInstanceV17 == 0 || NewInstanceV17 == this.u1) {
                return;
            }
            g0();
            f0();
            return;
        }
        this.t1 = NewInstanceV17;
        this.l1.onSurfaceChanged(NewInstanceV17);
        this.v1 = false;
        int state = getState();
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            if (Util.SDK_INT < 23 || NewInstanceV17 == 0 || this.r1) {
                releaseCodec();
                maybeInitCodecOrBypass();
            } else {
                setOutputSurfaceV23(codec, NewInstanceV17);
            }
        }
        if (NewInstanceV17 == 0 || NewInstanceV17 == this.u1) {
            S();
            R();
            return;
        }
        g0();
        R();
        if (state == 2) {
            k0();
        }
    }

    public void c0() {
        this.z1 = true;
        if (this.x1) {
            return;
        }
        this.x1 = true;
        this.m1.renderedFirstFrame(this.t1);
        this.v1 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo codecInfo, Format oldFormat, Format newFormat) {
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = codecInfo.canReuseCodec(oldFormat, newFormat);
        int i = decoderReuseEvaluationCanReuseCodec.discardReasons;
        int i2 = newFormat.width;
        CodecMaxValues codecMaxValues = this.q1;
        if (i2 > codecMaxValues.width || newFormat.height > codecMaxValues.height) {
            i |= 256;
        }
        if (getMaxInputSize(codecInfo, newFormat) > this.q1.inputSize) {
            i |= 64;
        }
        int i3 = i;
        return new DecoderReuseEvaluation(codecInfo.name, oldFormat, newFormat, i3 != 0 ? 0 : decoderReuseEvaluationCanReuseCodec.result, i3);
    }

    public boolean codecNeedsSetOutputSurfaceWorkaround(String name) {
        if (name.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            if (!b2) {
                c2 = V();
                b2 = true;
            }
        }
        return c2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public MediaCodecDecoderException createDecoderException(Throwable cause, @Nullable MediaCodecInfo codecInfo) {
        return new MediaCodecVideoDecoderException(cause, codecInfo, this.t1);
    }

    public void dropOutputBuffer(MediaCodecAdapter codec, int index, long presentationTimeUs) {
        TraceUtil.beginSection("dropVideoBuffer");
        codec.releaseOutputBuffer(index, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(1);
    }

    public CodecMaxValues getCodecMaxValues(MediaCodecInfo codecInfo, Format format, Format[] streamFormats) {
        int iW;
        int iMax = format.width;
        int iMax2 = format.height;
        int maxInputSize = getMaxInputSize(codecInfo, format);
        if (streamFormats.length == 1) {
            if (maxInputSize != -1 && (iW = W(codecInfo, format.sampleMimeType, format.width, format.height)) != -1) {
                maxInputSize = Math.min((int) (maxInputSize * 1.5f), iW);
            }
            return new CodecMaxValues(iMax, iMax2, maxInputSize);
        }
        int length = streamFormats.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            Format formatBuild = streamFormats[i];
            if (format.colorInfo != null && formatBuild.colorInfo == null) {
                formatBuild = formatBuild.buildUpon().setColorInfo(format.colorInfo).build();
            }
            if (codecInfo.canReuseCodec(format, formatBuild).result != 0) {
                int i2 = formatBuild.width;
                z |= i2 == -1 || formatBuild.height == -1;
                iMax = Math.max(iMax, i2);
                iMax2 = Math.max(iMax2, formatBuild.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(codecInfo, formatBuild));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(iMax);
            sb.append("x");
            sb.append(iMax2);
            Log.w(T1, sb.toString());
            Point pointX = X(codecInfo, format);
            if (pointX != null) {
                iMax = Math.max(iMax, pointX.x);
                iMax2 = Math.max(iMax2, pointX.y);
                maxInputSize = Math.max(maxInputSize, W(codecInfo, format.sampleMimeType, iMax, iMax2));
                StringBuilder sb2 = new StringBuilder(57);
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(iMax);
                sb2.append("x");
                sb2.append(iMax2);
                Log.w(T1, sb2.toString());
            }
        }
        return new CodecMaxValues(iMax, iMax2, maxInputSize);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean getCodecNeedsEosPropagation() {
        return this.P1 && Util.SDK_INT < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float getCodecOperatingRateV23(float targetPlaybackSpeed, Format format, Format[] streamFormats) {
        float fMax = -1.0f;
        for (Format format2 : streamFormats) {
            float f = format2.frameRate;
            if (f != -1.0f) {
                fMax = Math.max(fMax, f);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * targetPlaybackSpeed;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean requiresSecureDecoder) throws MediaCodecUtil.DecoderQueryException {
        return Y(mediaCodecSelector, format, requiresSecureDecoder, this.P1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    public MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo codecInfo, Format format, @Nullable MediaCrypto crypto, float codecOperatingRate) {
        DummySurface dummySurface = this.u1;
        if (dummySurface != null && dummySurface.secure != codecInfo.secure) {
            dummySurface.release();
            this.u1 = null;
        }
        String str = codecInfo.codecMimeType;
        CodecMaxValues codecMaxValues = getCodecMaxValues(codecInfo, format, getStreamFormats());
        this.q1 = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, codecOperatingRate, this.p1, this.P1 ? this.Q1 : 0);
        if (this.t1 == null) {
            if (!l0(codecInfo)) {
                throw new IllegalStateException();
            }
            if (this.u1 == null) {
                this.u1 = DummySurface.newInstanceV17(this.k1, codecInfo.secure);
            }
            this.t1 = this.u1;
        }
        return new MediaCodecAdapter.Configuration(codecInfo, mediaFormat, format, this.t1, crypto, 0);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat getMediaFormat(Format format, String codecMimeType, CodecMaxValues codecMaxValues, float codecOperatingRate, boolean deviceNeedsNoPostProcessWorkaround, int tunnelingAudioSessionId) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", codecMimeType);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, format.width);
        mediaFormat.setInteger("height", format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && (codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            MediaFormatUtil.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (codecOperatingRate != -1.0f) {
                mediaFormat.setFloat("operating-rate", codecOperatingRate);
            }
        }
        if (deviceNeedsNoPostProcessWorkaround) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (tunnelingAudioSessionId != 0) {
            T(mediaFormat, tunnelingAudioSessionId);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public String getName() {
        return T1;
    }

    public Surface getSurface() {
        return this.t1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public void handleInputBufferSupplementalData(DecoderInputBuffer buffer) throws ExoPlaybackException {
        if (this.s1) {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(buffer.supplementalData);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    j0(getCodec(), bArr);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int messageType, @Nullable Object message) throws ExoPlaybackException {
        if (messageType == 1) {
            setOutput(message);
            return;
        }
        if (messageType == 4) {
            this.w1 = ((Integer) message).intValue();
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.w1);
                return;
            }
            return;
        }
        if (messageType == 6) {
            this.S1 = (VideoFrameMetadataListener) message;
            return;
        }
        if (messageType != 102) {
            super.handleMessage(messageType, message);
            return;
        }
        int iIntValue = ((Integer) message).intValue();
        if (this.Q1 != iIntValue) {
            this.Q1 = iIntValue;
            if (this.P1) {
                releaseCodec();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        DummySurface dummySurface;
        if (super.isReady() && (this.x1 || (((dummySurface = this.u1) != null && this.t1 == dummySurface) || getCodec() == null || this.P1))) {
            this.B1 = C.TIME_UNSET;
            return true;
        }
        if (this.B1 == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.B1) {
            return true;
        }
        this.B1 = C.TIME_UNSET;
        return false;
    }

    public boolean maybeDropBuffersToKeyframe(long positionUs, boolean treatDroppedBuffersAsSkipped) throws ExoPlaybackException {
        int iSkipSource = skipSource(positionUs);
        if (iSkipSource == 0) {
            return false;
        }
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedToKeyframeCount++;
        int i = this.F1 + iSkipSource;
        if (treatDroppedBuffersAsSkipped) {
            decoderCounters.skippedOutputBufferCount += i;
        } else {
            updateDroppedBufferCounters(i);
        }
        flushOrReinitializeCodec();
        return true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onCodecError(Exception codecError) {
        Log.e(T1, "Video codec error", codecError);
        this.m1.videoCodecError(codecError);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String name, long initializedTimestampMs, long initializationDurationMs) {
        this.m1.decoderInitialized(name, initializedTimestampMs, initializationDurationMs);
        this.r1 = codecNeedsSetOutputSurfaceWorkaround(name);
        this.s1 = ((MediaCodecInfo) Assertions.checkNotNull(getCodecInfo())).isHdr10PlusOutOfBandMetadataSupported();
        if (Util.SDK_INT < 23 || !this.P1) {
            return;
        }
        this.R1 = new a((MediaCodecAdapter) Assertions.checkNotNull(getCodec()));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onCodecReleased(String name) {
        this.m1.decoderReleased(name);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        S();
        R();
        this.v1 = false;
        this.l1.onDisabled();
        this.R1 = null;
        try {
            super.onDisabled();
        } finally {
            this.m1.disabled(this.decoderCounters);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean joining, boolean mayRenderStartOfStream) throws ExoPlaybackException {
        super.onEnabled(joining, mayRenderStartOfStream);
        boolean z = getConfiguration().tunneling;
        Assertions.checkState((z && this.Q1 == 0) ? false : true);
        if (this.P1 != z) {
            this.P1 = z;
            releaseCodec();
        }
        this.m1.enabled(this.decoderCounters);
        this.l1.onEnabled();
        this.y1 = mayRenderStartOfStream;
        this.z1 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.m1.inputFormatChanged(formatHolder.format, decoderReuseEvaluationOnInputFormatChanged);
        return decoderReuseEvaluationOnInputFormatChanged;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) {
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.w1);
        }
        if (this.P1) {
            this.K1 = format.width;
            this.L1 = format.height;
        } else {
            Assertions.checkNotNull(mediaFormat);
            boolean z = mediaFormat.containsKey(V1) && mediaFormat.containsKey(U1) && mediaFormat.containsKey(W1) && mediaFormat.containsKey(X1);
            this.K1 = z ? (mediaFormat.getInteger(V1) - mediaFormat.getInteger(U1)) + 1 : mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
            this.L1 = z ? (mediaFormat.getInteger(W1) - mediaFormat.getInteger(X1)) + 1 : mediaFormat.getInteger("height");
        }
        float f = format.pixelWidthHeightRatio;
        this.N1 = f;
        if (Util.SDK_INT >= 21) {
            int i = format.rotationDegrees;
            if (i == 90 || i == 270) {
                int i2 = this.K1;
                this.K1 = this.L1;
                this.L1 = i2;
                this.N1 = 1.0f / f;
            }
        } else {
            this.M1 = format.rotationDegrees;
        }
        this.l1.onFormatChanged(format.frameRate);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long positionUs, boolean joining) throws ExoPlaybackException {
        super.onPositionReset(positionUs, joining);
        R();
        this.l1.onPositionReset();
        this.G1 = C.TIME_UNSET;
        this.A1 = C.TIME_UNSET;
        this.E1 = 0;
        if (joining) {
            k0();
        } else {
            this.B1 = C.TIME_UNSET;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void onProcessedOutputBuffer(long presentationTimeUs) {
        super.onProcessedOutputBuffer(presentationTimeUs);
        if (this.P1) {
            return;
        }
        this.F1--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        R();
    }

    public void onProcessedTunneledBuffer(long presentationTimeUs) throws ExoPlaybackException {
        updateOutputFormatForTime(presentationTimeUs);
        e0();
        this.decoderCounters.renderedOutputBufferCount++;
        c0();
        onProcessedOutputBuffer(presentationTimeUs);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void onQueueInputBuffer(DecoderInputBuffer buffer) throws ExoPlaybackException {
        boolean z = this.P1;
        if (!z) {
            this.F1++;
        }
        if (Util.SDK_INT >= 23 || !z) {
            return;
        }
        onProcessedTunneledBuffer(buffer.timeUs);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    @TargetApi(17)
    public void onReset() {
        DummySurface dummySurface;
        try {
            super.onReset();
            dummySurface = this.u1;
            if (dummySurface != null) {
                if (this.t1 == dummySurface) {
                    this.t1 = null;
                }
            }
        } finally {
            if (this.u1 != null) {
                Surface surface = this.t1;
                dummySurface = this.u1;
                if (surface == dummySurface) {
                    this.t1 = null;
                }
                dummySurface.release();
                this.u1 = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.D1 = 0;
        this.C1 = SystemClock.elapsedRealtime();
        this.H1 = SystemClock.elapsedRealtime() * 1000;
        this.I1 = 0L;
        this.J1 = 0;
        this.l1.onStarted();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
        this.B1 = C.TIME_UNSET;
        b0();
        d0();
        this.l1.onStopped();
        super.onStopped();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long positionUs, long elapsedRealtimeUs, @Nullable MediaCodecAdapter codec, @Nullable ByteBuffer buffer, int bufferIndex, int bufferFlags, int sampleCount, long bufferPresentationTimeUs, boolean isDecodeOnlyBuffer, boolean isLastBuffer, Format format) throws ExoPlaybackException {
        Assertions.checkNotNull(codec);
        if (this.A1 == C.TIME_UNSET) {
            this.A1 = positionUs;
        }
        if (bufferPresentationTimeUs != this.G1) {
            this.l1.onNextFrame(bufferPresentationTimeUs);
            this.G1 = bufferPresentationTimeUs;
        }
        long outputStreamOffsetUs = getOutputStreamOffsetUs();
        long j = bufferPresentationTimeUs - outputStreamOffsetUs;
        if (isDecodeOnlyBuffer && !isLastBuffer) {
            skipOutputBuffer(codec, bufferIndex, j);
            return true;
        }
        double playbackSpeed = getPlaybackSpeed();
        boolean z = getState() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j2 = (long) ((bufferPresentationTimeUs - positionUs) / playbackSpeed);
        if (z) {
            j2 -= jElapsedRealtime - elapsedRealtimeUs;
        }
        if (this.t1 == this.u1) {
            if (!Z(j2)) {
                return false;
            }
            skipOutputBuffer(codec, bufferIndex, j);
            updateVideoFrameProcessingOffsetCounters(j2);
            return true;
        }
        if (this.B1 == C.TIME_UNSET && positionUs >= outputStreamOffsetUs && ((this.z1 ? !this.x1 : !(!z && !this.y1)) || (z && shouldForceRenderOutputBuffer(j2, jElapsedRealtime - this.H1)))) {
            long jNanoTime = System.nanoTime();
            h0(j, jNanoTime, format);
            if (Util.SDK_INT >= 21) {
                renderOutputBufferV21(codec, bufferIndex, j, jNanoTime);
            } else {
                renderOutputBuffer(codec, bufferIndex, j);
            }
            updateVideoFrameProcessingOffsetCounters(j2);
            return true;
        }
        if (z && positionUs != this.A1) {
            long jNanoTime2 = System.nanoTime();
            long jAdjustReleaseTime = this.l1.adjustReleaseTime((j2 * 1000) + jNanoTime2);
            long j3 = (jAdjustReleaseTime - jNanoTime2) / 1000;
            boolean z2 = this.B1 != C.TIME_UNSET;
            if (shouldDropBuffersToKeyframe(j3, elapsedRealtimeUs, isLastBuffer) && maybeDropBuffersToKeyframe(positionUs, z2)) {
                return false;
            }
            if (shouldDropOutputBuffer(j3, elapsedRealtimeUs, isLastBuffer)) {
                if (z2) {
                    skipOutputBuffer(codec, bufferIndex, j);
                } else {
                    dropOutputBuffer(codec, bufferIndex, j);
                }
                updateVideoFrameProcessingOffsetCounters(j3);
                return true;
            }
            if (Util.SDK_INT >= 21) {
                if (j3 < 50000) {
                    h0(j, jAdjustReleaseTime, format);
                    renderOutputBufferV21(codec, bufferIndex, j, jAdjustReleaseTime);
                    updateVideoFrameProcessingOffsetCounters(j3);
                    return true;
                }
            } else if (j3 < 30000) {
                if (j3 > 11000) {
                    try {
                        Thread.sleep((j3 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                h0(j, jAdjustReleaseTime, format);
                renderOutputBuffer(codec, bufferIndex, j);
                updateVideoFrameProcessingOffsetCounters(j3);
                return true;
            }
        }
        return false;
    }

    public void renderOutputBuffer(MediaCodecAdapter codec, int index, long presentationTimeUs) {
        e0();
        TraceUtil.beginSection("releaseOutputBuffer");
        codec.releaseOutputBuffer(index, true);
        TraceUtil.endSection();
        this.H1 = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.E1 = 0;
        c0();
    }

    @RequiresApi(21)
    public void renderOutputBufferV21(MediaCodecAdapter codec, int index, long presentationTimeUs, long releaseTimeNs) {
        e0();
        TraceUtil.beginSection("releaseOutputBuffer");
        codec.releaseOutputBuffer(index, releaseTimeNs);
        TraceUtil.endSection();
        this.H1 = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.E1 = 0;
        c0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.F1 = 0;
    }

    @RequiresApi(23)
    public void setOutputSurfaceV23(MediaCodecAdapter codec, Surface surface) {
        codec.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public void setPlaybackSpeed(float currentPlaybackSpeed, float targetPlaybackSpeed) throws ExoPlaybackException {
        super.setPlaybackSpeed(currentPlaybackSpeed, targetPlaybackSpeed);
        this.l1.onPlaybackSpeed(currentPlaybackSpeed);
    }

    public boolean shouldDropBuffersToKeyframe(long earlyUs, long elapsedRealtimeUs, boolean isLastBuffer) {
        return a0(earlyUs) && !isLastBuffer;
    }

    public boolean shouldDropOutputBuffer(long earlyUs, long elapsedRealtimeUs, boolean isLastBuffer) {
        return Z(earlyUs) && !isLastBuffer;
    }

    public boolean shouldForceRenderOutputBuffer(long earlyUs, long elapsedSinceLastRenderUs) {
        return Z(earlyUs) && elapsedSinceLastRenderUs > com.google.android.exoplayer2.extractor.mp3.b.e;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean shouldInitCodec(MediaCodecInfo codecInfo) {
        return this.t1 != null || l0(codecInfo);
    }

    public void skipOutputBuffer(MediaCodecAdapter codec, int index, long presentationTimeUs) {
        TraceUtil.beginSection("skipVideoBuffer");
        codec.releaseOutputBuffer(index, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i = 0;
        if (!MimeTypes.isVideo(format.sampleMimeType)) {
            return q0.a(0);
        }
        boolean z = format.drmInitData != null;
        List<MediaCodecInfo> listY = Y(mediaCodecSelector, format, z, false);
        if (z && listY.isEmpty()) {
            listY = Y(mediaCodecSelector, format, false, false);
        }
        if (listY.isEmpty()) {
            return q0.a(1);
        }
        if (!MediaCodecRenderer.supportsFormatDrm(format)) {
            return q0.a(2);
        }
        MediaCodecInfo mediaCodecInfo = listY.get(0);
        boolean zIsFormatSupported = mediaCodecInfo.isFormatSupported(format);
        int i2 = mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 16 : 8;
        if (zIsFormatSupported) {
            List<MediaCodecInfo> listY2 = Y(mediaCodecSelector, format, z, true);
            if (!listY2.isEmpty()) {
                MediaCodecInfo mediaCodecInfo2 = listY2.get(0);
                if (mediaCodecInfo2.isFormatSupported(format) && mediaCodecInfo2.isSeamlessAdaptationSupported(format)) {
                    i = 32;
                }
            }
        }
        return q0.b(zIsFormatSupported ? 4 : 3, i2, i);
    }

    public void updateDroppedBufferCounters(int droppedBufferCount) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedBufferCount += droppedBufferCount;
        this.D1 += droppedBufferCount;
        int i = this.E1 + droppedBufferCount;
        this.E1 = i;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i2 = this.o1;
        if (i2 <= 0 || this.D1 < i2) {
            return;
        }
        b0();
    }

    public void updateVideoFrameProcessingOffsetCounters(long processingOffsetUs) {
        this.decoderCounters.addVideoFrameProcessingOffset(processingOffsetUs);
        this.I1 += processingOffsetUs;
        this.J1++;
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long allowedJoiningTimeMs) {
        this(context, mediaCodecSelector, allowedJoiningTimeMs, null, null, 0);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long allowedJoiningTimeMs, @Nullable Handler eventHandler, @Nullable VideoRendererEventListener eventListener, int maxDroppedFramesToNotify) {
        this(context, MediaCodecAdapter.Factory.DEFAULT, mediaCodecSelector, allowedJoiningTimeMs, false, eventHandler, eventListener, maxDroppedFramesToNotify);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long allowedJoiningTimeMs, boolean enableDecoderFallback, @Nullable Handler eventHandler, @Nullable VideoRendererEventListener eventListener, int maxDroppedFramesToNotify) {
        this(context, MediaCodecAdapter.Factory.DEFAULT, mediaCodecSelector, allowedJoiningTimeMs, enableDecoderFallback, eventHandler, eventListener, maxDroppedFramesToNotify);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory codecAdapterFactory, MediaCodecSelector mediaCodecSelector, long allowedJoiningTimeMs, boolean enableDecoderFallback, @Nullable Handler eventHandler, @Nullable VideoRendererEventListener eventListener, int maxDroppedFramesToNotify) {
        super(2, codecAdapterFactory, mediaCodecSelector, enableDecoderFallback, 30.0f);
        this.n1 = allowedJoiningTimeMs;
        this.o1 = maxDroppedFramesToNotify;
        Context applicationContext = context.getApplicationContext();
        this.k1 = applicationContext;
        this.l1 = new VideoFrameReleaseHelper(applicationContext);
        this.m1 = new VideoRendererEventListener.EventDispatcher(eventHandler, eventListener);
        this.p1 = U();
        this.B1 = C.TIME_UNSET;
        this.K1 = -1;
        this.L1 = -1;
        this.N1 = -1.0f;
        this.w1 = 1;
        this.Q1 = 0;
        S();
    }
}
