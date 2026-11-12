package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class yhr {
    public static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair<Long, Long> b(DrmSession drmSession) {
        Map<String, String> mapE = drmSession.e();
        if (mapE == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(mapE, "LicenseDurationRemaining")), Long.valueOf(a(mapE, "PlaybackDurationRemaining")));
    }
}
