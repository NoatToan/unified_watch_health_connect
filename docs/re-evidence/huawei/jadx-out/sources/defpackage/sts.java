package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class sts {
    public static boolean a(String str) {
        String str2;
        if (!str.contains("h5proapp?pkg=")) {
            return false;
        }
        String[] strArrSplit = str.split("h5proapp\\?pkg=");
        if (strArrSplit.length < 2) {
            LogUtil.a("QrCodeH5Utils", "tryJumpH5ProApp: urlPartsRaw.length is", Integer.valueOf(strArrSplit.length));
            return false;
        }
        String str3 = strArrSplit[1].split("&")[0];
        if (TextUtils.isEmpty(str3)) {
            LogUtil.a("QrCodeH5Utils", "tryJumpH5ProApp: pkg name empty");
            return false;
        }
        String[] strArrSplit2 = str.split("h5proapp\\?pkg=" + str3);
        if (strArrSplit2.length < 2) {
            str2 = "";
        } else {
            str2 = strArrSplit2[1];
        }
        String str4 = str3 + "?h5pro=true" + str2;
        LogUtil.a("QrCodeH5Utils", "tryJumpH5ProApp: ", str4);
        ddv.b().startOperationWebPage(jbg.a(), str4);
        return true;
    }
}
