package wz2;

import android.os.Bundle;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    bundle.putString(URLDecoder.decode(strArrSplit[0]), URLDecoder.decode(strArrSplit[1]));
                }
            }
        }
        return bundle;
    }

    public static String b(Bundle bundle) {
        StringBuilder sb3 = new StringBuilder();
        boolean z14 = true;
        for (String str : bundle.keySet()) {
            if (bundle.get(str) instanceof String) {
                if (z14) {
                    z14 = false;
                } else {
                    sb3.append("&");
                }
                sb3.append(URLEncoder.encode(str) + "=" + URLEncoder.encode(bundle.getString(str)));
            }
        }
        return sb3.toString();
    }
}
