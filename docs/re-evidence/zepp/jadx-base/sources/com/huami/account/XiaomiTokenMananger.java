package com.huami.account;

import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.account.XiaomiTokenMananger;
import com.huami.account.api.model.AccountInfo;
import com.huami.account.bean.AuthDevice;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.ui.login.entity.XiaomiTempRefreshToken;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.api.XiaoMiHelper;
import com.huami.passport.entity.BindAccount;
import com.huami.passport.entity.BindResult;
import com.huami.passport.entity.ThirdPartyToken;
import com.huami.passport.entity.Token;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class XiaomiTokenMananger {
    private static final String a = "XiaomiTokenMananger";
    private static final long b = 2592000000L;

    public interface OnAuthCallback {
        void onDifferentAccount();

        void onError(ErrorCode errorCode);

        void onSuccess();

        void onUserCancel();
    }

    public interface OnBindInfoCallback {
        void onBoundXiaomiLogin(String str);

        void onError();

        void onGetBindStatusError();

        void onNotSupportXiaomiBind();

        void onUnboundXiaomiLogin();

        void onXiaomiLogin(String str);
    }

    public interface OnBindXiaomiCallback {
        void onAlreadyBind(String str);

        void onError();

        void onSuccess(String str);

        void onUserCancel();
    }

    public static abstract class OnDeviceAuthCallback implements OnAuthCallback {
        @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
        public void onDifferentAccount() {
        }
    }

    public interface OnGetTokenCallback {
        void empty();

        void onError(ErrorCode errorCode);

        void onRefreshFaild(@Nullable String str);

        void onSuccess(@Nullable String str);
    }

    public class a implements IAccount.Callback<XiaomiOAuthResults, ErrorCode> {
        public final /* synthetic */ OnAuthCallback a;
        public final /* synthetic */ XiaoaiAuthParams b;

        public a(OnAuthCallback onAuthCallback, XiaoaiAuthParams xiaoaiAuthParams) {
            this.a = onAuthCallback;
            this.b = xiaoaiAuthParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(ErrorCode errorCode) {
            return "reAuthorization ErrorCode:" + errorCode.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e() {
            return "results is null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f() {
            return "code is null";
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            if (ErrorCode.USER_CANCEL_ERROR.equals(errorCode.getErrorCode())) {
                OnAuthCallback onAuthCallback = this.a;
                if (onAuthCallback != null) {
                    onAuthCallback.onUserCancel();
                }
            } else {
                OnAuthCallback onAuthCallback2 = this.a;
                if (onAuthCallback2 != null) {
                    onAuthCallback2.onError(errorCode);
                }
            }
            HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.a.d(errorCode);
                }
            });
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onSuccess(XiaomiOAuthResults xiaomiOAuthResults) {
            if (xiaomiOAuthResults == null) {
                OnAuthCallback onAuthCallback = this.a;
                if (onAuthCallback != null) {
                    onAuthCallback.onError(ErrorCode.builder(ErrorCode.PARAMS_IS_NULL_ERROR));
                }
                HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return XiaomiTokenMananger.a.e();
                    }
                });
                return;
            }
            String code = xiaomiOAuthResults.getCode();
            if (!TextUtils.isEmpty(code)) {
                XiaomiTokenMananger.B(this.a, code, this.b);
                return;
            }
            OnAuthCallback onAuthCallback2 = this.a;
            if (onAuthCallback2 != null) {
                onAuthCallback2.onError(ErrorCode.builder(ErrorCode.PARAMS_IS_NULL_ERROR));
            }
            HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.a.f();
                }
            });
        }
    }

    public class b implements IAccount.Callback<Token, ErrorCode> {
        public final /* synthetic */ OnAuthCallback a;
        public final /* synthetic */ String b;
        public final /* synthetic */ XiaoaiAuthParams c;

        public b(OnAuthCallback onAuthCallback, String str, XiaoaiAuthParams xiaoaiAuthParams) {
            this.a = onAuthCallback;
            this.b = str;
            this.c = xiaoaiAuthParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "getAppTokenForGettingAccessToken ErrorCode:" + errorCode.toString();
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            OnAuthCallback onAuthCallback = this.a;
            if (onAuthCallback != null) {
                onAuthCallback.onError(errorCode);
            }
            HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.b.b(errorCode);
                }
            });
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Token token) {
            XiaomiTokenMananger.F(this.a, this.b, token.getAccessToken(), this.c);
        }
    }

    public class c implements IAccount.Callback<ThirdPartyToken, ErrorCode> {
        public final /* synthetic */ XiaoaiAuthParams a;
        public final /* synthetic */ OnAuthCallback b;

        public c(XiaoaiAuthParams xiaoaiAuthParams, OnAuthCallback onAuthCallback) {
            this.a = xiaoaiAuthParams;
            this.b = onAuthCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "getXiaomiAccessTokenByCode ErrorCode:" + errorCode.toString();
        }

        private void e(ThirdPartyToken thirdPartyToken) {
            String refreshToken = thirdPartyToken.getRefreshToken();
            String accessToken = thirdPartyToken.getAccessToken();
            String thirdId = thirdPartyToken.getThirdId();
            long expiresIn = thirdPartyToken.getExpiresIn();
            XiaoaiAuthParams xiaoaiAuthParams = this.a;
            if ((xiaoaiAuthParams instanceof AppAuthParams) && !TextUtils.equals(((AppAuthParams) xiaoaiAuthParams).getXiaomiId(), thirdId)) {
                OnAuthCallback onAuthCallback = this.b;
                if (onAuthCallback != null) {
                    onAuthCallback.onDifferentAccount();
                    return;
                }
                return;
            }
            boolean zSaveXiaomiToken = this.a instanceof AppAuthParams ? XiaomiTokenMananger.saveXiaomiToken(refreshToken, accessToken, thirdId, expiresIn) : false;
            XiaoaiAuthParams xiaoaiAuthParams2 = this.a;
            if (xiaoaiAuthParams2 instanceof DeviceAuthParams) {
                DeviceAuthParams deviceAuthParams = (DeviceAuthParams) xiaoaiAuthParams2;
                zSaveXiaomiToken = XiaomiTokenMananger.c0(deviceAuthParams.getDeviceId(), deviceAuthParams.getTpacType(), refreshToken, accessToken, thirdId);
            }
            OnAuthCallback onAuthCallback2 = this.b;
            if (onAuthCallback2 == null) {
                return;
            }
            if (zSaveXiaomiToken) {
                onAuthCallback2.onSuccess();
            } else {
                onAuthCallback2.onError(ErrorCode.builder(ErrorCode.UNKOWN_ERROR));
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            if (ErrorCode.USER_CANCEL_ERROR.equals(errorCode.getErrorCode())) {
                OnAuthCallback onAuthCallback = this.b;
                if (onAuthCallback != null) {
                    onAuthCallback.onUserCancel();
                }
            } else {
                OnAuthCallback onAuthCallback2 = this.b;
                if (onAuthCallback2 != null) {
                    onAuthCallback2.onError(errorCode);
                }
            }
            HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.c.b(errorCode);
                }
            });
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ThirdPartyToken thirdPartyToken) {
            e(thirdPartyToken);
        }
    }

    public class d implements IAccount.Callback<Token, ErrorCode> {
        public final /* synthetic */ OnGetTokenCallback a;
        public final /* synthetic */ String b;
        public final /* synthetic */ XiaoaiTokenKeeper.DeviceToken c;
        public final /* synthetic */ String d;

        public d(OnGetTokenCallback onGetTokenCallback, String str, XiaoaiTokenKeeper.DeviceToken deviceToken, String str2) {
            this.a = onGetTokenCallback;
            this.b = str;
            this.c = deviceToken;
            this.d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "getToken:" + errorCode.toString();
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            OnGetTokenCallback onGetTokenCallback = this.a;
            if (onGetTokenCallback != null) {
                onGetTokenCallback.onRefreshFaild(this.b);
            }
            HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.d.b(errorCode);
                }
            });
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Token token) {
            if (!TextUtils.isEmpty(token.getErrorCode())) {
                OnGetTokenCallback onGetTokenCallback = this.a;
                if (onGetTokenCallback != null) {
                    onGetTokenCallback.onRefreshFaild(this.b);
                    return;
                }
                return;
            }
            XiaoaiTokenKeeper.DeviceToken deviceToken = this.c;
            if (deviceToken != null) {
                XiaomiTokenMananger.C(deviceToken.getDeviceId(), this.c.getTpacType(), token.getAccessToken(), this.b, this.d, this.a);
            } else {
                XiaomiTokenMananger.b0(this.a, token.getAccessToken(), this.b, this.d);
            }
        }
    }

    public class e implements IAccount.Callback<ThirdPartyToken, ErrorCode> {
        public final /* synthetic */ OnGetTokenCallback a;
        public final /* synthetic */ String b;

        public e(OnGetTokenCallback onGetTokenCallback, String str) {
            this.a = onGetTokenCallback;
            this.b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "refreshToken: (App)" + errorCode.toString();
        }

        private void e(ThirdPartyToken thirdPartyToken) {
            String refreshToken = thirdPartyToken.getRefreshToken();
            String accessToken = thirdPartyToken.getAccessToken();
            long expiresIn = thirdPartyToken.getExpiresIn();
            HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
            boolean zD0 = XiaomiTokenMananger.d0(refreshToken, accessToken, hMAccountKeeper.getXiaomiUserId(), expiresIn, hMAccountKeeper.hasIoT(), hMAccountKeeper.hasMasterCard());
            OnGetTokenCallback onGetTokenCallback = this.a;
            if (onGetTokenCallback == null) {
                return;
            }
            if (zD0) {
                onGetTokenCallback.onSuccess(accessToken);
            } else {
                onGetTokenCallback.onRefreshFaild(this.b);
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            if ("0106".equals(errorCode.getErrorCode()) && AccountExternalsKt.getAccountDelegate().refreshMiTokenExternalConditions()) {
                XiaomiTokenMananger.clearXiaomiToken();
                OnGetTokenCallback onGetTokenCallback = this.a;
                if (onGetTokenCallback != null) {
                    onGetTokenCallback.onError(errorCode);
                }
            } else {
                OnGetTokenCallback onGetTokenCallback2 = this.a;
                if (onGetTokenCallback2 != null) {
                    onGetTokenCallback2.onRefreshFaild(this.b);
                }
            }
            HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.e.b(errorCode);
                }
            });
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ThirdPartyToken thirdPartyToken) {
            e(thirdPartyToken);
        }
    }

    public class f implements IAccount.Callback<ThirdPartyToken, ErrorCode> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ OnGetTokenCallback c;
        public final /* synthetic */ String d;

        public f(String str, String str2, OnGetTokenCallback onGetTokenCallback, String str3) {
            this.a = str;
            this.b = str2;
            this.c = onGetTokenCallback;
            this.d = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "refreshToken: (Device) " + errorCode.toString();
        }

        private void e(ThirdPartyToken thirdPartyToken) {
            String refreshToken = thirdPartyToken.getRefreshToken();
            String accessToken = thirdPartyToken.getAccessToken();
            boolean zC0 = XiaomiTokenMananger.c0(this.a, this.b, refreshToken, accessToken, thirdPartyToken.getThirdId());
            OnGetTokenCallback onGetTokenCallback = this.c;
            if (onGetTokenCallback == null) {
                return;
            }
            if (zC0) {
                onGetTokenCallback.onSuccess(accessToken);
            } else {
                onGetTokenCallback.onRefreshFaild(this.d);
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            if ("0106".equals(errorCode.getErrorCode())) {
                XiaoaiTokenKeeper.INSTANCE.removeToken(this.a);
                OnGetTokenCallback onGetTokenCallback = this.c;
                if (onGetTokenCallback != null) {
                    onGetTokenCallback.onError(errorCode);
                }
            } else {
                OnGetTokenCallback onGetTokenCallback2 = this.c;
                if (onGetTokenCallback2 != null) {
                    onGetTokenCallback2.onRefreshFaild(this.d);
                }
            }
            HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.f.b(errorCode);
                }
            });
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ThirdPartyToken thirdPartyToken) {
            e(thirdPartyToken);
        }
    }

    public class g implements IAccount.Callback<List<BindAccount>, ErrorCode> {
        public final /* synthetic */ OnBindInfoCallback a;
        public final /* synthetic */ boolean b;

        public g(OnBindInfoCallback onBindInfoCallback, boolean z) {
            this.a = onBindInfoCallback;
            this.b = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(ErrorCode errorCode) {
            return "listAccount:" + errorCode.toString();
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            OnBindInfoCallback onBindInfoCallback = this.a;
            if (onBindInfoCallback != null) {
                onBindInfoCallback.onGetBindStatusError();
            }
            HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.g.b(errorCode);
                }
            });
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<BindAccount> list) {
            AccountInfo accountInfo = new AccountInfo();
            for (BindAccount bindAccount : list) {
                accountInfo.setAccountId(bindAccount.getThirdType(), bindAccount.getThirdId());
            }
            if (this.a == null) {
                return;
            }
            if (accountInfo.isBind("xiaomi")) {
                if (HMLoginManager.isUseXiaomiLogin()) {
                    this.a.onXiaomiLogin(accountInfo.getXiaomiId());
                    return;
                } else {
                    this.a.onBoundXiaomiLogin(accountInfo.getXiaomiId());
                    return;
                }
            }
            Set<String> boundProviders = accountInfo.getBoundProviders();
            if (this.b ? XiaomiTokenMananger.H(boundProviders) : XiaomiTokenMananger.G(boundProviders)) {
                this.a.onUnboundXiaomiLogin();
            } else {
                this.a.onNotSupportXiaomiBind();
            }
        }
    }

    public class h implements IAccount.Callback<BindResult, ErrorCode> {
        public final /* synthetic */ OnBindXiaomiCallback a;

        public h(OnBindXiaomiCallback onBindXiaomiCallback) {
            this.a = onBindXiaomiCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(ErrorCode errorCode) {
            return "bind error:" + errorCode.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d() {
            return "bind account is null";
        }

        private void g(BindAccount bindAccount) {
            String refreshToken = bindAccount.getRefreshToken();
            String accessToken = bindAccount.getAccessToken();
            String thirdId = bindAccount.getThirdId();
            boolean zSaveXiaomiToken = XiaomiTokenMananger.saveXiaomiToken(refreshToken, accessToken, thirdId, bindAccount.getExpiresIn());
            OnBindXiaomiCallback onBindXiaomiCallback = this.a;
            if (onBindXiaomiCallback == null) {
                return;
            }
            if (zSaveXiaomiToken) {
                onBindXiaomiCallback.onSuccess(thirdId);
            } else {
                onBindXiaomiCallback.onError();
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onError(final ErrorCode errorCode) {
            HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.h.c(errorCode);
                }
            });
            if ("0111".equals(errorCode.getErrorCode())) {
                OnBindXiaomiCallback onBindXiaomiCallback = this.a;
                if (onBindXiaomiCallback != null) {
                    onBindXiaomiCallback.onAlreadyBind(errorCode.getThirdId());
                    return;
                }
                return;
            }
            if (ErrorCode.USER_CANCEL_ERROR.equals(errorCode.getErrorCode())) {
                OnBindXiaomiCallback onBindXiaomiCallback2 = this.a;
                if (onBindXiaomiCallback2 != null) {
                    onBindXiaomiCallback2.onUserCancel();
                    return;
                }
                return;
            }
            OnBindXiaomiCallback onBindXiaomiCallback3 = this.a;
            if (onBindXiaomiCallback3 != null) {
                onBindXiaomiCallback3.onError();
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BindResult bindResult) {
            BindAccount data = bindResult.getData();
            if (data != null) {
                g(data);
                return;
            }
            OnBindXiaomiCallback onBindXiaomiCallback = this.a;
            if (onBindXiaomiCallback != null) {
                onBindXiaomiCallback.onError();
            }
            HMLog.info(XiaomiTokenMananger.a, new Function0() { // from class: com.huami.account.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.h.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void B(OnAuthCallback onAuthCallback, @NonNull String str, XiaoaiAuthParams xiaoaiAuthParams) {
        AccountManager.getDefault(AccountExternalsKt.getAppContext()).getToken(new b(onAuthCallback, str, xiaoaiAuthParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void C(String str, String str2, String str3, String str4, String str5, OnGetTokenCallback onGetTokenCallback) {
        XiaoMiHelper.refreshToken(AccountExternalsKt.getAppContext(), E(str2), str3, str5, new f(str, str2, onGetTokenCallback, str4));
    }

    private static String D() {
        return E("xiaomi");
    }

    private static String E(String str) {
        String thirdName = null;
        try {
            TpaConfig tpaConfig = Utils.getTpaConfigs(AccountExternalsKt.getAppContext()).get(str);
            if (tpaConfig != null) {
                thirdName = tpaConfig.getThirdName();
            }
        } catch (IOException e2) {
            HMLog.verbose(a, new Function0() { // from class: m09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e2.toString();
                }
            });
        }
        return TextUtils.isEmpty(thirdName) ? D() : thirdName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(OnAuthCallback onAuthCallback, @NonNull String str, @NonNull String str2, @NonNull XiaoaiAuthParams xiaoaiAuthParams) {
        String strD;
        String str3;
        String miotDid;
        if (xiaoaiAuthParams instanceof DeviceAuthParams) {
            DeviceAuthParams deviceAuthParams = (DeviceAuthParams) xiaoaiAuthParams;
            String strE = E(deviceAuthParams.getTpacType());
            String deviceId = deviceAuthParams.getDeviceId();
            str3 = deviceId;
            strD = strE;
            miotDid = AccountExternalsKt.getAccountDelegate().getMiotDid(deviceId);
        } else {
            strD = D();
            str3 = null;
            miotDid = null;
        }
        XiaoMiHelper.getAccessToken(AccountExternalsKt.getAppContext(), strD, str2, str, str3, miotDid, new c(xiaoaiAuthParams, onAuthCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean G(Set<String> set) {
        return set.contains("wechat") || set.contains("huami_phone") || set.contains("huami");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(Set<String> set) {
        return set.contains("wechat") || set.contains("huami_phone") || set.contains("huami") || set.contains("google") || set.contains("facebook");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String I() {
        return "not huami login";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J() {
        return "Token 获取类别：DeviceToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String K() {
        return "Token 获取类别：AppToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L(XiaoaiTokenKeeper.DeviceToken deviceToken) {
        return String.format("Token 类型：Convert Token %s", deviceToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String M(XiaoaiTokenKeeper.DeviceToken deviceToken) {
        return String.format("Token 类型：Device Token %s", deviceToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String N() {
        return "Token 类型：App Token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O() {
        return "判断当前 Token 依据：App Token(fallback)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String P() {
        return "判断当前 Token 依据：AppToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Q() {
        return "判断当前 Token 依据：ConvertToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R() {
        return "判断当前 Token 依据：AppToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S() {
        return "判断当前 Token 依据：ConvertToken";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T(int i, String str) {
        return String.format("判断当前 Token 依据：DeviceToken(source=%s, deviceId=%s)", Integer.valueOf(i), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String U() {
        return "token 缺失";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String V() {
        return "token 字段缺失，清除该 token";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W() {
        return "TpaConfig error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X() {
        return "TpaConfig is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Y() {
        return "deviceId/tpacType is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Z() {
        return "token is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a0() {
        return "token is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b0(OnGetTokenCallback onGetTokenCallback, String str, String str2, String str3) {
        XiaoMiHelper.refreshToken(AccountExternalsKt.getAppContext(), D(), str, str3, new e(onGetTokenCallback, str2));
    }

    public static void bind(Activity activity, OnBindXiaomiCallback onBindXiaomiCallback) {
        AccountManager.getDefault(AccountExternalsKt.getAppContext()).bindAccount(activity, "xiaomi", Locale.getDefault().getCountry(), new h(onBindXiaomiCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c0(String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            HMLog.info(a, new Function0() { // from class: f09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.Y();
                }
            });
            return false;
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            HMLog.info(a, new Function0() { // from class: r09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.Z();
                }
            });
            return false;
        }
        XiaoaiTokenKeeper.INSTANCE.saveToken(str, new XiaoaiTokenKeeper.DeviceToken(System.currentTimeMillis(), str2, str, str3, str4, str5));
        return true;
    }

    public static void clearAllDeviceToken() {
        XiaoaiTokenKeeper.INSTANCE.removeAll();
    }

    public static void clearDeviceToken(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        XiaoaiTokenKeeper.INSTANCE.removeToken(str);
    }

    public static void clearXiaomiToken() {
        HMAccountKeeper.INSTANCE.saveXiaomiToken(null, null, null, 0L, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d0(String str, String str2, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            HMLog.info(a, new Function0() { // from class: j09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.a0();
                }
            });
            return false;
        }
        HMAccountKeeper.INSTANCE.saveXiaomiToken(str, str2, str3, j, z, z2);
        AccountExternalsKt.getAccountDelegate().saveTokenToWatch(str, str2, j);
        return true;
    }

    public static void getAppXiaomiAccessToken(OnGetTokenCallback onGetTokenCallback, boolean z) {
        getAppXiaomiAccessToken(null, onGetTokenCallback, z);
    }

    public static void getBindInfo(OnBindInfoCallback onBindInfoCallback) {
        getBindInfo(onBindInfoCallback, false);
    }

    @Deprecated
    public static void getXiaomiAccessToken(OnGetTokenCallback onGetTokenCallback, boolean z) {
        XiaoaiTokenKeeper.DeviceToken token;
        AuthDevice currentDevice = AccountExternalsKt.getAccountDelegate().getCurrentDevice();
        if (currentDevice == null || !AccountExternalsKt.getDeviceTokenConfig().isSupportDeviceToken(currentDevice.getSource().getValue()) || (token = XiaoaiTokenKeeper.INSTANCE.getToken(currentDevice.getSerialNumber())) == null) {
            HMLog.verbose(a, new Function0() { // from class: e09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.K();
                }
            });
            getAppXiaomiAccessToken(null, onGetTokenCallback, z);
        } else {
            HMLog.verbose(a, new Function0() { // from class: i09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.J();
                }
            });
            getAppXiaomiAccessToken(token, onGetTokenCallback, z);
        }
    }

    public static void getXiaomiAccessTokenForXiaoAi(OnGetTokenCallback onGetTokenCallback, boolean z) {
        AuthDevice currentDevice = AccountExternalsKt.getAccountDelegate().getCurrentDevice();
        if (currentDevice != null) {
            if (XiaoAiTokenConvertManager.isDeviceSourceSupportConvert(currentDevice.getSource().getValue())) {
                final XiaoaiTokenKeeper.DeviceToken token = XiaoaiTokenKeeper.INSTANCE.getToken(currentDevice.getSerialNumber());
                HMLog.debug(a, new Function0() { // from class: k09
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return XiaomiTokenMananger.L(token);
                    }
                });
                XiaoAiTokenConvertManager.interceptConvertToken(currentDevice, z, onGetTokenCallback);
                return;
            } else if (AccountExternalsKt.getDeviceTokenConfig().isSupportDeviceToken(currentDevice.getSource().getValue())) {
                final XiaoaiTokenKeeper.DeviceToken token2 = XiaoaiTokenKeeper.INSTANCE.getToken(currentDevice.getSerialNumber());
                HMLog.debug(a, new Function0() { // from class: l09
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return XiaomiTokenMananger.M(token2);
                    }
                });
                if (token2 != null) {
                    getAppXiaomiAccessToken(token2, onGetTokenCallback, z);
                    return;
                }
                return;
            }
        }
        HMLog.debug(a, new Function0() { // from class: h09
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return XiaomiTokenMananger.N();
            }
        });
        getAppXiaomiAccessToken(null, onGetTokenCallback, z);
    }

    public static boolean hasAppXiaomiAiToken() {
        return HMAccountKeeper.INSTANCE.hasIoT() && hasXiaomiToken();
    }

    public static boolean hasMasterCardToken() {
        return HMAccountKeeper.INSTANCE.hasMasterCard() && hasXiaomiToken();
    }

    public static boolean hasXiaomiAiToken() {
        AuthDevice currentDevice = AccountExternalsKt.getAccountDelegate().getCurrentDevice();
        if (currentDevice == null) {
            HMLog.info(a, new Function0() { // from class: n09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.P();
                }
            });
            return hasAppXiaomiAiToken();
        }
        if (XiaoAiTokenConvertManager.isDeviceSourceSupportConvert(currentDevice.getSource().getValue())) {
            HMLog.info(a, new Function0() { // from class: s09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.Q();
                }
            });
            return XiaoAiTokenConvertManager.isSupportSilentConvertToken(currentDevice.getSource().getValue());
        }
        if (AccountExternalsKt.getDeviceTokenConfig().isSupportDeviceToken(currentDevice.getSource().getValue())) {
            return hasXiaomiAiToken(currentDevice.getSource().getValue(), currentDevice.getSerialNumber());
        }
        HMLog.info(a, new Function0() { // from class: d09
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return XiaomiTokenMananger.R();
            }
        });
        return hasAppXiaomiAiToken();
    }

    public static boolean hasXiaomiToken() {
        HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
        return (TextUtils.isEmpty(hMAccountKeeper.getXiaomiAccessToken()) || TextUtils.isEmpty(hMAccountKeeper.getXiaomiRefreshToken()) || TextUtils.isEmpty(hMAccountKeeper.getXiaomiUserId())) ? false : true;
    }

    public static void reAuthorization(Activity activity, String str, OnAuthCallback onAuthCallback) {
        reAuthorization(activity, new AppAuthParams(str), onAuthCallback);
    }

    public static void reAuthorizationForXiaoai(Activity activity, String str, String str2, int i, OnDeviceAuthCallback onDeviceAuthCallback) {
        if (XiaoAiTokenConvertManager.isDeviceSourceSupportConvert(i)) {
            XiaoAiTokenConvertManager.authByConvertToken(str, str2, onDeviceAuthCallback);
        } else {
            reAuthorization(activity, new DeviceAuthParams(str2, str), onDeviceAuthCallback);
        }
    }

    public static void refreshAllDeviceToken() {
        List<XiaoaiTokenKeeper.DeviceToken> all = XiaoaiTokenKeeper.INSTANCE.getAll();
        if (all == null || all.size() == 0) {
            return;
        }
        Iterator<XiaoaiTokenKeeper.DeviceToken> it2 = all.iterator();
        while (it2.hasNext()) {
            getAppXiaomiAccessToken(it2.next(), null, false);
        }
    }

    public static boolean saveXiaomiToken(String str, String str2, String str3, long j) {
        return d0(str, str2, str3, j, true, true);
    }

    public static void saveXiaomiTokenWhenLogin() {
        if (HMLoginManager.isUseXiaomiLogin()) {
            AccountManager accountManager = AccountManager.getDefault(AccountExternalsKt.getAppContext());
            String refreshToken = accountManager.getUserInfo().getRefreshToken();
            if (refreshToken == null) {
                refreshToken = XiaomiTempRefreshToken.INSTANCE.getRefreshToken();
            }
            saveXiaomiToken(refreshToken, accountManager.getUserInfo().getAccessToken(), accountManager.getUserInfo().getThirdId(), accountManager.getUserInfo().getExpiresIn());
        }
    }

    public static void getAppXiaomiAccessToken(@Nullable XiaoaiTokenKeeper.DeviceToken deviceToken, OnGetTokenCallback onGetTokenCallback, boolean z) {
        String xiaomiRefreshToken;
        long saveTime;
        String accessToken;
        if (deviceToken != null) {
            saveTime = deviceToken.getSaveTime();
            accessToken = deviceToken.getAccessToken();
            xiaomiRefreshToken = deviceToken.getRefreshToken();
        } else {
            HMAccountKeeper hMAccountKeeper = HMAccountKeeper.INSTANCE;
            long xiaomiTokenSaveTime = hMAccountKeeper.getXiaomiTokenSaveTime();
            String xiaomiAccessToken = hMAccountKeeper.getXiaomiAccessToken();
            xiaomiRefreshToken = hMAccountKeeper.getXiaomiRefreshToken();
            saveTime = xiaomiTokenSaveTime;
            accessToken = xiaomiAccessToken;
        }
        if (TextUtils.isEmpty(accessToken) || TextUtils.isEmpty(xiaomiRefreshToken)) {
            if (onGetTokenCallback != null) {
                onGetTokenCallback.empty();
            }
        } else if (Math.abs(System.currentTimeMillis() - saveTime) >= 2592000000L || z) {
            AccountManager.getDefault(AccountExternalsKt.getAppContext()).getToken(new d(onGetTokenCallback, accessToken, deviceToken, xiaomiRefreshToken));
        } else if (onGetTokenCallback != null) {
            onGetTokenCallback.onSuccess(accessToken);
        }
    }

    public static void getBindInfo(OnBindInfoCallback onBindInfoCallback, boolean z) {
        if (HMLoginManager.isHuamiSDKLogin()) {
            AccountManager.getDefault(AccountExternalsKt.getAppContext()).listAccount(false, new g(onBindInfoCallback, z));
            return;
        }
        if (onBindInfoCallback != null) {
            onBindInfoCallback.onError();
        }
        HMLog.info(a, new Function0() { // from class: b09
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return XiaomiTokenMananger.I();
            }
        });
    }

    public static void reAuthorization(Activity activity, String str, String str2, OnDeviceAuthCallback onDeviceAuthCallback) {
        reAuthorization(activity, new DeviceAuthParams(str2, str), onDeviceAuthCallback);
    }

    public static void reAuthorization(Activity activity, XiaoaiAuthParams xiaoaiAuthParams, OnAuthCallback onAuthCallback) {
        TpaConfig tpaConfig;
        String defaultDeviceState;
        try {
            String deviceId = null;
            if (xiaoaiAuthParams instanceof DeviceAuthParams) {
                tpaConfig = Utils.getTpaConfigs(AccountExternalsKt.getAppContext()).get(((DeviceAuthParams) xiaoaiAuthParams).getTpacType());
                deviceId = ((DeviceAuthParams) xiaoaiAuthParams).getDeviceId();
                defaultDeviceState = AccountExternalsKt.getAccountDelegate().getDefaultDeviceState(deviceId, AccountExternalsKt.getAccountDelegate().getMiotDid(deviceId));
            } else {
                tpaConfig = Utils.getTpaConfigs(AccountExternalsKt.getAppContext()).get("xiaomi");
                defaultDeviceState = null;
            }
            if (tpaConfig == null) {
                if (onAuthCallback != null) {
                    onAuthCallback.onError(ErrorCode.builder(ErrorCode.CONFIG_LOGIN_DIALOG_ERROR));
                }
                HMLog.info(a, new Function0() { // from class: g09
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return XiaomiTokenMananger.X();
                    }
                });
                return;
            }
            XiaoMiHelper.getOAuthCode(activity, tpaConfig, deviceId, defaultDeviceState, new a(onAuthCallback, xiaoaiAuthParams));
        } catch (IOException unused) {
            if (onAuthCallback != null) {
                onAuthCallback.onError(ErrorCode.builder(ErrorCode.CONFIG_LOGIN_DIALOG_ERROR));
            }
            HMLog.info(a, new Function0() { // from class: o09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.W();
                }
            });
        }
    }

    public static boolean hasXiaomiAiToken(final int i, final String str) {
        if (XiaoAiTokenConvertManager.isDeviceSourceSupportConvert(i)) {
            HMLog.info(a, new Function0() { // from class: a09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.S();
                }
            });
            return XiaoAiTokenConvertManager.isSupportSilentConvertToken(i);
        }
        if (AccountExternalsKt.getDeviceTokenConfig().isSupportDeviceToken(i) && !TextUtils.isEmpty(str)) {
            HMLog.info(a, new Function0() { // from class: zz8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.T(i, str);
                }
            });
            XiaoaiTokenKeeper xiaoaiTokenKeeper = XiaoaiTokenKeeper.INSTANCE;
            XiaoaiTokenKeeper.DeviceToken token = xiaoaiTokenKeeper.getToken(str);
            if (token == null) {
                HMLog.info(a, new Function0() { // from class: p09
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return XiaomiTokenMananger.U();
                    }
                });
                return false;
            }
            String accessToken = token.getAccessToken();
            String refreshToken = token.getRefreshToken();
            if (!TextUtils.isEmpty(accessToken) && !TextUtils.isEmpty(refreshToken)) {
                return true;
            }
            HMLog.info(a, new Function0() { // from class: q09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return XiaomiTokenMananger.V();
                }
            });
            xiaoaiTokenKeeper.removeToken(str);
            return false;
        }
        HMLog.info(a, new Function0() { // from class: c09
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return XiaomiTokenMananger.O();
            }
        });
        return hasAppXiaomiAiToken();
    }
}
