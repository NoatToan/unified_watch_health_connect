package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes.dex */
public class ied {
    public static int e() {
        if (c()) {
            return 0;
        }
        String strE = buh.e("coachGenderConfig");
        if (TextUtils.isEmpty(strE)) {
            return 1;
        }
        return CommonUtil.j(strE);
    }

    public static boolean c() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        return "SA".equalsIgnoreCase(accountInfo) || "IQ".equalsIgnoreCase(accountInfo);
    }
}
