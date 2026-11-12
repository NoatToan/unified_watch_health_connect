package defpackage;

import android.content.Context;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;

/* JADX INFO: loaded from: classes12.dex */
public class obf {
    private static boolean a(int i) {
        return i >= 0 && i < 2;
    }

    private static int a(Context context) {
        SubscriptionManager.from(context);
        return SubscriptionManager.getDefaultDataSubscriptionId();
    }

    public static String b(Context context) {
        if (context == null) {
            ocq.e("SimCardInfo", "Get imsi failed, context is null.");
            return null;
        }
        if (!obm.c("android.permission.READ_PHONE_STATE", context)) {
            ocq.e("SimCardInfo", "Get imsi failed, do not have READ_PHONE_STATE permission.");
            return null;
        }
        return ((TelephonyManager) context.getSystemService("phone")).createForSubscriptionId(a(context)).getSubscriberId();
    }

    public static String b(Context context, AuthParam authParam) {
        String strB;
        if (authParam != null) {
            strB = e(context, authParam.getSlotId());
        } else {
            strB = b(context);
        }
        ocq.e("SimCardInfo", "getImsi(), mAuthParam is null ");
        return strB;
    }

    public static String e(Context context, int i) {
        if (context == null) {
            ocq.e("SimCardInfo", "Get IMSI failed, context is null");
            return null;
        }
        if (!a(i)) {
            ocq.e("SimCardInfo", "Get IMSI failed, slotId is invalid");
            return null;
        }
        if (!obm.c("android.permission.READ_PHONE_STATE", context)) {
            ocq.e("SimCardInfo", "Get IMSI failed, do not have READ_PHONE_STATE permission.");
            return null;
        }
        return ((TelephonyManager) context.getSystemService("phone")).createForSubscriptionId(oco.e(context, i)).getSubscriberId();
    }
}
