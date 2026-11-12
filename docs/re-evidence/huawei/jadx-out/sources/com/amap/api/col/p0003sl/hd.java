package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.core.AMapException;

/* JADX INFO: loaded from: classes4.dex */
public final class hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static li f2616a;

    public static void a(Context context, String str, long j, boolean z) {
        try {
            String strA = a(str, j, z);
            if (strA != null && strA.length() > 0) {
                if (f2616a == null) {
                    f2616a = new li(context, "sea", "9.7.4", "O002");
                }
                f2616a.a(strA);
                lj.a(f2616a, context);
            }
        } catch (Throwable th) {
            fu.a(th, "StatisticsUtil", "recordResponseAction");
        }
    }

    private static String a(String str, long j, boolean z) {
        try {
            return "{\"RequestPath\":\"" + str + "\",\"ResponseTime\":" + j + ",\"Success\":" + z + "}";
        } catch (Throwable th) {
            fu.a(th, "StatisticsUtil", "generateNetWorkResponseStatisticsEntity");
            return null;
        }
    }

    public static void a(String str, String str2, AMapException aMapException) {
        if (str != null) {
            String errorType = aMapException.getErrorType();
            String strA = a(aMapException);
            if (strA == null || strA.length() <= 0) {
                return;
            }
            jv.a(ft.a(true), str, errorType, str2, strA);
        }
    }

    private static String a(AMapException aMapException) {
        if (aMapException == null) {
            return null;
        }
        if (aMapException.getErrorLevel() == 0) {
            int errorCode = aMapException.getErrorCode();
            if (errorCode == 0) {
                return "4";
            }
            int iPow = (int) Math.pow(10.0d, Math.floor(Math.log10(errorCode)));
            return String.valueOf((errorCode % iPow) + (iPow * 4));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aMapException.getErrorCode());
        return sb.toString();
    }

    public static void a(Context context, String str, boolean z) {
        try {
            String strA = a(str, z);
            if (strA != null && strA.length() > 0) {
                li liVar = new li(context, "sea", "9.7.4", "O006");
                liVar.a(strA);
                lj.a(liVar, context);
            }
        } catch (Throwable th) {
            fu.a(th, "StatisticsUtil", "recordResponseAction");
        }
    }

    private static String a(String str, boolean z) {
        try {
            int iIndexOf = str.indexOf("?");
            int length = str.length();
            String strSubstring = "";
            if (iIndexOf > 0) {
                String strSubstring2 = str.substring(0, iIndexOf);
                int i = iIndexOf + 1;
                strSubstring = i < length ? str.substring(i) : "";
                str = strSubstring2;
            }
            return "{\"RequestPath\":\"" + str + "\",\"RequestParm\":\"" + strSubstring + "\",\"IsCacheRequest\":" + z + "}";
        } catch (Throwable th) {
            fu.a(th, "StatisticsUtil", "generateNetWorkResponseStatisticsEntity");
            return null;
        }
    }
}
