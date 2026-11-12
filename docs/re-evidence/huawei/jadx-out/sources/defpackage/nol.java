package defpackage;

import android.content.Context;
import com.huawei.secure.android.common.util.SafeString;

/* JADX INFO: loaded from: classes3.dex */
public class nol {

    static class e {
        public static nol e = new nol();
    }

    private nol() {
    }

    public static nol d() {
        return e.e;
    }

    public String e(Context context) {
        String strC = c(context);
        if (strC == null || strC.length() < 3) {
            return "";
        }
        return SafeString.substring(strC, 0, 3);
    }

    private String c(Context context) {
        return "";
    }
}
