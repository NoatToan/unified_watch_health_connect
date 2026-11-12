package linc.com.amplituda;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class AmplitudaLogger {
    private static final String LIB_TAG = "AMPLITUDA";
    static final String OPERATION_PREPARING = "Preparing";
    static final String OPERATION_PROCESSING = "Processing";
    private static boolean enable = false;
    private static int priority = 3;

    public static synchronized void enable(boolean z14) {
        enable = z14;
    }

    public static synchronized void log(String str) {
        if (enable) {
            Log.println(priority, LIB_TAG, str);
        }
    }

    public static synchronized void logOperationTime(String str, long j8) {
        log(String.format(Locale.getDefault(), "%s time: %.04f seconds", str, Float.valueOf((System.currentTimeMillis() - j8) / 1000.0f)));
    }

    public static synchronized void priority(int i14) {
        priority = i14;
    }
}
