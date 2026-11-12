package defpackage;

import android.text.TextUtils;
import com.google.android.clockwork.companion.partnerapi.SmartWatchInfo;

/* JADX INFO: loaded from: classes10.dex */
public class lnm {
    private static SmartWatchInfo d;

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.endsWith("smart_watch") ? str.substring(0, str.length() - 11) : str;
    }

    public static SmartWatchInfo c() {
        return d;
    }
}
