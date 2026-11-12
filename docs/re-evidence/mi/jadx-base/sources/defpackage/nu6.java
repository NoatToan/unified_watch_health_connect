package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class nu6 {
    public static int a(int i) {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.ROOT);
            if ((lowerCase.contains("avc") || lowerCase.contains("h264")) && lowerCase.contains("enc")) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if ("video/avc".equals(str)) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                            if (codecProfileLevel.profile == i) {
                                return codecProfileLevel.level;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}
