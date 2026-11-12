package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes20.dex */
public class xni {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f53195b = true;
    private static String i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f53194a = new byte[0];
    private static final boolean d = c();
    private static byte[] f = new byte[2048];
    private static int e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f53196c = 0;

    private static int b(int i2) {
        int i3 = i2 + 1;
        if (i3 == 2048) {
            return 0;
        }
        return i3;
    }

    private static void d(byte b2) {
        int i2 = e;
        if (i2 >= 0) {
            byte[] bArr = f;
            if (i2 < bArr.length) {
                bArr[i2] = b2;
            }
        }
        e = b(i2);
        int i3 = f53196c;
        f53196c = i3 != 2048 ? i3 + 1 : 2048;
    }

    public static void b(String str) {
        byte[] bytes = new byte[0];
        try {
            bytes = (new SimpleDateFormat("MM-dd HH:mm:ss.SSS").format(new Date()) + " " + str + "\r\n").getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            Log.w("wallet_OverSea", "putStr() UnsupportedEncodingException");
        }
        synchronized (f53194a) {
            for (byte b2 : bytes) {
                d(b2);
            }
        }
    }

    public static String e() {
        int i2 = f53196c;
        if (i2 > 0) {
            try {
                byte[] bArr = f;
                if (i2 > 2048) {
                    i2 = 2048;
                }
                return new String(bArr, 0, i2, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                Log.w("wallet_OverSea", "toString() UnsupportedEncodingException");
                return "";
            }
        }
        return "";
    }

    static boolean b() {
        boolean z = false;
        if (i == null) {
            d();
            return false;
        }
        if (f53195b) {
            if (d() || d) {
                z = true;
            } else {
                Log.isLoggable("wallet_OverSea", 3);
            }
            f53195b = z;
            Log.i("wallet_OverSea", "isDebugLogEnable" + f53195b);
            return f53195b;
        }
        Log.i("wallet_OverSea", "isDebugLogEnable" + f53195b);
        return false;
    }

    public static boolean d() {
        if (xml.d() == null || !OverSeaMangerUtil.a(xml.d()).d()) {
            return false;
        }
        i = "Debug";
        return true;
    }

    private static boolean c() {
        if (d()) {
            return true;
        }
        try {
            return Log.class.getDeclaredField("HWLog").getBoolean(null);
        } catch (IllegalAccessException unused) {
            Log.e("wallet_OverSea", "getHWLog is IllegalAccessException", null);
            return false;
        } catch (IllegalArgumentException unused2) {
            Log.e("wallet_OverSea", "getHWLog is IllegalArgumentException", null);
            return false;
        } catch (NoSuchFieldException unused3) {
            Log.e("wallet_OverSea", "[getHWLog]:  can not find HwLog!");
            return false;
        }
    }

    private static String a(String str) {
        return "wallet_OverSea_" + str;
    }

    private static String d(String str, String str2, Throwable th, boolean z) {
        StringBuilder sb = new StringBuilder(256);
        if (!TextUtils.isEmpty(str2)) {
            if (!d() && z) {
                sb.append(e(str2));
            } else {
                sb.append(str2);
            }
        }
        if (th != null) {
            sb.append("    ");
            sb.append(Log.getStackTraceString(th));
        }
        if (d()) {
            return sb.toString();
        }
        return sb.toString().replaceAll("(https?|ftp|file):\\/\\/[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]", "***");
    }

    public static void d(String str, String str2, boolean z) {
        if (b() && !TextUtils.isEmpty(str2)) {
            String strD = d(str, str2, null, z);
            String strA = a(str);
            if (d()) {
                xnc.d(strA, strD);
            }
        }
    }

    public static void e(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strD = d(str, str2, null, z);
        String strA = a(str);
        Log.i(strA, strD);
        xnc.d(strA, strD);
    }

    public static void c(String str, String str2, Throwable th, boolean z) {
        if (TextUtils.isEmpty(str2) && th == null) {
            return;
        }
        String strD = d(str, str2, th, z);
        String strA = a(str);
        if (d()) {
            Log.e(strA, strD);
        } else {
            Log.e(strA, d(str, str2, null, z));
        }
        xnc.c(strA, strD);
    }

    @Deprecated
    public static String e(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static String e(String str) {
        return TextUtils.isEmpty(str) ? str : " Can not print sensitive information.";
    }
}
