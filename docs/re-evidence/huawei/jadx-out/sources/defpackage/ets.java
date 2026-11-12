package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;

/* JADX INFO: loaded from: classes7.dex */
public class ets {
    public static boolean e() {
        if (!TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010))) {
            return false;
        }
        LogUtil.j("EmotionUtils", "countryCode is empty");
        return true;
    }
}
