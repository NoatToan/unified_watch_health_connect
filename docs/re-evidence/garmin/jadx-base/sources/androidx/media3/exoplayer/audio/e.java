package androidx.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public class e implements DefaultAudioSink.c {
    public static AudioAttributes b(androidx.media3.common.d dVar, boolean z14) {
        return z14 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : dVar.a().f8185a;
    }

    public final AudioTrack a(AudioSink.a aVar, androidx.media3.common.d dVar, int i14) {
        boolean z14 = aVar.f8671d;
        int i15 = aVar.f8668a;
        int i16 = aVar.f8670c;
        int i17 = aVar.f8669b;
        int i18 = z.f70071a;
        if (i18 < 23) {
            return new AudioTrack(b(dVar, z14), z.p(i17, i16, i15), aVar.f8673f, 1, i14);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(dVar, z14)).setAudioFormat(z.p(i17, i16, i15)).setTransferMode(1).setBufferSizeInBytes(aVar.f8673f).setSessionId(i14);
        if (i18 >= 29) {
            sessionId.setOffloadedPlayback(aVar.f8672e);
        }
        return sessionId.build();
    }
}
