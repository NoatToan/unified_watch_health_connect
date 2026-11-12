package com.xiaomi.passport.ui.logiccontroller;

import android.content.Context;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.account.exception.ReachLimitException;
import com.xiaomi.passport.ui.utils.AccountToast;

/* JADX INFO: loaded from: classes11.dex */
public class RegisterReachLimitExceptionHandler extends ExceptionHandler {
    public RegisterReachLimitExceptionHandler(ExceptionHandler exceptionHandler) {
        super(exceptionHandler);
    }

    @Override // com.xiaomi.passport.ui.logiccontroller.ExceptionHandler
    public boolean handle(Context context, Throwable th) {
        if (!(th instanceof ReachLimitException)) {
            return false;
        }
        AccountToast.showToastMessage(context, R.string.passport_register_restricted);
        return true;
    }
}
