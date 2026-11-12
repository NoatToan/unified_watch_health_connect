package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ljo {
    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("##");
        if (strArrSplit.length > 0) {
            return strArrSplit[0];
        }
        return null;
    }

    public static int a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String[] strArrSplit = str.split("##");
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            try {
                return Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                LogUtil.e("TAG", "getAppInfoUid() NumberFormatException");
            }
        }
        return 0;
    }
}
