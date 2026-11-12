package io.sentry.android.replay.video;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.xiaomi.fitness.statistics.StatConstants;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0013H\u0002J\u000e\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020\bJ\u0006\u0010/\u001a\u00020\bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lio/sentry/android/replay/video/SimpleVideoEncoder;", "", "options", "Lio/sentry/SentryOptions;", "muxerConfig", "Lio/sentry/android/replay/video/MuxerConfig;", "onClose", "Lkotlin/Function0;", "", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/video/MuxerConfig;Lkotlin/jvm/functions/Function0;)V", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "duration", "", "getDuration", "()J", "frameMuxer", "Lio/sentry/android/replay/video/SimpleMp4FrameMuxer;", "hasExynosCodec", "", "getHasExynosCodec", "()Z", "hasExynosCodec$delegate", "Lkotlin/Lazy;", "mediaCodec", "Landroid/media/MediaCodec;", "getMediaCodec$sentry_android_replay_release", "()Landroid/media/MediaCodec;", "mediaFormat", "Landroid/media/MediaFormat;", "getMediaFormat", "()Landroid/media/MediaFormat;", "mediaFormat$delegate", "getMuxerConfig", "()Lio/sentry/android/replay/video/MuxerConfig;", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "getOptions", "()Lio/sentry/SentryOptions;", "surface", "Landroid/view/Surface;", "drainCodec", "endOfStream", "encode", "image", "Landroid/graphics/Bitmap;", "release", StatConstants.PARAM_START, "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@TargetApi(26)
public final class SimpleVideoEncoder {

    @NotNull
    private final MediaCodec.BufferInfo bufferInfo;

    @NotNull
    private final SimpleMp4FrameMuxer frameMuxer;

    /* JADX INFO: renamed from: hasExynosCodec$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hasExynosCodec;

    @NotNull
    private final MediaCodec mediaCodec;

    /* JADX INFO: renamed from: mediaFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mediaFormat;

    @NotNull
    private final MuxerConfig muxerConfig;

    @Nullable
    private final Function0<Unit> onClose;

    @NotNull
    private final SentryOptions options;

    @Nullable
    private Surface surface;

    public SimpleVideoEncoder(@NotNull SentryOptions options, @NotNull MuxerConfig muxerConfig, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.options = options;
        this.muxerConfig = muxerConfig;
        this.onClose = function0;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.hasExynosCodec = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Boolean>() { // from class: io.sentry.android.replay.video.SimpleVideoEncoder$hasExynosCodec$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                boolean z = false;
                MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                Intrinsics.checkNotNullExpressionValue(codecInfos, "MediaCodecList(MediaCode…)\n            .codecInfos");
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    String name = mediaCodecInfo.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "c2.exynos", false, 2, (Object) null)) {
                        z = true;
                        break;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        MediaCodec mediaCodecCreateByCodecName = getHasExynosCodec() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.getMimeType());
        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateByCodecName, "if (hasExynosCodec) {\n  …onfig.mimeType)\n        }");
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.mediaFormat = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MediaFormat>() { // from class: io.sentry.android.replay.video.SimpleVideoEncoder$mediaFormat$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MediaFormat invoke() {
                int bitRate = this.this$0.getMuxerConfig().getBitRate();
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = this.this$0.getMediaCodec().getCodecInfo().getCapabilitiesForType(this.this$0.getMuxerConfig().getMimeType()).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(bitRate))) {
                        this.this$0.getOptions().getLogger().c(SentryLevel.DEBUG, "Encoder doesn't support the provided bitRate: " + bitRate + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(bitRate));
                        Intrinsics.checkNotNullExpressionValue(objClamp, "videoCapabilities.bitrateRange.clamp(bitRate)");
                        bitRate = ((Number) objClamp).intValue();
                    }
                } catch (Throwable th) {
                    this.this$0.getOptions().getLogger().a(SentryLevel.DEBUG, "Could not retrieve MediaCodec info", th);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.this$0.getMuxerConfig().getMimeType(), this.this$0.getMuxerConfig().getRecordingWidth(), this.this$0.getMuxerConfig().getRecordingHeight());
                Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(\n     …recordingHeight\n        )");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", bitRate);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", this.this$0.getMuxerConfig().getFrameRate());
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            }
        });
        this.bufferInfo = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.getFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "muxerConfig.file.absolutePath");
        this.frameMuxer = new SimpleMp4FrameMuxer(absolutePath, muxerConfig.getFrameRate());
    }

    private final void drainCodec(boolean endOfStream) {
        ByteBuffer byteBuffer;
        ILogger logger = this.options.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.c(sentryLevel, "[Encoder]: drainCodec(" + endOfStream + ')', new Object[0]);
        if (endOfStream) {
            this.options.getLogger().c(sentryLevel, "[Encoder]: sending EOS to encoder", new Object[0]);
            this.mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.mediaCodec.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(this.bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!endOfStream) {
                    return;
                } else {
                    this.options.getLogger().c(SentryLevel.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.mediaCodec.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.frameMuxer.getStarted()) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                Intrinsics.checkNotNullExpressionValue(outputFormat, "mediaCodec.outputFormat");
                this.options.getLogger().c(SentryLevel.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                this.frameMuxer.start(outputFormat);
            } else if (iDequeueOutputBuffer < 0) {
                this.options.getLogger().c(SentryLevel.DEBUG, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, new Object[0]);
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((this.bufferInfo.flags & 2) != 0) {
                    this.options.getLogger().c(SentryLevel.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                    this.bufferInfo.size = 0;
                }
                if (this.bufferInfo.size != 0) {
                    if (!this.frameMuxer.getStarted()) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    this.frameMuxer.muxVideoFrame(byteBuffer, this.bufferInfo);
                    this.options.getLogger().c(SentryLevel.DEBUG, "[Encoder]: sent " + this.bufferInfo.size + " bytes to muxer", new Object[0]);
                }
                this.mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.bufferInfo.flags & 4) != 0) {
                    if (endOfStream) {
                        this.options.getLogger().c(SentryLevel.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                        return;
                    } else {
                        this.options.getLogger().c(SentryLevel.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                        return;
                    }
                }
            }
        }
    }

    private final boolean getHasExynosCodec() {
        return ((Boolean) this.hasExynosCodec.getValue()).booleanValue();
    }

    private final MediaFormat getMediaFormat() {
        return (MediaFormat) this.mediaFormat.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final void encode(@NotNull Bitmap image) {
        Canvas canvasLockHardwareCanvas;
        Intrinsics.checkNotNullParameter(image, "image");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (StringsKt__StringsKt.contains((CharSequence) MANUFACTURER, (CharSequence) "xiaomi", true)) {
            Surface surface = this.surface;
            if (surface != null) {
                canvasLockHardwareCanvas = surface.lockCanvas(null);
            } else {
                canvasLockHardwareCanvas = null;
            }
        } else {
            Surface surface2 = this.surface;
            if (surface2 != null) {
                canvasLockHardwareCanvas = surface2.lockHardwareCanvas();
            } else {
                canvasLockHardwareCanvas = null;
            }
        }
        if (canvasLockHardwareCanvas != null) {
            canvasLockHardwareCanvas.drawBitmap(image, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = this.surface;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        drainCodec(false);
    }

    public final long getDuration() {
        return this.frameMuxer.getVideoTime();
    }

    @NotNull
    /* JADX INFO: renamed from: getMediaCodec$sentry_android_replay_release, reason: from getter */
    public final MediaCodec getMediaCodec() {
        return this.mediaCodec;
    }

    @NotNull
    public final MuxerConfig getMuxerConfig() {
        return this.muxerConfig;
    }

    @Nullable
    public final Function0<Unit> getOnClose() {
        return this.onClose;
    }

    @NotNull
    public final SentryOptions getOptions() {
        return this.options;
    }

    public final void release() {
        try {
            Function0<Unit> function0 = this.onClose;
            if (function0 != null) {
                function0.invoke();
            }
            drainCodec(true);
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.frameMuxer.release();
        } catch (Throwable th) {
            this.options.getLogger().a(SentryLevel.DEBUG, "Failed to properly release video encoder", th);
        }
    }

    public final void start() {
        this.mediaCodec.configure(getMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
        this.surface = this.mediaCodec.createInputSurface();
        this.mediaCodec.start();
        drainCodec(false);
    }

    public /* synthetic */ SimpleVideoEncoder(SentryOptions sentryOptions, MuxerConfig muxerConfig, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, muxerConfig, (i & 4) != 0 ? null : function0);
    }
}
