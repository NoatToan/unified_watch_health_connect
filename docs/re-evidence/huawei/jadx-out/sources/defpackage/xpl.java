package defpackage;

import android.content.Context;
import com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil;

/* JADX INFO: loaded from: classes46.dex */
public class xpl {
    public static String e(Context context, String str, String str2) {
        String strN = OverSeaMangerUtil.a(context).b().n();
        return b(context, str, str2) + "?clientVersion=" + strN;
    }

    public static String b(Context context, String str, String str2) {
        xot.d();
        String strE = xot.e(context, str2, OverSeaMangerUtil.a(context).b().e());
        if (!xpi.d(strE, true) && strE.contains("/WiseCloudWalletPassService/app/gateway") && strE.endsWith("/WiseCloudWalletPassService/app/gateway")) {
            return strE.replace("/WiseCloudWalletPassService/app/gateway", str);
        }
        return strE + str;
    }
}
