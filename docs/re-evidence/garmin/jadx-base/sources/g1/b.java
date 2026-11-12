package g1;

import android.media.MediaCodecInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b extends x {
    public b(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        Objects.requireNonNull(this.f74799a.getAudioCapabilities());
    }
}
