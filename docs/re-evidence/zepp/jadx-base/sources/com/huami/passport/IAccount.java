package com.huami.passport;

import android.app.Activity;
import com.huami.passport.entity.BindAccount;
import com.huami.passport.entity.BindResult;
import com.huami.passport.entity.LoginToken;
import com.huami.passport.entity.Token;
import com.huami.passport.entity.TokenInfo;
import com.huami.passport.entity.UserInfo;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface IAccount {
    public static final String PROVIDER_DEVICE_KONGMING = "kongming";
    public static final String PROVIDER_FACEBOOK = "facebook";
    public static final String PROVIDER_GOOGLE = "google";
    public static final String PROVIDER_HUAMI_EMAIL = "huami";
    public static final String PROVIDER_HUAMI_PHONE = "huami_phone";
    public static final String PROVIDER_LINE = "line";
    public static final String PROVIDER_MI = "xiaomi";
    public static final String PROVIDER_MIFIT = "mifit";
    public static final String PROVIDER_SSO = "sso";
    public static final String PROVIDER_UNKOWN = "unkown";
    public static final String PROVIDER_WECHAT = "wechat";

    public interface Callback<S, E> {
        void onError(E e);

        void onSuccess(S s);
    }

    public interface ResultCallback<R> {
        void onResult(R r);
    }

    void bindAccount(Activity activity, String str, Callback<BindResult, ErrorCode> callback);

    void bindAccount(Activity activity, String str, String str2, String str3, Callback<BindResult, ErrorCode> callback);

    Token getToken(boolean z);

    void getToken(boolean z, Callback<Token, ErrorCode> callback);

    UserInfo getUserInfo();

    boolean isLogin();

    void listAccount(Callback<List<BindAccount>, ErrorCode> callback);

    void listAccount(boolean z, Callback<List<BindAccount>, ErrorCode> callback);

    void login(Activity activity, String str, Callback<LoginToken, ErrorCode> callback);

    void logout(Callback<String, ErrorCode> callback);

    void logout(Callback<String, ErrorCode> callback, boolean z);

    void relogin(Callback<LoginToken, ErrorCode> callback);

    void unbindAccount(String str, String str2, Callback<String, ErrorCode> callback);

    void verifyAccessToken(String str, Callback<TokenInfo, ErrorCode> callback);
}
