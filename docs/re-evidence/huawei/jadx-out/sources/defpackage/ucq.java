package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.R;
import health.compact.a.HuaweiHealth;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class ucq {
    public static void c(ucr ucrVar, int i) {
        if (ucrVar == null) {
            LogUtil.e("FaCardUtils", "jumpToServiceExpressCard faCardHelper == null");
        } else if (!b()) {
            LogUtil.e("FaCardUtils", "jumpToServiceExpressCard not SupportFaCardShow");
        } else {
            ucrVar.d(i);
        }
    }

    public static void c(ucr ucrVar) {
        if (ucrVar == null) {
            LogUtil.e("FaCardUtils", "setCardClickedSp faCardHelper == null");
        } else if (!b()) {
            LogUtil.e("FaCardUtils", "setCardClickedSp not SupportFaCardShow");
        } else {
            ucrVar.a();
        }
    }

    public static boolean d(ucr ucrVar) {
        if (ucrVar == null) {
            LogUtil.e("FaCardUtils", "isCardHaveClicked faCardHelper == null");
            return true;
        }
        if (!b()) {
            LogUtil.e("FaCardUtils", "isCardHaveClicked not SupportFaCardShow");
            return true;
        }
        return ucrVar.d();
    }

    public static void e(ucr ucrVar) {
        if (ucrVar == null) {
            LogUtil.e("FaCardUtils", "close faCardHelper == null");
        } else if (!b()) {
            LogUtil.e("FaCardUtils", "close not SupportFaCardShow");
        } else {
            ucrVar.e();
        }
    }

    public static ucr c(Activity activity, View view, int i) {
        if (!b()) {
            LogUtil.e("FaCardUtils", "createFaCardHelper not SupportFaCardShow");
            return null;
        }
        return new ucr(activity, view, i);
    }

    public static boolean b() {
        return LoginInit.getInstance(HuaweiHealth.a()).getIsLogined() && SystemInfo.e() && !LanguageUtil.bo(HuaweiHealth.a()) && !Utils.o();
    }

    public static void d(ucr ucrVar, int i) {
        if (ucrVar == null) {
            LogUtil.e("FaCardUtils", "close faCardHelper == null");
        } else if (!b()) {
            LogUtil.e("FaCardUtils", "close not SupportFaCardShow");
        } else {
            ucrVar.b(i);
        }
    }

    public static int e(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 2;
        }
        LogUtil.e("FaCardUtils", "type error: ", Integer.valueOf(i));
        return -1;
    }

    public static void a(int i, int i2, Intent intent) {
        int i3;
        int i4;
        if (i == 0) {
            i4 = 300;
            i3 = 400;
        } else {
            i3 = 500;
            i4 = 200;
        }
        if (i2 == i4 || i2 == i3) {
            int loadResultCode = etv.b().getLoadResultCode(intent);
            LogUtil.a("FaCardUtils", "onActivityResult loadResultCode:", Integer.valueOf(loadResultCode), " requestCode:", Integer.valueOf(i2));
            etv.b().addToDeskTopBi(intent, i2 == 200 ? 3 : 2);
            if (loadResultCode == 3) {
                ReleaseLogUtil.a("R_Sleep_FaCardUtils", "onActivityResult");
                qpx.e(BaseApplication.getContext(), R.string.wallet_unenable_country);
            }
        }
    }
}
