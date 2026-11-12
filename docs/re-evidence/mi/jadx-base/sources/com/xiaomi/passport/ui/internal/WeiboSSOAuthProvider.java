package com.xiaomi.passport.ui.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.auth.WbConnectErrorMessage;
import com.sina.weibo.sdk.auth.sso.SsoHandler;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.passport.ui.utils.AccountToast;
import com.xiaomi.passport.ui.utils.LoginFailedReasonHolder;

/* JADX INFO: loaded from: classes11.dex */
public class WeiboSSOAuthProvider extends BaseWeiboAuthProvider {
    private SsoHandler mSsoHandler = null;

    @Override // com.xiaomi.passport.ui.internal.SNSAuthProvider
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        SsoHandler ssoHandler = this.mSsoHandler;
        if (ssoHandler != null) {
            ssoHandler.authorizeCallBack(i, i2, intent);
        }
        if (i == getRequestCode() && i2 == -1) {
            return;
        }
        LoginFailedReasonHolder.set("WeiboAuthFail");
    }

    @Override // com.xiaomi.passport.ui.internal.AuthProvider
    public void onProviderRecycle() {
        super.onProviderRecycle();
        this.mSsoHandler = null;
    }

    @Override // com.xiaomi.passport.ui.internal.SNSAuthProvider
    public void startLogin(final Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        WbSdk.install(applicationContext, new AuthInfo(applicationContext, getAppId(applicationContext), activity.getString(R.string.weibo_redirect_uri), ""));
        SsoHandler ssoHandler = new SsoHandler(activity);
        this.mSsoHandler = ssoHandler;
        ssoHandler.authorize(new WbAuthListener() { // from class: com.xiaomi.passport.ui.internal.WeiboSSOAuthProvider.1
            public void cancel() {
                WeiboSSOAuthProvider.this.dispatchResult(activity, SNSAuthProvider.VALUE_SNS_CANCELLED);
            }

            public void onFailure(WbConnectErrorMessage wbConnectErrorMessage) {
                if (wbConnectErrorMessage != null) {
                    AccountToast.showToastMessage(activity, "onFailure: " + wbConnectErrorMessage.getErrorMessage() + ", " + wbConnectErrorMessage.getErrorCode(), 1);
                }
                WeiboSSOAuthProvider.this.dispatchResult(activity, "error");
            }

            public void onSuccess(Oauth2AccessToken oauth2AccessToken) {
                if (oauth2AccessToken.isSessionValid()) {
                    WeiboSSOAuthProvider.this.storeSnsToken(activity, oauth2AccessToken.getToken());
                }
                WeiboSSOAuthProvider.this.dispatchResult(activity, SNSAuthProvider.VALUE_SNS_OK);
            }
        });
    }
}
