package androidx.media3.exoplayer.audio;

import am.j;
import android.media.AudioDeviceInfo;
import androidx.media3.common.q;
import androidx.media3.common.y;
import ds.e0;
import i3.e5;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface AudioSink {

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        /* JADX WARN: Illegal instructions before constructor call */
        public UnexpectedDiscontinuityException(long j8, long j14) {
            StringBuilder sbK = e0.k(j14, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
            sbK.append(j8);
            super(sbK.toString());
            this.actualPresentationTimeUs = j8;
            this.expectedPresentationTimeUs = j14;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final q format;
        public final boolean isRecoverable;

        public WriteException(int i14, q qVar, boolean z14) {
            super(j.h(i14, "AudioTrack write failed: "));
            this.isRecoverable = z14;
            this.errorCode = i14;
            this.format = qVar;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f8671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f8672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8673f;

        public a(int i14, int i15, int i16, boolean z14, boolean z15, int i17) {
            this.f8668a = i14;
            this.f8669b = i15;
            this.f8670c = i16;
            this.f8671d = z14;
            this.f8672e = z15;
            this.f8673f = i17;
        }
    }

    public interface b {
    }

    boolean a(q qVar);

    void b(y yVar);

    default void c(int i14) {
    }

    default void d(ja.q qVar) {
    }

    void disableTunneling();

    void e(androidx.media3.common.d dVar);

    void enableTunnelingV21();

    void f(f.b bVar);

    void flush();

    void g(q qVar, int[] iArr);

    long getCurrentPositionUs(boolean z14);

    y getPlaybackParameters();

    int h(q qVar);

    boolean handleBuffer(ByteBuffer byteBuffer, long j8, int i14);

    void handleDiscontinuity();

    boolean hasPendingData();

    void i(androidx.media3.common.f fVar);

    boolean isEnded();

    default ka.c j(q qVar) {
        return ka.c.f103666d;
    }

    default void k(int i14, int i15) {
    }

    default void l(fa.c cVar) {
    }

    void pause();

    void play();

    void playToEndOfStream();

    default void release() {
    }

    void reset();

    void setAudioSessionId(int i14);

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    void setSkipSilenceEnabled(boolean z14);

    void setVolume(float f14);

    public static final class ConfigurationException extends Exception {
        public final q format;

        public ConfigurationException(Throwable th3, q qVar) {
            super(th3);
            this.format = qVar;
        }

        public ConfigurationException(String str, q qVar) {
            super(str);
            this.format = qVar;
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final q format;
        public final boolean isRecoverable;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i14, int i15, int i16, int i17, q qVar, boolean z14, Exception exc) {
            StringBuilder sbJ = e5.j(i14, i15, "AudioTrack init failed ", " Config(", ", ");
            e0.m(i16, i17, ", ", ") ", sbJ);
            sbJ.append(qVar);
            sbJ.append(z14 ? " (recoverable)" : "");
            this(sbJ.toString(), i14, qVar, z14, exc);
        }

        public InitializationException(String str, int i14, q qVar, boolean z14, Throwable th3) {
            super(str, th3);
            this.audioTrackState = i14;
            this.isRecoverable = z14;
            this.format = qVar;
        }
    }
}
