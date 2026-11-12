package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class ipa {
    public static boolean a(Context context) {
        return SystemInfo.e(true) || !c(context);
    }

    private static boolean c(Context context) {
        if (context == null) {
            LogUtil.d("Step_StepCounterSupportUtil", "isTelephonyEnable() context is null!!");
            return false;
        }
        Object systemService = context.getSystemService("phone");
        return (systemService instanceof TelephonyManager) && ((TelephonyManager) systemService).getPhoneType() != 0;
    }

    public static boolean e(String str) {
        String androidId = FoundationCommonUtil.getAndroidId(BaseApplication.b());
        if (TextUtils.isEmpty(androidId)) {
            LogUtil.e("Step_StepCounterSupportUtil", " isLocalDevice phoneId is error");
            return false;
        }
        return androidId.equals(str);
    }
}
