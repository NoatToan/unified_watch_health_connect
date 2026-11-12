package com.huami.passport.user;

import android.content.Context;
import android.text.TextUtils;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.api.MailService;
import com.huami.passport.api.PhoneService;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.Message;
import com.huami.passport.entity.OAuthUser;
import com.huami.passport.entity.SmsCode;
import com.huami.passport.net.LoginServiceAPI;
import com.huami.passport.user.AccountService;
import com.huami.passport.utils.Utils;
import com.huami.passport.v2.impl.AccountApiV2;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AccountService implements IAuthService {
    private AccountApiV2 mAccountApi;
    private Context mContext;
    private MailService mMailService;
    private PhoneService mPhoneService;

    /* JADX INFO: renamed from: com.huami.passport.user.AccountService$1, reason: invalid class name */
    public class AnonymousClass1 implements IAccount.Callback<LoginInfo, ErrorCode> {
        public final /* synthetic */ boolean val$allowFastLogin;
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$provider;
        public final /* synthetic */ String val$thirdName;

        /* JADX INFO: renamed from: com.huami.passport.user.AccountService$1$1, reason: invalid class name and collision with other inner class name */
        public class C05251 implements IAccount.Callback<LoginToken, ErrorCode> {
            public final /* synthetic */ LoginInfo val$result;

            public C05251(LoginInfo loginInfo) {
                this.val$result = loginInfo;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onError$1(ErrorCode errorCode) {
                return "login id auth v2 error" + errorCode.toString();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onSuccess$0(LoginToken loginToken) {
                return "login id auth v2 success " + loginToken;
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onError(final ErrorCode errorCode) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.user.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountService.AnonymousClass1.C05251.lambda$onError$1(errorCode);
                    }
                });
                errorCode.setTempAccess(this.val$result.getAccess());
                AnonymousClass1.this.val$callback.onError(errorCode);
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(final LoginToken loginToken) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.user.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountService.AnonymousClass1.C05251.lambda$onSuccess$0(loginToken);
                    }
                });
                AnonymousClass1.this.val$callback.onSuccess(loginToken);
            }
        }

        public AnonymousClass1(String str, String str2, boolean z, IAccount.Callback callback) {
            this.val$provider = str;
            this.val$thirdName = str2;
            this.val$allowFastLogin = z;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onError$1(ErrorCode errorCode) {
            return "Login Auth error :" + errorCode.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0(LoginInfo loginInfo) {
            return "Login ID Server" + loginInfo.toString();
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onError(final ErrorCode errorCode) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.user.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.AnonymousClass1.lambda$onError$1(errorCode);
                }
            });
            this.val$callback.onError(errorCode);
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(final LoginInfo loginInfo) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.user.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.AnonymousClass1.lambda$onSuccess$0(loginInfo);
                }
            });
            AccountApiV2.loginV2(AccountService.this.mContext, this.val$provider, "access_token", this.val$thirdName, loginInfo.getAccess(), loginInfo.getCountryCode(), loginInfo.getCountryState(), this.val$allowFastLogin, true, new C05251(loginInfo));
        }
    }

    /* JADX INFO: renamed from: com.huami.passport.user.AccountService$2, reason: invalid class name */
    public class AnonymousClass2 implements IAccount.Callback<LoginInfo, ErrorCode> {
        public final /* synthetic */ boolean val$allowFastLogin;
        public final /* synthetic */ IAccount.Callback val$callback;
        public final /* synthetic */ String val$provider;
        public final /* synthetic */ String val$thirdName;

        /* JADX INFO: renamed from: com.huami.passport.user.AccountService$2$1, reason: invalid class name */
        public class AnonymousClass1 implements IAccount.Callback<LoginToken, ErrorCode> {
            public final /* synthetic */ LoginInfo val$result;

            public AnonymousClass1(LoginInfo loginInfo) {
                this.val$result = loginInfo;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onError$1(ErrorCode errorCode) {
                return "login id auth v2 error" + errorCode.toString();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ String lambda$onSuccess$0(LoginToken loginToken) {
                return "login id auth v2 success " + loginToken;
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onError(final ErrorCode errorCode) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.user.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountService.AnonymousClass2.AnonymousClass1.lambda$onError$1(errorCode);
                    }
                });
                errorCode.setTempAccess(this.val$result.getAccess());
                AnonymousClass2.this.val$callback.onError(errorCode);
            }

            @Override // com.huami.passport.IAccount.Callback
            public void onSuccess(final LoginToken loginToken) {
                HMLog.debug(new Function0() { // from class: com.huami.passport.user.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountService.AnonymousClass2.AnonymousClass1.lambda$onSuccess$0(loginToken);
                    }
                });
                AnonymousClass2.this.val$callback.onSuccess(loginToken);
            }
        }

        public AnonymousClass2(String str, String str2, boolean z, IAccount.Callback callback) {
            this.val$provider = str;
            this.val$thirdName = str2;
            this.val$allowFastLogin = z;
            this.val$callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onError$1(ErrorCode errorCode) {
            return "login mail error " + errorCode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$onSuccess$0(LoginInfo loginInfo) {
            return "Login ID Server" + loginInfo.toString();
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onError(final ErrorCode errorCode) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.user.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.AnonymousClass2.lambda$onError$1(errorCode);
                }
            });
            this.val$callback.onError(errorCode);
        }

        @Override // com.huami.passport.IAccount.Callback
        public void onSuccess(final LoginInfo loginInfo) {
            HMLog.debug(new Function0() { // from class: com.huami.passport.user.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.AnonymousClass2.lambda$onSuccess$0(loginInfo);
                }
            });
            AccountApiV2.loginV2(AccountService.this.mContext, this.val$provider, "access_token", this.val$thirdName, loginInfo.getAccess(), loginInfo.getCountryCode(), loginInfo.getCountryState(), this.val$allowFastLogin, true, new AnonymousClass1(loginInfo));
        }
    }

    public AccountService(Context context, AccountApiV2 accountApiV2) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mAccountApi = accountApiV2;
        this.mPhoneService = new PhoneService(applicationContext);
        this.mMailService = new MailService(this.mContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$changePassword$5(String str) {
        return "changePassword error --> userName = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$changeUserName$6(String str) {
        return "changeUserName error --> userName = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$checkUserNameStatus$0(String str) {
        return "checkUserNameStatus error --> userName = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$login$3(String str) {
        return "login error --> userName = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$registrations$1(String str) {
        return "registrations error --> userName = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$resendConfirmation$7(String str) {
        return "resendConfirmation error --> userName = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$resetPassword$4(String str) {
        return "resetPassword error --> userName = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$submitLogin$2(String str) {
        return "login error --> userName = " + str;
    }

    @Override // com.huami.passport.user.IAuthService
    public void changePassword(final String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        String provider = Utils.getProvider(str);
        if (TextUtils.equals(provider, "huami_phone")) {
            this.mPhoneService.changePassword(str, str2, str3, str4, str5, str6, callback);
        } else if (TextUtils.equals(provider, "huami")) {
            this.mMailService.changePassword(str, str2, str3, str4, str5, callback, str6);
        } else {
            HMLog.debug(new Function0() { // from class: a5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.lambda$changePassword$5(str);
                }
            });
            callback.onError(ErrorCode.builder(ErrorCode.PARAMS_ERROR));
        }
    }

    @Override // com.huami.passport.user.IAuthService
    public void changeUserName(final String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        String provider = Utils.getProvider(str);
        if (TextUtils.equals(provider, "huami_phone")) {
            this.mPhoneService.changeUserName(str, str2, str3, str4, str5, str6, str7, str8, str9, callback);
        } else if (TextUtils.equals(provider, "huami")) {
            this.mMailService.changeUserName(str, str2, str3, str4, str5, str6, str7, str8, str9, callback);
        } else {
            HMLog.debug(new Function0() { // from class: b5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.lambda$changeUserName$6(str);
                }
            });
            callback.onError(ErrorCode.builder(ErrorCode.PARAMS_ERROR));
        }
    }

    public void checkSmsBinding(String str, String str2, IAccount.Callback<Message, ErrorCode> callback) {
        this.mPhoneService.checkSmsBinding(str, str2, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void checkUserNameStatus(final String str, String str2, IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        String provider = Utils.getProvider(str);
        if (TextUtils.equals(provider, "huami_phone")) {
            this.mPhoneService.checkUserNameStatus(str, str2, callback);
        } else if (TextUtils.equals(provider, "huami")) {
            this.mMailService.checkUserNameStatus(str, str2, callback);
        } else {
            HMLog.debug(new Function0() { // from class: y4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.lambda$checkUserNameStatus$0(str);
                }
            });
            callback.onError(ErrorCode.builder(ErrorCode.PARAMS_ERROR));
        }
    }

    public void getCaptcha(String str, IAccount.Callback<byte[], ErrorCode> callback) {
        this.mMailService.getCaptcha(str, callback);
    }

    public LoginInfo getCurrentLoginInfo(String str) {
        if (TextUtils.equals(str, "huami_phone")) {
            return this.mPhoneService.getCurrentLoginInfo();
        }
        if (TextUtils.equals(str, "huami")) {
            return this.mMailService.getCurrentLoginInfo();
        }
        return null;
    }

    @Override // com.huami.passport.user.IAuthService
    public LoginInfo getLoginInfo(Context context) {
        return Keeper.getLoginInfo(context);
    }

    public IMailService getMailService() {
        return this.mMailService;
    }

    @Override // com.huami.passport.user.IAuthService
    public void getOAuthUser(String str, String str2, String str3, String str4, IAccount.Callback<OAuthUser, ErrorCode> callback) {
        LoginServiceAPI.getOAuthUser(this.mContext, str, str2, str3, str4, callback);
    }

    public IPhoneService getPhoneService() {
        return this.mPhoneService;
    }

    @Override // com.huami.passport.user.IAuthService
    public void login(String str, String str2, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        login(str, str2, null, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public LoginInfo refreshToken(String str, String str2, String str3, String str4) {
        return LoginServiceAPI.refreshToken(this.mContext, str, str2, str3, str4);
    }

    @Deprecated
    public void registrations(String str, String str2, String str3, String str4, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        registrations(str, str2, str3, str4, null, null, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void resendConfirmation(final String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        String provider = Utils.getProvider(str);
        if (TextUtils.equals(provider, "huami_phone")) {
            this.mPhoneService.resendConfirmation(str, str2, str3, callback);
        } else if (TextUtils.equals(provider, "huami")) {
            this.mMailService.resendConfirmation(str, str2, str3, callback);
        } else {
            HMLog.debug(new Function0() { // from class: d5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.lambda$resendConfirmation$7(str);
                }
            });
            callback.onError(ErrorCode.builder(ErrorCode.PARAMS_ERROR));
        }
    }

    @Override // com.huami.passport.user.IAuthService
    public void resetPassword(String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback) {
        resetPassword(str, str2, str3, null, callback);
    }

    public void submitLogin(final String str, String str2, boolean z, IAccount.Callback<LoginToken, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        String provider = Utils.getProvider(str);
        String thirdName = Utils.getThirdName(this.mContext, provider);
        if (TextUtils.equals(provider, "huami_phone")) {
            this.mPhoneService.login(str, str2, new AnonymousClass1(provider, thirdName, z, callback));
        } else if (TextUtils.equals(provider, "huami")) {
            this.mMailService.login(str, str2, new AnonymousClass2(provider, thirdName, z, callback));
        } else {
            HMLog.debug(new Function0() { // from class: c5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.lambda$submitLogin$2(str);
                }
            });
            callback.onError(ErrorCode.builder(ErrorCode.PARAMS_ERROR));
        }
    }

    public void verfyCode(String str, String str2, String str3, IAccount.Callback<SmsCode, ErrorCode> callback) {
        this.mPhoneService.verfyCode(str, str2, str3, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void login(final String str, String str2, String str3, String str4, String[] strArr, String str5, String str6, String str7, String str8, String str9, String str10, String str11, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        String provider = Utils.getProvider(str);
        if (TextUtils.equals(provider, "huami_phone")) {
            this.mPhoneService.login(str, str2, str3, str4, strArr, str5, str6, str7, str8, str9, str10, str11, callback);
        } else if (TextUtils.equals(provider, "huami")) {
            this.mMailService.login(str, str2, str3, str4, strArr, str5, str6, str7, str8, str9, str10, str11, callback);
        } else {
            HMLog.debug(new Function0() { // from class: z4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.lambda$login$3(str);
                }
            });
            callback.onError(ErrorCode.builder(ErrorCode.PARAMS_ERROR));
        }
    }

    @Override // com.huami.passport.user.IAuthService
    @Deprecated
    public void registrations(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        registrations(str, str2, str3, str4, str5, str6, null, null, callback);
    }

    public void resetPassword(final String str, String str2, String str3, String str4, IAccount.Callback<String, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        String provider = Utils.getProvider(str);
        if (TextUtils.equals(provider, "huami_phone")) {
            this.mPhoneService.resetPassword(str, str2, str3, callback);
        } else if (TextUtils.equals(provider, "huami")) {
            this.mMailService.resetPassword(str, null, str2, str3, str4, callback);
        } else {
            HMLog.debug(new Function0() { // from class: x4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.lambda$resetPassword$4(str);
                }
            });
            callback.onError(ErrorCode.builder(ErrorCode.PARAMS_ERROR));
        }
    }

    @Override // com.huami.passport.user.IAuthService
    public void registrations(String str, final String str2, String str3, String str4, String str5, String str6, String str7, String str8, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        if (callback == null) {
            return;
        }
        String provider = Utils.getProvider(str2);
        if (TextUtils.equals(provider, "huami_phone")) {
            this.mPhoneService.registrations(str, str2, str3, str6, null, null, null, str4, null, str5, str7, str8, callback);
        } else if (TextUtils.equals(provider, "huami")) {
            this.mMailService.registrations(str, str2, str3, str6, str4, null, null, str7, str8, str5, callback);
        } else {
            HMLog.debug(new Function0() { // from class: e5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountService.lambda$registrations$1(str2);
                }
            });
            callback.onError(ErrorCode.builder(ErrorCode.PARAMS_ERROR));
        }
    }

    @Override // com.huami.passport.user.IAuthService
    public void changeUserName(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<String, ErrorCode> callback) {
        changeUserName(str, str2, str3, null, str4, null, str5, null, str6, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void checkUserNameStatus(String str, IAccount.Callback<String, ErrorCode> callback) {
        checkUserNameStatus(str, null, callback);
    }

    @Override // com.huami.passport.user.IAuthService
    public void login(String str, String str2, String str3, IAccount.Callback<LoginInfo, ErrorCode> callback) {
        login(str, str2, null, null, null, null, null, null, null, null, null, str3, callback);
    }
}
