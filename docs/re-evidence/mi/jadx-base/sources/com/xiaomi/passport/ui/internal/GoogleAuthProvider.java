package com.xiaomi.passport.ui.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.passport.ui.utils.LoginFailedReasonHolder;

/* JADX INFO: loaded from: classes11.dex */
public class GoogleAuthProvider extends SNSAuthProvider {
    private static final String GOOGLE_AUTH_TAG = "GoogleAuthProvider";
    private static final int REQUEST_CODE_GOOGLE = 32;

    public GoogleAuthProvider() {
        super("google");
    }

    @Override // com.xiaomi.passport.ui.internal.SNSAuthProvider
    public String getAppId(Context context) {
        return context.getString(R.string.google_application_id);
    }

    @Override // com.xiaomi.passport.ui.internal.SNSAuthProvider
    public int getIconRes() {
        return R.drawable.passport_ic_sns_google;
    }

    @Override // com.xiaomi.passport.ui.internal.SNSAuthProvider
    public int getRequestCode() {
        return 32;
    }

    @Override // com.xiaomi.passport.ui.internal.SNSAuthProvider
    public boolean isServiceAvailable(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }

    @Override // com.xiaomi.passport.ui.internal.SNSAuthProvider
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) throws Throwable {
        String serverAuthCode;
        if (i == 32) {
            try {
                GoogleSignInAccount result = GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                if (result == null || (serverAuthCode = result.getServerAuthCode()) == null) {
                    return;
                }
                storeSnsCode(activity, serverAuthCode);
            } catch (ApiException e) {
                LoginFailedReasonHolder.set("GoogleAuthFail");
                AccountLogger.log(GOOGLE_AUTH_TAG, "Google sign in failed", e);
            }
        }
    }

    @Override // com.xiaomi.passport.ui.internal.SNSAuthProvider
    public void startLogin(Activity activity) {
        activity.startActivityForResult(GoogleSignIn.getClient(activity, new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestServerAuthCode(getAppId(activity)).requestEmail().build()).getSignInIntent(), 32);
    }
}
