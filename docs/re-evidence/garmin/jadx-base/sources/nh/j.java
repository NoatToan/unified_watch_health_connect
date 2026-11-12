package nh;

import android.text.TextUtils;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class j {
    public static String a(String str) {
        String strSubstring = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(";");
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            if (strArrSplit[i14].startsWith("result={") && strArrSplit[i14].endsWith(StringSubstitutor.DEFAULT_VAR_END)) {
                String str2 = strArrSplit[i14];
                String[] strArrSplit2 = str2.substring(8, str2.length() - 1).split("&");
                for (int i15 = 0; i15 < strArrSplit2.length; i15++) {
                    if (strArrSplit2[i15].startsWith("trade_token=\"") && strArrSplit2[i15].endsWith("\"")) {
                        strSubstring = fb1.c.m(1, 13, strArrSplit2[i15]);
                        break;
                    }
                    if (strArrSplit2[i15].startsWith("trade_token=")) {
                        strSubstring = strArrSplit2[i15].substring(12);
                        break;
                    }
                }
            }
        }
        return strSubstring;
    }
}
