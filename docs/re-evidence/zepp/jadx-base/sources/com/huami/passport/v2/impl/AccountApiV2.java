package com.huami.passport.v2.impl;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.android.volley.VolleyError;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.huami.passport.AccountApi;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.Keeper;
import com.huami.passport.WXEntryProxyActivity;
import com.huami.passport.api.FacebookHelper;
import com.huami.passport.api.GoogleHelper;
import com.huami.passport.api.LineHelper;
import com.huami.passport.entity.AppInfo;
import com.huami.passport.entity.Device;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.Profile;
import com.huami.passport.entity.Token;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.entity.UserInfo;
import com.huami.passport.entity.UserRegion;
import com.huami.passport.net.ProfileAPI;
import com.huami.passport.net.WebAPI;
import com.huami.passport.utils.Utils;
import com.huami.passport.v2.IAccountV2;
import com.huami.passport.v2.impl.AccountApiV2;
import com.huami.tools.log.HMLog;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthFuture;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.account.openauth.XiaomiOAuthorize;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AccountApiV2 extends AccountApi implements IAccountV2 {
    public final ExecutorService mUserExecutor;

    /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ String val$accessToken;
        public final /* synthetic */ Activity val$activity;
        public final /* synthetic */ boolean val$allowFastLogin;
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$countryCode;
        public final /* synthetic */ String val$countryState;
        public final /* synthetic */ String val$provider;

        public AnonymousClass1(IAccount.Callback callback, String str, Activity activity, String str2, String str3, String str4, boolean z) {
            this.val$callback = callback;
            this.val$provider = str;
            this.val$activity = activity;
            this.val$accessToken = str2;
            this.val$countryCode = str3;
            this.val$countryState = str4;
            this.val$allowFastLogin = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$0() {
            return "[Registration] No connection error";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$1() {
            return "[Registration] Tpac not found";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$3() {
            return "[Registration] read Tpac config error";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$4() {
            return "[Registration] error {activity is null}";
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!Utils.isNetworkAvailable(AccountApiV2.this.mContext)) {
                HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass1.lambda$run$0();
                    }
                });
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.NO_NETWORK_ERROR);
                return;
            }
            try {
                Map<String, TpaConfig> tpaConfigs = Utils.getTpaConfigs(AccountApiV2.this.mContext);
                if (tpaConfigs == null) {
                    HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR;
                        }
                    });
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR);
                    return;
                }
                AccountApiV2.this.mTpac = tpaConfigs.get(this.val$provider);
                if (AccountApiV2.this.mTpac == null || !Utils.verifyParamByTpac(this.val$provider, AccountApiV2.this.mTpac)) {
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_CONFIG_ERROR);
                    HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApiV2.AnonymousClass1.lambda$run$3();
                        }
                    });
                    return;
                }
                Activity activity = this.val$activity;
                if (activity != null) {
                    AccountApiV2.loginV2(activity.getApplicationContext(), this.val$provider, "access_token", AccountApiV2.this.mTpac.getThirdName(), this.val$accessToken, this.val$countryCode, this.val$countryState, this.val$allowFastLogin, false, this.val$callback);
                } else {
                    HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApiV2.AnonymousClass1.lambda$run$4();
                        }
                    });
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.PARAMS_IS_NULL_ERROR);
                }
            } catch (IOException unused) {
                HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass1.lambda$run$1();
                    }
                });
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.NO_TPA_FOUND_ERROR);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ Activity val$activity;
        public final /* synthetic */ boolean val$allowFastLogin;
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$countryCode;
        public final /* synthetic */ String val$countryState;
        public final /* synthetic */ boolean val$isLogin;
        public final /* synthetic */ String val$provider;

        /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$2$1, reason: invalid class name */
        public class AnonymousClass1 extends AsyncTask<Void, Void, XiaomiOAuthResults> {
            public Exception e;
            public final /* synthetic */ Context val$ctx;
            public final /* synthetic */ XiaomiOAuthFuture val$future;

            public AnonymousClass1(XiaomiOAuthFuture xiaomiOAuthFuture, Context context) {
                this.val$future = xiaomiOAuthFuture;
                this.val$ctx = context;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onPostExecute$0(String str, String str2) {
                return "[Login] Mi sdk success Access Token " + str + " Code:" + str2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onPostExecute$1() {
                return "[Login] mi oauth code is null";
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
            public void onPostExecute(XiaomiOAuthResults xiaomiOAuthResults) {
                if (xiaomiOAuthResults == null) {
                    Exception exc = this.e;
                    if (exc == null) {
                        AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, ErrorCode.TPA_DONE_NO_RESULT);
                        return;
                    }
                    if (exc instanceof OperationCanceledException) {
                        AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, ErrorCode.USER_CANCEL_ERROR);
                    }
                    if (this.e instanceof XMAuthericationException) {
                        AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, ErrorCode.TPA_DENIED_ERROR);
                        return;
                    }
                    return;
                }
                final String accessToken = xiaomiOAuthResults.getAccessToken();
                final String code = xiaomiOAuthResults.getCode();
                HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass2.AnonymousClass1.lambda$onPostExecute$0(accessToken, code);
                    }
                });
                if (TextUtils.isEmpty(code)) {
                    HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApiV2.AnonymousClass2.AnonymousClass1.lambda$onPostExecute$1();
                        }
                    });
                    AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, ErrorCode.INNER_HANDLE_ERROR);
                    return;
                }
                Context context = this.val$ctx;
                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                String str = anonymousClass2.val$provider;
                String thirdName = AccountApiV2.this.mTpac.getThirdName();
                AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                AccountApiV2.loginV2(context, str, Configs.Params.REQUEST_TOKEN, thirdName, code, anonymousClass3.val$countryCode, anonymousClass3.val$countryState, anonymousClass3.val$allowFastLogin, anonymousClass3.val$isLogin, anonymousClass3.val$callback);
            }
        }

        /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$2$2, reason: invalid class name and collision with other inner class name */
        public class C05262 implements FacebookCallback<LoginResult> {
            public final /* synthetic */ Context val$ctx;

            public C05262(Context context) {
                this.val$ctx = context;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onCancel$3() {
                return "[Login] facebook onCancel";
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onError$4(FacebookException facebookException) {
                return "[Login] facebook error " + facebookException.getMessage();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onSuccess$0() {
                return "[Login] Facebook success";
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onSuccess$1(AccessToken accessToken, String str) {
                return "[Login] Facebook Token:" + accessToken.getToken() + " UserId:" + str + " isExpired:" + accessToken.isExpired();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onSuccess$2() {
                return "[Login] verify AccessToken error[Facebook]";
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass2.C05262.lambda$onCancel$3();
                    }
                });
                AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, ErrorCode.USER_CANCEL_ERROR);
            }

            @Override // com.facebook.FacebookCallback
            public void onError(final FacebookException facebookException) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass2.C05262.lambda$onError$4(facebookException);
                    }
                });
                AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, ErrorCode.TPA_DONE_ERROR_RESULT);
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(LoginResult loginResult) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass2.C05262.lambda$onSuccess$0();
                    }
                });
                if (loginResult == null) {
                    AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, ErrorCode.TPA_DONE_ERROR_RESULT);
                    return;
                }
                final AccessToken accessToken = loginResult.getAccessToken();
                if (!FacebookHelper.verifyAccessToken(accessToken)) {
                    HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApiV2.AnonymousClass2.C05262.lambda$onSuccess$2();
                        }
                    });
                    AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, ErrorCode.TPA_DONE_ERROR_RESULT);
                    return;
                }
                final String userId = accessToken.getUserId();
                HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass2.C05262.lambda$onSuccess$1(accessToken, userId);
                    }
                });
                Context context = this.val$ctx;
                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                String str = anonymousClass2.val$provider;
                String thirdName = AccountApiV2.this.mTpac.getThirdName();
                String token = accessToken.getToken();
                AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                AccountApiV2.loginV2(context, str, "access_token", thirdName, token, anonymousClass3.val$countryCode, anonymousClass3.val$countryState, anonymousClass3.val$allowFastLogin, anonymousClass3.val$isLogin, anonymousClass3.val$callback);
            }
        }

        public AnonymousClass2(IAccount.Callback callback, String str, Activity activity, String str2, String str3, boolean z, boolean z2) {
            this.val$callback = callback;
            this.val$provider = str;
            this.val$activity = activity;
            this.val$countryCode = str2;
            this.val$countryState = str3;
            this.val$allowFastLogin = z;
            this.val$isLogin = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$0() {
            return "[Login] No connection error";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$1() {
            return "[Login] Tpac not found";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$3() {
            return "[Login] read Tpac config error";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$4() {
            return "[Login] error {activity is null}";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$5() {
            return "[Login] scope is null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String lambda$run$6() {
            return "[Login] facebook scope " + AccountApiV2.this.mTpac.getScope();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!Utils.isNetworkAvailable(AccountApiV2.this.mContext)) {
                HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass2.lambda$run$0();
                    }
                });
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.NO_NETWORK_ERROR);
                return;
            }
            try {
                Map<String, TpaConfig> tpaConfigs = Utils.getTpaConfigs(AccountApiV2.this.mContext);
                if (tpaConfigs == null) {
                    HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR;
                        }
                    });
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR);
                    return;
                }
                AccountApiV2.this.mTpac = tpaConfigs.get(this.val$provider);
                if (AccountApiV2.this.mTpac == null || !Utils.verifyParamByTpac(this.val$provider, AccountApiV2.this.mTpac)) {
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_CONFIG_ERROR);
                    HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApiV2.AnonymousClass2.lambda$run$3();
                        }
                    });
                    return;
                }
                Activity activity = this.val$activity;
                if (activity == null) {
                    HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApiV2.AnonymousClass2.lambda$run$4();
                        }
                    });
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.PARAMS_IS_NULL_ERROR);
                    return;
                }
                final Context applicationContext = activity.getApplicationContext();
                if (TextUtils.equals(this.val$provider, "xiaomi")) {
                    try {
                        List<String> scope = AccountApiV2.this.mTpac.getScope();
                        int size = scope.size();
                        int[] iArr = new int[size];
                        for (int i = 0; i < size; i++) {
                            iArr[i] = Integer.parseInt(scope.get(i));
                        }
                        try {
                            new AnonymousClass1(new XiaomiOAuthorize().setAppId(Long.parseLong(AccountApiV2.this.mTpac.getAppId())).setRedirectUrl(AccountApiV2.this.mTpac.getRedirectUrl()).setScope(iArr).setKeepCookies(AccountApiV2.this.mTpac.isKeepCookies()).setNoMiui(Utils.isNoMiui(AccountApiV2.this.mContext)).setPlatform(AccountApiV2.this.mTpac.getPlatform()).setSkipConfirm(AccountApiV2.this.mTpac.isSkipConfirm()).startGetOAuthCode(this.val$activity), applicationContext).execute(new Void[0]);
                        } catch (Exception unused) {
                            AccountApi.onErrorCallback(this.val$callback, ErrorCode.CALL_TPSDK_ERROR);
                        }
                    } catch (Exception unused2) {
                        AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_CONFIG_ERROR);
                        return;
                    }
                }
                if (TextUtils.equals(this.val$provider, "wechat")) {
                    try {
                        WXEntryProxyActivity.setCallback(this.val$callback);
                        WXEntryProxyActivity.setRequestInfo(1, this.val$countryCode, this.val$countryState, AccountApiV2.this.mTpac, this.val$allowFastLogin, this.val$isLogin);
                        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this.val$activity, AccountApiV2.this.mTpac.getAppId(), false);
                        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
                            AccountApi.onErrorCallback(this.val$callback, ErrorCode.UNINSTALL_TPAPP_ERROR);
                            return;
                        }
                        iwxapiCreateWXAPI.registerApp(AccountApiV2.this.mTpac.getAppId());
                        SendAuth.Req req = new SendAuth.Req();
                        req.scope = AccountApiV2.this.mTpac.getScope().get(0);
                        req.state = Configs.WechatConfig.state;
                        iwxapiCreateWXAPI.sendReq(req);
                    } catch (Exception unused3) {
                        AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR);
                        return;
                    }
                }
                if (TextUtils.equals(this.val$provider, "facebook")) {
                    CallbackManager callbackManagerCreate = CallbackManager.Factory.create();
                    CallbackManager unused4 = AccountApi.mFacebookCallbackManager = callbackManagerCreate;
                    LoginManager loginManager = LoginManager.getInstance();
                    if (FacebookHelper.verifyAccessToken(AccessToken.getCurrentAccessToken())) {
                        loginManager.logOut();
                    }
                    loginManager.registerCallback(callbackManagerCreate, new C05262(applicationContext));
                    HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.lambda$run$6();
                        }
                    });
                    loginManager.logInWithReadPermissions(this.val$activity, AccountApiV2.this.mTpac.getScope());
                }
                if (TextUtils.equals(this.val$provider, "google")) {
                    if (!(this.val$activity instanceof FragmentActivity)) {
                        AccountApi.onErrorCallback(this.val$callback, ErrorCode.GOOGLE_ACTIVITY_CONFIG_ERROR);
                        return;
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.v2.impl.AccountApiV2.2.3

                        /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$2$3$1, reason: invalid class name */
                        public class AnonymousClass1 implements IAccount.Callback<GoogleSignInAccount, String> {
                            public AnonymousClass1() {
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static /* synthetic */ String lambda$onSuccess$0(GoogleSignInAccount googleSignInAccount) {
                                return "[Login] google result:" + googleSignInAccount;
                            }

                            @Override // com.huami.passport.IAccount.Callback
                            public void onError(String str) {
                                AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, str);
                            }

                            @Override // com.huami.passport.IAccount.Callback
                            public void onSuccess(final GoogleSignInAccount googleSignInAccount) {
                                HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.t
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AccountApiV2.AnonymousClass2.AnonymousClass3.AnonymousClass1.lambda$onSuccess$0(googleSignInAccount);
                                    }
                                });
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                Context context = applicationContext;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                String str = anonymousClass2.val$provider;
                                String thirdName = AccountApiV2.this.mTpac.getThirdName();
                                String idToken = googleSignInAccount.getIdToken();
                                AnonymousClass2 anonymousClass4 = AnonymousClass2.this;
                                AccountApiV2.loginV2(context, str, Configs.Params.REQUEST_TOKEN, thirdName, idToken, anonymousClass4.val$countryCode, anonymousClass4.val$countryState, anonymousClass4.val$allowFastLogin, anonymousClass4.val$isLogin, anonymousClass4.val$callback);
                            }
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (AccountApiV2.this.mGoogleHelper == null) {
                                AccountApiV2.this.mGoogleHelper = new GoogleHelper();
                            }
                            if (AccountApiV2.this.mGoogleHelper.isGmsInstalled(AnonymousClass2.this.val$activity.getApplicationContext())) {
                                AccountApiV2.this.mGoogleHelper.getAuthCode((FragmentActivity) AnonymousClass2.this.val$activity, new AnonymousClass1());
                            } else {
                                AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, ErrorCode.UNINSTALL_TPAPP_ERROR);
                            }
                        }
                    });
                }
                if (TextUtils.equals(this.val$provider, "line")) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.v2.impl.AccountApiV2.2.4

                        /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$2$4$1, reason: invalid class name */
                        public class AnonymousClass1 implements IAccount.Callback<LineLoginResult, String> {
                            public AnonymousClass1() {
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static /* synthetic */ String lambda$onSuccess$0(String str) {
                                return "[Login] line obtain access_token:" + str;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static /* synthetic */ String lambda$onSuccess$1() {
                                return "[Login] line obtain access_token error";
                            }

                            @Override // com.huami.passport.IAccount.Callback
                            public void onError(String str) {
                                AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, str);
                            }

                            @Override // com.huami.passport.IAccount.Callback
                            public void onSuccess(LineLoginResult lineLoginResult) {
                                LineCredential lineCredential = lineLoginResult.getLineCredential();
                                if (lineCredential != null) {
                                    final String accessToken = lineCredential.getAccessToken().getAccessToken();
                                    if (!TextUtils.isEmpty(accessToken)) {
                                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                        Context context = applicationContext;
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        String str = anonymousClass2.val$provider;
                                        String thirdName = AccountApiV2.this.mTpac.getThirdName();
                                        AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                                        AccountApiV2.loginV2(context, str, "access_token", thirdName, accessToken, anonymousClass3.val$countryCode, anonymousClass3.val$countryState, anonymousClass3.val$allowFastLogin, anonymousClass3.val$isLogin, anonymousClass3.val$callback);
                                        HMLog.info(new Function0() { // from class: com.huami.passport.v2.impl.u
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AccountApiV2.AnonymousClass2.AnonymousClass4.AnonymousClass1.lambda$onSuccess$0(accessToken);
                                            }
                                        });
                                        return;
                                    }
                                }
                                HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.v
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AccountApiV2.AnonymousClass2.AnonymousClass4.AnonymousClass1.lambda$onSuccess$1();
                                    }
                                });
                                AccountApi.onErrorCallback(AnonymousClass2.this.val$callback, ErrorCode.TPA_DONE_ERROR_RESULT);
                            }
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (AccountApiV2.this.mLineHelper == null) {
                                AccountApiV2.this.mLineHelper = new LineHelper();
                            }
                            LineHelper lineHelper = AccountApiV2.this.mLineHelper;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            lineHelper.getAccessToken(anonymousClass2.val$activity, AccountApiV2.this.mTpac, new AnonymousClass1());
                        }
                    });
                }
            } catch (IOException unused5) {
                HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass2.lambda$run$1();
                    }
                });
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.NO_TPA_FOUND_ERROR);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$3, reason: invalid class name */
    public class AnonymousClass3 implements WebAPI.HttpCallback<LoginToken> {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ Context val$context;

        public AnonymousClass3(IAccount.Callback callback, Context context) {
            this.val$callback = callback;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onFailure$0(String str) {
            return "[Login] loginV2 error" + str;
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onFailure(VolleyError volleyError) {
            final String error = WebAPI.getError(volleyError);
            HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApiV2.AnonymousClass3.lambda$onFailure$0(error);
                }
            });
            AccountApi.onErrorCallback(this.val$callback, error);
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onSuccess(LoginToken loginToken) {
            if (TextUtils.isEmpty(loginToken.getErrorCode())) {
                AccountApi.refreshLoginToken(this.val$context, loginToken, this.val$callback);
            } else {
                AccountApi.onErrorCallback(this.val$callback, AccountApi.entity2Error(loginToken));
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$4, reason: invalid class name */
    public class AnonymousClass4 implements IAccount.Callback<Token, ErrorCode> {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$countryCode;
        public final /* synthetic */ String val$uid;

        public AnonymousClass4(IAccount.Callback callback, Context context, String str, String str2) {
            this.val$callback = callback;
            this.val$context = context;
            this.val$uid = str;
            this.val$countryCode = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0() {
            return "checkUserTransferCountry error--token is null";
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onError(ErrorCode errorCode) {
            AccountApi.onErrorCallback(this.val$callback, errorCode);
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(Token token) {
            if (token != null) {
                AccountApiV2.this.checkUserTransferCountry(this.val$context, this.val$uid, token.getAccessToken(), this.val$countryCode, this.val$callback);
            } else {
                HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass4.lambda$onSuccess$0();
                    }
                });
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.APPTOKEN_IS_NULL_ERROR);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$5, reason: invalid class name */
    public class AnonymousClass5 implements WebAPI.HttpCallback<UserRegion> {
        public final /* synthetic */ IAccount.Callback val$callback;

        public AnonymousClass5(IAccount.Callback callback) {
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onFailure$0(String str) {
            return "checkUserTransferCountry error" + str;
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onFailure(VolleyError volleyError) {
            final String error = WebAPI.getError(volleyError);
            HMLog.debug(new Function0() { // from class: com.huami.passport.v2.impl.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApiV2.AnonymousClass5.lambda$onFailure$0(error);
                }
            });
            AccountApi.onErrorCallback(this.val$callback, error);
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onSuccess(UserRegion userRegion) {
            if (!TextUtils.isEmpty(userRegion.getErrorCode())) {
                AccountApi.onErrorCallback(this.val$callback, AccountApi.entity2Error(userRegion));
                return;
            }
            IAccount.Callback callback = this.val$callback;
            if (callback != null) {
                callback.onSuccess(userRegion);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$6, reason: invalid class name */
    public class AnonymousClass6 implements IAccount.Callback<Token, ErrorCode> {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$uid;

        public AnonymousClass6(IAccount.Callback callback, String str) {
            this.val$callback = callback;
            this.val$uid = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0() {
            return "getProfile error--token is null";
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onError(ErrorCode errorCode) {
            IAccount.Callback callback = this.val$callback;
            if (callback != null) {
                callback.onError(errorCode);
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(Token token) {
            if (token != null && !TextUtils.isEmpty(token.getAccessToken())) {
                AccountApiV2.this.getProfile(this.val$uid, token.getAccessToken(), this.val$callback);
            } else {
                HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApiV2.AnonymousClass6.lambda$onSuccess$0();
                    }
                });
                this.val$callback.onError(ErrorCode.builder(ErrorCode.NO_LOGIN_ERROR));
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.v2.impl.AccountApiV2$8, reason: invalid class name */
    public class AnonymousClass8 implements WebAPI.HttpCallback<LoginToken> {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ Context val$context;

        public AnonymousClass8(IAccount.Callback callback, Context context) {
            this.val$callback = callback;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onFailure$0(String str) {
            return "[Login] tokenLogin error" + str;
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onFailure(VolleyError volleyError) {
            final String error = WebAPI.getError(volleyError);
            HMLog.error(new Function0() { // from class: com.huami.passport.v2.impl.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApiV2.AnonymousClass8.lambda$onFailure$0(error);
                }
            });
            AccountApi.onErrorCallback(this.val$callback, error);
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onSuccess(LoginToken loginToken) {
            if (!TextUtils.isEmpty(loginToken.getErrorCode())) {
                AccountApi.onErrorCallback(this.val$callback, AccountApi.entity2Error(loginToken));
            } else {
                AccountApiV2.this.appendSsoLoginInfo(loginToken);
                AccountApi.refreshLoginToken(this.val$context, loginToken, this.val$callback);
            }
        }
    }

    public AccountApiV2(Context context) {
        super(context);
        this.mUserExecutor = Executors.newSingleThreadExecutor();
        try {
            FacebookSdk.sdkInitialize(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendSsoLoginInfo(LoginToken loginToken) {
        if (loginToken.getUserInfo() == null) {
            UserInfo userInfo = new UserInfo();
            userInfo.setThirdId(loginToken.getTokenInfo().getUserId());
            loginToken.setUserInfo(userInfo);
        }
        loginToken.setProvider("sso");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getProfile$2(String str, String str2) {
        return "update countryCode:" + str + " region:" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getProfile$3() {
        return "getProfile error--token is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$regLogin$1(String str, String str2, boolean z, boolean z2) {
        return "[Login] provider:" + str + " CountryCode:" + str2 + " isLogin:" + z + " allowFastLogin:" + z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registration$0(String str, String str2, String str3, boolean z) {
        return "[Registration] provider:" + str + " CountryCode:" + str2 + " accessToken:" + str3 + " allowFastLogin:" + z;
    }

    public static void loginV2(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, IAccount.Callback<LoginToken, ErrorCode> callback) {
        String str7;
        Device deviceCache = Utils.getDeviceCache(context);
        AppInfo appInfo = Utils.getAppInfo(context);
        String appId = appInfo.getAppId();
        String deviceid = deviceCache.getDeviceid();
        String deviceModel = deviceCache.getDeviceModel();
        String versionName = appInfo.getVersionName();
        String language = Locale.getDefault().getLanguage();
        String strBuildParams = appInfo.buildParams();
        String domain = Configs.getDomain();
        String str8 = TextUtils.isEmpty(language) ? "unknown" : language;
        if (TextUtils.isEmpty(str5)) {
            String country = Locale.getDefault().getCountry();
            str7 = TextUtils.isEmpty(country) ? "unknown" : country;
        } else {
            str7 = str5;
        }
        WebAPI.loginV2(context, str, str3, appId, str2, str4, deviceid, deviceModel, versionName, str7, str6, str8, strBuildParams, domain, z, z2, new AnonymousClass3(callback, context));
    }

    private boolean supportTpn(String str) {
        return TextUtils.equals(str, "wechat") || TextUtils.equals(str, "xiaomi") || TextUtils.equals(str, "facebook") || TextUtils.equals(str, "google") || TextUtils.equals(str, "line");
    }

    public void checkUserTransferCountry(Context context, String str, IAccount.Callback<UserRegion, ErrorCode> callback) {
        getToken(false, new AnonymousClass4(callback, context, getCurrentUid(), str));
    }

    public String getCountryCode() {
        UserInfo userInfo = getUserInfo();
        if (userInfo == null || userInfo.getRegistInfo() == null) {
            return null;
        }
        return userInfo.getRegistInfo().getCountryCode();
    }

    public String getCountryState() {
        UserInfo userInfo = getUserInfo();
        if (userInfo == null || userInfo.getRegistInfo() == null) {
            return null;
        }
        return userInfo.getRegistInfo().getCountryState();
    }

    public Profile getProfile(String str, String str2) {
        Profile profile = ProfileAPI.getProfile(this.mContext, str, str2);
        if (profile != null) {
            LoginToken tokenCache = Keeper.getTokenCache(this.mContext);
            UserInfo.RegistInfo registInfo = tokenCache.getRegistInfo();
            final String countryCode = profile.getCountryCode();
            String countryState = profile.getCountryState();
            final String region = profile.getRegion();
            if (registInfo != null) {
                registInfo.setCountryCode(countryCode);
                registInfo.setCountryState(countryState);
                registInfo.setRegion(region);
            }
            Keeper.saveToken(this.mContext, tokenCache);
            HMLog.debug(new Function0() { // from class: r2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApiV2.lambda$getProfile$2(countryCode, region);
                }
            });
        }
        return profile;
    }

    @Override // com.huami.passport.v2.IAccountV2
    public void login(Activity activity, String str, String str2, IAccount.Callback<LoginToken, ErrorCode> callback) {
        login(activity, str, str2, true, callback);
    }

    @Override // com.huami.passport.AccountApi
    public void onActivityResult(int i, int i2, Intent intent) {
        LineHelper lineHelper;
        super.onActivityResult(i, i2, intent);
        if (!TextUtils.equals(this.mProvider, "line") || (lineHelper = this.mLineHelper) == null) {
            return;
        }
        lineHelper.onActivityResult(i, i2, intent);
    }

    public void regLogin(Activity activity, final String str, final String str2, String str3, final boolean z, final boolean z2, IAccount.Callback<LoginToken, ErrorCode> callback) {
        this.mProvider = str;
        HMLog.error(new Function0() { // from class: t2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApiV2.lambda$regLogin$1(str, str2, z2, z);
            }
        });
        if (supportTpn(str)) {
            this.mExecutor.execute(new AnonymousClass2(callback, str, activity, str2, str3, z, z2));
        } else {
            AccountApi.onErrorCallback(callback, ErrorCode.NOT_SUPPORT_TPN_ERROR);
        }
    }

    public void registration(Activity activity, final String str, final String str2, final String str3, String str4, final boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        this.mProvider = str;
        HMLog.error(new Function0() { // from class: s2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApiV2.lambda$registration$0(str, str3, str2, z);
            }
        });
        if (supportTpn(str)) {
            this.mExecutor.execute(new AnonymousClass1(callback, str, activity, str2, str3, str4, z));
        } else {
            AccountApi.onErrorCallback(callback, ErrorCode.NOT_SUPPORT_TPN_ERROR);
        }
    }

    @Override // com.huami.passport.v2.IAccountV2
    public void tokenLogin(@NonNull Context context, @NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull IAccount.Callback<LoginToken, ErrorCode> callback) {
        WebAPI.tokenLogin(context, str, str2, str3, new AnonymousClass8(callback, context));
    }

    @Override // com.huami.passport.v2.IAccountV2
    public void login(Activity activity, String str, String str2, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        login(activity, str, str2, null, z, callback);
    }

    public void checkUserTransferCountry(Context context, String str, String str2, String str3, IAccount.Callback<UserRegion, ErrorCode> callback) {
        WebAPI.checkUserTransferCountry(context, str, str2, str3, new AnonymousClass5(callback));
    }

    @Override // com.huami.passport.v2.IAccountV2
    public void login(Activity activity, String str, String str2, String str3, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        regLogin(activity, str, str2, str3, z, true, callback);
    }

    public Profile getProfile() {
        String currentUid = getCurrentUid();
        Token token = getToken();
        if (token == null) {
            HMLog.error(new Function0() { // from class: u2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApiV2.lambda$getProfile$3();
                }
            });
            return null;
        }
        return getProfile(currentUid, token.getAccessToken());
    }

    public void getProfile(IAccount.Callback<Profile, ErrorCode> callback) {
        getToken(false, new AnonymousClass6(callback, getCurrentUid()));
    }

    public void getProfile(final String str, final String str2, final IAccount.Callback<Profile, ErrorCode> callback) {
        this.mUserExecutor.execute(new Runnable() { // from class: com.huami.passport.v2.impl.AccountApiV2.7
            @Override // java.lang.Runnable
            public void run() {
                if (callback != null) {
                    final Profile profile = AccountApiV2.this.getProfile(str, str2);
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.v2.impl.AccountApiV2.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Profile profile2 = profile;
                            if (profile2 == null) {
                                callback.onError(ErrorCode.builder(ErrorCode.NO_LOGIN_ERROR));
                            } else if (TextUtils.isEmpty(profile2.getErrorCode())) {
                                callback.onSuccess(profile);
                            } else {
                                callback.onError(ErrorCode.builder(profile.getErrorCode(), profile.getNextActions()));
                            }
                        }
                    });
                }
            }
        });
    }
}
