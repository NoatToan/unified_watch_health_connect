package defpackage;

import android.content.Context;
import com.amap.api.services.core.AMapException;

/* JADX INFO: loaded from: classes4.dex */
public final class uxs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f6t f36265a;

    public static String a(AMapException aMapException) {
        if (aMapException == null) {
            return null;
        }
        if (aMapException.getErrorLevel() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(aMapException.getErrorCode());
            return sb.toString();
        }
        int errorCode = aMapException.getErrorCode();
        if (errorCode == 0) {
            return "4";
        }
        int iPow = (int) Math.pow(10.0d, Math.floor(Math.log10(errorCode)));
        return String.valueOf((errorCode % iPow) + (iPow * 4));
    }

    public static String b(String str, long j, boolean z) {
        try {
            return "{\"RequestPath\":\"" + str + "\",\"ResponseTime\":" + j + ",\"Success\":" + z + "}";
        } catch (Throwable th) {
            xts.i(th, "StatisticsUtil", "generateNetWorkResponseStatisticsEntity");
            return null;
        }
    }

    public static String c(String str, boolean z) {
        try {
            String strSubstring = "";
            int iIndexOf = str.indexOf("?");
            int length = str.length();
            if (iIndexOf > 0) {
                String strSubstring2 = str.substring(0, iIndexOf);
                int i = iIndexOf + 1;
                strSubstring = i < length ? str.substring(i) : "";
                str = strSubstring2;
            }
            return "{\"RequestPath\":\"" + str + "\",\"RequestParm\":\"" + strSubstring + "\",\"IsCacheRequest\":" + z + "}";
        } catch (Throwable th) {
            xts.i(th, "StatisticsUtil", "generateNetWorkResponseStatisticsEntity");
            return null;
        }
    }

    public static void d(Context context, String str, long j, boolean z) {
        try {
            String strB = b(str, j, z);
            if (strB != null && strB.length() > 0) {
                if (f36265a == null) {
                    f36265a = new f6t(context, "sea", "9.7.4", "O002");
                }
                f36265a.a(strB);
                g6t.e(f36265a, context);
            }
        } catch (Throwable th) {
            xts.i(th, "StatisticsUtil", "recordResponseAction");
        }
    }

    public static void e(Context context, String str, boolean z) {
        try {
            String strC = c(str, z);
            if (strC != null && strC.length() > 0) {
                f6t f6tVar = new f6t(context, "sea", "9.7.4", "O006");
                f6tVar.a(strC);
                g6t.e(f6tVar, context);
            }
        } catch (Throwable th) {
            xts.i(th, "StatisticsUtil", "recordResponseAction");
        }
    }

    public static void f(String str, String str2, AMapException aMapException) {
        if (str != null) {
            String errorType = aMapException.getErrorType();
            String strA = a(aMapException);
            if (strA == null || strA.length() <= 0) {
                return;
            }
            m2t.k(wts.a(true), str, errorType, str2, strA);
        }
    }
}
