package wb2;

import android.text.TextUtils;
import ch.qos.logback.classic.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 {
    private h0() {
    }

    public static String a(long j8) {
        StringBuilder sb3 = new StringBuilder();
        if (!TextUtils.isEmpty(null) || j8 > -1) {
            String str = (TextUtils.isEmpty(null) || j8 <= -1) ? "" : "/";
            sb3.append(" [");
            if (!TextUtils.isEmpty(null)) {
                sb3.append((String) null);
            }
            sb3.append(str);
            if (j8 > -1) {
                sb3.append(j8);
            }
            sb3.append("] ");
        }
        return sb3.toString();
    }

    public static String b(long j8, String str, String str2) {
        StringBuilder sb3 = new StringBuilder("SYNC#");
        sb3.append(str);
        if (!TextUtils.isEmpty(str2) || j8 > -1) {
            String str3 = (TextUtils.isEmpty(str2) || j8 <= -1) ? "" : "/";
            sb3.append(" [");
            if (!TextUtils.isEmpty(str2)) {
                sb3.append(str2);
            }
            sb3.append(str3);
            if (j8 > -1) {
                sb3.append(j8);
            }
            sb3.append("]");
        }
        return sb3.toString();
    }

    public static void c(Logger logger, String str, boolean z14) {
        if (z14) {
            logger.error(str);
        } else {
            logger.debug(str);
        }
    }
}
