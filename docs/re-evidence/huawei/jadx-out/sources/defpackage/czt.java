package defpackage;

import android.content.Context;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;

/* JADX INFO: loaded from: classes23.dex */
public class czt {
    public static void d(Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || iBaseResponseCallback == null) {
            LogUtil.j("CheckUserInfoUtil", "context == null || callback == null");
            return;
        }
        cuq cuqVarA = cuq.a(context);
        UserInfomation userInfomationC = cuqVarA.c();
        if (userInfomationC == null) {
            LogUtil.j("CheckUserInfoUtil", "checkUserInfo userInfo == null");
            iBaseResponseCallback.a(-2, null);
            return;
        }
        boolean z = (userInfomationC.isGenderValid() && userInfomationC.isWeightValid() && userInfomationC.isHeightValid() && userInfomationC.isBirthdayValid()) ? false : true;
        LogUtil.a("CheckUserInfoUtil", "hwUserProfileMgr.isInitFinish() ", Boolean.valueOf(cuqVarA.e()), "isUserInvalid ", Boolean.valueOf(!userInfomationC.isGenderValid()), Boolean.valueOf(!userInfomationC.isWeightValid()), Boolean.valueOf(!userInfomationC.isHeightValid()), Boolean.valueOf(!userInfomationC.isBirthdayValid()));
        if (z && cuqVarA.e()) {
            qra.b(context, iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(-2, null);
        }
    }
}
