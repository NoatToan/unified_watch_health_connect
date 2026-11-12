package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class iqp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConnectivityManager f37974c;

    public static boolean b(Context context) {
        return d() && c(context) && a(context);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a A[PHI: r0 r7
      0x004a: PHI (r0v3 java.lang.String) = (r0v1 java.lang.String), (r0v6 java.lang.String) binds: [B:14:0x0048, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r7v3 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:14:0x0048, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    public static String e(Context context) {
        String string = "";
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/1"), null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("homecountry"));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (IllegalArgumentException e) {
                LogUtil.a(".NetAndSimUtil", "close cursor error: " + e.toString());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return TextUtils.isEmpty(string) ? Locale.getDefault().getCountry() : string;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static boolean a(Context context) {
        boolean zEqualsIgnoreCase = "TW".equalsIgnoreCase(e(context));
        LogUtil.a(".NetAndSimUtil", "isTwNet" + zEqualsIgnoreCase);
        return zEqualsIgnoreCase;
    }

    public static boolean d() {
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a(".NetAndSimUtil", "isRom countryVersion is empty");
            return false;
        }
        if (strC.contains("C636")) {
            LogUtil.a(".NetAndSimUtil", "isYaTaiRom countryVersion is c636");
            return true;
        }
        LogUtil.a(".NetAndSimUtil", "isYaTaiRom countryVersion is not c636");
        return false;
    }

    public static String c() {
        return Build.DISPLAY;
    }

    public static boolean c(Context context) {
        if (context.getSystemService("connectivity") instanceof ConnectivityManager) {
            f37974c = (ConnectivityManager) context.getSystemService("connectivity");
        }
        NetworkInfo networkInfo = f37974c.getNetworkInfo(1);
        return networkInfo != null && networkInfo.isAvailable();
    }
}
