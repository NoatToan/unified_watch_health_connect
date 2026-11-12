package ja;

import android.os.Looper;
import androidx.media3.common.z;
import androidx.media3.exoplayer.audio.AudioSink;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public interface a extends z.d, androidx.media3.exoplayer.source.k, xa.c.a, androidx.media3.exoplayer.drm.b {
    void A(androidx.media3.exoplayer.g gVar);

    void C(androidx.media3.exoplayer.g gVar);

    void G(androidx.media3.common.q qVar, androidx.media3.exoplayer.h hVar);

    void I(androidx.media3.exoplayer.g gVar);

    void L8(int i14, int i15, boolean z14);

    void M3(ImmutableList immutableList, androidx.media3.exoplayer.source.j.b bVar);

    void P(AudioSink.a aVar);

    void S(AudioSink.a aVar);

    void V4(b bVar);

    void f5();

    void notifySeekStarted();

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j8, long j14);

    void onAudioDecoderReleased(String str);

    void onAudioPositionAdvancing(long j8);

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i14, long j8, long j14);

    void onDroppedFrames(int i14, long j8);

    void onRenderedFirstFrame(Object obj, long j8);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j8, long j14);

    void onVideoDecoderReleased(String str);

    void onVideoFrameProcessingOffset(long j8, int i14);

    void p(androidx.media3.exoplayer.g gVar);

    void s2(z zVar, Looper looper);

    void z(androidx.media3.common.q qVar, androidx.media3.exoplayer.h hVar);
}
