package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.account.privacy_data.master.PrivacyDataMaster;
import com.xiaomi.account.privacy_data.master.PrivacyDataType;
import com.xiaomi.accountsdk.utils.AccountLogger;

/* JADX INFO: loaded from: classes11.dex */
public class ccm {
    public static boolean a(Context context, int i) {
        if (TextUtils.isEmpty(pth.g(context).e(i).c)) {
            return false;
        }
        String strForceGet = PrivacyDataMaster.forceGet(context, PrivacyDataType.SIM_IN_SERVICE, String.valueOf(i), String.valueOf(3000L));
        if (strForceGet != null) {
            return Boolean.parseBoolean(strForceGet);
        }
        AccountLogger.log("SimState", "unknown state");
        return false;
    }
}
