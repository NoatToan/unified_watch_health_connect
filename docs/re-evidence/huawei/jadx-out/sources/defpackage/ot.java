package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes21.dex */
public class ot {
    public static void d(on onVar, Context context, String str) {
        try {
            String strE = e(str);
            oq.b("mspl", "trade token: " + strE);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            or.c(onVar, context, "pref_trade_token", strE);
        } catch (Throwable th) {
            mu.c(onVar, "biz", "SaveTradeTokenError", th);
            oq.c(th);
        }
    }

    public static String e(String str) {
        String strSubstring = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";");
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].startsWith("result={") && strArrSplit[i].endsWith("}")) {
                String str2 = strArrSplit[i];
                String[] strArrSplit2 = str2.substring(8, str2.length() - 1).split("&");
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    if (strArrSplit2[i2].startsWith("trade_token=\"") && strArrSplit2[i2].endsWith("\"")) {
                        String str3 = strArrSplit2[i2];
                        strSubstring = str3.substring(13, str3.length() - 1);
                        break;
                    }
                    if (strArrSplit2[i2].startsWith("trade_token=")) {
                        strSubstring = strArrSplit2[i2].substring(12);
                        break;
                    }
                }
            }
        }
        return strSubstring;
    }

    public static String a(on onVar, Context context) {
        String strD = or.d(onVar, context, "pref_trade_token", "");
        oq.b("mspl", "get trade token: " + strD);
        return strD;
    }
}
