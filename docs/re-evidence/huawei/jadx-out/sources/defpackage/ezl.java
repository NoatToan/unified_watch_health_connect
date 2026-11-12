package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.EnvironmentInfo;

/* JADX INFO: loaded from: classes28.dex */
public class ezl {
    public static int d(Context context, boolean z) {
        Context context2 = BaseApplication.getContext();
        Resources resources = context2.getResources();
        int i = (qrs.i(context) - resources.getDimensionPixelSize(R.dimen.dialogMarginStart)) - resources.getDimensionPixelSize(R.dimen.dialogMarginEnd);
        int iMin = i > 0 ? Math.min(i, 984) : 0;
        if (z && iMin > 0) {
            return iMin;
        }
        if (!EnvironmentInfo.m() && !qrs.ah(context2)) {
            return qjs.c(true, 0);
        }
        int iC = qjs.c(false, 3);
        int iMin2 = iMin > 0 ? Math.min(iMin, iC) : iC;
        if (qrs.ab(context)) {
            int i2 = (iC * 1764) / 984;
            int iM = qrs.m();
            LogUtil.a("HL_ServicesUIDialogUtils", "getWidth columnWidth ", Integer.valueOf(iC), " height ", Integer.valueOf(i2), " screenHeight ", Integer.valueOf(iM));
            if (i2 > iM) {
                return (iM * 984) / 1764;
            }
        }
        return iMin2;
    }

    public static int a(Context context, boolean z, int i) {
        if (!z) {
            return i;
        }
        Resources resources = com.huawei.haf.application.BaseApplication.b().getResources();
        int iG = (qrs.g(context) - resources.getDimensionPixelSize(R.dimen.dialogMarginBottom)) - resources.getDimensionPixelSize(R.dimen.dialogMarginBottom);
        LogUtil.a("HL_ServicesUIDialogUtils", "getHeight height ", Integer.valueOf(i), " windowHeight ", Integer.valueOf(iG));
        if (iG > 0 && iG < i) {
            i = iG;
        }
        return Math.min(i, 984);
    }
}
