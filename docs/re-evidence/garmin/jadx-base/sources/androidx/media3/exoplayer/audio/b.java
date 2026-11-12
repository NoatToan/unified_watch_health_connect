package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.common.q;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.h;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f8766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f8767b;

        public a(Handler handler, b bVar) {
            if (bVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f8766a = handler;
            this.f8767b = bVar;
        }

        public final void a(g gVar) {
            synchronized (gVar) {
            }
            Handler handler = this.f8766a;
            if (handler != null) {
                handler.post(new ka.d(this, gVar, 1));
            }
        }
    }

    default void C(g gVar) {
    }

    default void G(q qVar, h hVar) {
    }

    default void I(g gVar) {
    }

    default void P(AudioSink.a aVar) {
    }

    default void S(AudioSink.a aVar) {
    }

    default void onAudioCodecError(Exception exc) {
    }

    default void onAudioDecoderInitialized(String str, long j8, long j14) {
    }

    default void onAudioDecoderReleased(String str) {
    }

    default void onAudioPositionAdvancing(long j8) {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onAudioUnderrun(int i14, long j8, long j14) {
    }

    default void onSkipSilenceEnabledChanged(boolean z14) {
    }
}
