package com.huami.passport;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.android.volley.VolleyError;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.huami.passport.AccountApi;
import com.huami.passport.ErrorCode;
import com.huami.passport.api.GoogleHelper;
import com.huami.passport.api.LineHelper;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.passport.entity.AccessToken;
import com.huami.passport.entity.AppInfo;
import com.huami.passport.entity.BindAccount;
import com.huami.passport.entity.BindList;
import com.huami.passport.entity.BindResult;
import com.huami.passport.entity.Device;
import com.huami.passport.entity.Domain;
import com.huami.passport.entity.Entity;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.NextActions;
import com.huami.passport.entity.Result;
import com.huami.passport.entity.Token;
import com.huami.passport.entity.TokenInfo;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.entity.UserInfo;
import com.huami.passport.net.WebAPI;
import com.huami.passport.utils.TokenEventHelper;
import com.huami.passport.utils.Utils;
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
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AccountApi implements IAccount {
    public static CallbackManager mFacebookCallbackManager;
    public Context mContext;
    public final ExecutorService mExecutor;
    public GoogleHelper mGoogleHelper;
    public LineHelper mLineHelper;
    public String mProvider;
    public TpaConfig mTpac;

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$1, reason: invalid class name */
    public class AnonymousClass1 implements WebAPI.HttpCallback<LoginToken> {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ LoginToken val$loginToken;
        public final /* synthetic */ TokenInfo val$tokenInfo;

        public AnonymousClass1(IAccount.Callback callback, TokenInfo tokenInfo, LoginToken loginToken) {
            this.val$callback = callback;
            this.val$tokenInfo = tokenInfo;
            this.val$loginToken = loginToken;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0() {
            return "relogin error->tokenInfo is null";
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onFailure(VolleyError volleyError) {
            AccountApi.onErrorCallback(this.val$callback, WebAPI.getError(volleyError));
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onSuccess(LoginToken loginToken) {
            if (!TextUtils.isEmpty(loginToken.getErrorCode())) {
                AccountApi.onErrorCallback(this.val$callback, AccountApi.entity2Error(loginToken));
                return;
            }
            TokenInfo tokenInfo = loginToken.getTokenInfo();
            if (tokenInfo == null) {
                HMLog.error(new Function0() { // from class: com.huami.passport.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass1.lambda$onSuccess$0();
                    }
                });
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.UNKOWN_ERROR);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.val$tokenInfo.setLoginToken(tokenInfo.getLoginToken());
            this.val$tokenInfo.setAppToken(tokenInfo.getAppToken());
            this.val$tokenInfo.setUserId(tokenInfo.getUserId());
            this.val$tokenInfo.setTtl(tokenInfo.getTtl());
            this.val$tokenInfo.setAppTtl(tokenInfo.getAppTtl());
            this.val$tokenInfo.setLastUpdateTtl(jCurrentTimeMillis);
            this.val$tokenInfo.setLastUpdateAppTtl(jCurrentTimeMillis);
            final LoginToken loginToken2 = this.val$loginToken;
            HMLog.debug(new Function0() { // from class: com.huami.passport.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return String.valueOf(loginToken2);
                }
            });
            List<NextActions> nextActions = loginToken.getNextActions();
            if (nextActions != null && nextActions.size() > 0) {
                this.val$loginToken.setNextActions(null);
            }
            Keeper.saveToken(AccountApi.this.mContext, this.val$loginToken);
            this.val$loginToken.setNextActions(nextActions);
            AccountApi.onSuccessCallback(this.val$callback, this.val$loginToken);
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$10, reason: invalid class name */
    public class AnonymousClass10 implements Runnable {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ Object val$success;

        public AnonymousClass10(IAccount.Callback callback, Object obj) {
            this.val$callback = callback;
            this.val$success = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$0() {
            return "##Callback Success";
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountApi.clear();
            if (this.val$callback != null) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass10.lambda$run$0();
                    }
                });
                this.val$callback.onSuccess(this.val$success);
            }
            WXEntryProxyActivity.clear();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: com.huami.passport.AccountApi$11, reason: invalid class name */
    public class AnonymousClass11<V> extends AsyncTask<Void, Void, V> {
        public Exception e;
        public final /* synthetic */ Activity val$activity;
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ XiaomiOAuthFuture val$future;
        public final /* synthetic */ TpaConfig val$tpac;

        public AnonymousClass11(XiaomiOAuthFuture xiaomiOAuthFuture, Activity activity, TpaConfig tpaConfig, IAccount.Callback callback) {
            this.val$future = xiaomiOAuthFuture;
            this.val$activity = activity;
            this.val$tpac = tpaConfig;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onPostExecute$0(String str, String str2) {
            return "Mi sdk success Access Token " + str + "Code:" + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onPostExecute$1() {
            return "mi oauth code is null";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        public void onPostExecute(V v) {
            if (v == 0 || !(v instanceof XiaomiOAuthResults)) {
                Exception exc = this.e;
                if (exc == null) {
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_DONE_NO_RESULT);
                    return;
                }
                if (exc instanceof OperationCanceledException) {
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.USER_CANCEL_ERROR);
                }
                if (this.e instanceof XMAuthericationException) {
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_DENIED_ERROR);
                    return;
                }
                return;
            }
            XiaomiOAuthResults xiaomiOAuthResults = (XiaomiOAuthResults) v;
            final String accessToken = xiaomiOAuthResults.getAccessToken();
            final String code = xiaomiOAuthResults.getCode();
            HMLog.debug(new Function0() { // from class: com.huami.passport.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass11.lambda$onPostExecute$0(accessToken, code);
                }
            });
            if (!TextUtils.isEmpty(code)) {
                AccountApi.loginIdAuth(this.val$activity, "xiaomi", null, this.val$tpac.getThirdName(), code, null, this.val$callback);
            } else {
                HMLog.debug(new Function0() { // from class: com.huami.passport.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass11.lambda$onPostExecute$1();
                    }
                });
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.INNER_HANDLE_ERROR);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }

        @Override // android.os.AsyncTask
        public V doInBackground(Void... voidArr) {
            try {
                return (V) this.val$future.getResult();
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
    }

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$12, reason: invalid class name */
    public class AnonymousClass12 implements WebAPI.HttpCallback<LoginToken> {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ Context val$ctx;

        public AnonymousClass12(IAccount.Callback callback, Context context) {
            this.val$callback = callback;
            this.val$ctx = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onFailure$0(String str) {
            return "thirdPartyLogin error" + str;
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onFailure(VolleyError volleyError) {
            final String error = WebAPI.getError(volleyError);
            HMLog.debug(new Function0() { // from class: com.huami.passport.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass12.lambda$onFailure$0(error);
                }
            });
            AccountApi.onErrorCallback(this.val$callback, error);
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onSuccess(LoginToken loginToken) {
            if (TextUtils.isEmpty(loginToken.getErrorCode())) {
                AccountApi.refreshLoginToken(this.val$ctx, loginToken, this.val$callback);
            } else {
                AccountApi.onErrorCallback(this.val$callback, AccountApi.entity2Error(loginToken));
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$13, reason: invalid class name */
    public class AnonymousClass13 implements WebAPI.HttpCallback<Result> {
        public final /* synthetic */ AppInfo val$appInfo;
        public final /* synthetic */ String val$authCode;
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ Context val$ctx;
        public final /* synthetic */ Device val$device;
        public final /* synthetic */ WebAPI.HttpCallback val$httpCallback;
        public final /* synthetic */ String val$provider;
        public final /* synthetic */ String val$region;
        public final /* synthetic */ long val$searchStart;
        public final /* synthetic */ String val$thirdName;
        public final /* synthetic */ String val$thirdPartyUid;

        public AnonymousClass13(IAccount.Callback callback, String str, Context context, String str2, String str3, long j, Device device, AppInfo appInfo, String str4, String str5, WebAPI.HttpCallback httpCallback) {
            this.val$callback = callback;
            this.val$provider = str;
            this.val$ctx = context;
            this.val$thirdPartyUid = str2;
            this.val$authCode = str3;
            this.val$searchStart = j;
            this.val$device = device;
            this.val$appInfo = appInfo;
            this.val$thirdName = str4;
            this.val$region = str5;
            this.val$httpCallback = httpCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onFailure$3(String str) {
            return "searchExistingUserAccount error" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0(Domain domain) {
            return "search domain:" + domain;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$1(String str) {
            return "cache domain url for " + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$2(String str, long j) {
            return "Search get id server url " + str + " cost time " + (System.currentTimeMillis() - j);
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onFailure(VolleyError volleyError) {
            final String error = WebAPI.getError(volleyError);
            HMLog.debug(new Function0() { // from class: com.huami.passport.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass13.lambda$onFailure$3(error);
                }
            });
            AccountApi.onErrorCallback(this.val$callback, error);
        }

        @Override // com.huami.passport.net.WebAPI.HttpCallback
        public void onSuccess(Result result) {
            if (!TextUtils.isEmpty(result.getErrorCode())) {
                AccountApi.onErrorCallback(this.val$callback, result.getErrorCode());
                return;
            }
            if (TextUtils.equals(result.getResult(), Configs.Params.OK) && result.getDomain() != null) {
                final Domain domain = result.getDomain();
                final String idDns = domain.getIdDns();
                HMLog.debug(new Function0() { // from class: com.huami.passport.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass13.lambda$onSuccess$0(domain);
                    }
                });
                AccessToken accessToken = result.getAccessToken();
                if (!TextUtils.isEmpty(idDns)) {
                    if (TextUtils.equals(this.val$provider, "facebook") || TextUtils.equals(this.val$provider, "google")) {
                        if (Configs.isDebugMode) {
                            Map map = (Map) Keeper.readEntity(this.val$ctx, Keeper.DOMAIN_DEBUG_MAPPING_KEY, Map.class);
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put(Keeper.buildKeyForDomainCache(this.val$provider, this.val$thirdPartyUid), idDns);
                            Keeper.writeEntity(this.val$ctx, Keeper.DOMAIN_DEBUG_MAPPING_KEY, map);
                        } else {
                            Map map2 = (Map) Keeper.readEntity(this.val$ctx, Keeper.DOMAIN_MAPPING_KEY, Map.class);
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            map2.put(Keeper.buildKeyForDomainCache(this.val$provider, this.val$thirdPartyUid), idDns);
                            Keeper.writeEntity(this.val$ctx, Keeper.DOMAIN_MAPPING_KEY, map2);
                        }
                        accessToken.setToken(this.val$authCode);
                        final String str = this.val$provider;
                        HMLog.debug(new Function0() { // from class: com.huami.passport.i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountApi.AnonymousClass13.lambda$onSuccess$1(str);
                            }
                        });
                    }
                    if (TextUtils.equals(this.val$provider, "huami_phone")) {
                        accessToken.setToken(this.val$authCode);
                    }
                    if (Keeper.writeEntity(this.val$ctx, Keeper.DOMAIN_KEY, domain)) {
                        final long j = this.val$searchStart;
                        HMLog.debug(new Function0() { // from class: com.huami.passport.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountApi.AnonymousClass13.lambda$onSuccess$2(idDns, j);
                            }
                        });
                        AccountApi.thirdPartyLogin(this.val$ctx, this.val$device, this.val$appInfo, this.val$thirdName, this.val$provider, accessToken.getToken(), accessToken.getTokenId(), this.val$region, this.val$httpCallback);
                        return;
                    }
                }
            }
            AccountApi.onErrorCallback(this.val$callback, ErrorCode.INNER_HANDLE_ERROR);
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$15, reason: invalid class name */
    public class AnonymousClass15 implements IAccount.Callback<Token, ErrorCode> {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ boolean val$shouldCache;

        /* JADX INFO: renamed from: com.huami.passport.AccountApi$15$1, reason: invalid class name */
        public class AnonymousClass1 implements WebAPI.HttpCallback<BindList> {
            public AnonymousClass1() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onFailure$0(VolleyError volleyError) {
                return "listAccount " + volleyError;
            }

            @Override // com.huami.passport.net.WebAPI.HttpCallback
            public void onFailure(final VolleyError volleyError) {
                HMLog.error(new Function0() { // from class: com.huami.passport.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass15.AnonymousClass1.lambda$onFailure$0(volleyError);
                    }
                });
                AccountApi.onErrorCallback(AnonymousClass15.this.val$callback, WebAPI.getError(volleyError));
            }

            @Override // com.huami.passport.net.WebAPI.HttpCallback
            public void onSuccess(BindList bindList) {
                AccountApi.onSuccessCallback(AnonymousClass15.this.val$callback, bindList.getAccounts());
            }
        }

        public AnonymousClass15(boolean z, IAccount.Callback callback) {
            this.val$shouldCache = z;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onError$0(ErrorCode errorCode) {
            return "listAccount getToken " + errorCode;
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onError(final ErrorCode errorCode) {
            HMLog.error(new Function0() { // from class: com.huami.passport.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass15.lambda$onError$0(errorCode);
                }
            });
            AccountApi.onErrorCallback(this.val$callback, errorCode);
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(Token token) {
            WebAPI.listAccount(AccountApi.this.mContext, token.getAccessToken(), Configs.SDK_VERSION, this.val$shouldCache, new AnonymousClass1());
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$18, reason: invalid class name */
    public class AnonymousClass18 implements FacebookCallback<LoginResult> {
        public final /* synthetic */ Token val$appToken;
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$countryCode;

        public AnonymousClass18(IAccount.Callback callback, Token token, String str) {
            this.val$callback = callback;
            this.val$appToken = token;
            this.val$countryCode = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onCancel$2() {
            return "facebook onCancel";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onError$3(FacebookException facebookException) {
            return "facebook error " + facebookException.getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0() {
            return "Facebook success";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$1(com.facebook.AccessToken accessToken, String str) {
            return "Facebook Token:" + accessToken.getToken() + " UserId:" + str + " isExpired:" + accessToken.isExpired();
        }

        @Override // com.facebook.FacebookCallback
        public void onCancel() {
            HMLog.debug(new Function0() { // from class: com.huami.passport.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass18.lambda$onCancel$2();
                }
            });
            AccountApi.onErrorCallback(this.val$callback, ErrorCode.USER_CANCEL_ERROR);
        }

        @Override // com.facebook.FacebookCallback
        public void onError(final FacebookException facebookException) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass18.lambda$onError$3(facebookException);
                }
            });
            AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_DONE_ERROR_RESULT);
        }

        @Override // com.facebook.FacebookCallback
        public void onSuccess(LoginResult loginResult) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass18.lambda$onSuccess$0();
                }
            });
            if (loginResult == null) {
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_DONE_ERROR_RESULT);
                return;
            }
            final com.facebook.AccessToken accessToken = loginResult.getAccessToken();
            if (accessToken == null || TextUtils.isEmpty(accessToken.getToken()) || TextUtils.isEmpty(accessToken.getUserId())) {
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_DONE_ERROR_RESULT);
                return;
            }
            final String userId = accessToken.getUserId();
            HMLog.debug(new Function0() { // from class: com.huami.passport.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass18.lambda$onSuccess$1(accessToken, userId);
                }
            });
            AccountApi.this.requestBindApi(this.val$appToken, accessToken.getToken(), this.val$countryCode, Configs.Params.REQUEST_TOKEN, this.val$callback);
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$2, reason: invalid class name */
    public class AnonymousClass2 implements IAccount.Callback<Token, ErrorCode> {
        public final /* synthetic */ boolean val$force;
        public final /* synthetic */ Token val$token;

        public AnonymousClass2(Token token, boolean z) {
            this.val$token = token;
            this.val$force = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onError$1(boolean z, Token token) {
            return "getToken onError force:" + z + "token" + token;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0(boolean z, Token token) {
            return "getToken onSuccess force:" + z + " token:" + token;
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onError(ErrorCode errorCode) {
            this.val$token.setErrorCode(errorCode.getErrorCode());
            if (TextUtils.equals("0108", errorCode.getErrorCode())) {
                this.val$token.setMutime(errorCode.getMutime());
                this.val$token.setMutimeLong(errorCode.getMutimeLong());
            }
            this.val$token.setError(errorCode);
            this.val$token.setNextActions(errorCode.getNextActions());
            final boolean z = this.val$force;
            final Token token = this.val$token;
            HMLog.error(new Function0() { // from class: com.huami.passport.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass2.lambda$onError$1(z, token);
                }
            });
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(Token token) {
            if (token != null) {
                this.val$token.setNextActions(token.getNextActions());
                this.val$token.setProvider(token.getProvider());
                this.val$token.setUid(token.getUid());
                this.val$token.setAccessToken(token.getAccessToken());
                this.val$token.setResult(Configs.Params.OK);
            }
            final boolean z = this.val$force;
            final Token token2 = this.val$token;
            HMLog.debug(new Function0() { // from class: com.huami.passport.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass2.lambda$onSuccess$0(z, token2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$20, reason: invalid class name */
    public class AnonymousClass20 extends AsyncTask<Void, Void, XiaomiOAuthResults> {
        public Exception e;
        public final /* synthetic */ Token val$appToken;
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$countryCode;
        public final /* synthetic */ XiaomiOAuthFuture val$future;

        public AnonymousClass20(XiaomiOAuthFuture xiaomiOAuthFuture, Token token, String str, IAccount.Callback callback) {
            this.val$future = xiaomiOAuthFuture;
            this.val$appToken = token;
            this.val$countryCode = str;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onPostExecute$0(String str, String str2) {
            return "Mi sdk success Access Token " + str + "Code:" + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onPostExecute$1() {
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
        public void onPostExecute(XiaomiOAuthResults xiaomiOAuthResults) {
            if (xiaomiOAuthResults != null) {
                final String accessToken = xiaomiOAuthResults.getAccessToken();
                final String code = xiaomiOAuthResults.getCode();
                HMLog.debug(new Function0() { // from class: com.huami.passport.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass20.lambda$onPostExecute$0(accessToken, code);
                    }
                });
                if (!TextUtils.isEmpty(code)) {
                    AccountApi.this.requestBindApi(this.val$appToken, code, this.val$countryCode, Configs.Params.REQUEST_TOKEN, this.val$callback);
                    return;
                } else {
                    HMLog.debug(new Function0() { // from class: com.huami.passport.w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApi.AnonymousClass20.lambda$onPostExecute$1();
                        }
                    });
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.INNER_HANDLE_ERROR);
                    return;
                }
            }
            Exception exc = this.e;
            if (exc == null) {
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_DONE_NO_RESULT);
                return;
            }
            if (exc instanceof OperationCanceledException) {
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.USER_CANCEL_ERROR);
            }
            if (this.e instanceof XMAuthericationException) {
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_DENIED_ERROR);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ Activity val$activity;
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$provider;

        /* JADX INFO: renamed from: com.huami.passport.AccountApi$4$1, reason: invalid class name */
        public class AnonymousClass1 implements FacebookCallback<LoginResult> {
            public AnonymousClass1() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onCancel$2() {
                return "facebook onCancel";
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onError$3(FacebookException facebookException) {
                return "facebook error " + facebookException.getMessage();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onSuccess$0() {
                return "Facebook success";
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onSuccess$1(com.facebook.AccessToken accessToken, String str) {
                return "Facebook Token:" + accessToken.getToken() + " UserId:" + str + " isExpired:" + accessToken.isExpired();
            }

            @Override // com.facebook.FacebookCallback
            public void onCancel() {
                HMLog.debug(new Function0() { // from class: com.huami.passport.e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass4.AnonymousClass1.lambda$onCancel$2();
                    }
                });
                AccountApi.onErrorCallback(AnonymousClass4.this.val$callback, ErrorCode.USER_CANCEL_ERROR);
            }

            @Override // com.facebook.FacebookCallback
            public void onError(final FacebookException facebookException) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass4.AnonymousClass1.lambda$onError$3(facebookException);
                    }
                });
                AccountApi.onErrorCallback(AnonymousClass4.this.val$callback, ErrorCode.TPA_DONE_ERROR_RESULT);
            }

            @Override // com.facebook.FacebookCallback
            public void onSuccess(LoginResult loginResult) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass4.AnonymousClass1.lambda$onSuccess$0();
                    }
                });
                if (loginResult == null) {
                    AccountApi.onErrorCallback(AnonymousClass4.this.val$callback, ErrorCode.TPA_DONE_ERROR_RESULT);
                    return;
                }
                final com.facebook.AccessToken accessToken = loginResult.getAccessToken();
                if (accessToken == null || TextUtils.isEmpty(accessToken.getToken()) || TextUtils.isEmpty(accessToken.getUserId())) {
                    AccountApi.onErrorCallback(AnonymousClass4.this.val$callback, ErrorCode.TPA_DONE_ERROR_RESULT);
                    return;
                }
                final String userId = accessToken.getUserId();
                HMLog.debug(new Function0() { // from class: com.huami.passport.b0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass4.AnonymousClass1.lambda$onSuccess$1(accessToken, userId);
                    }
                });
                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                AccountApi.loginIdAuth(anonymousClass4.val$activity, "facebook", userId, AccountApi.this.mTpac.getThirdName(), accessToken.getToken(), null, AnonymousClass4.this.val$callback);
            }
        }

        public AnonymousClass4(IAccount.Callback callback, String str, Activity activity) {
            this.val$callback = callback;
            this.val$provider = str;
            this.val$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$1() {
            return "Login error {activity is null}";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$2() {
            return "scope is null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String lambda$run$3() {
            return "facebook scope " + AccountApi.this.mTpac.getScope();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!Utils.isNetworkAvailable(AccountApi.this.mContext)) {
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.NO_NETWORK_ERROR);
                return;
            }
            try {
                Map<String, TpaConfig> tpaConfigs = Utils.getTpaConfigs(AccountApi.this.mContext);
                if (tpaConfigs == null) {
                    HMLog.debug(new Function0() { // from class: com.huami.passport.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR;
                        }
                    });
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR);
                    return;
                }
                AccountApi.this.mTpac = tpaConfigs.get(this.val$provider);
                TpaConfig tpaConfig = AccountApi.this.mTpac;
                if (tpaConfig == null || !Utils.verifyParamByTpac(this.val$provider, tpaConfig)) {
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_CONFIG_ERROR);
                    return;
                }
                if (this.val$activity == null) {
                    HMLog.debug(new Function0() { // from class: com.huami.passport.a0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApi.AnonymousClass4.lambda$run$1();
                        }
                    });
                    AccountApi.onErrorCallback(this.val$callback, ErrorCode.PARAMS_IS_NULL_ERROR);
                    return;
                }
                if (TextUtils.equals(this.val$provider, "xiaomi")) {
                    try {
                        List<String> scope = AccountApi.this.mTpac.getScope();
                        int size = scope.size();
                        int[] iArr = new int[size];
                        for (int i = 0; i < size; i++) {
                            iArr[i] = Integer.parseInt(scope.get(i));
                        }
                        try {
                            XiaomiOAuthFuture<XiaomiOAuthResults> xiaomiOAuthFutureStartGetOAuthCode = new XiaomiOAuthorize().setAppId(Long.parseLong(AccountApi.this.mTpac.getAppId())).setRedirectUrl(AccountApi.this.mTpac.getRedirectUrl()).setScope(iArr).setKeepCookies(AccountApi.this.mTpac.isKeepCookies()).setNoMiui(Utils.isNoMiui(AccountApi.this.mContext)).setPlatform(AccountApi.this.mTpac.getPlatform()).setSkipConfirm(AccountApi.this.mTpac.isSkipConfirm()).startGetOAuthCode(this.val$activity);
                            AccountApi accountApi = AccountApi.this;
                            accountApi.waitAndShowFutureResultForMi(this.val$activity, accountApi.mTpac, xiaomiOAuthFutureStartGetOAuthCode, this.val$callback);
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
                        WXEntryProxyActivity.setTpaConfig(AccountApi.this.mTpac, 1);
                        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this.val$activity, AccountApi.this.mTpac.getAppId(), false);
                        if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
                            AccountApi.onErrorCallback(this.val$callback, ErrorCode.UNINSTALL_TPAPP_ERROR);
                            return;
                        }
                        iwxapiCreateWXAPI.registerApp(AccountApi.this.mTpac.getAppId());
                        SendAuth.Req req = new SendAuth.Req();
                        req.scope = AccountApi.this.mTpac.getScope().get(0);
                        req.state = Configs.WechatConfig.state;
                        iwxapiCreateWXAPI.sendReq(req);
                    } catch (Exception unused3) {
                        AccountApi.onErrorCallback(this.val$callback, ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR);
                        return;
                    }
                }
                if (TextUtils.equals(this.val$provider, "facebook")) {
                    FacebookSdk.sdkInitialize(this.val$activity.getApplicationContext());
                    CallbackManager callbackManagerCreate = CallbackManager.Factory.create();
                    AccountApi.mFacebookCallbackManager = callbackManagerCreate;
                    LoginManager loginManager = LoginManager.getInstance();
                    loginManager.registerCallback(callbackManagerCreate, new AnonymousClass1());
                    HMLog.debug(new Function0() { // from class: com.huami.passport.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.a.lambda$run$3();
                        }
                    });
                    loginManager.logInWithReadPermissions(this.val$activity, AccountApi.this.mTpac.getScope());
                }
                if (TextUtils.equals(this.val$provider, "google")) {
                    if (this.val$activity instanceof FragmentActivity) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.AccountApi.4.2

                            /* JADX INFO: renamed from: com.huami.passport.AccountApi$4$2$1, reason: invalid class name */
                            public class AnonymousClass1 implements IAccount.Callback<GoogleSignInAccount, String> {
                                public AnonymousClass1() {
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static /* synthetic */ String lambda$onSuccess$0(GoogleSignInAccount googleSignInAccount) {
                                    return "result:" + googleSignInAccount;
                                }

                                @Override // com.huami.passport.IAccount.Callback
                                public void onError(String str) {
                                    AccountApi.onErrorCallback(AnonymousClass4.this.val$callback, str);
                                }

                                @Override // com.huami.passport.IAccount.Callback
                                public void onSuccess(final GoogleSignInAccount googleSignInAccount) {
                                    HMLog.debug(new Function0() { // from class: com.huami.passport.f0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AccountApi.AnonymousClass4.AnonymousClass2.AnonymousClass1.lambda$onSuccess$0(googleSignInAccount);
                                        }
                                    });
                                    AccountApi.loginIdAuth(AnonymousClass4.this.val$activity, "google", googleSignInAccount.getId(), AccountApi.this.mTpac.getThirdName(), googleSignInAccount.getIdToken(), null, AnonymousClass4.this.val$callback);
                                }
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                AccountApi accountApi2 = AccountApi.this;
                                if (accountApi2.mGoogleHelper == null) {
                                    accountApi2.mGoogleHelper = new GoogleHelper();
                                }
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                if (!AccountApi.this.mGoogleHelper.isGmsInstalled(anonymousClass4.val$activity.getApplicationContext())) {
                                    AccountApi.onErrorCallback(AnonymousClass4.this.val$callback, ErrorCode.UNINSTALL_TPAPP_ERROR);
                                } else {
                                    AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                                    AccountApi.this.mGoogleHelper.getAuthCode((FragmentActivity) anonymousClass5.val$activity, new AnonymousClass1());
                                }
                            }
                        });
                    } else {
                        AccountApi.onErrorCallback(this.val$callback, ErrorCode.GOOGLE_ACTIVITY_CONFIG_ERROR);
                    }
                }
            } catch (IOException unused4) {
                AccountApi.onErrorCallback(this.val$callback, ErrorCode.NO_TPA_FOUND_ERROR);
            }
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$5, reason: invalid class name */
    public class AnonymousClass5 implements IAccount.Callback<String, String> {
        public AnonymousClass5() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onError$1(String str) {
            return "offlineLogout:" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0(String str) {
            return "offlineLogout onSuccess:" + str;
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onError(final String str) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass5.lambda$onError$1(str);
                }
            });
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(final String str) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.AnonymousClass5.lambda$onSuccess$0(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.AccountApi$9, reason: invalid class name */
    public class AnonymousClass9 implements Runnable {
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ ErrorCode val$code;

        public AnonymousClass9(IAccount.Callback callback, ErrorCode errorCode) {
            this.val$callback = callback;
            this.val$code = errorCode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$run$0(ErrorCode errorCode) {
            return "##Callback Error " + errorCode;
        }

        @Override // java.lang.Runnable
        public void run() {
            AccountApi.clear();
            WXEntryProxyActivity.clear();
            if (this.val$callback != null) {
                final ErrorCode errorCode = this.val$code;
                HMLog.debug(new Function0() { // from class: com.huami.passport.i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.AnonymousClass9.lambda$run$0(errorCode);
                    }
                });
                this.val$callback.onError(this.val$code);
            }
        }
    }

    public AccountApi(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        this.mContext = context.getApplicationContext();
        this.mExecutor = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindFacebookAccount(Activity activity, Token token, String str, IAccount.Callback<BindResult, ErrorCode> callback) {
        FacebookSdk.sdkInitialize(activity.getApplicationContext());
        CallbackManager callbackManagerCreate = CallbackManager.Factory.create();
        mFacebookCallbackManager = callbackManagerCreate;
        LoginManager loginManager = LoginManager.getInstance();
        loginManager.registerCallback(callbackManagerCreate, new AnonymousClass18(callback, token, str));
        HMLog.debug(new Function0() { // from class: n1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.lambda$bindFacebookAccount$38();
            }
        });
        loginManager.logInWithReadPermissions(activity, this.mTpac.getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindGoogleAccount(final Activity activity, final Token token, final String str, final IAccount.Callback<BindResult, ErrorCode> callback) {
        if (activity instanceof FragmentActivity) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.AccountApi.19

                /* JADX INFO: renamed from: com.huami.passport.AccountApi$19$1, reason: invalid class name */
                public class AnonymousClass1 implements IAccount.Callback<GoogleSignInAccount, String> {
                    public AnonymousClass1() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static /* synthetic */ String lambda$onSuccess$0(GoogleSignInAccount googleSignInAccount) {
                        return "[Login] google result:" + googleSignInAccount;
                    }

                    @Override // com.huami.passport.IAccount.Callback
                    public void onError(String str) {
                        AccountApi.onErrorCallback(callback, str);
                    }

                    @Override // com.huami.passport.IAccount.Callback
                    public void onSuccess(final GoogleSignInAccount googleSignInAccount) {
                        HMLog.debug(new Function0() { // from class: com.huami.passport.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountApi.AnonymousClass19.AnonymousClass1.lambda$onSuccess$0(googleSignInAccount);
                            }
                        });
                        AnonymousClass19 anonymousClass19 = AnonymousClass19.this;
                        AccountApi accountApi = AccountApi.this;
                        Token token = token;
                        String idToken = googleSignInAccount.getIdToken();
                        AnonymousClass19 anonymousClass110 = AnonymousClass19.this;
                        accountApi.requestBindApi(token, idToken, str, Configs.Params.REQUEST_TOKEN, callback);
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    AccountApi accountApi = AccountApi.this;
                    if (accountApi.mGoogleHelper == null) {
                        accountApi.mGoogleHelper = new GoogleHelper();
                    }
                    if (AccountApi.this.mGoogleHelper.isGmsInstalled(activity.getApplicationContext())) {
                        AccountApi.this.mGoogleHelper.getAuthCode((FragmentActivity) activity, new AnonymousClass1());
                    } else {
                        AccountApi.onErrorCallback(callback, ErrorCode.UNINSTALL_TPAPP_ERROR);
                    }
                }
            });
        } else {
            onErrorCallback(callback, ErrorCode.GOOGLE_ACTIVITY_CONFIG_ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindLineAccount(final Activity activity, final Token token, final String str, final IAccount.Callback<BindResult, ErrorCode> callback) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huami.passport.AccountApi.17

            /* JADX INFO: renamed from: com.huami.passport.AccountApi$17$1, reason: invalid class name */
            public class AnonymousClass1 implements IAccount.Callback<LineLoginResult, String> {
                public AnonymousClass1() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ String lambda$onSuccess$0() {
                    return "[Login] line obtain access_token error";
                }

                @Override // com.huami.passport.IAccount.Callback
                public void onError(String str) {
                    AccountApi.onErrorCallback(callback, str);
                }

                @Override // com.huami.passport.IAccount.Callback
                public void onSuccess(LineLoginResult lineLoginResult) {
                    LineCredential lineCredential = lineLoginResult.getLineCredential();
                    if (lineCredential != null) {
                        String accessToken = lineCredential.getAccessToken().getAccessToken();
                        if (!TextUtils.isEmpty(accessToken)) {
                            AnonymousClass17 anonymousClass17 = AnonymousClass17.this;
                            AccountApi.this.requestBindApi(token, accessToken, str, "access_token", callback);
                            return;
                        }
                    }
                    HMLog.error(new Function0() { // from class: com.huami.passport.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApi.AnonymousClass17.AnonymousClass1.lambda$onSuccess$0();
                        }
                    });
                    AccountApi.onErrorCallback(callback, ErrorCode.TPA_DONE_ERROR_RESULT);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                AccountApi accountApi = AccountApi.this;
                if (accountApi.mLineHelper == null) {
                    accountApi.mLineHelper = new LineHelper();
                }
                AccountApi accountApi2 = AccountApi.this;
                accountApi2.mLineHelper.getAccessToken(activity, accountApi2.mTpac, new AnonymousClass1());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindMiAccount(Token token, String str, IAccount.Callback<BindResult, ErrorCode> callback, Activity activity) {
        try {
            List<String> scope = this.mTpac.getScope();
            int size = scope.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = Integer.parseInt(scope.get(i));
            }
            try {
                new AnonymousClass20(new XiaomiOAuthorize().setAppId(Long.parseLong(this.mTpac.getAppId())).setRedirectUrl(this.mTpac.getRedirectUrl()).setScope(iArr).setKeepCookies(this.mTpac.isKeepCookies()).setNoMiui(false).setPlatform(this.mTpac.getPlatform()).setSkipConfirm(this.mTpac.isSkipConfirm()).startGetOAuthCode(activity), token, str, callback).execute(new Void[0]);
            } catch (Exception unused) {
                onErrorCallback(callback, ErrorCode.CALL_TPSDK_ERROR);
            }
        } catch (Exception unused2) {
            HMLog.error(new Function0() { // from class: c2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$bindMiAccount$40();
                }
            });
            onErrorCallback(callback, ErrorCode.TPA_CONFIG_ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindPhoneAccount(Token token, String str, String str2, IAccount.Callback<BindResult, ErrorCode> callback) {
        if (!TextUtils.isEmpty(str)) {
            requestBindApi(token, str, str2, "access_token", callback);
        } else {
            HMLog.debug(new Function0() { // from class: q1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$bindPhoneAccount$39();
                }
            });
            onErrorCallback(callback, ErrorCode.INNER_HANDLE_ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindWechatAccount(final Token token, String str, final String str2, final IAccount.Callback<BindResult, ErrorCode> callback, Activity activity) {
        try {
            WXEntryProxyActivity.setCallback(new IAccount.Callback<LoginToken, ErrorCode>() { // from class: com.huami.passport.AccountApi.21
                @Override // com.huami.passport.IAccount.Callback
                public void onError(ErrorCode errorCode) {
                    AccountApi.onErrorCallback(callback, errorCode);
                }

                @Override // com.huami.passport.IAccount.Callback
                public void onSuccess(LoginToken loginToken) {
                    AccountApi.this.requestBindApi(token, loginToken.getResult(), str2, Configs.Params.REQUEST_TOKEN, callback);
                }
            });
            WXEntryProxyActivity.setTpaConfig(this.mTpac, 2);
            IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(activity, this.mTpac.getAppId(), false);
            if (!iwxapiCreateWXAPI.isWXAppInstalled()) {
                onErrorCallback(callback, ErrorCode.UNINSTALL_TPAPP_ERROR);
                return;
            }
            iwxapiCreateWXAPI.registerApp(this.mTpac.getAppId());
            SendAuth.Req req = new SendAuth.Req();
            req.scope = this.mTpac.getScope().get(0);
            req.state = Configs.WechatConfig.state;
            iwxapiCreateWXAPI.sendReq(req);
        } catch (Exception unused) {
            onErrorCallback(callback, ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR);
        }
    }

    public static void clear() {
        if (mFacebookCallbackManager != null) {
            mFacebookCallbackManager = null;
        }
    }

    public static ErrorCode entity2Error(Entity entity) {
        if (entity == null) {
            HMLog.error(new Function0() { // from class: g2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$entity2Error$2();
                }
            });
            return ErrorCode.builder(ErrorCode.UNKOWN_ERROR);
        }
        ErrorCode errorCode = new ErrorCode(entity.getErrorCode());
        if (TextUtils.equals("0108", entity.getErrorCode())) {
            errorCode.setMutime(entity.getMutime());
            errorCode.setMutimeLong(entity.getMutimeLong());
        }
        if (entity instanceof LoginToken) {
            LoginToken loginToken = (LoginToken) entity;
            if (loginToken.getData() != null) {
                errorCode.setData(loginToken.getData());
            }
        }
        errorCode.setNextActions(entity.getNextActions());
        errorCode.setUserId(entity.getUserId());
        return errorCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$bindAccount$34() {
        return "bindAccount callback or provider is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$bindAccount$35(String str) {
        return "bindAccount provider " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$bindAccount$37() {
        return "bindAccount error {activity is null}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$bindFacebookAccount$38() {
        return "facebook scope " + this.mTpac.getScope();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$bindMiAccount$40() {
        return "Resolved permission scope profile failed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$bindPhoneAccount$39() {
        return "moblie oauth code is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$checkLogin$0() {
        return "checkLogin version " + Configs.SDK_VERSION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$entity2Error$2() {
        return "entity2Error -> entity is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getInnerToken$3() {
        return "renew login token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getInnerToken$4() {
        return "renew login token failure";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getInnerToken$5(LoginToken loginToken) {
        return "save login token " + loginToken;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getInnerToken$6() {
        return "get app token success";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getInnerToken$7(LoginToken loginToken) {
        StringBuilder sb = new StringBuilder();
        sb.append("get app token failure ");
        sb.append(loginToken);
        return sb.toString() != null ? loginToken.getErrorCode() : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getInnerToken$8() {
        return "Not refresh Token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isLogin$1() {
        return "sdk version " + Configs.SDK_VERSION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$listAccount$32() {
        return "listAccount callback is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$listAccount$33() {
        return "listAccount";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$login$12(String str) {
        return String.format("start by %s", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginIdAuth$18(String str, String str2, String str3, String str4, String str5) {
        return "loginIdAuth provider[" + str + "] thirdPartyUid[" + str2 + "] thirdName[" + str3 + "] authCode[" + str4 + "] region[" + str5 + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginIdAuth$19(String str) {
        return "Read domain cache for " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginIdAuth$20(String str) {
        return "facebook point to us -> url:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginIdAuth$21(String str) {
        return "google point to us -> url:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginIdAuth$22() {
        return "Hit domain cache";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginIdAuth$23(String str) {
        return "Get id server url " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginIdAuth$24(Domain domain) {
        return "No search domain:" + domain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginIdAuth$25(String str) {
        return "Get id server url " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginIdAuthServer$16() {
        return "###loginIdAuthServer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginIdAuthServer$17() {
        return "token is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$logout$13(TokenInfo tokenInfo) {
        return "logout login token " + tokenInfo.getLoginToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onActivityResult$28(int i, int i2) {
        return "requestCode " + i + " resultCode " + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onBindAccountErrorCallback$15(String str) {
        return "mobile bindAccount error" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$refreshLoginToken$27() {
        return "LoginTken save error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$syncLoginToken$10() {
        return "syncLoginToken exception";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$syncLoginToken$11() {
        return "result error code is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$syncLoginToken$9(LoginToken loginToken) {
        return "save login token " + loginToken;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$unbindAccount$29() {
        return "unbindAccount callback is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$unbindAccount$30(String str) {
        return "unbindAccount provider " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$verifyAccessToken$14(String str) {
        return "verifyAccessToken " + str;
    }

    @Deprecated
    public static void loginIdAuth(Context context, final String str, final String str2, final String str3, final String str4, final String str5, IAccount.Callback<LoginToken, ErrorCode> callback) {
        Context applicationContext = context.getApplicationContext();
        HMLog.debug(new Function0() { // from class: l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$loginIdAuth$18(str, str2, str3, str4, str5);
            }
        });
        Device deviceCache = Utils.getDeviceCache(applicationContext);
        AppInfo appInfo = Utils.getAppInfo(applicationContext);
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(callback, applicationContext);
        if (TextUtils.equals(str, "facebook") || TextUtils.equals(str, "google")) {
            HMLog.debug(new Function0() { // from class: k1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$loginIdAuth$19(str);
                }
            });
            Map map = Configs.isDebugMode ? (Map) Keeper.readEntity(applicationContext, Keeper.DOMAIN_DEBUG_MAPPING_KEY, Map.class) : (Map) Keeper.readEntity(applicationContext, Keeper.DOMAIN_MAPPING_KEY, Map.class);
            final String str6 = map != null ? (String) map.get(Keeper.buildKeyForDomainCache(str, str2)) : null;
            if (Configs.facebookForcePointToUs && TextUtils.equals(str, "facebook")) {
                String str7 = Configs.ID_SERVER_US_PRODUCT;
                if (Configs.isDebugMode) {
                    str7 = Configs.ID_SERVER_US_TEST;
                }
                str6 = str7;
                HMLog.debug(new Function0() { // from class: e1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$loginIdAuth$20(str6);
                    }
                });
            }
            if (Configs.googleForcePointToUs && TextUtils.equals(str, "google")) {
                String str8 = Configs.ID_SERVER_US_PRODUCT;
                if (Configs.isDebugMode) {
                    str8 = Configs.ID_SERVER_US_TEST;
                }
                str6 = str8;
                HMLog.debug(new Function0() { // from class: p2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$loginIdAuth$21(str6);
                    }
                });
            }
            if (!TextUtils.isEmpty(str6)) {
                HMLog.debug(new Function0() { // from class: f2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$loginIdAuth$22();
                    }
                });
                if (Keeper.writeEntity(applicationContext, Keeper.DOMAIN_KEY, new Domain(str6))) {
                    HMLog.debug(new Function0() { // from class: d1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApi.lambda$loginIdAuth$23(str6);
                        }
                    });
                    thirdPartyLogin(applicationContext, deviceCache, appInfo, str3, str, str4, null, str5, anonymousClass12);
                    return;
                }
                return;
            }
        }
        if (!TextUtils.equals(str, "huami")) {
            searchExistingUserAccount(applicationContext, str, deviceCache, appInfo, str3, str4, str5, new AnonymousClass13(callback, str, applicationContext, str2, str4, System.currentTimeMillis(), deviceCache, appInfo, str3, str5, anonymousClass12));
            return;
        }
        final Domain domain = new Domain();
        if (Configs.isDebugMode) {
            domain.setIdDns(Configs.ID_SERVER_US_TEST);
        } else {
            domain.setIdDns(Configs.ID_SERVER_US_PRODUCT);
        }
        final String idDns = domain.getIdDns();
        HMLog.debug(new Function0() { // from class: y1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$loginIdAuth$24(domain);
            }
        });
        if (!Keeper.writeEntity(applicationContext, Keeper.DOMAIN_KEY, domain)) {
            onErrorCallback(callback, ErrorCode.INNER_HANDLE_ERROR);
        } else {
            HMLog.debug(new Function0() { // from class: h1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$loginIdAuth$25(idDns);
                }
            });
            thirdPartyLogin(applicationContext, deviceCache, appInfo, str3, str, str4, null, str5, anonymousClass12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBindAccountErrorCallback(IAccount.Callback<BindResult, ErrorCode> callback, VolleyError volleyError) {
        final String error = WebAPI.getError(volleyError);
        String str = volleyError instanceof WebAPI.ServiceError ? ((WebAPI.ServiceError) volleyError).errorMsg : null;
        HMLog.debug(new Function0() { // from class: g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$onBindAccountErrorCallback$15(error);
            }
        });
        onErrorCallback(callback, error, str);
    }

    public static <S> void onErrorCallback(IAccount.Callback<S, ErrorCode> callback, String str) {
        onErrorCallback(callback, ErrorCode.builder(str));
    }

    public static <S> void onSuccessCallback(IAccount.Callback<S, ErrorCode> callback, S s) {
        new Handler(Looper.getMainLooper()).post(new AnonymousClass10(callback, s));
    }

    public static void refreshLoginToken(Context context, final LoginToken loginToken, IAccount.Callback<LoginToken, ErrorCode> callback) {
        try {
            HMLog.debug(new Function0() { // from class: m2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return String.valueOf(loginToken);
                }
            });
            long jCurrentTimeMillis = System.currentTimeMillis();
            TokenInfo tokenInfo = loginToken.getTokenInfo();
            tokenInfo.setLastUpdateAppTtl(jCurrentTimeMillis);
            tokenInfo.setLastUpdateTtl(jCurrentTimeMillis);
            UserInfo userInfo = loginToken.getUserInfo();
            if (userInfo != null && !TextUtils.isEmpty(userInfo.getNickName())) {
                try {
                    userInfo.setNickName(URLDecoder.decode(userInfo.getNickName(), "UTF-8"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            List<NextActions> nextActions = loginToken.getNextActions();
            if (nextActions != null && nextActions.size() > 0) {
                loginToken.setNextActions(null);
            }
            if (Keeper.saveToken(context, loginToken)) {
                loginToken.setNextActions(nextActions);
                onSuccessCallback(callback, loginToken);
                return;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        HMLog.debug(new Function0() { // from class: w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$refreshLoginToken$27();
            }
        });
        onErrorCallback(callback, ErrorCode.INNER_HANDLE_ERROR);
    }

    private static void searchExistingUserAccount(Context context, String str, Device device, AppInfo appInfo, String str2, String str3, String str4, WebAPI.HttpCallback<Result> httpCallback) {
        HashMap map = new HashMap();
        map.put("third_name", str2);
        map.put("app_name", appInfo.getAppId());
        map.put("device_id_type", device.getDeviceidType());
        map.put("device_id", device.getDeviceid());
        if (str4 == null) {
            str4 = Locale.getDefault().getCountry();
        }
        map.put("region", str4);
        map.put("lang", Locale.getDefault().getLanguage());
        map.put("source", appInfo.buildParams());
        map.put(Configs.Params.DEVICE_MODEL, device.getDeviceModel());
        map.put(Configs.Params.OS_VERSION, Configs.SDK_VERSION);
        if (TextUtils.equals(str, "facebook") || TextUtils.equals(str, "huami_phone")) {
            map.put("grant_type", "access_token");
        }
        if (TextUtils.equals(str, "google")) {
            map.put("grant_type", Configs.Params.REQUEST_TOKEN);
        }
        map.put(Configs.Params.THIRD_TOKEN, str3);
        WebAPI.searchExistingUserAccount(context, str, map, httpCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signOutForFacebook() {
        LoginManager.getInstance().logOut();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void thirdPartyLogin(Context context, Device device, AppInfo appInfo, String str, String str2, String str3, String str4, String str5, WebAPI.HttpCallback<LoginToken> httpCallback) {
        HashMap map = new HashMap();
        map.put("third_name", str);
        map.put("app_name", appInfo.getAppId());
        map.put("device_id_type", device.getDeviceidType());
        map.put("device_id", device.getDeviceid());
        map.put("lang", Locale.getDefault().getLanguage());
        map.put("source", appInfo.buildParams());
        map.put(Configs.Params.DEVICE_MODEL, device.getDeviceModel());
        map.put(Configs.Params.OS_VERSION, Configs.SDK_VERSION);
        map.put("grant_type", "access_token");
        map.put(Configs.Params.THIRD_TOKEN, str3);
        if (!TextUtils.isEmpty(str4)) {
            map.put(Configs.Params.THIRD_TOKEN_ID, str4);
        }
        if (TextUtils.equals(str2, "google")) {
            map.put("grant_type", Configs.Params.REQUEST_TOKEN);
        }
        if (!TextUtils.isEmpty(str5)) {
            map.put("user_region", str5);
        }
        WebAPI.thirdPartyLogin(context, str2, map, httpCallback);
    }

    @Override // com.huami.passport.IAccount
    public void bindAccount(Activity activity, String str, IAccount.Callback<BindResult, ErrorCode> callback) {
        bindAccount(activity, str, null, null, callback);
    }

    public void checkLogin(IAccount.Callback<String, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: p1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$checkLogin$0();
            }
        });
        if (callback == null) {
            throw new IllegalArgumentException("callback should not be null");
        }
        LoginToken tokenCache = Keeper.getTokenCache(this.mContext);
        if (tokenCache == null) {
            callback.onError(ErrorCode.builder(ErrorCode.NO_LOGIN_ERROR));
        } else if (tokenCache.getTokenInfo() == null) {
            callback.onError(ErrorCode.builder(ErrorCode.NO_LOGIN_ERROR));
        } else {
            callback.onSuccess(Configs.Params.OK);
        }
    }

    public boolean clearAll() {
        Keeper.clearToken(this.mContext);
        HttpDnsCache.clear();
        return true;
    }

    public String getAccessToken() {
        Token token = getToken();
        return (token == null || TextUtils.isEmpty(token.getAccessToken())) ? "" : token.getAccessToken();
    }

    public String getCurrentRegion() {
        UserInfo userInfo = getUserInfo();
        if (userInfo == null || userInfo.getRegistInfo() == null) {
            return null;
        }
        return userInfo.getRegistInfo().getRegion();
    }

    public String getCurrentUid() {
        TokenInfo tokenInfo;
        LoginToken tokenCache = Keeper.getTokenCache(this.mContext);
        if (tokenCache == null || (tokenInfo = tokenCache.getTokenInfo()) == null) {
            return null;
        }
        return tokenInfo.getUserId();
    }

    public synchronized void getInnerToken(boolean z, IAccount.Callback<Token, ErrorCode> callback) {
        Utils.checkTimeConsumingInMainThread();
        if (callback == null) {
            return;
        }
        final LoginToken tokenCache = Keeper.getTokenCache(this.mContext);
        if (tokenCache != null && tokenCache.getTokenInfo() != null) {
            if (!tokenCache.isLogin()) {
                callback.onError(ErrorCode.builder(ErrorCode.NO_LOGIN_ERROR));
                return;
            }
            TokenInfo tokenInfo = tokenCache.getTokenInfo();
            long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - (tokenInfo.getLastUpdateTtl() / 1000);
            long ttl = tokenInfo.getTtl() / 4;
            if (z || jCurrentTimeMillis > ttl) {
                HMLog.debug(new Function0() { // from class: u1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$getInnerToken$3();
                    }
                });
                ErrorCode errorCodeSyncLoginToken = syncLoginToken(tokenInfo, tokenCache);
                if (!TextUtils.equals(errorCodeSyncLoginToken.getResult(), Configs.Params.OK)) {
                    HMLog.error(new Function0() { // from class: e2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountApi.lambda$getInnerToken$4();
                        }
                    });
                    callback.onError(errorCodeSyncLoginToken);
                    return;
                }
            }
            long jCurrentTimeMillis2 = (System.currentTimeMillis() / 1000) - (tokenInfo.getLastUpdateAppTtl() / 1000);
            long appTtl = tokenInfo.getAppTtl() / 2;
            if (!z && jCurrentTimeMillis2 <= appTtl) {
                getLocalToken(callback);
                HMLog.debug(new Function0() { // from class: a2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$getInnerToken$8();
                    }
                });
                return;
            }
            final LoginToken appToken = WebAPI.getAppToken(this.mContext, tokenInfo.getLoginToken());
            if (appToken == null || !TextUtils.isEmpty(appToken.getErrorCode()) || appToken.getTokenInfo() == null) {
                HMLog.error(new Function0() { // from class: n2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$getInnerToken$7(appToken);
                    }
                });
                callback.onError(entity2Error(appToken));
            } else {
                TokenInfo tokenInfo2 = appToken.getTokenInfo();
                tokenInfo.setAppToken(tokenInfo2.getAppToken());
                tokenInfo.setAppTtl(tokenInfo2.getAppTtl());
                tokenInfo.setUserId(tokenInfo2.getUserId());
                tokenInfo.setLastUpdateAppTtl(System.currentTimeMillis());
                List<NextActions> nextActions = appToken.getNextActions();
                if (nextActions != null && nextActions.size() > 0) {
                    tokenCache.setNextActions(null);
                }
                tokenCache.setDomains(appToken.getDomains());
                Keeper.saveToken(this.mContext, tokenCache);
                HMLog.debug(new Function0() { // from class: l2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$getInnerToken$5(tokenCache);
                    }
                });
                Token token = new Token();
                token.setProvider(tokenCache.getProvider());
                token.setAccessToken(tokenInfo.getAppToken());
                token.setUid(tokenInfo.getUserId());
                token.setNextActions(nextActions);
                HMLog.debug(new Function0() { // from class: m1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$getInnerToken$6();
                    }
                });
                callback.onSuccess(token);
                TokenEventHelper.postAppTokenRefresh(this.mContext, token);
            }
            return;
        }
        callback.onError(ErrorCode.builder(ErrorCode.NO_LOGIN_ERROR));
    }

    public Token getLocalToken() {
        TokenInfo tokenInfo;
        LoginToken tokenCache = Keeper.getTokenCache(this.mContext);
        if (tokenCache == null || (tokenInfo = tokenCache.getTokenInfo()) == null) {
            return null;
        }
        Token token = new Token();
        token.setProvider(tokenCache.getProvider());
        token.setAccessToken(tokenInfo.getAppToken());
        token.setUid(tokenInfo.getUserId());
        return token;
    }

    @Override // com.huami.passport.IAccount
    public Token getToken(boolean z) {
        Token token = new Token();
        getInnerToken(z, new AnonymousClass2(token, z));
        return token;
    }

    @Override // com.huami.passport.IAccount
    public UserInfo getUserInfo() {
        UserInfo userInfo;
        LoginToken tokenCache = Keeper.getTokenCache(this.mContext);
        if (tokenCache == null || (userInfo = tokenCache.getUserInfo()) == null) {
            return null;
        }
        userInfo.setRegistInfo(tokenCache.getRegistInfo());
        return userInfo;
    }

    @Override // com.huami.passport.IAccount
    public boolean isLogin() {
        HMLog.debug(new Function0() { // from class: r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$isLogin$1();
            }
        });
        LoginToken tokenCache = Keeper.getTokenCache(this.mContext);
        if (tokenCache == null) {
            return false;
        }
        return tokenCache.isLogin();
    }

    @Override // com.huami.passport.IAccount
    public void listAccount(IAccount.Callback<List<BindAccount>, ErrorCode> callback) {
        listAccount(true, callback);
    }

    @Override // com.huami.passport.IAccount
    @Deprecated
    public void login(Activity activity, final String str, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$login$12(str);
            }
        });
        if (callback == null) {
            return;
        }
        this.mProvider = str;
        if (TextUtils.equals(str, "wechat") || TextUtils.equals(str, "xiaomi") || TextUtils.equals(str, "facebook") || TextUtils.equals(str, "google")) {
            this.mExecutor.execute(new AnonymousClass4(callback, str, activity));
        } else {
            onErrorCallback(callback, ErrorCode.NOT_SUPPORT_TPN_ERROR);
        }
    }

    public void loginIdAuthServer(Context context, String str, String str2, String str3, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$loginIdAuthServer$16();
            }
        });
        if (callback == null) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            HMLog.debug(new Function0() { // from class: b2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$loginIdAuthServer$17();
                }
            });
            callback.onError(ErrorCode.builder(ErrorCode.PARAMS_IS_NULL_ERROR));
            return;
        }
        String thirdName = Utils.getThirdName(context, str);
        if (TextUtils.equals(str, "huami") || TextUtils.equals(str, "huami_phone")) {
            loginIdAuth(context, str, null, thirdName, str2, str3, callback);
        } else {
            callback.onError(ErrorCode.builder(ErrorCode.NOT_SUPPORT_TPN_ERROR));
        }
    }

    @Override // com.huami.passport.IAccount
    public void logout(IAccount.Callback<String, ErrorCode> callback, boolean z) {
        logout(null, callback, z);
    }

    public boolean offlineLogout() {
        return offlineLogout(null);
    }

    public void onActivityResult(final int i, final int i2, Intent intent) {
        GoogleHelper googleHelper;
        CallbackManager callbackManager;
        HMLog.debug(new Function0() { // from class: c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$onActivityResult$28(i, i2);
            }
        });
        if (TextUtils.equals(this.mProvider, "facebook") && (callbackManager = mFacebookCallbackManager) != null) {
            callbackManager.onActivityResult(i, i2, intent);
        }
        if (!TextUtils.equals(this.mProvider, "google") || (googleHelper = this.mGoogleHelper) == null) {
            return;
        }
        googleHelper.onActivityResult(i, i2, intent);
    }

    @Override // com.huami.passport.IAccount
    public void relogin(IAccount.Callback<LoginToken, ErrorCode> callback) {
        if (callback == null) {
            throw new IllegalArgumentException("callback should not be null");
        }
        LoginToken tokenCache = Keeper.getTokenCache(this.mContext);
        if (tokenCache == null) {
            onErrorCallback(callback, ErrorCode.NO_LOGIN_ERROR);
            return;
        }
        TokenInfo tokenInfo = tokenCache.getTokenInfo();
        if (tokenInfo == null) {
            onErrorCallback(callback, ErrorCode.NO_LOGIN_ERROR);
            return;
        }
        String provider = tokenCache.getProvider();
        if (TextUtils.isEmpty(provider)) {
            onErrorCallback(callback, ErrorCode.THRID_NO_PROVIDER_ERROR);
        } else {
            WebAPI.relogin(this.mContext, provider, tokenInfo.getLoginToken(), new AnonymousClass1(callback, tokenInfo, tokenCache));
        }
    }

    public void requestBindApi(Token token, String str, String str2, String str3, final IAccount.Callback<BindResult, ErrorCode> callback) {
        WebAPI.bindAccount(this.mContext, this.mTpac.getThirdName(), str, str3, token.getAccessToken(), str2, new WebAPI.HttpCallback<BindResult>() { // from class: com.huami.passport.AccountApi.22
            @Override // com.huami.passport.net.WebAPI.HttpCallback
            public void onFailure(VolleyError volleyError) {
                AccountApi.this.onBindAccountErrorCallback(callback, volleyError);
            }

            @Override // com.huami.passport.net.WebAPI.HttpCallback
            public void onSuccess(BindResult bindResult) {
                AccountApi.onSuccessCallback(callback, bindResult);
            }
        });
    }

    public boolean signOutForGoogle(FragmentActivity fragmentActivity, String str, final IAccount.Callback<String, ErrorCode> callback) {
        if (!TextUtils.equals(str, "google")) {
            return false;
        }
        if (this.mGoogleHelper == null) {
            this.mGoogleHelper = new GoogleHelper();
        }
        if (!this.mGoogleHelper.isGmsInstalled(fragmentActivity.getApplicationContext())) {
            return false;
        }
        this.mGoogleHelper.signOut(fragmentActivity, new IAccount.Callback<String, String>() { // from class: com.huami.passport.AccountApi.6
            @Override // com.huami.passport.IAccount.Callback
            public void onError(String str2) {
                AccountApi.onErrorCallback(callback, str2);
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(String str2) {
                callback.onSuccess(Configs.Params.OK);
            }
        });
        return true;
    }

    public ErrorCode syncLoginToken(TokenInfo tokenInfo, final LoginToken loginToken) {
        ErrorCode errorCode = new ErrorCode();
        if (tokenInfo == null || loginToken == null) {
            errorCode.setErrorCode(ErrorCode.PARAMS_IS_NULL_ERROR);
            return errorCode;
        }
        LoginToken loginTokenRenewLoginToken = WebAPI.renewLoginToken(this.mContext, tokenInfo.getLoginToken());
        if (loginTokenRenewLoginToken != null && TextUtils.isEmpty(loginTokenRenewLoginToken.getErrorCode()) && loginTokenRenewLoginToken.getTokenInfo() != null) {
            try {
                TokenInfo tokenInfo2 = loginTokenRenewLoginToken.getTokenInfo();
                tokenInfo.setLoginToken(tokenInfo2.getLoginToken());
                tokenInfo.setTtl(tokenInfo2.getTtl());
                tokenInfo.setLastUpdateTtl(System.currentTimeMillis());
                loginToken.setDomains(loginTokenRenewLoginToken.getDomains());
                Keeper.saveToken(this.mContext, loginToken);
                HMLog.debug(new Function0() { // from class: j2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$syncLoginToken$9(loginToken);
                    }
                });
                errorCode.setResult(Configs.Params.OK);
                TokenEventHelper.postLoginTokenRefresh(this.mContext, loginTokenRenewLoginToken);
                return errorCode;
            } catch (Exception e) {
                HMLog.debug(new Function0() { // from class: t1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$syncLoginToken$10();
                    }
                });
                errorCode.setErrorCode(WebAPI.getError(e));
            }
        }
        if (loginTokenRenewLoginToken != null) {
            return entity2Error(loginTokenRenewLoginToken);
        }
        if (TextUtils.isEmpty(errorCode.getErrorCode())) {
            HMLog.debug(new Function0() { // from class: z1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$syncLoginToken$11();
                }
            });
            errorCode.setErrorCode(ErrorCode.UNKOWN_ERROR);
        }
        return errorCode;
    }

    @Override // com.huami.passport.IAccount
    public void unbindAccount(final String str, final String str2, final IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            HMLog.debug(new Function0() { // from class: i2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$unbindAccount$29();
                }
            });
            return;
        }
        HMLog.debug(new Function0() { // from class: f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$unbindAccount$30(str);
            }
        });
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            onErrorCallback(callback, ErrorCode.PARAMS_ERROR);
            return;
        }
        try {
            Map<String, TpaConfig> tpaConfigs = Utils.getTpaConfigs(this.mContext);
            if (tpaConfigs == null) {
                HMLog.debug(new Function0() { // from class: s1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR;
                    }
                });
                onErrorCallback(callback, ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR);
                return;
            }
            TpaConfig tpaConfig = tpaConfigs.get(str);
            this.mTpac = tpaConfig;
            if (tpaConfig == null || !Utils.verifyParamByTpac(str, tpaConfig)) {
                onErrorCallback(callback, ErrorCode.TPA_CONFIG_ERROR);
            } else {
                final String thirdName = this.mTpac.getThirdName();
                getToken(false, new IAccount.Callback<Token, ErrorCode>() { // from class: com.huami.passport.AccountApi.14
                    @Override // com.huami.passport.IAccount.Callback
                    public void onError(ErrorCode errorCode) {
                        AccountApi.onErrorCallback(callback, errorCode);
                    }

                    @Override // com.huami.passport.IAccount.Callback
                    public void onSuccess(Token token) {
                        WebAPI.unbindAccount(AccountApi.this.mContext, thirdName, str2, token.getAccessToken(), new WebAPI.HttpCallback<BindAccount>() { // from class: com.huami.passport.AccountApi.14.1
                            @Override // com.huami.passport.net.WebAPI.HttpCallback
                            public void onFailure(VolleyError volleyError) {
                                AccountApi.onErrorCallback(callback, WebAPI.getError(volleyError));
                            }

                            @Override // com.huami.passport.net.WebAPI.HttpCallback
                            public void onSuccess(BindAccount bindAccount) {
                                AccountApi.onSuccessCallback(callback, Configs.Params.OK);
                            }
                        });
                    }
                });
            }
        } catch (IOException unused) {
            onErrorCallback(callback, ErrorCode.NO_TPA_FOUND_ERROR);
        }
    }

    @Override // com.huami.passport.IAccount
    public void verifyAccessToken(final String str, final IAccount.Callback<TokenInfo, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        if (str == null) {
            callback.onError(ErrorCode.builder(ErrorCode.APPTOKEN_IS_NULL_ERROR));
        } else {
            HMLog.debug(new Function0() { // from class: j1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$verifyAccessToken$14(str);
                }
            });
            WebAPI.verifyAppToken(this.mContext, str, new WebAPI.HttpCallback<TokenInfo>() { // from class: com.huami.passport.AccountApi.8
                @Override // com.huami.passport.net.WebAPI.HttpCallback
                public void onFailure(VolleyError volleyError) {
                    callback.onError(ErrorCode.builder(WebAPI.getError(volleyError)));
                }

                @Override // com.huami.passport.net.WebAPI.HttpCallback
                public void onSuccess(TokenInfo tokenInfo) {
                    if (TextUtils.isEmpty(tokenInfo.getErrorCode())) {
                        callback.onSuccess(tokenInfo);
                    } else {
                        callback.onError(AccountApi.entity2Error(tokenInfo));
                    }
                }
            });
        }
    }

    public <V> void waitAndShowFutureResultForMi(Activity activity, TpaConfig tpaConfig, XiaomiOAuthFuture<V> xiaomiOAuthFuture, IAccount.Callback<LoginToken, ErrorCode> callback) {
        new AnonymousClass11(xiaomiOAuthFuture, activity, tpaConfig, callback).execute(new Void[0]);
    }

    @Override // com.huami.passport.IAccount
    public void bindAccount(final Activity activity, final String str, final String str2, final String str3, final IAccount.Callback<BindResult, ErrorCode> callback) {
        if (callback == null || TextUtils.isEmpty(str)) {
            HMLog.error(new Function0() { // from class: d2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$bindAccount$34();
                }
            });
            return;
        }
        HMLog.debug(new Function0() { // from class: q2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountApi.lambda$bindAccount$35(str);
            }
        });
        this.mProvider = str;
        try {
            Map<String, TpaConfig> tpaConfigs = Utils.getTpaConfigs(this.mContext);
            if (tpaConfigs == null) {
                HMLog.debug(new Function0() { // from class: k2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR;
                    }
                });
                onErrorCallback(callback, ErrorCode.TPA_CONFIG_JSON_FORMAT_ERROR);
                return;
            }
            TpaConfig tpaConfig = tpaConfigs.get(str);
            this.mTpac = tpaConfig;
            if (tpaConfig == null || !Utils.verifyParamByTpac(str, tpaConfig)) {
                onErrorCallback(callback, ErrorCode.TPA_CONFIG_ERROR);
            } else if (activity != null) {
                getToken(false, new IAccount.Callback<Token, ErrorCode>() { // from class: com.huami.passport.AccountApi.16
                    @Override // com.huami.passport.IAccount.Callback
                    public void onError(ErrorCode errorCode) {
                        AccountApi.onErrorCallback(callback, errorCode);
                    }

                    @Override // com.huami.passport.IAccount.Callback
                    public void onSuccess(Token token) {
                        String str4 = str;
                        str4.hashCode();
                        switch (str4) {
                            case "google":
                                AccountApi.this.bindGoogleAccount(activity, token, str3, callback);
                                break;
                            case "wechat":
                                AccountApi.this.bindWechatAccount(token, str2, str3, callback, activity);
                                break;
                            case "xiaomi":
                                AccountApi.this.bindMiAccount(token, str3, callback, activity);
                                break;
                            case "huami_phone":
                                AccountApi.this.bindPhoneAccount(token, str2, str3, callback);
                                break;
                            case "line":
                                AccountApi.this.bindLineAccount(activity, token, str3, callback);
                                break;
                            case "facebook":
                                AccountApi.this.bindFacebookAccount(activity, token, str3, callback);
                                break;
                            default:
                                AccountApi.onErrorCallback(callback, ErrorCode.NOT_SUPPORT_ERROR);
                                break;
                        }
                    }
                });
            } else {
                HMLog.error(new Function0() { // from class: x1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$bindAccount$37();
                    }
                });
                onErrorCallback(callback, ErrorCode.PARAMS_IS_NULL_ERROR);
            }
        } catch (IOException unused) {
            onErrorCallback(callback, ErrorCode.NO_TPA_FOUND_ERROR);
        }
    }

    @Override // com.huami.passport.IAccount
    public void listAccount(boolean z, IAccount.Callback<List<BindAccount>, ErrorCode> callback) {
        if (callback == null) {
            HMLog.debug(new Function0() { // from class: o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$listAccount$32();
                }
            });
        } else {
            HMLog.debug(new Function0() { // from class: v1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountApi.lambda$listAccount$33();
                }
            });
            getToken(false, new AnonymousClass15(z, callback));
        }
    }

    public void logout(FragmentActivity fragmentActivity, IAccount.Callback<String, ErrorCode> callback) {
        logout(fragmentActivity, callback, true);
    }

    public boolean offlineLogout(FragmentActivity fragmentActivity) {
        Token localToken = getLocalToken();
        if (localToken != null) {
            if (TextUtils.equals(localToken.getProvider(), "google")) {
                if (fragmentActivity == null) {
                    throw new IllegalArgumentException("Please use the offlineLogout(FragmentActivity activity) method");
                }
                if (this.mGoogleHelper == null) {
                    this.mGoogleHelper = new GoogleHelper();
                }
                this.mGoogleHelper.signOut(fragmentActivity, new AnonymousClass5());
            }
            if (TextUtils.equals(localToken.getProvider(), "facebook")) {
                LoginManager.getInstance().logOut();
            }
        }
        return clearAll();
    }

    public static <S> void onErrorCallback(IAccount.Callback<S, ErrorCode> callback, String str, String str2) {
        ErrorCode errorCodeBuilder = ErrorCode.builder(str);
        errorCodeBuilder.setThirdId(str2);
        onErrorCallback(callback, errorCodeBuilder);
    }

    @Override // com.huami.passport.IAccount
    public void getToken(final boolean z, final IAccount.Callback<Token, ErrorCode> callback) {
        this.mExecutor.execute(new Runnable() { // from class: com.huami.passport.AccountApi.3
            @Override // java.lang.Runnable
            public void run() {
                AccountApi.this.getInnerToken(z, callback);
            }
        });
    }

    public void logout(final FragmentActivity fragmentActivity, final IAccount.Callback<String, ErrorCode> callback, boolean z) {
        final TokenInfo tokenInfo;
        if (callback != null) {
            LoginToken tokenCache = Keeper.getTokenCache(this.mContext);
            if (tokenCache != null && (tokenInfo = tokenCache.getTokenInfo()) != null) {
                HMLog.debug(new Function0() { // from class: o2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountApi.lambda$logout$13(tokenInfo);
                    }
                });
                final String provider = tokenCache.getProvider();
                if (fragmentActivity == null && TextUtils.equals(provider, "google")) {
                    throw new IllegalArgumentException("Please use the logout(FragmentActivity,IAccount.Callback<String,ErrorCode>, boolean) method");
                }
                if (!z) {
                    if (TextUtils.equals(provider, "facebook")) {
                        signOutForFacebook();
                    }
                    clearAll();
                    if (signOutForGoogle(fragmentActivity, provider, callback)) {
                        return;
                    }
                    callback.onSuccess(Configs.Params.OK);
                    return;
                }
                WebAPI.logout(this.mContext, tokenInfo.getLoginToken(), new WebAPI.HttpCallback<Entity>() { // from class: com.huami.passport.AccountApi.7
                    @Override // com.huami.passport.net.WebAPI.HttpCallback
                    public void onFailure(VolleyError volleyError) {
                        AccountApi.onErrorCallback(callback, WebAPI.getError(volleyError));
                    }

                    @Override // com.huami.passport.net.WebAPI.HttpCallback
                    public void onSuccess(Entity entity) {
                        if (entity != null) {
                            if (!TextUtils.isEmpty(entity.getErrorCode())) {
                                AccountApi.onErrorCallback(callback, AccountApi.entity2Error(entity));
                                return;
                            }
                            if (TextUtils.equals(entity.getResult(), Configs.Params.OK)) {
                                if (TextUtils.equals(provider, "facebook")) {
                                    AccountApi.this.signOutForFacebook();
                                }
                                AccountApi.this.clearAll();
                                if (AccountApi.this.signOutForGoogle(fragmentActivity, provider, callback)) {
                                    return;
                                }
                                AccountApi.onSuccessCallback(callback, Configs.Params.OK);
                            }
                        }
                    }
                });
                return;
            }
            onErrorCallback(callback, ErrorCode.NO_LOGIN_ERROR);
            return;
        }
        throw new IllegalArgumentException("callback should not be null");
    }

    public Token getToken() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return getToken(false);
        }
        throw new RuntimeException("Please don't call in the UI thread");
    }

    public static <S> void onErrorCallback(IAccount.Callback<S, ErrorCode> callback, ErrorCode errorCode) {
        new Handler(Looper.getMainLooper()).post(new AnonymousClass9(callback, errorCode));
    }

    private void getLocalToken(IAccount.Callback<Token, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        Token localToken = getLocalToken();
        if (localToken != null && !TextUtils.isEmpty(localToken.getAccessToken())) {
            callback.onSuccess(localToken);
        } else {
            callback.onError(new ErrorCode(ErrorCode.NO_LOGIN_ERROR));
        }
    }

    @Override // com.huami.passport.IAccount
    public void logout(IAccount.Callback<String, ErrorCode> callback) {
        logout(callback, true);
    }
}
