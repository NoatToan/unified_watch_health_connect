package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public class dyq {
    private static double b(double d, double d2) {
        if (d2 == 0.0d) {
            return 0.0d;
        }
        double d3 = 10;
        if (((int) ((d / d2) % d3)) + ((int) ((d2 / d2) % d3)) == 10) {
            return 0.0d;
        }
        return d2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    public static boolean d(String str, float f) {
        byte b2;
        if (str == null) {
            LogUtil.j("PluginDevice_ScaleCommonUtil", "check weight legal, null productId");
            return f >= 20.0f;
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 299435131) {
            if (iHashCode != 759413903) {
                if (iHashCode == 912505950 && str.equals("b29df4e3-b1f7-4e40-960d-4cfb63ccca05")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("c943c933-442e-4c34-bcd0-66597f24aaed")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("e835d102-af95-48a6-ae13-2983bc06f5c0")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        return f >= ((b2 == 0 || b2 == 1 || b2 == 2) ? 10.0f : 20.0f);
    }

    public static int b(double d, String str) {
        if (!TextUtils.isEmpty(str)) {
            return ((dxm.y(str) || "c943c933-442e-4c34-bcd0-66597f24aaed".equals(str)) && !(((CommonUtil.a(String.valueOf(new BigDecimal(b(d, 1.0E-4d) + d).setScale(2, 4))) - CommonUtil.a(String.valueOf(new BigDecimal(d + b(d, 0.001d)).setScale(1, 4)))) > 0.0d ? 1 : ((CommonUtil.a(String.valueOf(new BigDecimal(b(d, 1.0E-4d) + d).setScale(2, 4))) - CommonUtil.a(String.valueOf(new BigDecimal(d + b(d, 0.001d)).setScale(1, 4)))) == 0.0d ? 0 : -1)) == 0)) ? 2 : 1;
        }
        LogUtil.j("PluginDevice_ScaleCommonUtil", "getFractionDigitForWeight productId is null");
        return 1;
    }

    public static String a(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        if (TextUtils.isEmpty(accountInfo)) {
            accountInfo = "SG";
        }
        if ("c943c933-442e-4c34-bcd0-66597f24aaed".equals(str)) {
            if (Utils.o()) {
                return GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainTipsResDbankcdnNew", accountInfo);
            }
            return GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("helpCustomerUrl", accountInfo);
        }
        if ("b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(str)) {
            if (Utils.o()) {
                return GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainTipsResDbankcdnNew", accountInfo);
            }
            return GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainTipsResDbankcdn", accountInfo);
        }
        return GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainTipsResDbankcdn", accountInfo);
    }
}
