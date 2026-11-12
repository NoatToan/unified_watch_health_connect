package g1;

import android.media.MediaCodecInfo;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f74799a;

    public x(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f74799a = capabilitiesForType;
        } catch (RuntimeException e4) {
            throw new InvalidConfigException(fb1.c.n("Unable to get CodecCapabilities for mime: ", str), e4);
        }
    }
}
