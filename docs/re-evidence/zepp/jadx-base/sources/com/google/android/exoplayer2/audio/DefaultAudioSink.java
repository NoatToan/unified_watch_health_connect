package com.google.android.exoplayer2.audio;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.huami.mifit.sportlib.common.DataTypeSource;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAudioSink implements AudioSink {
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_DISABLED = 3;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    private static final boolean a0 = false;
    private static final int b0 = 0;
    private static final int c0 = 1;
    private static final int d0 = 2;
    private static final long e0 = 250000;
    private static final long f0 = 750000;
    public static boolean failOnSpuriousAudioTimestamp = false;
    private static final long g0 = 250000;
    private static final long h0 = 50000000;
    private static final int i0 = 4;
    private static final int j0 = 2;
    private static final int k0 = -32;
    private static final int l0 = 100;
    private static final String m0 = "DefaultAudioSink";
    private long A;
    private long B;
    private long C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private float H;
    private AudioProcessor[] I;
    private ByteBuffer[] J;

    @Nullable
    private ByteBuffer K;
    private int L;

    @Nullable
    private ByteBuffer M;
    private byte[] N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private AuxEffectInfo V;
    private boolean W;
    private long X;
    private boolean Y;
    private boolean Z;

    @Nullable
    private final AudioCapabilities a;
    private final AudioProcessorChain b;
    private final boolean c;
    private final com.google.android.exoplayer2.audio.e d;
    private final i e;
    private final AudioProcessor[] f;
    private final AudioProcessor[] g;
    private final ConditionVariable h;
    private final AudioTrackPositionTracker i;
    private final ArrayDeque<c> j;
    private final boolean k;
    private final int l;
    private f m;
    private final d<AudioSink.InitializationException> n;
    private final d<AudioSink.WriteException> o;

    @Nullable
    private AudioSink.Listener p;

    @Nullable
    private b q;
    private b r;

    @Nullable
    private AudioTrack s;
    private AudioAttributes t;

    @Nullable
    private c u;
    private c v;
    private PlaybackParameters w;

    @Nullable
    private ByteBuffer x;
    private int y;
    private long z;

    public interface AudioProcessorChain {
        PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

        boolean applySkipSilenceEnabled(boolean skipSilenceEnabled);

        AudioProcessor[] getAudioProcessors();

        long getMediaDuration(long playoutDuration);

        long getSkippedOutputFrameCount();
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] a;
        private final SilenceSkippingAudioProcessor b;
        private final SonicAudioProcessor c;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessors) {
            this(audioProcessors, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.c.setSpeed(playbackParameters.speed);
            this.c.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean skipSilenceEnabled) {
            this.b.setEnabled(skipSilenceEnabled);
            return skipSilenceEnabled;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.a;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getMediaDuration(long playoutDuration) {
            return this.c.getMediaDuration(playoutDuration);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.b.getSkippedFrames();
        }

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessors, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
            AudioProcessor[] audioProcessorArr = new AudioProcessor[audioProcessors.length + 2];
            this.a = audioProcessorArr;
            System.arraycopy(audioProcessors, 0, audioProcessorArr, 0, audioProcessors.length);
            this.b = silenceSkippingAudioProcessor;
            this.c = sonicAudioProcessor;
            audioProcessorArr[audioProcessors.length] = silenceSkippingAudioProcessor;
            audioProcessorArr[audioProcessors.length + 1] = sonicAudioProcessor;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public /* synthetic */ InvalidAudioTrackTimestampException(String str, a aVar) {
            this(str);
        }

        private InvalidAudioTrackTimestampException(String message) {
            super(message);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    public class a extends Thread {
        public final /* synthetic */ AudioTrack a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, final AudioTrack val$toRelease) {
            super(name);
            this.a = val$toRelease;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.a.flush();
                this.a.release();
            } finally {
                DefaultAudioSink.this.h.open();
            }
        }
    }

    public static final class b {
        public final Format a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final AudioProcessor[] i;

        public b(Format inputFormat, int inputPcmFrameSize, int outputMode, int outputPcmFrameSize, int outputSampleRate, int outputChannelConfig, int outputEncoding, int specifiedBufferSize, boolean enableAudioTrackPlaybackParams, AudioProcessor[] availableAudioProcessors) {
            this.a = inputFormat;
            this.b = inputPcmFrameSize;
            this.c = outputMode;
            this.d = outputPcmFrameSize;
            this.e = outputSampleRate;
            this.f = outputChannelConfig;
            this.g = outputEncoding;
            this.i = availableAudioProcessors;
            this.h = c(specifiedBufferSize, enableAudioTrackPlaybackParams);
        }

        private int c(int specifiedBufferSize, boolean enableAudioTrackPlaybackParameters) {
            if (specifiedBufferSize != 0) {
                return specifiedBufferSize;
            }
            int i = this.c;
            if (i == 0) {
                return m(enableAudioTrackPlaybackParameters ? 8.0f : 1.0f);
            }
            if (i == 1) {
                return l(DefaultAudioSink.h0);
            }
            if (i == 2) {
                return l(250000L);
            }
            throw new IllegalStateException();
        }

        private AudioTrack d(boolean tunneling, AudioAttributes audioAttributes, int audioSessionId) {
            int i = Util.SDK_INT;
            if (i >= 29) {
                return f(tunneling, audioAttributes, audioSessionId);
            }
            return i >= 21 ? e(tunneling, audioAttributes, audioSessionId) : g(audioAttributes, audioSessionId);
        }

        @RequiresApi(21)
        private AudioTrack e(boolean tunneling, AudioAttributes audioAttributes, int audioSessionId) {
            return new AudioTrack(j(audioAttributes, tunneling), DefaultAudioSink.p(this.e, this.f, this.g), this.h, 1, audioSessionId);
        }

        @RequiresApi(29)
        private AudioTrack f(boolean tunneling, AudioAttributes audioAttributes, int audioSessionId) {
            return new AudioTrack.Builder().setAudioAttributes(j(audioAttributes, tunneling)).setAudioFormat(DefaultAudioSink.p(this.e, this.f, this.g)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(audioSessionId).setOffloadedPlayback(this.c == 1).build();
        }

        private AudioTrack g(AudioAttributes audioAttributes, int audioSessionId) {
            int streamTypeForAudioUsage = Util.getStreamTypeForAudioUsage(audioAttributes.usage);
            return audioSessionId == 0 ? new AudioTrack(streamTypeForAudioUsage, this.e, this.f, this.g, this.h, 1) : new AudioTrack(streamTypeForAudioUsage, this.e, this.f, this.g, this.h, 1, audioSessionId);
        }

        @RequiresApi(21)
        private static android.media.AudioAttributes j(AudioAttributes audioAttributes, boolean tunneling) {
            return tunneling ? k() : audioAttributes.getAudioAttributesV21();
        }

        @RequiresApi(21)
        private static android.media.AudioAttributes k() {
            return new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        private int l(long bufferDurationUs) {
            int iV = DefaultAudioSink.v(this.g);
            if (this.g == 5) {
                iV *= 2;
            }
            return (int) ((bufferDurationUs * ((long) iV)) / 1000000);
        }

        private int m(float maxAudioTrackPlaybackSpeed) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.e, this.f, this.g);
            Assertions.checkState(minBufferSize != -2);
            int iConstrainValue = Util.constrainValue(minBufferSize * 4, ((int) h(250000L)) * this.d, Math.max(minBufferSize, ((int) h(DefaultAudioSink.f0)) * this.d));
            return maxAudioTrackPlaybackSpeed != 1.0f ? Math.round(iConstrainValue * maxAudioTrackPlaybackSpeed) : iConstrainValue;
        }

        public AudioTrack a(boolean tunneling, AudioAttributes audioAttributes, int audioSessionId) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackD = d(tunneling, audioAttributes, audioSessionId);
                int state = audioTrackD.getState();
                if (state == 1) {
                    return audioTrackD;
                }
                try {
                    audioTrackD.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.e, this.f, this.h, this.a, o(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.e, this.f, this.h, this.a, o(), e);
            }
        }

        public boolean b(b audioTrackConfiguration) {
            return audioTrackConfiguration.c == this.c && audioTrackConfiguration.g == this.g && audioTrackConfiguration.e == this.e && audioTrackConfiguration.f == this.f && audioTrackConfiguration.d == this.d;
        }

        public long h(long durationUs) {
            return (durationUs * ((long) this.e)) / 1000000;
        }

        public long i(long frameCount) {
            return (frameCount * 1000000) / ((long) this.e);
        }

        public long n(long frameCount) {
            return (frameCount * 1000000) / ((long) this.a.sampleRate);
        }

        public boolean o() {
            return this.c == 1;
        }
    }

    public static final class c {
        public final PlaybackParameters a;
        public final boolean b;
        public final long c;
        public final long d;

        public /* synthetic */ c(PlaybackParameters playbackParameters, boolean z, long j, long j2, a aVar) {
            this(playbackParameters, z, j, j2);
        }

        private c(PlaybackParameters playbackParameters, boolean skipSilence, long mediaTimeUs, long audioTrackPositionUs) {
            this.a = playbackParameters;
            this.b = skipSilence;
            this.c = mediaTimeUs;
            this.d = audioTrackPositionUs;
        }
    }

    public static final class d<T extends Exception> {
        private final long a;

        @Nullable
        private T b;
        private long c;

        public d(long throwDelayMs) {
            this.a = throwDelayMs;
        }

        public void a() {
            this.b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void b(T exception) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.b == null) {
                this.b = exception;
                this.c = this.a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.c) {
                T t = this.b;
                if (t != exception) {
                    t.addSuppressed(exception);
                }
                T t2 = this.b;
                a();
                throw t2;
            }
        }
    }

    public final class e implements AudioTrackPositionTracker.Listener {
        private e() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long latencyUs) {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(latencyUs);
            Log.w(DefaultAudioSink.m0, sb.toString());
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long playoutStartSystemTimeMs) {
            if (DefaultAudioSink.this.p != null) {
                DefaultAudioSink.this.p.onPositionAdvancing(playoutStartSystemTimeMs);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs) {
            long jX = DefaultAudioSink.this.x();
            long jY = DefaultAudioSink.this.y();
            StringBuilder sb = new StringBuilder(DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING);
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(audioTimestampPositionFrames);
            sb.append(", ");
            sb.append(audioTimestampSystemTimeUs);
            sb.append(", ");
            sb.append(systemTimeUs);
            sb.append(", ");
            sb.append(playbackPositionUs);
            sb.append(", ");
            sb.append(jX);
            sb.append(", ");
            sb.append(jY);
            String string = sb.toString();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(string, null);
            }
            Log.w(DefaultAudioSink.m0, string);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs) {
            long jX = DefaultAudioSink.this.x();
            long jY = DefaultAudioSink.this.y();
            StringBuilder sb = new StringBuilder(180);
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(audioTimestampPositionFrames);
            sb.append(", ");
            sb.append(audioTimestampSystemTimeUs);
            sb.append(", ");
            sb.append(systemTimeUs);
            sb.append(", ");
            sb.append(playbackPositionUs);
            sb.append(", ");
            sb.append(jX);
            sb.append(", ");
            sb.append(jY);
            String string = sb.toString();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(string, null);
            }
            Log.w(DefaultAudioSink.m0, string);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int bufferSize, long bufferSizeMs) {
            if (DefaultAudioSink.this.p != null) {
                DefaultAudioSink.this.p.onUnderrun(bufferSize, bufferSizeMs, SystemClock.elapsedRealtime() - DefaultAudioSink.this.X);
            }
        }

        public /* synthetic */ e(DefaultAudioSink defaultAudioSink, a aVar) {
            this();
        }
    }

    @RequiresApi(29)
    public final class f {
        private final Handler a = new Handler();
        private final AudioTrack.StreamEventCallback b;

        public class a extends AudioTrack.StreamEventCallback {
            public final /* synthetic */ DefaultAudioSink a;

            public a(final DefaultAudioSink val$this$0) {
                this.a = val$this$0;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack track, int size) {
                Assertions.checkState(track == DefaultAudioSink.this.s);
                if (DefaultAudioSink.this.p == null || !DefaultAudioSink.this.S) {
                    return;
                }
                DefaultAudioSink.this.p.onOffloadBufferEmptying();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(@NonNull AudioTrack track) {
                Assertions.checkState(track == DefaultAudioSink.this.s);
                if (DefaultAudioSink.this.p == null || !DefaultAudioSink.this.S) {
                    return;
                }
                DefaultAudioSink.this.p.onOffloadBufferEmptying();
            }
        }

        public f() {
            this.b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            final Handler handler = this.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: f51
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.b);
            this.a.removeCallbacksAndMessages(null);
        }
    }

    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessors) {
        this(audioCapabilities, audioProcessors, false);
    }

    private static boolean A(int status) {
        return (Util.SDK_INT >= 24 && status == -6) || status == k0;
    }

    private boolean B() {
        return this.s != null;
    }

    private static boolean C() {
        return Util.SDK_INT >= 30 && Util.MODEL.startsWith("Pixel");
    }

    private static boolean D(AudioTrack audioTrack) {
        return Util.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static boolean E(Format format, @Nullable AudioCapabilities audioCapabilities) {
        return s(format, audioCapabilities) != null;
    }

    private void F() {
        if (this.r.o()) {
            this.Y = true;
        }
    }

    private void G() {
        if (this.R) {
            return;
        }
        this.R = true;
        this.i.h(y());
        this.s.stop();
        this.y = 0;
    }

    private void H(long avSyncPresentationTimeUs) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.J[i - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.EMPTY_BUFFER;
                }
            }
            if (i == length) {
                T(byteBuffer, avSyncPresentationTimeUs);
            } else {
                AudioProcessor audioProcessor = this.I[i];
                if (i > this.P) {
                    audioProcessor.queueInput(byteBuffer);
                }
                ByteBuffer output = audioProcessor.getOutput();
                this.J[i] = output;
                if (output.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    @RequiresApi(29)
    private void I(AudioTrack audioTrack) {
        if (this.m == null) {
            this.m = new f();
        }
        this.m.a(audioTrack);
    }

    private void J() {
        this.z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.Z = false;
        this.D = 0;
        this.v = new c(q(), getSkipSilenceEnabled(), 0L, 0L, null);
        this.G = 0L;
        this.u = null;
        this.j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.x = null;
        this.y = 0;
        this.e.b();
        o();
    }

    private void K(PlaybackParameters playbackParameters, boolean skipSilence) {
        c cVarW = w();
        if (playbackParameters.equals(cVarW.a) && skipSilence == cVarW.b) {
            return;
        }
        c cVar = new c(playbackParameters, skipSilence, C.TIME_UNSET, C.TIME_UNSET, null);
        if (B()) {
            this.u = cVar;
        } else {
            this.v = cVar;
        }
    }

    @RequiresApi(23)
    private void L(PlaybackParameters audioTrackPlaybackParameters) {
        if (B()) {
            try {
                this.s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(audioTrackPlaybackParameters.speed).setPitch(audioTrackPlaybackParameters.pitch).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                Log.w(m0, "Failed to set playback params", e2);
            }
            audioTrackPlaybackParameters = new PlaybackParameters(this.s.getPlaybackParams().getSpeed(), this.s.getPlaybackParams().getPitch());
            this.i.u(audioTrackPlaybackParameters.speed);
        }
        this.w = audioTrackPlaybackParameters;
    }

    private void M() {
        if (B()) {
            if (Util.SDK_INT >= 21) {
                N(this.s, this.H);
            } else {
                O(this.s, this.H);
            }
        }
    }

    @RequiresApi(21)
    private static void N(AudioTrack audioTrack, float volume) {
        audioTrack.setVolume(volume);
    }

    private static void O(AudioTrack audioTrack, float volume) {
        audioTrack.setStereoVolume(volume, volume);
    }

    private void P() {
        AudioProcessor[] audioProcessorArr = this.r.i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.I = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.J = new ByteBuffer[size];
        o();
    }

    private boolean Q() {
        return (this.W || !MimeTypes.AUDIO_RAW.equals(this.r.a.sampleMimeType) || R(this.r.a.pcmEncoding)) ? false : true;
    }

    private boolean R(int pcmEncoding) {
        return this.c && Util.isEncodingHighResolutionPcm(pcmEncoding);
    }

    private boolean S(Format format, AudioAttributes audioAttributes) {
        int encoding;
        int audioTrackChannelConfig;
        if (Util.SDK_INT < 29 || this.l == 0 || (encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs)) == 0 || (audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format.channelCount)) == 0 || !AudioManager.isOffloadedPlaybackSupported(p(format.sampleRate, audioTrackChannelConfig, encoding), audioAttributes.getAudioAttributesV21())) {
            return false;
        }
        return ((format.encoderDelay != 0 || format.encoderPadding != 0) && (this.l == 1) && !C()) ? false : true;
    }

    private void T(ByteBuffer buffer, long avSyncPresentationTimeUs) throws Exception {
        int iU;
        if (buffer.hasRemaining()) {
            ByteBuffer byteBuffer = this.M;
            if (byteBuffer != null) {
                Assertions.checkArgument(byteBuffer == buffer);
            } else {
                this.M = buffer;
                if (Util.SDK_INT < 21) {
                    int iRemaining = buffer.remaining();
                    byte[] bArr = this.N;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.N = new byte[iRemaining];
                    }
                    int iPosition = buffer.position();
                    buffer.get(this.N, 0, iRemaining);
                    buffer.position(iPosition);
                    this.O = 0;
                }
            }
            int iRemaining2 = buffer.remaining();
            if (Util.SDK_INT < 21) {
                int iC = this.i.c(this.B);
                if (iC > 0) {
                    iU = this.s.write(this.N, this.O, Math.min(iRemaining2, iC));
                    if (iU > 0) {
                        this.O += iU;
                        buffer.position(buffer.position() + iU);
                    }
                } else {
                    iU = 0;
                }
            } else if (this.W) {
                Assertions.checkState(avSyncPresentationTimeUs != C.TIME_UNSET);
                iU = V(this.s, buffer, iRemaining2, avSyncPresentationTimeUs);
            } else {
                iU = U(this.s, buffer, iRemaining2);
            }
            this.X = SystemClock.elapsedRealtime();
            if (iU < 0) {
                boolean zA = A(iU);
                if (zA) {
                    F();
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(iU, this.r.a, zA);
                AudioSink.Listener listener = this.p;
                if (listener != null) {
                    listener.onAudioSinkError(writeException);
                }
                if (writeException.isRecoverable) {
                    throw writeException;
                }
                this.o.b(writeException);
                return;
            }
            this.o.a();
            if (D(this.s)) {
                long j = this.C;
                if (j > 0) {
                    this.Z = false;
                }
                if (this.S && this.p != null && iU < iRemaining2 && !this.Z) {
                    this.p.onOffloadBufferFull(this.i.e(j));
                }
            }
            int i = this.r.c;
            if (i == 0) {
                this.B += (long) iU;
            }
            if (iU == iRemaining2) {
                if (i != 0) {
                    Assertions.checkState(buffer == this.K);
                    this.C += (long) (this.D * this.L);
                }
                this.M = null;
            }
        }
    }

    @RequiresApi(21)
    private static int U(AudioTrack audioTrack, ByteBuffer buffer, int size) {
        return audioTrack.write(buffer, size, 1);
    }

    @RequiresApi(21)
    private int V(AudioTrack audioTrack, ByteBuffer buffer, int size, long presentationTimeUs) {
        if (Util.SDK_INT >= 26) {
            return audioTrack.write(buffer, size, 1, presentationTimeUs * 1000);
        }
        if (this.x == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.x = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.x.putInt(1431633921);
        }
        if (this.y == 0) {
            this.x.putInt(4, size);
            this.x.putLong(8, presentationTimeUs * 1000);
            this.x.position(0);
            this.y = size;
        }
        int iRemaining = this.x.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.x, iRemaining, 1);
            if (iWrite < 0) {
                this.y = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iU = U(audioTrack, buffer, size);
        if (iU < 0) {
            this.y = 0;
            return iU;
        }
        this.y -= iU;
        return iU;
    }

    private void j(long presentationTimeUs) {
        PlaybackParameters playbackParametersApplyPlaybackParameters = Q() ? this.b.applyPlaybackParameters(q()) : PlaybackParameters.DEFAULT;
        boolean zApplySkipSilenceEnabled = Q() ? this.b.applySkipSilenceEnabled(getSkipSilenceEnabled()) : false;
        this.j.add(new c(playbackParametersApplyPlaybackParameters, zApplySkipSilenceEnabled, Math.max(0L, presentationTimeUs), this.r.i(y()), null));
        P();
        AudioSink.Listener listener = this.p;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(zApplySkipSilenceEnabled);
        }
    }

    private long k(long positionUs) {
        while (!this.j.isEmpty() && positionUs >= this.j.getFirst().d) {
            this.v = this.j.remove();
        }
        c cVar = this.v;
        long j = positionUs - cVar.d;
        if (cVar.a.equals(PlaybackParameters.DEFAULT)) {
            return this.v.c + j;
        }
        if (this.j.isEmpty()) {
            return this.v.c + this.b.getMediaDuration(j);
        }
        c first = this.j.getFirst();
        return first.c - Util.getMediaDurationForPlayoutDuration(first.d - positionUs, this.v.a.speed);
    }

    private long l(long positionUs) {
        return positionUs + this.r.i(this.b.getSkippedOutputFrameCount());
    }

    private AudioTrack m() throws AudioSink.InitializationException {
        try {
            return ((b) Assertions.checkNotNull(this.r)).a(this.W, this.t, this.U);
        } catch (AudioSink.InitializationException e2) {
            F();
            AudioSink.Listener listener = this.p;
            if (listener != null) {
                listener.onAudioSinkError(e2);
            }
            throw e2;
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
    private boolean n() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.P = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.P
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.queueEndOfStream()
        L1f:
            r9.H(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.P
            int r0 = r0 + r2
            r9.P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            r9.T(r0, r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.n():boolean");
    }

    private void o() {
        int i = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.I;
            if (i >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i];
            audioProcessor.flush();
            this.J[i] = audioProcessor.getOutput();
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(21)
    public static AudioFormat p(int sampleRate, int channelConfig, int encoding) {
        return new AudioFormat.Builder().setSampleRate(sampleRate).setChannelMask(channelConfig).setEncoding(encoding).build();
    }

    private PlaybackParameters q() {
        return w().a;
    }

    private static int r(int channelCount) {
        int i = Util.SDK_INT;
        if (i <= 28) {
            if (channelCount == 7) {
                channelCount = 8;
            } else if (channelCount == 3 || channelCount == 4 || channelCount == 5) {
                channelCount = 6;
            }
        }
        if (i <= 26 && "fugu".equals(Util.DEVICE) && channelCount == 1) {
            channelCount = 2;
        }
        return Util.getAudioTrackChannelConfig(channelCount);
    }

    @Nullable
    private static Pair<Integer, Integer> s(Format format, @Nullable AudioCapabilities audioCapabilities) {
        if (audioCapabilities == null) {
            return null;
        }
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        int iU = 6;
        if (!(encoding == 5 || encoding == 6 || encoding == 18 || encoding == 17 || encoding == 7 || encoding == 8 || encoding == 14)) {
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
            iU = format.channelCount;
            if (iU > audioCapabilities.getMaxChannelCount()) {
                return null;
            }
        } else if (Util.SDK_INT >= 29 && (iU = u(18, format.sampleRate)) == 0) {
            Log.w(m0, "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int iR = r(iU);
        if (iR == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(iR));
    }

    private static int t(int encoding, ByteBuffer buffer) {
        switch (encoding) {
            case 5:
            case 6:
            case 18:
                return Ac3Util.parseAc3SyncframeAudioSampleCount(buffer);
            case 7:
            case 8:
                return DtsUtil.parseDtsAudioSampleCount(buffer);
            case 9:
                int mpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(Util.getBigEndianInt(buffer, buffer.position()));
                if (mpegAudioFrameSampleCount != -1) {
                    return mpegAudioFrameSampleCount;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unexpected audio encoding: ");
                sb.append(encoding);
                throw new IllegalStateException(sb.toString());
            case 14:
                int iFindTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(buffer);
                if (iFindTrueHdSyncframeOffset == -1) {
                    return 0;
                }
                return Ac3Util.parseTrueHdSyncframeAudioSampleCount(buffer, iFindTrueHdSyncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return Ac4Util.parseAc4SyncframeAudioSampleCount(buffer);
        }
    }

    @RequiresApi(29)
    private static int u(int encoding, int sampleRate) {
        android.media.AudioAttributes audioAttributesBuild = new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i = 8; i > 0; i--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(encoding).setSampleRate(sampleRate).setChannelMask(Util.getAudioTrackChannelConfig(i)).build(), audioAttributesBuild)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int v(int encoding) {
        switch (encoding) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
        }
    }

    private c w() {
        c cVar = this.u;
        if (cVar != null) {
            return cVar;
        }
        return !this.j.isEmpty() ? this.j.getLast() : this.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long x() {
        b bVar = this.r;
        return bVar.c == 0 ? this.z / ((long) bVar.b) : this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long y() {
        b bVar = this.r;
        return bVar.c == 0 ? this.B / ((long) bVar.d) : this.C;
    }

    private void z() throws AudioSink.InitializationException {
        this.h.block();
        AudioTrack audioTrackM = m();
        this.s = audioTrackM;
        if (D(audioTrackM)) {
            I(this.s);
            if (this.l != 3) {
                AudioTrack audioTrack = this.s;
                Format format = this.r.a;
                audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
            }
        }
        this.U = this.s.getAudioSessionId();
        AudioTrackPositionTracker audioTrackPositionTracker = this.i;
        AudioTrack audioTrack2 = this.s;
        b bVar = this.r;
        audioTrackPositionTracker.t(audioTrack2, bVar.c == 2, bVar.g, bVar.d, bVar.h);
        M();
        int i = this.V.effectId;
        if (i != 0) {
            this.s.attachAuxEffect(i);
            this.s.setAuxEffectSendLevel(this.V.sendLevel);
        }
        this.F = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(Format inputFormat, int specifiedBufferSize, @Nullable int[] outputChannels) throws AudioSink.ConfigurationException {
        AudioProcessor[] audioProcessorArr;
        int iIntValue;
        int pcmFrameSize;
        int pcmFrameSize2;
        int iIntValue2;
        int i;
        int i2;
        int[] iArr;
        if (MimeTypes.AUDIO_RAW.equals(inputFormat.sampleMimeType)) {
            Assertions.checkArgument(Util.isEncodingLinearPcm(inputFormat.pcmEncoding));
            pcmFrameSize = Util.getPcmFrameSize(inputFormat.pcmEncoding, inputFormat.channelCount);
            AudioProcessor[] audioProcessorArr2 = R(inputFormat.pcmEncoding) ? this.g : this.f;
            this.e.c(inputFormat.encoderDelay, inputFormat.encoderPadding);
            if (Util.SDK_INT < 21 && inputFormat.channelCount == 8 && outputChannels == null) {
                iArr = new int[6];
                for (int i3 = 0; i3 < 6; i3++) {
                    iArr[i3] = i3;
                }
            } else {
                iArr = outputChannels;
            }
            this.d.a(iArr);
            AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(inputFormat.sampleRate, inputFormat.channelCount, inputFormat.pcmEncoding);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.AudioFormat audioFormatConfigure = audioProcessor.configure(audioFormat);
                    if (audioProcessor.isActive()) {
                        audioFormat = audioFormatConfigure;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e2) {
                    throw new AudioSink.ConfigurationException(e2, inputFormat);
                }
            }
            int i4 = audioFormat.encoding;
            i = audioFormat.sampleRate;
            iIntValue2 = Util.getAudioTrackChannelConfig(audioFormat.channelCount);
            audioProcessorArr = audioProcessorArr2;
            iIntValue = i4;
            pcmFrameSize2 = Util.getPcmFrameSize(i4, audioFormat.channelCount);
            i2 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i5 = inputFormat.sampleRate;
            if (S(inputFormat, this.t)) {
                audioProcessorArr = audioProcessorArr3;
                iIntValue = MimeTypes.getEncoding((String) Assertions.checkNotNull(inputFormat.sampleMimeType), inputFormat.codecs);
                iIntValue2 = Util.getAudioTrackChannelConfig(inputFormat.channelCount);
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                i = i5;
                i2 = 1;
            } else {
                Pair<Integer, Integer> pairS = s(inputFormat, this.a);
                if (pairS == null) {
                    String strValueOf = String.valueOf(inputFormat);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(strValueOf);
                    throw new AudioSink.ConfigurationException(sb.toString(), inputFormat);
                }
                audioProcessorArr = audioProcessorArr3;
                iIntValue = ((Integer) pairS.first).intValue();
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                iIntValue2 = ((Integer) pairS.second).intValue();
                i = i5;
                i2 = 2;
            }
        }
        if (iIntValue == 0) {
            String strValueOf2 = String.valueOf(inputFormat);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i2);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new AudioSink.ConfigurationException(sb2.toString(), inputFormat);
        }
        if (iIntValue2 != 0) {
            this.Y = false;
            b bVar = new b(inputFormat, pcmFrameSize, i2, pcmFrameSize2, i, iIntValue2, iIntValue, specifiedBufferSize, this.k, audioProcessorArr);
            if (B()) {
                this.q = bVar;
                return;
            } else {
                this.r = bVar;
                return;
            }
        }
        String strValueOf3 = String.valueOf(inputFormat);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 54);
        sb3.append("Invalid output channel config (mode=");
        sb3.append(i2);
        sb3.append(") for: ");
        sb3.append(strValueOf3);
        throw new AudioSink.ConfigurationException(sb3.toString(), inputFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        if (this.W) {
            this.W = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
        Assertions.checkState(Util.SDK_INT >= 21);
        Assertions.checkState(this.T);
        if (this.W) {
            return;
        }
        this.W = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
        if (Util.SDK_INT < 25) {
            flush();
            return;
        }
        this.o.a();
        this.n.a();
        if (B()) {
            J();
            if (this.i.j()) {
                this.s.pause();
            }
            this.s.flush();
            this.i.r();
            AudioTrackPositionTracker audioTrackPositionTracker = this.i;
            AudioTrack audioTrack = this.s;
            b bVar = this.r;
            audioTrackPositionTracker.t(audioTrack, bVar.c == 2, bVar.g, bVar.d, bVar.h);
            this.F = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (B()) {
            J();
            if (this.i.j()) {
                this.s.pause();
            }
            if (D(this.s)) {
                ((f) Assertions.checkNotNull(this.m)).b(this.s);
            }
            AudioTrack audioTrack = this.s;
            this.s = null;
            if (Util.SDK_INT < 21 && !this.T) {
                this.U = 0;
            }
            b bVar = this.q;
            if (bVar != null) {
                this.r = bVar;
                this.q = null;
            }
            this.i.r();
            this.h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.o.a();
        this.n.a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean sourceEnded) {
        if (!B() || this.F) {
            return Long.MIN_VALUE;
        }
        return l(k(Math.min(this.i.d(sourceEnded), this.r.i(y()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int getFormatSupport(Format format) {
        if (!MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            return ((this.Y || !S(format, this.t)) && !E(format, this.a)) ? 0 : 2;
        }
        if (Util.isEncodingLinearPcm(format.pcmEncoding)) {
            int i = format.pcmEncoding;
            return (i == 2 || (this.c && i == 4)) ? 2 : 1;
        }
        int i2 = format.pcmEncoding;
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid PCM encoding: ");
        sb.append(i2);
        Log.w(m0, sb.toString());
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.k ? this.w : q();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return w().b;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean handleBuffer(ByteBuffer buffer, long presentationTimeUs, int encodedAccessUnitCount) throws Exception {
        ByteBuffer byteBuffer = this.K;
        Assertions.checkArgument(byteBuffer == null || buffer == byteBuffer);
        if (this.q != null) {
            if (!n()) {
                return false;
            }
            if (this.q.b(this.r)) {
                this.r = this.q;
                this.q = null;
                if (D(this.s) && this.l != 3) {
                    this.s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.s;
                    Format format = this.r.a;
                    audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
                    this.Z = true;
                }
            } else {
                G();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            j(presentationTimeUs);
        }
        if (!B()) {
            try {
                z();
            } catch (AudioSink.InitializationException e2) {
                if (e2.isRecoverable) {
                    throw e2;
                }
                this.n.b(e2);
                return false;
            }
        }
        this.n.a();
        if (this.F) {
            this.G = Math.max(0L, presentationTimeUs);
            this.E = false;
            this.F = false;
            if (this.k && Util.SDK_INT >= 23) {
                L(this.w);
            }
            j(presentationTimeUs);
            if (this.S) {
                play();
            }
        }
        if (!this.i.l(y())) {
            return false;
        }
        if (this.K == null) {
            Assertions.checkArgument(buffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!buffer.hasRemaining()) {
                return true;
            }
            b bVar = this.r;
            if (bVar.c != 0 && this.D == 0) {
                int iT = t(bVar.g, buffer);
                this.D = iT;
                if (iT == 0) {
                    return true;
                }
            }
            if (this.u != null) {
                if (!n()) {
                    return false;
                }
                j(presentationTimeUs);
                this.u = null;
            }
            long jN = this.G + this.r.n(x() - this.e.a());
            if (!this.E && Math.abs(jN - presentationTimeUs) > 200000) {
                this.p.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(presentationTimeUs, jN));
                this.E = true;
            }
            if (this.E) {
                if (!n()) {
                    return false;
                }
                long j = presentationTimeUs - jN;
                this.G += j;
                this.E = false;
                j(presentationTimeUs);
                AudioSink.Listener listener = this.p;
                if (listener != null && j != 0) {
                    listener.onPositionDiscontinuity();
                }
            }
            if (this.r.c == 0) {
                this.z += (long) buffer.remaining();
            } else {
                this.A += (long) (this.D * encodedAccessUnitCount);
            }
            this.K = buffer;
            this.L = encodedAccessUnitCount;
        }
        H(presentationTimeUs);
        if (!this.K.hasRemaining()) {
            this.K = null;
            this.L = 0;
            return true;
        }
        if (!this.i.k(y())) {
            return false;
        }
        Log.w(m0, "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        this.E = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        return B() && this.i.i(y());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        return !B() || (this.Q && !hasPendingData());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.S = false;
        if (B() && this.i.q()) {
            this.s.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.S = true;
        if (B()) {
            this.i.v();
            this.s.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.Q && B() && n()) {
            G();
            this.Q = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.g) {
            audioProcessor2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.t.equals(audioAttributes)) {
            return;
        }
        this.t = audioAttributes;
        if (this.W) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int audioSessionId) {
        if (this.U != audioSessionId) {
            this.U = audioSessionId;
            this.T = audioSessionId != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        if (this.V.equals(auxEffectInfo)) {
            return;
        }
        int i = auxEffectInfo.effectId;
        float f2 = auxEffectInfo.sendLevel;
        AudioTrack audioTrack = this.s;
        if (audioTrack != null) {
            if (this.V.effectId != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.s.setAuxEffectSendLevel(f2);
            }
        }
        this.V = auxEffectInfo;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.p = listener;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        PlaybackParameters playbackParameters2 = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        if (!this.k || Util.SDK_INT < 23) {
            K(playbackParameters2, getSkipSilenceEnabled());
        } else {
            L(playbackParameters2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean skipSilenceEnabled) {
        K(q(), skipSilenceEnabled);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float volume) {
        if (this.H != volume) {
            this.H = volume;
            M();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return getFormatSupport(format) != 0;
    }

    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessors, boolean enableFloatOutput) {
        this(audioCapabilities, new DefaultAudioProcessorChain(audioProcessors), enableFloatOutput, false, 0);
    }

    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessorChain audioProcessorChain, boolean enableFloatOutput, boolean enableAudioTrackPlaybackParams, int offloadMode) {
        this.a = audioCapabilities;
        this.b = (AudioProcessorChain) Assertions.checkNotNull(audioProcessorChain);
        int i = Util.SDK_INT;
        this.c = i >= 21 && enableFloatOutput;
        this.k = i >= 23 && enableAudioTrackPlaybackParams;
        this.l = i < 29 ? 0 : offloadMode;
        this.h = new ConditionVariable(true);
        this.i = new AudioTrackPositionTracker(new e(this, null));
        com.google.android.exoplayer2.audio.e eVar = new com.google.android.exoplayer2.audio.e();
        this.d = eVar;
        i iVar = new i();
        this.e = iVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new g(), eVar, iVar);
        Collections.addAll(arrayList, audioProcessorChain.getAudioProcessors());
        this.f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.g = new AudioProcessor[]{new com.google.android.exoplayer2.audio.f()};
        this.H = 1.0f;
        this.t = AudioAttributes.DEFAULT;
        this.U = 0;
        this.V = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.v = new c(playbackParameters, false, 0L, 0L, null);
        this.w = playbackParameters;
        this.P = -1;
        this.I = new AudioProcessor[0];
        this.J = new ByteBuffer[0];
        this.j = new ArrayDeque<>();
        this.n = new d<>(100L);
        this.o = new d<>(100L);
    }
}
