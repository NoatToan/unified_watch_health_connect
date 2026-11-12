package defpackage;

import android.content.Context;
import android.media.AudioManager;
import androidx.annotation.RequiresApi;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class g83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UUID f18708a = new UUID(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f18709b = new UUID(1186680826959645954L, -5988876978535335093L);
    public static final UUID c = new UUID(-2129748144642739255L, 8654423357094679310L);
    public static final UUID d = new UUID(-1301668207276963122L, -6645017420763422227L);
    public static final UUID e = new UUID(-7348484286925749626L, -6083546864340672619L);

    @RequiresApi(21)
    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static String b(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long c(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long d(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }
}
