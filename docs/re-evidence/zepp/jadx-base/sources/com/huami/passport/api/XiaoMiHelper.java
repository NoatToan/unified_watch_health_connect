package com.huami.passport.api;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.android.volley.VolleyError;
import com.huami.passport.AccountApi;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.ThirdPartyToken;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.net.WebAPI;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthFuture;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.account.openauth.XiaomiOAuthorize;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class XiaoMiHelper {

    /* JADX INFO: renamed from: com.huami.passport.api.XiaoMiHelper$1, reason: invalid class name */
    public class AnonymousClass1 extends AsyncTask<Void, Void, XiaomiOAuthResults> {
        public Exception e;
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ XiaomiOAuthFuture val$future;

        public AnonymousClass1(XiaomiOAuthFuture xiaomiOAuthFuture, IAccount.Callback callback) {
            this.val$future = xiaomiOAuthFuture;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onPostExecute$0(String str, String str2) {
            return "Mi sdk success Access Token " + str + " Code:" + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onPostExecute$1(XiaomiOAuthResults xiaomiOAuthResults) {
            return "Mi sdk get oauth_code error:" + xiaomiOAuthResults.getErrorCode() + " error_msg:" + xiaomiOAuthResults.getErrorMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onPostExecute$2() {
            return "mi oauth code is null";
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }

        @Override // android.os.AsyncTask
        public XiaomiOAuthResults doInBackground(Void... voidArr) {
            try {
                return (XiaomiOAuthResults) this.val$future.getResult();
            } catch (OperationCanceledException e) {
                this.e = e;
                return null;
            } catch (XMAuthericationException e2) {
                this.e = e2;
                return null;
            } catch (IOException e3) {
                this.e = e3;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(final XiaomiOAuthResults xiaomiOAuthResults) {
            if (xiaomiOAuthResults == null) {
                Exception exc = this.e;
                if (exc == null) {
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.builder(ErrorCode.TPA_DONE_NO_RESULT));
                    return;
                }
                if (exc instanceof OperationCanceledException) {
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.builder(ErrorCode.USER_CANCEL_ERROR));
                }
                if (this.e instanceof XMAuthericationException) {
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.builder(ErrorCode.TPA_DENIED_ERROR));
                    return;
                }
                return;
            }
            final String accessToken = xiaomiOAuthResults.getAccessToken();
            final String code = xiaomiOAuthResults.getCode();
            HMLog.debug(new Function0() { // from class: com.huami.passport.api.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaoMiHelper.AnonymousClass1.lambda$onPostExecute$0(accessToken, code);
                }
            });
            if (xiaomiOAuthResults.hasError()) {
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.builder(ErrorCode.CALL_TPSDK_ERROR));
                HMLog.error(new Function0() { // from class: com.huami.passport.api.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return XiaoMiHelper.AnonymousClass1.lambda$onPostExecute$1(xiaomiOAuthResults);
                    }
                });
            } else if (!TextUtils.isEmpty(code)) {
                AccountApi.onSuccessCallback(this.val$callback, xiaomiOAuthResults);
            } else {
                HMLog.debug(new Function0() { // from class: com.huami.passport.api.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return XiaoMiHelper.AnonymousClass1.lambda$onPostExecute$2();
                    }
                });
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.builder(ErrorCode.INNER_HANDLE_ERROR));
            }
        }
    }

    public static void getAccessToken(Context context, String str, String str2, String str3, IAccount.Callback<ThirdPartyToken, ErrorCode> callback) {
        getAccessToken(context, str, str2, str3, null, null, callback);
    }

    public static void getOAuthCode(Activity activity, TpaConfig tpaConfig, IAccount.Callback<XiaomiOAuthResults, ErrorCode> callback) {
        getOAuthCode(activity, tpaConfig, null, null, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getOAuthCode$0() {
        return "scope is null";
    }

    public static void refreshToken(Context context, String str, String str2, String str3, final IAccount.Callback<ThirdPartyToken, ErrorCode> callback) {
        WebAPI.thirdPartyRefreshToken(context, str, str2, str3, new WebAPI.HttpCallback<ThirdPartyToken>() { // from class: com.huami.passport.api.XiaoMiHelper.3
            @Override // com.huami.passport.net.WebAPI.HttpCallback
            public void onFailure(VolleyError volleyError) {
                AccountApi.onErrorCallback(callback, ErrorCode.builder(WebAPI.getError(volleyError)));
            }

            @Override // com.huami.passport.net.WebAPI.HttpCallback
            public void onSuccess(ThirdPartyToken thirdPartyToken) {
                if (callback != null) {
                    if (thirdPartyToken.hasError()) {
                        AccountApi.onErrorCallback(callback, ErrorCode.builder(thirdPartyToken.getErrorCode()));
                    } else {
                        AccountApi.onSuccessCallback(callback, thirdPartyToken);
                    }
                }
            }
        });
    }

    public static void getAccessToken(Context context, String str, String str2, String str3, @Nullable String str4, @Nullable String str5, final IAccount.Callback<ThirdPartyToken, ErrorCode> callback) {
        WebAPI.getThirdPartyAccessToken(context, str, str2, str3, str4, str5, new WebAPI.HttpCallback<ThirdPartyToken>() { // from class: com.huami.passport.api.XiaoMiHelper.2
            @Override // com.huami.passport.net.WebAPI.HttpCallback
            public void onFailure(VolleyError volleyError) {
                AccountApi.onErrorCallback(callback, ErrorCode.builder(WebAPI.getError(volleyError)));
            }

            @Override // com.huami.passport.net.WebAPI.HttpCallback
            public void onSuccess(ThirdPartyToken thirdPartyToken) {
                if (callback != null) {
                    if (thirdPartyToken.hasError()) {
                        AccountApi.onErrorCallback(callback, ErrorCode.builder(thirdPartyToken.getErrorCode()));
                    } else {
                        AccountApi.onSuccessCallback(callback, thirdPartyToken);
                    }
                }
            }
        });
    }

    public static void getOAuthCode(Activity activity, TpaConfig tpaConfig, @Nullable String str, @Nullable String str2, IAccount.Callback<XiaomiOAuthResults, ErrorCode> callback) {
        try {
            List<String> scope = tpaConfig.getScope();
            int size = scope.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = Integer.parseInt(scope.get(i));
            }
            boolean zIsNoMiui = Utils.isNoMiui(activity.getApplicationContext());
            try {
                XiaomiOAuthorize xiaomiOAuthorize = new XiaomiOAuthorize();
                xiaomiOAuthorize.setAppId(Long.parseLong(tpaConfig.getAppId()));
                xiaomiOAuthorize.setRedirectUrl(tpaConfig.getRedirectUrl());
                xiaomiOAuthorize.setScope(iArr);
                xiaomiOAuthorize.setKeepCookies(tpaConfig.isKeepCookies());
                xiaomiOAuthorize.setNoMiui(zIsNoMiui);
                xiaomiOAuthorize.setPlatform(tpaConfig.getPlatform());
                xiaomiOAuthorize.setSkipConfirm(tpaConfig.isSkipConfirm());
                if (!TextUtils.isEmpty(str)) {
                    xiaomiOAuthorize.setDeviceID(str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    xiaomiOAuthorize.setState(str2);
                }
                new AnonymousClass1(xiaomiOAuthorize.startGetOAuthCode(activity), callback).execute(new Void[0]);
            } catch (Exception unused) {
                AccountApi.onErrorCallback(callback, ErrorCode.builder(ErrorCode.CALL_TPSDK_ERROR));
            }
        } catch (Exception unused2) {
            AccountApi.onErrorCallback(callback, ErrorCode.builder(ErrorCode.TPA_CONFIG_ERROR));
        }
    }
}
