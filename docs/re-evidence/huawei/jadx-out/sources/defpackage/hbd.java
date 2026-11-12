package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;

/* JADX INFO: loaded from: classes8.dex */
public class hbd {
    public static int e(String str, String str2, int i) {
        return d(str, str2, i, 0);
    }

    public static int d(String str, String str2, int i, int i2) {
        if (!TextUtils.isEmpty(str) && i >= 0) {
            String[] strArrSplit = str.split(str2);
            if (i < strArrSplit.length && strArrSplit.length != 0) {
                String str3 = strArrSplit[i];
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        return Integer.parseInt(str3);
                    } catch (NumberFormatException e) {
                        LogUtil.j("Suggestion_AudioVersionSplitUtil", "acquireValueByIndex: ", LogAnonymous.b(e));
                    }
                }
            }
        }
        return i2;
    }

    public static String e(String str, String str2, String str3) {
        return str3 + "_" + str + "_" + str2;
    }
}
