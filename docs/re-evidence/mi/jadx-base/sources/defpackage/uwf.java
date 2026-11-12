package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.smarthome.frame.process.ProcessUtil;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.SharePrefsManager;
import com.xiaomi.smarthome.library.securecompact.SettingsSecureCompat;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class uwf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SharedPreferences f36217a = SharePrefsManager.getSharedPrefs(MiJiaEnvironment.getAppContext(), a.e(MiJiaEnvironment.getAppContext()));

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f36218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f36219b;
        public static String c;

        public static String b(Context context) {
            String strF;
            if (TextUtils.isEmpty(f36218a)) {
                strF = f(SettingsSecureCompat.getAndroidId() + d());
            } else {
                strF = f36218a;
            }
            f36219b = strF;
            return strF;
        }

        public static byte[] c(String str) {
            return str != null ? str.getBytes(StandardCharsets.UTF_8) : new byte[0];
        }

        public static String d() {
            return Build.SERIAL;
        }

        public static String e(Context context) {
            if (TextUtils.isEmpty(c)) {
                String currentProcessName = ProcessUtil.getCurrentProcessName(context);
                if (TextUtils.equals(currentProcessName, context.getPackageName())) {
                    c = "mistat";
                } else {
                    c = "mistat" + f(currentProcessName);
                }
            }
            return c;
        }

        public static String f(String str) {
            if (str == null) {
                return null;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(c(str));
                return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
            } catch (NoSuchAlgorithmException unused) {
                return str;
            }
        }
    }

    public static String a(Context context) {
        return a.b(context);
    }
}
