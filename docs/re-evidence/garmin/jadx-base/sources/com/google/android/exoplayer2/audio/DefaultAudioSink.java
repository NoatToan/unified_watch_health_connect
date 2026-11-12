package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.InlineMeValidationDisabled;
import j20.x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import ka.l;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class DefaultAudioSink implements AudioSink {
    private static final int AUDIO_TRACK_RETRY_DURATION_MS = 100;
    private static final int AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE = 1000000;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_DISABLED = 3;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp = false;
    private AudioProcessor[] activeAudioProcessors;
    private MediaPositionParameters afterDrainParameters;
    private AudioAttributes audioAttributes;
    private final AudioCapabilities audioCapabilities;
    private final AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    private AudioTrack audioTrack;
    private final AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private PlaybackParameters audioTrackPlaybackParameters;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private AuxEffectInfo auxEffectInfo;
    private ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private Configuration configuration;
    private int drainingAudioProcessorIndex;
    private final boolean enableAudioTrackPlaybackParams;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private final PendingExceptionHolder<AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    private AudioSink.Listener listener;
    private MediaPositionParameters mediaPositionParameters;
    private final ArrayDeque<MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private final int offloadMode;
    private StreamEventCallbackV29 offloadStreamEventCallbackV29;
    private ByteBuffer outputBuffer;
    private ByteBuffer[] outputBuffers;
    private Configuration pendingConfiguration;
    private PlayerId playerId;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;
    private final ConditionVariable releasingConditionVariable;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final AudioProcessor[] toFloatPcmAvailableAudioProcessors;
    private final AudioProcessor[] toIntPcmAvailableAudioProcessors;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final PendingExceptionHolder<AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    public static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdOnAudioTrack(AudioTrack audioTrack, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId);
        }
    }

    public interface AudioProcessorChain {
        PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

        boolean applySkipSilenceEnabled(boolean z14);

        AudioProcessor[] getAudioProcessors();

        long getMediaDuration(long j8);

        long getSkippedOutputFrameCount();
    }

    public interface AudioTrackBufferSizeProvider {
        public static final AudioTrackBufferSizeProvider DEFAULT = new DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i14, int i15, int i16, int i17, int i18, double d14);
    }

    public static final class Builder {
        private AudioProcessorChain audioProcessorChain;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;
        private AudioCapabilities audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        private int offloadMode = 0;
        AudioTrackBufferSizeProvider audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;

        public DefaultAudioSink build() {
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new DefaultAudioProcessorChain(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this);
        }

        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            Assertions.checkNotNull(audioCapabilities);
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        public Builder setAudioProcessorChain(AudioProcessorChain audioProcessorChain) {
            Assertions.checkNotNull(audioProcessorChain);
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        public Builder setAudioProcessors(AudioProcessor[] audioProcessorArr) {
            Assertions.checkNotNull(audioProcessorArr);
            return setAudioProcessorChain(new DefaultAudioProcessorChain(audioProcessorArr));
        }

        public Builder setAudioTrackBufferSizeProvider(AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        public Builder setEnableAudioTrackPlaybackParams(boolean z14) {
            this.enableAudioTrackPlaybackParams = z14;
            return this;
        }

        public Builder setEnableFloatOutput(boolean z14) {
            this.enableFloatOutput = z14;
            return this;
        }

        public Builder setOffloadMode(int i14) {
            this.offloadMode = i14;
            return this;
        }
    }

    public static final class Configuration {
        public final AudioProcessor[] availableAudioProcessors;
        public final int bufferSize;
        public final Format inputFormat;
        public final int inputPcmFrameSize;
        public final int outputChannelConfig;
        public final int outputEncoding;
        public final int outputMode;
        public final int outputPcmFrameSize;
        public final int outputSampleRate;

        public Configuration(Format format, int i14, int i15, int i16, int i17, int i18, int i19, int i24, AudioProcessor[] audioProcessorArr) {
            this.inputFormat = format;
            this.inputPcmFrameSize = i14;
            this.outputMode = i15;
            this.outputPcmFrameSize = i16;
            this.outputSampleRate = i17;
            this.outputChannelConfig = i18;
            this.outputEncoding = i19;
            this.bufferSize = i24;
            this.availableAudioProcessors = audioProcessorArr;
        }

        private AudioTrack createAudioTrack(boolean z14, AudioAttributes audioAttributes, int i14) {
            int i15 = Util.SDK_INT;
            if (i15 >= 29) {
                return createAudioTrackV29(z14, audioAttributes, i14);
            }
            return i15 >= 21 ? createAudioTrackV21(z14, audioAttributes, i14) : createAudioTrackV9(audioAttributes, i14);
        }

        private AudioTrack createAudioTrackV21(boolean z14, AudioAttributes audioAttributes, int i14) {
            return new AudioTrack(getAudioTrackAttributesV21(audioAttributes, z14), DefaultAudioSink.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding), this.bufferSize, 1, i14);
        }

        private AudioTrack createAudioTrackV29(boolean z14, AudioAttributes audioAttributes, int i14) {
            return new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributesV21(audioAttributes, z14)).setAudioFormat(DefaultAudioSink.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding)).setTransferMode(1).setBufferSizeInBytes(this.bufferSize).setSessionId(i14).setOffloadedPlayback(this.outputMode == 1).build();
        }

        private AudioTrack createAudioTrackV9(AudioAttributes audioAttributes, int i14) {
            int streamTypeForAudioUsage = Util.getStreamTypeForAudioUsage(audioAttributes.usage);
            return i14 == 0 ? new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1) : new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1, i14);
        }

        private static android.media.AudioAttributes getAudioTrackAttributesV21(AudioAttributes audioAttributes, boolean z14) {
            return z14 ? getAudioTrackTunnelingAttributesV21() : audioAttributes.getAudioAttributesV21();
        }

        private static android.media.AudioAttributes getAudioTrackTunnelingAttributesV21() {
            return new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack buildAudioTrack(boolean z14, AudioAttributes audioAttributes, int i14) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackCreateAudioTrack = createAudioTrack(z14, audioAttributes, i14);
                int state = audioTrackCreateAudioTrack.getState();
                if (state == 1) {
                    return audioTrackCreateAudioTrack;
                }
                try {
                    audioTrackCreateAudioTrack.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e4) {
                throw new AudioSink.InitializationException(0, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), e4);
            }
        }

        public boolean canReuseAudioTrack(Configuration configuration) {
            return configuration.outputMode == this.outputMode && configuration.outputEncoding == this.outputEncoding && configuration.outputSampleRate == this.outputSampleRate && configuration.outputChannelConfig == this.outputChannelConfig && configuration.outputPcmFrameSize == this.outputPcmFrameSize;
        }

        public Configuration copyWithBufferSize(int i14) {
            return new Configuration(this.inputFormat, this.inputPcmFrameSize, this.outputMode, this.outputPcmFrameSize, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, i14, this.availableAudioProcessors);
        }

        public long framesToDurationUs(long j8) {
            return (j8 * 1000000) / ((long) this.outputSampleRate);
        }

        public long inputFramesToDurationUs(long j8) {
            return (j8 * 1000000) / ((long) this.inputFormat.sampleRate);
        }

        public boolean outputModeIsOffload() {
            return this.outputMode == 1;
        }
    }

    public static final class MediaPositionParameters {
        public final long audioTrackPositionUs;
        public final long mediaTimeUs;
        public final PlaybackParameters playbackParameters;
        public final boolean skipSilence;

        private MediaPositionParameters(PlaybackParameters playbackParameters, boolean z14, long j8, long j14) {
            this.playbackParameters = playbackParameters;
            this.skipSilence = z14;
            this.mediaTimeUs = j8;
            this.audioTrackPositionUs = j14;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    public static final class PendingExceptionHolder<T extends Exception> {
        private T pendingException;
        private long throwDeadlineMs;
        private final long throwDelayMs;

        public PendingExceptionHolder(long j8) {
            this.throwDelayMs = j8;
        }

        public void clear() {
            this.pendingException = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t7) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t7;
                this.throwDeadlineMs = this.throwDelayMs + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.throwDeadlineMs) {
                T t14 = this.pendingException;
                if (t14 != t7) {
                    t14.addSuppressed(t7);
                }
                T t15 = this.pendingException;
                clear();
                throw t15;
            }
        }
    }

    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j8) {
            StringBuilder sb3 = new StringBuilder(61);
            sb3.append("Ignoring impossibly large audio latency: ");
            sb3.append(j8);
            Log.w(DefaultAudioSink.TAG, sb3.toString());
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long j8) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onPositionAdvancing(j8);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j8, long j14, long j15, long j16) {
            long submittedFrames = DefaultAudioSink.this.getSubmittedFrames();
            long writtenFrames = DefaultAudioSink.this.getWrittenFrames();
            StringBuilder sb3 = new StringBuilder(182);
            sb3.append("Spurious audio timestamp (frame position mismatch): ");
            sb3.append(j8);
            sb3.append(", ");
            sb3.append(j14);
            x.j(j15, ", ", ", ", sb3);
            sb3.append(j16);
            x.j(submittedFrames, ", ", ", ", sb3);
            sb3.append(writtenFrames);
            String string = sb3.toString();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(string);
            }
            Log.w(DefaultAudioSink.TAG, string);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j8, long j14, long j15, long j16) {
            long submittedFrames = DefaultAudioSink.this.getSubmittedFrames();
            long writtenFrames = DefaultAudioSink.this.getWrittenFrames();
            StringBuilder sb3 = new StringBuilder(180);
            sb3.append("Spurious audio timestamp (system clock mismatch): ");
            sb3.append(j8);
            sb3.append(", ");
            sb3.append(j14);
            x.j(j15, ", ", ", ", sb3);
            sb3.append(j16);
            x.j(submittedFrames, ", ", ", ", sb3);
            sb3.append(writtenFrames);
            String string = sb3.toString();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(string);
            }
            Log.w(DefaultAudioSink.TAG, string);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int i14, long j8) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onUnderrun(i14, j8, SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    public final class StreamEventCallbackV29 {
        private final AudioTrack$StreamEventCallback callback;
        private final Handler handler = new Handler();

        public StreamEventCallbackV29() {
            this.callback = new AudioTrack$StreamEventCallback() { // from class: com.google.android.exoplayer2.audio.DefaultAudioSink.StreamEventCallbackV29.1
                public void onDataRequest(AudioTrack audioTrack, int i14) {
                    Assertions.checkState(audioTrack == DefaultAudioSink.this.audioTrack);
                    if (DefaultAudioSink.this.listener == null || !DefaultAudioSink.this.playing) {
                        return;
                    }
                    DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                }

                public void onTearDown(AudioTrack audioTrack) {
                    Assertions.checkState(audioTrack == DefaultAudioSink.this.audioTrack);
                    if (DefaultAudioSink.this.listener == null || !DefaultAudioSink.this.playing) {
                        return;
                    }
                    DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                }
            };
        }

        public void register(AudioTrack audioTrack) {
            Handler handler = this.handler;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new l(handler, 0), this.callback);
        }

        public void unregister(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    private DefaultAudioSink(Builder builder) {
        this.audioCapabilities = builder.audioCapabilities;
        AudioProcessorChain audioProcessorChain = builder.audioProcessorChain;
        this.audioProcessorChain = audioProcessorChain;
        int i14 = Util.SDK_INT;
        this.enableFloatOutput = i14 >= 21 && builder.enableFloatOutput;
        this.enableAudioTrackPlaybackParams = i14 >= 23 && builder.enableAudioTrackPlaybackParams;
        this.offloadMode = i14 >= 29 ? builder.offloadMode : 0;
        this.audioTrackBufferSizeProvider = builder.audioTrackBufferSizeProvider;
        this.releasingConditionVariable = new ConditionVariable(true);
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener());
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ResamplingAudioProcessor(), channelMappingAudioProcessor, trimmingAudioProcessor);
        Collections.addAll(arrayList, audioProcessorChain.getAudioProcessors());
        this.toIntPcmAvailableAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.toFloatPcmAvailableAudioProcessors = new AudioProcessor[]{new FloatResamplingAudioProcessor()};
        this.volume = 1.0f;
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioSessionId = 0;
        this.auxEffectInfo = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new MediaPositionParameters(playbackParameters, false, 0L, 0L);
        this.audioTrackPlaybackParameters = playbackParameters;
        this.drainingAudioProcessorIndex = -1;
        this.activeAudioProcessors = new AudioProcessor[0];
        this.outputBuffers = new ByteBuffer[0];
        this.mediaPositionParametersCheckpoints = new ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new PendingExceptionHolder<>(100L);
        this.writeExceptionPendingExceptionHolder = new PendingExceptionHolder<>(100L);
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j8) {
        PlaybackParameters playbackParametersApplyPlaybackParameters = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applyPlaybackParameters(getAudioProcessorPlaybackParameters()) : PlaybackParameters.DEFAULT;
        boolean zApplySkipSilenceEnabled = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applySkipSilenceEnabled(getSkipSilenceEnabled()) : false;
        this.mediaPositionParametersCheckpoints.add(new MediaPositionParameters(playbackParametersApplyPlaybackParameters, zApplySkipSilenceEnabled, Math.max(0L, j8), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(zApplySkipSilenceEnabled);
        }
    }

    private long applyMediaPositionParameters(long j8) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j8 >= this.mediaPositionParametersCheckpoints.getFirst().audioTrackPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        MediaPositionParameters mediaPositionParameters = this.mediaPositionParameters;
        long j14 = j8 - mediaPositionParameters.audioTrackPositionUs;
        if (mediaPositionParameters.playbackParameters.equals(PlaybackParameters.DEFAULT)) {
            return this.mediaPositionParameters.mediaTimeUs + j14;
        }
        if (this.mediaPositionParametersCheckpoints.isEmpty()) {
            return this.mediaPositionParameters.mediaTimeUs + this.audioProcessorChain.getMediaDuration(j14);
        }
        MediaPositionParameters first = this.mediaPositionParametersCheckpoints.getFirst();
        return first.mediaTimeUs - Util.getMediaDurationForPlayoutDuration(first.audioTrackPositionUs - j8, this.mediaPositionParameters.playbackParameters.speed);
    }

    private long applySkipping(long j8) {
        return j8 + this.configuration.framesToDurationUs(this.audioProcessorChain.getSkippedOutputFrameCount());
    }

    private AudioTrack buildAudioTrack(Configuration configuration) throws AudioSink.InitializationException {
        try {
            return configuration.buildAudioTrack(this.tunneling, this.audioAttributes, this.audioSessionId);
        } catch (AudioSink.InitializationException e4) {
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSinkError(e4);
            }
            throw e4;
        }
    }

    private AudioTrack buildAudioTrackWithRetry() throws AudioSink.InitializationException {
        try {
            return buildAudioTrack((Configuration) Assertions.checkNotNull(this.configuration));
        } catch (AudioSink.InitializationException e4) {
            Configuration configuration = this.configuration;
            if (configuration.bufferSize > 1000000) {
                Configuration configurationCopyWithBufferSize = configuration.copyWithBufferSize(1000000);
                try {
                    AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(configurationCopyWithBufferSize);
                    this.configuration = configurationCopyWithBufferSize;
                    return audioTrackBuildAudioTrack;
                } catch (AudioSink.InitializationException e14) {
                    e4.addSuppressed(e14);
                    maybeDisableOffload();
                    throw e4;
                }
            }
            maybeDisableOffload();
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private boolean drainToEndOfStream() {
        /*
            r9 = this;
            int r0 = r9.drainingAudioProcessorIndex
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.drainingAudioProcessorIndex = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.drainingAudioProcessorIndex
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.activeAudioProcessors
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.queueEndOfStream()
        L1f:
            r9.processBuffers(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.drainingAudioProcessorIndex
            int r0 = r0 + r1
            r9.drainingAudioProcessorIndex = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L3b
            r9.writeBuffer(r0, r7)
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.drainingAudioProcessorIndex = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.drainToEndOfStream():boolean");
    }

    private void flushAudioProcessors() {
        int i14 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.activeAudioProcessors;
            if (i14 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i14];
            audioProcessor.flush();
            this.outputBuffers[i14] = audioProcessor.getOutput();
            i14++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat getAudioFormat(int i14, int i15, int i16) {
        return new AudioFormat.Builder().setSampleRate(i14).setChannelMask(i15).setEncoding(i16).build();
    }

    private PlaybackParameters getAudioProcessorPlaybackParameters() {
        return getMediaPositionParameters().playbackParameters;
    }

    private static int getAudioTrackMinBufferSize(int i14, int i15, int i16) {
        int minBufferSize = AudioTrack.getMinBufferSize(i14, i15, i16);
        Assertions.checkState(minBufferSize != -2);
        return minBufferSize;
    }

    private static int getChannelConfigForPassthrough(int i14) {
        int i15 = Util.SDK_INT;
        if (i15 <= 28) {
            if (i14 == 7) {
                i14 = 8;
            } else if (i14 == 3 || i14 == 4 || i14 == 5) {
                i14 = 6;
            }
        }
        if (i15 <= 26 && "fugu".equals(Util.DEVICE) && i14 == 1) {
            i14 = 2;
        }
        return Util.getAudioTrackChannelConfig(i14);
    }

    private static Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format, AudioCapabilities audioCapabilities) {
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        int maxSupportedChannelCountForPassthroughV29 = 6;
        if (encoding != 5 && encoding != 6 && encoding != 18 && encoding != 17 && encoding != 7 && encoding != 8 && encoding != 14) {
            return null;
        }
        if (encoding == 18 && !audioCapabilities.supportsEncoding(18)) {
            encoding = 6;
        } else if (encoding == 8 && !audioCapabilities.supportsEncoding(8)) {
            encoding = 7;
        }
        if (!audioCapabilities.supportsEncoding(encoding)) {
            return null;
        }
        if (encoding != 18) {
            maxSupportedChannelCountForPassthroughV29 = format.channelCount;
            if (maxSupportedChannelCountForPassthroughV29 > audioCapabilities.getMaxChannelCount()) {
                return null;
            }
        } else if (Util.SDK_INT >= 29) {
            int i14 = format.sampleRate;
            if (i14 == -1) {
                i14 = OpusUtil.SAMPLE_RATE;
            }
            maxSupportedChannelCountForPassthroughV29 = getMaxSupportedChannelCountForPassthroughV29(18, i14);
            if (maxSupportedChannelCountForPassthroughV29 == 0) {
                Log.w(TAG, "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(maxSupportedChannelCountForPassthroughV29);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
    }

    private static int getFramesPerEncodedSample(int i14, ByteBuffer byteBuffer) {
        switch (i14) {
            case 5:
            case 6:
            case 18:
                return Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
            case 7:
            case 8:
                return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
            case 9:
                int mpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                if (mpegAudioFrameSampleCount != -1) {
                    return mpegAudioFrameSampleCount;
                }
                h.w();
                return 0;
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                h.z(v.b(38, i14, "Unexpected audio encoding: "));
                return 0;
            case 14:
                int iFindTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                if (iFindTrueHdSyncframeOffset == -1) {
                    return 0;
                }
                return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
        }
    }

    private static int getMaxSupportedChannelCountForPassthroughV29(int i14, int i15) {
        android.media.AudioAttributes audioAttributesBuild = new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i16 = 8; i16 > 0; i16--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i14).setSampleRate(i15).setChannelMask(Util.getAudioTrackChannelConfig(i16)).build(), audioAttributesBuild)) {
                return i16;
            }
        }
        return 0;
    }

    private MediaPositionParameters getMediaPositionParameters() {
        MediaPositionParameters mediaPositionParameters = this.afterDrainParameters;
        if (mediaPositionParameters != null) {
            return mediaPositionParameters;
        }
        return !this.mediaPositionParametersCheckpoints.isEmpty() ? this.mediaPositionParametersCheckpoints.getLast() : this.mediaPositionParameters;
    }

    @SuppressLint({"InlinedApi"})
    private int getOffloadedPlaybackSupport(AudioFormat audioFormat, android.media.AudioAttributes audioAttributes) {
        int i14 = Util.SDK_INT;
        if (i14 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i14 == 30 && Util.MODEL.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        Configuration configuration = this.configuration;
        return configuration.outputMode == 0 ? this.submittedPcmBytes / ((long) configuration.inputPcmFrameSize) : this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        Configuration configuration = this.configuration;
        return configuration.outputMode == 0 ? this.writtenPcmBytes / ((long) configuration.outputPcmFrameSize) : this.writtenEncodedFrames;
    }

    private void initializeAudioTrack() throws AudioSink.InitializationException {
        PlayerId playerId;
        this.releasingConditionVariable.block();
        AudioTrack audioTrackBuildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.audioTrack = audioTrackBuildAudioTrackWithRetry;
        if (isOffloadedPlayback(audioTrackBuildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.audioTrack);
            if (this.offloadMode != 3) {
                AudioTrack audioTrack = this.audioTrack;
                Format format = this.configuration.inputFormat;
                audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
            }
        }
        if (Util.SDK_INT >= 31 && (playerId = this.playerId) != null) {
            Api31.setLogSessionIdOnAudioTrack(this.audioTrack, playerId);
        }
        this.audioSessionId = this.audioTrack.getAudioSessionId();
        AudioTrackPositionTracker audioTrackPositionTracker = this.audioTrackPositionTracker;
        AudioTrack audioTrack2 = this.audioTrack;
        Configuration configuration = this.configuration;
        audioTrackPositionTracker.setAudioTrack(audioTrack2, configuration.outputMode == 2, configuration.outputEncoding, configuration.outputPcmFrameSize, configuration.bufferSize);
        setVolumeInternal();
        int i14 = this.auxEffectInfo.effectId;
        if (i14 != 0) {
            this.audioTrack.attachAuxEffect(i14);
            this.audioTrack.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        this.startMediaTimeUsNeedsInit = true;
    }

    private static boolean isAudioTrackDeadObject(int i14) {
        return (Util.SDK_INT >= 24 && i14 == -6) || i14 == ERROR_NATIVE_DEAD_OBJECT;
    }

    private boolean isAudioTrackInitialized() {
        return this.audioTrack != null;
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
        return Util.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static boolean isPassthroughPlaybackSupported(Format format, AudioCapabilities audioCapabilities) {
        return getEncodingAndChannelConfigForPassthrough(format, audioCapabilities) != null;
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputModeIsOffload()) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private void playPendingData() {
        if (this.stoppedAudioTrack) {
            return;
        }
        this.stoppedAudioTrack = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private void processBuffers(long j8) throws AudioSink.WriteException, T {
        ByteBuffer byteBuffer;
        int length = this.activeAudioProcessors.length;
        int i14 = length;
        while (i14 >= 0) {
            if (i14 > 0) {
                byteBuffer = this.outputBuffers[i14 - 1];
            } else {
                byteBuffer = this.inputBuffer;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.EMPTY_BUFFER;
                }
            }
            if (i14 == length) {
                writeBuffer(byteBuffer, j8);
            } else {
                AudioProcessor audioProcessor = this.activeAudioProcessors[i14];
                if (i14 > this.drainingAudioProcessorIndex) {
                    audioProcessor.queueInput(byteBuffer);
                }
                ByteBuffer output = audioProcessor.getOutput();
                this.outputBuffers[i14] = output;
                if (output.hasRemaining()) {
                    i14++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i14--;
            }
        }
    }

    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
        if (this.offloadStreamEventCallbackV29 == null) {
            this.offloadStreamEventCallbackV29 = new StreamEventCallbackV29();
        }
        this.offloadStreamEventCallbackV29.register(audioTrack);
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new MediaPositionParameters(getAudioProcessorPlaybackParameters(), getSkipSilenceEnabled(), 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioTrack = false;
        this.handledEndOfStream = false;
        this.drainingAudioProcessorIndex = -1;
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        flushAudioProcessors();
    }

    private void setAudioProcessorPlaybackParametersAndSkipSilence(PlaybackParameters playbackParameters, boolean z14) {
        MediaPositionParameters mediaPositionParameters = getMediaPositionParameters();
        if (playbackParameters.equals(mediaPositionParameters.playbackParameters) && z14 == mediaPositionParameters.skipSilence) {
            return;
        }
        MediaPositionParameters mediaPositionParameters2 = new MediaPositionParameters(playbackParameters, z14, C.TIME_UNSET, C.TIME_UNSET);
        if (isAudioTrackInitialized()) {
            this.afterDrainParameters = mediaPositionParameters2;
        } else {
            this.mediaPositionParameters = mediaPositionParameters2;
        }
    }

    private void setAudioTrackPlaybackParametersV23(PlaybackParameters playbackParameters) {
        if (isAudioTrackInitialized()) {
            try {
                this.audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(playbackParameters.speed).setPitch(playbackParameters.pitch).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e4) {
                Log.w(TAG, "Failed to set playback params", e4);
            }
            playbackParameters = new PlaybackParameters(this.audioTrack.getPlaybackParams().getSpeed(), this.audioTrack.getPlaybackParams().getPitch());
            this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(playbackParameters.speed);
        }
        this.audioTrackPlaybackParameters = playbackParameters;
    }

    private void setVolumeInternal() {
        if (isAudioTrackInitialized()) {
            int i14 = Util.SDK_INT;
            AudioTrack audioTrack = this.audioTrack;
            if (i14 >= 21) {
                setVolumeInternalV21(audioTrack, this.volume);
            } else {
                setVolumeInternalV3(audioTrack, this.volume);
            }
        }
    }

    private static void setVolumeInternalV21(AudioTrack audioTrack, float f14) {
        audioTrack.setVolume(f14);
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack, float f14) {
        audioTrack.setStereoVolume(f14, f14);
    }

    private void setupAudioProcessors() {
        AudioProcessor[] audioProcessorArr = this.configuration.availableAudioProcessors;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.activeAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.outputBuffers = new ByteBuffer[size];
        flushAudioProcessors();
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        return (this.tunneling || !MimeTypes.AUDIO_RAW.equals(this.configuration.inputFormat.sampleMimeType) || shouldUseFloatOutput(this.configuration.inputFormat.pcmEncoding)) ? false : true;
    }

    private boolean shouldUseFloatOutput(int i14) {
        return this.enableFloatOutput && Util.isEncodingHighResolutionPcm(i14);
    }

    private boolean useOffloadedPlayback(Format format, AudioAttributes audioAttributes) {
        int encoding;
        int audioTrackChannelConfig;
        int offloadedPlaybackSupport;
        if (Util.SDK_INT < 29 || this.offloadMode == 0 || (encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs)) == 0 || (audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format.channelCount)) == 0 || (offloadedPlaybackSupport = getOffloadedPlaybackSupport(getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding), audioAttributes.getAudioAttributesV21())) == 0) {
            return false;
        }
        if (offloadedPlaybackSupport == 1) {
            return ((format.encoderDelay != 0 || format.encoderPadding != 0) && (this.offloadMode == 1)) ? false : true;
        }
        if (offloadedPlaybackSupport == 2) {
            return true;
        }
        x.h();
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private void writeBuffer(ByteBuffer byteBuffer, long j8) throws AudioSink.WriteException, T {
        DefaultAudioSink defaultAudioSink;
        ByteBuffer byteBuffer2;
        int iWriteNonBlockingV21;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.outputBuffer;
            if (byteBuffer3 != null) {
                Assertions.checkArgument(byteBuffer3 == byteBuffer);
            } else {
                this.outputBuffer = byteBuffer;
                if (Util.SDK_INT < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.preV21OutputBuffer;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.preV21OutputBuffer = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.preV21OutputBuffer, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.preV21OutputBufferOffset = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Util.SDK_INT < 21) {
                int availableBufferSize = this.audioTrackPositionTracker.getAvailableBufferSize(this.writtenPcmBytes);
                if (availableBufferSize > 0) {
                    iWriteNonBlockingV21 = this.audioTrack.write(this.preV21OutputBuffer, this.preV21OutputBufferOffset, Math.min(iRemaining2, availableBufferSize));
                    if (iWriteNonBlockingV21 > 0) {
                        this.preV21OutputBufferOffset += iWriteNonBlockingV21;
                        byteBuffer.position(byteBuffer.position() + iWriteNonBlockingV21);
                    }
                } else {
                    iWriteNonBlockingV21 = 0;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
            } else if (this.tunneling) {
                Assertions.checkState(j8 != C.TIME_UNSET);
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iWriteNonBlockingV21 = defaultAudioSink.writeNonBlockingWithAvSyncV21(this.audioTrack, byteBuffer2, iRemaining2, j8);
            } else {
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iWriteNonBlockingV21 = writeNonBlockingV21(defaultAudioSink.audioTrack, byteBuffer2, iRemaining2);
            }
            defaultAudioSink.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
            if (iWriteNonBlockingV21 < 0) {
                boolean zIsAudioTrackDeadObject = isAudioTrackDeadObject(iWriteNonBlockingV21);
                if (zIsAudioTrackDeadObject) {
                    maybeDisableOffload();
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(iWriteNonBlockingV21, defaultAudioSink.configuration.inputFormat, zIsAudioTrackDeadObject);
                AudioSink.Listener listener = defaultAudioSink.listener;
                if (listener != null) {
                    listener.onAudioSinkError(writeException);
                }
                if (writeException.isRecoverable) {
                    throw writeException;
                }
                defaultAudioSink.writeExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(writeException);
                return;
            }
            defaultAudioSink.writeExceptionPendingExceptionHolder.clear();
            if (isOffloadedPlayback(defaultAudioSink.audioTrack)) {
                long j14 = defaultAudioSink.writtenEncodedFrames;
                if (j14 > 0) {
                    defaultAudioSink.isWaitingForOffloadEndOfStreamHandled = false;
                }
                if (defaultAudioSink.playing && defaultAudioSink.listener != null && iWriteNonBlockingV21 < iRemaining2 && !defaultAudioSink.isWaitingForOffloadEndOfStreamHandled) {
                    defaultAudioSink.listener.onOffloadBufferFull(defaultAudioSink.audioTrackPositionTracker.getPendingBufferDurationMs(j14));
                }
            }
            int i14 = defaultAudioSink.configuration.outputMode;
            if (i14 == 0) {
                defaultAudioSink.writtenPcmBytes += (long) iWriteNonBlockingV21;
            }
            if (iWriteNonBlockingV21 == iRemaining2) {
                if (i14 != 0) {
                    Assertions.checkState(byteBuffer2 == defaultAudioSink.inputBuffer);
                    defaultAudioSink.writtenEncodedFrames += (long) (defaultAudioSink.framesPerEncodedSample * defaultAudioSink.inputBufferAccessUnitCount);
                }
                defaultAudioSink.outputBuffer = null;
            }
        }
    }

    private static int writeNonBlockingV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i14) {
        return audioTrack.write(byteBuffer, i14, 1);
    }

    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i14, long j8) {
        if (Util.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i14, 1, j8 * 1000);
        }
        if (this.avSyncHeader == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.avSyncHeader = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i14);
            this.avSyncHeader.putLong(8, j8 * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i14;
        }
        int iRemaining = this.avSyncHeader.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.avSyncHeader, iRemaining, 1);
            if (iWrite < 0) {
                this.bytesUntilNextAvSync = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWriteNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i14);
        if (iWriteNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return iWriteNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= iWriteNonBlockingV21;
        return iWriteNonBlockingV21;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(Format format, int i14, int[] iArr) throws AudioSink.ConfigurationException {
        int i15;
        int iIntValue;
        int iIntValue2;
        int i16;
        int i17;
        AudioProcessor[] audioProcessorArr;
        int i18;
        int pcmFrameSize;
        int i19;
        int[] iArr2;
        if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            Assertions.checkArgument(Util.isEncodingLinearPcm(format.pcmEncoding));
            int pcmFrameSize2 = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            AudioProcessor[] audioProcessorArr2 = shouldUseFloatOutput(format.pcmEncoding) ? this.toFloatPcmAvailableAudioProcessors : this.toIntPcmAvailableAudioProcessors;
            this.trimmingAudioProcessor.setTrimFrameCount(format.encoderDelay, format.encoderPadding);
            if (Util.SDK_INT < 21 && format.channelCount == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i24 = 0; i24 < 6; i24++) {
                    iArr2[i24] = i24;
                }
            } else {
                iArr2 = iArr;
            }
            this.channelMappingAudioProcessor.setChannelMap(iArr2);
            AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(format.sampleRate, format.channelCount, format.pcmEncoding);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.AudioFormat audioFormatConfigure = audioProcessor.configure(audioFormat);
                    if (audioProcessor.isActive()) {
                        audioFormat = audioFormatConfigure;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e4) {
                    throw new AudioSink.ConfigurationException(e4, format);
                }
            }
            iIntValue = audioFormat.encoding;
            i15 = audioFormat.sampleRate;
            iIntValue2 = Util.getAudioTrackChannelConfig(audioFormat.channelCount);
            AudioProcessor[] audioProcessorArr3 = audioProcessorArr2;
            i18 = pcmFrameSize2;
            audioProcessorArr = audioProcessorArr3;
            i17 = 0;
            pcmFrameSize = Util.getPcmFrameSize(iIntValue, audioFormat.channelCount);
        } else {
            AudioProcessor[] audioProcessorArr4 = new AudioProcessor[0];
            i15 = format.sampleRate;
            if (useOffloadedPlayback(format, this.audioAttributes)) {
                iIntValue = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
                iIntValue2 = Util.getAudioTrackChannelConfig(format.channelCount);
                i16 = 1;
            } else {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = getEncodingAndChannelConfigForPassthrough(format, this.audioCapabilities);
                if (encodingAndChannelConfigForPassthrough == null) {
                    String strValueOf = String.valueOf(format);
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 37);
                    sb3.append("Unable to configure passthrough for: ");
                    sb3.append(strValueOf);
                    throw new AudioSink.ConfigurationException(sb3.toString(), format);
                }
                iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i16 = 2;
            }
            i17 = i16;
            audioProcessorArr = audioProcessorArr4;
            i18 = -1;
            pcmFrameSize = -1;
        }
        int i25 = iIntValue;
        int i26 = i15;
        if (i14 != 0) {
            i19 = i14;
        } else {
            int bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i26, iIntValue2, i25), i25, i17, pcmFrameSize, i26, this.enableAudioTrackPlaybackParams ? 8.0d : 1.0d);
            i25 = i25;
            i19 = bufferSizeInBytes;
        }
        if (i25 == 0) {
            String strValueOf2 = String.valueOf(format);
            StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 48);
            sb4.append("Invalid output encoding (mode=");
            sb4.append(i17);
            sb4.append(") for: ");
            sb4.append(strValueOf2);
            throw new AudioSink.ConfigurationException(sb4.toString(), format);
        }
        if (iIntValue2 != 0) {
            this.offloadDisabledUntilNextConfiguration = false;
            Configuration configuration = new Configuration(format, i18, i17, pcmFrameSize, i26, iIntValue2, i25, i19, audioProcessorArr);
            if (isAudioTrackInitialized()) {
                this.pendingConfiguration = configuration;
                return;
            } else {
                this.configuration = configuration;
                return;
            }
        }
        String strValueOf3 = String.valueOf(format);
        StringBuilder sb5 = new StringBuilder(strValueOf3.length() + 54);
        sb5.append("Invalid output channel config (mode=");
        sb5.append(i17);
        sb5.append(") for: ");
        sb5.append(strValueOf3);
        throw new AudioSink.ConfigurationException(sb5.toString(), format);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
        Assertions.checkState(Util.SDK_INT >= 21);
        Assertions.checkState(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
        if (Util.SDK_INT < 25) {
            flush();
            return;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            this.audioTrack.flush();
            this.audioTrackPositionTracker.reset();
            AudioTrackPositionTracker audioTrackPositionTracker = this.audioTrackPositionTracker;
            AudioTrack audioTrack = this.audioTrack;
            Configuration configuration = this.configuration;
            audioTrackPositionTracker.setAudioTrack(audioTrack, configuration.outputMode == 2, configuration.outputEncoding, configuration.outputPcmFrameSize, configuration.bufferSize);
            this.startMediaTimeUsNeedsInit = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            if (isOffloadedPlayback(this.audioTrack)) {
                ((StreamEventCallbackV29) Assertions.checkNotNull(this.offloadStreamEventCallbackV29)).unregister(this.audioTrack);
            }
            final AudioTrack audioTrack = this.audioTrack;
            this.audioTrack = null;
            if (Util.SDK_INT < 21 && !this.externalAudioSessionIdProvided) {
                this.audioSessionId = 0;
            }
            Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            this.audioTrackPositionTracker.reset();
            this.releasingConditionVariable.close();
            new Thread("ExoPlayer:AudioTrackReleaseThread") { // from class: com.google.android.exoplayer2.audio.DefaultAudioSink.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        DefaultAudioSink.this.releasingConditionVariable.open();
                    }
                }
            }.start();
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean z14) {
        if (!isAudioTrackInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(z14), this.configuration.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int getFormatSupport(Format format) {
        if (!MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            return ((this.offloadDisabledUntilNextConfiguration || !useOffloadedPlayback(format, this.audioAttributes)) && !isPassthroughPlaybackSupported(format, this.audioCapabilities)) ? 0 : 2;
        }
        boolean zIsEncodingLinearPcm = Util.isEncodingLinearPcm(format.pcmEncoding);
        int i14 = format.pcmEncoding;
        if (zIsEncodingLinearPcm) {
            return (i14 == 2 || (this.enableFloatOutput && i14 == 4)) ? 2 : 1;
        }
        v.e(33, i14, "Invalid PCM encoding: ", TAG);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.enableAudioTrackPlaybackParams ? this.audioTrackPlaybackParameters : getAudioProcessorPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return getMediaPositionParameters().skipSilence;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:77:0x012d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0134  */
    /* JADX WARN: Code duplicated, block: B:82:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151  */
    /* JADX WARN: Code duplicated, block: B:88:0x015c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x0174  */
    /* JADX WARN: Code duplicated, block: B:94:0x0179  */
    /* JADX WARN: Code duplicated, block: B:96:0x0185  */
    /* JADX WARN: Code duplicated, block: B:99:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e4, code lost:
    
        if (r5 == 0) goto L63;
     */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean handleBuffer(ByteBuffer byteBuffer, long j8, int i14) throws AudioSink.WriteException, T, AudioSink.InitializationException {
        boolean z14;
        Configuration configuration;
        long jInputFramesToDurationUs;
        AudioSink.Listener listener;
        ByteBuffer byteBuffer2 = this.inputBuffer;
        Assertions.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration == null) {
            if (!isAudioTrackInitialized()) {
                try {
                    initializeAudioTrack();
                } catch (AudioSink.InitializationException e4) {
                    if (e4.isRecoverable) {
                        throw e4;
                    }
                    this.initializationExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(e4);
                    return false;
                }
            }
            this.initializationExceptionPendingExceptionHolder.clear();
            if (this.startMediaTimeUsNeedsInit) {
                this.startMediaTimeUs = Math.max(0L, j8);
                this.startMediaTimeUsNeedsSync = false;
                this.startMediaTimeUsNeedsInit = false;
                if (this.enableAudioTrackPlaybackParams && Util.SDK_INT >= 23) {
                    setAudioTrackPlaybackParametersV23(this.audioTrackPlaybackParameters);
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j8);
                if (this.playing) {
                    play();
                }
            }
            if (this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
                if (this.inputBuffer != null) {
                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    Assertions.checkArgument(z14);
                    if (byteBuffer.hasRemaining()) {
                        configuration = this.configuration;
                        if (configuration.outputMode != 0 && this.framesPerEncodedSample == 0) {
                            int framesPerEncodedSample = getFramesPerEncodedSample(configuration.outputEncoding, byteBuffer);
                            this.framesPerEncodedSample = framesPerEncodedSample;
                        }
                        if (this.afterDrainParameters == null) {
                            jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
                            if (!this.startMediaTimeUsNeedsSync && Math.abs(jInputFramesToDurationUs - j8) > 200000) {
                                this.listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j8, jInputFramesToDurationUs));
                                this.startMediaTimeUsNeedsSync = true;
                            }
                            if (this.startMediaTimeUsNeedsSync) {
                                if (drainToEndOfStream()) {
                                    long j14 = j8 - jInputFramesToDurationUs;
                                    this.startMediaTimeUs += j14;
                                    this.startMediaTimeUsNeedsSync = false;
                                    applyAudioProcessorPlaybackParametersAndSkipSilence(j8);
                                    listener = this.listener;
                                    if (listener != null && j14 != 0) {
                                        listener.onPositionDiscontinuity();
                                    }
                                }
                            }
                            if (this.configuration.outputMode == 0) {
                                this.submittedPcmBytes += (long) byteBuffer.remaining();
                            } else {
                                this.submittedEncodedFrames += (long) (this.framesPerEncodedSample * i14);
                            }
                            this.inputBuffer = byteBuffer;
                            this.inputBufferAccessUnitCount = i14;
                            processBuffers(j8);
                            if (!this.inputBuffer.hasRemaining()) {
                                this.inputBuffer = null;
                                this.inputBufferAccessUnitCount = 0;
                                return true;
                            }
                            if (this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
                                Log.w(TAG, "Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        } else if (drainToEndOfStream()) {
                            applyAudioProcessorPlaybackParametersAndSkipSilence(j8);
                            this.afterDrainParameters = null;
                            jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
                            if (!this.startMediaTimeUsNeedsSync) {
                                this.listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j8, jInputFramesToDurationUs));
                                this.startMediaTimeUsNeedsSync = true;
                            }
                            if (this.startMediaTimeUsNeedsSync) {
                                if (drainToEndOfStream()) {
                                    long j15 = j8 - jInputFramesToDurationUs;
                                    this.startMediaTimeUs += j15;
                                    this.startMediaTimeUsNeedsSync = false;
                                    applyAudioProcessorPlaybackParametersAndSkipSilence(j8);
                                    listener = this.listener;
                                    if (listener != null) {
                                        listener.onPositionDiscontinuity();
                                    }
                                }
                            }
                            if (this.configuration.outputMode == 0) {
                                this.submittedPcmBytes += (long) byteBuffer.remaining();
                            } else {
                                this.submittedEncodedFrames += (long) (this.framesPerEncodedSample * i14);
                            }
                            this.inputBuffer = byteBuffer;
                            this.inputBufferAccessUnitCount = i14;
                            processBuffers(j8);
                            if (!this.inputBuffer.hasRemaining()) {
                                this.inputBuffer = null;
                                this.inputBufferAccessUnitCount = 0;
                                return true;
                            }
                            if (this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
                                Log.w(TAG, "Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        }
                    }
                    return true;
                }
                processBuffers(j8);
                if (!this.inputBuffer.hasRemaining()) {
                    this.inputBuffer = null;
                    this.inputBufferAccessUnitCount = 0;
                    return true;
                }
                if (this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
                    Log.w(TAG, "Resetting stalled audio track");
                    flush();
                    return true;
                }
            }
        } else if (drainToEndOfStream()) {
            if (this.pendingConfiguration.canReuseAudioTrack(this.configuration)) {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                if (isOffloadedPlayback(this.audioTrack) && this.offloadMode != 3) {
                    this.audioTrack.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.audioTrack;
                    Format format = this.configuration.inputFormat;
                    audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            } else {
                playPendingData();
                if (!hasPendingData()) {
                    flush();
                }
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j8);
            if (!isAudioTrackInitialized()) {
                initializeAudioTrack();
            }
            this.initializationExceptionPendingExceptionHolder.clear();
            if (this.startMediaTimeUsNeedsInit) {
                this.startMediaTimeUs = Math.max(0L, j8);
                this.startMediaTimeUsNeedsSync = false;
                this.startMediaTimeUsNeedsInit = false;
                if (this.enableAudioTrackPlaybackParams) {
                    setAudioTrackPlaybackParametersV23(this.audioTrackPlaybackParameters);
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j8);
                if (this.playing) {
                    play();
                }
            }
            if (this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
                if (this.inputBuffer != null) {
                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    Assertions.checkArgument(z14);
                    if (byteBuffer.hasRemaining()) {
                        configuration = this.configuration;
                        if (configuration.outputMode != 0) {
                            int framesPerEncodedSample2 = getFramesPerEncodedSample(configuration.outputEncoding, byteBuffer);
                            this.framesPerEncodedSample = framesPerEncodedSample2;
                        }
                        if (this.afterDrainParameters == null) {
                            jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
                            if (!this.startMediaTimeUsNeedsSync) {
                                this.listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j8, jInputFramesToDurationUs));
                                this.startMediaTimeUsNeedsSync = true;
                            }
                            if (this.startMediaTimeUsNeedsSync) {
                                if (drainToEndOfStream()) {
                                    long j16 = j8 - jInputFramesToDurationUs;
                                    this.startMediaTimeUs += j16;
                                    this.startMediaTimeUsNeedsSync = false;
                                    applyAudioProcessorPlaybackParametersAndSkipSilence(j8);
                                    listener = this.listener;
                                    if (listener != null) {
                                        listener.onPositionDiscontinuity();
                                    }
                                }
                            }
                            if (this.configuration.outputMode == 0) {
                                this.submittedPcmBytes += (long) byteBuffer.remaining();
                            } else {
                                this.submittedEncodedFrames += (long) (this.framesPerEncodedSample * i14);
                            }
                            this.inputBuffer = byteBuffer;
                            this.inputBufferAccessUnitCount = i14;
                            processBuffers(j8);
                            if (!this.inputBuffer.hasRemaining()) {
                                this.inputBuffer = null;
                                this.inputBufferAccessUnitCount = 0;
                                return true;
                            }
                            if (this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
                                Log.w(TAG, "Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        } else if (drainToEndOfStream()) {
                            applyAudioProcessorPlaybackParametersAndSkipSilence(j8);
                            this.afterDrainParameters = null;
                            jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
                            if (!this.startMediaTimeUsNeedsSync) {
                                this.listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j8, jInputFramesToDurationUs));
                                this.startMediaTimeUsNeedsSync = true;
                            }
                            if (this.startMediaTimeUsNeedsSync) {
                                if (drainToEndOfStream()) {
                                    long j17 = j8 - jInputFramesToDurationUs;
                                    this.startMediaTimeUs += j17;
                                    this.startMediaTimeUsNeedsSync = false;
                                    applyAudioProcessorPlaybackParametersAndSkipSilence(j8);
                                    listener = this.listener;
                                    if (listener != null) {
                                        listener.onPositionDiscontinuity();
                                    }
                                }
                            }
                            if (this.configuration.outputMode == 0) {
                                this.submittedPcmBytes += (long) byteBuffer.remaining();
                            } else {
                                this.submittedEncodedFrames += (long) (this.framesPerEncodedSample * i14);
                            }
                            this.inputBuffer = byteBuffer;
                            this.inputBufferAccessUnitCount = i14;
                            processBuffers(j8);
                            if (!this.inputBuffer.hasRemaining()) {
                                this.inputBuffer = null;
                                this.inputBufferAccessUnitCount = 0;
                                return true;
                            }
                            if (this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
                                Log.w(TAG, "Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        }
                    }
                    return true;
                }
                processBuffers(j8);
                if (!this.inputBuffer.hasRemaining()) {
                    this.inputBuffer = null;
                    this.inputBufferAccessUnitCount = 0;
                    return true;
                }
                if (this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
                    Log.w(TAG, "Resetting stalled audio track");
                    flush();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        return isAudioTrackInitialized() && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        if (isAudioTrackInitialized()) {
            return this.handledEndOfStream && !hasPendingData();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioTrackInitialized() && this.audioTrackPositionTracker.pause()) {
            this.audioTrack.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioTrackInitialized()) {
            this.audioTrackPositionTracker.start();
            this.audioTrack.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() {
        if (!this.handledEndOfStream && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.toIntPcmAvailableAudioProcessors) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.toFloatPcmAvailableAudioProcessors) {
            audioProcessor2.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i14) {
        if (this.audioSessionId != i14) {
            this.audioSessionId = i14;
            this.externalAudioSessionIdProvided = i14 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i14 = auxEffectInfo.effectId;
        float f14 = auxEffectInfo.sendLevel;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            if (this.auxEffectInfo.effectId != i14) {
                audioTrack.attachAuxEffect(i14);
            }
            if (i14 != 0) {
                this.audioTrack.setAuxEffectSendLevel(f14);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        PlaybackParameters playbackParameters2 = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        if (!this.enableAudioTrackPlaybackParams || Util.SDK_INT < 23) {
            setAudioProcessorPlaybackParametersAndSkipSilence(playbackParameters2, getSkipSilenceEnabled());
        } else {
            setAudioTrackPlaybackParametersV23(playbackParameters2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlayerId(PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z14) {
        setAudioProcessorPlaybackParametersAndSkipSilence(getAudioProcessorPlaybackParameters(), z14);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f14) {
        if (this.volume != f14) {
            this.volume = f14;
            setVolumeInternal();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return getFormatSupport(format) != 0;
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessorArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z14) {
            this.silenceSkippingAudioProcessor.setEnabled(z14);
            return z14;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getMediaDuration(long j8) {
            return this.sonicAudioProcessor.getMediaDuration(j8);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }
    }

    @InlineMe(imports = {"com.google.android.exoplayer2.audio.DefaultAudioSink"}, replacement = "new DefaultAudioSink.Builder().setAudioCapabilities(audioCapabilities).setAudioProcessors(audioProcessors).build()")
    @InlineMeValidationDisabled("Migrate constructor to Builder")
    @Deprecated
    public DefaultAudioSink(AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) MoreObjects.firstNonNull(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr));
    }

    @InlineMe(imports = {"com.google.android.exoplayer2.audio.DefaultAudioSink"}, replacement = "new DefaultAudioSink.Builder().setAudioCapabilities(audioCapabilities).setAudioProcessors(audioProcessors).setEnableFloatOutput(enableFloatOutput).build()")
    @InlineMeValidationDisabled("Migrate constructor to Builder")
    @Deprecated
    public DefaultAudioSink(AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr, boolean z14) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) MoreObjects.firstNonNull(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr).setEnableFloatOutput(z14));
    }

    @InlineMe(imports = {"com.google.android.exoplayer2.audio.DefaultAudioSink"}, replacement = "new DefaultAudioSink.Builder().setAudioCapabilities(audioCapabilities).setAudioProcessorChain(audioProcessorChain).setEnableFloatOutput(enableFloatOutput).setEnableAudioTrackPlaybackParams(enableAudioTrackPlaybackParams).setOffloadMode(offloadMode).build()")
    @InlineMeValidationDisabled("Migrate constructor to Builder")
    @Deprecated
    public DefaultAudioSink(AudioCapabilities audioCapabilities, AudioProcessorChain audioProcessorChain, boolean z14, boolean z15, int i14) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) MoreObjects.firstNonNull(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessorChain(audioProcessorChain).setEnableFloatOutput(z14).setEnableAudioTrackPlaybackParams(z15).setOffloadMode(i14));
    }
}
