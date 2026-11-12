package com.google.android.exoplayer2.audio;

import androidx.core.view.j;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.v;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;
    public static final int SINK_FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int SINK_FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int SINK_FORMAT_UNSUPPORTED = 0;

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final Format format;
        public final boolean isRecoverable;

        public InitializationException(int i14, int i15, int i16, int i17, Format format, boolean z14, Exception exc) {
            String str = z14 ? " (recoverable)" : "";
            StringBuilder sb3 = new StringBuilder(str.length() + 80);
            sb3.append("AudioTrack init failed ");
            sb3.append(i14);
            sb3.append(" Config(");
            sb3.append(i15);
            j.m(i16, i17, ", ", ", ", sb3);
            super(am.j.o(")", str, sb3), exc);
            this.audioTrackState = i14;
            this.isRecoverable = z14;
            this.format = format;
        }
    }

    public interface Listener {
        default void onAudioSinkError(Exception exc) {
        }

        default void onOffloadBufferEmptying() {
        }

        default void onOffloadBufferFull(long j8) {
        }

        default void onPositionAdvancing(long j8) {
        }

        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z14);

        void onUnderrun(int i14, long j8, long j14);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j8, long j14) {
            StringBuilder sb3 = new StringBuilder(103);
            sb3.append("Unexpected audio track timestamp discontinuity: expected ");
            sb3.append(j14);
            sb3.append(", got ");
            sb3.append(j8);
            super(sb3.toString());
            this.actualPresentationTimeUs = j8;
            this.expectedPresentationTimeUs = j14;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final Format format;
        public final boolean isRecoverable;

        public WriteException(int i14, Format format, boolean z14) {
            super(v.b(36, i14, "AudioTrack write failed: "));
            this.isRecoverable = z14;
            this.errorCode = i14;
            this.format = format;
        }
    }

    void configure(Format format, int i14, int[] iArr);

    void disableTunneling();

    void enableTunnelingV21();

    void experimentalFlushWithoutAudioTrackRelease();

    void flush();

    AudioAttributes getAudioAttributes();

    long getCurrentPositionUs(boolean z14);

    int getFormatSupport(Format format);

    PlaybackParameters getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j8, int i14);

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream();

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i14);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setListener(Listener listener);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    default void setPlayerId(PlayerId playerId) {
    }

    void setSkipSilenceEnabled(boolean z14);

    void setVolume(float f14);

    boolean supportsFormat(Format format);

    public static final class ConfigurationException extends Exception {
        public final Format format;

        public ConfigurationException(Throwable th3, Format format) {
            super(th3);
            this.format = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.format = format;
        }
    }
}
