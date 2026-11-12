package com.xiaomi.passport.ui.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.tauth.Tencent;
import com.xiaomi.account.passportsdk.account_sso.R;

/* JADX INFO: loaded from: classes11.dex */
public class QQSSOAuthProvider extends QQAuthProvider {
    @Override // com.xiaomi.passport.ui.internal.QQAuthProvider, com.xiaomi.passport.ui.internal.SNSAuthProvider
    public String getAppId(Context context) {
        return context.getString(R.string.qq_application_id);
    }

    @Override // com.xiaomi.passport.ui.internal.QQAuthProvider, com.xiaomi.passport.ui.internal.SNSAuthProvider
    public int getIconRes() {
        return R.drawable.passport_ic_sns_qq;
    }

    @Override // com.xiaomi.passport.ui.internal.SNSAuthProvider
    public int getRequestCode() {
        return 11101;
    }

    @Override // com.xiaomi.passport.ui.internal.QQAuthProvider, com.xiaomi.passport.ui.internal.SNSAuthProvider
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Tencent.onActivityResultData(i, i2, intent, new QQUiListener(activity.getApplicationContext(), this));
    }

    @Override // com.xiaomi.passport.ui.internal.QQAuthProvider, com.xiaomi.passport.ui.internal.SNSAuthProvider
    public void startLogin(Activity activity) {
        Tencent.createInstance(getAppId(activity), activity).login(activity, "", new QQUiListener(activity.getApplicationContext(), this));
    }
}
