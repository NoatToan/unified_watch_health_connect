package d1;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import androidx.camera.video.internal.audio.d;
import k0.h;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private a() {
    }

    public static AudioRecordingConfiguration a(AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static boolean b(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static void c(AudioRecord audioRecord, h hVar, d.a aVar) {
        audioRecord.registerAudioRecordingCallback(hVar, aVar);
    }

    public static void d(AudioRecord audioRecord, d.a aVar) {
        audioRecord.unregisterAudioRecordingCallback(aVar);
    }
}
