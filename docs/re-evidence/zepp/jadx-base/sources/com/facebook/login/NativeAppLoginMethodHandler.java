package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting(otherwise = 3)
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private void a(@Nullable LoginClient.Result result) {
        if (result != null) {
            getLoginClient().h(result);
        } else {
            getLoginClient().A();
        }
    }

    @Nullable
    public String getError(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    @Nullable
    public String getErrorMessage(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    public AccessTokenSource getTokenSource() {
        return AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    public void handleResultCancel(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String error = getError(extras);
        String string = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        if (ServerProtocol.getErrorConnectionFailure().equals(string)) {
            a(LoginClient.Result.d(request, error, getErrorMessage(extras), string));
        }
        a(LoginClient.Result.a(request, error));
    }

    public void handleResultError(LoginClient.Request request, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str != null && str.equals("logged_out")) {
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            a(null);
        } else if (ServerProtocol.getErrorsProxyAuthDisabled().contains(str)) {
            a(null);
        } else if (ServerProtocol.getErrorsUserCanceled().contains(str)) {
            a(LoginClient.Result.a(request, null));
        } else {
            a(LoginClient.Result.d(request, str, str2, str3));
        }
    }

    public void handleResultOk(LoginClient.Request request, Bundle bundle) {
        try {
            a(LoginClient.Result.b(request, LoginMethodHandler.createAccessTokenFromWebBundle(request.i(), bundle, getTokenSource(), request.a()), LoginMethodHandler.createAuthenticationTokenFromWebBundle(bundle, request.getNonce())));
        } catch (FacebookException e) {
            a(LoginClient.Result.c(request, null, e.getMessage()));
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean onActivityResult(int i, int i2, Intent intent) {
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (intent == null) {
            a(LoginClient.Result.a(pendingRequest, "Operation canceled"));
        } else if (i2 == 0) {
            handleResultCancel(pendingRequest, intent);
        } else {
            if (i2 != -1) {
                a(LoginClient.Result.c(pendingRequest, "Unexpected resultCode from authorization.", null));
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    a(LoginClient.Result.c(pendingRequest, "Unexpected null from returned authorization data.", null));
                    return true;
                }
                String error = getError(extras);
                String string = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
                String errorMessage = getErrorMessage(extras);
                String string2 = extras.getString("e2e");
                if (!Utility.isNullOrEmpty(string2)) {
                    logWebLoginCompleted(string2);
                }
                if (error == null && string == null && errorMessage == null) {
                    handleResultOk(pendingRequest, extras);
                } else {
                    handleResultError(pendingRequest, error, errorMessage, string);
                }
            }
        }
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public abstract int tryAuthorize(LoginClient.Request request);

    public boolean tryIntent(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            getLoginClient().getFragment().startActivityForResult(intent, i);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
