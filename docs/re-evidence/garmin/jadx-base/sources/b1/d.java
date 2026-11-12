package b1;

import com.google.maps.android.BuildConfig;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private d() {
    }

    public static String a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return BuildConfig.TRAVIS;
        }
        int iPosition = byteBuffer.position();
        try {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr);
            StringBuilder sb3 = new StringBuilder();
            for (int i14 = 0; i14 < iRemaining; i14++) {
                sb3.append(String.format("%02X ", Byte.valueOf(bArr[i14])));
            }
            return sb3.toString().trim();
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static String b(long j8) {
        long j14 = j8 / 1000;
        long j15 = j14 / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (j14 - timeUnit.toMillis(j15)) / 60000;
        long millis2 = j14 - timeUnit.toMillis(j15);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long millis3 = (millis2 - timeUnit2.toMillis(millis)) / 1000;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(j15), Long.valueOf(millis), Long.valueOf(millis3), Long.valueOf(((j14 - timeUnit.toMillis(j15)) - timeUnit2.toMillis(millis)) - TimeUnit.SECONDS.toMillis(millis3)));
    }
}
