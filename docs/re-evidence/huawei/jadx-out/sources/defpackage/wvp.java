package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.ui.commonui.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class wvp {
    public static void d(int i) {
        LogUtil.j("ConstantValues", "errorCode = ", Integer.valueOf(i));
        Context context = BaseApplication.getContext();
        if (i == 1002 || i == 1004) {
            ThirdPartyLoginManager.getInstance().gotoStTimeActivity();
        } else if (i == 1003) {
            qpx.e(context, String.format(Locale.ENGLISH, context.getResources().getString(R.string.IDS_system_time_error), qrs.f(context)));
        } else {
            LogUtil.j("ConstantValues", "code not match");
        }
    }
}
