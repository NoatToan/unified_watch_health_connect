package com.huami.passport.user;

import androidx.annotation.NonNull;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.LoginInfo;

/* JADX INFO: loaded from: classes12.dex */
public interface IPhoneService extends IAuthService {
    void changePassword(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull IAccount.Callback<String, ErrorCode> callback);

    void changePassword(String str, String str2, String str3, String str4, IAccount.Callback<String, ErrorCode> callback);

    void changeUserName(String str, String str2, String str3, String str4, String str5, IAccount.Callback<String, ErrorCode> callback);

    void changeUserName(String str, String str2, String str3, String str4, String str5, String str6, String str7, IAccount.Callback<String, ErrorCode> callback);

    LoginInfo getCurrentLoginInfo();

    @Deprecated
    String getLastLoginPhone();

    LoginInfo getLoginInfo();

    @Deprecated
    LoginInfo getLoginInfo(@NonNull String str);

    void registrations(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, String str8, String str9, IAccount.Callback<LoginInfo, ErrorCode> callback);

    void registrations(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, String str8, String str9, String str10, String str11, IAccount.Callback<LoginInfo, ErrorCode> callback);
}
