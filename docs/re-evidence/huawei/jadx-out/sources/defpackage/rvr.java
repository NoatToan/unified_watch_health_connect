package defpackage;

import android.os.Build;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes17.dex */
public class rvr {
    public static boolean e() {
        if (Build.VERSION.SDK_INT == 28 && (BaseActivity.isFlyme() || BaseActivity.isMiui())) {
            LogUtil.a("VmallWebViewUtils", "android P: isFlyme or isMiui");
            return false;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        if (VersionControlUtil.isSupportOperationAccount() && !Utils.o()) {
            return true;
        }
        LogUtil.a("VmallWebViewUtils", "Is minor: ", Boolean.valueOf(LoginInit.getInstance(BaseApplication.getContext()).isMinorAccount()), ", is oversea: ", Boolean.valueOf(Utils.o()));
        return false;
    }
}
