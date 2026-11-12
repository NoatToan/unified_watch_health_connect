package com.huami.passport.user;

import android.content.Context;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.LoginInfo;
import com.huami.passport.entity.OAuthUser;

/* JADX INFO: loaded from: classes12.dex */
public interface IAuthService {

    public interface ACCOUNT {
        public static final int EMAIL = 1;
        public static final int PHONE = 2;
    }

    public interface CLIENT_ID {
        public static final String HUAMI = "HuaMi";
    }

    public interface CODETYPE {
        public static final String FIND_PASSWORD_CODE_TYPE = "findPassword";
        public static final String REGISTER_CODE_TYPE = "register";
    }

    public interface MARKETING {
        public static final String AMAZFIT = "AmazFit";
        public static final String HUAMI = "HuaMi";
    }

    public interface REDIRECT {
        public static final String DEFAULT_REDIRECT_URI = "https://s3-us-west-2.amazonaws.com/hm-registration/successsignin.html";
    }

    public interface REGION {
        public static final String CN_NORTH_1 = "cn-north-1";
        public static final String US_WEST_2 = "us-west-2";
    }

    public interface STATE {
        public static final String REDIRECTION = "REDIRECTION";
        public static final String STATE = "STATE";
    }

    public interface TOKEN {
        public static final String ACCESS = "access";
        public static final String REFRESH = "refresh";
    }

    void changePassword(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<String, ErrorCode> callback);

    void changeUserName(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<String, ErrorCode> callback);

    void changeUserName(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, IAccount.Callback<String, ErrorCode> callback);

    void checkUserNameStatus(String str, IAccount.Callback<String, ErrorCode> callback);

    void checkUserNameStatus(String str, String str2, IAccount.Callback<String, ErrorCode> callback);

    LoginInfo getLoginInfo(Context context);

    void getOAuthUser(String str, String str2, String str3, String str4, IAccount.Callback<OAuthUser, ErrorCode> callback);

    void login(String str, String str2, IAccount.Callback<LoginInfo, ErrorCode> callback);

    void login(String str, String str2, String str3, IAccount.Callback<LoginInfo, ErrorCode> callback);

    void login(String str, String str2, String str3, String str4, String[] strArr, String str5, String str6, String str7, String str8, String str9, String str10, String str11, IAccount.Callback<LoginInfo, ErrorCode> callback);

    LoginInfo refreshToken(String str, String str2, String str3, String str4);

    void registrations(String str, String str2, String str3, String str4, String str5, String str6, IAccount.Callback<LoginInfo, ErrorCode> callback);

    void registrations(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, IAccount.Callback<LoginInfo, ErrorCode> callback);

    void resendConfirmation(String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback);

    void resetPassword(String str, String str2, String str3, IAccount.Callback<String, ErrorCode> callback);
}
