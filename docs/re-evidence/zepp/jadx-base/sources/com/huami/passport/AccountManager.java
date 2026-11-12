package com.huami.passport;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.android.volley.VolleyLog;
import com.huami.passport.AccountManager;
import com.huami.passport.data.cache.HttpDnsCache;
import com.huami.passport.entity.BindAccount;
import com.huami.passport.entity.BindResult;
import com.huami.passport.entity.HttpDNS;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.Message;
import com.huami.passport.entity.OAuthUser;
import com.huami.passport.entity.Profile;
import com.huami.passport.entity.SmsCode;
import com.huami.passport.entity.Token;
import com.huami.passport.entity.TokenInfo;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.entity.UserInfo;
import com.huami.passport.entity.UserRegion;
import com.huami.passport.user.AccountService;
import com.huami.passport.user.IMailService;
import com.huami.passport.user.IPhoneService;
import com.huami.passport.utils.Utils;
import com.huami.passport.v2.impl.AccountApiV2;
import com.huami.tools.log.HMLog;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AccountManager {
    private static volatile AccountManager mDefaultInstance;
    private AccountApiV2 mAccount;
    private AccountService mAccountService;
    private Context mContext;

    private AccountManager(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        Keeper.compatCheck(applicationContext);
        AccountApiV2 accountApiV2 = new AccountApiV2(this.mContext);
        this.mAccount = accountApiV2;
        this.mAccountService = new AccountService(this.mContext, accountApiV2);
    }

    public static AccountManager getDefault(Context context) {
        if (mDefaultInstance == null) {
            synchronized (AccountManager.class) {
                if (mDefaultInstance == null) {
                    mDefaultInstance = new AccountManager(context.getApplicationContext());
                }
            }
        }
        return mDefaultInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$asyncRefreshToken$15() {
        return "###syncRefreshToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$bindAccount$38() {
        return "[bindAccount] activity ref is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$checkLogin$4() {
        return "###checkLogin";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getAccessToken$10() {
        return "###getAccessToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getCountryCode$7() {
        return "###getCountryCode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getCountryState$8() {
        return "###getCountryCode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getCurrentRegion$6() {
        return "###getCurrentRegion";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getCurrentUid$2() {
        return "###getCurrentUid";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getProvider$3() {
        return "###getProvider";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getToken$11() {
        return "###getToken and return token object";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getToken$12() {
        return "###getToken and callback";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getUserInfo$9() {
        return "###getUserInfo";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$isLogin$5() {
        return "###isLogin";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$login$17() {
        return "###login";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$login$18() {
        return "[login] activity ref is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$login$36() {
        return "###login";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$login$37() {
        return "###login";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginWithoutRef$19() {
        return "###login";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginWithoutRef$20() {
        return "###login";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loginWithoutRef$21() {
        return "###loginWithoutRef";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$logout$30(boolean z) {
        return "###logout " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$logout$31(boolean z) {
        return "###logout " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$logout$32() {
        return "###logout";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$logout$33() {
        return "###logout";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$offlineLogout$28() {
        return "###offlineLogout";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$offlineLogout$29() {
        return "###offlineLogout";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$onActivityResult$35() {
        return "###onActivityResult";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$refreshToken$16() {
        return "###refreshToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registration$22() {
        return "###registration";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registration$23() {
        return "[registration] activity ref is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registrationBase$24() {
        return "###registration";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registrationBase$25() {
        return "[registration] activity ref is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registrationWithoutRef$26() {
        return "###registrationWithoutRef";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$relogin$27() {
        return "###relogin";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setLogFileEnable$1(boolean z) {
        return "###setLogFileEnable " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setTestMode$0(boolean z) {
        return "setTestMode " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$syncRefreshToken$13() {
        return "###syncRefreshToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$syncRefreshToken$14() {
        return "###syncRefreshToken --> callback";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$verifyAccessToken$34() {
        return "###verifyAccessToken";
    }

    public void asyncRefreshToken(IAccount.Callback<Token, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: k3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$asyncRefreshToken$15();
            }
        });
        refreshToken(callback);
    }

    public void bindAccount(Activity activity, String str, IAccount.Callback<BindResult, ErrorCode> callback) {
        bindAccount(activity, str, null, null, callback);
    }

    public void changePassword(String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.changePassword(str, null, str2, str3, null, null, callback);
    }

    public void changeUserName(String str, String str2, String str3, String str4, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.changeUserName(str, str2, str3, null, null, str4, callback);
    }

    public void checkLogin(IAccount.Callback<String, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: q3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$checkLogin$4();
            }
        });
        this.mAccount.checkLogin(callback);
    }

    public void checkSmsBinding(String str, String str2, IAccount.Callback<Message, ErrorCode> callback) {
        this.mAccountService.checkSmsBinding(str, str2, callback);
    }

    public void checkUserNameStatus(String str, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.checkUserNameStatus(str, callback);
    }

    public void checkUserTransferCountry(Context context, String str, IAccount.Callback<UserRegion, ErrorCode> callback) {
        this.mAccount.checkUserTransferCountry(context, str, callback);
    }

    public String debugInfo() {
        String str;
        String thirdId;
        String loginToken;
        LoginToken tokenCache = Keeper.getTokenCache(this.mContext);
        String userId = null;
        if (tokenCache != null) {
            UserInfo userInfo = tokenCache.getUserInfo();
            thirdId = userInfo != null ? userInfo.getThirdId() : "";
            TokenInfo tokenInfo = tokenCache.getTokenInfo();
            if (tokenInfo != null) {
                String appToken = tokenInfo.getAppToken();
                loginToken = tokenInfo.getLoginToken();
                userId = tokenInfo.getUserId();
                str = appToken;
            } else {
                str = null;
                loginToken = null;
            }
        } else {
            str = null;
            thirdId = null;
            loginToken = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n[EnvMode] ");
        sb.append(Configs.isDebugMode ? "测试环境" : "生产环境");
        sb.append("\n[AccountLogin] ");
        sb.append(HttpDnsCache.getAccountUrlIndex(true));
        sb.append("\n[AccountReg] ");
        sb.append(HttpDnsCache.getAccountUrlIndex(false));
        sb.append("\n[AccountHost] ");
        sb.append(HttpDnsCache.getAccountUrl(this.mContext, ""));
        sb.append("\n[IdHost] ");
        sb.append(HttpDnsCache.getIdUrl(this.mContext));
        sb.append("\n[UID] ");
        sb.append(userId);
        sb.append("\n[UserInfo] ");
        sb.append(getUserInfo());
        sb.append("\n[Provider] ");
        sb.append(getProvider());
        sb.append("\n[AppToken] ");
        sb.append(str);
        sb.append("\n[Locale Country] ");
        sb.append(Locale.getDefault().getCountry());
        sb.append("\n[Region] ");
        sb.append(getCurrentRegion());
        sb.append("\n[CountryCode] ");
        sb.append(getCountryCode());
        sb.append("\n[CountryState] ");
        sb.append(getCountryState());
        sb.append("\n[LoginToken] ");
        sb.append(loginToken);
        sb.append("\n[ThirdId] ");
        sb.append(thirdId);
        sb.append("\n[Version] ");
        sb.append(Configs.SDK_VERSION);
        return sb.toString();
    }

    public Profile fetchProfile() {
        return this.mAccount.getProfile();
    }

    public String getAccessToken() {
        HMLog.debug(new Function0() { // from class: o4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$getAccessToken$10();
            }
        });
        return this.mAccount.getAccessToken();
    }

    public void getCaptcha(String str, IAccount.Callback<byte[], ErrorCode> callback) {
        this.mAccountService.getCaptcha(str, callback);
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getCountryCode() {
        HMLog.debug(new Function0() { // from class: u4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$getCountryCode$7();
            }
        });
        return this.mAccount.getCountryCode();
    }

    public String getCountryState() {
        HMLog.debug(new Function0() { // from class: t3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$getCountryState$8();
            }
        });
        return this.mAccount.getCountryState();
    }

    public LoginInfo getCurrentLoginInfo(String str) {
        return this.mAccountService.getCurrentLoginInfo(str);
    }

    public String getCurrentRegion() {
        HMLog.debug(new Function0() { // from class: w3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$getCurrentRegion$6();
            }
        });
        return this.mAccount.getCurrentRegion();
    }

    public String getCurrentUid() {
        HMLog.debug(new Function0() { // from class: n3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$getCurrentUid$2();
            }
        });
        return this.mAccount.getCurrentUid();
    }

    public synchronized List<HttpDNS> getHttpDNS(Context context) {
        LoginToken tokenCache = Keeper.getTokenCache(context);
        if (tokenCache != null) {
            return tokenCache.getDomains();
        }
        return Collections.emptyList();
    }

    public LoginInfo getLoginInfo(Context context) {
        return this.mAccountService.getLoginInfo(context);
    }

    public IMailService getMailService() {
        return this.mAccountService.getMailService();
    }

    public void getOAuthUser(String str, String str2, String str3, String str4, IAccount.Callback<OAuthUser, ErrorCode> callback) {
        this.mAccountService.getOAuthUser(str, str2, str3, str4, callback);
    }

    public IPhoneService getPhoneService() {
        return this.mAccountService.getPhoneService();
    }

    public Profile getProfile(String str, String str2) {
        return this.mAccount.getProfile(str, str2);
    }

    public String getProvider() {
        HMLog.debug(new Function0() { // from class: m4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$getProvider$3();
            }
        });
        Token localToken = this.mAccount.getLocalToken();
        if (localToken == null) {
            return IAccount.PROVIDER_UNKOWN;
        }
        String provider = localToken.getProvider();
        if (TextUtils.isEmpty(provider)) {
            return IAccount.PROVIDER_UNKOWN;
        }
        return TextUtils.equals("mi", provider) ? "xiaomi" : provider;
    }

    public Token getToken() {
        HMLog.debug(new Function0() { // from class: e4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$getToken$11();
            }
        });
        return this.mAccount.getToken();
    }

    public UserInfo getUserInfo() {
        HMLog.debug(new Function0() { // from class: r4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$getUserInfo$9();
            }
        });
        return this.mAccount.getUserInfo();
    }

    public boolean isLogin() {
        HMLog.debug(new Function0() { // from class: t4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$isLogin$5();
            }
        });
        return this.mAccount.isLogin();
    }

    public void listAccount(IAccount.Callback<List<BindAccount>, ErrorCode> callback) {
        this.mAccount.listAccount(true, callback);
    }

    public void login(Activity activity, String str, String str2, IAccount.Callback<LoginToken, ErrorCode> callback) {
        login(activity, str, str2, true, callback);
    }

    public void loginIdV2(Context context, String str, String str2, String str3, IAccount.Callback<LoginToken, ErrorCode> callback) {
        loginIdV2(context, str, str2, str3, true, true, callback);
    }

    public void loginWithoutRef(Activity activity, String str, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$loginWithoutRef$19();
            }
        });
        this.mAccount.login(activity, str, Locale.getDefault().getCountry(), true, callback);
    }

    public void logout(IAccount.Callback<String, ErrorCode> callback, final boolean z) {
        HMLog.debug(new Function0() { // from class: u3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$logout$30(z);
            }
        });
        this.mAccount.logout(callback, z);
    }

    public void offlineLogout() {
        HMLog.debug(new Function0() { // from class: g4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$offlineLogout$28();
            }
        });
        this.mAccount.offlineLogout();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        HMLog.debug(new Function0() { // from class: b4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$onActivityResult$35();
            }
        });
        this.mAccount.onActivityResult(i, i2, intent);
    }

    public void refreshToken(IAccount.Callback<Token, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: o3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$refreshToken$16();
            }
        });
        this.mAccount.getToken(true, callback);
    }

    public void registerIdV2(Context context, String str, String str2, String str3, IAccount.Callback<LoginToken, ErrorCode> callback) {
        loginIdV2(context, str, str2, str3, true, false, callback);
    }

    public void registration(Activity activity, String str, String str2, String str3, IAccount.Callback<LoginToken, ErrorCode> callback) {
        registration(activity, str, str2, str3, null, callback);
    }

    public void registrationBase(Activity activity, String str, String str2, String str3, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: d4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$registrationBase$24();
            }
        });
        Activity activity2 = (Activity) new WeakReference(activity).get();
        if (activity2 == null) {
            if (callback != null) {
                callback.onError(ErrorCode.builder(ErrorCode.INNER_HANDLE_ERROR));
            }
            HMLog.debug(new Function0() { // from class: i4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountManager.lambda$registrationBase$25();
                }
            });
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = Locale.getDefault().getCountry();
            }
            this.mAccount.regLogin(activity2, str, str2, str3, true, false, callback);
        }
    }

    public void registrationWithoutRef(Activity activity, String str, IAccount.Callback<LoginToken, ErrorCode> callback) {
        registrationWithoutRef(activity, str, Locale.getDefault().getCountry(), callback);
    }

    public void registrations(String str, String str2, String str3, String str4, String str5, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        registrations(str, str2, str3, str4, str5, null, callback);
    }

    public void relogin(IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: v4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$relogin$27();
            }
        });
        this.mAccount.relogin(callback);
    }

    public void requestBind(TpaConfig tpaConfig, final String str, final String str2, final String str3, final IAccount.Callback<BindResult, ErrorCode> callback) {
        AccountApiV2 accountApiV2 = this.mAccount;
        accountApiV2.mTpac = tpaConfig;
        accountApiV2.getToken(false, new IAccount.Callback<Token, ErrorCode>() { // from class: com.huami.passport.AccountManager.1
            @Override // com.huami.passport.IAccount.Callback
            public void onError(ErrorCode errorCode) {
                callback.onError(errorCode);
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(Token token) {
                AccountManager.this.mAccount.requestBindApi(token, str, str2, str3, callback);
            }
        });
    }

    public void resendConfirmation(String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.resendConfirmation(str, str2, str3, callback);
    }

    public void resetPassword(String str, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.resetPassword(str, null, null, callback);
    }

    public void setLogFileEnable(final boolean z) {
        HMLog.debug(new Function0() { // from class: j3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$setLogFileEnable$1(z);
            }
        });
        VolleyLog.DEBUG = z;
    }

    public boolean setLoginInfo(Context context, LoginInfo loginInfo) {
        return com.huami.passport.user.Keeper.setLoginInfo(context, loginInfo);
    }

    public void setTestMode(final boolean z) {
        Configs.isDebugMode = z;
        HMLog.debug(new Function0() { // from class: f4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$setTestMode$0(z);
            }
        });
    }

    public Token syncRefreshToken() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new RuntimeException("Please don't call in the UI thread");
        }
        HMLog.debug(new Function0() { // from class: v3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$syncRefreshToken$13();
            }
        });
        return this.mAccount.getToken(true);
    }

    public void tokenLogin(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull IAccount.Callback<LoginToken, ErrorCode> callback) {
        this.mAccount.tokenLogin(this.mContext, str, str2, str3, callback);
    }

    public void unbindAccount(String str, String str2, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccount.unbindAccount(str, str2, callback);
    }

    public void verfyCode(String str, String str2, String str3, IAccount.Callback<SmsCode, ErrorCode> callback) {
        this.mAccountService.verfyCode(str, str2, str3, callback);
    }

    public void verifyAccessToken(String str, IAccount.Callback<TokenInfo, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: s4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$verifyAccessToken$34();
            }
        });
        this.mAccount.verifyAccessToken(str, callback);
    }

    public void bindAccount(Activity activity, String str, String str2, IAccount.Callback<BindResult, ErrorCode> callback) {
        bindAccount(activity, str, null, str2, callback);
    }

    public void changePassword(String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback, String str4) {
        this.mAccountService.changePassword(str, null, str2, str3, null, str4, callback);
    }

    public void changeUserName(String str, String str2, String str3, String str4, String str5, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.changeUserName(str, str2, str3, null, null, str5, null, null, str4, callback);
    }

    public void checkUserNameStatus(String str, String str2, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.checkUserNameStatus(str, str2, callback);
    }

    public void checkUserTransferCountry(Context context, String str, String str2, String str3, IAccount.Callback<UserRegion, ErrorCode> callback) {
        this.mAccount.checkUserTransferCountry(context, str, str2, str3, callback);
    }

    @Deprecated
    public Profile getProfile() {
        return fetchProfile();
    }

    public void listAccount(boolean z, IAccount.Callback<List<BindAccount>, ErrorCode> callback) {
        this.mAccount.listAccount(z, callback);
    }

    public void login(Activity activity, String str, String str2, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: p3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$login$17();
            }
        });
        Activity activity2 = (Activity) new WeakReference(activity).get();
        if (activity2 == null) {
            if (callback != null) {
                callback.onError(ErrorCode.builder(ErrorCode.INNER_HANDLE_ERROR));
            }
            HMLog.debug(new Function0() { // from class: j4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountManager.lambda$login$18();
                }
            });
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = Locale.getDefault().getCountry();
            }
            this.mAccount.login(activity2, str, str2, z, callback);
        }
    }

    public void loginIdV2(Context context, String str, String str2, String str3, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        loginIdV2(context, str, str2, str3, z, true, callback);
    }

    public void registration(Activity activity, String str, String str2, String str3, String str4, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: l4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$registration$22();
            }
        });
        Activity activity2 = (Activity) new WeakReference(activity).get();
        if (activity2 == null) {
            if (callback != null) {
                callback.onError(ErrorCode.builder(ErrorCode.INNER_HANDLE_ERROR));
            }
            HMLog.debug(new Function0() { // from class: y3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountManager.lambda$registration$23();
                }
            });
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = Locale.getDefault().getCountry();
            }
            this.mAccount.registration(activity2, str, str2, str3, str4, true, callback);
        }
    }

    public void registrationWithoutRef(Activity activity, String str, String str2, IAccount.Callback<LoginToken, ErrorCode> callback) {
        registrationWithoutRef(activity, str, str2, null, callback);
    }

    public void registrations(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        this.mAccountService.registrations(str, str2, str3, null, str4, null, str5, str6, callback);
    }

    public void resendConfirmation(String str, String str2, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.resendConfirmation(str, str2, null, callback);
    }

    public void resetPassword(String str, String str2, String str3, String str4, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.resetPassword(str, str2, str3, str4, callback);
    }

    public void bindAccount(Activity activity, String str, String str2, String str3, IAccount.Callback<BindResult, ErrorCode> callback) {
        if (((Activity) new WeakReference(activity).get()) == null) {
            if (callback != null) {
                callback.onError(ErrorCode.builder(ErrorCode.INNER_HANDLE_ERROR));
            }
            HMLog.debug(new Function0() { // from class: a4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountManager.lambda$bindAccount$38();
                }
            });
            return;
        }
        this.mAccount.bindAccount(activity, str, str2, str3, callback);
    }

    public void changePassword(String str, String str2, IAccount.Callback<String, ErrorCode> callback, String str3) {
        this.mAccountService.changePassword(str, null, null, str2, null, str3, callback);
    }

    public void getProfile(IAccount.Callback<Profile, ErrorCode> callback) {
        this.mAccount.getProfile(callback);
    }

    public void getToken(IAccount.Callback<Token, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: h4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$getToken$12();
            }
        });
        this.mAccount.getToken(false, callback);
    }

    public void loginIdV2(Context context, String str, String str2, String str3, boolean z, boolean z2, IAccount.Callback<LoginToken, ErrorCode> callback) {
        loginIdV2(context, str, str2, str3, null, z, z2, callback);
    }

    public void loginWithoutRef(Activity activity, String str, String str2, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: r3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$loginWithoutRef$20();
            }
        });
        this.mAccount.login(activity, str, str2, true, callback);
    }

    public void logout(FragmentActivity fragmentActivity, IAccount.Callback<String, ErrorCode> callback, final boolean z) {
        HMLog.debug(new Function0() { // from class: p4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$logout$31(z);
            }
        });
        this.mAccount.logout(fragmentActivity, callback, z);
    }

    public void offlineLogout(FragmentActivity fragmentActivity) {
        HMLog.debug(new Function0() { // from class: k4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$offlineLogout$29();
            }
        });
        this.mAccount.offlineLogout(fragmentActivity);
    }

    public LoginInfo refreshToken(String str, String str2, String str3, String str4) {
        return this.mAccountService.refreshToken(str, str2, str3, str4);
    }

    public void registrationWithoutRef(Activity activity, String str, String str2, String str3, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: n4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$registrationWithoutRef$26();
            }
        });
        this.mAccount.regLogin(activity, str, str2, str3, true, false, callback);
    }

    public void resendConfirmation(String str, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.resendConfirmation(str, null, null, callback);
    }

    public void resetPassword(String str, String str2, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.resetPassword(str, null, str2, callback);
    }

    public void changePassword(String str, String str2, String str3, String str4, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.changePassword(str, null, str2, str3, str4, null, callback);
    }

    public void getProfile(String str, String str2, IAccount.Callback<Profile, ErrorCode> callback) {
        this.mAccount.getProfile(str, str2, callback);
    }

    public void loginIdV2(Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, IAccount.Callback<LoginToken, ErrorCode> callback) {
        String country = TextUtils.isEmpty(str3) ? Locale.getDefault().getCountry() : str3;
        String thirdName = Utils.getThirdName(context, str);
        if (!TextUtils.equals(str, "huami") && !TextUtils.equals(str, "huami_phone")) {
            callback.onError(ErrorCode.builder(ErrorCode.NOT_SUPPORT_TPN_ERROR));
        } else {
            AccountApiV2.loginV2(context, str, "access_token", thirdName, str2, country, str4, z, z2, callback);
        }
    }

    public void resetPassword(String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback) {
        this.mAccountService.resetPassword(str, str2, str3, callback);
    }

    public void loginWithoutRef(Activity activity, String str, String str2, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: c4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$loginWithoutRef$21();
            }
        });
        this.mAccount.login(activity, str, str2, z, callback);
    }

    public void logout(FragmentActivity fragmentActivity, IAccount.Callback<String, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: q4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$logout$32();
            }
        });
        logout(fragmentActivity, callback, true);
    }

    public void syncRefreshToken(IAccount.Callback<Token, ErrorCode> callback) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMLog.debug(new Function0() { // from class: x3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountManager.lambda$syncRefreshToken$14();
                }
            });
            this.mAccount.getInnerToken(true, callback);
            return;
        }
        throw new RuntimeException("Please don't call in the UI thread");
    }

    public void logout(IAccount.Callback<String, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: m3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$logout$33();
            }
        });
        logout(callback, true);
    }

    public void login(Activity activity, String str, IAccount.Callback<LoginToken, ErrorCode> callback) {
        login(activity, str, (String) null, true, callback);
    }

    public void registration(Activity activity, String str, String str2, IAccount.Callback<LoginToken, ErrorCode> callback) {
        registrationBase(activity, str, str2, null, callback);
    }

    public void login(Activity activity, String str, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        login(activity, str, (String) null, z, callback);
    }

    public void registration(Activity activity, String str, IAccount.Callback<LoginToken, ErrorCode> callback) {
        registration(activity, str, null, callback);
    }

    public void login(String str, String str2, IAccount.Callback<LoginToken, ErrorCode> callback) {
        login(str, str2, true, callback);
    }

    @Deprecated
    public void login(String str, String str2, String str3, IAccount.Callback<LoginToken, ErrorCode> callback) {
        login(str, str2, true, callback);
    }

    @Deprecated
    public void login(String str, String str2, String str3, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        login(str, str2, z, callback);
    }

    public void login(String str, String str2, String str3, String str4, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: s3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$login$36();
            }
        });
        this.mAccountService.submitLogin(str, str2, z, callback);
    }

    public void login(String str, String str2, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        HMLog.debug(new Function0() { // from class: z3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountManager.lambda$login$37();
            }
        });
        this.mAccountService.submitLogin(str, str2, z, callback);
    }
}
