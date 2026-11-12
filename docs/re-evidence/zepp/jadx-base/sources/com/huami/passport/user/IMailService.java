package com.huami.passport.user;

import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.LoginInfo;

/* JADX INFO: loaded from: classes12.dex */
public interface IMailService extends IAuthService {
    void changePassword(String str, String str2, String str3, String str4, String str5, IAccount.Callback<String, ErrorCode> callback);

    void getCaptcha(String str, IAccount.Callback<byte[], ErrorCode> callback);

    LoginInfo getCurrentLoginInfo();

    @Deprecated
    void login(String str, String str2, String str3, String str4, IAccount.Callback<LoginInfo, ErrorCode> callback);

    @Deprecated
    void registrations(String str, String str2, String str3, String str4, String str5, String[] strArr, String str6, IAccount.Callback<LoginInfo, ErrorCode> callback);

    void registrations(String str, String str2, String str3, String str4, String str5, String[] strArr, String str6, String str7, IAccount.Callback<LoginInfo, ErrorCode> callback);

    void resendConfirmation(String str, String str2, String str3, String str4, IAccount.Callback<String, ErrorCode> callback);

    void resetPassword(String str, String str2, String str3, String str4, IAccount.Callback<String, ErrorCode> callback);
}
